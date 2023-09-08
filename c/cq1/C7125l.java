package cq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C64175a0;

/* renamed from: cq1.l */
public final class C7125l {

    /* renamed from: a */
    public static final C7125l f25089a = new C7125l();

    /* renamed from: a */
    public final void mo8290a(C72994y1.C72995a aVar, String str) {
        boolean z;
        C87412m.m108594g(aVar, "key");
        C87412m.m108594g(str, "username");
        List<C7124k> b = mo8291b(mo8292c(aVar));
        ArrayList arrayList = (ArrayList) b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C87412m.m108589b(((C7124k) it.next()).f25087a, str)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            Iterator it4 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                } else if (C87412m.m108589b(((C7124k) it4.next()).f25087a, str)) {
                    break;
                } else {
                    i++;
                }
            }
            arrayList.remove(i);
        }
        arrayList.add(0, new C7124k(str, C31543z5.m39451a()));
        if (arrayList.size() > 5) {
            C64175a0.m75515w(b);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            C7124k kVar = (C7124k) it5.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", kVar.f25087a);
                jSONObject.put("time", kVar.f25088b);
            } catch (Throwable th) {
                Log.m105921e("Finder.RecentAtLogic", "addToRecentAt error: %s", th.getMessage());
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "jsonArr.toString()");
        Log.m105924i("Finder.RecentAtLogic", "addToRecentAt recentAt list: " + jSONArray2);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONArray2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<cq1.C7124k> mo8291b(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x000c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        L_0x000c:
            r0 = 0
            r1 = 1
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0076 }
            r2.<init>(r13)     // Catch:{ all -> 0x0076 }
            int r13 = r2.length()     // Catch:{ all -> 0x0076 }
            if (r13 <= 0) goto L_0x0086
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            r13.<init>()     // Catch:{ all -> 0x0076 }
            int r3 = r2.length()     // Catch:{ all -> 0x0076 }
            r4 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x0075
            org.json.JSONObject r5 = r2.optJSONObject(r4)     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x0072
            cq1.k r6 = new cq1.k     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.optString(r7)     // Catch:{ all -> 0x0076 }
            if (r7 != 0) goto L_0x0037
            java.lang.String r7 = ""
        L_0x0037:
            java.lang.String r8 = "time"
            long r8 = r5.optLong(r8)     // Catch:{ all -> 0x0076 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0076 }
            long r7 = r6.f25088b     // Catch:{ all -> 0x0076 }
            long r9 = eb0.C31543z5.m39451a()     // Catch:{ all -> 0x0076 }
            long r9 = r9 - r7
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 / r7
            r7 = 0
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x006c
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0076 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ all -> 0x0076 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_finder_recent_at_valid_days     // Catch:{ all -> 0x0076 }
            r11 = 365(0x16d, float:5.11E-43)
            int r7 = r7.mo58779Qe(r8, r11)     // Catch:{ all -> 0x0076 }
            long r7 = (long) r7     // Catch:{ all -> 0x0076 }
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x006a
            if (r5 <= 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r5 = 0
            goto L_0x006d
        L_0x006c:
            r5 = 1
        L_0x006d:
            if (r5 == 0) goto L_0x0072
            r13.add(r6)     // Catch:{ all -> 0x0076 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0075:
            return r13
        L_0x0076:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r1[r0] = r13
            java.lang.String r13 = "Finder.RecentAtLogic"
            java.lang.String r0 = "optListFromJSONStr err! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r1)
        L_0x0086:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cq1.C7125l.mo8291b(java.lang.String):java.util.List");
    }

    /* renamed from: c */
    public final String mo8292c(C72994y1.C72995a aVar) {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        String nullAsNil = Util.nullAsNil((String) f);
        C87412m.m108593f(nullAsNil, "nullAsNil((MMKernel.stor….get(key, \"\") as String))");
        return nullAsNil;
    }
}
