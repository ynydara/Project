public class Weird {
    private int aa;
    private double bb;

    Weird(int aa){
        this.aa = aa;

    }
    public int getAa(){
        return aa;
    }//getter accessor method. they are public and return the same type with the name get.

    //setter for aa
    public void setAa(int aa){

        if(aa > 0){
            this.aa = aa;
        }
    }
    //getter for bb
    public double getBb(){
        return bb;
    }


}
