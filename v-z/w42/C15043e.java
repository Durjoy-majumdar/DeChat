package w42;

import e42.C7594e;
import e42.C86430i;
import java.util.LinkedList;
import org.json.JSONArray;

/* renamed from: w42.e */
public final class C15043e<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "preloadMiniProgramContacts";
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18q(e42.C7596h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "userNames"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L_0x0045
            java.lang.Object r3 = r3.opt(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x003a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0022 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0022 }
            java.util.LinkedList r3 = r2.mo14068r(r0)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0053
        L_0x0022:
            r3 = move-exception
            fy3.l r0 = r2.mo120840p()
            e42.g r1 = e42.C31415g.C7595b.f25864c
            e42.h r1 = r2.mo120843h(r1)
            r0.invoke(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "MicroMsg.MBJsApiPreloadMiniProgramContacts"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            return
        L_0x003a:
            boolean r0 = r3 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0052
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.LinkedList r3 = r2.mo14068r(r3)
            goto L_0x0053
        L_0x0045:
            fy3.l r3 = r2.mo120840p()
            e42.g r0 = e42.C31415g.C7595b.f25865d
            e42.h r0 = r2.mo120843h(r0)
            r3.invoke(r0)
        L_0x0052:
            r3 = 0
        L_0x0053:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r0 != 0) goto L_0x0070
            java.lang.Class<kr0.n0> r0 = kr0.C10403n0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.n0 r0 = (kr0.C10403n0) r0
            r0.a30(r3)
            fy3.l r3 = r2.mo120840p()
            e42.h r0 = r2.mo120844i()
            r3.invoke(r0)
            goto L_0x007d
        L_0x0070:
            fy3.l r3 = r2.mo120840p()
            e42.g r0 = e42.C31415g.C7595b.f25865d
            e42.h r0 = r2.mo120843h(r0)
            r3.invoke(r0)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w42.C15043e.mo18q(e42.h):void");
    }

    /* renamed from: r */
    public final LinkedList<String> mo14068r(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return new LinkedList<>();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            linkedList.add(jSONArray.optString(i));
        }
        return linkedList;
    }
}
