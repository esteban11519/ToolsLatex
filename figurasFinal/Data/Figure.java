package Data;

import java.util.ArrayList;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Figure{
    // Figura name
    private String name;
    // Extension name to include severals
    private String extension;

    public Figure(String readString){
	processingString(readString);
    }

    
    public void processingString(String readString){
	/**
	 Convert and path into name and extension file
	 */
	String pattern=".";
	boolean isOnlyName=false;
	int lengthArrayName=0;
	
	StringBuilder stringBuilder = new StringBuilder();

	// Name is extracted from path
	String auxString=(new File(readString).getName());

    	// Separe name and extension
	String[] arrAuxString=auxString.split(Pattern.quote(pattern));

	lengthArrayName=arrAuxString.length-1;
	
	if(arrAuxString.length==1){
	    lengthArrayName=arrAuxString.length;
	    isOnlyName=true;
	}
	
	// File name contains dots
	for (int i=0;i<lengthArrayName;i++) {
	    stringBuilder.append(arrAuxString[i]);
	    if (i>=arrAuxString.length-2) {
		continue;
	    }
	    stringBuilder.append(pattern);
	}
	
	setName(stringBuilder.toString());

	if(isOnlyName){
	    setExtension("png");
	}
	else{
	    setExtension(arrAuxString[arrAuxString.length-1]);
	}
	
	
 
	return;
    }

    public void setName(String name){
	this.name=name;
	return;
    }

    public String getName(){
	return this.name;
    }

    public void setExtension(String extension){
	this.extension=extension;
	return;
    }

    public String getExtension(){
	return this.extension;
    }
}

/*
Thanks to: https://www.phind.com/
 */
