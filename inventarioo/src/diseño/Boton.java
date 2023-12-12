package diseño;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class Boton extends JButton {

    public Boton(){
        // init color
        Color aux = new Color(255,185,29);
        setColor(aux);
        //  coloOVer = new Color(179,250,160);
        setContentAreaFilled(false);
    }
    
    private boolean over;
    private Color color;
    private Color coloOVer;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColoOVer() {
        return coloOVer;
    }

    public void setColoOVer(Color coloOVer) {
        this.coloOVer = coloOVer;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
    Graphics2D g2=(Graphics2D)grphcs;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    // Paint bordes
    g2.setColor(borderColor);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
    g2.setColor(getBackground());
    // Border set 2 pix
    g2.fillRoundRect(2, 2, getWidth() -4, getHeight() -4 , radius, radius);
    super.paintComponent(grphcs);
    }
}


 
