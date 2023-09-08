package av0;

import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gv0.C116994i;
import gv0.C20842c;
import j20.C117292a;
import qv0.C101304e;
import yu0.C102908a;
import yu0.C102910f;
import zu0.C23575c;

/* renamed from: av0.a */
public class C16686a extends C102910f {

    /* renamed from: q */
    public static C16686a f45094q;

    /* renamed from: k */
    public C16710c f45095k;

    /* renamed from: l */
    public C16690b f45096l;

    /* renamed from: m */
    public C101304e f45097m;

    /* renamed from: n */
    public C23575c f45098n;

    /* renamed from: o */
    public String f45099o = "tickit";

    /* renamed from: p */
    public PowerManager.WakeLock f45100p = null;

    /* renamed from: av0.a$a */
    public class C16687a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f45101d;

        public C16687a(C16686a aVar, String str) {
            this.f45101d = str;
        }

        public void run() {
            C16690b j = C16686a.m16193i().mo17661j();
            String str = this.f45101d;
            j.getClass();
            Log.m105929w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", str);
            if (((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
                C75604z3.m90829a();
            }
            C20842c.m22887x1();
            C97625j3.m125815e().mo123455a(595, j.f45123R);
            C97625j3.m125815e().mo123460f(new C116994i(str));
        }
    }

    /* renamed from: av0.a$b */
    public class C16688b implements Runnable {
        public C16688b() {
        }

        public void run() {
            try {
                if (C16686a.this.f45100p == null) {
                    C16686a.this.f45100p = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).newWakeLock(26, "BackupMove Lock");
                }
                if (!C16686a.this.f45100p.isHeld()) {
                    PowerManager.WakeLock wakeLock = C16686a.this.f45100p;
                    C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock.acquire();
                    C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: av0.a$c */
    public class C16689c implements Runnable {
        public C16689c() {
        }

        public void run() {
            try {
                PowerManager.WakeLock wakeLock = C16686a.this.f45100p;
                if (wakeLock != null && wakeLock.isHeld()) {
                    PowerManager.WakeLock wakeLock2 = C16686a.this.f45100p;
                    C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$3", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$3", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public static C16686a m16193i() {
        if (f45094q == null) {
            C16686a aVar = new C16686a();
            f45094q = aVar;
            C102908a.m136012a(aVar);
        }
        return f45094q;
    }

    /* renamed from: b */
    public void mo17656b() {
        f45094q = null;
    }

    /* renamed from: c */
    public void mo17657c(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            MMHandlerThread.postToMainThread(new C16687a(this, objArr[0]));
        }
    }

    /* renamed from: f */
    public void mo17658f() {
        Log.m105924i("MicroMsg.BackupMoveModel", "startWakeLock");
        MMHandlerThread.postToMainThread(new C16688b());
    }

    /* renamed from: g */
    public void mo17659g() {
        Log.m105924i("MicroMsg.BackupMoveModel", "stopWakeLock");
        MMHandlerThread.postToMainThreadDelayed(new C16689c(), 15000);
    }

    /* renamed from: h */
    public C23575c mo17660h() {
        if (this.f45098n == null) {
            this.f45098n = new C23575c();
        }
        return this.f45098n;
    }

    /* renamed from: j */
    public C16690b mo17661j() {
        if (this.f45096l == null) {
            this.f45096l = new C16690b();
        }
        return this.f45096l;
    }

    /* renamed from: k */
    public C16710c mo17662k() {
        if (this.f45095k == null) {
            this.f45095k = new C16710c();
        }
        return this.f45095k;
    }

    /* renamed from: l */
    public C101304e mo17663l() {
        if (this.f45097m == null) {
            this.f45097m = new C101304e();
        }
        return this.f45097m;
    }
}
