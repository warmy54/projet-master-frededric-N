//should succeed
class BasicSuccess{
    private int pub;
    /*@
        invariant.public hid(pub) & pub == 0
    @*/
    public BasicSuccess(){
        pub = 0;
    }
}