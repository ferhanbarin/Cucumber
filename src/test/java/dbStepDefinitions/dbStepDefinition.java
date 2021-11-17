package dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;

public class dbStepDefinition {

    String URL = "jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String Username = "Ahmet_User";
    String Password = "Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Kullanici CHQA database'ine baglanir.")
    public void kullanici_chqa_database_ine_baglanir() throws SQLException {

        connection = DriverManager.getConnection(URL, Username, Password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }


    @Then("Kullanici {string} tablosundaki {string} verilerini alir.")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {

        // SELECT Price FROM tHOTELROOM
        String readQuery = "SELECT "+field+" FROM " + table;

        resultSet = statement.executeQuery(readQuery);
    }


    @Then("Kullanici {string} sütunundaki verileri okur ve istedigi islemleri yapar.")
    public void kullanici_sütunundaki_verileri_okur_ve_istedigi_islemleri_yapar(String field) throws SQLException {

        // ResultSet Iterator gibi calisir.
        resultSet.first();
        System.out.println(resultSet.getObject(field).toString());

        // resultSet.next() bir sonraki obje'ye gecer. Sonraki eleman varsa true, yoksa false döner.
        System.out.println(resultSet.next()); // true

        System.out.println(resultSet.getObject(field).toString());
        // Son objeye gider ve sonra resultSet.next() calistirirsak bir sonraki eleman olmayacagi icin bize false döner.

        resultSet.last();
        System.out.println(resultSet.next()); // false


        // Tüm listeyi yazdirmak istersek while loop ile birlikte resultSet.next() kullabiliriz. Cünkü bu method bir sonraki obje var oldugu müddetce true döndürür.
        // Son obje ulastigimizda resultSet.next() false dönecek ve while loop bitecek.
        // Ancak biz 48. satirda son objeye gittigimiz icin while loop'u calistirirsak hicbir sey yazdirmaz.
        // While Loop calistirmadan önce ilk objeye gitmemiz gerekir.

    /*
        resultSet.first(); // Birinci objeye gittim.

        while (resultSet.next()) { // Ustteki satir birinci objeye götürdü ama resultSet.next() sonraki objeye gecirdi. Dolayisiyla liste 2. fiyattan basladi.
            System.out.println(resultSet.getObject(field).toString());
        }
    */

        resultSet.absolute(0);
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(field).toString());
        }

        // Varsa ilk 100 fiyati integer olarak bir liste seklinde kaydedelim.





    }
}
