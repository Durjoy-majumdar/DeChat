package p871zj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001ak.C54053a;
import p871zj.C66851m;

/* renamed from: zj.l */
public class C66850l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f192023d;

    /* renamed from: e */
    public final /* synthetic */ C66851m.C66852a f192024e;

    /* renamed from: f */
    public final /* synthetic */ C66851m f192025f;

    public C66850l(C66851m mVar, List list, C66851m.C66852a aVar) {
        this.f192025f = mVar;
        this.f192023d = list;
        this.f192024e = aVar;
    }

    public void run() {
        Iterator it = new ArrayList(this.f192023d).iterator();
        while (it.hasNext()) {
            C54053a aVar = (C54053a) it.next();
            C66851m.m78951b(this.f192025f.f192027b, aVar);
            C66851m.C66852a aVar2 = this.f192024e;
            if (aVar2 != null) {
                aVar2.mo90837a(aVar);
            }
        }
    }
}
