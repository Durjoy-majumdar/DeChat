package tm3;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: tm3.n */
public final class C64958n extends BaseStateAction {

    /* renamed from: a */
    public final String f187040a;

    /* renamed from: b */
    public final String f187041b;

    /* renamed from: c */
    public final C32224a<C13598b0> f187042c;

    public C64958n(String str, String str2, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "searchId");
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(aVar, "stopSearch");
        this.f187040a = str;
        this.f187041b = str2;
        this.f187042c = aVar;
    }
}
