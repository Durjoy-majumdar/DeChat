package com.tencent.mapsdk.internal;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.tencent.mapsdk.internal.C113973mu;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;

/* renamed from: com.tencent.mapsdk.internal.mt */
public abstract class C113971mt<T extends C113973mu> {

    /* renamed from: a */
    public C114216sq f340957a;

    /* renamed from: b */
    public SparseArray<C113970ms<T>> f340958b;

    /* renamed from: c */
    public SparseArray<C113970ms<T>> f340959c;

    /* renamed from: d */
    public SparseArray<C113970ms<T>> f340960d;

    /* renamed from: e */
    public SparseArray<C113970ms<T>> f340961e;

    /* renamed from: f */
    public SparseArray<C113970ms<T>> f340962f;

    /* renamed from: g */
    public SparseArray<C113970ms<T>> f340963g;

    /* renamed from: h */
    public SparseArray<C113970ms<T>> f340964h;

    /* renamed from: i */
    private int f340965i = 0;

    /* renamed from: com.tencent.mapsdk.internal.mt$a */
    public static class C113972a implements TencentMap.IClickedObject {

        /* renamed from: a */
        public LatLng f340966a;

        /* renamed from: b */
        public String f340967b;

        /* renamed from: c */
        public String f340968c;

        public C113972a(LatLng latLng, String str, String str2) {
            this.f340966a = latLng;
            this.f340967b = str;
            this.f340968c = str2;
        }

        public final String getIdentifier() {
            return this.f340967b;
        }

        public final String getName() {
            return this.f340968c;
        }

        public final LatLng getPosition() {
            return this.f340966a;
        }
    }

    public C113971mt(C114216sq sqVar) {
        this.f340957a = sqVar;
        this.f340958b = new SparseArray<>();
        this.f340959c = new SparseArray<>();
        this.f340960d = new SparseArray<>();
        this.f340961e = new SparseArray<>();
        this.f340962f = new SparseArray<>();
        this.f340963g = new SparseArray<>();
        this.f340964h = new SparseArray<>();
    }

    /* renamed from: j */
    private synchronized void m158239j() {
        this.f340964h.clear();
        this.f340960d.clear();
        this.f340962f.clear();
        this.f340958b.clear();
    }

    /* renamed from: a */
    public synchronized C113970ms<T> mo172485a(int i) {
        return this.f340958b.get(i);
    }

    /* renamed from: a */
    public abstract C113970ms<T> mo172486a(T t);

    /* renamed from: b */
    public synchronized C113970ms<T> mo172488b(T t) {
        C113970ms<T> a;
        SparseArray<C113970ms<T>> sparseArray;
        int i;
        a = mo172486a(t);
        do {
            sparseArray = this.f340958b;
            i = this.f340965i + 1;
            this.f340965i = i;
        } while (sparseArray.get(i) != null);
        int i2 = this.f340965i;
        a.f340953a = i2;
        this.f340958b.append(i2, a);
        this.f340960d.append(a.f340953a, a);
        this.f340957a.mo172944h(true);
        return a;
    }

    /* renamed from: c */
    public void mo172491c() {
    }

    /* renamed from: c */
    public abstract void mo172492c(C113970ms msVar);

    /* renamed from: d */
    public final synchronized void mo172493d() {
        mo172491c();
        SparseArray<C113970ms<T>> sparseArray = this.f340963g;
        this.f340963g = this.f340964h;
        this.f340964h = sparseArray;
        SparseArray<C113970ms<T>> sparseArray2 = this.f340961e;
        this.f340961e = this.f340962f;
        this.f340962f = sparseArray2;
        SparseArray<C113970ms<T>> sparseArray3 = this.f340959c;
        this.f340959c = this.f340960d;
        this.f340960d = sparseArray3;
        sparseArray3.clear();
        this.f340962f.clear();
        this.f340964h.clear();
        mo172495f();
        mo172496g();
        mo172497h();
        this.f340963g.clear();
        this.f340961e.clear();
        this.f340959c.clear();
        mo172494e();
    }

    /* renamed from: e */
    public void mo172494e() {
    }

    /* renamed from: f */
    public abstract void mo172495f();

    /* renamed from: g */
    public abstract void mo172496g();

    /* renamed from: h */
    public abstract void mo172497h();

    /* renamed from: i */
    public boolean mo172498i() {
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo172487a(C113970ms<T> msVar) {
        if (this.f340958b.get(msVar.f340953a) != null) {
            this.f340962f.append(msVar.f340953a, msVar);
            this.f340957a.mo172944h(true);
        }
    }

    /* renamed from: a */
    public final Context mo172483a() {
        C114216sq sqVar = this.f340957a;
        if (sqVar == null) {
            return null;
        }
        return sqVar.mo172893B();
    }

    /* renamed from: b */
    public final synchronized void mo172490b(C113970ms<T> msVar) {
        mo172492c(msVar);
        if (this.f340958b.get(msVar.f340953a) != null) {
            if (this.f340960d.get(msVar.f340953a) == null) {
                this.f340964h.append(msVar.f340953a, msVar);
            }
            this.f340958b.remove(msVar.f340953a);
            this.f340960d.remove(msVar.f340953a);
            this.f340962f.remove(msVar.f340953a);
            this.f340957a.mo172944h(true);
        }
    }

    /* renamed from: a */
    public Pair<VectorOverlay, TencentMap.IClickedObject> mo172484a(LatLng latLng, long j, String str, String str2) {
        return new Pair<>((Object) null, (Object) null);
    }

    /* renamed from: b */
    public final synchronized void mo172489b() {
        m158239j();
    }
}
