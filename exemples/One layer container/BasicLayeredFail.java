//should fail
class BasicLayeredFail{
    public Countainer cont;
    /*@
        invariant.public hid(cont) & cont.num = 0;
    @*/
    public BasicLayeredFail(){
        cont = new Countainer();
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