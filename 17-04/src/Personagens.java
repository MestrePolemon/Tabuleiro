public class Personagens {

    private int posicaoX;
    private int posicaoY;
    private String formato;

    public Personagens(int posicaoX, int posicaoY, String formato) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.formato = formato;
    }

    public void moverParaCima() {
        this.posicaoY--;
    }
    public void moverParaBaixo() {
        this.posicaoY++;
    }

    public void moverParaDireita() {
        this.posicaoX++;
    }

    public void moverParaEsquerda() {
        this.posicaoX--;
    }




    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
