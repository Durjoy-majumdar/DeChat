package jq3;

import android.util.LongSparseArray;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.lang.ref.WeakReference;

/* renamed from: jq3.q */
public final class C9508q {

    /* renamed from: a */
    public final int f29680a;

    /* renamed from: b */
    public int f29681b;

    /* renamed from: c */
    public int f29682c;

    /* renamed from: d */
    public int f29683d;

    /* renamed from: e */
    public int f29684e;

    /* renamed from: f */
    public int f29685f;

    /* renamed from: g */
    public int f29686g;

    /* renamed from: h */
    public boolean f29687h;

    /* renamed from: i */
    public boolean f29688i;

    /* renamed from: j */
    public LongSparseArray<C33631s> f29689j;

    /* renamed from: k */
    public WeakReference<WxRecyclerAdapter<?>> f29690k;

    public C9508q() {
        this(0, 0, 0);
    }

    /* renamed from: a */
    public final WeakReference<WxRecyclerAdapter<?>> mo10194a() {
        return this.f29690k;
    }

    /* renamed from: b */
    public final boolean mo10195b() {
        return this.f29688i;
    }

    /* renamed from: c */
    public final void mo10196c(boolean z) {
        this.f29688i = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9508q)) {
            return false;
        }
        C9508q qVar = (C9508q) obj;
        return this.f29680a == qVar.f29680a && this.f29681b == qVar.f29681b && this.f29682c == qVar.f29682c;
    }

    public int hashCode() {
        return (((this.f29680a * 31) + this.f29681b) * 31) + this.f29682c;
    }

    public String toString() {
        return "WxItemShowInfo(spanIndex=" + this.f29680a + ", width=" + this.f29681b + ", height=" + this.f29682c + ')';
    }

    public C9508q(int i, int i2, int i3) {
        this.f29680a = i;
        this.f29681b = i2;
        this.f29682c = i3;
    }
}
