package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComentarioMapper {
    void comentarUnaIniciativa(@Param("comentario") Comentario var1);

    void eliminarComentario(@Param("autor") Usuario var1, @Param("iniciativa") Iniciativa var2);

    List<Comentario> consultarComentarios(@Param("iniciativa") Iniciativa var1);
}