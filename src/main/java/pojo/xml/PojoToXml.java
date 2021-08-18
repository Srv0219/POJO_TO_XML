package pojo.xml;

import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class PojoToXml {
    public static void main(String[] args) {
        try {
            StringWriter stringWriter = new StringWriter();

            Student student = new Student();
            student.setId(1);
            student.setFirstname("Sourav");
            student.setLastname("Adak");
            DisplayXml displayXml = new DisplayXml();
            Marshaller obj = displayXml.dixplayX(student);
            obj.marshal(student, stringWriter);
            System.out.println(stringWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
