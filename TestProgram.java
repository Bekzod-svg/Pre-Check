import java.util.Arrays;
import java.util.List;

public class TestProgram {
    public static void main(String[] args) {
        List<String> awards1 = Arrays.asList("UFFA 2019", "Boxing Central Asian Cup 2022", "UFC");
        Participant participant1 = new Participant("Bekzod", "Nazarov", 22, "UFC", awards1);

        List<String> awards2 = Arrays.asList("Central Asian Chess 2020");
        Participant participant2 = new Participant("Durbek", "Nazarov", 20, "Chess", awards2);

        Participant[] participants = {participant1, participant2};

        for (Participant p : participants) {
            if ("UFC".equals(p.getTypeOfSport())) {
                System.out.println(p.getName() + " " + p.getSurname() + " is UFC boxer.");
            }

            long localAwardsCount = p.getAwards().stream()
                    .filter(award -> award.toLowerCase().contains("asian"))
                    .count();

            System.out.println(p.getName() + " has " + localAwardsCount + " Asian awards.");
        }
    }
}
