package mazibuko.s.coolesttea;

public class Tea {
    
    private String UserName;
    private String emailAddress;
    private char TeaType;
    private double priceOfTeaType;
    private int howManyTea;

    public Tea() {
    }

    public Tea(String UserName, String emailAddress, char TeaType, double priceOfTeaType, int howManyTea) {
        this.UserName = UserName;
        this.emailAddress = emailAddress;
        this.TeaType = TeaType;
        this.priceOfTeaType = priceOfTeaType;
        this.howManyTea = howManyTea;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeaType(char TeaType) {
        this.TeaType = TeaType;
    }

    public void setPriceOfTeaType(double priceOfTeaType) {
        this.priceOfTeaType = priceOfTeaType;
    }

    public void setHowManyTea(int howManyTea) {
        this.howManyTea = howManyTea;
    }

    
    public String getUserName() {
        return UserName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public char getTeaType() {
        return TeaType;
    }

    public double getPriceOfTeaType() {
        return priceOfTeaType;
    }

    public int getHowManyTea() {
        return howManyTea;
    }
    
    
    
    public String FindTeaDescription(){
    
        String Type= "";
        
        if(TeaType == 'B'){
        
            Type = "Black Tea";
        }
        else if(TeaType == 'G'){
        
            Type = "Green Tea";
        }
        else if(TeaType == 'O'){
        
            Type = "Oolong Tea";
        }
        else if(TeaType == 'Y'){
        
            Type = "Yellow Tea";
        }
        else if(TeaType == 'P'){
        
            Type = "Pu-erh Tea";
        }
        
        
        return Type;
    }
    
    public double getTotal(){
    
        double totalAmt = 0.0;
        
        totalAmt = priceOfTeaType * howManyTea;
                    
        return totalAmt;
        
    }

    @Override
    public String toString() {
        return "Tea{" + "UserName=" + UserName + ", emailAddress=" + emailAddress + ", TeaType=" + TeaType + ", priceOfTeaType=" + priceOfTeaType + '}';
    }
}
