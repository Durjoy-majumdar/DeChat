package p858ng;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import p855lg.C61278a;

/* renamed from: ng.w */
public final class C61728w extends BaseStateAction {

    /* renamed from: a */
    public final C61278a f175438a;

    /* renamed from: b */
    public final int f175439b;

    /* renamed from: ng.w$a */
    public enum C61729a {
        Gallery
    }

    public C61728w(C61729a aVar, C61278a aVar2, int i) {
        C87412m.m108594g(aVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(aVar2, "item");
        this.f175438a = aVar2;
        this.f175439b = i;
    }
}
