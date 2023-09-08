package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.bi */
public final class C113551bi {

    /* renamed from: a */
    public final Map<String, C113709et> f339804a = new ConcurrentHashMap();

    /* renamed from: b */
    public final List<C113709et> f339805b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final List<C113709et> f339806c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final List<C113709et> f339807d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final List<C113704ep> f339808e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final C113532ba f339809f;

    /* renamed from: g */
    public final Comparator<Levelable> f339810g = new Comparator<Levelable>() {
        /* renamed from: a */
        private static int m156163a(Levelable levelable, Levelable levelable2) {
            return Float.compare((float) levelable.getZIndex(), (float) levelable2.getZIndex());
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Float.compare((float) ((Levelable) obj).getZIndex(), (float) ((Levelable) obj2).getZIndex());
        }
    };

    /* renamed from: h */
    public final Comparator<Levelable> f339811h = new Comparator<Levelable>() {
        /* renamed from: a */
        private static int m156164a(Levelable levelable, Levelable levelable2) {
            return levelable.getLevel() == levelable2.getLevel() ? Float.compare((float) levelable.getZIndex(), (float) levelable2.getZIndex()) : levelable.getLevel() - levelable2.getLevel();
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Levelable levelable = (Levelable) obj;
            Levelable levelable2 = (Levelable) obj2;
            return levelable.getLevel() == levelable2.getLevel() ? Float.compare((float) levelable.getZIndex(), (float) levelable2.getZIndex()) : levelable.getLevel() - levelable2.getLevel();
        }
    };

    /* renamed from: i */
    public final C113537bf f339812i;

    /* renamed from: j */
    private IndoorBuilding f339813j;

    public C113551bi(C113532ba baVar, C113536be beVar) {
        this.f339809f = baVar;
        this.f339812i = new C113537bf(beVar);
    }

    /* renamed from: a */
    private Arc m156138a(ArcOptions arcOptions) {
        C114024ow owVar = new C114024ow(arcOptions, this.f339809f);
        C113524as asVar = new C113524as(owVar);
        this.f339804a.put(owVar.getId(), asVar);
        this.f339806c.add(asVar);
        mo171675a((C113704ep) owVar);
        return asVar;
    }

    /* renamed from: b */
    private boolean m156144b(String str) {
        C113521ap f_;
        C113709et remove = this.f339804a.remove(str);
        if (remove != null) {
            this.f339805b.remove(remove);
            this.f339806c.remove(remove);
            this.f339807d.remove(remove);
            if ((remove instanceof C113527av) && (f_ = ((C113527av) remove).mo171394f_()) != null) {
                this.f339808e.remove(f_);
            }
        }
        return remove != null;
    }

    /* renamed from: c */
    private List<C113709et> m156145c() {
        return this.f339805b;
    }

    /* renamed from: d */
    private List<C113709et> m156146d() {
        return this.f339806c;
    }

    /* renamed from: e */
    private List<C113709et> m156147e() {
        return this.f339807d;
    }

    /* renamed from: f */
    private List<Arc> m156148f() {
        ArrayList arrayList = new ArrayList();
        for (C113709et next : this.f339804a.values()) {
            if (next instanceof C113524as) {
                arrayList.add((C113524as) next);
            }
        }
        Collections.sort(arrayList, this.f339810g);
        return arrayList;
    }

    /* renamed from: g */
    private List<Marker> m156149g() {
        ArrayList arrayList = new ArrayList();
        for (C113709et next : this.f339804a.values()) {
            if (next instanceof C113528aw) {
                arrayList.add((C113528aw) next);
            }
        }
        Collections.sort(arrayList, this.f339810g);
        return arrayList;
    }

    /* renamed from: h */
    private List<Polyline> m156150h() {
        ArrayList arrayList = new ArrayList();
        for (C113709et next : this.f339804a.values()) {
            if (next instanceof C113530ay) {
                arrayList.add((C113530ay) next);
            }
        }
        Collections.sort(arrayList, this.f339810g);
        return arrayList;
    }

    /* renamed from: i */
    private List<Polygon> m156151i() {
        ArrayList arrayList = new ArrayList();
        for (C113709et next : this.f339804a.values()) {
            if (next instanceof C113529ax) {
                arrayList.add((C113529ax) next);
            }
        }
        Collections.sort(arrayList, this.f339811h);
        return arrayList;
    }

    /* renamed from: j */
    private List<Circle> m156152j() {
        ArrayList arrayList = new ArrayList();
        for (C113709et next : this.f339804a.values()) {
            if (next instanceof C113525at) {
                arrayList.add((C113525at) next);
            }
        }
        Collections.sort(arrayList, this.f339810g);
        return arrayList;
    }

    /* renamed from: k */
    private void m156153k() {
        Iterator<C113709et> it = this.f339804a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final Circle mo171671a(CircleOptions circleOptions) {
        C114026ox oxVar = new C114026ox(this.f339809f);
        oxVar.mo172597a(circleOptions);
        C113525at atVar = new C113525at(oxVar);
        this.f339804a.put(oxVar.getId(), atVar);
        this.f339807d.add(atVar);
        mo171675a((C113704ep) oxVar);
        return atVar;
    }

    /* renamed from: b */
    public final Iterable<C113709et> mo171677b() {
        return this.f339804a.values();
    }

    /* renamed from: b */
    private void m156143b(C113709et etVar) {
        C113537bf bfVar = this.f339812i;
        if (etVar != null) {
            synchronized (bfVar.f339742a) {
                bfVar.f339742a.remove(etVar);
                bfVar.f339743b.add(etVar);
            }
        }
    }

    /* renamed from: a */
    private Polygon m156139a(PolygonOptions polygonOptions) {
        C114034pb pbVar = new C114034pb(this.f339809f, polygonOptions);
        C113529ax axVar = new C113529ax(pbVar);
        this.f339804a.put(pbVar.getId(), axVar);
        this.f339807d.add(axVar);
        mo171675a((C113704ep) pbVar);
        return axVar;
    }

    /* renamed from: a */
    public final Polyline mo171673a(PolylineOptions polylineOptions) {
        C114036pc pcVar = new C114036pc(this.f339809f);
        pcVar.setPolylineOptions(polylineOptions);
        C113530ay ayVar = new C113530ay(pcVar);
        this.f339804a.put(pcVar.getId(), ayVar);
        this.f339806c.add(ayVar);
        mo171675a((C113704ep) pcVar);
        return ayVar;
    }

    /* renamed from: a */
    public final Marker mo171672a(MarkerOptions markerOptions) {
        C114322sx sxVar = (C114322sx) this.f339809f;
        C114030pa paVar = new C114030pa(sxVar);
        paVar.setMarkerOptions(markerOptions);
        C113528aw awVar = new C113528aw(paVar);
        this.f339804a.put(paVar.getId(), awVar);
        this.f339805b.add(awVar);
        C114046pe peVar = sxVar.f342575ar;
        if (peVar != null) {
            peVar.mo172633a(paVar);
        }
        mo171675a((C113704ep) paVar);
        return awVar;
    }

    /* renamed from: a */
    public final void mo171675a(C113704ep epVar) {
        if (epVar != null && epVar.mo172019m() != null) {
            IndoorBuilding indoorBuilding = this.f339813j;
            if (indoorBuilding != null) {
                epVar.mo172017a(indoorBuilding);
            } else {
                epVar.mo172021o();
            }
            this.f339808e.add(epVar);
        }
    }

    /* renamed from: a */
    public final C113709et mo171669a(String str) {
        return this.f339804a.get(str);
    }

    /* renamed from: a */
    public final <T extends C113709et> T mo171670a(String str, Class<T> cls) {
        T t = (C113709et) this.f339804a.get(str);
        if (t == null || t.getClass() != cls) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo171674a() {
        synchronized (this) {
            Iterator<C113709et> it = this.f339804a.values().iterator();
            while (it.hasNext()) {
                C113709et next = it.next();
                if (next != null) {
                    next.remove();
                    it.remove();
                }
            }
        }
        this.f339805b.clear();
        this.f339806c.clear();
        this.f339807d.clear();
    }

    /* renamed from: a */
    public final boolean mo171676a(IndoorBuilding indoorBuilding) {
        this.f339813j = indoorBuilding;
        boolean z = false;
        for (C113704ep next : this.f339808e) {
            if (next.mo172019m() != null) {
                z = true;
                if (indoorBuilding != null) {
                    next.mo172017a(indoorBuilding);
                } else {
                    next.mo172021o();
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m156140a(C113709et etVar) {
        C113537bf bfVar = this.f339812i;
        synchronized (bfVar.f339742a) {
            if (!bfVar.f339742a.contains(etVar)) {
                bfVar.f339742a.add(etVar);
            }
        }
        if (etVar instanceof C113704ep) {
            mo171675a((C113704ep) etVar);
        }
    }

    /* renamed from: a */
    private void m156141a(GL10 gl10) {
        this.f339812i.mo171649a(gl10);
    }

    /* renamed from: a */
    private boolean m156142a(float f, float f2) {
        return this.f339812i.mo171648a(f, f2);
    }
}
