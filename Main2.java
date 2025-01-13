public class Main2 {
    private static final DnsProvider GOOGLE = DnsProvider.GOOGLE;
    private static final DnsProvider CLOUDFLARE = DnsProvider.CLOUDFLARE;

    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(GOOGLE,new DnsServer("8.8.8.8","8.8.4.4"));
        dnsMapas.ideti(CLOUDFLARE, new DnsServer("1.1.1.1","1.0.0.1"));

        DnsServer googleDns = dnsMapas.gauti(GOOGLE);
        System.out.println(googleDns);

        Mapas<String,String> stringMap = new Mapas<>();
        stringMap.ideti("Labas","Hello");
        stringMap.ideti("Pasaulis","World");

        String labas = stringMap.gauti("Labas");
        System.out.println(labas);




    }
}
