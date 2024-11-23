package com.beautyhub.mappers;

import com.beautyhub.dto.ClientDTO;
import com.beautyhub.entities.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDTO toDTO(Client client) {
        if (client == null) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setFirstName(client.getFirstName());
        clientDTO.setLastName(client.getLastName());
        clientDTO.setEmail(client.getEmail());
        clientDTO.setPhone(client.getPhone());
        clientDTO.setPassword(client.getPassword());
        clientDTO.setCity(client.getCity());
        return clientDTO;
    }

    public Client toEntity(ClientDTO clientDTO) {
        if (clientDTO == null) {
            return null;
        }

        Client client = new Client();
        client.setId(clientDTO.getId());
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setEmail(clientDTO.getEmail());
        client.setPhone(clientDTO.getPhone());
        client.setPassword(clientDTO.getPassword());
        client.setCity(clientDTO.getCity());
        return client;
    }

    public void updateEntityFromDTO(ClientDTO clientDTO, Client client) {
        if (clientDTO.getFirstName() != null) {
            client.setFirstName(clientDTO.getFirstName());
        }
        if (clientDTO.getLastName() != null) {
            client.setLastName(clientDTO.getLastName());
        }
        if (clientDTO.getEmail() != null) {
            client.setEmail(clientDTO.getEmail());
        }
        if (clientDTO.getPhone() != null) {
            client.setPhone(clientDTO.getPhone());
        }
        if (clientDTO.getPassword() != null) {
            client.setPassword(clientDTO.getPassword());
        }
        if (clientDTO.getCity() != null) {
            client.setCity(clientDTO.getCity());
        }
    }
}
