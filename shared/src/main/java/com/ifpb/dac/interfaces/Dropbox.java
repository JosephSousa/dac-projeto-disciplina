package com.ifpb.dac.interfaces;

import com.ifpb.dac.entidades.Material;
import java.io.InputStream;

/**
 *
 * @author rodrigobento
 */
public interface Dropbox {

    void uploadArquivo(Material material);
    void removerArquivo(Material material);

}
