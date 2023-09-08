package p848dk;

import android.graphics.Point;

/* renamed from: dk.h */
public final class C58306h {

    /* renamed from: a */
    public final long f166948a;

    /* renamed from: b */
    public final Point f166949b;

    /* renamed from: c */
    public final int f166950c;

    /* renamed from: d */
    public float f166951d = 0.0f;

    /* renamed from: e */
    public float f166952e = 0.0f;

    public C58306h(long j, Point point, int i) {
        this.f166948a = j;
        this.f166949b = point;
        this.f166950c = i;
    }

    public String toString() {
        return "TouchPoint{mTime=" + this.f166948a + ", mTargetLeft=" + this.f166951d + ", mTargetTop=" + this.f166952e + ", mPoint=" + this.f166949b + ", mDistanceOfError=" + this.f166950c + '}';
    }
}
