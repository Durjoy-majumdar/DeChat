package nw3;

import java.util.ArrayList;
import java.util.Iterator;
import nw3.C109804j;

/* renamed from: nw3.s */
public class C109816s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f328730d;

    /* renamed from: e */
    public final /* synthetic */ boolean f328731e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328732f;

    public C109816s(C109804j jVar, String str, boolean z) {
        this.f328732f = jVar;
        this.f328730d = str;
        this.f328731e = z;
    }

    public void run() {
        ArrayList arrayList;
        synchronized (this.f328732f.f328705a) {
            arrayList = new ArrayList(this.f328732f.f328705a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C109804j.C109807c) it.next()).mo161046d(this.f328730d, this.f328731e);
        }
    }
}
