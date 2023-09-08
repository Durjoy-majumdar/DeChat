package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;

/* renamed from: com.tencent.mapsdk.internal.sv */
public final class C114320sv implements C113711ev {

    /* renamed from: a */
    private C114322sx f342496a;

    public C114320sv(C114322sx sxVar) {
        this.f342496a = sxVar;
    }

    /* renamed from: a */
    public final void mo172035a() {
    }

    /* renamed from: a */
    public final boolean mo172036a(float f) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo172037a(float f, float f2) {
        boolean z;
        TencentMapGestureListenerList tencentMapGestureListenerList;
        C114322sx sxVar = this.f342496a;
        if (sxVar != null && (z = sxVar.f342657ay) && (tencentMapGestureListenerList = sxVar.f342656ax) != null && z) {
            return tencentMapGestureListenerList.onDoubleTap(f, f2);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo172038a(PointF pointF, PointF pointF2, double d, double d2) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo172039a(PointF pointF, PointF pointF2, float f) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo172040b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo172041b(float f) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012d, code lost:
        if (r0 == false) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0147 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011b A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo172042b(float r14, float r15) {
        /*
            r13 = this;
            com.tencent.mapsdk.internal.sx r0 = r13.f342496a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r0.f342657ay
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            com.tencent.mapsdk.internal.mq r2 = r0.f342647aD
            com.tencent.mapsdk.internal.ev r0 = r0.f342571an
            com.tencent.mapsdk.internal.ev r3 = r2.f340882L
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x003a
            com.tencent.mapsdk.internal.bj r3 = r2.f340903k
            java.util.Map<java.lang.Class<? extends com.tencent.mapsdk.internal.mu>, com.tencent.mapsdk.internal.mt> r3 = r3.f339824i
            java.lang.Class<com.tencent.mapsdk.internal.nd> r6 = com.tencent.mapsdk.internal.C113983nd.class
            java.lang.Object r3 = r3.get(r6)
            com.tencent.mapsdk.internal.mt r3 = (com.tencent.mapsdk.internal.C113971mt) r3
            if (r3 == 0) goto L_0x0028
            boolean r3 = r3.mo172498i()
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r3 == 0) goto L_0x003a
            com.tencent.mapsdk.internal.sq r3 = r2.f340899g
            if (r3 == 0) goto L_0x003a
            com.tencent.mapsdk.engine.jni.JNI r6 = r3.f342023d
            long r7 = r3.f342024e
            r6.scheduleClickOnNextRender(r7, r14, r15)
            r2.f340882L = r0
            r0 = 1
            goto L_0x003d
        L_0x003a:
            r2.f340882L = r4
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r5
        L_0x0040:
            com.tencent.mapsdk.internal.sx r0 = r13.f342496a
            boolean r2 = r0.f342657ay
            if (r2 == 0) goto L_0x0130
            M r0 = r0.f339878e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.internal.mq r2 = r0.f342909o
            com.tencent.mapsdk.internal.bj r2 = r2.f340903k
            com.tencent.mapsdk.internal.be r3 = r2.f339816a
            com.tencent.mapsdk.internal.sq r3 = r3.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r3 = r3.mo172899a((float) r14, (float) r15)
            if (r3 == 0) goto L_0x0068
            int r3 = r3.type
            r6 = 3
            if (r3 != r6) goto L_0x0068
            com.tencent.mapsdk.internal.eu r2 = r2.f339823h
            if (r2 == 0) goto L_0x0066
            r2.mo172034R()
        L_0x0066:
            r2 = 1
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 != 0) goto L_0x0131
            com.tencent.mapsdk.internal.bg r2 = r0.f342912r
            if (r2 == 0) goto L_0x00b6
            com.tencent.mapsdk.internal.mq r3 = r2.f339749d
            com.tencent.mapsdk.internal.bj r3 = r3.f340903k
            com.tencent.mapsdk.internal.be r3 = r3.f339816a
            com.tencent.mapsdk.internal.sq r3 = r3.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r3 = r3.mo172899a((float) r14, (float) r15)
            if (r3 == 0) goto L_0x0086
            int r3 = r3.type
            r6 = 6
            if (r3 != r6) goto L_0x0086
            r3 = 1
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r3 == 0) goto L_0x00b7
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r6 = r2.f339750e
            if (r6 == 0) goto L_0x00b7
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            r3.<init>()
            android.location.Location r6 = r2.f339748c
            if (r6 == 0) goto L_0x00af
            double r6 = r6.getAltitude()
            r3.setAltitude(r6)
            android.location.Location r6 = r2.f339748c
            double r6 = r6.getLongitude()
            r3.setLongitude(r6)
            android.location.Location r6 = r2.f339748c
            double r6 = r6.getLatitude()
            r3.setLatitude(r6)
        L_0x00af:
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r2 = r2.f339750e
            boolean r3 = r2.onMyLocationClicked(r3)
            goto L_0x00b7
        L_0x00b6:
            r3 = 0
        L_0x00b7:
            if (r3 != 0) goto L_0x0131
            com.tencent.mapsdk.engine.jni.models.TappedElement r2 = r0.mo173434a((float) r14, (float) r15)
            if (r2 == 0) goto L_0x012c
            com.tencent.mapsdk.internal.pj r0 = r0.f342913s
            if (r0 == 0) goto L_0x012c
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r3 = r0.f341297c
            if (r3 == 0) goto L_0x012c
            int r3 = r2.type
            r6 = 4
            if (r3 != r6) goto L_0x012c
            long r2 = r2.itemId
            java.util.List<com.tencent.mapsdk.internal.ph> r6 = r0.f341295a
            java.util.Iterator r6 = r6.iterator()
        L_0x00d4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0123
            java.lang.Object r7 = r6.next()
            com.tencent.mapsdk.internal.ph r7 = (com.tencent.mapsdk.internal.C114050ph) r7
            com.tencent.mapsdk.internal.pi r8 = r7.f341245b
            if (r8 == 0) goto L_0x0118
            com.tencent.mapsdk.internal.pi$d r8 = r8.f341264a
            if (r8 == 0) goto L_0x0118
            java.util.List<com.tencent.mapsdk.internal.pi$d> r8 = r8.f341282j
            if (r8 == 0) goto L_0x0118
            java.util.Iterator r8 = r8.iterator()
        L_0x00f0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0118
            java.lang.Object r9 = r8.next()
            com.tencent.mapsdk.internal.pi$d r9 = (com.tencent.mapsdk.internal.C114056pi.C114060d) r9
            com.tencent.mapsdk.internal.pj r10 = r7.f341244a
            com.tencent.mapsdk.internal.mq r10 = r10.f341296b
            com.tencent.mapsdk.internal.bj r10 = r10.f340903k
            java.lang.Class<com.tencent.mapsdk.internal.no> r11 = com.tencent.mapsdk.internal.C113995no.class
            int r12 = r9.f341273a
            com.tencent.mapsdk.internal.ms r10 = r10.mo171681a(r11, (int) r12)
            com.tencent.mapsdk.internal.no r10 = (com.tencent.mapsdk.internal.C113995no) r10
            if (r10 == 0) goto L_0x00f0
            int r10 = r10.mo172502a()
            long r10 = (long) r10
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x00f0
            goto L_0x0119
        L_0x0118:
            r9 = r4
        L_0x0119:
            if (r9 == 0) goto L_0x00d4
            java.lang.String r2 = r7.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.C114050ph.m158773a((java.lang.String) r2, (com.tencent.mapsdk.internal.C114056pi.C114060d) r9)
        L_0x0123:
            if (r4 == 0) goto L_0x012c
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r0.f341297c
            r0.onClicked(r4)
            r0 = 1
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            if (r0 == 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r5 = 0
        L_0x0131:
            if (r5 != 0) goto L_0x0138
            com.tencent.mapsdk.internal.sx r0 = r13.f342496a
            r0.mo171584b((float) r14, (float) r15)
        L_0x0138:
            com.tencent.mapsdk.internal.sx r0 = r13.f342496a
            com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList r2 = r0.f342656ax
            if (r2 == 0) goto L_0x0147
            boolean r0 = r0.f342657ay
            if (r0 == 0) goto L_0x0147
            boolean r14 = r2.onSingleTap(r14, r15)
            return r14
        L_0x0147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114320sv.mo172042b(float, float):boolean");
    }

    /* renamed from: c */
    public final boolean mo172043c() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo172044c(float f, float f2) {
        TencentMapGestureListenerList tencentMapGestureListenerList;
        C114322sx sxVar = this.f342496a;
        if (sxVar == null || !sxVar.f342657ay || (tencentMapGestureListenerList = sxVar.f342656ax) == null) {
            return false;
        }
        return tencentMapGestureListenerList.onFling(f, f2);
    }

    /* renamed from: d */
    public final boolean mo172045d() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo172046d(float f, float f2) {
        TencentMapGestureListenerList tencentMapGestureListenerList;
        C114322sx sxVar = this.f342496a;
        if (sxVar == null || !sxVar.f342657ay || (tencentMapGestureListenerList = sxVar.f342656ax) == null) {
            return false;
        }
        return tencentMapGestureListenerList.onScroll(f, f2);
    }

    /* renamed from: e */
    public final boolean mo172047e(float f, float f2) {
        String d;
        C114322sx sxVar = this.f342496a;
        if (sxVar == null || !sxVar.f342657ay) {
            return false;
        }
        if (sxVar.f342593t != null && (d = sxVar.mo171591d(f, f2)) != null && d.trim().length() != 0) {
            sxVar.f342593t.mo171631a(d);
        } else if (sxVar.f342595v != null && sxVar.f342657ay) {
            sxVar.f342595v.onMapLongClick(C113883ke.m157466a(((VectorMap) sxVar.f339878e_).getProjection().mo172025a(new C113732fo((double) f, (double) f2))));
        }
        TencentMapGestureListenerList tencentMapGestureListenerList = this.f342496a.f342656ax;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onLongPress(f, f2);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo172048f(float f, float f2) {
        return false;
    }

    /* renamed from: g */
    public final boolean mo172049g(float f, float f2) {
        return false;
    }

    /* renamed from: h */
    public final boolean mo172050h(float f, float f2) {
        return false;
    }

    /* renamed from: i */
    public final boolean mo172051i(float f, float f2) {
        C114322sx sxVar = this.f342496a;
        if (sxVar == null || !sxVar.f342657ay) {
            return false;
        }
        sxVar.f342646aC++;
        TencentMapGestureListenerList tencentMapGestureListenerList = sxVar.f342656ax;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onDown(f, f2);
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo172052j(float f, float f2) {
        int i;
        C114322sx sxVar = this.f342496a;
        if (sxVar == null || !sxVar.f342657ay) {
            return false;
        }
        int i2 = sxVar.f342646aC;
        if (i2 > 0) {
            i = i2 - 1;
            sxVar.f342646aC = i;
        } else {
            i = 0;
        }
        sxVar.f342646aC = i;
        if (sxVar.f342645aB && this.f342496a.f342644aA) {
            C114322sx sxVar2 = this.f342496a;
            if (sxVar2.f342646aC == 0) {
                CameraPosition a = sxVar2.mo171551a();
                if (a == null) {
                    return false;
                }
                this.f342496a.f342645aB = false;
                this.f342496a.onCameraChangeFinished(a);
            }
        }
        TencentMapGestureListenerList tencentMapGestureListenerList = this.f342496a.f342656ax;
        if (tencentMapGestureListenerList != null) {
            return tencentMapGestureListenerList.onUp(f, f2);
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo172053k(float f, float f2) {
        return false;
    }
}
