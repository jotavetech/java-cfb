// classes abstratas só podem ser herdadas, não instanciadas
abstract class Animal implements SerVivo {
    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;

    public Animal(int massa, int vel, int forca) {
        this.massa = massa;
        this.vel = vel;
        this.forca = forca;
        this.vivo = true;
        this.x = 0;
        this.y = 0;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Boolean getVivo() {
        return this.vivo;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return this.forca;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return this.massa;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public Animal() {
        System.out.println("Um animal foi criado");
    }

    public void atacar(Animal enemy) {
        if(this.getVivo()) {
            if(this.getForca() > enemy.getForca()) {
                this.setForca(enemy.getMassa() + this.getForca());
                enemy.setVivo(false);
            } else {
                enemy.setForca(this.getMassa() + enemy.getForca());
                this.setVivo(false);
            }
        }
        else {
            System.out.println("O animal está morto");
        }
    }

    public void mover() {
        if(this.getVivo()) {
            setX(getX() + 1);
            setY(getY() + 1);
        }
    }

    public void comer(int massa) {
        if(this.getVivo()) {
            this.setForca(this.getMassa() + massa);
        }
        else {
            System.out.println("O animal está morto");
        }
    }

    public void info() {
        System.out.println("O animal é um ser vivo");
    }
}
