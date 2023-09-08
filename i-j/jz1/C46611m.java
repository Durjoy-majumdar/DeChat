package jz1;

import android.view.View;
import cz1.C7143c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jz1.C46595b;

/* renamed from: jz1.m */
public final class C46611m implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46612n f125539d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125540e;

    /* renamed from: f */
    public final /* synthetic */ int f125541f;

    /* renamed from: g */
    public final /* synthetic */ C46595b.C46596a f125542g;

    /* renamed from: h */
    public final /* synthetic */ View f125543h;

    public C46611m(C46612n nVar, C7143c cVar, int i, C46595b.C46596a aVar, View view) {
        this.f125539d = nVar;
        this.f125540e = cVar;
        this.f125541f = i;
        this.f125542g = aVar;
        this.f125543h = view;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C46612n.m51918a(this.f125539d, this.f125540e, 72, this.f125541f);
        C7143c cVar = (C7143c) this.f125542g.f173503E;
        C46595b.C46598c cVar2 = this.f125539d.f125545c;
        if (cVar2 != null) {
            View view2 = this.f125543h;
            int i = this.f125541f;
            C87412m.m108593f(cVar, "conversation");
            cVar2.mo71888a(view2, i, cVar, this.f125539d.f125565a.mo71886w2());
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
