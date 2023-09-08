package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.ij */
public abstract class C24212ij implements Cloneable {

    /* renamed from: a */
    public ArrayList<C24213a> f69306a = null;

    /* renamed from: com.tencent.mapsdk.internal.ij$a */
    public interface C24213a {
        /* renamed from: a */
        void mo40977a();

        /* renamed from: a */
        void mo40978a(C24212ij ijVar);

        /* renamed from: b */
        void mo40979b();

        /* renamed from: b */
        void mo40980b(C24212ij ijVar);
    }

    /* renamed from: i */
    private ArrayList<C24213a> m30123i() {
        return this.f69306a;
    }

    /* renamed from: j */
    private void m30124j() {
        ArrayList<C24213a> arrayList = this.f69306a;
        if (arrayList != null) {
            arrayList.clear();
            this.f69306a = null;
        }
    }

    /* renamed from: a */
    public void mo40963a() {
    }

    /* renamed from: a */
    public abstract void mo40964a(long j);

    /* renamed from: a */
    public abstract void mo40965a(Interpolator interpolator);

    /* renamed from: a */
    public final void mo40966a(C24213a aVar) {
        if (this.f69306a == null) {
            this.f69306a = new ArrayList<>();
        }
        this.f69306a.add(aVar);
    }

    /* renamed from: b */
    public abstract C24212ij mo40967b(long j);

    /* renamed from: b */
    public void mo40968b() {
    }

    /* renamed from: b */
    public final void mo40969b(C24213a aVar) {
        ArrayList<C24213a> arrayList = this.f69306a;
        if (arrayList != null) {
            arrayList.remove(aVar);
            if (this.f69306a.size() == 0) {
                this.f69306a = null;
            }
        }
    }

    /* renamed from: c */
    public void mo40970c() {
    }

    /* renamed from: d */
    public abstract long mo40972d();

    /* renamed from: e */
    public abstract long mo40973e();

    /* renamed from: f */
    public abstract boolean mo40974f();

    /* renamed from: g */
    public boolean mo40975g() {
        return mo40974f();
    }

    /* renamed from: h */
    public C24212ij clone() {
        try {
            C24212ij ijVar = (C24212ij) super.clone();
            ArrayList<C24213a> arrayList = this.f69306a;
            if (arrayList != null) {
                ijVar.f69306a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ijVar.f69306a.add(arrayList.get(i));
                }
            }
            return ijVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
