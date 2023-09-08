package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84327g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C8480h;
import kotlin.Metadata;
import kr0.C88273g1;
import nj0.C34855o;
import o40.C61926c;
import org.json.JSONObject;
import q20.C89449a;
import rx3.C13604l;
import sx3.C90363p0;
import u24.C90599h;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b7 */
public final class C82214b7 extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 644;
    @Deprecated
    public static final String NAME = "preloadMiniProgramEnv";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/b7$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b7$a */
    public static final class C29503a implements C1255d<IPCVoid, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                C61926c.m72668M(C82019a7.f240486d);
            } finally {
                if (gVar != null) {
                    gVar.mo894a(IPCVoid.f10316d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b7$b */
    public enum C82215b {
        APP(C84343y.WASERVICE);
        

        /* renamed from: e */
        public static final C82216a f241086e = null;

        /* renamed from: d */
        public final C84343y f241089d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b7$b$a */
        public static final class C82216a {
            public C82216a(C8480h hVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            f241086e = new C82216a((C8480h) null);
        }

        /* access modifiers changed from: public */
        C82215b(C84343y yVar) {
            this.f241089d = yVar;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82215b bVar;
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && jSONObject != null) {
            C82215b.C82216a aVar = C82215b.f241086e;
            String optString = jSONObject.optString("type");
            aVar.getClass();
            if (optString != null) {
                C82215b[] values = C82215b.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        bVar = C82215b.APP;
                        break;
                    }
                    C82215b bVar2 = values[i2];
                    if (C112551y.m153809i(optString, bVar2.name(), true)) {
                        bVar = bVar2;
                        break;
                    }
                    i2++;
                }
            } else {
                bVar = C82215b.APP;
            }
            C84343y yVar = bVar.f241089d;
            if (yVar == C84343y.WAGAME) {
                if ((AppBrandRuntimeWCAccessible.m99327c(gVar) && !C34855o.m40516a()) || C29553m0.f80469a.mo56809b() || (!AppBrandRuntimeWCAccessible.m99327c(gVar) && C84566n2.m104161j() && C90599h.m113508a(C84273a0.f246143j, MMApplicationContext.getProcessName()) && C84566n2.m104159h())) {
                    XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C29503a.class, (C1256g) null);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    gVar.mo109647a(i, mo115115p("ok", jSONObject2));
                    return;
                }
            }
            if (C84331q.m103947b(yVar)) {
                boolean c = AppBrandRuntimeWCAccessible.m99327c(gVar);
                C84327g.C84329b bVar3 = C84327g.f246215a;
                int i3 = c ? 1539 : 1144;
                C115669n nVar = C115669n.INSTANCE;
                C88273g1 g1Var = C88273g1.WXA_JSAPI_PRELOAD;
                nVar.mo175911u(i3, 39);
                C84331q.m103955j(yVar, new C82272c7(yVar, i3, gVar, i, this), true, (AppBrandPreloadProfiler) null, g1Var, 2);
            } else if (C84331q.m103957l(yVar)) {
                gVar.mo109647a(i, mo115112m("ok", C90363p0.m113143b(new C13604l("alreadyExist", Boolean.TRUE))));
            } else {
                gVar.mo109647a(i, mo115109j("fail internal error"));
            }
        }
    }
}
