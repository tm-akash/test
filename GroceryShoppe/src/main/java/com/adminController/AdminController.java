package com.adminController;

import org.h2.engine.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.CategoryDao;
import com.Dao.ProductDao;
import com.Dao.SupplierDao;
import com.Dao.UserDao;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;
import com.Model.User;

@Controller
@MultipartConfig
public class AdminController {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping(value="/admin")
	public ModelAndView admin()
	{
			
		System.out.println("Inside admin controller");
	//	userDao.insertUser(user);
		return new ModelAndView("adminAdd");
	}
	
	@RequestMapping(value="/saveCat", method=RequestMethod.POST)
	public ModelAndView saveCategoryData(@RequestParam("cid") String cid,@RequestParam("cName") String cName)
	{
		ModelAndView mv=new ModelAndView();
		Category c=new Category();
		c.setCid(cid);
		c.setcName(cName);
		categoryDao.insertCategory(c);
		mv.setViewName("adminAdd");
		return mv;
	}
	
	@RequestMapping(value="/saveSup", method=RequestMethod.POST)
	public ModelAndView saveSupplierData(@RequestParam("sid") String sid,@RequestParam("supplierName") String supplierName)
	{
		ModelAndView mv=new ModelAndView();
		Supplier s=new Supplier();
		s.setSid(sid);
		s.setSupplierName(supplierName);
		supplierDao.insertSupplier(s);
		mv.setViewName("adminAdd");
		return mv;
	}
	
	
	@RequestMapping(value="/saveP", method = RequestMethod.POST)
	public String saveProductData(@RequestParam("pimage") MultipartFile file,HttpServletRequest req)
	{
		Product p = new Product();
		p.setPname(req.getParameter("pname"));
		p.setPdescription(req.getParameter("pDescription"));
		p.setPrice(Float.parseFloat(req.getParameter("pPrice")));
	//	p.setImgname((req.getParameter("pImage")));
	//	p.setPimage(req.getParameter("pimage"));
		
		String filePath = req.getSession().getServletContext().getRealPath("/");
		String fileName = file.getOriginalFilename();
		p.setImgname(fileName);
		
		productDao.insertProduct(p);
		
		try
		{
			byte[] imageByte = file.getBytes();
		//	BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath + "/resources/" + filename));
			File file1 = new File(filePath + "/resources/" + fileName);
			OutputStream out = new FileOutputStream(file1);
			
			out.close();
			
		//	BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(filepath + "/resources" + filename));
		//	fos.write(imageByte);
		//	fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ("adminAdd");
	}
	
	
	
/*	@ModelAttribute
	public void addAttributes(Model m)
	{
		m.addAttribute("catList",categoryDao.retrieveCat());
		m.addAttribute("satList",supplierDao.retrieveSup());
		
		
	}*/
	
	@ModelAttribute("catList")
	public List<Category> getCategories()
	{
		return categoryDao.retrieveCat();
	}
	

	@ModelAttribute("satList")
	public List<Supplier> getSuppliers()
	{
		return supplierDao.retrieveSup();
	}
	
}
