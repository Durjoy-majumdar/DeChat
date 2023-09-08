package vd3;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import p261wl.C38166b;
import p261wl.C38174i;
import vd3.C78407r;

/* renamed from: vd3.f */
public class C78394f implements C78407r.C78409b, C78407r.C78410c {

    /* renamed from: d */
    public final C78407r.C78409b f229712d;

    /* renamed from: e */
    public final HashMap<String, C78407r.C78409b> f229713e = new HashMap<>();

    public C78394f(C78407r.C78409b bVar) {
        this.f229712d = bVar;
    }

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        mo108340b(rVar.f229749j).mo10724E0(rVar);
        this.f229712d.mo10724E0(rVar);
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        return mo108340b(str).mo10725O(str);
    }

    /* renamed from: a */
    public boolean mo108339a(String str) {
        C78407r.C78409b b = mo108340b(str);
        if (b instanceof C78407r.C78410c) {
            return ((C78407r.C78410c) b).mo108339a(str);
        }
        return true;
    }

    /* renamed from: b */
    public final C78407r.C78409b mo108340b(String str) {
        if (str == null) {
            return this.f229712d;
        }
        synchronized (this.f229713e) {
            for (Map.Entry next : this.f229713e.entrySet()) {
                if (str.endsWith((String) next.getKey())) {
                    C78407r.C78409b bVar = (C78407r.C78409b) next.getValue();
                    return bVar;
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C78407r.C78412e.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                C78407r.C78409b bVar3 = ((C78407r.C78412e) ((C38174i) bVar2.next()).get()).get(str);
                if (bVar3 != null) {
                    return bVar3;
                }
            }
            C78407r.C78409b bVar4 = this.f229712d;
            return bVar4;
        }
    }

    public Bitmap loadBitmap(String str) {
        return mo108340b(str).loadBitmap(str);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        return mo108340b(str).ov0(str, i, i2, i3);
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        return this.f229712d.mo10728qq();
    }
}
