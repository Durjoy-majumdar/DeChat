package lg1;

import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ng1.C47254b;

/* renamed from: lg1.i */
public final class C46857i implements TabLayout.C104470c<TabLayout.C55061f> {
    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C47254b) {
            C47254b bVar = (C47254b) obj;
            bVar.mo72281b(C0966R.color.BW_100_Alpha_0_5);
            bVar.mo72280a(false);
        }
        Log.m105924i("FinderLiveViewPagerComm", "onTabUnselected: ");
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C47254b) {
            C47254b bVar = (C47254b) obj;
            bVar.mo72281b(C0966R.color.al9);
            bVar.mo72280a(true);
            Log.m105924i("FinderLiveViewPagerComm", "onTabSelected: " + bVar.f126858b);
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
        Log.m105924i("FinderLiveViewPagerComm", "onTabReselected: ");
    }
}
