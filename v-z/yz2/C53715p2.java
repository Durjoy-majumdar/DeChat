package yz2;

import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yz2.p2 */
public final class C53715p2 extends TabLayout.C39995g {
    public C53715p2(TabLayout tabLayout) {
        super(tabLayout);
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        Log.m105918d("MicroMsg.TextStatus.TextStatusPagerUIC", "onPageSelected() called with: position = " + i);
    }
}
