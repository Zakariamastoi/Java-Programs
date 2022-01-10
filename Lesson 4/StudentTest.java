public class StudentTest{
		public static void main (String[]args){
			Student student1 = new Student("Muhammad",93.50);
			Student student2 = new Student("Haris",83.53);
			System.out.printf("%s's grade is :%s%n", student1.getName(), student1.getGrade());
			System.out.printf("%s's grade is :%s%n", student2.getName(), student2.getGrade());
		}
}