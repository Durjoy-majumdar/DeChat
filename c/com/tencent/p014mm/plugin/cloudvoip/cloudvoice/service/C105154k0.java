package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k0 */
public class C105154k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85147b f312247d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f312248e;

    /* renamed from: f */
    public final /* synthetic */ C105181w f312249f;

    public C105154k0(C105181w wVar, C85147b bVar, JSONObject jSONObject) {
        this.f312249f = wVar;
        this.f312247d = bVar;
        this.f312248e = jSONObject;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02cc A[SYNTHETIC] */
    public void run() {
        /*
            r23 = this;
            r1 = r23
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = r1.f312249f
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r0 = r0.f312381n
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r2 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.C85161i.InRoom
            r3 = 0
            if (r0 == r2) goto L_0x0025
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r2 = "subscribe, not in room!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b r0 = r1.f312247d
            if (r0 == 0) goto L_0x0025
            r2 = -10086(0xffffffffffffd89a, float:NaN)
            r4 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.String r5 = "not in room"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo118169a(r2, r4, r5, r3)
            return
        L_0x0025:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONObject r4 = r1.f312248e
            java.lang.String r5 = "openIdList"
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x02d6
            r7 = 0
        L_0x003d:
            int r8 = r4.length()
            if (r7 >= r8) goto L_0x02d6
            java.lang.String r8 = ""
            java.lang.String r8 = r4.optString(r7, r8)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0051
            goto L_0x02cc
        L_0x0051:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r9 = r1.f312249f
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r9 = r9.f312378h
            r9.getClass()
            java.lang.String r10 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r11 = "getVideoSize openId: %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r12)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r10 = r9.f312169b
            monitor-enter(r10)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r9 = r9.f312169b     // Catch:{ all -> 0x02d3 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ all -> 0x02d3 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x02d3 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x02d3 }
        L_0x0072:
            r12 = 0
        L_0x0073:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x02d3 }
            r14 = 3
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x02d3 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x02d3 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x02d3 }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c r12 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c) r12     // Catch:{ all -> 0x02d3 }
            if (r12 != 0) goto L_0x0089
            goto L_0x0073
        L_0x0089:
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r15 = "getVideoSize openId: %s viewId: %d mid: %d"
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ all -> 0x02d3 }
            java.lang.String r17 = r12.getOpenId()     // Catch:{ all -> 0x02d3 }
            r11[r3] = r17     // Catch:{ all -> 0x02d3 }
            int r17 = r12.getViewId()     // Catch:{ all -> 0x02d3 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x02d3 }
            r11[r6] = r17     // Catch:{ all -> 0x02d3 }
            int r17 = r12.getMemberId()     // Catch:{ all -> 0x02d3 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x02d3 }
            r11[r5] = r17     // Catch:{ all -> 0x02d3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r15, r11)     // Catch:{ all -> 0x02d3 }
            boolean r11 = r12.mo149441w()     // Catch:{ all -> 0x02d3 }
            if (r11 == 0) goto L_0x0072
            java.lang.String r11 = r12.getOpenId()     // Catch:{ all -> 0x02d3 }
            boolean r11 = r11.equals(r8)     // Catch:{ all -> 0x02d3 }
            if (r11 != 0) goto L_0x00bd
            goto L_0x0072
        L_0x00bd:
            monitor-exit(r10)     // Catch:{ all -> 0x02d3 }
            r15 = 8
            if (r12 != 0) goto L_0x00e0
            java.lang.String r12 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getVideoSize, openId: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r10 = " not found"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r9)
        L_0x00dd:
            r10 = 0
            goto L_0x016e
        L_0x00e0:
            int r9 = r12.getLogicWidth()
            int r10 = r12.getLogicHeight()
            int r9 = java.lang.Math.max(r9, r10)
            if (r9 > 0) goto L_0x010a
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "getVideoSize, openId: "
            r10.append(r12)
            r10.append(r8)
            java.lang.String r12 = " videoLen error"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            goto L_0x00dd
        L_0x010a:
            te3.od4 r10 = new te3.od4
            r10.<init>()
            int r11 = r12.getMemberId()
            r10.f332187d = r11
            r10.f332188e = r9
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r11 = "getVideoSize opend: %s veiwId: %d mid: %d width: %d height: %d logWidth: %d logHeight: %d videoLength:%d"
            java.lang.Object[] r13 = new java.lang.Object[r15]
            r13[r3] = r8
            int r21 = r12.getViewId()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r13[r6] = r21
            int r21 = r12.getMemberId()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r13[r5] = r21
            int r21 = r12.getWidth()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r13[r14] = r21
            int r21 = r12.getHeight()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r20 = 4
            r13[r20] = r21
            int r21 = r12.getLogicWidth()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r19 = 5
            r13[r19] = r21
            int r12 = r12.getLogicHeight()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r18 = 6
            r13[r18] = r12
            int r12 = r10.f332188e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r17 = 7
            r13[r17] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r13)
        L_0x016e:
            if (r10 == 0) goto L_0x018f
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r11 = "subscribe, get video member OK for openid: %s mid: %d videoLenght: %d"
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r12[r3] = r8
            int r13 = r10.f332187d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r6] = r13
            int r13 = r10.f332188e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r12)
            r0.add(r10)
        L_0x018f:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r9 = r1.f312249f
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r9 = r9.f312378h
            r9.getClass()
            java.lang.String r10 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r11 = "getScreenSize openId: %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r12)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r11 = r9.f312169b
            monitor-enter(r11)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r9 = r9.f312169b     // Catch:{ all -> 0x02d0 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ all -> 0x02d0 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x02d0 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x02d0 }
        L_0x01b0:
            r10 = 0
        L_0x01b1:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x02d0 }
            if (r12 == 0) goto L_0x01fc
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x02d0 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x02d0 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x02d0 }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c r10 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c) r10     // Catch:{ all -> 0x02d0 }
            if (r10 != 0) goto L_0x01c6
            goto L_0x01b1
        L_0x01c6:
            java.lang.String r12 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r13 = "getScreenSize openId: %s viewId: %d mid: %d"
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x02d0 }
            java.lang.String r22 = r10.getOpenId()     // Catch:{ all -> 0x02d0 }
            r15[r3] = r22     // Catch:{ all -> 0x02d0 }
            int r22 = r10.getViewId()     // Catch:{ all -> 0x02d0 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x02d0 }
            r15[r6] = r22     // Catch:{ all -> 0x02d0 }
            int r22 = r10.getMemberId()     // Catch:{ all -> 0x02d0 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x02d0 }
            r15[r5] = r22     // Catch:{ all -> 0x02d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r15)     // Catch:{ all -> 0x02d0 }
            boolean r12 = r10.mo149442y()     // Catch:{ all -> 0x02d0 }
            if (r12 == 0) goto L_0x01f9
            java.lang.String r12 = r10.getOpenId()     // Catch:{ all -> 0x02d0 }
            boolean r12 = r12.equals(r8)     // Catch:{ all -> 0x02d0 }
            if (r12 != 0) goto L_0x01fc
        L_0x01f9:
            r15 = 8
            goto L_0x01b0
        L_0x01fc:
            monitor-exit(r11)     // Catch:{ all -> 0x02d0 }
            if (r10 != 0) goto L_0x021d
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getScreenSize, openId: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = " not found"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
        L_0x021a:
            r11 = 0
            goto L_0x02ab
        L_0x021d:
            int r9 = r10.getLogicWidth()
            int r11 = r10.getLogicHeight()
            int r9 = java.lang.Math.max(r9, r11)
            if (r9 > 0) goto L_0x0247
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getScreenSize, openId: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = " videoLen error"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            goto L_0x021a
        L_0x0247:
            te3.od4 r11 = new te3.od4
            r11.<init>()
            int r12 = r10.getMemberId()
            r11.f332187d = r12
            r11.f332188e = r9
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r12 = "getScreenSize opend: %s veiwId: %d mid: %d width: %d height: %d logWidth: %d logHeight: %d videoLength:%d"
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r3] = r8
            int r15 = r10.getViewId()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13[r6] = r15
            int r15 = r10.getMemberId()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13[r5] = r15
            int r15 = r10.getWidth()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13[r14] = r15
            int r15 = r10.getHeight()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 4
            r13[r16] = r15
            int r15 = r10.getLogicWidth()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 5
            r13[r16] = r15
            int r10 = r10.getLogicHeight()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15 = 6
            r13[r15] = r10
            int r10 = r11.f332188e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15 = 7
            r13[r15] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r13)
        L_0x02ab:
            if (r11 == 0) goto L_0x02cc
            java.lang.String r9 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r10 = "subscribe, get screen member OK for openid: %s mid: %d videoLenght: %d"
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r12[r3] = r8
            int r8 = r11.f332187d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r6] = r8
            int r8 = r11.f332188e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r5] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r12)
            r2.add(r11)
        L_0x02cc:
            int r7 = r7 + 1
            goto L_0x003d
        L_0x02d0:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x02d0 }
            throw r0
        L_0x02d3:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02d3 }
            throw r0
        L_0x02d6:
            java.lang.String r4 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r7 = "hy: subscribe, videoMembers %d screenMembers %d"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r8 = r0.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r3] = r8
            int r8 = r2.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r6] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r5)
            java.lang.String[] r4 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.f312295a
            java.lang.String r4 = "MicroMsg.OpenVoice.OpenVoiceNativeEngine"
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0303
            java.lang.String r5 = "videoMembers is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
        L_0x0303:
            int r5 = r2.size()
            if (r5 != 0) goto L_0x030f
            java.lang.String r5 = "screenMembers is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
        L_0x030f:
            te3.nd4 r5 = new te3.nd4
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0318:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x032a
            java.lang.Object r6 = r0.next()
            te3.od4 r6 = (te3.od4) r6
            java.util.LinkedList<te3.od4> r7 = r5.f332183d
            r7.add(r6)
            goto L_0x0318
        L_0x032a:
            java.util.Iterator r0 = r2.iterator()
        L_0x032e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0340
            java.lang.Object r2 = r0.next()
            te3.od4 r2 = (te3.od4) r2
            java.util.LinkedList<te3.od4> r6 = r5.f332184e
            r6.add(r2)
            goto L_0x032e
        L_0x0340:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0390 }
            r0.<init>()     // Catch:{ IOException -> 0x0390 }
            java.lang.String r2 = "videoResParam:"
            r0.append(r2)     // Catch:{ IOException -> 0x0390 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0390 }
            byte[] r6 = r5.toByteArray()     // Catch:{ IOException -> 0x0390 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0390 }
            r0.append(r2)     // Catch:{ IOException -> 0x0390 }
            java.lang.String r2 = ",length:"
            r0.append(r2)     // Catch:{ IOException -> 0x0390 }
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x0390 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0390 }
            r0.append(r2)     // Catch:{ IOException -> 0x0390 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0390 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ IOException -> 0x0390 }
            com.tencent.wxmm.v2conference r0 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105172s.f312297c     // Catch:{ IOException -> 0x0390 }
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x0390 }
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0390 }
            int r5 = r5.length     // Catch:{ IOException -> 0x0390 }
            int r0 = r0.SubscribeVideo(r2, r5)     // Catch:{ IOException -> 0x0390 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0390 }
            r2.<init>()     // Catch:{ IOException -> 0x0390 }
            java.lang.String r5 = "steve: subScribeVideoAndResList ret:"
            r2.append(r5)     // Catch:{ IOException -> 0x0390 }
            r2.append(r0)     // Catch:{ IOException -> 0x0390 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0390 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ IOException -> 0x0390 }
            goto L_0x0398
        L_0x0390:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r5 = "SetVideoResolution exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r2)
        L_0x0398:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b r0 = r1.f312247d
            java.lang.String r2 = "ok"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.mo118169a(r3, r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105154k0.run():void");
    }
}
