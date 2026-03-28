package livres;

public class Pays {
    private final Integer MAX_CODE_LENGTH = 3;
    private final Integer MIN_CODE_LENGTH = 0;

    private String nom;
    private String code;

    public String getNom() {
        return nom;
    }

    public String getCode() {
        return code;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCode(String code){
        if(code.length() < MIN_CODE_LENGTH && code.length() > MAX_CODE_LENGTH)
            this.code = code.toUpperCase();
    }

    public Pays(String nom, String code){
        this.nom = nom;
        setCode(code);
    }
}
