package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.C49139df2;

/* renamed from: h21.v */
public class C117053v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49139df2 f350728d;

    /* renamed from: e */
    public final /* synthetic */ CollectMainUI f350729e;

    public C117053v(CollectMainUI collectMainUI, C49139df2 df22) {
        this.f350729e = collectMainUI;
        this.f350728d = df22;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectMainUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CollectMainUI.m162068J7(this.f350729e, this.f350728d.f132289f);
        C12925w wVar = this.f350729e.f345630r1;
        if (wVar != null && wVar.mo12466f()) {
            this.f350729e.f345630r1.mo5085n();
            this.f350729e.f345630r1 = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
