package zr3;

import android.os.Handler;
import android.os.Looper;
import bs3.C104161b;
import bs3.C104164e;
import p978i9.C108421e;

/* renamed from: zr3.d */
public abstract class C112672d implements C112671c {

    /* renamed from: a */
    public final String f337364a = getClass().getSimpleName();

    /* renamed from: b */
    public C112670b f337365b = null;

    /* renamed from: c */
    public byte[] f337366c = null;

    /* renamed from: d */
    public Object f337367d = null;

    /* renamed from: e */
    public int f337368e;

    /* renamed from: f */
    public boolean f337369f = false;

    /* renamed from: g */
    public int f337370g = 0;

    /* renamed from: h */
    public Handler f337371h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public Runnable f337372i = new C112673a();

    /* renamed from: zr3.d$a */
    public class C112673a implements Runnable {
        public C112673a() {
        }

        public void run() {
            C112672d dVar = C112672d.this;
            dVar.f337369f = true;
            C104161b.m138993b("MicroMsg.Voip", "NETTASK_RECV TimeOut cmd= ", dVar.mo161497c());
            C104164e.m138998a(20006, 3, String.valueOf(-1104));
            C112672d dVar2 = C112672d.this;
            C112670b bVar = dVar2.f337365b;
            if (bVar != null) {
                bVar.mo150596b(2, -1, "time exceed, force to callback", dVar2);
            }
        }
    }

    /* renamed from: zr3.d$b */
    public class C112674b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f337374d;

        /* renamed from: e */
        public final /* synthetic */ int f337375e;

        public C112674b(int i, int i2) {
            this.f337374d = i;
            this.f337375e = i2;
        }

        public void run() {
            C112672d dVar = C112672d.this;
            if (dVar.f337369f) {
                C104161b.m138993b("MicroMsg.Voip", dVar.f337364a, "onResp netscene already canceled, cmd:" + C112672d.this.f337368e);
                return;
            }
            C112670b bVar = dVar.f337365b;
            if (bVar != null) {
                bVar.mo150596b(this.f337374d, this.f337375e, "", dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo164402a(int i, byte[] bArr) {
        int i2 = 2;
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "onResp errcode", Integer.valueOf(i));
        this.f337371h.removeCallbacks(this.f337372i);
        C104161b.m138993b("MicroMsg.Voip", "NETTASK_RECV onResp:cmd= ", mo161497c(), Integer.valueOf(i), Boolean.valueOf(this.f337369f));
        if (i != 0) {
            C104161b.m138997f("MicroMsg.Voip", this.f337364a, "getNetworkErrType errcode:" + i);
            if (i != -1) {
                i2 = i == 6801 ? 10 : 4;
            } else if (C112683i.m154066a()) {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        if (this.f337369f) {
            C104161b.m138993b("MicroMsg.Voip", "onResp netscene already canceled, cmd:" + this.f337368e);
            return;
        }
        this.f337367d = mo161496b(i, bArr);
        this.f337371h.post(new C112674b(i2, i));
    }

    /* renamed from: b */
    public abstract Object mo161496b(int i, byte[] bArr);

    /* renamed from: c */
    public abstract String mo161497c();

    /* renamed from: d */
    public abstract int mo161498d();

    /* renamed from: e */
    public void mo164403e(int i, C108421e eVar) {
        byte[] bArr;
        this.f337368e = i;
        try {
            bArr = C108421e.m146906d(eVar);
        } catch (Exception unused) {
            bArr = null;
        }
        this.f337366c = bArr;
    }
}
