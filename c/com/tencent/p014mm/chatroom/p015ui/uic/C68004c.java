package com.tencent.p014mm.chatroom.p015ui.uic;

import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nm2.C76927a;
import p240sx.C77797h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.chatroom.ui.uic.c */
public final class C68004c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67995a f195170d;

    public C68004c(C67995a aVar) {
        this.f195170d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry");
        C67995a aVar = this.f195170d;
        aVar.f195151p = null;
        aVar.f195155t = null;
        aVar.f195149n = false;
        aVar.f195153r = false;
        aVar.f195148j = true;
        aVar.f195152q = true;
        aVar.mo93385l3();
        C77797h hVar = (C77797h) C86312j.m106911c(C77797h.class);
        this.f195170d.f195154s = new ArrayList(hVar.mo107937VR());
        C67995a aVar2 = this.f195170d;
        aVar2.f195150o = hVar.Xj0(aVar2.getActivity(), "msginfo@fakeuser", true);
        if (!((Boolean) this.f195170d.f195150o.second).booleanValue()) {
            ((SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((C36570n) this.f195170d.f195156u).getValue()).alive();
        } else {
            this.f195170d.mo93386m3();
        }
        C76927a.m92781a().f224810k++;
        Pair<Long, Boolean> pair = this.f195170d.f195150o;
        Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry, msgId:%s direct:%s", pair.first, pair.second);
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
