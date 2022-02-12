package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Manpreet Singh
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String web = "/WEB-INF/";
        final String text_file = getServletContext().getRealPath(web + "note.txt");

        BufferedReader text = new BufferedReader(new FileReader(new File(text_file)));

        // Implementing contents into variables
        String title = text.readLine();
        String content = text.readLine();
        text.close();

        Note note = new Note(title, content);
        request.setAttribute("notes", note);
        String edit_btn = request.getParameter("edit");

        if (edit_btn == null) {
            getServletContext().getRequestDispatcher(web + "viewnote.jsp").forward(request, response);
            return;
        } else {
            getServletContext().getRequestDispatcher(web + "editnote.jsp").forward(request, response);
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ed_title = request.getParameter("ed_title");
        String ed_content = request.getParameter("ed_note");
        String note_path = "/WEB-INF/note.txt";
        String file_note = getServletContext().getRealPath(note_path);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file_note, false)));
        writer.println(ed_title);
        writer.println(ed_content);
        writer.close();

        Note ed_note = new Note(ed_title, ed_content);
        request.setAttribute("notes", ed_note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

}
