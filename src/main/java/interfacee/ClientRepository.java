package interfacee;

import model.Client;

public interface ClientRepository {
    void ajouterClient(Client client);
    void modifierClient(Client client);
    void supprimerClient(String nom, String prenom);
    Client rechercherClient(String nom, String prenom);
}
