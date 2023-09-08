package w33;

import c20.C104278a;
import c30.C104289g;
import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipProfilerReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import l33.C109247e;
import p212oe.C117776s;
import p761yd.C91441c;
import p933be.C113173i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import v33.C111383b;
import x33.C112039b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: w33.d */
public final class C111721d {

    /* renamed from: A */
    public int f334441A;

    /* renamed from: B */
    public long f334442B;

    /* renamed from: C */
    public long f334443C;

    /* renamed from: D */
    public int f334444D;

    /* renamed from: E */
    public int[] f334445E = new int[2];

    /* renamed from: F */
    public int f334446F;

    /* renamed from: G */
    public int f334447G;

    /* renamed from: H */
    public long f334448H;

    /* renamed from: I */
    public long f334449I;

    /* renamed from: J */
    public int f334450J;

    /* renamed from: K */
    public final C13601g f334451K = C36568h.m40985a(C111723b.f334480d);

    /* renamed from: L */
    public C104278a f334452L;

    /* renamed from: a */
    public int[] f334453a = new int[2];

    /* renamed from: b */
    public int f334454b;

    /* renamed from: c */
    public int f334455c;

    /* renamed from: d */
    public HashMap<String, C112039b.C112040a> f334456d = new HashMap<>();

    /* renamed from: e */
    public long f334457e;

    /* renamed from: f */
    public long f334458f;

    /* renamed from: g */
    public long f334459g;

    /* renamed from: h */
    public int[] f334460h = new int[2];

    /* renamed from: i */
    public int f334461i;

    /* renamed from: j */
    public int f334462j;

    /* renamed from: k */
    public int[] f334463k = new int[2];

    /* renamed from: l */
    public int f334464l;

    /* renamed from: m */
    public int f334465m;

    /* renamed from: n */
    public long f334466n;

    /* renamed from: o */
    public long f334467o;

    /* renamed from: p */
    public long f334468p;

    /* renamed from: q */
    public boolean f334469q;

    /* renamed from: r */
    public long f334470r;

    /* renamed from: s */
    public int[] f334471s = new int[2];

    /* renamed from: t */
    public int f334472t;

    /* renamed from: u */
    public int f334473u;

    /* renamed from: v */
    public long f334474v;

    /* renamed from: w */
    public long f334475w;

    /* renamed from: x */
    public int f334476x;

    /* renamed from: y */
    public int[] f334477y = new int[2];

    /* renamed from: z */
    public int f334478z;

    /* renamed from: w33.d$a */
    public static final class C111722a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111721d f334479d;

        public C111722a(C111721d dVar) {
            this.f334479d = dVar;
        }

        public final void run() {
            this.f334479d.f334452L = new C104278a();
            C111721d dVar = this.f334479d;
            C104278a aVar = dVar.f334452L;
            if (aVar != null) {
                dVar.f334466n = (long) aVar.mo145940b();
                dVar.f334467o = (long) aVar.mo145939a();
                dVar.f334468p = (long) aVar.mo145941c();
                dVar.f334470r = Util.nowMilliSecond();
                Log.m105924i("MicroMsg.VoIPProfileReport", "current profile gpu init info is gl:" + dVar.f334466n + " egl:" + dVar.f334467o + " gfx:" + dVar.f334468p);
            }
            C111721d dVar2 = this.f334479d;
            dVar2.f334452L = null;
            C114467i j = dVar2.mo163411j();
            if (j != null) {
                j.mo173679v();
            }
        }
    }

    /* renamed from: w33.d$b */
    public static final class C111723b extends C87413o implements C32224a<C117776s> {

        /* renamed from: d */
        public static final C111723b f334480d = new C111723b();

        public C111723b() {
            super(0);
        }

        public Object invoke() {
            C113173i iVar;
            if (!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) == null) {
                return null;
            }
            C117776s sVar = new C117776s(iVar.f338613h, "voIpProf");
            sVar.mo173675s(JiffiesMonitorFeature.JiffiesSnapshot.class);
            sVar.mo173678u(C114536x.C114543g.class, 30000);
            return sVar;
        }
    }

    public C111721d() {
        ((C119157j) C119157j.f356862d).mo183876g(new C111722a(this), "getGpuInfo");
    }

    /* renamed from: a */
    public final void mo163402a() {
        String str;
        VoipProfilerReportStruct voipProfilerReportStruct = new VoipProfilerReportStruct();
        C111383b vx02 = C109247e.vx0();
        if (vx02 != null) {
            long j = vx02.f333458r;
            if (j == 0) {
                Log.m105920e("MicroMsg.VoIPProfileReport", "error report while init time is null");
                return;
            }
            int milliSecondsToNow = (int) Util.milliSecondsToNow(j);
            voipProfilerReportStruct.f310451d = milliSecondsToNow;
            voipProfilerReportStruct.f310452e = Math.max(100 - (this.f334456d.size() * 20), 0);
            voipProfilerReportStruct.f310453f = C110823p.m150988N(this.f334453a);
            voipProfilerReportStruct.f310454g = C110823p.m150975A(this.f334453a);
            voipProfilerReportStruct.f310456i = this.f334454b;
            voipProfilerReportStruct.f310457j = C110823p.m150988N(this.f334460h);
            voipProfilerReportStruct.f310458k = C110823p.m150975A(this.f334460h);
            voipProfilerReportStruct.f310460m = this.f334461i;
            voipProfilerReportStruct.f310461n = C110823p.m150988N(this.f334463k);
            voipProfilerReportStruct.f310462o = C110823p.m150975A(this.f334463k);
            voipProfilerReportStruct.f310463p = this.f334464l;
            C112039b.C112040a aVar = this.f334456d.get("EncoderLackFrame");
            voipProfilerReportStruct.f310455h = aVar != null ? aVar.mo163759c().f335399a : 0;
            C112039b.C112040a aVar2 = this.f334456d.get("LocalRenderLackFrame");
            voipProfilerReportStruct.f310459l = aVar2 != null ? aVar2.mo163759c().f335399a : 0;
            C112039b.C112040a aVar3 = this.f334456d.get("RemoteRenderLackFrame");
            voipProfilerReportStruct.f310464q = aVar3 != null ? aVar3.mo163759c().f335399a : 0;
            voipProfilerReportStruct.f310466s = (int) this.f334457e;
            voipProfilerReportStruct.f310465r = (int) this.f334459g;
            voipProfilerReportStruct.f310467t = (int) this.f334458f;
            if (this.f334469q) {
                voipProfilerReportStruct.f310468u = (int) this.f334466n;
                voipProfilerReportStruct.f310469v = (int) this.f334467o;
                voipProfilerReportStruct.f310470w = (int) this.f334468p;
            }
            voipProfilerReportStruct.f310473z = C110823p.m150988N(this.f334471s);
            voipProfilerReportStruct.f310471x = C110823p.m150975A(this.f334471s);
            voipProfilerReportStruct.f310444B = this.f334476x;
            voipProfilerReportStruct.f310445C = this.f334473u;
            voipProfilerReportStruct.f310443A = (int) this.f334475w;
            voipProfilerReportStruct.f310446D = (int) this.f334474v;
            voipProfilerReportStruct.f310447E = voipProfilerReportStruct.mo86045b("PhoneTemprateInfo", mo163409h(), true);
            voipProfilerReportStruct.f310449G = voipProfilerReportStruct.mo86045b("CpuTemprateInfo", mo163406e(), true);
            voipProfilerReportStruct.f310450H = voipProfilerReportStruct.mo86045b("BatteryTemprateInfo", mo163404c(), true);
            C114467i j2 = mo163411j();
            if (j2 != null) {
                j2.mo173662f();
            }
            if (milliSecondsToNow > 300000) {
                C114467i j3 = mo163411j();
                voipProfilerReportStruct.f310472y = j3 != null ? j3.mo173666j() : 0;
                C114467i j4 = mo163411j();
                if (j4 != null) {
                    C118738t.m167432c(j4);
                }
                C114467i j5 = mo163411j();
                if (j5 != null) {
                    C104289g gVar = new C104289g();
                    j5.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new C118737s(j5, gVar));
                    str = gVar.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = new C104289g().toString();
                    C87412m.m108593f(str, "JSONObject().toString()");
                }
                voipProfilerReportStruct.f310448F = voipProfilerReportStruct.mo86045b("CpuLoadInfo", C112551y.m153814n(str, ",", ";", false), true);
            }
            voipProfilerReportStruct.mo86054n();
        }
    }

    /* renamed from: b */
    public final String mo163403b() {
        C104289g gVar = new C104289g();
        gVar.mo145954o("gl", this.f334466n);
        gVar.mo145954o("gfx", this.f334468p);
        gVar.mo145954o("egl", this.f334467o);
        gVar.mo145953n("cpuload", 0);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: c */
    public final String mo163404c() {
        C104289g gVar = new C104289g();
        gVar.mo145953n(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, Math.min(C110823p.m150975A(this.f334471s), C110823p.m150988N(this.f334471s)));
        gVar.mo145953n("max", Math.max(C110823p.m150975A(this.f334471s), C110823p.m150988N(this.f334471s)));
        gVar.mo145954o("tick", this.f334475w);
        gVar.mo145953n("raiseAvg", this.f334476x);
        gVar.mo145953n("raiseMax", this.f334473u);
        gVar.mo145954o("raiseMaxTick", this.f334474v);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: d */
    public final String mo163405d() {
        C104289g gVar = new C104289g();
        gVar.mo145953n("encodeFirst", (int) this.f334459g);
        gVar.mo145953n("localFirst", (int) this.f334457e);
        gVar.mo145953n("remoteFirst", (int) this.f334458f);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: e */
    public final String mo163406e() {
        C104289g gVar = new C104289g();
        gVar.mo145953n(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, Math.min(C110823p.m150975A(this.f334445E), C110823p.m150988N(this.f334445E)));
        gVar.mo145953n("max", Math.max(C110823p.m150975A(this.f334445E), C110823p.m150988N(this.f334445E)));
        gVar.mo145954o("tick", this.f334449I);
        gVar.mo145953n("raiseAvg", this.f334450J);
        gVar.mo145953n("raiseMax", this.f334447G);
        gVar.mo145954o("raiseMaxTick", this.f334448H);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: f */
    public final String mo163407f() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334456d.get("LocalRenderLackFrame");
        gVar.mo145953n(ImagesContract.LOCAL, aVar != null ? aVar.mo163759c().f335399a : 0);
        C112039b.C112040a aVar2 = this.f334456d.get("RemoteRenderLackFrame");
        gVar.mo145953n("remote", aVar2 != null ? aVar2.mo163759c().f335399a : 0);
        C112039b.C112040a aVar3 = this.f334456d.get("EncoderLackFrame");
        gVar.mo145953n("encode", aVar3 != null ? aVar3.mo163759c().f335399a : 0);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: g */
    public final String mo163408g() {
        C104289g gVar = new C104289g();
        gVar.mo145953n("localMax", Math.max(C110823p.m150975A(this.f334460h), C110823p.m150988N(this.f334460h)));
        gVar.mo145953n("localMin", Math.min(C110823p.m150975A(this.f334460h), C110823p.m150988N(this.f334460h)));
        gVar.mo145953n("localAvg", this.f334461i);
        gVar.mo145953n("remoteMax", Math.max(C110823p.m150975A(this.f334463k), C110823p.m150988N(this.f334463k)));
        gVar.mo145953n("remoteMin", Math.min(C110823p.m150975A(this.f334463k), C110823p.m150988N(this.f334463k)));
        gVar.mo145953n("remoteAvg", this.f334464l);
        gVar.mo145953n("encodeMax", Math.max(C110823p.m150975A(this.f334453a), C110823p.m150988N(this.f334453a)));
        gVar.mo145953n("encodeMin", Math.min(C110823p.m150975A(this.f334453a), C110823p.m150988N(this.f334453a)));
        gVar.mo145953n("encodeAvg", this.f334454b);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: h */
    public final String mo163409h() {
        C104289g gVar = new C104289g();
        gVar.mo145953n(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, Math.min(C110823p.m150975A(this.f334477y), C110823p.m150988N(this.f334477y)));
        gVar.mo145953n("max", Math.max(C110823p.m150975A(this.f334477y), C110823p.m150988N(this.f334477y)));
        gVar.mo145954o("tick", this.f334443C);
        gVar.mo145953n("raiseAvg", this.f334444D);
        gVar.mo145953n("raiseMax", this.f334441A);
        gVar.mo145954o("raiseMaxTick", this.f334442B);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: i */
    public final String mo163410i() {
        C104289g gVar = new C104289g();
        gVar.put("battery", mo163404c());
        gVar.put("phone", mo163409h());
        gVar.put("cpu", mo163406e());
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "retInfo.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: j */
    public final C114467i mo163411j() {
        return (C114467i) ((C36570n) this.f334451K).getValue();
    }

    /* renamed from: k */
    public final void mo163412k(int i, int i2, int i3) {
        int A = C110823p.m150975A(this.f334471s);
        if (A < i2 || A == 0) {
            long j = C109247e.vx0().f333458r;
            if (j != 0) {
                Util.milliSecondsToNow(j);
                this.f334471s[0] = i2;
                this.f334475w = Util.milliSecondsToNow(j);
            }
        }
        int N = C110823p.m150988N(this.f334471s);
        if (N > i || N == 0) {
            this.f334471s[1] = i;
        }
        if (this.f334472t != 0) {
            long j2 = C109247e.vx0().f333458r;
            if (j2 != 0) {
                int i4 = i3 - this.f334472t;
                if (i4 > this.f334473u || this.f334474v == 0) {
                    this.f334473u = i4;
                    this.f334474v = Util.milliSecondsToNow(j2);
                }
                int i5 = this.f334476x;
                int i6 = i4 + i5;
                this.f334476x = i6;
                int i7 = i6 / 2;
                this.f334476x = i7;
                if (i5 > i7) {
                    Log.m105920e("MicroMsg.VoIPProfileReport", "current battery temp raise quick");
                }
            }
        }
        this.f334472t = i3;
    }

    /* renamed from: l */
    public final void mo163413l(int i, int i2, int i3) {
        int A = C110823p.m150975A(this.f334445E);
        if (A < i2 || A == 0) {
            long j = C109247e.vx0().f333458r;
            if (j != 0) {
                this.f334445E[0] = i2;
                this.f334449I = Util.milliSecondsToNow(j);
            }
        }
        int N = C110823p.m150988N(this.f334445E);
        if (N > i || N == 0) {
            this.f334445E[1] = i;
        }
        if (this.f334446F != 0) {
            long j2 = C109247e.vx0().f333458r;
            if (j2 != 0) {
                int i4 = i3 - this.f334446F;
                if (i4 > this.f334447G || this.f334448H == 0) {
                    this.f334447G = i4;
                    this.f334448H = Util.milliSecondsToNow(j2);
                }
                int i5 = this.f334450J;
                int i6 = i4 + i5;
                this.f334450J = i6;
                int i7 = i6 / 2;
                this.f334450J = i7;
                if (i5 > i7) {
                    Log.m105920e("MicroMsg.VoIPProfileReport", "current cpu temp raise quick");
                }
            }
        }
        this.f334446F = i3;
    }

    /* renamed from: m */
    public final void mo163414m(int i, int i2, int i3) {
        int A = C110823p.m150975A(this.f334477y);
        if (A < i2 || A == 0) {
            long j = C109247e.vx0().f333458r;
            if (j != 0) {
                Util.milliSecondsToNow(j);
                this.f334477y[0] = i2;
                this.f334443C = Util.milliSecondsToNow(j);
            }
        }
        int N = C110823p.m150988N(this.f334477y);
        if (N > i || N == 0) {
            this.f334477y[1] = i;
        }
        if (this.f334478z != 0) {
            long j2 = C109247e.vx0().f333458r;
            if (j2 != 0) {
                int i4 = i3 - this.f334478z;
                if (i4 > this.f334441A || this.f334442B == 0) {
                    this.f334441A = i4;
                    this.f334442B = Util.milliSecondsToNow(j2);
                }
                int i5 = this.f334444D;
                int i6 = i4 + i5;
                this.f334444D = i6;
                int i7 = i6 / 2;
                this.f334444D = i7;
                if (i5 > i7) {
                    Log.m105920e("MicroMsg.VoIPProfileReport", "current phone temp raise quick");
                }
            }
        }
        this.f334478z = i3;
    }

    /* renamed from: n */
    public final void mo163415n(int i, boolean z) {
        if (z) {
            int A = C110823p.m150975A(this.f334460h);
            if (i < A || A == 0) {
                this.f334460h[0] = i;
            }
            if (i > C110823p.m150988N(this.f334460h)) {
                this.f334460h[1] = i;
            }
            int i2 = this.f334461i + i;
            this.f334461i = i2;
            this.f334461i = i2 / 2;
            if (this.f334462j - i > 5) {
                long j = C109247e.vx0().f333458r;
                if (j != 0) {
                    C112039b.C112040a aVar = this.f334456d.get("LocalRenderLackFrame");
                    if (aVar == null) {
                        aVar = new C112039b.C112040a();
                    }
                    aVar.f335401a = "LocalRenderLackFrame";
                    aVar.mo163760d(Util.milliSecondsToNow(j));
                    aVar.mo163758b();
                    this.f334456d.put("LocalRenderLackFrame", aVar);
                    Log.m105924i("MicroMsg.VoIPProfileReport", "local render frame lack");
                }
            }
            this.f334462j = i;
            return;
        }
        int A2 = C110823p.m150975A(this.f334463k);
        if (i < A2 || A2 == 0) {
            this.f334463k[0] = i;
        }
        if (i > C110823p.m150988N(this.f334463k)) {
            this.f334463k[1] = i;
        }
        int i3 = this.f334464l + i;
        this.f334464l = i3;
        this.f334464l = i3 / 2;
        if (this.f334465m - i > 5) {
            long j2 = C109247e.vx0().f333458r;
            if (j2 != 0) {
                C112039b.C112040a aVar2 = this.f334456d.get("RemoteRenderLackFrame");
                if (aVar2 == null) {
                    aVar2 = new C112039b.C112040a();
                }
                aVar2.f335401a = "RemoteRenderLackFrame";
                aVar2.mo163760d(Util.milliSecondsToNow(j2));
                aVar2.mo163758b();
                this.f334456d.put("RemoteRenderLackFrame", aVar2);
                Log.m105924i("MicroMsg.VoIPProfileReport", "remote render frame lack");
            }
        }
        this.f334465m = i;
    }

    /* renamed from: o */
    public final void mo163416o() {
        this.f334466n = 0;
        this.f334467o = 0;
        this.f334468p = 0;
        C114467i j = mo163411j();
        if (j != null) {
            j.mo173658a();
        }
    }
}
