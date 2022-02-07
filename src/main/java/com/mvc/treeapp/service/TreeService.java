package com.mvc.treeapp.service;

import com.mvc.treeapp.model.dto.TreeDTO;
import com.mvc.treeapp.model.entity.Tree;
import com.mvc.treeapp.repository.TreeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TreeService {

    private ModelMapper modelMapper;
    private TreeRepository treeRepository;

    public TreeService(ModelMapper modelMapper, TreeRepository treeRepository) {
        this.modelMapper = modelMapper;
        this.treeRepository = treeRepository;
    }

    public void createTree(TreeDTO treeDTO){
        Tree tree = modelMapper.map(treeDTO, Tree.class);
        treeRepository.save(tree);
    }

    public List<TreeDTO> getAllTrees(){
        return treeRepository
                .findAll()
                .stream()
                .map(tree -> modelMapper.map(tree, TreeDTO.class))
                .collect(Collectors.toList());
    }

    public void treeGrow(){
        System.out.println("The method: tree grow.");
    }
}
