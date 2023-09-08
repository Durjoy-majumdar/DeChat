package wm1;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C64586nn1;
import te3.C64858yi1;
import wm1.C15530g;

/* renamed from: wm1.i */
public final class C15547i<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C15530g f42137d;

    public C15547i(C15530g gVar) {
        this.f42137d = gVar;
    }

    public void onChanged(Object obj) {
        C89349b bVar;
        Integer num;
        TabLayout.C55061f fVar;
        Object obj2;
        String S;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        C55718s0 s0Var = aVar.f12910c;
        if (s0Var != null && (bVar = s0Var.field_ctrInfo.f144671f) != null) {
            C15530g gVar = this.f42137d;
            C64858yi1 yi12 = new C64858yi1();
            byte[] bArr = bVar.f257327a;
            String str = "";
            if (bArr != null) {
                try {
                    yi12.parseFrom(bArr);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", str, e);
                }
            }
            int i = yi12.f186558s;
            TabLayout f3 = gVar.mo14306f3();
            C87412m.m108593f(f3, "tabLayout");
            Integer valueOf = Integer.valueOf(i);
            C87412m.m108594g(valueOf, "any");
            int tabCount = f3.getTabCount();
            int i2 = 0;
            while (true) {
                num = null;
                if (i2 >= tabCount) {
                    fVar = null;
                    break;
                }
                fVar = f3.mo146907k(i2);
                if ((fVar != null ? fVar.f154600a : null) instanceof C15530g.C15531a) {
                    Object obj3 = fVar.f154600a;
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.tab.NearbyLiveSquareTabLayoutUIC.NearbyTab");
                    if (((C15530g.C15531a) obj3).f42116c == valueOf.intValue()) {
                        break;
                    }
                }
                i2++;
            }
            if (fVar != null && (obj2 = fVar.f154600a) != null) {
                C15530g.C15531a aVar2 = (C15530g.C15531a) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append("registerRedDot tabId:");
                sb.append(i);
                sb.append(" isShow=");
                sb.append(Boolean.valueOf(aVar.f12908a));
                sb.append(" show_type=");
                C64586nn1 nn12 = aVar.f12909b;
                if (nn12 != null) {
                    num = Integer.valueOf(nn12.f184502d);
                }
                sb.append(num);
                Log.m105924i("NearbyLiveSquareTabLayoutUIC", sb.toString());
                if (aVar.f12908a) {
                    ImageView imageView = aVar2.f42118e;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    AbsNearByFragment d3 = gVar.mo14304d3();
                    if (!(d3 == null || (S = d3.mo3551S()) == null)) {
                        str = S;
                    }
                    C2483o0.C2484a aVar3 = C2483o0.f12984a;
                    C39818r rVar = C39818r.f106831a;
                    Fragment fragment = gVar.getFragment();
                    C87412m.m108591d(fragment);
                    aVar3.mo2461k(1, ((C13442s8) rVar.mo62445d(fragment).mo75002a(C13442s8.class)).mo12861q3(), 0, str);
                    return;
                }
                ImageView imageView2 = aVar2.f42118e;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
            }
        }
    }
}
