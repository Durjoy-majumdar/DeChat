package com.tencent.p014mm.plugin.game.p061ui.message;

import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.message.f */
public class C42349f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameMsgCenterUI f114565d;

    public C42349f(GameMsgCenterUI gameMsgCenterUI) {
        this.f114565d = gameMsgCenterUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f114565d.mo66395H7(0);
        C40314g.m43484c(this.f114565d.getContext(), 13, 1303, 1, 2, this.f114565d.f114476d, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
