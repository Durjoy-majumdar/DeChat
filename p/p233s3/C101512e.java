package p233s3;

import gy3.C87412m;
import java.util.List;

/* renamed from: s3.e */
public class C101512e extends C101511d {

    /* renamed from: e */
    public final long f297231e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101512e(long j, long j2, long j3, boolean z, List<C13617q> list) {
        super(j, j2, z, list);
        C87412m.m108594g(list, "states");
        this.f297231e = j3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C101512e) && super.equals(obj) && this.f297231e == ((C101512e) obj).f297231e;
    }

    public int hashCode() {
        long j = this.f297231e;
        return (super.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f297227a + ", frameDurationUiNanos=" + this.f297228b + ", frameDurationCpuNanos=" + this.f297231e + ", isJank=" + this.f297229c + ", states=" + this.f297230d + ')';
    }
}
