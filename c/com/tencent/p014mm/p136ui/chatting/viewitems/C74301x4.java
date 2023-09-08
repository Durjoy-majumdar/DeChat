package com.tencent.p014mm.p136ui.chatting.viewitems;

import hp3.C87581a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x4 */
public class C74301x4 implements C87581a<Boolean, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ ChattingItemDyeingTemplate f218222a;

    public C74301x4(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f218222a = chattingItemDyeingTemplate;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C89779i0 i0Var = this.f218222a.f216868w;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f218222a.f216868w = null;
        }
        Boolean valueOf = Boolean.valueOf(bool.booleanValue() & this.f218222a.f216861V);
        this.f218222a.f216861V = false;
        return valueOf;
    }
}
