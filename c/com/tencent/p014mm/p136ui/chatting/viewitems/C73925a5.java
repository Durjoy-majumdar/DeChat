package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a5 */
public class C73925a5 implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ ChattingItemDyeingTemplate f216988a;

    public C73925a5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f216988a = chattingItemDyeingTemplate;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C46888b b = C88643g.m110544b();
        C89779i0 i0Var = this.f216988a.f216868w;
        if (i0Var != null && i0Var.isShowing()) {
            this.f216988a.f216868w.dismiss();
        }
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f216988a;
        chattingItemDyeingTemplate.f216868w = C76879j.m92723Q(chattingItemDyeingTemplate.f216867v.mo91565f(), this.f216988a.f216867v.mo91572m().getString(C0966R.string.a3h), this.f216988a.f216867v.mo91572m().getString(C0966R.string.a4d), true, true, new a5$$a(b));
        this.f216988a.f216861V = true;
        return null;
    }
}
