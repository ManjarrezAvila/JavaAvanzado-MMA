/**
 * Library that allows to generate reports through files in
 * any format using the {@code makeReport} Method
 * @author Manjarrez
 * @since 2021
 */

package amazonviewer.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Class that is responsible for writing text files
 * <br> Write text documents from its attributes:
 * {@code nameFile} is the file name
 * {@code title} is the title and
 * {@code content} is its content.
 */

public class Report {

    private String nameFile;
    private String title;
    private String content;
    private String extension;

    /**
     *Method that get the file name
     * @return nameFile is an object
     * {@code String} is an object or class that contains a character line
     */

    public String getNameFile() {
        return nameFile;
    }

    /**
     * Establishes the file name
     */

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    /**
     *Method that gets the file title
     */

    public String getTitle() {
        return title;
    }

    /**
     *Method that sets the file title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *Method that gets the file content
     */

    public String getContent() {
        return content;
    }

    /**
     *Method that set the file content
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <h1>Metodo makeReport</h1>
     * This method generates .txt files using the established setters parameters
     * <br> verify if  {@code nameFile}, {@code title} or {@code content} are null to not generate a file
     * and ask for the right parameters
     */

    public void makeReport() {
        if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
            //Crear el archivo
            try {

                File file = new File(getNameFile()+"."+getExtension());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else {
            System.out.println("Please, enter the right parameters");
        }
    }

    /**
     *This method gets the extension file to generate
     * */

    public String getExtension() {
        return extension;
    }

    /**
     *This method sets the extension
     * */

    public void setExtension(String extension) {
        this.extension = extension;
    }

}