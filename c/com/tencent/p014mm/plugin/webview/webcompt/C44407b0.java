package com.tencent.p014mm.plugin.webview.webcompt;

import android.content.Context;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import nj3.C76879j;
import sx3.C110818d0;
import te3.C48869bk2;
import z04.C112551y;
import z04.C66725r;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.b0 */
public final class C44407b0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C44463z f120394d;

    public C44407b0(C44463z zVar) {
        this.f120394d = zVar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean z = !C112551y.m153811k(this.f120394d.f120574d);
        C44463z zVar = this.f120394d;
        if (z) {
            Context context = view.getContext();
            zVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("[webCompts]\n            ");
            Collection<C48869bk2> values = zVar.f120575e.values();
            C87412m.m108593f(values, "webComptSettings.values");
            sb.append(C110818d0.m150921S(values, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44405a0.f120355d, 30, (Object) null));
            sb.append("\n\n            ");
            sb.append(C44408c.f120395e.mo69188f());
            sb.append("\n            ");
            C76879j.m92748s(context, C66725r.m78728b(sb.toString()), "");
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z;
    }
}
