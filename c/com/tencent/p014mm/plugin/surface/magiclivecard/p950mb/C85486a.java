package com.tencent.p014mm.plugin.surface.magiclivecard.p950mb;

import android.view.View;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.WACanvasJSExceptionReportStruct;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55480f;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C86177e;
import d70.C31091c;
import di3.C7335d;
import di3.C86312j;
import e42.C86431j;
import fx2.C8215d;
import fx2.C8216e;
import fx2.C87115c;
import fy3.C32224a;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import i70.C87674f;
import java.util.Collection;
import java.util.HashSet;
import jx2.C88037a;
import jx2.C88038b;
import jx2.C88039c;
import kr0.C88274h0;
import l70.C88390d;
import lx2.C88662a;
import m70.C88712h;
import mx2.C88860a;
import nx2.C35038e;
import nx2.C89095a;
import org.json.JSONObject;
import ox2.C89299a;
import ox2.C89302b;
import p235sm.C90233i0;
import p237sp.C90271s;
import p671qy.C63344h;
import px2.C89442a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C64197v;
import xk0.C91276m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.a */
public final class C85486a extends C87667c<View, C85486a> {

    /* renamed from: n */
    public final C85486a f249127n = this;

    /* renamed from: o */
    public final C88274h0 f249128o;

    /* renamed from: p */
    public final Collection<C86431j<C85486a>> f249129p;

    /* renamed from: q */
    public final HashSet<String> f249130q;

    /* renamed from: r */
    public C89299a f249131r;

    /* renamed from: s */
    public C40427l0 f249132s;

    /* renamed from: t */
    public C63344h.C63346b f249133t;

    /* renamed from: u */
    public C63344h.C63346b f249134u;

    /* renamed from: v */
    public C89095a f249135v;

    /* renamed from: w */
    public final C13601g f249136w;

    /* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.a$a */
    public static final class C85487a extends C87413o implements C32224a<MagicLiveCardService$webViewUIDestroyEventEventListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ C85486a f249137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85487a(C85486a aVar) {
            super(0);
            this.f249137d = aVar;
        }

        public Object invoke() {
            return new MagicLiveCardService$webViewUIDestroyEventEventListener$2$1(this.f249137d, C40008f.f107254d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85486a() {
        super((C87674f) null, 1, (C8480h) null);
        Class cls = C90233i0.class;
        C7335d c = C86312j.m106911c(C88274h0.class);
        C87412m.m108593f(c, "getService(IAppBrandMixE…LogicService::class.java)");
        C88274h0 h0Var = (C88274h0) c;
        this.f249128o = h0Var;
        C82870p Xg0 = h0Var.Xg0(764);
        C87412m.m108592e(Xg0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f249129p = C110818d0.m150933e0(C64197v.m75537f(new C88037a(), new C88039c(), new C88038b(), new C88390d(), ((C30172a0) C86312j.m106911c(C30172a0.class)).Cu0((C82268c) Xg0, "wxe208ce76dfa39515"), new C88860a(), new C88662a()), ((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD));
        this.f249130q = C110826x0.m151014b(C8215d.class.getName(), C87115c.class.getName(), C8216e.class.getName(), C91276m.class.getName(), ((C90233i0) C86312j.m106911c(cls)).mo124326Ew().getClass().getName(), ((C90233i0) C86312j.m106911c(cls)).mo124330d7().getClass().getName(), ((C31091c) C86312j.m106911c(C31091c.class)).mo57974WY().getClass().getName(), h0Var.Xg0(251).getClass().getName(), h0Var.Xg0(969).getClass().getName(), h0Var.Xg0(970).getClass().getName(), h0Var.Xg0(984).getClass().getName(), h0Var.Xg0(1065).getClass().getName(), h0Var.Xg0(C55480f.CTRL_INDEX).getClass().getName(), JsApiGetInstallState.class.getName(), h0Var.Xg0(JsApiInstallDownloadTask.CTRL_INDEX).getClass().getName());
        this.f249136w = C36568h.m40985a(new C85487a(this));
    }

    /* renamed from: C0 */
    public final C89299a mo118858C0() {
        C89299a aVar = this.f249131r;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("packageManager");
        throw null;
    }

    /* renamed from: D0 */
    public final void mo118859D0() {
        C89442a aVar = C89442a.f257487a;
        Log.m105924i("MagicLiveCardReporter", "resetReport");
        C89442a.f257488b.clear();
        C89442a.f257489c.clear();
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        super.mo109584T(str, str2);
        C89442a aVar = C89442a.f257487a;
        C115669n.INSTANCE.mo175911u(1740, C89442a.f257490d);
        WACanvasJSExceptionReportStruct wACanvasJSExceptionReportStruct = new WACanvasJSExceptionReportStruct();
        wACanvasJSExceptionReportStruct.f236442e = wACanvasJSExceptionReportStruct.mo86045b("AppId", "wx2f3fb5db9f226462", true);
        wACanvasJSExceptionReportStruct.f236443f = 0;
        wACanvasJSExceptionReportStruct.f236446i = wACanvasJSExceptionReportStruct.mo86045b("ErrorMessage", str2, true);
        wACanvasJSExceptionReportStruct.f236441d = 1;
        Log.m105924i("MagicLiveCardReporter", "reportJsException report appId:" + wACanvasJSExceptionReportStruct.f236442e + " ErrMsg:" + wACanvasJSExceptionReportStruct.f236446i);
        wACanvasJSExceptionReportStruct.mo86054n();
    }

    /* renamed from: a0 */
    public void mo109586a0() {
        super.mo109586a0();
        C63344h.C63346b bVar = this.f249134u;
        if (bVar != null) {
            bVar.mo87817a("dynamicCardServerLost", new JSONObject());
        }
        C63344h.C63346b bVar2 = this.f249133t;
        if (bVar2 != null) {
            bVar2.mo87817a("dynamicCardServerLost", new JSONObject());
        }
        C89095a aVar = this.f249135v;
        if (aVar != null) {
            aVar.mo123434a(C35038e.SERVER_ERROR);
        }
        C89442a aVar2 = C89442a.f257487a;
        C115669n.INSTANCE.mo175911u(1740, C89442a.f257491e);
        ((IListener) ((C36570n) this.f249136w).getValue()).dead();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if ((r0.length() == 0) != false) goto L_0x00dd;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo109588c(int r23, boolean r24) {
        /*
            r22 = this;
            super.mo109588c(r23, r24)
            g70.i r0 = r22.mo122093m0(r23)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r0.f252785a
            if (r2 != 0) goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            int r3 = r2.length()
            r5 = 0
            if (r3 <= 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 == 0) goto L_0x0036
            r3 = r22
            qy.h$b r6 = r3.f249133t
            if (r6 == 0) goto L_0x0038
            if (r6 == 0) goto L_0x0038
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "frameSetName"
            r7.put(r8, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "dynamicCardFirstFrameAction"
            r6.mo87817a(r2, r7)
            goto L_0x0038
        L_0x0036:
            r3 = r22
        L_0x0038:
            if (r0 == 0) goto L_0x0153
            px2.a r2 = px2.C89442a.f257487a
            java.lang.String r0 = r0.f252786b
            java.lang.Class<h70.d> r6 = h70.C87459d.class
            java.lang.String r7 = "frameSetId"
            gy3.C87412m.m108594g(r0, r7)
            di3.d r7 = di3.C86312j.m106911c(r6)
            h70.d r7 = (h70.C87459d) r7
            g70.i r7 = r7.mo58574uo(r0)
            if (r7 == 0) goto L_0x0153
            java.lang.String r7 = r7.f252785a
            if (r7 != 0) goto L_0x0057
            goto L_0x0153
        L_0x0057:
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = px2.C89442a.f257488b
            boolean r8 = r8.containsKey(r7)
            java.lang.String r14 = "MagicLiveCardReporter"
            if (r8 == 0) goto L_0x0139
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 == 0) goto L_0x006e
            goto L_0x0139
        L_0x006e:
            long r16 = java.lang.System.currentTimeMillis()
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = px2.C89442a.f257488b
            java.lang.Object r8 = r8.get(r7)
            java.lang.Long r8 = (java.lang.Long) r8
            r18 = 0
            if (r8 != 0) goto L_0x0082
            java.lang.Long r8 = java.lang.Long.valueOf(r18)
        L_0x0082:
            long r12 = r8.longValue()
            int r8 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0091
            java.lang.String r0 = "markFirstFrameForScene startTime 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x0153
        L_0x0091:
            long r20 = r16 - r12
            r10 = 17
            r8 = r2
            r9 = r7
            r4 = r14
            r14 = r20
            r8.mo123762a(r9, r10, r12, r14)
            java.lang.String r8 = "portrait_game_outfits"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.Long> r7 = px2.C89442a.f257488b
            java.lang.String r8 = "portrait_game_outfits_data_available"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L_0x00b7
            java.lang.Long r7 = java.lang.Long.valueOf(r18)
        L_0x00b7:
            long r12 = r7.longValue()
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x00ca
            long r14 = r16 - r12
            r10 = 17
            java.lang.String r9 = "portrait_game_outfits_data_available"
            r8 = r2
            r8.mo123762a(r9, r10, r12, r14)
        L_0x00ca:
            java.util.HashMap<java.lang.String, java.lang.Long> r7 = px2.C89442a.f257489c
            boolean r7 = r7.containsKey(r0)
            if (r7 == 0) goto L_0x00dd
            int r7 = r0.length()
            if (r7 != 0) goto L_0x00da
            r7 = 1
            goto L_0x00db
        L_0x00da:
            r7 = 0
        L_0x00db:
            if (r7 == 0) goto L_0x00f1
        L_0x00dd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "markFrameSetFirstRender no start or frameSetId null:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
        L_0x00f1:
            long r7 = java.lang.System.currentTimeMillis()
            java.util.HashMap<java.lang.String, java.lang.Long> r9 = px2.C89442a.f257489c
            java.lang.Object r9 = r9.get(r0)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L_0x0103
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
        L_0x0103:
            long r12 = r9.longValue()
            int r9 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r9 != 0) goto L_0x0111
            java.lang.String r0 = "markFrameSetFirstRender startTime 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0153
        L_0x0111:
            long r14 = r7 - r12
            di3.d r4 = di3.C86312j.m106911c(r6)
            h70.d r4 = (h70.C87459d) r4
            g70.i r0 = r4.mo58574uo(r0)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = r0.f252785a
            if (r0 != 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r9 = r0
            goto L_0x0127
        L_0x0126:
            r9 = r1
        L_0x0127:
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x012f
            r4 = 1
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            if (r4 == 0) goto L_0x0153
            r10 = 3
            r8 = r2
            r8.mo123762a(r9, r10, r12, r14)
            goto L_0x0153
        L_0x0139:
            r4 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "markFirstFrameForScene frameSetName:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " has no start time"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a.mo109588c(int, boolean):void");
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        super.mo109589d0(i);
        ((IListener) ((C36570n) this.f249136w).getValue()).dead();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = (r0 = (g70.C87164i) sx3.C110818d0.m150915M((r0 = (r0 = r0.f253931f).values()))).f252796l;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Activity mo8720e0() {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, i70.c<ViewType, T>$a> r0 = r3.f253923j
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "frameSetRootWithId.values"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Object r0 = sx3.C110818d0.m150915M(r0)
            i70.c$a r0 = (i70.C87667c.C87668a) r0
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.util.HashMap<java.lang.String, g70.i> r0 = r0.f253931f
            if (r0 == 0) goto L_0x002f
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = sx3.C110818d0.m150915M(r0)
            g70.i r0 = (g70.C87164i) r0
            if (r0 == 0) goto L_0x002f
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer r0 = r0.f252796l
            if (r0 == 0) goto L_0x002f
            android.content.Context r0 = r0.getContext()
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0037
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a.mo8720e0():android.app.Activity");
    }

    /* renamed from: g0 */
    public C86177e<View, ? extends Object> mo118860g0(String str) {
        C87412m.m108594g(str, "containerTag");
        return new C88712h();
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        super.mo118861j0();
        this.f249133t = null;
        this.f249134u = null;
        this.f249135v = null;
        ((C90271s) C86312j.m106911c(C90271s.class)).Dk0();
        C89299a C0 = mo118858C0();
        ((C119157j) C119157j.f356862d).mo183878i(new C89302b(C0), 3000);
        mo118859D0();
    }

    /* renamed from: l0 */
    public String mo118862l0() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD;
    }

    public void onCreated() {
        super.onCreated();
        ((IListener) ((C36570n) this.f249136w).getValue()).alive();
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        this.f249131r = new C89299a();
        C40427l0 f = mo118858C0().mo123643f();
        C87412m.m108594g(f, "<set-?>");
        this.f249132s = f;
        super.mo118863q0();
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        T t = this.f249127n;
        C87412m.m108594g(t, "bizContext");
        mBBuildConfig.f248378q = t;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        C85280q0.m105251b(mBBuildConfig, this.f249130q);
        mBBuildConfig.mo118367a(this.f249129p);
        mo121036A0(mBBuildConfig);
        mo121029B0();
    }

    /* renamed from: r0 */
    public void mo118864r0(C87667c<?, ?>.a aVar, C87164i iVar, String str) {
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        C87412m.m108594g(str, "info");
        C89442a.f257487a.mo123763b(iVar.f252785a);
        if (iVar.f252796l == null) {
            Log.m105920e("MicroMsg.SurfaceApp.MagicLiveCardService", "sclView empty, addCustomView error");
        }
        MagicSclViewContainer magicSclViewContainer = iVar.f252796l;
        C87412m.m108591d(magicSclViewContainer);
        iVar.f252800p = mo120836f0(magicSclViewContainer);
        super.mo118864r0(aVar, iVar, str);
    }
}
