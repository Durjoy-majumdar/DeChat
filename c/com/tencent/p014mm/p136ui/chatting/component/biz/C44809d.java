package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.d */
public class C44809d extends ViewOutlineProvider {
    public C44809d(BizComponent bizComponent) {
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) (C76577a.m92151b(view.getContext(), 114) >> 1));
    }
}
