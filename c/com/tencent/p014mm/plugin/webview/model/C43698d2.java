package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.ipcinvoker.C1256g;

/* renamed from: com.tencent.mm.plugin.webview.model.d2 */
public final class C43698d2<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C43699e2 f118081d;

    public C43698d2(C43699e2 e2Var) {
        this.f118081d = e2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo894a(java.lang.Object r30) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r0
            java.lang.String r2 = ""
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            java.lang.Class<jr2.r> r4 = jr2.C76442r.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x001e }
            jr2.r r4 = (jr2.C76442r) r4     // Catch:{ Exception -> 0x001e }
            com.tencent.mm.plugin.webview.model.e2 r5 = r1.f118081d     // Catch:{ Exception -> 0x001e }
            java.lang.String r5 = r5.f118096o     // Catch:{ Exception -> 0x001e }
            java.lang.String r4 = r4.yc0(r5, r3)     // Catch:{ Exception -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r4 = r2
        L_0x0020:
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            com.tencent.mm.plugin.webview.model.e2 r0 = r1.f118081d
            i93.e$c r0 = r0.f118102u
            r6 = 0
            r7 = 20
            if (r0 == 0) goto L_0x00a6
            java.lang.String r8 = "UTF-8"
            java.util.ArrayList<i93.e$c$a> r0 = r0.f124561a
            java.util.Iterator r9 = r0.iterator()
            r10 = r2
            r0 = 0
        L_0x003f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00a7
            java.lang.Object r11 = r9.next()
            i93.e$c$a r11 = (i93.C46206e.C46209c.C46210a) r11
            if (r0 <= r7) goto L_0x004e
            goto L_0x00a7
        L_0x004e:
            int r12 = r0 + 1
            java.lang.String r13 = r11.f124564c
            java.lang.String r14 = r11.f124562a
            java.lang.String r15 = p206nj.C117627q.m165909b(r13, r8)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = "encode(browsePageInfo.pageTitle, \"UTF-8\")"
            gy3.C87412m.m108593f(r15, r0)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = r11.f124562a     // Catch:{ Exception -> 0x006a }
            java.lang.String r0 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ Exception -> 0x006a }
            java.lang.String r13 = "encode(browsePageInfo.url, \"UTF-8\")"
            gy3.C87412m.m108593f(r0, r13)     // Catch:{ Exception -> 0x006a }
            r14 = r0
            goto L_0x0076
        L_0x006a:
            r0 = move-exception
            r13 = r15
            goto L_0x006e
        L_0x006d:
            r0 = move-exception
        L_0x006e:
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.String r7 = "WebViewBrowseHistoryReportInfo"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r15)
            r15 = r13
        L_0x0076:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r14)
            r7 = 59
            r0.append(r7)
            long r13 = r11.f124563b
            r0.append(r13)
            r0.append(r7)
            long r10 = r11.f124565d
            r0.append(r10)
            r0.append(r7)
            r0.append(r15)
            java.lang.String r7 = "$$$"
            r0.append(r7)
            java.lang.String r10 = r0.toString()
            r0 = r12
            r7 = 20
            goto L_0x003f
        L_0x00a6:
            r10 = 0
        L_0x00a7:
            r7 = 25
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 10643(0x2993, float:1.4914E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r0[r6] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            java.lang.String r11 = r9.f118082a
            r12 = 1
            r0[r12] = r11
            long r13 = r9.f118089h
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r11 = 2
            r0[r11] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            int r9 = r9.f118090i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 3
            r0[r13] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            int r9 = r9.f118086e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14 = 4
            r0[r14] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            long r8 = r9.f118087f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 5
            r0[r9] = r8
            com.tencent.mm.plugin.webview.model.e2 r8 = r1.f118081d
            long r7 = r8.f118088g
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 6
            r0[r8] = r7
            com.tencent.mm.plugin.webview.model.e2 r7 = r1.f118081d
            java.lang.String r15 = r7.f118083b
            r16 = 7
            r0[r16] = r15
            java.lang.String r15 = r7.f118084c
            r17 = 8
            r0[r17] = r15
            java.lang.String r15 = r7.f118085d
            r18 = 9
            r0[r18] = r15
            java.lang.String r15 = r7.f118091j
            r19 = 10
            r0[r19] = r15
            java.lang.String r15 = r7.f118092k
            r20 = 11
            r0[r20] = r15
            java.lang.String r15 = r7.f118093l
            r21 = 12
            r0[r21] = r15
            java.lang.String r15 = r7.f118094m
            r22 = 13
            r0[r22] = r15
            r15 = 14
            r0[r15] = r5
            java.lang.String r15 = r7.f118095n
            r23 = 15
            r0[r23] = r15
            java.lang.String r15 = r7.f118096o
            r24 = 16
            r0[r24] = r15
            r15 = 17
            r0[r15] = r4
            int r7 = r7.f118099r
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r25 = 18
            r0[r25] = r7
            com.tencent.mm.plugin.webview.model.e2 r7 = r1.f118081d
            java.lang.String r15 = r7.f118097p
            r26 = 19
            r0[r26] = r15
            java.lang.String r7 = r7.f118100s
            r15 = 20
            r0[r15] = r7
            java.lang.String r7 = r3.value
            r15 = 21
            r0[r15] = r7
            long r27 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.webview.model.e2 r7 = r1.f118081d
            long r8 = r7.f118087f
            long r27 = r27 - r8
            java.lang.Long r7 = java.lang.Long.valueOf(r27)
            r8 = 22
            r0[r8] = r7
            com.tencent.mm.plugin.webview.model.e2 r7 = r1.f118081d
            java.lang.String r7 = r7.f118098q
            r9 = 23
            r0[r9] = r7
            r7 = 24
            r0[r7] = r10
            java.lang.String r7 = "MicroMsg.WebviewReporter"
            java.lang.String r9 = "report 10643(%s), username : %s, msgId : %s, msgIndex : %s, scene : %s, enterTime : %s, stayTime : %s, rawUrl : %s, publisher : %s, viewId : %s, publishId : %s,appId : %s, newMsgId : %s, preUsername : %s, curUsername : %s, referUrl : %s, statExtStr:%s(%s), chatType:%d, title:%s, expidstr[chatting_exp]:%s, sourceAppId:%s, allStayTime %d, desc: %s, urlList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r0)
            com.tencent.mm.plugin.webview.model.e2 r0 = r1.f118081d
            java.lang.String r9 = r0.f118097p
            java.lang.String r8 = r0.f118098q
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a     // Catch:{ Exception -> 0x0195 }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r9)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r0 = "doUrlEncode(title)"
            gy3.C87412m.m108593f(r15, r0)     // Catch:{ Exception -> 0x0195 }
            com.tencent.mm.plugin.webview.model.e2 r0 = r1.f118081d     // Catch:{ Exception -> 0x0192 }
            java.lang.String r0 = r0.f118098q     // Catch:{ Exception -> 0x0192 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r0)     // Catch:{ Exception -> 0x0192 }
            java.lang.String r9 = "doUrlEncode(desc)"
            gy3.C87412m.m108593f(r0, r9)     // Catch:{ Exception -> 0x0192 }
            r8 = r0
            goto L_0x019c
        L_0x0192:
            r0 = move-exception
            r9 = r15
            goto L_0x0196
        L_0x0195:
            r0 = move-exception
        L_0x0196:
            java.lang.Object[] r15 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r15)
            r15 = r9
        L_0x019c:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 28
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            java.lang.String r14 = r9.f118082a
            r7[r6] = r14
            long r13 = r9.f118089h
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r7[r12] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            int r9 = r9.f118090i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r11] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            int r9 = r9.f118086e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 3
            r7[r11] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            long r11 = r9.f118087f
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r11 = 4
            r7[r11] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            long r11 = r9.f118088g
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r11 = 5
            r7[r11] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            java.lang.String r9 = r9.f118083b
            java.lang.String r11 = "!"
            java.lang.String r12 = ","
            if (r9 != 0) goto L_0x01e6
            goto L_0x01ea
        L_0x01e6:
            java.lang.String r9 = z04.C112551y.m153814n(r9, r12, r11, r6)
        L_0x01ea:
            r13 = 6
            r7[r13] = r9
            com.tencent.mm.plugin.webview.model.e2 r9 = r1.f118081d
            java.lang.String r13 = r9.f118084c
            r7[r16] = r13
            java.lang.String r13 = r9.f118085d
            r7[r17] = r13
            java.lang.String r13 = r9.f118091j
            r7[r18] = r13
            java.lang.String r13 = r9.f118092k
            r7[r19] = r13
            java.lang.String r13 = r9.f118093l
            r7[r20] = r13
            java.lang.String r13 = r9.f118094m
            r7[r21] = r13
            r7[r22] = r5
            java.lang.String r5 = r9.f118095n
            if (r5 != 0) goto L_0x020e
            goto L_0x0212
        L_0x020e:
            java.lang.String r5 = z04.C112551y.m153814n(r5, r12, r11, r6)
        L_0x0212:
            r6 = 14
            r7[r6] = r5
            r7[r23] = r4
            com.tencent.mm.plugin.webview.model.e2 r4 = r1.f118081d
            int r4 = r4.f118099r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7[r24] = r4
            r4 = 17
            r7[r4] = r15
            com.tencent.mm.plugin.webview.model.e2 r4 = r1.f118081d
            java.lang.String r4 = r4.f118100s
            r7[r25] = r4
            java.lang.String r3 = r3.value
            r7[r26] = r3
            r3 = 20
            r7[r3] = r2
            r3 = 21
            r7[r3] = r2
            r3 = 22
            r7[r3] = r2
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.webview.model.e2 r4 = r1.f118081d
            long r4 = r4.f118087f
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 23
            r7[r3] = r2
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 24
            r7[r3] = r2
            com.tencent.mm.plugin.webview.model.e2 r2 = r1.f118081d
            int r2 = r2.f118101t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 25
            r7[r3] = r2
            r2 = 26
            r7[r2] = r8
            r2 = 27
            r7[r2] = r10
            r2 = 10643(0x2993, float:1.4914E-41)
            r0.mo160131h(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C43698d2.mo894a(java.lang.Object):void");
    }
}
