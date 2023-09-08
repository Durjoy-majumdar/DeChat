package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C112980e0;
import androidx.lifecycle.C39623j;

/* renamed from: androidx.lifecycle.c0 */
public class C112975c0 implements C0125s {

    /* renamed from: o */
    public static final C112975c0 f338196o = new C112975c0();

    /* renamed from: d */
    public int f338197d = 0;

    /* renamed from: e */
    public int f338198e = 0;

    /* renamed from: f */
    public boolean f338199f = true;

    /* renamed from: g */
    public boolean f338200g = true;

    /* renamed from: h */
    public Handler f338201h;

    /* renamed from: i */
    public final C103766u f338202i = new C103766u(this);

    /* renamed from: j */
    public Runnable f338203j = new C112976a();

    /* renamed from: n */
    public C112980e0.C103758a f338204n = new C112977b();

    /* renamed from: androidx.lifecycle.c0$a */
    public class C112976a implements Runnable {
        public C112976a() {
        }

        public void run() {
            C112975c0 c0Var = C112975c0.this;
            if (c0Var.f338198e == 0) {
                c0Var.f338199f = true;
                c0Var.f338202i.mo145135c(C39623j.C39625b.ON_PAUSE);
            }
            C112975c0 c0Var2 = C112975c0.this;
            if (c0Var2.f338197d == 0 && c0Var2.f338199f) {
                c0Var2.f338202i.mo145135c(C39623j.C39625b.ON_STOP);
                c0Var2.f338200g = true;
            }
        }
    }

    /* renamed from: androidx.lifecycle.c0$b */
    public class C112977b implements C112980e0.C103758a {
        public C112977b() {
        }
    }

    /* renamed from: a */
    public void mo165315a() {
        int i = this.f338198e + 1;
        this.f338198e = i;
        if (i != 1) {
            return;
        }
        if (this.f338199f) {
            this.f338202i.mo145135c(C39623j.C39625b.ON_RESUME);
            this.f338199f = false;
            return;
        }
        this.f338201h.removeCallbacks(this.f338203j);
    }

    public C39623j getLifecycle() {
        return this.f338202i;
    }
}
