package qs0;

import android.content.Context;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import in0.C21108a;
import in0.C21113g;
import in0.C87761e;
import ns0.C89083d;
import ns0.C89084e;
import qs0.C101242d;
import rx3.C13603j;

/* renamed from: qs0.c */
public final class C89832c implements C89083d {

    /* renamed from: a */
    public final /* synthetic */ Handler f258244a;

    /* renamed from: qs0.c$a */
    public static final class C89833a extends C87413o implements C32224a<C21108a> {

        /* renamed from: d */
        public final /* synthetic */ Handler f258245d;

        /* renamed from: e */
        public final /* synthetic */ C89084e f258246e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89833a(Handler handler, C89084e eVar) {
            super(0);
            this.f258245d = handler;
            this.f258246e = eVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, AppBrandThumbMediaPlayer");
            C101242d.C89834a aVar = C101242d.f296447G;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C101242d b = C101242d.C89834a.m112326b(aVar, context, this.f258245d.getLooper(), false, this.f258246e, 4, (Object) null);
            if (b != null) {
                return b;
            }
            Log.m105924i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
            return new C21113g();
        }
    }

    public C89832c(Handler handler) {
        this.f258244a = handler;
    }

    /* renamed from: a */
    public final C87761e mo123095a(C89084e eVar) {
        C87412m.m108594g(eVar, "dataSource");
        C89833a aVar = new C89833a(this.f258244a, eVar);
        if (eVar instanceof C89084e.C89088b) {
            return (C87761e) aVar.invoke();
        }
        if (!(eVar instanceof C89084e.C89089c)) {
            throw new C13603j();
        } else if (!((C89084e.C89089c) eVar).f256751e && !C87412m.m108589b("chunked", eVar.f256742b)) {
            return (C21108a) aVar.invoke();
        } else {
            return null;
        }
    }
}
