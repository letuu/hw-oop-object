package pro.sky.java.ds_3_0.task1;

public class Human {

    private final String name;
    private final int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        if (name == null) {
            this.name = "\"Информация не указана\"";
        } else {
            this.name = name;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (town == null) {
            this.town = "\"Информация не указана\"";
        } else {
            this.town = town;
        }

        if (job == null) {
            this.job = "\"Информация не указана\"";
        } else {
            this.job = job;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился (-лась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
