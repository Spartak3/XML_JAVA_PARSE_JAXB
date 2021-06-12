

import javax.xml.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;

public class main {

    public static void main(String[] args) throws JAXBException {

        //jaxb is removed from from java 11+, we must include some dependencies in pop.xml
        //convert java object to xml and write it in human,xml------------
        Human human=new Human("Spartak","Vardanyan",20,"Armenia",1L);
        JAXBContext context = JAXBContext.newInstance(Human.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(human, new File("src/main/java/human.xml"));

        //convert xml to java object and print------------
        File file=new File("src/main/java/human.xml");
        JAXBContext context1=JAXBContext.newInstance(Human.class);
        Unmarshaller unmarshaller=context1.createUnmarshaller();
        Human human1=(Human) unmarshaller.unmarshal(file);
        System.out.println(human1);

        //or if we have String containgin out xml
        String xmlMy="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<human id=\"1\">\n" +
                "    <firstname>Spartak</firstname>\n" +
                "    <surname>Vardanyan</surname>\n" +
                "    <age>20</age>\n" +
                "    <country>Armenia</country>\n" +
                "</human>\n";

        Human human2=(Human) unmarshaller.unmarshal(new StringReader(xmlMy));
        System.out.println(human2);







    }
}
