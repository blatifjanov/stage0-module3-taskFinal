package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first,ten,hundred;
        first=number%10;
        ten = (number/10)%10;
        hundred=number/100;
        System.out.println(first*100+ten*10+hundred);

    }
}
