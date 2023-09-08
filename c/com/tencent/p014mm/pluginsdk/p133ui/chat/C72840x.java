package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72923q0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.x */
public class C72840x implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212262d;

    public C72840x(ChatFooter chatFooter) {
        this.f212262d = chatFooter;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ChatFooter chatFooter = this.f212262d;
        if (chatFooter.f211826V1 != null) {
            int measuredHeight = (int) (((double) (chatFooter.f211888j.getMeasuredHeight() - this.f212262d.f211888j.getMinimumHeight())) * 1.3d);
            C72917n0 n0Var = ((ChattingUIFragment) this.f212262d.f211826V1.mo100531a().f193287k).f215304v;
            if (n0Var instanceof C72923q0) {
                ((C72923q0) n0Var).setExtraScrollDistance(measuredHeight);
            }
        }
    }
}
