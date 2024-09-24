class ConvertDataType {
    static short methodOne(long l)
    {
        System.out.println("Ini Pas Long : " + l);
        int i = (int) l;
        System.out.println("Ini Pas Int : " + i);
        System.out.println("Ini Pas Short : " + (short)i);
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 128.25774;
        float f = (float) d;
        System.out.println("Ini Pas Float : " + f);
        byte b = (byte) methodOne((long) f);
        System.out.println("Ini Pas byte : " +b);
    }
}
