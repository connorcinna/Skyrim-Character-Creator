import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Skyrim extends Application {
    public void start (Stage stage) {
        VBox box = new VBox();
        Scene scene = new Scene(box);
        stage.setMaxWidth(640);
        stage.setMaxHeight(480);
        stage.setTitle("Skyrim Generator");
        Button generate = new Button("Generate a character");
        generate.setOnAction(handle -> {
                int result = (int) Math.random()*10000;
                int temp = 0;
                String race = "", faction = "", playstyle = "", follower = "";
                while (result > 0) {
                    temp = result % 10;
                    switch (temp) {
                    case 0 : race = "Breton";
                    case 1 : race = "Bosmer";
                    case 2 : race = "Redguard";
                    case 3 : race = "Argonian";
                    case 4 : race = "Orc";
                    case 5 : race = "Altmer";
                    case 6 : race = "Khajiit";
                    case 7 : race = "Imperial";
                    case 8 : race = "Nord";
                    case 9 : race = "Dunmer";
                    }
                    result /= 10;
                    temp = result % 10;
                    switch (temp) {
                    case 0: faction = "The Companions";
                    case 1: faction = "Mage's College";
                    case 2: faction = "Dark Brotherhood";
                    case 3: faction = "Thieve's Guild";
                    case 4: faction = "Dawnguard";
                    case 5: faction = "Vampire";
                    case 6: faction = "Blade";
                    case 7: faction = "Imperial Army";
                    case 8: faction = "Stormcloaks";
                    case 9: faction = "Bard's College";
                    }
                    result /= 10;
                    temp = result % 10;
                    switch (temp) {
                    case 0: playstyle = "Wizard";
                    case 1: playstyle = "Knight";
                    case 2: playstyle = "Ranger";
                    case 3: playstyle = "Barbarian";
                    case 4: playstyle = "Spellsword";
                    case 5: playstyle = "Shaman";
                    case 6: playstyle = "Necromancer / Warlock";
                    case 7: playstyle = "Assassin";
                    case 8: playstyle = "Paladin";
                    case 9: playstyle = "Bard";
                    }
                    result /= 10;
                    temp = result % 10;
                    switch (temp) {
                    case 0: follower = "Same class as you";
                    case 1: follower = "Wizard";
                    case 2: follower = "Knight";
                    case 3: follower = "Ranger";
                    case 4: follower = "Barbarian";
                    case 5: follower = "Spellsword";
                    case 6: follower = "Same race as you";
                    case 7: follower = "Argonian";
                    case 8: follower = "Khajiit";
                    case 9: follower = "Lydia";
                    }
                }
                TextArea text = new TextArea(race + " " + faction + " " + playstyle + " " + follower);
                box.getChildren().add(text);
                box.getChildren().add(generate);
            });
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}
