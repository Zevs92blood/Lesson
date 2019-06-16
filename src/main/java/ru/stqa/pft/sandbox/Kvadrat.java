package ru.stqa.pft.sandbox;

public class Kvadrat {

    public double storona;
    public String figura;
    public Kvadrat(double storona, String figura){
        this.storona = storona; // this(ссылка на этот объект).атрибут = переменная, объявленная как аргумент функции
        this.figura = figura;
    }
    public double plosch() {
        return this.storona * this.storona;
    }

}
