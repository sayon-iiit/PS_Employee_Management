import java.util.*;
class Employee{
    int id;
    String name;
    float salary;
    long phone_no;
    String email_id;
    public Employee(int id, String name, float salary, long contact_no, String email_id)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone_no = contact_no;
        this.email_id = email_id;
    }
    public String toString()
    {
        return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " + this.salary + "\nContact No: " + this.phone_no + "\nEmail-id: " + this.email_id;
    }
}
public class EmployeeManagement
{
    static void display(ArrayList<Employee> al)
    {
        System.out.println("\n######### Details of All Employees #########\n");
        for(Employee e : al)
        {
            System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.phone_no+" "+e.email_id);
        }
    }
    public static void main(String[] args)
    {
        int id;
        String name;
        float salary;
        long contact_no;
        String email_id;
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<Employee>();
       do
        {
            System.out.println("\n######### My Employee Management System #########\n");
            System.out.println("1). Add Employee \n" + "2). Search for Employee\n" + "3). Update Employee details\n" + "4). Delete Employee Details\n" + "5). Display all Employee details\n" + "6). EXIT\n");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("\nEnter Employee details:\n");
                    System.out.println("Enter ID :");
                    id = sc.nextInt();
                    System.out.println("Enter Name :");
                    name = sc.next();
                    System.out.println("Enter Salary :");
                    salary = sc.nextFloat();
                    System.out.println("Enter Contact No :");
                    contact_no = sc.nextLong();
                    System.out.println("Enter Email-ID :");
                    email_id = sc.next();
                    al.add(new Employee(id, name, salary, contact_no, email_id));
                    display(al);
                    break;
                case 2: System.out.println("Enter the Employee ID to search :");
                    id = sc.nextInt();
                    int i=0;
                    for(Employee e: al)
                    {
                        if(id == e.id)
                        {
                            System.out.println(e+"\n");
                            i++;
                        }
                    }
                    if(i == 0)
                    {
                        System.out.println("\nNo Employee Record Found!!!!");
                    }
                    break;
                case 3: System.out.println("\nEnter the Employee ID to EDIT the details");
                    id = sc.nextInt();
                    int j=0;
                    for(Employee e: al)
                    {
                        if(id == e.id)
                        {
                            j++;
                            do{
                                int ch1 =0;
                                System.out.println("\nSelect Employee Details you want to edit :\n" +  "1). Employee ID\n" + "2). Name\n" + "3). Salary\n" + "4). Contact No.\n" + "5). Email-ID\n" + "6). GO BACK\n");
                                System.out.println("Enter your choice : ");
                                ch1 = sc.nextInt();
                                switch(ch1)
                                {
                                    case 1: System.out.println("\nEnter new ID:");
                                        e.id =sc.nextInt();
                                        System.out.println(e+"\n");
                                        break;
                                    case 2: System.out.println("Enter new Name:");
                                        e.name =sc.nextLine();
                                        System.out.println(e+"\n");
                                        break;
                                    case 3: System.out.println("Enter new Salary:");
                                        e.salary =sc.nextFloat();
                                        System.out.println(e+"\n");
                                        break;
                                    case 4: System.out.println("Enter new Employee Contact No. :");
                                        e.phone_no =sc.nextLong();
                                        System.out.println(e+"\n");
                                        break;
                                    case 5: System.out.println("Enter new Email-ID :");
                                        e.email_id =sc.next();
                                        System.out.println(e+"\n");
                                        break;
                                    case 6: j++;
                                        break;
                                    default : System.out.println("\nEnter valid choice.");
                                        break;
                                }
                            }
                            while(j==1);
                        }
                    }
                    if(j == 0)
                    {
                        System.out.println("\nNo Employee Record Found!!");
                    }
                    break;
                case 4: System.out.println("\nEnter Employee ID to DELETE :");
                    id = sc.nextInt();
                    int k=0;
                    try{
                        for(Employee e: al)
                        {
                            if(id == e.id)
                            {
                                al.remove(e);
                                display(al);
                                k++;
                            }
                        }
                        if(k == 0)
                        {
                            System.out.println("\nNo Employee Record Found!!");
                        }
                    }
                    catch(Exception ex){
                        //System.out.println(ex);
                    }
                    break;
                case 5:
                    display(al);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default : System.out.println("\nEnter a correct choice from the List :");
                    break;
            }
        }
        while(true);
    }
}