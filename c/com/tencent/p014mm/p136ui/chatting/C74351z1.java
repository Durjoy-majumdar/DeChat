package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.z1 */
public class C74351z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77630j f218401d;

    /* renamed from: e */
    public final /* synthetic */ String f218402e;

    public C74351z1(C77630j jVar, String str) {
        this.f218401d = jVar;
        this.f218402e = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74243t8 t8Var = (C74243t8) view.getTag();
        Log.m105925i("MicroMsg.ChattingItemHelper", "on app brand(%s) button1 click", this.f218401d.f226336r);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        C77630j jVar = this.f218401d;
        aVar.f9526a = jVar.f226336r;
        aVar.f9527b = jVar.f226337s;
        aVar.f9528c = jVar.f226339u;
        aVar.f9534i = jVar.f226338t;
        aVar.f9538m = true;
        aVar.f9529d = 1076;
        aVar.f9530e = this.f218402e + XVFSFile.PATH_SEPARATOR + t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217950B;
        startAppBrandUIFromOuterEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
