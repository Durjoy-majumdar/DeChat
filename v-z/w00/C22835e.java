package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import te3.C52241zb0;

/* renamed from: w00.e */
public final class C22835e extends BaseStateAction {

    /* renamed from: a */
    public final String f65656a;

    /* renamed from: b */
    public final int f65657b;

    /* renamed from: c */
    public final C52241zb0 f65658c;

    /* renamed from: d */
    public final int f65659d;

    /* renamed from: e */
    public final int f65660e;

    public C22835e(String str, long j, int i, C52241zb0 zb02, int i2, int i3) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(zb02, "sugItem");
        this.f65656a = str;
        this.f65657b = i;
        this.f65658c = zb02;
        this.f65659d = i2;
        this.f65660e = i3;
    }
}
