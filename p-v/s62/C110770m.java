package s62;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import mu3.C109639a;

/* renamed from: s62.m */
public class C110770m {

    /* renamed from: a */
    public MMHandler f331341a;

    /* renamed from: b */
    public MMHandler f331342b;

    /* renamed from: c */
    public MMHandler f331343c;

    /* renamed from: d */
    public MMHandler f331344d;

    /* renamed from: e */
    public boolean f331345e;

    /* renamed from: f */
    public long f331346f;

    /* renamed from: g */
    public long f331347g;

    /* renamed from: h */
    public long f331348h;

    /* renamed from: i */
    public C110766j f331349i;

    /* renamed from: j */
    public int f331350j;

    /* renamed from: k */
    public boolean f331351k = false;

    /* renamed from: l */
    public C110774n f331352l;

    /* renamed from: m */
    public boolean f331353m = false;

    /* renamed from: n */
    public C110761a f331354n;

    /* renamed from: o */
    public int f331355o = -1;

    /* renamed from: p */
    public MMHandler.Callback f331356p = new C110771a();

    /* renamed from: q */
    public MMHandler.Callback f331357q = new C110772b();

    /* renamed from: r */
    public MMHandler.Callback f331358r = new C110773c();

    /* renamed from: s62.m$a */
    public class C110771a implements MMHandler.Callback {

        /* renamed from: d */
        public int f331359d = -1;

        /* renamed from: e */
        public int f331360e = -1;

        /* renamed from: f */
        public int f331361f = -1;

        /* renamed from: g */
        public long f331362g = -1;

        public C110771a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
            if (r8.f331361f == r1.f331352l.f331311a) goto L_0x006e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                int r9 = r9.what
                long r0 = r8.f331362g
                r2 = 2
                r3 = 0
                r4 = 1
                r5 = 0
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x002b
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
                r5 = 500(0x1f4, double:2.47E-321)
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x002b
                int r0 = r8.f331359d
                if (r0 != r9) goto L_0x002b
                int r0 = r8.f331360e
                s62.m r1 = s62.C110770m.this
                int r5 = r1.f331350j
                if (r0 != r5) goto L_0x002b
                int r0 = r8.f331361f
                s62.n r1 = r1.f331352l
                int r1 = r1.f331311a
                if (r0 == r1) goto L_0x006e
            L_0x002b:
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                s62.m r1 = s62.C110770m.this
                java.lang.String r1 = r1.mo162322a()
                r0[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                r0[r4] = r1
                s62.m r1 = s62.C110770m.this
                int r1 = r1.f331350j
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r2] = r1
                r1 = 3
                s62.m r5 = s62.C110770m.this
                s62.n r5 = r5.f331352l
                int r5 = r5.f331311a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r1] = r5
                java.lang.String r1 = "MicroMsg.VideoPlayerImpl"
                java.lang.String r5 = "%s inner callback %d %d [%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r8.f331362g = r0
                r8.f331359d = r9
                s62.m r0 = s62.C110770m.this
                int r1 = r0.f331350j
                r8.f331360e = r1
                s62.n r0 = r0.f331352l
                int r0 = r0.f331311a
                r8.f331361f = r0
            L_0x006e:
                r0 = 6
                if (r9 == 0) goto L_0x010d
                if (r9 == r2) goto L_0x00d7
                r1 = 7
                if (r9 == r1) goto L_0x00d1
                r1 = 9
                if (r9 == r1) goto L_0x007c
                goto L_0x0124
            L_0x007c:
                s62.m r9 = s62.C110770m.this
                int r9 = r9.f331350j
                boolean r9 = s62.C110764e.m150717a(r9)
                if (r9 == 0) goto L_0x0087
                return r3
            L_0x0087:
                s62.m r9 = s62.C110770m.this
                int r5 = r9.f331350j
                if (r5 != r0) goto L_0x008f
                r0 = 1
                goto L_0x0090
            L_0x008f:
                r0 = 0
            L_0x0090:
                if (r0 != 0) goto L_0x00c2
                r0 = 5
                if (r5 != r0) goto L_0x0096
                goto L_0x0097
            L_0x0096:
                r4 = 0
            L_0x0097:
                if (r4 == 0) goto L_0x009a
                goto L_0x00c2
            L_0x009a:
                s62.n r9 = r9.f331352l
                int r9 = r9.f331311a
                boolean r9 = s62.C110764e.m150717a(r9)
                s62.m r0 = s62.C110770m.this
                s62.a r0 = r0.f331354n
                if (r0 == 0) goto L_0x00af
                int r0 = r0.f331311a
                boolean r0 = s62.C110764e.m150717a(r0)
                r9 = r9 & r0
            L_0x00af:
                if (r9 == 0) goto L_0x0124
                s62.m r9 = s62.C110770m.this
                r9.mo162325d(r1)
                s62.m r9 = s62.C110770m.this
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r9.f331341a
                android.os.Message r9 = r9.obtainMessage(r2)
                r9.sendToTarget()
                goto L_0x0124
            L_0x00c2:
                r9.mo162325d(r1)
                s62.m r9 = s62.C110770m.this
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r9.f331341a
                android.os.Message r9 = r9.obtainMessage(r2)
                r9.sendToTarget()
                return r3
            L_0x00d1:
                s62.m r9 = s62.C110770m.this
                r9.mo162324c()
                goto L_0x0124
            L_0x00d7:
                s62.m r9 = s62.C110770m.this
                int r0 = r9.f331350j
                if (r0 >= r2) goto L_0x00df
                r0 = 1
                goto L_0x00e0
            L_0x00df:
                r0 = 0
            L_0x00e0:
                if (r0 != 0) goto L_0x00e3
                return r3
            L_0x00e3:
                s62.n r9 = r9.f331352l
                int r9 = r9.f331311a
                if (r9 != r2) goto L_0x00eb
                r9 = 1
                goto L_0x00ec
            L_0x00eb:
                r9 = 0
            L_0x00ec:
                s62.m r0 = s62.C110770m.this
                s62.a r0 = r0.f331354n
                if (r0 == 0) goto L_0x00fa
                int r0 = r0.f331311a
                if (r0 != r2) goto L_0x00f8
                r0 = 1
                goto L_0x00f9
            L_0x00f8:
                r0 = 0
            L_0x00f9:
                r9 = r9 & r0
            L_0x00fa:
                if (r9 == 0) goto L_0x0124
                s62.m r9 = s62.C110770m.this
                r9.mo162325d(r2)
                s62.m r9 = s62.C110770m.this
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r9.f331341a
                android.os.Message r9 = r9.obtainMessage(r4)
                r9.sendToTarget()
                goto L_0x0124
            L_0x010d:
                s62.m r9 = s62.C110770m.this
                boolean r1 = r9.f331351k
                if (r1 == 0) goto L_0x0124
                boolean r1 = r9.f331345e
                if (r1 != 0) goto L_0x011b
                boolean r1 = r9.f331353m
                if (r1 == 0) goto L_0x0124
            L_0x011b:
                com.tencent.mm.sdk.platformtools.MMHandler r9 = r9.f331341a
                android.os.Message r9 = r9.obtainMessage(r0)
                r9.sendToTarget()
            L_0x0124:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: s62.C110770m.C110771a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: s62.m$b */
    public class C110772b implements MMHandler.Callback {
        public C110772b() {
        }

        public boolean handleMessage(Message message) {
            Message message2 = message;
            switch (message2.what) {
                case 1:
                    if (!C110770m.this.f331352l.mo162301m()) {
                        C110770m.this.f331341a.obtainMessage(5, -1, -1).sendToTarget();
                        break;
                    } else {
                        C110770m mVar = C110770m.this;
                        mVar.f331346f = mVar.f331352l.f331321k;
                        mVar.mo162323b(mVar.f331342b, SystemClock.elapsedRealtime(), 0);
                        break;
                    }
                case 2:
                    C110766j jVar = C110770m.this.f331349i;
                    long ticksToNow = Util.ticksToNow(jVar.f331302g);
                    if (jVar.f331302g > 0 && ticksToNow >= 30) {
                        Log.m105929w("MicroMsg.PlayTimeLine", "%s do some work delay 30ms!!![%d, %d]", jVar.mo162289c(), Long.valueOf(jVar.f331302g), Long.valueOf(ticksToNow));
                        jVar.f331303h = 0;
                    }
                    if (!C110764e.m150717a(C110770m.this.f331352l.f331311a)) {
                        if (!(C110770m.this.f331352l.f331311a == -1)) {
                            C110770m mVar2 = C110770m.this;
                            int c = mVar2.f331352l.mo162294c(mVar2.f331348h, mVar2.f331347g);
                            if (c == 2) {
                                C110770m.this.f331344d.obtainMessage(2).sendToTarget();
                            }
                            if (!(c == 7)) {
                                if (!(c == 10)) {
                                    C110770m mVar3 = C110770m.this;
                                    int i = mVar3.f331350j;
                                    if (i == 3) {
                                        mVar3.mo162323b(mVar3.f331342b, SystemClock.elapsedRealtime(), C110770m.this.f331349i.f331303h);
                                    } else if (i == 5) {
                                        mVar3.mo162323b(mVar3.f331342b, SystemClock.elapsedRealtime(), 0);
                                    } else if (i == 1) {
                                        mVar3.mo162323b(mVar3.f331342b, SystemClock.elapsedRealtime(), 0);
                                    } else if (i == 0) {
                                        mVar3.mo162323b(mVar3.f331342b, SystemClock.elapsedRealtime(), 0);
                                    } else if (i == 6) {
                                        mVar3.mo162323b(mVar3.f331342b, SystemClock.elapsedRealtime(), 0);
                                    } else {
                                        mVar3.f331342b.removeMessages(2);
                                    }
                                    C110770m.this.f331349i.f331302g = Util.currentTicks();
                                    break;
                                } else {
                                    C110770m mVar4 = C110770m.this;
                                    mVar4.mo162323b(mVar4.f331342b, SystemClock.elapsedRealtime(), 0);
                                    C110770m.this.f331349i.f331302g = Util.currentTicks();
                                    break;
                                }
                            } else {
                                C110770m.this.f331344d.obtainMessage(7).sendToTarget();
                                C110770m.this.f331342b.removeMessages(2);
                                break;
                            }
                        } else {
                            C110770m.this.f331341a.obtainMessage(-1, -1, -1).sendToTarget();
                            C110770m.this.f331342b.removeMessages(2);
                            break;
                        }
                    } else {
                        C110770m.this.f331344d.obtainMessage(9).sendToTarget();
                        C110770m.this.f331342b.removeMessages(2);
                        break;
                    }
                case 3:
                    C110770m.this.mo162326e(3);
                    C110774n nVar = C110770m.this.f331352l;
                    Log.m105925i("MicroMsg.TrackDataSource", "%s start to play", nVar.mo162299i());
                    nVar.f331316f = false;
                    nVar.mo162306t(3);
                    C110770m mVar5 = C110770m.this;
                    mVar5.mo162323b(mVar5.f331342b, SystemClock.elapsedRealtime(), 0);
                    break;
                case 4:
                    C110770m.this.mo162326e(4);
                    C110770m mVar6 = C110770m.this;
                    mVar6.mo162323b(mVar6.f331342b, SystemClock.elapsedRealtime(), 0);
                    C110770m.this.f331352l.mo162300l();
                    break;
                case 5:
                    Object obj = message2.obj;
                    if (!(obj instanceof int[])) {
                        Log.m105920e("MicroMsg.VideoPlayerImpl", "seek data type error");
                        break;
                    } else {
                        int[] iArr = (int[]) obj;
                        if (iArr.length != 2) {
                            Log.m105920e("MicroMsg.VideoPlayerImpl", "seek data length error");
                            break;
                        } else {
                            int i2 = iArr[0];
                            boolean z = iArr[1] == 1;
                            long s = C110770m.this.f331352l.mo162305s(i2);
                            boolean z2 = z && s >= 0 && s < ((long) i2);
                            Log.m105925i("MicroMsg.VideoPlayerImpl", "%s can seek precision[%b] after seek [%d, %d]", C110770m.this.mo162322a(), Boolean.valueOf(z2), Long.valueOf(s), Integer.valueOf(i2));
                            C110770m.this.f331352l.mo162306t(6);
                            C110770m.this.mo162325d(6);
                            if (z2) {
                                C110770m.this.f331349i.f331298c = (long) i2;
                            } else {
                                C110770m.this.f331349i.f331298c = s;
                            }
                            C110770m.this.mo162326e(6);
                            C110770m mVar7 = C110770m.this;
                            mVar7.mo162323b(mVar7.f331342b, SystemClock.elapsedRealtime(), 0);
                            break;
                        }
                    }
                    break;
                case 7:
                    C110770m.this.f331352l.mo162282o();
                    C110770m mVar8 = C110770m.this;
                    mVar8.f331351k = true;
                    mVar8.f331344d.obtainMessage(0).sendToTarget();
                    break;
                case 8:
                    C110770m.this.f331352l.mo162297f();
                    break;
            }
            return false;
        }
    }

    /* renamed from: s62.m$c */
    public class C110773c implements MMHandler.Callback {
        public C110773c() {
        }

        public boolean handleMessage(Message message) {
            C110770m mVar = C110770m.this;
            C110761a aVar = mVar.f331354n;
            if (aVar == null) {
                return false;
            }
            int i = message.what;
            if (i == 1) {
                if (!aVar.mo162301m()) {
                    Log.m105925i("MicroMsg.VideoPlayerImpl", "%s audio track prepare error, release now.", C110770m.this.mo162322a());
                    C110770m.this.f331354n.mo162282o();
                    C110770m mVar2 = C110770m.this;
                    mVar2.f331353m = true;
                    mVar2.f331354n = null;
                }
                C110770m mVar3 = C110770m.this;
                mVar3.mo162323b(mVar3.f331343c, SystemClock.elapsedRealtime(), 0);
            } else if (i != 2) {
                if (i == 3) {
                    Log.m105925i("MicroMsg.TrackDataSource", "%s start to play", aVar.mo162299i());
                    aVar.f331316f = false;
                    aVar.mo162306t(3);
                    aVar.mo162285w();
                    C110770m mVar4 = C110770m.this;
                    mVar4.mo162323b(mVar4.f331343c, SystemClock.elapsedRealtime(), 0);
                } else if (i == 4) {
                    mVar.mo162323b(mVar.f331343c, SystemClock.elapsedRealtime(), 0);
                    C110770m.this.f331354n.mo162300l();
                } else if (i == 7) {
                    aVar.mo162282o();
                    C110770m mVar5 = C110770m.this;
                    mVar5.f331353m = true;
                    mVar5.f331344d.obtainMessage(0).sendToTarget();
                }
            } else if (C110764e.m150717a(aVar.f331311a)) {
                C110770m.this.f331344d.obtainMessage(9).sendToTarget();
                C110770m.this.f331343c.removeMessages(2);
            } else {
                if (C110770m.this.f331354n.f331311a == -1) {
                    C110770m.this.f331341a.obtainMessage(-1, -1, -1).sendToTarget();
                    C110770m.this.f331342b.removeMessages(2);
                } else {
                    C110770m mVar6 = C110770m.this;
                    if (mVar6.f331354n.mo162294c(mVar6.f331348h, mVar6.f331347g) == 2) {
                        MMHandler mMHandler = C110770m.this.f331344d;
                        mMHandler.sendMessageDelayed(mMHandler.obtainMessage(2), 10);
                    }
                    C110770m mVar7 = C110770m.this;
                    int i2 = mVar7.f331350j;
                    if (i2 == 3) {
                        mVar7.mo162323b(mVar7.f331343c, SystemClock.elapsedRealtime(), C110770m.this.f331349i.f331303h);
                    } else if (i2 == 5) {
                        mVar7.mo162323b(mVar7.f331343c, SystemClock.elapsedRealtime(), 0);
                    } else if (i2 == 1) {
                        mVar7.mo162323b(mVar7.f331343c, SystemClock.elapsedRealtime(), 0);
                    } else if (i2 == 0) {
                        mVar7.mo162323b(mVar7.f331343c, SystemClock.elapsedRealtime(), 0);
                    } else {
                        mVar7.f331343c.removeMessages(2);
                    }
                }
            }
            return false;
        }
    }

    public C110770m(MMHandler mMHandler, C109639a aVar, Looper looper, Looper looper2, boolean z, int i) {
        this.f331341a = mMHandler;
        this.f331345e = z;
        this.f331349i = new C110766j(z, i);
        MMHandler mMHandler2 = new MMHandler(aVar, this.f331356p);
        this.f331344d = mMHandler2;
        mMHandler2.setLogging(false);
        this.f331352l = new C110774n(this.f331349i, this.f331341a);
        this.f331342b = new MMHandler(looper, this.f331357q);
        if (looper2 != null) {
            this.f331354n = new C110761a(this.f331349i, this.f331341a);
            MMHandler mMHandler3 = new MMHandler(looper2, this.f331358r);
            this.f331343c = mMHandler3;
            mMHandler3.setLogging(false);
        }
    }

    /* renamed from: a */
    public String mo162322a() {
        return this.f331349i.mo162289c() + "_" + Process.myTid();
    }

    /* renamed from: b */
    public final void mo162323b(MMHandler mMHandler, long j, long j2) {
        if (C110764e.m150717a(this.f331350j)) {
            Log.m105929w("MicroMsg.VideoPlayerImpl", "isEnd state=%s", Integer.valueOf(this.f331350j));
        } else if (mMHandler.isQuit()) {
            Log.m105928w("MicroMsg.VideoPlayerImpl", "handler has quit");
        } else {
            mMHandler.removeMessages(2);
            long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
            if (elapsedRealtime <= 0) {
                mMHandler.sendEmptyMessage(2);
            } else {
                mMHandler.sendEmptyMessageDelayed(2, elapsedRealtime);
            }
        }
    }

    /* renamed from: c */
    public final void mo162324c() {
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s seek done", mo162322a());
        this.f331352l.mo162306t(5);
        C110761a aVar = this.f331354n;
        if (aVar != null) {
            aVar.mo162297f();
            C110766j jVar = this.f331349i;
            jVar.f331301f = this.f331354n.mo162305s((int) jVar.f331298c);
            this.f331354n.mo162306t(5);
        }
        mo162326e(7);
        mo162325d(4);
        this.f331341a.obtainMessage(3, 0, 0).sendToTarget();
        C110766j jVar2 = this.f331349i;
        jVar2.f331300e = jVar2.f331298c * 1000;
        jVar2.f331298c = -1;
    }

    /* renamed from: d */
    public void mo162325d(int i) {
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d", mo162322a(), Integer.valueOf(this.f331350j), Integer.valueOf(i));
        this.f331350j = i;
        this.f331349i.f331302g = 0;
    }

    /* renamed from: e */
    public final void mo162326e(int i) {
        int i2 = i;
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", mo162322a(), Integer.valueOf(i), Long.valueOf(this.f331349i.f331296a), Long.valueOf(this.f331349i.f331297b), Long.valueOf(this.f331349i.f331299d));
        if (i2 == 3) {
            C110766j jVar = this.f331349i;
            long j = jVar.f331297b;
            if (j > 0) {
                jVar.f331299d += j - jVar.f331296a;
                jVar.f331297b = 0;
            }
            jVar.f331296a = SystemClock.elapsedRealtime();
        } else if (i2 == 4) {
            C110766j jVar2 = this.f331349i;
            if (jVar2.f331296a <= 0) {
                jVar2.f331297b = 0;
            } else {
                jVar2.f331297b = SystemClock.elapsedRealtime();
            }
        } else if (i2 == 5) {
            C110766j jVar3 = this.f331349i;
            jVar3.f331299d = jVar3.f331298c;
            jVar3.f331296a = SystemClock.elapsedRealtime();
            C110766j jVar4 = this.f331349i;
            jVar4.f331297b = 0;
            jVar4.f331301f = 0;
            jVar4.f331300e = 0;
        } else if (i2 == 6) {
            C110766j jVar5 = this.f331349i;
            jVar5.f331299d = jVar5.f331298c;
            jVar5.f331297b = 0;
            jVar5.f331296a = 0;
            jVar5.f331301f = 0;
            jVar5.f331300e = 0;
        } else if (i2 == 7) {
            C110766j jVar6 = this.f331349i;
            jVar6.f331299d = jVar6.f331298c;
            jVar6.f331297b = 0;
            jVar6.f331296a = 0;
        }
        C110766j jVar7 = this.f331349i;
        this.f331347g = jVar7.f331296a;
        this.f331348h = jVar7.f331299d;
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", mo162322a(), Integer.valueOf(i), Long.valueOf(this.f331347g), Long.valueOf(this.f331348h));
    }
}
