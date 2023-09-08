package com.tencent.p014mm.plugin.profile.p088ui.tab;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.c0 */
public final class C42705c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115645d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42705c0(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f115645d = contactWidgetTabBizInfo;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r1 = (r1 = (r1 = r1.f131712i).f144646d).f145298g;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r0 = r13.f115645d
            te3.ch r1 = r0.f115613o
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            te3.xh r1 = r1.f131712i
            if (r1 == 0) goto L_0x001c
            te3.yh r1 = r1.f144646d
            if (r1 == 0) goto L_0x001c
            java.util.LinkedList<te3.zh> r1 = r1.f145298g
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.isEmpty()
            if (r1 != r3) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0021
            goto L_0x0166
        L_0x0021:
            qo3.e0 r1 = r0.f115594M
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.mo140661h()
            if (r1 != r3) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0032
            goto L_0x0166
        L_0x0032:
            te3.ch r1 = r0.f115613o
            gy3.C87412m.m108591d(r1)
            te3.xh r1 = r1.f131712i
            te3.yh r1 = r1.f144646d
            java.lang.String r4 = "profileInfo!!.ServiceInfo.MenuInfo"
            gy3.C87412m.m108593f(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedList<te3.zh> r1 = r1.f145298g
            java.lang.String r5 = "menuInfo.button_list"
            gy3.C87412m.m108593f(r1, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r1.next()
            te3.zh r5 = (te3.C52262zh) r5
            int r6 = r5.f145949e
            r7 = 6
            r8 = 5
            r9 = 2
            if (r6 == 0) goto L_0x0070
            if (r6 == r9) goto L_0x006c
            if (r6 == r8) goto L_0x006c
            if (r6 == r7) goto L_0x006c
            goto L_0x0052
        L_0x006c:
            r4.add(r5)
            goto L_0x0052
        L_0x0070:
            java.util.LinkedList<te3.zh> r6 = r5.f145953i
            java.lang.String r10 = "button.sub_button_list"
            gy3.C87412m.m108593f(r6, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0080:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r6.next()
            r12 = r11
            te3.zh r12 = (te3.C52262zh) r12
            int r12 = r12.f145949e
            if (r12 == r9) goto L_0x0097
            if (r12 == r8) goto L_0x0097
            if (r12 == r7) goto L_0x0097
            r12 = 0
            goto L_0x0098
        L_0x0097:
            r12 = 1
        L_0x0098:
            if (r12 == 0) goto L_0x0080
            r10.add(r11)
            goto L_0x0080
        L_0x009e:
            boolean r6 = r10.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0052
            te3.zh r6 = new te3.zh
            r6.<init>()
            byte[] r5 = r5.toByteArray()
            r6.parseFrom(r5)
            java.util.LinkedList<te3.zh> r5 = r6.f145953i
            r5.clear()
            java.util.LinkedList<te3.zh> r5 = r6.f145953i
            r5.addAll(r10)
            r4.add(r6)
            goto L_0x0052
        L_0x00bf:
            qo3.e0 r1 = new qo3.e0
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r0.f115605d
            r1.<init>(r5, r2, r2)
            r0.f115594M = r1
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r1 = r0.f115605d
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 2131493917(0x7f0c041d, float:1.8611328E38)
            r6 = 0
            android.view.View r1 = r1.inflate(r5, r6, r2)
            com.tencent.mm.storage.z1 r5 = r0.f115610i
            if (r5 == 0) goto L_0x011f
            java.lang.String r5 = r5.getNickname()
            if (r5 == 0) goto L_0x011f
            r5 = 2131297973(0x7f0906b5, float:1.8213906E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r7 = r0.f115605d
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131822648(0x7f110838, float:1.9278073E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mm.storage.z1 r8 = r0.f115610i
            if (r8 == 0) goto L_0x0101
            java.lang.String r8 = r8.getNickname()
            goto L_0x0102
        L_0x0101:
            r8 = r6
        L_0x0102:
            if (r8 != 0) goto L_0x0116
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r8 = r0.f115605d
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131824325(0x7f110ec5, float:1.9281475E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "context.resources.getStr…tact_info_source_brandqa)"
            gy3.C87412m.m108593f(r8, r9)
        L_0x0116:
            r3[r2] = r8
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r7, r3)
            r5.setText(r3)
        L_0x011f:
            r3 = 2131297966(0x7f0906ae, float:1.8213892E38)
            android.view.View r3 = r1.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            of2.a r5 = new of2.a
            r5.<init>(r4)
            com.tencent.mm.plugin.profile.ui.tab.f0 r4 = new com.tencent.mm.plugin.profile.ui.tab.f0
            r4.<init>(r0)
            r5.f127099f = r4
            com.tencent.mm.plugin.profile.ui.tab.g0 r4 = new com.tencent.mm.plugin.profile.ui.tab.g0
            r4.<init>(r0)
            r5.f127098e = r4
            r3.setAdapter(r5)
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r0.f115605d
            r4.<init>(r5)
            r3.setLayoutManager(r4)
            qo3.e0 r3 = r0.f115594M
            if (r3 == 0) goto L_0x014f
            r3.mo140663j(r1)
        L_0x014f:
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.View
            if (r3 == 0) goto L_0x015a
            r6 = r1
            android.view.View r6 = (android.view.View) r6
        L_0x015a:
            if (r6 == 0) goto L_0x015f
            r6.setPadding(r2, r2, r2, r2)
        L_0x015f:
            qo3.e0 r0 = r0.f115594M
            if (r0 == 0) goto L_0x0166
            r0.mo140655A()
        L_0x0166:
            mf2.d r1 = mf2.C34555d.f92946a
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r0 = r13.f115645d
            com.tencent.mm.storage.z1 r2 = r0.f115610i
            r3 = 2
            int r4 = r0.f115612n
            long r5 = r0.f115608g
            java.lang.String r7 = r0.mo66841d()
            r1.mo59636a(r2, r3, r4, r5, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.C42705c0.invoke():java.lang.Object");
    }
}
