// Déclaration du package pour la classe BanqueService
package service;

// Import des annotations et classes nécessaires pour la création d'un service web
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte; // Import de la classe Compte du package metier

import java.util.Date;
import java.util.List;

// Annotation déclarant que cette classe est un service web
@WebService(name = "BanqueWS")
public class BanqueService {

    // Méthode exposée en tant que service web pour la conversion d'Euro à Dinar
    @WebMethod(operationName = "convertEuroToDinar")
    public double conversion(@WebParam(name = "montant") int montant) {
        // Implémentation simple de la conversion
        return montant * 3.36;
    }

    // Méthode exposée en tant que service web pour obtenir un compte par code
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        // Création d'un nouveau compte avec un solde initial de 0 et la date actuelle
        return new Compte(code, 0, new Date());
    }

    // Méthode exposée en tant que service web pour obtenir une liste de comptes
    @WebMethod
    public List<Compte> getComptes() {
        // Création d'une liste de comptes avec des identifiants différents et le même solde initial et date
        return List.of(
                new Compte(1, 0, new Date()),
                new Compte(2, 0, new Date()),
                new Compte(3, 0, new Date())
        );
    }
}
