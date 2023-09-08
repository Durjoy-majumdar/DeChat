package p1222y4;

import androidx.work.WorkerParameters;
import p1206p4.C117979k;

/* renamed from: y4.k */
public class C118927k implements Runnable {

    /* renamed from: d */
    public C117979k f356210d;

    /* renamed from: e */
    public String f356211e;

    /* renamed from: f */
    public WorkerParameters.C113037a f356212f;

    public C118927k(C117979k kVar, String str, WorkerParameters.C113037a aVar) {
        this.f356210d = kVar;
        this.f356211e = str;
        this.f356212f = aVar;
    }

    public void run() {
        this.f356210d.f352609f.mo182725f(this.f356211e, this.f356212f);
    }
}
