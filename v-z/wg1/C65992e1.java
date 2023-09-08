package wg1;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.InetUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import ej0.C58606a;
import ej0.C58608e;
import ej0.C86525c;
import ej0.C86530d;
import fj0.C86883l;
import fj0.C86898q;
import fj1.C45795b;
import gy3.C87412m;
import ij0.C87742a;
import p225rc.C89921j;

/* renamed from: wg1.e1 */
public final class C65992e1 implements C65986c1, C58606a.C58607a {

    /* renamed from: d */
    public final C45795b f189731d;

    /* renamed from: e */
    public final C58124b f189732e;

    /* renamed from: f */
    public final String f189733f = "Finder.FinderLiveCastScreenPresenter";

    /* renamed from: g */
    public final int f189734g = 7;

    /* renamed from: h */
    public final int f189735h = 10;

    /* renamed from: i */
    public int f189736i;

    /* renamed from: j */
    public C65989d1 f189737j;

    /* renamed from: n */
    public MMHandler f189738n = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C65994b(this));

    /* renamed from: o */
    public C86525c f189739o;

    /* renamed from: p */
    public final C86530d f189740p = new C65995c(this);

    /* renamed from: q */
    public final MTimerHandler f189741q = new MTimerHandler("finder_live_device_search", (MTimerHandler.CallBack) new C65993a(this), true);

    /* renamed from: wg1.e1$a */
    public static final class C65993a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C65992e1 f189742d;

        public C65993a(C65992e1 e1Var) {
            this.f189742d = e1Var;
        }

        public final boolean onTimerExpired() {
            String str = this.f189742d.f189733f;
            Log.m105924i(str, "search device times:" + this.f189742d.f189736i);
            C65992e1 e1Var = this.f189742d;
            int i = e1Var.f189736i;
            boolean z = false;
            if (i >= e1Var.f189735h) {
                e1Var.f189736i = 0;
                C65989d1 d1Var = e1Var.f189737j;
                if (d1Var == null) {
                    return false;
                }
                d1Var.mo90024L();
                return false;
            }
            e1Var.f189736i = i + 1;
            String a = C89921j.m112462a();
            String b = C89921j.m112463b(MMApplicationContext.getContext());
            int i2 = C86898q.f252215h;
            C86898q qVar = C86898q.C59104e.f169066a;
            if (InetUtil.isIPv6Address(a) && InetUtil.isIPv6Address(b)) {
                z = true;
            }
            qVar.mo121350f(z);
            return true;
        }
    }

    /* renamed from: wg1.e1$b */
    public static final class C65994b implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C65992e1 f189743d;

        public C65994b(C65992e1 e1Var) {
            this.f189743d = e1Var;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            int i = message.what;
            C65992e1 e1Var = this.f189743d;
            if (i != e1Var.f189734g) {
                return true;
            }
            C86525c cVar = e1Var.f189739o;
            if (cVar != null) {
                cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
            }
            if (cVar != null) {
                cVar.mo121007h();
            }
            C86525c cVar2 = this.f189743d.f189739o;
            if (cVar2 != null) {
                cVar2.mo121008i();
            }
            C65992e1 e1Var2 = this.f189743d;
            C86525c cVar3 = e1Var2.f189739o;
            if (cVar3 != null) {
                cVar3.f251389h = null;
            }
            C65989d1 d1Var = e1Var2.f189737j;
            if (d1Var == null) {
                return true;
            }
            d1Var.mo90029e0(message.arg1);
            return true;
        }
    }

    /* renamed from: wg1.e1$c */
    public static final class C65995c implements C86530d {

        /* renamed from: a */
        public final /* synthetic */ C65992e1 f189744a;

        public C65995c(C65992e1 e1Var) {
            this.f189744a = e1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
            r2 = r5.f251382a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80108a(ej0.C86525c r5, boolean r6) {
            /*
                r4 = this;
                wg1.e1 r0 = r4.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onMute mute:"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = " device["
                r1.append(r6)
                r6 = 0
                if (r5 == 0) goto L_0x0020
                ej0.b r2 = r5.f251382a
                if (r2 == 0) goto L_0x0020
                java.lang.String r2 = r2.f251378g
                goto L_0x0021
            L_0x0020:
                r2 = r6
            L_0x0021:
                r1.append(r2)
                r2 = 44
                r1.append(r2)
                if (r5 == 0) goto L_0x0032
                ej0.b r3 = r5.f251382a
                if (r3 == 0) goto L_0x0032
                java.lang.String r3 = r3.f251380i
                goto L_0x0033
            L_0x0032:
                r3 = r6
            L_0x0033:
                r1.append(r3)
                java.lang.String r3 = "] selectedDevice["
                r1.append(r3)
                wg1.e1 r3 = r4.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0048
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = r3.f251378g
                goto L_0x0049
            L_0x0048:
                r3 = r6
            L_0x0049:
                r1.append(r3)
                r1.append(r2)
                wg1.e1 r2 = r4.f189744a
                ej0.c r2 = r2.f189739o
                if (r2 == 0) goto L_0x005b
                ej0.b r2 = r2.f251382a
                if (r2 == 0) goto L_0x005b
                java.lang.String r6 = r2.f251380i
            L_0x005b:
                r1.append(r6)
                r6 = 93
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                wg1.e1 r6 = r4.f189744a
                ej0.c r6 = r6.f189739o
                gy3.C87412m.m108589b(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80108a(ej0.c, boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            r3 = r6.f251382a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80109b(ej0.C86525c r6) {
            /*
                r5 = this;
                wg1.e1 r0 = r5.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPlay device["
                r1.append(r2)
                r2 = 0
                if (r6 == 0) goto L_0x0018
                ej0.b r3 = r6.f251382a
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = r3.f251378g
                goto L_0x0019
            L_0x0018:
                r3 = r2
            L_0x0019:
                r1.append(r3)
                r3 = 44
                r1.append(r3)
                if (r6 == 0) goto L_0x002a
                ej0.b r4 = r6.f251382a
                if (r4 == 0) goto L_0x002a
                java.lang.String r4 = r4.f251380i
                goto L_0x002b
            L_0x002a:
                r4 = r2
            L_0x002b:
                r1.append(r4)
                java.lang.String r4 = "] selectedDevice["
                r1.append(r4)
                wg1.e1 r4 = r5.f189744a
                ej0.c r4 = r4.f189739o
                if (r4 == 0) goto L_0x0040
                ej0.b r4 = r4.f251382a
                if (r4 == 0) goto L_0x0040
                java.lang.String r4 = r4.f251378g
                goto L_0x0041
            L_0x0040:
                r4 = r2
            L_0x0041:
                r1.append(r4)
                r1.append(r3)
                wg1.e1 r3 = r5.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0053
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0053
                java.lang.String r2 = r3.f251380i
            L_0x0053:
                r1.append(r2)
                r2 = 93
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                wg1.e1 r0 = r5.f189744a
                ej0.c r0 = r0.f189739o
                gy3.C87412m.m108589b(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80109b(ej0.c):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            r3 = r6.f251382a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80110c(ej0.C86525c r6) {
            /*
                r5 = this;
                wg1.e1 r0 = r5.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPause device["
                r1.append(r2)
                r2 = 0
                if (r6 == 0) goto L_0x0018
                ej0.b r3 = r6.f251382a
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = r3.f251378g
                goto L_0x0019
            L_0x0018:
                r3 = r2
            L_0x0019:
                r1.append(r3)
                r3 = 44
                r1.append(r3)
                if (r6 == 0) goto L_0x002a
                ej0.b r4 = r6.f251382a
                if (r4 == 0) goto L_0x002a
                java.lang.String r4 = r4.f251380i
                goto L_0x002b
            L_0x002a:
                r4 = r2
            L_0x002b:
                r1.append(r4)
                java.lang.String r4 = "] selectedDevice["
                r1.append(r4)
                wg1.e1 r4 = r5.f189744a
                ej0.c r4 = r4.f189739o
                if (r4 == 0) goto L_0x0040
                ej0.b r4 = r4.f251382a
                if (r4 == 0) goto L_0x0040
                java.lang.String r4 = r4.f251378g
                goto L_0x0041
            L_0x0040:
                r4 = r2
            L_0x0041:
                r1.append(r4)
                r1.append(r3)
                wg1.e1 r3 = r5.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0053
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0053
                java.lang.String r2 = r3.f251380i
            L_0x0053:
                r1.append(r2)
                r2 = 93
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                wg1.e1 r0 = r5.f189744a
                ej0.c r0 = r0.f189739o
                gy3.C87412m.m108589b(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80110c(ej0.c):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            r3 = r6.f251382a;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80111d(ej0.C86525c r6) {
            /*
                r5 = this;
                wg1.e1 r0 = r5.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onStop device["
                r1.append(r2)
                r2 = 0
                if (r6 == 0) goto L_0x0018
                ej0.b r3 = r6.f251382a
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = r3.f251378g
                goto L_0x0019
            L_0x0018:
                r3 = r2
            L_0x0019:
                r1.append(r3)
                r3 = 44
                r1.append(r3)
                if (r6 == 0) goto L_0x002a
                ej0.b r4 = r6.f251382a
                if (r4 == 0) goto L_0x002a
                java.lang.String r4 = r4.f251380i
                goto L_0x002b
            L_0x002a:
                r4 = r2
            L_0x002b:
                r1.append(r4)
                java.lang.String r4 = "] selectedDevice["
                r1.append(r4)
                wg1.e1 r4 = r5.f189744a
                ej0.c r4 = r4.f189739o
                if (r4 == 0) goto L_0x0040
                ej0.b r4 = r4.f251382a
                if (r4 == 0) goto L_0x0040
                java.lang.String r4 = r4.f251378g
                goto L_0x0041
            L_0x0040:
                r4 = r2
            L_0x0041:
                r1.append(r4)
                r1.append(r3)
                wg1.e1 r3 = r5.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0054
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0054
                java.lang.String r3 = r3.f251380i
                goto L_0x0055
            L_0x0054:
                r3 = r2
            L_0x0055:
                r1.append(r3)
                r3 = 93
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                wg1.e1 r0 = r5.f189744a
                ej0.c r0 = r0.f189739o
                boolean r6 = gy3.C87412m.m108589b(r6, r0)
                if (r6 == 0) goto L_0x0096
                wg1.e1 r6 = r5.f189744a
                ej0.c r0 = r6.f189739o
                if (r0 != 0) goto L_0x0075
                goto L_0x007b
            L_0x0075:
                ej0.e$a r1 = ej0.C58608e.C58609a.Stopped
                ej0.e r0 = r0.f251386e
                r0.f167798a = r1
            L_0x007b:
                fj1.b r6 = r6.f189731d
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r6 = r6.mo71262a(r0)
                cl1.o r6 = (cl1.C54991o) r6
                r6.f154228M2 = r2
                wg1.e1 r6 = r5.f189744a
                wg1.d1 r0 = r6.f189737j
                if (r0 == 0) goto L_0x0092
                ej0.c r6 = r6.f189739o
                r0.mo90033z0(r6)
            L_0x0092:
                wg1.e1 r6 = r5.f189744a
                r6.f189739o = r2
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80111d(ej0.c):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
            r2 = r5.f251382a;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80112e(ej0.C86525c r5, int r6) {
            /*
                r4 = this;
                wg1.e1 r0 = r4.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onVolume vol:"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = " device["
                r1.append(r6)
                r6 = 0
                if (r5 == 0) goto L_0x0020
                ej0.b r2 = r5.f251382a
                if (r2 == 0) goto L_0x0020
                java.lang.String r2 = r2.f251378g
                goto L_0x0021
            L_0x0020:
                r2 = r6
            L_0x0021:
                r1.append(r2)
                r2 = 44
                r1.append(r2)
                if (r5 == 0) goto L_0x0032
                ej0.b r3 = r5.f251382a
                if (r3 == 0) goto L_0x0032
                java.lang.String r3 = r3.f251380i
                goto L_0x0033
            L_0x0032:
                r3 = r6
            L_0x0033:
                r1.append(r3)
                java.lang.String r3 = "] selectedDevice["
                r1.append(r3)
                wg1.e1 r3 = r4.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0048
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = r3.f251378g
                goto L_0x0049
            L_0x0048:
                r3 = r6
            L_0x0049:
                r1.append(r3)
                r1.append(r2)
                wg1.e1 r2 = r4.f189744a
                ej0.c r2 = r2.f189739o
                if (r2 == 0) goto L_0x005b
                ej0.b r2 = r2.f251382a
                if (r2 == 0) goto L_0x005b
                java.lang.String r6 = r2.f251380i
            L_0x005b:
                r1.append(r6)
                r6 = 93
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                wg1.e1 r6 = r4.f189744a
                ej0.c r6 = r6.f189739o
                gy3.C87412m.m108589b(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80112e(ej0.c, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
            r2 = r5.f251382a;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80113f(ej0.C86525c r5, int r6) {
            /*
                r4 = this;
                wg1.e1 r0 = r4.f189744a
                java.lang.String r0 = r0.f189733f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onProgress progress:"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = " device["
                r1.append(r6)
                r6 = 0
                if (r5 == 0) goto L_0x0020
                ej0.b r2 = r5.f251382a
                if (r2 == 0) goto L_0x0020
                java.lang.String r2 = r2.f251378g
                goto L_0x0021
            L_0x0020:
                r2 = r6
            L_0x0021:
                r1.append(r2)
                r2 = 44
                r1.append(r2)
                if (r5 == 0) goto L_0x0032
                ej0.b r3 = r5.f251382a
                if (r3 == 0) goto L_0x0032
                java.lang.String r3 = r3.f251380i
                goto L_0x0033
            L_0x0032:
                r3 = r6
            L_0x0033:
                r1.append(r3)
                java.lang.String r3 = "] selectedDevice["
                r1.append(r3)
                wg1.e1 r3 = r4.f189744a
                ej0.c r3 = r3.f189739o
                if (r3 == 0) goto L_0x0048
                ej0.b r3 = r3.f251382a
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = r3.f251378g
                goto L_0x0049
            L_0x0048:
                r3 = r6
            L_0x0049:
                r1.append(r3)
                r1.append(r2)
                wg1.e1 r2 = r4.f189744a
                ej0.c r2 = r2.f189739o
                if (r2 == 0) goto L_0x005b
                ej0.b r2 = r2.f251382a
                if (r2 == 0) goto L_0x005b
                java.lang.String r6 = r2.f251380i
            L_0x005b:
                r1.append(r6)
                r6 = 93
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                wg1.e1 r6 = r4.f189744a
                ej0.c r6 = r6.f189739o
                gy3.C87412m.m108589b(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.C65995c.mo80113f(ej0.c, int):void");
        }
    }

    public C65992e1(C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f189731d = bVar;
        this.f189732e = bVar2;
    }

    /* renamed from: K */
    public void mo90018K() {
        String str = this.f189733f;
        Log.m105924i(str, "breakDevice: " + this.f189739o);
        C86525c cVar = this.f189739o;
        if (cVar != null) {
            cVar.mo121003e(new C66013g1(this));
        }
    }

    /* renamed from: V0 */
    public void mo90019V0() {
        this.f189741q.stopTimer();
        this.f189741q.startTimer(0, 3000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = (r0 = r0.f166251b).f166244n;
     */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90020X0(ej0.C86525c r3) {
        /*
            r2 = this;
            fj1.b r0 = r2.f189731d
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.u r0 = (cl1.C55001u) r0
            d50.h r0 = r0.f154421r
            if (r0 == 0) goto L_0x0019
            d50.g r0 = r0.f166251b
            if (r0 == 0) goto L_0x0019
            te3.zp2 r0 = r0.f166244n
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.f186828z
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0025
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x0030
            java.lang.String r3 = r2.f189733f
            java.lang.String r0 = "hlsUrl is nullOrNil!!, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x0030:
            r2.f189739o = r3
            if (r3 == 0) goto L_0x003c
            wg1.f1 r1 = new wg1.f1
            r1.<init>(r2, r0)
            r3.mo121003e(r1)
        L_0x003c:
            java.lang.String r3 = r2.f189733f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "selectDevice: "
            r0.append(r1)
            ej0.c r1 = r2.f189739o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.mo90020X0(ej0.c):void");
    }

    /* renamed from: n */
    public void mo80100n(C86525c cVar) {
        String str = this.f189733f;
        Log.m105924i(str, "onAddDevice " + cVar);
        C65989d1 d1Var = this.f189737j;
        if (d1Var != null) {
            d1Var.mo90030n(cVar);
        }
    }

    public void onAttach(Object obj) {
        C65989d1 d1Var = (C65989d1) obj;
        C87412m.m108594g(d1Var, "callback");
        Log.m105924i(this.f189733f, "onAttach");
        this.f189737j = d1Var;
    }

    public void onDetach() {
        Log.m105924i(this.f189733f, "onDetach");
        mo90022v0();
        this.f189737j = null;
    }

    public void prepare() {
        Log.m105924i(this.f189733f, "prepare");
        try {
            int i = C86898q.f252215h;
            C86898q.C59104e.f169066a.mo121346b();
            C86883l.C86886c.f252190a.mo121337b();
            C58606a.m68054a().mo83497b(this);
        } catch (C87742a e) {
            String str = this.f189733f;
            Log.m105928w(str, "RouterException: " + e.getMessage());
        }
    }

    /* renamed from: q */
    public void mo80102q(C86525c cVar) {
        String str = this.f189733f;
        Log.m105924i(str, "onRemoveDevice " + cVar);
        C65989d1 d1Var = this.f189737j;
        if (d1Var != null) {
            d1Var.mo90031q(cVar);
        }
    }

    /* renamed from: t */
    public void mo80103t(C86525c cVar) {
        String str = this.f189733f;
        Log.m105924i(str, "onUpdateDevice " + cVar);
        C65989d1 d1Var = this.f189737j;
        if (d1Var != null) {
            d1Var.mo90032t(cVar);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:5|3)|13|6|7|8|9|10|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0048 */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90022v0() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f189733f
            java.lang.String r1 = "cleanUp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r4.f189741q     // Catch:{ Exception -> 0x004e }
            r0.stopTimer()     // Catch:{ Exception -> 0x004e }
            ej0.a r0 = ej0.C58606a.m68054a()     // Catch:{ Exception -> 0x004e }
            r1 = 1
            r0.f167795a = r1     // Catch:{ Exception -> 0x004e }
            java.util.Map<java.lang.String, ej0.c> r1 = r0.f167796b     // Catch:{ Exception -> 0x004e }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x004e }
            java.util.Collection r1 = r1.values()     // Catch:{ Exception -> 0x004e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x004e }
        L_0x001f:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x004e }
            r3 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x004e }
            ej0.c r2 = (ej0.C86525c) r2     // Catch:{ Exception -> 0x004e }
            r2.mo121007h()     // Catch:{ Exception -> 0x004e }
            r2.mo121008i()     // Catch:{ Exception -> 0x004e }
            r2.f251389h = r3     // Catch:{ Exception -> 0x004e }
            goto L_0x001f
        L_0x0035:
            r0.mo83499d(r4)     // Catch:{ Exception -> 0x004e }
            java.util.Map<java.lang.String, ej0.c> r0 = r0.f167796b     // Catch:{ Exception -> 0x004e }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x004e }
            r0.clear()     // Catch:{ Exception -> 0x004e }
            ej0.C58606a.f167794d = r3     // Catch:{ Exception -> 0x004e }
            int r0 = fj0.C86898q.f252215h     // Catch:{ a -> 0x0048 }
            fj0.q r0 = fj0.C86898q.C59104e.f169066a     // Catch:{ a -> 0x0048 }
            r0.mo121345a()     // Catch:{ a -> 0x0048 }
        L_0x0048:
            fj0.l r0 = fj0.C86883l.C86886c.f252190a     // Catch:{ Exception -> 0x004e }
            r0.mo121336a()     // Catch:{ Exception -> 0x004e }
            goto L_0x0069
        L_0x004e:
            r0 = move-exception
            java.lang.String r1 = r4.f189733f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error happen while cleaning up "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65992e1.mo90022v0():void");
    }
}
