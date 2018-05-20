public class HammingMain {
    public static void main(String[] args) {
        Hamming hamming = new Hamming("GGACG", "GGTCG");
        System.out.println(hamming.getHammingDistance());
    }
}
