package t81;

import j81.C117302a;
import java.util.ArrayList;
import java.util.Iterator;
import o81.C117715c;
import v81.C118667b;

/* renamed from: t81.b */
public class C118402b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f353862d;

    /* renamed from: e */
    public final /* synthetic */ String f353863e;

    /* renamed from: f */
    public final /* synthetic */ C118412l f353864f;

    public C118402b(C118412l lVar, long j, String str) {
        this.f353864f = lVar;
        this.f353862d = j;
        this.f353863e = str;
    }

    public void run() {
        C118413m mVar;
        ArrayList arrayList = (ArrayList) C117715c.wx0().xx0();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118667b bVar = (C118667b) it.next();
                if (bVar.f355081b == 11 && (mVar = this.f353864f.f353894a) != null) {
                    ((C117302a) mVar).yx0(this.f353862d, bVar, this.f353863e);
                }
            }
        }
    }
}
