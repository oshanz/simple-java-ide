/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmjd.java.ide;

import java.io.File;
import javax.swing.JTextPane;
import javax.swing.text.StyleContext;
import javax.swing.undo.UndoManager;

/**
 *
 * @author oshanz
 */
public class TabModel {

    private File file;
    private JTextPane jTextPane;
    private UndoManager undoManager;
    private boolean saved;
    private StyleContext sc;

    public TabModel(File file, JTextPane jTextPane, UndoManager undoManager, boolean saved, StyleContext sc) {
        this.file = file;
        this.jTextPane = jTextPane;
        this.undoManager = undoManager;
        this.saved = saved;
        this.sc = sc;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the jTextArea
     */
    public JTextPane getjTextPane() {
        return jTextPane;
    }

    /**
     * @param jTextArea the jTextArea to set
     */
    public void setjTextPane(JTextPane jTextArea) {
        this.jTextPane = jTextArea;
    }

    /**
     * @return the undoManager
     */
    public UndoManager getUndoManager() {
        return undoManager;
    }

    /**
     * @param undoManager the undoManager to set
     */
    public void setUndoManager(UndoManager undoManager) {
        this.undoManager = undoManager;
    }

    /**
     * @return the saved
     */
    public boolean isSaved() {
        return saved;
    }

    /**
     * @param saved the saved to set
     */
    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    /**
     * @return the sc
     */
    public StyleContext getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(StyleContext sc) {
        this.sc = sc;
    }
}
