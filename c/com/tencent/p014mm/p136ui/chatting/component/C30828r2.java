package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.view.C73884e;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.component.r2 */
public class C30828r2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupToolsComponet f82841d;

    public C30828r2(GroupToolsComponet groupToolsComponet) {
        this.f82841d = groupToolsComponet;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupToolsComponet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "downArrowRl click");
        C73884e eVar = this.f82841d.f215609t;
        if (eVar != null) {
            eVar.mo102946b();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
