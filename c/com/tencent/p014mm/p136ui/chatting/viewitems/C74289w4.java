package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w4 */
public class C74289w4 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ ChattingItemDyeingTemplate f218187a;

    public C74289w4(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f218187a = chattingItemDyeingTemplate;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        C89779i0 i0Var = this.f218187a.f216868w;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f218187a.f216868w = null;
        }
        this.f218187a.f216861V = false;
        if (obj instanceof C73930b) {
            C73930b bVar = (C73930b) obj;
            int i = bVar.f216993a;
            if (i == 0) {
                C73938c.m87675a(15);
            } else if (i == 1) {
                C73938c.m87675a(12);
            } else if (i == 2) {
                C73938c.m87675a(14);
            }
            Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", bVar.f216994b);
        }
    }
}
