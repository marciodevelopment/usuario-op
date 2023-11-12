package br.org.curitiba.ici.saude.usuario.usuario.web;

import br.org.curitiba.ici.saude.usuario.usuario.entity.type.SexoType;
import br.org.curitiba.ici.saude.usuario.usuario.web.request.UsuarioNovoRequest;
import br.org.curitiba.ici.saude.usuario.usuario.web.response.UsuarioResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

  @ResponseStatus(value = HttpStatus.CREATED)
  @PostMapping
  public Integer salvar(@RequestBody @Valid UsuarioNovoRequest request) {
   return 1;
  }

  @GetMapping(path = "/{id}")
  public UsuarioResponse buscarPorId(@NotNull @PathVariable("id") Integer id) {
    UsuarioResponse response = new UsuarioResponse();
    response.setCdUsuario(1);
    response.setNmUsuario("Carlos");
    response.setSexo(SexoType.MASCULINO);
    response.setNmMae("carla santos");
    return response;
  }

}
