// Write a java program to print even numbers upto 100

class Even{
    public static void main(String args[]){
        System.out.println("Even Numbers from 1 to 100: ");

        for(int i=1; i<=100 ; i++){
            if(i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}