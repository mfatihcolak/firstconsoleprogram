
public abstract class programlar {

    public programlar(String ogrenciIsim) {
        this.ogrenciIsim = ogrenciIsim;
    }

    public String getOgrenciIsim() {
        return ogrenciIsim;
    }
    
    private String ogrenciIsim;
    
    abstract void bazalMetabolizmaHesaplaKadin();
    abstract void bazalMetabolizmaHesaplaErkek();
    abstract void gunlukProtein();
}
