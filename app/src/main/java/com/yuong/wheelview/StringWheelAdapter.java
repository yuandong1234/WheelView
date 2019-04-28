package com.yuong.wheelview;

import java.util.List;

public class StringWheelAdapter implements WheelAdapter {
	    private List<String> string_list=null;
	    private String[] string_arr=null;
	    private boolean flage=true;
		public StringWheelAdapter(){
			
		}
        public StringWheelAdapter(String[] str_arr ){
        		this.string_arr=str_arr;
        		flage=true;
	    }
       public StringWheelAdapter(List<String> str_list){
    	   		this.string_list=str_list;
    	   		flage=false;
  	    }
	   @Override
		public int getItemsCount() {
			// TODO Auto-generated method stub
		   if(flage){
			   return string_arr.length;
		    }else {
			   return string_list.size();
		     }
		}
	
		@Override
		public String getItem(int index) {
			// TODO Auto-generated method stub
			   if(flage){
				   return string_arr[index];
			    }else {
				   return string_list.get(index);
			     }
		}
	
		@Override
		public int getMaximumLength() {
			// TODO Auto-generated method stub
				int maxLen=0;
				int max=0;
				if(flage){
					for(int i=1;i<string_arr.length;i++){
						if(string_arr[i].length()>string_arr[max].length())   
						   max=i;
					}
					maxLen=string_arr[max].length();
			  }else {
					for(int i=1;i<string_list.size();i++){
						 	if(string_list.get(i).length()>string_list.get(max).length())
						   max=i;
					}
					maxLen =string_list.get(max).length();
			 }
				return maxLen;
	 }

}
