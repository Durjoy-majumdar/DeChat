package jz1;

import android.view.View;
import cz1.C7143c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jz1.C46595b;

/* renamed from: jz1.l */
public final class C46610l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46612n f125534d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125535e;

    /* renamed from: f */
    public final /* synthetic */ int f125536f;

    /* renamed from: g */
    public final /* synthetic */ C46595b.C46596a f125537g;

    /* renamed from: h */
    public final /* synthetic */ View f125538h;

    public C46610l(C46612n nVar, C7143c cVar, int i, C46595b.C46596a aVar, View view) {
        this.f125534d = nVar;
        this.f125535e = cVar;
        this.f125536f = i;
        this.f125537g = aVar;
        this.f125538h = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C46612n.m51918a(this.f125534d, this.f125535e, 2, this.f125536f);
        C7143c cVar = (C7143c) this.f125537g.f173503E;
        C46595b.C46597b bVar = this.f125534d.f125544b;
        if (bVar != null) {
            View view2 = this.f125538h;
            int i = this.f125536f;
            C87412m.m108593f(cVar, "conversation");
            bVar.mo71887a(view2, i, cVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
