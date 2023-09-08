package com.google.firebase.components;

public final class Dependency {

    /* renamed from: a */
    public final Class<?> f339211a;

    /* renamed from: b */
    public final int f339212b;

    /* renamed from: c */
    public final int f339213c;

    public Dependency(Class<?> cls, int i, int i2) {
        if (cls != null) {
            this.f339211a = cls;
            this.f339212b = i;
            this.f339213c = i2;
            return;
        }
        throw new NullPointerException("Null dependency interface.");
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            return this.f339211a == dependency.f339211a && this.f339212b == dependency.f339212b && this.f339213c == dependency.f339213c;
        }
    }

    public final int hashCode() {
        return ((((this.f339211a.hashCode() ^ 1000003) * 1000003) ^ this.f339212b) * 1000003) ^ this.f339213c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{interface=");
        sb.append(this.f339211a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f339212b == 1);
        sb.append(", direct=");
        if (this.f339213c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
