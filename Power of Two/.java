class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){ //eğer sayı 1 ise 2'nin 0.kuvvetidir. true döndürdüm.
            return true;
        }
        if(n % 2 !=0){//eğer sayı çift değilse ikinin kuvveti olamaz.false döndürdüm.
                return false;
            }
        boolean isPower=false;
        long sonuc=1;

        while(true){
            sonuc*=2;
            //sonuc n'ye eşitse true döndürüp döngüden çıktım.
            //sonuc değişkeninin değeri n'yi geçtiyse n 2'nin kuvveti değildir. döngüyü bitirip false döndürdüm.
            if(sonuc==n){
                isPower=true;
                break;
            }
            if(sonuc>n){
                break;
            }
        }

        return isPower;
    }
}
