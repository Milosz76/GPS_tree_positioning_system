package com.mvc.treeapp.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    @Test
    void shouldLoadLoginPage() {
        IndexController indexController = new IndexController();
        assertEquals("login",indexController.login());
    }
}