package pruebas.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pruebas.userinterface.PageEmpleoChoucair;

import static jxl.biff.BaseCellFeatures.logger;


public class EmpleoStep {
    PageEmpleoChoucair pageEmpleoChoucair;
    @Step
    public void AbrirPaginaEmpleo() {
        pageEmpleoChoucair.open();
        logger.info("Se abrio correctamente la pagina empleos de choucair");
    }

    @Step
    public int consultarEmpleosAnalistaPruebas() {
        logger.info("Se recorreran los emplos de pruenas");

        return  pageEmpleoChoucair.getEmpleosAnalistaPruebas();
    }

    public void validarCantidadEmpleosPruebas(int cantEmpleoPruebas) {
        Assert.assertTrue(cantEmpleoPruebas>=1);
        logger.info(String.format("Se valida que halla almenos minimo un empleo de pruebas en el portal de empleo y hay %s empleos", cantEmpleoPruebas));

    }
}
