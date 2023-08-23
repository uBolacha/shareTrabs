package br.com.senac.view;

import br.com.senac.dao.categoriaDAO;
import br.com.senac.model.CategoriaModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCategoria {
    private JLabel JLtitulo;
    private JTextField JTFdescricao;
    private JLabel JLdescricao;
    private JButton cadastrarButton;
    private JPanel JPcadastro;



    public ViewCategoria() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoriaModel categoriaModel = new CategoriaModel();
                categoriaModel.setDescricao(JTFdescricao.getText());

                categoriaDAO categoriaDAO = new categoriaDAO();
                categoriaDAO.salvar(categoriaModel);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ViewCategoria");
        frame.setContentPane(new ViewCategoria().JPcadastro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
