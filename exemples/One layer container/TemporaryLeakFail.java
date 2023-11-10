//should fail
class TemporaryLeakFail{
    private Countainer cont;
    /*@
        invariant.public hid(cont) & cont.num = 0;
    @*/
    public TemporaryLeakFail (){
        cont = new Countainer();
    }
    //should fail because cont is newC after second line
    public void set(Countainer newC){
        Countainer temp = cont;
        cont = newC;
        cont = temp;
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