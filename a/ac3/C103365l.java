package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q00.C110264g;
import qr3.C110470e;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import sx3.C64186f0;

/* renamed from: ac3.l */
public final class C103365l implements C0031n {

    /* renamed from: a */
    public boolean f304832a;

    /* renamed from: b */
    public C110264g f304833b;

    /* renamed from: c */
    public long f304834c;

    /* renamed from: d */
    public final List<C13604l<Integer, String>> f304835d = new ArrayList();

    /* renamed from: e */
    public final ArrayList<C13605o<Long, Integer, String>> f304836e = new ArrayList<>();

    /* renamed from: f */
    public long f304837f;

    /* renamed from: g */
    public C32224a<C13598b0> f304838g;

    /* renamed from: h */
    public C32224a<C13598b0> f304839h;

    /* renamed from: ac3.l$a */
    public static final class C103366a implements IWeEffectCallback {

        /* renamed from: a */
        public final /* synthetic */ C103365l f304840a;

        public C103366a(C103365l lVar) {
            this.f304840a = lVar;
        }

        /* renamed from: a */
        public void mo84253a(int i, int i2, int i3, int i4) {
            Log.m105924i("FinderLiveGestureRenderEffect", "#onAnimationStateChange status=" + i + " playedTime=" + i2 + " maxPlayTime=" + i3 + " instanceId=" + i4);
            if (i == 1) {
                C103365l lVar = this.f304840a;
                long j = lVar.f304837f;
                if (j != 0) {
                    C110264g gVar = lVar.f304833b;
                    if (gVar != null) {
                        gVar.mo143247n(j, (IWeEffectCallback) null);
                    }
                    C103365l lVar2 = this.f304840a;
                    lVar2.f304837f = 0;
                    C32224a<C13598b0> aVar = lVar2.f304839h;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.f304840a.f304839h = null;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo27a(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f304836e.iterator();
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

    /* renamed from: d */
    public void mo74671d(C110264g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("attach WeVision=");
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        sb.append(C110470e.f330363a);
        Log.m105924i("FinderLiveGestureRenderEffect", sb.toString());
        if (!this.f304832a || gVar == null || gVar.mo143248o() == this.f304834c) {
            C110264g gVar2 = this.f304833b;
            if (gVar2 != null) {
                gVar2.mo143246m(this);
            }
            this.f304833b = gVar;
            if (gVar != null) {
                gVar.mo143240g(this);
            }
            if (gVar != null) {
                long o = gVar.mo143248o();
                this.f304834c = o;
                if (o != 0) {
                    this.f304832a = true;
                    return;
                }
                return;
            }
            mo143269m(C64186f0.f181907d, (C32224a<C13598b0>) null, (C32224a<C13598b0>) null);
            long j = this.f304837f;
            if (j != 0) {
                C110264g gVar3 = this.f304833b;
                if (gVar3 != null) {
                    gVar3.mo143247n(j, (IWeEffectCallback) null);
                }
                this.f304837f = 0;
            }
            this.f304834c = 0;
            this.f304832a = false;
            return;
        }
        Log.m105924i("FinderLiveGestureRenderEffect", "Cannot attach twice!");
    }

    /* renamed from: e */
    public void mo28e(List<C13604l<Integer, String>> list, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(list, "resList");
        mo143269m(list, aVar, aVar2);
    }

    /* renamed from: g */
    public void mo29g(int i, long j) {
        if (!mo27a(i)) {
            Log.m105920e("FinderLiveGestureRenderEffect", "#applyAnimationCallback effectId=" + i + " not match");
            return;
        }
        long j2 = this.f304837f;
        if (j != j2) {
            if (j2 != 0) {
                C110264g gVar = this.f304833b;
                if (gVar != null) {
                    gVar.mo143247n(j2, (IWeEffectCallback) null);
                }
                this.f304837f = 0;
            }
            this.f304837f = j;
            C32224a<C13598b0> aVar = this.f304838g;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f304838g = null;
            C110264g gVar2 = this.f304833b;
            if (gVar2 != null) {
                gVar2.mo143247n(j, new C103366a(this));
            }
        }
    }

    /* renamed from: i */
    public void mo30i(int i, String str) {
        T t;
        boolean z;
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        Log.m105924i("FinderLiveGestureRenderEffect", "#setAnimationMessageToWeVision gestureId=" + i + " message=" + str);
        Iterator<T> it = this.f304836e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Number) ((C13605o) t).f38558e).intValue() == i) {
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
        if (oVar == null) {
            Log.m105920e("FinderLiveGestureRenderEffect", "#setAnimationMessageToWeVision gestureId=" + i + " not match");
            return;
        }
        C110264g gVar = this.f304833b;
        if (gVar != null) {
            gVar.mo143244k(((Number) oVar.f38557d).longValue(), str, 0);
        }
    }

    /* renamed from: j */
    public int mo74672j() {
        return 0;
    }

    /* renamed from: m */
    public final void mo143269m(List<C13604l<Integer, String>> list, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        this.f304838g = aVar;
        this.f304839h = aVar2;
        ((ArrayList) this.f304835d).clear();
        ((ArrayList) this.f304835d).addAll(list);
        if (!this.f304832a) {
            Log.m105924i("FinderLiveGestureRenderEffect", "This effect is not attached!");
        }
        if (this.f304832a) {
            for (C13605o oVar : this.f304836e) {
                C110264g gVar = this.f304833b;
                if (gVar != null) {
                    gVar.mo143251r(((Number) oVar.f38557d).longValue());
                }
            }
            this.f304836e.clear();
            for (C13604l next : list) {
                C110264g gVar2 = this.f304833b;
                Long valueOf = gVar2 != null ? Long.valueOf(gVar2.mo143243j((String) next.f38556e)) : null;
                if (!(valueOf == null || valueOf.longValue() == -1)) {
                    this.f304836e.add(new C13605o(valueOf, next.f38555d, next.f38556e));
                }
            }
        }
    }

    public void reload() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f304835d);
        mo143269m(arrayList, this.f304838g, this.f304839h);
    }
}
