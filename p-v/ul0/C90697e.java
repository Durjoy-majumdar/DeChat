package ul0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: ul0.e */
public class C90697e extends C82268c {
    public static final int CTRL_INDEX = 243;
    public static final String NAME = "operateRequestTask";

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010c  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114531v(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r9, org.json.JSONObject r10, int r11, com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o r12) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r1 = "JsApiOperateRequestTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            if (r10 != 0) goto L_0x001a
            java.lang.String r10 = "fail:data is null"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            java.lang.String r9 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r10 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            return
        L_0x001a:
            java.lang.String r0 = "requestTaskId"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0039
            java.lang.String r10 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r12 = "requestTaskId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
            java.lang.String r10 = "fail:requestTaskId is null or nil"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            return
        L_0x0039:
            java.lang.String r1 = "operationType"
            java.lang.String r10 = r10.optString(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 == 0) goto L_0x0058
            java.lang.String r10 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r12 = "operationType is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
            java.lang.String r10 = "fail:operationType is null or nil"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            return
        L_0x0058:
            java.lang.String r1 = "abort"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x015b
            java.util.concurrent.atomic.AtomicInteger r10 = sp0.C90299j.f259242b
            sp0.j r10 = sp0.C90299j.C90301b.f259244a
            java.lang.String r1 = r9.getAppId()
            sp0.h r10 = r10.mo124533a(r1)
            if (r10 != 0) goto L_0x0080
            java.lang.String r10 = "fail:no task"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            java.lang.String r9 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r10 = "request is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
            return
        L_0x0080:
            r1 = 0
            if (r0 != 0) goto L_0x0084
            goto L_0x00a5
        L_0x0084:
            java.util.ArrayList<sp0.i> r2 = r10.f259188a
            monitor-enter(r2)
            java.util.ArrayList<sp0.i> r3 = r10.f259188a     // Catch:{ all -> 0x0158 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0158 }
        L_0x008d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0158 }
            sp0.i r4 = (sp0.C90298i) r4     // Catch:{ all -> 0x0158 }
            java.lang.String r5 = r4.f259225j     // Catch:{ all -> 0x0158 }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x0158 }
            if (r5 == 0) goto L_0x008d
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
            r1 = r4
            goto L_0x00a5
        L_0x00a4:
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
        L_0x00a5:
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x00da
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r1.f259225j
            r5[r3] = r6
            java.lang.String r6 = r10.f259195h
            r5[r4] = r6
            java.lang.String r6 = "MicroMsg.AppBrandNetworkRequest"
            java.lang.String r7 = "lm:try to abortTask taskId:%s, appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            java.util.Set<java.lang.String> r5 = r10.f259189b
            java.lang.String r6 = r1.f259225j
            java.util.concurrent.ConcurrentSkipListSet r5 = (java.util.concurrent.ConcurrentSkipListSet) r5
            r5.add(r6)
            java.lang.String r5 = r1.f259225j
            java.net.HttpURLConnection r6 = r1.f259226k
            r10.mo124512f(r5, r6)
            java.lang.String r10 = r1.f259227l
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x00d8
            java.lang.String r10 = r1.f259227l
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(r10)
        L_0x00d8:
            r10 = 1
            goto L_0x00ee
        L_0x00da:
            java.util.Set<java.lang.String> r1 = r10.f259190c
            java.util.concurrent.ConcurrentSkipListSet r1 = (java.util.concurrent.ConcurrentSkipListSet) r1
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x00e6
            r10 = 0
            goto L_0x00ee
        L_0x00e6:
            java.util.Set<java.lang.String> r10 = r10.f259189b
            java.util.concurrent.ConcurrentSkipListSet r10 = (java.util.concurrent.ConcurrentSkipListSet) r10
            r10.add(r0)
            goto L_0x00d8
        L_0x00ee:
            if (r10 != 0) goto L_0x010c
            java.lang.String r10 = "fail:no task"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            java.lang.String r10 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r11 = "requestInfo is null requestTaskId:%s, appId:%s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r0
            java.lang.String r9 = r9.getAppId()
            r12[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r11, r12)
            return
        L_0x010c:
            java.lang.String r10 = "ok"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r11 = "requestTaskId"
            r10.put(r11, r0)
            java.lang.String r11 = "state"
            java.lang.String r1 = "fail"
            r10.put(r11, r1)
            java.lang.String r11 = "errMsg"
            java.lang.String r1 = "abort"
            r10.put(r11, r1)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r10)
            java.lang.String r10 = r11.toString()
            ul0.a$b r11 = new ul0.a$b
            r11.<init>()
            r11.mo115161k(r9)
            r11.mo115163m(r10)
            r11.mo115159i(r12)
            java.lang.String r10 = "MicroMsg.JsApiOperateRequestTask"
            java.lang.String r11 = "abortTask finish requestId:%s, appId:%s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r0
            java.lang.String r9 = r9.getAppId()
            r12[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            goto L_0x0164
        L_0x0158:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
            throw r9
        L_0x015b:
            java.lang.String r10 = "fail:unknown operationType"
            java.lang.String r10 = r8.mo115109j(r10)
            r9.mo109647a(r11, r10)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ul0.C90697e.mo114531v(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int, com.tencent.mm.plugin.appbrand.jsruntime.o):void");
    }
}
