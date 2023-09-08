package fm1;

import android.widget.ImageView;
import androidx.lifecycle.C0120a0;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm1.C8139f;
import gy3.C87412m;
import te3.C64586nn1;

/* renamed from: fm1.k */
public final class C8160k<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C8139f f27035d;

    public C8160k(C8139f fVar) {
        this.f27035d = fVar;
    }

    public void onChanged(Object obj) {
        Object obj2;
        C64586nn1 nn12;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        C8139f fVar = this.f27035d;
        TabLayout f3 = fVar.mo9206f3();
        C87412m.m108593f(f3, "tabLayout");
        TabLayout.C55061f c3 = C8139f.m8228c3(fVar, f3, 1001);
        if (c3 != null && (obj2 = c3.f154600a) != null) {
            C8139f.C8140a aVar2 = (C8139f.C8140a) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append("[registerRedDot] TAB_NEARBY_TYPE_LIVE isShow=");
            Integer num = null;
            sb.append(aVar != null ? Boolean.valueOf(aVar.f12908a) : null);
            sb.append(" show_type=");
            if (!(aVar == null || (nn12 = aVar.f12909b) == null)) {
                num = Integer.valueOf(nn12.f184502d);
            }
            sb.append(num);
            Log.m105924i("NearbyActionBarUIC", sb.toString());
            boolean z = true;
            if (aVar == null || !aVar.f12908a) {
                z = false;
            }
            if (z) {
                ImageView imageView = aVar2.f27013e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            ImageView imageView2 = aVar2.f27013e;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
    }
}
