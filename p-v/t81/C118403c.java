package t81;

import j81.C117302a;
import java.util.ArrayList;
import java.util.Iterator;
import o81.C117715c;
import v81.C118667b;

/* renamed from: t81.c */
public class C118403c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f353865d;

    /* renamed from: e */
    public final /* synthetic */ long f353866e;

    /* renamed from: f */
    public final /* synthetic */ String f353867f;

    /* renamed from: g */
    public final /* synthetic */ C118412l f353868g;

    public C118403c(C118412l lVar, int i, long j, String str) {
        this.f353868g = lVar;
        this.f353865d = i;
        this.f353866e = j;
        this.f353867f = str;
    }

    public void run() {
        C118413m mVar;
        ArrayList arrayList = (ArrayList) C117715c.wx0().xx0();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C118667b bVar = (C118667b) it.next();
                if (bVar.f355081b == 1 && bVar.f355082c == this.f353865d && (mVar = this.f353868g.f353894a) != null) {
                    ((C117302a) mVar).yx0(this.f353866e, bVar, this.f353867f);
                }
            }
        }
    }
}
