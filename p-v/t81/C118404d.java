package t81;

import j81.C117302a;
import java.util.ArrayList;
import java.util.Iterator;
import o81.C117715c;
import v81.C118667b;

/* renamed from: t81.d */
public class C118404d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f353869d;

    /* renamed from: e */
    public final /* synthetic */ String f353870e;

    /* renamed from: f */
    public final /* synthetic */ C118412l f353871f;

    public C118404d(C118412l lVar, long j, String str) {
        this.f353871f = lVar;
        this.f353869d = j;
        this.f353870e = str;
    }

    public void run() {
        C118413m mVar;
        ArrayList arrayList = (ArrayList) C117715c.wx0().xx0();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118667b bVar = (C118667b) it.next();
                if (bVar.f355081b == 8 && (mVar = this.f353871f.f353894a) != null) {
                    ((C117302a) mVar).yx0(this.f353869d, bVar, this.f353870e);
                }
            }
        }
    }
}
