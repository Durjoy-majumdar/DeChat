package com.tencent.p014mm.plugin.game.chatroom.view.flow;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.a */
public class C4439a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f19172d;

    /* renamed from: e */
    public final /* synthetic */ FlowView f19173e;

    public C4439a(FlowView flowView, int i) {
        this.f19173e = flowView;
        this.f19172d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19173e.getClass();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
