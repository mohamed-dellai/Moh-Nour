package com.example.examin3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlleur {
	@Autowired
	EtudiantDao repo;
	@GetMapping("/")
	public String ajouter(Model m)
	
	{
		Etudiant et=new Etudiant();
		m.addAttribute("e",et);
		return"ajouter";
	}
	@PostMapping("ajouter")
	public String a(Etudiant e ,Model m)
	
	{
        Date currentDate = new Date(System.currentTimeMillis());
        e.setDate(currentDate);
        repo.save(e);
        List<Etudiant> t=repo.findAll();
        m.addAttribute("etu",t);
		return"afficher";
	}
	
	@GetMapping("filtrer")
	public String ay(Model m)
	
	{
        List<Etudiant> t=repo.findAll();
        List<Etudiant> t1 = new ArrayList<>();
        for(Etudiant e:t) {
        	if(e.getDate().getYear()+1900>2009 &&  e.getDate().getYear()+1900<2025) {
        		t1.add(e);
        		System.out.print(e.getNom());
        	}
        }
        m.addAttribute("etu",t1);
		return"afficher";
	}
}
