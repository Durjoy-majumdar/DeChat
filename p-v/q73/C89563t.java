package q73;

import android.view.View;
import android.webkit.ValueCallback;
import j20.C117292a;
import java.util.ArrayList;
import q73.C89564u;
import r73.C47930c;

/* renamed from: q73.t */
public final class C89563t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f257734d;

    /* renamed from: e */
    public final /* synthetic */ C89547f f257735e;

    /* renamed from: f */
    public final /* synthetic */ C89564u.C89565a f257736f;

    public C89563t(boolean z, C89547f fVar, C89564u.C89565a aVar) {
        this.f257734d = z;
        this.f257735e = fVar;
        this.f257736f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webcanvas/WebCanvasPopupContext$CanvasPopup$show$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f257734d) {
            C47930c.C47931a.m53253a(this.f257735e, this.f257736f.f257749q, (String) null, (ValueCallback) null, 6, (Object) null);
        } else {
            this.f257736f.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webcanvas/WebCanvasPopupContext$CanvasPopup$show$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
