public  class caissier extends employee {
    int numero;
    public caissier(String nom,int id,String adrs,int nb_h,int numero){
        super(nom,id,adrs,nb_h);
        this.numero=numero;    }
    public void affiche(){
        System.out.println("le numero:"+this.numero);
    }
    public float calculersalaire(){
        return  nb_h>180? (nb_h*5+(nb_h-180)*5.75f):
                (nb_h*5);
    }
}
