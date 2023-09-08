package com.tencent.p014mm.plugin.gamelife.p062ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.gamelife.ui.a */
public final class C42406a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameLifeConversationUI f114710d;

    public C42406a(GameLifeConversationUI gameLifeConversationUI) {
        this.f114710d = gameLifeConversationUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f114710d.f114697f.mo71897b();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View loadMoreFooter = this.f114710d.mo66481H7().f123160d.getLoadMoreFooter();
        View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.g2z) : null;
        if (findViewById != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
