public class Pora<K, V> {
    private K key;
    private V value;

    public Pora(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
