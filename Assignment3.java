import java.util.Scanner;
class HelloWorld {
    public void Example1(String Sentences,char Letters, String Original_Sentences){
        String res="";
        int index = Sentences.indexOf(Letters)+1;
        for(int i=0;i<Original_Sentences.length();i++){
                res=Original_Sentences.substring(index,Original_Sentences.length());
                    /*name = res.split(" ");
                    console.log(name[i].charAt(0));*/
        }
        System.out.println(res); 
    }
    public void Example2(String Sentences,char Letters, String Original_Sentences){
        String res="";
        int index = Sentences.indexOf(Letters)+1;
        for(int i=0;i<Original_Sentences.length();i++){
                res=Original_Sentences.substring(index,Original_Sentences.length());
                    /*name = res.split(" ");
                    console.log(name[i].charAt(0));*/
                if(Original_Sentences.charAt(i)=='!'){
                    System.out.println(Original_Sentences.replaceAll("!","1").substring(index,Original_Sentences.length()));
                    //document.getElementById('res').innerHTML=hello.replaceAll("@","2").substring(hello.indexOf(Letter)+1);

                }
                else if(Original_Sentences.charAt(i)=='@'){
                    System.out.println(Original_Sentences.replaceAll("@","2").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='#'){
                    System.out.println(Original_Sentences.replaceAll("#","3").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='$'){
                    System.out.println(Original_Sentences.replaceAll("$","4").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='%'){
                    System.out.println(Original_Sentences.replaceAll("%","5").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='^'){
                    System.out.println(Original_Sentences.replaceAll("^","6").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='&'){
                    System.out.println(Original_Sentences.replaceAll("&","7").substring(index,Original_Sentences.length()));
                }
                
                else if(Original_Sentences.charAt(i)=='*'){
                    System.out.println(Original_Sentences.replaceAll("*","8").substring(index,Original_Sentences.length()));
                }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sentences:");
        String Original_Sentences = s.nextLine();
        String Sentences = Original_Sentences.toUpperCase();
        System.out.print("Letter from A to Z (in capital letters only):");
        char Letters = s.next().charAt(0);
        boolean isLetters = false;
        for(int i=0;i<Sentences.length();i++)
        {
            if(Sentences.charAt(i)==Letters){
                isLetters=true;
                break;
            }
        }
        if(isLetters){
            System.out.println("The letter exists");
        }
        else{
            System.out.println("The letter doesn't exists");
        }
        HelloWorld hw = new HelloWorld();
        System.out.print("RESULTS for example1:-");
        hw.Example1(Sentences,Letters,Original_Sentences);
        System.out.print("RESULTS for example2:-");
        hw.Example2(Sentences,Letters,Original_Sentences);
    }
}