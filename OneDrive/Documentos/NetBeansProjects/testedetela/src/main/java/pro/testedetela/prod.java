package pro.testedetela;

public class prod {

    private String nomeprodP, quantidadeP, tipoprodP;


    public prod(String n) {
        this.nomeprodP = n;
        this.quantidadeP = n;
        this.tipoprodP = n;

    }
    
      public prod() {
        //default
    }

    public String getNomeprodP() {
        return nomeprodP;
    }

    public void setNomeprodP(String nomeprodP) {
        this.nomeprodP = nomeprodP;
    }

    public String getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(String quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public String getTipoprodP() {
        return tipoprodP;
    }

    public void setTipoprodP(String tipoP) {
        this.tipoprodP = tipoP;
    }
 

  
        public String status() {
        return "Nome: " + this.nomeprodP+
                "\nQuantiddae: "+this.quantidadeP+
                "\nTipo: "+this.tipoprodP;
    }

}
