public class Films{
    protected String name; //Название 
    protected int year;	// Год выпуска 
    protected String ganre; // Жанр 

    public Films(){}
    public Films(String name, int year, String ganre){
    	setName(name);
    	setYear(year);
    	setGanre(ganre);
    }

    public void setName(String name){
    	this.name = name;
    }

    public String getName(){
    	return this.name;
    }

    public void setYear(int year){
    	this.year = year;
    }

    public int getYear(){
    	return this.year;
    }

    public void setGanre(String ganre){
    	this.ganre = ganre;
    }

    public String getGanre(){
    	return this.ganre;
    }

    @Override
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("Student:{\n");
    	sb.append("\tname:").append(this.name).append(",\n");
    	sb.append("\tyear:").append(this.year).append(",\n");
    	sb.append("\tganre:").append(this.ganre).append("\n}\n\n");
    	return sb.toString();
    }

}