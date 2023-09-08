package em0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import p646pn.C110234e;
import xv0.C112181e;
import xv0.C112187l;

/* renamed from: em0.g */
public class C86552g extends C86561i {
    public static final int CTRL_INDEX = 877;
    public static final String NAME = "hasJoinVoIPChat";

    /* renamed from: em0.g$a */
    public class C86553a implements C112187l {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251452a;

        /* renamed from: b */
        public final /* synthetic */ int f251453b;

        public C86553a(C88267e eVar, int i) {
            this.f251452a = eVar;
            this.f251453b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0068 A[EDGE_INSN: B:20:0x0068->B:15:0x0068 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo61051a(java.util.List<com.tencent.p014mm.plugin.ball.model.BallInfo> r10) {
            /*
                r9 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.Class<jp.b> r1 = p576jp.C88007b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                jp.b r1 = (p576jp.C88007b) r1
                jp.c r1 = r1.mo59116Bp()
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r1 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r1
                boolean r1 = r1.f312350M
                r2 = 0
                r3 = 1
                java.lang.String r4 = "ok"
                java.lang.String r5 = "join"
                java.lang.String r6 = "MicroMsg.OpenVoice.JsApiHasJoinVoIPChat"
                if (r1 == 0) goto L_0x003f
                java.lang.Boolean r10 = java.lang.Boolean.TRUE
                r0.put(r5, r10)
                kr0.e r10 = r9.f251452a
                int r5 = r9.f251453b
                em0.g r7 = em0.C86552g.this
                java.lang.String r0 = r7.mo115112m(r4, r0)
                r10.mo109647a(r5, r0)
                java.lang.Object[] r10 = new java.lang.Object[r3]
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                r10[r2] = r0
                java.lang.String r0 = "hasVoIPChat:%b, now is voip talking"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r10)
                return
            L_0x003f:
                if (r10 == 0) goto L_0x008a
                int r7 = r10.size()
                if (r7 != 0) goto L_0x0048
                goto L_0x008a
            L_0x0048:
                java.util.Iterator r10 = r10.iterator()
            L_0x004c:
                boolean r7 = r10.hasNext()
                if (r7 == 0) goto L_0x0068
                java.lang.Object r7 = r10.next()
                com.tencent.mm.plugin.ball.model.BallInfo r7 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r7
                int r7 = r7.f311686d
                r8 = 17
                if (r7 == r8) goto L_0x0062
                r8 = 19
                if (r7 != r8) goto L_0x004c
            L_0x0062:
                java.lang.String r10 = "has appbrand doing voip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
                r1 = 1
            L_0x0068:
                java.lang.Object[] r10 = new java.lang.Object[r3]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                r10[r2] = r3
                java.lang.String r2 = "hasVoIPChat:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r10)
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
                r0.put(r5, r10)
                kr0.e r10 = r9.f251452a
                int r1 = r9.f251453b
                em0.g r2 = em0.C86552g.this
                java.lang.String r0 = r2.mo115112m(r4, r0)
                r10.mo109647a(r1, r0)
                return
            L_0x008a:
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                r0.put(r5, r10)
                kr0.e r10 = r9.f251452a
                int r1 = r9.f251453b
                em0.g r2 = em0.C86552g.this
                java.lang.String r0 = r2.mo115112m(r4, r0)
                r10.mo109647a(r1, r0)
                java.lang.String r10 = "ballInfoList is empty, hasVoIPChat false!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C86552g.C86553a.mo61051a(java.util.List):void");
        }
    }

    /* renamed from: z */
    public void mo121015z(C88267e eVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", NAME);
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        if (pY != null) {
            pY.mo149114c0(new C86553a(eVar, i));
            return;
        }
        Log.m105920e("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "IFloatBallService is null");
        HashMap hashMap = new HashMap();
        hashMap.put("join", Boolean.FALSE);
        eVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
