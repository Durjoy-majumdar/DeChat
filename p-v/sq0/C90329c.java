package sq0;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gt0.C87325b;
import gt0.C87362k;
import gy3.C87412m;
import p963fc.C86812g;
import sq0.C90333e;

/* renamed from: sq0.c */
public class C90329c<T extends AppBrandRuntime> implements C90333e<T> {

    /* renamed from: sq0.c$a */
    public static final class C90330a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C90329c<T> f259308d;

        /* renamed from: e */
        public final /* synthetic */ Runnable f259309e;

        /* renamed from: f */
        public final /* synthetic */ T f259310f;

        /* renamed from: g */
        public final /* synthetic */ C87325b f259311g;

        public C90330a(C90329c<T> cVar, Runnable runnable, T t, C87325b bVar) {
            this.f259308d = cVar;
            this.f259309e = runnable;
            this.f259310f = t;
            this.f259311g = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C90329c<T> cVar = this.f259308d;
            Runnable runnable = this.f259309e;
            T t = this.f259310f;
            C87325b bVar = this.f259311g;
            if (runnable != null) {
                runnable.run();
            }
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "dialog confirm to navigate back");
            C90327a aVar = (C90327a) cVar;
            aVar.getClass();
            C86812g gVar = (C86812g) t;
            C87412m.m108594g(gVar, "runtime");
            aVar.mo124558c(gVar, 2);
            bVar.dismiss();
        }
    }

    /* renamed from: sq0.c$b */
    public static final class C90331b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C90329c<T> f259312d;

        /* renamed from: e */
        public final /* synthetic */ T f259313e;

        /* renamed from: f */
        public final /* synthetic */ C87325b f259314f;

        public C90331b(C90329c<T> cVar, T t, C87325b bVar) {
            this.f259312d = cVar;
            this.f259313e = t;
            this.f259314f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C90329c<T> cVar = this.f259312d;
            T t = this.f259313e;
            C87325b bVar = this.f259314f;
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "keep staying current page");
            C90327a aVar = (C90327a) cVar;
            aVar.getClass();
            C86812g gVar = (C86812g) t;
            C87412m.m108594g(gVar, "runtime");
            aVar.mo124558c(gVar, 3);
            bVar.dismiss();
        }
    }

    /* renamed from: a */
    public C90339i mo124559a() {
        return C90339i.WITH_CONFIRM_DIALOG;
    }

    /* renamed from: b */
    public boolean mo124560b(T t, String str, Runnable runnable) {
        boolean z;
        C87412m.m108594g(t, "runtime");
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C83820i0 currentPage = t.mo113042Z().getCurrentPage();
        C90337g t2 = currentPage != null ? currentPage.mo116307t(C90339i.WITH_CONFIRM_DIALOG) : null;
        if (t2 == null) {
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        } else if (!t2.mo124564a(str)) {
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "scene:[" + str + "] disable");
            return false;
        } else if (t.mo113042Z().getPageCount() <= 1) {
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "leave current wxa, can't intercept");
            return false;
        } else {
            C86812g gVar = (C86812g) t;
            if (gVar.mo113036W().f234841u == 7) {
                Log.m105924i("MicroMsg.AppBrandPageNavigateBackInterceptorWC", "fake native wxa, can't intercept");
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "custom intercept return false");
                return false;
            }
            Log.m105924i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "show navigate back interception dialog");
            C87325b bVar = new C87325b(t.mo113026R());
            bVar.mo107533r(Util.isNullOrNil(t2.f259318a) ? "" : t2.f259318a);
            bVar.setCanceledOnTouchOutside(false);
            bVar.setCancelable(false);
            bVar.mo107541v(C0966R.string.a7f, new C90330a(this, runnable, t, bVar));
            bVar.mo107534s(C0966R.string.a7g, new C90331b(this, t, bVar));
            C87362k kVar = t.f238156u;
            if (kVar != null) {
                kVar.mo121778b(bVar);
            }
            ((C90327a) this).mo124558c(gVar, 1);
            return true;
        }
    }

    public C90333e.C90334a priority() {
        return C90333e.C90334a.C90336b.f259317b;
    }
}
