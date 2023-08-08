class MAinDemopb
{
    public static void main(String[] args) {
        String a = "Computer";
        System.out.println(a.toLowerCase());
        String a1 = "Comp department";
        System.out.println(a1.replace(' ' ,  '_'));
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Pritu" ));
        String mystring = "The String  Double space and    Triple space";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        String letter1 = "\t COmputer Engineering,\n\t Trinity Academy of Engineedring. \n\t NAAC! ";
        System.out.println(letter1);
        
    }
}