package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q4 */
public class C74174q4 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C22222c.C22225c f217726d;

    /* renamed from: e */
    public final /* synthetic */ boolean f217727e;

    /* renamed from: f */
    public final /* synthetic */ ChattingItemDyeingTemplate f217728f;

    public C74174q4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C22222c.C22225c cVar, boolean z) {
        this.f217728f = chattingItemDyeingTemplate;
        this.f217726d = cVar;
        this.f217727e = z;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (!this.f217726d.f62963a) {
            e0Var.mo107140d(3, this.f217728f.f216867v.mo91572m().getColor(C0966R.color.f3154h3), this.f217728f.f216867v.mo91572m().getString(C0966R.string.hd6));
        } else if (this.f217727e) {
            e0Var.mo107140d(4, this.f217728f.f216867v.mo91572m().getColor(C0966R.color.a_3), this.f217728f.f216867v.mo91572m().getString(C0966R.string.hcv));
        } else {
            e0Var.mo107140d(3, this.f217728f.f216867v.mo91572m().getColor(C0966R.color.f3154h3), this.f217728f.f216867v.mo91572m().getString(C0966R.string.hd5));
        }
    }
}
