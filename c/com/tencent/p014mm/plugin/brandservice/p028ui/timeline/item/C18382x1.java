package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import te3.C22521pi1;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.x1 */
public final class C18382x1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18386y1 f50935d;

    /* renamed from: e */
    public final /* synthetic */ C22521pi1 f50936e;

    /* renamed from: f */
    public final /* synthetic */ View f50937f;

    public C18382x1(C18386y1 y1Var, C22521pi1 pi12, View view) {
        this.f50935d = y1Var;
        this.f50936e = pi12;
        this.f50937f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r15 = (ht1.C60171g1) r15.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r15)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindBodyClick$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r14
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r15 = r14.f50935d
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<ht1.g1>> r15 = r15.f50951A
            te3.pi1 r0 = r14.f50936e
            java.lang.String r0 = r0.f64435r
            java.util.LinkedHashMap r15 = (java.util.LinkedHashMap) r15
            java.lang.Object r15 = r15.get(r0)
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15
            r0 = -1
            if (r15 == 0) goto L_0x003c
            java.lang.Object r15 = r15.get()
            ht1.g1 r15 = (ht1.C60171g1) r15
            if (r15 == 0) goto L_0x003c
            long r2 = r15.getCurrentPlayMs()
            goto L_0x003d
        L_0x003c:
            r2 = r0
        L_0x003d:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r15 = r14.f50935d
            com.tencent.mm.storage.o0 r4 = r15.f50959i
            gy3.C87412m.m108591d(r4)
            java.lang.String r5 = "PAUSE_FOR_RESUME"
            r15.mo22944l(r4, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r15 = r14.f50935d
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r4 = r15.f50954d
            com.tencent.mm.storage.o0 r15 = r15.f50959i
            te3.pi1 r5 = r14.f50936e
            int r5 = r5.f64423S
            r4.mo23141f(r15, r5)
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            te3.pi1 r15 = r14.f50936e
            android.view.View r4 = r14.f50937f
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r5 = r14.f50935d
            java.lang.String r6 = r15.f64435r
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0070
            int r6 = r6.length()
            if (r6 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r6 = 0
            goto L_0x0071
        L_0x0070:
            r6 = 1
        L_0x0071:
            r9 = 0
            if (r6 != 0) goto L_0x0081
            java.lang.String r6 = r15.f64435r
            long r12 = o40.C61926c.m72671P(r6)
            java.lang.String r6 = "feed_object_id"
            r11.putExtra(r6, r12)
            goto L_0x0082
        L_0x0081:
            r12 = r9
        L_0x0082:
            int r6 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x008d
            java.lang.String r6 = r15.f64436s
            java.lang.String r9 = "feedID"
            r11.putExtra(r9, r6)
        L_0x008d:
            java.lang.String r6 = r15.f64437t
            java.lang.String r9 = "nonceID"
            r11.putExtra(r9, r6)
            int r6 = r15.f64438u
            r9 = 9
            if (r6 != r9) goto L_0x009c
            r6 = 1
            goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            java.lang.String r9 = "key_need_related_list"
            r11.putExtra(r9, r6)
            java.lang.String r6 = r15.f64432o
            java.lang.String r9 = "from_user"
            r11.putExtra(r9, r6)
            java.lang.String r6 = r15.f64416K
            java.lang.String r9 = "key_extra_info"
            r11.putExtra(r9, r6)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00b9
            java.lang.String r0 = "KEY_VIDEO_START_PLAY_TIME_MS"
            r11.putExtra(r0, r2)
        L_0x00b9:
            int r0 = r15.f64412G
            if (r0 != r8) goto L_0x00ca
            int r0 = r15.f64438u
            r1 = 4
            if (r0 != r1) goto L_0x00ca
            int r0 = r15.f64443z
            int r1 = r15.f64442y
            if (r0 <= r1) goto L_0x00ca
            r13 = 1
            goto L_0x00cb
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bindBodyClick: isLandscapeVideo="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", alignment="
            r0.append(r1)
            int r1 = r15.f64412G
            r0.append(r1)
            java.lang.String r1 = ", finder_media_type="
            r0.append(r1)
            int r1 = r15.f64438u
            r0.append(r1)
            java.lang.String r1 = ", finder_width="
            r0.append(r1)
            int r1 = r15.f64443z
            r0.append(r1)
            java.lang.String r1 = ", finder_height="
            r0.append(r1)
            int r15 = r15.f64442y
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "MicroMsg.BizTLRecCardNativeFinder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131297898(0x7f09066a, float:1.8213754E38)
            android.view.View r12 = r4.findViewById(r15)
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            r6 = r15
            ht1.t1 r6 = (ht1.C60200t1) r6
            if (r6 == 0) goto L_0x0125
            r7 = 26
            r8 = 2
            r9 = 25
            android.content.Context r10 = r5.f50955e
            r6.mo76787NL(r7, r8, r9, r10, r11, r12, r13)
        L_0x0125:
            java.lang.String r15 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindBodyClick$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r14, r15, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18382x1.onClick(android.view.View):void");
    }
}
