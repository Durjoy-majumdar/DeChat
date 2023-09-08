package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$a$$b */
public class i7$a$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74059i7.C74068g f217340d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f217341e;

    public i7$a$$b(C74059i7.C74060a aVar, C74059i7.C74068g gVar, C67391b bVar) {
        this.f217340d = gVar;
        this.f217341e = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.ChattingItemTextFrom", "sourceTV click msgId:%s", this.f217340d.f217322b.getTag(C0966R.C0970id.f357682b73));
        C73309a2.m86449b(this.f217341e, ((Long) this.f217340d.f217322b.getTag(C0966R.C0970id.f357682b73)).longValue(), 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
