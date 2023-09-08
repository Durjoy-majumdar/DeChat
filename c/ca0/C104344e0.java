package ca0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import p436a1.C103272w;
import p560i2.C108325f;
import rx3.C90109v;
import ta0.C110954a;

/* renamed from: ca0.e0 */
public final class C104344e0 {

    /* renamed from: k */
    public static final C104344e0 f308940k;

    /* renamed from: l */
    public static final C104344e0 f308941l;

    /* renamed from: a */
    public final long f308942a;

    /* renamed from: b */
    public final long f308943b;

    /* renamed from: c */
    public final long f308944c;

    /* renamed from: d */
    public final long f308945d;

    /* renamed from: e */
    public final long f308946e;

    /* renamed from: f */
    public final long f308947f;

    /* renamed from: g */
    public final int f308948g;

    /* renamed from: h */
    public final float f308949h;

    /* renamed from: i */
    public final float f308950i;

    /* renamed from: j */
    public final boolean f308951j;

    static {
        float f = (float) 8;
        float f2 = ((float) 2) * f;
        f308940k = new C104344e0(C110954a.m151255c(C0966R.color.a4m, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.a4m, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.a4m, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.UN_BW_0_Alpha_0_3, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.UN_BW_0_Alpha_0_9, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.BW_100_Alpha_0_9, (Context) null, 1, (Object) null), C0966R.raw.icons_filled_music, ((float) 3) * f, f2, true, (C8480h) null);
        f308941l = new C104344e0(C110954a.m151255c(C0966R.color.BW_100_Alpha_0_0_5, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.f2953a_, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.f2952a9, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.BW_100_Alpha_0_5, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.BW_100_Alpha_0_8, (Context) null, 1, (Object) null), C110954a.m151255c(C0966R.color.BW_100_Alpha_0_8, (Context) null, 1, (Object) null), C0966R.raw.icons_filled_music, ((float) 5) * f, f2, false, (C8480h) null);
    }

    public C104344e0(long j, long j2, long j3, long j4, long j5, long j6, int i, float f, float f2, boolean z, C8480h hVar) {
        this.f308942a = j;
        this.f308943b = j2;
        this.f308944c = j3;
        this.f308945d = j4;
        this.f308946e = j5;
        this.f308947f = j6;
        this.f308948g = i;
        this.f308949h = f;
        this.f308950i = f2;
        this.f308951j = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104344e0)) {
            return false;
        }
        C104344e0 e0Var = (C104344e0) obj;
        return C103272w.m136781c(this.f308942a, e0Var.f308942a) && C103272w.m136781c(this.f308943b, e0Var.f308943b) && C103272w.m136781c(this.f308944c, e0Var.f308944c) && C103272w.m136781c(this.f308945d, e0Var.f308945d) && C103272w.m136781c(this.f308946e, e0Var.f308946e) && C103272w.m136781c(this.f308947f, e0Var.f308947f) && this.f308948g == e0Var.f308948g && C108325f.m146734a(this.f308949h, e0Var.f308949h) && C108325f.m146734a(this.f308950i, e0Var.f308950i) && this.f308951j == e0Var.f308951j;
    }

    public int hashCode() {
        long j = this.f308942a;
        int i = C103272w.f304516h;
        int a = ((((((((((((((((C90109v.m112737a(j) * 31) + C90109v.m112737a(this.f308943b)) * 31) + C90109v.m112737a(this.f308944c)) * 31) + C90109v.m112737a(this.f308945d)) * 31) + C90109v.m112737a(this.f308946e)) * 31) + C90109v.m112737a(this.f308947f)) * 31) + this.f308948g) * 31) + Float.floatToIntBits(this.f308949h)) * 31) + Float.floatToIntBits(this.f308950i)) * 31;
        boolean z = this.f308951j;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        return "MusicSelectorTheme(selectorBgColor=" + C103272w.m136787i(this.f308942a) + ", cardBgColor=" + C103272w.m136787i(this.f308943b) + ", cardSelectedBgColor=" + C103272w.m136787i(this.f308944c) + ", soundsAnimationColor=" + C103272w.m136787i(this.f308945d) + ", textColor=" + C103272w.m136787i(this.f308946e) + ", movieOptionColor=" + C103272w.m136787i(this.f308947f) + ", musicIconRes=" + this.f308948g + ", cardEdgePadding=" + C108325f.m146735b(this.f308949h) + ", cardDividerPadding=" + C108325f.m146735b(this.f308950i) + ", showLrc=" + this.f308951j + ')';
    }
}
