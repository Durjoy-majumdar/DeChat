package gn1;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import ln1.C21448d;
import rs1.C13442s8;

/* renamed from: gn1.b */
public final class C75994b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222849d;

    public C75994b(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222849d = nearbyPersonV1UIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ListView listView = this.f222849d.f198098h;
        C87412m.m108591d(listView);
        listView.removeHeaderView(this.f222849d.f198099i);
        this.f222849d.f198099i = null;
        Intent intent = new Intent();
        intent.setClassName(this.f222849d.getActivity(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        this.f222849d.getActivity().startActivityForResult(intent, 2009);
        C2483o0.f12984a.mo2462l(2, ((C13442s8) C39818r.f106831a.mo62444c(this.f222849d.getActivity()).mo75002a(C13442s8.class)).mo12861q3());
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("NearbyPeopleBubble");
        C21448d.f60723a.mo33624b(12);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
