package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h7 */
public class C74021h7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74059i7.C74068g f217193d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f217194e;

    public C74021h7(C74059i7.C74068g gVar, C67391b bVar) {
        this.f217193d = gVar;
        this.f217194e = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemText$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74244u.m88501l((C72963f4) view.getTag(), this.f217193d, this.f217194e, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
