//should fail
class SetterFail{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public SetterFail(){
        pub = 0;
    }
    public void set(int set){
        pub = set;
    }
}