package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.C49139df2;

/* renamed from: h21.x */
public class C117057x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49139df2 f350734d;

    /* renamed from: e */
    public final /* synthetic */ CollectMainUI f350735e;

    public C117057x(CollectMainUI collectMainUI, C49139df2 df22) {
        this.f350735e = collectMainUI;
        this.f350734d = df22;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectMainUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CollectMainUI.m162068J7(this.f350735e, this.f350734d.f132290g);
        C12925w wVar = this.f350735e.f345630r1;
        if (wVar != null && wVar.mo12466f()) {
            this.f350735e.f345630r1.mo5085n();
            this.f350735e.f345630r1 = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
