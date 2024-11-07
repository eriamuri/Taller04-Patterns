package ec.edu.espol;

/**
 *
 * @author Adrian
 */
public class ReportDefault implements ReportFacade{
    protected String texto;

    public ReportDefault(String texto){
        this.texto = null;
    }

    public ReportDefault(){

    }

    public ReportDefault generarReporte(){
        return new ReportDefault();
    }

    public void visualizarReporte(){
        System.out.println(texto);
    }



}
