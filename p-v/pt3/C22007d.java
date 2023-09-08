package pt3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.soter.soterserver.SoterExtraParam;
import com.tencent.soter.soterserver.SoterSessionResult;
import com.tencent.soter.soterserver.SoterSignResult;
import java.security.Signature;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21885g;
import ot3.C21886i;
import ot3.C47400b;
import ot3.C77039k;
import qt3.C22129a;
import qv2.C110476d;
import qv2.C36099c;
import rt3.C22252b;

/* renamed from: pt3.d */
public class C22007d extends C22005b implements C47400b {

    /* renamed from: l */
    public static C22129a f62269l;

    /* renamed from: m */
    public static int f62270m;

    /* renamed from: n */
    public static boolean f62271n;

    /* renamed from: o */
    public static boolean f62272o;

    /* renamed from: p */
    public static final Object f62273p = new Object();

    /* renamed from: q */
    public static C22014g f62274q = new C22014g();

    /* renamed from: r */
    public static int f62275r = 0;

    /* renamed from: b */
    public Context f62276b;

    /* renamed from: c */
    public int f62277c = 0;

    /* renamed from: d */
    public int f62278d = 3;

    /* renamed from: e */
    public long f62279e = 0;

    /* renamed from: f */
    public boolean f62280f = false;

    /* renamed from: g */
    public Handler f62281g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public C110247f f62282h;

    /* renamed from: i */
    public IBinder.DeathRecipient f62283i = new C22008a();

    /* renamed from: j */
    public ServiceConnection f62284j = new C22009b();

    /* renamed from: k */
    public Runnable f62285k = new C22011d();

    /* renamed from: pt3.d$a */
    public class C22008a implements IBinder.DeathRecipient {
        public C22008a() {
        }

        public void binderDied() {
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: binder died", new Object[0]);
            C22129a aVar = C22007d.f62269l;
            if (aVar != null && aVar.asBinder() != null) {
                C22007d.f62269l.asBinder().unlinkToDeath(C22007d.this.f62283i, 0);
                C22007d.f62269l = null;
                C110247f fVar = C22007d.this.f62282h;
                if (fVar != null) {
                    ((C110476d.C110477a) fVar).getClass();
                    C115669n.INSTANCE.idkeyStat(1104, 8, 1, false);
                }
                synchronized (C22007d.f62273p) {
                    C22007d.f62270m = 0;
                    C22007d.this.mo35120z();
                    C22007d.m25395u(C22007d.this);
                }
            }
        }
    }

    /* renamed from: pt3.d$b */
    public class C22009b implements ServiceConnection {
        public C22009b() {
        }

        public void onBindingDied(ComponentName componentName) {
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: binding died", new Object[0]);
            C22007d.f62270m = 0;
            C22007d.f62269l = null;
            if (C22007d.m25396y((long) C22007d.this.f62278d) > 30) {
                C21881e.m25084c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", Long.valueOf(C22007d.m25396y((long) C22007d.this.f62278d)));
                C22007d dVar = C22007d.this;
                dVar.f62278d = 3;
                dVar.f62281g.removeCallbacks(dVar.f62285k);
            }
            C22007d.this.mo35120z();
            C22007d.m25395u(C22007d.this);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: onServiceConnected", new Object[0]);
            synchronized (C22007d.f62273p) {
                C22007d.f62270m = 2;
            }
            C22007d dVar = C22007d.this;
            dVar.f62278d = 3;
            dVar.f62281g.removeCallbacks(dVar.f62285k);
            try {
                iBinder.linkToDeath(C22007d.this.f62283i, 0);
                int i = C22129a.C22130a.f62615d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
                C22007d.f62269l = (queryLocalInterface == null || !(queryLocalInterface instanceof C22129a)) ? new C22129a.C22130a.C22131a(iBinder) : (C22129a) queryLocalInterface;
            } catch (RemoteException e) {
                C21881e.m25083b("Soter.SoterCoreTreble", "soter: Binding deathRecipient is error - RemoteException" + e.toString(), new Object[0]);
            }
            C110247f fVar = C22007d.this.f62282h;
            if (fVar != null) {
                C110476d.C110477a aVar = (C110476d.C110477a) fVar;
                C115669n.INSTANCE.idkeyStat(1104, 6, 1, false);
                if (!C22252b.m25806c()) {
                    MMHandlerThread.postToMainThreadDelayed(new C36099c(aVar), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: Binding is done - Service connected", new Object[0]);
            CountDownLatch countDownLatch = C22007d.f62274q.f62291a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C22007d.f62273p) {
                C21881e.m25084c("Soter.SoterCoreTreble", "soter: unBinding is done - Service disconnected", new Object[0]);
                C22007d.f62270m = 0;
                C22007d.f62269l = null;
                if (C22007d.m25396y((long) C22007d.this.f62278d) > 30) {
                    C21881e.m25084c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", Long.valueOf(C22007d.m25396y((long) C22007d.this.f62278d)));
                    C22007d dVar = C22007d.this;
                    dVar.f62278d = 3;
                    dVar.f62281g.removeCallbacks(dVar.f62285k);
                }
                if (C22007d.this.f62282h != null) {
                    C115669n.INSTANCE.idkeyStat(1104, 7, 1, false);
                }
                C22007d.m25395u(C22007d.this);
                CountDownLatch countDownLatch = C22007d.f62274q.f62291a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    /* renamed from: pt3.d$c */
    public class C22010c implements Runnable {
        public C22010c() {
        }

        public void run() {
            C22007d.this.mo35118w();
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: initSoter binding", new Object[0]);
        }
    }

    /* renamed from: pt3.d$d */
    public class C22011d implements Runnable {
        public C22011d() {
        }

        public void run() {
            C22007d.this.getClass();
            if (!C22007d.f62272o) {
                C22007d.this.getClass();
                C21881e.m25084c("Soter.SoterCoreTreble", "soter: retryFunc stop, canRetry:%b isInitializeSuccessed:%b", Boolean.TRUE, Boolean.valueOf(C22007d.f62272o));
                return;
            }
            C22007d dVar = C22007d.this;
            int i = dVar.f62278d + 1;
            dVar.f62278d = i;
            if (C22007d.f62270m != 2) {
                C21881e.m25084c("Soter.SoterCoreTreble", "soter: retryFunc bindservice no response: %d delay: %d", Integer.valueOf(i), Long.valueOf(C22007d.m25396y((long) C22007d.this.f62278d)));
                C22007d.this.mo35117v(true);
                return;
            }
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: retryFunc stop, CONNECTED", new Object[0]);
        }
    }

    /* renamed from: pt3.d$e */
    public class C22012e implements Runnable {
        public C22012e(C22007d dVar) {
        }

        public void run() {
            try {
                C22129a aVar = C22007d.f62269l;
                if (aVar == null) {
                    C21881e.m25087f("Soter.SoterCoreTreble", "soter: mSoterService is null", new Object[0]);
                    return;
                }
                SoterExtraParam AL = aVar.mo35216AL("fingerprint_type");
                if (AL != null) {
                    Object obj = AL.f320107d;
                    if (obj instanceof Integer) {
                        C77039k.m92957b("fingerprint_type", obj);
                    }
                }
                SoterExtraParam AL2 = C22007d.f62269l.mo35216AL("fingerprint_hardware_position");
                if (AL2 != null) {
                    Object obj2 = AL2.f320107d;
                    if (obj2 instanceof Integer[]) {
                        C77039k.m92957b("fingerprint_hardware_position", obj2);
                    }
                }
            } catch (Exception e) {
                C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: getExtraParam fail");
            }
        }
    }

    /* renamed from: u */
    public static void m25395u(C22007d dVar) {
        dVar.f62277c++;
        long y = m25396y((long) dVar.f62277c);
        long elapsedRealtime = y - ((SystemClock.elapsedRealtime() - dVar.f62279e) / 1000);
        C21881e.m25084c("Soter.SoterCoreTreble", "fib: %s, rebind delay: %sS", Long.valueOf(y), Long.valueOf(elapsedRealtime));
        if (elapsedRealtime <= 0) {
            dVar.mo35117v(false);
        } else {
            dVar.f62281g.postDelayed(new C22013e(dVar), elapsedRealtime * 1000);
        }
    }

    /* renamed from: y */
    public static long m25396y(long j) {
        long j2 = 0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        long j3 = 1;
        if (j == 1 || j == 2) {
            return 1;
        }
        long j4 = 1;
        int i2 = 3;
        while (((long) i2) <= j) {
            j2 = j3 + j4;
            i2++;
            j3 = j4;
            j4 = j2;
        }
        return j2;
    }

    /* renamed from: a */
    public byte[] mo35100a(long j) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: finishSign in", new Object[0]);
        if (!mo35110m()) {
            return null;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return null;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            SoterSignResult ZF = f62269l.mo35222ZF(j);
            bArr = ZF.f56994e;
            if (ZF.f56993d == 0) {
                return bArr;
            }
            throw new Exception("finishSign error");
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: finishSign fail: ");
        }
    }

    /* renamed from: b */
    public C21885g mo35097b() {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: generateAppSecureKey in", new Object[0]);
        if (!mo35110m()) {
            return new C21885g(4);
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return new C21885g(4);
        }
        mo35118w();
        if (mo35119x()) {
            return new C21885g(4);
        }
        try {
            if (f62269l.jp0(f62275r) == 0) {
                return new C21885g(0);
            }
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: generateAppSecureKey fail: ");
        }
        return new C21885g(4);
    }

    /* renamed from: c */
    public C21885g mo35101c(String str) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: generateAuthKey in", new Object[0]);
        if (!mo35110m()) {
            return new C21885g(6);
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return new C21885g(6);
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return new C21885g(6);
        }
        try {
            if (f62269l.W50(f62275r, str) == 0) {
                return new C21885g(0);
            }
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: generateAuthKey fail: ");
        }
        return new C21885g(6);
    }

    /* renamed from: d */
    public C117897l mo35098d() {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: getAppGlobalSecureKeyModel in", new Object[0]);
        if (!mo35110m()) {
            return null;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return null;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            byte[] bArr = f62269l.mo35218LE(f62275r).f56989e;
            if (bArr != null && bArr.length > 0) {
                return C22005b.m25358q(bArr);
            }
            C21881e.m25083b("Soter.SoterCoreTreble", "soter: soter: key can not be retrieved", new Object[0]);
            return null;
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: getAppGlobalSecureKeyModel fail: ");
            return null;
        }
    }

    /* renamed from: e */
    public Signature mo35102e(String str) {
        return null;
    }

    /* renamed from: f */
    public C117897l mo35103f(String str) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: getAuthKeyModel in", new Object[0]);
        if (!mo35110m()) {
            return null;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return null;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            byte[] bArr = f62269l.mo35226mL(f62275r, str).f56989e;
            if (bArr != null && bArr.length > 0) {
                return C22005b.m25358q(bArr);
            }
            C21881e.m25083b("Soter.SoterCoreTreble", "soter: key can not be retrieved", new Object[0]);
            return null;
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: getAuthKeyModel fail: ");
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo35104g() {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: hasAppGlobalSecureKey in", new Object[0]);
        if (!mo35110m()) {
            return false;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return false;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return false;
        }
        try {
            return f62269l.lj0(f62275r);
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: hasAppGlobalSecureKey fail: ");
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo35105h(String str) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: hasAuthKey in", new Object[0]);
        if (!mo35110m()) {
            return false;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return false;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return false;
        }
        try {
            return f62269l.mo35223bD(f62275r, str);
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: hasAuthKey fail: ");
            return false;
        }
    }

    /* renamed from: i */
    public SoterSessionResult mo35106i(String str, String str2) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: initSigh in", new Object[0]);
        if (!mo35110m()) {
            return null;
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return null;
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            return f62269l.mo35220TO(f62275r, str, str2);
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: initSigh fail: ");
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo35107j(Context context) {
        this.f62276b = context;
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: initSoter in", new Object[0]);
        f62271n = true;
        C22014g gVar = f62274q;
        C22010c cVar = new C22010c();
        C21881e.m25084c("Soter.SyncJob", "doAsSyncJob", new Object[0]);
        gVar.f62291a = new CountDownLatch(1);
        cVar.run();
        CountDownLatch countDownLatch = gVar.f62291a;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                C21881e.m25085d("Soter.SyncJob", e, "");
            }
        }
        f62271n = false;
        if (f62270m == 2) {
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: initSoter finish", new Object[0]);
            f62272o = true;
            return true;
        }
        f62270m = 0;
        C21881e.m25083b("Soter.SoterCoreTreble", "soter: initSoter error", new Object[0]);
        return false;
    }

    /* renamed from: k */
    public boolean mo35108k() {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: isAppGlobalSecureKeyValid in", new Object[0]);
        return mo35104g() && mo35098d() != null;
    }

    /* renamed from: l */
    public boolean mo35109l(String str, boolean z) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: isAuthKeyValid in", new Object[0]);
        return mo35105h(str) && mo35103f(str) != null;
    }

    /* renamed from: m */
    public boolean mo35110m() {
        if (!C21886i.f61888a.mo34912a()) {
            return true;
        }
        C21881e.m25087f("Soter.SoterCoreTreble", "soter: the device has already triggered OOM. mark as not support", new Object[0]);
        return false;
    }

    /* renamed from: n */
    public boolean mo35111n() {
        return f62270m == 2;
    }

    /* renamed from: o */
    public C21885g mo35112o() {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: removeAppGlobalSecureKey in", new Object[0]);
        if (!mo35110m()) {
            return new C21885g(5);
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return new C21885g(5);
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return new C21885g(5);
        }
        try {
            if (f62269l.mo35219M9(f62275r) == 0) {
                return new C21885g(0);
            }
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: removeAppGlobalSecureKey fail: ");
        }
        return new C21885g(5);
    }

    /* renamed from: p */
    public C21885g mo35113p(String str, boolean z) {
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: removeAuthKey in", new Object[0]);
        if (!mo35110m()) {
            return new C21885g(7);
        }
        if (this.f62276b == null) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
            return new C21885g(7);
        }
        mo35118w();
        if (mo35119x()) {
            C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
            return new C21885g(7);
        }
        try {
            if (f62269l.E20(f62275r, str) == 0) {
                return z ? f62269l.mo35219M9(f62275r) == 0 ? new C21885g(0) : new C21885g(5) : new C21885g(0);
            }
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: removeAuthKey fail: ");
        }
        return new C21885g(7);
    }

    /* renamed from: r */
    public void mo35114r(C110247f fVar) {
        this.f62282h = fVar;
    }

    /* renamed from: s */
    public void mo35115s() {
        this.f62277c = 0;
        mo35118w();
    }

    /* renamed from: t */
    public void mo35116t() {
        try {
            new Thread(new C22012e(this)).start();
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: getExtraParam fail");
        }
    }

    /* renamed from: v */
    public final void mo35117v(boolean z) {
        Intent intent = new Intent();
        intent.setAction("com.tencent.soter.soterserver.ISoterService");
        intent.setPackage("com.tencent.soter.soterserver");
        if (this.f62276b == null) {
            C21881e.m25083b("Soter.SoterCoreTreble", "soter: bindService context is null ", new Object[0]);
            return;
        }
        f62270m = 1;
        C110247f fVar = this.f62282h;
        if (fVar != null) {
            ((C110476d.C110477a) fVar).getClass();
            C115669n.INSTANCE.idkeyStat(1104, 5, 1, false);
        }
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: bindService binding is start ", new Object[0]);
        this.f62279e = SystemClock.elapsedRealtime();
        this.f62280f = this.f62276b.bindService(intent, this.f62284j, 1);
        long y = m25396y((long) this.f62278d);
        C21881e.m25084c("Soter.SoterCoreTreble", "soter: scheduleTimeoutTask isCycle:%b noResponseCount:%d checkDelay:%d ", Boolean.valueOf(z), Integer.valueOf(this.f62278d), Long.valueOf(y));
        if (z || this.f62278d <= 3) {
            this.f62281g.postDelayed(this.f62285k, y * 1000);
        }
    }

    /* renamed from: w */
    public void mo35118w() {
        C22129a aVar;
        try {
            if (f62270m == 2 && (aVar = f62269l) != null && aVar.asBinder() != null && f62269l.asBinder().isBinderAlive()) {
                if (f62269l.asBinder().pingBinder()) {
                    C21881e.m25084c("Soter.SoterCoreTreble", "no need rebind", new Object[0]);
                    return;
                }
            }
            C21881e.m25084c("Soter.SoterCoreTreble", "soter: bindServiceIfNeeded try to bind", new Object[0]);
            mo35117v(false);
        } catch (Exception e) {
            C21881e.m25085d("Soter.SoterCoreTreble", e, "soter: bindServiceIfNeeded fail: ");
        }
    }

    /* renamed from: x */
    public final boolean mo35119x() {
        if (f62269l != null) {
            return false;
        }
        C21881e.m25087f("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
        C110247f fVar = this.f62282h;
        if (fVar == null) {
            return true;
        }
        ((C110476d.C110477a) fVar).getClass();
        Log.m105924i("MicroMsg.SoterInitManager", "no service when calling");
        C115669n.INSTANCE.idkeyStat(1104, 9, 1, false);
        return true;
    }

    /* renamed from: z */
    public void mo35120z() {
        if (this.f62280f) {
            try {
                this.f62276b.unbindService(this.f62284j);
            } catch (Exception e) {
                C21881e.m25085d("Soter.SoterCoreTreble", e, "");
            } catch (Throwable th) {
                this.f62280f = false;
                throw th;
            }
            this.f62280f = false;
        }
    }
}
