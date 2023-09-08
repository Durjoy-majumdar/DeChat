package ez2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ez2.a */
public final class C45721a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f123553d;

    /* renamed from: e */
    public final /* synthetic */ C45722b f123554e;

    public C45721a(C60905o oVar, C45722b bVar) {
        this.f123553d = oVar;
        this.f123554e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/NotifyInfoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusLikeListActivity.C43209a aVar = TextStatusLikeListActivity.f116931f;
        Context context = this.f123553d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C32224a<Integer> aVar2 = this.f123554e.f123555e;
        aVar.mo67454a(context, aVar2 != null ? aVar2.invoke().intValue() : 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/topic/NotifyInfoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
