public class Hamming {
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand) throws  IllegalArgumentException{
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException();
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }
    public int getHammingDistance(){
        int hammingDistance = 0;
        for(int i = 0 ; i <leftStrand.length();i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }
}