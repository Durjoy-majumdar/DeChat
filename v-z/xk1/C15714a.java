package xk1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58765p3;
import ft1.C59319a;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import o40.C11348f;
import te3.cg4;

/* renamed from: xk1.a */
public final class C15714a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15716b f42401d;

    public C15714a(C15716b bVar) {
        this.f42401d = bVar;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15716b bVar = this.f42401d;
        cg4 cg4 = bVar.f42413i;
        if (!(cg4 == null || (str = cg4.f182476d) == null)) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "AUTH_ERROR_4", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            Log.m105924i(bVar.f42408d, "returnBack -4");
            C58765p3.f168247a.mo83806e(-4, str);
        }
        this.f42401d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
