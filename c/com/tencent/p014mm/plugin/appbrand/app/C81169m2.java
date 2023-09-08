package com.tencent.p014mm.plugin.appbrand.app;

import a70.C112760b;
import ai0.C79552e;
import ai0.C79581v;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import com.tencent.p014mm.compatible.deviceinfo.MediaCodecProxyUtils;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C29594b;
import com.tencent.p014mm.plugin.appbrand.media.record.C29597r;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C84278e;
import com.tencent.p014mm.plugin.appbrand.utils.C84781r1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp0.C86389a;
import e00.C45513i0;
import gk0.C87259w0;
import gk0.C87264x0;
import gp0.C87284a;
import gp0.C87285b;
import gy3.C87412m;
import hr0.C87583a;
import hr0.C87584b;
import java.io.InputStream;
import js0.C46574u;
import lb0.C88394b;
import lu0.C88651f;
import nj3.C88996h;
import nj3.C88997i;
import p1025qb.C89583b;
import p1025qb.C89584c;
import p1025qb.C89585d;
import p1038ta.C90383b;
import p1039tb.C90388a;
import p156gj.C87226y;
import p170ic.C87690d;
import p206nj.C88957l;
import p225rc.C89923l;
import p974hc.C87471a;
import po0.C89426l;
import wq0.C91074l;
import ym0.C118988m;
import ym0.C91509g;
import ym0.C91510h;
import ym0.C91512j;
import zp0.C16377l;
import zp0.C91838s;
import zq0.C91875g0;

/* renamed from: com.tencent.mm.plugin.appbrand.app.m2 */
public final class C81169m2 extends C89585d {

    /* renamed from: b */
    public C90383b.C90385b f238497b = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$a */
    public class C81170a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$a$a */
        public class C81171a implements C29597r.C29599b {
            public C81171a(C81170a aVar) {
            }

            public void loadLibrary(String str, ClassLoader classLoader) {
                C88957l.m111079o(str, classLoader);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$a$b */
        public class C81172b implements C88394b.C88406i {
            public C81172b(C81170a aVar) {
            }

            /* renamed from: O0 */
            public Bitmap mo113345O0(InputStream inputStream) {
                return BitmapUtil.decodeStream(inputStream);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$a$c */
        public class C81173c implements C90383b.C90385b {
            public C81173c(C81170a aVar) {
            }

            /* renamed from: a */
            public void mo113342a(C90383b.C90386c cVar) {
            }

            /* renamed from: b */
            public void mo113343b(C90383b.C90384a aVar) {
            }
        }

        public C81170a() {
        }

        public void run() {
            Log.m105925i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "<init> %s", MMApplicationContext.getProcessName());
            C89923l lVar = C89923l.f258408a;
            C84781r1 r1Var = C84781r1.f247203a;
            lVar.getClass();
            C89923l.f258409b = r1Var;
            C81171a aVar = new C81171a(this);
            synchronized (C29597r.class) {
                C29597r.f80527a = aVar;
            }
            C88394b.m110234s(C112760b.m154195C());
            C81172b bVar = new C81172b(this);
            synchronized (C88394b.C88418q.f255427a) {
                C88394b.f255385h = bVar;
            }
            AppBrandLocalMediaObjectManager.m99834g(C112760b.m154195C());
            if (MMApplicationContext.isToolsProcess() || PluginAppBrand.isAppBrandProcess() || PluginAppBrand.isSupportProcess()) {
                C81169m2.this.f238497b = new C86389a();
                return;
            }
            C81169m2.this.f238497b = new C81173c(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$b */
    public class C81174b implements C88996h {
        public C81174b(C81169m2 m2Var) {
        }

        /* renamed from: a */
        public LayoutInflater mo113346a(Context context) {
            C87412m.m108594g(context, "context");
            LayoutInflater cloneInContext = LayoutInflater.from(MMApplicationContext.getContext()).cloneInContext(context);
            C87412m.m108593f(cloneInContext, "from(MMApplicationContex…).cloneInContext(context)");
            return C85868k2.m106138c(cloneInContext);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.m2$c */
    public class C81175c implements C87226y {
        public C81175c(C81169m2 m2Var) {
        }
    }

    public C81169m2() {
        C87690d.m109091b("WeChatMultiProcessInitDelegateImpl<init>", new C81170a());
    }

    /* renamed from: a */
    public void mo113342a(C90383b.C90386c cVar) {
        Log.m105925i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitialize %s", MMApplicationContext.getProcessName());
        C87690d.m109091b("NanoSdkLuggageInitDelegate", new C89583b(this, cVar));
        C87690d.m109091b("FullSdkLuggageInitDelegate", new C89584c(this, cVar));
        this.f238497b.mo113342a(cVar);
        cVar.mo114853b(C84674s4.class, C84583r2.INSTANCE);
        cVar.mo114853b(C46574u.C46575a.class, ((C45513i0) C86312j.m106911c(C45513i0.class)).Nh0(MMApplicationContext.getContext()));
        cVar.mo114853b(C91510h.class, new C118988m());
        cVar.mo114852a(C87583a.class, new C87284a());
        cVar.mo114852a(C87584b.class, new C87285b());
        cVar.mo114853b(C91509g.class, C91512j.m114810c());
        Class<C89426l> cls = C89426l.class;
        if (C88651f.f255958d == null) {
            synchronized (C88651f.class) {
                if (C88651f.f255958d == null) {
                    C88651f.f255958d = new C88651f();
                }
            }
        }
        cVar.mo114853b(cls, C88651f.f255958d);
        cVar.mo114853b(C79581v.class, C79552e.f233287d);
        cVar.mo114853b(C90388a.class, new C29594b());
        cVar.mo114853b(C16377l.class, C91838s.f262955d);
        cVar.mo114853b(C91074l.class, new C84278e());
        cVar.mo114853b(C87471a.class, C81190y.f238508d);
        C88997i iVar = C88997i.f256584a;
        C88997i.f256585b = new C81174b(this);
        if (!C87264x0.f252985a) {
            C87264x0.f252985a = true;
            C91875g0.f263042b = new C87259w0();
        }
        MediaCodecProxyUtils.f310648f = new C81175c(this);
    }

    /* renamed from: b */
    public void mo113343b(C90383b.C90384a aVar) {
        Log.m105925i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitComponent %s", MMApplicationContext.getProcessName());
        super.mo113343b(aVar);
        this.f238497b.mo113343b(aVar);
    }
}
