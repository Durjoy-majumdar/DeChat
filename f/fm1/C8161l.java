package fm1;

import android.widget.ImageView;
import androidx.lifecycle.C0120a0;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fm1.C8139f;
import gy3.C87412m;
import p601lv.C76726b;
import te3.C64586nn1;

/* renamed from: fm1.l */
public final class C8161l<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C8139f f27036d;

    public C8161l(C8139f fVar) {
        this.f27036d = fVar;
    }

    public void onChanged(Object obj) {
        Object obj2;
        C64586nn1 nn12;
        C64586nn1 nn13;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        C8139f fVar = this.f27036d;
        TabLayout f3 = fVar.mo9206f3();
        C87412m.m108593f(f3, "tabLayout");
        TabLayout.C55061f c3 = C8139f.m8228c3(fVar, f3, 1003);
        if (c3 != null && (obj2 = c3.f154600a) != null) {
            C8139f.C8140a aVar2 = (C8139f.C8140a) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append("[registerRedDot] TAB_NEARBY_TYPE_PERSON isShow=");
            Integer num = null;
            sb.append(aVar != null ? Boolean.valueOf(aVar.f12908a) : null);
            sb.append(" show_type=");
            if (!(aVar == null || (nn13 = aVar.f12909b) == null)) {
                num = Integer.valueOf(nn13.f184502d);
            }
            sb.append(num);
            Log.m105924i("NearbyActionBarUIC", sb.toString());
            boolean z = true;
            int i = 0;
            if (aVar != null && aVar.f12908a) {
                C64586nn1 nn14 = aVar.f12909b;
                if (nn14 == null || nn14.f184502d != 101) {
                    z = false;
                }
                if (z) {
                    ImageView imageView = aVar2.f27013e;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    WeImageView weImageView = aVar2.f27012d;
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                        return;
                    }
                    return;
                }
                ImageView imageView2 = aVar2.f27013e;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                WeImageView weImageView2 = aVar2.f27012d;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(4);
                    return;
                }
                return;
            }
            if (aVar == null || (nn12 = aVar.f12909b) == null || nn12.f184502d != 101) {
                z = false;
            }
            if (z) {
                WeImageView weImageView3 = aVar2.f27012d;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(4);
                    return;
                }
                return;
            }
            ImageView imageView3 = aVar2.f27013e;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            WeImageView weImageView4 = aVar2.f27012d;
            if (weImageView4 != null) {
                if (((C76726b) C86312j.m106911c(C76726b.class)).mo106906Qx()) {
                    i = 4;
                }
                weImageView4.setVisibility(i);
            }
        }
    }
}
