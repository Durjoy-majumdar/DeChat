package com.tencent.p014mm.sns_compose.page;

import android.content.Context;
import androidx.paging.compose.C54222c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kh3.C61095a;
import lh3.C99474g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.sns_compose.page.i */
public final class C57572i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f164861d;

    /* renamed from: e */
    public final /* synthetic */ C99474g f164862e;

    /* renamed from: f */
    public final /* synthetic */ C54222c<C99474g> f164863f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57572i(Context context, C99474g gVar, C54222c<C99474g> cVar) {
        super(0);
        this.f164861d = context;
        this.f164862e = gVar;
        this.f164863f = cVar;
    }

    public Object invoke() {
        C61095a aVar = C61095a.f173960a;
        Context context = this.f164861d;
        int i = this.f164862e.f291656e;
        boolean equals = aVar.mo86026o().equals(this.f164862e.f291652a);
        String str = ((C99474g.C99481g) this.f164862e).f291672l.f298689d;
        C87412m.m108593f(str, "item.media.Id");
        aVar.mo86013d(context, i, equals, C106602c.m143959m(str, this.f164863f));
        return C13598b0.f38549a;
    }
}
