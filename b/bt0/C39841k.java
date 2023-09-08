package bt0;

import android.view.KeyEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt0.k */
public class C39841k implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ C39842l f106855d;

    public C39841k(C39842l lVar) {
        this.f106855d = lVar;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i == 4) {
            this.f106855d.dismiss();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
