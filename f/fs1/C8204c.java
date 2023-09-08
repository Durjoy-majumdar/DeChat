package fs1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import rx3.C13598b0;

/* renamed from: fs1.c */
public final class C8204c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8198a f27132d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f27133e;

    public C8204c(C8198a aVar, C32224a<C13598b0> aVar2) {
        this.f27132d = aVar;
        this.f27133e = aVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105924i("FinderLawLicensePopupView", "#btn on confirm click");
        C12925w wVar = this.f27132d.f27123e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        this.f27133e.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
