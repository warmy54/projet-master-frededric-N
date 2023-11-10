//should fail
class BasicFail{
    public int pub;
    /*@
        invariant.public hid(pub) & pub == 0
    @*/
    public BasicFail(){
        pub = 0;
    }
}