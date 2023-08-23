package br.com.senac.dao;

import br.com.senac.infra.conexaoMYSQL;
import br.com.senac.model.CategoriaModel;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class categoriaDAO {

    public void salvar(CategoriaModel categoria){
        try{
            conexaoMYSQL conexaoMYSQL = new conexaoMYSQL();
            Connection con = null;
            con=conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("INSERT INTO tb_categoria(descricao) VALUES (?)");
            stmt.setString(1,categoria.getDescricao());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.err.println(e1.getMessage());
        }

    }
}
