package edu.project4.transformation;

import edu.project4.entity.Point;
import java.awt.Color;

public class AffineGenerator implements Transformation {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final Color color;

    public AffineGenerator(double a, double b, double c, double d, double e, double f, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.color = color;
    }

    @Override
    public Point apply(Point point) {
        double newX = a * point.x() + b * point.y() + c;
        double newY = d * point.x() + e * point.y() + f;

        return new Point(newX, newY);
    }

    public Color getColor() {
        return color;
    }
}
