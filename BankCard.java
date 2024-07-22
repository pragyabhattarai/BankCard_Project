
/**
 * Write a description of class Bank_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
     private int cardId;
     private double BalanceAmount;
     private String bankaccount;
     private String clientname;
     private String issuerbank;
    public BankCard( double BalanceAmount, int cardId, String bankaccount, String issuerbank)
    {
       this.BalanceAmount=BalanceAmount;
       this.cardId=cardId;
       this.bankaccount=bankaccount;
       this.issuerbank=issuerbank;
       this.clientname= "";
    }
    public int getcardId()
    {
        return this.cardId;
    }
    public double getBalanceAmount()
    {
        return this.BalanceAmount;
    }
    public String getbankaccount()
    {
        return this.bankaccount;
    }
    public String getclientname()
    {
        return this.clientname;
    }
    public String getissuerbank()
    {
        return this.issuerbank;
    }
    public void setclientname(String clientname)
    {
        this.clientname=clientname;
    }
    public void setBalanceAmount(double BalanceAmount)
    {
        this.BalanceAmount=BalanceAmount;
    }
    public void display()
    {
        if (this.clientname== " "){
            System.out.println("No client name assigned");
        }
        else{
            System.out.println("cardId:"+cardId);
            System.out.println("clientname:"+clientname);
            System.out.println("issuerbank:"+issuerbank);
            System.out.println("bankaccount:"+bankaccount);
            System.out.println("BalanceAmount:"+BalanceAmount);
        }
        }
    }

