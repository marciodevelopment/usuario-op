package br.org.curitiba.ici.saude.usuario.usuario.web.response;


import br.org.curitiba.ici.saude.usuario.usuario.entity.type.SexoType;
import java.time.LocalDate;
import lombok.Data;

@Data
public class UsuarioResponse {
  private Integer cdUsuario;
  private String nmUsuario;
  private String nmMae;
  private LocalDate dtNascimento;
  private SexoType sexo;
  private String nmSocial;
  private String nmPai;
  private String nrCpf;
  private LocalDate dtEmissaoCpf;
  private Integer cdCidadeNascimento;
}
