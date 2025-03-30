import java.util.*;
public class Transactions{
  String farmer_id;
  float amount;
  Date timestamp;
  float balance;
  String type;
  // TRANSACTIONS
  Transactions(String famid,String transtype,float amm){
    farmer_id=famid;
    amount=amm;
    timestamp=new Date();
    type=transtype;
  }
  public String toString(){
    return farmer_id +" "+type+" SHS "+amount+" On" +" "+timestamp;
  }
}