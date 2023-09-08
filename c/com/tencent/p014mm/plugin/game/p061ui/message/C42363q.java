package com.tencent.p014mm.plugin.game.p061ui.message;

import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.ui.message.q */
public class C42363q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f114588d;

    /* renamed from: e */
    public final /* synthetic */ InteractiveMsgMRecycleView.C42326c f114589e;

    public C42363q(InteractiveMsgMRecycleView.C42326c cVar, List list) {
        this.f114589e = cVar;
        this.f114588d = list;
    }

    public void run() {
        ((LinkedList) this.f114589e.f114504e).clear();
        ((LinkedList) this.f114589e.f114504e).addAll(this.f114588d);
        this.f114589e.notifyDataSetChanged();
    }
}
