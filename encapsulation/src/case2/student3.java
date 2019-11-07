package case2;
public class student3 {
	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;
	int n=0,ad=0,c=0,e=0,ptype=0,pid=0;
	 public String getEmail()
	    {
	        return this.email;
	    }
public boolean setEmail(String email)

    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            //System.out.println("Invalid Email");
           //  flag = 0;
        	e++;
            return false;
        }
    }
public String getContactnumber()
{
    return this.contactnumber;
}
   
public boolean setContactnumber(String contactnumber)
    {
        if (contactnumber.matches("^[0-9]*$"))
        {
            this.contactnumber=contactnumber;
            return true;
        }
        else
        {
           // System.out.println("Invalid Contact Number");
         //   flag = 0;
        	c++;
            return false;
        }
    }
public String getName()
{
    return this.name;
}
        public  boolean setName(String name)
        {
            if (name.matches("^[A-Za-z]*$"))
            {
                this.name=name;
                return true;
            }
            else
            {
                //System.out.println("Invalid name");
                //flag = 0;
            	n++;
                return false;
            }
        }
        public String getAddress()
        {
            return this.address;
        }
            public  boolean setAddress(String address)
            {
                if (address.matches("^[a-zA-Z]*$"))
                {
                    this.address=address;
                    return true;
                }
                else
                {
                 //   System.out.println("Invalid Address");
                  //  flag = 0;
                	ad++;
                    return false;
                }
    }
            public String getProoftype()
            {
                return this.prooftype;
            }
            public  boolean setProoftype(String prooftype)
            {
                if (prooftype.matches("^[a-zA-Z]*$"))
                {
                    this.prooftype=prooftype;
                    return true;
                }
                else
                {
                  //  System.out.println("Invalid proof type");
                 //   flag = 0;
                	ptype++;
                    return false;
                }
            }
            public String getProofid()
            {
                return this.proofid;
            }
            
           public  boolean setProofid(String proofid)
                {
                    if (proofid.matches("^[a-zA-Z]*$"))
                    {
                        this.proofid=proofid;
                        return true;
                    }
                    else
                    {
                      //  System.out.println("Invalid proofid");
                        //flag = 0;
                    	pid++;
                        return false;
                    }
                
                }    

        



public void check()
{

if(ad==0&&n==0&&ptype==0&&pid==0&&c==0&&e==0)
{
	System.out.println("registeration successfull");
	display();
}
else
{
if(ad==1)
{
	System.out.println("Invalid address");
}
if(n==1)
{
	System.out.println("Invalid number");
}
if(e==1)
{
	System.out.println("Invalid email");
}
 if(ptype==1)
{
	System.out.println("Invalid prooftype");
}
if(pid==1)
{
	System.out.println("Invalid proof id");
}


	System.out.println("resiteration is unsuccesful");
}
}


public void display() {
	// TODO Auto-generated method stub
	
	System.out.println("name   "+name);
	System.out.println("Address	"+address);
	System.out.println("Contact number	"+contactnumber);
	System.out.println("Email	"+email);
	System.out.println("Prooftype	"+proofid);
	System.out.println("Proofid	"+prooftype);
	System.out.println("Thankyou for registering");
	
	
}
}