package androidx.camera.core.impl.utils;

import java.io.Serializable;
import p329d3.C116555h;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m154409of(T t) {
        t.getClass();
        return new Present(t);
    }

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo164722or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo164723or(C116555h<? extends T> hVar);

    /* renamed from: or */
    public abstract T mo164724or(T t);

    public abstract T orNull();

    public abstract String toString();
}
