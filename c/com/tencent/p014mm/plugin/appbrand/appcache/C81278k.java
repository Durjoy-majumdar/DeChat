package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.autogen.events.WxaGetDownloadUrlReportEvent;
import com.tencent.p014mm.plugin.appbrand.app.C29122h2;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55513k;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hp3.C87581a;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import te3.C48698ad2;
import te3.C52246zc2;
import zp0.C91823b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.k */
public class C81278k extends C91823b<C48698ad2> {

    /* renamed from: q */
    public static C81280b f238684q;

    /* renamed from: p */
    public final C47350c f238685p;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.k$a */
    public class C81279a implements C87581a<C89132b.C89134c<C48698ad2>, C89132b.C89134c<C48698ad2>> {

        /* renamed from: a */
        public final /* synthetic */ long f238686a;

        public C81279a(long j) {
            this.f238686a = j;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            WxaGetDownloadUrlReportEvent wxaGetDownloadUrlReportEvent = new WxaGetDownloadUrlReportEvent();
            WxaGetDownloadUrlReportEvent.C80747a aVar = wxaGetDownloadUrlReportEvent.f236306d;
            aVar.f236307a = C81278k.this;
            aVar.f236309c = this.f238686a;
            aVar.f236310d = Util.nowMilliSecond();
            wxaGetDownloadUrlReportEvent.f236306d.f236308b = cVar;
            wxaGetDownloadUrlReportEvent.publish();
            return cVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.k$b */
    public interface C81280b {
    }

    public C81278k(C52246zc2 zc22) {
        super(zc22.f145806e, (String) null);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = C55513k.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getwxacdndownloadurl";
        bVar.f127066a = zc22;
        bVar.f127067b = new C48698ad2();
        C47350c a = bVar.mo72403a();
        this.f238685p = a;
        mo123453j(a);
    }

    /* renamed from: i */
    public synchronized C89059e<C89132b.C89134c<C48698ad2>> mo9225i() {
        C89059e<_Ret> B;
        Class<C81161g2> cls = C81161g2.class;
        synchronized (this) {
            long nowMilliSecond = Util.nowMilliSecond();
            if (C86312j.m106916h(cls)) {
                C86312j.m106911c(cls);
            }
            C81280b bVar = f238684q;
            C89059e<C89132b.C89134c<C48698ad2>> a = bVar != null ? ((C29122h2.C29123a) bVar).mo56472a(this) : null;
            if (a == null) {
                a = super.mo9225i();
            }
            B = a.mo123062e(new C81279a(nowMilliSecond));
        }
        return B;
    }

    /* renamed from: r */
    public C52246zc2 mo113564r() {
        return (C52246zc2) this.f238685p.f127055a.f127080a;
    }
}
