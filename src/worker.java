public class worker {
        private String workSurname;
        private String positionFirst;
        private String emailAddres;
        private String nomerTelefon;
        private int bigCash;
        private int Age;




    public worker(String workSurname, String positionFirst,
                  String emailAddres, String nomerTelefon, String bigCash, int Age) {
        this.workSurname = workSurname;
        this.positionFirst = positionFirst;
        this.emailAddres = emailAddres;
        this.nomerTelefon = nomerTelefon;

        }


    public String getWorkSurname() {
        return workSurname;
    }

    public int getAge() {
        return Age;
    }

    public void info(){
        System.out.println("Name: " + workSurname + ", position: " + positionFirst + ", email: " + emailAddres +
                ", telefon: " + nomerTelefon + ", Cash: " + bigCash + ", age: " + Age);
    }
}
