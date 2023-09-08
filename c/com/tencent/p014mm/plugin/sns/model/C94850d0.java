package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Locale;
import ks2.C99205z;
import ns2.C100157a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51972xg3;
import te3.n64;
import te3.x64;
import te3.y64;
import te3.y74;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.d0 */
public class C94850d0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f274803d;

    /* renamed from: e */
    public String f274804e;

    /* renamed from: f */
    public int f274805f;

    /* renamed from: g */
    public n64 f274806g;

    /* renamed from: h */
    public C11385n f274807h;

    /* renamed from: i */
    public SnsInfo f274808i;

    /* renamed from: j */
    public SnsObject f274809j;

    /* renamed from: n */
    public int f274810n;

    /* renamed from: o */
    public C99205z f274811o;

    /* renamed from: p */
    public int f274812p;

    public C94850d0(n64 n64, String str, int i) {
        int i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new x64();
        bVar.f127067b = new y64();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnscomment";
        bVar.f127069d = 213;
        bVar.f127070e = 100;
        bVar.f127071f = 1000000100;
        C47350c a = bVar.mo72403a();
        this.f274803d = a;
        x64 x64 = (x64) a.f127055a.f127080a;
        x64.f144490d = n64;
        HashMap<Integer, C100157a.C100158a> hashMap = C100157a.f293382a;
        SnsMethodCalculate.markStartTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        C100157a.C100158a aVar = C100157a.f293382a.get(2);
        SnsMethodCalculate.markEndTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        if (aVar != null) {
            int i3 = aVar.f293383a;
            int i4 = i3 & 4;
            if (i4 == 0 && (i3 & 8) == 0) {
                int i5 = i3 & 16;
                if (i5 == 0 && (i3 & 32) == 0) {
                    i2 = 0;
                } else {
                    i2 = i5 != 0 ? 4 : 5;
                    Log.m105925i("MicroMsg.NetSceneSnsComment", "has paste similar change flag, %d", Integer.valueOf(i2));
                }
            } else {
                i2 = i4 != 0 ? 2 : 3;
                Log.m105925i("MicroMsg.NetSceneSnsComment", "has paste fully flag, %d", Integer.valueOf(i2));
            }
            x64.f144493g = C102236a0.m134746h(i2, aVar.f293384b);
            SnsMethodCalculate.markStartTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
            C100157a.f293382a.remove(2);
            SnsMethodCalculate.markEndTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        }
        Log.m105919d("MicroMsg.NetSceneSnsComment", "sendComment req.ReportData：%s", x64.f144493g);
        this.f274805f = n64.f298899f.f298777h;
        this.f274806g = n64;
        this.f274810n = i;
        x64.f144491e = str;
        this.f274804e = str;
        Log.m105918d("MicroMsg.NetSceneSnsComment", n64.f298899f.f298773d + " " + n64.f298899f.f298774e);
        this.f274811o = C99205z.f290902j.mo138557a();
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        AdSnsInfo jo;
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(this.f274806g.f298897d);
        if (SE == null && (jo = C94866e1.zx0().mo139864jo(this.f274806g.f298897d)) != null) {
            SE = jo.convertToSnsInfo();
        }
        if (SE != null) {
            try {
                SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(SE.field_attrBuf);
                C51018qv3 qv32 = snsObject.ObjectOperations;
                if (qv32 != null && qv32.f140575g) {
                    y74 y74 = (y74) new y74().parseFrom(snsObject.ObjectOperations.f140574f.f257327a);
                    x64 x64 = (x64) this.f274803d.f127055a.f127080a;
                    C51972xg3 xg32 = y74.f145163h;
                    if (xg32 != null) {
                        String format = String.format(Locale.US, "preloadLayerId=%d&preloadExpId=%d", new Object[]{Integer.valueOf(xg32.f144641d), Integer.valueOf(y74.f145163h.f144642e)});
                        Log.m105925i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", format);
                        C51163rv3 rv32 = new C51163rv3();
                        rv32.f141175d = format;
                        rv32.f141176e = true;
                        x64.f144492f = rv32;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetSceneSnsComment", e, "", new Object[0]);
            }
        }
        this.f274808i = SE;
        this.f274807h = nVar;
        int dispatch = dispatch(gVar, this.f274803d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return 213;
    }

    /* renamed from: j1 */
    public final void mo130969j1(int i) {
        SnsMethodCalculate.markStartTimeMs("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        C99205z zVar = this.f274811o;
        if (zVar != null) {
            String valueOf = String.valueOf(i);
            zVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            C87412m.m108594g(valueOf, "<set-?>");
            zVar.f290906c = valueOf;
            SnsMethodCalculate.markEndTimeMs("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            this.f274811o.mo138554b();
        }
        SnsMethodCalculate.markEndTimeMs("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.p014mm.network.C114799u r22, byte[] r23) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            java.lang.String r0 = "MicroMsg.NetSceneSnsComment"
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
            r0 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 != 0) goto L_0x0198
            if (r3 == 0) goto L_0x004b
            goto L_0x0198
        L_0x004b:
            com.tencent.mm.plugin.sns.model.b1 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            te3.n64 r9 = r1.f274806g
            long r9 = r9.f298897d
            int r11 = r1.f274805f
            java.lang.String r12 = r1.f274804e
            r8.mo130961t(r9, r11, r12)
            java.lang.String r8 = "mergeToDb"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            te3.n64 r8 = r1.f274806g
            te3.m64 r8 = r8.f298899f
            int r9 = r8.f298777h
            r10 = 5
            if (r9 == r7) goto L_0x007b
            if (r9 == r5) goto L_0x007b
            if (r9 == r0) goto L_0x007b
            if (r9 == r10) goto L_0x007b
            java.lang.String r0 = "mergeToDb"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            goto L_0x018f
        L_0x007b:
            te3.w64 r5 = new te3.w64
            r5.<init>()
            int r0 = r8.f298779j
            r5.f299708i = r0
            int r0 = r8.f298777h
            r5.f299706g = r0
            int r9 = r8.f298778i
            r5.f299705f = r9
            java.lang.String r9 = r8.f298773d
            r5.f299703d = r9
            java.lang.String r9 = r8.f298775f
            r5.f299704e = r9
            java.lang.String r9 = r8.f298780n
            r5.f299707h = r9
            int r8 = r8.f298787u
            r5.f299716t = r8
            ob0.c r8 = r1.f274803d     // Catch:{ Exception -> 0x0178 }
            ob0.c$d r8 = r8.f127056b     // Catch:{ Exception -> 0x0178 }
            pe3.a r8 = r8.f127083a     // Catch:{ Exception -> 0x0178 }
            te3.y64 r8 = (te3.y64) r8     // Catch:{ Exception -> 0x0178 }
            com.tencent.mm.protocal.protobuf.SnsObject r9 = r8.f145146d     // Catch:{ Exception -> 0x0178 }
            r1.f274809j = r9     // Catch:{ Exception -> 0x0178 }
            if (r0 == r7) goto L_0x00e3
            if (r0 != r10) goto L_0x00ad
            goto L_0x00e3
        L_0x00ad:
            java.lang.String r0 = "MicroMsg.NetSceneSnsComment"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178 }
            r7.<init>()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = "snsComment:"
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            long r10 = r9.f283891Id     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.util.LinkedList<te3.w64> r10 = r9.LikeUserList     // Catch:{ Exception -> 0x0178 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.util.LinkedList<te3.w64> r10 = r9.CommentUserList     // Catch:{ Exception -> 0x0178 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0178 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0126
        L_0x00e3:
            java.lang.String r0 = "MicroMsg.NetSceneSnsComment"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178 }
            r7.<init>()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = "snsComment:"
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            long r10 = r9.f283891Id     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            te3.qv3 r10 = r9.ObjectDesc     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = sf0.C48374j0.m53717f(r10)     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.util.LinkedList<te3.w64> r10 = r9.LikeUserList     // Catch:{ Exception -> 0x0178 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = " "
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.util.LinkedList<te3.w64> r10 = r9.CommentUserList     // Catch:{ Exception -> 0x0178 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0178 }
            r7.append(r10)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0178 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ Exception -> 0x0178 }
        L_0x0126:
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120377o(r9)     // Catch:{ Exception -> 0x0178 }
            java.lang.Class<iu2.e> r0 = iu2.C60631e.class
            byte[] r7 = i40.C60247c.f171776h     // Catch:{ Exception -> 0x0178 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0178 }
            f40.e r10 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0175 }
            r10.mo121108c()     // Catch:{ all -> 0x0175 }
            java.lang.Class<i40.c> r10 = i40.C60247c.class
            boolean r10 = r10.isAssignableFrom(r0)     // Catch:{ all -> 0x0175 }
            if (r10 == 0) goto L_0x016d
            androidx.lifecycle.k0 r10 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0175 }
            f40.e r11 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0175 }
            f40.a r11 = r11.f251755f     // Catch:{ all -> 0x0175 }
            i40.c$a$a r12 = new i40.c$a$a     // Catch:{ all -> 0x0175 }
            r12.<init>()     // Catch:{ all -> 0x0175 }
            r10.<init>((androidx.lifecycle.C0123n0) r11, (androidx.lifecycle.C54209k0.C54210b) r12)     // Catch:{ all -> 0x0175 }
            androidx.lifecycle.i0 r0 = r10.mo75002a(r0)     // Catch:{ all -> 0x0175 }
            monitor-exit(r7)     // Catch:{ Exception -> 0x0178 }
            iu2.e r0 = (iu2.C60631e) r0     // Catch:{ Exception -> 0x0178 }
            java.lang.Class<iu2.d> r7 = iu2.C98802d.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r7)     // Catch:{ Exception -> 0x0178 }
            iu2.d r0 = (iu2.C98802d) r0     // Catch:{ Exception -> 0x0178 }
            long r9 = r9.f283891Id     // Catch:{ Exception -> 0x0178 }
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion     // Catch:{ Exception -> 0x0178 }
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = r7.getUPDATE()     // Catch:{ Exception -> 0x0178 }
            r0.mo138178i3(r9, r7)     // Catch:{ Exception -> 0x0178 }
            int r0 = r8.f145148f     // Catch:{ Exception -> 0x0178 }
            r1.mo130969j1(r0)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0182
        L_0x016d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0175 }
            java.lang.String r8 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r8)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0178 }
            throw r0     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            java.lang.String r7 = "MicroMsg.NetSceneSnsComment"
            java.lang.String r8 = ""
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r6)
        L_0x0182:
            java.lang.String r0 = r5.f299707h
            zr2.C66976a.m79133d(r0)
            java.lang.String r0 = "mergeToDb"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
        L_0x018f:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r0.mo130950e()
            goto L_0x0260
        L_0x0198:
            r8 = 4
            if (r2 != r8) goto L_0x023f
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r9 = (int) r8
            r1.f274812p = r9
            com.tencent.mm.plugin.sns.model.b1 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            te3.n64 r9 = r1.f274806g
            long r9 = r9.f298897d
            int r11 = r1.f274805f
            java.lang.String r12 = r1.f274804e
            r8.mo130961t(r9, r11, r12)
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_error_comment_show_enable
            boolean r8 = r8.mo58784wf(r9, r7)
            if (r8 == 0) goto L_0x023f
            r8 = r22
            ob0.c r8 = (ob0.C47350c) r8
            ob0.c$d r8 = r8.f127056b
            pe3.a r8 = r8.f127083a
            te3.y64 r8 = (te3.y64) r8
            com.tencent.mm.plugin.sns.model.b1 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            te3.n64 r10 = r1.f274806g
            long r10 = r10.f298897d
            int r12 = r1.f274805f
            int r13 = r1.f274812p
            te3.w84 r8 = r8.f145147e
            r9.getClass()
            java.lang.String r14 = "failedComment"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r16 = java.lang.Long.valueOf(r10)
            r0[r6] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r0[r7] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r0[r5] = r16
            java.lang.String r5 = "MicroMsg.SnsAsyncQueueMgr"
            java.lang.String r6 = "failedComment snsId:%s, type:%s, failOpTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
            ms2.e r0 = new ms2.e
            r0.<init>()
            r0.f292906d = r10
            r0.f292907e = r13
            r0.f292908f = r12
            if (r8 == 0) goto L_0x0213
            java.lang.String r6 = r8.f143925f
            r0.f292909g = r6
            java.lang.String r6 = r8.f143926g
            r0.f292910h = r6
        L_0x0213:
            ms2.c r6 = r9.f274774a
            java.util.LinkedList<ms2.e> r6 = r6.f292905j
            r6.add(r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r6 = 589825(0x90001, float:8.26521E-40)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r0.mo119676J(r6, r8)
            com.tencent.mm.plugin.sns.model.b1$a r0 = r9.f274781h
            if (r0 == 0) goto L_0x0231
            r0.mo130966k()
        L_0x0231:
            boolean r0 = r9.mo130956o()
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = "failedComment error listToFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x023c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
        L_0x023f:
            te3.n64 r0 = r1.f274806g
            te3.m64 r0 = r0.f298899f
            int r0 = r0.f298777h
            if (r0 != r7) goto L_0x0260
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            te3.n64 r5 = r1.f274806g
            long r5 = r5.f298897d
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139806SE(r5)
            if (r0 == 0) goto L_0x0260
            r5 = 0
            r0.setLikeFlag(r5)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r5.Pq0(r0)
        L_0x0260:
            ob0.n r0 = r1.f274807h
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94850d0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
