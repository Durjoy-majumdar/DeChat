package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82366d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86918c;
import gt0.C87340f;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.q */
public abstract class C82197q extends C82268c<C81879g> implements C82366d<C81879g> {

    /* renamed from: g */
    public boolean f241066g = false;

    /* renamed from: z */
    public static LinkedList<C87340f.C87345c> m100917z(LinkedList<C90437rw3> linkedList) {
        LinkedList<C87340f.C87345c> linkedList2 = new LinkedList<>();
        Iterator<C90437rw3> it = linkedList.iterator();
        while (it.hasNext()) {
            C90437rw3 next = it.next();
            C87340f.C87345c cVar = new C87340f.C87345c();
            cVar.f253134a = next.f259822d;
            cVar.f253136c = next.f259823e;
            cVar.f253135b = next.f259824f;
            linkedList2.add(cVar);
        }
        return linkedList2;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [wi0.l] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r2 = r4.f234876S0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114544c(com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6<com.tencent.p014mm.plugin.appbrand.C81879g> r8) {
        /*
            r7 = this;
            ENV r0 = r8.f242916b
            com.tencent.mm.plugin.appbrand.g r0 = (com.tencent.p014mm.plugin.appbrand.C81879g) r0
            org.json.JSONObject r1 = r8.f242917c
            java.lang.String r2 = "keepAlive"
            r3 = 0
            boolean r2 = r1.optBoolean(r2, r3)
            r7.f241066g = r2
            java.lang.String r2 = "requestInQueue"
            r3 = 1
            boolean r2 = r1.optBoolean(r2, r3)
            java.lang.String r3 = "adOperateWXData"
            java.lang.String r4 = r7.mo114779e()
            boolean r3 = r3.equalsIgnoreCase(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0028
            r7.mo114534w(r8, r4)
            return
        L_0x0028:
            java.lang.String r3 = "wxdataQueueTimestamp"
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ JSONException -> 0x0033 }
            r1.put(r3, r5)     // Catch:{ JSONException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            if (r2 != 0) goto L_0x0087
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getRuntime()
            if (r0 != 0) goto L_0x003f
            com.tencent.mm.plugin.appbrand.jsapi.auth.e r0 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82124b.f240898h
            goto L_0x0080
        L_0x003f:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.auth.b> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82124b.f240897g
            monitor-enter(r1)
            java.lang.String r2 = r0.f238147j     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0084 }
            com.tencent.mm.plugin.appbrand.jsapi.auth.b r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82124b) r2     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x007e
            wi0.l r2 = r0.mo113051d0()     // Catch:{ all -> 0x0084 }
            boolean r3 = r2 instanceof com.tencent.luggage.sdk.config.AppBrandSysConfigLU     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0057
            r4 = r2
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r4 = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) r4     // Catch:{ all -> 0x0084 }
        L_0x0057:
            if (r4 == 0) goto L_0x0060
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r2 = r4.f234876S0     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x0060
            int r2 = r2.f239291N     // Catch:{ all -> 0x0084 }
            goto L_0x0062
        L_0x0060:
            r2 = 10
        L_0x0062:
            com.tencent.mm.plugin.appbrand.jsapi.auth.b r3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.b     // Catch:{ all -> 0x0084 }
            r3.<init>(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = r0.f238147j     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "runtime.appId"
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ all -> 0x0084 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0084 }
            li0.c r2 = r0.f238113K     // Catch:{ all -> 0x0084 }
            com.tencent.mm.plugin.appbrand.jsapi.auth.c r4 = new com.tencent.mm.plugin.appbrand.jsapi.auth.c     // Catch:{ all -> 0x0084 }
            r4.<init>(r0)     // Catch:{ all -> 0x0084 }
            r2.mo122978a(r4)     // Catch:{ all -> 0x0084 }
            r0 = r3
            goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            monitor-exit(r1)
        L_0x0080:
            r0.mo114560c(r7, r8)
            return
        L_0x0084:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x0087:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getRuntime()
            if (r0 == 0) goto L_0x00bc
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.auth.f> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f.f240958h
            boolean r1 = r0.mo113064k0()
            if (r1 != 0) goto L_0x00bc
            boolean r1 = r0.f238117P
            if (r1 == 0) goto L_0x009a
            goto L_0x00bc
        L_0x009a:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.auth.f> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f.f240958h
            monitor-enter(r1)
            java.lang.String r2 = r0.f238147j     // Catch:{ all -> 0x00b9 }
            r3 = r1
            u.i r3 = (p1042u.C111059i) r3     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = r3.getOrDefault(r2, r4)     // Catch:{ all -> 0x00b9 }
            com.tencent.mm.plugin.appbrand.jsapi.auth.f r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f) r2     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x00b7
            com.tencent.mm.plugin.appbrand.jsapi.auth.f r2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.f     // Catch:{ all -> 0x00b9 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = r0.f238147j     // Catch:{ all -> 0x00b9 }
            r3 = r1
            u.i r3 = (p1042u.C111059i) r3     // Catch:{ all -> 0x00b9 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x00b7:
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x00be
        L_0x00b9:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            throw r8
        L_0x00bc:
            com.tencent.mm.plugin.appbrand.jsapi.auth.e r2 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f.f240959i
        L_0x00be:
            r2.mo114560c(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82197q.mo114544c(com.tencent.mm.plugin.appbrand.jsapi.x6):void");
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        C81879g gVar = (C81879g) fVar;
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public abstract void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar);

    @Deprecated
    /* renamed from: x */
    public void mo114601x(C82554k kVar, int i, String str) {
        kVar.mo109647a(i, mo115109j(str));
    }

    /* renamed from: y */
    public void mo114602y(C82554k kVar, int i, String str, C86918c cVar) {
        if (Util.isNullOrNil(str)) {
            kVar.mo109647a(i, mo115111l((String) null, cVar, (JSONObject) null));
        } else {
            kVar.mo109647a(i, mo115111l(str, cVar, (JSONObject) null));
        }
    }
}
