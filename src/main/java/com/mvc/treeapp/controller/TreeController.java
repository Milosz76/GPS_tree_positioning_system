package com.mvc.treeapp.controller;

import com.mvc.treeapp.service.TreeService;
import com.mvc.treeapp.model.dto.TreeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Controller
public class TreeController {

    private static final Logger logger = LoggerFactory.getLogger(TreeController.class);
    private TreeService treeService;

    public TreeController(TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping("/addtree")
    public ModelAndView getAddTreeView(){
        logger.warn("Get the add tree view");
        return new ModelAndView("addtree","newTree", new TreeDTO());
    }

    @PostMapping("/addtree")
    public String addNewTree(@ModelAttribute TreeDTO treeDTO){
        logger.warn("POST a form Add a Tree view");
        System.out.println(treeDTO.getDeviceID() + " " + treeDTO.getLatitude() + " " + treeDTO.getLongitude());
        treeService.createTree(treeDTO);
        return "index";
    }

    @GetMapping("/trees")
    public ModelAndView getAllTrees(){
        logger.warn("List all of the trees in the Data Base.");
        List<TreeDTO> treeDTOList = treeService.getAllTrees();
        return new ModelAndView("trees","treeList",treeDTOList);
    }
}
