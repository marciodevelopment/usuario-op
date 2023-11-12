package br.org.curitiba.ici.saude.usuario.usuario.web.response;

import br.org.curitiba.ici.saude.usuario.usuario.entity.type.SexoType;
import lombok.Data;

@Data
public class UsuarioPesquisaResponse {
  private Integer cdUsuario;
  private String nmUsuario;
  private String nmMae;
  private SexoType sexo;
  private String nrCpf;
}
