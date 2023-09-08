package ls1;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;
import com.tencent.p014mm.view.HardTouchableLayout;

/* renamed from: ls1.j */
public class C61393j implements C61395m {

    /* renamed from: a */
    public TabLayout f174605a;

    /* renamed from: b */
    public HardTouchableLayout f174606b;

    /* renamed from: c */
    public ViewPager f174607c;

    /* renamed from: d */
    public View f174608d;

    /* renamed from: e */
    public FinderTabLayout f174609e;

    /* renamed from: a */
    public FinderTabLayout mo86334a() {
        return this.f174609e;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86335b(android.view.Window r5) {
        /*
            r4 = this;
            java.lang.String r0 = "window"
            gy3.C87412m.m108594g(r5, r0)
            int r0 = r4.mo78528g()
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x0017
            int r0 = r4.mo78528g()
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 2131297508(0x7f0904e4, float:1.8212963E38)
            if (r0 == 0) goto L_0x0023
            android.view.View r3 = r0.findViewById(r2)
            if (r3 != 0) goto L_0x0027
        L_0x0023:
            android.view.View r3 = r5.findViewById(r2)
        L_0x0027:
            r4.f174608d = r3
            r2 = 2131314801(0x7f094871, float:1.8248037E38)
            if (r0 == 0) goto L_0x0032
            android.view.View r1 = r0.findViewById(r2)
        L_0x0032:
            if (r1 != 0) goto L_0x003e
            android.view.View r1 = r5.findViewById(r2)
            java.lang.String r2 = "window.findViewById(R.id.tabLayout)"
            gy3.C87412m.m108593f(r1, r2)
        L_0x003e:
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout
            if (r2 == 0) goto L_0x0047
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r4.f174605a = r1
            goto L_0x004f
        L_0x0047:
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout
            if (r2 == 0) goto L_0x004f
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r1 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout) r1
            r4.f174609e = r1
        L_0x004f:
            r1 = 2131316254(0x7f094e1e, float:1.8250984E38)
            if (r0 == 0) goto L_0x005c
            android.view.View r2 = r0.findViewById(r1)
            androidx.viewpager.widget.ViewPager r2 = (androidx.viewpager.widget.ViewPager) r2
            if (r2 != 0) goto L_0x0063
        L_0x005c:
            android.view.View r1 = r5.findViewById(r1)
            r2 = r1
            androidx.viewpager.widget.ViewPager r2 = (androidx.viewpager.widget.ViewPager) r2
        L_0x0063:
            r4.f174607c = r2
            r1 = 2131314802(0x7f094872, float:1.824804E38)
            if (r0 == 0) goto L_0x0072
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.view.HardTouchableLayout r0 = (com.tencent.p014mm.view.HardTouchableLayout) r0
            if (r0 != 0) goto L_0x0079
        L_0x0072:
            android.view.View r5 = r5.findViewById(r1)
            r0 = r5
            com.tencent.mm.view.HardTouchableLayout r0 = (com.tencent.p014mm.view.HardTouchableLayout) r0
        L_0x0079:
            r4.f174606b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.C61393j.mo86335b(android.view.Window):void");
    }

    /* renamed from: c */
    public ViewPager mo86336c() {
        return this.f174607c;
    }

    /* renamed from: d */
    public View mo78527d() {
        return this.f174608d;
    }

    /* renamed from: e */
    public TabLayout mo86337e() {
        return this.f174605a;
    }

    /* renamed from: f */
    public HardTouchableLayout mo86338f() {
        return this.f174606b;
    }

    /* renamed from: g */
    public int mo78528g() {
        return -1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ar_;
    }
}
