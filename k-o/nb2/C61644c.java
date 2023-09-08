package nb2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import gy3.C87412m;
import hb2.C59811e;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: nb2.c */
public final class C61644c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61639a f175294d;

    /* renamed from: e */
    public final /* synthetic */ int f175295e;

    /* renamed from: f */
    public final /* synthetic */ C59811e f175296f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f175297g;

    public C61644c(C61639a aVar, int i, C59811e eVar, C60905o oVar) {
        this.f175294d = aVar;
        this.f175295e = i;
        this.f175296f = eVar;
        this.f175297g = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMvMakerFixEditUIC.C57040a aVar = this.f175294d.f175285e;
        int i = this.f175295e;
        C59811e eVar = this.f175296f;
        View view2 = this.f175297g.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        aVar.mo80482b(i, eVar, view2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
