package to1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: to1.a0 */
public final class C14060a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<View, C13598b0> f39451d;

    public C14060a0(C32226l<? super View, C13598b0> lVar) {
        this.f39451d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/TemplateHolder$loadItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<View, C13598b0> lVar = this.f39451d;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        lVar.invoke(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/record/plugin/TemplateHolder$loadItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
