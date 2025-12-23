package casting;

public class CastingNotasEstudos {    
    public static void main(String[] args) {
        // Widenig Casting (implícito) => Quando guarda tipo menor em maior.
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena; // Casting implícito

        System.out.println(variavelGrande);

    }
}