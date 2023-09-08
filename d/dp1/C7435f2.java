package dp1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import p185kq.C10383h;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: dp1.f2 */
public final class C7435f2 {

    /* renamed from: a */
    public static final C7435f2 f25626a = new C7435f2();

    /* renamed from: e */
    public static /* synthetic */ void m7551e(C7435f2 f2Var, C49712hj1 hj12, String str, boolean z, long j, JSONObject jSONObject, String str2, int i, Object obj) {
        f2Var.mo8579c(hj12, str, z, j, (i & 16) != 0 ? null : jSONObject, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r13 = r13.toString();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8577a(te3.C49712hj1 r10, java.lang.String r11, int r12, org.json.JSONObject r13) {
        /*
            r9 = this;
            java.lang.String r0 = "eid"
            gy3.C87412m.m108594g(r11, r0)
            r0 = 0
            java.lang.String r1 = ""
            if (r13 == 0) goto L_0x0019
            java.lang.String r13 = r13.toString()
            if (r13 == 0) goto L_0x0019
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r13 = z04.C112551y.m153814n(r13, r2, r3, r0)
            goto L_0x001a
        L_0x0019:
            r13 = r1
        L_0x001a:
            if (r10 == 0) goto L_0x0020
            java.lang.String r2 = r10.f134670d
            if (r2 != 0) goto L_0x002f
        L_0x0020:
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.i r2 = (h81.C59774i) r2
            java.lang.String r2 = r2.mo84751Wb()
            if (r2 != 0) goto L_0x002f
            r2 = r1
        L_0x002f:
            if (r10 == 0) goto L_0x0035
            java.lang.String r3 = r10.f134671e
            if (r3 != 0) goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            if (r10 == 0) goto L_0x003b
            int r4 = r10.f134675i
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x0042
            java.lang.String r5 = r10.f134672f
            if (r5 != 0) goto L_0x0043
        L_0x0042:
            r5 = r1
        L_0x0043:
            if (r10 == 0) goto L_0x0048
            int r6 = r10.f134677n
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r10 == 0) goto L_0x0051
            java.lang.String r10 = r10.f134686w
            if (r10 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = r10
        L_0x0051:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = "report 21875 sessionId:"
            r10.append(r7)
            r10.append(r2)
            java.lang.String r7 = ", contextId:"
            r10.append(r7)
            r10.append(r3)
            java.lang.String r7 = ", commentScene:"
            r10.append(r7)
            r10.append(r4)
            java.lang.String r7 = ", eventCode:"
            r10.append(r7)
            r10.append(r12)
            java.lang.String r7 = ", eid:"
            r10.append(r7)
            r10.append(r11)
            java.lang.String r7 = ", udf_kv:"
            r10.append(r7)
            r10.append(r13)
            java.lang.String r7 = ", clickTabContextId:"
            r10.append(r7)
            r10.append(r5)
            java.lang.String r7 = " jumpId="
            r10.append(r7)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.lang.String r7 = "report21875"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 21875(0x5573, float:3.0653E-41)
            r8 = 10
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r2
            r0 = 1
            r8[r0] = r3
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8[r0] = r2
            r0 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r0] = r12
            r12 = 4
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r8[r12] = r0
            r12 = 5
            r8[r12] = r11
            r11 = 6
            r8[r11] = r13
            r11 = 7
            r8[r11] = r5
            r11 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r8[r11] = r12
            r11 = 9
            r8[r11] = r1
            r10.mo160131h(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C7435f2.mo8577a(te3.hj1, java.lang.String, int, org.json.JSONObject):void");
    }

    /* renamed from: b */
    public final void mo8578b(C49712hj1 hj12, String str, boolean z, long j, String str2) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(str2, "taskid");
        if (hj12 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j));
            jSONObject.put("taskid", str2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            Log.m105924i("report21875", "report 21875 taskid:" + str2 + " sessionId:" + hj12.f134670d + ", contextId:" + hj12.f134671e + ", commentScene:" + hj12.f134675i + ", expose:" + z + ", eid:" + str + ", udf_kv:" + n + ", clickTabContextId:" + hj12.f134672f);
            C115669n.INSTANCE.mo160131h(21875, hj12.f134670d, hj12.f134671e, Integer.valueOf(hj12.f134675i), Integer.valueOf(z ^ true ? 1 : 0), String.valueOf(System.currentTimeMillis()), str, n, hj12.f134672f, Integer.valueOf(hj12.f134677n), hj12.f134686w);
        }
    }

    /* renamed from: c */
    public final void mo8579c(C49712hj1 hj12, String str, boolean z, long j, JSONObject jSONObject, String str2) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(str2, "sessionBuffer");
        if (hj12 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("feedid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObj.apply {\n        …\n            }.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            Log.m105924i("report21875", "report 21875 sessionId:" + hj12.f134670d + ", contextId:" + hj12.f134671e + ", commentScene:" + hj12.f134675i + ", expose:" + z + ", eid:" + str + ", udf_kv:" + n + ", clickTabContextId:" + hj12.f134672f + ", sessionBuffer:" + str2);
            C115669n.INSTANCE.mo160131h(21875, hj12.f134670d, hj12.f134671e, Integer.valueOf(hj12.f134675i), Integer.valueOf(z ^ true ? 1 : 0), String.valueOf(System.currentTimeMillis()), str, n, hj12.f134672f, Integer.valueOf(hj12.f134677n), hj12.f134686w, str2);
        }
    }

    /* renamed from: d */
    public final void mo8580d(C49712hj1 hj12, String str, boolean z, JSONObject jSONObject) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(jSONObject, "udfKv");
        if (hj12 != null) {
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "udfKv.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            Log.m105924i("report21875", "report 21875 sessionId:" + hj12.f134670d + ", contextId:" + hj12.f134671e + ", commentScene:" + hj12.f134675i + ", isClick:" + z + ", eid:" + str + ", udf_kv:" + n + ", clickTabContextId:" + hj12.f134672f + " jumpId:" + hj12.f134686w);
            C115669n.INSTANCE.mo160131h(21875, hj12.f134670d, hj12.f134671e, Integer.valueOf(hj12.f134675i), Integer.valueOf(z ? 1 : 0), String.valueOf(System.currentTimeMillis()), str, n, hj12.f134672f, Integer.valueOf(hj12.f134677n), hj12.f134686w);
        }
    }
}
