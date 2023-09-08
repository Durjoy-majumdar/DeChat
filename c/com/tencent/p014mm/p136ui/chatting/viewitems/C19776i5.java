package com.tencent.p014mm.p136ui.chatting.viewitems;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i5 */
public class C19776i5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingItemDyeingTemplate f56237d;

    public C19776i5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f56237d = chattingItemDyeingTemplate;
    }

    public void run() {
        C89779i0 i0Var = this.f56237d.f216865Z;
        if (i0Var != null && i0Var.isShowing()) {
            this.f56237d.f216865Z.dismiss();
        }
    }
}
