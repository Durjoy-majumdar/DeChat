package p1069zd;

import com.tencent.matrix.backtrace.C114405e;
import com.tencent.matrix.backtrace.C114412g;
import com.tencent.matrix.backtrace.C114413h;
import com.tencent.matrix.backtrace.C114417j;
import com.tencent.matrix.backtrace.C114419k;

/* renamed from: zd.c */
public class C119095c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114419k f356649d;

    public C119095c(C114419k kVar) {
        this.f356649d = kVar;
    }

    public void run() {
        C114419k kVar = this.f356649d;
        if (kVar.f342998a && kVar.f342999b) {
            C114405e eVar = kVar.f343001d;
            if (C114417j.m160957l(eVar.f342955f.f343004a).exists()) {
                C114413h hVar = eVar.f342954e;
                hVar.f342980f.post(new C114412g(hVar, C114413h.C114415b.RequestConsuming));
            }
        }
        C114419k kVar2 = this.f356649d;
        kVar2.f343003f = false;
        kVar2.f343003f = false;
        kVar2.f343002e.postDelayed(new C119095c(kVar2), 21600000);
    }
}
