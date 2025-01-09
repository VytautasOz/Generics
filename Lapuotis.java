public class Lapuotis implements Medis {
    private final String lapuotis;

    public Lapuotis(String lapuotis) {
        this.lapuotis = lapuotis;
    }
    @Override
    public void turi() {
        System.out.println(lapuotis + " turi lapus");
    }

}
