package nb2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: nb2.j */
public final class C11147j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f32924d;

    public C11147j(C60905o oVar) {
        this.f32924d = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initDeleteStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View findViewById = this.f32924d.f44854d.findViewById(C0966R.C0970id.h8l);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initDeleteStatus$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initDeleteStatus$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initDeleteStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
