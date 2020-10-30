import java.time.*;
import java.util.*;

public class Duration {
    public static void main(String[] args) {
        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("\nDifference is %d years, %d months and %d days \n\n", diff.getYears(), diff.getMonths(),
                diff.getDays());
    }
}