package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if ("앱".equals(str)) {
        	playApp();
        }else if ("음악".equals(str)){
        	downloadPlay();
        } else {
        	super.execute(str);
        }
    }
 
    //메소드작성
    public void playApp() {
    	System.out.println("앱실행");
    }
    
    //메소드작성
    public void downloadPlay() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
}
