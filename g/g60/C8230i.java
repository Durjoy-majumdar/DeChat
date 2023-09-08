package g60;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: g60.i */
public final class C8230i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75864h f27159d;

    public C8230i(C75864h hVar) {
        this.f27159d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveMicDialog$wrapSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f27159d.isShowing()) {
            this.f27159d.cancel();
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveMicDialog$wrapSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
