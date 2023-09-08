package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q00.C110264g;
import qr3.C110470e;
import rx3.C13604l;
import rx3.C13605o;
import sx3.C64186f0;

/* renamed from: ac3.k */
public final class C103363k implements C54009m {

    /* renamed from: a */
    public boolean f304826a;

    /* renamed from: b */
    public C110264g f304827b;

    /* renamed from: c */
    public long f304828c;

    /* renamed from: d */
    public final List<C13604l<Integer, String>> f304829d = new ArrayList();

    /* renamed from: e */
    public final ArrayList<C13605o<Long, Integer, String>> f304830e = new ArrayList<>();

    /* renamed from: a */
    public boolean mo74673a(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f304830e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Number) ((C13605o) t).f38557d).longValue() == ((long) i)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: b */
    public void mo74674b(List<C13604l<Integer, String>> list) {
        C87412m.m108594g(list, "resList");
        mo143268m(list);
    }

    /* renamed from: d */
    public void mo74671d(C110264g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("attach WeVision=");
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        sb.append(C110470e.f330363a);
        Log.m105924i("FinderLiveGestureIdentificationEffect", sb.toString());
        if (!this.f304826a || gVar == null || gVar.mo143248o() == this.f304828c) {
            C110264g gVar2 = this.f304827b;
            if (gVar2 != null) {
                gVar2.mo143246m(this);
            }
            this.f304827b = gVar;
            if (gVar != null) {
                gVar.mo143240g(this);
            }
            if (gVar != null) {
                long o = gVar.mo143248o();
                this.f304828c = o;
                if (o != 0) {
                    this.f304826a = true;
                    return;
                }
                return;
            }
            mo143268m(C64186f0.f181907d);
            this.f304828c = 0;
            this.f304826a = false;
            return;
        }
        Log.m105924i("FinderLiveGestureIdentificationEffect", "Cannot attach twice!");
    }

    /* renamed from: j */
    public int mo74672j() {
        return 0;
    }

    /* renamed from: l */
    public int mo74675l(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f304830e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Number) ((C13605o) t).f38557d).longValue() == ((long) i)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C13605o oVar = (C13605o) t;
        if (oVar != null) {
            return ((Number) oVar.f38558e).intValue();
        }
        return 0;
    }

    /* renamed from: m */
    public final void mo143268m(List<C13604l<Integer, String>> list) {
        ((ArrayList) this.f304829d).clear();
        ((ArrayList) this.f304829d).addAll(list);
        if (!this.f304826a) {
            Log.m105924i("FinderLiveGestureIdentificationEffect", "This effect is not attached!");
        }
        if (this.f304826a) {
            for (C13605o oVar : this.f304830e) {
                C110264g gVar = this.f304827b;
                if (gVar != null) {
                    gVar.mo143251r(((Number) oVar.f38557d).longValue());
                }
            }
            this.f304830e.clear();
            for (C13604l next : list) {
                C110264g gVar2 = this.f304827b;
                Long valueOf = gVar2 != null ? Long.valueOf(gVar2.mo143243j((String) next.f38556e)) : null;
                if (!(valueOf == null || valueOf.longValue() == -1)) {
                    this.f304830e.add(new C13605o(valueOf, next.f38555d, next.f38556e));
                }
            }
        }
    }

    public void reload() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f304829d);
        mo143268m(arrayList);
    }
}
