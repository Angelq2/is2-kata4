package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

/**
 * Clase que construye a partir de una lista
 * de emails válidos un histograma.
 * 
 * @author angel
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> lista){
        Histogram<String> histogram = new Histogram<>();
        int index = 0;
        for (Mail mail : lista) {
            histogram.increment(lista.get(index).getDomain());
            index ++;
        }
        
        return histogram;
        
    }
    
}
