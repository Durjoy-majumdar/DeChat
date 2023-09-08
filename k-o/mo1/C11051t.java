package mo1;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: mo1.t */
public final class C11051t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11025q f32805d;

    public C11051t(C11025q qVar) {
        this.f32805d = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11025q qVar = this.f32805d;
        if (!qVar.f32753D) {
            qVar.f32753D = true;
            Object value = ((C36570n) qVar.f32762p).getValue();
            C87412m.m108593f(value, "<get-justWatchedLittleIcon1>(...)");
            if (((View) value).getVisibility() == 0) {
                Object value2 = ((C36570n) qVar.f32762p).getValue();
                C87412m.m108593f(value2, "<get-justWatchedLittleIcon1>(...)");
                View view2 = (View) value2;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "beginLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "beginLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Object value3 = ((C36570n) qVar.f32761o).getValue();
                C87412m.m108593f(value3, "<get-justWatchedLoading>(...)");
                View view3 = (View) value3;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "beginLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "beginLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C32224a<C13598b0> aVar3 = this.f32805d.f32752C;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
