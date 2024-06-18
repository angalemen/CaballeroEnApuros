package com.example.caballeroenapurosconexioapi.Controladores;
import com.example.caballeroenapurosconexioapi.Entidades.Jugador;
import com.example.caballeroenapurosconexioapi.Repositorios.JugadorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JugadorController {

    @GetMapping("/jugador")
    public Jugador getJugador() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/static/datos.json");
        return mapper.readValue(file, Jugador.class);
    }

    @PostMapping("/jugador")
    public void saveJugador(@RequestBody Jugador jugador) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/static/datos.json");
        mapper.writeValue(file, jugador);
    }

}
