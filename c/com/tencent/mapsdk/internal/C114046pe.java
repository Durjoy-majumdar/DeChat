package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.view.View;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.map.lib.models.MapExploreByTouchHelper;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.pe */
public final class C114046pe extends MapExploreByTouchHelper implements C113726fk {

    /* renamed from: a */
    public List<AccessibleTouchItem> f341234a = new ArrayList();

    /* renamed from: b */
    public List<AccessibleTouchItem> f341235b = new ArrayList();

    /* renamed from: c */
    public C114322sx f341236c;

    /* renamed from: d */
    private Handler f341237d = new Handler();

    public C114046pe(View view, C114322sx sxVar) {
        super(view);
        this.f341236c = sxVar;
        ((VectorMap) sxVar.f339878e_).mo173441a((C113726fk) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2.getBounds().contains((int) r6, (int) r7) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getTargetPoiItemIdx(float r6, float r7) {
        /*
            r5 = this;
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            r1 = -1
            if (r0 == 0) goto L_0x005b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x005b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            if (r0 == 0) goto L_0x0036
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0036
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            int r0 = r0.size()
            int r0 = r0 + -1
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            boolean r3 = r2 instanceof com.tencent.mapsdk.internal.C114048pf
            if (r3 == 0) goto L_0x0036
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == r1) goto L_0x003a
            return r0
        L_0x003a:
            r0 = 0
        L_0x003b:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x005b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0058
            return r0
        L_0x0058:
            int r0 = r0 + 1
            goto L_0x003b
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114046pe.getTargetPoiItemIdx(float, float):int");
    }

    public final boolean onItemClicked(int i) {
        AccessibleTouchItem accessibleTouchItem;
        if (i >= this.accessibleTouchItems.size() || (accessibleTouchItem = this.accessibleTouchItems.get(i)) == null) {
            return false;
        }
        invalidateVirtualView(i);
        sendEventForVirtualView(i, 1);
        accessibleTouchItem.onClick();
        return true;
    }

    public final void onTalkBackActivate(View view) {
        super.onTalkBackActivate(view);
        ((VectorMap) this.f341236c.f339878e_).mo173441a((C113726fk) this);
        mo171258u();
    }

    public final void onTalkBackDeActivate(View view) {
        super.onTalkBackDeActivate(view);
        ((VectorMap) this.f341236c.f339878e_).mo173457b((C113726fk) this);
    }

    /* renamed from: u */
    public final void mo171258u() {
        this.f341237d.post(new Runnable() {
            public final void run() {
                C114046pe.this.accessibleTouchItems.clear();
                C114046pe.this.f341234a.clear();
                C114046pe.this.f341235b.clear();
                if (C114046pe.this.f341236c != null) {
                    C114322sx d = C114046pe.this.f341236c;
                    d.f342577at.clear();
                    C113741fw[] fwVarArr = {C114373y.m160626b(((VectorMap) d.f339878e_).getProjection().mo172025a(new C113732fo(0.0d, 0.0d))), C114373y.m160626b(((VectorMap) d.f339878e_).getProjection().mo172025a(new C113732fo((double) d.mo172993X(), (double) d.mo172994Y())))};
                    for (C113709et next : d.f342647aD.f340880J.f339805b) {
                        if (next instanceof C113528aw) {
                            C113520ao aoVar = ((C113528aw) next).f339728a;
                            if (C114322sx.m160175a(aoVar.getPosition(), fwVarArr)) {
                                d.f342577at.add(aoVar);
                            }
                        }
                    }
                    List<C113520ao> list = d.f342577at;
                    C114322sx d2 = C114046pe.this.f341236c;
                    d2.f342578au.clear();
                    C113961mq mqVar = ((VectorMap) d2.f339878e_).f342909o;
                    C113520ao aoVar2 = null;
                    ArrayList<MapPoi> G = mqVar == null ? null : mqVar.mo172415G();
                    d2.f342578au = G;
                    if (list != null) {
                        for (C113520ao next2 : list) {
                            String contentDescription = next2.getContentDescription();
                            if (!C40002he.m42805a(contentDescription)) {
                                if (contentDescription.startsWith(AccessibleTouchItem.MY_LOCATION_PREFIX)) {
                                    aoVar2 = next2;
                                } else {
                                    C114046pe.this.f341234a.add(new C114048pf(C114046pe.this.f341236c, next2));
                                }
                            }
                        }
                        Collections.sort(C114046pe.this.f341234a);
                        C114046pe.this.accessibleTouchItems.addAll(C114046pe.this.f341234a);
                    }
                    if (G != null) {
                        for (MapPoi next3 : G) {
                            if (!C40002he.m42805a(next3.getName())) {
                                C114046pe.this.f341235b.add(new C114049pg(C114046pe.this.f341236c, next3));
                            }
                        }
                        Collections.sort(C114046pe.this.f341235b);
                        C114046pe.this.accessibleTouchItems.addAll(C114046pe.this.f341235b);
                    }
                    if (aoVar2 != null) {
                        C114046pe.this.accessibleTouchItems.add(new C114048pf(C114046pe.this.f341236c, aoVar2));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private int m158755a(float f, float f2) {
        List<AccessibleTouchItem> list = this.accessibleTouchItems;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        int size = this.accessibleTouchItems.size() - 1;
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(size);
        if (!(accessibleTouchItem instanceof C114048pf) || !accessibleTouchItem.getBounds().contains((int) f, (int) f2)) {
            return -1;
        }
        return size;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo172633a(com.tencent.mapsdk.internal.C114030pa r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r7.getContentDescription()
            boolean r1 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r0)
            if (r1 == 0) goto L_0x000e
            return
        L_0x000e:
            com.tencent.mapsdk.internal.sx r1 = r7.f341102F
            r2 = 1
            if (r1 == 0) goto L_0x0035
            android.graphics.Rect r1 = r7.mo171382i()
            com.tencent.mapsdk.internal.sx r3 = r7.f341102F
            int r3 = r3.mo172993X()
            com.tencent.mapsdk.internal.sx r4 = r7.f341102F
            int r4 = r4.mo172994Y()
            int r5 = r1.left
            if (r5 < 0) goto L_0x0035
            int r5 = r1.top
            if (r5 < 0) goto L_0x0035
            int r5 = r1.right
            if (r5 > r3) goto L_0x0035
            int r1 = r1.bottom
            if (r1 > r4) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 != 0) goto L_0x0039
            return
        L_0x0039:
            com.tencent.mapsdk.internal.pf r1 = new com.tencent.mapsdk.internal.pf
            com.tencent.mapsdk.internal.sx r3 = r6.f341236c
            r1.<init>(r3, r7)
            r7 = 0
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r3 = r6.accessibleTouchItems
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x005d
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r3 = r6.accessibleTouchItems
            int r4 = r3.size()
            int r4 = r4 - r2
            java.lang.Object r2 = r3.get(r4)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            if (r2 == 0) goto L_0x005d
            boolean r3 = r2 instanceof com.tencent.mapsdk.internal.C114048pf
            if (r3 == 0) goto L_0x005d
            r7 = r2
        L_0x005d:
            java.lang.String r2 = "我的位置"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x006c
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.accessibleTouchItems
            r7.add(r1)
            return
        L_0x006c:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.clear()
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f341234a
            r0.add(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f341234a
            java.util.Collections.sort(r0)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f341234a
            r0.addAll(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f341235b
            r0.addAll(r1)
            if (r7 == 0) goto L_0x0090
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.add(r7)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114046pe.mo172633a(com.tencent.mapsdk.internal.pa):void");
    }

    /* renamed from: a */
    private void m158757a() {
        ((VectorMap) this.f341236c.f339878e_).mo173457b((C113726fk) this);
        this.accessibleTouchItems.clear();
        this.f341234a.clear();
        this.f341235b.clear();
    }
}
