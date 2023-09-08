package ka3;

import android.graphics.Bitmap;
import gy3.C87412m;
import java.nio.Buffer;

/* renamed from: ka3.a */
public final class C60985a {

    /* renamed from: a */
    public final Bitmap f173691a;

    /* renamed from: b */
    public final Buffer f173692b;

    public C60985a(Bitmap bitmap, Buffer buffer) {
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(buffer, "buffer");
        this.f173691a = bitmap;
        this.f173692b = buffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60985a)) {
            return false;
        }
        C60985a aVar = (C60985a) obj;
        return C87412m.m108589b(this.f173691a, aVar.f173691a) && C87412m.m108589b(this.f173692b, aVar.f173692b);
    }

    public int hashCode() {
        return (this.f173691a.hashCode() * 31) + this.f173692b.hashCode();
    }

    public String toString() {
        return "BufferResult(bitmap=" + this.f173691a + ", buffer=" + this.f173692b + ')';
    }
}
