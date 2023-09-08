package yz2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qy2.C77459z;

/* renamed from: yz2.m1 */
public final class C79251m1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232675d;

    public C79251m1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232675d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View findViewById = this.f232675d.findViewById(C0966R.C0970id.cdh);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        WxRecyclerView wxRecyclerView = this.f232675d.f206825d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        View L7 = this.f232675d.mo98423L7();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(L7, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        L7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(L7, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View O7 = this.f232675d.mo98426O7();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(O7, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        O7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(O7, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232675d;
        C77459z zVar = textStatusDoWhatActivityV2.f206831j;
        if (zVar != null) {
            zVar.f229407o = 1;
        }
        if (textStatusDoWhatActivityV2.mo98425N7().mo62311w() || this.f232675d.mo98425N7().mo62312x()) {
            this.f232675d.mo98424M7().setVisibility(0);
        } else if (this.f232675d.mo98425N7().mo62310v() || this.f232675d.mo98425N7().mo62272B()) {
            this.f232675d.mo98424M7().setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
