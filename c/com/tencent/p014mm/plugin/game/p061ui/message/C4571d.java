package com.tencent.p014mm.plugin.game.p061ui.message;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.message.d */
public class C4571d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameMsgCenterUI f19318d;

    public C4571d(GameMsgCenterUI gameMsgCenterUI) {
        this.f19318d = gameMsgCenterUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19318d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
