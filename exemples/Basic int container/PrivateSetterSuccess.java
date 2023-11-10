//should succeed
class PrivateSetterSuccess{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public PrivateSetterSuccess(){
        pub = 0;
    }
    private void set(int set){
        pub = set;
    }
}