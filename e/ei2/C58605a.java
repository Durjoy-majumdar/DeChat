package ei2;

import android.graphics.Bitmap;
import gy3.C87412m;

/* renamed from: ei2.a */
public final class C58605a {

    /* renamed from: a */
    public final Bitmap f167792a;

    /* renamed from: b */
    public final long f167793b;

    public C58605a(Bitmap bitmap, long j) {
        C87412m.m108594g(bitmap, "bitmap");
        this.f167792a = bitmap;
        this.f167793b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58605a)) {
            return false;
        }
        C58605a aVar = (C58605a) obj;
        return C87412m.m108589b(this.f167792a, aVar.f167792a) && this.f167793b == aVar.f167793b;
    }

    public int hashCode() {
        long j = this.f167793b;
        return (this.f167792a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FrameInfo(bitmap=" + this.f167792a + ", frameDuration=" + this.f167793b + ')';
    }
}
