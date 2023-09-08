package aa1;

import com.tencent.p014mm.autogen.events.HellSessionIdEvent;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import z91.C23462b;

/* renamed from: aa1.f */
public final class C112764f {
    /* renamed from: a */
    public static String m154258a(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("_");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return C115411b.m162225h(str);
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        return C115411b.m162225h(substring) + "_" + substring2;
    }

    /* renamed from: b */
    public static void m154259b(String str) {
        String d = C23462b.m28021f().mo36920d();
        C91980d.vx0().getClass();
        Log.m105925i("MicroMsg.HellBizService", "HABBYGE-MALI, notifyGetSessionId: requestId:%s, sessionId:%s", str, d);
        HellSessionIdEvent hellSessionIdEvent = new HellSessionIdEvent();
        HellSessionIdEvent.C24256a aVar = hellSessionIdEvent.f69423d;
        aVar.f69424a = str;
        aVar.f69425b = d;
        hellSessionIdEvent.publish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x038e, code lost:
        if (r10 != false) goto L_0x0390;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027e A[LOOP:5: B:109:0x0278->B:111:0x027e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0596 A[LOOP:13: B:250:0x0590->B:252:0x0596, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m154260c() {
        /*
            z91.b r1 = z91.C23462b.m28021f()
            r1.getClass()
            boolean r0 = d91.C20449a.m22052d()
            java.lang.String r2 = "HABBYGE-MALI.FuzzyMatchedBackup"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0125
            boolean r0 = d91.C20449a.m22053e()
            if (r0 == 0) goto L_0x0125
            int r0 = e91.C116711b.m164584i()
            if (r0 != 0) goto L_0x0020
            goto L_0x0125
        L_0x0020:
            java.lang.String r0 = "mmkv_sionId_table_hell"
            byte[] r0 = f91.C116850b.m164831a(r0)
            if (r0 == 0) goto L_0x0049
            int r6 = r0.length
            if (r6 != 0) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            te3.z14 r6 = new te3.z14
            r6.<init>()
            r6.parseFrom(r0)     // Catch:{ IOException -> 0x003a }
            goto L_0x004a
        L_0x003a:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r7 = r6.getMessage()
            r0[r3] = r7
            java.lang.String r7 = "SessionTable, _read: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r6, r7, r0)
        L_0x0049:
            r6 = r4
        L_0x004a:
            r0 = 2
            if (r6 == 0) goto L_0x00b6
            java.util.LinkedList<java.lang.String> r7 = r6.f145632d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0056
            goto L_0x00b6
        L_0x0056:
            java.util.LinkedList<java.lang.String> r1 = r6.f145632d
            int r1 = r1.size()
            if (r1 >= r0) goto L_0x0074
            java.util.LinkedList<java.lang.String> r0 = r6.f145632d
            java.lang.Object r0 = r0.getLast()
            java.lang.String r0 = (java.lang.String) r0
            java.util.LinkedList<java.lang.String> r1 = r6.f145632d
            java.lang.Object r1 = r1.getLast()
            java.lang.String r1 = (java.lang.String) r1
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            goto L_0x0126
        L_0x0074:
            if (r1 != r0) goto L_0x008d
            java.util.LinkedList<java.lang.String> r7 = r6.f145632d
            java.lang.Object r7 = r7.getLast()
            java.lang.String r7 = (java.lang.String) r7
            java.util.LinkedList<java.lang.String> r6 = r6.f145632d
            int r1 = r1 - r0
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            goto L_0x0126
        L_0x008d:
            java.util.LinkedList<java.lang.String> r7 = r6.f145632d
            java.lang.Object r7 = r7.getLast()
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r1 - r0
            r0 = r7
        L_0x0097:
            if (r1 < 0) goto L_0x00b0
            java.util.LinkedList<java.lang.String> r0 = r6.f145632d
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r8 = r7.equals(r0)
            if (r8 != 0) goto L_0x00ad
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            goto L_0x0126
        L_0x00ad:
            int r1 = r1 + -1
            goto L_0x0097
        L_0x00b0:
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            goto L_0x0126
        L_0x00b6:
            te3.gg2 r6 = ba1.C16777c.m16416h()
            if (r6 != 0) goto L_0x00bd
            goto L_0x0125
        L_0x00bd:
            java.util.LinkedList<te3.ka3> r7 = r6.f354028f
            int r7 = r7.size()
            if (r7 > 0) goto L_0x00ca
            android.util.Pair r0 = r1.mo36922g(r4, r4, r6)
            goto L_0x0126
        L_0x00ca:
            if (r7 >= r0) goto L_0x00d9
            java.util.LinkedList<te3.ka3> r0 = r6.f354028f
            java.lang.Object r0 = r0.getLast()
            te3.ka3 r0 = (te3.C22505ka3) r0
            android.util.Pair r0 = r1.mo36922g(r0, r4, r6)
            goto L_0x0126
        L_0x00d9:
            if (r7 != r0) goto L_0x00fb
            java.util.LinkedList<te3.ka3> r0 = r6.f354028f
            java.lang.Object r0 = r0.getLast()
            te3.ka3 r0 = (te3.C22505ka3) r0
            java.util.LinkedList<te3.ka3> r7 = r6.f354028f
            java.lang.Object r7 = r7.get(r3)
            te3.ka3 r7 = (te3.C22505ka3) r7
            java.lang.String r8 = r0.f64087d
            java.lang.String r9 = r7.f64087d
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f6
            r7 = r4
        L_0x00f6:
            android.util.Pair r0 = r1.mo36922g(r0, r7, r6)
            goto L_0x0126
        L_0x00fb:
            java.util.LinkedList<te3.ka3> r8 = r6.f354028f
            java.lang.Object r8 = r8.getLast()
            te3.ka3 r8 = (te3.C22505ka3) r8
            int r7 = r7 - r0
        L_0x0104:
            if (r7 < 0) goto L_0x0120
            java.util.LinkedList<te3.ka3> r0 = r6.f354028f
            java.lang.Object r0 = r0.get(r7)
            te3.ka3 r0 = (te3.C22505ka3) r0
            java.lang.String r9 = r8.f64087d
            java.lang.String r10 = r0.f64087d
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x011d
            android.util.Pair r0 = r1.mo36922g(r8, r0, r6)
            goto L_0x0126
        L_0x011d:
            int r7 = r7 + -1
            goto L_0x0104
        L_0x0120:
            android.util.Pair r0 = r1.mo36922g(r8, r4, r6)
            goto L_0x0126
        L_0x0125:
            r0 = r4
        L_0x0126:
            if (r0 != 0) goto L_0x0129
            return r4
        L_0x0129:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = m154258a(r1)
            r0.append(r6)
            java.lang.String r13 = "#"
            r0.append(r13)
            java.util.List r6 = ca1.C113264b.m155060f(r1)
            if (r6 == 0) goto L_0x0262
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0153
            goto L_0x0262
        L_0x0153:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            java.lang.String r7 = r7.mo175244a(r1)
            if (r7 != 0) goto L_0x015d
            goto L_0x0218
        L_0x015d:
            java.util.List r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162223f(r7, r5)
            if (r7 == 0) goto L_0x0218
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x016b
            goto L_0x0218
        L_0x016b:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0174:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0219
            java.lang.Object r9 = r6.next()
            te3.eg2 r9 = (te3.C118427eg2) r9
            java.util.Map r10 = ea1.C116717f.m164611d(r9, r7)
            if (r10 != 0) goto L_0x0187
            goto L_0x0174
        L_0x0187:
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0191:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0174
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r14 = r11.getKey()
            java.lang.Long r14 = (java.lang.Long) r14
            long r14 = r14.longValue()
            java.lang.Object r11 = r11.getValue()
            te3.u14 r11 = (te3.C118472u14) r11
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            boolean r4 = r8.containsKey(r4)
            if (r4 == 0) goto L_0x01e8
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Object r4 = r8.get(r4)
            te3.u14 r4 = (te3.C118472u14) r4
            if (r4 != 0) goto L_0x01c4
            goto L_0x0215
        L_0x01c4:
            int r11 = r11.f354475d
            if (r11 >= 0) goto L_0x01d5
            java.util.LinkedList<te3.eg2> r4 = r4.f354480i
            r4.clear()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r8.remove(r4)
            goto L_0x0215
        L_0x01d5:
            if (r11 != 0) goto L_0x01e2
            java.util.LinkedList<te3.eg2> r11 = r4.f354480i
            r11.clear()
            java.util.LinkedList<te3.eg2> r4 = r4.f354480i
            r4.add(r9)
            goto L_0x0215
        L_0x01e2:
            java.util.LinkedList<te3.eg2> r4 = r4.f354480i
            r4.add(r9)
            goto L_0x0215
        L_0x01e8:
            int r4 = r11.f354475d
            if (r4 < 0) goto L_0x0215
            boolean r4 = r11.f354476e
            if (r4 != 0) goto L_0x0215
            te3.u14 r4 = new te3.u14
            r4.<init>()
            int r5 = r11.f354475d
            r4.f354475d = r5
            java.lang.String r5 = r11.f354479h
            r4.f354479h = r5
            boolean r5 = r11.f354481j
            r4.f354481j = r5
            r4.f354478g = r14
            r4.f354477f = r1
            java.util.LinkedList<te3.eg2> r5 = r4.f354480i
            r5.add(r9)
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r8.put(r5, r4)
            r4 = 0
            r5 = 1
            goto L_0x0191
        L_0x0215:
            r4 = 0
            goto L_0x0191
        L_0x0218:
            r8 = 0
        L_0x0219:
            if (r8 == 0) goto L_0x0262
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0222
            goto L_0x0262
        L_0x0222:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r8.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x022f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0263
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            te3.u14 r7 = (te3.C118472u14) r7
            java.util.LinkedList<te3.eg2> r7 = r7.f354480i
            if (r7 == 0) goto L_0x022f
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x024c
            goto L_0x022f
        L_0x024c:
            java.lang.Object r6 = r6.getKey()
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.Object r7 = r7.get(r3)
            te3.eg2 r7 = (te3.C118427eg2) r7
            long r7 = r7.f353970e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4.put(r6, r7)
            goto L_0x022f
        L_0x0262:
            r4 = 0
        L_0x0263:
            java.lang.String r5 = "_"
            java.lang.String r14 = "|"
            if (r4 == 0) goto L_0x0299
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0299
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0278:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0299
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            r0.append(r7)
            r0.append(r5)
            java.lang.Object r6 = r6.getValue()
            r0.append(r6)
            r0.append(r14)
            goto L_0x0278
        L_0x0299:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            x91.b$a r6 = x91.C23066b.f66278a
            te3.q14 r1 = r6.mo36464b(r1)
            if (r1 != 0) goto L_0x02a8
            r4 = 0
            goto L_0x02c2
        L_0x02a8:
            java.util.LinkedList<te3.fr1> r1 = r1.f332255e
            java.util.Iterator r1 = r1.iterator()
        L_0x02ae:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x02c2
            java.lang.Object r6 = r1.next()
            te3.fr1 r6 = (te3.C110962fr1) r6
            boolean r7 = r6.f331976h
            if (r7 == 0) goto L_0x02ae
            r4.add(r6)
            goto L_0x02ae
        L_0x02c2:
            java.lang.String r1 = "HABBYGE-MALI.SessionPageCollector"
            if (r4 == 0) goto L_0x030a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r6 = r4.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r3] = r6
            java.lang.String r6 = "realGetSessionPageId, matchingPathList: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x02dd:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x030a
            java.lang.Object r6 = r4.next()
            te3.fr1 r6 = (te3.C110962fr1) r6
            java.util.LinkedList<te3.er1> r7 = r6.f331975g
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x02dd
            long r7 = r6.f331979n
            r0.append(r7)
            r0.append(r5)
            java.util.LinkedList<te3.er1> r6 = r6.f331975g
            java.lang.Object r6 = r6.get(r3)
            te3.er1 r6 = (te3.C118429er1) r6
            long r6 = r6.f353986e
            r0.append(r6)
            r0.append(r14)
            goto L_0x02dd
        L_0x030a:
            java.lang.String r0 = r0.toString()
            boolean r4 = r0.endsWith(r14)
            if (r4 == 0) goto L_0x031e
            int r4 = r0.length()
            r6 = 1
            int r4 = r4 - r6
            java.lang.String r0 = r0.substring(r3, r4)
        L_0x031e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "$"
            r4.append(r0)
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            if (r12 != 0) goto L_0x0331
            r0 = 0
            goto L_0x0353
        L_0x0331:
            boolean r6 = z04.C112550d0.m153801u(r12, r5, r3)
            if (r6 == 0) goto L_0x034f
            java.lang.String[] r7 = new java.lang.String[]{r5}
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r12
            java.util.List r6 = z04.C112550d0.m153785U(r6, r7, r8, r9, r10, r11)
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r0.mo175252i(r6)
            goto L_0x0353
        L_0x034f:
            boolean r0 = r0.mo175252i(r12)
        L_0x0353:
            if (r0 != 0) goto L_0x036c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = m154258a(r12)
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r20 = r4
            goto L_0x06e1
        L_0x036c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = m154258a(r12)
            r6.append(r0)
            r6.append(r13)
            java.util.List r0 = ca1.C113264b.m155060f(r12)
            java.lang.String r7 = "SessionPageBackup, _read: %s"
            java.lang.String r8 = "HABBYGE-MALI.SessionPageBackup"
            java.lang.String r9 = "mmkv_ssionPg_matched_bckup"
            if (r0 == 0) goto L_0x0390
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x03e4
        L_0x0390:
            if (r12 != 0) goto L_0x0393
            goto L_0x03bc
        L_0x0393:
            byte[] r0 = f91.C116850b.m164831a(r9)
            if (r0 == 0) goto L_0x03b9
            int r10 = r0.length
            if (r10 != 0) goto L_0x039e
            r10 = 1
            goto L_0x039f
        L_0x039e:
            r10 = 0
        L_0x039f:
            if (r10 == 0) goto L_0x03a2
            goto L_0x03b9
        L_0x03a2:
            te3.dg2 r10 = new te3.dg2
            r10.<init>()
            r10.parseFrom(r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03ba
        L_0x03ab:
            r0 = move-exception
            r11 = 1
            r10 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r11 = r10.getMessage()
            r0[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r10, r7, r0)
        L_0x03b9:
            r10 = 0
        L_0x03ba:
            if (r10 != 0) goto L_0x03be
        L_0x03bc:
            r0 = 0
            goto L_0x03e4
        L_0x03be:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<te3.eg2> r10 = r10.f353948d
            java.util.Iterator r10 = r10.iterator()
        L_0x03c9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x03e4
            java.lang.Object r11 = r10.next()
            te3.eg2 r11 = (te3.C118427eg2) r11
            if (r11 == 0) goto L_0x03c9
            java.lang.String r13 = r11.f353972g
            boolean r13 = gy3.C87412m.m108589b(r12, r13)
            if (r13 != 0) goto L_0x03e0
            goto L_0x03c9
        L_0x03e0:
            r0.add(r11)
            goto L_0x03c9
        L_0x03e4:
            if (r0 == 0) goto L_0x057d
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x03ee
            goto L_0x057d
        L_0x03ee:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r11 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            java.lang.String r11 = r11.mo175244a(r12)
            if (r11 != 0) goto L_0x03f8
            goto L_0x04b0
        L_0x03f8:
            r13 = 1
            java.util.List r11 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162223f(r11, r13)
            if (r11 == 0) goto L_0x04b0
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x0407
            goto L_0x04b0
        L_0x0407:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0410:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x04ad
            java.lang.Object r15 = r0.next()
            te3.eg2 r15 = (te3.C118427eg2) r15
            java.util.Map r16 = ea1.C116717f.m164611d(r15, r11)
            if (r16 != 0) goto L_0x0423
            goto L_0x0410
        L_0x0423:
            java.util.HashMap r16 = (java.util.HashMap) r16
            java.util.Set r16 = r16.entrySet()
            java.util.Iterator r16 = r16.iterator()
        L_0x042d:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0410
            java.lang.Object r17 = r16.next()
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17
            java.lang.Object r18 = r17.getKey()
            java.lang.Long r18 = (java.lang.Long) r18
            r19 = r11
            long r10 = r18.longValue()
            java.lang.Object r17 = r17.getValue()
            r3 = r17
            te3.u14 r3 = (te3.C118472u14) r3
            r17 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            boolean r0 = r13.containsKey(r0)
            if (r0 == 0) goto L_0x047b
            boolean r0 = r3.f354476e
            if (r0 == 0) goto L_0x04a3
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Object r0 = r13.get(r0)
            te3.u14 r0 = (te3.C118472u14) r0
            if (r0 != 0) goto L_0x0475
            te3.u14 r0 = new te3.u14
            r0.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r13.put(r3, r0)
        L_0x0475:
            java.util.LinkedList<te3.eg2> r0 = r0.f354480i
            r0.add(r15)
            goto L_0x04a3
        L_0x047b:
            boolean r0 = r3.f354476e
            if (r0 == 0) goto L_0x04a3
            te3.u14 r0 = new te3.u14
            r0.<init>()
            r20 = r4
            int r4 = r3.f354475d
            r0.f354475d = r4
            java.lang.String r4 = r3.f354479h
            r0.f354479h = r4
            boolean r3 = r3.f354481j
            r0.f354481j = r3
            r0.f354478g = r10
            r0.f354477f = r12
            java.util.LinkedList<te3.eg2> r3 = r0.f354480i
            r3.add(r15)
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r13.put(r3, r0)
            goto L_0x04a5
        L_0x04a3:
            r20 = r4
        L_0x04a5:
            r0 = r17
            r11 = r19
            r4 = r20
            r3 = 0
            goto L_0x042d
        L_0x04ad:
            r20 = r4
            goto L_0x04b3
        L_0x04b0:
            r20 = r4
            r13 = 0
        L_0x04b3:
            if (r13 == 0) goto L_0x0575
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x04bd
            goto L_0x0575
        L_0x04bd:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x04ca:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x04fe
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r10 = r4.getValue()
            te3.u14 r10 = (te3.C118472u14) r10
            java.util.LinkedList<te3.eg2> r10 = r10.f354480i
            if (r10 == 0) goto L_0x04ca
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x04e7
            goto L_0x04ca
        L_0x04e7:
            java.lang.Object r4 = r4.getKey()
            java.lang.Long r4 = (java.lang.Long) r4
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            te3.eg2 r10 = (te3.C118427eg2) r10
            long r10 = r10.f353970e
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.put(r4, r10)
            goto L_0x04ca
        L_0x04fe:
            byte[] r0 = f91.C116850b.m164831a(r9)
            if (r0 == 0) goto L_0x0525
            int r4 = r0.length
            if (r4 != 0) goto L_0x0509
            r4 = 1
            goto L_0x050a
        L_0x0509:
            r4 = 0
        L_0x050a:
            if (r4 == 0) goto L_0x050d
            goto L_0x0525
        L_0x050d:
            te3.dg2 r4 = new te3.dg2
            r4.<init>()
            r4.parseFrom(r0)     // Catch:{ IOException -> 0x0516 }
            goto L_0x0526
        L_0x0516:
            r0 = move-exception
            r10 = 1
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r10 = r4.getMessage()
            r11 = 0
            r0[r11] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r4, r7, r0)
        L_0x0525:
            r4 = 0
        L_0x0526:
            if (r4 != 0) goto L_0x0529
            goto L_0x0580
        L_0x0529:
            java.util.LinkedList<te3.eg2> r0 = r4.f353948d
            int r0 = r0.size()
            r7 = 1
            int r0 = r0 - r7
        L_0x0531:
            r7 = -1
            if (r7 >= r0) goto L_0x054f
            java.util.LinkedList<te3.eg2> r7 = r4.f353948d
            java.lang.Object r7 = r7.get(r0)
            te3.eg2 r7 = (te3.C118427eg2) r7
            if (r7 == 0) goto L_0x054c
            java.lang.String r7 = r7.f353972g
            boolean r7 = gy3.C87412m.m108589b(r12, r7)
            if (r7 != 0) goto L_0x0547
            goto L_0x054c
        L_0x0547:
            java.util.LinkedList<te3.eg2> r7 = r4.f353948d
            r7.remove(r0)
        L_0x054c:
            int r0 = r0 + -1
            goto L_0x0531
        L_0x054f:
            java.util.LinkedList<te3.eg2> r0 = r4.f353948d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0558
            goto L_0x0580
        L_0x0558:
            byte[] r0 = r4.toByteArray()     // Catch:{ IOException -> 0x0563 }
            if (r0 != 0) goto L_0x055f
            goto L_0x0580
        L_0x055f:
            f91.C116850b.m164834d(r9, r0)
            goto L_0x0580
        L_0x0563:
            r0 = move-exception
            r7 = 1
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r4.getMessage()
            r9 = 0
            r0[r9] = r7
            java.lang.String r7 = "SessionPageBackup, _write: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r4, r7, r0)
            goto L_0x0580
        L_0x0575:
            java.lang.String r0 = "HABBYGE-MALI.HellSessionMonitor"
            java.lang.String r3 = "getMatchedSessionPages, Empty !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x057f
        L_0x057d:
            r20 = r4
        L_0x057f:
            r3 = 0
        L_0x0580:
            if (r3 == 0) goto L_0x05b1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x05b1
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0590:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x05b1
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r6.append(r4)
            r6.append(r5)
            java.lang.Object r3 = r3.getValue()
            r6.append(r3)
            r6.append(r14)
            goto L_0x0590
        L_0x05b1:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            x91.b$a r0 = x91.C23066b.f66278a
            te3.q14 r0 = r0.mo36464b(r12)
            if (r0 == 0) goto L_0x05d8
            java.util.LinkedList<te3.fr1> r0 = r0.f332255e
            java.util.Iterator r0 = r0.iterator()
        L_0x05c4:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x05d8
            java.lang.Object r4 = r0.next()
            te3.fr1 r4 = (te3.C110962fr1) r4
            boolean r7 = r4.f331976h
            if (r7 != 0) goto L_0x05c4
            r3.add(r4)
            goto L_0x05c4
        L_0x05d8:
            if (r12 != 0) goto L_0x05db
            goto L_0x0609
        L_0x05db:
            java.lang.String r0 = "mmkv_fuzzy_matched_bckup"
            byte[] r0 = f91.C116850b.m164831a(r0)
            if (r0 == 0) goto L_0x0606
            int r4 = r0.length
            if (r4 != 0) goto L_0x05e8
            r4 = 1
            goto L_0x05e9
        L_0x05e8:
            r4 = 0
        L_0x05e9:
            if (r4 == 0) goto L_0x05ec
            goto L_0x0606
        L_0x05ec:
            te3.cr1 r4 = new te3.cr1
            r4.<init>()
            r4.parseFrom(r0)     // Catch:{ IOException -> 0x05f5 }
            goto L_0x0607
        L_0x05f5:
            r0 = move-exception
            r7 = 1
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r4.getMessage()
            r8 = 0
            r0[r8] = r7
            java.lang.String r7 = "FuzzyMatchedBackup, _read: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r7, r0)
        L_0x0606:
            r4 = 0
        L_0x0607:
            if (r4 != 0) goto L_0x060b
        L_0x0609:
            r4 = 0
            goto L_0x0636
        L_0x060b:
            te3.q14 r0 = new te3.q14
            r0.<init>()
            r0.f332254d = r12
            java.util.LinkedList<te3.fr1> r2 = r4.f331912d
            java.util.Iterator r2 = r2.iterator()
        L_0x0618:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0635
            java.lang.Object r4 = r2.next()
            te3.fr1 r4 = (te3.C110962fr1) r4
            if (r4 == 0) goto L_0x0618
            java.lang.String r7 = r4.f331972d
            boolean r7 = gy3.C87412m.m108589b(r12, r7)
            if (r7 != 0) goto L_0x062f
            goto L_0x0618
        L_0x062f:
            java.util.LinkedList<te3.fr1> r7 = r0.f332255e
            r7.add(r4)
            goto L_0x0618
        L_0x0635:
            r4 = r0
        L_0x0636:
            if (r4 == 0) goto L_0x0652
            java.util.LinkedList<te3.fr1> r0 = r4.f332255e
            java.util.Iterator r0 = r0.iterator()
        L_0x063e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0652
            java.lang.Object r2 = r0.next()
            te3.fr1 r2 = (te3.C110962fr1) r2
            boolean r4 = r2.f331976h
            if (r4 != 0) goto L_0x063e
            r3.add(r2)
            goto L_0x063e
        L_0x0652:
            x91.d$a r0 = x91.C23070d.f66280a
            if (r12 != 0) goto L_0x0658
        L_0x0656:
            r2 = 1
            goto L_0x0688
        L_0x0658:
            te3.cr1 r2 = r0.mo36470a()
            if (r2 != 0) goto L_0x065f
            goto L_0x0656
        L_0x065f:
            java.util.LinkedList<te3.fr1> r4 = r2.f331912d
            int r4 = r4.size()
            r7 = -1
            int r4 = r4 + r7
        L_0x0667:
            if (r7 >= r4) goto L_0x0684
            java.util.LinkedList<te3.fr1> r8 = r2.f331912d
            java.lang.Object r8 = r8.get(r4)
            te3.fr1 r8 = (te3.C110962fr1) r8
            if (r8 == 0) goto L_0x0681
            java.lang.String r8 = r8.f331972d
            boolean r8 = gy3.C87412m.m108589b(r12, r8)
            if (r8 != 0) goto L_0x067c
            goto L_0x0681
        L_0x067c:
            java.util.LinkedList<te3.fr1> r8 = r2.f331912d
            r8.remove(r4)
        L_0x0681:
            int r4 = r4 + -1
            goto L_0x0667
        L_0x0684:
            r0.mo36471b(r2)
            goto L_0x0656
        L_0x0688:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "getLastSessionPagePath, matchedPathList: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x069e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06cc
            java.lang.Object r1 = r0.next()
            te3.fr1 r1 = (te3.C110962fr1) r1
            java.util.LinkedList<te3.er1> r2 = r1.f331975g
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x069e
            long r2 = r1.f331979n
            r6.append(r2)
            r6.append(r5)
            java.util.LinkedList<te3.er1> r1 = r1.f331975g
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            te3.er1 r1 = (te3.C118429er1) r1
            long r1 = r1.f353986e
            r6.append(r1)
            r6.append(r14)
            goto L_0x069e
        L_0x06cc:
            java.lang.String r0 = r6.toString()
            boolean r1 = r0.endsWith(r14)
            if (r1 == 0) goto L_0x06e1
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L_0x06e1:
            r1 = r20
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aa1.C112764f.m154260c():java.lang.String");
    }
}
