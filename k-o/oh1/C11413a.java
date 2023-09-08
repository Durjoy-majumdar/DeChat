package oh1;

import android.content.Context;
import android.view.View;
import cj1.C0572m5;
import cl1.C54979h1;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: oh1.a */
public final class C11413a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11415c f33578d;

    public C11413a(C11415c cVar) {
        this.f33578d = cVar;
    }

    public final void onClick(View view) {
        C0572m5 m5Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/flashsale/FlashSaleBubbleController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11415c cVar = this.f33578d;
        C3206b2 b2Var = cVar.f27261e;
        C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        if (!(bVar == null || (m5Var = ((C54979h1) cVar.business(C54979h1.class)).f154131X) == null)) {
            Context c3 = cVar.mo9306c3();
            if (c3 == null) {
                c3 = MMApplicationContext.getContext();
                C87412m.m108593f(c3, "getContext()");
            }
            C47378k.m52727a(m5Var, c3, bVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/flashsale/FlashSaleBubbleController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
