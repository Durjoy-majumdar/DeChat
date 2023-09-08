package w00;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;

/* renamed from: w00.j */
public final class C22840j extends BaseStateAction {

    /* renamed from: a */
    public final long f65666a;

    /* renamed from: b */
    public final String f65667b;

    /* renamed from: c */
    public final boolean f65668c;

    public C22840j(long j, String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f65666a = j;
        this.f65667b = str;
        this.f65668c = z;
    }
}
