public class Main {
    public static void main(String[] args) {
        try {
            String lesson = args[0];
            int grade;

            if ("Английский_язык".equals(lesson)) {
                grade = 5;
            } else if ("Русский_язык".equals(lesson)) {
                grade = 4;
            } else if ("Алгебра".equals(lesson)) {
                grade = 4;
            } else if ("Геометрия".equals(lesson)) {
                grade = 5;
            } else if ("Химия".equals(lesson)) {
                grade = 5;
            } else if ("Биология".equals(lesson)) {
                grade = 4;
            } else if ("Информатика".equals(lesson)) {
                grade = 5;
            } else if ("Литература".equals(lesson)) {
                grade = 4;
            } else if ("История".equals(lesson)) {
                grade = 4;
            } else if ("Физика".equals(lesson)) {
                grade = 4;
            } else if ("География".equals(lesson)) {
                grade = 4;
            } else if ("Физ-ра".equals(lesson)) {
                grade = 5;
            }
            else {
                System.out.println("Такого урока нет в списке!");
                return;
            }

            System.out.println(grade);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нужен аргумент!");
        }
    }
}
