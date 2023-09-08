package sx2;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import dd0.C116607d;
import java.util.LinkedList;
import java.util.List;

/* renamed from: sx2.u */
public class C118339u {

    /* renamed from: a */
    public List<C116607d> f353679a = new LinkedList();

    /* renamed from: b */
    public MMHandler f353680b = new MMHandler(Looper.getMainLooper());

    /* renamed from: sx2.u$a */
    public class C118340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f353681d;

        /* renamed from: e */
        public final /* synthetic */ int f353682e;

        /* renamed from: f */
        public final /* synthetic */ int f353683f;

        public C118340a(String str, int i, int i2) {
            this.f353681d = str;
            this.f353682e = i;
            this.f353683f = i2;
        }

        public void run() {
            synchronized (C118339u.this.f353679a) {
                for (C116607d q1 : C118339u.this.f353679a) {
                    q1.mo176203q1(this.f353681d, this.f353682e, this.f353683f);
                }
            }
        }
    }

    /* renamed from: sx2.u$b */
    public class C118341b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f353685d;

        public C118341b(int i) {
            this.f353685d = i;
        }

        public void run() {
            synchronized (C118339u.this.f353679a) {
                for (C116607d M6 : C118339u.this.f353679a) {
                    M6.mo176194M6(this.f353685d);
                }
            }
        }
    }

    /* renamed from: sx2.u$c */
    public class C118342c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f353687d;

        public C118342c(String str) {
            this.f353687d = str;
        }

        public void run() {
            synchronized (C118339u.this.f353679a) {
                for (C116607d z3 : C118339u.this.f353679a) {
                    z3.mo176206z3(this.f353687d);
                }
            }
        }
    }

    /* renamed from: sx2.u$d */
    public class C118343d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f353689d;

        /* renamed from: e */
        public final /* synthetic */ int f353690e;

        /* renamed from: f */
        public final /* synthetic */ String f353691f;

        public C118343d(int i, int i2, String str) {
            this.f353689d = i;
            this.f353690e = i2;
            this.f353691f = str;
        }

        public void run() {
            synchronized (C118339u.this.f353679a) {
                for (C116607d O0 : C118339u.this.f353679a) {
                    O0.mo176197O0(this.f353689d, this.f353690e, this.f353691f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo183139a(String str) {
        C118342c cVar = new C118342c(str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            this.f353680b.post(cVar);
        }
    }

    /* renamed from: b */
    public void mo183140b(String str, int i, int i2) {
        C118340a aVar = new C118340a(str, i, i2);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            this.f353680b.post(aVar);
        }
    }

    /* renamed from: c */
    public void mo183141c(int i, int i2, String str) {
        C118343d dVar = new C118343d(i, i2, str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dVar.run();
        } else {
            this.f353680b.post(dVar);
        }
    }

    /* renamed from: d */
    public void mo183142d(int i) {
        C118341b bVar = new C118341b(i);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            this.f353680b.post(bVar);
        }
    }
}
