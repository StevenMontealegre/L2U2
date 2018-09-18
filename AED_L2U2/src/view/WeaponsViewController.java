package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Weapon;

public class WeaponsViewController implements Initializable   {

	
	private Main main;
	
	@FXML 
	private TextField capacityTxt;

	@FXML 
	private TextField colorTxt;
	@FXML 
	private TextField leftTxt;
	
	
	@FXML 
	private Button useBut;
	@FXML 
	private Button catchBut;
	@FXML
	private Button nextBut;
	@FXML
	private ImageView weaponImage;
	@FXML 
	private ImageView image;
	@FXML 	
	private ListView<Image> listV;
	@FXML 
	private Label availTxt;
	
	
	@FXML
	private void getNextWeapon()
	{
		System.out.println("jaaja");
		Image i = new Image("1.png");
		weaponImage.setImage(i);
	}

	
	
	@FXML
	private void useWeapon()
	{
		
	}
	
	@FXML
	private void addElement()
	{
		System.out.println("casu");
		ObservableList names = FXCollections.observableArrayList();
	
		String[] n = main.showWeaponsNames();
		System.out.println(n[0]);
		
		for (int i = 0; i<n.length;i++)
		{
			names.add(n[i]);
		}
		

		listV.setItems(names);
	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("casu");
		//listV.setItems(weaponList);
	}
}


	

	
	
	
	
	
	
	
	

