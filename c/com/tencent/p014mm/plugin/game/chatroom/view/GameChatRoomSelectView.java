package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo;
import com.tencent.p014mm.plugin.game.chatroom.channel.C41686c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView */
public class GameChatRoomSelectView extends LinearLayout {

    /* renamed from: d */
    public ChatRoomListCard f112574d;

    /* renamed from: e */
    public C41776b f112575e;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView$a */
    public class C41775a implements View.OnClickListener {
        public C41775a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatRoomSelectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C41776b bVar = GameChatRoomSelectView.this.f112575e;
            if (bVar != null) {
                ((C41686c) bVar).f112166a.f112154s.mo140680z();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatRoomSelectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView$b */
    public interface C41776b {
    }

    public GameChatRoomSelectView(Context context) {
        super(context);
        mo65556a();
    }

    /* renamed from: a */
    public final void mo65556a() {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6804p0, this);
        ((ImageView) findViewById(C0966R.C0970id.f358553fp3)).setOnClickListener(new C41775a());
        this.f112574d = (ChatRoomListCard) findViewById(C0966R.C0970id.b0g);
    }

    public void setData(List<MyChatroomInfo> list) {
        ChatRoomListCard chatRoomListCard = this.f112574d;
        if (chatRoomListCard != null) {
            chatRoomListCard.setData(list);
        }
    }

    public void setOnCloseListener(C41776b bVar) {
        this.f112575e = bVar;
    }

    public GameChatRoomSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65556a();
    }

    public GameChatRoomSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65556a();
    }
}
