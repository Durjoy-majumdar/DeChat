package yz2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p640ox.C77049b;
import uz2.C78318v1;

/* renamed from: yz2.u1 */
public final class C79275u1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditActivity f232723d;

    public C79275u1(TextStatusEditActivity textStatusEditActivity) {
        this.f232723d = textStatusEditActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View findViewById = this.f232723d.findViewById(C0966R.C0970id.cdh);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f232723d.f206920d;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f232723d.mo98462g8();
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f232723d, 8, C78318v1.class);
        if (v1Var != null) {
            v1Var.f229479R = 1;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$showEducationLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
