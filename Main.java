//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        double  global_salary_workers=0, global_salary_workers_taxes=0;

        Worker[] list_workers = new Worker[100]; // array de 100 pos de clase workers donde cada pos tendra las tres variables, name salary and complement
        list_workers[0] = new Worker("Alice", 3000, 500, 0.3);
        list_workers[1] = new Worker("juan", 4000, 200, 0.2);
        list_workers[2] = new Worker("Miquel", 4300, 500, 0.1);
        list_workers[3] = new Worker("Pepito", 10000, 300, 0.2);
        int numberOfWorkers=3;
         // Print Total salary
         //######################################## list_workers.length
        for (int i = 0; i < numberOfWorkers; i++){

            global_salary_workers += list_workers[i].salary + list_workers[i].complement;
            global_salary_workers_taxes += list_workers[i].salary + list_workers[i].complement -(list_workers[i].salary + list_workers[i].complement)*list_workers[i].taxes;

        }

        System.out.println("#################################");
        System.out.println("Global Total Salary: " + global_salary_workers);
        System.out.println("Global Total Salary with taxes: " + global_salary_workers_taxes);
        System.out.println("#################################");
        //#####################################

        //Print all information of workers
        //#####################################
        for (int i = 0; i < numberOfWorkers; i++){

            System.out.println("Name:" + list_workers[i].name);
            System.out.println("Salary:" + list_workers[i].salary);
            System.out.println("Complemnt:" + list_workers[i].complement);
            System.out.println("Total salary:" + (list_workers[i].complement + list_workers[i].salary));
            System.out.println("Total salary with taxes:" + (list_workers[i].complement +list_workers[i].salary - (list_workers[i].complement +list_workers[i].salary)*list_workers[i].taxes));
            System.out.println("###############");
        }

        //#####################################
    }

}
