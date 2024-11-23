public class Carro {
    private String marca;
    private String dueño;
    private String matricula;
    private String color;


    public Carro(String marca, String dueño, String matricula, String color) {
        this.marca = marca;
        this.dueño = dueño;
        this.matricula = matricula;
        this.color = color;
    }

    public String getMarca() {
        System.out.printf("");
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }



    public void mostarInformacion () {

        System.out.println("marca = " + marca);
        System.out.println("dueño = " + dueño);
        System.out.println("matricula = " + matricula);
        System.out.println("color = " + color);


    }





}
