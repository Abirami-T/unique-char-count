/*

input : Session
output : 5

input : Find
output : 4

*/


import java.util.*;

public class Main
{
    static void unique(String str){
        int len=str.length();
        int count=0;
        char[] s=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<len;i++){
            if(hm.containsKey(s[i])){
                hm.put(s[i],hm.get(s[i])+1);
            }else{
                hm.put(s[i],1);
            }
        }
        for(Map.Entry m:hm.entrySet()){
            count++;
        }
        System.out.println(count);
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str;
		str=in.next();
		str=str.toLowerCase();
		unique(str);
		in.close();
	}
}
