package com.tencent.tencentmap.mapsdk.maps.model.transform;

public class Point {

    /* renamed from: x */
    public final double f349191x;

    /* renamed from: y */
    public final double f349192y;

    public Point(double d, double d2) {
        this.f349191x = d;
        this.f349192y = d2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.f349191x == point.f349191x && this.f349192y == point.f349192y;
    }

    public String toString() {
        return "Point{x=" + this.f349191x + ", y=" + this.f349192y + '}';
    }
}
