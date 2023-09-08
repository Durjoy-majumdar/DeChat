package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o4 */
public class C74150o4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74160o8 f217665d;

    /* renamed from: e */
    public final /* synthetic */ ChattingItemDyeingTemplate f217666e;

    public C74150o4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74160o8 o8Var) {
        this.f217666e = chattingItemDyeingTemplate;
        this.f217665d = o8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f217665d.f217687i.setVisibility(8);
        C74243t8 t8Var = (C74243t8) this.f217665d.f217689k.f217718a.getTag();
        ChattingItemDyeingTemplate.m87574A0(this.f217666e, 3, t8Var.f212238a);
        ChattingItemDyeingTemplate.m87585x0(this.f217666e, this.f217665d, t8Var, t8Var.mo103252b());
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
