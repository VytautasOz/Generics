import java.util.List;

public class Generics {
    public void ivairusMiskas(List<Medis> medziai){
        System.out.println("Ivairus miskas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    public void spygliuociuMiskas(List<Spygliuotis> spygliuociai){
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis spygliuotis : spygliuociai) {
            spygliuotis.turi();
        }
    }
    public void berzuMiskas(List<Berzas> berzai){
        System.out.println("Berzu miskas:");
        for (Berzas berzas : berzai) {
            berzas.turi();
        }
    }
}
