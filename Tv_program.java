public class Tv_program extends Tv_series{
   //телепередача
    protected String channel; 
   
    public Tv_program (){} 
    public Tv_program (String name, int year, String ganre, int ep_count, String channel){
        super(name, year, ganre, ep_count);

        setChannel(channel);
    }
 
    public String getChannel(){
        return this.channel;
    }
   
    public void setChannel(String channel){
        this.channel = channel;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tv_program:{\n");
        sb.append("\tname: ").append(this.name).append(",\n");
        sb.append("\tyear: ").append(this.year).append(",\n");
        sb.append("\tganre: ").append(this.ganre).append("\n}\n\n");
        sb.append("\tchannel: ").append(this.channel).append("\n}\n\n");
        return sb.toString();
    }
   
}