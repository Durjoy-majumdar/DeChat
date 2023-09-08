package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C39623j;

/* renamed from: androidx.lifecycle.h0 */
public class C112983h0 {

    /* renamed from: a */
    public final C103766u f338209a;

    /* renamed from: b */
    public final Handler f338210b = new Handler();

    /* renamed from: c */
    public C112984a f338211c;

    /* renamed from: androidx.lifecycle.h0$a */
    public static class C112984a implements Runnable {

        /* renamed from: d */
        public final C103766u f338212d;

        /* renamed from: e */
        public final C39623j.C39625b f338213e;

        /* renamed from: f */
        public boolean f338214f = false;

        public C112984a(C103766u uVar, C39623j.C39625b bVar) {
            this.f338212d = uVar;
            this.f338213e = bVar;
        }

        public void run() {
            if (!this.f338214f) {
                this.f338212d.mo145135c(this.f338213e);
                this.f338214f = true;
            }
        }
    }

    public C112983h0(C0125s sVar) {
        this.f338209a = new C103766u(sVar);
    }

    /* renamed from: a */
    public final void mo165347a(C39623j.C39625b bVar) {
        C112984a aVar = this.f338211c;
        if (aVar != null) {
            aVar.run();
        }
        C112984a aVar2 = new C112984a(this.f338209a, bVar);
        this.f338211c = aVar2;
        this.f338210b.postAtFrontOfQueue(aVar2);
    }
}
