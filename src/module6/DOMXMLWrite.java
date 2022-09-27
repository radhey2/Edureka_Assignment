package module6;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class DOMXMLWrite {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("101", "jhon", "10", "Male", "100.0", "Chandigarh");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Document Object represents the XML Structure in Java Program
            Document document = builder.newDocument();
            //
            Element elementRoot = document.createElement("students");
            //
            Element elementStudent = document.createElement("s1");
            //

            Element elementId = document.createElement("Id");
            Element elementName = document.createElement("Name");
            Element elementGender = document.createElement("Gender");
            Element elementAddress = document.createElement("Address");
            Element elementStd = document.createElement("Std");
            Element elementMarks = document.createElement("Marks");

            // Data in the elements
            Node textID = document.createTextNode(s1.id);
            Node textName = document.createTextNode(s1.name);
            Node textGender = document.createTextNode(s1.gender);
            Node textAddress = document.createTextNode(s1.address);
            Node textMarks = document.createTextNode(s1.marks);
            Node textStd = document.createTextNode(s1.std);

            // Create the hierarchy
            elementId.appendChild(textID);
            elementName.appendChild(textName);
            elementAddress.appendChild(textAddress);
            elementGender.appendChild(textGender);
            elementStd.appendChild(textStd);
            elementMarks.appendChild(textMarks);

            elementStudent.appendChild((Node) elementId);
            elementStudent.appendChild((Node) elementName);
            elementStudent.appendChild((Node) elementAddress);
            elementStudent.appendChild((Node) elementGender);
            elementStudent.appendChild((Node) elementStd);
            elementStudent.appendChild((Node) elementMarks);

            elementRoot.appendChild(elementStudent);

            document.appendChild(elementRoot);

            // Transform the Document Object into an XML File
            // API: Transformer -> is obtained using TransformerFactory
            // DOMSource StreamResult

            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();

            // Document Object with Data
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(
                    new FileOutputStream("C:/Users/radheshyam.bagwan_sp/Documents/Student.xml"));

            // Write the data into XML File
            transformer.transform(source, result);
            System.out.println("XML FILE WRITTEN");

        } catch (Exception e) {
            System.out.println("Exception is: " + e);
        }
    }
}
