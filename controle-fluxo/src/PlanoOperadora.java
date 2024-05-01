public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //B /T

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
                break;
            }
            case "M":{
                System.out.println("Whats e Instagram gratis");
                break;
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
                break;
            }
        }
    }
}
