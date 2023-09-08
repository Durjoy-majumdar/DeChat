package t81;

import j81.C117302a;
import java.util.ArrayList;
import java.util.Iterator;
import o81.C117715c;
import v81.C118667b;

/* renamed from: t81.g */
public class C118407g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f353878d;

    /* renamed from: e */
    public final /* synthetic */ long f353879e;

    /* renamed from: f */
    public final /* synthetic */ String f353880f;

    /* renamed from: g */
    public final /* synthetic */ C118412l f353881g;

    public C118407g(C118412l lVar, int i, long j, String str) {
        this.f353881g = lVar;
        this.f353878d = i;
        this.f353879e = j;
        this.f353880f = str;
    }

    public void run() {
        C118413m mVar;
        ArrayList arrayList = (ArrayList) C117715c.wx0().xx0();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118667b bVar = (C118667b) it.next();
                if (bVar.f355081b == 4 && bVar.f355082c == this.f353878d && (mVar = this.f353881g.f353894a) != null) {
                    ((C117302a) mVar).yx0(this.f353879e, bVar, this.f353880f);
                }
            }
        }
    }
}
