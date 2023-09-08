package cm1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60898l;
import rx3.C13598b0;
import tf1.C13914m;

/* renamed from: cm1.g */
public final class C0731g extends C60898l.C60899a implements C13914m {

    /* renamed from: d */
    public CharSequence f1744d;

    /* renamed from: e */
    public int f1745e;

    /* renamed from: f */
    public int f1746f;

    /* renamed from: g */
    public int f1747g;

    /* renamed from: h */
    public C32224a<C13598b0> f1748h;

    public C0731g() {
        this((CharSequence) null, 0, 0, 7, (C8480h) null);
    }

    public C0731g(CharSequence charSequence, int i, int i2, int i3, C8480h hVar) {
        if ((i3 & 1) != 0) {
            charSequence = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
            C87412m.m108593f(charSequence, "getContext().resources.g…ng.finder_touch_to_retry)");
        }
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        C87412m.m108594g(charSequence, "tipStr");
        this.f1744d = charSequence;
        this.f1745e = i;
        this.f1746f = i2;
    }

    /* renamed from: c */
    public int mo75c() {
        return -1;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
