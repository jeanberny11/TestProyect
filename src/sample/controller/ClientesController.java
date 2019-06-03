package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.models.Clientes;
import sample.repository.ClientesRepository;


import java.net.URL;
import java.util.ResourceBundle;

public class ClientesController extends AnchorPane implements Initializable{
    @FXML
    private TextField txtclienteid;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtdireccion;
    @FXML
    private TextField txttelefono;
    @FXML
    private TextField txtcedula;
    @FXML
    private CheckBox chactivo;
    @FXML
    private Button btnsalvar;

    @FXML
    void btnsalvarclick(MouseEvent event) {
        cliente.setNombre(txtnombre.getText());
        cliente.setDireccion(txtdireccion.getText());
        cliente.setTelefono(txttelefono.getText());
        cliente.setCedula(txtcedula.getText());
        cliente.setActivo(chactivo.isSelected());

        try {
            repository.crearclientes(cliente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Clientes cliente;
    private ClientesRepository repository;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cliente=new Clientes();
        repository=new ClientesRepository();


    }
}
