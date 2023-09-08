package com.tencent.p014mm.plugin.finder.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bp3.C79758p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import er1.C58684b;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C98522w3;
import java.util.Map;
import l31.C61212e;
import o31.C11345b;
import oa1.C117731d;
import te3.m74;
import tf3.C101877q;
import up1.C37521f;
import z04.C112551y;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.x0 */
public final class C3608x0 extends C86301e implements C98522w3 {
    /* renamed from: Ai */
    public void mo3990Ai(View view, boolean z, boolean z2, String str, Map<String, Object> map) {
        Class cls = C61212e.class;
        C87412m.m108594g(str, "viewId");
        int i = z ? 8 : 0;
        if (z2) {
            i |= 32;
        }
        if (!z || view != null) {
            ((C61212e) C86312j.m106911c(cls)).o30(view, str).mo86146Mp(view, map).mo86175pO(view, i, 27051);
            return;
        }
        if (map != null) {
            map.put("view_id", str);
        }
        ((C61212e) C86312j.m106911c(cls)).mo86153W7("view_clk", view, map, 27051);
    }

    /* renamed from: CD */
    public long mo3991CD() {
        return 1663;
    }

    /* renamed from: QP */
    public void mo3992QP(Activity activity, Map<String, ? extends Object> map) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(map, "params");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86163dt(activity).mo86178qr(activity, C11345b.TrackMapUI).mo86136FZ(activity, "TrackMapUI").mo86146Mp(activity, map).mo86148No(activity, 4, 27051);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01e5  */
    /* renamed from: YH */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ht1.C98522w3.C98523c mo3993YH(androidx.fragment.app.FragmentActivity r18, int r19, te3.m74 r20, boolean r21, boolean r22, java.io.Serializable r23, boolean r24, int r25) {
        /*
            r17 = this;
            r0 = r18
            r1 = r23
            r2 = r25
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "snsLocation"
            r5 = r20
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "fromType"
            gy3.C87412m.m108594g(r1, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r6 = "key_from_type"
            r4.putExtra(r6, r1)
            java.lang.String r6 = "key_drawer_allow_no_poiid"
            r7 = r21
            r4.putExtra(r6, r7)
            byte[] r5 = r20.toByteArray()
            java.lang.String r6 = "key_location"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "key_biz_source"
            r4.putExtra(r5, r2)
            android.content.Intent r5 = r18.getIntent()
            java.lang.String r7 = "key_context_id"
            java.lang.String r5 = r5.getStringExtra(r7)
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0050
            int r9 = r5.length()
            if (r9 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r9 = 0
            goto L_0x0051
        L_0x0050:
            r9 = 1
        L_0x0051:
            r10 = 4
            if (r9 == 0) goto L_0x007d
            r5 = 8
            if (r2 == r5) goto L_0x005d
            java.lang.String r5 = "key_poi_drawer_report_stay"
            r4.putExtra(r5, r7)
        L_0x005d:
            r5 = 43
            switch(r2) {
                case 1: goto L_0x006d;
                case 2: goto L_0x006b;
                case 3: goto L_0x0062;
                case 4: goto L_0x0068;
                case 5: goto L_0x006e;
                case 6: goto L_0x0066;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r5 = 0
            goto L_0x006e
        L_0x0064:
            r5 = 1
            goto L_0x006e
        L_0x0066:
            r5 = 4
            goto L_0x006e
        L_0x0068:
            r5 = 15
            goto L_0x006e
        L_0x006b:
            r5 = 3
            goto L_0x006e
        L_0x006d:
            r5 = 2
        L_0x006e:
            di3.d r2 = di3.C86312j.m106911c(r3)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r3 = 36
            r9 = 81
            java.lang.String r2 = r2.mo76842e7(r5, r3, r9, r4)
            goto L_0x0087
        L_0x007d:
            di3.d r2 = di3.C86312j.m106911c(r3)
            ht1.t1 r2 = (ht1.C60200t1) r2
            java.lang.String r2 = r2.mo76739CG(r5, r4)
        L_0x0087:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r8] = r2
            java.lang.String r2 = "Finder.FinderPoiService"
            java.lang.String r5 = "poi contextId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r3)
            rs1.m7 r2 = new rs1.m7
            r3 = r19
            r2.<init>(r0, r3)
            r0 = r1
            ht1.w3$a r0 = (ht1.C98522w3.C8810a) r0
            int r0 = r2.f37809g
            if (r0 == r7) goto L_0x01fe
            r0 = r24
            r2.f37810h = r0
            as1.a r0 = r2.f37806d
            r1 = 2131304815(0x7f09216f, float:1.8227783E38)
            r3 = -1
            if (r0 != 0) goto L_0x018c
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            r0.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r3, r3)
            r0.setLayoutParams(r5)
            r0.setId(r1)
            r2.f37807e = r0
            er1.r3 r0 = er1.C7865r3.f26468a
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            int r0 = r0.mo8969b(r5)
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r5)
            java.lang.String r9 = r2.f37811i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "count realSize "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = " barSize "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            boolean r5 = lg3.C76695c.m92341b()
            float r0 = (float) r0
            if (r5 == 0) goto L_0x00fc
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            r9 = 1112014848(0x42480000, float:50.0)
            int r5 = zp3.C79406f.m96347a(r5, r9)
            goto L_0x010c
        L_0x00fc:
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r5)
            float r5 = (float) r5
            float r0 = r0 - r5
            androidx.fragment.app.FragmentActivity r5 = r2.f37803a
            r9 = 1092616192(0x41200000, float:10.0)
            int r5 = zp3.C79406f.m96347a(r5, r9)
        L_0x010c:
            float r5 = (float) r5
            float r0 = r0 - r5
            java.lang.String r5 = r2.f37811i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "expand height "
            r9.append(r11)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            as1.a$a r5 = new as1.a$a
            r5.<init>()
            r5.f712d = r0
            androidx.fragment.app.FragmentActivity r0 = r2.f37803a
            r9 = 1127350272(0x43320000, float:178.0)
            int r0 = zp3.C79406f.m96347a(r0, r9)
            float r0 = (float) r0
            r5.f709a = r0
            r5.f710b = r7
            r5.f711c = r7
            java.util.List<as1.a$b> r0 = r5.f718j
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            bs1.c r0 = new bs1.c
            androidx.fragment.app.FragmentActivity r12 = r2.f37803a
            r13 = 2131101833(0x7f060889, float:1.7816087E38)
            r14 = 2131099720(0x7f060048, float:1.7811801E38)
            r15 = 2131232958(0x7f0808be, float:1.808204E38)
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r5.f713e = r0
            bs1.b r0 = new bs1.b
            android.widget.FrameLayout r9 = r2.f37807e
            gy3.C87412m.m108591d(r9)
            r0.<init>(r9)
            r5.f714f = r0
            rs1.m7$a r0 = new rs1.m7$a
            androidx.fragment.app.FragmentActivity r9 = r2.f37803a
            r0.<init>(r2, r9)
            r5.f715g = r0
            rs1.m7$b r0 = new rs1.m7$b
            r0.<init>()
            java.util.Set<bs1.d> r9 = r5.f716h
            java.util.HashSet r9 = (java.util.HashSet) r9
            r9.add(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.f37803a
            int r9 = r2.f37804b
            android.view.View r0 = r0.findViewById(r9)
            java.lang.String r9 = "context.findViewById(parentId)"
            gy3.C87412m.m108593f(r0, r9)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            as1.a r0 = r5.mo235a(r0)
            r2.f37806d = r0
        L_0x018c:
            te3.m74 r0 = new te3.m74
            r0.<init>()
            byte[] r5 = r4.getByteArrayExtra(r6)
            r6 = 0
            if (r5 != 0) goto L_0x0199
            goto L_0x01ab
        L_0x0199:
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x019d }
            goto L_0x01ac
        L_0x019d:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r5
            java.lang.String r5 = "safeParser"
            java.lang.String r9 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r9, r0)
        L_0x01ab:
            r0 = r6
        L_0x01ac:
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = r0.f184224i
            goto L_0x01b2
        L_0x01b1:
            r0 = r6
        L_0x01b2:
            r2.f37817o = r0
            java.lang.String r0 = "key_drawer_mode"
            r4.putExtra(r0, r7)
            androidx.fragment.app.FragmentActivity r0 = r2.f37803a
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.c0 r0 = r0.beginTransaction()
            java.lang.String r5 = "context.supportFragmentManager.beginTransaction()"
            gy3.C87412m.m108593f(r0, r5)
            android.widget.FrameLayout r5 = r2.f37807e
            if (r5 == 0) goto L_0x01cf
            r5.removeAllViews()
        L_0x01cf:
            java.lang.String r5 = "com.tencent.mm.plugin.finder.activity.poi.ui.FinderNewPoiUI"
            com.tencent.mm.ui.vas.VASCommonFragment r4 = vn3.C118694m.m167384b(r5, r4, r8, r10, r6)
            r2.f37805c = r4
            rs1.s7 r5 = new rs1.s7
            r6 = r22
            r5.<init>(r2, r6)
            r4.f348636F = r5
            as1.a r4 = r2.f37806d
            if (r4 != 0) goto L_0x01e5
            goto L_0x01ed
        L_0x01e5:
            rs1.t7 r5 = new rs1.t7
            r5.<init>(r2)
            r4.setContentReachTop(r5)
        L_0x01ed:
            r0.mo165201m(r3, r3, r8, r8)
            com.tencent.mm.ui.vas.VASCommonFragment r3 = r2.f37805c
            gy3.C87412m.m108591d(r3)
            r0.mo165200l(r1, r3)
            r0.mo165164f()
            r2.f37809g = r7
            goto L_0x0201
        L_0x01fe:
            r2.mo12770h()
        L_0x0201:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C3608x0.mo3993YH(androidx.fragment.app.FragmentActivity, int, te3.m74, boolean, boolean, java.io.Serializable, boolean, int):ht1.w3$c");
    }

    /* renamed from: aU */
    public void mo3994aU(Context context, m74 m74, C98522w3.C8810a aVar, int i, String str, C98522w3.C8812d dVar) {
        Class cls = C58684b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(m74, FirebaseAnalytics.C113379b.LOCATION);
        C87412m.m108594g(aVar, "fromType");
        C87412m.m108594g(dVar, "callback");
        Log.m105924i("Finder.FinderPoiService", "poiRedirectRequest: poiClassifyId = " + m74.f184224i + ", Longitude = " + m74.f184219d + ", Latitude = " + m74.f184220e + ", fromType = " + aVar);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        boolean booleanValue = C37521f.f99547w4.mo60266n().booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append("isGoToNewPage = ");
        sb.append(booleanValue);
        Log.m105924i("Finder.FinderPoiService", sb.toString());
        if (booleanValue) {
            Intent intent = new Intent();
            intent.putExtra("key_location", m74.toByteArray());
            intent.putExtra("key_from_type", aVar);
            intent.putExtra("key_sns_feed_id", str);
            boolean z = false;
            intent.putExtra("key_entrance_type", 0);
            if (aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS) {
                intent.putExtra("key_finder_teen_mode_scene", 3);
            }
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(4, 11, 81, intent);
            C101877q qVar = new C101877q();
            if (C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1) {
                String str2 = m74.f184224i;
                if (str2 != null && C112551y.m153819s(str2, "foursquare_", false)) {
                    z = true;
                }
                if (!z) {
                    fVar.getClass();
                    if (C37521f.f99576z4.mo60266n().intValue() != 0) {
                        ((C58684b) C86312j.m106911c(cls)).mo13291vy(context, intent, m74, 7);
                        return;
                    }
                }
            }
            ((C58684b) C86312j.m106911c(cls)).I00(context, intent);
            return;
        }
        dVar.mo9639a(C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_DEFAULT);
    }
}
