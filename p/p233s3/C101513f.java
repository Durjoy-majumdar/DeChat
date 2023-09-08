package p233s3;

/* renamed from: s3.f */
public final class C101513f extends C101512e {

    /* renamed from: f */
    public final long f297232f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101513f(long r11, long r13, long r15, long r17, boolean r19, java.util.List<p233s3.C13617q> r20) {
        /*
            r10 = this;
            java.lang.String r0 = "states"
            r9 = r20
            gy3.C87412m.m108594g(r9, r0)
            r1 = r10
            r2 = r11
            r4 = r13
            r6 = r15
            r8 = r19
            r1.<init>(r2, r4, r6, r8, r9)
            r0 = r10
            r1 = r17
            r0.f297232f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p233s3.C101513f.<init>(long, long, long, long, boolean, java.util.List):void");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C101513f) && super.equals(obj) && this.f297232f == ((C101513f) obj).f297232f;
    }

    public int hashCode() {
        long j = this.f297232f;
        return (super.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f297227a + ", frameDurationUiNanos=" + this.f297228b + ", frameDurationCpuNanos=" + this.f297231e + ", frameOverrunNanos=" + this.f297232f + ", isJank=" + this.f297229c + ", states=" + this.f297230d + ')';
    }
}
