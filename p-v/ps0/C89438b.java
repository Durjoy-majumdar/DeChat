package ps0;

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

/* renamed from: ps0.b */
public final class C89438b implements C89083d {

    /* renamed from: a */
    public final /* synthetic */ Handler f257483a;

    /* renamed from: ps0.b$a */
    public static final class C89439a extends C87413o implements C32224a<C21108a> {

        /* renamed from: d */
        public final /* synthetic */ Handler f257484d;

        /* renamed from: e */
        public final /* synthetic */ C89084e f257485e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89439a(Handler handler, C89084e eVar) {
            super(0);
            this.f257484d = handler;
            this.f257485e = eVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, AppBrandThumbMediaPlayer");
            C101242d.C89834a aVar = C101242d.f296447G;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C101242d b = C101242d.C89834a.m112326b(aVar, context, this.f257484d.getLooper(), false, this.f257485e, 4, (Object) null);
            if (b != null) {
                return b;
            }
            Log.m105924i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
            return new C21113g();
        }
    }

    public C89438b(Handler handler) {
        this.f257483a = handler;
    }

    /* renamed from: a */
    public final C87761e mo123095a(C89084e eVar) {
        C87412m.m108594g(eVar, "dataSource");
        C89439a aVar = new C89439a(this.f257483a, eVar);
        if (eVar instanceof C89084e.C89088b) {
            return (C87761e) aVar.invoke();
        }
        return null;
    }
}
