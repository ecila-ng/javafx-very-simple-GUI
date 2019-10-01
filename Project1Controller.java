/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.util.Collections;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Text;


/**
 * FXML Controller class
 *
 * @author baotr
 */
public class Project1Controller implements Initializable {

    @FXML
    private Button circleButton;
    Circle circle = new Circle();

    @FXML
    private Button squareButton;
    Rectangle square = new Rectangle();
    
    @FXML
    private Button rectButton;
    Rectangle rect = new Rectangle();
    
    @FXML
    private AnchorPane pane;
    
    @FXML
    private Button circleGradButton;
    
    @FXML
    private Button squareGradButton;
    
    @FXML
    private Button rectGradButton;
    
    @FXML
    private Button resetButton;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void drawCircle(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        
        //if the user clicks the circle button
        if (clicked == circleButton) { //if the user clicks the circle button
           circle.setRadius(30);
           circle.setCenterX(250);
           circle.setCenterY(50);
           pane.getChildren().add(circle);
        }
    }
    
    @FXML
    void circleGradient(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        if (clicked == circleGradButton) {
           Stop[] gradientStop = new Stop[]{
                          new Stop(0, Color.RED),
                          new Stop(1, Color.WHITE)};
           LinearGradient lc = new LinearGradient(
                           0,0,1,0,true,CycleMethod.NO_CYCLE,gradientStop);
           circle.setFill(lc);
           pane.getChildren().add(circle);}
    }
    
    @FXML
    void drawSquare(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        
        //if the user clicks the circle button
        if (clicked == squareButton) { //if the user clicks the circle button
           square.setX(300);
           square.setY(25);
           square.setWidth(50);
           square.setHeight(50);
           
           pane.getChildren().add(square);
        }
    }
    
    @FXML
    void squareGradient(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        if (clicked == squareGradButton) {
           Stop[] gradientStop = new Stop[]{
                          new Stop(0, Color.MAGENTA),
                          new Stop(1, Color.WHITE)};
           LinearGradient lc = new LinearGradient(
                           0,0,1,0,true,CycleMethod.NO_CYCLE,gradientStop);
           square.setFill(lc);
           pane.getChildren().add(square);}
    }
    
    @FXML
    void drawRect(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        
        //if the user clicks the circle button
        if (clicked == rectButton) { //if the user clicks the circle button
           rect.setX(375);
           rect.setY(25);
           rect.setWidth(100);
           rect.setHeight(50);
           pane.getChildren().add(rect);
        }
    }
    
    @FXML
    void rectGradient(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        if (clicked == rectGradButton) {
           Stop[] gradientStop = new Stop[]{
                          new Stop(0, Color.YELLOW),
                          new Stop(1, Color.WHITE)};
           LinearGradient lc = new LinearGradient(
                           0,0,1,0,true,CycleMethod.NO_CYCLE,gradientStop);
           rect.setFill(lc);
           pane.getChildren().add(rect);}
    }
    
    @FXML
    void reset(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        
        if (clicked == resetButton){
        pane.getChildren().remove(circle);
        pane.getChildren().remove(square);
        pane.getChildren().remove(rect);
        }
    }
}
