package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w6 */
public class C6810w6 implements View.OnClickListener {
    public C6810w6(C74305x6 x6Var) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemNewXmlSysImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.ChattingItemNewXmlSysImpl", "clicked");
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemNewXmlSysImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
