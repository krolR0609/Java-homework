class hello{
	public static void main(String[] args) {
		Tv_series tv1 = new Tv_series ("Zombi",1997,"horror",23); //Сериал
		Tv_program tvp1 = new Tv_program ("Top gear", 2000, "auto", 160, "BBC"); //телепередача
		FL movie1 = new FL ("Dune", 1985, "fantasy", 137); //Полнометражный фильм
		System.out.println(tv1);
		System.out.println(tvp1);
		System.out.println(movie1);
	}

}