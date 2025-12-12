public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;
	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    public void setBinary(String newValue)
    {
        binaryValue = newValue;
    }
    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        String finalBinary = "";
        int totalValue = value;
        int tempValue = 128;
        
        for (int i = 0; i < binaryValue.length()-1; i++)
        {
            if ((totalValue - tempValue) >= 0)
            {
                finalBinary = finalBinary + "1";
                totalValue -= tempValue;
            }
            else
            {
                finalBinary = finalBinary + "0";
            }
            
            tempValue /= 2;

        }
    	
        return finalBinary;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int tempValue = 1;
        int totalValue = 0;
        //checks the binary values from right to left
        for (int i = binaryValue.length()-1; i >= 0; i--)
        {
            if (binaryValue.charAt(i) == '1')
            {
                
                totalValue += tempValue;    
                   
            }
            //gets the next decimal value (from binary) ready whether or not the next digit is 1
            tempValue *= 2; 
            
        }
    	return totalValue;
    }
    public String toString()
    {
        return "" + "The decimal value of: " + binaryValue + " is: " + toDecimal() + "\n"
        + "The binary value of: " + value +  " is: " + toBinary();
    }

}