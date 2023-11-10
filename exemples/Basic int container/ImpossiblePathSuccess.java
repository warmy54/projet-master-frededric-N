//should succeed
class ImpossiblePathSuccess{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public ImpossiblePathSuccess(){
        pub = 0;
    }
    public void set(int set){
        if(1==2){
            pub = set;
        }
        
    }
}