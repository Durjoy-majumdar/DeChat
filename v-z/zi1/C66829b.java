package zi1;

import cl1.C55006x0;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fj1.C45795b;
import gy3.C87412m;
import hh1.C8530f;
import o40.C61926c;

/* renamed from: zi1.b */
public final class C66829b {

    /* renamed from: a */
    public final LiveRoomControllerStore f191948a;

    /* renamed from: b */
    public final C45795b f191949b;

    /* renamed from: c */
    public int f191950c;

    /* renamed from: d */
    public String f191951d = "";

    /* renamed from: e */
    public MTimerHandler f191952e = new MTimerHandler("LiveMiltstoneBubble::Timer", (MTimerHandler.CallBack) new C66830a(this), true);

    /* renamed from: zi1.b$a */
    public static final class C66830a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C66829b f191953d;

        public C66830a(C66829b bVar) {
            this.f191953d = bVar;
        }

        public final boolean onTimerExpired() {
            C66829b bVar = this.f191953d;
            bVar.getClass();
            C61926c.m72668M(new C66828a(bVar));
            return true;
        }
    }

    public C66829b(LiveRoomControllerStore liveRoomControllerStore, C45795b bVar) {
        C87412m.m108594g(liveRoomControllerStore, "store");
        C87412m.m108594g(bVar, "buContext");
        this.f191948a = liveRoomControllerStore;
        this.f191949b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        r1 = r1.f1651d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90803a(te3.C64622p31 r14) {
        /*
            r13 = this;
            java.lang.Class<cl1.x0> r0 = cl1.C55006x0.class
            java.lang.String r1 = "info"
            gy3.C87412m.m108594g(r14, r1)
            fj1.b r1 = r13.f191949b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.x0 r1 = (cl1.C55006x0) r1
            cl1.x0$b r1 = r1.mo76053e3()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x009b
            fj1.b r1 = r13.f191949b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.x0 r1 = (cl1.C55006x0) r1
            cl1.x0$b r1 = r1.mo76053e3()
            if (r1 == 0) goto L_0x002d
            te3.p31 r1 = r1.f1651d
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r1.f184746d
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            java.lang.String r5 = r14.f184746d
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            if (r1 != 0) goto L_0x0038
            goto L_0x009b
        L_0x0038:
            fj1.b r1 = r13.f191949b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.x0 r1 = (cl1.C55006x0) r1
            cl1.x0$b r1 = r1.mo76053e3()
            if (r1 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r1.f1651d = r14
        L_0x0049:
            fj1.b r1 = r13.f191949b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.x0 r1 = (cl1.C55006x0) r1
            cl1.x0$b r1 = r1.mo76053e3()
            if (r1 == 0) goto L_0x0062
            te3.p31 r1 = r1.f1651d
            if (r1 == 0) goto L_0x0062
            te3.cx2 r1 = r1.f184747e
            if (r1 == 0) goto L_0x0062
            int r1 = r1.f182599g
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            fj1.b r5 = r13.f191949b
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.x0 r5 = (cl1.C55006x0) r5
            cl1.x0$b r5 = r5.mo76053e3()
            if (r5 == 0) goto L_0x0074
            int r5 = r5.f1648a
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r1 != r5) goto L_0x0079
        L_0x0077:
            r5 = 0
            goto L_0x0086
        L_0x0079:
            if (r5 == r3) goto L_0x0085
            r6 = 2
            if (r5 == r6) goto L_0x007f
            goto L_0x0077
        L_0x007f:
            r5 = 3
            if (r1 == r5) goto L_0x0085
            r5 = 4
            if (r1 != r5) goto L_0x0077
        L_0x0085:
            r5 = 1
        L_0x0086:
            if (r5 == 0) goto L_0x0099
            fj1.b r6 = r13.f191949b
            androidx.lifecycle.i0 r6 = r6.mo71262a(r0)
            cl1.x0 r6 = (cl1.C55006x0) r6
            cl1.x0$b r6 = r6.mo76053e3()
            if (r6 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r6.f1648a = r1
        L_0x0099:
            r1 = 0
            goto L_0x00c4
        L_0x009b:
            fj1.b r1 = r13.f191949b
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.x0 r1 = (cl1.C55006x0) r1
            cl1.x0$b r12 = new cl1.x0$b
            te3.cx2 r5 = r14.f184747e
            if (r5 == 0) goto L_0x00ac
            int r6 = r5.f182599g
            goto L_0x00ad
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            if (r5 == 0) goto L_0x00b3
            int r5 = r5.f182598f
            r7 = r5
            goto L_0x00b4
        L_0x00b3:
            r7 = 0
        L_0x00b4:
            r8 = 0
            r10 = 4
            r11 = 0
            r5 = r12
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            monitor-enter(r1)
            r1.f154455j = r12     // Catch:{ all -> 0x01bc }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01bc }
            monitor-exit(r1)
            r1 = 1
            r5 = 1
        L_0x00c4:
            bj1.a r6 = bj1.C28329a.f77951a
            java.lang.String r7 = r14.f184746d
            if (r7 != 0) goto L_0x00cc
            java.lang.String r7 = ""
        L_0x00cc:
            boolean r6 = r6.mo55921a(r7)
            int r7 = r14.f184749g
            boolean r7 = o40.C61926c.m72696u(r7, r3)
            if (r7 == 0) goto L_0x00dc
            if (r6 == 0) goto L_0x00dc
            r7 = 1
            goto L_0x00dd
        L_0x00dc:
            r7 = 0
        L_0x00dd:
            java.lang.String r8 = "MilestoneDistractManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "bindCurLotteryInfo statusChange: "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = " newLottery: "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = " hadOpenLottery: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = " isCardOpenLottery: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = "  ext_flag: "
            r9.append(r6)
            int r6 = r14.f184749g
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            fj1.b r6 = r13.f191949b
            androidx.lifecycle.i0 r0 = r6.mo71262a(r0)
            cl1.x0 r0 = (cl1.C55006x0) r0
            cl1.x0$b r0 = r0.mo76053e3()
            if (r0 == 0) goto L_0x0128
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r6 = r13.f191948a
            hh1.C8530f.m8426a(r6, r0, r5, r1, r7)
        L_0x0128:
            if (r5 == 0) goto L_0x01bb
            java.lang.String r0 = "startTimer"
            r13.mo90804b(r0)
            te3.cx2 r0 = r14.f184747e
            java.lang.String r1 = "MilestoneDistractManager"
            if (r0 == 0) goto L_0x0192
            int r5 = r0.f182599g
            if (r5 != r3) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            if (r3 != 0) goto L_0x013f
            goto L_0x0192
        L_0x013f:
            ok1.e r2 = ok1.C62042e.f176370a
            int r3 = r0.f182596d
            int r4 = r0.f182597e
            int r0 = r0.f182598f
            int r0 = r2.mo87099n0(r3, r4, r0)
            r13.f191950c = r0
            java.lang.String r2 = ""
            if (r0 <= 0) goto L_0x0161
            java.lang.String r0 = r14.f184746d
            if (r0 != 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r2 = r0
        L_0x0157:
            r13.f191951d = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r13.f191952e
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.startTimer(r2)
            goto L_0x0166
        L_0x0161:
            r13.f191951d = r2
            r13.mo90805c(r0)
        L_0x0166:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "startTimer id:"
            r0.append(r2)
            java.lang.String r14 = r14.f184746d
            r0.append(r14)
            java.lang.String r14 = " remainTimeSecond:"
            r0.append(r14)
            int r14 = r13.f191950c
            r0.append(r14)
            java.lang.String r14 = ", timerLotteryId:"
            r0.append(r14)
            java.lang.String r14 = r13.f191951d
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            goto L_0x01bb
        L_0x0192:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "startTimer fail, state: "
            r0.append(r3)
            te3.cx2 r3 = r14.f184747e
            if (r3 == 0) goto L_0x01a7
            int r2 = r3.f182599g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x01a7:
            r0.append(r2)
            java.lang.String r2 = " id:"
            r0.append(r2)
            java.lang.String r14 = r14.f184746d
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
        L_0x01bb:
            return
        L_0x01bc:
            r14 = move-exception
            monitor-exit(r1)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zi1.C66829b.mo90803a(te3.p31):void");
    }

    /* renamed from: b */
    public final void mo90804b(String str) {
        Log.m105924i("MilestoneDistractManager", str + ":endTimer remainTimeSecond:" + this.f191950c + ", timerLotteryId:" + this.f191951d);
        this.f191952e.stopTimer();
    }

    /* renamed from: c */
    public final void mo90805c(int i) {
        Class cls = C55006x0.class;
        mo90804b("onTimerEnd remainTimeSecond: " + i);
        C55006x0.C0697b e3 = ((C55006x0) this.f191949b.mo71262a(cls)).mo76053e3();
        if (e3 != null && e3.f1648a == 1) {
            C55006x0.C0697b e35 = ((C55006x0) this.f191949b.mo71262a(cls)).mo76053e3();
            if (e35 != null) {
                e35.f1648a = 2;
            }
            C55006x0.C0697b e36 = ((C55006x0) this.f191949b.mo71262a(cls)).mo76053e3();
            if (e36 != null) {
                C8530f.m8426a(this.f191948a, e36, true, false, false);
            }
        }
    }
}
