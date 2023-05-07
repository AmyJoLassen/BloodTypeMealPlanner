package data;

public class foodType {

	    private String code;
	    private String description;
	    //private String amount;

	    public foodType() {
	        code = "";
	        description = "";
	        //amount = "";
	    }

	    public foodType(String code, String description) {
	        this.code = code;
	        this.description = description;
	        //this.amount = amount;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getCode() {
	        return code;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getDescription() {
	        return description;
	    }

	    //public void setAmount(String amount) {
	      //  this.amount = amount;
	    //}

	    //public String getAmount() {
	      //  return amount;
	    //}
	
}
