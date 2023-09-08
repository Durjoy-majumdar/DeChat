package com.tencent.p014mm.plugin.game.p061ui.message;

import android.view.View;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import uy1.C52642c;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.ui.message.v */
public class C42370v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42119w f114603d;

    /* renamed from: e */
    public final /* synthetic */ InteractiveMsgMRecycleView.C42327d f114604e;

    public C42370v(InteractiveMsgMRecycleView.C42327d dVar, C42119w wVar) {
        this.f114604e = dVar;
        this.f114603d = wVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42119w wVar = this.f114603d;
        C42119w.C42131l lVar = wVar.f113494t1.get(wVar.f113463X1.f113579w);
        if (lVar == null) {
            Log.m105920e("MicroMsg.InteractiveMsgMRecycleView", "获取reply JumpInfo失败");
            C42119w wVar2 = this.f114603d;
            C42119w.C42131l lVar2 = wVar2.f113494t1.get(wVar2.f113463X1.f113557a);
            if (lVar2 != null) {
                lVar2.jump_type = 1;
                C53601h.m60129h(InteractiveMsgMRecycleView.this.f114489C1, lVar2);
                Log.m105920e("MicroMsg.InteractiveMsgMRecycleView", "获取post JumpInfo失败");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        lVar.jump_type = 1;
        C52642c.m59000r(InteractiveMsgMRecycleView.this.f114489C1, lVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
