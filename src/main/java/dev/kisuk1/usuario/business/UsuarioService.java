package dev.kisuk1.usuario.business;

import dev.kisuk1.usuario.business.Mappers.UsuarioMapper;
import dev.kisuk1.usuario.business.dto.UsuarioDTO;
import dev.kisuk1.usuario.infrastructure.entity.Usuario;
import dev.kisuk1.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.paraUsuario(usuarioDTO);
        return usuarioMapper.paraUsuarioDTO(
                usuarioRepository.save(usuario)
        );
    }
}
