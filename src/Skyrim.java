
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;


public class Skyrim extends Application {
    public void start (Stage stage) {
        String path = "/home/connor/projects/skyrim/resources/style.css";
        File f = new File(path);
        VBox box = new VBox();
        Scene scene = new Scene(box);
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
        stage.setMaxWidth(640);
        stage.setMaxHeight(480);
        stage.setTitle("Skyrim Generator");
        Button generate = new Button("Generate Character");
        TextArea text = new TextArea();
        generate.setOnAction(handle -> {
                int result = (int) (Math.random()*(10000) + 1000);
                int temp = 0;
                String race = "", faction = "", playstyle = "", follower = "";
                temp = result % 10;
                switch (temp) {
                case 0 : race = "Breton";
                    break;
                case 1 : race = "Bosmer";
                    break;
                case 2 : race = "Redguard";
                    break;
                case 3 : race = "Argonian";
                    break;
                case 4 : race = "Orc";
                    break;
                case 5 : race = "Altmer";
                    break;
                case 6 : race = "Khajiit";
                    break;
                case 7 : race = "Imperial";
                    break;
                case 8 : race = "Nord";
                    break;
                case 9 : race = "Dunmer";
                    break;
                }
                result /= 10;
                temp = result % 10;
                switch (temp) {
                case 0: faction = "The Companions";
                    break;
                case 1: faction = "Mage's College";
                    break;
                case 2: faction = "Dark Brotherhood";
                    break;
                case 3: faction = "Thieve's Guild";
                    break;
                case 4: faction = "Dawnguard";
                    break;
                case 5: faction = "Vampire";
                    break;
                case 6: faction = "Blade";
                    break;
                case 7: faction = "Imperial Army";
                    break;
                case 8: faction = "Stormcloaks";
                    break;
                case 9: faction = "Bard's College";
                    break;
                }
                result /= 10;
                temp = result % 10;
                switch (temp) {
                case 0: playstyle = "Wizard";
                    break;
                case 1: playstyle = "Knight";
                    break;
                case 2: playstyle = "Ranger";
                    break;
                case 3: playstyle = "Barbarian";
                    break;
                case 4: playstyle = "Spellsword";
                    break;
                case 5: playstyle = "Shaman";
                    break;
                case 6: playstyle = "Necromancer / Warlock";
                    break;
                case 7: playstyle = "Assassin";
                    break;
                case 8: playstyle = "Paladin";
                    break;
                case 9: playstyle = "Bard";
                    break;
                }
                result /= 10;
                temp = result % 10;
                switch (temp) {
                case 0: follower = "Same class as you";
                    break;
                case 1: follower = "Wizard";
                    break;
                case 2: follower = "Knight";
                    break;
                case 3: follower = "Ranger";
                    break;
                case 4: follower = "Barbarian";
                    break;
                case 5: follower = "Spellsword";
                    break;
                case 6: follower = "Same race as you";
                    break;
                case 7: follower = "Argonian";
                    break;
                case 8: follower = "Khajiit";
                    break;
                case 9: follower = "Lydia";
                    break;
                }
                text.setText("Race: " + race + "\n" + "Faction: " + faction + "\n" + "Playstyle: " + playstyle + "\n" + "Follower: " + follower);
            });
        box.getChildren().add(generate);
        box.getChildren().add(text);
        box.setAlignment(Pos.CENTER);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}
