package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C19615i1;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.j4 */
public class C18408j4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f51055d;

    public C18408j4(BizTimeLineUI bizTimeLineUI) {
        this.f51055d = bizTimeLineUI;
    }

    public void onClick(View view) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C19623o0 kD = C48009v0.Kx0().mo25740kD();
        if (kD != null) {
            str = C19615i1.m21063j(kD);
            i = C19615i1.m21062i(kD);
        } else {
            str = "";
            i = 0;
        }
        C18412m3 m3Var = this.f51055d.f50249v;
        m3Var.getClass();
        C115669n.INSTANCE.mo160131h(15721, str, "", 12, -1, Integer.valueOf(m3Var.f51069c), "", "", "", 0, "", "", "", "", "", "", "", "", "", Integer.valueOf(i));
        this.f51055d.f50249v.mo22991r(i, str, 1);
        Intent intent = new Intent(this.f51055d.getContext(), BizTimeLineNewMsgUI.class);
        intent.putExtra("biz_time_line_line_session_id", this.f51055d.f50208A);
        intent.putExtra("biz_time_line_line_enter_scene", 1);
        BizTimeLineUI bizTimeLineUI = this.f51055d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        BizTimeLineUI bizTimeLineUI2 = bizTimeLineUI;
        C117292a.m165358d(bizTimeLineUI2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizTimeLineUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bizTimeLineUI2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
