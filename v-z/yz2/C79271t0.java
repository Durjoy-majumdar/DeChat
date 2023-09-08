package yz2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qy2.C77459z;

/* renamed from: yz2.t0 */
public final class C79271t0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f232717d;

    public C79271t0(TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f232717d = textStatusDoWhatActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View findViewById = this.f232717d.findViewById(C0966R.C0970id.cdh);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        WxRecyclerView wxRecyclerView = this.f232717d.f206766d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        View J7 = this.f232717d.mo98415J7();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = J7;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        J7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C77459z zVar = this.f232717d.f206771i;
        if (zVar != null) {
            zVar.f229407o = 1;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
