package Utils;


import Model.Livro;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {

    public static void main(String[] args) throws SQLException {

        Livro livro = new Livro();
        livro.setTitulo("titans perdidos");
        livro.setIsbn("Muito bom!!!");
        livro.setAvaliacao(4);
        livro.setPaginas(120);
        livro.setEditora("Novo horizonte");
        livro.setAutor("Juliano Ramos");
                
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(livro);
        t.commit();
        System.out.println("ID: " + livro.getId());
        
        //user = (Usuario) session.load(Usuario.class, 1L);
        //System.out.println(user.getNome());

        session.close();

    }
}
