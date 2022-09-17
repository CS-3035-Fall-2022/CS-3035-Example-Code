module cs3035unb.cs3035examplecode {
    requires javafx.controls;
    requires javafx.fxml;

    exports cs3035unb.cs3035examplecode.HelloWorld;
    exports cs3035unb.cs3035examplecode.HelloWorldFXML;
    opens cs3035unb.cs3035examplecode.HelloWorldFXML to javafx.fxml;
    exports cs3035unb.cs3035examplecode.PushCounter;
}
