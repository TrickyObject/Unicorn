package mts.support.validator;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {

    private SchemaFactory schemaFactory;
    private Schema schema;
    private Validator validator;

    public XMLValidator() {

        schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

    }

    public boolean validateXML(Source pathToFile, File pathToSchema){

        try {
            schema = schemaFactory.newSchema(pathToSchema);
            validator = schema.newValidator();
            validator.validate(pathToFile);

            System.out.println(pathToFile.getSystemId() + " валидный..");

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }


        System.out.println(pathToFile.getSystemId() + " невалидный..");

        return false;
    }

}
