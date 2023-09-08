package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$g */
public class u$g$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74255e f250016d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f250017e;

    public u$g$$g(C74244u.C74261g gVar, C74244u.C74255e eVar, C67391b bVar) {
        this.f250016d = eVar;
        this.f250017e = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74244u.m88501l((C72963f4) view.getTag(), this.f250016d, this.f250017e, 0);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
