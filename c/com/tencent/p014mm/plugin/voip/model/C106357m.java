package com.tencent.p014mm.plugin.voip.model;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import p749xh.C112150i9;
import r33.C63359a;
import rx3.C13604l;
import te3.ds4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.m */
public final class C106357m {

    /* renamed from: a */
    public static final C106357m f317386a = new C106357m();

    /* renamed from: com.tencent.mm.plugin.voip.model.m$a */
    public static final class C106358a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f317387d;

        /* renamed from: e */
        public final /* synthetic */ long f317388e;

        /* renamed from: f */
        public final /* synthetic */ int f317389f;

        public C106358a(long j, long j2, int i) {
            this.f317387d = j;
            this.f317388e = j2;
            this.f317389f = i;
        }

        public final void run() {
            int i;
            Log.m105924i("MicroMsg.VoIPBubbleHelper", "markCgiCalled() executed with: roomId = " + this.f317387d + ", roomKey = " + this.f317388e + ", inviteId = " + this.f317389f);
            long j = this.f317387d;
            if (j == 0 && (i = this.f317389f) > 0) {
                C106357m mVar = C106357m.f317386a;
                SelectSql C2 = C112150i9.m152896C2((long) i);
                C87412m.m108593f(C2, "selectByInviteid(inviteId.toLong())");
                C112150i9 h = mVar.mo152649h(C2);
                if (h != null) {
                    long j2 = this.f317387d;
                    long j3 = this.f317388e;
                    if (h.mo163961z2() == 0 && j2 != 0) {
                        h.mo163944U2(j2);
                        h.mo163945V2(j3);
                    }
                    h.mo163929F2(1);
                    mVar.mo152653p(h);
                    Log.m105924i("MicroMsg.VoIPBubbleHelper", "markCgiCalled: update state by invite id");
                }
            } else if (j > 0) {
                SelectSql E2 = C112150i9.m152898E2(j);
                C87412m.m108593f(E2, "selectByRoomid(roomId)");
                C112150i9 i9Var = (C112150i9) E2.singleQuery(C63359a.f179730j.mo88266a().getDB(), C112150i9.class);
                if (i9Var != null) {
                    if (!(i9Var.mo163927A2() == this.f317388e)) {
                        i9Var = null;
                    }
                    if (i9Var != null) {
                        i9Var.mo163929F2(1);
                        new UpdateExecutor(i9Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseVoIPBubbleInfo").execute(C63359a.f179730j.mo88266a().getDB());
                        Log.m105924i("MicroMsg.VoIPBubbleHelper", "markCgiCalled: update state");
                    }
                }
            } else {
                Log.m105920e("MicroMsg.VoIPBubbleHelper", "markCgiCalled: get bubble info from db error");
            }
        }
    }

    /* renamed from: a */
    public static final boolean m143308a(C106357m mVar, C112150i9 i9Var) {
        mVar.getClass();
        if (i9Var.mo163948m2() > 0) {
            long currentTimeMillis = System.currentTimeMillis() - i9Var.mo163948m2();
            if (1 <= currentTimeMillis && currentTimeMillis < ApkDownloadManager.INTERVAL) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: allow insert");
            } else {
                Log.m105928w("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: time out");
                return false;
            }
        } else if (i9Var.mo163952q2() <= 0) {
            return false;
        } else {
            long currentTimeMillis2 = System.currentTimeMillis() - i9Var.mo163952q2();
            if (1 <= currentTimeMillis2 && currentTimeMillis2 < ApkDownloadManager.INTERVAL) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: allow insert by inviteTS");
            } else {
                Log.m105928w("MicroMsg.VoIPBubbleHelper", "allowInsertLocalMsg: time out by inviteTS");
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final C72963f4 m143309b(C106357m mVar, C112150i9 i9Var, String str) {
        mVar.getClass();
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(System.currentTimeMillis());
        f4Var.setType(50);
        f4Var.mo108749c3(i9Var.mo163928B2());
        f4Var.mo108732L2(i9Var.mo163960y2() == 0 ? "voip_content_video" : "voip_content_voice");
        if (i9Var.mo163957v2() == 1) {
            f4Var.mo108740T2(1);
        } else {
            f4Var.mo108740T2(0);
        }
        f4Var.mo100991d(6);
        f4Var.mo101012p4(str);
        return f4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        if (r0 == 1) goto L_0x0035;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m143310c() {
        /*
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r1 = bp3.C104160f.RepairerConfig_VOIP_UseSvrBubble_Int
            r2 = 0
            int r0 = r0.mo109882e(r1, r2)
            r1 = -1
            java.lang.String r3 = "MicroMsg.VoIPBubbleHelper"
            r4 = 1
            if (r0 == r1) goto L_0x0036
            if (r0 == r4) goto L_0x0035
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_voip_svr_bubble_enable
            int r0 = r0.mo58779Qe(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "enableSwitch: xconfig "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r0 != r4) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enableSwitch: enable "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106357m.m143310c():boolean");
    }

    /* renamed from: f */
    public static final C13604l<Long, Long> m143311f(long j) {
        C106357m mVar = f317386a;
        SelectSql E2 = C112150i9.m152898E2(j);
        C87412m.m108593f(E2, "selectByRoomid(roomId)");
        C112150i9 h = mVar.mo152649h(E2);
        Long l = null;
        Long valueOf = h != null ? Long.valueOf(h.mo163952q2()) : null;
        if (h != null) {
            l = Long.valueOf(h.mo163950o2());
        }
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "getInviteAndConnectTimeByRoomId: inviteTime " + valueOf + " connectTime " + l);
        long j2 = 0;
        Long valueOf2 = Long.valueOf(valueOf != null ? valueOf.longValue() : 0);
        if (l != null) {
            j2 = l.longValue();
        }
        return new C13604l<>(valueOf2, Long.valueOf(j2));
    }

    /* renamed from: g */
    public static final long m143312g(long j) {
        C106357m mVar = f317386a;
        SelectSql E2 = C112150i9.m152898E2(j);
        C87412m.m108593f(E2, "selectByRoomid(roomId)");
        C112150i9 h = mVar.mo152649h(E2);
        Long valueOf = h != null ? Long.valueOf(h.mo163952q2()) : null;
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "getInviteTimeByRoomId: time " + valueOf);
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0;
    }

    /* renamed from: k */
    public static final void m143313k(long j, long j2, int i) {
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "markCgiCalled() called with: roomId = " + j + ", roomKey = " + j2 + ", inviteId = " + i);
        ((C119157j) C119157j.f356862d).mo183875f(new C106358a(j, j2, i));
    }

    /* renamed from: l */
    public static final void m143314l(C106369n nVar) {
        C87412m.m108594g(nVar, "voipInfo");
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "markRoomConnected() called with: voipInfo = " + nVar);
        C106357m mVar = f317386a;
        C112150i9 e = mVar.mo152648e(nVar);
        if (e != null) {
            e.mo163942S2(2);
            e.mo163932I2(System.currentTimeMillis());
            mVar.mo152653p(e);
        }
    }

    /* renamed from: m */
    public static final void m143315m(C106369n nVar) {
        C87412m.m108594g(nVar, "voipInfo");
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "markRoomCreated() called with: voipInfo = " + nVar);
        if (nVar.f317434a == 0 && nVar.f317436c == 0) {
            Log.m105928w("MicroMsg.VoIPBubbleHelper", "markRoomCreated: not valued info");
            return;
        }
        C106357m mVar = f317386a;
        C112150i9 e = mVar.mo152648e(nVar);
        if (e != null) {
            Log.m105924i("MicroMsg.VoIPBubbleHelper", "markRoomCreated: already has record");
            e.mo163943T2(nVar.f317438e ^ true ? 1 : 0);
            e.mo163940Q2(nVar.f317439f ? 1 : 0);
            e.mo163946W2(nVar.f317437d);
            e.mo163937N2(1);
            mVar.mo152653p(e);
            return;
        }
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "markRoomCreated: insert new record");
        C112150i9 i9Var = new C112150i9();
        i9Var.mo163944U2(nVar.f317434a);
        i9Var.mo163945V2(nVar.f317435b);
        i9Var.mo163936M2((long) nVar.f317436c);
        i9Var.mo163943T2(nVar.f317438e ^ true ? 1 : 0);
        i9Var.mo163940Q2(nVar.f317439f ? 1 : 0);
        i9Var.mo163946W2(nVar.f317437d);
        i9Var.mo163939P2(-1);
        i9Var.mo163942S2(1);
        i9Var.mo163935L2(System.currentTimeMillis());
        i9Var.mo163937N2(1);
        mVar.mo152650i(i9Var);
    }

    /* renamed from: o */
    public static final String m143316o(Map<String, String> map, String str) {
        String str2 = map.get(".VoIPBubbleMsg." + str);
        return str2 == null ? "" : str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0129  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p749xh.C112150i9 mo152647d(te3.ds4 r14) {
        /*
            r13 = this;
            java.lang.Class<xh.i9> r0 = p749xh.C112150i9.class
            long r1 = r14.f331959g
            java.lang.String r3 = "MicroMsg.VoIPBubbleHelper"
            r4 = 1
            r5 = 0
            r6 = 0
            r8 = 0
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x009e
            com.tencent.mm.sdk.storage.sql.SelectSql r1 = p749xh.C112150i9.m152898E2(r1)
            java.lang.String r2 = "selectByRoomid(bubbleMsg.roomid)"
            gy3.C87412m.m108593f(r1, r2)
            r33.a$a r2 = r33.C63359a.f179730j
            r33.a r2 = r2.mo88266a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.getDB()
            java.util.List r1 = r1.multiQuery(r2, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x002a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0045
            java.lang.Object r9 = r2.next()
            r10 = r9
            xh.i9 r10 = (p749xh.C112150i9) r10
            int r10 = r10.mo163955t2()
            int r11 = r14.f331962j
            if (r10 != r11) goto L_0x0041
            r10 = 1
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            if (r10 == 0) goto L_0x002a
            goto L_0x0046
        L_0x0045:
            r9 = r8
        L_0x0046:
            xh.i9 r9 = (p749xh.C112150i9) r9
            if (r9 != 0) goto L_0x006b
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()
            r9 = r2
            xh.i9 r9 = (p749xh.C112150i9) r9
            int r9 = r9.mo163955t2()
            if (r9 != 0) goto L_0x0063
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 == 0) goto L_0x004e
            goto L_0x0068
        L_0x0067:
            r2 = r8
        L_0x0068:
            r9 = r2
            xh.i9 r9 = (p749xh.C112150i9) r9
        L_0x006b:
            if (r9 == 0) goto L_0x009e
            long r1 = r9.mo163927A2()
            long r10 = r14.f331960h
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r1 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r9 = r8
        L_0x007e:
            if (r9 == 0) goto L_0x009e
            long r1 = r9.mo163953r2()
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x009f
            long r1 = r14.f331961i
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x009f
            java.lang.String r1 = "getBubbleInfoByBubbleMsg: update inviteid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            long r1 = r14.f331961i
            r9.mo163936M2(r1)
            com.tencent.mm.plugin.voip.model.m r1 = f317386a
            r1.mo152653p(r9)
            goto L_0x009f
        L_0x009e:
            r9 = r8
        L_0x009f:
            if (r9 != 0) goto L_0x0129
            long r1 = r14.f331961i
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x012a
            com.tencent.mm.sdk.storage.sql.SelectSql r1 = p749xh.C112150i9.m152896C2(r1)
            java.lang.String r2 = "selectByInviteid(bubbleMsg.inviteid)"
            gy3.C87412m.m108593f(r1, r2)
            r33.a$a r2 = r33.C63359a.f179730j
            r33.a r2 = r2.mo88266a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.getDB()
            java.util.List r0 = r1.multiQuery(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00dd
            java.lang.Object r2 = r1.next()
            r9 = r2
            xh.i9 r9 = (p749xh.C112150i9) r9
            int r9 = r9.mo163955t2()
            int r10 = r14.f331962j
            if (r9 != r10) goto L_0x00d9
            r9 = 1
            goto L_0x00da
        L_0x00d9:
            r9 = 0
        L_0x00da:
            if (r9 == 0) goto L_0x00c2
            goto L_0x00de
        L_0x00dd:
            r2 = r8
        L_0x00de:
            xh.i9 r2 = (p749xh.C112150i9) r2
            if (r2 != 0) goto L_0x0103
            java.util.Iterator r0 = r0.iterator()
        L_0x00e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r0.next()
            r2 = r1
            xh.i9 r2 = (p749xh.C112150i9) r2
            int r2 = r2.mo163955t2()
            if (r2 != 0) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            if (r2 == 0) goto L_0x00e6
            goto L_0x0100
        L_0x00ff:
            r1 = r8
        L_0x0100:
            r2 = r1
            xh.i9 r2 = (p749xh.C112150i9) r2
        L_0x0103:
            if (r2 == 0) goto L_0x012a
            long r0 = r2.mo163961z2()
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0127
            long r0 = r14.f331959g
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0127
            java.lang.String r0 = "getBubbleInfoByBubbleMsg: update roomid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            long r0 = r14.f331959g
            r2.mo163944U2(r0)
            long r0 = r14.f331960h
            r2.mo163945V2(r0)
            com.tencent.mm.plugin.voip.model.m r14 = f317386a
            r14.mo152653p(r2)
        L_0x0127:
            r8 = r2
            goto L_0x012a
        L_0x0129:
            r8 = r9
        L_0x012a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106357m.mo152647d(te3.ds4):xh.i9");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p749xh.C112150i9 mo152648e(com.tencent.p014mm.plugin.voip.model.C106369n r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getBubbleInfoByVoIPInfo() called with: voipInfo = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VoIPBubbleHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r2 = r11.f317434a
            r4 = 0
            r0 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x005e
            com.tencent.mm.sdk.storage.sql.SelectSql r2 = p749xh.C112150i9.m152898E2(r2)
            java.lang.String r3 = "selectByRoomid(voipInfo.roomId)"
            gy3.C87412m.m108593f(r2, r3)
            xh.i9 r2 = r10.mo152649h(r2)
            if (r2 == 0) goto L_0x005e
            long r6 = r2.mo163927A2()
            long r8 = r11.f317435b
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = r0
        L_0x003f:
            if (r2 == 0) goto L_0x005e
            long r6 = r2.mo163953r2()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x005f
            int r3 = r11.f317436c
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = "getBubbleInfoByVoIPInfo: update inviteid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            int r3 = r11.f317436c
            long r6 = (long) r3
            r2.mo163936M2(r6)
            com.tencent.mm.plugin.voip.model.m r3 = f317386a
            r3.mo152653p(r2)
            goto L_0x005f
        L_0x005e:
            r2 = r0
        L_0x005f:
            if (r2 != 0) goto L_0x0097
            int r2 = r11.f317436c
            if (r2 <= 0) goto L_0x0098
            long r2 = (long) r2
            com.tencent.mm.sdk.storage.sql.SelectSql r2 = p749xh.C112150i9.m152896C2(r2)
            java.lang.String r3 = "selectByInviteid(voipInfo.inviteId.toLong())"
            gy3.C87412m.m108593f(r2, r3)
            xh.i9 r2 = r10.mo152649h(r2)
            if (r2 == 0) goto L_0x0098
            long r6 = r2.mo163961z2()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            long r6 = r11.f317434a
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "getBubbleInfoByVoIPInfo: update roomid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r0 = r11.f317434a
            r2.mo163944U2(r0)
            long r0 = r11.f317435b
            r2.mo163945V2(r0)
            com.tencent.mm.plugin.voip.model.m r11 = f317386a
            r11.mo152653p(r2)
        L_0x0097:
            r0 = r2
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106357m.mo152648e(com.tencent.mm.plugin.voip.model.n):xh.i9");
    }

    /* renamed from: h */
    public final C112150i9 mo152649h(SelectSql selectSql) {
        T t;
        Iterator<T> it = selectSql.multiQuery(C63359a.f179730j.mo88266a().getDB(), C112150i9.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            boolean z = true;
            if (((C112150i9) t).mo163954s2() != 1) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C112150i9) t;
    }

    /* renamed from: i */
    public final long mo152650i(C112150i9 i9Var) {
        C87412m.m108594g(i9Var, "<this>");
        long j = (long) 100;
        i9Var.mo163933J2((System.currentTimeMillis() * j) + (System.nanoTime() % j));
        return new InsertExecutor(i9Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseVoIPBubbleInfo").execute(C63359a.f179730j.mo88266a().getDB());
    }

    /* renamed from: j */
    public final synchronized long mo152651j(C112150i9 i9Var, C72963f4 f4Var) {
        if (!m143310c()) {
            Log.m105928w("MicroMsg.VoIPBubbleHelper", "insertMsg: switch not enabled");
            return 0;
        } else if (i9Var.mo163959x2() == 4) {
            Log.m105928w("MicroMsg.VoIPBubbleHelper", "insertMsg: already has bubble msg");
            return i9Var.mo163956u2();
        } else {
            if (i9Var.mo163958w2() > 0 && f4Var.getCreateTime() >= i9Var.mo163958w2()) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "insertMsg: modify bubble msg create time from " + f4Var.getCreateTime() + " to " + (i9Var.mo163958w2() - 1));
                f4Var.mo108733M2(i9Var.mo163958w2() - 1);
            }
            long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            Log.m105924i("MicroMsg.VoIPBubbleHelper", "insertMsg: insert msg " + i9Var.mo163928B2() + ' ' + i9Var.mo163961z2() + ' ' + i9Var.mo163953r2() + ' ' + i9Var.mo163951p2() + ' ' + f4Var.f230724G + ' ' + f4Var.getMsgId());
            i9Var.mo163939P2(my02);
            i9Var.mo163942S2(3);
            i9Var.mo163931H2(f4Var.getCreateTime());
            f317386a.mo152653p(i9Var);
            return my02;
        }
    }

    /* renamed from: n */
    public final ds4 mo152652n(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "VoIPBubbleMsg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.VoIPBubbleHelper", "parseBubbleMsg: parse value error");
            return null;
        }
        ds4 ds4 = new ds4();
        ds4.f331956d = m143316o(parseXml, "msg");
        ds4.f331957e = Util.getInt(m143316o(parseXml, "room_type"), 0);
        ds4.f331958f = Util.getBoolean(m143316o(parseXml, "red_dot"), false);
        ds4.f331959g = Util.getLong(m143316o(parseXml, "roomid"), 0);
        ds4.f331960h = Util.getLong(m143316o(parseXml, "roomkey"), 0);
        ds4.f331961i = Util.getLong(m143316o(parseXml, "inviteid"), 0);
        ds4.f331962j = Util.getInt(m143316o(parseXml, "msg_type"), 0);
        ds4.f331963n = Util.getLong(m143316o(parseXml, AppMeasurement.Param.TIMESTAMP), 0);
        ds4.f331964o = m143316o(parseXml, "identity");
        ds4.f331965p = Util.getInt(m143316o(parseXml, "duration"), 0);
        return ds4;
    }

    /* renamed from: p */
    public final int mo152653p(C112150i9 i9Var) {
        C87412m.m108594g(i9Var, "<this>");
        return new UpdateExecutor(i9Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseVoIPBubbleInfo").execute(C63359a.f179730j.mo88266a().getDB());
    }
}
