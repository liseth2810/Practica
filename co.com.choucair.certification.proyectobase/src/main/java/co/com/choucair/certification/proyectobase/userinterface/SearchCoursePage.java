package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Automatizaciòn de Pruebas").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Buscar curso").located(By.xpath("//div[@class='search-results']//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=1252']"));
    public static final Target NAME_COURSE = Target.the("Extrae nombre del curso").located(By.xpath("//div[@class='page-header-headings']/h1[contains(text(),'Automatización de Pruebas')]"));
}
