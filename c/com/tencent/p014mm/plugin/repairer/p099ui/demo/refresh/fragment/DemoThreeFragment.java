package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.view.View;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoThreeFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "a", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoThreeFragment */
public final class DemoThreeFragment extends BaseFragment {

    /* renamed from: f */
    public ViewPager f164017f;

    /* renamed from: g */
    public TabLayout f164018g;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoThreeFragment$a */
    public final class C57261a extends C112968x {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57261a(DemoThreeFragment demoThreeFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 0);
            C87412m.m108591d(fragmentManager);
        }

        public int getCount() {
            return 3;
        }

        public Fragment getItem(int i) {
            return new DemoOneFragment();
        }

        public CharSequence getPageTitle(int i) {
            return "页面" + (i + 1);
        }
    }

    /* renamed from: N */
    public void mo80802N() {
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        this.f164017f = (ViewPager) view.findViewById(C0966R.C0970id.l89);
        this.f164018g = (TabLayout) view.findViewById(C0966R.C0970id.kci);
        FragmentActivity activity = getActivity();
        C57261a aVar = new C57261a(this, activity != null ? activity.getSupportFragmentManager() : null);
        ViewPager viewPager = this.f164017f;
        if (viewPager != null) {
            viewPager.setAdapter(aVar);
        }
        TabLayout tabLayout = this.f164018g;
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.f164017f);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsn;
    }
}
