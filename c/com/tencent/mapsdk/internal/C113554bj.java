package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C113880kc;
import com.tencent.mapsdk.internal.C114065pl;
import com.tencent.mapsdk.internal.C114165rp;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.bj */
public final class C113554bj implements C113534bc, C114065pl.C114066a, C114165rp.C114173c {

    /* renamed from: a */
    public final C113536be f339816a;

    /* renamed from: b */
    public C113880kc.C113881a f339817b;

    /* renamed from: c */
    public TencentMap.OnMarkerDragListener f339818c;

    /* renamed from: d */
    public final C113551bi f339819d;

    /* renamed from: e */
    public C113713ex f339820e;

    /* renamed from: f */
    public List<C113712ew> f339821f;

    /* renamed from: g */
    public C113714ez f339822g;

    /* renamed from: h */
    public C113710eu f339823h;

    /* renamed from: i */
    public final Map<Class<? extends C113973mu>, C113971mt> f339824i;

    /* renamed from: j */
    private Marker f339825j = null;

    /* renamed from: k */
    private boolean f339826k = false;

    /* renamed from: l */
    private Marker f339827l;

    /* renamed from: m */
    private Marker f339828m;

    /* renamed from: n */
    private Marker f339829n;

    public C113554bj(C113551bi biVar, C113536be beVar) {
        this.f339816a = beVar;
        this.f339819d = biVar;
        this.f339824i = new HashMap();
    }

    /* renamed from: c */
    private void m156181c(C113709et etVar) {
        mo171684a(etVar);
    }

    /* renamed from: d */
    private void m156184d(C113709et etVar) {
        mo171684a(etVar);
    }

    /* renamed from: e */
    private void m156187e(C113709et etVar) {
        mo171684a(etVar);
    }

    /* renamed from: f */
    private void m156188f(C113709et etVar) {
        mo171684a(etVar);
    }

    /* renamed from: c */
    private boolean m156182c(float f, float f2) {
        TappedElement a = this.f339816a.mo171638f().mo172899a(f, f2);
        if (a == null || a.type != 3) {
            return false;
        }
        C113710eu euVar = this.f339823h;
        if (euVar == null) {
            return true;
        }
        euVar.mo172034R();
        return true;
    }

    /* renamed from: d */
    private C113551bi m156183d() {
        return this.f339819d;
    }

    /* renamed from: e */
    private void m156186e() {
        Collection<C113971mt> values;
        Map<Class<? extends C113973mu>, C113971mt> map = this.f339824i;
        if (map != null && (values = map.values()) != null && !values.isEmpty()) {
            for (C113971mt d : values) {
                d.mo172493d();
            }
        }
    }

    /* renamed from: f */
    private boolean m156189f() {
        C113971mt mtVar = this.f339824i.get(C113983nd.class);
        if (mtVar != null) {
            return mtVar.mo172498i();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo171688b(C113709et etVar) {
        C113537bf bfVar = this.f339819d.f339812i;
        if (etVar != null) {
            synchronized (bfVar.f339742a) {
                bfVar.f339742a.remove(etVar);
                bfVar.f339743b.add(etVar);
            }
        }
    }

    /* renamed from: d */
    private boolean m156185d(float f, float f2) {
        TappedElement a = this.f339816a.mo171638f().mo172899a(f, f2);
        if (a != null && a.type == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo171684a(C113709et etVar) {
        C113551bi biVar = this.f339819d;
        C113537bf bfVar = biVar.f339812i;
        synchronized (bfVar.f339742a) {
            if (!bfVar.f339742a.contains(etVar)) {
                bfVar.f339742a.add(etVar);
            }
        }
        if (etVar instanceof C113704ep) {
            biVar.mo171675a((C113704ep) etVar);
        }
    }

    /* renamed from: c */
    public final void mo171689c() {
        Marker marker = this.f339828m;
        if (marker != null) {
            marker.setVisible(true);
        }
        Marker marker2 = this.f339827l;
        if (marker2 != null) {
            marker2.setVisible(true);
        }
    }

    /* renamed from: b */
    private void m156179b(C113712ew ewVar) {
        List<C113712ew> list;
        if (ewVar != null && (list = this.f339821f) != null) {
            list.remove(ewVar);
        }
    }

    /* renamed from: b */
    private boolean m156180b(float f, float f2) {
        List<C113712ew> list;
        TappedElement a = this.f339816a.mo171638f().mo172899a(f, f2);
        if (a == null) {
            return false;
        }
        int i = a.type;
        if (i == 1 && this.f339820e != null) {
            new C113738ft(a.name, C113883ke.m157465a(a.pixelX, a.pixelY));
            return true;
        } else if (i != 6 || (list = this.f339821f) == null) {
            return false;
        } else {
            Iterator<C113712ew> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final <O extends C113973mu, L extends C113970ms<O>> L mo171680a(O o) {
        C113536be beVar = this.f339816a;
        if (o == null || beVar == null) {
            return null;
        }
        C113971mt mtVar = this.f339824i.get(o.getClass());
        if (mtVar == null) {
            if (o.getClass() == C113997nq.class) {
                mtVar = new C113996np(beVar.mo171638f());
            } else if (o.getClass() == C113981nb.class) {
                mtVar = new C113980na(beVar.mo171638f());
            } else if (o.getClass() == C113976mx.class) {
                mtVar = new C113977my(beVar.mo171638f());
            } else if (o.getClass() == C113988nh.class) {
                mtVar = new C113987ng(beVar.mo171638f());
            } else if (o.getClass() == C113991nk.class) {
                mtVar = new C113990nj(beVar.mo171638f());
            } else if (o.getClass() == C113994nn.class) {
                mtVar = new C113992nl(beVar.mo171638f());
            } else if (o.getClass() == C114000nt.class) {
                mtVar = new C113999ns(beVar.mo171638f());
            } else if (o.getClass() == C114003nw.class) {
                mtVar = new C114002nv(beVar.mo171638f());
            } else if (o.getClass() == C113983nd.class) {
                mtVar = new C113982nc(beVar.mo171638f());
            }
            this.f339824i.put(o.getClass(), mtVar);
        }
        return mtVar.mo172488b(o);
    }

    /* renamed from: b */
    public final void mo171686b() {
        Collection<C113971mt> values;
        Map<Class<? extends C113973mu>, C113971mt> map = this.f339824i;
        if (!(map == null || (values = map.values()) == null || values.isEmpty())) {
            for (C113971mt b : values) {
                b.mo172489b();
            }
        }
        this.f339826k = false;
        this.f339825j = null;
    }

    /* renamed from: b */
    public final void mo171687b(View view, Rect rect, boolean z) {
        Bitmap a;
        if (view != null && (a = C104548ha.m139943a(view)) != null) {
            if (this.f339828m == null) {
                MarkerOptions visible = new MarkerOptions().anchor(0.0f, 0.0f).visible(false);
                visible.tag(C114065pl.f341304c);
                visible.fastLoad(true);
                Marker a2 = this.f339819d.mo171672a(visible);
                this.f339828m = a2;
                a2.setClickable(false);
            }
            this.f339828m.setFixingPoint(rect.left, rect.top);
            this.f339828m.setIcon(BitmapDescriptorFactory.fromBitmap(this.f339816a, a));
            this.f339828m.setVisible(z);
            C113886kg.m157517a(a);
        }
    }

    /* renamed from: a */
    private <O extends C113973mu, L extends C113970ms<O>> void m156168a(int i, O o) {
        C113970ms a;
        C113971mt mtVar = this.f339824i.get(o.getClass());
        if (mtVar != null && (a = mtVar.mo172485a(i)) != null) {
            a.mo172478a(o);
            mtVar.mo172487a(a);
        }
    }

    /* renamed from: a */
    public final <O extends C113973mu, L extends C113970ms<O>> L mo171681a(Class<L> cls, int i) {
        L a;
        C113971mt mtVar = this.f339824i.get(((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]);
        if (mtVar == null || (a = mtVar.mo172485a(i)) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private <O extends C113973mu, L extends C113970ms<O>> boolean m156175a(int i, Class<L> cls) {
        C113970ms a = mo171681a(cls, i);
        if (a == null) {
            return false;
        }
        a.remove();
        return true;
    }

    @Deprecated
    /* renamed from: a */
    private boolean m156177a(GL10 gl10) {
        this.f339819d.f339812i.mo171649a(gl10);
        return true;
    }

    /* renamed from: a */
    private boolean m156174a(float f, float f2) {
        List<C113712ew> list;
        if (this.f339819d.f339812i.mo171648a(f, f2)) {
            return true;
        }
        TappedElement a = this.f339816a.mo171638f().mo172899a(f, f2);
        if (a == null) {
            return false;
        }
        int i = a.type;
        if (i == 1 && this.f339820e != null) {
            new C113738ft(a.name, C113883ke.m157465a(a.pixelX, a.pixelY));
            return true;
        } else if (i != 6 || (list = this.f339821f) == null) {
            return false;
        } else {
            Iterator<C113712ew> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
    }

    /* renamed from: a */
    private void m156171a(C113713ex exVar) {
        this.f339820e = exVar;
    }

    /* renamed from: a */
    private void m156170a(C113712ew ewVar) {
        if (ewVar != null) {
            if (this.f339821f == null) {
                this.f339821f = new ArrayList();
            }
            this.f339821f.add(ewVar);
        }
    }

    /* renamed from: a */
    private void m156172a(C113714ez ezVar) {
        this.f339822g = ezVar;
    }

    /* renamed from: a */
    private void m156169a(C113710eu euVar) {
        this.f339823h = euVar;
    }

    /* renamed from: a */
    private void m156173a(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        this.f339818c = onMarkerDragListener;
    }

    /* renamed from: a */
    public final void mo171630a(MotionEvent motionEvent) {
        if (this.f339816a != null && this.f339826k && this.f339825j != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    this.f339825j.setPosition(C113883ke.m157466a(this.f339816a.mo171636d().mo172025a(new C113732fo((double) ((int) motionEvent.getX()), (double) ((int) motionEvent.getY())))));
                    TencentMap.OnMarkerDragListener onMarkerDragListener = this.f339818c;
                    if (onMarkerDragListener != null) {
                        onMarkerDragListener.onMarkerDrag(this.f339825j);
                        return;
                    }
                    return;
                } else if (!(action == 3 || action == 4)) {
                    return;
                }
            }
            this.f339826k = false;
            TencentMap.OnMarkerDragListener onMarkerDragListener2 = this.f339818c;
            if (onMarkerDragListener2 != null) {
                onMarkerDragListener2.onMarkerDragEnd(this.f339825j);
            }
            this.f339825j = null;
        }
    }

    /* renamed from: a */
    public final void mo171631a(String str) {
        if (str.trim().length() == 0) {
            this.f339825j = null;
            this.f339826k = false;
            return;
        }
        Marker marker = (Marker) this.f339819d.mo171670a(str, C113528aw.class);
        this.f339825j = marker;
        if (marker != null) {
            C113536be beVar = this.f339816a;
            if (beVar instanceof C113565bo) {
                if ((marker == null || marker != this.f339827l) ? false : C113760gf.m156973a((C113565bo) beVar)) {
                    return;
                }
            }
            if (!this.f339825j.isDraggable()) {
                this.f339825j = null;
                this.f339826k = false;
                return;
            }
            this.f339826k = true;
            TencentMap.OnMarkerDragListener onMarkerDragListener = this.f339818c;
            if (onMarkerDragListener != null) {
                onMarkerDragListener.onMarkerDragStart(this.f339825j);
            }
        }
    }

    /* renamed from: a */
    public final void mo171629a() {
        this.f339826k = false;
        this.f339825j = null;
    }

    /* renamed from: a */
    private boolean m156176a(C113565bo boVar, Marker marker) {
        if (marker == null || marker != this.f339827l) {
            return false;
        }
        return C113760gf.m156973a(boVar);
    }

    /* renamed from: a */
    public final void mo171683a(View view, Rect rect, boolean z) {
        Bitmap a;
        if (view != null && rect != null && (a = C104548ha.m139943a(view)) != null) {
            if (this.f339827l == null) {
                MarkerOptions visible = new MarkerOptions().anchor(0.0f, 0.0f).visible(false);
                visible.tag(C114065pl.f341304c);
                visible.fastLoad(true);
                Marker a2 = this.f339819d.mo171672a(visible);
                this.f339827l = a2;
                C113528aw awVar = (C113528aw) this.f339819d.mo171670a(a2.getId(), C113528aw.class);
                if (awVar != null) {
                    awVar.f339728a.mo171369a((TencentMap.OnMarkerClickListener) new TencentMap.OnMarkerClickListener() {
                        public final boolean onMarkerClick(Marker marker) {
                            C113554bj bjVar = C113554bj.this;
                            if (bjVar.f339817b == null) {
                                bjVar.f339817b = C113880kc.m157444a(bjVar.f339816a.getContext(), (String) null, " ", 0);
                            }
                            C113889km.m157534a(C113554bj.this.f339816a.getContext(), C113554bj.this.f339817b);
                            return false;
                        }
                    });
                }
            }
            this.f339827l.setFixingPoint(rect.left, rect.top);
            this.f339827l.setIcon(BitmapDescriptorFactory.fromBitmap(this.f339816a, a));
            this.f339827l.setVisible(z);
            C113886kg.m157517a(a);
        }
    }

    /* renamed from: a */
    public final void mo171685a(C114165rp rpVar) {
        Marker marker = this.f339828m;
        if (marker != null) {
            marker.setVisible(false);
        }
        if (this.f339827l != null && !rpVar.mo172804k()) {
            this.f339827l.setVisible(false);
        }
    }

    /* renamed from: a */
    public final void mo171682a(Bitmap bitmap, int i, int i2) {
        Marker marker = this.f339829n;
        if (marker == null) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.anchor(0.5f, 0.5f);
            markerOptions.tag(C114065pl.f341304c);
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(this.f339816a, bitmap));
            Marker a = this.f339819d.mo171672a(markerOptions);
            this.f339829n = a;
            a.setFixingPoint(i / 2, i2 / 2);
            this.f339829n.setClickable(false);
        } else {
            marker.setIcon(BitmapDescriptorFactory.fromBitmap(this.f339816a, bitmap));
            this.f339829n.setFixingPoint(i / 2, i2 / 2);
        }
        C113886kg.m157517a(bitmap);
    }

    /* renamed from: a */
    private Pair<VectorOverlay, TencentMap.IClickedObject> m156165a(LatLng latLng, long j, String str, String str2) {
        C113971mt mtVar = this.f339824i.get(C113983nd.class);
        if (mtVar != null) {
            return mtVar.mo172484a(latLng, j, str, str2);
        }
        return new Pair<>((Object) null, (Object) null);
    }
}
