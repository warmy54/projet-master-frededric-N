//should succeed
class LayeredLeakSuccess{
    private Countainer cont;
    /*@
        invariant.public hid(cont) & cont.num = 0;
    @*/
    public LayeredLeakSuccess(){
        cont = new Countainer();
    }
    private Container leak(){
        return cont;
    }
}

class Countainer{
    public int num;
    /*@
        invariant.public true
        invariant.private hid(self) & num = 0;    
    @*/
    public Container(){
        num = 0;
    }
    //requires false
    public void set(){
        num = 0;
    }
}