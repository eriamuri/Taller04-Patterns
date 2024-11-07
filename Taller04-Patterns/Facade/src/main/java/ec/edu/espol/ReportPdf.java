package ec.edu.espol;

/**
 *
 * @author Adrian
 */
public class ReportPdf extends ReportDefault{
    public ReportDefault generarReporte(){
        ReportDefault r = new ReportPdf();
        return r;
    }
}
