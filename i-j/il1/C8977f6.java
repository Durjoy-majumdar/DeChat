package il1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fj1.C45795b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: il1.f6 */
public final class C8977f6 extends C9120u0 implements View.OnClickListener {

    /* renamed from: h */
    public static final /* synthetic */ int f28375h = 0;

    public final C45795b getBuContext() {
        return null;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRecommendSettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mkx) {
            throw null;
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mky) {
            throw null;
        } else {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRecommendSettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
