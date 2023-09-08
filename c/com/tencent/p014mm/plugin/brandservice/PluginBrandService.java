package com.tencent.p014mm.plugin.brandservice;

import android.content.Context;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29782v;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19601c0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19641z0;
import com.tencent.p014mm.storage.C72975h0;
import di3.C86301e;
import di3.C86312j;
import dx0.C31332a;
import eb0.C31543z5;
import ei3.C86522b;
import g62.C75875l;
import p007bo.C16804h;
import p007bo.C16810i;
import p227rn.C22240c0;
import rx3.C36570n;
import te3.C64522lg;
import wc3.C22881c;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.brandservice.PluginBrandService */
public class PluginBrandService extends C86301e {

    /* renamed from: d */
    public C114668z.C104589a f80712d = new C114668z.C104589a(this) {
        public void onAppBackground(String str) {
            C19627t tVar = C19627t.f55586a;
            C19627t.f55579G = false;
            if (C19627t.f55578F) {
                tVar.mo25821C();
            }
            if (C16804h.f45408b && ((Boolean) ((C36570n) C16804h.f45413g).getValue()).booleanValue()) {
                C119179t tVar2 = C119157j.f356862d;
                C16810i iVar = C16810i.f45419d;
                C119157j jVar = (C119157j) tVar2;
                jVar.getClass();
                jVar.mo183889t(iVar, 3000, (String) null);
            }
        }

        public void onAppForeground(String str) {
            C19627t.f55579G = true;
            C72975h0.f212785a = C31543z5.m39451a();
            C16804h.f45407a.mo17846a("onAppForeground");
            C22881c cVar = C22881c.f65777a;
            if (cVar.mo36060e()) {
                boolean z = false;
                if (cVar.mo36061f()) {
                    boolean z2 = cVar.mo36059d().getBoolean("biz_time_preload_at_foreground", false);
                    Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy foregroundPreloadEnable %b", Boolean.valueOf(z2));
                    z = z2;
                }
                if (z) {
                    cVar.mo36064i();
                }
            }
            C19641z0.f55645a.mo25866i(1, (C64522lg) null, 0);
            C19601c0.f55446a.mo25724m(C19601c0.C19602a.REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX);
            ((C22240c0) C86312j.m106911c(C22240c0.class)).R90();
        }
    };

    /* renamed from: w5 */
    public static void m38862w5(C75875l lVar, final C75875l.C45886e eVar) {
        if (!CrashReportFactory.isBackupMerge() && lVar != null && eVar != null) {
            C31332a.m39373a("BrandServiceWorkerThread", new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
                /* JADX WARNING: Removed duplicated region for block: B:74:0x018e  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r23 = this;
                        r1 = r23
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.lang.String r0 = r0.f123845b
                        java.lang.String r2 = "insert"
                        boolean r0 = r2.equals(r0)
                        if (r0 != 0) goto L_0x001f
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.lang.String r0 = r0.f123845b
                        java.lang.String r3 = "update"
                        boolean r0 = r3.equals(r0)
                        if (r0 == 0) goto L_0x001c
                        goto L_0x001f
                    L_0x001c:
                        r4 = 0
                        goto L_0x02ef
                    L_0x001f:
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r0 = r0.f123846c
                        if (r0 == 0) goto L_0x02ec
                        r0 = 0
                    L_0x0026:
                        g62.l$e r3 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r3 = r3.f123846c
                        int r3 = r3.size()
                        if (r0 >= r3) goto L_0x02e9
                        g62.l$e r3 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r3 = r3.f123846c
                        java.lang.Object r3 = r3.get(r0)
                        com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
                        int r4 = r3.mo108769t2()
                        r5 = 1
                        if (r4 == r5) goto L_0x02e1
                        java.lang.String r4 = r3.mo108768t()
                        sg.g<java.lang.Long, s90.i> r6 = com.tencent.p014mm.message.C92721n.f266840a
                        boolean r4 = kb0.C9576e.m9260a(r4)
                        if (r4 == 0) goto L_0x004f
                        goto L_0x02e1
                    L_0x004f:
                        java.lang.String r4 = r3.mo108768t()
                        boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
                        if (r4 == 0) goto L_0x005b
                        goto L_0x02e1
                    L_0x005b:
                        java.lang.Class<f62.k0> r4 = f62.C75700k0.class
                        k40.a r4 = f40.C86709a0.m107533q(r4)
                        f62.k0 r4 = (f62.C75700k0) r4
                        com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
                        java.lang.String r6 = r3.mo108768t()
                        com.tencent.mm.storage.z1 r4 = r4.get(r6)
                        if (r4 == 0) goto L_0x007f
                        boolean r6 = r4.mo62927s3()
                        if (r6 == 0) goto L_0x007f
                        boolean r6 = r4.mo62916m3()
                        if (r6 != 0) goto L_0x007f
                        goto L_0x02e1
                    L_0x007f:
                        java.lang.String r6 = r3.f230724G
                        eb0.z3$$h r6 = eb0.C75604z3.m90851w(r6)
                        java.lang.String r7 = "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d"
                        java.lang.String r8 = "MicroMsg.BizTimeLineInfoStorageLogic"
                        r9 = -1
                        if (r6 == 0) goto L_0x00d5
                        int r9 = r6.f222095b
                        int r13 = r6.f222096c
                        int r14 = r6.f222097d
                        int r15 = r6.f222101h
                        r17 = r3
                        long r2 = (long) r15
                        long r10 = r6.f222102i
                        r20 = 8
                        long r20 = r10 & r20
                        r18 = 0
                        int r12 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
                        if (r12 == 0) goto L_0x00a5
                        r12 = 1
                        goto L_0x00a6
                    L_0x00a5:
                        r12 = 0
                    L_0x00a6:
                        r20 = 16
                        long r20 = r10 & r20
                        int r22 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
                        if (r22 == 0) goto L_0x00b1
                        r20 = 1
                        goto L_0x00b3
                    L_0x00b1:
                        r20 = 0
                    L_0x00b3:
                        r21 = 4
                        long r10 = r10 & r21
                        int r21 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                        if (r21 == 0) goto L_0x00d2
                        r10 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r10]
                        java.lang.String r3 = r17.mo108768t()
                        r4 = 0
                        r2[r4] = r3
                        long r3 = r6.f222102i
                        java.lang.Long r3 = java.lang.Long.valueOf(r3)
                        r2[r5] = r3
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r2)
                        goto L_0x02e1
                    L_0x00d2:
                        r10 = r9
                        r9 = r13
                        goto L_0x00de
                    L_0x00d5:
                        r17 = r3
                        r2 = 0
                        r10 = -1
                        r12 = 0
                        r14 = -1
                        r20 = 0
                    L_0x00de:
                        if (r9 == 0) goto L_0x00e2
                        goto L_0x02e1
                    L_0x00e2:
                        r9 = r0
                        if (r6 == 0) goto L_0x0100
                        long r0 = r6.f222102i
                        r21 = 64
                        long r0 = r0 & r21
                        r18 = 0
                        int r11 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
                        if (r11 == 0) goto L_0x0100
                        if (r4 == 0) goto L_0x0100
                        boolean r0 = r4.mo62927s3()
                        if (r0 == 0) goto L_0x0100
                        java.lang.String r0 = "not fans msg should not be is contact"
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
                        goto L_0x02e2
                    L_0x0100:
                        int r0 = r17.getType()
                        r1 = 34
                        r13 = 3
                        if (r0 == r1) goto L_0x0156
                        int r0 = r17.getType()
                        if (r0 == r13) goto L_0x0156
                        int r0 = r17.getType()
                        if (r0 != r5) goto L_0x0116
                        goto L_0x0156
                    L_0x0116:
                        if (r10 == r13) goto L_0x0124
                        r0 = 9
                        if (r14 == r0) goto L_0x0124
                        r0 = 15
                        if (r14 == r0) goto L_0x0124
                        r0 = 17
                        if (r14 != r0) goto L_0x0156
                    L_0x0124:
                        boolean r0 = r17.mo100967F3()
                        if (r0 == 0) goto L_0x0156
                        boolean r0 = r17.mo100967F3()
                        if (r0 == 0) goto L_0x0148
                        java.lang.Class<gw0.b> r0 = gw0.C76073b.class
                        di3.d r0 = di3.C86312j.m106911c(r0)
                        gw0.b r0 = (gw0.C76073b) r0
                        r1 = r12
                        long r11 = r17.getMsgId()
                        java.lang.String r14 = r17.getContent()
                        s90.f r0 = r0.mo94597JZ(r11, r14)
                        s90.i r0 = (s90.C77629i) r0
                        goto L_0x014a
                    L_0x0148:
                        r1 = r12
                        r0 = 0
                    L_0x014a:
                        if (r0 == 0) goto L_0x0157
                        java.util.LinkedList<s90.j> r0 = r0.f226295i
                        boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
                        if (r0 != 0) goto L_0x0157
                        r0 = 1
                        goto L_0x0158
                    L_0x0156:
                        r1 = r12
                    L_0x0157:
                        r0 = 0
                    L_0x0158:
                        r11 = 4
                        java.lang.Object[] r11 = new java.lang.Object[r11]
                        java.lang.String r12 = r17.mo108768t()
                        r14 = 0
                        r11[r14] = r12
                        java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
                        r11[r5] = r12
                        long r21 = r17.getMsgId()
                        java.lang.Long r12 = java.lang.Long.valueOf(r21)
                        r14 = 2
                        r11[r14] = r12
                        long r21 = r17.mo108774y2()
                        java.lang.Long r12 = java.lang.Long.valueOf(r21)
                        r11[r13] = r12
                        java.lang.String r12 = "doInsertBizTimeLineMsg %s, isTimeLine %b, msgId=%d, svrId=%d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
                        if (r0 != 0) goto L_0x018e
                        wc3.C22881c.f65778b = r5
                        r0 = r17
                        r11 = 0
                        com.tencent.p014mm.storage.C19636w0.m21159a(r0, r11)
                        goto L_0x02e2
                    L_0x018e:
                        r0 = r17
                        r11 = 0
                        if (r6 == 0) goto L_0x01b5
                        long r13 = r6.f222102i
                        r16 = 2
                        long r13 = r13 & r16
                        r16 = 0
                        int r21 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                        if (r21 == 0) goto L_0x01b5
                        r13 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r13]
                        java.lang.String r0 = r0.mo108768t()
                        r1[r11] = r0
                        long r2 = r6.f222102i
                        java.lang.Long r0 = java.lang.Long.valueOf(r2)
                        r1[r5] = r0
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r1)
                        goto L_0x02e2
                    L_0x01b5:
                        wc3.C22881c.f65778b = r5
                        com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
                        long r13 = r0.getMsgId()
                        com.tencent.mm.storage.o0 r6 = r6.mo25806kD(r13)
                        if (r6 != 0) goto L_0x01cb
                        com.tencent.mm.storage.o0 r7 = new com.tencent.mm.storage.o0
                        r7.<init>()
                        goto L_0x01cc
                    L_0x01cb:
                        r7 = r6
                    L_0x01cc:
                        long r13 = r0.getMsgId()
                        r7.field_msgId = r13
                        long r13 = r0.mo108774y2()
                        r7.field_msgSvrId = r13
                        java.lang.String r11 = r0.getContent()
                        r7.field_content = r11
                        int r11 = r0.getType()
                        r7.field_type = r11
                        java.lang.String r11 = r0.mo108768t()
                        r7.field_talker = r11
                        int r11 = r0.mo108723B2()
                        r7.field_talkerId = r11
                        long r13 = r0.getCreateTime()
                        r7.field_createTime = r13
                        java.lang.String r11 = r0.mo108765s2()
                        r7.field_imgPath = r11
                        int r11 = r0.f230723F
                        r7.mo183585l2(r11)
                        java.lang.String r11 = r0.f230724G
                        r7.f356046F = r11
                        r7.f356057o = r5
                        java.lang.String r11 = r0.mo108761n2()
                        r7.field_bizClientMsgId = r11
                        if (r20 == 0) goto L_0x0214
                        int r11 = r7.field_bitFlag
                        r11 = r11 | r5
                        r7.field_bitFlag = r11
                    L_0x0214:
                        if (r4 == 0) goto L_0x0220
                        boolean r4 = r4.mo62940x3()
                        if (r4 == 0) goto L_0x0220
                        r7.field_placeTop = r5
                        r4 = 0
                        goto L_0x0223
                    L_0x0220:
                        r4 = 0
                        r7.field_placeTop = r4
                    L_0x0223:
                        if (r6 != 0) goto L_0x02c9
                        int r0 = r0.getStatus()
                        r7.field_status = r0
                        r7.field_hasShow = r4
                        com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
                        long r13 = r0.mo25790TE()
                        long r10 = r7.field_createTime
                        r4 = r1
                        r0 = 1000(0x3e8, double:4.94E-321)
                        long r10 = r10 / r0
                        long r10 = com.tencent.p014mm.storage.C19636w0.m21166h(r13, r10)
                        r20 = 4294967296(0x100000000, double:2.121995791E-314)
                        int r17 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
                        if (r17 < 0) goto L_0x026d
                        java.lang.Object[] r13 = new java.lang.Object[r5]
                        java.lang.Long r10 = java.lang.Long.valueOf(r10)
                        r11 = 0
                        r13[r11] = r10
                        java.lang.String r10 = "doInsertBizTimeLineMsg serialNumber is too big %d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r10, r13)
                        com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
                        monitor-enter(r10)
                        java.util.concurrent.atomic.AtomicLong r11 = r10.f55554h     // Catch:{ all -> 0x026a }
                        long r13 = r11.incrementAndGet()     // Catch:{ all -> 0x026a }
                        monitor-exit(r10)
                        long r10 = r7.field_createTime
                        long r10 = r10 / r0
                        long r10 = com.tencent.p014mm.storage.C19636w0.m21166h(r13, r10)
                        goto L_0x026d
                    L_0x026a:
                        r0 = move-exception
                        monitor-exit(r10)
                        throw r0
                    L_0x026d:
                        r17 = 24
                        long r2 = r2 << r17
                        r20 = 4278190080(0xff000000, double:2.113706745E-314)
                        long r2 = r2 & r20
                        r17 = 32
                        long r20 = r13 << r17
                        long r2 = r20 | r2
                        long r2 = r2 | r10
                        r7.field_orderFlag = r2
                        com.tencent.p014mm.storage.C19636w0.m21173o(r7)
                        r7.field_isExpand = r4
                        com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()
                        r2.v10(r7, r5)
                        boolean r2 = com.tencent.p014mm.storage.C19636w0.f55628e
                        if (r2 == 0) goto L_0x0292
                        goto L_0x02a2
                    L_0x0292:
                        com.tencent.p014mm.storage.C19636w0.f55628e = r5
                        com.tencent.mm.storage.x0 r2 = new com.tencent.mm.storage.x0
                        r2.<init>()
                        zt3.t r3 = zt3.C119157j.f356862d
                        zt3.j r3 = (zt3.C119157j) r3
                        java.lang.String r4 = "BizTimeLineInfoStorageThread"
                        r3.mo183879j(r2, r0, r4)
                    L_0x02a2:
                        com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a
                        r1 = 0
                        r2 = 0
                        r4 = 0
                        r0.mo25866i(r4, r1, r2)
                        r0 = 3
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        java.lang.Long r1 = java.lang.Long.valueOf(r13)
                        r0[r4] = r1
                        java.lang.Long r1 = java.lang.Long.valueOf(r10)
                        r0[r5] = r1
                        long r1 = r7.field_orderFlag
                        java.lang.Long r1 = java.lang.Long.valueOf(r1)
                        r2 = 2
                        r0[r2] = r1
                        java.lang.String r1 = "doInsertBizTimeLineMsg groupId %d, serialNumber %d,orderFlag %d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r0)
                        goto L_0x02d5
                    L_0x02c9:
                        java.lang.String r0 = "doInsertBizTimeLineMsg updateBySvrId"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                        com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
                        r0.X90(r7)
                    L_0x02d5:
                        java.lang.Class<ug.g0> r0 = p248ug.C22643g0.class
                        di3.d r0 = di3.C86312j.m106911c(r0)
                        ug.g0 r0 = (p248ug.C22643g0) r0
                        r0.Za0(r7)
                        goto L_0x02e3
                    L_0x02e1:
                        r9 = r0
                    L_0x02e2:
                        r4 = 0
                    L_0x02e3:
                        int r0 = r9 + 1
                        r1 = r23
                        goto L_0x0026
                    L_0x02e9:
                        r1 = r23
                        goto L_0x033a
                    L_0x02ec:
                        r4 = 0
                        r1 = r23
                    L_0x02ef:
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.lang.String r0 = r0.f123845b
                        java.lang.String r2 = "delete"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L_0x033a
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r0 = r0.f123846c
                        if (r0 == 0) goto L_0x033a
                        r2 = 0
                    L_0x0302:
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r0 = r0.f123846c
                        int r0 = r0.size()
                        if (r2 >= r0) goto L_0x033a
                        g62.l$e r0 = g62.C75875l.C45886e.this
                        java.util.ArrayList<com.tencent.mm.storage.f4> r0 = r0.f123846c
                        java.lang.Object r0 = r0.get(r2)
                        com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
                        if (r0 != 0) goto L_0x0319
                        goto L_0x0337
                    L_0x0319:
                        com.tencent.mm.storage.p0 r3 = rb0.C48009v0.Jx0()
                        long r4 = r0.getMsgId()
                        r3.mo25785Lo(r4)
                        java.lang.Class<rn.c0> r3 = p227rn.C22240c0.class
                        di3.d r3 = di3.C86312j.m106911c(r3)
                        rn.c0 r3 = (p227rn.C22240c0) r3
                        java.lang.String r4 = r0.mo108768t()
                        long r5 = r0.mo108774y2()
                        r3.Hn0(r4, r5)
                    L_0x0337:
                        int r2 = r2 + 1
                        goto L_0x0302
                    L_0x033a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.PluginBrandService.C181591.run():void");
                }
            }, 0);
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        this.f80712d.alive();
        C30650a.m39147b(new C29782v(), "//mpfast");
        C30650a.m39147b(new C18161a(), "//biz");
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        this.f80712d.dead();
    }
}
