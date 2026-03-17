
class CharacterPattern {
    char character;
    String[] pattern;

    CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }
}
public class uc7bannerappp {

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {oPattern, oPattern, pPattern, sPattern};

        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.pattern[i] + "   ");
            }
            System.out.println();
        }
    }
}
