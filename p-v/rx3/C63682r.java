package rx3;

import androidx.exifinterface.media.ExifInterface;
import gy3.C87412m;

/* renamed from: rx3.r */
public final class C63682r implements Comparable<C63682r> {

    /* renamed from: d */
    public final byte f180537d;

    public /* synthetic */ C63682r(byte b) {
        this.f180537d = b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return C87412m.m108596i(this.f180537d & ExifInterface.MARKER, ((C63682r) obj).f180537d & ExifInterface.MARKER);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C63682r) && this.f180537d == ((C63682r) obj).f180537d;
    }

    public int hashCode() {
        return this.f180537d;
    }

    public String toString() {
        return String.valueOf(this.f180537d & ExifInterface.MARKER);
    }
}
