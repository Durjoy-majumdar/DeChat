package fg2;

import android.view.View;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.plugin.radar.p091ui.RadarSpecialGridView;
import com.tencent.p014mm.plugin.radar.p091ui.RadarViewController;
import te3.C64496km3;

/* renamed from: fg2.a0 */
public final class C75746a0 implements RadarSpecialGridView.C5030a {

    /* renamed from: a */
    public final /* synthetic */ RadarViewController f222342a;

    /* renamed from: fg2.a0$a */
    public static final class C75747a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RadarViewController f222343d;

        /* renamed from: e */
        public final /* synthetic */ View f222344e;

        /* renamed from: f */
        public final /* synthetic */ C64496km3 f222345f;

        /* renamed from: g */
        public final /* synthetic */ RadarAddContact.C70378d f222346g;

        public C75747a(RadarViewController radarViewController, View view, C64496km3 km32, RadarAddContact.C70378d dVar) {
            this.f222343d = radarViewController;
            this.f222344e = view;
            this.f222345f = km32;
            this.f222346g = dVar;
        }

        public final void run() {
            this.f222343d.getMemberDetailView().mo96922d(this.f222344e, this.f222345f, this.f222346g);
            this.f222343d.getWaveView().mo96976b();
        }
    }

    public C75746a0(RadarViewController radarViewController) {
        this.f222342a = radarViewController;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0175, code lost:
        if ((r0 == null || z04.C112551y.m153811k(r0)) != false) goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5988a(int r10, android.view.View r11) {
        /*
            r9 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r1 = r0.f203357q
            java.lang.String r2 = "adapter"
            r3 = 0
            if (r1 == 0) goto L_0x01db
            te3.km3[] r1 = r1.f203369e
            r10 = r1[r10]
            if (r10 != 0) goto L_0x0016
            return
        L_0x0016:
            eg2.h$d r0 = r0.getRadarStatus()
            int r0 = r0.ordinal()
            java.lang.String r1 = ""
            java.lang.String r4 = "radarManager"
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x014d
            if (r0 == r6) goto L_0x014d
            r11 = 3
            if (r0 == r11) goto L_0x0042
            int r10 = com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.f203346w
            java.lang.Object[] r10 = new java.lang.Object[r6]
            com.tencent.mm.plugin.radar.ui.RadarViewController r11 = r9.f222342a
            eg2.h$d r11 = r11.getRadarStatus()
            r10[r5] = r11
            java.lang.String r11 = "MicroMsg.Radar.RadarViewController"
            java.lang.String r0 = "unknow status for grid view %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r0, r10)
            goto L_0x01da
        L_0x0042:
            java.lang.String r11 = r10.f183957d
            if (r11 == 0) goto L_0x004f
            boolean r11 = z04.C112551y.m153811k(r11)
            if (r11 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r11 = 0
            goto L_0x0050
        L_0x004f:
            r11 = 1
        L_0x0050:
            if (r11 == 0) goto L_0x0064
            java.lang.String r11 = r10.f183961h
            if (r11 == 0) goto L_0x005f
            boolean r11 = z04.C112551y.m153811k(r11)
            if (r11 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r11 = 0
            goto L_0x0060
        L_0x005f:
            r11 = 1
        L_0x0060:
            if (r11 == 0) goto L_0x0064
            r11 = 1
            goto L_0x0065
        L_0x0064:
            r11 = 0
        L_0x0065:
            if (r11 != 0) goto L_0x012c
            com.tencent.mm.plugin.radar.ui.RadarViewController r11 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r11 = r11.f203357q
            if (r11 == 0) goto L_0x0128
            java.lang.String r0 = r10.f183957d
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = r10.f183961h
            if (r0 != 0) goto L_0x0076
            r0 = r1
        L_0x0076:
            com.tencent.mm.plugin.radar.ui.RadarViewController r7 = r11.f203375k
            eg2.h r7 = r7.f203355o
            if (r7 == 0) goto L_0x0124
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f222150o
            boolean r7 = r7.containsKey(r0)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
            if (r7 == 0) goto L_0x009f
            com.tencent.mm.plugin.radar.ui.RadarViewController r7 = r11.f203375k
            eg2.h r7 = r7.f203355o
            if (r7 == 0) goto L_0x009b
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f222150o
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r0 = r7.get(r0)
            gy3.C87412m.m108592e(r0, r8)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x009f
        L_0x009b:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x009f:
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r11.f203370f
            boolean r11 = r11.containsKey(r0)
            if (r11 == 0) goto L_0x00a9
            r11 = 1
            goto L_0x00aa
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            if (r11 != 0) goto L_0x00bb
            com.tencent.mm.plugin.radar.ui.RadarViewController r11 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r11 = r11.f203357q
            if (r11 == 0) goto L_0x00b7
            r11.mo96971b(r10)
            goto L_0x012c
        L_0x00b7:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00bb:
            com.tencent.mm.plugin.radar.ui.RadarViewController r11 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r11 = r11.f203357q
            if (r11 == 0) goto L_0x0120
            java.lang.String r0 = r10.f183957d
            if (r0 == 0) goto L_0x00ce
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r0 = 0
            goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r10.f183961h
            if (r0 == 0) goto L_0x00de
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r0 = 0
            goto L_0x00df
        L_0x00de:
            r0 = 1
        L_0x00df:
            if (r0 == 0) goto L_0x00e2
            r5 = 1
        L_0x00e2:
            if (r5 == 0) goto L_0x00e5
            goto L_0x012c
        L_0x00e5:
            java.lang.String r0 = r10.f183957d
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = r10.f183961h
            if (r0 != 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r1 = r0
        L_0x00ef:
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r11.f203375k
            eg2.h r0 = r0.f203355o
            if (r0 == 0) goto L_0x011c
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f222150o
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0116
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r11.f203375k
            eg2.h r0 = r0.f203355o
            if (r0 == 0) goto L_0x0112
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f222150o
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            gy3.C87412m.m108592e(r0, r8)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0116
        L_0x0112:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0116:
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r11.f203370f
            r11.remove(r1)
            goto L_0x012c
        L_0x011c:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0120:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0124:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0128:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x012c:
            com.tencent.mm.plugin.radar.ui.RadarViewController r11 = r9.f222342a
            eg2.h r11 = r11.f203355o
            if (r11 == 0) goto L_0x0149
            r11.mo105967e(r10)
            com.tencent.mm.plugin.radar.ui.RadarViewController r10 = r9.f222342a
            r10.getClass()
            com.tencent.mm.plugin.radar.ui.RadarViewController r10 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r10 = r10.f203357q
            if (r10 == 0) goto L_0x0145
            r10.mo106065a()
            goto L_0x01da
        L_0x0145:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0149:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x014d:
            java.lang.String r0 = r10.f183957d
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = r10.f183961h
            if (r0 != 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r1 = r0
        L_0x0157:
            java.lang.String r0 = r10.f183957d
            if (r0 == 0) goto L_0x0164
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r0 = 0
            goto L_0x0165
        L_0x0164:
            r0 = 1
        L_0x0165:
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r10.f183961h
            if (r0 == 0) goto L_0x0174
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r0 = 0
            goto L_0x0175
        L_0x0174:
            r0 = 1
        L_0x0175:
            if (r0 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r6 = 0
        L_0x0179:
            if (r6 != 0) goto L_0x01da
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r0 = r0.f203357q
            if (r0 == 0) goto L_0x01d6
            java.util.HashMap<java.lang.String, android.view.View> r0 = r0.f203374j
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            com.tencent.mm.plugin.radar.ui.RadarViewController r1 = r9.f222342a
            eg2.h r1 = r1.f203355o
            if (r1 == 0) goto L_0x01d2
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r1 = r1.mo105963a(r10, r5)
            if (r0 == 0) goto L_0x01bf
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r2 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.Stranger
            if (r1 == r2) goto L_0x01bf
            java.lang.Object r0 = r0.getTag()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder"
            gy3.C87412m.m108592e(r0, r2)
            com.tencent.mm.plugin.radar.ui.RadarViewController$b$a r0 = (com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.C70392b.C70393a) r0
            com.tencent.mm.plugin.radar.ui.RadarStateView r0 = r0.f203378c
            r0.mo66963b()
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            r0.<init>()
            fg2.a0$a r2 = new fg2.a0$a
            com.tencent.mm.plugin.radar.ui.RadarViewController r3 = r9.f222342a
            r2.<init>(r3, r11, r10, r1)
            int r10 = com.tencent.p014mm.plugin.radar.p091ui.RadarStateView.f115873j
            r10 = 300(0x12c, float:4.2E-43)
            long r10 = (long) r10
            r0.postDelayed(r2, r10)
            goto L_0x01da
        L_0x01bf:
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarMemberView r0 = r0.getMemberDetailView()
            r0.mo96922d(r11, r10, r1)
            com.tencent.mm.plugin.radar.ui.RadarViewController r10 = r9.f222342a
            com.tencent.mm.plugin.radar.ui.RadarWaveView r10 = r10.getWaveView()
            r10.mo96976b()
            goto L_0x01da
        L_0x01d2:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x01d6:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x01da:
            return
        L_0x01db:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fg2.C75746a0.mo5988a(int, android.view.View):void");
    }
}
