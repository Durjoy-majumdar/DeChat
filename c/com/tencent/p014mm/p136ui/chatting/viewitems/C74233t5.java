package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t5 */
public class C74233t5 extends ViewOutlineProvider {
    public C74233t5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3699bs));
    }
}
