package p1058wb;

import com.tencent.p014mm.game.liblockstep.LockStepNative;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: wb.c */
public class C90907c implements LockStepNative.ILockStepListener {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f260896a;

    /* renamed from: b */
    public final /* synthetic */ C90912g f260897b;

    /* renamed from: wb.c$a */
    public class C90908a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f260898d;

        /* renamed from: e */
        public final /* synthetic */ long f260899e;

        public C90908a(String str, long j) {
            this.f260898d = str;
            this.f260899e = j;
        }

        public void run() {
            Log.m105919d("Luggage.LockStepNativeInstallHelper", "mmudp jsThreadHandler run onCallBack apiName:%s,locksteplogicId:%d", this.f260898d, Long.valueOf(this.f260899e));
            C90907c.this.f260897b.f260907a.updateNativeInterface(this.f260899e);
        }
    }

    public C90907c(C90912g gVar, WeakReference weakReference) {
        this.f260897b = gVar;
        this.f260896a = weakReference;
    }

    public void onCallBack(long j, String str) {
        ((C83181q) this.f260896a.get()).post(new C90908a(str, j));
    }
}
