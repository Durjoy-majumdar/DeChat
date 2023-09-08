package com.tencent.p014mm.plugin.game.p061ui.message;

import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.ui.message.r */
public class C42364r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f114590d;

    /* renamed from: e */
    public final /* synthetic */ InteractiveMsgMRecycleView.C42326c f114591e;

    public C42364r(InteractiveMsgMRecycleView.C42326c cVar, List list) {
        this.f114591e = cVar;
        this.f114590d = list;
    }

    public void run() {
        InteractiveMsgMRecycleView.this.f114495I1 = this.f114590d.size() != 15;
        int size = ((LinkedList) this.f114591e.f114504e).size();
        ((LinkedList) this.f114591e.f114504e).addAll(this.f114590d);
        this.f114591e.notifyItemRangeInserted(size, this.f114590d.size());
    }
}
