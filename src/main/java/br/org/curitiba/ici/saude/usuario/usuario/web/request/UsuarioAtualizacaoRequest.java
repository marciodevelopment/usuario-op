package br.org.curitiba.ici.saude.usuario.usuario.web.request;


import br.org.curitiba.ici.saude.usuario.usuario.entity.type.SexoType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Data
public class UsuarioAtualizacaoRequest {
  @NotEmpty(message = "Nome Usuário")
  private String nmUsuario;
  @NotEmpty(message = "Nome Mãe")
  private String nmMae;
  @NotNull(message = "Data Nascimento")
  @PastOrPresent(message = "Data de Nascimento")
  private LocalDate dtNascimento;
  @NotNull
  private SexoType sexo;
  private String nmSocial;
  private String nmPai;
  @NotNull
  private Integer cdCidadeNascimento;
}
