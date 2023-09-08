package av0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.p014mm.lan_cs.Client;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30748j;
import com.tencent.p014mm.storage.C30752k;
import com.tencent.p014mm.storage.C30760n;
import com.tencent.p014mm.storage.C30762o;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C97625j3;
import ev0.C20612a;
import f40.C86709a0;
import gv0.C116994i;
import gv0.C20840a;
import gv0.C20842c;
import gv0.C20859o;
import gv0.C20862p;
import gy3.C87412m;
import h81.C32735h;
import hv0.C98544e;
import iv0.C21140c;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import lc3.C10485b;
import lu3.C88656g;
import ob0.C11385n;
import ob0.C117747y;
import p385u2.C111105a;
import pv0.C100964b0;
import pv0.C100966p;
import pv0.C22016r;
import pv0.C22018z;
import pv0.C47525d;
import pv0.C47529h;
import pv0.C62561i;
import pv0.C62567m;
import qv0.C22133b;
import sf0.C77702q0;
import sv0.C22399a;
import sv0.C22400b;
import te3.C118432fy1;
import te3.C48680a9;
import te3.C52229z8;
import te3.C64844xz;
import yu0.C102909e;
import yu0.C102910f;
import yu0.C102911g;
import yu0.C102913k;
import yu0.C23364b;
import zh3.C91753f;
import zt3.C119157j;
import zu0.C103090n;
import zu0.C23575c;
import zu0.C66985a;

/* renamed from: av0.b */
public class C16690b implements C20842c.C20846e, C102909e {

    /* renamed from: Y */
    public static boolean f45104Y;

    /* renamed from: Z */
    public static boolean f45105Z;

    /* renamed from: p0 */
    public static int f45106p0;

    /* renamed from: A */
    public boolean f45107A = true;

    /* renamed from: B */
    public boolean f45108B = true;

    /* renamed from: C */
    public boolean f45109C = false;

    /* renamed from: D */
    public boolean f45110D = false;

    /* renamed from: E */
    public boolean f45111E = false;

    /* renamed from: F */
    public int f45112F = 0;

    /* renamed from: G */
    public C22400b f45113G;

    /* renamed from: H */
    public String f45114H = "";

    /* renamed from: I */
    public String f45115I;

    /* renamed from: J */
    public int f45116J;

    /* renamed from: K */
    public String f45117K;

    /* renamed from: L */
    public String f45118L;

    /* renamed from: M */
    public int f45119M;

    /* renamed from: N */
    public MTimerHandler f45120N;

    /* renamed from: P */
    public Set<C102909e> f45121P = new HashSet();

    /* renamed from: Q */
    public C23364b f45122Q;

    /* renamed from: R */
    public final C11385n f45123R = new C16697i();

    /* renamed from: S */
    public final C11385n f45124S = new C16699k();

    /* renamed from: T */
    public final C11385n f45125T = new C16702l();

    /* renamed from: U */
    public long f45126U;

    /* renamed from: V */
    public int f45127V;

    /* renamed from: W */
    public C20842c.C20845d f45128W = new C16691c(this);

    /* renamed from: X */
    public final C20859o.C20861b f45129X = new C16692d();

    /* renamed from: d */
    public C103090n f45130d;

    /* renamed from: e */
    public long f45131e = 0;

    /* renamed from: f */
    public long f45132f = -1;

    /* renamed from: g */
    public long f45133g = 0;

    /* renamed from: h */
    public long f45134h = 0;

    /* renamed from: i */
    public long f45135i = 0;

    /* renamed from: j */
    public long f45136j = 0;

    /* renamed from: n */
    public long f45137n = 0;

    /* renamed from: o */
    public Object f45138o = new Object();

    /* renamed from: p */
    public boolean f45139p = false;

    /* renamed from: q */
    public LinkedList<String> f45140q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<Long> f45141r;

    /* renamed from: s */
    public LinkedList<String> f45142s;

    /* renamed from: t */
    public LinkedList<Long> f45143t;

    /* renamed from: u */
    public HashSet<String> f45144u = new HashSet<>();

    /* renamed from: v */
    public long f45145v = 0;

    /* renamed from: w */
    public long f45146w = 0;

    /* renamed from: x */
    public boolean f45147x = true;

    /* renamed from: y */
    public int f45148y = 0;

    /* renamed from: z */
    public boolean f45149z = false;

    /* renamed from: av0.b$c */
    public class C16691c implements C20842c.C20845d {
        public C16691c(C16690b bVar) {
        }

        /* renamed from: a */
        public void mo17681a() {
            Log.m105924i("MicroMsg.BackupMoveRecoverServer", "stopCallback ");
            C20842c.m22876D1();
            C16686a.m16193i().mo17659g();
        }
    }

    /* renamed from: av0.b$d */
    public class C16692d implements C20859o.C20861b {
        public C16692d() {
        }

        /* renamed from: a */
        public void mo17682a() {
            C16690b.this.mo17667K(C16686a.m16193i().mo142622e().mo142623a());
        }

        /* renamed from: b */
        public void mo17683b() {
            int a = C16686a.m16193i().mo142622e().mo142623a();
            Log.m105921e("MicroMsg.BackupMoveRecoverServer", "speedOverTime callback, backupState[%d]", Integer.valueOf(a));
            if (a == 23 || a == 4) {
                C16690b.this.mo17672e(true, false, -4);
                C115669n.INSTANCE.idkeyStat(485, 43, 1, false);
                C16690b.this.mo17670c(11789, 4);
                C16686a.m16193i().mo17660h().mo37036e();
            }
        }

        /* renamed from: c */
        public void mo17684c(int i) {
            int a = C16686a.m16193i().mo142622e().mo142623a();
            if (i == 1) {
                if (a == 23) {
                    Log.m105924i("MicroMsg.BackupMoveRecoverServer", "speedCallback is weak connect now.");
                    C16686a.m16193i().mo142622e().mo142628f(4);
                    C16690b.this.mo17667K(4);
                    C16690b.this.mo17670c(11789, 8);
                }
            } else if (i == 0 && a == 4) {
                Log.m105924i("MicroMsg.BackupMoveRecoverServer", "speedCallback is normal speed now.");
                C16686a.m16193i().mo142622e().mo142628f(23);
                C16690b.this.mo17667K(23);
                C16690b.this.mo17670c(11789, 9);
            }
        }
    }

    /* renamed from: av0.b$e */
    public class C16693e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Set f45151d;

        /* renamed from: e */
        public final /* synthetic */ int f45152e;

        public C16693e(C16690b bVar, Set set, int i) {
            this.f45151d = set;
            this.f45152e = i;
        }

        public void run() {
            for (C102909e K : this.f45151d) {
                K.mo17667K(this.f45152e);
            }
        }
    }

    /* renamed from: av0.b$f */
    public class C16694f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f45153d;

        public C16694f(int i) {
            this.f45153d = i;
        }

        public void run() {
            C23364b bVar = C16690b.this.f45122Q;
            if (bVar != null) {
                ((C21140c.C21141a) bVar).mo33100a(this.f45153d);
            }
        }
    }

    /* renamed from: av0.b$g */
    public class C16695g implements Runnable {
        public C16695g() {
        }

        public void run() {
            C16690b.this.mo17673f();
        }
    }

    /* renamed from: av0.b$h */
    public class C16696h implements Runnable {
        public C16696h() {
        }

        public void run() {
            C16690b.this.mo17673f();
        }
    }

    /* renamed from: av0.b$i */
    public class C16697i implements C11385n {
        public C16697i() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            C64844xz xzVar;
            int i4 = i;
            int i5 = i2;
            C97625j3.m125815e().mo123470p(595, C16690b.this.f45123R);
            C102910f.f303738g = 22;
            C16686a.m16193i().mo142622e().mo142628f(1);
            Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
            className.addFlags(335544320);
            className.putExtra("nofification_type", "backup_move_notification");
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer$2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer$2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.idkeyStat(485, 41, 1, false);
            C118432fy1 fy12 = (C118432fy1) ((C116994i) yVar).f350571e.f127056b.f127083a;
            String str2 = null;
            if (i4 != 0 || i5 != 0) {
                Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info other error [%d,%d,%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i4 == 4 && i5 == -2011) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info: INVALID URL");
                }
                if (!Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null)).equals(fy12.f354016p)) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                    C16686a.m16193i().mo142622e().mo142628f(-14);
                    C16690b.this.mo17667K(-14);
                    return;
                }
                C16686a.m16193i().mo142622e().mo142628f(-5);
                C16690b.this.mo17667K(-5);
            } else if (!Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null)).equals(fy12.f354016p)) {
                Log.m105920e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                C16686a.m16193i().mo142622e().mo142628f(-5);
                C16690b.this.mo17667K(-14);
            } else {
                C16686a.m16193i().f303742b = fy12.f354007d;
                C16686a.m16193i().f303743c = fy12.f354009f;
                C16686a.m16193i().f303744d = fy12.f354010g;
                C20842c.f58886t = C16690b.this.f45128W;
                C16686a.m16193i().mo17658f();
                C20842c.f58878i = C16686a.m16193i().mo17661j();
                C20842c.f58879j = C16686a.m16193i().mo17660h();
                C20842c.f58880n = 2;
                C20842c.f58882p = new C20859o(C16690b.this.f45129X);
                C16690b.this.f45114H = "";
                C16690b.f45105Z = false;
                C16690b.f45106p0 = 2;
                if (fy12.f354012i > 0) {
                    C64844xz first = fy12.f354013j.getFirst();
                    str2 = first.f186422d;
                    i3 = first.f186423e.getFirst().intValue();
                    C16690b bVar = C16690b.this;
                    bVar.f45117K = fy12.f354020t;
                    bVar.f45118L = str2;
                    bVar.f45119M = i3;
                    if (fy12.f354013j.size() > 1) {
                        Context context3 = MMApplicationContext.getContext();
                        C87412m.m108594g(context3, "context");
                        if ((C111105a.m151499a(context3, "android.permission.ACCESS_FINE_LOCATION") == 0) && (xzVar = fy12.f354013j.get(1)) != null && xzVar.f186422d.contains("$")) {
                            Log.m105924i("MicroMsg.BackupMoveRecoverServer", "start WifiDirect deviceName:" + xzVar.f186422d);
                            int lastIndexOf = xzVar.f186422d.lastIndexOf("$");
                            C16690b.this.f45114H = xzVar.f186422d.substring(0, lastIndexOf);
                            str2 = xzVar.f186422d.substring(lastIndexOf);
                            i3 = xzVar.f186423e.getFirst().intValue();
                            C16690b.this.getClass();
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd address convMsgCount is empty");
                    i3 = 0;
                }
                Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d, wifiDeviceName:%s", Integer.valueOf(fy12.f354011h), Integer.valueOf(fy12.f354018r), fy12.f354020t, str2, Integer.valueOf(i3), C16690b.this.f45114H);
                if (Util.isNullOrNil(C16690b.this.f45114H)) {
                    C16690b.this.mo17679l(str2, i3);
                }
            }
        }
    }

    /* renamed from: av0.b$j */
    public class C16698j implements MTimerHandler.CallBack {
        public C16698j() {
        }

        public boolean onTimerExpired() {
            if (C16690b.f45105Z) {
                return true;
            }
            Log.m105920e("MicroMsg.BackupMoveRecoverServer", "try connect overtime failed.");
            MTimerHandler mTimerHandler = C16690b.this.f45120N;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            C16690b.this.mo17680m();
            return true;
        }
    }

    /* renamed from: av0.b$k */
    public class C16699k implements C11385n {

        /* renamed from: av0.b$k$a */
        public class C16700a implements Runnable {
            public C16700a() {
            }

            public void run() {
                C16690b.this.mo17673f();
                C16690b.m16202b(C16690b.this);
            }
        }

        /* renamed from: av0.b$k$b */
        public class C16701b implements Runnable {
            public C16701b() {
            }

            public void run() {
                C16690b.this.mo17673f();
                C16690b.m16202b(C16690b.this);
            }
        }

        public C16699k() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C16690b.f45105Z = true;
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(485, 42, 1, false);
            nVar.mo160131h(11787, 0);
            C20842c.m22884u1(1, C16690b.this.f45124S);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth success");
                C22018z zVar = ((C20840a) yVar).f58866v;
                int i3 = zVar.f62319h;
                if (i3 < 3) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start old move, version:%d", Integer.valueOf(i3));
                    nVar.idkeyStat(485, 104, 1, false);
                    C16686a.m16193i().mo142622e().mo142628f(-12);
                    C16690b.this.mo17667K(-12);
                    return;
                }
                int i4 = zVar.f62320i;
                C16690b.this.f45107A = (zVar.f62321j & 1) != 0;
                Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start new move, version:%d, type:%d, isServerSupportKv:%b", Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(C16690b.this.f45107A));
                if (i4 != 1) {
                    if (C16690b.this.mo17675h()) {
                        C16690b.this.f45112F = 3;
                    } else {
                        C16690b.this.f45112F = 1;
                    }
                    C16690b.this.f45110D = false;
                    Log.m105924i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
                    ((C119157j) C119157j.f356862d).mo183875f(new C16701b());
                } else if (C16690b.this.mo17675h()) {
                    C16690b.this.f45110D = true;
                    Log.m105924i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Resume Move!!!.");
                    C16690b bVar = C16690b.this;
                    bVar.f45112F = 4;
                    C16690b.m16202b(bVar);
                } else {
                    C16690b.this.f45110D = false;
                    Log.m105924i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
                    C16690b.this.f45112F = 2;
                    ((C119157j) C119157j.f356862d).mo183875f(new C16700a());
                }
            } else {
                Log.m105920e("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth failed");
                C16686a.m16193i().mo142622e().mo142628f(-5);
                C16690b.this.mo17667K(-5);
                C16690b.this.mo17670c(11789, 3);
            }
        }
    }

    /* renamed from: av0.b$l */
    public class C16702l implements C11385n {
        public C16702l() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2 = str;
            C20842c.m22884u1(3, C16690b.this.f45125T);
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", Integer.valueOf(i), Integer.valueOf(i2), str2);
            if (i == 0 && i2 == 0) {
                C20862p pVar = (C20862p) yVar;
                C22016r rVar = pVar.f58954v;
                if (!C16686a.m16193i().f303742b.equals(rVar.f62300d)) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
                    C16686a.m16193i().mo142622e().mo142628f(-5);
                    C16690b.this.mo17667K(-5);
                    return;
                }
                C16686a.m16193i().mo142622e().f303755i = rVar.f62305i;
                C16690b bVar = C16690b.this;
                C100966p pVar2 = pVar.f58954v.f62306j;
                bVar.f45115I = pVar2.f295655d;
                if (pVar2.f295658g.toLowerCase().contains("ios")) {
                    C16690b.this.f45116J = 1;
                } else {
                    C16690b.this.f45116J = 2;
                }
                C16690b bVar2 = C16690b.this;
                C22016r rVar2 = pVar.f58954v;
                bVar2.f45134h = rVar2.f62302f;
                bVar2.f45148y = rVar2.f62304h;
                Log.m105925i("MicroMsg.BackupMoveRecoverServer", "move recover backupMoveDevice[%d], totalCount[%d], totalSize[%d kb], and wait old mobile's pushData", Integer.valueOf(bVar2.f45116J), Long.valueOf(pVar.f58954v.f62301e), Long.valueOf(pVar.f58954v.f62302f / 1024));
                C16690b bVar3 = C16690b.this;
                if (bVar3.f45108B && bVar3.f45107A) {
                    C115669n.INSTANCE.idkeyStat(485, (long) ((bVar3.f45149z || bVar3.f45148y == 1) ? 66 : 65), 1, false);
                }
                if (pVar.f58954v.f62307n == 3) {
                    C16690b.this.f45109C = true;
                    Log.m105924i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
                } else {
                    C16690b.this.f45109C = false;
                }
                PLong pLong = new PLong();
                PLong pLong2 = new PLong();
                C102913k.m136040e(0, pLong, pLong2, C97625j3.m125812b().mo105891f());
                C16690b bVar4 = C16690b.this;
                long j = bVar4.f45134h;
                double d = 5.24288E8d;
                if (((double) j) * 0.1d <= 5.24288E8d) {
                    d = ((double) j) * 0.1d;
                }
                long j2 = j + ((long) d);
                bVar4.f45126U = j2;
                long j3 = pLong2.value;
                if (j3 < j2) {
                    Log.m105921e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(C16690b.this.f45134h));
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(11787, 5);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo142622e().mo142628f(-13);
                    C16690b.this.mo17667K(-13);
                    nVar.idkeyStat(485, 5, 1, false);
                    return;
                }
                bVar4.f45145v = Util.nowMilliSecond();
                C20842c.m22889z1();
                return;
            }
            Log.m105920e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:" + str2);
            C16686a.m16193i().mo142622e().mo142628f(-5);
            C16690b.this.mo17667K(-5);
        }
    }

    /* renamed from: av0.b$m */
    public class C16703m implements C22399a {
        public C16703m() {
        }

        /* renamed from: a */
        public void mo17691a(String str, String str2) {
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "setConnectListener ip:%s, port:%d, tryCount:", str, Integer.valueOf(C16690b.this.f45119M), Integer.valueOf(C16690b.f45106p0));
            if (str != null) {
                C16690b.f45106p0--;
                C16690b bVar = C16690b.this;
                bVar.mo17679l(str, bVar.f45119M);
                return;
            }
            C16690b bVar2 = C16690b.this;
            bVar2.mo17679l(bVar2.f45118L, bVar2.f45119M);
        }

        public void onFailed(int i) {
            C16690b bVar = C16690b.this;
            bVar.mo17679l(bVar.f45118L, bVar.f45119M);
        }
    }

    /* renamed from: av0.b$n */
    public class C16704n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f45164d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f45165e;

        /* renamed from: f */
        public final /* synthetic */ int f45166f;

        public C16704n(int i, byte[] bArr, int i2) {
            this.f45164d = i;
            this.f45165e = bArr;
            this.f45166f = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:84:0x044f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r36 = this;
                r1 = r36
                com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_MOVE_RECOVERING_BOOLEAN
                int r2 = r1.f45164d
                r3 = 0
                r4 = 2
                r5 = 0
                r6 = 1
                r7 = 11789(0x2e0d, float:1.652E-41)
                r8 = 0
                java.lang.String r10 = "MicroMsg.BackupMoveRecoverServer"
                r11 = 11
                if (r2 != r11) goto L_0x015f
                av0.b r0 = av0.C16690b.this
                byte[] r2 = r1.f45165e
                int r11 = r1.f45166f
                r0.getClass()
                av0.a r12 = av0.C16686a.m16193i()
                yu0.g r12 = r12.mo142622e()
                int r12 = r12.mo142623a()
                r13 = -13
                if (r12 != r13) goto L_0x0035
                java.lang.String r0 = "requestSessionNotify receive requestSession request, but no enough space for recover, quit."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                goto L_0x015e
            L_0x0035:
                pv0.l r12 = new pv0.l
                r12.<init>()
                pe3.a r12 = yu0.C102913k.m136031C(r12, r2)
                pv0.l r12 = (pv0.C62565l) r12
                r13 = -21
                if (r12 != 0) goto L_0x0066
                java.lang.Object[] r3 = new java.lang.Object[r6]
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r5] = r2
                java.lang.String r2 = "requestSessionNotify parseBuf failed:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r3)
                av0.a r2 = av0.C16686a.m16193i()
                yu0.g r2 = r2.mo142622e()
                r2.mo142628f(r13)
                r0.mo17667K(r13)
                goto L_0x015e
            L_0x0066:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.util.LinkedList<java.lang.String> r14 = r12.f177709d
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r2[r5] = r14
                java.util.LinkedList<java.lang.Long> r14 = r12.f177710e
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r2[r6] = r14
                java.lang.String r14 = "requestSessionNotify receive requestSession request, SessionName size:%d, TimeInterval size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r2)
                java.util.LinkedList<java.lang.String> r2 = r12.f177709d
                r0.f45140q = r2
                java.util.LinkedList<java.lang.Long> r2 = r12.f177710e
                r0.f45141r = r2
                int r2 = r2.size()
                java.util.LinkedList<java.lang.String> r10 = r0.f45140q
                int r10 = r10.size()
                int r10 = r10 * 2
                if (r2 == r10) goto L_0x00af
                r0.mo17671d()
                av0.a r2 = av0.C16686a.m16193i()
                yu0.g r2 = r2.mo142622e()
                r2.mo142628f(r13)
                r0.mo17667K(r13)
                goto L_0x015e
            L_0x00af:
                r0.f45127V = r11
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r0.f45142s = r2
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r0.f45143t = r2
                boolean r2 = r0.f45110D
                if (r2 != 0) goto L_0x0141
                yu0.C102913k.m136044i()
                java.util.LinkedList<java.lang.String> r2 = r0.f45142s
                java.util.LinkedList<java.lang.String> r4 = r0.f45140q
                r2.addAll(r4)
                java.util.LinkedList<java.lang.Long> r2 = r0.f45143t
                java.util.LinkedList<java.lang.Long> r4 = r0.f45141r
                r2.addAll(r4)
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.k r2 = r2.mo105894i()
                java.lang.String r4 = r0.f45115I
                r2.getClass()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "SELECT * FROM BackupMoveTime WHERE deviceId = \""
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "\""
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "getCountByDevice:"
                r11.append(r12)
                r11.append(r10)
                java.lang.String r11 = r11.toString()
                java.lang.String r12 = "MicroMsg.BackupMoveTimeStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f82698d
                android.database.Cursor r2 = r2.rawQuery(r10, r3)
                if (r2 != 0) goto L_0x0120
                java.lang.Object[] r2 = new java.lang.Object[r6]
                r2[r5] = r4
                java.lang.String r3 = "getCountByDevice failed, deviceid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
                r3 = r8
                goto L_0x0128
            L_0x0120:
                int r3 = r2.getCount()
                long r3 = (long) r3
                r2.close()
            L_0x0128:
                int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r2 <= 0) goto L_0x013d
                av0.a r2 = av0.C16686a.m16193i()
                yu0.g r2 = r2.mo142622e()
                r3 = 52
                r2.mo142628f(r3)
                r0.mo17667K(r3)
                goto L_0x015e
            L_0x013d:
                r0.mo17678k(r6)
                goto L_0x0159
            L_0x0141:
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.o r2 = r2.mo105896k()
                java.util.LinkedList<java.lang.String> r3 = r0.f45140q
                java.util.LinkedList<java.lang.Long> r4 = r0.f45141r
                java.util.LinkedList<java.lang.String> r5 = r0.f45142s
                java.util.LinkedList<java.lang.Long> r6 = r0.f45143t
                r2.mo57673jo(r3, r4, r5, r6)
                boolean r2 = r0.f45111E
                r0.mo17678k(r2)
            L_0x0159:
                r2 = 10
                r0.mo17670c(r7, r2)
            L_0x015e:
                return
            L_0x015f:
                r11 = 6
                if (r2 != r11) goto L_0x0263
                av0.b r0 = av0.C16690b.this
                byte[] r2 = r1.f45165e
                int r3 = r1.f45166f
                boolean r7 = r0.f45147x
                if (r7 == 0) goto L_0x016e
                r0.f45147x = r5
            L_0x016e:
                pv0.a0 r7 = new pv0.a0
                r7.<init>()
                pe3.a r7 = yu0.C102913k.m136031C(r7, r2)
                pv0.a0 r7 = (pv0.C100963a0) r7
                if (r7 != 0) goto L_0x019c
                java.lang.Object[] r4 = new java.lang.Object[r6]
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r5] = r2
                java.lang.String r2 = "dataPushNotify parseBuf failed:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r4)
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 1
                java.lang.String r13 = ""
                r12 = r0
                r18 = r3
                r12.mo17676i(r13, r14, r15, r16, r17, r18)
                goto L_0x0262
            L_0x019c:
                int r2 = r7.f295637e
                if (r2 != r6) goto L_0x01cc
                pe3.b r2 = r7.f295642j
                if (r2 == 0) goto L_0x01cc
                java.lang.String r2 = r7.f295636d
                java.lang.String r2 = yu0.C102913k.m136049n(r2)
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.String r12 = r7.f295636d
                r11[r5] = r12
                r11[r6] = r2
                java.lang.String r12 = "dataPushNotify text dataid:%s, dir:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
                yu0.C102913k.m136038c(r2, r7)
                long r11 = r0.f45135i
                pe3.b r2 = r7.f295642j
                byte[] r2 = r2.f257327a
                int r13 = r2.length
                long r13 = (long) r13
                long r11 = r11 + r13
                r0.f45135i = r11
                long r11 = r0.f45136j
                int r2 = r2.length
                long r13 = (long) r2
                long r11 = r11 + r13
                r0.f45136j = r11
            L_0x01cc:
                int r2 = r7.f295637e
                if (r2 != r4) goto L_0x01f8
                java.lang.String r2 = r7.f295636d
                java.lang.String r2 = yu0.C102913k.m136050o(r2)
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.String r12 = r7.f295636d
                r11[r5] = r12
                r11[r6] = r2
                java.lang.String r12 = "dataPushNotify datapush media dataid:%s, dir:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
                yu0.C102913k.m136035G(r2, r7)
                long r11 = r0.f45135i
                pe3.b r2 = r7.f295642j
                byte[] r2 = r2.f257327a
                int r13 = r2.length
                long r13 = (long) r13
                long r11 = r11 + r13
                r0.f45135i = r11
                long r11 = r0.f45137n
                int r2 = r2.length
                long r13 = (long) r2
                long r11 = r11 + r13
                r0.f45137n = r11
            L_0x01f8:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                long r11 = r0.f45135i
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r2[r5] = r4
                long r11 = r0.f45134h
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r2[r6] = r4
                java.lang.String r4 = "dataPushNotify recvSize/convDataSize: %d, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
                long r10 = r0.f45134h
                long r12 = r0.f45135i
                int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r2 >= 0) goto L_0x0219
                r0.f45134h = r12
            L_0x0219:
                java.lang.String r13 = r7.f295636d
                int r14 = r7.f295637e
                int r15 = r7.f295639g
                int r2 = r7.f295640h
                r17 = 0
                r12 = r0
                r16 = r2
                r18 = r3
                r12.mo17676i(r13, r14, r15, r16, r17, r18)
                av0.a r2 = av0.C16686a.m16193i()
                yu0.g r2 = r2.mo142622e()
                long r3 = r0.f45135i
                long r10 = r0.f45136j
                long r12 = r0.f45137n
                long r14 = r2.f303754h
                int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r7 == 0) goto L_0x024a
                long r7 = r2.f303751e
                long r7 = r3 - r7
                r16 = 100
                long r7 = r7 * r16
                long r7 = r7 / r14
                double r7 = (double) r7
                goto L_0x024c
            L_0x024a:
                r7 = 0
            L_0x024c:
                r2.f303751e = r3
                r2.f303752f = r10
                r2.f303753g = r12
                r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r9 < 0) goto L_0x0259
                r5 = 1
            L_0x0259:
                if (r5 == 0) goto L_0x0262
                int r2 = r2.mo142623a()
                r0.mo17667K(r2)
            L_0x0262:
                return
            L_0x0263:
                r11 = 13
                if (r2 != r11) goto L_0x02b8
                av0.b r0 = av0.C16690b.this
                byte[] r2 = r1.f45165e
                int r3 = r1.f45166f
                r0.getClass()
                pv0.k0 r0 = new pv0.k0
                r0.<init>()
                pe3.a r0 = yu0.C102913k.m136031C(r0, r2)
                pv0.k0 r0 = (pv0.C62564k0) r0
                if (r0 != 0) goto L_0x0290
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r5] = r2
                java.lang.String r2 = "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r0)
                goto L_0x02b7
            L_0x0290:
                pv0.l0 r2 = new pv0.l0
                r2.<init>()
                java.util.LinkedList<java.lang.Long> r4 = r0.f177705d
                r2.f177711d = r4
                java.util.LinkedList<java.lang.String> r4 = r0.f177707f
                r2.f177713f = r4
                java.util.LinkedList<java.lang.String> r4 = r0.f177706e
                r2.f177712e = r4
                java.lang.String r0 = r0.f177708g
                r2.f177714g = r0
                byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x02af }
                r2 = 14
                gv0.C20842c.m22886w1(r0, r2, r3)     // Catch:{ Exception -> 0x02af }
                goto L_0x02b7
            L_0x02af:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.String r3 = "buf to PacketSvrIDResponse err."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r3, r2)
            L_0x02b7:
                return
            L_0x02b8:
                r11 = 15
                r12 = 4
                r13 = 3
                if (r2 != r11) goto L_0x04b5
                av0.b r2 = av0.C16690b.this
                byte[] r7 = r1.f45165e
                int r8 = r1.f45166f
                r2.getClass()
                pv0.c0 r9 = new pv0.c0
                r9.<init>()
                pe3.a r9 = yu0.C102913k.m136031C(r9, r7)
                pv0.c0 r9 = (pv0.C118128c0) r9
                if (r9 != 0) goto L_0x02e7
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r7)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r5] = r2
                java.lang.String r2 = "SendTagNotify PacketBackupDataTag parse failed:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r0)
                goto L_0x04b4
            L_0x02e7:
                java.lang.Object[] r7 = new java.lang.Object[r12]
                java.lang.String r11 = r9.f353135g
                r7[r5] = r11
                java.lang.String r11 = r9.f353136h
                r7[r6] = r11
                long r11 = r9.f353133e
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r7[r4] = r11
                long r11 = r9.f353134f
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r7[r13] = r11
                java.lang.String r11 = "tagReqNotify receive tag, MsgDataID:%s, NickName:%s, StartTime:%d, EndTime:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r7)
                java.util.HashSet<java.lang.String> r7 = r2.f45144u
                java.lang.String r11 = r9.f353132d
                r7.add(r11)
                boolean r7 = r2.f45139p
                if (r7 != 0) goto L_0x04b4
                eb0.c r7 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r7 = r7.mo105906u()
                java.lang.Boolean r11 = java.lang.Boolean.TRUE
                r7.mo119677K(r0, r11)
                av0.a r0 = av0.C16686a.m16193i()
                yu0.g r0 = r0.mo142622e()
                int r7 = r0.mo142623a()
                java.util.HashSet<java.lang.String> r11 = r2.f45144u
                int r11 = r11.size()
                java.util.LinkedList<java.lang.String> r12 = r2.f45140q
                int r12 = r12.size()
                if (r11 >= r12) goto L_0x0340
                java.util.HashSet<java.lang.String> r11 = r2.f45144u
                int r11 = r11.size()
                goto L_0x0346
            L_0x0340:
                java.util.LinkedList<java.lang.String> r11 = r2.f45140q
                int r11 = r11.size()
            L_0x0346:
                java.util.LinkedList<java.lang.String> r12 = r2.f45140q
                int r12 = r12.size()
                long r14 = r2.f45135i
                long r3 = r2.f45134h
                long r5 = r2.f45136j
                r19 = r14
                long r13 = r2.f45137n
                r0.mo142628f(r7)
                r0.f303748b = r11
                r0.f303749c = r12
                r11 = r19
                r0.f303751e = r11
                r0.f303754h = r3
                r0.f303752f = r5
                r0.f303753g = r13
                int r0 = r0.mo142623a()
                r2.mo17667K(r0)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.m r0 = r0.mo105895j()
                java.lang.String r2 = r9.f353135g
                java.lang.String r0 = r0.mo57666Lo(r2)
                if (r0 == 0) goto L_0x038e
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = r9.f353135g
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = "tagReqNotify the same tag has received, ignore. MsgDataID:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r0)
                goto L_0x0485
            L_0x038e:
                com.tencent.mm.storage.l r0 = new com.tencent.mm.storage.l
                r0.<init>()
                java.lang.String r2 = r9.f353135g
                r0.field_msgListDataId = r2
                java.lang.String r2 = r9.f353132d
                r0.field_sessionName = r2
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.m r2 = r2.mo105895j()
                boolean r2 = r2.insert(r0)
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r3 = 0
                r4[r3] = r2
                long r2 = r0.systemRowid
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r2 = 1
                r4[r2] = r0
                java.lang.String r0 = "tagReqNotify insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r4)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.o r0 = r0.mo105896k()
                java.lang.String r2 = r9.f353132d
                long r3 = r9.f353133e
                long r5 = r9.f353134f
                r0.getClass()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = "SELECT * FROM BackupTempMoveTime WHERE sessionName = \""
                r7.append(r11)
                r7.append(r2)
                java.lang.String r11 = "\"  AND "
                r7.append(r11)
                java.lang.String r11 = "startTime"
                r7.append(r11)
                java.lang.String r11 = " = "
                r7.append(r11)
                r7.append(r3)
                java.lang.String r12 = " AND "
                r7.append(r12)
                java.lang.String r12 = "endTime"
                r7.append(r12)
                r7.append(r11)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "isTempMoveTimeExist:"
                r11.append(r12)
                r11.append(r7)
                java.lang.String r11 = r11.toString()
                java.lang.String r12 = "MicroMsg.BackupTempMoveTimeStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f82715d
                r11 = 0
                android.database.Cursor r0 = r0.rawQuery(r7, r11)
                if (r0 != 0) goto L_0x043e
                r7 = 3
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r7 = 0
                r0[r7] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r3)
                r3 = 1
                r0[r3] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r3 = 2
                r0[r3] = r2
                java.lang.String r2 = "isTempMoveTimeExist failed, sessionName[%s], startTime[%d], endTime[%d] "
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r0)
                goto L_0x044c
            L_0x043e:
                boolean r2 = r0.moveToNext()
                if (r2 == 0) goto L_0x0449
                r0.close()
                r0 = 1
                goto L_0x044d
            L_0x0449:
                r0.close()
            L_0x044c:
                r0 = 0
            L_0x044d:
                if (r0 != 0) goto L_0x0485
                com.tencent.mm.storage.n r0 = new com.tencent.mm.storage.n
                r0.<init>()
                java.lang.String r2 = r9.f353132d
                r0.field_sessionName = r2
                long r2 = r9.f353133e
                r0.field_startTime = r2
                long r2 = r9.f353134f
                r0.field_endTime = r2
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.o r2 = r2.mo105896k()
                boolean r2 = r2.insert(r0)
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r4 = 0
                r3[r4] = r2
                long r4 = r0.systemRowid
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                r2 = 1
                r3[r2] = r0
                java.lang.String r0 = "tagReqNotify insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r3)
            L_0x0485:
                pv0.d0 r0 = new pv0.d0
                r0.<init>()
                java.lang.String r2 = r9.f353132d
                r0.f353138d = r2
                long r2 = r9.f353133e
                r0.f353139e = r2
                long r2 = r9.f353134f
                r0.f353140f = r2
                java.lang.String r2 = r9.f353135g
                r0.f353141g = r2
                java.lang.String r2 = "tagReqNotify send tag resp"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)     // Catch:{ Exception -> 0x04aa }
                byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x04aa }
                r2 = 16
                gv0.C20842c.m22886w1(r0, r2, r8)     // Catch:{ Exception -> 0x04aa }
                goto L_0x04b4
            L_0x04aa:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "tagReqNotify buf to PacketBackupDataTagResponse err."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r3, r2)
            L_0x04b4:
                return
            L_0x04b5:
                r3 = 8
                if (r2 != r3) goto L_0x06b4
                av0.b r2 = av0.C16690b.this
                byte[] r3 = r1.f45165e
                r2.getClass()
                boolean r4 = av0.C16690b.f45104Y
                if (r4 == 0) goto L_0x04cb
                java.lang.String r0 = "finishReqNotify has already receive finishReq, return."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                goto L_0x06b3
            L_0x04cb:
                r4 = 1
                av0.C16690b.f45104Y = r4
                java.lang.String r5 = "finishReqNotify receive finishReq. hasReceiveFinishReq."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
                pv0.g r5 = new pv0.g
                r5.<init>()
                pv0.g r6 = new pv0.g
                r6.<init>()
                pe3.a r6 = yu0.C102913k.m136031C(r6, r3)
                if (r6 != 0) goto L_0x04f5
                java.lang.Object[] r6 = new java.lang.Object[r4]
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r6[r4] = r3
                java.lang.String r3 = "finishReqNotify buf to BackupFinishRequest error, buflen[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r3, r6)
            L_0x04f5:
                pv0.a r3 = r5.f127515r
                yu0.C102913k.m136032D(r3)
                av0.a r3 = av0.C16686a.m16193i()
                zu0.c r3 = r3.mo17660h()
                r4 = 0
                r3.f67583h = r4
                eb0.c r3 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r3 = r3.mo105906u()
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r3.mo119677K(r0, r4)
                gv0.C20842c.m22876D1()
                gv0.C20842c.m22877E1()
                av0.a r0 = av0.C16686a.m16193i()
                yu0.g r0 = r0.mo142622e()
                java.util.HashSet<java.lang.String> r3 = r2.f45144u
                int r3 = r3.size()
                java.util.LinkedList<java.lang.String> r4 = r2.f45140q
                int r4 = r4.size()
                long r5 = r2.f45135i
                long r13 = r2.f45134h
                long r7 = r2.f45136j
                long r11 = r2.f45137n
                r9 = 24
                r0.mo142628f(r9)
                r0.f303748b = r3
                r0.f303749c = r4
                r0.f303751e = r5
                r0.f303754h = r13
                r0.f303752f = r7
                r0.f303753g = r11
                r2.mo17667K(r9)
                long r3 = r2.f45145v
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
                r5 = 1000(0x3e8, double:4.94E-321)
                r7 = 1024(0x400, double:5.06E-321)
                r11 = 0
                int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x055e
                long r11 = r2.f45135i
                long r11 = r11 / r7
                long r11 = r11 * r5
                long r11 = r11 / r3
            L_0x055e:
                r26 = r11
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r11 = 485(0x1e5, double:2.396E-321)
                r31 = 45
                r33 = 1
                r35 = 0
                r29 = 485(0x1e5, double:2.396E-321)
                r28 = r0
                r28.idkeyStat(r29, r31, r33, r35)
                boolean r9 = r2.f45149z
                if (r9 != 0) goto L_0x057e
                int r9 = r2.f45148y
                r13 = 1
                if (r9 != r13) goto L_0x057b
                goto L_0x057e
            L_0x057b:
                r9 = 67
                goto L_0x0580
            L_0x057e:
                r9 = 68
            L_0x0580:
                long r13 = (long) r9
                r33 = 1
                r9 = 0
                r15 = 0
                r35 = 0
                r28 = r0
                r29 = r11
                r31 = r13
                r28.idkeyStat(r29, r31, r33, r35)
                r11 = 485(0x1e5, double:2.396E-321)
                r31 = 61
                long r5 = r3 / r5
                r29 = 485(0x1e5, double:2.396E-321)
                r33 = r5
                r35 = r15
                r28.idkeyStat(r29, r31, r33, r35)
                r31 = 62
                long r13 = r2.f45135i
                long r33 = r13 / r7
                r29 = r11
                r35 = r9
                r28.idkeyStat(r29, r31, r33, r35)
                r22 = 485(0x1e5, double:2.396E-321)
                boolean r9 = r2.f45149z
                if (r9 != 0) goto L_0x05bb
                int r9 = r2.f45148y
                r11 = 1
                if (r9 != r11) goto L_0x05b8
                goto L_0x05bb
            L_0x05b8:
                r9 = 69
                goto L_0x05bd
            L_0x05bb:
                r9 = 70
            L_0x05bd:
                long r11 = (long) r9
                r28 = 0
                r21 = r0
                r24 = r11
                r21.idkeyStat(r22, r24, r26, r28)
                r11 = 485(0x1e5, double:2.396E-321)
                r31 = 73
                long r13 = r2.f45136j
                long r33 = r13 / r7
                r9 = 0
                r29 = 485(0x1e5, double:2.396E-321)
                r35 = 0
                r28 = r0
                r28.idkeyStat(r29, r31, r33, r35)
                r31 = 74
                long r13 = r2.f45137n
                long r33 = r13 / r7
                r29 = r11
                r35 = r9
                r28.idkeyStat(r29, r31, r33, r35)
                r0 = 1
                r9 = 11789(0x2e0d, float:1.652E-41)
                r2.mo17670c(r9, r0)
                boolean r0 = r2.f45110D
                if (r0 != 0) goto L_0x05f4
                r0 = 2
                r2.mo17670c(r9, r0)
            L_0x05f4:
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 0
                r0[r6] = r5
                long r5 = r2.f45134h
                long r5 = r5 / r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 1
                r0[r6] = r5
                long r5 = r2.f45135i
                long r5 = r5 / r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 2
                r0[r6] = r5
                long r5 = r2.f45136j
                long r5 = r5 / r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 3
                r0[r6] = r5
                long r5 = r2.f45137n
                long r5 = r5 / r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 4
                r0[r6] = r5
                java.lang.String r5 = "finishReqNotify recover success. recoverCostTime[%d s], recoverTotalSize[%d kb], recvSize[%d kb], recvTextSize[%d kb], recvMediaSize[%d kb]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r0)
                boolean r0 = yu0.C102913k.f303764a
                if (r0 == 0) goto L_0x06b3
                java.lang.String r0 = yu0.C102913k.m136051p()
                java.lang.String r5 = yu0.C102913k.m136052q()
                com.tencent.p014mm.vfs.C86013q1.m106441b(r0, r5)
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r5 = "yyyy-MM-dd-HH:mm:ss"
                r0.<init>(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "\nMoveRecover Info:\n"
                r5.<init>(r6)
                java.lang.String r6 = "recoverStartTime:"
                r5.append(r6)
                java.util.Date r6 = new java.util.Date
                long r9 = r2.f45145v
                r6.<init>(r9)
                java.lang.String r0 = r0.format(r6)
                r5.append(r0)
                java.lang.String r0 = "\n"
                r5.append(r0)
                java.lang.String r6 = "recoverCostTime:"
                r5.append(r6)
                r5.append(r3)
                r5.append(r0)
                java.lang.String r0 = "recvSize:"
                r5.append(r0)
                long r3 = r2.f45135i
                long r3 = r3 / r7
                r5.append(r3)
                java.lang.String r0 = " kB\n"
                r5.append(r0)
                java.lang.String r3 = "recvTextSize:"
                r5.append(r3)
                long r3 = r2.f45136j
                long r3 = r3 / r7
                r5.append(r3)
                r5.append(r0)
                java.lang.String r3 = "recvMediaSize:"
                r5.append(r3)
                long r2 = r2.f45137n
                long r2 = r2 / r7
                r5.append(r2)
                r5.append(r0)
                f40.C86709a0.m107528h()
                f40.o r0 = f40.C86709a0.m107535s()
                java.lang.String r0 = r0.f251805c
                java.lang.String r2 = r5.toString()
                byte[] r2 = r2.getBytes()
                java.lang.String r3 = "backupTestInfo.txt"
                yu0.C102913k.m136037b(r0, r3, r2)
            L_0x06b3:
                return
            L_0x06b4:
                r0 = 19
                if (r2 != r0) goto L_0x06cd
                av0.b r0 = av0.C16690b.this
                r0.getClass()
                int r0 = gv0.C20855l.f58931u
                pv0.g0 r0 = new pv0.g0
                r0.<init>()
                byte[] r0 = r0.getData()
                r2 = 20
                gv0.C20842c.m22885v1(r0, r2)
            L_0x06cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: av0.C16690b.C16704n.run():void");
        }
    }

    /* renamed from: av0.b$o */
    public class C16705o implements C23575c.C23577c {

        /* renamed from: a */
        public final /* synthetic */ LinkedBlockingQueue f45168a;

        public C16705o(LinkedBlockingQueue linkedBlockingQueue) {
            this.f45168a = linkedBlockingQueue;
        }
    }

    /* renamed from: av0.b$p */
    public class C16706p implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ LinkedBlockingQueue f45170d;

        public C16706p(LinkedBlockingQueue linkedBlockingQueue) {
            this.f45170d = linkedBlockingQueue;
        }

        public String getKey() {
            return "startSendRequestSessionResponse.onNotifyWorker";
        }

        public void run() {
            while (!C16690b.this.f45139p && !C16690b.f45104Y) {
                C16707q qVar = null;
                try {
                    qVar = (C16707q) this.f45170d.poll(500, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
                Log.m105919d("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse datapushQueue size:%d, startNext receiveData:%s", Integer.valueOf(this.f45170d.size()), qVar);
                if (qVar != null) {
                    C16690b.this.mo17669a(qVar.f45172a, qVar.f45174c, qVar.f45175d, qVar.f45173b);
                }
            }
        }
    }

    /* renamed from: av0.b$q */
    public class C16707q {

        /* renamed from: a */
        public boolean f45172a;

        /* renamed from: b */
        public int f45173b;

        /* renamed from: c */
        public int f45174c;

        /* renamed from: d */
        public byte[] f45175d;

        public C16707q(C16690b bVar, boolean z, int i, int i2, byte[] bArr) {
            this.f45172a = z;
            this.f45173b = i;
            this.f45174c = i2;
            this.f45175d = (byte[]) bArr.clone();
        }
    }

    /* renamed from: av0.b$a */
    public class C16708a implements C88656g {
        public C16708a() {
        }

        public String getKey() {
            return "getMsgCount";
        }

        public void run() {
            C16690b.this.f45132f = (long) ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).mo101146vP();
            C16686a.m16193i().mo142622e().f303757k = C16690b.this.f45132f;
        }
    }

    /* renamed from: av0.b$b */
    public class C16709b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C103090n f45177d;

        public C16709b(C16690b bVar, C103090n nVar) {
            this.f45177d = nVar;
        }

        public void run() {
            this.f45177d.mo142822v(false, 0);
        }
    }

    /* renamed from: b */
    public static void m16202b(C16690b bVar) {
        bVar.getClass();
        Log.m105924i("MicroMsg.BackupMoveRecoverServer", "move recover init");
        f45104Y = false;
        bVar.f45131e = 0;
        bVar.f45132f = 0;
        bVar.f45134h = 0;
        bVar.f45135i = 0;
        bVar.f45136j = 0;
        bVar.f45137n = 0;
        bVar.f45139p = false;
        bVar.f45144u.clear();
        bVar.f45147x = true;
        C20842c.m22879k1(3, bVar.f45125T);
        C20862p pVar = new C20862p(C16686a.m16193i().f303742b);
        pVar.mo32563F1(0, C102913k.m136054s(0), 0, Long.valueOf(C16686a.m16193i().mo17663l().mo140768e()), "");
        pVar.mo32547o1();
        C16686a.m16193i().mo142622e().mo142628f(22);
        bVar.mo17667K(22);
    }

    /* renamed from: K */
    public void mo17667K(int i) {
        MMHandlerThread.postToMainThread(new C16693e(this, new HashSet(this.f45121P), i));
        if (this.f45122Q != null) {
            MMHandlerThread.postToMainThread(new C16694f(i));
        }
    }

    /* renamed from: P */
    public void mo17668P() {
        Iterator it;
        LinkedList<C52229z8> linkedList;
        boolean z;
        long milliSecondsToNow = Util.milliSecondsToNow(this.f45146w) / 1000;
        long j = C16686a.m16193i().mo142622e().f303758l;
        C22133b.m25607b(C22133b.f62617a, 7, 3, C20612a.m22482o().f58033j, Long.valueOf(Util.milliSecondsToNow(this.f45146w)), Long.valueOf(this.f45135i), (Integer) null, (Long) null, (Long) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
        C115669n nVar = C115669n.INSTANCE;
        C115669n nVar2 = nVar;
        nVar2.idkeyStat(485, 49, 1, false);
        nVar.idkeyStat(485, 50, milliSecondsToNow, false);
        nVar2.idkeyStat(485, 72, j, false);
        nVar.idkeyStat(485, 52, this.f45135i / 1024, false);
        this.f45133g = C86013q1.m106451l(C86709a0.m107535s().mo121140g());
        nVar.mo160131h(17868, 1, Long.valueOf(milliSecondsToNow), Long.valueOf(this.f45135i / 1024), Long.valueOf(this.f45136j / 1024), Long.valueOf(this.f45137n / 1024), Long.valueOf(this.f45131e / 1024), Long.valueOf(this.f45133g / 1024), Long.valueOf(this.f45132f), Long.valueOf(j));
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "backupMoveMerge, errcode[%d], mergeTime[%d s], recvSize[%d KB], recvTextSize[%d KB], recvMediaSize[%d KB], originDbSize[%d kb], finishMergeDbSize[%d kb], originMsgCount[%d], mergeMsgCount[%d]", 1, Long.valueOf(milliSecondsToNow), Long.valueOf(this.f45135i / 1024), Long.valueOf(this.f45136j / 1024), Long.valueOf(this.f45137n / 1024), Long.valueOf(this.f45131e / 1024), Long.valueOf(this.f45133g / 1024), Long.valueOf(this.f45132f), Long.valueOf(j));
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, Boolean.TRUE);
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS. mergeTime:%d, totalMsgCount:%d", Long.valueOf(milliSecondsToNow), Long.valueOf(j));
        if (C102913k.f303764a) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            C86709a0.m107528h();
            C102913k.m136037b(C86709a0.m107535s().f251805c, "backupTestInfo.txt", ("\nMerge Info:\n" + "mergeStartTime:" + simpleDateFormat.format(new Date(this.f45146w)) + "\n" + "mergeTime:" + milliSecondsToNow + "\n" + "totalMsgCount:" + j + "\n" + "recvSize:" + (this.f45135i / 1024) + " kB\n").getBytes());
        }
        if (!this.f45109C) {
            C30762o k = C97625j3.m125812b().mo105896k();
            k.getClass();
            LinkedList linkedList2 = new LinkedList();
            Cursor all = k.getAll();
            if (all == null) {
                Log.m105920e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
            } else {
                while (all.moveToNext()) {
                    C30760n nVar3 = new C30760n();
                    nVar3.convertFrom(all);
                    linkedList2.add(nVar3);
                }
                all.close();
            }
            if (linkedList2.size() <= 0) {
                Log.m105920e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
            } else {
                Log.m105924i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
                C30752k i = C97625j3.m125812b().mo105894i();
                String str = this.f45115I;
                i.getClass();
                Log.m105924i("MicroMsg.BackupMoveTimeStorage", "start mergeDataByDeviceId.");
                HashMap hashMap = new HashMap();
                String str2 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + str + "\" ";
                Log.m105918d("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice:" + str2);
                Cursor rawQuery = i.f82698d.rawQuery(str2, (String[]) null);
                if (rawQuery == null) {
                    Log.m105921e("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice failed, deviceid:%s", str);
                } else {
                    while (rawQuery.moveToNext()) {
                        C30748j jVar = new C30748j();
                        jVar.convertFrom(rawQuery);
                        hashMap.put(jVar.field_sessionName, jVar);
                    }
                    rawQuery.close();
                }
                if (((C91753f) i.f82698d).delete("BackupMoveTime", "deviceId= ? ", new String[]{"" + str}) < 0) {
                    Log.m105921e("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId delete db failed, deviceid:%s", str);
                } else {
                    Iterator it4 = linkedList2.iterator();
                    while (it4.hasNext()) {
                        C30760n nVar4 = (C30760n) it4.next();
                        C30748j jVar2 = (C30748j) hashMap.get(nVar4.field_sessionName);
                        if (jVar2 == null) {
                            C52229z8 z8Var = new C52229z8();
                            z8Var.f145750d = nVar4.field_startTime;
                            z8Var.f145751e = nVar4.field_endTime;
                            C30748j jVar3 = new C30748j();
                            jVar3.field_deviceId = str;
                            jVar3.field_sessionName = nVar4.field_sessionName;
                            C48680a9 a9Var = new C48680a9();
                            jVar3.field_moveTime = a9Var;
                            a9Var.f130374d = new LinkedList<>();
                            jVar3.field_moveTime.f130374d.add(z8Var);
                            hashMap.put(nVar4.field_sessionName, jVar3);
                        } else {
                            LinkedList<C52229z8> linkedList3 = jVar2.field_moveTime.f130374d;
                            if (nVar4.field_startTime <= nVar4.field_endTime) {
                                Iterator<C52229z8> it5 = linkedList3.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it = it4;
                                        linkedList = linkedList3;
                                        z = false;
                                        break;
                                    }
                                    C52229z8 next = it5.next();
                                    long j2 = nVar4.field_startTime;
                                    Iterator<C52229z8> it6 = it5;
                                    long j3 = next.f145751e;
                                    if (j2 >= j3) {
                                        it5 = it6;
                                    } else {
                                        long j4 = nVar4.field_endTime;
                                        LinkedList<C52229z8> linkedList4 = linkedList3;
                                        long j5 = next.f145750d;
                                        if (j4 < j5) {
                                            C52229z8 z8Var2 = new C52229z8();
                                            z8Var2.f145750d = nVar4.field_startTime;
                                            z8Var2.f145751e = nVar4.field_endTime;
                                            LinkedList<C52229z8> linkedList5 = linkedList4;
                                            linkedList5.add(z8Var2);
                                            it = it4;
                                            linkedList = linkedList5;
                                        } else {
                                            LinkedList<C52229z8> linkedList6 = linkedList4;
                                            it = it4;
                                            linkedList = linkedList6;
                                            if (j2 < j5) {
                                                next.f145750d = j2;
                                            }
                                            if (j4 > j3) {
                                                next.f145751e = j4;
                                                while (true) {
                                                    if (!it6.hasNext()) {
                                                        break;
                                                    }
                                                    C52229z8 next2 = it6.next();
                                                    long j6 = nVar4.field_endTime;
                                                    if (j6 <= next2.f145750d) {
                                                        break;
                                                    }
                                                    long j7 = next2.f145751e;
                                                    if (j6 <= j7) {
                                                        next.f145751e = j7;
                                                        it6.remove();
                                                        break;
                                                    }
                                                    it6.remove();
                                                }
                                            }
                                        }
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    C52229z8 z8Var3 = new C52229z8();
                                    z8Var3.f145750d = nVar4.field_startTime;
                                    z8Var3.f145751e = nVar4.field_endTime;
                                    linkedList.add(z8Var3);
                                }
                                it4 = it;
                            }
                        }
                        it = it4;
                        it4 = it;
                    }
                    for (String str3 : hashMap.keySet()) {
                        Log.m105925i("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId insert BackupMoveTimeStorage ret[%b], sessionName:%s", Boolean.valueOf(i.insert((C30748j) hashMap.get(str3))), str3);
                    }
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C16695g());
        C20842c.m22874B1(22);
        C20842c.m22876D1();
        C20842c.m22877E1();
    }

    /* renamed from: a */
    public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = i2;
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(bArr2 == null ? 0 : bArr2.length);
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", objArr);
        if (z && 10011 == i3) {
            int a = C16686a.m16193i().mo142622e().mo142623a();
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify local disconnect, backupMoveState:%d", Integer.valueOf(a));
            if (!(a == -21 || a == -13)) {
                if (a == 1) {
                    C16686a.m16193i().mo17660h().mo37036e();
                    if (!f45105Z) {
                        if (this.f45120N != null) {
                            Log.m105924i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify stop backupConnectTimerHandler.");
                            this.f45120N.stopTimer();
                        }
                        mo17680m();
                        return;
                    }
                    C16686a.m16193i().mo142622e().mo142628f(-4);
                    mo17667K(-4);
                    return;
                } else if (a != -5) {
                    if (a == -4) {
                        mo17672e(true, false, 0);
                        return;
                    } else if (a == 22 || a == 23) {
                        mo17672e(true, false, -4);
                        C16686a.m16193i().mo17660h().mo37036e();
                        C115669n.INSTANCE.idkeyStat(485, 43, 1, false);
                        mo17670c(11789, 4);
                        long j = this.f45145v;
                        long j2 = 0;
                        if (j != 0) {
                            j2 = Util.milliSecondsToNow(j);
                        }
                        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify recover transfer disconnect, recoverDataSize:%d, recvSize:%d, recoverCostTime:%d", Long.valueOf(this.f45134h), Long.valueOf(this.f45135i), Long.valueOf(j2));
                        return;
                    } else {
                        return;
                    }
                }
            }
            C16686a.m16193i().mo17660h().mo37036e();
        } else if (i3 == 9) {
            C47529h hVar = (C47529h) C102913k.m136031C(new C47529h(), bArr2);
            if (hVar == null) {
                Log.m105921e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr)));
                return;
            }
            C62561i iVar = new C62561i();
            iVar.f177692d = hVar.f127518d;
            try {
                C20842c.m22886w1(iVar.toByteArray(), 10, i4);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e, "onNotify buf to BackupHeartBeatResponse err.", new Object[0]);
            }
        } else if (i3 == 10) {
            C62561i iVar2 = (C62561i) C102913k.m136031C(new C62561i(), bArr2);
            Object[] objArr2 = new Object[2];
            objArr2[0] = iVar2;
            objArr2[1] = Long.valueOf(iVar2 != null ? iVar2.f177692d : -1);
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "onNotify receive heartbeat response, resp:%s ack:%d", objArr2);
        } else {
            if (i3 == 5) {
                C115669n.INSTANCE.idkeyStat(485, 51, 1, false);
                mo17672e(true, false, -100);
            }
            C86709a0.m107525e().postToWorker(new C16704n(i3, bArr2, i4));
        }
    }

    /* renamed from: c */
    public void mo17670c(int i, int i2) {
        long j = this.f45145v;
        long j2 = 0;
        if (j != 0) {
            j2 = Util.milliSecondsToNow(j);
        }
        long j3 = j2 / 1000;
        C115669n.INSTANCE.mo160131h(i, 0, 0, 0, 0, 0, Integer.valueOf(i2), Integer.valueOf(this.f45116J), Long.valueOf(this.f45135i / 1024), Long.valueOf(j3), Long.valueOf(this.f45131e / 1024), Integer.valueOf(this.f45112F));
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "backupMoveRecoverKvStat kvNum[%d], errcode[%d], backupDataSize[%d KB], recvSize[%d KB], recoverCostTime[%d s], originDbSize[%d kb]", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(this.f45134h / 1024), Long.valueOf(this.f45135i / 1024), Long.valueOf(j3), Long.valueOf(this.f45131e / 1024));
    }

    /* renamed from: d */
    public void mo17671d() {
        C47525d dVar = new C47525d();
        dVar.f127501d = C16686a.m16193i().f303742b;
        try {
            Log.m105924i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
            C20842c.m22885v1(dVar.toByteArray(), 5);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e, "buf to BackupCancelRequest err.", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo17672e(boolean z, boolean z2, int i) {
        boolean z3 = false;
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "cancel backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], updateState[%d], caller:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), MMStack.getCaller());
        if (!z) {
            mo17671d();
        }
        synchronized (this.f45138o) {
            this.f45139p = true;
            C103090n nVar = this.f45130d;
            if (nVar == null || !nVar.f304169b) {
                z3 = true;
            } else {
                nVar.mo142822v(z2, i);
            }
            this.f45130d = null;
        }
        if (z3 && i != 0) {
            C16686a.m16193i().mo142622e().mo142628f(i);
            mo17667K(i);
        }
        if (z2) {
            ((C119157j) C119157j.f356862d).mo183875f(new C16696h());
        }
        C20842c.m22876D1();
        C20842c.m22877E1();
        C16686a.m16193i().mo17659g();
        C16686a.m16193i().mo17660h().f67583h = null;
        C22133b.m25607b(C22133b.f62617a, 7, 4, C20612a.m22482o().f58033j, Long.valueOf(Util.milliSecondsToNow(this.f45146w)), Long.valueOf(this.f45135i), (Integer) null, (Long) null, (Long) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
    }

    /* renamed from: f */
    public void mo17673f() {
        Log.m105924i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
        this.f45144u.clear();
        if (!C102913k.f303764a) {
            C102913k.m136047l(C102913k.m136051p());
            C102913k.m136043h();
        }
    }

    /* renamed from: g */
    public void mo17674g(Context context) {
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "initWifiDirect wifiDeviceName:%s", this.f45114H);
        if (!Util.isNullOrNil(this.f45114H)) {
            if (this.f45113G == null) {
                this.f45113G = new C22400b(context);
            }
            C22400b bVar = this.f45113G;
            bVar.f63508h = new C16703m();
            bVar.mo35551d(this.f45114H);
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "initWifiDirect connect wifiDeviceName:%s", this.f45114H);
        }
    }

    /* renamed from: h */
    public boolean mo17675h() {
        return C97625j3.m125812b().mo105895j().mo57669qq();
    }

    /* renamed from: i */
    public final void mo17676i(String str, int i, int i2, int i3, int i4, int i5) {
        C100964b0 b0Var = new C100964b0();
        b0Var.f295644d = str;
        b0Var.f295645e = i;
        b0Var.f295646f = i2;
        b0Var.f295647g = i3;
        b0Var.f295648h = i4;
        try {
            C20842c.m22886w1(b0Var.toByteArray(), 7, i5);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e, "sendResp", new Object[0]);
        }
    }

    /* renamed from: j */
    public void mo17677j(boolean z) {
        int i;
        C87412m.m108594g(7, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("reportAndCommit() called with: key = ");
        sb.append("Type");
        sb.append(", value = ");
        sb.append(7);
        sb.append(" stack:");
        int i2 = C77702q0.f226484a;
        sb.append(new C77702q0.C77703a());
        Log.m105918d("BackupReport", sb.toString());
        C22133b.f62617a.mo35248a(7, 1, C20612a.m22482o().f58033j);
        synchronized (this.f45138o) {
            C103090n nVar = this.f45130d;
            if (nVar == null || !nVar.f304169b) {
                if (nVar != null) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C16709b(this, nVar));
                }
                HashSet<String> hashSet = this.f45144u;
                if (hashSet != null) {
                    if (hashSet.size() > 0) {
                        i = this.f45144u.size();
                        C16686a.m16193i().mo142622e().mo142628f(26);
                        C16686a.m16193i().mo142622e().f303750d = 0;
                        mo17667K(26);
                        C98544e.m128035f().mo137899c();
                        this.f45146w = Util.nowMilliSecond();
                        C103090n nVar2 = new C103090n(C16686a.m16193i(), 2, this, i, false, new LinkedList(), new LinkedList());
                        this.f45130d = nVar2;
                        nVar2.mo142826z(z);
                        C115669n.INSTANCE.idkeyStat(485, 46, 1, false);
                        return;
                    }
                }
                i = C97625j3.m125812b().mo105895j().mo57668jo();
                C16686a.m16193i().mo142622e().mo142628f(26);
                C16686a.m16193i().mo142622e().f303750d = 0;
                mo17667K(26);
                C98544e.m128035f().mo137899c();
                this.f45146w = Util.nowMilliSecond();
                C103090n nVar22 = new C103090n(C16686a.m16193i(), 2, this, i, false, new LinkedList(), new LinkedList());
                this.f45130d = nVar22;
                nVar22.mo142826z(z);
                C115669n.INSTANCE.idkeyStat(485, 46, 1, false);
                return;
            }
            Log.m105920e("MicroMsg.BackupMoveRecoverServer", "startMerge hasStartMerge, return.");
        }
    }

    /* renamed from: k */
    public void mo17678k(boolean z) {
        Iterator<Long> it;
        LinkedList<C52229z8> linkedList;
        boolean z2 = z;
        char c = 0;
        char c2 = 1;
        int i = 2;
        Log.m105925i("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse, isChooseAll:%s, isResumeMove:%s, isQuickBackup:%s", Boolean.valueOf(z), Boolean.valueOf(this.f45110D), Boolean.valueOf(this.f45109C));
        this.f45111E = z2;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C16686a.m16193i().mo17660h().f67583h = new C16705o(linkedBlockingQueue);
        ((C119157j) C119157j.f356862d).mo183884o(new C16706p(linkedBlockingQueue));
        if (z2) {
            C97625j3.m125812b().mo105894i().deleteAllData();
        }
        long j = 0;
        if (!this.f45110D && !this.f45109C && !z2) {
            LinkedList<String> linkedList2 = this.f45142s;
            LinkedList<Long> linkedList3 = this.f45143t;
            this.f45142s = new LinkedList<>();
            this.f45143t = new LinkedList<>();
            C30752k i2 = C97625j3.m125812b().mo105894i();
            String str = this.f45115I;
            LinkedList<String> linkedList4 = this.f45142s;
            LinkedList<Long> linkedList5 = this.f45143t;
            i2.getClass();
            Iterator<Long> it4 = linkedList3.iterator();
            Iterator<String> it5 = linkedList2.iterator();
            while (it5.hasNext()) {
                String next = it5.next();
                if (it4.hasNext()) {
                    long longValue = it4.next().longValue();
                    if (!it4.hasNext()) {
                        break;
                    }
                    long longValue2 = it4.next().longValue();
                    if (longValue2 == j) {
                        longValue2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                    }
                    String str2 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + str + "\" AND " + "sessionName" + " = \"" + next + "\" ";
                    Log.m105918d("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession:" + str2);
                    C48680a9 a9Var = null;
                    Cursor rawQuery = i2.f82698d.rawQuery(str2, (String[]) null);
                    if (rawQuery == null) {
                        Object[] objArr = new Object[i];
                        objArr[c] = str;
                        objArr[c2] = next;
                        Log.m105921e("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession failed, deviceid:%s, sessionName:%s ", objArr);
                    } else if (rawQuery.moveToFirst()) {
                        C30748j jVar = new C30748j();
                        jVar.convertFrom(rawQuery);
                        rawQuery.close();
                        a9Var = jVar.field_moveTime;
                    } else {
                        rawQuery.close();
                    }
                    if (a9Var == null || a9Var.f130374d.size() <= 0 || longValue2 < a9Var.f130374d.getFirst().f145750d || longValue > a9Var.f130374d.getLast().f145751e) {
                        it = it4;
                        linkedList4.add(next);
                        linkedList5.add(Long.valueOf(longValue));
                        linkedList5.add(Long.valueOf(longValue2));
                    } else {
                        LinkedList<C52229z8> linkedList6 = a9Var.f130374d;
                        int i3 = 0;
                        boolean z3 = false;
                        while (true) {
                            if (i3 >= linkedList6.size() || longValue > longValue2) {
                                it = it4;
                            } else {
                                C52229z8 z8Var = linkedList6.get(i3);
                                long j2 = z8Var.f145751e;
                                if (longValue > j2) {
                                    linkedList = linkedList6;
                                    it = it4;
                                } else {
                                    linkedList = linkedList6;
                                    it = it4;
                                    if (longValue < z8Var.f145750d) {
                                        linkedList4.add(next);
                                        linkedList5.add(Long.valueOf(longValue));
                                        long j3 = z8Var.f145750d;
                                        if (longValue2 < j3) {
                                            linkedList5.add(Long.valueOf(longValue2));
                                            longValue = z8Var.f145750d;
                                            z3 = true;
                                            break;
                                        }
                                        linkedList5.add(Long.valueOf(j3));
                                        longValue = z8Var.f145751e;
                                        z3 = true;
                                    } else {
                                        longValue = j2;
                                    }
                                }
                                i3++;
                                linkedList6 = linkedList;
                                it4 = it;
                            }
                        }
                        it = it4;
                        if (longValue <= longValue2) {
                            linkedList4.add(next);
                            linkedList5.add(Long.valueOf(longValue));
                            linkedList5.add(Long.valueOf(longValue2));
                            z3 = true;
                        }
                        if (!z3) {
                            linkedList4.add(next);
                            linkedList5.add(Long.valueOf(longValue));
                            linkedList5.add(Long.valueOf(longValue2));
                        }
                    }
                } else {
                    it = it4;
                }
                it4 = it;
                c = 0;
                c2 = 1;
                i = 2;
                j = 0;
            }
            Log.m105925i("MicroMsg.BackupMoveTimeStorage", "getSessionRequestTimeInteval, resultSession size:%s, resultTimeInterval:%s", Integer.valueOf(linkedList4.size()), Integer.valueOf(linkedList5.size()));
        }
        C62567m mVar = new C62567m();
        LinkedList<String> linkedList7 = this.f45142s;
        mVar.f177715d = linkedList7;
        mVar.f177716e = this.f45143t;
        try {
            Log.m105925i("MicroMsg.BackupMoveRecoverServer", "send requestsession resp, SessionName size:%d, TimeInterval size:%d", Integer.valueOf(linkedList7.size()), Integer.valueOf(mVar.f177716e.size()));
            C20842c.m22886w1(mVar.toByteArray(), 12, this.f45127V);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e, "buf to BackupRequestSessionResponse err.", new Object[0]);
        }
        try {
            Iterator<Long> it6 = this.f45143t.iterator();
            Iterator<String> it7 = this.f45142s.iterator();
            while (it7.hasNext()) {
                Log.m105925i("MicroMsg.BackupMoveRecoverServer", "session:%s, startTime:%s, endTime:%s", it7.next(), it6.next(), it6.next());
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.BackupMoveRecoverServer", "TimeInterval size error. e:%s", e2);
        }
        C20842c.m22873A1();
        if (this.f45110D) {
            C22133b.f62617a.mo35248a(7, 2, C20612a.m22482o().f58033j);
            C16686a.m16193i().mo142622e().mo142626d(23, 1, this.f45140q.size());
            this.f45134h = C16686a.m16193i().mo142622e().f303754h;
            this.f45135i = C16686a.m16193i().mo142622e().f303751e;
            this.f45136j = C16686a.m16193i().mo142622e().f303752f;
            this.f45137n = C16686a.m16193i().mo142622e().f303753g;
            this.f45131e = C16686a.m16193i().mo142622e().f303756j;
            this.f45132f = C16686a.m16193i().mo142622e().f303757k;
        } else {
            C102911g e3 = C16686a.m16193i().mo142622e();
            int size = this.f45140q.size();
            long j4 = this.f45134h;
            e3.mo142628f(23);
            e3.f303748b = 1;
            e3.f303749c = size;
            e3.f303751e = 0;
            e3.f303754h = j4;
            e3.f303752f = 0;
            e3.f303753g = 0;
            this.f45131e = C86013q1.m106451l(C86709a0.m107535s().mo121140g());
            C16686a.m16193i().mo142622e().f303756j = this.f45131e;
        }
        C98544e.m128035f().mo137899c();
        this.f45132f = -1;
        ((C119157j) C119157j.f356862d).mo183884o(new C16708a());
        mo17667K(23);
    }

    /* renamed from: l */
    public void mo17679l(String str, int i) {
        C23575c h = C16686a.m16193i().mo17660h();
        h.f67576a.set(2);
        h.f67577b = str;
        h.f67578c = i;
        Client.f157040a = new C66985a(h);
        boolean z = true;
        C20842c.m22879k1(1, this.f45124S);
        try {
            if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChattingRecordsKvstatDisable"), 0) != 0) {
                z = false;
            }
            this.f45108B = z;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e, "getInt", new Object[0]);
        }
        C20840a aVar = new C20840a(C16686a.m16193i().f303743c, C16686a.m16193i().f303744d, C102910f.f303739h, C16686a.m16193i().f303742b, 3, 22, mo17675h());
        aVar.mo32541F1(this.f45108B, true, true, false, false);
        aVar.mo32547o1();
        Log.m105924i("MicroMsg.BackupMoveRecoverServer", "tryConnect start connect timehandler.");
        if (this.f45120N == null) {
            this.f45120N = new MTimerHandler(new C16698j(), false);
        }
        this.f45120N.startTimer((long) (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_backup_connect_overtime_and, 30) * 1000));
    }

    /* renamed from: m */
    public final void mo17680m() {
        String str = this.f45117K;
        String str2 = this.f45118L;
        String A = C102913k.m136029A(MMApplicationContext.getContext());
        Log.m105921e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", A, str, str2, Integer.valueOf(f45106p0));
        if (A == null || A.equals("")) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(485, 1, 1, false);
            nVar.mo160131h(11787, 1);
            C16686a.m16193i().mo142622e().mo142628f(-1);
            mo17667K(-1);
        } else if (str == null || !str.equals(A)) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(485, 2, 1, false);
            nVar2.mo160131h(11787, 2);
            C16686a.m16193i().mo142622e().mo142628f(-2);
            mo17667K(-2);
        } else if (Util.isNullOrNil(str2) || !C102913k.m136030B(str2)) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.idkeyStat(485, 3, 1, false);
            nVar3.mo160131h(11787, 3);
            C16686a.m16193i().mo142622e().mo142628f(-3);
            mo17667K(-3);
        } else {
            int i = f45106p0;
            if (i <= 0) {
                C16686a.m16193i().mo142622e().mo142628f(-5);
                mo17667K(-5);
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.idkeyStat(485, 4, 1, false);
                nVar4.mo160131h(11787, 6);
                return;
            }
            f45106p0 = i - 1;
            mo17679l(this.f45118L, this.f45119M);
        }
    }
}
