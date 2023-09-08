package p1058wb;

import com.tencent.p014mm.game.liblockstep.LockStepNative;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88023q;

/* renamed from: wb.g */
public class C90912g {

    /* renamed from: a */
    public LockStepNative f260907a;

    /* renamed from: b */
    public String f260908b = null;

    /* renamed from: c */
    public boolean f260909c = true;

    /* renamed from: d */
    public final C90914b f260910d = new C90914b(this, new C90913a());

    /* renamed from: wb.g$a */
    public class C90913a implements Runnable {
        public C90913a() {
        }

        public void run() {
            synchronized (C90912g.this) {
                if (C90912g.this.f260907a != null) {
                    Log.m105924i("Luggage.LockStepNativeInstallHelper", "DestroyTask destoryLockStep");
                    C90912g.this.f260907a.destoryLockStep();
                    C90912g.this.f260907a = null;
                } else {
                    Log.m105924i("Luggage.LockStepNativeInstallHelper", "DestroyTask lockStepNative is null");
                }
            }
        }
    }

    /* renamed from: wb.g$b */
    public class C90914b extends C88023q implements C83174m.C83175a {
        public C90914b(C90912g gVar, Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }
}
