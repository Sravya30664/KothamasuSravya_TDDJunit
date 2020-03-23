package com.epam.Junit;

public class RemoveA {
public  String removeAfrom(String st){
String resultstring="";
int i;
if(st=="")
	return resultstring;
else {
char[] ch=st.toCharArray();
for(i=0;i<2;i++) {
	if(!(ch[i]=='a'|| ch[i]=='A')) {
		resultstring=resultstring+ch[i];
	}
	}
resultstring=resultstring+st.substring(2,st.length());
return resultstring;
}
}
}

