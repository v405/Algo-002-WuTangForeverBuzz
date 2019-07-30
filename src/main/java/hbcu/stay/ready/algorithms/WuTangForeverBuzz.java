package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan() {
        String returnString = "1\n";
        for (int i = 2; i < 16; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                returnString += "WuTang Forever";
            } else if (i % 3 == 0) {
                returnString += "Wu\n";
            } else if (i % 5 == 0) {
                returnString += "Tang\n";
            } else {
                returnString += i+"\n";
            }
        }
        return returnString;
    }
}
