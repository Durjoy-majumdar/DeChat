package fs1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: fs1.b */
public final class C8203b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8198a f27131d;

    public C8203b(C8198a aVar) {
        this.f27131d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderLawLicensePopupView", "#btn on cancel click");
        C12925w wVar = this.f27131d.f27123e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
