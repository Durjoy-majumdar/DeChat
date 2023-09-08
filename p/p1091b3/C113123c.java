package p1091b3;

import android.os.Handler;
import p1091b3.C113130j;

/* renamed from: b3.c */
public class C113123c {

    /* renamed from: a */
    public final C113134m f338511a;

    /* renamed from: b */
    public final Handler f338512b;

    public C113123c(C113134m mVar, Handler handler) {
        this.f338511a = mVar;
        this.f338512b = handler;
    }

    /* renamed from: a */
    public void mo165639a(C113130j.C113131a aVar) {
        int i = aVar.f338529b;
        if (i == 0) {
            this.f338512b.post(new C113121a(this, this.f338511a, aVar.f338528a));
            return;
        }
        this.f338512b.post(new C113122b(this, this.f338511a, i));
    }
}
