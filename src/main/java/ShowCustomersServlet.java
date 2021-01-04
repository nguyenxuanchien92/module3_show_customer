import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/listCustomer")

public class ShowCustomersServlet extends HttpServlet {
    private static List<Customer> listCustomer = new ArrayList<>();

    static {
        listCustomer.add(new Customer("Hạnh", "09-09-2000", "Hà Nội", "images/hanh.jpg"));
        listCustomer.add(new Customer("Hồng", "09-09-2000", "Hà Nội", "images/hong.jpg"));
        listCustomer.add(new Customer("Nga", "09-09-2000", "Hà Nội", "images/nga.jpg"));
        listCustomer.add(new Customer("Liên", "09-09-2000", "Hà Nội", "images/lien.jpg"));
        listCustomer.add(new Customer("Trang", "09-09-2000", "Hà Nội", "images/trang.jpg"));
        listCustomer.add(new Customer("Vi", "09-09-2000", "Hà Nội", "images/vi.jpg"));
        listCustomer.add(new Customer("Hạ Anh", "09-09-2000", "Hà Nội", "images/anh.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        req.setAttribute("listCustomer",listCustomer);
        req.getRequestDispatcher("showListCustomer.jsp").forward(req,resp);
    }
}
