package ls1;

import android.view.View;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;
import com.tencent.p014mm.view.HardTouchableLayout;
import gy3.C87412m;

/* renamed from: ls1.h */
public final class C61392h implements C61395m {

    /* renamed from: a */
    public TabLayout f174602a;

    /* renamed from: b */
    public HardTouchableLayout f174603b;

    /* renamed from: c */
    public ViewPager f174604c;

    /* renamed from: a */
    public FinderTabLayout mo86334a() {
        return null;
    }

    /* renamed from: b */
    public void mo86335b(Window window) {
        C87412m.m108594g(window, "window");
        this.f174602a = (TabLayout) window.findViewById(C0966R.C0970id.kci);
        this.f174604c = (ViewPager) window.findViewById(C0966R.C0970id.l89);
        this.f174603b = (HardTouchableLayout) window.findViewById(C0966R.C0970id.kcj);
    }

    /* renamed from: c */
    public ViewPager mo86336c() {
        return this.f174604c;
    }

    /* renamed from: d */
    public View mo78527d() {
        return null;
    }

    /* renamed from: e */
    public TabLayout mo86337e() {
        return this.f174602a;
    }

    /* renamed from: f */
    public HardTouchableLayout mo86338f() {
        return this.f174603b;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adl;
    }
}
