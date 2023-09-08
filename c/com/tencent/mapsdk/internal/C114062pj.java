package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mapsdk.internal.pj */
public final class C114062pj implements C113717fb, AoiLayer.OnAoiLayerLoadListener {

    /* renamed from: a */
    public final List<C114050ph> f341295a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final C113961mq f341296b;

    /* renamed from: c */
    public TencentMap.OnMapPoiClickListener f341297c;

    /* renamed from: d */
    public final Map<String, AoiLayer.OnAoiLayerLoadListener> f341298d = new HashMap();

    public C114062pj(C113961mq mqVar) {
        this.f341296b = mqVar;
    }

    /* renamed from: a */
    private C113565bo m158802a() {
        return this.f341296b;
    }

    /* renamed from: b */
    private C113961mq m158807b() {
        return this.f341296b;
    }

    /* renamed from: c */
    private void m158808c() {
        this.f341297c = null;
        this.f341295a.clear();
        this.f341298d.clear();
    }

    /* renamed from: a */
    public final void mo171693a(C113739fu fuVar) {
    }

    public final void onAoiLayerLoaded(boolean z, AoiLayer aoiLayer) {
        if (aoiLayer != null && this.f341296b != null) {
            AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f341298d.get(aoiLayer.getId());
            if (onAoiLayerLoadListener != null) {
                onAoiLayerLoadListener.onAoiLayerLoaded(z, aoiLayer);
            }
            if (z) {
                this.f341296b.f339861d.mo172160g().f340388a++;
            }
        }
    }

    /* renamed from: a */
    private AoiLayer m158803a(String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        C114050ph phVar;
        Iterator<C114050ph> it = this.f341295a.iterator();
        while (true) {
            if (!it.hasNext()) {
                phVar = null;
                break;
            }
            phVar = it.next();
            if (phVar.getId() != null && phVar.getId().equals(str)) {
                break;
            }
        }
        if (phVar == null) {
            phVar = new C114050ph(this, str, aoiLayerOptions, this);
            this.f341295a.add(phVar);
            if (onAoiLayerLoadListener != null) {
                this.f341298d.put(str, onAoiLayerLoadListener);
            }
        }
        phVar.mo172635a(aoiLayerOptions);
        return phVar;
    }

    /* renamed from: a */
    private void m158804a(C114050ph phVar) {
        this.f341295a.remove(phVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.tencent.mapsdk.internal.pi$d} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.tencentmap.mapsdk.maps.model.MapPoi] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m158806a(com.tencent.mapsdk.engine.jni.models.TappedElement r11) {
        /*
            r10 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r10.f341297c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            if (r11 == 0) goto L_0x006d
            int r0 = r11.type
            r2 = 4
            if (r0 != r2) goto L_0x006d
            long r2 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.ph> r11 = r10.f341295a
            java.util.Iterator r11 = r11.iterator()
        L_0x0015:
            boolean r0 = r11.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r11.next()
            com.tencent.mapsdk.internal.ph r0 = (com.tencent.mapsdk.internal.C114050ph) r0
            com.tencent.mapsdk.internal.pi r5 = r0.f341245b
            if (r5 == 0) goto L_0x005a
            com.tencent.mapsdk.internal.pi$d r5 = r5.f341264a
            if (r5 == 0) goto L_0x005a
            java.util.List<com.tencent.mapsdk.internal.pi$d> r5 = r5.f341282j
            if (r5 == 0) goto L_0x005a
            java.util.Iterator r5 = r5.iterator()
        L_0x0032:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005a
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.pi$d r6 = (com.tencent.mapsdk.internal.C114056pi.C114060d) r6
            com.tencent.mapsdk.internal.pj r7 = r0.f341244a
            com.tencent.mapsdk.internal.mq r7 = r7.f341296b
            com.tencent.mapsdk.internal.bj r7 = r7.f340903k
            java.lang.Class<com.tencent.mapsdk.internal.no> r8 = com.tencent.mapsdk.internal.C113995no.class
            int r9 = r6.f341273a
            com.tencent.mapsdk.internal.ms r7 = r7.mo171681a(r8, (int) r9)
            com.tencent.mapsdk.internal.no r7 = (com.tencent.mapsdk.internal.C113995no) r7
            if (r7 == 0) goto L_0x0032
            int r7 = r7.mo172502a()
            long r7 = (long) r7
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0032
            r4 = r6
        L_0x005a:
            if (r4 == 0) goto L_0x0015
            java.lang.String r11 = r0.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.C114050ph.m158773a((java.lang.String) r11, (com.tencent.mapsdk.internal.C114056pi.C114060d) r4)
        L_0x0064:
            if (r4 == 0) goto L_0x006d
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r10.f341297c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114062pj.m158806a(com.tencent.mapsdk.engine.jni.models.TappedElement):boolean");
    }

    /* renamed from: a */
    private void m158805a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f341297c = onMapPoiClickListener;
    }
}
