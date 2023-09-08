package pp1;

import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import np1.C61817a;
import qo3.C12925w;

/* renamed from: pp1.m */
public final class C62488m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f177527d;

    /* renamed from: e */
    public final /* synthetic */ C62461j f177528e;

    public C62488m(C12925w wVar, C62461j jVar) {
        this.f177527d = wVar;
        this.f177528e = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$onClickShoppingService$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f177527d.mo5085n();
        C61817a.m72531L(this.f177528e.f177479d, (Bundle) null, this.f177528e.f177479d.mo86766v() ? 0 : 3, false, false, 12, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$onClickShoppingService$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
