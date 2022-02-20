package net.happyn.happynet.event;

public class LogChangeEvent {

    private final String txtPath;
    public LogChangeEvent(String txtPath){
        this.txtPath = txtPath;
    }

    public String getTxtPath() {
        return txtPath;
    }
}
