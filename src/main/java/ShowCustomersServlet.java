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
        listCustomer.add(new Customer("Hạnh", "09-09-2000", "Hà Nội", "resources/images/hanh.jpg"));
        listCustomer.add(new Customer("Hồng", "09-09-2000", "Hà Nội", "resources/images/hong.jpg"));
        listCustomer.add(new Customer("Nga", "09-09-2000", "Hà Nội", "resources/images/nga.jpg"));
        listCustomer.add(new Customer("Liên", "09-09-2000", "Hà Nội", "resources/images/lien.jpg"));
        listCustomer.add(new Customer("Trang", "09-09-2000", "Hà Nội", "resources/images/trang.jpg"));
        listCustomer.add(new Customer("Vi", "09-09-2000", "Hà Nội", "resources/images/vi.jpg"));
        listCustomer.add(new Customer("Hạ Anh", "09-09-2000", "Hà Nội", "resources/images/anh.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listCustomer",listCustomer);
        req.getRequestDispatcher("showListCustomer.jsp").forward(req,resp);
    }
}
