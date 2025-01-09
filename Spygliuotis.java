public class Spygliuotis implements Medis {
    private final String spygliuotis;

    public Spygliuotis(String spygliuotis) {
        this.spygliuotis = spygliuotis;
    }
    @Override
    public void turi() {
        System.out.println(spygliuotis + " turi spyglius");
    }

}
