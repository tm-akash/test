package com.grocery.controller;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.grocery.DaoImpl.CategoryDaoImpl;
import com.grocery.DaoImpl.ProductDaoImpl;
import com.grocery.DaoImpl.SupplierDaoImpl;
import com.grocery.Model.Category;
import com.grocery.Model.Product;
import com.grocery.Model.Supplier;

@Controller
public class AdminController {

	/*@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	
	@RequestMapping (value="/saveSup", method=RequestMethod.POST)
	public ModelAndView saveSupplierData(@RequestParam("sid") String sid,@RequestParam("sname") String sname)
	{
		ModelAndView mv= new ModelAndView();
		Supplier s=new Supplier();
		s.setSid(sid);
		s.setSupplierName(sname);
		supplierDaoImpl.insertSupplier(s);
		mv.setViewName("adminAdd");
		return mv;
		
		
	}
	
	
	@RequestMapping(value="/saveProd", method=RequestMethod.POST)
	public String saveProduct(HttpServletRequest req,@RequestParam("file")MultipartFile file)
	{
		Product prod=new Product();
		prod.setPname(req.getParameter("pName"));
		prod.setPrice(Float.parseFloat(req.getParameter("pPrice")));
		
		//rest of code///
		
		String filepath = req.getSession().getServletContext().getRealPath("/");
		String filename = file.getOriginalFilename();
		prod.setImgname(filename);
		productDaoImpl.insertProduct(prod);
		try{
			byte []imagebyte = file.getBytes();
			BufferedOutputStream fos= new BufferedOutputStream(new FileOutputStream(filepath+"/resources/"+filename));
			fos.write(imagebyte);
			fos.close();
			
		}
		
		catch(Exception e)
		{
			
		}
		
		return "index";
	}
	
	
	@RequestMapping (value="/saveCat", method=RequestMethod.POST)
	public ModelAndView saveCategoryData(@RequestParam("cid") String cid,@RequestParam("cname") String cname)
	{
		ModelAndView mv= new ModelAndView();
		Category c=new Category();
		c.setCid(cid);
		c.setcName(cname);
		categoryDaoImpl.insertCategory(c);
		mv.setViewName("adminAdd");
		return mv;
	}
	*/
}
