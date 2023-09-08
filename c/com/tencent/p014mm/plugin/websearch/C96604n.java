package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u73.C101979m0;
import u73.C101981o;
import u73.C101984s;

/* renamed from: com.tencent.mm.plugin.websearch.n */
public class C96604n implements C101981o {

    /* renamed from: a */
    public final MMHandler f282820a;

    /* renamed from: b */
    public final List<Map<Object, C101979m0>> f282821b = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.websearch.n$a */
    public class C96605a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f282822d;

        /* renamed from: e */
        public final /* synthetic */ Object f282823e;

        public C96605a(int i, Object obj) {
            this.f282822d = i;
            this.f282823e = obj;
        }

        public void run() {
            Log.m105925i("MicroMsg.WebSearch.PGetController", "step_doCgiReq type:%s, reqTag:%s", Integer.valueOf(this.f282822d), this.f282823e);
            C101979m0 m0Var = (C101979m0) ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282822d)).get(this.f282823e);
            if (m0Var == null) {
                m0Var = new C101979m0();
                ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282822d)).put(this.f282823e, m0Var);
            }
            m0Var.f300277a = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.n$b */
    public class C96606b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f282825d;

        /* renamed from: e */
        public final /* synthetic */ Object f282826e;

        /* renamed from: f */
        public final /* synthetic */ Object f282827f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f282828g;

        /* renamed from: h */
        public final /* synthetic */ C101984s f282829h;

        public C96606b(int i, Object obj, Object obj2, Runnable runnable, C101984s sVar) {
            this.f282825d = i;
            this.f282826e = obj;
            this.f282827f = obj2;
            this.f282828g = runnable;
            this.f282829h = sVar;
        }

        public void run() {
            Log.m105925i("MicroMsg.WebSearch.PGetController", "step_getJsApi type:%s, reqTag:%s, jsParams:%s", Integer.valueOf(this.f282825d), this.f282826e, this.f282827f);
            C101979m0 m0Var = (C101979m0) ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282825d)).get(this.f282826e);
            if (m0Var == null) {
                m0Var = new C101979m0();
                ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282825d)).put(this.f282826e, m0Var);
            }
            m0Var.f300278b = true;
            m0Var.f300280d = this.f282827f;
            if (!m0Var.f300277a) {
                this.f282828g.run();
                C96604n.this.mo134696c(this.f282825d, this.f282826e);
            } else if (m0Var.f300279c) {
                Log.m105925i("MicroMsg.WebSearch.PGetController", "step_getJsApi preget hit type:%s, reqTag:%s, jsParams:%s", Integer.valueOf(this.f282825d), this.f282826e, this.f282827f);
                C101984s sVar = this.f282829h;
                if (sVar != null) {
                    sVar.mo134672a(m0Var);
                }
                ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282825d)).remove(this.f282826e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.n$c */
    public class C96607c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f282831d;

        /* renamed from: e */
        public final /* synthetic */ Object f282832e;

        /* renamed from: f */
        public final /* synthetic */ Object f282833f;

        /* renamed from: g */
        public final /* synthetic */ C101984s f282834g;

        public C96607c(int i, Object obj, Object obj2, C101984s sVar) {
            this.f282831d = i;
            this.f282832e = obj;
            this.f282833f = obj2;
            this.f282834g = sVar;
        }

        public void run() {
            Log.m105925i("MicroMsg.WebSearch.PGetController", "step_cgiEnd type:%s reqTag:%s cgiResult:%s", Integer.valueOf(this.f282831d), this.f282832e, this.f282833f);
            C101979m0 m0Var = (C101979m0) ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282831d)).get(this.f282832e);
            if (m0Var == null) {
                Log.m105920e("MicroMsg.WebSearch.PGetController", "step_cgiEnd weird null");
                return;
            }
            m0Var.f300281e = this.f282833f;
            m0Var.f300279c = true;
            if (m0Var.f300278b) {
                C101984s sVar = this.f282834g;
                if (sVar != null) {
                    sVar.mo134672a(m0Var);
                }
                ((Map) ((ArrayList) C96604n.this.f282821b).get(this.f282831d)).remove(this.f282832e);
            }
        }
    }

    public C96604n(MMHandler mMHandler) {
        for (int i = 0; i < 3; i++) {
            this.f282821b.add(new HashMap());
        }
        this.f282820a = mMHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo134694a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000e
            goto L_0x001f
        L_0x000e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x001f }
            r1.<init>(r6)     // Catch:{ Exception -> 0x001f }
            java.lang.String r3 = "action"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ Exception -> 0x001f }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x001f }
            if (r3 == 0) goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0041 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = "req_key"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ Exception -> 0x0041 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            r0.append(r3)
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L_0x004f
            goto L_0x0063
        L_0x004f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0063 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r6 = "sessionid64"
            java.lang.String r6 = r1.optString(r6)     // Catch:{ Exception -> 0x0063 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0063 }
            if (r1 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = r6
        L_0x0063:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C96604n.mo134694a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public void mo134695b(int i, Object obj, Object obj2, C101984s sVar) {
        this.f282820a.post(new C96607c(i, obj, obj2, sVar));
    }

    /* renamed from: c */
    public void mo134696c(int i, Object obj) {
        if (obj == null) {
            Log.m105920e("MicroMsg.WebSearch.PGetController", "step_doCgiReq tag is null");
        } else {
            this.f282820a.post(new C96605a(i, obj));
        }
    }

    /* renamed from: d */
    public void mo134697d(int i, Object obj, Object obj2, Runnable runnable, C101984s sVar) {
        if (obj == null) {
            Log.m105920e("MicroMsg.WebSearch.PGetController", "step_getJsApi tag is null");
        } else {
            this.f282820a.post(new C96606b(i, obj, obj2, runnable, sVar));
        }
    }
}
