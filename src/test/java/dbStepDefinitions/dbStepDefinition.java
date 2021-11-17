package dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;

public class dbStepDefinition {

    String URL ="jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String Username ="Ahmet_User";
    String Password ="Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Kullanici CHQA database'ine baglanir.")
    public void kullanici_chqa_database_ine_baglanir() throws SQLException {

        connection = DriverManager.getConnection(URL, Username, Password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);



    }
    @Then("Kullanici {string} tablosundaki {string} verilerini alir.")
    public void kullanici_tablosundaki_verilerini_alir(String string, String string2) {



    }
    @Then("Kullanici {string} sütunundaki verileri okur ve istedigi islemleri yapar.")
    public void kullanici_sütunundaki_verileri_okur_ve_istedigi_islemleri_yapar(String string) {



    }
}
