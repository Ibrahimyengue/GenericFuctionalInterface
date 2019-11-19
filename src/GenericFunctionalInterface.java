import generic_interface.GenericInterface;

public class GenericFunctionalInterface implements GenericInterface<Integer> {

    public static void main(String[] args) {

        GenericFunctionalInterface genericFunctionalInterface = new GenericFunctionalInterface();
        System.out.println("Result!: " + genericFunctionalInterface.process(2,3));
    }


    @Override
    public Integer process(Integer arg1, Integer arg2) {
        return arg1 * arg2;
    }
}
