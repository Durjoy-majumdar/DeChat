package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import n11.C109670d;
import vk0.C22766l;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 */
public class C105140f1 {

    /* renamed from: a */
    public C105165o f312168a = null;

    /* renamed from: b */
    public final Map<Integer, C105130c> f312169b = new HashMap();

    /* renamed from: c */
    public boolean f312170c = false;

    /* renamed from: d */
    public boolean f312171d = true;

    /* renamed from: e */
    public int f312172e = 640;

    /* renamed from: f */
    public int f312173f = 480;

    public C105140f1(C105165o oVar) {
        this.f312168a = oVar;
    }

    /* renamed from: a */
    public void mo149451a(C105130c cVar) {
        if (cVar.mo149437l()) {
            C105181w wVar = C105181w.INSTANCE;
            wVar.getClass();
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", C22766l.NAME);
            wVar.mo149500g(new C105160m0(wVar));
            if (cVar instanceof C105155l) {
                wVar.f312361U.mo160898d((C105155l) cVar, cVar.getMemberId() + "_video");
            }
        } else {
            C105148h1 h1Var = (C105148h1) cVar;
            if (h1Var.mo149441w()) {
                C109670d dVar = C105181w.INSTANCE.f312361U;
                dVar.mo160898d(h1Var, h1Var.getMemberId() + "_video");
            } else if (h1Var.mo149442y()) {
                C109670d dVar2 = C105181w.INSTANCE.f312361U;
                dVar2.mo160898d(h1Var, h1Var.getMemberId() + "_screen");
            }
        }
        synchronized (this.f312169b) {
            cVar.mo149438p();
            ((HashMap) this.f312169b).remove(Integer.valueOf(cVar.getViewId()));
        }
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "del View, viewId:" + cVar.getViewId() + " memberId:" + cVar.getMemberId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r1 = r12.f312168a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r1 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r1 = r1.f312278a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r1 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.hasNext() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r4 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r4.f328294b.equals(r3) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r4 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, not found member, data:" + r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "new View, mid:" + r4.f328293a + " data:" + r14.toString());
        r1 = r14.optString("type", "camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d1, code lost:
        if (r1.equals("camera") == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r15 == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isSameLayer: mWidth: " + r12.f312172e + ", mHeight: " + r12.f312173f);
        r6 = new com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105155l(r13, r4, r14, r12.f312172e, r12.f312173f);
        com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE.f312361U.mo160895a(r6, r4.f328293a + "_video");
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0122, code lost:
        if (r12.f312171d == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isUseNewPlayMode: mWidth: " + r12.f312172e + ", mHeight: " + r12.f312173f);
        r15 = new com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105175u(r13, r4, r12.f312172e, r12.f312173f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0151, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: mWidth: " + r12.f312172e + ", mHeight: " + r12.f312173f);
        r15 = new com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105159m(r13, r4, r12.f312172e, r12.f312173f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0184, code lost:
        if (r1.equals("video") != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018d, code lost:
        if (r1.equals("screen") == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, type unsupport, data:" + r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ab, code lost:
        r15 = new com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105148h1(r13, r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b7, code lost:
        if (r1.equals("video") == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b9, code lost:
        com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE.f312361U.mo160895a(r15, r4.f328293a + "_video");
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d4, code lost:
        com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE.f312361U.mo160895a(r15, r4.f328293a + "_screen");
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01f2, code lost:
        if (r15.mo149437l() == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01f4, code lost:
        r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE;
        r13.getClass();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "onCameraStart");
        r13.mo149500g(new com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105158l0(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0208, code lost:
        r13 = r12.f312169b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x020a, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        ((java.util.HashMap) r12.f312169b).put(java.lang.Integer.valueOf(r0), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0216, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0217, code lost:
        return r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c mo149452b(android.content.Context r13, org.json.JSONObject r14, boolean r15) {
        /*
            r12 = this;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r0 = r0.f312381n
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r1 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.C85161i.InRoom
            r2 = 0
            if (r0 == r1) goto L_0x0024
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "newView failed, not in room, data:"
            r15.append(r0)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r14)
            return r2
        L_0x0024:
            java.lang.String r0 = "viewId"
            r1 = 0
            int r0 = r14.optInt(r0, r1)
            java.lang.String r3 = "openId"
            java.lang.String r4 = ""
            java.lang.String r3 = r14.optString(r3, r4)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r4 = r12.f312169b
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r5 = r12.f312169b     // Catch:{ all -> 0x021b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021b }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x021b }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x021b }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c r5 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c) r5     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x005d
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r14 = "newView failed, already create, viewId: %d openId: %s"
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x021b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021b }
            r15[r1] = r0     // Catch:{ all -> 0x021b }
            r0 = 1
            r15[r0] = r3     // Catch:{ all -> 0x021b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r14, r15)     // Catch:{ all -> 0x021b }
            monitor-exit(r4)     // Catch:{ all -> 0x021b }
            return r2
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x021b }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o r1 = r12.f312168a
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            r4 = r2
            goto L_0x0081
        L_0x0064:
            java.util.ArrayList<n11.c> r1 = r1.f312278a
            if (r1 != 0) goto L_0x0069
            goto L_0x0062
        L_0x0069:
            java.util.Iterator r1 = r1.iterator()
        L_0x006d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r1.next()
            n11.c r4 = (n11.C109669c) r4
            java.lang.String r5 = r4.f328294b
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x006d
        L_0x0081:
            if (r4 != 0) goto L_0x009e
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "newView failed, not found member, data:"
            r15.append(r0)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r14)
            return r2
        L_0x009e:
            java.lang.String r1 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "new View, mid:"
            r3.append(r5)
            int r5 = r4.f328293a
            r3.append(r5)
            java.lang.String r5 = " data:"
            r3.append(r5)
            java.lang.String r5 = r14.toString()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.lang.String r1 = "type"
            java.lang.String r3 = "camera"
            java.lang.String r1 = r14.optString(r1, r3)
            java.lang.String r3 = "camera"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x017d
            if (r15 == 0) goto L_0x0120
            java.lang.String r15 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "anlin: isSameLayer: mWidth: "
            r1.append(r2)
            int r2 = r12.f312172e
            r1.append(r2)
            java.lang.String r2 = ", mHeight: "
            r1.append(r2)
            int r2 = r12.f312173f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l r15 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l
            int r10 = r12.f312172e
            int r11 = r12.f312173f
            r6 = r15
            r7 = r13
            r8 = r4
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            n11.d r13 = r13.f312361U
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r1 = r4.f328293a
            r14.append(r1)
            java.lang.String r1 = "_video"
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r13.mo160895a(r15, r14)
            goto L_0x01ee
        L_0x0120:
            boolean r14 = r12.f312171d
            if (r14 == 0) goto L_0x0151
            java.lang.String r14 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "anlin: isUseNewPlayMode: mWidth: "
            r15.append(r1)
            int r1 = r12.f312172e
            r15.append(r1)
            java.lang.String r1 = ", mHeight: "
            r15.append(r1)
            int r1 = r12.f312173f
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u r15 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u
            int r14 = r12.f312172e
            int r1 = r12.f312173f
            r15.<init>(r13, r4, r14, r1)
            goto L_0x01ee
        L_0x0151:
            java.lang.String r14 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "anlin: mWidth: "
            r15.append(r1)
            int r1 = r12.f312172e
            r15.append(r1)
            java.lang.String r1 = ", mHeight: "
            r15.append(r1)
            int r1 = r12.f312173f
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m r15 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m
            int r14 = r12.f312172e
            int r1 = r12.f312173f
            r15.<init>(r13, r4, r14, r1)
            goto L_0x01ee
        L_0x017d:
            java.lang.String r15 = "video"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x01ab
            java.lang.String r15 = "screen"
            boolean r15 = r1.equals(r15)
            if (r15 == 0) goto L_0x0190
            goto L_0x01ab
        L_0x0190:
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "newView failed, type unsupport, data:"
            r15.append(r0)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r14)
            return r2
        L_0x01ab:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h1 r15 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h1
            r15.<init>(r13, r4, r14)
            java.lang.String r13 = "video"
            boolean r13 = r1.equals(r13)
            if (r13 == 0) goto L_0x01d4
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            n11.d r13 = r13.f312361U
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r1 = r4.f328293a
            r14.append(r1)
            java.lang.String r1 = "_video"
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r13.mo160895a(r15, r14)
            goto L_0x01ee
        L_0x01d4:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            n11.d r13 = r13.f312361U
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r1 = r4.f328293a
            r14.append(r1)
            java.lang.String r1 = "_screen"
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r13.mo160895a(r15, r14)
        L_0x01ee:
            boolean r13 = r15.mo149437l()
            if (r13 == 0) goto L_0x0208
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r13 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            r13.getClass()
            java.lang.String r14 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r1 = "onCameraStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l0 r14 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l0
            r14.<init>(r13)
            r13.mo149500g(r14)
        L_0x0208:
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r13 = r12.f312169b
            monitor-enter(r13)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c> r14 = r12.f312169b     // Catch:{ all -> 0x0218 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0218 }
            java.util.HashMap r14 = (java.util.HashMap) r14     // Catch:{ all -> 0x0218 }
            r14.put(r0, r15)     // Catch:{ all -> 0x0218 }
            monitor-exit(r13)     // Catch:{ all -> 0x0218 }
            return r15
        L_0x0218:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0218 }
            throw r14
        L_0x021b:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x021b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105140f1.mo149452b(android.content.Context, org.json.JSONObject, boolean):com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c");
    }

    /* renamed from: c */
    public void mo149453c() {
        Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release");
        try {
            synchronized (this) {
                if (this.f312170c) {
                    this.f312170c = false;
                    synchronized (this.f312169b) {
                        ((HashMap) this.f312169b).clear();
                    }
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release error:" + e.toString());
        }
    }
}
