package nb2;

import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import gy3.C87412m;
import hb2.C59822f;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import sb2.C63807m;
import sb2.C63849t0;
import ub2.C65306q0;

/* renamed from: nb2.r */
public final class C61664r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175339d;

    /* renamed from: e */
    public final /* synthetic */ C61646d f175340e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f175341f;

    public C61664r(C61647e eVar, C61646d dVar, C60905o oVar) {
        this.f175339d = eVar;
        this.f175340e = dVar;
        this.f175341f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        C65306q0 q0Var = ((C63807m) rVar.mo62444c(this.f175339d.f175299e).mo75002a(C63807m.class)).f180881g;
        if (q0Var.isShowing()) {
            q0Var.dismiss();
        }
        C59822f fVar = this.f175340e.f175298d;
        C87412m.m108594g(fVar, "musicMv");
        int i = fVar.f170768p;
        boolean z = true;
        if (!(i == 1 || i == 4)) {
            z = false;
        }
        if (z) {
            C39622i0 a = rVar.mo62444c(this.f175339d.f175299e).mo75002a(C63849t0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…icMvShareUIC::class.java)");
            ((C63849t0) a).mo88638c3(this.f175341f, this.f175340e.f175298d, 2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
