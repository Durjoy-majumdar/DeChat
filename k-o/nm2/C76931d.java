package nm2;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import te3.C77949j3;
import te3.C77952jg2;

/* renamed from: nm2.d */
public final class C76931d {

    /* renamed from: a */
    public C77952jg2 f224820a;

    /* renamed from: b */
    public int f224821b;

    /* renamed from: c */
    public final LinkedList<C77949j3> f224822c = new LinkedList<>();

    /* renamed from: d */
    public final HashMap<Long, C72963f4> f224823d = new HashMap<>();

    /* renamed from: e */
    public long f224824e;

    /* renamed from: f */
    public long f224825f;

    /* renamed from: g */
    public MTimerHandler f224826g = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C76932a(this), true);

    /* renamed from: h */
    public long f224827h;

    /* renamed from: nm2.d$a */
    public static final class C76932a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C76931d f224828d;

        public C76932a(C76931d dVar) {
            this.f224828d = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x015a  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0304 A[LOOP:0: B:9:0x0040->B:90:0x0304, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0243 A[EDGE_INSN: B:93:0x0243->B:80:0x0243 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTimerExpired() {
            /*
                r27 = this;
                r1 = r27
                java.lang.Class<f62.k0> r2 = f62.C75700k0.class
                boolean r0 = f40.C86709a0.m107522a()
                r3 = 2
                java.lang.String r5 = "MicroMsg.selectRecord.HistoryRecordUnPackMsgLogic"
                r6 = 0
                r7 = 1
                if (r0 == 0) goto L_0x0307
                boolean r0 = f40.C86718e.m107551r()
                if (r0 != 0) goto L_0x0307
                f40.o r0 = f40.C86709a0.m107535s()
                if (r0 == 0) goto L_0x0307
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                if (r0 != 0) goto L_0x0027
                goto L_0x0307
            L_0x0027:
                java.lang.String r0 = "msgInfoStg lockForSync called"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                k40.a r0 = f40.C86709a0.m107533q(r2)
                f62.k0 r0 = (f62.C75700k0) r0
                g62.l r0 = r0.mo96095LE()
                com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
                r0.qy0(r5)
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            L_0x0040:
                nm2.d r0 = r1.f224828d
                int r10 = r0.f224821b
                java.util.LinkedList<te3.j3> r0 = r0.f224822c
                int r0 = r0.size()
                if (r10 < r0) goto L_0x004e
                goto L_0x0243
            L_0x004e:
                nm2.d r0 = r1.f224828d
                java.util.LinkedList<te3.j3> r10 = r0.f224822c
                int r11 = r0.f224821b
                java.lang.Object r10 = r10.get(r11)
                te3.j3 r10 = (te3.C77949j3) r10
                r0.getClass()
                if (r10 != 0) goto L_0x0061
                goto L_0x0201
            L_0x0061:
                boolean r11 = f40.C86709a0.m107522a()
                if (r11 != 0) goto L_0x006e
                java.lang.String r0 = "account storage disabled, discard all commands"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x0201
            L_0x006e:
                int r11 = r10.f227635o
                long r11 = (long) r11
                r13 = 1000(0x3e8, double:4.94E-321)
                long r11 = r11 * r13
                long r13 = r0.f224827h
                r15 = 1
                int r17 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r17 > 0) goto L_0x007f
                long r11 = r13 + r15
            L_0x007f:
                r0.f224827h = r11
                java.lang.String r13 = r10.f227636p
                r24 = -1
                if (r13 == 0) goto L_0x0093
                long r13 = eb0.C75569c4.m90683p(r13)
                int r17 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
                if (r17 != 0) goto L_0x0090
                goto L_0x0093
            L_0x0090:
                r26 = r5
                goto L_0x00ab
            L_0x0093:
                java.lang.String r13 = r10.f227636p
                r26 = r5
                long r4 = r10.f227638r
                nm2.b r14 = nm2.C76928b.f224816a
                long r22 = r14.mo107264b(r10)
                r17 = r13
                r18 = r11
                r20 = r4
                java.lang.String r4 = eb0.C75569c4.m90667M(r17, r18, r20, r22)
                r10.f227636p = r4
            L_0x00ab:
                java.util.HashMap<java.lang.Long, com.tencent.mm.storage.f4> r4 = r0.f224823d
                long r13 = r10.f227638r
                java.lang.Long r5 = java.lang.Long.valueOf(r13)
                boolean r4 = r4.containsKey(r5)
                if (r4 != 0) goto L_0x00d1
                k40.a r4 = f40.C86709a0.m107533q(r2)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.l r4 = r4.mo96095LE()
                long r13 = r10.f227638r
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                boolean r4 = r4.py0(r13)
                if (r4 == 0) goto L_0x00ce
                goto L_0x00d1
            L_0x00ce:
                r5 = r26
                goto L_0x010f
            L_0x00d1:
                long r4 = r10.f227638r
                java.lang.String r13 = r10.f227636p
                if (r13 == 0) goto L_0x00f3
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r14 != 0) goto L_0x00f3
                r14 = 0
                java.lang.String r15 = "msgsource"
                java.util.Map r13 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r15, r14)
                if (r13 == 0) goto L_0x00f3
                java.lang.String r14 = ".msgsource.share_msg.newsvrid"
                java.lang.Object r13 = r13.get(r14)
                java.lang.String r13 = (java.lang.String) r13
                long r24 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r13)
            L_0x00f3:
                r13 = r24
                r10.f227638r = r13
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r13[r6] = r4
                long r4 = r10.f227638r
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r13[r7] = r4
                java.lang.String r4 = "srvId exist oldSrvId:%s newSrvId:%s"
                r5 = r26
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r13)
            L_0x010f:
                long r13 = r0.f224825f
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 > 0) goto L_0x0132
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r4[r6] = r11
                long r11 = r0.f224825f
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r4[r7] = r11
                java.lang.String r11 = "doCmd() case 1 fixTime:%s, msgMinCreateTime:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r11, r4)
                long r11 = r0.f224825f
                r13 = 1
                long r11 = r11 + r13
                r0.f224825f = r11
                goto L_0x0154
            L_0x0132:
                long r13 = r0.f224824e
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 < 0) goto L_0x0154
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r4[r6] = r11
                long r11 = r0.f224825f
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r4[r7] = r11
                java.lang.String r11 = "doCmd() case 2 fixTime:%s, msgMinCreateTime:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r11, r4)
                long r11 = r0.f224824e
                r13 = 1
                long r11 = r11 - r13
                r0.f224824e = r11
            L_0x0154:
                int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
                if (r0 > r7) goto L_0x0174
                r4 = 3
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r0[r6] = r4
                long r14 = r10.f227638r
                java.lang.Long r13 = java.lang.Long.valueOf(r14)
                r0[r7] = r13
                te3.rv3 r13 = r10.f227631h
                r0[r3] = r13
                java.lang.String r13 = "doCmd() after fix fixTime:%s SrvId:%S content:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r13, r0)
            L_0x0174:
                te3.rv3 r0 = r10.f227629f
                java.lang.String r0 = r0.f141175d
                java.lang.String r13 = eb0.C75592q0.m90789s()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r13)
                if (r0 == 0) goto L_0x01ea
                te3.rv3 r0 = r10.f227629f
                te3.rv3 r13 = r10.f227628e
                r10.f227629f = r13
                r10.f227628e = r0
                te3.rv3 r0 = r10.f227631h
                if (r0 == 0) goto L_0x01ea
                java.lang.String r0 = r0.f141175d
                if (r0 == 0) goto L_0x01ea
                int r13 = eb0.C75604z3.m90848t(r0)
                r14 = -1
                if (r13 == r14) goto L_0x01ea
                te3.rv3 r14 = new te3.rv3
                r14.<init>()
                int r13 = r13 + 1
                java.lang.String r0 = r0.substring(r13)
                java.lang.String r13 = "this as java.lang.String).substring(startIndex)"
                gy3.C87412m.m108593f(r0, r13)
                int r13 = r0.length()
                int r13 = r13 - r7
                r15 = 0
                r16 = 0
            L_0x01b2:
                if (r15 > r13) goto L_0x01da
                if (r16 != 0) goto L_0x01b8
                r4 = r15
                goto L_0x01b9
            L_0x01b8:
                r4 = r13
            L_0x01b9:
                char r4 = r0.charAt(r4)
                r3 = 32
                int r3 = gy3.C87412m.m108596i(r4, r3)
                if (r3 > 0) goto L_0x01c7
                r3 = 1
                goto L_0x01c8
            L_0x01c7:
                r3 = 0
            L_0x01c8:
                if (r16 != 0) goto L_0x01d3
                if (r3 != 0) goto L_0x01d0
                r3 = 2
                r16 = 1
                goto L_0x01b2
            L_0x01d0:
                int r15 = r15 + 1
                goto L_0x01d8
            L_0x01d3:
                if (r3 != 0) goto L_0x01d6
                goto L_0x01da
            L_0x01d6:
                int r13 = r13 + -1
            L_0x01d8:
                r3 = 2
                goto L_0x01b2
            L_0x01da:
                int r13 = r13 + 1
                java.lang.CharSequence r0 = r0.subSequence(r15, r13)
                java.lang.String r0 = r0.toString()
                r14.f141175d = r0
                r14.f141176e = r7
                r10.f227631h = r14
            L_0x01ea:
                ob0.m$a r0 = new ob0.m$a     // Catch:{ Exception -> 0x01f9 }
                r0.<init>((te3.C77949j3) r10, (boolean) r7, (long) r11)     // Catch:{ Exception -> 0x01f9 }
                com.tencent.mm.plugin.messenger.foundation.a0$b r3 = new com.tencent.mm.plugin.messenger.foundation.a0$b     // Catch:{ Exception -> 0x01f9 }
                r3.<init>()     // Catch:{ Exception -> 0x01f9 }
                com.tencent.p014mm.plugin.messenger.foundation.C69841o.m82292b(r0, r3)     // Catch:{ Exception -> 0x01f9 }
                r0 = 1
                goto L_0x0202
            L_0x01f9:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r6]
                java.lang.String r4 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r3)
            L_0x0201:
                r0 = 0
            L_0x0202:
                nm2.d r3 = r1.f224828d
                int r4 = r3.f224821b
                int r4 = r4 + r7
                r3.f224821b = r4
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r8)
                r10 = 4
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Long r11 = java.lang.Long.valueOf(r3)
                r10[r6] = r11
                nm2.d r11 = r1.f224828d
                java.util.LinkedList<te3.j3> r11 = r11.f224822c
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r7] = r11
                nm2.d r11 = r1.f224828d
                int r11 = r11.f224821b
                int r11 = r11 - r7
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r12 = 2
                r10[r12] = r11
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r11 = 3
                r10[r11] = r0
                java.lang.String r0 = "time:%s size:%s index:%s, ret:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r10)
                r10 = 500(0x1f4, double:2.47E-321)
                int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r0 < 0) goto L_0x0304
            L_0x0243:
                k40.a r0 = f40.C86709a0.m107533q(r2)
                f62.k0 r0 = (f62.C75700k0) r0
                g62.l r0 = r0.mo96095LE()
                com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
                r0.wy0(r5)
                java.lang.String r0 = "msgInfoStg unlockForSync called"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                nm2.d r0 = r1.f224828d
                int r3 = r0.f224821b
                java.util.LinkedList<te3.j3> r0 = r0.f224822c
                int r0 = r0.size()
                if (r3 >= r0) goto L_0x0292
                r3 = 3
                java.lang.Object[] r0 = new java.lang.Object[r3]
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r8)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0[r6] = r2
                nm2.d r2 = r1.f224828d
                java.util.LinkedList<te3.j3> r2 = r2.f224822c
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r7] = r2
                nm2.d r2 = r1.f224828d
                int r2 = r2.f224821b
                int r2 = r2 - r7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 2
                r0[r3] = r2
                java.lang.String r2 = "time:%s size:%s index:%s Shold Continue."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
                return r7
            L_0x0292:
                te3.bs r0 = new te3.bs
                r0.<init>()
                nm2.d r3 = r1.f224828d
                java.util.LinkedList<te3.j3> r3 = r3.f224822c
                java.util.Iterator r3 = r3.iterator()
            L_0x029f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x02b7
                java.lang.Object r4 = r3.next()
                te3.j3 r4 = (te3.C77949j3) r4
                java.util.LinkedList<java.lang.Long> r7 = r0.f131282d
                long r8 = r4.f227638r
                java.lang.Long r4 = java.lang.Long.valueOf(r8)
                r7.add(r4)
                goto L_0x029f
            L_0x02b7:
                k40.a r3 = f40.C86709a0.m107533q(r2)
                f62.k0 r3 = (f62.C75700k0) r3
                g62.l r3 = r3.mo96095LE()
                nm2.d r4 = r1.f224828d
                te3.jg2 r4 = r4.f224820a
                long r7 = r4.f227664d
                com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
                com.tencent.mm.storage.f4 r3 = r3.b00(r7)
                int r4 = r3.f230723F
                r7 = 262144(0x40000, float:3.67342E-40)
                r4 = r4 | r7
                r3.mo108743W2(r4)
                k40.a r2 = f40.C86709a0.m107533q(r2)
                f62.k0 r2 = (f62.C75700k0) r2
                g62.l r2 = r2.mo96095LE()
                long r7 = r3.getMsgId()
                com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
                r2.xy0(r7, r3)
                java.lang.Class<km2.b> r2 = km2.C33939b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                km2.b r2 = (km2.C33939b) r2
                pm2.b r2 = r2.vx0()
                nm2.d r3 = r1.f224828d
                te3.jg2 r3 = r3.f224820a
                java.lang.String r3 = r3.f227669i
                r2.mo60317Ow(r3, r0)
                java.lang.String r0 = "should finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                return r6
            L_0x0304:
                r3 = 2
                goto L_0x0040
            L_0x0307:
                r2 = 3
                java.lang.Object[] r0 = new java.lang.Object[r2]
                boolean r2 = f40.C86709a0.m107522a()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r6] = r2
                boolean r2 = f40.C86718e.m107551r()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r7] = r2
                f40.o r2 = f40.C86709a0.m107535s()
                r3 = 2
                r0[r3] = r2
                java.lang.String r2 = "accready:%s hold:%s accstg:%s "
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nm2.C76931d.C76932a.onTimerExpired():boolean");
        }
    }

    public C76931d(C77952jg2 jg22) {
        C87412m.m108594g(jg22, DownloadInfoTable.TABLE_NAME);
        this.f224820a = jg22;
    }
}
