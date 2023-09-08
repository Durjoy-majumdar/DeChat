package com.tencent.p014mm.advertise.impl.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1762o0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import jr2.C9509g;
import kotlin.Metadata;
import q20.C89449a;

/* renamed from: com.tencent.mm.advertise.impl.jsapi.a */
public final class C0980a<T extends C7594e> extends C86430i<T> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/a$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.a$a */
    public static final class C0981a implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "data");
            C87412m.m108594g(gVar, "callback");
            ((C9509g) C86312j.m106911c(C9509g.class)).Bi0(13297, iPCString.f10315d, (int) Util.nowSecond());
            gVar.mo894a(new IPCVoid());
        }
    }

    /* renamed from: com.tencent.mm.advertise.impl.jsapi.a$b */
    public static final class C0982b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C0980a<T> f9003d;

        public C0982b(C0980a<T> aVar) {
            this.f9003d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            this.f9003d.mo120840p().invoke(this.f9003d.mo120844i());
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return C1762o0.NAME;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("ad_info");
        String optString2 = hVar.optString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(optString + ',' + optString2), C0981a.class, new C0982b(this));
    }
}
