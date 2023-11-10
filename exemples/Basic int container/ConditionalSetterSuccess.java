//should succeed
class ConditionalSetterSuccess{
    private int pub;
    /*@
        invariant.public hid(pub) && pub == 0
    @*/
    public ConditionalSetterSuccess(){
        pub = 0;
    }
    public void set(int set){
        if(set == 0){
            pub = set;
        }
        
    }
}