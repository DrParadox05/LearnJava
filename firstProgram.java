class Box
{
    private int length, bredth, height;
    public void setDimension(int l, int b, int h)
    {length= l; bredth= b; height= h;}
    public void showDimension()
    {
        System.out.println("L = "+length);
        System.out.println("B = "+bredth);
        System.out.println("H = "+height);
    }
}

class firstProgram
{
    public static void main(String []args)
    {
        Box sBox = new Box();
        sBox.setDimension(12,10,5);
        sBox.showDimension();
        sBox = new Box();
        sBox.showDimension();
    }
}