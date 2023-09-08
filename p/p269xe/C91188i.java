package p269xe;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xe.i */
public final class C91188i {

    /* renamed from: a */
    public static final C91188i f261450a = new C91188i();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo125244a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -2021012075(0xffffffff8789cd95, float:-2.07343E-34)
            if (r0 == r1) goto L_0x0028
            r1 = 2035172(0x1f0de4, float:2.851883E-39)
            if (r0 == r1) goto L_0x001d
            r1 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r0 == r1) goto L_0x0014
            goto L_0x0030
        L_0x0014:
            java.lang.String r0 = "HIGH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0033
            goto L_0x0030
        L_0x001d:
            java.lang.String r0 = "BEST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            r3 = 0
            goto L_0x0035
        L_0x0028:
            java.lang.String r0 = "MIDDLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0033
        L_0x0030:
            r3 = 20
            goto L_0x0035
        L_0x0033:
            r3 = 10
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.C91188i.mo125244a(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo125245b(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -2021012075(0xffffffff8789cd95, float:-2.07343E-34)
            if (r0 == r1) goto L_0x0028
            r1 = 2035172(0x1f0de4, float:2.851883E-39)
            if (r0 == r1) goto L_0x001d
            r1 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r0 == r1) goto L_0x0014
            goto L_0x0030
        L_0x0014:
            java.lang.String r0 = "HIGH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0032
            goto L_0x0030
        L_0x001d:
            java.lang.String r0 = "BEST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            r3 = 0
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "MIDDLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0032
        L_0x0030:
            r3 = 6
            goto L_0x0033
        L_0x0032:
            r3 = 3
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.C91188i.mo125245b(java.lang.String):int");
    }

    /* renamed from: c */
    public final boolean mo125246c(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        return C112550d0.m153801u(str, "FinderLiveVisitorWithoutAffinityUI", false) || C112550d0.m153801u(str, "FinderLiveVisitorAffinityUI", false);
    }

    /* renamed from: d */
    public final void mo125247d(String str, JSONObject jSONObject) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(jSONObject, "content");
        if (mo125246c(str)) {
            long optLong = jSONObject.optLong("cost");
            String optString = jSONObject.optString("stack");
            String optString2 = jSONObject.optString("stackKey");
            Log.m105924i("MicroMsg.MatrixFinderReporter", "onEvilMethod stackCost:" + optLong);
            Log.m105924i("MicroMsg.MatrixFinderReporter", "onEvilMethod stack:" + optString);
            Log.m105924i("MicroMsg.MatrixFinderReporter", "onEvilMethod stackKey:" + optString2);
            jSONObject.remove("cost");
            jSONObject.remove("stack");
            jSONObject.remove("stackKey");
            C115669n nVar = C115669n.INSTANCE;
            C87412m.m108593f(optString, "stack");
            C87412m.m108593f(optString2, "stackKey");
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "content.toString()");
            nVar.mo160131h(26388, Long.valueOf(optLong), -1, C112551y.m153814n(C112551y.m153814n(optString, ",", ";", false), "\n", "|", false), C112551y.m153814n(C112551y.m153814n(optString2, ",", ";", false), "\n", "|", false), BuildInfo.REV, AppForegroundDelegate.INSTANCE.mo174210c(), C112551y.m153814n(C112551y.m153814n(jSONObject2, ",", ";", false), "\n", "|", false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo125248e(java.lang.String r25, org.json.JSONObject r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.String r3 = "scene"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "content"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = "SnsTimeLineUI"
            r4 = 0
            r5 = 2
            r6 = 0
            boolean r7 = z04.C112551y.m153808h(r1, r3, r4, r5, r6)
            java.lang.String r8 = "FinderLiveAnchorAffinityUI"
            java.lang.String r9 = "FinderLiveAnchorWithoutAffinityUI"
            java.lang.String r10 = "ChattingUI"
            java.lang.String r11 = "ChattingUIFragment"
            java.lang.String r12 = "AddressUIFragment"
            java.lang.String r13 = "Finder"
            if (r7 != 0) goto L_0x0061
            boolean r7 = z04.C112550d0.m153801u(r1, r13, r4)
            if (r7 != 0) goto L_0x0061
            boolean r7 = z04.C112551y.m153808h(r1, r12, r4, r5, r6)
            if (r7 != 0) goto L_0x0061
            boolean r7 = z04.C112551y.m153808h(r1, r11, r4, r5, r6)
            if (r7 != 0) goto L_0x0043
            boolean r7 = z04.C112551y.m153808h(r1, r10, r4, r5, r6)
            if (r7 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r7 = 0
            goto L_0x0044
        L_0x0043:
            r7 = 1
        L_0x0044:
            if (r7 != 0) goto L_0x0061
            boolean r7 = z04.C112550d0.m153801u(r1, r9, r4)
            if (r7 != 0) goto L_0x0055
            boolean r7 = z04.C112550d0.m153801u(r1, r8, r4)
            if (r7 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r7 = 0
            goto L_0x0056
        L_0x0055:
            r7 = 1
        L_0x0056:
            if (r7 != 0) goto L_0x0061
            boolean r7 = r24.mo125246c(r25)
            if (r7 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r7 = 0
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            if (r7 != 0) goto L_0x0065
            return
        L_0x0065:
            java.lang.String r7 = "fps"
            double r5 = r2.getDouble(r7)
            java.lang.String r7 = "machine"
            java.lang.String r7 = r2.getString(r7)
            java.lang.String r15 = "content.getString(DeviceUtil.DEVICE_MACHINE)"
            gy3.C87412m.m108593f(r7, r15)
            java.lang.String r15 = "dropLevel"
            org.json.JSONObject r2 = r2.getJSONObject(r15)
            java.lang.String r15 = "content.getJSONObject(Sh…ginInfo.ISSUE_DROP_LEVEL)"
            gy3.C87412m.m108593f(r2, r15)
            java.lang.String r15 = "DROPPED_BEST"
            r2.getInt(r15)
            java.lang.String r15 = "DROPPED_NORMAL"
            int r15 = r2.getInt(r15)
            java.lang.String r14 = "DROPPED_MIDDLE"
            int r14 = r2.getInt(r14)
            java.lang.String r4 = "DROPPED_HIGH"
            int r4 = r2.getInt(r4)
            r16 = r13
            java.lang.String r13 = "DROPPED_FROZEN"
            int r2 = r2.getInt(r13)
            int r13 = r15 + r14
            int r13 = r13 + r4
            int r13 = r13 + r2
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = r8
            float r8 = (float) r15
            float r8 = r8 * r17
            float r13 = (float) r13
            float r8 = r8 / r13
            r17 = 1096810496(0x41600000, float:14.0)
            r26 = r15
            float r15 = (float) r14
            float r15 = r15 * r17
            float r15 = r15 / r13
            float r8 = r8 + r15
            r15 = 1103626240(0x41c80000, float:25.0)
            r17 = r14
            float r14 = (float) r4
            float r14 = r14 * r15
            float r14 = r14 / r13
            float r8 = r8 + r14
            r14 = 1114636288(0x42700000, float:60.0)
            float r15 = (float) r2
            float r15 = r15 * r14
            float r15 = r15 / r13
            float r8 = r8 + r15
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r14 = "FinderHomeUI"
            r15 = 0
            boolean r14 = z04.C112550d0.m153801u(r1, r14, r15)
            if (r14 != 0) goto L_0x00df
            java.lang.String r14 = "FinderHomeAffinityUI"
            boolean r14 = z04.C112550d0.m153801u(r1, r14, r15)
            if (r14 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r14 = 0
            goto L_0x00e0
        L_0x00df:
            r14 = 1
        L_0x00e0:
            r19 = 5
            r20 = 3
            r21 = 4
            r22 = r9
            r23 = r10
            r9 = 1
            r15 = 1343(0x53f, float:1.882E-42)
            if (r14 == 0) goto L_0x013b
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r15)
            int r11 = r0.mo125244a(r7)
            r12 = 0
            int r11 = r11 + r12
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r15)
            int r11 = r0.mo125244a(r7)
            r12 = 1
            int r11 = r11 + r12
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r15)
            int r11 = r0.mo125244a(r7)
            int r11 = r11 + 4
            r3.SetKey(r11)
            r3.SetValue(r9)
            r13.add(r3)
            r9 = r26
            goto L_0x034d
        L_0x013b:
            r9 = 0
            r14 = 0
            r15 = 2
            boolean r3 = z04.C112551y.m153808h(r1, r3, r9, r15, r14)
            r9 = r26
            r10 = 1343(0x53f, float:1.882E-42)
            if (r3 == 0) goto L_0x0193
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 30
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 31
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125245b(r7)
            int r10 = r10 + 32
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
            goto L_0x034d
        L_0x0193:
            r3 = 0
            r14 = 2
            r15 = 0
            boolean r11 = z04.C112551y.m153808h(r1, r11, r15, r14, r3)
            if (r11 != 0) goto L_0x01a7
            r11 = r23
            boolean r11 = z04.C112551y.m153808h(r1, r11, r15, r14, r3)
            if (r11 == 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            r3 = 0
            goto L_0x01a8
        L_0x01a7:
            r3 = 1
        L_0x01a8:
            if (r3 == 0) goto L_0x01f5
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 50
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 51
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125245b(r7)
            int r10 = r10 + 52
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
            goto L_0x034d
        L_0x01f5:
            r3 = 0
            r11 = 2
            r14 = 0
            boolean r3 = z04.C112551y.m153808h(r1, r12, r14, r11, r3)
            if (r3 == 0) goto L_0x0249
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 70
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 71
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125245b(r7)
            int r10 = r10 + 72
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
            goto L_0x034d
        L_0x0249:
            boolean r3 = r24.mo125246c(r25)
            if (r3 == 0) goto L_0x029a
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 110
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 111
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125245b(r7)
            int r10 = r10 + 112
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
            goto L_0x034d
        L_0x029a:
            r3 = r22
            r11 = 0
            boolean r3 = z04.C112550d0.m153801u(r1, r3, r11)
            if (r3 != 0) goto L_0x02ae
            r3 = r18
            boolean r3 = z04.C112550d0.m153801u(r1, r3, r11)
            if (r3 == 0) goto L_0x02ac
            goto L_0x02ae
        L_0x02ac:
            r3 = 0
            goto L_0x02af
        L_0x02ae:
            r3 = 1
        L_0x02af:
            if (r3 == 0) goto L_0x02fb
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 130
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125245b(r7)
            int r11 = r11 + 131
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125245b(r7)
            int r10 = r10 + 132
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
            goto L_0x034d
        L_0x02fb:
            r3 = r16
            r11 = 0
            boolean r3 = z04.C112550d0.m153801u(r1, r3, r11)
            if (r3 == 0) goto L_0x034d
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125244a(r7)
            r12 = 2
            int r11 = r11 + r12
            r3.SetKey(r11)
            long r11 = (long) r5
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r11 = r0.mo125244a(r7)
            int r11 = r11 + 3
            r3.SetKey(r11)
            long r11 = (long) r8
            r3.SetValue(r11)
            r13.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r3.SetID(r10)
            int r10 = r0.mo125244a(r7)
            int r10 = r10 + 5
            r3.SetKey(r10)
            r10 = 1
            r3.SetValue(r10)
            r13.add(r3)
        L_0x034d:
            boolean r3 = r13.isEmpty()
            r10 = 1
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x0390
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 0
            r3.mo160124a(r13, r11)
            r12 = 19508(0x4c34, float:2.7337E-41)
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            long r5 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r13[r11] = r5
            r13[r10] = r7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 2
            r13[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r13[r20] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r21] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13[r19] = r2
            r2 = 6
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            r13[r2] = r4
            r2 = 7
            r13[r2] = r1
            r3.mo160131h(r12, r13)
        L_0x0390:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.C91188i.mo125248e(java.lang.String, org.json.JSONObject):void");
    }
}
