package com.tencent.p014mm.network;

import com.tencent.mars.stn.StnLogic;

/* renamed from: com.tencent.mm.network.r0$$b */
public class r0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f344191d;

    /* renamed from: e */
    public final /* synthetic */ Object f344192e;

    /* renamed from: f */
    public final /* synthetic */ int f344193f;

    /* renamed from: g */
    public final /* synthetic */ int f344194g;

    /* renamed from: h */
    public final /* synthetic */ StnLogic.CgiProfile f344195h;

    public r0$$b(C114796r0 r0Var, int i, Object obj, int i2, int i3, StnLogic.CgiProfile cgiProfile) {
        this.f344191d = i;
        this.f344192e = obj;
        this.f344193f = i2;
        this.f344194g = i3;
        this.f344195h = cgiProfile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r0 != 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r0 != 3) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (com.tencent.p014mm.network.C114781l0.m161558e().f344174b != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r0 != 1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MMNativeNetTaskAdapter", "network not available");
        r4 = 2;
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r9 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r0 = r2.f344152a;
        r13 = r0[r8];
        r11 = r13.f344153a;
        r12 = r13.f344154b;
        r14 = r13.f344156d;
        r0[r8] = null;
        r0 = new te3.C90420iq();
        r2.mo174430f(r0, r5);
        r0.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11.getRespObj().n80(r0.toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MMNativeNetTaskAdapter", "set profile failed " + r0.getLocalizedMessage());
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A[Catch:{ Exception -> 0x028b }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x027b A[Catch:{ Exception -> 0x028b }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b6 A[SYNTHETIC, Splitter:B:87:0x01b6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            r1 = r23
            com.tencent.mm.network.i0 r2 = com.tencent.p014mm.network.C114781l0.m161559f()
            int r3 = r1.f344191d
            int r0 = r1.f344193f
            int r4 = r1.f344194g
            com.tencent.mars.stn.StnLogic$CgiProfile r5 = r1.f344195h
            com.tencent.mm.network.i0$a[] r6 = r2.f344152a
            monitor-enter(r6)
            int r8 = r2.mo174429e(r3)     // Catch:{ all -> 0x02b3 }
            r7 = 3
            r9 = -1
            r14 = 1
            r15 = 2
            r16 = 0
            if (r9 != r8) goto L_0x003b
            java.lang.String r2 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r5 = "mmcgi onGYNetEnd GET FROM QUEUE failed. native:[%d,%d] taskId:%d "
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x02b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b3 }
            r7[r16] = r0     // Catch:{ all -> 0x02b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02b3 }
            r7[r14] = r0     // Catch:{ all -> 0x02b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02b3 }
            r7[r15] = r0     // Catch:{ all -> 0x02b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r7)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r6)     // Catch:{ all -> 0x02b3 }
            goto L_0x02b2
        L_0x003b:
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0056;
                case 2: goto L_0x0056;
                case 3: goto L_0x0054;
                case 4: goto L_0x0054;
                case 5: goto L_0x0054;
                case 6: goto L_0x0054;
                case 7: goto L_0x0041;
                case 8: goto L_0x0052;
                case 9: goto L_0x0054;
                case 10: goto L_0x0054;
                default: goto L_0x003e;
            }     // Catch:{ all -> 0x02b3 }
        L_0x003e:
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch:{ all -> 0x02b3 }
            goto L_0x0058
        L_0x0041:
            r0 = -3002(0xfffffffffffff446, float:NaN)
            if (r0 == r4) goto L_0x0052
            r0 = -3003(0xfffffffffffff445, float:NaN)
            if (r0 != r4) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            if (r0 != r4) goto L_0x0050
            r0 = 6
            goto L_0x0066
        L_0x0050:
            r0 = 5
            goto L_0x0066
        L_0x0052:
            r0 = 4
            goto L_0x0066
        L_0x0054:
            r0 = 1
            goto L_0x0066
        L_0x0056:
            r0 = 2
            goto L_0x0066
        L_0x0058:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b3 }
            r13[r16] = r0     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r9 = "c2JavaErrorType not exits c_errType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105923f(r0, r9, r13)     // Catch:{ all -> 0x02b3 }
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 != 0) goto L_0x0069
            r4 = 0
        L_0x0069:
            if (r0 != r7) goto L_0x006c
            r4 = -1
        L_0x006c:
            com.tencent.mm.network.m0 r9 = com.tencent.p014mm.network.C114781l0.m161558e()     // Catch:{ all -> 0x02b3 }
            boolean r9 = r9.f344174b     // Catch:{ all -> 0x02b3 }
            if (r9 != 0) goto L_0x0080
            if (r0 != r14) goto L_0x0080
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r4 = "network not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x02b3 }
            r4 = 2
            r9 = -1
            goto L_0x0082
        L_0x0080:
            r9 = r4
            r4 = r0
        L_0x0082:
            com.tencent.mm.network.i0$a[] r0 = r2.f344152a     // Catch:{ all -> 0x02b3 }
            r13 = r0[r8]     // Catch:{ all -> 0x02b3 }
            com.tencent.mm.network.v r11 = r13.f344153a     // Catch:{ all -> 0x02b3 }
            com.tencent.mm.network.o r12 = r13.f344154b     // Catch:{ all -> 0x02b3 }
            long r14 = r13.f344156d     // Catch:{ all -> 0x02b3 }
            r13 = 0
            r0[r8] = r13     // Catch:{ all -> 0x02b3 }
            te3.iq r0 = new te3.iq     // Catch:{ all -> 0x02b3 }
            r0.<init>()     // Catch:{ all -> 0x02b3 }
            r2.mo174430f(r0, r5)     // Catch:{ all -> 0x02b3 }
            r0.getData()     // Catch:{ all -> 0x02b3 }
            qe3.k r5 = r11.getRespObj()     // Catch:{ Exception -> 0x00a6 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x00a6 }
            r5.n80(r0)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00c2
        L_0x00a6:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b3 }
            r13.<init>()     // Catch:{ all -> 0x02b3 }
            java.lang.String r7 = "set profile failed "
            r13.append(r7)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x02b3 }
            r13.append(r0)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x02b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x02b3 }
        L_0x00c2:
            if (r4 != 0) goto L_0x00ee
            int r0 = r11.getType()     // Catch:{ RemoteException -> 0x0112 }
            r5 = 10
            if (r0 == r5) goto L_0x00d4
            r5 = 268369922(0xfff0002, float:2.5144944E-29)
            if (r0 != r5) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r0 = 0
            goto L_0x00d5
        L_0x00d4:
            r0 = 1
        L_0x00d5:
            if (r0 != 0) goto L_0x00ee
            qe3.k r0 = r11.getRespObj()     // Catch:{ RemoteException -> 0x0112 }
            int r0 = r0.mo182462Om()     // Catch:{ RemoteException -> 0x0112 }
            if (r0 == 0) goto L_0x00ee
            qe3.k r0 = r11.getRespObj()     // Catch:{ RemoteException -> 0x00eb }
            int r9 = r0.mo182462Om()     // Catch:{ RemoteException -> 0x00eb }
            r4 = 4
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            r4 = 4
            goto L_0x0113
        L_0x00ee:
            int r5 = r11.getType()     // Catch:{ RemoteException -> 0x0112 }
            com.tencent.mm.network.y r17 = com.tencent.p014mm.network.C114781l0.m161554a()     // Catch:{ RemoteException -> 0x0110 }
            r20 = 0
            qe3.k r0 = r11.getRespObj()     // Catch:{ RemoteException -> 0x0110 }
            byte[] r22 = r0.getCookie()     // Catch:{ RemoteException -> 0x0110 }
            r18 = r4
            r19 = r9
            r21 = r11
            r17.mo174492i(r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x0110 }
            int r0 = r11.mo174479o8()     // Catch:{ RemoteException -> 0x0110 }
            r10 = r9
        L_0x010e:
            r9 = r4
            goto L_0x012e
        L_0x0110:
            r0 = move-exception
            goto L_0x0114
        L_0x0112:
            r0 = move-exception
        L_0x0113:
            r5 = -1
        L_0x0114:
            java.lang.String r7 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r13 = "exception:%s taskid:%d"
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02b3 }
            r1[r16] = r0     // Catch:{ all -> 0x02b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02b3 }
            r10 = 1
            r1[r10] = r0     // Catch:{ all -> 0x02b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r13, r1)     // Catch:{ all -> 0x02b3 }
            r10 = r9
            r0 = 0
            goto L_0x010e
        L_0x012e:
            monitor-exit(r6)     // Catch:{ all -> 0x02b3 }
            boolean r1 = p285zh.C119114c.f356684a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "notePushNetScene: func="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MicroMsg.NotifyPowerInspector"
            p285zh.C119114c.m167920e(r4, r1)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r1 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r1 = r1.isBackground()
            if (r1 == 0) goto L_0x0158
            d3.a<java.lang.Integer> r1 = p285zh.C119114c.f356702s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.accept(r4)
        L_0x0158:
            java.lang.String r1 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r4 = "mmcgi onTaskEnd type:%d time:%d hash[%d,%d] [%d,%d]"
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r16] = r7
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r14)
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r13 = 1
            r6[r13] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r13 = 2
            r6[r13] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = 3
            r6[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r7 = 4
            r6[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13 = 5
            r6[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)
            if (r7 != r9) goto L_0x01ab
            r1 = -1
            if (r1 == r10) goto L_0x019f
            r0 = -2
            if (r0 == r10) goto L_0x019f
            r0 = -24
            if (r0 == r10) goto L_0x019f
            r0 = -34
            if (r0 != r10) goto L_0x01ab
        L_0x019f:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.network.C114781l0.m161556c()
            com.tencent.mm.network.h0 r1 = new com.tencent.mm.network.h0
            r1.<init>(r2, r5, r10)
            r0.post(r1)
        L_0x01ab:
            java.lang.String r1 = "MicroMsg.MMNativeNetTaskAdapter"
            if (r11 != 0) goto L_0x01b6
            java.lang.String r0 = "rr is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x025b
        L_0x01b6:
            int r0 = r11.getType()     // Catch:{ Exception -> 0x0242 }
            r2 = 763(0x2fb, float:1.069E-42)
            if (r0 == r2) goto L_0x01d2
            r2 = 702(0x2be, float:9.84E-43)
            if (r0 == r2) goto L_0x01d2
            r2 = 252(0xfc, float:3.53E-43)
            if (r0 == r2) goto L_0x01d2
            r2 = 701(0x2bd, float:9.82E-43)
            if (r0 == r2) goto L_0x01d2
            r2 = 3941(0xf65, float:5.523E-42)
            if (r0 == r2) goto L_0x01d2
            r2 = 126(0x7e, float:1.77E-43)
            if (r0 != r2) goto L_0x025b
        L_0x01d2:
            java.lang.String r0 = r11.pr0()     // Catch:{ Exception -> 0x0242 }
            java.lang.String r2 = r11.h30()     // Catch:{ Exception -> 0x0242 }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0242 }
            java.lang.String r5 = " "
            if (r4 != 0) goto L_0x021f
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0242 }
            if (r4 == 0) goto L_0x01e9
            goto L_0x021f
        L_0x01e9:
            com.tencent.mm.network.y r4 = com.tencent.p014mm.network.C114781l0.m161554a()     // Catch:{ Exception -> 0x0242 }
            if (r4 == 0) goto L_0x0219
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0242 }
            r4.<init>()     // Catch:{ Exception -> 0x0242 }
            java.lang.String r6 = "save cgi key "
            r4.append(r6)     // Catch:{ Exception -> 0x0242 }
            int r6 = r0.length()     // Catch:{ Exception -> 0x0242 }
            r4.append(r6)     // Catch:{ Exception -> 0x0242 }
            r4.append(r5)     // Catch:{ Exception -> 0x0242 }
            int r5 = r2.length()     // Catch:{ Exception -> 0x0242 }
            r4.append(r5)     // Catch:{ Exception -> 0x0242 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0242 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x0242 }
            com.tencent.mm.network.y r4 = com.tencent.p014mm.network.C114781l0.m161554a()     // Catch:{ Exception -> 0x0242 }
            r4.mo174499r(r0, r2)     // Catch:{ Exception -> 0x0242 }
            goto L_0x025b
        L_0x0219:
            java.lang.String r0 = "MMPushCore.getAutoAuth() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x0242 }
            goto L_0x025b
        L_0x021f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0242 }
            r4.<init>()     // Catch:{ Exception -> 0x0242 }
            java.lang.String r6 = "public or private key is null "
            r4.append(r6)     // Catch:{ Exception -> 0x0242 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0242 }
            r4.append(r0)     // Catch:{ Exception -> 0x0242 }
            r4.append(r5)     // Catch:{ Exception -> 0x0242 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0242 }
            r4.append(r0)     // Catch:{ Exception -> 0x0242 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0242 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x0242 }
            goto L_0x025b
        L_0x0242:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "save cgi verify key error "
            r2.append(r4)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x025b:
            qe3.k r0 = r11.getRespObj()     // Catch:{ Exception -> 0x028b }
            java.lang.String r0 = r0.getErrMsg()     // Catch:{ Exception -> 0x028b }
            if (r0 == 0) goto L_0x027b
            int r1 = r0.length()     // Catch:{ Exception -> 0x028b }
            if (r1 <= 0) goto L_0x027b
            qe3.k r1 = r11.getRespObj()     // Catch:{ Exception -> 0x028b }
            byte[] r13 = r1.getCookie()     // Catch:{ Exception -> 0x028b }
            r7 = r12
            r1 = r11
            r11 = r0
            r12 = r1
            r7.mo174444Rb(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x028b }
            goto L_0x02b2
        L_0x027b:
            r1 = r11
            r11 = 0
            qe3.k r0 = r1.getRespObj()     // Catch:{ Exception -> 0x028b }
            byte[] r13 = r0.getCookie()     // Catch:{ Exception -> 0x028b }
            r7 = r12
            r12 = r1
            r7.mo174444Rb(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x028b }
            goto L_0x02b2
        L_0x028b:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r2 = "onGYNetEnd cb %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = r0.getMessage()
            r5[r16] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r5)
            java.lang.String r1 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r2 = "exception:%s taskid:%d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5[r16] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r5)
        L_0x02b2:
            return
        L_0x02b3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02b3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.r0$$b.run():void");
    }
}
