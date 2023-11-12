package br.org.curitiba.ici.saude.usuario.usuario.entity.type;



import lombok.Getter;

@Getter
public enum SexoType {
  MASCULINO(1, "Masculino"), FEMININO(2, "Feminino");

  private Integer id;
  private String description;

  SexoType(Integer id, String description) {
    this.id = id;
    this.description = description;
  }

  public static SexoType toType(Integer id) {
    //return EnumUtil.toType(id, SexoType.class);
    return null;
  }
}
