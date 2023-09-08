package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.wepkg.event.C44476a;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.e0 */
public class C41911e0 extends C43620m2<C53095a> {

    /* renamed from: e */
    public C44476a f112914e;

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.e0$a */
    public class C41912a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f112915d;

        /* renamed from: e */
        public final /* synthetic */ int f112916e;

        /* renamed from: f */
        public final /* synthetic */ C43620m2.C5947b f112917f;

        public C41912a(String str, int i, C43620m2.C5947b bVar) {
            this.f112915d = str;
            this.f112916e = i;
            this.f112917f = bVar;
        }

        public void run() {
            C41911e0 e0Var = C41911e0.this;
            String str = this.f112915d;
            int i = this.f112916e;
            C43620m2.C5947b bVar = this.f112917f;
            JSONObject f = e0Var.mo65754f(str);
            if (i != 0) {
                if (i == 1) {
                    bVar.mo6945a((String) null, f);
                    return;
                }
            } else if (f != null) {
                bVar.mo6945a((String) null, f);
                return;
            }
            C41913f0 f0Var = new C41913f0(e0Var, str, bVar);
            e0Var.f112914e = f0Var;
            C44478c.f120606a.add(new WeakReference(f0Var));
            ((C119157j) C119157j.f356862d).mo183879j(new C41914g0(e0Var, bVar), 60000, "MicroMsg.JsApiGetWepkgFileList");
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
            WepkgNotifyEvent.C40188a aVar = wepkgNotifyEvent.f107837d;
            aVar.f107838a = 8;
            aVar.f107844g = 0;
            aVar.f107845h = arrayList;
            wepkgNotifyEvent.publish();
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getWepkgFileList";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiGetWepkgFileList", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("wepkgId");
        int optInt = e.optInt("loadType", 0);
        Log.m105925i("MicroMsg.JsApiGetWepkgFileList", "wepkgId:[%s] loadType:[%d]", optString, Integer.valueOf(optInt));
        if (Util.isNullOrNil(optString)) {
            bVar.mo6945a("null_data", (JSONObject) null);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C41912a(optString, optInt, bVar));
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo65754f(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "size"
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r1 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48884e(r12)
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.JsApiGetWepkgFileList"
            r5 = 0
            if (r1 != 0) goto L_0x0019
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r12
            java.lang.String r12 = "not exist wepkg[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r0)
        L_0x0016:
            r12 = r5
            goto L_0x008e
        L_0x0019:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r6 = "version"
            java.lang.String r7 = r1.f120653f     // Catch:{ Exception -> 0x007f }
            r12.put(r6, r7)     // Catch:{ Exception -> 0x007f }
            int r6 = r1.f120662r     // Catch:{ Exception -> 0x007f }
            r12.put(r0, r6)     // Catch:{ Exception -> 0x007f }
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x007f }
            java.lang.String r1 = r1.f120654g     // Catch:{ Exception -> 0x007f }
            r6.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x007f }
            boolean r1 = r6.mo119967g()     // Catch:{ Exception -> 0x007f }
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            goto L_0x0016
        L_0x0038:
            com.tencent.mm.plugin.wepkg.model.j r1 = new com.tencent.mm.plugin.wepkg.model.j     // Catch:{ Exception -> 0x007f }
            r1.<init>(r6)     // Catch:{ Exception -> 0x007f }
            te3.qz4 r1 = r1.f120695e     // Catch:{ Exception -> 0x007f }
            if (r1 != 0) goto L_0x0042
            goto L_0x0037
        L_0x0042:
            java.util.LinkedList<te3.oe0> r6 = r1.f140629d     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x008e
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x007f }
            r6.<init>()     // Catch:{ Exception -> 0x007f }
            java.util.LinkedList<te3.oe0> r1 = r1.f140629d     // Catch:{ Exception -> 0x007f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x007f }
        L_0x0051:
            boolean r7 = r1.hasNext()     // Catch:{ Exception -> 0x007f }
            if (r7 == 0) goto L_0x0079
            java.lang.Object r7 = r1.next()     // Catch:{ Exception -> 0x007f }
            te3.oe0 r7 = (te3.C50667oe0) r7     // Catch:{ Exception -> 0x007f }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x007f }
            r8.<init>()     // Catch:{ Exception -> 0x007f }
            java.lang.String r9 = "rid"
            java.lang.String r10 = r7.f139103d     // Catch:{ Exception -> 0x007f }
            r8.put(r9, r10)     // Catch:{ Exception -> 0x007f }
            int r9 = r7.f139105f     // Catch:{ Exception -> 0x007f }
            r8.put(r0, r9)     // Catch:{ Exception -> 0x007f }
            java.lang.String r9 = "mimeType"
            java.lang.String r7 = r7.f139106g     // Catch:{ Exception -> 0x007f }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x007f }
            r6.put(r8)     // Catch:{ Exception -> 0x007f }
            goto L_0x0051
        L_0x0079:
            java.lang.String r0 = "fileList"
            r12.put(r0, r6)     // Catch:{ Exception -> 0x007f }
            goto L_0x008e
        L_0x007f:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r12 = r12.getMessage()
            r0[r2] = r12
            java.lang.String r12 = "errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r12, r0)
            goto L_0x0016
        L_0x008e:
            if (r12 != 0) goto L_0x0091
            return r5
        L_0x0091:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "data"
            r0.put(r1, r12)     // Catch:{ JSONException -> 0x009b }
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C41911e0.mo65754f(java.lang.String):org.json.JSONObject");
    }
}
