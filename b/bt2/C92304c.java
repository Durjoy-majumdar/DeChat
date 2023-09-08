package bt2;

import android.content.Context;
import android.widget.LinearLayout;
import at2.C92088a;
import at2.C92090b;
import at2.C92091c;
import at2.C92092d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;

/* renamed from: bt2.c */
public final class C92304c implements C92090b {

    /* renamed from: a */
    public final Context f264131a;

    /* renamed from: b */
    public final C92088a f264132b;

    /* renamed from: c */
    public final LinearLayout f264133c;

    /* renamed from: d */
    public final List<C92307f> f264134d;

    /* renamed from: e */
    public final List<C32226l<List<C92092d>, C13598b0>> f264135e = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e2, code lost:
        if ((r3 != null && r3.size() == r5.size()) != false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92304c(android.content.Context r23, at2.C92088a r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "iPickerData"
            gy3.C87412m.m108594g(r2, r3)
            r22.<init>()
            r0.f264131a = r1
            r0.f264132b = r2
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r1 = 0
            r3.setOrientation(r1)
            r0.f264133c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f264135e = r3
            java.lang.String r3 = "initWheels"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r2 = r24.mo126074a()
            r7 = 0
            r8 = 0
        L_0x003b:
            java.lang.String r9 = "MultiPickerWheelView"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController"
            if (r7 >= r2) goto L_0x00ae
            java.lang.String r11 = "createBindLiveData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            if (r7 != 0) goto L_0x0051
            androidx.lifecycle.z r8 = new androidx.lifecycle.z
            r8.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x006f
        L_0x0051:
            if (r8 != 0) goto L_0x0071
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "createBindLiveData error with i="
            r8.append(r12)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r8)
            androidx.lifecycle.z r8 = new androidx.lifecycle.z
            r8.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
        L_0x006f:
            r15 = r8
            goto L_0x0086
        L_0x0071:
            androidx.lifecycle.z r9 = new androidx.lifecycle.z
            r9.<init>()
            androidx.lifecycle.LiveData r8 = r8.mo126289b()
            bt2.a r12 = new bt2.a
            r12.<init>(r9)
            r8.observeForever(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            r15 = r9
        L_0x0086:
            bt2.f r8 = new bt2.f
            android.content.Context r14 = r0.f264131a
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            at2.a r9 = r0.f264132b
            boolean r9 = r9.mo126078e()
            java.lang.String r11 = "setCyclic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
            com.tencent.mm.picker.base.view.WheelView r12 = r8.f264140c
            r12.setCyclic(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            r5.add(r8)
            int r7 = r7 + 1
            goto L_0x003b
        L_0x00ae:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r0.f264134d = r5
            java.lang.String r2 = "initDefaultNode"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            at2.a r3 = r0.f264132b
            java.util.List r3 = r3.mo126077d()
            r7 = 1
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r7
            if (r3 != r7) goto L_0x00ca
            r3 = 1
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            if (r3 == 0) goto L_0x00e5
            at2.a r3 = r0.f264132b
            java.util.List r3 = r3.mo126077d()
            if (r3 == 0) goto L_0x00e1
            int r3 = r3.size()
            int r8 = r5.size()
            if (r3 != r8) goto L_0x00e1
            r3 = 1
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            if (r3 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            java.lang.String r3 = "initDefaultData"
            if (r7 == 0) goto L_0x0183
            int r5 = r5.size()
            r7 = 0
        L_0x00ef:
            if (r7 >= r5) goto L_0x01b8
            at2.a r11 = r0.f264132b
            java.util.List r11 = r11.mo126077d()
            if (r11 == 0) goto L_0x0100
            java.lang.Object r11 = r11.get(r7)
            at2.c r11 = (at2.C92091c) r11
            goto L_0x0101
        L_0x0100:
            r11 = 0
        L_0x0101:
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode"
            java.lang.String r13 = "getParentNode"
            if (r11 == 0) goto L_0x0118
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            at2.c r14 = r11.f263639c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            if (r14 == 0) goto L_0x0118
            java.util.List r14 = r14.mo126080a()
            r17 = r14
            goto L_0x011a
        L_0x0118:
            r17 = 0
        L_0x011a:
            if (r17 != 0) goto L_0x0123
            java.lang.String r3 = "get child nodes error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)
            goto L_0x01b8
        L_0x0123:
            java.util.Iterator r14 = r17.iterator()
            r15 = 0
        L_0x0128:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0146
            java.lang.Object r16 = r14.next()
            at2.c r16 = (at2.C92091c) r16
            java.lang.String r6 = r16.mo126081b()
            java.lang.String r8 = r11.mo126081b()
            boolean r6 = gy3.C87412m.m108589b(r6, r8)
            if (r6 == 0) goto L_0x0143
            goto L_0x0147
        L_0x0143:
            int r15 = r15 + 1
            goto L_0x0128
        L_0x0146:
            r15 = -1
        L_0x0147:
            if (r15 >= 0) goto L_0x014c
            r18 = 0
            goto L_0x014e
        L_0x014c:
            r18 = r15
        L_0x014e:
            java.util.List<bt2.f> r6 = r0.f264134d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r7)
            bt2.f r6 = (bt2.C92307f) r6
            bt2.f$a r8 = new bt2.f$a
            r11.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            at2.c r11 = r11.f263639c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r19 = 0
            r20 = 8
            r21 = 0
            r15 = r8
            r16 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r6.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            androidx.lifecycle.z<bt2.f$a> r6 = r6.f264139b
            r6.setValue(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
            int r7 = r7 + 1
            goto L_0x00ef
        L_0x0183:
            at2.a r6 = r0.f264132b
            at2.c r6 = r6.mo126076c()
            java.util.List r6 = r6.mo126080a()
            if (r6 != 0) goto L_0x0191
            sx3.f0 r6 = sx3.C64186f0.f181907d
        L_0x0191:
            r13 = r6
            java.lang.Object r5 = r5.get(r1)
            bt2.f r5 = (bt2.C92307f) r5
            bt2.f$a r6 = new bt2.f$a
            at2.a r7 = r0.f264132b
            at2.c r12 = r7.mo126076c()
            r14 = 0
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            androidx.lifecycle.z<bt2.f$a> r5 = r5.f264139b
            r5.setValue(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
        L_0x01b8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            at2.a r2 = r0.f264132b
            r2.mo126075b()
            java.lang.String r2 = "initUIOption"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.util.List<bt2.f> r3 = r0.f264134d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x01cd:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0257
            java.lang.Object r5 = r3.next()
            bt2.f r5 = (bt2.C92307f) r5
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r6.<init>(r1, r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            r6.weight = r8
            com.tencent.mm.picker.base.view.WheelView r8 = r5.mo126290c()
            android.content.Context r9 = r0.f264131a
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131167170(0x7f0707c2, float:1.7948606E38)
            int r9 = r9.getDimensionPixelSize(r10)
            android.content.Context r11 = r0.f264131a
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r11.getDimensionPixelSize(r10)
            r8.setPadding(r1, r9, r1, r10)
            com.tencent.mm.picker.base.view.WheelView r8 = r5.mo126290c()
            android.content.Context r9 = r0.f264131a
            r10 = 2131099682(0x7f060022, float:1.7811724E38)
            int r9 = p385u2.C111105a.m151500b(r9, r10)
            r8.mo22032e(r9)
            com.tencent.mm.picker.base.view.WheelView r8 = r5.mo126290c()
            android.content.Context r9 = r0.f264131a
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131167187(0x7f0707d3, float:1.794864E38)
            int r9 = r9.getDimensionPixelSize(r10)
            float r9 = (float) r9
            r8.setDividerHeight(r9)
            com.tencent.mm.picker.base.view.WheelView r8 = r5.mo126290c()
            android.content.Context r9 = r0.f264131a
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131167169(0x7f0707c1, float:1.7948604E38)
            int r9 = r9.getDimensionPixelSize(r10)
            r8.f49141d = r9
            r8.invalidate()
            com.tencent.mm.picker.base.view.WheelView r8 = r5.mo126290c()
            android.content.Context r9 = r0.f264131a
            r10 = 2131099654(0x7f060006, float:1.7811667E38)
            int r9 = p385u2.C111105a.m151500b(r9, r10)
            r8.setBackgroundColor(r9)
            android.widget.LinearLayout r8 = r0.f264133c
            com.tencent.mm.picker.base.view.WheelView r5 = r5.mo126290c()
            r8.addView(r5, r6)
            goto L_0x01cd
        L_0x0257:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            java.lang.String r1 = "initCallbacks"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            java.util.List<bt2.f> r2 = r0.f264134d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0267:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0280
            java.lang.Object r3 = r2.next()
            bt2.f r3 = (bt2.C92307f) r3
            androidx.lifecycle.LiveData r3 = r3.mo126289b()
            bt2.b r5 = new bt2.b
            r5.<init>(r0)
            r3.observeForever(r5)
            goto L_0x0267
        L_0x0280:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt2.C92304c.<init>(android.content.Context, at2.a):void");
    }

    /* renamed from: a */
    public List<C92092d> mo126079a() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getSelectedItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f264134d).iterator();
        while (it.hasNext()) {
            C92307f fVar = (C92307f) it.next();
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getCurrentPickItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
            C92091c value = fVar.mo126289b().getValue();
            String str2 = "";
            if (value == null || (str = value.mo126081b()) == null) {
                str = str2;
            }
            C92091c value2 = fVar.mo126289b().getValue();
            if (value2 != null) {
                SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
                String str3 = value2.f263638b;
                SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
                if (str3 != null) {
                    str2 = str3;
                }
            }
            C92092d dVar = new C92092d(str, str2);
            SnsMethodCalculate.markEndTimeMs("getCurrentPickItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
            arrayList.add(dVar);
        }
        SnsMethodCalculate.markEndTimeMs("getSelectedItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        return arrayList;
    }

    /* renamed from: b */
    public LinearLayout mo126288b() {
        SnsMethodCalculate.markStartTimeMs("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        LinearLayout linearLayout = this.f264133c;
        SnsMethodCalculate.markEndTimeMs("getContainerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        return linearLayout;
    }
}
