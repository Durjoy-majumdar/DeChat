package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113820hz;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ia */
public final class C113823ia extends C113820hz {

    /* renamed from: i */
    public boolean f340563i;

    /* renamed from: j */
    public List<C113820hz> f340564j = null;

    public C113823ia(boolean z) {
        this.f340563i = z;
        this.f340564j = new ArrayList();
    }

    /* renamed from: a */
    public final void mo172213a(C113820hz hzVar) {
        if (hzVar != null) {
            this.f340564j.add(hzVar);
        }
    }

    /* renamed from: c */
    public final void mo172214c() {
        List<C113820hz> list = this.f340564j;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public final void mo172203a(long j) {
        int size;
        super.mo172203a(j);
        List<C113820hz> list = this.f340564j;
        if (list != null && (size = list.size()) != 0) {
            for (int i = 0; i < size; i++) {
                C113820hz hzVar = this.f340564j.get(i);
                if (hzVar != null) {
                    hzVar.mo172203a(j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        int size;
        List<C113820hz> list = this.f340564j;
        if (list != null && (size = list.size()) != 0) {
            for (int i = 0; i < size; i++) {
                C113820hz hzVar = this.f340564j.get(i);
                if (hzVar != null) {
                    if (this.f340563i) {
                        hzVar.mo172201a(f, interpolator);
                    } else {
                        hzVar.mo172201a(f, hzVar.f340560f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo172206a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        List<C113820hz> list;
        int size;
        boolean a = super.mo172206a(geoPoint, geoPoint2);
        if (!a || (list = this.f340564j) == null || (size = list.size()) == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            C113820hz hzVar = this.f340564j.get(i);
            if (hzVar != null) {
                a = a && hzVar.mo172206a(geoPoint, geoPoint2);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo172205a(C113820hz.C113822b bVar) {
        int size;
        super.mo172205a(bVar);
        List<C113820hz> list = this.f340564j;
        if (list != null && (size = list.size()) != 0) {
            for (int i = 0; i < size; i++) {
                C113820hz hzVar = this.f340564j.get(i);
                if (hzVar != null) {
                    hzVar.mo172205a(bVar);
                }
            }
        }
    }
}
