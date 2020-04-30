import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Amazon {
    public static void main(String[] args) {
        List<String> logLines = new ArrayList<>();
        logLines.add("a1 9 2 3 1");
        logLines.add("g1 Act car");
        logLines.add("zo4 4 7");
        logLines.add("ab1 off KEY dog");
        logLines.add("a8 act zoo");

        List<String> strings = new Amazon().sortLogFiles(logLines);
        strings.forEach(System.out::println);

    }

    public static final String SPACE = " ";

    public List<String> sortLogFiles(List<String> logLines) {

        logLines.sort((o1, o2) -> {
            String[] split = o1.split(SPACE);
            List<String> firstData = getData(split);
            String firstIdentifier = split[0];

            split = o2.split(SPACE);
            List<String> secondData = getData(split);
            String secondIdentifier = split[1];

            int compareList = compareList(firstData, secondData);
            if (compareList != 0) {
                return compareList;
            } else if (!isWord(firstData) && !isWord(secondData)) {
                return 0;
            }
            return firstIdentifier.compareTo(secondIdentifier);
        });
        return logLines;
    }

    public int compareList(List<String> firstData, List<String> secondData) {
        boolean isFirstWord = isWord(firstData);
        boolean isSecondWord = isWord(secondData);

        if (isFirstWord != isSecondWord) {
            return isFirstWord ? -1 : 1;
        } else if (!isFirstWord) {
            return 0;
        } else {
            return concatenate(firstData).compareTo(concatenate(secondData));
        }

    }

    public String concatenate(List<String> firstData) {
        StringBuilder stringBuilder = new StringBuilder();
        firstData.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public boolean isWord(List<String> firstData) {
        AtomicBoolean isWord = new AtomicBoolean(false);
        firstData.forEach(val -> {
            try {
                Integer.parseInt(val);
            } catch (NumberFormatException e) {
                isWord.set(true);
            }
        });

        return isWord.get();
    }

    public List<String> getData(String[] split) {

        return Arrays.asList(split).subList(1, split.length);
    }


}
