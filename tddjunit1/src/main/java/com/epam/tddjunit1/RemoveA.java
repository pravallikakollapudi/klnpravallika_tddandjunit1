package com.epam.tddjunit1;

public class RemoveA {
	public String delete(String s){
		String res="";
		int l = s.length();
		if(s==" " || (l==2 && s.charAt(0)=='A' && s.charAt(1)=='A')){
			res=" ";
		}
		else if(l>=2 && s.charAt(0)=='A' && s.charAt(1)=='A'){
			res=res+s.substring(2);
		}
		else if(l>=2 && s.charAt(0)=='A'){
			res=res+s.substring(1,l);
		}
		else if(l>=2 && s.charAt(1)=='A'){
			res=res+s.charAt(0)+s.substring(2);
		}
		else{
			res=s;
		}
		return res;
	}

}
