public class Paketor {
    String eNaslov;
    String ime;
    Paketor(String eNaslov, String ime){
        this.eNaslov = eNaslov;
        this.ime = ime;
    }
    StringBuilder sb = new StringBuilder(eNaslov);
    for(int i = 0; i < eNaslov.length(); i++) {
        if (eNaslov.charAt(i).equals("@")) {
            sb[i] = '.';
        }
    }
        String eNaslov2 = sb.ToString();
    public void izpis() {
        System.out.println(eNaslov.concat("." + ime));
    }
}