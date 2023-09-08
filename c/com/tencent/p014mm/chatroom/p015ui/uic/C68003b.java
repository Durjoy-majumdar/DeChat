package com.tencent.p014mm.chatroom.p015ui.uic;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nm2.C76927a;

/* renamed from: com.tencent.mm.chatroom.ui.uic.b */
public final class C68003b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67995a f195169d;

    public C68003b(C67995a aVar) {
        this.f195169d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click selectRecordMsgBt %s", this.f195169d.mo93381g3());
        this.f195169d.mo14600f3();
        Intent putExtra = new Intent().putExtra("Chat_User", this.f195169d.mo93381g3()).putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_msg_select_introduce", this.f195169d.f195145g).putExtra("key_record_select_min_msg_id", this.f195169d.f195147i).putExtra("key_record_select_msg_num", this.f195169d.f195143e);
        C87412m.m108593f(putExtra, "Intent()\n               …lectMsgNum, selectMsgNum)");
        ArrayList<String> arrayList2 = this.f195169d.f195146h;
        if (arrayList2 != null) {
            putExtra.putStringArrayListExtra("key_record_select_msg_black_list", arrayList2);
        }
        C88144b.m109802t(this.f195169d.getActivity(), ".ui.chatting.ChattingUI", putExtra, 10001);
        this.f195169d.f195145g = false;
        C76927a.m92781a().f224800a.f194394f = 1;
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
