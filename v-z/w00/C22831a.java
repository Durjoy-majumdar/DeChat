package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;

/* renamed from: w00.a */
public final class C22831a extends BaseStateAction {

    /* renamed from: a */
    public final String f65639a;

    /* renamed from: b */
    public final long f65640b;

    /* renamed from: c */
    public final boolean f65641c;

    /* renamed from: d */
    public final boolean f65642d;

    /* renamed from: e */
    public final boolean f65643e;

    public C22831a(String str, long j, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f65639a = str;
        this.f65640b = j;
        this.f65641c = z;
        this.f65642d = z2;
        this.f65643e = z3;
    }
}
