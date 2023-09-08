package p233s3;

import gy3.C87412m;
import java.util.List;

/* renamed from: s3.d */
public class C101511d {

    /* renamed from: a */
    public final long f297227a;

    /* renamed from: b */
    public final long f297228b;

    /* renamed from: c */
    public final boolean f297229c;

    /* renamed from: d */
    public final List<C13617q> f297230d;

    public C101511d(long j, long j2, boolean z, List<C13617q> list) {
        C87412m.m108594g(list, "states");
        this.f297227a = j;
        this.f297228b = j2;
        this.f297229c = z;
        this.f297230d = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        C101511d dVar = (C101511d) obj;
        return this.f297227a == dVar.f297227a && this.f297228b == dVar.f297228b && this.f297229c == dVar.f297229c && C87412m.m108589b(this.f297230d, dVar.f297230d);
    }

    public int hashCode() {
        long j = this.f297227a;
        long j2 = this.f297228b;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f297229c ? 1231 : 1237)) * 31) + this.f297230d.hashCode();
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f297227a + ", frameDurationUiNanos=" + this.f297228b + ", isJank=" + this.f297229c + ", states=" + this.f297230d + ')';
    }
}
