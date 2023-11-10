//should szcceed
class IncreasingSuccess{
    private int cont;
    /*@
        invariant.public hid(cont) & cont.num = 0;
    @*/
    public IncreasingSuccess(){
        cont = new Countainer();
    }
    /*@ 
        ensures old(cont) <= cont
    @*/
    public void inc(){
        int temp = cont +1;
        if (temp > cont){
            cont = temp;
        }
        
    }
}

