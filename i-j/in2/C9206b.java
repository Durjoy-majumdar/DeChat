package in2;

import com.tencent.p014mm.C0966R;
import jq3.C60896i;

/* renamed from: in2.b */
public final class C9206b extends C60896i<C9205a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f7210xa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r9, jq3.C9493c r10, int r11, int r12, boolean r13, java.util.List r14) {
        /*
            r8 = this;
            in2.a r10 = (in2.C9205a) r10
            java.lang.String r11 = "holder"
            gy3.C87412m.m108594g(r9, r11)
            java.lang.String r11 = "item"
            gy3.C87412m.m108594g(r10, r11)
            android.view.View r9 = r9.f44854d
            java.lang.String r11 = "holder.itemView"
            gy3.C87412m.m108593f(r9, r11)
            r10.f28950f = r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r12 = " onBindView"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.GroupListControl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            r11 = 2131305754(0x7f09251a, float:1.8229688E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r11.removeAllViews()
            java.util.List<in2.e> r12 = r10.f28951g
            boolean r13 = r12 instanceof java.util.Collection
            r14 = 0
            if (r13 == 0) goto L_0x0048
            r13 = r12
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0048
            goto L_0x0060
        L_0x0048:
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x004e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0060
            java.lang.Object r13 = r12.next()
            in2.e r13 = (in2.C9212e) r13
            boolean r13 = r13.f28964d
            if (r13 != 0) goto L_0x004e
            r12 = 0
            goto L_0x0061
        L_0x0060:
            r12 = 1
        L_0x0061:
            if (r12 == 0) goto L_0x00c7
            r11 = 8
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r11)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/setting/ui/widget/GroupItem"
            java.lang.String r3 = "onBindView"
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r9
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = r12.mo10231a(r14)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r9.setVisibility(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/widget/GroupItem"
            java.lang.String r2 = "onBindView"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            android.view.ViewGroup$LayoutParams r12 = r10.f28954j
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 != 0) goto L_0x0170
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r14, r14)
            r10.f28954j = r11
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            r10.f28953i = r11
            android.view.ViewGroup$LayoutParams r10 = r10.f28954j
            r9.setLayoutParams(r10)
            goto L_0x0170
        L_0x00c7:
            android.view.ViewGroup$LayoutParams r12 = r10.f28953i
            r13 = 0
            if (r12 == 0) goto L_0x00d1
            r9.setLayoutParams(r12)
            r10.f28953i = r13
        L_0x00d1:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r12.mo10233c(r0)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/setting/ui/widget/GroupItem"
            java.lang.String r3 = "onBindView"
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r9
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r12 = r12.mo10231a(r14)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9.setVisibility(r12)
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/widget/GroupItem"
            java.lang.String r2 = "onBindView"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            java.util.List<in2.e> r10 = r10.f28951g
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
            r12 = 0
        L_0x011c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r10.next()
            int r1 = r12 + 1
            if (r12 < 0) goto L_0x016c
            in2.e r0 = (in2.C9212e) r0
            boolean r2 = r0.f28964d
            if (r2 != 0) goto L_0x016a
            if (r12 == 0) goto L_0x014e
            android.content.Context r12 = r9.getContext()
            java.lang.String r2 = "itemView.context"
            gy3.C87412m.m108593f(r12, r2)
            android.view.LayoutInflater r12 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r12)
            r2 = 2131497432(0x7f0c11d8, float:1.8618457E38)
            android.view.View r12 = r12.inflate(r2, r13, r14)
            java.lang.String r2 = "getInflater(context).inf…oup_divider, null, false)"
            gy3.C87412m.m108593f(r12, r2)
            r11.addView(r12)
        L_0x014e:
            android.view.View r12 = r0.mo10018b()
            android.view.ViewParent r2 = r12.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x015d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x015e
        L_0x015d:
            r2 = r13
        L_0x015e:
            if (r2 == 0) goto L_0x0163
            r2.removeView(r12)
        L_0x0163:
            android.view.View r12 = r0.mo10018b()
            r11.addView(r12)
        L_0x016a:
            r12 = r1
            goto L_0x011c
        L_0x016c:
            sx3.C64197v.m75542k()
            throw r13
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in2.C9206b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }
}
