package com.tencent.p014mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.s74;
import te3.t74;
import te3.v74;
import te3.w64;
import te3.w74;
import te3.x74;

/* renamed from: com.tencent.mm.plugin.sns.model.g0 */
public class C94877g0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f274931d;

    /* renamed from: e */
    public C47350c f274932e;

    /* renamed from: f */
    public int f274933f;

    /* renamed from: g */
    public long f274934g;

    /* renamed from: h */
    public int f274935h;

    /* renamed from: i */
    public w64 f274936i;

    /* renamed from: j */
    public Object f274937j;

    /* renamed from: n */
    public t74 f274938n;

    public C94877g0(long j, t74 t74) {
        this.f274933f = -1;
        this.f274934g = 0;
        this.f274935h = -1;
        new MMHandler(Looper.getMainLooper());
        this.f274934g = j;
        this.f274933f = 15;
        this.f274938n = t74;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new w74();
        bVar.f127067b = new x74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        bVar.f127069d = 218;
        bVar.f127070e = 104;
        bVar.f127071f = 1000000104;
        C47350c a = bVar.mo72403a();
        this.f274932e = a;
        w74 w74 = (w74) a.f127055a.f127080a;
        s74 s74 = new s74();
        s74.f141358d = j;
        s74.f141359e = 15;
        SnsMethodCalculate.markStartTimeMs("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        Log.m105925i("MicroMsg.NetSceneSnsObjectOp", "debugPrintSnsObjectOpVisibility:\n OpType=%d\n GroupUserCount=%d\n GroupContactTagIdList=[%s]\n GroupContactTagIdListCount=%d\n BlackListCount=%d\n BlackContactTagIdList=[%s]\n BlackContactTagIdListCount=%d,", Integer.valueOf(t74.f299487o), Integer.valueOf(t74.f299483h), Util.intListToString(t74.f299486n), Integer.valueOf(t74.f299485j), Integer.valueOf(t74.f299479d), Util.intListToString(t74.f299482g), Integer.valueOf(t74.f299481f));
        SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        try {
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(t74.toByteArray());
            s74.f141360f = qv32;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneSnsObjectOp", "opSwitch error " + e.getMessage());
        }
        LinkedList<s74> linkedList = new LinkedList<>();
        linkedList.add(s74);
        w74.f143913e = linkedList;
        w74.f143912d = linkedList.size();
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        this.f274931d = nVar;
        Log.m105924i("MicroMsg.NetSceneSnsObjectOp", "doScene: ");
        int dispatch = dispatch(gVar, this.f274932e, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return 218;
    }

    /* renamed from: j1 */
    public final void mo131047j1(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        snsObject.BlackList.clear();
        snsObject.BlackListCount = 0;
        snsObject.BlackContactTagIdList.clear();
        snsObject.BlackContactTagIdListCount = 0;
        SnsMethodCalculate.markEndTimeMs("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    /* renamed from: k1 */
    public final void mo131048k1(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        snsObject.GroupUser.clear();
        snsObject.GroupUserCount = 0;
        snsObject.GroupContactTagIdList.clear();
        snsObject.GroupContactTagIdListCount = 0;
        SnsMethodCalculate.markEndTimeMs("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    /* renamed from: l1 */
    public int mo131049l1() {
        SnsMethodCalculate.markStartTimeMs("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        int i = this.f274935h;
        SnsMethodCalculate.markEndTimeMs("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return i;
    }

    /* renamed from: m1 */
    public int mo131050m1() {
        SnsMethodCalculate.markStartTimeMs("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        int i = this.f274933f;
        SnsMethodCalculate.markEndTimeMs("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: te3.w64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: te3.w64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: com.tencent.mm.plugin.sns.storage.ADInfo$c$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r20, int r21, int r22, java.lang.String r23, com.tencent.p014mm.network.C114799u r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Class<iu2.d> r5 = iu2.C98802d.class
            java.lang.Class<i40.c> r6 = i40.C60247c.class
            java.lang.Class<iu2.e> r7 = iu2.C60631e.class
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            java.lang.String r0 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "netId : "
            r8.append(r9)
            r9 = r20
            r8.append(r9)
            java.lang.String r9 = " errType :"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " errCode: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " errMsg :"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            r0 = 1
            r8 = 4
            if (r2 != 0) goto L_0x0552
            if (r3 == 0) goto L_0x004f
            goto L_0x0552
        L_0x004f:
            int r9 = r1.f274933f
            r10 = 0
            r11 = 2
            r12 = 0
            switch(r9) {
                case 1: goto L_0x0510;
                case 2: goto L_0x0490;
                case 3: goto L_0x042d;
                case 4: goto L_0x037d;
                case 5: goto L_0x0364;
                case 6: goto L_0x02fa;
                case 7: goto L_0x02e1;
                case 8: goto L_0x0274;
                case 9: goto L_0x025a;
                case 10: goto L_0x0057;
                case 11: goto L_0x01b2;
                case 12: goto L_0x017e;
                case 13: goto L_0x0057;
                case 14: goto L_0x0057;
                case 15: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x053d
        L_0x0059:
            os2.e0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r13 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r9.mo139806SE(r13)
            if (r9 == 0) goto L_0x053d
            te3.t74 r10 = r1.f274938n
            if (r10 == 0) goto L_0x053d
            com.tencent.mm.protocal.protobuf.SnsObject r10 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r9)
            te3.t74 r13 = r1.f274938n
            int r14 = r13.f299487o
            r15 = 3
            if (r14 != r15) goto L_0x00ae
            int r15 = r13.f299483h
            if (r15 > 0) goto L_0x007c
            int r15 = r13.f299485j
            if (r15 <= 0) goto L_0x00ae
        L_0x007c:
            java.lang.String r0 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r11 = "[onGYNetEnd] CHANGE_VISIBILITY -> INCLUDE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            te3.t74 r0 = r1.f274938n
            int r11 = r0.f299483h
            if (r11 <= 0) goto L_0x008e
            int r13 = r10.ExtFlag
            r8 = r8 | r13
            r10.ExtFlag = r8
        L_0x008e:
            int r8 = r0.f299485j
            if (r8 <= 0) goto L_0x0098
            int r13 = r10.ExtFlag
            r13 = r13 | 512(0x200, float:7.175E-43)
            r10.ExtFlag = r13
        L_0x0098:
            java.util.LinkedList<te3.rv3> r13 = r0.f299484i
            r10.GroupUser = r13
            r10.GroupUserCount = r11
            java.util.LinkedList<java.lang.Integer> r0 = r0.f299486n
            r10.GroupContactTagIdList = r0
            r10.GroupContactTagIdListCount = r8
            r1.mo131047j1(r10)
            r9.setPravited(r12)
            r9.unLocalPrivate()
            goto L_0x011f
        L_0x00ae:
            if (r14 != r8) goto L_0x00ea
            int r8 = r13.f299479d
            if (r8 > 0) goto L_0x00b8
            int r8 = r13.f299481f
            if (r8 <= 0) goto L_0x00ea
        L_0x00b8:
            java.lang.String r0 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r8 = "[onGYNetEnd] CHANGE_VISIBILITY -> EXCLUDE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            te3.t74 r0 = r1.f274938n
            int r8 = r0.f299479d
            if (r8 <= 0) goto L_0x00ca
            int r13 = r10.ExtFlag
            r11 = r11 | r13
            r10.ExtFlag = r11
        L_0x00ca:
            int r11 = r0.f299481f
            if (r11 <= 0) goto L_0x00d4
            int r13 = r10.ExtFlag
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r10.ExtFlag = r13
        L_0x00d4:
            java.util.LinkedList<te3.rv3> r13 = r0.f299480e
            r10.BlackList = r13
            r10.BlackListCount = r8
            java.util.LinkedList<java.lang.Integer> r0 = r0.f299482g
            r10.BlackContactTagIdList = r0
            r10.BlackContactTagIdListCount = r11
            r1.mo131048k1(r10)
            r9.setPravited(r12)
            r9.unLocalPrivate()
            goto L_0x011f
        L_0x00ea:
            if (r14 == r0) goto L_0x00ee
            if (r14 != r11) goto L_0x011f
        L_0x00ee:
            if (r14 != r0) goto L_0x0100
            java.lang.String r8 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r13 = "[onGYNetEnd] CHANGE_VISIBILITY -> PUBLIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
            r9.setPravited(r12)
            r9.unLocalPrivate()
            r9.setExtFlag()
        L_0x0100:
            te3.t74 r8 = r1.f274938n
            int r8 = r8.f299487o
            if (r8 != r11) goto L_0x0113
            java.lang.String r8 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r11 = "[onGYNetEnd] CHANGE_VISIBILITY -> PRIVATE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
            r9.setPravited(r0)
            r9.setLocalPrivate()
        L_0x0113:
            int r0 = r10.ExtFlag
            r0 = r0 & -1543(0xfffffffffffff9f9, float:NaN)
            r10.ExtFlag = r0
            r1.mo131047j1(r10)
            r1.mo131048k1(r10)
        L_0x011f:
            byte[] r0 = r10.toByteArray()     // Catch:{ IOException -> 0x0126 }
            r9.field_attrBuf = r0     // Catch:{ IOException -> 0x0126 }
            goto L_0x0130
        L_0x0126:
            r0 = move-exception
            java.lang.String r8 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r10 = ""
            java.lang.Object[] r11 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r11)
        L_0x0130:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r10 = r1.f274934g
            r0.yu0(r10, r9)
            byte[] r8 = i40.C60247c.f171776h
            monitor-enter(r8)
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x017b }
            r0.mo121108c()     // Catch:{ all -> 0x017b }
            boolean r0 = r6.isAssignableFrom(r7)     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0173
            androidx.lifecycle.k0 r0 = new androidx.lifecycle.k0     // Catch:{ all -> 0x017b }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x017b }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x017b }
            i40.c$a$a r9 = new i40.c$a$a     // Catch:{ all -> 0x017b }
            r9.<init>()     // Catch:{ all -> 0x017b }
            r0.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r9)     // Catch:{ all -> 0x017b }
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)     // Catch:{ all -> 0x017b }
            monitor-exit(r8)
            iu2.e r0 = (iu2.C60631e) r0
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r5)
            iu2.d r0 = (iu2.C98802d) r0
            long r5 = r1.f274934g
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = r7.getUPDATE()
            r0.mo138178i3(r5, r7)
            goto L_0x053d
        L_0x0173:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x017b }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x017e:
            java.lang.Object r5 = r1.f274937j
            if (r5 == 0) goto L_0x053d
            boolean r6 = r5 instanceof te3.n74
            if (r6 == 0) goto L_0x053d
            te3.n74 r5 = (te3.n74) r5
            int r5 = r5.f138460d
            if (r5 != r0) goto L_0x018e
            r5 = 1
            goto L_0x018f
        L_0x018e:
            r5 = 0
        L_0x018f:
            os2.x r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
            long r7 = r1.f274934g
            r6.mo139891TE(r7, r5)
            java.lang.String r6 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r7 = "remind  update [snsId:%d] ->isSilence: %b"
            java.lang.Object[] r8 = new java.lang.Object[r11]
            long r9 = r1.f274934g
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r12] = r9
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8[r0] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)
            goto L_0x053d
        L_0x01b2:
            java.lang.String r5 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r6 = "scene end switch 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.mo119677K(r6, r7)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT_INT_SYNC
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r5 = r5.mo119685f(r6, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            int r5 = r5 + r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.mo119677K(r6, r5)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT2_INT_SYNC
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r5 = r5.mo119685f(r6, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + r0
            int r0 = r5 * 2
            int r0 = r0 + 198
            r7 = 216(0xd8, float:3.03E-43)
            if (r0 < r7) goto L_0x0220
            r0 = 216(0xd8, float:3.03E-43)
        L_0x0220:
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 < r7) goto L_0x0227
            as2.C28125b.m38099a(r0)
        L_0x0227:
            java.lang.String r7 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "opcount open "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = " "
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo119677K(r6, r5)
            goto L_0x053d
        L_0x025a:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r5 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139806SE(r5)
            if (r0 == 0) goto L_0x053d
            r0.removeSourceFlag(r11)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r6 = r1.f274934g
            r5.yu0(r6, r0)
            goto L_0x053d
        L_0x0274:
            java.lang.Object r5 = r1.f274937j
            if (r5 == 0) goto L_0x027e
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a
            if (r6 == 0) goto L_0x027e
            r6 = 1
            goto L_0x027f
        L_0x027e:
            r6 = 0
        L_0x027f:
            if (r6 == 0) goto L_0x0284
            r10 = r5
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r10 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r10
        L_0x0284:
            r6 = 101(0x65, float:1.42E-43)
            if (r10 == 0) goto L_0x02c4
            int r7 = r10.f275659e
            if (r7 <= 0) goto L_0x02c4
            if (r7 != r0) goto L_0x029c
            java.util.LinkedList<java.lang.Integer> r0 = r10.f275660f
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r6) goto L_0x02a9
        L_0x029c:
            long r5 = r1.f274934g
            rq2.C101418d.m133072b(r5)
            com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent r0 = new com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent
            r0.<init>()
            r0.publish()
        L_0x02a9:
            java.lang.String r0 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onGYNetEnd, reasonIdCount = "
            r5.append(r6)
            int r6 = r10.f275659e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            goto L_0x053d
        L_0x02c4:
            if (r5 == 0) goto L_0x02d2
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a
            if (r0 == 0) goto L_0x02d2
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r5 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r5
            int r0 = r5.f275658d
            if (r0 != r6) goto L_0x02d2
            goto L_0x053d
        L_0x02d2:
            long r5 = r1.f274934g
            rq2.C101418d.m133072b(r5)
            com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent r0 = new com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent
            r0.<init>()
            r0.publish()
            goto L_0x053d
        L_0x02e1:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r5 = r1.f274934g
            r0.getClass()
            java.lang.String r7 = "removeLikedCancel"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r0.mo130963v(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x053d
        L_0x02fa:
            os2.j r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            long r5 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r0.mo139864jo(r5)
            if (r0 == 0) goto L_0x053d
            com.tencent.mm.protocal.protobuf.SnsObject r5 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0358 }
            r5.<init>()     // Catch:{ Exception -> 0x0358 }
            byte[] r6 = r0.field_attrBuf     // Catch:{ Exception -> 0x0358 }
            pe3.a r5 = r5.parseFrom(r6)     // Catch:{ Exception -> 0x0358 }
            com.tencent.mm.protocal.protobuf.SnsObject r5 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r5     // Catch:{ Exception -> 0x0358 }
            java.util.LinkedList<te3.w64> r6 = r5.CommentUserList     // Catch:{ Exception -> 0x0358 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0358 }
        L_0x0319:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0358 }
            if (r7 == 0) goto L_0x0332
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0358 }
            te3.w64 r7 = (te3.w64) r7     // Catch:{ Exception -> 0x0358 }
            te3.w64 r8 = r1.f274936i     // Catch:{ Exception -> 0x0358 }
            if (r8 == 0) goto L_0x0319
            long r13 = r7.f299714r     // Catch:{ Exception -> 0x0358 }
            long r8 = r8.f299714r     // Catch:{ Exception -> 0x0358 }
            int r11 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0319
            r10 = r7
        L_0x0332:
            if (r10 == 0) goto L_0x0339
            java.util.LinkedList<te3.w64> r6 = r5.CommentUserList     // Catch:{ Exception -> 0x0358 }
            r6.remove(r10)     // Catch:{ Exception -> 0x0358 }
        L_0x0339:
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0358 }
            r0.setAttrBuf(r5)     // Catch:{ Exception -> 0x0358 }
            os2.j r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ Exception -> 0x0358 }
            r5.replace(r0)     // Catch:{ Exception -> 0x0358 }
            os2.x r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0358 }
            long r7 = r0.field_snsId     // Catch:{ Exception -> 0x0358 }
            te3.w64 r0 = r1.f274936i     // Catch:{ Exception -> 0x0358 }
            long r9 = r0.f299714r     // Catch:{ Exception -> 0x0358 }
            int r11 = r0.f299706g     // Catch:{ Exception -> 0x0358 }
            r6.mo139888Lo(r7, r9, r11)     // Catch:{ Exception -> 0x0358 }
            goto L_0x053d
        L_0x0358:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)
            goto L_0x053d
        L_0x0364:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r5 = r1.f274934g
            r0.getClass()
            java.lang.String r7 = "removeLikedCancel"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r0.mo130963v(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x053d
        L_0x037d:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r8 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139806SE(r8)
            if (r0 == 0) goto L_0x053d
            com.tencent.mm.protocal.protobuf.SnsObject r8 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0421 }
            r8.<init>()     // Catch:{ Exception -> 0x0421 }
            byte[] r9 = r0.field_attrBuf     // Catch:{ Exception -> 0x0421 }
            pe3.a r8 = r8.parseFrom(r9)     // Catch:{ Exception -> 0x0421 }
            com.tencent.mm.protocal.protobuf.SnsObject r8 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r8     // Catch:{ Exception -> 0x0421 }
            java.util.LinkedList<te3.w64> r9 = r8.CommentUserList     // Catch:{ Exception -> 0x0421 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0421 }
        L_0x039c:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0421 }
            if (r11 == 0) goto L_0x03b3
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0421 }
            te3.w64 r11 = (te3.w64) r11     // Catch:{ Exception -> 0x0421 }
            te3.w64 r13 = r1.f274936i     // Catch:{ Exception -> 0x0421 }
            if (r13 == 0) goto L_0x039c
            int r14 = r11.f299709j     // Catch:{ Exception -> 0x0421 }
            int r13 = r13.f299709j     // Catch:{ Exception -> 0x0421 }
            if (r14 != r13) goto L_0x039c
            r10 = r11
        L_0x03b3:
            if (r10 == 0) goto L_0x03ba
            java.util.LinkedList<te3.w64> r9 = r8.CommentUserList     // Catch:{ Exception -> 0x0421 }
            r9.remove(r10)     // Catch:{ Exception -> 0x0421 }
        L_0x03ba:
            byte[] r8 = r8.toByteArray()     // Catch:{ Exception -> 0x0421 }
            r0.setAttrBuf(r8)     // Catch:{ Exception -> 0x0421 }
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x0421 }
            r8.Pq0(r0)     // Catch:{ Exception -> 0x0421 }
            byte[] r8 = i40.C60247c.f171776h     // Catch:{ Exception -> 0x0421 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0421 }
            f40.e r9 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x041e }
            r9.mo121108c()     // Catch:{ all -> 0x041e }
            boolean r6 = r6.isAssignableFrom(r7)     // Catch:{ all -> 0x041e }
            if (r6 == 0) goto L_0x0416
            androidx.lifecycle.k0 r6 = new androidx.lifecycle.k0     // Catch:{ all -> 0x041e }
            f40.e r9 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x041e }
            f40.a r9 = r9.f251755f     // Catch:{ all -> 0x041e }
            i40.c$a$a r10 = new i40.c$a$a     // Catch:{ all -> 0x041e }
            r10.<init>()     // Catch:{ all -> 0x041e }
            r6.<init>((androidx.lifecycle.C0123n0) r9, (androidx.lifecycle.C54209k0.C54210b) r10)     // Catch:{ all -> 0x041e }
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)     // Catch:{ all -> 0x041e }
            monitor-exit(r8)     // Catch:{ Exception -> 0x0421 }
            iu2.e r6 = (iu2.C60631e) r6     // Catch:{ Exception -> 0x0421 }
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r5 = r6.mo85233d3(r5)     // Catch:{ Exception -> 0x0421 }
            iu2.d r5 = (iu2.C98802d) r5     // Catch:{ Exception -> 0x0421 }
            long r6 = r1.f274934g     // Catch:{ Exception -> 0x0421 }
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r8 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion     // Catch:{ Exception -> 0x0421 }
            com.tencent.mm.sdk.storage.observer.StorageEventId r8 = r8.getUPDATE()     // Catch:{ Exception -> 0x0421 }
            r5.mo138178i3(r6, r8)     // Catch:{ Exception -> 0x0421 }
            os2.x r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0421 }
            long r14 = r0.field_snsId     // Catch:{ Exception -> 0x0421 }
            te3.w64 r0 = r1.f274936i     // Catch:{ Exception -> 0x0421 }
            int r5 = r0.f299709j     // Catch:{ Exception -> 0x0421 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0421 }
            int r0 = r0.f299706g     // Catch:{ Exception -> 0x0421 }
            r16 = r5
            r18 = r0
            r13.mo139888Lo(r14, r16, r18)     // Catch:{ Exception -> 0x0421 }
            goto L_0x053d
        L_0x0416:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x041e }
            java.lang.String r5 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r5)     // Catch:{ all -> 0x041e }
            throw r0     // Catch:{ all -> 0x041e }
        L_0x041e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x0421 }
            throw r0     // Catch:{ Exception -> 0x0421 }
        L_0x0421:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)
            goto L_0x053d
        L_0x042d:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r8 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139806SE(r8)
            if (r0 == 0) goto L_0x053d
            r0.setPravited(r12)
            r0.unLocalPrivate()
            r0.setExtFlag()
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r9 = r1.f274934g
            r8.yu0(r9, r0)
            byte[] r8 = i40.C60247c.f171776h
            monitor-enter(r8)
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x048d }
            r0.mo121108c()     // Catch:{ all -> 0x048d }
            boolean r0 = r6.isAssignableFrom(r7)     // Catch:{ all -> 0x048d }
            if (r0 == 0) goto L_0x0485
            androidx.lifecycle.k0 r0 = new androidx.lifecycle.k0     // Catch:{ all -> 0x048d }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x048d }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x048d }
            i40.c$a$a r9 = new i40.c$a$a     // Catch:{ all -> 0x048d }
            r9.<init>()     // Catch:{ all -> 0x048d }
            r0.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r9)     // Catch:{ all -> 0x048d }
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)     // Catch:{ all -> 0x048d }
            monitor-exit(r8)
            iu2.e r0 = (iu2.C60631e) r0
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r5)
            iu2.d r0 = (iu2.C98802d) r0
            long r5 = r1.f274934g
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = r7.getUPDATE()
            r0.mo138178i3(r5, r7)
            goto L_0x053d
        L_0x0485:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x048d }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x048d }
            throw r0     // Catch:{ all -> 0x048d }
        L_0x048d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0490:
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r9 = r1.f274934g
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r8.mo139806SE(r9)
            if (r8 == 0) goto L_0x053d
            r8.setPravited(r0)
            r8.setLocalPrivate()
            com.tencent.mm.protocal.protobuf.SnsObject r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r8)
            int r9 = r0.ExtFlag
            r9 = r9 & -1543(0xfffffffffffff9f9, float:NaN)
            r0.ExtFlag = r9
            r1.mo131047j1(r0)
            r1.mo131048k1(r0)
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x04b9 }
            r8.field_attrBuf = r0     // Catch:{ IOException -> 0x04b9 }
            goto L_0x04c3
        L_0x04b9:
            r0 = move-exception
            java.lang.String r9 = "MicroMsg.NetSceneSnsObjectOp"
            java.lang.String r10 = ""
            java.lang.Object[] r11 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r11)
        L_0x04c3:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r9 = r1.f274934g
            r0.yu0(r9, r8)
            byte[] r8 = i40.C60247c.f171776h
            monitor-enter(r8)
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x050d }
            r0.mo121108c()     // Catch:{ all -> 0x050d }
            boolean r0 = r6.isAssignableFrom(r7)     // Catch:{ all -> 0x050d }
            if (r0 == 0) goto L_0x0505
            androidx.lifecycle.k0 r0 = new androidx.lifecycle.k0     // Catch:{ all -> 0x050d }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x050d }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x050d }
            i40.c$a$a r9 = new i40.c$a$a     // Catch:{ all -> 0x050d }
            r9.<init>()     // Catch:{ all -> 0x050d }
            r0.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r9)     // Catch:{ all -> 0x050d }
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)     // Catch:{ all -> 0x050d }
            monitor-exit(r8)
            iu2.e r0 = (iu2.C60631e) r0
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r5)
            iu2.d r0 = (iu2.C98802d) r0
            long r5 = r1.f274934g
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = r7.getUPDATE()
            r0.mo138178i3(r5, r7)
            goto L_0x053d
        L_0x0505:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x050d }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x050d }
            throw r0     // Catch:{ all -> 0x050d }
        L_0x050d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0510:
            com.tencent.mm.plugin.sns.model.b1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r6 = r1.f274934g
            r5.mo130962u(r6)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r6 = r1.f274934g
            r5.delete(r6)
            r5 = r24
            ob0.c r5 = (ob0.C47350c) r5
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.x74 r5 = (te3.x74) r5
            int r6 = r5.f144510f
            if (r6 != r0) goto L_0x053d
            os2.d0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()
            java.util.LinkedList<te3.q94> r5 = r5.f144512h
            r0.mo139777NQ(r6, r5)
        L_0x053d:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r0.mo130950e()
            ob0.n r0 = r1.f274931d
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0552:
            if (r2 != r8) goto L_0x0582
            int r5 = r1.f274933f
            if (r5 != r0) goto L_0x0582
            if (r5 == r0) goto L_0x0579
            r0 = 5
            if (r5 == r0) goto L_0x0561
            r0 = 7
            if (r5 == r0) goto L_0x0561
            goto L_0x0582
        L_0x0561:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r5 = r1.f274934g
            r0.getClass()
            java.lang.String r7 = "removeLikedCancel"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r0.mo130963v(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x0582
        L_0x0579:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r5 = r1.f274934g
            r0.mo130962u(r5)
        L_0x0582:
            ob0.n r0 = r1.f274931d
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94877g0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public C94877g0(long j, int i) {
        this(j, i, (w64) null, (Object) null);
    }

    public C94877g0(long j, int i, Object obj) {
        this(j, i, (w64) null, obj);
    }

    public C94877g0(long j, int i, w64 w64) {
        this(j, i, w64, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c5 A[SYNTHETIC, Splitter:B:129:0x03c5] */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94877g0(long r19, int r21, te3.w64 r22, java.lang.Object r23) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r4 = r21
            r0 = r22
            r5 = r23
            r18.<init>()
            r6 = -1
            r1.f274933f = r6
            r7 = 0
            r1.f274934g = r7
            r1.f274935h = r6
            com.tencent.mm.sdk.platformtools.MMHandler r6 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            r6.<init>((android.os.Looper) r9)
            r1.f274936i = r0
            r1.f274933f = r4
            r1.f274934g = r2
            r1.f274937j = r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "snsId : "
            r6.append(r9)
            r6.append(r2)
            java.lang.String r9 = "  op : "
            r6.append(r9)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "MicroMsg.NetSceneSnsObjectOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            java.lang.String r6 = " "
            if (r0 == 0) goto L_0x0063
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r0.f299709j
            r10.append(r11)
            r10.append(r6)
            long r11 = r0.f299714r
            r10.append(r11)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0063:
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.w74 r10 = new te3.w74
            r10.<init>()
            r0.f127066a = r10
            te3.x74 r10 = new te3.x74
            r10.<init>()
            r0.f127067b = r10
            java.lang.String r10 = "/cgi-bin/micromsg-bin/mmsnsobjectop"
            r0.f127068c = r10
            r10 = 218(0xda, float:3.05E-43)
            r0.f127069d = r10
            r10 = 104(0x68, float:1.46E-43)
            r0.f127070e = r10
            r10 = 1000000104(0x3b9aca68, float:0.0047238357)
            r0.f127071f = r10
            ob0.c r0 = r0.mo72403a()
            r1.f274932e = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            r10 = r0
            te3.w74 r10 = (te3.w74) r10
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139806SE(r2)
            if (r0 == 0) goto L_0x00a2
            int r0 = r0.localid
            r1.f274935h = r0
        L_0x00a2:
            te3.w64 r0 = r1.f274936i
            java.lang.String r11 = "getSnsObjectOp"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            te3.s74 r13 = new te3.s74
            r13.<init>()
            te3.qv3 r14 = new te3.qv3
            r14.<init>()
            r13.f141360f = r14
            r13.f141358d = r2
            r13.f141359e = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "getSnsObjectOp "
            r14.append(r15)
            r14.append(r4)
            r14.append(r6)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x00d7
            r15 = r6
            goto L_0x00db
        L_0x00d7:
            java.lang.String r15 = r23.toString()
        L_0x00db:
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r14)
            r15 = 10
            r14 = 8
            r7 = 7
            r8 = 6
            if (r4 == r14) goto L_0x00f9
            if (r4 == r15) goto L_0x00f9
            if (r4 == r7) goto L_0x00f9
            if (r4 == r14) goto L_0x00f9
            if (r4 != r8) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            r14 = r6
            r15 = 0
            goto L_0x0131
        L_0x00f9:
            os2.j r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r15 = r15.mo139864jo(r2)
            if (r15 == 0) goto L_0x0108
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = r15.convertToSnsInfo()
            goto L_0x0109
        L_0x0108:
            r15 = 0
        L_0x0109:
            if (r15 == 0) goto L_0x0130
            boolean r17 = r15.isAd()
            if (r17 == 0) goto L_0x0130
            com.tencent.mm.plugin.sns.storage.ADInfo r14 = r15.getAdInfo()
            if (r14 != 0) goto L_0x0119
            r14 = r6
            goto L_0x011b
        L_0x0119:
            java.lang.String r14 = r14.uxInfo
        L_0x011b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "aduxinfo "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            goto L_0x0131
        L_0x0130:
            r14 = r6
        L_0x0131:
            r7 = 6
            if (r4 != r7) goto L_0x0175
            if (r0 == 0) goto L_0x0170
            int r2 = r0.f299709j
            if (r2 != 0) goto L_0x0143
            long r2 = r0.f299714r
            r15 = 0
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0143
            goto L_0x0170
        L_0x0143:
            te3.l64 r2 = new te3.l64
            r2.<init>()
            r7 = r9
            long r8 = r0.f299714r
            r2.f137232d = r8
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r6)
            te3.rv3 r0 = sf0.C48374j0.m53720i(r0)
            r2.f137233e = r0
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0167 }
            te3.qv3 r2 = new te3.qv3     // Catch:{ Exception -> 0x0167 }
            r2.<init>()     // Catch:{ Exception -> 0x0167 }
            r2.mo73350k(r0)     // Catch:{ Exception -> 0x0167 }
            r13.f141360f = r2     // Catch:{ Exception -> 0x0167 }
            goto L_0x03af
        L_0x0167:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r2)
            goto L_0x03af
        L_0x0170:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x03b2
        L_0x0175:
            r7 = r9
            r8 = 7
            if (r4 != r8) goto L_0x01a1
            te3.d64 r0 = new te3.d64
            r0.<init>()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r6)
            te3.rv3 r2 = sf0.C48374j0.m53720i(r2)
            r0.f132157d = r2
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0198 }
            te3.qv3 r2 = new te3.qv3     // Catch:{ Exception -> 0x0198 }
            r2.<init>()     // Catch:{ Exception -> 0x0198 }
            r2.mo73350k(r0)     // Catch:{ Exception -> 0x0198 }
            r13.f141360f = r2     // Catch:{ Exception -> 0x0198 }
            goto L_0x03af
        L_0x0198:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r2)
            goto L_0x03af
        L_0x01a1:
            r8 = 8
            if (r4 != r8) goto L_0x02b0
            if (r5 == 0) goto L_0x01ad
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a
            if (r0 == 0) goto L_0x01ad
            r0 = 1
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01e4
            r8 = r5
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r8 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r8
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r6)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "&"
            r9.append(r1)
            long r1 = r8.f275661g
            r9.append(r1)
            java.lang.String r1 = "|"
            r9.append(r1)
            long r1 = r8.f275662h
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            r14.append(r1)
            java.lang.String r14 = r14.toString()
        L_0x01e4:
            te3.g64 r1 = new te3.g64
            r1.<init>()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r6)
            te3.rv3 r2 = sf0.C48374j0.m53720i(r2)
            r1.f133891d = r2
            if (r15 == 0) goto L_0x0237
            int r2 = r15.getAdRecSrc()
            r1.f133892e = r2
            java.lang.String r2 = r15.getSnsId()
            java.lang.String r3 = "getSnsStatExtBySnsId"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            os2.e0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r9.mo139807TE(r2)
            if (r9 == 0) goto L_0x021c
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r9.getTimeLine()
            java.lang.String r2 = jp2.C98962n.m128839d(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            goto L_0x022d
        L_0x021c:
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r9 = 0
            r14[r9] = r2
            java.lang.String r2 = "SnsAdExtUtil"
            java.lang.String r9 = "getSnsStatExtBySnsId snsInfo null, snsId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r9, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            r2 = r6
        L_0x022d:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r6)
            te3.rv3 r2 = sf0.C48374j0.m53720i(r2)
            r1.f133893f = r2
        L_0x0237:
            if (r0 == 0) goto L_0x023d
            r14 = r5
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r14 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r14
            goto L_0x023e
        L_0x023d:
            r14 = 0
        L_0x023e:
            r2 = 101(0x65, float:1.42E-43)
            if (r14 == 0) goto L_0x027f
            int r3 = r14.f275659e
            if (r3 <= 0) goto L_0x027f
            r1.f133895h = r3
            java.util.LinkedList<java.lang.Integer> r0 = r1.f133896i
            if (r0 == 0) goto L_0x0251
            java.util.LinkedList<java.lang.Integer> r3 = r14.f275660f
            r0.addAll(r3)
        L_0x0251:
            int r0 = r14.f275659e
            r3 = 1
            if (r0 != r3) goto L_0x0265
            java.util.LinkedList<java.lang.Integer> r0 = r14.f275660f
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0268
        L_0x0265:
            rq2.C101418d.m133072b(r19)
        L_0x0268:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getSnsObjectOp, reasonIdCount = "
            r0.append(r2)
            int r2 = r14.f275659e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0297
        L_0x027f:
            if (r0 == 0) goto L_0x028b
            r3 = r5
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r3 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r3
            int r3 = r3.f275658d
            if (r3 != r2) goto L_0x028b
            r1.f133894g = r2
            goto L_0x0297
        L_0x028b:
            rq2.C101418d.m133072b(r19)
            if (r0 == 0) goto L_0x0297
            r0 = r5
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r0 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r0
            int r0 = r0.f275658d
            r1.f133894g = r0
        L_0x0297:
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x02a7 }
            te3.qv3 r1 = new te3.qv3     // Catch:{ Exception -> 0x02a7 }
            r1.<init>()     // Catch:{ Exception -> 0x02a7 }
            r1.mo73350k(r0)     // Catch:{ Exception -> 0x02a7 }
            r13.f141360f = r1     // Catch:{ Exception -> 0x02a7 }
            goto L_0x03af
        L_0x02a7:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
            goto L_0x03af
        L_0x02b0:
            r1 = 4
            if (r4 != r1) goto L_0x02e9
            if (r0 == 0) goto L_0x02e4
            int r1 = r0.f299709j
            if (r1 != 0) goto L_0x02c2
            long r1 = r0.f299714r
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x02c2
            goto L_0x02e4
        L_0x02c2:
            te3.u74 r1 = new te3.u74
            r1.<init>()
            int r0 = r0.f299709j
            r1.f142655d = r0
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x02db }
            te3.qv3 r1 = new te3.qv3     // Catch:{ Exception -> 0x02db }
            r1.<init>()     // Catch:{ Exception -> 0x02db }
            r1.mo73350k(r0)     // Catch:{ Exception -> 0x02db }
            r13.f141360f = r1     // Catch:{ Exception -> 0x02db }
            goto L_0x03af
        L_0x02db:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
            goto L_0x03af
        L_0x02e4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x03b2
        L_0x02e9:
            r0 = 10
            if (r4 != r0) goto L_0x0363
            te3.f84 r0 = new te3.f84
            r0.<init>()
            boolean r1 = r5 instanceof pe3.C89349b
            if (r1 == 0) goto L_0x0319
            r1 = r5
            pe3.b r1 = (pe3.C89349b) r1
            byte[] r2 = r1.f257327a
            te3.qv3 r2 = sf0.C48374j0.m53712a(r2)
            r0.f133353d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NetSceneSnsObjectOpticket "
            r2.append(r3)
            byte[] r1 = r1.f257327a
            int r1 = r1.length
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x031e
        L_0x0319:
            java.lang.String r1 = "error ticket"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
        L_0x031e:
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0343 }
            te3.qv3 r1 = new te3.qv3     // Catch:{ Exception -> 0x0343 }
            r1.<init>()     // Catch:{ Exception -> 0x0343 }
            r1.mo73350k(r0)     // Catch:{ Exception -> 0x0343 }
            r13.f141360f = r1     // Catch:{ Exception -> 0x0343 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0343 }
            r1.<init>()     // Catch:{ Exception -> 0x0343 }
            java.lang.String r2 = "opFree "
            r1.append(r2)     // Catch:{ Exception -> 0x0343 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0343 }
            r1.append(r0)     // Catch:{ Exception -> 0x0343 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0343 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0343 }
            goto L_0x03af
        L_0x0343:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error ticket "
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
            goto L_0x03af
        L_0x0363:
            r0 = 12
            if (r4 != r0) goto L_0x03af
            boolean r0 = r5 instanceof te3.n74
            if (r0 == 0) goto L_0x03aa
            r0 = r5
            te3.n74 r0 = (te3.n74) r0
            byte[] r1 = r0.toByteArray()     // Catch:{ Exception -> 0x0390 }
            te3.qv3 r1 = sf0.C48374j0.m53712a(r1)     // Catch:{ Exception -> 0x0390 }
            r13.f141360f = r1     // Catch:{ Exception -> 0x0390 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0390 }
            r1.<init>()     // Catch:{ Exception -> 0x0390 }
            java.lang.String r2 = "snsMetionBlockOp, switch:%d "
            r1.append(r2)     // Catch:{ Exception -> 0x0390 }
            int r0 = r0.f138460d     // Catch:{ Exception -> 0x0390 }
            r1.append(r0)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0390 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0390 }
            goto L_0x03af
        L_0x0390:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error snsMetionBlockOp "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x03af
        L_0x03aa:
            java.lang.String r0 = "error snsMetionBlockOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x03af:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x03b2:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r13)
            r10.f143913e = r0
            int r0 = r0.size()
            r10.f143912d = r0
            r1 = 1
            if (r4 != r1) goto L_0x03e8
            te3.lx4 r0 = new te3.lx4     // Catch:{ all -> 0x03e8 }
            r0.<init>()     // Catch:{ all -> 0x03e8 }
            te3.qv3 r1 = new te3.qv3     // Catch:{ all -> 0x03e8 }
            r1.<init>()     // Catch:{ all -> 0x03e8 }
            tc2.g r2 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x03e8 }
            byte[] r2 = r2.mo175821hd()     // Catch:{ all -> 0x03e8 }
            r1.mo73350k(r2)     // Catch:{ all -> 0x03e8 }
            r0.f354117f = r1     // Catch:{ all -> 0x03e8 }
            te3.qv3 r1 = new te3.qv3     // Catch:{ all -> 0x03e8 }
            r1.<init>()     // Catch:{ all -> 0x03e8 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x03e8 }
            r1.mo73350k(r0)     // Catch:{ all -> 0x03e8 }
            r10.f143914f = r1     // Catch:{ all -> 0x03e8 }
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94877g0.<init>(long, int, te3.w64, java.lang.Object):void");
    }

    public C94877g0(long j, int i, int i2, String str) {
        this.f274933f = -1;
        this.f274934g = 0;
        this.f274935h = -1;
        new MMHandler(Looper.getMainLooper());
        this.f274936i = null;
        this.f274933f = 9;
        this.f274934g = j;
        Log.m105924i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + j + "  op : " + this.f274933f);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new w74();
        bVar.f127067b = new x74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        bVar.f127069d = 218;
        bVar.f127070e = 104;
        bVar.f127071f = 1000000104;
        C47350c a = bVar.mo72403a();
        this.f274932e = a;
        w74 w74 = (w74) a.f127055a.f127080a;
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE != null) {
            this.f274935h = SE.localid;
        }
        int i3 = this.f274933f;
        SnsMethodCalculate.markStartTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        s74 s74 = new s74();
        s74.f141360f = new C51018qv3();
        s74.f141358d = j;
        s74.f141359e = i3;
        SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        v74 v74 = new v74();
        v74.f143380f = i;
        v74.f143378d = i2;
        v74.f143379e = C48374j0.m53720i(str);
        try {
            byte[] byteArray = v74.toByteArray();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(byteArray);
            s74.f141360f = qv32;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e, "", new Object[0]);
        }
        LinkedList<s74> linkedList = new LinkedList<>();
        linkedList.add(s74);
        w74.f143913e = linkedList;
        w74.f143912d = linkedList.size();
    }
}
