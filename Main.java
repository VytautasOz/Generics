import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Egle egle = new Egle();
        Kadagys kadagys = new Kadagys();
        Pusis pusis = new Pusis();

        List<Medis> miskas = new ArrayList<>();
        miskas.add(azuolas);
        miskas.add(egle);
        miskas.add(berzas);
        miskas.add(kadagys);
        miskas.add(pusis);

        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(egle);
        spygliuociai.add(pusis);
        spygliuociai.add(kadagys);
        List<Egle> egles = new ArrayList<>();
        egles.add(egle);

        List<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas);
        berzai.add(berzas);

        Generics generics = new Generics();

        generics.ivairusMiskas(miskas);
        System.out.println();
        generics.spygliuociuMiskas(spygliuociai);
        System.out.println();
        generics.berzuMiskas(berzai);
        System.out.println();
        generics.spygliuociuMiskas(egles);
        System.out.println();
        generics.ivairusMiskas(berzai);




    }}
