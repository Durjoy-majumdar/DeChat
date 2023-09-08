package zr3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import bs3.C104161b;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/* renamed from: zr3.e */
public final class C112675e implements C112670b {

    /* renamed from: h */
    public static C112675e f337377h;

    /* renamed from: d */
    public Vector<C112672d> f337378d = new Vector<>();

    /* renamed from: e */
    public Vector<C112672d> f337379e = new Vector<>();

    /* renamed from: f */
    public final SparseArray<Set<C112670b>> f337380f = new SparseArray<>();

    /* renamed from: g */
    public final Handler f337381g = new C112676a(Looper.getMainLooper());

    /* renamed from: zr3.e$a */
    public class C112676a extends Handler {
        public C112676a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C112675e.this.mo164407c((C112672d) message.obj);
        }
    }

    /* renamed from: zr3.e$b */
    public class C112677b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112672d f337383d;

        public C112677b(C112672d dVar) {
            this.f337383d = dVar;
        }

        public void run() {
            C112675e.this.f337378d.remove(this.f337383d);
            C112675e.this.mo150596b(2, -1, "doScene failed", this.f337383d);
        }
    }

    /* renamed from: e */
    public static C112675e m154053e() {
        if (f337377h == null) {
            synchronized (C112675e.class) {
                if (f337377h == null) {
                    f337377h = new C112675e();
                }
            }
        }
        return f337377h;
    }

    /* renamed from: a */
    public void mo164406a(int i, C112670b bVar) {
        if (this.f337380f.get(i) == null) {
            this.f337380f.put(i, new HashSet());
        }
        if (!this.f337380f.get(i).contains(bVar)) {
            this.f337380f.get(i).add(bVar);
        }
    }

    /* renamed from: b */
    public void mo150596b(int i, int i2, String str, C112672d dVar) {
        this.f337378d.remove(dVar);
        mo164409f();
        this.f337381g.post(new C112678f(this, dVar, i, i2, str));
    }

    /* renamed from: c */
    public boolean mo164407c(C112672d dVar) {
        int d;
        if (!C112683i.m154066a() && ((d = dVar.mo161498d()) == 102 || d == 104 || d == 103)) {
            C104161b.m138997f("MicroMsg.Voip", "doScene do retain mReissueNetScene");
        }
        if (dVar == null) {
            return false;
        }
        mo164408d(dVar, 0);
        return true;
    }

    /* renamed from: d */
    public final void mo164408d(C112672d dVar, int i) {
        int i2;
        if (i == 0) {
            if (this.f337378d.size() < 20) {
                this.f337378d.add(dVar);
                if (dVar.f337366c == null) {
                    C104161b.m138997f("MicroMsg.Voip", dVar.f337364a, "dosene reqData is null cmd=" + dVar.f337368e);
                    i2 = -1;
                } else {
                    dVar.f337365b = this;
                    i2 = C112679g.m154059e().mo164414b((C112669a) null, new C112684j(dVar), dVar.f337368e, dVar.mo161497c(), dVar.f337366c, 3, dVar.f337370g);
                    if (i2 >= 0) {
                        dVar.f337371h.postDelayed(dVar.f337372i, 60000);
                    }
                    C104161b.m138993b("MicroMsg.Voip", "NETTASK_SEND dosene:cmd ", dVar.mo161497c(), Integer.valueOf(i2));
                }
                if (i2 < 0) {
                    C104161b.m138997f("MicroMsg.Voip", "doSceneImp do scene failed, ret %d,", Integer.valueOf(i2));
                    this.f337381g.post(new C112677b(dVar));
                }
                mo164409f();
            }
        }
        if (i > 0) {
            Message obtain = Message.obtain();
            obtain.obj = dVar;
            this.f337381g.sendMessageDelayed(obtain, (long) i);
        } else {
            this.f337379e.add(dVar);
        }
        mo164409f();
    }

    /* renamed from: f */
    public final void mo164409f() {
        if (this.f337379e.size() > 0) {
            C112672d dVar = this.f337379e.get(0);
            dVar.getClass();
            boolean z = true;
            for (int i = 1; i < this.f337379e.size(); i++) {
                this.f337379e.get(i).getClass();
            }
            if (this.f337378d.size() >= 20) {
                z = false;
            }
            if (z) {
                this.f337379e.remove(dVar);
                mo164408d(dVar, 0);
            }
        }
    }
}
