//should fail
class MidFuncInvariantFail{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public MidFuncInvariantFail(){
        pub = 0;
    }
    public void set(){
        pub = 1;
        pub = 0;
    }
}