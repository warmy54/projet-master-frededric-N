//should succeed
class SetterSuccess{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public SetterSuccess(){
        pub = 0;
    }
    public void set(int set){
        pub = 0;
    }
}