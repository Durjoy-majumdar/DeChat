package nw3;

import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import as3.C103856a0;
import as3.C103857a1;
import as3.C103860b1;
import as3.C103862c0;
import as3.C103863c1;
import as3.C103865d0;
import as3.C103868e0;
import as3.C103869e1;
import as3.C103874g0;
import as3.C103877h0;
import as3.C103880i0;
import as3.C103884k0;
import as3.C103886l0;
import as3.C103888m0;
import as3.C103890n0;
import as3.C103892o0;
import as3.C103895q;
import as3.C103912y0;
import as3.C103913z;
import as3.C103914z0;
import bs3.C0377a;
import bs3.C104161b;
import bs3.C104162c;
import bs3.C104164e;
import bs3.C104166f;
import bs3.C28416g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40473o1;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.multi.talk;
import com.tencent.p014mm.plugin.multitalk.model.C105845w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.model.TalkRoom;
import cs3.C106962a;
import ds3.C107062b;
import ds3.C107063c;
import ds3.C107065e;
import fm0.C86974q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import lv3.C109435e;
import mv3.C109642a;
import mv3.C109645d;
import ow3.C110077a;
import ow3.C110078b;
import ow3.C110079c;
import ow3.C110081e;
import ow3.C110082f;
import ow3.C110083g;
import ow3.C110084h;
import ow3.C110085i;
import ow3.C110086j;
import ow3.C110087k;
import ow3.C110088l;
import ow3.C110089m;
import ow3.C110091o;
import p156gj.C107842p;
import p206nj.C88957l;
import p375qh.C110390f;
import p734vz.C102300g;
import tm0.C14016b0;
import tm0.C14039u;
import zr3.C112670b;
import zr3.C112672d;
import zr3.C112675e;

/* renamed from: nw3.f */
public class C109782f implements C112670b, Handler.Callback, C109645d {

    /* renamed from: V0 */
    public static C107065e f328551V0;

    /* renamed from: W0 */
    public static int f328552W0 = 30000;

    /* renamed from: X0 */
    public static String[] f328553X0 = {"GLOBAL_TOPIC_NETWORK_CHANGE", "topic_bind_mobile_other"};

    /* renamed from: A */
    public String f328554A;

    /* renamed from: B */
    public int f328555B;

    /* renamed from: C */
    public int f328556C;

    /* renamed from: D */
    public int f328557D;

    /* renamed from: E */
    public int f328558E;

    /* renamed from: F */
    public int f328559F;

    /* renamed from: G */
    public int f328560G;

    /* renamed from: H */
    public int f328561H;

    /* renamed from: I */
    public int f328562I;

    /* renamed from: J */
    public C109799g0 f328563J;

    /* renamed from: K */
    public C109772b f328564K;

    /* renamed from: L */
    public talk.IMultiTalkListener f328565L;

    /* renamed from: M */
    public TimerTask f328566M;

    /* renamed from: N */
    public TimerTask f328567N;

    /* renamed from: P */
    public Timer f328568P;

    /* renamed from: Q */
    public TimerTask f328569Q;

    /* renamed from: Q0 */
    public boolean f328570Q0;

    /* renamed from: R */
    public Timer f328571R;

    /* renamed from: R0 */
    public boolean f328572R0;

    /* renamed from: S */
    public C109804j f328573S;

    /* renamed from: S0 */
    public Runnable f328574S0;

    /* renamed from: T */
    public C109642a f328575T;

    /* renamed from: T0 */
    public C112672d f328576T0;

    /* renamed from: U */
    public String f328577U;

    /* renamed from: U0 */
    public Runnable f328578U0;

    /* renamed from: V */
    public HashSet<Long> f328579V;

    /* renamed from: W */
    public boolean f328580W;

    /* renamed from: X */
    public boolean f328581X;

    /* renamed from: Y */
    public short[] f328582Y;

    /* renamed from: Z */
    public String[] f328583Z;

    /* renamed from: d */
    public Map<String, C109796l> f328584d = new HashMap();

    /* renamed from: e */
    public Handler f328585e;

    /* renamed from: f */
    public HandlerThread f328586f;

    /* renamed from: g */
    public int f328587g;

    /* renamed from: h */
    public boolean f328588h;

    /* renamed from: i */
    public boolean f328589i;

    /* renamed from: j */
    public boolean f328590j;

    /* renamed from: n */
    public boolean f328591n;

    /* renamed from: o */
    public String f328592o;

    /* renamed from: p */
    public String f328593p;

    /* renamed from: p0 */
    public short[] f328594p0;

    /* renamed from: q */
    public String f328595q;

    /* renamed from: r */
    public int f328596r;

    /* renamed from: s */
    public int f328597s;

    /* renamed from: t */
    public long f328598t;

    /* renamed from: u */
    public int f328599u;

    /* renamed from: v */
    public int f328600v;

    /* renamed from: w */
    public long f328601w;

    /* renamed from: x */
    public boolean f328602x;

    /* renamed from: x0 */
    public String[] f328603x0;

    /* renamed from: y */
    public int f328604y;

    /* renamed from: y0 */
    public int f328605y0;

    /* renamed from: z */
    public int f328606z;

    /* renamed from: nw3.f$a */
    public class C109783a implements talk.IMultiTalkListener {

        /* renamed from: nw3.f$a$a */
        public class C109784a implements Runnable {
            public C109784a() {
            }

            public void run() {
                try {
                    C104161b.m138995d("TalkRoomService", "initMediaComponent");
                    C109782f fVar = C109782f.this;
                    if (fVar.f328564K == null) {
                        C104161b.m138994c("TalkRoomService", "the engine should not be null.");
                        return;
                    }
                    C104161b.m138993b("TalkRoomService", "initMediaComponent");
                    C104164e.m138998a(411, 1, String.valueOf(1));
                    fVar.mo161087S();
                    fVar.mo161088T();
                } catch (Throwable th) {
                    C104161b.m138997f("TalkRoomService", "keep_OnOpenSuccess initMediaComponent:  ", th);
                }
            }
        }

        /* renamed from: nw3.f$a$b */
        public class C109785b implements Runnable {

            /* renamed from: d */
            public int f328609d;

            /* renamed from: e */
            public int f328610e;

            /* renamed from: f */
            public int f328611f;

            /* renamed from: g */
            public int f328612g;

            /* renamed from: h */
            public int f328613h;

            public C109785b(int i, int i2, int i3, int i4, int i5) {
                this.f328609d = i;
                this.f328611f = i2;
                this.f328612g = i3;
                this.f328613h = i4;
                this.f328610e = i5;
            }

            public void run() {
                C104161b.m138995d("TalkRoomService", "keep_OnError handler");
                C109799g0.m149205f(this.f328612g);
                C109782f.this.f328563J.mo161128j(this.f328611f);
                C104161b.m138993b("TalkRoomService", "engine exitTalkRoom engineCallback OnError:", Integer.valueOf(this.f328610e));
                C109782f fVar = C109782f.this;
                fVar.mo161103n(fVar.f328593p, fVar.f328597s, fVar.f328598t, this.f328613h, true);
                C109782f.this.f328573S.mo161132b(this.f328609d, (Object) null);
            }
        }

        public C109783a() {
        }

        public void keep_OnError(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (i == -4) {
                i5 = -400;
                i4 = 206;
                i3 = -3006;
                i2 = 115;
            } else if (i == -3) {
                i5 = -401;
                i4 = 205;
                i3 = -3005;
                i2 = 114;
            } else if (i == -2) {
                i5 = -401;
                i4 = 204;
                i3 = -3004;
                i2 = 113;
            } else if (i != -1) {
                i5 = -400;
                i4 = 207;
                i3 = -3007;
                i2 = 103;
            } else {
                i5 = -401;
                i4 = 203;
                i3 = -3003;
                i2 = 112;
            }
            new Handler(Looper.getMainLooper()).post(new C109785b(i5, i4, i3, i2, i));
        }

        public void keep_OnNotify(int i) {
            C104161b.m138997f("TalkRoomService", "keep_OnNotify eventCode: ", Integer.valueOf(i));
            if (i == 5) {
                C109799g0 g0Var = C109782f.this.f328563J;
                g0Var.f328688l = 1;
                if (g0Var.f328675G == 0) {
                    g0Var.f328689m = 0;
                } else {
                    g0Var.f328689m = System.currentTimeMillis() - g0Var.f328675G;
                }
                C104161b.m138993b(C109799g0.f328668J, "endRecvFirstPcm", Long.valueOf(g0Var.f328675G), Long.valueOf(g0Var.f328689m));
                C109782f fVar = C109782f.this;
                fVar.f328604y = 1;
                C109782f.m149154c(fVar);
            }
        }

        public void keep_OnOpenSuccess() {
            C109782f.this.f328563J.f328686j = 1;
            C104161b.m138993b("TalkRoomService", "engine OnOpenSuccess");
            C109782f fVar = C109782f.this;
            int i = fVar.f328587g;
            if (i != 4) {
                C104161b.m138997f("TalkRoomService", "has exit the talkroom state:%d", Integer.valueOf(i));
                return;
            }
            try {
                C109782f.m149155d(fVar, C109774c.m149103b().mo161014a(C109782f.this.f328593p));
                C109782f fVar2 = C109782f.this;
                C109772b bVar = fVar2.f328564K;
                if (bVar != null) {
                    boolean K = fVar2.mo161079K();
                    talk talk = bVar.f328532a;
                    if (talk != null) {
                        if (K) {
                            talk.setAppCmd(401, new byte[]{5}, 1);
                        } else {
                            talk.setAppCmd(402, new byte[]{5}, 1);
                        }
                    }
                }
                C109782f fVar3 = C109782f.this;
                fVar3.f328590j = true;
                fVar3.f328564K.mo161005c();
                C109782f.this.f328564K.mo161007e();
                new Handler(Looper.getMainLooper()).post(new C109784a());
                C109782f.this.f328563J.mo161127d();
                C109804j jVar = C109782f.this.f328573S;
                jVar.getClass();
                C109811n nVar = new C109811n(jVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    nVar.run();
                } else {
                    jVar.f328706b.post(nVar);
                }
            } catch (Throwable th) {
                C104161b.m138997f("TalkRoomService", "keep_OnOpenSuccess:  ", th);
            }
        }

        public void keep_OnReportChannel(String str) {
            C104161b.m138993b("TalkRoomService", "keep_OnReportChannel:", str);
            String str2 = C109782f.this.f328577U;
            if (C104166f.m139002b(str2)) {
                str2 = "";
            }
            String str3 = str2 + "," + str;
            C104161b.m138993b(C109799g0.f328668J, "sendChannelStat", str3);
            C104164e.m138998a(C14039u.CTRL_INDEX, 3, str3);
        }

        public void keep_OnReportEngineRecv(String str, int i) {
            C104161b.m138993b("TalkRoomService", "keep_OnReportEngineRecv:", Integer.valueOf(i), str);
            String str2 = C109782f.this.f328577U;
            if (C104166f.m139002b(str2)) {
                str2 = "";
            }
            String str3 = str2 + "," + str;
            C104161b.m138993b(C109799g0.f328668J, "sendEngineRecv", str3);
            C104164e.m138998a(C86974q1.CTRL_INDEX, 3, str3);
        }

        public void keep_OnReportEngineSend(String str) {
            C104161b.m138993b("TalkRoomService", "keep_OnReportEngineSend:", str);
            String str2 = C109782f.this.f328577U;
            if (C104166f.m139002b(str2)) {
                str2 = "";
            }
            String str3 = str2 + "," + str;
            C104161b.m138993b(C109799g0.f328668J, "sendEngineSend", str3);
            C104164e.m138998a(C14016b0.CTRL_INDEX, 3, str3);
        }
    }

    /* renamed from: nw3.f$b */
    public class C109786b extends TimerTask {
        public C109786b() {
        }

        public void run() {
            C109782f fVar = C109782f.this;
            int i = fVar.f328597s;
            if (i == 0 || fVar.f328593p == null) {
                C104161b.m138997f("TalkRoomService", "talkNoopTimer error: roomId %d, talkUsername %s", Integer.valueOf(i), C109782f.this.f328593p);
                C109782f.this.mo161096h();
                return;
            }
            C110091o c = C109782f.m149154c(fVar);
            if (fVar.f328567N == null) {
                C109798g gVar = new C109798g(fVar, c);
                fVar.f328567N = gVar;
                fVar.f328568P.schedule(gVar, 120000);
            }
        }
    }

    /* renamed from: nw3.f$c */
    public class C109787c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f328616d;

        /* renamed from: e */
        public final /* synthetic */ C103860b1[] f328617e;

        /* renamed from: f */
        public final /* synthetic */ C103912y0 f328618f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f328619g;

        /* renamed from: h */
        public final /* synthetic */ boolean f328620h;

        /* renamed from: i */
        public final /* synthetic */ String f328621i;

        /* renamed from: j */
        public final /* synthetic */ int f328622j;

        /* renamed from: n */
        public final /* synthetic */ long f328623n;

        /* renamed from: o */
        public final /* synthetic */ int f328624o;

        /* renamed from: p */
        public final /* synthetic */ int f328625p;

        /* renamed from: q */
        public final /* synthetic */ byte[] f328626q;

        /* renamed from: r */
        public final /* synthetic */ int[] f328627r;

        /* renamed from: s */
        public final /* synthetic */ int f328628s;

        /* renamed from: t */
        public final /* synthetic */ String f328629t;

        /* renamed from: u */
        public final /* synthetic */ C109782f f328630u;

        public C109787c(C109782f fVar, int i, C103860b1[] b1VarArr, C103912y0 y0Var, byte[] bArr, boolean z, String str, int i2, long j, int i3, int i4, byte[] bArr2, int[] iArr, int i5, String str2) {
            this.f328630u = fVar;
            this.f328616d = i;
            this.f328617e = b1VarArr;
            this.f328618f = y0Var;
            this.f328619g = bArr;
            this.f328620h = z;
            this.f328621i = str;
            this.f328622j = i2;
            this.f328623n = j;
            this.f328624o = i3;
            this.f328625p = i4;
            this.f328626q = bArr2;
            this.f328627r = iArr;
            this.f328628s = i5;
            this.f328629t = str2;
        }

        public void run() {
            this.f328630u.mo161100k(this.f328616d - 1, this.f328617e, this.f328618f, this.f328619g, this.f328620h, this.f328621i, this.f328622j, this.f328623n, this.f328624o, this.f328625p, this.f328626q, this.f328627r, this.f328628s, this.f328629t);
        }
    }

    /* renamed from: nw3.f$d */
    public class C109788d implements C107063c {
        public C109788d() {
        }
    }

    /* renamed from: nw3.f$e */
    public class C109789e implements C107062b {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f328632a;

        /* renamed from: b */
        public final /* synthetic */ AtomicInteger f328633b;

        public C109789e(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
            this.f328632a = atomicInteger;
            this.f328633b = atomicInteger2;
        }
    }

    /* renamed from: nw3.f$f */
    public class C109790f implements Runnable {
        public C109790f() {
        }

        public void run() {
            if (C109782f.this.mo161080L() && C109782f.this.f328591n) {
                C104161b.m138993b("TalkRoomService", "syscall", "finishtalk becos holdtimeout");
                C109799g0.m149204e(-2003);
                C109782f.this.f328563J.mo161128j(401);
                C109782f fVar = C109782f.this;
                fVar.mo161104o(fVar.f328593p, 3, 108);
            }
        }
    }

    /* renamed from: nw3.f$g */
    public class C109791g implements Runnable {
        public C109791g() {
        }

        public void run() {
            Object[] objArr = new Object[6];
            objArr[0] = "beginSenceCircle state: ";
            objArr[1] = Integer.valueOf(C109782f.this.f328587g);
            objArr[2] = " mCircleScene: ";
            C112672d dVar = C109782f.this.f328576T0;
            C110081e eVar = null;
            objArr[3] = dVar == null ? null : Integer.valueOf(dVar.mo161498d());
            objArr[4] = " mIsAck: ";
            objArr[5] = Boolean.valueOf(C109782f.this.f328589i);
            C104161b.m138993b("TalkRoomService", objArr);
            C109782f fVar = C109782f.this;
            if (fVar.f328576T0 == null) {
                fVar.f328585e.removeCallbacks(fVar.f328578U0);
                C104161b.m138997f("TalkRoomService", "beginSenceCircle removeCallbacks");
            } else if (!fVar.mo161080L()) {
                C109782f fVar2 = C109782f.this;
                fVar2.f328585e.removeCallbacks(fVar2.f328578U0);
                C104161b.m138997f("TalkRoomService", "beginSenceCircle removeCallbacks");
            } else {
                C112672d dVar2 = C109782f.this.f328576T0;
                if (dVar2 != null && dVar2.mo161498d() == 202) {
                    C109782f fVar3 = C109782f.this;
                    if (fVar3.f328587g == 3) {
                        C110081e eVar2 = (C110081e) fVar3.f328576T0;
                        String str = eVar2.f329388j;
                        int i = eVar2.f329389k;
                        long j = eVar2.f329390l;
                        int i2 = eVar2.f329391m;
                        fVar3.getClass();
                        if (fVar3.mo161078J(str, i, j, i2 != 1)) {
                            eVar = new C110081e(eVar2);
                            C104161b.m138997f("TalkRoomService", "beginSenceCircle enter");
                        }
                    }
                }
                if (eVar != null) {
                    C112675e.m154053e().mo164407c(eVar);
                    return;
                }
                C109782f fVar4 = C109782f.this;
                fVar4.f328585e.removeCallbacks(fVar4.f328578U0);
                C104161b.m138997f("TalkRoomService", "beginSenceCircle removeCallbacks");
            }
        }
    }

    /* renamed from: nw3.f$h */
    public class C109792h {

        /* renamed from: a */
        public String f328637a;

        /* renamed from: b */
        public String[] f328638b;

        /* renamed from: c */
        public C103869e1 f328639c;

        /* renamed from: d */
        public int f328640d;

        /* renamed from: e */
        public int f328641e;

        /* renamed from: f */
        public long f328642f;

        /* renamed from: g */
        public String f328643g;

        /* renamed from: h */
        public boolean f328644h;

        /* renamed from: i */
        public String f328645i;

        public C109792h(C109782f fVar) {
        }
    }

    /* renamed from: nw3.f$i */
    public enum C109793i {
        OK,
        NOT_AUTH,
        NO_NETWORK,
        BUSY,
        NOT_VALID_STATE,
        GROUP_NOT_VALID,
        INIT_ENGINE_FAILED
    }

    /* renamed from: nw3.f$j */
    public class C109794j {

        /* renamed from: a */
        public String f328654a;

        /* renamed from: b */
        public int f328655b;

        /* renamed from: c */
        public long f328656c;

        /* renamed from: d */
        public int f328657d;

        /* renamed from: e */
        public int f328658e;

        /* renamed from: f */
        public String f328659f;

        public C109794j(C109782f fVar) {
        }
    }

    /* renamed from: nw3.f$k */
    public class C109795k {
    }

    /* renamed from: nw3.f$l */
    public class C109796l {

        /* renamed from: a */
        public int f328660a;

        /* renamed from: b */
        public long f328661b;

        public C109796l(C109782f fVar) {
        }
    }

    static {
        new ArrayList();
    }

    public C109782f() {
        String[] strArr;
        this.f328587g = 0;
        this.f328588h = false;
        this.f328589i = false;
        this.f328590j = false;
        this.f328591n = false;
        this.f328599u = 0;
        this.f328600v = 0;
        this.f328601w = 0;
        this.f328602x = true;
        this.f328604y = 0;
        this.f328606z = 0;
        this.f328554A = null;
        this.f328555B = -1;
        this.f328556C = -1;
        this.f328557D = -1;
        this.f328558E = -1;
        this.f328559F = -1;
        this.f328560G = -1;
        this.f328561H = -1;
        this.f328562I = -1;
        this.f328563J = C109799g0.f328667I;
        this.f328568P = new Timer("TalkRoomService_HelloTimer");
        this.f328571R = new Timer("TalkRoomService_talkDurationTimer");
        this.f328573S = new C109804j();
        this.f328577U = null;
        this.f328579V = new HashSet<>();
        this.f328580W = true;
        this.f328581X = true;
        this.f328582Y = null;
        this.f328583Z = null;
        this.f328594p0 = null;
        this.f328603x0 = null;
        this.f328605y0 = 0;
        this.f328570Q0 = false;
        this.f328572R0 = false;
        this.f328574S0 = new C109790f();
        this.f328576T0 = null;
        this.f328578U0 = new C109791g();
        C112675e.m154053e().mo164406a(201, this);
        C112675e.m154053e().mo164406a(202, this);
        C112675e.m154053e().mo164406a(203, this);
        C112675e.m154053e().mo164406a(204, this);
        C112675e.m154053e().mo164406a(205, this);
        C112675e.m154053e().mo164406a(206, this);
        C112675e.m154053e().mo164406a(207, this);
        C112675e.m154053e().mo164406a(208, this);
        C112675e.m154053e().mo164406a(210, this);
        C112675e.m154053e().mo164406a(209, this);
        C112675e.m154053e().mo164406a(211, this);
        C112675e.m154053e().mo164406a(212, this);
        C112675e.m154053e().mo164406a(213, this);
        C112675e.m154053e().mo164406a(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, this);
        C112675e.m154053e().mo164406a(800, this);
        C112675e.m154053e().mo164406a(C1862l.CTRL_INDEX, this);
        C112675e.m154053e().mo164406a(802, this);
        C109774c b = C109774c.m149103b();
        C109804j jVar = this.f328573S;
        b.getClass();
        Throwable th = new Throwable("trace caller");
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                StackTraceElement stackTraceElement = stackTrace[1];
            }
        } catch (Exception unused) {
            C104161b.m138993b("TalkRoomManager", "setTalkServerCallback caller stack: ", th);
        }
        b.f328540c = jVar;
        C104161b.m138995d("new handlerthread in init function", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TalkRoomService");
        this.f328586f = handlerThread;
        handlerThread.start();
        this.f328585e = new Handler(this.f328586f.getLooper(), this);
        mo161082N();
        if (this.f328575T == null) {
            this.f328575T = (C109642a) C109435e.m148612c("EventCenter");
        }
        C104161b.m138993b("TalkRoomService", "syscall", "register", Boolean.TRUE);
        C109642a aVar = this.f328575T;
        if (aVar != null && (strArr = f328553X0) != null) {
            synchronized (aVar.f328240b) {
                for (String str : strArr) {
                    if (str != null) {
                        Object obj = aVar.f328239a.get(str);
                        if (obj == null) {
                            aVar.f328239a.put(str, this);
                        } else if (obj instanceof C109645d) {
                            C109645d dVar = (C109645d) obj;
                            if (dVar != this) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(dVar);
                                linkedList.add(this);
                                aVar.f328239a.put(str, linkedList);
                            } else {
                                return;
                            }
                        } else if (obj instanceof List) {
                            LinkedList linkedList2 = (LinkedList) obj;
                            if (linkedList2.indexOf(this) < 0) {
                                linkedList2.add(this);
                            } else {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: X */
    public static String[] m149153X(List<String> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return new String[0];
        }
        String[] strArr = new String[list.size()];
        for (String str : list) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    /* renamed from: c */
    public static C110091o m149154c(C109782f fVar) {
        if (TextUtils.isEmpty(fVar.f328593p)) {
            C104161b.m138997f("TalkRoomService", "doHelloVoiceRoom mGroupId is null");
            return null;
        }
        int g = C109774c.m149103b().mo161019g(fVar.f328593p);
        C104161b.m138997f("TalkRoomService", "doHelloVoiceRoom mGroupId: ", fVar.f328593p, " mRoomId: ", Integer.valueOf(fVar.f328597s), " mRoomKey: ", Long.valueOf(fVar.f328598t), " selfMemberId: ", Integer.valueOf(g), " mCallData: ", Integer.valueOf(fVar.f328604y));
        C110091o oVar = new C110091o(fVar.f328593p, fVar.f328597s, fVar.f328598t, g, fVar.f328604y);
        C112675e.m154053e().mo164407c(oVar);
        return oVar;
    }

    /* renamed from: d */
    public static void m149155d(C109782f fVar, int[] iArr) {
        fVar.getClass();
        if (iArr == null) {
            C104161b.m138997f("TalkRoomService", "onMebersChangedToEngineByIds members is null");
            return;
        }
        C104161b.m138997f("TalkRoomService", "engine onMebersChangedToEngineByIds members.length: ", Integer.valueOf(iArr.length));
        C109772b bVar = fVar.f328564K;
        if (bVar == null) {
            C104161b.m138997f("TalkRoomService", "onMebersChangedToEngine engine is null");
            return;
        }
        talk talk = bVar.f328532a;
        if (talk != null) {
            talk.OnMembersChanged(iArr);
        }
    }

    /* renamed from: A */
    public final void mo161069A(int i, int i2, C103888m0 m0Var, C110086j jVar) {
        C104161b.m138997f("TalkRoomService", "handleSendMsg errCode: ", Integer.valueOf(i2));
        if (i2 != 0) {
            jVar.getClass();
            if (C104166f.m139001a((String) null, this.f328593p)) {
                this.f328563J.mo161124a("sendmsg", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
                this.f328573S.mo161132b(-700, (Object) null);
                return;
            }
            return;
        }
        jVar.getClass();
        if (C104166f.m139001a((String) null, this.f328593p)) {
            this.f328563J.mo161124a("sendmsg", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
            C109804j jVar2 = this.f328573S;
            jVar2.getClass();
            C109802i iVar = new C109802i(jVar2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                iVar.run();
            } else {
                jVar2.f328706b.post(iVar);
            }
        }
    }

    /* renamed from: B */
    public final void mo161070B(int i, C103880i0 i0Var, C110087k kVar) {
        C104161b.m138997f("TalkRoomService", "handleSubscribeGeneralVideo errCode: ", Integer.valueOf(i));
        if (!mo161078J(kVar.f329392j, kVar.f329393k, kVar.f329394l, false)) {
            C104161b.m138997f("TalkRoomService", "handleSubscribeGeneralVideo isCurrentRoom is not same", kVar.f329392j, Integer.valueOf(kVar.f329393k));
        } else if (i == 0) {
            C109804j jVar = this.f328573S;
            jVar.getClass();
            C109778d0 d0Var = new C109778d0(jVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d0Var.run();
            } else {
                jVar.f328706b.post(d0Var);
            }
        } else {
            this.f328573S.mo161132b(-1601, (Object) null);
        }
    }

    /* renamed from: C */
    public final void mo161071C(int i, C103874g0 g0Var, C110088l lVar) {
        C104161b.m138997f("TalkRoomService", "handleSubscribeLargeVideo errCode: ", Integer.valueOf(i));
        if (!mo161078J(lVar.f329395j, lVar.f329396k, lVar.f329397l, false)) {
            C104161b.m138997f("TalkRoomService", "handleSubscribeLargeVideo isCurrentRoom is not same", lVar.f329395j, Integer.valueOf(lVar.f329396k));
        } else if (i == 0) {
            C109804j jVar = this.f328573S;
            jVar.getClass();
            C109776c0 c0Var = new C109776c0(jVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c0Var.run();
            } else {
                jVar.f328706b.post(c0Var);
            }
        } else {
            this.f328573S.mo161132b(-1600, (Object) null);
        }
    }

    /* renamed from: D */
    public final void mo161072D(int i, C103877h0 h0Var, C110089m mVar) {
        C104161b.m138997f("TalkRoomService", "handleSubscribeScreenSharingVideo errCode: ", Integer.valueOf(i));
        if (!mo161078J(mVar.f329398j, mVar.f329399k, mVar.f329400l, false)) {
            C104161b.m138997f("TalkRoomService", "handleSubscribeScreenSharingVideo isCurrentRoom is not same", mVar.f329398j, Integer.valueOf(mVar.f329399k));
        } else if (i == 0) {
            C109804j jVar = this.f328573S;
            jVar.getClass();
            C109781e0 e0Var = new C109781e0(jVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e0Var.run();
            } else {
                jVar.f328706b.post(e0Var);
            }
        } else {
            this.f328573S.mo161132b(-1602, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161073E(int r13, as3.C103882j0 r14, ow3.C110090n r15) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "handleSwitchVideoGroup errCode: "
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "TalkRoomService"
            bs3.C104161b.m138997f(r2, r1)
            int r1 = r15.f329405n
            if (r1 != r4) goto L_0x0022
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r14 = "handleSwitchVideoGroup, but ilink event"
            r13[r3] = r14
            bs3.C104161b.m138993b(r2, r13)
            return
        L_0x0022:
            java.lang.String r6 = r15.f329401j
            int r7 = r15.f329402k
            long r8 = r15.f329403l
            r10 = 0
            r5 = r12
            boolean r1 = r5.mo161078J(r6, r7, r8, r10)
            r5 = 3
            if (r1 != 0) goto L_0x0047
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r14 = "handleSwitchVideoGroup isCurrentRoom is not same"
            r13[r3] = r14
            java.lang.String r14 = r15.f329401j
            r13[r4] = r14
            int r14 = r15.f329402k
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r0] = r14
            bs3.C104161b.m138997f(r2, r13)
            return
        L_0x0047:
            nw3.b r1 = r12.f328564K
            if (r1 == 0) goto L_0x00bd
            r1 = 6
            int[] r6 = new int[r1]
            int r7 = r14.f307035b
            r6[r3] = r7
            int r8 = r14.f307038e
            r6[r4] = r8
            int r8 = r14.f307039f
            r6[r0] = r8
            int r8 = r14.f307040g
            r6[r5] = r8
            int r8 = r14.f307041h
            r9 = 4
            r6[r9] = r8
            int r8 = r14.f307042i
            r10 = 5
            r6[r10] = r8
            r8 = 7
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r11 = "setMVSvrCfg:small:br:,WH:,FPS:,big:br:,WH:,Fps:"
            r8[r3] = r11
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r4] = r7
            r7 = r6[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r0] = r7
            r7 = r6[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r5] = r7
            r7 = r6[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r9] = r7
            r7 = r6[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r10] = r7
            r7 = r6[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r1] = r7
            bs3.C104161b.m138993b(r2, r8)
            nw3.b r2 = r12.f328564K
            com.tencent.mm.plugin.multi.talk r2 = r2.f328532a
            if (r2 != 0) goto L_0x00ba
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r7 = "steve:setMVSvrCfg null, pMVSvrCfg:"
            r1[r3] = r7
            r1[r4] = r6
            java.lang.String r3 = ", engine:"
            r1[r0] = r3
            r1[r5] = r2
            java.lang.String r0 = "simon:TalkRoomContext"
            bs3.C104161b.m138997f(r0, r1)
            goto L_0x00bd
        L_0x00ba:
            r2.setMVSvrCfg(r6, r1)
        L_0x00bd:
            int r0 = r14.f307045l
            if (r0 != 0) goto L_0x00fe
            if (r13 != 0) goto L_0x00e3
            nw3.j r13 = r12.f328573S
            int r14 = r14.f307035b
            r13.getClass()
            nw3.z r15 = new nw3.z
            r15.<init>(r13, r14)
            android.os.Looper r14 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r14 != r0) goto L_0x00dd
            r15.run()
            goto L_0x0145
        L_0x00dd:
            android.os.Handler r13 = r13.f328706b
            r13.post(r15)
            goto L_0x0145
        L_0x00e3:
            r15 = 24301(0x5eed, float:3.4053E-41)
            if (r13 != r15) goto L_0x00f5
            nw3.j r13 = r12.f328573S
            r15 = -1700(0xfffffffffffff95c, float:NaN)
            int r14 = r14.f307044k
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.mo161132b(r15, r14)
            goto L_0x0145
        L_0x00f5:
            nw3.j r13 = r12.f328573S
            r14 = -800(0xfffffffffffffce0, float:NaN)
            r15 = 0
            r13.mo161132b(r14, r15)
            goto L_0x0145
        L_0x00fe:
            if (r0 != r4) goto L_0x0145
            int r0 = r15.f329404m
            r1 = 103(0x67, float:1.44E-43)
            if (r0 != r1) goto L_0x0128
            nw3.j r0 = r12.f328573S
            java.lang.String r15 = r15.f329406o
            int r14 = r14.f307046m
            r0.getClass()
            nw3.b0 r1 = new nw3.b0
            r1.<init>(r0, r15, r13, r14)
            android.os.Looper r13 = android.os.Looper.myLooper()
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            if (r13 != r14) goto L_0x0122
            r1.run()
            goto L_0x0145
        L_0x0122:
            android.os.Handler r13 = r0.f328706b
            r13.post(r1)
            goto L_0x0145
        L_0x0128:
            nw3.j r14 = r12.f328573S
            r14.getClass()
            nw3.a0 r15 = new nw3.a0
            r15.<init>(r14, r13)
            android.os.Looper r13 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r13 != r0) goto L_0x0140
            r15.run()
            goto L_0x0145
        L_0x0140:
            android.os.Handler r13 = r14.f328706b
            r13.post(r15)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161073E(int, as3.j0, ow3.n):void");
    }

    /* renamed from: F */
    public void mo161074F() {
        C109799g0 g0Var = this.f328563J;
        g0Var.getClass();
        C104161b.m138993b(C109799g0.f328668J, "reset");
        g0Var.f328676H = 0;
        g0Var.f328675G = 0;
        g0Var.f328674F = 0;
        g0Var.f328677a = "";
        g0Var.f328678b = "";
        g0Var.f328679c = 1;
        g0Var.f328680d = 0;
        g0Var.f328681e = 0;
        g0Var.f328682f = -1;
        g0Var.f328683g = 0;
        g0Var.f328684h = 0;
        g0Var.f328685i = 0;
        g0Var.f328686j = 0;
        g0Var.f328687k = 0;
        g0Var.f328688l = 0;
        g0Var.f328689m = 0;
        g0Var.f328690n = 0;
        g0Var.f328691o = 0;
        g0Var.f328692p = 0;
        g0Var.f328693q = 0;
        g0Var.f328694r = 0;
        g0Var.f328695s = 0;
        g0Var.f328696t = -1;
        g0Var.f328697u = 0;
        g0Var.f328698v = 0;
        g0Var.f328699w = "";
        g0Var.f328700x = "";
        g0Var.f328701y = -1;
        g0Var.f328702z = "";
        g0Var.f328669A.setLength(0);
        g0Var.f328670B = -1;
        g0Var.f328671C = 0;
        g0Var.f328672D = 0;
        g0Var.f328673E = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05b9 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05de A[LOOP:6: B:194:0x05db->B:196:0x05de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x060d  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161075G(java.lang.String r21, java.lang.String r22, int r23, int r24, long r25, as3.C103860b1[] r27, as3.C103863c1[] r28, as3.C103914z0 r29, boolean r30, boolean r31) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r1 = r22
            r9 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "tagorewang:VoiceGroupUtil"
            r0 = 6
            r5 = 4
            r6 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            java.lang.String r13 = "  roomKey"
            java.lang.String r14 = "TalkRoomService"
            if (r9 != 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r15 = "printMembersLog members is null groupId: "
            r0[r12] = r15
            r0[r11] = r8
            java.lang.String r11 = "  roomid: "
            r0[r10] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r24)
            r0[r6] = r10
            r0[r5] = r13
            java.lang.Long r5 = java.lang.Long.valueOf(r25)
            r6 = 5
            r0[r6] = r5
            bs3.C104161b.m138997f(r14, r0)
            goto L_0x00d7
        L_0x003a:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r5 = r9.length
            r6 = 0
        L_0x0041:
            if (r6 >= r5) goto L_0x0098
            r10 = r9[r6]
            if (r10 != 0) goto L_0x0048
            goto L_0x0095
        L_0x0048:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = " memberId:"
            r11.append(r15)
            int r15 = r10.f306893f
            r11.append(r15)
            java.lang.String r15 = " uuid: "
            r11.append(r15)
            java.lang.String r15 = r10.f306906s
            r11.append(r15)
            java.lang.String r15 = " status: "
            r11.append(r15)
            int r15 = r10.f306891d
            r11.append(r15)
            java.lang.String r15 = "   mem.inviteTime:"
            r11.append(r15)
            int r15 = r10.f306894g
            r11.append(r15)
            java.lang.String r15 = "  mem.reason: "
            r11.append(r15)
            int r15 = r10.f306892e
            r11.append(r15)
            java.lang.String r15 = "  mem.inviteuuid: "
            r11.append(r15)
            java.lang.String r10 = r10.f306907t
            r11.append(r10)
            java.lang.String r10 = "\n"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r0.append(r10)
        L_0x0095:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x0098:
            r5 = 10
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "printMembersLog groupId: "
            r5[r12] = r6
            r6 = 1
            r5[r6] = r8
            java.lang.String r6 = "  romid: "
            r10 = 2
            r5[r10] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r10 = 3
            r5[r10] = r6
            r6 = 4
            r5[r6] = r13
            java.lang.Long r6 = java.lang.Long.valueOf(r25)
            r10 = 5
            r5[r10] = r6
            java.lang.String r6 = "  members.length: "
            r10 = 6
            r5[r10] = r6
            int r6 = r9.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 7
            r5[r10] = r6
            java.lang.String r6 = "  "
            r10 = 8
            r5[r10] = r6
            java.lang.String r0 = r0.toString()
            r6 = 9
            r5[r6] = r0
            bs3.C104161b.m138997f(r14, r5)
        L_0x00d7:
            nw3.c r5 = nw3.C109774c.m149103b()
            if (r23 != 0) goto L_0x00df
            r0 = 0
            goto L_0x00e3
        L_0x00df:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
        L_0x00e3:
            r6 = r0
            java.lang.String r0 = r7.f328593p
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00f0
            r0 = 1
            goto L_0x00f1
        L_0x00f0:
            r0 = 0
        L_0x00f1:
            r5.getClass()
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = "newOrUpdateGroup groupId: "
            r10[r12] = r11
            r11 = 1
            r10[r11] = r8
            java.lang.String r11 = " isActive: "
            r13 = 2
            r10[r13] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r13 = 3
            r10[r13] = r11
            java.lang.String r11 = "TalkRoomManager"
            bs3.C104161b.m138993b(r11, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r21)
            if (r10 == 0) goto L_0x0117
            r10 = r1
            goto L_0x0118
        L_0x0117:
            r10 = r8
        L_0x0118:
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 == 0) goto L_0x0129
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "newOrUpdateGroup invalid groupId"
            r0[r12] = r1
            bs3.C104161b.m138997f(r11, r0)
            goto L_0x015b
        L_0x0129:
            boolean r12 = nw3.C109801h0.m149216a(r22)
            if (r12 == 0) goto L_0x0136
            java.util.Map<java.lang.String, java.lang.String> r12 = r5.f328539b
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.put(r1, r10)
        L_0x0136:
            java.util.Map<java.lang.String, com.tencent.wecall.talkroom.model.TalkRoom> r12 = r5.f328538a
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r12 = r12.get(r10)
            com.tencent.wecall.talkroom.model.TalkRoom r12 = (com.tencent.wecall.talkroom.model.TalkRoom) r12
            boolean r13 = android.text.TextUtils.isEmpty(r22)
            if (r13 != 0) goto L_0x015f
            if (r12 == 0) goto L_0x015f
            if (r3 == 0) goto L_0x015f
            int r13 = r3.f307241d
            r15 = 100
            if (r13 == r15) goto L_0x015f
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "newOrUpdateGroup clientGroupId is not empty , room is not null"
            r2 = 0
            r0[r2] = r1
            bs3.C104161b.m138997f(r11, r0)
        L_0x015b:
            r15 = r24
            goto L_0x021c
        L_0x015f:
            if (r12 != 0) goto L_0x017a
            boolean r13 = nw3.C109801h0.m149216a(r22)
            if (r13 == 0) goto L_0x0171
            java.util.Map<java.lang.String, com.tencent.wecall.talkroom.model.TalkRoom> r12 = r5.f328538a
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r12 = r12.get(r1)
            com.tencent.wecall.talkroom.model.TalkRoom r12 = (com.tencent.wecall.talkroom.model.TalkRoom) r12
        L_0x0171:
            if (r12 == 0) goto L_0x017a
            java.util.Map<java.lang.String, com.tencent.wecall.talkroom.model.TalkRoom> r13 = r5.f328538a
            java.util.HashMap r13 = (java.util.HashMap) r13
            r13.put(r10, r12)
        L_0x017a:
            if (r12 == 0) goto L_0x0223
            if (r0 == 0) goto L_0x0223
            nw3.f r0 = nw3.C109770a.m149092a()     // Catch:{ Exception -> 0x0186 }
            int r0 = r0.f328597s     // Catch:{ Exception -> 0x0186 }
            r13 = r0
            goto L_0x0198
        L_0x0186:
            r0 = move-exception
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r15 = "getActiveRoomId err: "
            r16 = 0
            r13[r16] = r15
            r15 = 1
            r13[r15] = r0
            bs3.C104161b.m138997f(r4, r13)
            r0 = 0
            r13 = 0
        L_0x0198:
            nw3.f r0 = nw3.C109770a.m149092a()     // Catch:{ Exception -> 0x01a1 }
            long r7 = r0.f328598t     // Catch:{ Exception -> 0x01a1 }
            r0 = 1
            r4 = 0
            goto L_0x01b5
        L_0x01a1:
            r0 = move-exception
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "getActiveRoomKey err: "
            r17 = 0
            r7[r17] = r8
            r8 = 1
            r7[r8] = r0
            bs3.C104161b.m138997f(r4, r7)
            r0 = 1
            r4 = 0
            r7 = 0
        L_0x01b5:
            r15 = 4
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r16 = "check current active group roomId: "
            r15[r4] = r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15[r0] = r4
            java.lang.String r0 = " and roomKey: "
            r4 = 2
            r15[r4] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            r4 = 3
            r15[r4] = r0
            bs3.C104161b.m138993b(r11, r15)
            java.lang.String r0 = " -> "
            r15 = r24
            if (r13 == 0) goto L_0x01f6
            if (r13 == r15) goto L_0x01f6
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "diff roomId: "
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            r1[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r2 = 3
            r1[r2] = r0
            bs3.C104161b.m138997f(r11, r1)
            goto L_0x021c
        L_0x01f6:
            r16 = 0
            int r4 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0225
            int r4 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r4 == 0) goto L_0x0225
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "diff roomKey: "
            r3 = 0
            r1[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            r1[r2] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            r2 = 3
            r1[r2] = r0
            bs3.C104161b.m138997f(r11, r1)
        L_0x021c:
            r0 = 1
            r1 = 0
            r2 = 0
            r18 = r14
            goto L_0x0477
        L_0x0223:
            r15 = r24
        L_0x0225:
            java.lang.String r0 = "null member info, index: "
            java.lang.String r4 = " tmpId: "
            java.lang.String r7 = "setRoomKey: "
            java.lang.String r8 = "setRoomId: "
            java.lang.String r13 = "tagorewang:TalkRoom"
            if (r12 != 0) goto L_0x030c
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r16 = "newOrUpdateGroup create groupId: "
            r17 = 0
            r12[r17] = r16
            r16 = 1
            r12[r16] = r10
            bs3.C104161b.m138993b(r11, r12)
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r18 = "create groupId: "
            r12[r17] = r18
            r12[r16] = r10
            r16 = 2
            r12[r16] = r4
            r4 = 3
            r12[r4] = r1
            java.lang.String r4 = "tagorewang:TalkRoom:create"
            bs3.C104161b.m138993b(r4, r12)
            com.tencent.wecall.talkroom.model.TalkRoom r12 = new com.tencent.wecall.talkroom.model.TalkRoom
            r12.<init>(r10, r6, r3)
            boolean r3 = nw3.C109801h0.m149216a(r22)
            if (r3 == 0) goto L_0x0263
            r12.f320043e = r1
        L_0x0263:
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r6 = 0
            r3[r6] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r16 = 1
            r3[r16] = r8
            bs3.C104161b.m138993b(r13, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r7
            java.lang.Long r3 = java.lang.Long.valueOf(r25)
            r1[r16] = r3
            bs3.C104161b.m138993b(r13, r1)
            if (r9 != 0) goto L_0x0285
            r1 = 0
            goto L_0x0286
        L_0x0285:
            int r1 = r9.length
        L_0x0286:
            if (r2 != 0) goto L_0x028a
            r3 = 0
            goto L_0x028b
        L_0x028a:
            int r3 = r2.length
        L_0x028b:
            r6 = 0
        L_0x028c:
            if (r6 == r1) goto L_0x02f6
            r7 = r9[r6]
            if (r7 != 0) goto L_0x02a7
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r13 = 1
            r7[r13] = r8
            bs3.C104161b.m138997f(r4, r7)
            r16 = r1
            r17 = r3
            goto L_0x02ef
        L_0x02a7:
            r8 = 0
        L_0x02a8:
            if (r8 == r3) goto L_0x02da
            r13 = r2[r8]
            if (r13 == 0) goto L_0x02cf
            r16 = r1
            int r1 = r13.f306940b
            r17 = r3
            int r3 = r7.f306889b
            if (r1 != r3) goto L_0x02d3
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "member info: "
            r8 = 0
            r1[r8] = r3
            r3 = 1
            r1[r3] = r7
            java.lang.String r3 = " profile: "
            r8 = 2
            r1[r8] = r3
            r3 = 3
            r1[r3] = r13
            bs3.C104161b.m138993b(r4, r1)
            goto L_0x02df
        L_0x02cf:
            r16 = r1
            r17 = r3
        L_0x02d3:
            int r8 = r8 + 1
            r1 = r16
            r3 = r17
            goto L_0x02a8
        L_0x02da:
            r16 = r1
            r17 = r3
            r13 = 0
        L_0x02df:
            nw3.d r1 = new nw3.d
            r1.<init>(r7, r13)
            java.util.Map<java.lang.String, nw3.d> r3 = r12.f320125n
            java.lang.String r7 = r1.mo161024a()
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            r3.put(r7, r1)
        L_0x02ef:
            int r6 = r6 + 1
            r1 = r16
            r3 = r17
            goto L_0x028c
        L_0x02f6:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "did create"
            r2 = 0
            r0[r2] = r1
            bs3.C104161b.m138993b(r4, r0)
            java.util.Map<java.lang.String, com.tencent.wecall.talkroom.model.TalkRoom> r0 = r5.f328538a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r10, r12)
            r18 = r14
            goto L_0x0448
        L_0x030c:
            r15 = 2
            r16 = 1
            r17 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r18 = "newOrUpdateGroup update groupId: "
            r15[r17] = r18
            r15[r16] = r10
            bs3.C104161b.m138993b(r11, r15)
            java.lang.String r15 = "tagorewang:TalkRoom:update"
            r18 = r14
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r19 = "updateAll groupId: "
            r14[r17] = r19
            r14[r16] = r10
            r16 = 2
            r14[r16] = r4
            r4 = 3
            r14[r4] = r1
            bs3.C104161b.m138993b(r15, r14)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x033a
            goto L_0x034d
        L_0x033a:
            boolean r4 = nw3.C109801h0.m149216a(r10)
            if (r4 == 0) goto L_0x0343
            r12.f320043e = r10
            goto L_0x0345
        L_0x0343:
            r12.f320042d = r10
        L_0x0345:
            if (r6 == 0) goto L_0x034d
            int r4 = r6.intValue()
            r12.f320045g = r4
        L_0x034d:
            boolean r4 = nw3.C109801h0.m149216a(r22)
            if (r4 == 0) goto L_0x0355
            r12.f320043e = r1
        L_0x0355:
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r6 = 0
            r4[r6] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r14 = 1
            r4[r14] = r8
            bs3.C104161b.m138993b(r13, r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r7
            java.lang.Long r4 = java.lang.Long.valueOf(r25)
            r1[r14] = r4
            bs3.C104161b.m138993b(r13, r1)
            r12.mo157176e(r3)
            if (r9 != 0) goto L_0x0379
            r1 = 0
            goto L_0x037a
        L_0x0379:
            int r1 = r9.length
        L_0x037a:
            if (r2 != 0) goto L_0x037e
            r2 = 0
            goto L_0x037f
        L_0x037e:
            int r2 = r2.length
        L_0x037f:
            if (r1 != 0) goto L_0x0390
            if (r2 != 0) goto L_0x0390
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "updateAll null VoiceGroupMem or VoiceGroupUsrProfile array."
            r2 = 0
            r0[r2] = r1
            bs3.C104161b.m138997f(r15, r0)
            goto L_0x0448
        L_0x0390:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.Map<java.lang.String, nw3.d> r4 = r12.f320125n
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.util.Set r4 = r4.keySet()
            r3.<init>(r4)
            java.lang.String r4 = cs3.C106962a.f320180a
            r3.remove(r4)
            r4 = 0
        L_0x03a3:
            if (r4 == r1) goto L_0x03eb
            r6 = r9[r4]
            if (r6 != 0) goto L_0x03ba
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r8 = 1
            r6[r8] = r7
            bs3.C104161b.m138997f(r15, r6)
            goto L_0x03e8
        L_0x03ba:
            r7 = 0
            r8 = 1
            java.lang.String r14 = r6.f306906s
            nw3.d r14 = r12.mo157173b(r14)
            if (r14 != 0) goto L_0x03de
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r14 = "add new member"
            r8[r7] = r14
            bs3.C104161b.m138993b(r15, r8)
            nw3.d r14 = new nw3.d
            r14.<init>(r6)
            java.util.Map<java.lang.String, nw3.d> r6 = r12.f320125n
            java.lang.String r7 = r14.mo161024a()
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            r6.put(r7, r14)
            goto L_0x03e1
        L_0x03de:
            r14.mo161025b(r6)
        L_0x03e1:
            java.lang.String r6 = r14.mo161024a()
            r3.remove(r6)
        L_0x03e8:
            int r4 = r4 + 1
            goto L_0x03a3
        L_0x03eb:
            r0 = 0
        L_0x03ec:
            if (r0 == r2) goto L_0x03f1
            int r0 = r0 + 1
            goto L_0x03ec
        L_0x03f1:
            java.util.Iterator r0 = r3.iterator()
        L_0x03f5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0423
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = "keyset"
            r7 = 0
            r4[r7] = r6
            r6 = 1
            r4[r6] = r1
            bs3.C104161b.m138993b(r15, r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "remove"
            r2[r7] = r4
            java.util.Map<java.lang.String, nw3.d> r4 = r12.f320125n
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r1 = r4.remove(r1)
            r2[r6] = r1
            bs3.C104161b.m138993b(r13, r2)
            goto L_0x03f5
        L_0x0423:
            r0 = 2
            r1 = 1
            r2 = 0
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x043f
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "updateAll not update uuid keyset.size(): "
            r0[r2] = r4
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            bs3.C104161b.m138997f(r15, r0)
        L_0x043f:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "did updateAll"
            r0[r2] = r1
            bs3.C104161b.m138993b(r15, r0)
        L_0x0448:
            nw3.j r0 = r5.f328540c
            if (r0 == 0) goto L_0x046a
            if (r30 == 0) goto L_0x046a
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r1 = r5.mo161016d(r10)
            nw3.o r2 = new nw3.o
            r2.<init>(r0, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r1 != r3) goto L_0x0465
            r2.run()
            goto L_0x046a
        L_0x0465:
            android.os.Handler r0 = r0.f328706b
            r0.post(r2)
        L_0x046a:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "asyncWriteBackCache"
            r3 = 0
            r1[r3] = r2
            bs3.C104161b.m138993b(r11, r1)
            r2 = 1
            r1 = 0
        L_0x0477:
            r3 = 16
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r3 = "engine handleVoiceGroupMemberChange"
            r7[r1] = r3
            r7[r0] = r21
            r8 = r20
            java.lang.String r0 = r8.f328593p
            r1 = 2
            r7[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1 = 3
            r7[r1] = r0
            int r0 = r8.f328597s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 4
            r7[r1] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            r1 = 5
            r7[r1] = r0
            long r0 = r8.f328598t
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 6
            r7[r1] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1 = 7
            r7[r1] = r0
            java.lang.String r0 = " isCurrentRoom: "
            r1 = 8
            r7[r1] = r0
            r6 = 0
            r0 = 1
            r10 = 0
            r1 = r20
            r2 = r21
            r3 = r24
            r4 = r25
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 9
            r7[r2] = r1
            java.lang.String r1 = " members.length: "
            r2 = 10
            r7[r2] = r1
            r1 = 11
            if (r9 == 0) goto L_0x04d8
            int r2 = r9.length
            goto L_0x04d9
        L_0x04d8:
            r2 = 0
        L_0x04d9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r1] = r2
            r1 = 12
            java.lang.String r2 = " isCallBackEngine: "
            r7[r1] = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r31)
            r2 = 13
            r7[r2] = r1
            r1 = 14
            java.lang.String r3 = " mFirstGetAudioData: "
            r7[r1] = r3
            r1 = 15
            boolean r3 = r8.f328602x
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7[r1] = r3
            r11 = r18
            bs3.C104161b.m138993b(r11, r7)
            nw3.c r1 = nw3.C109774c.m149103b()
            java.lang.String r3 = r8.f328593p
            boolean r1 = r1.mo161022j(r3, r10)
            if (r1 == 0) goto L_0x05b7
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "handleVoiceGroupMemberChange isGroupActive mFirstGetAudioData: "
            r1[r10] = r3
            boolean r3 = r8.f328602x
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r0] = r3
            java.lang.String r3 = " mGroupId: "
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = r8.f328593p
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = " roomId: "
            r4 = 4
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r4 = 5
            r1[r4] = r3
            bs3.C104161b.m138997f(r11, r1)
            boolean r1 = r8.f328602x
            if (r1 == 0) goto L_0x05b7
            r8.f328602x = r10
            r8.f328591n = r0
            android.content.Context r1 = bs3.C104162c.f308396a
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x057e }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x057e }
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x057e }
            if (r1 != 0) goto L_0x054f
            goto L_0x057e
        L_0x054f:
            int r3 = r1.getType()     // Catch:{ Exception -> 0x057e }
            if (r3 != r0) goto L_0x0556
            goto L_0x057e
        L_0x0556:
            int r3 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
            r4 = 3
            if (r3 != r4) goto L_0x055e
            goto L_0x0579
        L_0x055e:
            int r3 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
            if (r3 < r0) goto L_0x056c
            int r3 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
            r4 = 5
            if (r3 >= r4) goto L_0x056d
            goto L_0x057e
        L_0x056c:
            r4 = 5
        L_0x056d:
            int r3 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
            if (r3 < r4) goto L_0x057a
            int r3 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
            if (r3 >= r2) goto L_0x057a
        L_0x0579:
            goto L_0x057e
        L_0x057a:
            int r1 = r1.getSubtype()     // Catch:{ Exception -> 0x057e }
        L_0x057e:
            r1 = 4
            java.util.TimerTask r2 = r8.f328569Q
            if (r2 == 0) goto L_0x058d
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "refreashTalkingTime mTalkDurationTimerTask is null"
            r1[r10] = r2
            bs3.C104161b.m138997f(r11, r1)
            goto L_0x05b7
        L_0x058d:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "refreashTalkingTime mTalkRoomTalkingCallBack: "
            r1[r10] = r2
            r2 = 0
            r1[r0] = r2
            java.lang.String r2 = " mIsHoldOn: "
            r3 = 2
            r1[r3] = r2
            boolean r2 = r8.f328572R0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            bs3.C104161b.m138997f(r11, r1)
            nw3.h r13 = new nw3.h
            r13.<init>(r8)
            r8.f328569Q = r13
            java.util.Timer r12 = r8.f328571R
            r14 = 1000(0x3e8, double:4.94E-321)
            r16 = 1000(0x3e8, double:4.94E-321)
            r12.scheduleAtFixedRate(r13, r14, r16)
        L_0x05b7:
            if (r9 != 0) goto L_0x05ba
            return
        L_0x05ba:
            if (r31 == 0) goto L_0x0615
            r6 = 0
            r1 = r20
            r2 = r21
            r3 = r24
            r4 = r25
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)
            if (r1 == 0) goto L_0x0615
            int r1 = r9.length
            if (r1 <= 0) goto L_0x0615
            nw3.b r1 = r8.f328564K
            if (r1 == 0) goto L_0x0615
            int r1 = r9.length
            int[] r1 = new int[r1]
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 0
        L_0x05db:
            int r4 = r9.length
            if (r3 >= r4) goto L_0x05ef
            r4 = r9[r3]
            int r4 = r4.f306893f
            r1[r3] = r4
            r2.append(r4)
            java.lang.String r4 = ","
            r2.append(r4)
            int r3 = r3 + 1
            goto L_0x05db
        L_0x05ef:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "engine handleVoiceGroupMemberChange engine.OnMembersChanged memberid: "
            r3[r10] = r4
            java.lang.String r2 = r2.toString()
            r3[r0] = r2
            bs3.C104161b.m138997f(r11, r3)
            nw3.b r2 = r8.f328564K
            if (r2 != 0) goto L_0x060d
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onMebersChangedToEngine engine is null"
            r0[r10] = r1
            bs3.C104161b.m138997f(r11, r0)
            goto L_0x0615
        L_0x060d:
            com.tencent.mm.plugin.multi.talk r0 = r2.f328532a
            if (r0 != 0) goto L_0x0612
            goto L_0x0615
        L_0x0612:
            r0.OnMembersChanged(r1)
        L_0x0615:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161075G(java.lang.String, java.lang.String, int, int, long, as3.b1[], as3.c1[], as3.z0, boolean, boolean):void");
    }

    /* renamed from: H */
    public final boolean mo161076H() {
        int i;
        C104161b.m138993b("TalkRoomService", "initEngine", this.f328593p, Integer.valueOf(this.f328597s), Long.valueOf(this.f328598t), Integer.valueOf(this.f328587g));
        try {
            i = this.f328564K.mo161008f();
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "initEngine", e);
            i = -99999;
        }
        if (i >= 0) {
            return true;
        }
        C109799g0.m149205f(-3001);
        this.f328563J.mo161128j(201);
        this.f328564K = null;
        C104161b.m138997f("TalkRoomService", "initEngine engine.protocalInit error", Integer.valueOf(i));
        return false;
    }

    /* renamed from: I */
    public final boolean mo161077I() {
        C104161b.m138993b("TalkRoomService", "initService");
        if (f328551V0 != null) {
            int a = C107842p.m146108a();
            Log.m105924i("MicroMsg.MT.MultiTalkEngine", "loadVoipCodecLib cpuFlag:" + a);
            C102300g.m134933a();
            C88957l.m111079o("voipMain", C105845w.class.getClassLoader());
        }
        this.f328564K = new C109772b();
        this.f328577U = this.f328593p;
        mo161082N();
        C104161b.m138995d("new the handlerthread in initService function", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TalkRoomService");
        this.f328586f = handlerThread;
        handlerThread.start();
        this.f328585e = new Handler(this.f328586f.getLooper(), this);
        this.f328565L = new C109783a();
        return true;
    }

    /* renamed from: J */
    public final boolean mo161078J(String str, int i, long j, boolean z) {
        if (z) {
            return C104166f.m139003c(str, this.f328593p);
        }
        C104161b.m138997f("TalkRoomService", "isCurrentRoom groupId: ", str, " mGroupId: ", this.f328593p, "roomId: ", Integer.valueOf(i), " mRoomId: ", Integer.valueOf(this.f328597s), " roomKey: ", Long.valueOf(j), " mRoomKey: ", Long.valueOf(this.f328598t));
        return C104166f.m139003c(str, this.f328593p) && i == this.f328597s && j == this.f328598t;
    }

    /* renamed from: K */
    public boolean mo161079K() {
        boolean z;
        try {
            z = ((AudioManager) C104162c.f308396a.getSystemService("audio")).isSpeakerphoneOn();
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "isSpeakerOn ", e);
            z = false;
        }
        C104161b.m138993b("TalkRoomService", "isSpeakerOn ret: ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: L */
    public boolean mo161080L() {
        C104161b.m138997f("TalkRoomService", "state: ", Integer.valueOf(this.f328587g));
        return this.f328587g != 0;
    }

    /* renamed from: M */
    public boolean mo161081M(String str, int i, long j, int i2) {
        String str2 = str;
        int i3 = i2;
        C104161b.m138997f("TalkRoomService", "rejectTalkRoom groupId: ", str2, " mGroupId: ", this.f328593p, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(j), " reason: ", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!(3 != (1 == i3 ? (char) 1 : 3) || i3 == 7 || this.f328601w == 0)) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f328601w) / 1000;
        }
        String str3 = str;
        int i4 = i;
        long j2 = j;
        boolean c = C112675e.m154053e().mo164407c(new C110085i(str3, i4, j2, i2));
        if (mo161078J(str3, i4, j2, false)) {
            this.f328563J.mo161124a("reject", "req", String.valueOf(c), String.valueOf(this.f328587g));
            int i5 = i;
            long j3 = j;
        } else {
            C109799g0.m149209k(str2, i, j, "reject", "req", String.valueOf(c), String.valueOf(this.f328587g));
        }
        mo161098i(str, i, j, false);
        C104161b.m138997f("TalkRoomService", "rejectTalkRoom ret: ", Boolean.valueOf(c));
        return c;
    }

    /* renamed from: N */
    public final void mo161082N() {
        this.f328556C = -1;
        this.f328557D = -1;
        this.f328558E = -1;
        this.f328559F = -1;
        this.f328560G = -1;
        this.f328561H = -1;
        this.f328562I = -1;
        C104161b.m138997f("TalkRoomService", "multitalk voiceMsg local seq reset");
    }

    /* renamed from: O */
    public final void mo161083O(String str, int i, long j, int i2, int i3, boolean z, String str2) {
        C104161b.m138997f("TalkRoomService", "sendEnterGroupScence groupId: ", str, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(j), " enterType: ", Integer.valueOf(i3), " isSenceCircle: ", Boolean.valueOf(z), " wXgroupId: ", str2);
        if (i == 0 || j == 0) {
            C104161b.m138994c("TalkRoomService", "roomId or roomkey is 0..return.");
            return;
        }
        if (!(i3 != 1)) {
            C109799g0 g0Var = this.f328563J;
            g0Var.getClass();
            C104161b.m138993b(C109799g0.f328668J, "endAnswerTime", Long.valueOf(g0Var.f328676H));
            if (g0Var.f328676H == 0) {
                g0Var.f328693q = 0;
            } else {
                g0Var.f328693q = System.currentTimeMillis() - g0Var.f328676H;
            }
        }
        this.f328563J.mo161125b();
        talk talk = this.f328564K.f328532a;
        C110081e eVar = new C110081e(str, i, j, talk == null ? new byte[0] : talk.field_capInfo, i2, i3, str2);
        C112675e.m154053e().mo164407c(eVar);
        if (z) {
            this.f328585e.removeCallbacks(this.f328578U0);
            this.f328576T0 = eVar;
            this.f328585e.postDelayed(this.f328578U0, 3000);
        }
    }

    /* renamed from: P */
    public void mo161084P(boolean z) {
        try {
            mo161091W();
            mo161090V();
            if (z) {
                mo161087S();
                mo161088T();
            }
            C104161b.m138997f("TalkRoomService", "setRecordDevActive active: ", Boolean.valueOf(z));
        } catch (Throwable th) {
            C104161b.m138997f("TalkRoomService", "setRecordDevActive active: ", Boolean.valueOf(z), th);
        }
    }

    /* renamed from: Q */
    public final void mo161085Q(int i) {
        C104161b.m138997f("TalkRoomService", "setState newState: ", Integer.valueOf(i));
        if (this.f328587g != i) {
            this.f328587g = i;
            C109804j jVar = this.f328573S;
            jVar.getClass();
            C109817t tVar = new C109817t(jVar, i);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                tVar.run();
            } else {
                jVar.f328706b.post(tVar);
            }
        }
    }

    /* renamed from: R */
    public final void mo161086R() {
        C104161b.m138997f("TalkRoomService", "hello timer start~~");
        if (this.f328566M != null) {
            C104161b.m138997f("TalkRoomService", "dealWithInit enter talkroom not first time");
            return;
        }
        try {
            C109786b bVar = new C109786b();
            this.f328566M = bVar;
            this.f328568P.schedule(bVar, 0, (long) f328552W0);
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "startNooper: ", e);
        }
    }

    /* renamed from: S */
    public final void mo161087S() {
        mo161090V();
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        int i = talk.f314039a;
        int i2 = talk.f314040b;
        C109789e eVar = new C109789e(atomicInteger, atomicInteger2);
        int i3 = -100;
        try {
            C107065e eVar2 = f328551V0;
            if (eVar2 != null) {
                i3 = ((C105845w.C105846a) eVar2).mo150831a(i, i2, eVar);
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "startPlayer: ", Integer.valueOf(i), Integer.valueOf(i2), e);
        }
        C104161b.m138993b("TalkRoomService", "startPlayer samplerate: ", " frameDuration: ", Integer.valueOf(i2), " ret: ", Integer.valueOf(i3));
        if (i3 <= 0) {
            this.f328563J.mo161128j(101);
            C109799g0.m149204e(-2001);
            this.f328563J.f328687k |= 1;
            this.f328573S.mo161132b(-500, (Object) null);
        }
        C104161b.m138997f("TalkRoomService", "audioAdapter startPlayer ret: ", Integer.valueOf(i3));
    }

    /* renamed from: T */
    public final void mo161088T() {
        mo161091W();
        int i = talk.f314039a;
        int i2 = talk.f314040b;
        C109788d dVar = new C109788d();
        int i3 = -100;
        try {
            C107065e eVar = f328551V0;
            if (eVar != null) {
                i3 = ((C105845w.C105846a) eVar).mo150832b(i, i2, dVar);
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "startRecord: ", e);
        }
        C104161b.m138993b("TalkRoomService", "startRecord samplerate: ", " frameDuration: ", Integer.valueOf(i2), " ret: ", Integer.valueOf(i3));
        if (i3 <= 0) {
            this.f328563J.mo161128j(101);
            C109799g0.m149204e(-2001);
            this.f328573S.mo161132b(-500, (Object) null);
        }
        if (i3 > 0) {
            this.f328563J.f328687k &= -2;
        } else {
            this.f328563J.f328687k |= 1;
        }
        C104161b.m138997f("TalkRoomService", "audioAdapter startRecord ret: ", Integer.valueOf(i3));
    }

    /* renamed from: U */
    public void mo161089U() {
        try {
            C104161b.m138997f("TalkRoomService", "stopHoldeOnPusher ");
            Runnable runnable = this.f328574S0;
            if (runnable != null) {
                this.f328585e.removeCallbacks(runnable);
            }
        } catch (Throwable th) {
            C104161b.m138997f("TalkRoomService", " stopTimer: ", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r9 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0().f314469K.f308783l;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161090V() {
        /*
            r11 = this;
            java.lang.String r0 = "getService(SubCoreAudio::class.java)"
            java.lang.Class<pu0.b> r1 = pu0.C110248b.class
            java.lang.String r2 = "MicroMsg.MT.MultiTalkEngine"
            java.lang.String r3 = "TalkRoomService"
            r4 = 1
            r5 = 0
            r6 = 2
            ds3.e r7 = f328551V0     // Catch:{ Exception -> 0x009b }
            if (r7 == 0) goto L_0x00a7
            nw3.g0 r8 = r11.f328563J     // Catch:{ Exception -> 0x009b }
            r9 = r7
            com.tencent.mm.plugin.multitalk.model.w$a r9 = (com.tencent.p014mm.plugin.multitalk.model.C105845w.C105846a) r9     // Catch:{ Exception -> 0x009b }
            java.lang.String r10 = "getMultiTalkPlayVolume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.multitalk.model.w r9 = com.tencent.p014mm.plugin.multitalk.model.C105845w.this     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.multitalk.model.o r9 = r9.f314799e     // Catch:{ Exception -> 0x009b }
            if (r9 == 0) goto L_0x0036
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r9 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x009b }
            c82.b r9 = r9.f314469K     // Catch:{ Exception -> 0x009b }
            if (r9 == 0) goto L_0x0036
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r9 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x009b }
            c82.b r9 = r9.f314469K     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.voip.model.d r9 = r9.f308783l     // Catch:{ Exception -> 0x009b }
            if (r9 == 0) goto L_0x0036
            int r9 = r9.mo152548g()     // Catch:{ Exception -> 0x009b }
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            di3.d r10 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x009b }
            gy3.C87412m.m108593f(r10, r0)     // Catch:{ Exception -> 0x009b }
            pu0.b r10 = (pu0.C110248b) r10     // Catch:{ Exception -> 0x009b }
            ou0.a r10 = r10.f329779e     // Catch:{ Exception -> 0x009b }
            if (r10 != 0) goto L_0x0058
            ou0.c r10 = new ou0.c     // Catch:{ Exception -> 0x009b }
            r10.<init>()     // Catch:{ Exception -> 0x009b }
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x009b }
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ Exception -> 0x009b }
            pu0.b r1 = (pu0.C110248b) r1     // Catch:{ Exception -> 0x009b }
            java.lang.String[] r0 = r1.f329781g     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = "music"
            r0[r5] = r1     // Catch:{ Exception -> 0x009b }
        L_0x0058:
            int r0 = r10.mo157507d(r9)     // Catch:{ Exception -> 0x009b }
            float r0 = (float) r0     // Catch:{ Exception -> 0x009b }
            int r1 = pu0.C110248b.yx0(r9)     // Catch:{ Exception -> 0x009b }
            float r1 = (float) r1     // Catch:{ Exception -> 0x009b }
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ Exception -> 0x009b }
            r8.f328670B = r0     // Catch:{ Exception -> 0x009b }
            nw3.g0 r0 = r11.f328563J     // Catch:{ Exception -> 0x009b }
            r1 = r7
            com.tencent.mm.plugin.multitalk.model.w$a r1 = (com.tencent.p014mm.plugin.multitalk.model.C105845w.C105846a) r1     // Catch:{ Exception -> 0x009b }
            java.lang.String r8 = "getAudioPlayerErrorCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.multitalk.model.w r1 = com.tencent.p014mm.plugin.multitalk.model.C105845w.this     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.multitalk.model.o r1 = r1.f314799e     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0091
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x009b }
            c82.b r1 = r1.f314469K     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0091
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x009b }
            c82.b r1 = r1.f314469K     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.voip.model.d r1 = r1.f308783l     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0091
            int r1 = r1.mo152549h()     // Catch:{ Exception -> 0x009b }
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            r0.f328673E = r1     // Catch:{ Exception -> 0x009b }
            com.tencent.mm.plugin.multitalk.model.w$a r7 = (com.tencent.p014mm.plugin.multitalk.model.C105845w.C105846a) r7     // Catch:{ Exception -> 0x009b }
            r7.mo150833c()     // Catch:{ Exception -> 0x009b }
            r0 = 1
            goto L_0x00a8
        L_0x009b:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = "stopPlayer: "
            r1[r5] = r2
            r1[r4] = r0
            bs3.C104161b.m138997f(r3, r1)
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = "stopPlayer ret: "
            r1[r5] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r4] = r2
            bs3.C104161b.m138993b(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161090V():boolean");
    }

    /* renamed from: W */
    public final boolean mo161091W() {
        boolean z;
        try {
            C107065e eVar = f328551V0;
            if (eVar != null) {
                C109799g0 g0Var = this.f328563J;
                Log.m105924i("MicroMsg.MT.MultiTalkEngine", "getMultiTalkRecordReadNum");
                C110390f fVar = C105845w.this.f314800f;
                g0Var.f328671C = fVar != null ? fVar.mo161897b() : -2;
                C109799g0 g0Var2 = this.f328563J;
                Log.m105918d("MicroMsg.MT.MultiTalkEngine", "getAudioRecorderErrorCode");
                C110390f fVar2 = C105845w.this.f314800f;
                g0Var2.f328672D = fVar2 != null ? fVar2.f330222a : 0;
                z = ((C105845w.C105846a) eVar).mo150834d();
                C104161b.m138993b("TalkRoomService", "stopRecord ret: ", Boolean.valueOf(z));
                return z;
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "stopRecord: ", e);
        }
        z = false;
        C104161b.m138993b("TalkRoomService", "stopRecord ret: ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: Y */
    public void mo161092Y(boolean z) {
        talk talk;
        C109799g0 g0Var = this.f328563J;
        String str = this.f328593p;
        g0Var.f328677a = str;
        g0Var.f328678b = this.f328595q;
        if (C104166f.m139002b(str)) {
            this.f328563J.f328677a = "";
        }
        if (C104166f.m139002b(this.f328563J.f328678b)) {
            this.f328563J.f328678b = "";
        }
        C109799g0 g0Var2 = this.f328563J;
        g0Var2.f328679c = 1;
        g0Var2.f328680d = this.f328597s;
        g0Var2.f328681e = this.f328598t;
        mo161082N();
        C104161b.m138993b("TalkRoomService", "uninitService isUpload: ", Boolean.valueOf(z));
        C104161b.m138993b("TalkRoomService", "releaseConpent");
        try {
            mo161091W();
        } catch (Throwable th) {
            C104161b.m138997f("TalkRoomService", "releaseConpent ", th);
        }
        try {
            mo161090V();
        } catch (Throwable th4) {
            C104161b.m138997f("TalkRoomService", "releaseConpent ", th4);
        }
        ((HashMap) this.f328584d).remove(this.f328593p);
        this.f328570Q0 = false;
        mo161085Q(0);
        this.f328590j = false;
        this.f328597s = 0;
        this.f328598t = 0;
        this.f328593p = null;
        this.f328592o = null;
        this.f328595q = null;
        this.f328596r = 0;
        this.f328599u = 0;
        this.f328600v = 0;
        this.f328602x = true;
        this.f328580W = true;
        this.f328601w = 0;
        this.f328604y = 0;
        this.f328589i = false;
        this.f328572R0 = false;
        mo161089U();
        this.f328585e.removeMessages(1);
        C109772b bVar = this.f328564K;
        if (!(bVar == null || (talk = bVar.f328532a) == null)) {
            talk.field_capInfo = null;
        }
        mo161096h();
        mo161095g();
        try {
            C104161b.m138997f("TalkRoomService", "cancelTalkDurationTimerTask");
            TimerTask timerTask = this.f328569Q;
            if (timerTask != null) {
                timerTask.cancel();
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "cancelTalkDurationTimerTask: ", e);
        }
        this.f328569Q = null;
        this.f328585e.removeCallbacks(this.f328578U0);
        this.f328576T0 = null;
        this.f328591n = false;
        this.f328606z = 0;
        int i = -99999;
        C109772b bVar2 = this.f328564K;
        if (bVar2 != null) {
            try {
                bVar2.mo161006d();
                i = this.f328564K.mo161003a();
            } catch (Throwable th5) {
                C104161b.m138997f("TalkRoomService", "uninitService", th5);
            }
            C104161b.m138997f("TalkRoomService", "uninitService mid", Integer.valueOf(i));
        }
        C109772b bVar3 = this.f328564K;
        if (bVar3 != null) {
            try {
                i = bVar3.mo161011i();
            } catch (Exception e2) {
                C104161b.m138997f("TalkRoomService", "uninitService 2", e2);
            }
        }
        this.f328564K = null;
        C104161b.m138997f("TalkRoomService", "steve:uninitService set engine null!");
        if (z) {
            String c = this.f328563J.mo161126c();
            if (!TextUtils.isEmpty(this.f328563J.f328677a) || !TextUtils.isEmpty(this.f328563J.f328678b)) {
                C109799g0.m149207h(c);
                this.f328585e.removeMessages(4);
                this.f328585e.sendEmptyMessageDelayed(4, 0);
            }
            mo161074F();
            try {
                AudioManager audioManager = (AudioManager) C104162c.f308396a.getSystemService("audio");
                audioManager.setMode(0);
                C104161b.m138997f("TalkRoomService", "resumeAudioConfig mode: ", Integer.valueOf(audioManager.getMode()), " isSpeaker: ", Boolean.valueOf(audioManager.isSpeakerphoneOn()));
            } catch (Throwable th6) {
                C104161b.m138997f("TalkRoomService", "resumeAudioConfig ", th6);
            }
        }
        if (this.f328586f != null) {
            C104161b.m138993b("quit the handlerthread", new Object[0]);
            this.f328586f.quitSafely();
        }
        C104161b.m138993b("TalkRoomService", "uninitService end error", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo160863a(String str, int i, int i2, int i3, Object obj) {
        if (C104166f.m139001a("GLOBAL_TOPIC_NETWORK_CHANGE", str) && mo161080L()) {
            if (!this.f328591n && !this.f328590j) {
                return;
            }
            if (i == 21) {
                C109803i0.m149217a(C104162c.f308396a);
                int i4 = this.f328597s;
                if (i4 == 0 || this.f328598t == 0) {
                    C104161b.m138997f("TalkRoomService", "sendRedirect mRoomId valid(session ended)");
                    return;
                }
                C104161b.m138997f("TalkRoomService", "sendRedirect", this.f328593p, Integer.valueOf(i4));
                this.f328563J.mo161125b();
                boolean c = C112675e.m154053e().mo164407c(new C110084h(this.f328593p, this.f328597s, this.f328598t, C109774c.m149103b().mo161019g(this.f328593p), this.f328606z));
                this.f328563J.mo161124a("redirect", "req", String.valueOf(c), String.valueOf(this.f328587g));
                C104161b.m138997f("TalkRoomService", "sendRedirect ret: ", Boolean.valueOf(c));
            } else if (i == 33) {
                C109772b bVar = this.f328564K;
                int a = C109803i0.m149217a(C104162c.f308396a);
                talk talk = bVar.f328532a;
                if (talk != null) {
                    talk.onNetworkChange(a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0901  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0911  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0920  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0932  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0944  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0968  */
    /* JADX WARNING: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150596b(int r45, int r46, java.lang.String r47, zr3.C112672d r48) {
        /*
            r44 = this;
            r15 = r44
            r0 = r45
            r14 = r46
            r13 = r48
            r1 = 6
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r17 = 0
            java.lang.String r3 = "CLTNOT onNetSceneEnd errCode:"
            r2[r17] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r46)
            r12 = 1
            r2[r12] = r3
            r11 = 2
            java.lang.String r3 = " errType: "
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r45)
            r10 = 3
            r2[r10] = r3
            r9 = 4
            java.lang.String r3 = " scene.getType(): "
            r2[r9] = r3
            if (r13 == 0) goto L_0x0034
            int r3 = r48.mo161498d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0036
        L_0x0034:
            java.lang.String r3 = ""
        L_0x0036:
            r4 = 5
            r2[r4] = r3
            java.lang.String r8 = "TalkRoomService"
            bs3.C104161b.m138993b(r8, r2)
            r2 = 201(0xc9, float:2.82E-43)
            r6 = 202(0xca, float:2.83E-43)
            r5 = 203(0xcb, float:2.84E-43)
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 == r12) goto L_0x0057
            if (r0 != r11) goto L_0x004b
            goto L_0x0057
        L_0x004b:
            r16 = 208(0xd0, float:2.91E-43)
            r18 = 207(0xcf, float:2.9E-43)
            r19 = 9
            r22 = 205(0xcd, float:2.87E-43)
            r24 = 210(0xd2, float:2.94E-43)
            goto L_0x0132
        L_0x0057:
            r7 = 20
            java.lang.Integer[] r7 = new java.lang.Integer[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r2)
            r7[r17] = r23
            r23 = -1004(0xfffffffffffffc14, float:NaN)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)
            r7[r12] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r6)
            r7[r11] = r23
            r23 = -1107(0xfffffffffffffbad, float:NaN)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)
            r7[r10] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            r7[r9] = r23
            r23 = -1205(0xfffffffffffffb4b, float:NaN)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            r7[r1] = r23
            r23 = 7
            r24 = -1304(0xfffffffffffffae8, float:NaN)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r7[r23] = r24
            r23 = 8
            r22 = 205(0xcd, float:2.87E-43)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r22)
            r7[r23] = r24
            r23 = -1403(0xfffffffffffffa85, float:NaN)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)
            r19 = 9
            r7[r19] = r23
            r23 = 10
            r18 = 207(0xcf, float:2.9E-43)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r18)
            r7[r23] = r24
            r23 = 11
            r24 = -1502(0xfffffffffffffa22, float:NaN)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r7[r23] = r24
            r23 = 12
            r21 = 209(0xd1, float:2.93E-43)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r21)
            r7[r23] = r24
            r23 = 13
            r24 = -1512(0xfffffffffffffa18, float:NaN)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r7[r23] = r24
            r23 = 14
            r20 = 206(0xce, float:2.89E-43)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r20)
            r7[r23] = r24
            r23 = 15
            r24 = -1522(0xfffffffffffffa0e, float:NaN)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r7[r23] = r24
            r23 = 16
            r16 = 208(0xd0, float:2.91E-43)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r16)
            r7[r23] = r24
            r23 = 17
            r24 = -1532(0xfffffffffffffa04, float:NaN)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r7[r23] = r24
            r23 = 18
            r24 = 210(0xd2, float:2.94E-43)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r24)
            r7[r23] = r25
            r23 = 19
            r25 = -1542(0xfffffffffffff9fa, float:NaN)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r25)
            r7[r23] = r25
            java.util.Map r7 = bs3.C0377a.m322a(r7)
            int r23 = r48.mo161498d()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            java.util.HashMap r7 = (java.util.HashMap) r7
            boolean r5 = r7.containsKey(r5)
            if (r5 == 0) goto L_0x0132
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            java.lang.Object r5 = r7.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            nw3.C109799g0.m149206g(r5)
        L_0x0132:
            java.lang.String r7 = "resp"
            r5 = 211(0xd3, float:2.96E-43)
            r4 = 212(0xd4, float:2.97E-43)
            java.lang.String r25 = "create"
            r6 = -1
            r1 = -100
            r3 = 0
            if (r14 != r6) goto L_0x039c
            int r0 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            if (r0 != r2) goto L_0x0196
            r0 = r13
            ow3.d r0 = (ow3.C110080d) r0     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r15.f328595q     // Catch:{ Exception -> 0x038f }
            java.lang.String r4 = r0.f329385j     // Catch:{ Exception -> 0x038f }
            boolean r2 = bs3.C104166f.m139003c(r2, r4)     // Catch:{ Exception -> 0x038f }
            if (r2 == 0) goto L_0x039b
            nw3.g0 r2 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            r4 = 301(0x12d, float:4.22E-43)
            r2.mo161128j(r4)     // Catch:{ Exception -> 0x038f }
            nw3.g0 r2 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ Exception -> 0x038f }
            r4[r17] = r25     // Catch:{ Exception -> 0x038f }
            r4[r12] = r7     // Catch:{ Exception -> 0x038f }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x038f }
            r4[r11] = r5     // Catch:{ Exception -> 0x038f }
            int r5 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x038f }
            r4[r10] = r5     // Catch:{ Exception -> 0x038f }
            r2.mo161124a(r4)     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r0.f329385j     // Catch:{ Exception -> 0x038f }
            r4 = 1001(0x3e9, float:1.403E-42)
            r15.mo161094f(r2, r4, r12)     // Catch:{ Exception -> 0x038f }
            boolean r0 = r0.f329387l     // Catch:{ Exception -> 0x038f }
            if (r0 != 0) goto L_0x018f
            mv3.a r0 = r15.f328575T     // Catch:{ Exception -> 0x038f }
            java.lang.String r19 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r0
            r18.mo160862a(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x038f }
        L_0x018f:
            nw3.j r0 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r0.mo161132b(r1, r3)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x0196:
            int r0 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 != r1) goto L_0x01b0
            r0 = r13
            ow3.g r0 = (ow3.C110083g) r0     // Catch:{ Exception -> 0x038f }
            nw3.j r0 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r0.getClass()     // Catch:{ Exception -> 0x038f }
            nw3.w r1 = new nw3.w     // Catch:{ Exception -> 0x038f }
            r1.<init>(r0, r3, r14)     // Catch:{ Exception -> 0x038f }
            bs3.C28416g.m38191a(r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x01b0:
            int r0 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r1 = 206(0xce, float:2.89E-43)
            if (r0 != r1) goto L_0x0217
            r0 = r13
            ow3.a r0 = (ow3.C110077a) r0     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r0.f329377j     // Catch:{ Exception -> 0x038f }
            int r3 = r0.f329378k     // Catch:{ Exception -> 0x038f }
            long r4 = r0.f329379l     // Catch:{ Exception -> 0x038f }
            r13 = 0
            r1 = r44
            r14 = -1
            r6 = r13
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 != 0) goto L_0x01eb
            java.lang.String r1 = r0.f329377j     // Catch:{ Exception -> 0x038f }
            int r2 = r0.f329378k     // Catch:{ Exception -> 0x038f }
            long r3 = r0.f329379l     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ Exception -> 0x038f }
            java.lang.String r6 = "ack"
            r5[r17] = r6     // Catch:{ Exception -> 0x038f }
            r5[r12] = r7     // Catch:{ Exception -> 0x038f }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x038f }
            r5[r11] = r6     // Catch:{ Exception -> 0x038f }
            int r6 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x038f }
            r5[r10] = r6     // Catch:{ Exception -> 0x038f }
            nw3.C109799g0.m149209k(r1, r2, r3, r5)     // Catch:{ Exception -> 0x038f }
        L_0x01eb:
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            int r2 = r0.f329380m     // Catch:{ Exception -> 0x038f }
            nw3.c r3 = nw3.C109774c.m149103b()     // Catch:{ Exception -> 0x038f }
            java.lang.String r0 = r0.f329377j     // Catch:{ Exception -> 0x038f }
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r0 = r3.mo161016d(r0)     // Catch:{ Exception -> 0x038f }
            r1.getClass()     // Catch:{ Exception -> 0x038f }
            nw3.l r3 = new nw3.l     // Catch:{ Exception -> 0x038f }
            r3.<init>(r1, r2, r0)     // Catch:{ Exception -> 0x038f }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x038f }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x038f }
            if (r0 != r2) goto L_0x0210
            r3.run()     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x0210:
            android.os.Handler r0 = r1.f328706b     // Catch:{ Exception -> 0x038f }
            r0.post(r3)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x0217:
            r14 = -1
            int r0 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r6 = 204(0xcc, float:2.86E-43)
            if (r0 != r6) goto L_0x025a
            r0 = r13
            ow3.b r0 = (ow3.C110078b) r0     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r0.f329382j     // Catch:{ Exception -> 0x038f }
            int r4 = r0.f329383k     // Catch:{ Exception -> 0x038f }
            long r5 = r0.f329384l     // Catch:{ Exception -> 0x038f }
            r0 = 0
            r1 = r44
            r13 = r3
            r3 = r4
            r4 = r5
            r6 = r0
            boolean r0 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x039b
            nw3.g0 r0 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = "add"
            r1[r17] = r2     // Catch:{ Exception -> 0x038f }
            r1[r12] = r7     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x038f }
            r1[r11] = r2     // Catch:{ Exception -> 0x038f }
            int r2 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x038f }
            r1[r10] = r2     // Catch:{ Exception -> 0x038f }
            r0.mo161124a(r1)     // Catch:{ Exception -> 0x038f }
            nw3.j r0 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r1 = -300(0xfffffffffffffed4, float:NaN)
            r0.mo161132b(r1, r13)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x025a:
            r0 = r3
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r3 = 202(0xca, float:2.83E-43)
            if (r1 != r3) goto L_0x028f
            r1 = r13
            ow3.e r1 = (ow3.C110081e) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r1.f329388j     // Catch:{ Exception -> 0x038f }
            int r3 = r1.f329389k     // Catch:{ Exception -> 0x038f }
            long r4 = r1.f329390l     // Catch:{ Exception -> 0x038f }
            int r1 = r1.f329391m     // Catch:{ Exception -> 0x038f }
            if (r1 == r12) goto L_0x0272
            r6 = 1
            goto L_0x0273
        L_0x0272:
            r6 = 0
        L_0x0273:
            r1 = r44
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            int r1 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            if (r1 != r10) goto L_0x039b
            nw3.g0 r1 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            r2 = 302(0x12e, float:4.23E-43)
            r1.mo161128j(r2)     // Catch:{ Exception -> 0x038f }
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -200(0xffffffffffffff38, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x028f:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            if (r1 != r4) goto L_0x029c
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r1.mo161131a(r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x029c:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r2 = 213(0xd5, float:2.98E-43)
            if (r1 != r2) goto L_0x02d3
            r1 = r13
            ow3.j r1 = (ow3.C110086j) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r1 = r15.f328593p     // Catch:{ Exception -> 0x038f }
            boolean r1 = bs3.C104166f.m139001a(r0, r1)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            nw3.g0 r1 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ Exception -> 0x038f }
            java.lang.String r3 = "sendmsg"
            r2[r17] = r3     // Catch:{ Exception -> 0x038f }
            r2[r12] = r7     // Catch:{ Exception -> 0x038f }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x038f }
            r2[r11] = r3     // Catch:{ Exception -> 0x038f }
            int r3 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x038f }
            r2[r10] = r3     // Catch:{ Exception -> 0x038f }
            r1.mo161124a(r2)     // Catch:{ Exception -> 0x038f }
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -700(0xfffffffffffffd44, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x02d3:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            if (r1 != r5) goto L_0x0306
            r0 = r13
            ow3.h r0 = (ow3.C110084h) r0     // Catch:{ Exception -> 0x038f }
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r1 = r44
            boolean r0 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x039b
            nw3.g0 r0 = r15.f328563J     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = "redirect"
            r1[r17] = r2     // Catch:{ Exception -> 0x038f }
            r1[r12] = r7     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x038f }
            r1[r11] = r2     // Catch:{ Exception -> 0x038f }
            int r2 = r15.f328587g     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x038f }
            r1[r10] = r2     // Catch:{ Exception -> 0x038f }
            r0.mo161124a(r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x0306:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r2 = 214(0xd6, float:3.0E-43)
            if (r1 != r2) goto L_0x0329
            r1 = r13
            ow3.n r1 = (ow3.C110090n) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r1.f329401j     // Catch:{ Exception -> 0x038f }
            int r3 = r1.f329402k     // Catch:{ Exception -> 0x038f }
            long r4 = r1.f329403l     // Catch:{ Exception -> 0x038f }
            r6 = 0
            r1 = r44
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -800(0xfffffffffffffce0, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x0329:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r2 = 800(0x320, float:1.121E-42)
            if (r1 != r2) goto L_0x034b
            r1 = r13
            ow3.l r1 = (ow3.C110088l) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r1.f329395j     // Catch:{ Exception -> 0x038f }
            int r3 = r1.f329396k     // Catch:{ Exception -> 0x038f }
            long r4 = r1.f329397l     // Catch:{ Exception -> 0x038f }
            r6 = 0
            r1 = r44
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -1600(0xfffffffffffff9c0, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x034b:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r2 = 801(0x321, float:1.122E-42)
            if (r1 != r2) goto L_0x036d
            r1 = r13
            ow3.k r1 = (ow3.C110087k) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r1.f329392j     // Catch:{ Exception -> 0x038f }
            int r3 = r1.f329393k     // Catch:{ Exception -> 0x038f }
            long r4 = r1.f329394l     // Catch:{ Exception -> 0x038f }
            r6 = 0
            r1 = r44
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -1601(0xfffffffffffff9bf, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x036d:
            int r1 = r48.mo161498d()     // Catch:{ Exception -> 0x038f }
            r2 = 802(0x322, float:1.124E-42)
            if (r1 != r2) goto L_0x039b
            r1 = r13
            ow3.m r1 = (ow3.C110089m) r1     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = r1.f329398j     // Catch:{ Exception -> 0x038f }
            int r3 = r1.f329399k     // Catch:{ Exception -> 0x038f }
            long r4 = r1.f329400l     // Catch:{ Exception -> 0x038f }
            r6 = 0
            r1 = r44
            boolean r1 = r1.mo161078J(r2, r3, r4, r6)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x039b
            nw3.j r1 = r15.f328573S     // Catch:{ Exception -> 0x038f }
            r2 = -1602(0xfffffffffffff9be, float:NaN)
            r1.mo161132b(r2, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x039b
        L_0x038f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = "cancelCreateTalkRoom: "
            r1[r17] = r2
            r1[r12] = r0
            bs3.C104161b.m138997f(r8, r1)
        L_0x039b:
            return
        L_0x039c:
            r1 = -1
            r6 = 204(0xcc, float:2.86E-43)
            r21 = 206(0xce, float:2.89E-43)
            r26 = 209(0xd1, float:2.93E-43)
            int r3 = r48.mo161498d()
            if (r3 != r2) goto L_0x05df
            r2 = r13
            ow3.d r2 = (ow3.C110080d) r2
            java.lang.Object r3 = r2.f337367d
            if (r3 == 0) goto L_0x05df
            as3.b0 r3 = (as3.C103859b0) r3
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r31 = "handleCreateVoiceGroupEnd errCode: "
            r4[r17] = r31
            java.lang.Integer r31 = java.lang.Integer.valueOf(r46)
            r4[r12] = r31
            int r5 = r2.f329386k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r11] = r5
            java.lang.String r5 = r2.f329385j
            r4[r10] = r5
            bs3.C104161b.m138997f(r8, r4)
            boolean r4 = r2.f329387l
            r32 = r4 ^ 1
            r4 = 6
            java.lang.Integer[] r5 = new java.lang.Integer[r4]
            r4 = 14000(0x36b0, float:1.9618E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r17] = r4
            r4 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r12] = r4
            r4 = 14001(0x36b1, float:1.962E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r11] = r4
            r4 = -1002(0xfffffffffffffc16, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r10] = r4
            r4 = 14002(0x36b2, float:1.9621E-41)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r4)
            r5[r9] = r33
            r33 = -1009(0xfffffffffffffc0f, float:NaN)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r33)
            r23 = 5
            r5[r23] = r33
            java.util.Map r5 = bs3.C0377a.m322a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r46)
            java.util.HashMap r5 = (java.util.HashMap) r5
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x0427
            java.lang.Integer r6 = java.lang.Integer.valueOf(r46)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            nw3.C109799g0.m149206g(r5)
        L_0x0427:
            if (r14 != r4) goto L_0x042b
            goto L_0x05df
        L_0x042b:
            java.lang.String r4 = "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: "
            if (r14 == 0) goto L_0x0525
            java.lang.String r5 = r15.f328595q
            java.lang.String r6 = r2.f329385j
            boolean r5 = bs3.C104166f.m139003c(r5, r6)
            if (r5 != 0) goto L_0x046d
            r5 = 6
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r17] = r4
            java.lang.String r3 = r15.f328595q
            r1[r12] = r3
            java.lang.String r3 = " createScene.mClientGroupId: "
            r1[r11] = r3
            java.lang.String r2 = r2.f329385j
            r1[r10] = r2
            java.lang.String r2 = " errCode: "
            r1[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r46)
            r3 = 5
            r1[r3] = r2
            bs3.C104161b.m138997f(r8, r1)
            if (r32 == 0) goto L_0x05df
            mv3.a r1 = r15.f328575T
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            java.lang.String r35 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r34 = r1
            r34.mo160862a(r35, r36, r37, r38, r39)
            goto L_0x05df
        L_0x046d:
            if (r14 == r1) goto L_0x048f
            nw3.g0 r1 = r15.f328563J
            r4 = 321(0x141, float:4.5E-43)
            r1.mo161128j(r4)
            nw3.g0 r1 = r15.f328563J
            java.lang.String[] r4 = new java.lang.String[r9]
            r4[r17] = r25
            r4[r12] = r7
            java.lang.String r5 = java.lang.String.valueOf(r46)
            r4[r11] = r5
            int r5 = r15.f328587g
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4[r10] = r5
            r1.mo161124a(r4)
        L_0x048f:
            int r1 = r15.f328587g
            if (r1 == r12) goto L_0x04c6
            r4 = 5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = "handleCreateVoiceGroupEnd state is error: "
            r3[r17] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r12] = r1
            java.lang.String r1 = "  errCode: "
            r3[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r46)
            r3[r10] = r1
            java.lang.String r1 = r2.f329385j
            r3[r9] = r1
            bs3.C104161b.m138997f(r8, r3)
            if (r32 == 0) goto L_0x05df
            mv3.a r1 = r15.f328575T
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            java.lang.String r35 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r34 = r1
            r34.mo160862a(r35, r36, r37, r38, r39)
            goto L_0x05df
        L_0x04c6:
            java.lang.String r2 = r15.f328593p
            int r4 = r15.f328597s
            long r5 = r15.f328598t
            r7 = 1
            r9 = -100
            r1 = r44
            r10 = r3
            r19 = 202(0xca, float:2.83E-43)
            r3 = r4
            r4 = r5
            r6 = r7
            r1.mo161098i(r2, r3, r4, r6)
            r1 = 14051(0x36e3, float:1.969E-41)
            if (r14 != r1) goto L_0x04e7
            nw3.j r1 = r15.f328573S
            r2 = -900(0xfffffffffffffc7c, float:NaN)
            r6 = 0
            r1.mo161132b(r2, r6)
            goto L_0x0511
        L_0x04e7:
            r6 = 0
            r1 = 14052(0x36e4, float:1.9691E-41)
            if (r14 != r1) goto L_0x04f4
            nw3.j r1 = r15.f328573S
            r2 = -1100(0xfffffffffffffbb4, float:NaN)
            r1.mo161132b(r2, r6)
            goto L_0x0511
        L_0x04f4:
            r1 = 14053(0x36e5, float:1.9692E-41)
            if (r14 != r1) goto L_0x0500
            nw3.j r1 = r15.f328573S
            r2 = -1300(0xfffffffffffffaec, float:NaN)
            r1.mo161132b(r2, r10)
            goto L_0x0511
        L_0x0500:
            r1 = 14504(0x38a8, float:2.0324E-41)
            if (r14 != r1) goto L_0x050c
            nw3.j r1 = r15.f328573S
            r2 = -1400(0xfffffffffffffa88, float:NaN)
            r1.mo161132b(r2, r6)
            goto L_0x0511
        L_0x050c:
            nw3.j r1 = r15.f328573S
            r1.mo161132b(r9, r6)
        L_0x0511:
            if (r32 == 0) goto L_0x057d
            mv3.a r1 = r15.f328575T
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            java.lang.String r26 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r25 = r1
            r25.mo160862a(r26, r27, r28, r29, r30)
            goto L_0x057d
        L_0x0525:
            r5 = r3
            r3 = -100
            r6 = 0
            java.lang.String r1 = r15.f328595q
            java.lang.String r2 = r5.f306865i
            boolean r1 = bs3.C104166f.m139003c(r1, r2)
            if (r1 != 0) goto L_0x0580
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r17] = r4
            java.lang.String r2 = r15.f328595q
            r1[r12] = r2
            java.lang.String r2 = " resp.clientGroupId: "
            r1[r11] = r2
            java.lang.String r2 = r5.f306865i
            r1[r10] = r2
            int r2 = r5.f306859c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r9] = r2
            long r2 = r5.f306860d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 5
            r1[r3] = r2
            bs3.C104161b.m138997f(r8, r1)
            java.lang.String r2 = r5.f306858b
            int r3 = r5.f306859c
            long r4 = r5.f306860d
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 0
            r1 = r44
            r9 = 210(0xd2, float:2.94E-43)
            r10 = 205(0xcd, float:2.87E-43)
            r1.mo161103n(r2, r3, r4, r6, r7)
            if (r32 == 0) goto L_0x057d
            mv3.a r1 = r15.f328575T
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r19 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r18 = r1
            r18.mo160862a(r19, r20, r21, r22, r23)
        L_0x057d:
            r4 = 210(0xd2, float:2.94E-43)
            goto L_0x05df
        L_0x0580:
            r2 = 205(0xcd, float:2.87E-43)
            r4 = 210(0xd2, float:2.94E-43)
            nw3.g0 r1 = r15.f328563J
            java.lang.String[] r2 = new java.lang.String[r9]
            r2[r17] = r25
            r2[r12] = r7
            java.lang.String r7 = java.lang.String.valueOf(r46)
            r2[r11] = r7
            int r7 = r15.f328587g
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2[r10] = r7
            r1.mo161124a(r2)
            int r1 = r15.f328587g
            if (r1 == r12) goto L_0x05e4
            r1 = -1003(0xfffffffffffffc15, float:NaN)
            nw3.C109799g0.m149206g(r1)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "handleCreateVoiceGroupEnd state != STATE_CREATING_TAKLROOM: "
            r1[r17] = r2
            int r2 = r15.f328587g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r12] = r2
            java.lang.String r2 = r5.f306865i
            r1[r11] = r2
            int r2 = r5.f306859c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r10] = r2
            long r2 = r5.f306860d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r9] = r2
            bs3.C104161b.m138997f(r8, r1)
            if (r32 == 0) goto L_0x05df
            mv3.a r1 = r15.f328575T
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            java.lang.String r24 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r23 = r1
            r23.mo160862a(r24, r25, r26, r27, r28)
        L_0x05df:
            r9 = r8
            r8 = 1
            r10 = 2
            goto L_0x082b
        L_0x05e4:
            as3.q[] r1 = r5.f306862f
            if (r1 == 0) goto L_0x07c6
            int r1 = r1.length
            if (r1 != 0) goto L_0x05f6
            r7 = r5
            r9 = r8
            r4 = r15
            r1 = 4
            r2 = 5
            r8 = 1
            r10 = 2
            r18 = 3
            goto L_0x07cf
        L_0x05f6:
            java.lang.String r1 = r5.f306865i
            int r2 = r5.f306859c
            long r6 = r5.f306860d
            java.lang.String r3 = r5.f306858b
            as3.z0 r4 = r5.f306869m
            java.lang.String r4 = r4.f307250m
            r15.f328597s = r2
            r15.f328598t = r6
            r15.f328593p = r3
            r15.f328595q = r1
            r15.f328592o = r4
            r15.f328577U = r3
            int r1 = r5.f306861e
            r15.f328596r = r1
            r15.mo161085Q(r9)
            as3.q[] r1 = r5.f306862f
            as3.q[] r2 = r5.f306875s
            int r3 = r5.f306876t
            r15.mo161115z(r1, r2, r3)
            java.lang.String r2 = r5.f306858b
            java.lang.String r3 = r5.f306865i
            int r4 = r5.f306861e
            int r6 = r5.f306859c
            long r9 = r5.f306860d
            as3.b1[] r7 = r5.f306866j
            as3.c1[] r1 = r5.f306863g
            as3.z0 r11 = r5.f306869m
            r21 = 0
            r23 = 1
            r24 = r1
            r1 = r44
            r40 = r5
            r5 = r6
            r19 = r7
            r6 = r9
            r10 = r8
            r8 = r19
            r9 = r24
            r41 = r10
            r18 = 3
            r10 = r11
            r14 = 2
            r11 = r21
            r12 = r23
            r1.mo161075G(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            nw3.j r1 = r15.f328573S
            if (r1 == 0) goto L_0x0679
            nw3.c r2 = nw3.C109774c.m149103b()
            r12 = r40
            java.lang.String r3 = r12.f306858b
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r2 = r2.mo161016d(r3)
            long r3 = r12.f306860d
            nw3.p r5 = new nw3.p
            r5.<init>(r1, r2, r3)
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 != r3) goto L_0x0673
            r5.run()
            goto L_0x067b
        L_0x0673:
            android.os.Handler r1 = r1.f328706b
            r1.post(r5)
            goto L_0x067b
        L_0x0679:
            r12 = r40
        L_0x067b:
            int[] r1 = r12.f306868l
            int r1 = r1.length
            byte[] r5 = new byte[r1]
            r1 = 0
        L_0x0681:
            int[] r2 = r12.f306868l
            int r3 = r2.length
            if (r1 >= r3) goto L_0x068e
            r2 = r2[r1]
            byte r2 = (byte) r2
            r5[r1] = r2
            int r1 = r1 + 1
            goto L_0x0681
        L_0x068e:
            int[] r1 = r12.f306881y
            int r1 = r1.length
            int[] r11 = new int[r1]
            r1 = 0
        L_0x0694:
            int[] r2 = r12.f306881y
            int r3 = r2.length
            if (r1 >= r3) goto L_0x06a0
            r2 = r2[r1]
            r11[r1] = r2
            int r1 = r1 + 1
            goto L_0x0694
        L_0x06a0:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r3 = "handleCreateTalkRoomEnd, general policy cnt:"
            r1[r17] = r3
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9 = 1
            r1[r9] = r2
            r10 = r41
            bs3.C104161b.m138997f(r10, r1)
            int[] r1 = r12.f306881y
            int r1 = r1.length
            int r2 = com.tencent.p014mm.plugin.multi.talk.f314039a
            r2 = 9
            if (r1 <= r2) goto L_0x06d9
            r8 = 4
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r3 = " redirect type:"
            r1[r17] = r3
            r3 = r11[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r9] = r3
            java.lang.String r3 = " SimpleRedirect value:"
            r1[r14] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r18] = r2
            bs3.C104161b.m138997f(r10, r1)
            goto L_0x06da
        L_0x06d9:
            r8 = 4
        L_0x06da:
            as3.b1[] r3 = r12.f306866j
            as3.y0 r4 = r12.f306864h
            int r1 = r12.f306867k
            r1 = r1 & r14
            if (r1 == 0) goto L_0x06e5
            r6 = 1
            goto L_0x06e6
        L_0x06e5:
            r6 = 0
        L_0x06e6:
            java.lang.String r7 = r12.f306858b
            int r2 = r12.f306859c
            r41 = r10
            long r9 = r12.f306860d
            int r1 = r12.f306877u
            int r14 = r12.f306878v
            r16 = r2
            byte[] r2 = r12.f306879w
            r19 = r2
            int r2 = r12.f306882z
            r21 = r2
            java.lang.String r2 = r15.f328554A
            r22 = 0
            r23 = r1
            r1 = r44
            r24 = r2
            r2 = r22
            r8 = r16
            r42 = r41
            r16 = r11
            r11 = r23
            r43 = r12
            r12 = r14
            r14 = r13
            r13 = r19
            r14 = r16
            r15 = r21
            r16 = r24
            r1.mo161100k(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
            r7 = r43
            int r1 = r7.f306873q
            if (r1 == 0) goto L_0x0749
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get helloFreqSeconds:"
            r2.append(r3)
            int r3 = r7.f306873q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1[r17] = r2
            r9 = r42
            bs3.C104161b.m138995d(r9, r1)
            int r1 = r7.f306873q
            int r1 = r1 * 1000
            f328552W0 = r1
            goto L_0x074c
        L_0x0749:
            r9 = r42
            r8 = 1
        L_0x074c:
            r44.mo161086R()
            java.lang.String r2 = r7.f306858b
            int r3 = r7.f306859c
            long r4 = r7.f306860d
            r6 = 1
            r1 = r44
            r1.mo161093e(r2, r3, r4, r6)
            if (r32 == 0) goto L_0x07a3
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "result"
            r15.put(r2, r1)
            java.lang.String r1 = new java.lang.String
            as3.z0 r2 = r7.f306869m
            byte[] r2 = r2.f307244g
            java.lang.String r3 = "utf-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r3)
            r1.<init>(r2, r4)
            java.lang.String r2 = "shareUrl"
            r15.put(r2, r1)
            java.lang.String r1 = new java.lang.String
            as3.z0 r2 = r7.f306869m
            byte[] r2 = r2.f307245h
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r1.<init>(r2, r3)
            java.lang.String r2 = "smsShortUrl"
            r15.put(r2, r1)
            java.lang.String r1 = r7.f306858b
            java.lang.String r2 = "groupId"
            r15.put(r2, r1)
            r4 = r44
            mv3.a r10 = r4.f328575T
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r11 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r10.mo160862a(r11, r12, r13, r14, r15)
            goto L_0x07a5
        L_0x07a3:
            r4 = r44
        L_0x07a5:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "handleCreateVoiceGroupEnd"
            r1[r17] = r2
            java.lang.String r2 = r4.f328593p
            r1[r8] = r2
            int r2 = r4.f328597s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = 2
            r1[r10] = r2
            long r2 = r4.f328598t
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r18] = r2
            bs3.C104161b.m138997f(r9, r1)
            r15 = r4
            goto L_0x082b
        L_0x07c6:
            r7 = r5
            r9 = r8
            r4 = r15
            r1 = 4
            r8 = 1
            r10 = 2
            r18 = 3
            r2 = 5
        L_0x07cf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "handleCreateVoiceGroupEnd resp.addrlist is null,errCode: "
            r2[r17] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r46)
            r2[r8] = r5
            java.lang.String r5 = r7.f306865i
            r2[r10] = r5
            int r5 = r7.f306859c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r18] = r5
            long r11 = r7.f306860d
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r2[r1] = r5
            bs3.C104161b.m138997f(r9, r2)
            r1 = -1605(0xfffffffffffff9bb, float:NaN)
            nw3.C109799g0.m149206g(r1)
            nw3.g0 r1 = r4.f328563J
            r2 = 329(0x149, float:4.61E-43)
            r1.f328683g = r2
            java.lang.String r2 = r7.f306858b
            int r5 = r7.f306859c
            long r11 = r7.f306860d
            r7 = 116(0x74, float:1.63E-43)
            r13 = 1
            r1 = r44
            r14 = -100
            r3 = r5
            r15 = r4
            r4 = r11
            r11 = r6
            r6 = r7
            r7 = r13
            r1.mo161103n(r2, r3, r4, r6, r7)
            if (r32 == 0) goto L_0x0826
            mv3.a r1 = r15.f328575T
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r19 = "TOPIC_ASYNC_CREATE_ROOM_DONE"
            r18 = r1
            r18.mo160862a(r19, r20, r21, r22, r23)
        L_0x0826:
            nw3.j r1 = r15.f328573S
            r1.mo161132b(r14, r11)
        L_0x082b:
            int r1 = r48.mo161498d()
            r2 = 202(0xca, float:2.83E-43)
            if (r1 != r2) goto L_0x0847
            r1 = r48
            r2 = r1
            ow3.e r2 = (ow3.C110081e) r2
            java.lang.Object r3 = r2.f337367d
            if (r3 == 0) goto L_0x0844
            as3.c0 r3 = (as3.C103862c0) r3
            r4 = r46
            r15.mo161108s(r0, r4, r3, r2)
            goto L_0x084b
        L_0x0844:
            r4 = r46
            goto L_0x084b
        L_0x0847:
            r4 = r46
            r1 = r48
        L_0x084b:
            int r2 = r48.mo161498d()
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 != r3) goto L_0x085f
            r2 = r1
            ow3.b r2 = (ow3.C110078b) r2
            java.lang.Object r3 = r2.f337367d
            if (r3 == 0) goto L_0x085f
            as3.z r3 = (as3.C103913z) r3
            r15.mo161106q(r0, r4, r3, r2)
        L_0x085f:
            int r2 = r48.mo161498d()
            r3 = 203(0xcb, float:2.84E-43)
            if (r2 != r3) goto L_0x0873
            r2 = r1
            ow3.f r2 = (ow3.C110082f) r2
            java.lang.Object r2 = r2.f337367d
            if (r2 == 0) goto L_0x0873
            as3.d0 r2 = (as3.C103865d0) r2
            r15.mo161109t(r0, r4, r2)
        L_0x0873:
            int r2 = r48.mo161498d()
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 != r3) goto L_0x0887
            r2 = r1
            ow3.o r2 = (ow3.C110091o) r2
            java.lang.Object r2 = r2.f337367d
            if (r2 == 0) goto L_0x0887
            as3.o0 r2 = (as3.C103892o0) r2
            r15.mo161111v(r0, r4, r2)
        L_0x0887:
            int r2 = r48.mo161498d()
            r3 = 206(0xce, float:2.89E-43)
            if (r2 != r3) goto L_0x089b
            r2 = r1
            ow3.a r2 = (ow3.C110077a) r2
            java.lang.Object r3 = r2.f337367d
            if (r3 == 0) goto L_0x089b
            as3.k0 r3 = (as3.C103884k0) r3
            r15.mo161105p(r0, r4, r3, r2)
        L_0x089b:
            int r2 = r48.mo161498d()
            r3 = 207(0xcf, float:2.9E-43)
            if (r2 != r3) goto L_0x08c4
            r2 = r1
            ow3.i r2 = (ow3.C110085i) r2
            java.lang.Object r2 = r2.f337367d
            if (r2 == 0) goto L_0x08c4
            as3.f0 r2 = (as3.C103871f0) r2
            r2 = 18100(0x46b4, float:2.5364E-41)
            if (r4 != r2) goto L_0x08b5
            r2 = -1501(0xfffffffffffffa23, float:NaN)
            nw3.C109799g0.m149206g(r2)
        L_0x08b5:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = "handleRejectEnd  errCode is "
            r2[r17] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r46)
            r2[r8] = r3
            bs3.C104161b.m138997f(r9, r2)
        L_0x08c4:
            int r2 = r48.mo161498d()
            r3 = 208(0xd0, float:2.91E-43)
            if (r2 != r3) goto L_0x08d8
            r2 = r1
            ow3.c r2 = (ow3.C110079c) r2
            java.lang.Object r2 = r2.f337367d
            if (r2 == 0) goto L_0x08d8
            as3.a0 r2 = (as3.C103856a0) r2
            r15.mo161107r(r0, r4, r2)
        L_0x08d8:
            int r2 = r48.mo161498d()
            r3 = 209(0xd1, float:2.93E-43)
            if (r2 != r3) goto L_0x08ec
            r2 = r1
            ow3.g r2 = (ow3.C110083g) r2
            java.lang.Object r3 = r2.f337367d
            if (r3 == 0) goto L_0x08ec
            as3.e0 r3 = (as3.C103868e0) r3
            r15.mo161113x(r0, r4, r3, r2)
        L_0x08ec:
            int r2 = r48.mo161498d()
            r3 = 210(0xd2, float:2.94E-43)
            if (r2 != r3) goto L_0x08f9
            java.lang.Object r2 = r1.f337367d
            r15.mo161112w(r0, r4, r2)
        L_0x08f9:
            int r2 = r48.mo161498d()
            r3 = 211(0xd3, float:2.96E-43)
            if (r2 != r3) goto L_0x0909
            r2 = r1
            ow3.h r2 = (ow3.C110084h) r2
            java.lang.Object r3 = r1.f337367d
            r15.mo161114y(r0, r4, r3, r2)
        L_0x0909:
            int r2 = r48.mo161498d()
            r3 = 212(0xd4, float:2.97E-43)
            if (r2 != r3) goto L_0x0918
            java.lang.Object r2 = r1.f337367d
            as3.l0 r2 = (as3.C103886l0) r2
            r15.mo161110u(r0, r4, r2)
        L_0x0918:
            int r2 = r48.mo161498d()
            r3 = 213(0xd5, float:2.98E-43)
            if (r2 != r3) goto L_0x092a
            java.lang.Object r2 = r1.f337367d
            as3.m0 r2 = (as3.C103888m0) r2
            r3 = r1
            ow3.j r3 = (ow3.C110086j) r3
            r15.mo161069A(r0, r4, r2, r3)
        L_0x092a:
            int r0 = r48.mo161498d()
            r2 = 214(0xd6, float:3.0E-43)
            if (r0 != r2) goto L_0x093c
            java.lang.Object r0 = r1.f337367d
            as3.j0 r0 = (as3.C103882j0) r0
            r2 = r1
            ow3.n r2 = (ow3.C110090n) r2
            r15.mo161073E(r4, r0, r2)
        L_0x093c:
            int r0 = r48.mo161498d()
            r2 = 800(0x320, float:1.121E-42)
            if (r0 != r2) goto L_0x094e
            java.lang.Object r0 = r1.f337367d
            as3.g0 r0 = (as3.C103874g0) r0
            r2 = r1
            ow3.l r2 = (ow3.C110088l) r2
            r15.mo161071C(r4, r0, r2)
        L_0x094e:
            int r0 = r48.mo161498d()
            r2 = 801(0x321, float:1.122E-42)
            if (r0 != r2) goto L_0x0960
            java.lang.Object r0 = r1.f337367d
            as3.i0 r0 = (as3.C103880i0) r0
            r2 = r1
            ow3.k r2 = (ow3.C110087k) r2
            r15.mo161070B(r4, r0, r2)
        L_0x0960:
            int r0 = r48.mo161498d()
            r2 = 802(0x322, float:1.124E-42)
            if (r0 != r2) goto L_0x0971
            java.lang.Object r0 = r1.f337367d
            as3.h0 r0 = (as3.C103877h0) r0
            ow3.m r1 = (ow3.C110089m) r1
            r15.mo161072D(r4, r0, r1)
        L_0x0971:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo150596b(int, int, java.lang.String, zr3.d):void");
    }

    /* renamed from: e */
    public final void mo161093e(String str, int i, long j, boolean z) {
        try {
            C104161b.m138997f("TalkRoomService", "addCallLog groupId: ", str, " mIsOutCall: ", Boolean.valueOf(this.f328588h), " mTalkDuration: ", Integer.valueOf(this.f328599u), " msgKey: ", C109774c.m149103b().mo161015c(str, i, j));
        } catch (Throwable th) {
            C104161b.m138997f("TalkRoomService", "handleRoomExit: ", th);
        }
    }

    /* renamed from: f */
    public boolean mo161094f(String str, int i, boolean z) {
        C104161b.m138997f("TalkRoomService", "cancelCreateTalkRoom clientGroupId: ", str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean c = C112675e.m154053e().mo164407c(new C110079c(str, i, this.f328596r));
        this.f328563J.mo161124a("cancel", "req", String.valueOf(c), String.valueOf(this.f328587g));
        mo161098i(str, this.f328597s, this.f328598t, z);
        C104161b.m138997f("TalkRoomService", "cancelCreateTalkRoom ret: ", Boolean.valueOf(c));
        return c;
    }

    /* renamed from: g */
    public final void mo161095g() {
        try {
            C104161b.m138997f("TalkRoomService", "cancelHelloTimeOutTask");
            TimerTask timerTask = this.f328567N;
            if (timerTask != null) {
                timerTask.cancel();
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "cancelHelloTimeOutTask: ", e);
        }
        this.f328567N = null;
    }

    /* renamed from: h */
    public final void mo161096h() {
        try {
            C104161b.m138997f("TalkRoomService", "cancelHelloTimerTask");
            TimerTask timerTask = this.f328566M;
            if (timerTask != null) {
                timerTask.cancel();
            }
        } catch (Exception e) {
            C104161b.m138997f("TalkRoomService", "cancelHelloTimerTask: ", e);
        }
        this.f328566M = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bc, code lost:
        r2 = r2.f320124j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r27) {
        /*
            r26 = this;
            r9 = r26
            r0 = r27
            int r1 = r0.what
            r2 = 2
            r10 = 1
            r3 = 0
            java.lang.String r4 = "TalkRoomService"
            r5 = 4
            if (r1 == r10) goto L_0x015d
            java.lang.String r6 = "handlerCreateGroup obj is not CreateGroupObj"
            r7 = 3
            if (r1 == r2) goto L_0x006b
            if (r1 == r7) goto L_0x001e
            if (r1 == r5) goto L_0x0019
            goto L_0x015b
        L_0x0019:
            bs3.C104164e.m138999b()
            goto L_0x015b
        L_0x001e:
            java.lang.Object r0 = r0.obj
            int r1 = r9.f328587g
            if (r1 == r7) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "handlerEnterGroup state: "
            r0[r3] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x015b
        L_0x0035:
            boolean r1 = r0 instanceof nw3.C109782f.C109794j
            if (r1 != 0) goto L_0x0042
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r3] = r6
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x015b
        L_0x0042:
            r6 = r0
            nw3.f$j r6 = (nw3.C109782f.C109794j) r6
            java.lang.String r1 = r6.f328654a
            int r2 = r6.f328655b
            long r3 = r6.f328656c
            r5 = 0
            r0 = r26
            boolean r0 = r0.mo161078J(r1, r2, r3, r5)
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = r6.f328654a
            int r2 = r6.f328655b
            long r3 = r6.f328656c
            int r5 = r6.f328658e
            int r7 = r6.f328657d
            r8 = 1
            java.lang.String r11 = r6.f328659f
            r0 = r26
            r6 = r7
            r7 = r8
            r8 = r11
            r0.mo161083O(r1, r2, r3, r5, r6, r7, r8)
            goto L_0x015b
        L_0x006b:
            java.lang.Object r0 = r0.obj
            int r1 = r9.f328587g
            if (r1 == r10) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "handlerCreateGroup state: "
            r0[r3] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x015b
        L_0x0082:
            boolean r1 = r0 instanceof nw3.C109782f.C109792h
            if (r1 != 0) goto L_0x008f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r3] = r6
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x015b
        L_0x008f:
            nw3.f$h r0 = (nw3.C109782f.C109792h) r0
            java.lang.String r1 = r0.f328637a
            java.lang.String r6 = r9.f328593p
            boolean r1 = bs3.C104166f.m139003c(r1, r6)
            if (r1 == 0) goto L_0x015b
            java.lang.String r1 = r0.f328637a
            java.lang.String[] r13 = r0.f328638b
            as3.e1 r6 = r0.f328639c
            int r8 = r0.f328640d
            int r15 = r0.f328641e
            long r11 = r0.f328642f
            java.lang.String r14 = r0.f328643g
            boolean r7 = r0.f328644h
            java.lang.String r0 = r0.f328645i
            nw3.g0 r2 = r9.f328563J
            r2.mo161125b()
            nw3.c r2 = nw3.C109774c.m149103b()
            com.tencent.wecall.talkroom.model.TalkRoom r2 = r2.mo161020h(r1)
            if (r2 == 0) goto L_0x00c4
            as3.z0 r2 = r2.f320124j
            if (r2 != 0) goto L_0x00c1
            goto L_0x00c4
        L_0x00c1:
            java.lang.String r2 = r2.f307239b
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r2 = ""
        L_0x00c6:
            ow3.d r10 = new ow3.d
            nw3.b r5 = r9.f328564K
            com.tencent.mm.plugin.multi.talk r5 = r5.f328532a
            if (r5 != 0) goto L_0x00d1
            byte[] r5 = new byte[r3]
            goto L_0x00d3
        L_0x00d1:
            byte[] r5 = r5.field_capInfo
        L_0x00d3:
            r24 = r11
            r11 = r10
            r12 = r1
            r21 = r14
            r14 = r5
            r5 = r15
            r15 = r2
            r16 = r6
            r17 = r8
            r18 = r5
            r19 = r24
            r22 = r7
            r23 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
            zr3.e r0 = zr3.C112675e.m154053e()
            boolean r0 = r0.mo164407c(r10)
            nw3.g0 r6 = r9.f328563J
            r7 = 4
            java.lang.String[] r10 = new java.lang.String[r7]
            java.lang.String r7 = "create"
            r10[r3] = r7
            java.lang.String r7 = "req"
            r11 = 1
            r10[r11] = r7
            java.lang.String r7 = java.lang.String.valueOf(r0)
            r12 = 2
            r10[r12] = r7
            int r7 = r9.f328587g
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r13 = 3
            r10[r13] = r7
            r6.mo161124a(r10)
            r6 = 12
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "sendCreateSence groupId: "
            r6[r3] = r7
            r6[r11] = r1
            java.lang.String r1 = " routeId:"
            r6[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r6[r13] = r1
            java.lang.String r1 = " type: "
            r3 = 4
            r6[r3] = r1
            r1 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6[r1] = r3
            r1 = 6
            java.lang.String r3 = " playId: "
            r6[r1] = r3
            r1 = 7
            java.lang.Long r3 = java.lang.Long.valueOf(r24)
            r6[r1] = r3
            r1 = 8
            java.lang.String r3 = " name: "
            r6[r1] = r3
            r1 = 9
            r6[r1] = r2
            r1 = 10
            java.lang.String r2 = " ret: "
            r6[r1] = r2
            r1 = 11
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r1] = r0
            bs3.C104161b.m138997f(r4, r6)
        L_0x015b:
            r2 = 1
            goto L_0x0193
        L_0x015d:
            java.lang.Object r0 = r0.obj
            int r1 = r9.f328587g
            r2 = 4
            if (r1 != r2) goto L_0x0176
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "handlerInviteTimeOut state: "
            r0[r3] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x0193
        L_0x0176:
            r2 = 1
            boolean r1 = r0 instanceof nw3.C109782f.C109795k
            if (r1 != 0) goto L_0x0185
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "handlerInviteTimeOut obj is not GroupRoomInfo"
            r0[r3] = r1
            bs3.C104161b.m138997f(r4, r0)
            goto L_0x0193
        L_0x0185:
            nw3.f$k r0 = (nw3.C109782f.C109795k) r0
            r0.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "handlerInviteTimeOut groupRoomInfo.mGroupId is null"
            r0[r3] = r1
            bs3.C104161b.m138997f(r4, r0)
        L_0x0193:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final void mo161098i(String str, int i, long j, boolean z) {
        mo161099j(str, i, j, z, this.f328588h, true, true);
    }

    /* renamed from: j */
    public void mo161099j(String str, int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        int i2;
        MultiTalkGroup d;
        String str3 = str;
        C104161b.m138997f("TalkRoomService", "closeVoiceGroup groupId: ", str3, " mGroupId: ", this.f328593p, " roomId: ", Integer.valueOf(i), " mRoomId: ", Integer.valueOf(this.f328597s), " roomKey: ", Long.valueOf(j), " mRoomKey: ", Long.valueOf(this.f328598t));
        C109774c b = C109774c.m149103b();
        b.getClass();
        try {
            TalkRoom h = b.mo161020h(str3);
            if (h == null) {
                C104161b.m138997f("TalkRoomManager", "handleRoomExit assert failed: current TalkRoom MUST exists");
            } else {
                C109777d b2 = h.mo157173b(C106962a.f320180a);
                if (b2 != null) {
                    C103860b1 b1Var = b2.f328542a;
                    b1Var.f306891d = 20;
                    b1Var.f306893f = -1;
                }
                Object[] objArr = new Object[2];
                objArr[0] = "resetRoomTempInfo groupId: ";
                String str4 = h.f320042d;
                if (str4 == null) {
                    str4 = "";
                }
                objArr[1] = str4;
                C104161b.m138993b("tagorewang:TalkRoom", objArr);
                C104161b.m138993b("TalkRoomManager", "asyncWriteBackCache");
            }
        } catch (Throwable th) {
            C104161b.m138997f("TalkRoomManager", "handleRoomExit: ", th);
        }
        if (z) {
            str2 = "TalkRoomService";
            i2 = 6;
            mo161093e(str, i, j, z2);
        } else {
            str2 = "TalkRoomService";
            i2 = 6;
        }
        ((HashMap) this.f328584d).remove(str3);
        if (mo161078J(str, i, j, false)) {
            Object[] objArr2 = new Object[i2];
            objArr2[0] = "closeVoiceGroup isCurrentRoom groupId: ";
            objArr2[1] = str3;
            objArr2[2] = " roomId: ";
            objArr2[3] = Integer.valueOf(i);
            objArr2[4] = " roomKey: ";
            objArr2[5] = Long.valueOf(j);
            C104161b.m138993b(str2, objArr2);
            mo161092Y(true);
            C109804j jVar = this.f328573S;
            jVar.getClass();
            C109816s sVar = new C109816s(jVar, str3, z3);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                sVar.run();
            } else {
                jVar.f328706b.post(sVar);
            }
        }
        if (z4 && (d = C109774c.m149103b().mo161016d(str3)) != null) {
            C109804j jVar2 = this.f328573S;
            jVar2.getClass();
            C109812o oVar = new C109812o(jVar2, d);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                oVar.run();
            } else {
                jVar2.f328706b.post(oVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161100k(int r20, as3.C103860b1[] r21, as3.C103912y0 r22, byte[] r23, boolean r24, java.lang.String r25, int r26, long r27, int r29, int r30, byte[] r31, int[] r32, int r33, java.lang.String r34) {
        /*
            r19 = this;
            r15 = r19
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "dealWithInit"
            r16 = 0
            r0[r16] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r14 = 1
            r0[r14] = r1
            r13 = 2
            r0[r13] = r25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r2 = 3
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            r2 = 4
            r0[r2] = r1
            int r1 = r15.f328587g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.lang.String r12 = "TalkRoomService"
            bs3.C104161b.m138993b(r12, r0)
            nw3.b r0 = r15.f328564K
            if (r0 == 0) goto L_0x0088
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r9 = r29
            r10 = r30
            r11 = r31
            r15 = r12
            r12 = r32
            r17 = r15
            r15 = 2
            r13 = r33
            r14 = r34
            boolean r1 = r1.mo161101l(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0070 }
            java.lang.String r2 = "dealWithInit ret: "
            r0[r16] = r2     // Catch:{ Exception -> 0x0070 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0070 }
            r3 = 1
            r0[r3] = r2     // Catch:{ Exception -> 0x006c }
            r2 = r17
            bs3.C104161b.m138997f(r2, r0)     // Catch:{ Exception -> 0x006a }
            goto L_0x0085
        L_0x006a:
            r0 = move-exception
            goto L_0x007a
        L_0x006c:
            r0 = move-exception
            r2 = r17
            goto L_0x007a
        L_0x0070:
            r0 = move-exception
            r2 = r17
            r3 = 1
            goto L_0x007a
        L_0x0075:
            r0 = move-exception
            r2 = r17
            r3 = 1
            r1 = 0
        L_0x007a:
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.String r5 = "dealWithInit "
            r4[r16] = r5
            r4[r3] = r0
            bs3.C104161b.m138997f(r2, r4)
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            return
        L_0x0088:
            r2 = r12
            r3 = 1
        L_0x008a:
            if (r20 > 0) goto L_0x00b6
            r15 = r19
            r1 = r2
            nw3.g0 r0 = r15.f328563J
            r2 = 202(0xca, float:2.83E-43)
            r0.mo161128j(r2)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "exitTalkRoom dealWithInit fail"
            r0[r16] = r2
            bs3.C104161b.m138997f(r1, r0)
            r6 = 102(0x66, float:1.43E-43)
            r7 = 1
            r1 = r19
            r2 = r25
            r3 = r26
            r4 = r27
            r1.mo161103n(r2, r3, r4, r6, r7)
            nw3.j r0 = r15.f328573S
            r1 = -400(0xfffffffffffffe70, float:NaN)
            r2 = 0
            r0.mo161132b(r1, r2)
            return
        L_0x00b6:
            r15 = r19
            android.os.Handler r0 = r15.f328585e
            nw3.f$c r14 = new nw3.f$c
            r1 = r14
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            r13 = r30
            r18 = r14
            r14 = r31
            r15 = r32
            r16 = r33
            r17 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            r1 = 50
            r3 = r18
            r0.postDelayed(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161100k(int, as3.b1[], as3.y0, byte[], boolean, java.lang.String, int, long, int, int, byte[], int[], int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d8 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01da A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161101l(as3.C103860b1[] r31, as3.C103912y0 r32, byte[] r33, boolean r34, int r35, long r36, int r38, int r39, byte[] r40, int[] r41, int r42, java.lang.String r43) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            r15 = r41
            int r2 = r1.f328587g
            r14 = 2
            java.lang.String r13 = "TalkRoomService"
            r12 = 4
            r11 = 1
            r25 = 0
            if (r2 == r12) goto L_0x0021
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r3 = "dealWithInit state is error: "
            r0[r25] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r11] = r2
            bs3.C104161b.m138997f(r13, r0)
            return r25
        L_0x0021:
            int r2 = com.tencent.p014mm.plugin.multi.talk.f314039a
            r2 = 9
            r3 = r15[r2]
            r1.f328606z = r3
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r4 = "dealWithInit general policy cnt:"
            r3[r25] = r4
            int r4 = r15.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            java.lang.String r4 = ", redirect type:"
            r3[r14] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r1.f328606z
            r4.append(r5)
            java.lang.String r5 = " wifigateway:"
            r4.append(r5)
            r10 = r43
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r26 = 3
            r3[r26] = r4
            bs3.C104161b.m138997f(r13, r3)
            r3 = 20
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "connectToCompenent myRoomMemId roomid:"
            r3[r25] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r35)
            r3[r11] = r4
            java.lang.String r4 = " roomKey: "
            r3[r14] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r36)
            r3[r26] = r4
            java.lang.String r4 = " groupId: "
            r3[r12] = r4
            java.lang.String r4 = r1.f328593p
            r5 = 5
            r3[r5] = r4
            r4 = 6
            java.lang.String r5 = " ip: "
            r3[r4] = r5
            java.lang.String[] r4 = r1.f328583Z
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r5 = 7
            r3[r5] = r4
            r4 = 8
            java.lang.String r5 = " ports: "
            r3[r4] = r5
            short[] r4 = r1.f328582Y
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r3[r2] = r4
            r2 = 10
            java.lang.String r4 = " tcpIp: "
            r3[r2] = r4
            java.lang.String[] r2 = r1.f328603x0
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r4 = 11
            r3[r4] = r2
            r2 = 12
            java.lang.String r4 = " tcpPorts: "
            r3[r2] = r4
            short[] r2 = r1.f328594p0
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r4 = 13
            r3[r4] = r2
            r2 = 14
            java.lang.String r4 = " tcpStartTime: "
            r3[r2] = r4
            int r2 = r1.f328605y0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 15
            r3[r4] = r2
            r2 = 16
            java.lang.String r4 = " audio_encrypt_type: "
            r3[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r38)
            r4 = 17
            r3[r4] = r2
            r2 = 18
            java.lang.String r4 = " video_encrypt_type: "
            r3[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r42)
            r4 = 19
            r3[r4] = r2
            bs3.C104161b.m138993b(r13, r3)
            java.lang.String r2 = cs3.C106962a.f320180a
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L_0x010d
            int r5 = r0.length
            if (r5 <= 0) goto L_0x010d
            int r4 = r0.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x00f2:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x010a
            r6 = r0[r5]
            int r7 = r6.f306893f
            r4[r5] = r7
            java.lang.String r6 = r6.f306906s
            boolean r6 = bs3.C104166f.m139001a(r6, r2)
            if (r6 == 0) goto L_0x0107
            r3 = r0[r5]
            int r3 = r3.f306893f
        L_0x0107:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x010a:
            r8 = r3
            r0 = r4
            goto L_0x010f
        L_0x010d:
            r0 = r4
            r8 = -1
        L_0x010f:
            nw3.c r2 = nw3.C109774c.m149103b()
            java.lang.String r3 = r1.f328593p
            int r27 = r2.mo161019g(r3)
            nw3.g0 r2 = r1.f328563J
            r2.f328682f = r8
            nw3.b r2 = r1.f328564K     // Catch:{ all -> 0x0177 }
            com.tencent.mm.plugin.multi.talk$IMultiTalkListener r3 = r1.f328565L     // Catch:{ all -> 0x0177 }
            nw3.c r4 = nw3.C109774c.m149103b()     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = r1.f328593p     // Catch:{ all -> 0x0177 }
            int r5 = r4.mo161017e(r5)     // Catch:{ all -> 0x0177 }
            java.lang.String[] r9 = r1.f328583Z     // Catch:{ all -> 0x0177 }
            short[] r7 = r1.f328582Y     // Catch:{ all -> 0x0177 }
            r16 = 0
            java.lang.String[] r6 = r1.f328603x0     // Catch:{ all -> 0x0177 }
            short[] r4 = r1.f328594p0     // Catch:{ all -> 0x0177 }
            int r12 = r1.f328605y0     // Catch:{ all -> 0x0177 }
            r18 = r4
            r4 = r32
            r19 = r6
            r6 = r8
            r20 = r7
            r7 = r35
            r28 = r8
            r21 = r9
            r8 = r36
            r10 = r21
            r1 = 1
            r11 = r20
            r20 = r12
            r12 = r16
            r29 = r13
            r13 = r0
            r1 = 2
            r14 = r33
            r15 = r34
            r16 = r19
            r17 = r18
            r18 = r20
            r19 = r38
            r20 = r39
            r21 = r40
            r22 = r41
            r23 = r42
            r24 = r43
            int r0 = r2.mo161004b(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0175 }
            r2 = r30
            r4 = r29
            r3 = 1
            goto L_0x0190
        L_0x0175:
            r0 = move-exception
            goto L_0x017d
        L_0x0177:
            r0 = move-exception
            r28 = r8
            r29 = r13
            r1 = 2
        L_0x017d:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "connectToCompenent"
            r2[r25] = r3
            r3 = 1
            r2[r3] = r0
            r4 = r29
            bs3.C104161b.m138997f(r4, r2)
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            r2 = r30
        L_0x0190:
            nw3.j r5 = r2.f328573S
            r5.getClass()
            nw3.m r6 = new nw3.m
            r6.<init>(r5, r0)
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r7 != r8) goto L_0x01a8
            r6.run()
            goto L_0x01ad
        L_0x01a8:
            android.os.Handler r5 = r5.f328706b
            r5.post(r6)
        L_0x01ad:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "connectToCompenent ret ="
            r5[r25] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)
            r5[r1] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r5[r26] = r1
            bs3.C104161b.m138993b(r4, r5)
            if (r0 >= 0) goto L_0x01d0
            r1 = -3002(0xfffffffffffff446, float:NaN)
            nw3.C109799g0.m149205f(r1)
        L_0x01d0:
            if (r0 != 0) goto L_0x01d6
            nw3.g0 r1 = r2.f328563J
            r1.f328685i = r3
        L_0x01d6:
            if (r0 != 0) goto L_0x01da
            r11 = 1
            goto L_0x01db
        L_0x01da:
            r11 = 0
        L_0x01db:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161101l(as3.b1[], as3.y0, byte[], boolean, int, long, int, int, byte[], int[], int, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b0  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nw3.C109782f.C109793i mo161102m(android.app.Activity r20, java.lang.String r21, int r22, long r23, int r25, int r26, boolean r27, java.lang.String r28, java.lang.String r29) {
        /*
            r19 = this;
            r9 = r19
            r1 = r21
            r0 = r22
            r2 = r23
            r5 = r25
            r6 = r26
            r8 = r28
            nw3.f$i r10 = nw3.C109782f.C109793i.OK
            r4 = 10
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7 = 0
            java.lang.String r11 = "enterTalkRoom"
            r4[r7] = r11
            r11 = 1
            r4[r11] = r1
            r12 = 2
            r4[r12] = r8
            int r13 = r9.f328597s
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 3
            r4[r14] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r22)
            r15 = 4
            r4[r15] = r13
            long r12 = r9.f328598t
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 5
            r4[r13] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r23)
            r17 = 6
            r4[r17] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
            r17 = 7
            r4[r17] = r12
            r12 = 8
            java.lang.String r17 = "needConfirm"
            r4[r12] = r17
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r27)
            r17 = 9
            r4[r17] = r12
            java.lang.String r12 = "TalkRoomService"
            bs3.C104161b.m138997f(r12, r4)
            r4 = r29
            r9.f328554A = r4
            java.lang.String r4 = cs3.C106962a.f320180a
            boolean r4 = bs3.C104166f.m139002b(r4)
            r4 = r4 ^ r11
            java.lang.String r17 = "req"
            java.lang.String r18 = "enter"
            if (r4 != 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r2 = "enterTalkRoom isAuthed: "
            r0[r7] = r2
            java.lang.String r2 = cs3.C106962a.f320180a
            boolean r2 = bs3.C104166f.m139002b(r2)
            r2 = r2 ^ r11
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r11] = r2
            java.lang.String r2 = " isBindMobile: "
            r3 = 2
            r0[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0[r14] = r2
            bs3.C104161b.m138997f(r12, r0)
            int r0 = r9.f328597s
            long r4 = r9.f328598t
            java.lang.String[] r2 = new java.lang.String[r13]
            r2[r7] = r18
            r2[r11] = r17
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2[r3] = r7
            java.lang.String r3 = java.lang.String.valueOf(r26)
            r2[r14] = r3
            java.lang.String r3 = "noAuth"
            r2[r15] = r3
            java.lang.String r3 = ""
            r20 = r21
            r21 = r3
            r22 = r0
            r23 = r4
            r25 = r2
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            nw3.f$i r0 = nw3.C109782f.C109793i.NOT_AUTH
            return r0
        L_0x00b7:
            boolean r4 = zr3.C112683i.m154066a()
            if (r4 != 0) goto L_0x00fc
            if (r6 == r11) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            if (r4 == 0) goto L_0x00fc
            if (r20 == 0) goto L_0x00fc
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = "enterTalkRoom isNetworkConnected is false"
            r0[r7] = r2
            bs3.C104161b.m138997f(r12, r0)
            int r0 = r9.f328597s
            long r2 = r9.f328598t
            java.lang.String[] r4 = new java.lang.String[r13]
            r4[r7] = r18
            r4[r11] = r17
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r7 = 2
            r4[r7] = r5
            java.lang.String r5 = java.lang.String.valueOf(r26)
            r4[r14] = r5
            java.lang.String r5 = "noNetwork"
            r4[r15] = r5
            java.lang.String r5 = ""
            r20 = r21
            r21 = r5
            r22 = r0
            r23 = r2
            r25 = r4
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            nw3.f$i r0 = nw3.C109782f.C109793i.NO_NETWORK
            return r0
        L_0x00fc:
            if (r6 == r11) goto L_0x0100
            r4 = 1
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            r15 = 100
            if (r4 == 0) goto L_0x0144
            if (r6 == r15) goto L_0x0144
            boolean r4 = r19.mo161080L()
            if (r4 == 0) goto L_0x0144
            int r0 = r9.f328597s
            long r2 = r9.f328598t
            java.lang.String[] r4 = new java.lang.String[r13]
            r4[r7] = r18
            r4[r11] = r17
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r8 = 2
            r4[r8] = r5
            java.lang.String r5 = java.lang.String.valueOf(r26)
            r4[r14] = r5
            java.lang.String r5 = "isBusy"
            r6 = 4
            r4[r6] = r5
            java.lang.String r5 = ""
            r20 = r21
            r21 = r5
            r22 = r0
            r23 = r2
            r25 = r4
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = "enterTalkRoom isBusy"
            r0[r7] = r1
            bs3.C104161b.m138997f(r12, r0)
            nw3.f$i r0 = nw3.C109782f.C109793i.BUSY
            return r0
        L_0x0144:
            if (r6 != r15) goto L_0x0147
            goto L_0x0152
        L_0x0147:
            if (r6 == r11) goto L_0x014b
            r4 = 1
            goto L_0x014c
        L_0x014b:
            r4 = 0
        L_0x014c:
            if (r4 == 0) goto L_0x0154
            int r4 = r9.f328587g
            if (r4 != 0) goto L_0x0163
        L_0x0152:
            r4 = 1
            goto L_0x0164
        L_0x0154:
            if (r6 != r11) goto L_0x0163
            java.util.Map<java.lang.String, nw3.f$l> r4 = r9.f328584d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r1)
            nw3.f$l r4 = (nw3.C109782f.C109796l) r4
            if (r4 == 0) goto L_0x0163
            goto L_0x0152
        L_0x0163:
            r4 = 0
        L_0x0164:
            if (r4 != 0) goto L_0x01b0
            r4 = 4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "exitTalkRoom enterTalkRoom isValidEnterState is false enterType: "
            r0[r7] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r0[r11] = r2
            java.lang.String r2 = " state: "
            r3 = 2
            r0[r3] = r2
            int r2 = r9.f328587g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r14] = r2
            bs3.C104161b.m138997f(r12, r0)
            int r0 = r9.f328597s
            long r4 = r9.f328598t
            java.lang.String[] r2 = new java.lang.String[r13]
            r2[r7] = r18
            r2[r11] = r17
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2[r3] = r7
            java.lang.String r3 = java.lang.String.valueOf(r26)
            r2[r14] = r3
            java.lang.String r3 = "isNotValidEnterState"
            r6 = 4
            r2[r6] = r3
            java.lang.String r3 = ""
            r20 = r21
            r21 = r3
            r22 = r0
            r23 = r4
            r25 = r2
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            nw3.f$i r0 = nw3.C109782f.C109793i.NOT_VALID_STATE
            return r0
        L_0x01b0:
            boolean r4 = android.text.TextUtils.isEmpty(r21)
            if (r4 == 0) goto L_0x01ed
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = "exitTalkRoom enterTalkRoom groupId is null"
            r0[r7] = r2
            bs3.C104161b.m138997f(r12, r0)
            int r0 = r9.f328597s
            long r2 = r9.f328598t
            java.lang.String[] r4 = new java.lang.String[r13]
            r4[r7] = r18
            r4[r11] = r17
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r7 = 2
            r4[r7] = r5
            java.lang.String r5 = java.lang.String.valueOf(r26)
            r4[r14] = r5
            java.lang.String r5 = "groupIdnull"
            r6 = 4
            r4[r6] = r5
            java.lang.String r5 = ""
            r20 = r21
            r21 = r5
            r22 = r0
            r23 = r2
            r25 = r4
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            nw3.f$i r0 = nw3.C109782f.C109793i.GROUP_NOT_VALID
            return r0
        L_0x01ed:
            if (r27 == 0) goto L_0x0200
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "enterTalkRoom needConfirm"
            r0[r7] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r27)
            r0[r11] = r1
            bs3.C104161b.m138993b(r12, r0)
            return r10
        L_0x0200:
            if (r6 == r11) goto L_0x0204
            r4 = 1
            goto L_0x0205
        L_0x0204:
            r4 = 0
        L_0x0205:
            if (r4 == 0) goto L_0x020d
            r19.mo161074F()
            r9.mo161092Y(r7)
        L_0x020d:
            r19.mo161077I()
            boolean r4 = r19.mo161076H()
            if (r4 != 0) goto L_0x0267
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = "exitTalkRoom enterTalkRoom initEngine fail"
            r0[r7] = r2
            bs3.C104161b.m138997f(r12, r0)
            if (r6 == r11) goto L_0x0223
            r0 = 1
            goto L_0x0224
        L_0x0223:
            r0 = 0
        L_0x0224:
            java.lang.String r2 = "initEnginefail"
            if (r0 == 0) goto L_0x024f
            int r0 = r9.f328597s
            long r3 = r9.f328598t
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r7] = r18
            r5[r11] = r17
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r8 = 2
            r5[r8] = r6
            r5[r14] = r2
            java.lang.String r2 = ""
            r20 = r21
            r21 = r2
            r22 = r0
            r23 = r3
            r25 = r5
            nw3.C109799g0.m149210l(r20, r21, r22, r23, r25)
            r9.mo161092Y(r7)
            goto L_0x0264
        L_0x024f:
            nw3.g0 r0 = r9.f328563J
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r7] = r18
            r1[r11] = r17
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r4 = 2
            r1[r4] = r3
            r1[r14] = r2
            r0.mo161124a(r1)
        L_0x0264:
            nw3.f$i r0 = nw3.C109782f.C109793i.INIT_ENGINE_FAILED
            return r0
        L_0x0267:
            r9.f328593p = r1
            if (r6 == r11) goto L_0x026d
            r4 = 1
            goto L_0x026e
        L_0x026d:
            r4 = 0
        L_0x026e:
            if (r4 != 0) goto L_0x028c
            java.util.Map<java.lang.String, nw3.f$l> r4 = r9.f328584d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r1)
            nw3.f$l r4 = (nw3.C109782f.C109796l) r4
            if (r4 != 0) goto L_0x027e
            r15 = 0
            goto L_0x0280
        L_0x027e:
            int r15 = r4.f328660a
        L_0x0280:
            r9.f328597s = r15
            if (r4 != 0) goto L_0x0287
            r12 = 0
            goto L_0x0289
        L_0x0287:
            long r12 = r4.f328661b
        L_0x0289:
            r9.f328598t = r12
            goto L_0x0290
        L_0x028c:
            r9.f328597s = r0
            r9.f328598t = r2
        L_0x0290:
            r9.f328577U = r1
            r9.f328596r = r5
            r9.mo161085Q(r14)
            if (r6 == r11) goto L_0x029b
            r4 = 1
            goto L_0x029c
        L_0x029b:
            r4 = 0
        L_0x029c:
            r9.f328588h = r4
            if (r4 == 0) goto L_0x02bd
            nw3.g0 r4 = r9.f328563J
            r4.getClass()
            long r12 = java.lang.System.currentTimeMillis()
            r4.f328674F = r12
            java.lang.String r4 = nw3.C109799g0.f328668J
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r16 = "beginCreateOrEnter"
            r15[r7] = r16
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r15[r11] = r7
            bs3.C104161b.m138993b(r4, r15)
        L_0x02bd:
            boolean r4 = r9.f328588h
            if (r4 == 0) goto L_0x02ee
            nw3.c r4 = nw3.C109774c.m149103b()
            java.lang.String r7 = r9.f328593p
            boolean r4 = r4.mo161022j(r7, r11)
            if (r4 != 0) goto L_0x02ee
            nw3.f$j r4 = new nw3.f$j
            r4.<init>(r9)
            r4.f328654a = r1
            r4.f328655b = r0
            r4.f328656c = r2
            r4.f328657d = r6
            r4.f328658e = r5
            r4.f328659f = r8
            android.os.Message r0 = android.os.Message.obtain()
            r0.what = r14
            r0.obj = r4
            android.os.Handler r1 = r9.f328585e
            r2 = 0
            r1.sendMessageDelayed(r0, r2)
            goto L_0x0300
        L_0x02ee:
            int r2 = r9.f328597s
            long r3 = r9.f328598t
            r7 = 1
            r0 = r19
            r1 = r21
            r5 = r25
            r6 = r26
            r8 = r28
            r0.mo161083O(r1, r2, r3, r5, r6, r7, r8)
        L_0x0300:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161102m(android.app.Activity, java.lang.String, int, long, int, int, boolean, java.lang.String, java.lang.String):nw3.f$i");
    }

    /* renamed from: n */
    public boolean mo161103n(String str, int i, long j, int i2, boolean z) {
        C104161b.m138997f("TalkRoomService", "exitTalkRoom", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            C104161b.m138993b("TalkRoomService", "exitTalkRoom: has exited");
            return false;
        }
        boolean c = C112675e.m154053e().mo164407c(new C110082f(str, i, j, i2));
        this.f328563J.mo161124a("exit", "req", String.valueOf(c), String.valueOf(this.f328587g));
        mo161098i(str, i, j, z);
        C104161b.m138997f("TalkRoomService", "exitTalkRoom ret: ", Boolean.valueOf(c));
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (r19 == 100) goto L_0x0040;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo161104o(java.lang.String r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r1 = 6
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "finishCurrentTalk groupId: "
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r6 = " rejectReason: "
            r7 = 2
            r3[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r8 = 3
            r3[r8] = r6
            java.lang.String r6 = " exitReason: "
            r9 = 4
            r3[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            r10 = 5
            r3[r10] = r6
            java.lang.String r6 = "TalkRoomService"
            bs3.C104161b.m138997f(r6, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r17)
            if (r3 == 0) goto L_0x0033
            return r5
        L_0x0033:
            r6 = r18
            if (r6 == r4) goto L_0x003e
            r3 = 100
            r11 = r19
            if (r11 != r3) goto L_0x0082
            goto L_0x0040
        L_0x003e:
            r11 = r19
        L_0x0040:
            nw3.g0 r3 = r0.f328563J
            r3.getClass()
            java.lang.String r12 = nw3.C109799g0.f328668J
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r14 = "endCancelCreate"
            r13[r5] = r14
            long r14 = java.lang.System.currentTimeMillis()
            long r10 = r3.f328674F
            long r14 = r14 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r13[r4] = r10
            long r10 = r3.f328689m
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r13[r7] = r10
            bs3.C104161b.m138993b(r12, r13)
            long r10 = r3.f328689m
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x006e
            goto L_0x0082
        L_0x006e:
            r3.f328684h = r4
            long r10 = r3.f328674F
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0079
            r3.f328692p = r12
            goto L_0x0082
        L_0x0079:
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r3.f328674F
            long r10 = r10 - r12
            r3.f328692p = r10
        L_0x0082:
            int r3 = r0.f328597s
            long r10 = r0.f328598t
            nw3.f r12 = nw3.C109770a.m149092a()
            int r12 = r12.f328587g
            boolean r13 = nw3.C109801h0.m149216a(r17)
            if (r13 == 0) goto L_0x00a4
            nw3.g0 r1 = r0.f328563J
            r3 = 327(0x147, float:4.58E-43)
            r1.mo161128j(r3)
            nw3.f r1 = nw3.C109770a.m149092a()
            r3 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r1.mo161094f(r2, r3, r4)
            return r1
        L_0x00a4:
            if (r12 != r7) goto L_0x00b4
            nw3.f r1 = nw3.C109770a.m149092a()
            r2 = r17
            r4 = r10
            r6 = r18
            boolean r1 = r1.mo161081M(r2, r3, r4, r6)
            return r1
        L_0x00b4:
            r6 = 7
            java.lang.Integer[] r12 = new java.lang.Integer[r6]
            r13 = 102(0x66, float:1.43E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r5] = r13
            r13 = 103(0x67, float:1.44E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            r4 = 104(0x68, float:1.46E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r7] = r4
            r4 = 105(0x69, float:1.47E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r8] = r4
            r4 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r9] = r4
            r4 = 107(0x6b, float:1.5E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 5
            r12[r7] = r4
            r4 = 108(0x6c, float:1.51E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r1] = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00f5:
            if (r5 >= r6) goto L_0x00ff
            r4 = r12[r5]
            r1.add(r4)
            int r5 = r5 + 1
            goto L_0x00f5
        L_0x00ff:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r1.contains(r4)
            nw3.f r1 = nw3.C109770a.m149092a()
            r7 = 1
            r2 = r17
            r4 = r10
            r6 = r19
            boolean r1 = r1.mo161103n(r2, r3, r4, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109782f.mo161104o(java.lang.String, int, int):boolean");
    }

    /* renamed from: p */
    public final void mo161105p(int i, int i2, C103884k0 k0Var, C110077a aVar) {
        int i3 = i2;
        C110077a aVar2 = aVar;
        C104161b.m138997f("TalkRoomService", "CLTNOT handleAckEnd errCode is ", Integer.valueOf(i2), " groupId: ", aVar2.f329377j, " roomid: ", Integer.valueOf(aVar2.f329378k), " roomKey: ", Long.valueOf(aVar2.f329379l));
        if (i3 == 18950) {
            if (!mo161078J(aVar2.f329377j, aVar2.f329378k, aVar2.f329379l, false)) {
                C109799g0.m149209k(aVar2.f329377j, aVar2.f329378k, aVar2.f329379l, "ack", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
            }
            MultiTalkGroup d = C109774c.m149103b().mo161016d(aVar2.f329377j);
            C104161b.m138997f("TalkRoomService", "CLTNOT handleAckEnd onMisscMultiTalk mGroupId:", aVar2.f329377j, " multiTalkGroup: ", d);
            if (d != null) {
                C109804j jVar = this.f328573S;
                int i4 = aVar2.f329380m;
                jVar.getClass();
                C109809l lVar = new C109809l(jVar, i4, d);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    lVar.run();
                } else {
                    jVar.f328706b.post(lVar);
                }
            }
        } else {
            if (i3 == 0) {
                this.f328589i = true;
            }
            if (!mo161080L()) {
                C104161b.m138997f("TalkRoomService", "CLTNOT handleAckEnd is working groupId: ", aVar2.f329377j);
                mo161074F();
                mo161092Y(false);
                this.f328563J.mo161124a("ack", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
                this.f328588h = false;
                String str = aVar2.f329377j;
                this.f328593p = str;
                this.f328577U = str;
                this.f328597s = aVar2.f329378k;
                this.f328598t = aVar2.f329379l;
                this.f328596r = aVar2.f329381n;
                mo161085Q(2);
                this.f328601w = System.currentTimeMillis();
                C109799g0 g0Var = this.f328563J;
                g0Var.getClass();
                C104161b.m138993b(C109799g0.f328668J, "beginNotifyTime");
                g0Var.f328676H = System.currentTimeMillis();
                if (i3 == 18900) {
                    C109799g0.m149206g(-1521);
                }
            } else if (C104166f.m139001a(aVar2.f329377j, this.f328593p)) {
                C104161b.m138997f("TalkRoomService", "CLTNOT handleAckEnd groupid same return ", this.f328593p);
                return;
            }
            C109796l lVar2 = new C109796l(this);
            String str2 = aVar2.f329377j;
            lVar2.f328660a = aVar2.f329378k;
            lVar2.f328661b = aVar2.f329379l;
            ((HashMap) this.f328584d).put(str2, lVar2);
            MultiTalkGroup d2 = C109774c.m149103b().mo161016d(aVar2.f329377j);
            C104161b.m138997f("TalkRoomService", "CLTNOT handleAckEnd onInviteMultiTalk mGroupId:", aVar2.f329377j, " multiTalkGroup: ", d2);
            if (d2 != null) {
                C109804j jVar2 = this.f328573S;
                jVar2.getClass();
                C109808k kVar = new C109808k(jVar2, d2);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    kVar.run();
                } else {
                    jVar2.f328706b.post(kVar);
                }
            } else {
                mo161099j(aVar2.f329377j, aVar2.f329378k, aVar2.f329379l, false, false, false, false);
            }
        }
    }

    /* renamed from: q */
    public final void mo161106q(int i, int i2, C103913z zVar, C110078b bVar) {
        int i3 = i2;
        C103913z zVar2 = zVar;
        C110078b bVar2 = bVar;
        C104161b.m138997f("TalkRoomService", "handleAddVoiceGroupMemberEnd", this.f328593p, Integer.valueOf(this.f328597s), Long.valueOf(this.f328598t), " errCode: ", Integer.valueOf(i2));
        HashMap hashMap = (HashMap) C0377a.m322a(14600, -1301, 14601, -1302, 14602, -1303, 14651, -1309);
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            C109799g0.m149206g(((Integer) hashMap.get(Integer.valueOf(i2))).intValue());
        }
        if (i3 != 0) {
            String str = "TalkRoomService";
            if (mo161078J(bVar2.f329382j, bVar2.f329383k, bVar2.f329384l, false)) {
                this.f328563J.mo161124a("add", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
                if (i3 == 14651) {
                    C104161b.m138994c(str, "handleAddVoiceGroupMemberEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", 14651, zVar2.f307234b, Integer.valueOf(zVar2.f307235c), Long.valueOf(zVar2.f307236d));
                    this.f328573S.mo161132b(-301, zVar2);
                    return;
                }
                this.f328573S.mo161132b(-300, (Object) null);
                return;
            }
            return;
        }
        String str2 = "TalkRoomService";
        Object[] objArr = new Object[2];
        objArr[0] = "handleAddVoiceGroupMemberEnd  resp.members length: ";
        C103860b1[] b1VarArr = zVar2.f307237e;
        objArr[1] = Integer.valueOf(b1VarArr == null ? 0 : b1VarArr.length);
        C104161b.m138997f(str2, objArr);
        if (!mo161078J(zVar2.f307234b, zVar2.f307235c, zVar2.f307236d, false)) {
            C104161b.m138997f(str2, "handleAddVoiceGroupMemberEnd isCurrentRoom false resp.groupId: ", zVar2.f307234b, this.f328593p, " resp.roomid: ", Integer.valueOf(zVar2.f307235c), Integer.valueOf(this.f328597s));
            C109799g0.m149206g(-1308);
        } else {
            this.f328563J.mo161124a("add", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
        }
        mo161075G(zVar2.f307234b, (String) null, this.f328596r, zVar2.f307235c, zVar2.f307236d, zVar2.f307237e, (C103863c1[]) null, zVar2.f307238f, true, true);
    }

    /* renamed from: r */
    public final void mo161107r(int i, int i2, C103856a0 a0Var) {
        if (i2 == 18300) {
            C109799g0.m149206g(-1531);
        }
        C104161b.m138997f("TalkRoomService", "handleCancelCreateEnd errCode is ", Integer.valueOf(i2));
    }

    /* renamed from: s */
    public final void mo161108s(int i, int i2, C103862c0 c0Var, C110081e eVar) {
        int[] iArr;
        String str;
        char c;
        int i3 = i2;
        C103862c0 c0Var2 = c0Var;
        C110081e eVar2 = eVar;
        C104161b.m138993b("TalkRoomService", "handleEnterTalkRoomEnd", eVar2.f329388j, Integer.valueOf(eVar2.f329389k), Long.valueOf(eVar2.f329390l), " errCode: ", Integer.valueOf(i2), " state: ", Integer.valueOf(this.f328587g));
        HashMap hashMap = (HashMap) C0377a.m322a(14200, -1101, 14201, -1102, 14202, -1103, 14203, -1104, 14204, -1105, 14205, -1111, 14287, -1112);
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            C109799g0.m149206g(((Integer) hashMap.get(Integer.valueOf(i2))).intValue());
        }
        if (i3 == 14255) {
            C104161b.m138994c("TalkRoomService", "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", 14255, c0Var2.f306915b, Integer.valueOf(c0Var2.f306916c), Long.valueOf(c0Var2.f306917d));
            this.f328573S.mo161132b(-14255, c0Var2);
        } else if (i3 == 14287) {
            C104161b.m138994c("TalkRoomService", "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", 14287, c0Var2.f306915b, Integer.valueOf(c0Var2.f306916c), Long.valueOf(c0Var2.f306917d));
            this.f328573S.mo161132b(-14287, c0Var2);
        } else if (i3 == 14256) {
            C104161b.m138994c("TalkRoomService", "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", 14256, c0Var2.f306915b, Integer.valueOf(c0Var2.f306916c), Long.valueOf(c0Var2.f306917d));
            this.f328573S.mo161132b(-14256, c0Var2);
        } else if (i3 != 0 && i3 != 14204) {
            String str2 = "TalkRoomService";
            if (!mo161078J(eVar2.f329388j, eVar2.f329389k, eVar2.f329390l, eVar2.f329391m != 1)) {
                C104161b.m138997f(str2, "handleEnterTalkRoomEnd isCurrentRoom is false errCode:", Integer.valueOf(i2), " enterScene.mGroupId: ", eVar2.f329388j, " mGroupId: ", this.f328593p, Integer.valueOf(eVar2.f329389k), Integer.valueOf(this.f328597s), Long.valueOf(eVar2.f329390l), Long.valueOf(this.f328598t));
                return;
            }
            String str3 = str2;
            int i4 = this.f328587g;
            if (3 != i4) {
                C104161b.m138997f(str3, "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(i4), " errCode: ", Integer.valueOf(i2), eVar2.f329388j, Integer.valueOf(eVar2.f329389k), Long.valueOf(eVar2.f329390l));
                return;
            }
            this.f328563J.mo161124a("enter", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
            this.f328563J.mo161128j(322);
            C104161b.m138997f(str3, "exitTalkRoom handleEnterTalkRoomEnd fail errCode: ", Integer.valueOf(i2), eVar2.f329388j, Integer.valueOf(eVar2.f329389k), Long.valueOf(eVar2.f329390l));
            mo161098i(eVar2.f329388j, eVar2.f329389k, eVar2.f329390l, true);
            if (i3 == 14251) {
                this.f328573S.mo161132b(-1000, (Object) null);
            } else if (i3 == 14252) {
                this.f328573S.mo161132b(-1200, (Object) null);
            } else if (i3 == 14253) {
                int i5 = 60;
                if (c0Var2 != null) {
                    i5 = Integer.valueOf(c0Var2.f306936w);
                }
                this.f328573S.mo161132b(-1500, i5);
            } else {
                this.f328573S.mo161132b(-200, (Object) null);
            }
        } else if (i3 == 14204 && this.f328587g == 4) {
            C104161b.m138997f("TalkRoomService", "handleEnterTalkRoomEnd errCode == EmRetCode.E_Talk_Enter_AlreadyEnter", c0Var2.f306915b, Integer.valueOf(c0Var2.f306916c), Long.valueOf(c0Var2.f306917d));
        } else {
            String str4 = "TalkRoomService";
            if (!mo161078J(c0Var2.f306915b, c0Var2.f306916c, c0Var2.f306917d, c0Var2.f306923j != 1)) {
                C104161b.m138997f(str4, "handleEnterTalkRoomEnd isCurrentRoom is false,state: ", Integer.valueOf(this.f328587g), " resp.groupId锟斤拷", c0Var2.f306915b, " mGroupId: ", this.f328593p, Integer.valueOf(c0Var2.f306916c), Integer.valueOf(this.f328597s), Long.valueOf(c0Var2.f306917d), Long.valueOf(this.f328598t));
                mo161103n(c0Var2.f306915b, c0Var2.f306916c, c0Var2.f306917d, 111, false);
                C109799g0.m149206g(-1110);
                return;
            }
            String str5 = str4;
            int i6 = this.f328587g;
            if (i6 != 3) {
                C104161b.m138997f(str5, "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(i6), c0Var2.f306915b, Integer.valueOf(c0Var2.f306916c), Long.valueOf(c0Var2.f306917d));
                return;
            }
            this.f328563J.mo161124a("enter", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
            C103895q[] qVarArr = c0Var2.f306918e;
            if (qVarArr == null || qVarArr.length == 0) {
                String str6 = str5;
                C103862c0 c0Var3 = c0Var2;
                C104161b.m138997f(str6, "handleEnterTalkRoomEnd resp.addrlist is null,errCode: ", Integer.valueOf(i2), c0Var3.f306915b, Integer.valueOf(c0Var3.f306916c), Long.valueOf(c0Var3.f306917d));
                C109799g0.m149206g(-1605);
                this.f328563J.f328683g = 329;
                mo161103n(c0Var3.f306915b, c0Var3.f306916c, c0Var3.f306917d, 116, true);
                this.f328573S.mo161132b(-200, (Object) null);
                return;
            }
            String str7 = c0Var2.f306915b;
            this.f328593p = str7;
            this.f328577U = str7;
            this.f328597s = c0Var2.f306916c;
            this.f328598t = c0Var2.f306917d;
            mo161085Q(4);
            mo161115z(c0Var2.f306918e, c0Var2.f306928o, c0Var2.f306929p);
            String str8 = str5;
            mo161075G(c0Var2.f306915b, (String) null, this.f328596r, c0Var2.f306916c, c0Var2.f306917d, c0Var2.f306919f, c0Var2.f306924k, c0Var2.f306925l, false, true);
            C109804j jVar = this.f328573S;
            MultiTalkGroup d = C109774c.m149103b().mo161016d(c0Var2.f306915b);
            long j = this.f328598t;
            jVar.getClass();
            C109815r rVar = new C109815r(jVar, d, j);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                rVar.run();
            } else {
                jVar.f328706b.post(rVar);
            }
            byte[] bArr = new byte[c0Var2.f306922i.length];
            int i7 = 0;
            while (true) {
                int[] iArr2 = c0Var2.f306922i;
                if (i7 >= iArr2.length) {
                    break;
                }
                bArr[i7] = (byte) iArr2[i7];
                i7++;
            }
            int[] iArr3 = new int[c0Var2.f306934u.length];
            int i8 = 0;
            while (true) {
                iArr = c0Var2.f306934u;
                if (i8 >= iArr.length) {
                    break;
                }
                iArr3[i8] = iArr[i8];
                i8++;
            }
            int i9 = talk.f314039a;
            String str9 = str8;
            C104161b.m138997f(str9, "handleEnterTalkRoomEnd, general policy cnt:", Integer.valueOf(iArr.length), " redirect type:", Integer.valueOf(iArr3[9]), " SimpleRedirect value:", 9);
            String str10 = str9;
            mo161100k(0, c0Var2.f306919f, c0Var2.f306920g, bArr, (c0Var2.f306921h & 2) != 0, c0Var2.f306915b, c0Var2.f306916c, c0Var2.f306917d, c0Var2.f306930q, c0Var2.f306931r, c0Var2.f306932s, iArr3, c0Var2.f306935v, this.f328554A);
            C103862c0 c0Var4 = c0Var;
            if (c0Var4.f306937x != 0) {
                c = 1;
                Object[] objArr = {"get helloFreqSeconds:" + c0Var4.f306937x};
                str = str10;
                C104161b.m138995d(str, objArr);
                f328552W0 = c0Var4.f306937x * 1000;
            } else {
                str = str10;
                c = 1;
            }
            mo161086R();
            Object[] objArr2 = new Object[4];
            objArr2[0] = "handleVoiceGroupMemberChange handleEnterTalkRoomEnd";
            objArr2[c] = this.f328593p;
            objArr2[2] = Integer.valueOf(this.f328597s);
            objArr2[3] = Long.valueOf(this.f328598t);
            C104161b.m138997f(str, objArr2);
        }
    }

    /* renamed from: t */
    public final void mo161109t(int i, int i2, C103865d0 d0Var) {
        C104161b.m138993b("TalkRoomService", "handleExitVoiceRoomEnd", d0Var.f306958b, this.f328593p, Integer.valueOf(this.f328597s), Long.valueOf(this.f328598t), " errCode: ", Integer.valueOf(i2));
        HashMap hashMap = (HashMap) C0377a.m322a(14400, -1201, 14401, -1202, 14402, -1203, 14403, -1204);
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            C109799g0.m149206g(((Integer) hashMap.get(Integer.valueOf(i2))).intValue());
        }
        if (i2 != 0) {
            C104161b.m138997f("TalkRoomService", "handleExitVoiceRoomEnd fail errCode is ", Integer.valueOf(i2));
        }
    }

    /* renamed from: u */
    public final void mo161110u(int i, int i2, C103886l0 l0Var) {
        int i3;
        C103857a1[] a1VarArr;
        String str;
        int i4;
        ArrayList arrayList;
        String str2 = "TalkRoomService";
        C104161b.m138997f(str2, "handleGetGroupInfoBatch errCode: ", Integer.valueOf(i2));
        if (i2 != 0) {
            this.f328573S.mo161131a((List<MultiTalkGroup>) null);
            return;
        }
        C103857a1[] a1VarArr2 = l0Var.f307073b;
        if (a1VarArr2 == null || a1VarArr2.length == 0) {
            C104161b.m138997f(str2, "handleGetGroupInfoBatch resp.groupInfoList is null");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = a1VarArr2.length;
        int i5 = 0;
        while (i5 < length) {
            C103857a1 a1Var = a1VarArr2[i5];
            if (a1Var == null) {
                i4 = i5;
                i3 = length;
                arrayList = arrayList2;
                a1VarArr = a1VarArr2;
                str = str2;
            } else {
                String str3 = a1Var.f306850b;
                int i6 = a1Var.f306851c;
                C103857a1 a1Var2 = a1Var;
                long j = a1Var.f306852d;
                i4 = i5;
                a1VarArr = a1VarArr2;
                i3 = length;
                str = str2;
                mo161075G(str3, (String) null, 0, i6, j, a1Var.f306853e, (C103863c1[]) null, (C103914z0) null, false, false);
                arrayList = arrayList2;
                arrayList.add(C109774c.m149103b().mo161016d(a1Var2.f306850b));
            }
            i5 = i4 + 1;
            length = i3;
            arrayList2 = arrayList;
            str2 = str;
            a1VarArr2 = a1VarArr;
        }
        ArrayList arrayList3 = arrayList2;
        C104161b.m138997f(str2, "handleGetGroupInfoBatch multiTalkGrouplist size: ", Integer.valueOf(arrayList3.size()));
        this.f328573S.mo161131a(arrayList3);
    }

    /* renamed from: v */
    public final void mo161111v(int i, int i2, C103892o0 o0Var) {
        int i3 = 0;
        C104161b.m138993b("TalkRoomService", "handleHelloEnd", o0Var.f307117b, this.f328593p, Integer.valueOf(this.f328597s), Long.valueOf(this.f328598t), Integer.valueOf(i2), Integer.valueOf(i));
        mo161095g();
        if (i2 == 14800) {
            i3 = -1401;
        } else if (i2 == 14801) {
            i3 = -1402;
        }
        if (i3 != 0) {
            this.f328563J.mo161128j(C40473o1.CTRL_INDEX);
            C109799g0.m149206g(i3);
        }
    }

    /* renamed from: w */
    public final void mo161112w(int i, int i2, Object obj) {
        C104161b.m138993b("TalkRoomService", "talkHoldonResp", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == 19100) {
            C109799g0.m149206g(-1541);
        }
    }

    /* renamed from: x */
    public final void mo161113x(int i, int i2, C103868e0 e0Var, C110083g gVar) {
        int i3;
        long j;
        int i4 = i2;
        C103868e0 e0Var2 = e0Var;
        if (i4 == 17900) {
            C109799g0.m149206g(-1511);
        }
        if (i4 != 0) {
            C109804j jVar = this.f328573S;
            gVar.getClass();
            jVar.getClass();
            C28416g.m38191a(new C109820w(jVar, (String) null, i4));
            C104161b.m138997f("TalkRoomService", "handleNetSceneModifyVoiceGroupEnd fail errCode is ", Integer.valueOf(i2));
            return;
        }
        TalkRoom h = C109774c.m149103b().mo161020h(e0Var2.f306976b);
        if (h != null) {
            C104161b.m138997f("TalkRoomService", "handleVoiceGroupMemberChange handleModifyVoiceGroupEnd");
            String str = e0Var2.f306976b;
            int i5 = h.f320045g;
            int i6 = i5 == 0 ? 0 : i5;
            try {
                i3 = C109770a.m149092a().f328597s;
            } catch (Exception e) {
                C104161b.m138997f("tagorewang:VoiceGroupUtil", "getActiveRoomId err: ", e);
                i3 = 0;
            }
            try {
                j = C109770a.m149092a().f328598t;
            } catch (Exception e2) {
                C104161b.m138997f("tagorewang:VoiceGroupUtil", "getActiveRoomKey err: ", e2);
                j = 0;
            }
            mo161075G(str, (String) null, i6, i3, j, (C103860b1[]) null, (C103863c1[]) null, e0Var2.f306977c, true, false);
        } else {
            mo161075G(e0Var2.f306976b, (String) null, 0, 0, 0, (C103860b1[]) null, (C103863c1[]) null, e0Var2.f306977c, true, false);
        }
        C109804j jVar2 = this.f328573S;
        String str2 = e0Var2.f306976b;
        jVar2.getClass();
        C28416g.m38191a(new C109820w(jVar2, str2, 0));
    }

    /* renamed from: y */
    public final void mo161114y(int i, int i2, Object obj, C110084h hVar) {
        C104161b.m138993b("TalkRoomService", "handleRedirectResp", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != 0 || obj == null) {
            C104161b.m138994c("TalkRoomService", "handleRedirectResp err", Integer.valueOf(i), Integer.valueOf(i2));
            hVar.getClass();
            if (mo161078J((String) null, 0, 0, false)) {
                this.f328563J.mo161124a("redirect", "resp", String.valueOf(-1), String.valueOf(this.f328587g));
                return;
            }
            return;
        }
        C103890n0 n0Var = (C103890n0) obj;
        if (!mo161078J(n0Var.f307093b, n0Var.f307094c, n0Var.f307095d, false)) {
            C104161b.m138994c("TalkRoomService", "handleRedirectResp roomid error", Integer.valueOf(n0Var.f307094c), Integer.valueOf(this.f328597s));
            return;
        }
        this.f328563J.mo161124a("redirect", "resp", String.valueOf(i2), String.valueOf(this.f328587g));
        C103890n0 n0Var2 = n0Var;
        mo161075G(n0Var.f307093b, (String) null, this.f328596r, n0Var.f307094c, n0Var.f307095d, n0Var.f307097f, n0Var.f307101j, n0Var.f307102k, false, false);
        mo161115z(n0Var2.f307096e, n0Var2.f307105n, n0Var2.f307106o);
        String str = "TalkRoomService";
        C104161b.m138993b(str, "handleRedirectResp redirect type:", Integer.valueOf(this.f328606z));
        if (this.f328606z == 0) {
            byte[] bArr = new byte[n0Var2.f307100i.length];
            int i3 = 0;
            while (true) {
                int[] iArr = n0Var2.f307100i;
                if (i3 >= iArr.length) {
                    break;
                }
                bArr[i3] = (byte) iArr[i3];
                i3++;
            }
            int[] iArr2 = new int[n0Var2.f307111t.length];
            int i4 = 0;
            while (true) {
                int[] iArr3 = n0Var2.f307111t;
                if (i4 >= iArr3.length) {
                    break;
                }
                iArr2[i4] = iArr3[i4];
                i4++;
            }
            C109772b bVar = this.f328564K;
            if (bVar != null) {
                C104161b.m138993b(str, "handleRedirectResp redirect engine close ret:", Integer.valueOf(bVar.mo161003a()));
                C103860b1[] b1VarArr = n0Var2.f307097f;
                C103912y0 y0Var = n0Var2.f307098g;
                boolean z = (n0Var2.f307099h & 2) != 0;
                String str2 = n0Var2.f307093b;
                int i5 = n0Var2.f307094c;
                long j = n0Var2.f307095d;
                int i6 = n0Var2.f307107p;
                int i7 = n0Var2.f307108q;
                byte[] bArr2 = n0Var2.f307109r;
                int[] iArr4 = iArr2;
                mo161100k(0, b1VarArr, y0Var, bArr, z, str2, i5, j, i6, i7, bArr2, iArr4, n0Var2.f307112u, this.f328554A);
                return;
            }
            C104161b.m138993b(str, "handleRedirectResp engine close but nullptr");
            return;
        }
        int a = C109803i0.m149217a(C104162c.f308396a);
        C104161b.m138995d(str, "amyfwang,Redirect::netType:", Integer.valueOf(a));
        C109772b bVar2 = this.f328564K;
        String[] strArr = this.f328583Z;
        short[] sArr = this.f328582Y;
        String[] strArr2 = this.f328603x0;
        short[] sArr2 = this.f328594p0;
        talk talk = bVar2.f328532a;
        if (talk != null) {
            talk.Redirect(strArr, sArr, strArr2, sArr2, a);
        }
    }

    /* renamed from: z */
    public final void mo161115z(C103895q[] qVarArr, C103895q[] qVarArr2, int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "handleRelayData addrs length: ";
        objArr[1] = Integer.valueOf(qVarArr == null ? 0 : qVarArr.length);
        C104161b.m138993b("TalkRoomService", objArr);
        if (qVarArr != null && qVarArr.length > 0) {
            this.f328583Z = new String[qVarArr.length];
            this.f328582Y = new short[qVarArr.length];
            this.f328603x0 = new String[qVarArr2.length];
            this.f328594p0 = new short[qVarArr2.length];
            this.f328605y0 = i;
            C104161b.m138997f("TalkRoomService", "handleRelayData tcpStartTime: ", Integer.valueOf(i));
            int i2 = 0;
            for (C103895q qVar : qVarArr) {
                String[] strArr = this.f328583Z;
                String str = qVar.f307129d;
                strArr[i2] = str;
                short[] sArr = this.f328582Y;
                int i3 = qVar.f307128c;
                sArr[i2] = (short) i3;
                C104161b.m138997f("TalkRoomService", "handleRelayData ip: ", str, " addr.port: ", Integer.valueOf(i3));
                i2++;
            }
            int i4 = 0;
            for (C103895q qVar2 : qVarArr2) {
                String[] strArr2 = this.f328603x0;
                String str2 = qVar2.f307129d;
                strArr2[i4] = str2;
                short[] sArr2 = this.f328594p0;
                int i5 = qVar2.f307128c;
                sArr2[i4] = (short) i5;
                C104161b.m138997f("TalkRoomService", "handleRelayData tcpIp: ", str2, " tcpAddr.port: ", Integer.valueOf(i5));
                i4++;
            }
            String str3 = this.f328593p;
            C104161b.m138993b("TalkRoomService", "handleRelayData", Arrays.toString(this.f328583Z), Arrays.toString(this.f328582Y), str3, str3, Integer.valueOf(this.f328597s), Long.valueOf(this.f328598t), Arrays.toString(this.f328603x0), Arrays.toString(this.f328594p0), Integer.valueOf(this.f328605y0));
        }
    }
}
