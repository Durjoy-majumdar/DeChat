package com.tencent.tencentmap.mapsdk.maps.internal;

import android.content.Context;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113512af;
import com.tencent.mapsdk.internal.C113518am;
import com.tencent.mapsdk.internal.C113540bh;
import com.tencent.mapsdk.internal.C113572bv;
import com.tencent.mapsdk.internal.C113709et;
import com.tencent.mapsdk.internal.C113741fw;
import com.tencent.mapsdk.internal.C113831iz;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C113994nn;
import com.tencent.mapsdk.internal.C114005ny;
import com.tencent.mapsdk.internal.C114181rs;
import com.tencent.mapsdk.internal.C114211sn;
import com.tencent.mapsdk.internal.C114322sx;
import com.tencent.mapsdk.internal.C114358tj;
import com.tencent.mapsdk.internal.C114373y;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import java.util.ArrayList;
import java.util.List;

public final class TencentMapPro {
    private C114322sx mVectorMapDelegate;
    private boolean mapDestroyed = false;
    private C113540bh mapManager;
    private C113512af viewControl;

    public TencentMapPro(C113540bh bhVar, C113512af afVar) {
        this.mapManager = bhVar;
        this.viewControl = afVar;
        this.mVectorMapDelegate = bhVar.f339763b;
    }

    public static final boolean isLocal(Context context, LatLng latLng) {
        C113865kb.m157398a(C113865kb.m157397a());
        C114181rs.m159508a().mo172821a(context);
        C114181rs.m159508a();
        C113741fw[] c = C114181rs.m159515c(C114181rs.f341835a);
        C113741fw b = C114373y.m160626b(GeoPoint.from(latLng));
        if (b == null || c == null) {
            return true;
        }
        boolean a = C114181rs.m159509a(b, c);
        if (a) {
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.tencent.mapsdk.internal.dr} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private static java.lang.Boolean m164008a() {
                    /*
                        java.lang.Class<com.tencent.mapsdk.internal.dr> r0 = com.tencent.mapsdk.internal.C113635dr.class
                        com.tencent.mapsdk.internal.cj r1 = com.tencent.mapsdk.internal.C113601cl.m156511a(r0)     // Catch:{ Exception -> 0x003c }
                        com.tencent.mapsdk.internal.dr r1 = (com.tencent.mapsdk.internal.C113635dr) r1     // Catch:{ Exception -> 0x003c }
                        if (r1 != 0) goto L_0x0014
                        r1 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003c }
                        java.lang.Object r0 = com.tencent.mapsdk.internal.C113800hd.m157128a(r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x003c }
                        r1 = r0
                        com.tencent.mapsdk.internal.dr r1 = (com.tencent.mapsdk.internal.C113635dr) r1     // Catch:{ Exception -> 0x003c }
                    L_0x0014:
                        com.tencent.mapsdk.internal.cj$a r0 = r1.mo171932h()     // Catch:{ Exception -> 0x003c }
                        com.tencent.mapsdk.internal.dd r0 = (com.tencent.mapsdk.internal.C113618dd) r0     // Catch:{ Exception -> 0x003c }
                        r1 = 1
                        com.tencent.map.tools.net.NetResponse r0 = r0.local(r1)     // Catch:{ Exception -> 0x003c }
                        if (r0 == 0) goto L_0x0052
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
                        java.lang.String r2 = "data with response:"
                        r1.<init>(r2)     // Catch:{ Exception -> 0x003c }
                        java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x003c }
                        byte[] r3 = r0.data     // Catch:{ Exception -> 0x003c }
                        java.lang.String r0 = r0.charset     // Catch:{ Exception -> 0x003c }
                        r2.<init>(r3, r0)     // Catch:{ Exception -> 0x003c }
                        r1.append(r2)     // Catch:{ Exception -> 0x003c }
                        java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x003c }
                        com.tencent.mapsdk.internal.C113889km.m157537a((java.lang.String) r0)     // Catch:{ Exception -> 0x003c }
                        goto L_0x0052
                    L_0x003c:
                        r0 = move-exception
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "err:"
                        r1.<init>(r2)
                        java.lang.String r0 = r0.getMessage()
                        r1.append(r0)
                        java.lang.String r0 = r1.toString()
                        com.tencent.mapsdk.internal.C113889km.m157549c(r0)
                    L_0x0052:
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro.C1163651.m164008a():java.lang.Boolean");
                }

                public final /* synthetic */ Object call() {
                    return m164008a();
                }
            }).mo172279a(Boolean.FALSE);
        }
        return a;
    }

    public final IntersectionOverlay addIntersectionEnlargeOverlay(IntersectionOverlayOptions intersectionOverlayOptions) {
        C114322sx sxVar;
        C113961mq mqVar;
        if (this.mapDestroyed || (sxVar = this.mVectorMapDelegate) == null || (mqVar = sxVar.f342647aD) == null || mqVar.f340899g == null) {
            return null;
        }
        return (IntersectionOverlay) mqVar.f340903k.mo171680a(new C113994nn(intersectionOverlayOptions));
    }

    public final void addRouteNameSegments(List<MapRouteSectionWithName> list, List<LatLng> list2) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (MapRouteSectionWithName next : list) {
                if (next != null) {
                    MapRouteSection mapRouteSection = new MapRouteSection();
                    mapRouteSection.color = next.color;
                    mapRouteSection.endNum = next.endNum;
                    mapRouteSection.roadName = next.roadName;
                    mapRouteSection.startNum = next.startNum;
                    arrayList.add(mapRouteSection);
                }
            }
            addSegmentsWithRouteName(arrayList, list2);
        }
    }

    public final void addSegmentsWithRouteName(List<MapRouteSection> list, List<LatLng> list2) {
        C113540bh bhVar;
        VectorMap vectorMap;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null && bhVar.f339763b != null && (vectorMap = (VectorMap) bhVar.f339763b.f339878e_) != null) {
            List<GeoPoint> from = GeoPoint.from(list2);
            C113961mq mqVar = vectorMap.f342909o;
            if (mqVar.f340918z == null) {
                mqVar.f340918z = new C113961mq.C113966d();
            }
            C113961mq.C113966d dVar = mqVar.f340918z;
            dVar.f340930a = list;
            dVar.f340931b = from;
            C113961mq.this.f340899g.mo172919a(list, from);
        }
    }

    public final void animateToNaviPosition(LatLng latLng, float f, float f2) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            bhVar.mo171310a(latLng, f, f2, 0.0f, true);
        }
    }

    public final void animateToNaviPosition2(LatLng latLng, float f, float f2, float f3, boolean z) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            C114211sn snVar = new C114211sn();
            snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            snVar.mo172882a(f3);
            snVar.mo172887c(f);
            snVar.mo172888d(f2);
            snVar.f341970a = bhVar.f339771j;
            snVar.f342000g = true;
            snVar.mo172884a(1000);
            ((VectorMap) bhVar.f339763b.f339878e_).mo173497w();
            ((VectorMap) bhVar.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    public final float calNaviLevel(LatLngBounds latLngBounds, float f, int i, boolean z) {
        C113540bh bhVar;
        if (this.mapDestroyed || (bhVar = this.mapManager) == null || latLngBounds == null) {
            return 0.0f;
        }
        int i2 = z ? bhVar.f339763b.f342530M : bhVar.f339763b.f342532O;
        float f2 = !z ? 0.0f : f;
        if (i2 < 0) {
            i2 = bhVar.f339763b.f342569al / 2;
        }
        return bhVar.mo171652a(f2, 0, 0, i, bhVar.f339763b.f342570am - i2, latLngBounds.southwest, latLngBounds.northeast);
    }

    public final float calNaviLevel2(LatLng latLng, LatLng latLng2, float f, float f2, int i, boolean z) {
        C113540bh bhVar;
        if (this.mapDestroyed || (bhVar = this.mapManager) == null || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bhVar.mo171652a(!z ? 0.0f : f, 0, 0, i, 0, builder.build().southwest, builder.build().northeast);
    }

    public final float calNaviLevel3(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z) {
        C113540bh bhVar;
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        if (this.mapDestroyed || (bhVar = this.mapManager) == null || latLng3 == null || latLng4 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bhVar.mo171652a(!z ? 0.0f : f, i, i2, i3, i4, builder.build().southwest, builder.build().northeast);
    }

    public final CameraPosition calculateZoomToSpanLevelAsync(List<IOverlay> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback) {
        TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback2 = asyncOperateCallback;
        if (this.mapDestroyed || this.mapManager == null) {
            if (asyncOperateCallback2 != null) {
                asyncOperateCallback2.onOperateFinished(null);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (IOverlay next : list) {
                if (next instanceof C113709et) {
                    arrayList.add((C113709et) next);
                }
            }
        }
        return this.mapManager.mo171284a((List<C113709et>) arrayList, list2, i, i2, i3, i4, asyncOperateCallback);
    }

    public final void clearRouteNameSegments() {
        C113540bh bhVar;
        VectorMap vectorMap;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null && bhVar.f339763b != null && (vectorMap = (VectorMap) bhVar.f339763b.f339878e_) != null) {
            vectorMap.clearRouteNameSegments();
        }
    }

    public final boolean isNaviStateEnabled() {
        C113540bh bhVar;
        if (this.mapDestroyed || (bhVar = this.mapManager) == null) {
            return false;
        }
        return bhVar.mo171359x();
    }

    public final void moveToNavPosition(CameraUpdate cameraUpdate, LatLng latLng) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            bhVar.mo171280a(cameraUpdate);
            if (latLng != null) {
                setNavCenter((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            }
        }
    }

    public final void onDestroy() {
        this.mapDestroyed = true;
    }

    public final void setNavCenter(int i, int i2) {
        C113512af afVar = this.viewControl;
        if (afVar != null) {
            C113518am amVar = afVar.f339724a;
            C113572bv C = amVar == null ? null : amVar.mo171366C();
            if (C instanceof C114358tj) {
                ((C114358tj) C).getVectorMapDelegate().mo171578b(i, i2);
            }
        }
    }

    public final void setNaviFixingProportion(float f, float f2) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null && bhVar.f339763b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            bhVar.f339763b.mo171587c((int) (((float) bhVar.f339763b.f342569al) * f), (int) (((float) bhVar.f339763b.f342570am) * f2));
            bhVar.f339763b.f342533P = f;
            bhVar.f339763b.f342534Q = f2;
        }
    }

    public final void setNaviFixingProportion2D(float f, float f2) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null && bhVar.f339763b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            bhVar.f339763b.mo171592d((int) (((float) bhVar.f339763b.f342569al) * f), (int) (((float) bhVar.f339763b.f342570am) * f2));
            bhVar.f339763b.f342535R = f;
            bhVar.f339763b.f342536S = f2;
        }
    }

    public final void setNaviStateEnabled(boolean z) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            bhVar.mo171341h(z);
        }
    }

    public final void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null && bhVar.f339763b != null) {
            bhVar.f339763b.f342525H = onCameraChangeListener;
        }
    }

    public final void setOptionalResourcePath(String str) {
        C114322sx sxVar;
        C113961mq mqVar;
        C114005ny nyVar;
        if (!this.mapDestroyed && (sxVar = this.mVectorMapDelegate) != null && (mqVar = sxVar.f342647aD) != null && (nyVar = mqVar.f340916x) != null) {
            nyVar.mo172561a(str);
        }
    }

    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            bhVar.mo171310a(latLng, f, f2, f3, true);
        }
    }

    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3, boolean z) {
        C113540bh bhVar;
        if (!this.mapDestroyed && (bhVar = this.mapManager) != null) {
            bhVar.mo171310a(latLng, f, f2, f3, z);
        }
    }
}
