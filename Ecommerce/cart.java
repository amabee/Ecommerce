package Ecommerce;

public class cart {
    private String cartname; 
    private int cartprice;

    public cart(int CARTPRICE, String CARTNAME){
        this.cartprice = CARTPRICE;
        this.cartname = CARTNAME;
    }

    public int setCartPrice(int CARTPRICE){
        this.cartprice = CARTPRICE;
        return this.cartprice;
    }

    public String setCartName(String CARTNAME){
        this.cartname = CARTNAME;
        return this.cartname;
    }

    public int getCartPrice(){
        
        return this.cartprice;
    }
     String getCartName(){
        
        return this.cartname;
    }
}
