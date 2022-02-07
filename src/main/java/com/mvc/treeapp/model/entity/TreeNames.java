package com.mvc.treeapp.model.entity;


import lombok.Getter;

public enum TreeNames {
    OAK("Oak"),
    BIRCH("Birch"),
    BEECH("Beech"),
    CLON("Clon"),
    ROWAN("Rowan"),
    BIRCH_CHERRY("Bird cherry"),
    APPLE_TREE("Apple tree"),
    ADLER("Alder"),
    CYPRESS("Cypress"),
    JUNIPER("Juniper"),
    LARCH("Larch"),
    PINE("Pine"),
    SPRUCE("Spruce"),
    YEW_TREE("Yew tree"),
    FIR("Fir");

    @Getter
    private String displayTree;

    TreeNames(String displayTree) {
        this.displayTree = displayTree;
    }
}
