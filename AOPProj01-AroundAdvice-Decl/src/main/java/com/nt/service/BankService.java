//BankService.java
package com.nt.service;

public   class BankService {
     public   double calcSimpleIntrestAmount(double pAmt,double rate,double time) {
    	 System.out.println("BankService.calcSimpleIntrestAmount()"+pAmt+"   "+rate+"  "+time);
    	 System.out.println("without interset "+(pAmt*rate*time)/100.0f);
    	 return (pAmt*rate*time)/100.0f;
     }
     
     public   double calcCompoundIntrestAmount(double pAmt,double rate,double time) {
    	 System.out.println("BankService.calcCompoundIntrestAmount()"+pAmt+"   "+rate+"  "+time);
    	 System.out.println("without interset "+((pAmt*Math.pow(1+rate/100,time))-pAmt));  
    	 return   (pAmt*Math.pow(1+rate/100,time))-pAmt;
     }
     
}
