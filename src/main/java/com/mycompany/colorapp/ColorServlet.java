/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colorapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author manue
 */
@WebServlet(urlPatterns = "/ColorPicker")
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String nombre = req.getParameter("nombre");
        String colorFondo = req.getParameter("colorFondo");
        String colorLetra = req.getParameter("colorLetra");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><meta charset=\"UTF-8\"><title>Color App</title><style>body{font-size:1.3rem;font-family:sans-serif;background:"+colorFondo+"; color: "+colorLetra+"}</style></head><body><h1>Color App</h1><p>Una sencilla app para demostrar el funcionamiento de Java Servlets</p><h2>Otras cosas que "+nombre+" debe aprender</h2><ul><li>HTML y CSS</li><li>Algo de JS</li><li><strong>Git y Github</strong></li></ul></body></html>");
        } catch (IOException ex) {

        }

    }
}
