package em0;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85156s0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import lo0.C88615f;
import n11.C109669c;
import n11.C88873b;
import org.json.JSONObject;
import p576jp.C33610c;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.h */
public class C86554h extends C86537c {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "join1v1VoIPChat";

    /* renamed from: em0.h$a */
    public class C86555a implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88873b f251455a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f251456b;

        /* renamed from: c */
        public final /* synthetic */ int f251457c;

        public C86555a(C88873b bVar, C88267e eVar, int i) {
            this.f251455a = bVar;
            this.f251456b = eVar;
            this.f251457c = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            int i3 = i;
            int i4 = i2;
            ArrayList arrayList = (ArrayList) obj;
            Class cls = C88007b.class;
            long ticksToNow = Util.ticksToNow(C86554h.this.f251423u);
            Log.m105925i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", Integer.valueOf(i), Integer.valueOf(i2), str, arrayList, Long.valueOf(ticksToNow));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16092, C86554h.this.f251422t, Integer.valueOf(i2), Long.valueOf(ticksToNow));
            if (i3 == 0 && i4 == 0) {
                C86554h.this.f251423u = Util.currentTicks();
                C86554h.this.mo121019B(!this.f251455a.f256340k.f256327a);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149503j(this.f251455a.f256340k.f256328b, (C85147b<String>) null);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149504k(this.f251455a.f256340k.f256327a, (C85147b<String>) null);
                ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149502i(this.f251455a.f256340k.f256329c, (C85147b<String>) null);
                nVar.mo175913w(935, 0, 1);
                Map<String, Object> C = C86554h.this.mo121016C(arrayList);
                C86554h hVar = C86554h.this;
                hVar.mo121020w(C, hVar.mo121021x(i3, i4));
                this.f251456b.mo109647a(this.f251457c, C86554h.this.mo115112m("ok", C));
                if (!C86554h.this.f251421s) {
                    C86554h.this.f251421s = true;
                    this.f251456b.mo109672s(C86554h.this.f251420r);
                }
                C86554h.this.f251425w = true;
                return;
            }
            nVar.mo175913w(935, 1, 1);
            HashMap hashMap = new HashMap();
            C86554h hVar2 = C86554h.this;
            hVar2.mo121020w(hashMap, hVar2.mo121021x(i3, i4));
            this.f251456b.mo109647a(this.f251457c, C86554h.this.mo115112m(String.format("fail: %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312355R)}), hashMap));
            C86554h.this.f251425w = false;
        }
    }

    /* renamed from: em0.h$b */
    public class C86556b implements C85147b<C33610c.C33611a> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251459a;

        /* renamed from: b */
        public final /* synthetic */ C88873b f251460b;

        public C86556b(C88267e eVar, C88873b bVar) {
            this.f251459a = eVar;
            this.f251460b = bVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            C33610c.C33611a aVar = (C33610c.C33611a) obj;
            long ticksToNow = Util.ticksToNow(C86554h.this.f251423u);
            Log.m105925i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on call interrupted! %d, %d, %s, %s, in room for %d ms", Integer.valueOf(i), Integer.valueOf(i2), str, aVar, Long.valueOf(ticksToNow));
            if (!(this.f251459a.getRuntime() == null || this.f251459a.getRuntime().f238113K == null)) {
                this.f251459a.getRuntime().f238113K.mo122982e(C86554h.this.f251419q);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16094, C86554h.this.f251422t, Integer.valueOf(aVar.f90971d), Long.valueOf(ticksToNow), Integer.valueOf(C86554h.this.f251424v));
            C86574t.m107377a(this.f251460b.f256331b);
            C86554h.this.f251425w = false;
            if (aVar == C33610c.C33611a.ReasonManual) {
                Log.m105924i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: manually exit, ignore");
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
            C86567n nVar2 = C86554h.this.f251414i;
            nVar2.mo115194p(this.f251459a);
            nVar2.mo121024s(aVar);
        }
    }

    /* renamed from: em0.h$c */
    public class C86557c implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251462a;

        public C86557c(C88267e eVar) {
            this.f251462a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room member changed! %s", arrayList);
            if (arrayList != null) {
                C86554h hVar = C86554h.this;
                hVar.f251424v = Math.max(hVar.f251424v, arrayList.size());
                Log.m105919d("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: max room member changed to %d", Integer.valueOf(C86554h.this.f251424v));
            }
            Map<String, Object> C = C86554h.this.mo121016C(arrayList);
            ((HashMap) C).put("errCode", 0);
            C86569o oVar = C86554h.this.f251415j;
            oVar.mo115194p(this.f251462a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
            oVar.mo115165o(C);
            oVar.mo115158h();
        }
    }

    /* renamed from: em0.h$d */
    public class C86558d implements C85147b<Map<String, Object>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251464a;

        public C86558d(C88267e eVar) {
            this.f251464a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            Map map = (Map) obj;
            Log.m105924i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room video member changed!");
            map.put("errCode", 0);
            C86572r rVar = C86554h.this.f251416n;
            rVar.mo115194p(this.f251464a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPVideoMembersChanged", "hy: video member changed.");
            rVar.mo115165o(map);
            rVar.mo115158h();
        }
    }

    /* renamed from: em0.h$e */
    public class C86559e implements C85147b<ArrayList<C109669c>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251466a;

        public C86559e(C88267e eVar) {
            this.f251466a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on talk member changed! %s", arrayList);
            Map<String, Object> C = C86554h.this.mo121016C(arrayList);
            ((HashMap) C).put("errCode", 0);
            C86570p pVar = C86554h.this.f251417o;
            pVar.mo115194p(this.f251466a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
            pVar.mo115165o(C);
            pVar.mo115158h();
        }
    }

    /* renamed from: em0.h$f */
    public class C86560f implements C85147b<Map<String, Object>> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251468a;

        public C86560f(C88267e eVar) {
            this.f251468a = eVar;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            Map map = (Map) obj;
            Log.m105924i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "on event callback!");
            map.put("errCode", 0);
            C86571q qVar = C86554h.this.f251418p;
            qVar.mo115194p(this.f251468a);
            Log.m105924i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
            qVar.mo115165o(map);
            qVar.mo115158h();
        }
    }

    public C86554h() {
        C91062d.m114234a(NAME);
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
                Log.m105921e("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "can not join voip chat now, message:%s", W);
                HashMap hashMap = new HashMap();
                mo121020w(hashMap, mo121021x(-10086, -7));
                eVar2.mo109647a(i2, mo115112m(String.format("fail: %d, %d, can not join voip chat now", new Object[]{-10086, -7}), hashMap));
                return;
            }
        }
        this.f251422t = eVar.getAppId();
        mo121017D(eVar);
        C88873b A = mo121018A(eVar, jSONObject);
        if (A == null) {
            eVar2.mo109647a(i2, mo115109j("fail: param error!"));
            this.f251425w = false;
            return;
        }
        A.f256332c = "wx766655dab8fe851b";
        Log.m105924i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: appId:" + this.f251422t + ", data:" + jSONObject.toString());
        this.f251424v = 0;
        this.f251423u = Util.currentTicks();
        mo121019B(false);
        C33610c Bp = ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp();
        C86555a aVar = new C86555a(A, eVar2, i2);
        C86556b bVar = new C86556b(eVar2, A);
        C86557c cVar = new C86557c(eVar2);
        C86558d dVar = new C86558d(eVar2);
        C86559e eVar3 = new C86559e(eVar2);
        C86560f fVar2 = new C86560f(eVar2);
        C105181w wVar = (C105181w) Bp;
        wVar.getClass();
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "jd: trigger join room. %s, %s, %d, %d, %d", A.f256331b, A.f256332c, Long.valueOf(A.f256344o), Integer.valueOf(A.f256330a), Integer.valueOf(A.f256337h));
        wVar.mo149500g(new C85156s0(wVar, A, aVar, bVar, cVar, dVar, eVar3, fVar2));
        Log.m105924i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: JsApiJoin1v1VoIPChat callbackId:" + i2);
    }
}
