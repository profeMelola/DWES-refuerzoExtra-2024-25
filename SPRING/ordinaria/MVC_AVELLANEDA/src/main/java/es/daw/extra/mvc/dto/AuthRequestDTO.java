package es.daw.extra.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthRequestDTO {
    private String username;
    private String password;
}
