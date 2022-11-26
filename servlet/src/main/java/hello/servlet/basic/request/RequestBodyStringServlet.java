package hello.servlet.basic.request;

import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
@WebServlet(name = "requestBodyStringServlet",urlPatterns ="/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream(); //request의 바디내용을 byte코드로 얻음
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);// inputStream의 byte코드를 UTF-8로 인코딩함 스트링으로


        System.out.println("messageBody =" + messageBody);

        response.getWriter().write("ok!");
    }
}
