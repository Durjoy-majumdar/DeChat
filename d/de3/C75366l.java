package de3;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: de3.l */
public final class C75366l<T> extends C75359b0 {

    /* renamed from: d */
    public final int f221581d;

    /* renamed from: e */
    public final C75365k<T> f221582e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75366l(int i, C75365k<T> kVar) {
        super(kVar.f221578d, kVar.f221579e);
        C87412m.m108594g(kVar, "obj");
        this.f221581d = i;
        this.f221582e = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C75365k<T> kVar = this.f221582e;
        C75364j<T> jVar = kVar.f221580f;
        if (jVar != null) {
            jVar.mo94024a(view, this.f221581d, kVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
