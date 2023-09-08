package o91;

import te3.v84;

/* renamed from: o91.c */
public class C100311c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ v84 f293835d;

    public C100311c(C100312d dVar, v84 v84) {
        this.f293835d = v84;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0502 A[LOOP:9: B:97:0x04fc->B:99:0x0502, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r28 = this;
            r1 = r28
            te3.v84 r2 = r1.f293835d
            if (r2 != 0) goto L_0x0008
            goto L_0x0563
        L_0x0008:
            java.lang.String r3 = "HABBYGE-MALI.HellTimelineReport"
            java.lang.String r0 = "reportTimelineV2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.LinkedList<te3.e74> r0 = r2.f299658h
            r4 = 2
            r6 = 0
            r7 = 1
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x00d9 }
            r8.<init>()     // Catch:{ Exception -> 0x00d9 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00d9 }
        L_0x001e:
            boolean r9 = r0.hasNext()     // Catch:{ Exception -> 0x00d9 }
            if (r9 == 0) goto L_0x00ad
            java.lang.Object r9 = r0.next()     // Catch:{ Exception -> 0x00d9 }
            te3.e74 r9 = (te3.e74) r9     // Catch:{ Exception -> 0x00d9 }
            if (r9 != 0) goto L_0x002d
            goto L_0x001e
        L_0x002d:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d9 }
            r10.<init>()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "feedId"
            java.lang.String r12 = r9.f298179d     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "viewLikeCount"
            int r12 = r9.f298196x     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "viewCommentCount"
            int r12 = r9.f298195w     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "userName"
            java.lang.String r12 = r9.f298197y     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "nickName"
            java.lang.String r12 = r9.f298178A     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "isAd"
            boolean r12 = r9.f298198z     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "feedheight"
            int r12 = r9.f298181f     // Catch:{ Exception -> 0x00d9 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ Exception -> 0x00d9 }
            double r12 = r9.f298194v     // Catch:{ Exception -> 0x00d9 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x00d9 }
            r12 = 4
            java.math.BigDecimal r11 = r11.setScale(r4, r12)     // Catch:{ Exception -> 0x00d9 }
            double r13 = r11.doubleValue()     // Catch:{ Exception -> 0x00d9 }
            r9.f298194v = r13     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "realShowTime"
            r10.put(r11, r13)     // Catch:{ Exception -> 0x00d9 }
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ Exception -> 0x00d9 }
            double r13 = r9.f298193u     // Catch:{ Exception -> 0x00d9 }
            r11.<init>(r13)     // Catch:{ Exception -> 0x00d9 }
            java.math.BigDecimal r11 = r11.setScale(r4, r12)     // Catch:{ Exception -> 0x00d9 }
            double r11 = r11.doubleValue()     // Catch:{ Exception -> 0x00d9 }
            r9.f298193u = r11     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = "stayTimeRelative"
            r10.put(r13, r11)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r11 = "realScreenHeight"
            int r12 = r9.f298182g     // Catch:{ Exception -> 0x00d9 }
            int r13 = r9.f298184i     // Catch:{ Exception -> 0x00d9 }
            int r12 = r12 - r13
            int r13 = r9.f298185j     // Catch:{ Exception -> 0x00d9 }
            int r12 = r12 - r13
            int r9 = r9.f298183h     // Catch:{ Exception -> 0x00d9 }
            int r12 = r12 - r9
            r10.put(r11, r12)     // Catch:{ Exception -> 0x00d9 }
            r8.put(r10)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x001e
        L_0x00ad:
            int r0 = r8.length()     // Catch:{ Exception -> 0x00d9 }
            if (r0 <= 0) goto L_0x00c0
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00d9 }
            op3.b r0 = op3.C117882j.m166284c(r8, r0)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e8
        L_0x00c0:
            java.lang.String r0 = "_feedList2JsonV2 jsonArray Empty !!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x00d9 }
            org.json.JSONObject r0 = o91.C100315h.m131140a(r2)     // Catch:{ Exception -> 0x00d9 }
            r8.put(r0)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00d9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00d9 }
            op3.b r0 = op3.C117882j.m166284c(r0, r8)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e8
        L_0x00d9:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r0.getMessage()
            r8[r6] = r9
            java.lang.String r9 = "_feedList2JsonV2-crash, %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r9, r8)
            r0 = 0
        L_0x00e8:
            if (r0 != 0) goto L_0x00ec
            goto L_0x0563
        L_0x00ec:
            java.lang.String r8 = "reportTimelineV2 YES"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            java.lang.String r3 = r2.f299660j
            java.lang.String r8 = "18260"
            boolean r3 = r8.equals(r3)
            java.lang.String r10 = "#"
            java.lang.String r11 = ","
            r12 = 5120(0x1400, float:7.175E-42)
            java.lang.String r13 = "sessionId"
            java.lang.String r14 = "PName"
            if (r3 == 0) goto L_0x02db
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct
            r3.<init>()
            int r15 = android.os.Process.myPid()
            r3.f265572d = r15
            f40.j r15 = f40.C86709a0.m107531m()
            j40.a r15 = r15.mo58407a()
            j40.b r15 = (j40.C87829b) r15
            java.lang.String r15 = r15.f124988a
            java.lang.String r15 = r3.mo86045b(r14, r15, r7)
            r3.f265573e = r15
            java.lang.String r15 = r2.f299654d
            java.lang.String r15 = r3.mo86045b(r13, r15, r7)
            r3.f265574f = r15
            java.lang.String r15 = r2.f299659i
            java.lang.String r5 = "SessionPageId"
            java.lang.String r15 = r3.mo86045b(r5, r15, r7)
            r3.f265584p = r15
            java.lang.String r15 = r2.f299661n
            java.lang.String r4 = "SessionKey"
            java.lang.String r15 = r3.mo86045b(r4, r15, r7)
            r3.f265585q = r15
            long r8 = r2.f299655e
            r3.f265575g = r8
            long r8 = r2.f299656f
            r3.f265576h = r8
            long r8 = r2.f299657g
            r3.f265577i = r8
            java.lang.Object r8 = r0.mo182596a(r6)
            java.lang.String r8 = (java.lang.String) r8
            r3.f265578j = r8
            java.lang.Object r0 = r0.mo182596a(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.f265579k = r0
            int r0 = q91.C101073a.f295889a
            int r8 = r0 + 1
            q91.C101073a.f295889a = r8
            r3.f265580l = r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r0 = r3.mo1005p()
            byte[] r9 = r0.getBytes()
            int r0 = r9.length
            java.lang.String r15 = "HABBYGE-MALI.FinderReport"
            if (r0 > r12) goto L_0x0188
            r3.f265581m = r6
            r3.f265582n = r7
            r8.add(r3)
            r5 = r8
            r22 = r10
            r23 = r11
            goto L_0x02a8
        L_0x0188:
            java.lang.String r0 = r3.f265578j
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x0190 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0190 }
            goto L_0x0199
        L_0x0190:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r6 = "finder, _spliteLogIfBigger7K-timeline-Exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r6, r12)
            r12 = 0
        L_0x0199:
            if (r12 != 0) goto L_0x01a2
            r22 = r10
            r23 = r11
            r5 = 0
            goto L_0x02a8
        L_0x01a2:
            int r0 = r12.length()
            int r6 = r9.length
            r20 = r8
            double r7 = (double) r6
            r18 = 4662351514235305984(0x40b4000000000000, double:5120.0)
            double r7 = r7 / r18
            double r6 = java.lang.Math.ceil(r7)
            int r8 = (int) r6
            int r16 = r0 / r8
            int r18 = r0 % r8
            if (r18 <= 0) goto L_0x01bb
            int r8 = r8 + 1
        L_0x01bb:
            r22 = r10
            r23 = r11
            r1 = 0
            r9 = 0
            r21 = 0
        L_0x01c3:
            double r10 = (double) r9
            int r24 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r24 >= 0) goto L_0x0241
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct r10 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct
            r10.<init>()
            int r11 = r3.f265572d
            r10.f265572d = r11
            java.lang.String r11 = r3.f265573e
            r24 = r6
            r6 = 1
            java.lang.String r7 = r10.mo86045b(r14, r11, r6)
            r10.f265573e = r7
            java.lang.String r7 = r3.f265574f
            java.lang.String r7 = r10.mo86045b(r13, r7, r6)
            r10.f265574f = r7
            java.lang.String r7 = r3.f265584p
            java.lang.String r7 = r10.mo86045b(r5, r7, r6)
            r10.f265584p = r7
            java.lang.String r7 = r3.f265585q
            java.lang.String r7 = r10.mo86045b(r4, r7, r6)
            r10.f265585q = r7
            long r6 = r3.f265575g
            r10.f265575g = r6
            long r6 = r3.f265576h
            r10.f265576h = r6
            long r6 = r3.f265577i
            r10.f265577i = r6
            int r6 = r3.f265580l
            r10.f265580l = r6
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            int r7 = r9 * r16
        L_0x020b:
            int r11 = r9 + 1
            r26 = r9
            int r9 = r11 * r16
            if (r7 >= r9) goto L_0x0223
            int r9 = r0 - r18
            if (r7 >= r9) goto L_0x0223
            java.lang.Object r9 = r12.opt(r7)
            r6.put(r9)
            int r7 = r7 + 1
            r9 = r26
            goto L_0x020b
        L_0x0223:
            java.lang.String r9 = r6.toString()
            r10.f265578j = r9
            int r6 = r6.length()
            r10.f265579k = r6
            int r6 = r1 + 1
            r10.f265581m = r1
            r10.f265582n = r8
            r9 = r20
            r9.add(r10)
            r1 = r6
            r21 = r7
            r9 = r11
            r6 = r24
            goto L_0x01c3
        L_0x0241:
            r9 = r20
            if (r18 <= 0) goto L_0x02a7
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct
            r6.<init>()
            int r7 = r3.f265572d
            r6.f265572d = r7
            java.lang.String r7 = r3.f265573e
            r10 = 1
            java.lang.String r7 = r6.mo86045b(r14, r7, r10)
            r6.f265573e = r7
            java.lang.String r7 = r3.f265574f
            java.lang.String r7 = r6.mo86045b(r13, r7, r10)
            r6.f265574f = r7
            java.lang.String r7 = r3.f265584p
            java.lang.String r5 = r6.mo86045b(r5, r7, r10)
            r6.f265584p = r5
            java.lang.String r5 = r3.f265585q
            java.lang.String r4 = r6.mo86045b(r4, r5, r10)
            r5 = r9
            r6.f265585q = r4
            long r10 = r3.f265575g
            r6.f265575g = r10
            long r10 = r3.f265576h
            r6.f265576h = r10
            long r10 = r3.f265577i
            r6.f265577i = r10
            int r3 = r3.f265580l
            r6.f265580l = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r4 = r21
        L_0x0287:
            if (r4 >= r0) goto L_0x0293
            java.lang.Object r7 = r12.opt(r4)
            r3.put(r7)
            int r4 = r4 + 1
            goto L_0x0287
        L_0x0293:
            java.lang.String r0 = r3.toString()
            r6.f265578j = r0
            int r0 = r3.length()
            r6.f265579k = r0
            r6.f265581m = r1
            r6.f265582n = r8
            r5.add(r6)
            goto L_0x02a8
        L_0x02a7:
            r5 = r9
        L_0x02a8:
            if (r5 != 0) goto L_0x02ac
            goto L_0x04b7
        L_0x02ac:
            java.util.Iterator r0 = r5.iterator()
        L_0x02b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04b7
            java.lang.Object r1 = r0.next()
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedTimelineStruct) r1
            java.lang.String r3 = r1.f265578j
            r4 = r22
            r5 = r23
            java.lang.String r3 = r3.replace(r5, r4)
            r1.f265578j = r3
            r1.mo86054n()
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r1 = r1.mo1005p()
            r3 = 0
            r6[r3] = r1
            java.lang.String r1 = "FinderReport-report-sub: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r6)
            goto L_0x02b0
        L_0x02db:
            r4 = r10
            r5 = r11
            java.lang.String r1 = r2.f299660j
            java.lang.String r3 = "16242"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x04b7
            com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct
            r1.<init>()
            int r3 = android.os.Process.myPid()
            r1.f265623d = r3
            f40.j r3 = f40.C86709a0.m107531m()
            j40.a r3 = r3.mo58407a()
            j40.b r3 = (j40.C87829b) r3
            java.lang.String r3 = r3.f124988a
            r6 = 1
            java.lang.String r3 = r1.mo86045b(r14, r3, r6)
            r1.f265624e = r3
            java.lang.String r3 = r2.f299654d
            java.lang.String r3 = r1.mo86045b(r13, r3, r6)
            r1.f265625f = r3
            long r6 = r2.f299655e
            r1.f265626g = r6
            long r6 = r2.f299656f
            r1.f265627h = r6
            long r6 = r2.f299657g
            r1.f265628i = r6
            r3 = 0
            java.lang.Object r6 = r0.mo182596a(r3)
            java.lang.String r6 = (java.lang.String) r6
            r1.f265629j = r6
            r3 = 1
            java.lang.Object r0 = r0.mo182596a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f265630k = r0
            java.lang.String r0 = r2.f299662o
            java.lang.String r6 = "SvrSessionid"
            java.lang.String r0 = r1.mo86045b(r6, r0, r3)
            r1.f265637r = r0
            int r0 = q91.C101079f.f295897a
            int r3 = r0 + 1
            q91.C101079f.f295897a = r3
            r1.f265631l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "report16242: "
            r0.append(r3)
            java.lang.String r3 = r1.mo1005p()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "HABBYGE-MALI.SnsReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = r1.mo1005p()
            byte[] r7 = r0.getBytes()
            int r0 = r7.length
            if (r0 > r12) goto L_0x037d
            r8 = 0
            r1.f265632m = r8
            r7 = 1
            r1.f265633n = r7
            r6.add(r1)
            r18 = r2
            r20 = r3
            r22 = r4
            goto L_0x0479
        L_0x037d:
            java.lang.String r0 = r1.f265629j
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0385 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0385 }
            goto L_0x038f
        L_0x0385:
            r0 = move-exception
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r8 = "Sns, _spliteLogIfBigger7K-timeline-Exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r8, r10)
            r8 = 0
        L_0x038f:
            if (r8 != 0) goto L_0x039b
            r18 = r2
            r20 = r3
            r22 = r4
            r16 = 0
            goto L_0x047b
        L_0x039b:
            int r0 = r8.length()
            int r7 = r7.length
            double r10 = (double) r7
            r15 = 4662351514235305984(0x40b4000000000000, double:5120.0)
            double r10 = r10 / r15
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
            int r12 = r0 / r7
            int r15 = r0 % r7
            if (r15 <= 0) goto L_0x03b1
            int r7 = r7 + 1
        L_0x03b1:
            r18 = r2
            r20 = r3
            r22 = r4
            r2 = 0
            r9 = 0
            r16 = 0
        L_0x03bb:
            double r3 = (double) r9
            int r21 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r21 >= 0) goto L_0x0427
            com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct
            r3.<init>()
            int r4 = r1.f265623d
            r3.f265623d = r4
            java.lang.String r4 = r1.f265624e
            r23 = r10
            r10 = 1
            java.lang.String r4 = r3.mo86045b(r14, r4, r10)
            r3.f265624e = r4
            java.lang.String r4 = r1.f265625f
            java.lang.String r4 = r3.mo86045b(r13, r4, r10)
            r3.f265625f = r4
            long r10 = r1.f265626g
            r3.f265626g = r10
            long r10 = r1.f265627h
            r3.f265627h = r10
            long r10 = r1.f265628i
            r3.f265628i = r10
            int r4 = r1.f265631l
            r3.f265631l = r4
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            int r10 = r9 * r12
        L_0x03f3:
            int r11 = r9 + 1
            r21 = r9
            int r9 = r11 * r12
            if (r10 >= r9) goto L_0x040b
            int r9 = r0 - r15
            if (r10 >= r9) goto L_0x040b
            java.lang.Object r9 = r8.opt(r10)
            r4.put(r9)
            int r10 = r10 + 1
            r9 = r21
            goto L_0x03f3
        L_0x040b:
            java.lang.String r9 = r4.toString()
            r3.f265629j = r9
            int r4 = r4.length()
            r3.f265630k = r4
            int r4 = r2 + 1
            r3.f265632m = r2
            r3.f265633n = r7
            r6.add(r3)
            r2 = r4
            r16 = r10
            r9 = r11
            r10 = r23
            goto L_0x03bb
        L_0x0427:
            if (r15 <= 0) goto L_0x0479
            com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct
            r3.<init>()
            int r4 = r1.f265623d
            r3.f265623d = r4
            java.lang.String r4 = r1.f265624e
            r9 = 1
            java.lang.String r4 = r3.mo86045b(r14, r4, r9)
            r3.f265624e = r4
            java.lang.String r4 = r1.f265625f
            java.lang.String r4 = r3.mo86045b(r13, r4, r9)
            r3.f265625f = r4
            long r10 = r1.f265626g
            r3.f265626g = r10
            long r10 = r1.f265627h
            r3.f265627h = r10
            long r10 = r1.f265628i
            r3.f265628i = r10
            int r1 = r1.f265631l
            r3.f265631l = r1
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r4 = r16
        L_0x045a:
            if (r4 >= r0) goto L_0x0466
            java.lang.Object r10 = r8.opt(r4)
            r1.put(r10)
            int r4 = r4 + 1
            goto L_0x045a
        L_0x0466:
            java.lang.String r0 = r1.toString()
            r3.f265629j = r0
            int r0 = r1.length()
            r3.f265630k = r0
            r3.f265632m = r2
            r3.f265633n = r7
            r6.add(r3)
        L_0x0479:
            r16 = r6
        L_0x047b:
            if (r16 != 0) goto L_0x047e
            goto L_0x04b9
        L_0x047e:
            java.util.Iterator r0 = r16.iterator()
        L_0x0482:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04b9
            java.lang.Object r1 = r0.next()
            com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.HellTimelineStruct) r1
            java.lang.String r2 = r1.f265629j
            r3 = r22
            java.lang.String r2 = r2.replace(r5, r3)
            r1.f265629j = r2
            r1.mo86054n()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "report16242-sub: "
            r2.append(r4)
            java.lang.String r1 = r1.mo1005p()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0482
        L_0x04b7:
            r18 = r2
        L_0x04b9:
            java.lang.String r0 = "HABBYGE-MALI.TimelineMonitorCheck"
            r1 = r18
            long r2 = r1.f299656f
            long r4 = r1.f299657g
            long r2 = r2 + r4
            long r4 = r1.f299655e
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            r4 = 50
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x04e2
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 932(0x3a4, double:4.605E-321)
            r23 = 87
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
            java.lang.String r2 = "Timeline time-sharing monitor data accuracy report, true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x04f4
        L_0x04e2:
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 932(0x3a4, double:4.605E-321)
            r23 = 88
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
            java.lang.String r2 = "Timeline time-sharing monitor data accuracy report, false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x04f4:
            java.util.LinkedList<te3.e74> r2 = r1.f299658h
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x04fc:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x050c
            java.lang.Object r5 = r2.next()
            te3.e74 r5 = (te3.e74) r5
            double r5 = r5.f298193u
            double r3 = r3 + r5
            goto L_0x04fc
        L_0x050c:
            long r5 = r1.f299656f
            double r5 = (double) r5
            double r5 = r5 - r3
            double r5 = java.lang.Math.abs(r5)
            r7 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0547
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 932(0x3a4, double:4.605E-321)
            r23 = 89
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r7 = r1.f299656f
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r7 = 0
            r2[r7] = r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r3 = 1
            r2[r3] = r1
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = "Timeline time-sharing monitor data accuracy report, true: %s - %s = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            goto L_0x0563
        L_0x0547:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 932(0x3a4, double:4.605E-321)
            r13 = 90
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Timeline time-sharing monitor data accuracy report, false: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
        L_0x0563:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o91.C100311c.run():void");
    }
}
