package dev.kisuk1.usuario.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TelefoneDTO {
    private String ddd;
    private String numero;
}
