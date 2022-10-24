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
        //if(name == null || name.isBlank())
        //if(name == null || name.isEmpty() || name.isBlank())
        //можно и так, но isEmpty() можно опустить и сразу проверять на isBlank(), так чуть дольше, но скорость здесь не важна
        //name.isEmpty() можно заменить на name.lenght() == 0

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

/*
    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = validOrDefault(name, "Информация не указана");
        this.town = validOrDefault(town, "Информация не указана");
        //this.yearOfBirth = yearOfBirth >= 0 ? yearOfBirth : 0; //используем тернарный оперетор, джава предлагает заменить
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.job = validOrDefault(job, "Информация не указана");
    }

    // или если сделать метод в отдельном классе, то можно и так:
    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = ValidationUtils.validOrDefault(name, "Информация не указана");
        this.town = ValidationUtils.validOrDefault(town, "Информация не указана");
        //this.yearOfBirth = yearOfBirth >= 0 ? yearOfBirth : 0; //используем тернарный оперетор, джава предлагает заменить
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.job = ValidationUtils.validOrDefault(job, "Информация не указана");
    }

    private String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
 */
}
