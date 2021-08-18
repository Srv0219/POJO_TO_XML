package pojo.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class DisplayXml {

    public Marshaller dixplayX(Student student) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // File file=new File("D:\\demo\\pojo.xml");
       return marshaller;
    }

}
