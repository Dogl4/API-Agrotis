//package br.com.dogla.agrotis.controllers;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import br.com.dogla.agrotis.models.Property;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(PropertyController.class)
//class PropertyControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    void create() throws Exception {
//        Property property = new Property();
//        property.setNome("Teste 1");
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/property");
//        MvcResult result = mvc.perform(requestBuilder).andReturn();
//        assertEquals(201, result.getResponse().getStatus());
//    }
//
//    @Test
//    void listAll() {
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/property");
//        MvcResult result = null;
//        try {
//            result = mvc.perform(requestBuilder).andReturn();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals(201, result.getResponse().getStatus());
//    }
//
//    @Test
//    void getById() {
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/property/1");
//        MvcResult result = null;
//        try {
//            result = mvc.perform(requestBuilder).andReturn();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals(201, result.getResponse().getStatus());
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void delete() {
//    }
//}