package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videobase.videobase.a */
public final class C17253a {

    /* renamed from: a */
    public final int f46643a;

    /* renamed from: b */
    public final int f46644b;

    /* renamed from: c */
    public final Rotation f46645c;

    /* renamed from: d */
    public final boolean f46646d;

    public C17253a(int i, int i2) {
        this(i, i2, Rotation.NORMAL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17253a)) {
            return false;
        }
        C17253a aVar = (C17253a) obj;
        return aVar.f46643a == this.f46643a && aVar.f46644b == this.f46644b && aVar.f46645c == this.f46645c && aVar.f46646d == this.f46646d;
    }

    public final int hashCode() {
        return (((this.f46643a * 32713) + this.f46644b) << 4) + (this.f46645c.ordinal() << 1) + (this.f46646d ? 1 : 0);
    }

    private C17253a(int i, int i2, Rotation rotation) {
        this.f46643a = i;
        this.f46644b = i2;
        this.f46645c = rotation;
        this.f46646d = false;
    }
}
