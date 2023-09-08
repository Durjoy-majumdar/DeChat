package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import d62.C7240a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wd3.C53155r0;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.j */
public final class C42297j extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ GameRoomStaggeredListFragment f114374e;

    /* renamed from: f */
    public final /* synthetic */ ContentBlock f114375f;

    /* renamed from: g */
    public final /* synthetic */ View f114376g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42297j(GameRoomStaggeredListFragment gameRoomStaggeredListFragment, ContentBlock contentBlock, View view) {
        super(1, (C53155r0) null);
        this.f114374e = gameRoomStaggeredListFragment;
        this.f114375f = contentBlock;
        this.f114376g = view;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        C87412m.m108594g(view, "widget");
        C53601h.m60129h(this.f114374e.requireContext(), this.f114375f.jump_info);
        View view2 = this.f114376g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
