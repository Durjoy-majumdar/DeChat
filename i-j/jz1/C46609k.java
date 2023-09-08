package jz1;

import android.view.View;
import cz1.C7143c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jz1.C46595b;

/* renamed from: jz1.k */
public final class C46609k implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46612n f125529d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125530e;

    /* renamed from: f */
    public final /* synthetic */ int f125531f;

    /* renamed from: g */
    public final /* synthetic */ C46595b.C46596a f125532g;

    /* renamed from: h */
    public final /* synthetic */ View f125533h;

    public C46609k(C46612n nVar, C7143c cVar, int i, C46595b.C46596a aVar, View view) {
        this.f125529d = nVar;
        this.f125530e = cVar;
        this.f125531f = i;
        this.f125532g = aVar;
        this.f125533h = view;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C46612n.m51918a(this.f125529d, this.f125530e, 72, this.f125531f);
        C7143c cVar = (C7143c) this.f125532g.f173503E;
        C46595b.C46598c cVar2 = this.f125529d.f125545c;
        if (cVar2 != null) {
            View view2 = this.f125533h;
            C87412m.m108593f(view2, "this");
            int i = this.f125531f;
            C87412m.m108593f(cVar, "conversation");
            cVar2.mo71888a(view2, i, cVar, this.f125529d.f125565a.mo71886w2());
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
