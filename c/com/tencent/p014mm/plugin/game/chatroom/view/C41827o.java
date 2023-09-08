package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomTag;
import com.tencent.p014mm.plugin.game.chatroom.view.C41811n;
import j20.C117292a;
import java.util.ArrayList;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.o */
public class C41827o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomTag f112739d;

    /* renamed from: e */
    public final /* synthetic */ C41811n.C41817e f112740e;

    public C41827o(C41811n.C41817e eVar, ChatroomTag chatroomTag) {
        this.f112740e = eVar;
        this.f112739d = chatroomTag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53601h.m60129h(this.f112740e.f112669z, this.f112739d.tag_jump_info);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
