package ro3;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ro3.o */
public final class C77563o implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226127d;

    public C77563o(C110588j jVar) {
        this.f226127d = jVar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        View.OnLongClickListener onLongClickListener = this.f226127d.f330840o;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        if (this.f226127d.f330851z) {
            C85975v4.m106306c("SelectableEditTextHelper", "onLongClick:" + this.f226127d.f330802C, new Object[0]);
            C110588j jVar = this.f226127d;
            jVar.getClass();
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                C87412m.m108593f(str, "BRAND");
                String lowerCase = str.toLowerCase();
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (C87412m.m108589b("vivo", lowerCase) && Build.VERSION.SDK_INT < 23) {
                    jVar.f330833h.post(new C77561k(jVar));
                }
            }
            C110588j jVar2 = this.f226127d;
            if (jVar2.f330802C) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            jVar2.f330803D = true;
            jVar2.mo148764r(jVar2.f330804E, jVar2.f330805F, true);
            onLongClick = true;
        }
        C117292a.m165362h(onLongClick, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
