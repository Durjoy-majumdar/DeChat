package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import com.tencent.p014mm.plugin.game.chatroom.view.C41811n;
import d62.C7240a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wd3.C53155r0;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.p */
public class C41829p extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ ContentBlock f112744e;

    /* renamed from: f */
    public final /* synthetic */ C41811n.C41824f f112745f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41829p(C41811n.C41824f fVar, int i, C53155r0 r0Var, ContentBlock contentBlock) {
        super(i, r0Var);
        this.f112745f = fVar;
        this.f112744e = contentBlock;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        C53601h.m60129h(this.f112745f.f112669z, this.f112744e.jump_info);
        View view2 = this.f112745f.f112726E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$3", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$3", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
