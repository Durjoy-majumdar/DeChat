package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.transmit.C74917p;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v */
public class C74275v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74253h f218155d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f218156e;

    /* renamed from: f */
    public final /* synthetic */ C74917p.C74919b f218157f;

    public C74275v(C74244u.C74253h hVar, C77407n nVar, C74917p.C74919b bVar) {
        this.f218155d = hVar;
        this.f218156e = nVar;
        this.f218157f = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ChattingItemAppMsg", "introduce View click confirm!");
        this.f218155d.f218011a = true;
        this.f218156e.mo107572p();
        C74917p.C74919b bVar = this.f218157f;
        if (bVar != null) {
            bVar.mo103253a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
