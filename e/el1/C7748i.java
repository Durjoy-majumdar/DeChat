package el1;

import android.view.View;

/* renamed from: el1.i */
public final class C7748i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26244d;

    public C7748i(C7741d dVar) {
        this.f26244d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$5"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            el1.d r10 = r9.f26244d
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            ok1.e r1 = ok1.C62042e.f176370a
            r2 = 2131828251(0x7f111e1b, float:1.9289438E38)
            r1.mo87115s0(r0, r2)
            int r3 = r0.size()
            r4 = 0
            r5 = 4
            r6 = 0
            r2 = r7
            ok1.C62042e.m72806e0(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.widget.picker.j r1 = new com.tencent.mm.ui.widget.picker.j
            androidx.appcompat.app.AppCompatActivity r2 = r10.getActivity()
            r1.<init>(r2, r0, r7)
            r10.f26236y = r1
            te3.qw0 r2 = r10.f26214A
            te3.nj3 r2 = r2.f140583g
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0057
            int r6 = r2.f138632d
            if (r6 != r4) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x005f
            if (r2 == 0) goto L_0x0064
            int r2 = r2.f138634f
            goto L_0x0065
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            int r2 = r2.f138633e
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r6 = 60
            if (r2 >= r6) goto L_0x006b
            r2 = 60
        L_0x006b:
            int r8 = r2 / 3600
            int r2 = r2 % 3600
            int r2 = r2 / r6
            r1.mo8107j(r8, r2)
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x008d
            androidx.appcompat.app.AppCompatActivity r2 = r10.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131828229(0x7f111e05, float:1.9289393E38)
            java.lang.String r2 = r2.getString(r6)
            android.widget.Button r1 = r1.f24861i
            if (r1 == 0) goto L_0x008d
            r1.setText(r2)
        L_0x008d:
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x0098
            el1.o r2 = new el1.o
            r2.<init>(r10, r0, r7)
            r1.f24869t = r2
        L_0x0098:
            androidx.appcompat.app.AppCompatActivity r0 = r10.getActivity()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131495248(0x7f0c0950, float:1.8614027E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            te3.qw0 r2 = r10.f26214A
            te3.nj3 r2 = r2.f140583g
            if (r2 == 0) goto L_0x00bc
            int r2 = r2.f138632d
            if (r2 != r4) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            if (r3 == 0) goto L_0x00cf
            android.app.Activity r2 = r10.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827199(0x7f1119ff, float:1.9287304E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x00de
        L_0x00cf:
            android.app.Activity r2 = r10.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827198(0x7f1119fe, float:1.9287302E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x00de:
            r1.setText(r2)
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x00fb
            androidx.appcompat.app.AppCompatActivity r2 = r10.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100635(0x7f0603db, float:1.7813657E38)
            int r2 = r2.getColor(r3)
            android.widget.Button r1 = r1.f24862j
            if (r1 == 0) goto L_0x00fb
            r1.setTextColor(r2)
        L_0x00fb:
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x0102
            r1.mo8105h(r4)
        L_0x0102:
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x0110
            r2 = 2131232543(0x7f08071f, float:1.8081198E38)
            android.widget.Button r1 = r1.f24861i
            if (r1 == 0) goto L_0x0110
            r1.setBackgroundResource(r2)
        L_0x0110:
            com.tencent.mm.ui.widget.picker.j r1 = r10.f26236y
            if (r1 == 0) goto L_0x0117
            r1.mo8104g(r0)
        L_0x0117:
            com.tencent.mm.ui.widget.picker.j r10 = r10.f26236y
            if (r10 == 0) goto L_0x011e
            r10.mo8109l()
        L_0x011e:
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$5"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r9, r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el1.C7748i.onClick(android.view.View):void");
    }
}
