package module6.homeOrk5;

import module6.homeOrk4.User;

public class UserUtils {

    public static User[] uniqueUsers(User[] users){
        User[] uniqueUsers = new User[0];
        boolean Unique;

        for(int i=0; i<users.length;i++) {
            Unique = false;
            for (int w=0; w <users.length; w++) {
                if (i!=w && users[i].equals(users[w])){
                    Unique = false;
                    break;
                }
                Unique = true;
            }
            if(Unique){
                User[]userTemp = new User[uniqueUsers.length +1];
                System.arraycopy(uniqueUsers,0,userTemp,0,uniqueUsers.length);

                userTemp[userTemp.length -1] = users[i];
                uniqueUsers = userTemp;
            }
        }
        return uniqueUsers;
    }


   public static User[] usersWithConditionalBalance(User[] users, int balance){
        User[] thatUsers = new User[0];

       for(int i = 0; i<users.length; i++) {
           if(users[i].getBalance() == balance){
               User[]userTemp = new User[thatUsers.length+1];
               System.arraycopy(thatUsers,0,userTemp,0,thatUsers.length);

               userTemp[userTemp.length-1] = users[i];
               thatUsers = userTemp;
           }
       }
       return thatUsers;
    }


    public static final User[] paySalaryToUsers(User[] users){
        for(int i=0; i<users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());

            System.out.println(users[i].getBalance());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users){
        long[] usersID = new long[users.length];
        for(int i=0; i<users.length; i++){
            usersID[i] = users[i].getId();
        }
        return usersID;
    }

    public static User[] deleteEmptyUsers(User[] users){
        User[] validUsers = new User[0];
        for(int i=0; i<users.length; i++){
            if(users[i] != null){
                User[]tempArr = new User[validUsers.length+1];
                System.arraycopy(validUsers,0,tempArr,0,validUsers.length);
                tempArr[tempArr.length-1] = users[i];
                validUsers = tempArr;
            }
        }
        return validUsers;
    }
}
