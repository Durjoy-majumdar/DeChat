package androidx.camera.core.impl.utils;

import p329d3.C116555h;
import p329d3.C20434g;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    public Present(T t) {
        this.mReference = t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.mReference.equals(((Present) obj).mReference);
        }
        return false;
    }

    public T get() {
        return this.mReference;
    }

    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public T mo164724or(T t) {
        C20434g.m22020d(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    public T orNull() {
        return this.mReference;
    }

    public String toString() {
        return "Optional.of(" + this.mReference + ")";
    }

    /* renamed from: or */
    public Optional<T> mo164722or(Optional<? extends T> optional) {
        optional.getClass();
        return this;
    }

    /* renamed from: or */
    public T mo164723or(C116555h<? extends T> hVar) {
        hVar.getClass();
        return this.mReference;
    }
}
