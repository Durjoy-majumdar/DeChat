package fm1;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import fm1.C8139f;
import gy3.C87412m;

/* renamed from: fm1.g */
public final class C8156g implements TabLayout.C104470c<TabLayout.C55061f> {

    /* renamed from: a */
    public final /* synthetic */ C8139f f27029a;

    public C8156g(C8139f fVar) {
        this.f27029a = fVar;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C8139f.C8140a) {
            C8139f.C8140a aVar = (C8139f.C8140a) obj;
            TextView textView = aVar.f27011c;
            if (textView != null) {
                View view = aVar.f27009a.f154605f;
                C87412m.m108591d(view);
                textView.setTextColor(view.getContext().getResources().getColor(C0966R.color.f3288ma));
            }
            aVar.mo9207a(false);
            if (aVar.f27010b == 1003) {
                this.f27029a.mo9205e3();
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
        Object obj = fVar.f154600a;
        if (obj instanceof C8139f.C8140a) {
            C8139f.C8140a aVar = (C8139f.C8140a) obj;
            TextView textView = aVar.f27011c;
            if (textView != null) {
                View view = aVar.f27009a.f154605f;
                C87412m.m108591d(view);
                textView.setTextColor(view.getContext().getResources().getColor(C0966R.color.a7f));
            }
            aVar.mo9207a(true);
            ((NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f27029a.getActivity()).mo75002a(NearbyHomeUIC.class)).mo3545f3(aVar.f27010b);
            int i = aVar.f27010b;
            if (i != 1006) {
                switch (i) {
                    case 1001:
                        C8139f.m8229d3(this.f27029a, 1);
                        return;
                    case 1002:
                        break;
                    case 1003:
                        C8139f.m8229d3(this.f27029a, 3);
                        this.f27029a.mo9205e3();
                        return;
                    default:
                        return;
                }
            }
            C8139f.m8229d3(this.f27029a, 2);
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "t");
    }
}
