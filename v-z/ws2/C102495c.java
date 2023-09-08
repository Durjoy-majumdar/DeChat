package ws2;

import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ws2.c */
public class C102495c extends C112968x {

    /* renamed from: i */
    public List<Fragment> f301794i;

    public C102495c(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager, 0);
        new ArrayList();
        this.f301794i = list;
    }

    /* renamed from: b */
    public void mo142113b(Fragment fragment, int i) {
        SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        this.f301794i.remove(fragment);
        if (i >= this.f301794i.size()) {
            SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            this.f301794i.add(fragment);
            SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        } else {
            this.f301794i.add(i, fragment);
        }
        SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        int size = this.f301794i.size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        return size;
    }

    public Fragment getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        Fragment fragment = this.f301794i.get(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        return fragment;
    }

    public CharSequence getPageTitle(int i) {
        SnsMethodCalculate.markStartTimeMs("getPageTitle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        SnsMethodCalculate.markEndTimeMs("getPageTitle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        return "";
    }
}
