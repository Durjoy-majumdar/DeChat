package hk0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hk0.b */
public final class C76215b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76200a f223277d;

    public C76215b(C76200a aVar) {
        this.f223277d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$protocolJumpWording$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f223277d.f223239F.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$protocolJumpWording$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
