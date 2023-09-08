package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.i */
public final class C4570i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f19317d;

    public C4570i(View view) {
        this.f19317d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f19317d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
