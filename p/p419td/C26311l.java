package p419td;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p419td.C26297d;

/* renamed from: td.l */
public class C26311l implements C26297d {

    /* renamed from: a */
    public ArrayList<C26297d.C26299b> f73314a = new ArrayList<>();

    /* renamed from: b */
    public C26297d.C26298a f73315b = new C26297d.C26298a();

    /* renamed from: c */
    public int f73316c;

    /* renamed from: d */
    public int f73317d;

    /* renamed from: e */
    public C26297d.C26300c f73318e = new C26297d.C26300c();

    /* renamed from: a */
    public void mo53198a() {
        C26297d.C26298a aVar = this.f73315b;
        ArrayList<C26297d.C26299b> arrayList = this.f73314a;
        aVar.getClass();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C26297d.C26299b> it = arrayList.iterator();
            while (it.hasNext()) {
                ((LinkedList) aVar.f73252a).offer(it.next());
            }
            arrayList.clear();
        }
        C26297d.C26299b bVar = (C26297d.C26299b) ((LinkedList) this.f73315b.f73252a).poll();
        if (bVar == null) {
            bVar = new C26297d.C26299b();
        }
        bVar.f73253a = 1;
        bVar.f73254b = 1;
        bVar.f73255c = this.f73316c - 2;
        this.f73314a.add(bVar);
    }
}
