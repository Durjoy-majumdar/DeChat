package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v5 */
public class C74279v5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74160o8 f218162d;

    /* renamed from: e */
    public final /* synthetic */ ChattingItemDyeingTemplate f218163e;

    public C74279v5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74160o8 o8Var) {
        this.f218163e = chattingItemDyeingTemplate;
        this.f218162d = o8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f218162d.f217687i.setVisibility(8);
        C74243t8 t8Var = (C74243t8) view.getTag();
        ChattingItemDyeingTemplate.m87574A0(this.f218163e, 2, t8Var.f212238a);
        ChattingItemDyeingTemplate.m87585x0(this.f218163e, this.f218162d, t8Var, t8Var.mo103252b());
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
