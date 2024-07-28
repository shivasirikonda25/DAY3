import java.util.*;
public class Contacts
{
     HashMap<String,Contacts> map=new HashMap<>();
    private String firstName;
    private String lastName;
    private String Address;
    private String city;
    private String state;
    private int zip;
    private String phone_number;
    private String email;
    public Contacts(){}
    public Contacts(String firstName,String lastName,String Address,String city,String state,int zip,String phone_number,String email)
    {
          this.firstName=firstName;
          this.lastName=lastName;
          this.Address=Address;
          this.city=city;
          this.state=state;
          this.zip=zip;
          this.phone_number=phone_number;
          this.email=email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.firstName = firstName;
    }
    public String getAddress() {
        return firstName;
    }

    public void setAddress(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    Scanner sc=new Scanner(System.in);
    public Contacts create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first name of the person :");
        String fn = sc.next();
        if (map.containsKey(fn)) {
            System.out.println("name is already present");
            return null;
        } else {
            System.out.println("please enter the last name of the person :");
            String ln = sc.next();
            System.out.println("enter the address of the person");
            String ad = sc.next();
            sc.nextLine();
            System.out.println("enter city of the person");
            String ci = sc.next();
            System.out.println("enter state of the person");
            String st = sc.next();
            System.out.println("enter zipcode of the person");
            int zp = sc.nextInt();
            System.out.println("enter the phone_number of the person");
            String ph = sc.next();
            System.out.println("enter the email of the person");
            String em = sc.next();
            Contacts c = new Contacts(fn, ln, ad, ci, st, zp, ph, em);
            System.out.println("successfully added" + c);
            return c;
        }
    }

    public Contacts edit()
    {
        System.out.println("enter the name of the person whose address to be edited");
        String t=sc.next();
        boolean flag=false;
        String first="";
        if(map.containsKey(t)) {
            Contacts c = map.get(t);
            System.out.println("do you want to edit firstName :");
            String t1 = sc.next();
            if (t1.equals("yes"))
            {
                flag=true;
                System.out.println("enter the updated firstName");
                String s = sc.next();
                first=c.getFirstName();
                c.setFirstName(s);
            }
            System.out.println("do you want to edit lastName :");
            String t2 = sc.next();
            if (t2.equals("yes")) {
                System.out.println("enter the updated lastName");
                String s = sc.next();
                c.setlastName(s);
            }
            System.out.println("do you want to edit address :");
            String t3 = sc.next();
            if (t3.equals("yes")) {
                System.out.println("enter the updated address");
                String s = sc.next();
                c.setAddress(s);
            }
            System.out.println("do you want to edit city :");
            String t4 = sc.next();
            if (t3.equals("yes")) {
                System.out.println("enter the updated city");
                String s = sc.next();
                c.setCity(s);
            }
            System.out.println("do you want to edit state:");
            String t5 = sc.next();
            if (t3.equals("yes")) {
                System.out.println("enter the updated state");
                String s = sc.next();
                c.setState(s);
            }
            System.out.println("do you want to edit zip:");
            int t6 = sc.nextInt();
            if (t3.equals("yes")) {
                System.out.println("enter the updated zip");
                int s = sc.nextInt();
                c.setZip(s);
            }
            System.out.println("do you want to edit phone_number:");
            String t7 = sc.next();
            if (t3.equals("yes")) {
                System.out.println("enter the updated phone_number");
                String s = sc.next();
                c.setPhone_number(s);
            }
            System.out.println("do you want to edit email:");
            String t8 = sc.next();
            if (t3.equals("yes")) {
                System.out.println("enter the updated email");
                String s = sc.next();
                c.setEmail(s);

            }
            if(!first.equals("")) map.remove(first);
            map.put(c.firstName,c);
            return c;
        }else {
            System.out.println("sorry data is not  available ");
            return null;
        }
    }
    public String delete()
    {
        System.out.println("enter the name for the address book to be  deleted");
        String t=sc.next();
        if(map.containsKey(t))
        {
            Contacts ct=map.get(t);
            map.remove(t);
            System.out.println("successfully deleted");
            return ct.getFirstName();
        }
        else {
            System.out.println("sorry data is not  available ");
            return null;
        }
    }

    @Override
    public String toString() {
        return  "firstname :"+firstName+" lastName :"+lastName+" Address :"+Address+" city :"+city+" state :"+state+" zip:"+zip+" phone_number:"+phone_number+" email:"+email;
    }
}

