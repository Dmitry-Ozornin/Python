

public class Notebook {
    private String model; // модель
    private int hdd; // жесткий диск
    private int ram; // оперативная память
    private String os; // операционная система
    private String color; // цвет
    

    public Notebook(String model, int hdd, int ram, String os, String color){
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    public int getHdd(){
        return hdd;
    }

    public int getRam(){
        return ram;
    }

    public String getOS(){
        return os;
    }

    
    public String getColor(){
        return color;
    }

    

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук: ");
        sb.append("Модель: ").append(model);
        sb.append(", оперативная память: ").append(ram);
        sb.append(", операционная система: ").append(os);
        sb.append(", цвет: ").append(color);
        
        
        return sb.toString();
    }

  
}
