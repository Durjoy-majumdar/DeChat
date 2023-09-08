package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.h3 */
public class C68773h3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineNewMsgUI f197574d;

    public C68773h3(BizTimeLineNewMsgUI bizTimeLineNewMsgUI) {
        this.f197574d = bizTimeLineNewMsgUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f197574d.f50188f.setOnClickListener((View.OnClickListener) null);
        C18193c3 c3Var = this.f197574d.f50194o;
        c3Var.f50281i = true;
        c3Var.mo22800b(c3Var.getCount() - 1);
        this.f197574d.f50189g.setVisibility(0);
        BizTimeLineNewMsgUI bizTimeLineNewMsgUI = this.f197574d;
        bizTimeLineNewMsgUI.f50190h.setText(bizTimeLineNewMsgUI.getString(C0966R.string.ap9));
        BizTimeLineNewMsgUI bizTimeLineNewMsgUI2 = this.f197574d;
        bizTimeLineNewMsgUI2.f50188f.setBackgroundColor(bizTimeLineNewMsgUI2.getResources().getColor(C0966R.color.f3124g2));
        View view2 = this.f197574d.f50191i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
