package ev0;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import qo3.C77426q;
import qv0.C101304e;
import qv0.C36098a;
import yu0.C102908a;
import yu0.C102910f;
import zu0.C23575c;

/* renamed from: ev0.a */
public class C20612a extends C102910f {

    /* renamed from: q */
    public static C20612a f58014q;

    /* renamed from: k */
    public C20615b f58015k;

    /* renamed from: l */
    public C20633g f58016l;

    /* renamed from: m */
    public C20625e f58017m;

    /* renamed from: n */
    public C101304e f58018n;

    /* renamed from: o */
    public C23575c f58019o;

    /* renamed from: p */
    public PowerManager.WakeLock f58020p = null;

    /* renamed from: ev0.a$a */
    public class C20613a implements Runnable {
        public C20613a() {
        }

        public void run() {
            try {
                if (C20612a.this.f58020p == null) {
                    C20612a.this.f58020p = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).newWakeLock(26, "BackupPc Lock");
                }
                if (!C20612a.this.f58020p.isHeld()) {
                    PowerManager.WakeLock wakeLock = C20612a.this.f58020p;
                    C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock.acquire();
                    C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ev0.a$b */
    public class C20614b implements Runnable {
        public C20614b() {
        }

        public void run() {
            try {
                PowerManager.WakeLock wakeLock = C20612a.this.f58020p;
                if (wakeLock != null && wakeLock.isHeld()) {
                    PowerManager.WakeLock wakeLock2 = C20612a.this.f58020p;
                    C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public static C20612a m22480i() {
        if (f58014q == null) {
            C20612a aVar = new C20612a();
            f58014q = aVar;
            C102908a.m136012a(aVar);
        }
        return f58014q;
    }

    /* renamed from: n */
    public static boolean m22481n(Context context, int i) {
        if (!m22482o().f58031h || !m22482o().mo32286j()) {
            return false;
        }
        C77426q qVar = new C77426q(context);
        qVar.mo107606r(context.getString(i));
        qVar.mo107601m(C0966R.string.f8028zq);
        qVar.mo107603o();
        return true;
    }

    /* renamed from: o */
    public static C20615b m22482o() {
        return m22480i().mo32274j();
    }

    /* renamed from: p */
    public static void m22483p(int i) {
        m22480i().mo142622e().mo142628f(i);
        m22480i().mo32276l().mo32309g(i);
    }

    /* renamed from: b */
    public void mo17656b() {
        f58014q = null;
    }

    /* renamed from: c */
    public void mo17657c(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            objArr[0].booleanValue();
            C20615b j = m22480i().mo32274j();
            j.getClass();
            new MMHandler(Looper.getMainLooper()).postDelayed(new C20624d(j), 100);
        }
    }

    /* renamed from: f */
    public void mo17658f() {
        Log.m105924i("MicroMsg.BackupPcModel", "startWakeLock");
        MMHandlerThread.postToMainThread(new C20613a());
    }

    /* renamed from: g */
    public void mo17659g() {
        Log.m105924i("MicroMsg.BackupPcModel", "stopWakeLock");
        MMHandlerThread.postToMainThread(new C20614b());
    }

    /* renamed from: h */
    public C23575c mo32273h() {
        if (this.f58019o == null) {
            this.f58019o = new C23575c();
        }
        return this.f58019o;
    }

    /* renamed from: j */
    public C20615b mo32274j() {
        if (this.f58015k == null) {
            this.f58015k = new C20615b();
        }
        return this.f58015k;
    }

    /* renamed from: k */
    public C20625e mo32275k() {
        if (this.f58017m == null) {
            this.f58017m = new C20625e();
        }
        return this.f58017m;
    }

    /* renamed from: l */
    public C20633g mo32276l() {
        if (this.f58016l == null) {
            this.f58016l = new C20633g();
        }
        return this.f58016l;
    }

    /* renamed from: m */
    public C101304e mo32277m() {
        if (this.f58018n == null) {
            C101304e eVar = new C101304e();
            this.f58018n = eVar;
            eVar.f296796g = C36098a.PC;
        }
        return this.f58018n;
    }
}
