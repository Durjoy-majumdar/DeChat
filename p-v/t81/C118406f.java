package t81;

import j81.C117302a;
import java.util.ArrayList;
import java.util.Iterator;
import o81.C117715c;
import v81.C118667b;

/* renamed from: t81.f */
public class C118406f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f353875d;

    /* renamed from: e */
    public final /* synthetic */ String f353876e;

    /* renamed from: f */
    public final /* synthetic */ C118412l f353877f;

    public C118406f(C118412l lVar, long j, String str) {
        this.f353877f = lVar;
        this.f353875d = j;
        this.f353876e = str;
    }

    public void run() {
        C118413m mVar;
        ArrayList arrayList = (ArrayList) C117715c.wx0().xx0();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118667b bVar = (C118667b) it.next();
                if (bVar.f355081b == 3 && (mVar = this.f353877f.f353894a) != null) {
                    ((C117302a) mVar).yx0(this.f353875d, bVar, this.f353876e);
                }
            }
        }
    }
}
