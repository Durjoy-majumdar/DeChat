package ms1;

import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ky2.C10432i;

/* renamed from: ms1.b */
public final class C11086b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11089e f32857d;

    public C11086b(C11089e eVar) {
        this.f32857d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11089e eVar = this.f32857d;
        int i = C11089e.f32860n;
        eVar.getClass();
        Class cls = C10432i.class;
        ((C10432i) C86312j.m106911c(cls)).setScene(2);
        ((C10432i) C86312j.m106911c(cls)).mo10757ri(1);
        C88144b.m109789g(eVar.f32861d, "teenmode", ".ui.SettingsTeenModeIntro");
        eVar.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
