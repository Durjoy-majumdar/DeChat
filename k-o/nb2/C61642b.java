package nb2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import gy3.C87412m;
import hb2.C59811e;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: nb2.b */
public final class C61642b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61639a f175290d;

    /* renamed from: e */
    public final /* synthetic */ int f175291e;

    /* renamed from: f */
    public final /* synthetic */ C59811e f175292f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f175293g;

    public C61642b(C61639a aVar, int i, C59811e eVar, C60905o oVar) {
        this.f175290d = aVar;
        this.f175291e = i;
        this.f175292f = eVar;
        this.f175293g = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMvMakerFixEditUIC.C57040a aVar = this.f175290d.f175285e;
        int i = this.f175291e;
        C59811e eVar = this.f175292f;
        View view2 = this.f175293g.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        aVar.mo80481a(i, eVar, view2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
