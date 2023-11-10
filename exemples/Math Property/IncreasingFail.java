//should Fail
class IncreasingFail{
    private int cont;
    /*@
        invariant.public hid(cont) & cont.num = 0;
    @*/
    public IncreasingFail(){
        cont = new Countainer();
    }
    /*@ 
        ensures old(cont) < cont
    @*/
    public void inc(){
        cont = cont + 1;
    }
}

