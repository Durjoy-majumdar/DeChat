package tm3;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: tm3.l */
public final class C78062l extends BaseStateAction {

    /* renamed from: a */
    public final boolean f228804a;

    /* renamed from: b */
    public final String f228805b;

    /* renamed from: c */
    public final C32224a<C13598b0> f228806c;

    public C78062l(boolean z, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "searchContent");
        C87412m.m108594g(aVar, "stopSearch");
        this.f228804a = z;
        this.f228805b = str;
        this.f228806c = aVar;
    }
}
