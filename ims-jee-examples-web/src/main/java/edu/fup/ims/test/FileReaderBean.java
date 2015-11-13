package edu.fup.ims.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Luis Eraso
 */
@ManagedBean
@ViewScoped
public class FileReaderBean implements Serializable {

    private static final long serialVersionUID = -5432280322674319693L;

    private static final String FILE_URL = "/resources/reports/report1.txt";

    public FileReaderBean() {

    }

    public String readFile() {

        System.out.println("readFile()...");

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        InputStream input = externalContext.getResourceAsStream(FILE_URL);

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        try {
            String line;
            System.out.println("Reading file: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            Logger.getLogger(SesionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
