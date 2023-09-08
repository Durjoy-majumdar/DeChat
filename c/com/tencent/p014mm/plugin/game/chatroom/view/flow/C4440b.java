package com.tencent.p014mm.plugin.game.chatroom.view.flow;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.b */
public class C4440b implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f19174d;

    /* renamed from: e */
    public final /* synthetic */ FlowView f19175e;

    public C4440b(FlowView flowView, int i) {
        this.f19175e = flowView;
        this.f19174d = i;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f19175e.getClass();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
