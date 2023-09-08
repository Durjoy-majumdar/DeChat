package em0;

import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85153j0;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85155r0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kr0.C88267e;
import li0.C88508b;
import li0.C88509c;
import lo0.C88615f;
import n11.C109669c;
import n11.C88873b;
import org.json.JSONObject;
import p576jp.C33610c;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.c */
public class C86537c extends C86561i {
    public static final int CTRL_INDEX = 516;
    public static final String NAME = "joinVoIPChat";

    /* renamed from: i */
    public C86567n f251414i = new C86567n();

    /* renamed from: j */
    public C86569o f251415j = new C86569o();

    /* renamed from: n */
    public C86572r f251416n = new C86572r();

    /* renamed from: o */
    public C86570p f251417o = new C86570p();

    /* renamed from: p */
    public C86571q f251418p = new C86571q();

    /* renamed from: q */
    public C88509c.C88512b f251419q = null;

    /* renamed from: r */
    public C86573s f251420r = new C86573s();

    /* renamed from: s */
    public volatile boolean f251421s = false;

    /* renamed from: t */
    public String f251422t = "";

    /* renamed from: u */
    public long f251423u = -1;

    /* renamed from: v */
    public int f251424v = 0;

    /* renamed from: w */
    public boolean f251425w = false;

    /* renamed from: em0.c$a */
    public class C86538a implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88873b f251426a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f251427b;

        /* renamed from: c */
        public final /* synthetic */ int f251428c;

        public C86538a(C88873b bVar, C88267e eVar, int i) {
            this.f251426a = bVar;
            this.f251427b = eVar;
            this.f251428c = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            int i3 = i;
            int i4 = i2;
            ArrayList arrayList = (ArrayList) obj;
            Class cls = C88007b.class;
            long ticksToNow = Util.ticksToNow(C86537c.this.f251423u);
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", Integer.valueOf(i), Integer.valueOf(i2), str, arrayList, Long.valueOf(ticksToNow));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16092, C86537c.this.f251422t, Integer.valueOf(i2), Long.valueOf(ticksToNow));
            if (i3 == 0 && i4 == 0) {
                C86537c.this.f251423u = Util.currentTicks();
                C86537c.this.mo121019B(!this.f251426a.f256340k.f256327a);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149504k(this.f251426a.f256340k.f256327a, (C85147b<String>) null);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149503j(this.f251426a.f256340k.f256328b, (C85147b<String>) null);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149502i(this.f251426a.f256340k.f256329c, (C85147b<String>) null);
                nVar.mo175913w(935, 0, 1);
                Map<String, Object> C = C86537c.this.mo121016C(arrayList);
                C86537c cVar = C86537c.this;
                cVar.mo121020w(C, cVar.mo121021x(i3, i4));
                this.f251427b.mo109647a(this.f251428c, C86537c.this.mo115112m("ok", C));
                C86537c cVar2 = C86537c.this;
                cVar2.f251425w = true;
                if (!cVar2.f251421s) {
                    C86537c.this.f251421s = true;
                    this.f251427b.mo109672s(C86537c.this.f251420r);
                    return;
                }
                return;
            }
            nVar.mo175913w(935, 1, 1);
            HashMap hashMap = new HashMap();
            C86537c cVar3 = C86537c.this;
            cVar3.mo121020w(hashMap, cVar3.mo121021x(i3, i4));
            this.f251427b.mo109647a(this.f251428c, C86537c.this.mo115112m(String.format("fail: %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312355R)}), hashMap));
            C86537c.this.f251425w = false;
        }
    }

    /* renamed from: em0.c$b */
    public class C86539b implements C85147b<C33610c.C33611a> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251430a;

        /* renamed from: b */
        public final /* synthetic */ C88873b f251431b;

        public C86539b(C88267e eVar, C88873b bVar) {
            this.f251430a = eVar;
            this.f251431b = bVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            C33610c.C33611a aVar = (C33610c.C33611a) obj;
            long ticksToNow = Util.ticksToNow(C86537c.this.f251423u);
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on call interrupted! %d, %d, %s, %s, in room for %d ms", Integer.valueOf(i), Integer.valueOf(i2), str, aVar, Long.valueOf(ticksToNow));
            C86537c.this.f251425w = false;
            if (!(this.f251430a.getRuntime() == null || this.f251430a.getRuntime().f238113K == null)) {
                this.f251430a.getRuntime().f238113K.mo122982e(C86537c.this.f251419q);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16094, C86537c.this.f251422t, Integer.valueOf(aVar.f90971d), Long.valueOf(ticksToNow), Integer.valueOf(C86537c.this.f251424v));
            C86574t.m107377a(this.f251431b.f256331b);
            if (aVar == C33610c.C33611a.ReasonManual) {
                Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: manually exit, ignore");
                return;
            }
            if (aVar == C33610c.C33611a.ReasonDevice) {
                nVar.mo175913w(935, 4, 1);
            }
            if (aVar == C33610c.C33611a.ReasonSessionUpdateFailed) {
                nVar.mo175913w(935, 5, 1);
            }
            if (aVar == C33610c.C33611a.ReasonUnknown) {
                nVar.mo175913w(935, 6, 1);
            }
            if (aVar == C33610c.C33611a.ReasonInterrupted) {
                nVar.mo175913w(935, 7, 1);
            }
            C86567n nVar2 = C86537c.this.f251414i;
            nVar2.mo115194p(this.f251430a);
            nVar2.mo121024s(aVar);
        }
    }

    /* renamed from: em0.c$c */
    public class C86540c implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251433a;

        public C86540c(C88267e eVar) {
            this.f251433a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on room member changed! %s", arrayList);
            if (arrayList != null) {
                C86537c cVar = C86537c.this;
                cVar.f251424v = Math.max(cVar.f251424v, arrayList.size());
                Log.m105919d("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: max room member changed to %d", Integer.valueOf(C86537c.this.f251424v));
            }
            Map<String, Object> C = C86537c.this.mo121016C(arrayList);
            ((HashMap) C).put("errCode", 0);
            C86569o oVar = C86537c.this.f251415j;
            oVar.mo115194p(this.f251433a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
            oVar.mo115165o(C);
            oVar.mo115158h();
        }
    }

    /* renamed from: em0.c$d */
    public class C86541d implements C85147b<Map<String, Object>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251435a;

        public C86541d(C88267e eVar) {
            this.f251435a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            Map map = (Map) obj;
            Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on room video member changed!");
            map.put("errCode", 0);
            C86572r rVar = C86537c.this.f251416n;
            rVar.mo115194p(this.f251435a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPVideoMembersChanged", "hy: video member changed.");
            rVar.mo115165o(map);
            rVar.mo115158h();
        }
    }

    /* renamed from: em0.c$e */
    public class C86542e implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251437a;

        public C86542e(C88267e eVar) {
            this.f251437a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on talk member changed! %s", arrayList);
            Map<String, Object> C = C86537c.this.mo121016C(arrayList);
            ((HashMap) C).put("errCode", 0);
            C86570p pVar = C86537c.this.f251417o;
            pVar.mo115194p(this.f251437a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
            pVar.mo115165o(C);
            pVar.mo115158h();
        }
    }

    /* renamed from: em0.c$f */
    public class C86543f implements C85147b<Map<String, Object>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251439a;

        public C86543f(C88267e eVar) {
            this.f251439a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            Map map = (Map) obj;
            Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "on event callback!");
            map.put("errCode", 0);
            C86571q qVar = C86537c.this.f251418p;
            qVar.mo115194p(this.f251439a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
            qVar.mo115165o(map);
            qVar.mo115158h();
        }
    }

    /* renamed from: em0.c$g */
    public class C86544g implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C88267e f251441d;

        /* renamed from: em0.c$g$a */
        public class C86545a implements C85147b<String> {
            public C86545a(C86544g gVar) {
            }

            /* renamed from: a */
            public void mo118169a(int i, int i2, String str, Object obj) {
                String str2 = (String) obj;
                Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appbrand change to destroy and exit room");
            }
        }

        public C86544g(C88267e eVar) {
            this.f251441d = eVar;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            Class cls = C88007b.class;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: is1V1:%b, isIsVoIPTalking:%b", Boolean.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312351N), Boolean.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312350M));
            if (bVar == C88508b.DESTROYED && C86537c.this.f251422t.equals(str)) {
                Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appbrand change to destroy");
                C33610c Bp = ((C88007b) C86312j.m106911c(cls)).mo59116Bp();
                C86545a aVar = new C86545a(this);
                C33610c.C33611a aVar2 = C33610c.C33611a.ReasonWeappEnterBackground;
                C105181w wVar = (C105181w) Bp;
                wVar.getClass();
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: user triggered exit conference");
                wVar.mo149500g(new C85153j0(wVar, aVar2, aVar));
                if (!(this.f251441d.getRuntime() == null || this.f251441d.getRuntime().f238113K == null)) {
                    this.f251441d.getRuntime().f238113K.mo122982e(C86537c.this.f251419q);
                }
                C86574t.m107377a(str);
            } else if (bVar == C88508b.BACKGROUND && C86537c.this.f251422t.equals(str)) {
                C86537c cVar = C86537c.this;
                if (cVar.f251425w) {
                    String str2 = cVar.f251422t;
                    Log.m105925i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:showFloatBall, appId:%s, is1v1:%s", str2, Boolean.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312351N));
                    if (((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312350M) {
                        AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new AppBrandBackgroundRunningOperationEvent();
                        AppBrandBackgroundRunningOperationEvent.C83126a aVar3 = appBrandBackgroundRunningOperationEvent.f242920d;
                        aVar3.f242921a = str2;
                        aVar3.f242922b = 16;
                        aVar3.f242923c = 1;
                        appBrandBackgroundRunningOperationEvent.publish();
                    }
                }
                C86537c.this.f251425w = false;
            }
        }
    }

    public C86537c() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: C */
    public Map<String, Object> mo121016C(ArrayList<C109669c> arrayList) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        if (!Util.isNullOrNil((List) arrayList)) {
            Iterator<C109669c> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f328294b);
            }
        }
        hashMap.put("openIdList", arrayList2);
        return hashMap;
    }

    /* renamed from: D */
    public void mo121017D(C88267e eVar) {
        if (this.f251419q == null) {
            this.f251419q = new C86544g(eVar);
        }
        if (eVar.getRuntime() != null && eVar.getRuntime().f238113K != null) {
            eVar.getRuntime().f238113K.mo122978a(this.f251419q);
        }
    }

    /* renamed from: z */
    public void mo121015z(C88267e eVar, JSONObject jSONObject, int i) {
        C88267e eVar2 = eVar;
        int i2 = i;
        if (jSONObject == null) {
            eVar2.mo109647a(i2, mo115109j("fail:data is null or nil"));
            return;
        }
        C88615f fVar = (C88615f) eVar.getRuntime().mo113032U(C88615f.class);
        if (fVar != null) {
            String W = fVar.mo117459W(eVar.getAppId(), eVar.getRuntime().f238149o.f239365g);
            if (!Util.isNullOrNil(W)) {
                Log.m105921e("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "can not join voip chat now, message:%s", W);
                HashMap hashMap = new HashMap();
                mo121020w(hashMap, mo121021x(-10086, -7));
                eVar2.mo109647a(i2, mo115112m(String.format("fail: %d, %d, can not join voip chat now", new Object[]{-10086, -7}), hashMap));
                return;
            }
        }
        this.f251422t = eVar.getAppId();
        mo121017D(eVar);
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appId:" + eVar.getAppId() + ", params:" + jSONObject.toString());
        C88873b A = mo121018A(eVar, jSONObject);
        if (A == null) {
            eVar2.mo109647a(i2, mo115109j("fail: param error!"));
            this.f251425w = false;
            return;
        }
        this.f251424v = 0;
        this.f251423u = Util.currentTicks();
        A.f256332c = "wx766655dab8fe851b";
        mo121019B(false);
        C33610c Bp = ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp();
        C86538a aVar = new C86538a(A, eVar2, i2);
        C86539b bVar = new C86539b(eVar2, A);
        C86540c cVar = new C86540c(eVar2);
        C86541d dVar = new C86541d(eVar2);
        C86542e eVar3 = new C86542e(eVar2);
        C86543f fVar2 = new C86543f(eVar2);
        C105181w wVar = (C105181w) Bp;
        wVar.getClass();
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger join room. %s, %s, %s, %d, %s", A.f256331b, A.f256333d, A.f256335f, Integer.valueOf(A.f256336g), A.f256334e);
        wVar.mo149500g(new C85155r0(wVar, A, aVar, bVar, cVar, dVar, eVar3, fVar2));
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: JsApiCloudVoiceJoinVoIPChat callbackId:" + i2);
    }
}
