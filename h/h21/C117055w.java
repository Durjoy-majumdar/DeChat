package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.C49139df2;

/* renamed from: h21.w */
public class C117055w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49139df2 f350731d;

    /* renamed from: e */
    public final /* synthetic */ CollectMainUI f350732e;

    public C117055w(CollectMainUI collectMainUI, C49139df2 df22) {
        this.f350732e = collectMainUI;
        this.f350731d = df22;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectMainUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CollectMainUI.m162068J7(this.f350732e, this.f350731d.f132290g);
        C12925w wVar = this.f350732e.f345630r1;
        if (wVar != null && wVar.mo12466f()) {
            this.f350732e.f345630r1.mo5085n();
            this.f350732e.f345630r1 = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
