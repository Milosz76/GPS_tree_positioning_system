package com.mvc.treeapp.model.entity;

import lombok.Getter;

public enum TreeTypes {
    LEAFYTREE("LeafyTree"),
    CONIFER("Conifer");

    @Getter
    private String displayTypes;

    TreeTypes(String displayTypes) {
        this.displayTypes = displayTypes;
    }
}
