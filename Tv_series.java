public class Tv_series extends Films{
   
    protected int ep_count;
   
    public Tv_series(){}
    public Tv_series(String name, int year, String ganre, int ep_count){
        super(name, year, ganre);
        setEp_count(ep_count);
    }
 
    public int getEp_count(){
        return this.ep_count;
    }
   
    public void setEp_count(int ep_count){
        this.ep_count = ep_count;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tv_series:{\n");
        sb.append("\tname: ").append(this.name).append(",\n");
        sb.append("\tyear: ").append(this.year).append(",\n");
        sb.append("\tganre: ").append(this.ganre).append("\n}\n\n");
        sb.append("\tep_count: ").append(this.ep_count).append("\n}\n\n");
        return sb.toString();
    }
   
}