public class FL extends Films{
   //полнометражный фильм
    protected int length; // длина фильма
   
    public FL(){}
    public FL(String name, int year, String ganre, int length){
        super(name, year, ganre);
        setLength(length);
    }
 
    public int getLength(){
        return this.length;
    }
   
    public void setLength(int length){
        this.length = length;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Full length movie:{\n");
        sb.append("\tname: ").append(this.name).append(",\n");
        sb.append("\tyear: ").append(this.year).append(",\n");
        sb.append("\tganre: ").append(this.ganre).append("\n}\n\n");
        sb.append("\tlength: ").append(this.length).append(" min\n}\n\n");
        return sb.toString();
    }
   
}