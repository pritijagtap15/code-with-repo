class strdemo
{
    public static void main(String[] args) {
        String str = "Pritu";
        System.out.println(str);
        //String name;
        //name =  new String("Harshu..");
        //System.out.println(name);

        System.out.println(str.length());

        String lstring = str.toLowerCase();
        System.out.println(lstring);

        String ustring = str.toUpperCase();
        System.out.println(ustring);

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());
        
        String tstring = str.trim();
        System.out.println(tstring);

        String str1 = "    Pritu     ";
        System.out.println(str1.trim());

        System.out.println(str.substring(1,3));

        System.out.println(str.replace('r' , 'n'));

        System.out.println(str.startsWith("P"));

        System.out.println(str.startsWith("Pri"));

        System.out.println(str.endsWith("i"));

        System.out.println(str.charAt(0));

        System.out.println(str.indexOf("tu",2));

        System.out.println(str.lastIndexOf("u",4));

        System.out.println(str.equals("Pritu"));

        System.out.println(str.equalsIgnoreCase("pritu"));

        System.out.println("I am a \" Double Quote"); 

    }
}