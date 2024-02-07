package giuseppebarresi.u5w1d1.entities;

import giuseppebarresi.u5w1d1.StatoTavolo;
import lombok.ToString;


@ToString
public class Tavolo {
    private long id;

    private int numeroTavolo;
    private int numeroMassimoCoperti;
    private StatoTavolo stato;

    public Tavolo(int numeroMassimoCoperti,int numeroTavolo,StatoTavolo stato){
        this.numeroMassimoCoperti = numeroMassimoCoperti;
        this.numeroTavolo = numeroTavolo;
        this.stato = stato;
    }
}
