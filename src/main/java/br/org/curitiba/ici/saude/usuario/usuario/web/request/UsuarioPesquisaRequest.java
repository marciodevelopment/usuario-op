package br.org.curitiba.ici.saude.usuario.usuario.web.request;


import br.org.curitiba.ici.saude.usuario.usuario.entity.type.SexoType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioPesquisaRequest {
  private Integer cdUsuario;
  private String nmUsuario;
  private String nmMae;
  private SexoType sexo;
  private String nrCpf;
}
