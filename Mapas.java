import java.util.ArrayList;
import java.util.List;

public class Mapas<K, V> {
    private List<Pora<K, V>> sarasasPoru = new ArrayList<>();

    public void ideti(K raktas, V reiksme){
        Pora<K, V> pora = new Pora<>(raktas, reiksme);
        sarasasPoru.add(pora);
    }

    public V gauti(K raktas) {
        for (Pora<K, V> pora : sarasasPoru) {
            if (pora.getKey().equals(raktas)) {
                return pora.getValue();
            }
        }
        return null;
    }
}


