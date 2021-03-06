package agh.cs.lab2;

public class OptionsParser {
    public static MoveDirection[] parse(String[] arg){
        MoveDirection[] tab=new MoveDirection[arg.length];
        for(int x=0;x<arg.length;x++){
            if(arg[x]=="f" || arg[x]=="forward"){
                tab[x]=MoveDirection.Forward;
            }
            else if(arg[x]=="b" || arg[x]=="backward"){
                tab[x]=MoveDirection.Backward;
            }
            else if(arg[x]=="r" || arg[x]=="right"){
                tab[x]=MoveDirection.Right;
            }
            else if(arg[x]=="l" || arg[x]=="left"){
                tab[x]=MoveDirection.Left;
            }
            else throw new IllegalArgumentException(arg[x] +" Niewlasciwy argument");
        }
        return tab;
    }
}
