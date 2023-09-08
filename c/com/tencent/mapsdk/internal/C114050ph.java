package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C113642dw;
import com.tencent.mapsdk.internal.C113728fm;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C114056pi;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.SubPoi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ph */
public final class C114050ph implements AoiLayer {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f341243c = "AoiLayer";

    /* renamed from: a */
    public C114062pj f341244a;

    /* renamed from: b */
    public C114056pi f341245b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f341246d;

    /* renamed from: e */
    private int f341247e = 20;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f341248f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f341249g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f341250h;

    /* renamed from: i */
    private boolean f341251i = true;

    /* renamed from: j */
    private int[] f341252j;

    /* renamed from: k */
    private int[] f341253k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AoiLayer.OnAoiLayerLoadListener f341254l;

    public C114050ph(C114062pj pjVar, String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        this.f341244a = pjVar;
        this.f341246d = str;
        this.f341254l = onAoiLayerLoadListener;
        mo172635a(aoiLayerOptions);
    }

    /* renamed from: f */
    public static /* synthetic */ C114056pi m158795f(C114050ph phVar) {
        C113961mq mqVar;
        String str = f341243c;
        C113889km.m157550c(str, "请求poiDetail[" + phVar.f341246d + "]");
        C114062pj pjVar = phVar.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null) {
            return null;
        }
        NetResponse poiDetail = ((C113610cw) ((C113628dk) C113601cl.m156511a(C113628dk.class)).mo171932h()).poiDetail(phVar.f341246d, mqVar.mo171810w().f339868a);
        poiDetail.charset = "UTF-8";
        C113642dw.C113643a aVar = new C113642dw.C113643a(poiDetail, C114056pi.class);
        C113889km.m157550c(str, "poiDetail[" + phVar.f341246d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (C114056pi) aVar.f340034b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C114050ph)) {
            return false;
        }
        String str = this.f341246d;
        String str2 = ((C114050ph) obj).f341246d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final String getId() {
        return this.f341246d;
    }

    public final int hashCode() {
        String str = this.f341246d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final LatLng location() {
        C114056pi.C114060d dVar;
        C114056pi piVar = this.f341245b;
        if (piVar == null || (dVar = piVar.f341264a) == null) {
            return null;
        }
        return dVar.f341280h;
    }

    public final String name() {
        C114056pi.C114060d dVar;
        C114056pi piVar = this.f341245b;
        if (piVar == null || (dVar = piVar.f341264a) == null) {
            return null;
        }
        return dVar.f341275c;
    }

    public final boolean remove() {
        C113961mq mqVar;
        boolean z;
        C113970ms a;
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || this.f341250h || (mqVar = pjVar.f341296b) == null) {
            return false;
        }
        int[] iArr = this.f341253k;
        if (iArr != null) {
            for (int i : iArr) {
                C113554bj bjVar = mqVar.f340903k;
                if (!(bjVar == null || (a = bjVar.mo171681a(C113995no.class, i)) == null)) {
                    a.remove();
                }
            }
            this.f341253k = null;
            z = true;
        } else {
            z = false;
        }
        int[] iArr2 = this.f341252j;
        if (iArr2 != null) {
            for (int a2 : iArr2) {
                mqVar.mo172426a(a2);
            }
            this.f341252j = null;
            z = true;
        }
        this.f341245b = null;
        this.f341244a.f341295a.remove(this);
        this.f341250h = true;
        C113889km.m157550c(f341243c, "移除poiLayer[" + this.f341246d + "]");
        return z;
    }

    public final void showSubPois(boolean z) {
        C114056pi.C114060d dVar;
        List<C114056pi.C114060d> list;
        C114062pj pjVar;
        C113961mq mqVar;
        if (this.f341251i != z) {
            this.f341251i = z;
            C114056pi piVar = this.f341245b;
            if (piVar != null && (dVar = piVar.f341264a) != null && (list = dVar.f341282j) != null && (pjVar = this.f341244a) != null && (mqVar = pjVar.f341296b) != null) {
                for (C114056pi.C114060d next : list) {
                    C113733fq a = m158770a(m158791d(next.f341278f), next);
                    a.f340217a = next.f341273a;
                    if (!this.f341251i) {
                        a.f340224h = "";
                    }
                    mqVar.mo172431a(a);
                    C113995no noVar = (C113995no) mqVar.f340903k.mo171681a(C113995no.class, a.f340217a);
                    if (noVar != null) {
                        C113997nq nqVar = (C113997nq) noVar.f340956d;
                        nqVar.visible(this.f341251i);
                        noVar.mo172478a(nqVar);
                        String str = f341243c;
                        C113889km.m157550c(str, "显示/隐藏子点成功！" + next.mo172648a() + "显示状态: " + this.f341251i);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private LatLngBounds m158783b() {
        C114056pi piVar = this.f341245b;
        if (piVar != null) {
            return m158772a(piVar.f341264a);
        }
        return null;
    }

    /* renamed from: c */
    private static Point[] m158790c(List<LatLng> list) {
        if (list == null || list.isEmpty()) {
            return new Point[0];
        }
        int size = list.size();
        Point[] pointArr = new Point[size];
        for (int i = 0; i < size; i++) {
            pointArr[i] = GeoPoint.from(list.get(i)).toPoint();
        }
        return pointArr;
    }

    /* renamed from: d */
    private C114056pi.C114061e m158791d(List<C114056pi.C114061e> list) {
        C114062pj pjVar;
        C113961mq mqVar;
        C114056pi.C114061e eVar = new C114056pi.C114061e();
        if (list == null || (pjVar = this.f341244a) == null || (mqVar = pjVar.f341296b) == null) {
            return eVar;
        }
        boolean l = mqVar.mo171803l();
        for (C114056pi.C114061e next : list) {
            if ((l && next.f341285c == 1) || (!l && next.f341285c == 0)) {
                return next;
            }
        }
        return eVar;
    }

    /* renamed from: e */
    private C114056pi.C114059c m158793e(List<C114056pi.C114061e> list) {
        return m158791d(list).f341294l;
    }

    /* renamed from: b */
    private void m158785b(C114056pi piVar) {
        C114056pi.C114060d dVar;
        boolean z;
        C114056pi.C114058b bVar;
        List<List<LatLng>> list;
        if (piVar != null && (dVar = piVar.f341264a) != null) {
            C114056pi.C114059c cVar = m158791d(dVar.f341278f).f341294l;
            C114056pi.C114057a aVar = piVar.f341264a.f341281i;
            String str = f341243c;
            C113889km.m157550c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
            if (aVar == null || (bVar = aVar.f341267c) == null || !"Polygon".equalsIgnoreCase(bVar.f341268a) || (list = aVar.f341267c.f341269b) == null) {
                C113889km.m157553d(str, "PoiLayer的面渲染失败！");
                z = false;
            } else {
                m158779a(cVar, list);
                z = true;
            }
            this.f341245b = piVar;
            if (!z) {
                AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f341254l;
                if (onAoiLayerLoadListener != null) {
                    onAoiLayerLoadListener.onAoiLayerLoaded(false, this);
                    return;
                }
                return;
            }
            final List<C114056pi.C114060d> list2 = piVar.f341264a.f341282j;
            final ArrayList arrayList = new ArrayList();
            C113889km.m157550c(str, "绘制PoiLayer的子点，remotePois:".concat(String.valueOf(list2)));
            C113865kb.m157396a(new C113865kb.C113879g<Object>() {
                public final Object call() {
                    if (C114050ph.this.f341250h) {
                        return null;
                    }
                    C114050ph.m158778a(C114050ph.this, list2, new Callback<C114056pi.C114060d>() {
                        /* renamed from: a */
                        private void m158799a(C114056pi.C114060d dVar) {
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }

                        public final /* synthetic */ void callback(Object obj) {
                            C114056pi.C114060d dVar = (C114056pi.C114060d) obj;
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                    });
                    return null;
                }
            }).mo172280a(null, new C113865kb.C113868a<Object>() {
                public final void callback(Object obj) {
                    if (!C114050ph.this.f341250h) {
                        int size = list2.size();
                        int size2 = arrayList.size();
                        if (size != size2) {
                            String a = C114050ph.f341243c;
                            C113889km.m157553d(a, "PoiLayer的子点渲染缺失！！count:" + size2 + "/" + size);
                        }
                        C114050ph.m158777a(C114050ph.this, arrayList);
                        if (C114050ph.this.f341254l != null) {
                            C114050ph.this.f341254l.onAoiLayerLoaded(true, C114050ph.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172635a(AoiLayerOptions aoiLayerOptions) {
        if (aoiLayerOptions != null) {
            if (aoiLayerOptions.getMaxLevel() != -1) {
                this.f341247e = aoiLayerOptions.getMaxLevel();
            }
            if (aoiLayerOptions.getMinLevel() != -1) {
                this.f341248f = aoiLayerOptions.getMinLevel();
            }
        }
        if (!this.f341249g) {
            String str = f341243c;
            C113889km.m157550c(str, "开始更新POI[" + this.f341246d + "]的详情数据");
            this.f341249g = true;
            C113865kb.m157396a(new C113865kb.C113879g<C114056pi>() {
                /* renamed from: a */
                private C114056pi m158798a() {
                    if (C114050ph.this.f341250h) {
                        return null;
                    }
                    return C114050ph.m158795f(C114050ph.this);
                }

                public final /* synthetic */ Object call() {
                    if (C114050ph.this.f341250h) {
                        return null;
                    }
                    return C114050ph.m158795f(C114050ph.this);
                }
            }).mo172280a(null, new C113865kb.C113868a<C114056pi>() {
                /* renamed from: a */
                private void m158797a(C114056pi piVar) {
                    String a = C114050ph.f341243c;
                    C113889km.m157550c(a, "POI[" + C114050ph.this.f341246d + "]的详情数据：" + piVar);
                    if (piVar != null && !C114050ph.this.f341250h) {
                        if (C114050ph.this.f341248f < 0) {
                            C114050ph phVar = C114050ph.this;
                            int unused = phVar.f341248f = C114050ph.m158768a(phVar, piVar);
                        }
                        C114050ph.m158784b(C114050ph.this, piVar);
                    } else if (C114050ph.this.f341254l != null) {
                        C114050ph.this.f341254l.onAoiLayerLoaded(false, C114050ph.this);
                    }
                    boolean unused2 = C114050ph.this.f341249g = false;
                    String a2 = C114050ph.f341243c;
                    C113889km.m157550c(a2, "结束POI[" + C114050ph.this.f341246d + "]详情数据的更新");
                }

                public final /* synthetic */ void callback(Object obj) {
                    C114056pi piVar = (C114056pi) obj;
                    String a = C114050ph.f341243c;
                    C113889km.m157550c(a, "POI[" + C114050ph.this.f341246d + "]的详情数据：" + piVar);
                    if (piVar != null && !C114050ph.this.f341250h) {
                        if (C114050ph.this.f341248f < 0) {
                            C114050ph phVar = C114050ph.this;
                            int unused = phVar.f341248f = C114050ph.m158768a(phVar, piVar);
                        }
                        C114050ph.m158784b(C114050ph.this, piVar);
                    } else if (C114050ph.this.f341254l != null) {
                        C114050ph.this.f341254l.onAoiLayerLoaded(false, C114050ph.this);
                    }
                    boolean unused2 = C114050ph.this.f341249g = false;
                    String a2 = C114050ph.f341243c;
                    C113889km.m157550c(a2, "结束POI[" + C114050ph.this.f341246d + "]详情数据的更新");
                }
            });
        }
    }

    /* renamed from: c */
    private C114056pi m158789c() {
        C113961mq mqVar;
        String str = f341243c;
        C113889km.m157550c(str, "请求poiDetail[" + this.f341246d + "]");
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null) {
            return null;
        }
        NetResponse poiDetail = ((C113610cw) ((C113628dk) C113601cl.m156511a(C113628dk.class)).mo171932h()).poiDetail(this.f341246d, mqVar.mo171810w().f339868a);
        poiDetail.charset = "UTF-8";
        C113642dw.C113643a aVar = new C113642dw.C113643a(poiDetail, C114056pi.class);
        C113889km.m157550c(str, "poiDetail[" + this.f341246d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (C114056pi) aVar.f340034b;
        }
        return null;
    }

    /* renamed from: a */
    private int m158769a(C114056pi piVar) {
        C113961mq mqVar;
        LatLngBounds a;
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null || piVar == null || (a = m158772a(piVar.f341264a)) == null) {
            return 0;
        }
        return ((int) mqVar.f340906n.mo172023a(a.getSouthWest(), a.getNorthEast(), 0, 0, 0, 0, (LatLng) null)) - 2;
    }

    /* renamed from: a */
    private void m158779a(C114056pi.C114059c cVar, List<List<LatLng>> list) {
        C113961mq mqVar;
        C114062pj pjVar = this.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null) {
            int i = 0;
            if (this.f341252j == null) {
                this.f341252j = new int[list.size()];
                for (List<LatLng> b : list) {
                    PolygonInfo b2 = m158782b(cVar, b);
                    if (!this.f341250h) {
                        int i2 = i + 1;
                        this.f341252j[i] = mqVar.mo172417a(b2);
                        String str = f341243c;
                        C113889km.m157550c(str, "添加PoiLayer成功,ID=" + this.f341252j[i2 - 1] + "|model:" + b2);
                        i = i2;
                    }
                }
                return;
            }
            for (List<LatLng> b3 : list) {
                PolygonInfo b4 = m158782b(cVar, b3);
                int i3 = i + 1;
                b4.polygonId = this.f341252j[i];
                if (!this.f341250h) {
                    mqVar.mo172447b(b4);
                    C113889km.m157550c(f341243c, "更新PoiLayer成功");
                }
                i = i3;
            }
        }
    }

    /* renamed from: b */
    private void m158786b(List<C114056pi.C114060d> list) {
        C113961mq mqVar;
        C114062pj pjVar = this.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null) {
            for (C114056pi.C114060d next : list) {
                C113733fq a = m158770a(m158791d(next.f341278f), next);
                a.f340217a = next.f341273a;
                if (!this.f341251i) {
                    a.f340224h = "";
                }
                mqVar.mo172431a(a);
                C113995no noVar = (C113995no) mqVar.f340903k.mo171681a(C113995no.class, a.f340217a);
                if (noVar != null) {
                    C113997nq nqVar = (C113997nq) noVar.f340956d;
                    nqVar.visible(this.f341251i);
                    noVar.mo172478a(nqVar);
                    String str = f341243c;
                    C113889km.m157550c(str, "显示/隐藏子点成功！" + next.mo172648a() + "显示状态: " + this.f341251i);
                }
            }
        }
    }

    /* renamed from: a */
    private void m158780a(List<C114056pi.C114060d> list) {
        C113961mq mqVar;
        int i;
        C114062pj pjVar = this.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null) {
            int size = list.size();
            int[] iArr = new int[size];
            int i2 = 0;
            for (C114056pi.C114060d next : list) {
                C113733fq a = m158770a(m158791d(next.f341278f), next);
                int i3 = next.f341273a;
                if (i3 < 0) {
                    if (!(mqVar.f340903k == null || a.f340237u == null)) {
                        C113995no noVar = (C113995no) mqVar.f340903k.mo171680a(C113961mq.m158076b(a));
                        if (noVar != null) {
                            i = noVar.mo172479b();
                            next.f341273a = i;
                            int i4 = i2 + 1;
                            iArr[i2] = i;
                            String str = f341243c;
                            C113889km.m157550c(str, "添加子点成功！" + next.mo172648a() + "|id:" + a.f340224h);
                            i2 = i4;
                        }
                    }
                    i = -1;
                    next.f341273a = i;
                    int i44 = i2 + 1;
                    iArr[i2] = i;
                    String str2 = f341243c;
                    C113889km.m157550c(str2, "添加子点成功！" + next.mo172648a() + "|id:" + a.f340224h);
                    i2 = i44;
                } else {
                    a.f340217a = i3;
                    mqVar.mo172431a(a);
                    String str3 = f341243c;
                    C113889km.m157550c(str3, "更新子点成功！" + next.mo172648a());
                }
            }
            int[] iArr2 = new int[size];
            this.f341253k = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, size);
        }
    }

    /* renamed from: b */
    private PolygonInfo m158782b(C114056pi.C114059c cVar, List<LatLng> list) {
        C113961mq mqVar;
        Context context;
        PolygonInfo polygonInfo = new PolygonInfo();
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null || (context = mqVar.getContext()) == null) {
            return polygonInfo;
        }
        C113801hf.m157135a(context);
        polygonInfo.points = (LatLng[]) list.toArray(new LatLng[0]);
        if (cVar != null) {
            polygonInfo.borderWidth = (float) cVar.f341272c;
            polygonInfo.borderColor = Color.parseColor(cVar.f341271b);
            polygonInfo.color = Color.parseColor(cVar.f341270a);
            polygonInfo.level = 1;
            polygonInfo.minScaleLevel = this.f341248f;
            polygonInfo.maxScaleLevel = this.f341247e;
        }
        return polygonInfo;
    }

    /* renamed from: b */
    public static /* synthetic */ void m158784b(C114050ph phVar, C114056pi piVar) {
        C114056pi.C114060d dVar;
        boolean z;
        C114056pi.C114058b bVar;
        List<List<LatLng>> list;
        if (piVar != null && (dVar = piVar.f341264a) != null) {
            C114056pi.C114059c cVar = phVar.m158791d(dVar.f341278f).f341294l;
            C114056pi.C114057a aVar = piVar.f341264a.f341281i;
            String str = f341243c;
            C113889km.m157550c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
            if (aVar == null || (bVar = aVar.f341267c) == null || !"Polygon".equalsIgnoreCase(bVar.f341268a) || (list = aVar.f341267c.f341269b) == null) {
                C113889km.m157553d(str, "PoiLayer的面渲染失败！");
                z = false;
            } else {
                phVar.m158779a(cVar, list);
                z = true;
            }
            phVar.f341245b = piVar;
            if (!z) {
                AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = phVar.f341254l;
                if (onAoiLayerLoadListener != null) {
                    onAoiLayerLoadListener.onAoiLayerLoaded(false, phVar);
                    return;
                }
                return;
            }
            final List<C114056pi.C114060d> list2 = piVar.f341264a.f341282j;
            final ArrayList arrayList = new ArrayList();
            C113889km.m157550c(str, "绘制PoiLayer的子点，remotePois:".concat(String.valueOf(list2)));
            C113865kb.m157396a(new C113865kb.C113879g<Object>() {
                public final Object call() {
                    if (C114050ph.this.f341250h) {
                        return null;
                    }
                    C114050ph.m158778a(C114050ph.this, list2, new Callback<C114056pi.C114060d>() {
                        /* renamed from: a */
                        private void m158799a(C114056pi.C114060d dVar) {
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }

                        public final /* synthetic */ void callback(Object obj) {
                            C114056pi.C114060d dVar = (C114056pi.C114060d) obj;
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                    });
                    return null;
                }
            }).mo172280a(null, new C113865kb.C113868a<Object>() {
                public final void callback(Object obj) {
                    if (!C114050ph.this.f341250h) {
                        int size = list2.size();
                        int size2 = arrayList.size();
                        if (size != size2) {
                            String a = C114050ph.f341243c;
                            C113889km.m157553d(a, "PoiLayer的子点渲染缺失！！count:" + size2 + "/" + size);
                        }
                        C114050ph.m158777a(C114050ph.this, arrayList);
                        if (C114050ph.this.f341254l != null) {
                            C114050ph.this.f341254l.onAoiLayerLoaded(true, C114050ph.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static LatLngBounds m158772a(C114056pi.C114060d dVar) {
        C114056pi.C114057a aVar;
        C114056pi.C114058b bVar;
        List<List<LatLng>> list;
        if (!(dVar == null || (aVar = dVar.f341281i) == null || (bVar = aVar.f341267c) == null || (list = bVar.f341269b) == null)) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (List<LatLng> include : list) {
                builder.include(include);
            }
            try {
                return builder.build();
            } catch (Exception e) {
                C113889km.m157537a(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m158781a(List<C114056pi.C114060d> list, Callback<C114056pi.C114060d> callback) {
        C113961mq mqVar;
        Context context;
        C113961mq mqVar2;
        Context context2;
        C114062pj pjVar = this.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null && (context = mqVar.getContext()) != null && list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size() && !this.f341250h; i++) {
                C114056pi.C114060d dVar = list.get(i);
                C114056pi.C114061e d = m158791d(dVar.f341278f);
                String str = d.f341286d;
                if (!TextUtils.isEmpty(str)) {
                    new C113733fq();
                    C114062pj pjVar2 = this.f341244a;
                    if (!(pjVar2 == null || (mqVar2 = pjVar2.f341296b) == null || (context2 = mqVar2.getContext()) == null)) {
                        int a = (int) C113801hf.m157135a(context2);
                        str = a <= 1 ? str.replace("{density}", "") : a <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                    }
                }
                String str2 = f341243c;
                C113889km.m157550c(str2, "请求子点[" + dVar.mo172648a() + "]icon url:" + str);
                if (!TextUtils.isEmpty(str)) {
                    BitmapDescriptor createBitmapDescriptor = mqVar.createBitmapDescriptor(str, 8);
                    d.f341283a = createBitmapDescriptor;
                    createBitmapDescriptor.getFormater().setScale(2);
                    if (d.f341283a.getBitmap(context) != null) {
                        C113889km.m157550c(str2, "子点[" + dVar.mo172648a() + "]icon下载成功");
                        if (d.f341287e == 1) {
                            C113728fm.C113729a aVar = new C113728fm.C113729a(dVar.mo172648a(), d.f341289g, Color.parseColor(d.f341288f));
                            aVar.f340207f = mqVar.getTypeface();
                            aVar.f340206e = Color.parseColor(d.f341290h);
                            aVar.f340205d = (float) d.f341291i;
                            aVar.f340208g = C113801hf.m157135a(context) / 2.0f;
                            BitmapDescriptor createBitmapDescriptor2 = mqVar.createBitmapDescriptor((Parcelable) aVar, 9);
                            d.f341284b = createBitmapDescriptor2;
                            if (createBitmapDescriptor2.getBitmap(context) != null) {
                                C113889km.m157550c(str2, "子点[" + dVar.mo172648a() + "]文本图片创建成功");
                            } else {
                                C113889km.m157553d(str2, "子点[" + dVar.mo172648a() + "]文本图片创建失败！");
                            }
                        }
                        if (callback != null) {
                            callback.callback(dVar);
                        }
                    } else {
                        C113889km.m157553d(str2, "子点[" + dVar.mo172648a() + "]icon下载失败！");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private String m158776a(String str) {
        C113961mq mqVar;
        Context context;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        new C113733fq();
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null || (context = mqVar.getContext()) == null) {
            return str;
        }
        int a = (int) C113801hf.m157135a(context);
        if (a <= 1) {
            return str.replace("{density}", "");
        }
        if (a <= 2) {
            return str.replace("{density}", "@2x");
        }
        return str.replace("{density}", "@3x");
    }

    /* renamed from: a */
    private C113733fq m158770a(C114056pi.C114061e eVar, C114056pi.C114060d dVar) {
        C113961mq mqVar;
        Context context;
        C113733fq fqVar = new C113733fq();
        C114062pj pjVar = this.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null || (context = mqVar.getContext()) == null || eVar == null) {
            return fqVar;
        }
        int i = eVar.f341287e;
        if (i == 0) {
            fqVar.f340227k = "";
        } else if (i == 1) {
            fqVar.f340227k = dVar.mo172648a();
            BitmapDescriptor bitmapDescriptor = eVar.f341284b;
            if (bitmapDescriptor != null) {
                fqVar.f340224h = bitmapDescriptor.getFormater().getBitmapId();
                Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                if (bitmap != null) {
                    fqVar.f340225i = bitmap.getWidth();
                    fqVar.f340226j = bitmap.getHeight();
                }
            }
        }
        BitmapDescriptor bitmapDescriptor2 = eVar.f341283a;
        if (bitmapDescriptor2 == null) {
            return fqVar;
        }
        fqVar.f340218b = bitmapDescriptor2.getFormater().getBitmapId();
        Bitmap bitmap2 = bitmapDescriptor2.getBitmap(context);
        if (bitmap2 != null) {
            fqVar.f340219c = bitmap2.getWidth();
            fqVar.f340220d = bitmap2.getHeight();
        }
        fqVar.f340232p = 2;
        int i2 = eVar.f341293k;
        fqVar.f340233q = i2;
        fqVar.f340234r = ((eVar.f341292j + 1) * 10000) + i2;
        fqVar.f340237u = dVar.f341280h;
        fqVar.f340235s = this.f341248f;
        fqVar.f340236t = this.f341247e;
        fqVar.f340223g = 1.0f;
        return fqVar;
    }

    /* renamed from: a */
    private C114056pi.C114060d m158771a(long j) {
        C114056pi.C114060d dVar;
        List<C114056pi.C114060d> list;
        C114056pi piVar = this.f341245b;
        if (piVar == null || (dVar = piVar.f341264a) == null || (list = dVar.f341282j) == null) {
            return null;
        }
        for (C114056pi.C114060d next : list) {
            C113995no noVar = (C113995no) this.f341244a.f341296b.f340903k.mo171681a(C113995no.class, next.f341273a);
            if (noVar != null && ((long) noVar.mo172502a()) == j) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static SubPoi m158773a(String str, C114056pi.C114060d dVar) {
        SubPoi subPoi = new SubPoi();
        subPoi.setParentId(str);
        subPoi.setId(dVar.f341274b);
        subPoi.setName(dVar.mo172648a());
        subPoi.setPosition(dVar.f341280h);
        return subPoi;
    }

    /* renamed from: a */
    public static /* synthetic */ int m158768a(C114050ph phVar, C114056pi piVar) {
        C113961mq mqVar;
        LatLngBounds a;
        C114062pj pjVar = phVar.f341244a;
        if (pjVar == null || (mqVar = pjVar.f341296b) == null || piVar == null || (a = m158772a(piVar.f341264a)) == null) {
            return 0;
        }
        return ((int) mqVar.f340906n.mo172023a(a.getSouthWest(), a.getNorthEast(), 0, 0, 0, 0, (LatLng) null)) - 2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m158777a(C114050ph phVar, List list) {
        C113961mq mqVar;
        int i;
        C114062pj pjVar = phVar.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null) {
            int size = list.size();
            int[] iArr = new int[size];
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C114056pi.C114060d dVar = (C114056pi.C114060d) it.next();
                C113733fq a = phVar.m158770a(phVar.m158791d(dVar.f341278f), dVar);
                int i3 = dVar.f341273a;
                if (i3 < 0) {
                    if (!(mqVar.f340903k == null || a.f340237u == null)) {
                        C113995no noVar = (C113995no) mqVar.f340903k.mo171680a(C113961mq.m158076b(a));
                        if (noVar != null) {
                            i = noVar.mo172479b();
                            dVar.f341273a = i;
                            int i4 = i2 + 1;
                            iArr[i2] = i;
                            String str = f341243c;
                            C113889km.m157550c(str, "添加子点成功！" + dVar.mo172648a() + "|id:" + a.f340224h);
                            i2 = i4;
                        }
                    }
                    i = -1;
                    dVar.f341273a = i;
                    int i44 = i2 + 1;
                    iArr[i2] = i;
                    String str2 = f341243c;
                    C113889km.m157550c(str2, "添加子点成功！" + dVar.mo172648a() + "|id:" + a.f340224h);
                    i2 = i44;
                } else {
                    a.f340217a = i3;
                    mqVar.mo172431a(a);
                    String str3 = f341243c;
                    C113889km.m157550c(str3, "更新子点成功！" + dVar.mo172648a());
                }
            }
            int[] iArr2 = new int[size];
            phVar.f341253k = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, size);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m158778a(C114050ph phVar, List list, Callback callback) {
        C113961mq mqVar;
        Context context;
        C113961mq mqVar2;
        Context context2;
        C114062pj pjVar = phVar.f341244a;
        if (pjVar != null && (mqVar = pjVar.f341296b) != null && (context = mqVar.getContext()) != null && list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size() && !phVar.f341250h; i++) {
                C114056pi.C114060d dVar = (C114056pi.C114060d) list.get(i);
                C114056pi.C114061e d = phVar.m158791d(dVar.f341278f);
                String str = d.f341286d;
                if (!TextUtils.isEmpty(str)) {
                    new C113733fq();
                    C114062pj pjVar2 = phVar.f341244a;
                    if (!(pjVar2 == null || (mqVar2 = pjVar2.f341296b) == null || (context2 = mqVar2.getContext()) == null)) {
                        int a = (int) C113801hf.m157135a(context2);
                        str = a <= 1 ? str.replace("{density}", "") : a <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                    }
                }
                String str2 = f341243c;
                C113889km.m157550c(str2, "请求子点[" + dVar.mo172648a() + "]icon url:" + str);
                if (!TextUtils.isEmpty(str)) {
                    BitmapDescriptor createBitmapDescriptor = mqVar.createBitmapDescriptor(str, 8);
                    d.f341283a = createBitmapDescriptor;
                    createBitmapDescriptor.getFormater().setScale(2);
                    if (d.f341283a.getBitmap(context) != null) {
                        C113889km.m157550c(str2, "子点[" + dVar.mo172648a() + "]icon下载成功");
                        if (d.f341287e == 1) {
                            C113728fm.C113729a aVar = new C113728fm.C113729a(dVar.mo172648a(), d.f341289g, Color.parseColor(d.f341288f));
                            aVar.f340207f = mqVar.getTypeface();
                            aVar.f340206e = Color.parseColor(d.f341290h);
                            aVar.f340205d = (float) d.f341291i;
                            aVar.f340208g = C113801hf.m157135a(context) / 2.0f;
                            BitmapDescriptor createBitmapDescriptor2 = mqVar.createBitmapDescriptor((Parcelable) aVar, 9);
                            d.f341284b = createBitmapDescriptor2;
                            if (createBitmapDescriptor2.getBitmap(context) != null) {
                                C113889km.m157550c(str2, "子点[" + dVar.mo172648a() + "]文本图片创建成功");
                            } else {
                                C113889km.m157553d(str2, "子点[" + dVar.mo172648a() + "]文本图片创建失败！");
                            }
                        }
                        callback.callback(dVar);
                    } else {
                        C113889km.m157553d(str2, "子点[" + dVar.mo172648a() + "]icon下载失败！");
                    }
                }
            }
        }
    }
}
