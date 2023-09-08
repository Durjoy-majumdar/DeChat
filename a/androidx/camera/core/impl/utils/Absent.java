package androidx.camera.core.impl.utils;

import p329d3.C116555h;
import p329d3.C20434g;

final class Absent<T> extends Optional<T> {
    public static final Absent<Object> sInstance = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return sInstance;
    }

    public static <T> Optional<T> withType() {
        return sInstance;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public T mo164724or(T t) {
        C20434g.m22020d(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    /* renamed from: or */
    public T mo164723or(C116555h<? extends T> hVar) {
        T t = hVar.get();
        C20434g.m22020d(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }

    /* renamed from: or */
    public Optional<T> mo164722or(Optional<? extends T> optional) {
        optional.getClass();
        return optional;
    }
}
