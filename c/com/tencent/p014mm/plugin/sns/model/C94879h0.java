package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import lo2.C99569s;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100398c0;
import p196ln.C76706g;
import p196ln.C76708i;
import te3.C101804kv2;
import te3.C51018qv3;
import te3.t84;
import te3.u84;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: com.tencent.mm.plugin.sns.model.h0 */
public class C94879h0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f274942d;

    /* renamed from: e */
    public long f274943e = 0;

    /* renamed from: f */
    public long f274944f = 0;

    /* renamed from: g */
    public String f274945g = "";

    /* renamed from: h */
    public final int f274946h;

    /* renamed from: i */
    public int f274947i = 0;

    /* renamed from: j */
    public C11385n f274948j;

    /* renamed from: com.tencent.mm.plugin.sns.model.h0$a */
    public class C43037a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f116499d;

        public C43037a(C94879h0 h0Var, String str) {
            this.f116499d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine$1");
            Log.m105924i("MicroMsg.NetSceneSnsPreTimeLine", "checkUpdate avatar:" + this.f116499d);
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106823Jc(this.f116499d);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93575b(this.f116499d);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine$1");
        }
    }

    public C94879h0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new t84();
        bVar.f127067b = new u84();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
        bVar.f127069d = 718;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f274942d = bVar.mo72403a();
        int F = C102236a0.m134711F();
        this.f274946h = 2;
        t84 t84 = (t84) this.f274942d.f127055a.f127080a;
        t84.f299498j = F;
        t84.f299493e = 0;
        int h = C94866e1.dy0().mo6417h();
        long r502 = C94866e1.Yx0().r50(0, h, true);
        this.f274943e = r502;
        t84.f299494f = r502;
        int c = C43038l.m46675c(r502, 0, "@__weixintimtline");
        t84.f299495g = c;
        this.f274944f = C94866e1.Yx0().r50(0, 1, true);
        Log.m105924i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + this.f274944f);
        t84.f299496h = this.f274944f;
        C100398c0 Yt = C94866e1.Xx0().mo139782Yt("@__weixintimtline");
        String str = Yt.field_md5;
        this.f274945g = str;
        if (str == null) {
            this.f274945g = "";
        }
        t84.f299492d = this.f274945g;
        Object obj = Yt.field_adsession;
        if (obj == null) {
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(new byte[0]);
            t84.f299497i = qv32;
        } else {
            Log.m105925i("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", obj);
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(Yt.field_adsession);
            t84.f299497i = qv33;
        }
        C51018qv3 qv34 = new C51018qv3();
        SnsMethodCalculate.markStartTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        byte[] b = C99569s.m129960b((String) null);
        SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        qv34.mo73350k(b);
        t84.f299508w = qv34;
        Log.m105924i("MicroMsg.NetSceneSnsPreTimeLine", "This req nextCount: " + h + " min:" + this.f274943e + " ReqTime:" + t84.f299495g + " nettype: " + F);
        Log.m105919d("MicroMsg.NetSceneSnsPreTimeLine", "minId: %s lastReqTime: %s", C102236a0.m134765q0(this.f274943e), Integer.valueOf(c));
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        this.f274948j = nVar;
        int dispatch = dispatch(gVar, this.f274942d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return 718;
    }

    /* renamed from: j1 */
    public final void mo131052j1(C101804kv2 kv22, boolean z) {
        SnsMethodCalculate.markStartTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
            return;
        }
        String X = C102236a0.m134729X(kv22);
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        if (!C86013q1.m106450k(e + X)) {
            if (!C86013q1.m106450k(e + C102236a0.m134717L(kv22))) {
                if (!C86013q1.m106450k(e + C102236a0.m134731Z(kv22))) {
                    Log.m105925i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", kv22.f298689d);
                    C102268v vVar = new C102268v(kv22);
                    vVar.mo141832d(z ? 1 : 0);
                    vVar.mo141833e(kv22.f298689d);
                    C94853e Vx0 = C94866e1.Vx0();
                    int i = kv22.f298690e == 6 ? 5 : 1;
                    C96983o3 o3Var = C96983o3.f284131c;
                    Vx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    Vx0.mo130981f(kv22, i, vVar, o3Var, (String) null, "", "", 1);
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
                    return;
                }
            }
        }
        Log.m105925i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", kv22.f298689d);
        SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A[SYNTHETIC] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131053k1(te3.u84 r21, java.lang.String r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "insertListAndUpdateFaultInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = r0.f274946h
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r5 = r1.f299592f
            java.lang.String r6 = "@__weixintimtline"
            r7 = r22
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(r6, r4, r5, r7)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r4 = r1.f299592f
            java.lang.Object r4 = r4.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r4 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r4
            long r4 = r4.f283891Id
            r0.f274943e = r4
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r4 = r1.f299592f
            java.lang.Object r4 = r4.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r4 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r4
            long r6 = r4.f283891Id
            long r8 = r0.f274943e
            int r10 = r1.f299593g
            java.lang.String r5 = "@__weixintimtline"
            com.tencent.p014mm.plugin.sns.model.C43038l.m46676d(r5, r6, r8, r10)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r1 = r1.f299592f
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x022b
            java.lang.Object r4 = r1.next()
            com.tencent.mm.protocal.protobuf.SnsObject r4 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r4
            int r5 = r4.NoChange
            if (r5 == 0) goto L_0x004c
            goto L_0x003b
        L_0x004c:
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r6 = r4.f283891Id
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139806SE(r6)
            if (r5 == 0) goto L_0x003b
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r5.getTimeLine()
            if (r6 != 0) goto L_0x005f
            goto L_0x003b
        L_0x005f:
            ds2.h r6 = ds2.C97535h.f286229a
            r6.mo136806f(r5)
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r5.getTimeLine()
            te3.j00 r6 = r6.ContentObj
            java.util.LinkedList<te3.kv2> r6 = r6.f298427h
            boolean r7 = r5.isAd()
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L_0x01b1
            boolean r7 = com.tencent.p014mm.plugin.sns.p106ui.C95713a5.m122518a()
            if (r7 != 0) goto L_0x007c
            goto L_0x01b1
        L_0x007c:
            java.lang.String r12 = r5.getSnsId()
            java.lang.String r7 = "dealWithMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            if (r6 == 0) goto L_0x01a9
            int r11 = r6.size()
            if (r11 > 0) goto L_0x008f
            goto L_0x01a9
        L_0x008f:
            int r15 = r6.size()
            java.lang.String r11 = "MicroMsg.NetSceneSnsPreTimeLine"
            if (r9 != r15) goto L_0x00b8
            java.lang.Object r6 = r6.get(r10)
            te3.kv2 r6 = (te3.C101804kv2) r6
            java.lang.Object[] r12 = new java.lang.Object[r9]
            int r13 = r6.f298690e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            java.lang.String r13 = "deal with single media, media type: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r12)
            r0.mo131052j1(r6, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            r18 = r1
            r19 = r2
            goto L_0x01d3
        L_0x00b8:
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r9 = 0
        L_0x00c3:
            if (r9 >= r15) goto L_0x0187
            java.lang.Object r16 = r6.get(r9)
            r10 = r16
            te3.kv2 r10 = (te3.C101804kv2) r10
            r8 = 6
            r18 = r1
            int r1 = r10.f298690e
            if (r8 != r1) goto L_0x00ef
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r1 = 0
            r8[r1] = r12
            java.lang.String r1 = r10.f298689d
            r16 = 1
            r8[r16] = r1
            java.lang.String r1 = "img batch download contains video, snsId: %s, mediaId: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r1, r8)
            r1 = 0
            r0.mo131052j1(r10, r1)
            r19 = r2
            r16 = r15
            goto L_0x017c
        L_0x00ef:
            java.lang.String r1 = "mediaExist"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            java.lang.String r8 = vr2.C102236a0.m134729X(r10)
            r16 = r15
            java.lang.String r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            r19 = r2
            java.lang.String r2 = r10.f298689d
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r15, r2)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x0155
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r15 = vr2.C102236a0.m134717L(r10)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x0155
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r2 = vr2.C102236a0.m134731Z(r10)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x014f
            goto L_0x0155
        L_0x014f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r1 = 0
            r15 = 0
            goto L_0x0167
        L_0x0155:
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r2 = r10.f298689d
            r15 = 0
            r8[r15] = r2
            java.lang.String r2 = "mediaExist exist:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r1 = 1
        L_0x0167:
            if (r1 != 0) goto L_0x017c
            vr2.v r1 = new vr2.v
            r1.<init>((te3.C101804kv2) r10)
            r1.mo141832d(r15)
            java.lang.String r2 = r10.f298689d
            r1.mo141833e(r2)
            r14.put(r9, r1)
            r13.put(r9, r10)
        L_0x017c:
            int r9 = r9 + 1
            r15 = r16
            r1 = r18
            r2 = r19
            r10 = 0
            goto L_0x00c3
        L_0x0187:
            r18 = r1
            r19 = r2
            r16 = r15
            int r1 = r13.size()
            if (r1 <= 0) goto L_0x01a5
            java.lang.String r1 = "deal with batch img."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            com.tencent.mm.plugin.sns.model.e r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            com.tencent.mm.storage.o3 r15 = com.tencent.p014mm.storage.C96983o3.f284131c
            r17 = 1
            r1 = r16
            r11.mo130977b(r12, r13, r14, r15, r16, r17)
        L_0x01a5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x01d3
        L_0x01a9:
            r18 = r1
            r19 = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x01d3
        L_0x01b1:
            r18 = r1
            r19 = r2
            java.util.Iterator r1 = r6.iterator()
        L_0x01b9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d3
            java.lang.Object r2 = r1.next()
            te3.kv2 r2 = (te3.C101804kv2) r2
            int r7 = r6.size()
            r8 = 1
            if (r7 > r8) goto L_0x01ce
            r7 = 1
            goto L_0x01cf
        L_0x01ce:
            r7 = 0
        L_0x01cf:
            r0.mo131052j1(r2, r7)
            goto L_0x01b9
        L_0x01d3:
            int r1 = r5.getTypeFlag()
            r2 = 15
            if (r1 != r2) goto L_0x0225
            boolean r1 = r5.isAd()
            if (r1 == 0) goto L_0x01e7
            boolean r1 = jq2.C98993j.m128899a(r5)
            if (r1 == 0) goto L_0x0225
        L_0x01e7:
            com.tencent.mm.plugin.sns.model.f2 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.hy0()
            r1.mo131026l(r5)
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()     // Catch:{ Exception -> 0x0224 }
            te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0224 }
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h     // Catch:{ Exception -> 0x0224 }
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0224 }
            te3.kv2 r1 = (te3.C101804kv2) r1     // Catch:{ Exception -> 0x0224 }
            java.lang.String r1 = r1.f298692g     // Catch:{ Exception -> 0x0224 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0224 }
            r5 = 14388(0x3834, float:2.0162E-41)
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0224 }
            long r8 = r4.f283891Id     // Catch:{ Exception -> 0x0224 }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0224 }
            r8 = 0
            r7[r8] = r4     // Catch:{ Exception -> 0x0224 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0224 }
            r6 = 1
            r7[r6] = r4     // Catch:{ Exception -> 0x0224 }
            r4 = 2
            r7[r4] = r1     // Catch:{ Exception -> 0x0224 }
            r1 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0224 }
            r7[r1] = r4     // Catch:{ Exception -> 0x0224 }
            r2.mo160131h(r5, r7)     // Catch:{ Exception -> 0x0224 }
            goto L_0x0225
        L_0x0224:
        L_0x0225:
            r1 = r18
            r2 = r19
            goto L_0x003b
        L_0x022b:
            r19 = r2
            com.tencent.mm.plugin.sns.model.f2 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.hy0()
            r1.mo131035u()
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94879h0.mo131053k1(te3.u84, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0365 A[Catch:{ all -> 0x03c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.p014mm.network.C114799u r22, byte[] r23) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "netId : "
            r5.append(r6)
            r6 = r18
            r5.append(r6)
            java.lang.String r6 = " errType :"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " errCode: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " errMsg :"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            r0 = r22
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r5 = r0
            te3.u84 r5 = (te3.u84) r5
            qe3.w$e r0 = r22.getRespObj()
            int r0 = r0.getRetCode()
            r6 = 207(0xcf, float:2.9E-43)
            if (r0 == r6) goto L_0x0075
            qe3.w$e r0 = r22.getRespObj()
            int r0 = r0.getRetCode()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "@__weixintimtline"
            com.tencent.p014mm.plugin.sns.model.C94916o0.m120462n1(r0)
            ob0.n r0 = r1.f274948j
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0075:
            te3.j84 r0 = r5.f299596j
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "serverConfig  "
            r7.append(r8)
            te3.j84 r8 = r5.f299596j
            int r8 = r8.f135924e
            r7.append(r8)
            java.lang.String r8 = " "
            r7.append(r8)
            te3.j84 r8 = r5.f299596j
            int r8 = r8.f135923d
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            te3.j84 r0 = r5.f299596j
            int r7 = r0.f135924e
            kr2.C76634a.f224255a = r7
            if (r7 > 0) goto L_0x00ad
            r7 = 2147483647(0x7fffffff, float:NaN)
            kr2.C76634a.f224255a = r7
        L_0x00ad:
            int r0 = r0.f135923d
            com.tencent.p014mm.storage.C96986x1.f284186a = r0
        L_0x00b1:
            int r0 = r5.f299594h
            r1.f274947i = r0
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "for same md5 count: "
            r7.append(r8)
            int r8 = r5.f299594h
            r7.append(r8)
            java.lang.String r8 = " , objCount:  "
            r7.append(r8)
            int r8 = r5.f299591e
            r7.append(r8)
            java.lang.String r8 = " controlFlag : "
            r7.append(r8)
            int r8 = r5.f299595i
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            r7 = 0
            java.lang.String r9 = vr2.C102236a0.m134763p0(r7)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            r10 = 0
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "resp size "
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r5.f299592f
            int r12 = r12.size()
            r11.append(r12)
            java.lang.String r12 = ", resp Max:"
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r5.f299592f
            java.lang.Object r12 = r12.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            r11.append(r12)
            java.lang.String r12 = " "
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r5.f299592f
            java.lang.Object r12 = r12.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
            r11.append(r12)
            java.lang.String r12 = ", resp Min:"
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r5.f299592f
            java.lang.Object r12 = r12.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            r11.append(r12)
            java.lang.String r12 = " "
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r5.f299592f
            java.lang.Object r12 = r12.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
            r11.append(r12)
            java.lang.String r12 = ", adListSize:"
            r11.append(r12)
            java.util.LinkedList<te3.c4> r12 = r5.f299598o
            if (r12 != 0) goto L_0x0161
            r12 = 0
            goto L_0x0165
        L_0x0161:
            int r12 = r12.size()
        L_0x0165:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            goto L_0x0190
        L_0x0170:
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = " resp is Empty, adListSize:"
            r11.append(r12)
            java.util.LinkedList<te3.c4> r12 = r5.f299598o
            if (r12 != 0) goto L_0x0182
            r12 = 0
            goto L_0x0186
        L_0x0182:
            int r12 = r12.size()
        L_0x0186:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
        L_0x0190:
            java.util.LinkedList<te3.f20> r0 = r5.f299603t
            int r11 = r5.f299602s
            r12 = 1
            lo2.C99570t.m129966a(r0, r11, r12)
            java.lang.String r0 = r1.f274945g
            java.lang.String r11 = r5.f299590d
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01d1
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r5 = r1.f274947i
            long r5 = r0.r50(r7, r5, r12)
            r1.f274943e = r5
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.String r7 = "md5 is no change!! the new minid %s"
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r8[r10] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)
            java.lang.String r0 = "@__weixintimtline"
            com.tencent.p014mm.plugin.sns.model.C94916o0.m120462n1(r0)
            ob0.n r0 = r1.f274948j
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x01d1:
            os2.d0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r11 = "@__weixintimtline"
            java.lang.String r13 = r5.f299590d
            te3.qv3 r14 = r5.f299599p
            byte[] r14 = sf0.C48374j0.m53715d(r14)
            r0.mo139789mL(r11, r13, r14)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "fp resp list size "
            r11.append(r13)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r5.f299592f
            int r13 = r13.size()
            r11.append(r13)
            java.lang.String r13 = " adsize : "
            r11.append(r13)
            int r13 = r5.f299597n
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            java.util.LinkedList<te3.c4> r11 = r5.f299598o
            if (r11 == 0) goto L_0x03d1
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x03d1
            lo2.C99569s.m129959a()
            java.lang.Object r13 = com.tencent.p014mm.plugin.sns.model.C94833a.f274740a
            monitor-enter(r13)
            int r0 = com.tencent.p014mm.plugin.sns.model.C94833a.m120155h()     // Catch:{ all -> 0x03c6 }
            if (r0 != r12) goto L_0x0220
            r0 = 1
            goto L_0x0221
        L_0x0220:
            r0 = 0
        L_0x0221:
            java.lang.String r14 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r15.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r7 = "adDynamic, graySwitch="
            r15.append(r7)     // Catch:{ all -> 0x03c6 }
            r15.append(r0)     // Catch:{ all -> 0x03c6 }
            java.lang.String r7 = r15.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)     // Catch:{ all -> 0x03c6 }
            if (r0 == 0) goto L_0x0263
            r0 = 0
        L_0x023a:
            int r7 = r11.size()     // Catch:{ all -> 0x03c6 }
            if (r0 >= r7) goto L_0x0263
            java.lang.Object r7 = r11.get(r0)     // Catch:{ all -> 0x03c6 }
            te3.c4 r7 = (te3.C48952c4) r7     // Catch:{ all -> 0x03c6 }
            boolean r7 = com.tencent.p014mm.plugin.sns.model.C94833a.m120169v(r7)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r14.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r15 = "adDynamic, updateSuccess="
            r14.append(r15)     // Catch:{ all -> 0x03c6 }
            r14.append(r7)     // Catch:{ all -> 0x03c6 }
            java.lang.String r7 = r14.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)     // Catch:{ all -> 0x03c6 }
            int r0 = r0 + 1
            goto L_0x023a
        L_0x0263:
            r7 = 0
        L_0x0264:
            int r0 = r11.size()     // Catch:{ all -> 0x03c6 }
            if (r7 >= r0) goto L_0x03ba
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x03c6 }
            r8 = r0
            te3.c4 r8 = (te3.C48952c4) r8     // Catch:{ all -> 0x03c6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r0.<init>()     // Catch:{ all -> 0x03c6 }
            if (r8 == 0) goto L_0x0283
            te3.rv3 r14 = r8.f131490e     // Catch:{ all -> 0x03c6 }
            if (r14 == 0) goto L_0x0283
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)     // Catch:{ all -> 0x03c6 }
            r0.append(r14)     // Catch:{ all -> 0x03c6 }
        L_0x0283:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r14.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r15.<init>()     // Catch:{ all -> 0x03c6 }
            if (r8 == 0) goto L_0x02a9
            te3.h64 r6 = r8.f131489d     // Catch:{ all -> 0x03c6 }
            if (r6 == 0) goto L_0x02a9
            te3.rv3 r6 = r6.f134465e     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = sf0.C48374j0.m53718g(r6)     // Catch:{ all -> 0x03c6 }
            r14.append(r6)     // Catch:{ all -> 0x03c6 }
            te3.h64 r6 = r8.f131489d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.protocal.protobuf.SnsObject r6 = r6.f134464d     // Catch:{ all -> 0x03c6 }
            te3.qv3 r6 = r6.ObjectDesc     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = sf0.C48374j0.m53717f(r6)     // Catch:{ all -> 0x03c6 }
            r15.append(r6)     // Catch:{ all -> 0x03c6 }
        L_0x02a9:
            java.lang.String r6 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r12.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "skXml "
            r12.append(r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x03c6 }
            r12.append(r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r10.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = "adXml "
            r10.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x03c6 }
            r10.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r10.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = "snsXml "
            r10.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = r15.toString()     // Catch:{ all -> 0x03c6 }
            r10.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = "\r\n"
            r10.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = ""
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0337 }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x0337 }
            r10 = 2
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0337 }
            r12 = 0
            r10[r12] = r0     // Catch:{ all -> 0x0337 }
            r12 = 1
            r10[r12] = r6     // Catch:{ all -> 0x0337 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r10)     // Catch:{ all -> 0x0337 }
            if (r10 != 0) goto L_0x0334
            if (r8 == 0) goto L_0x032c
            te3.h64 r10 = r8.f131489d     // Catch:{ all -> 0x0337 }
            if (r10 == 0) goto L_0x032c
            com.tencent.mm.protocal.protobuf.SnsObject r10 = r10.f134464d     // Catch:{ all -> 0x0337 }
            if (r10 == 0) goto L_0x032c
            long r14 = r10.f283891Id     // Catch:{ all -> 0x0337 }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0337 }
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r10)     // Catch:{ all -> 0x0337 }
            goto L_0x032e
        L_0x032c:
            r14 = 0
        L_0x032e:
            vr2.C102259p.m134830c(r14, r0, r6)     // Catch:{ all -> 0x0332 }
            goto L_0x0359
        L_0x0332:
            r0 = move-exception
            goto L_0x033a
        L_0x0334:
            r14 = 0
            goto L_0x0359
        L_0x0337:
            r0 = move-exception
            r14 = 0
        L_0x033a:
            java.lang.String r10 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r12.<init>()     // Catch:{ all -> 0x03c6 }
            r16 = r6
            java.lang.String r6 = "reportAdPullException: "
            r12.append(r6)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03c6 }
            r12.append(r0)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ all -> 0x03c6 }
            r6 = r16
        L_0x0359:
            te3.h64 r0 = r8.f131489d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r0.f134464d     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = r0.Username     // Catch:{ all -> 0x03c6 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x03c6 }
            if (r10 != 0) goto L_0x03ac
            boolean r6 = vr2.C102260r.m134841J(r6)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r12.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = "checkUpdate contact:"
            r12.append(r2)     // Catch:{ all -> 0x03c6 }
            r12.append(r0)     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = ", isUsePreferedInfo="
            r12.append(r2)     // Catch:{ all -> 0x03c6 }
            r12.append(r6)     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = ", snsId="
            r12.append(r2)     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = vr2.C102236a0.m134763p0(r14)     // Catch:{ all -> 0x03c6 }
            r12.append(r2)     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x03c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)     // Catch:{ all -> 0x03c6 }
            if (r6 != 0) goto L_0x03ac
            eb0.w2 r2 = eb0.C31519v2.m39436a()     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = ""
            r2.mo55987c(r0, r6)     // Catch:{ all -> 0x03c6 }
            zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.sns.model.h0$a r6 = new com.tencent.mm.plugin.sns.model.h0$a     // Catch:{ all -> 0x03c6 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x03c6 }
            r14 = 10000(0x2710, double:4.9407E-320)
            zt3.j r2 = (zt3.C119157j) r2     // Catch:{ all -> 0x03c6 }
            r2.mo183878i(r6, r14)     // Catch:{ all -> 0x03c6 }
        L_0x03ac:
            r0 = 4
            jq2.C99001u.m128918d(r8, r0)     // Catch:{ all -> 0x03c6 }
            int r7 = r7 + 1
            r2 = r19
            r6 = 207(0xcf, float:2.9E-43)
            r10 = 0
            r12 = 1
            goto L_0x0264
        L_0x03ba:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f     // Catch:{ all -> 0x03c6 }
            r2 = -1
            r6 = 0
            com.tencent.p014mm.plugin.sns.model.C94833a.m120156i(r11, r0, r6, r2)     // Catch:{ all -> 0x03c6 }
            ps2.C100897v.m132252a(r11, r6)     // Catch:{ all -> 0x03c6 }
            monitor-exit(r13)     // Catch:{ all -> 0x03c6 }
            goto L_0x03d8
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = "onGYNetEnd"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        L_0x03d1:
            java.lang.String r0 = "AdPassThroughInfoHelper"
            java.lang.String r2 = "NetSceneSnsPreTimeLine, resp AdvertiseList size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
        L_0x03d8:
            rp2.C101417a.m133069b(r5)
            int r0 = r5.f299597n
            if (r0 != 0) goto L_0x0419
            java.util.LinkedList<te3.un3> r0 = r5.f299601r
            if (r0 == 0) goto L_0x0419
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0419
            java.lang.Object r2 = com.tencent.p014mm.plugin.sns.model.C94833a.f274740a
            monitor-enter(r2)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPreTimeLine"
            java.lang.String r6 = "recv %d recommend"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x040e }
            int r8 = r5.f299600q     // Catch:{ all -> 0x040e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x040e }
            r10 = 0
            r7[r10] = r8     // Catch:{ all -> 0x040e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r7)     // Catch:{ all -> 0x040e }
            java.util.LinkedList<te3.un3> r0 = r5.f299601r     // Catch:{ all -> 0x040e }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r6 = r5.f299592f     // Catch:{ all -> 0x040e }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120157j(r0, r6)     // Catch:{ all -> 0x040e }
            java.util.LinkedList<te3.un3> r0 = r5.f299601r     // Catch:{ all -> 0x040e }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120160m(r0)     // Catch:{ all -> 0x040e }
            monitor-exit(r2)     // Catch:{ all -> 0x040e }
            goto L_0x0419
        L_0x040e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x040e }
            java.lang.String r2 = "onGYNetEnd"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        L_0x0419:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r5.f299592f
            java.util.Iterator r2 = r2.iterator()
        L_0x0424:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x043a
            java.lang.Object r6 = r2.next()
            com.tencent.mm.protocal.protobuf.SnsObject r6 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r6
            long r6 = r6.f283891Id
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.add(r6)
            goto L_0x0424
        L_0x043a:
            com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent r2 = new com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent
            r2.<init>()
            com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent$a r6 = r2.f265199d
            r6.f265200a = r0
            r2.publish()
            qe3.w$e r0 = r22.getRespObj()
            int r0 = r0.getRetCode()
            r2 = 207(0xcf, float:2.9E-43)
            if (r0 != r2) goto L_0x04a9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0462
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.wx0()
            goto L_0x0494
        L_0x0462:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r5.f299592f
            java.lang.Object r2 = r2.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r2 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r2
            long r6 = r2.f283891Id
            java.lang.String r2 = vr2.C102236a0.m134763p0(r6)
            r0.vx0(r2)
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r5.f299592f
            java.lang.Object r2 = r2.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r2 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r2
            long r6 = r2.f283891Id
            java.lang.String r2 = vr2.C102236a0.m134763p0(r6)
            r0.xx0(r2)
            r1.mo131053k1(r5, r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            ps2.C100897v.m132254c(r0)
        L_0x0494:
            java.lang.String r0 = "@__weixintimtline"
            com.tencent.p014mm.plugin.sns.model.C94916o0.m120462n1(r0)
            ob0.n r0 = r1.f274948j
            r2 = r19
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x04a9:
            r2 = r19
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04bb
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.wx0()
            goto L_0x04c3
        L_0x04bb:
            r1.mo131053k1(r5, r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            ps2.C100897v.m132254c(r0)
        L_0x04c3:
            java.lang.String r0 = "@__weixintimtline"
            com.tencent.p014mm.plugin.sns.model.C94916o0.m120462n1(r0)
            ob0.n r0 = r1.f274948j
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94879h0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
