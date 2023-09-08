package com.tencent.p014mm.plugin.webwx.p129ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.webwx.p129ui.C72632c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e62.C75554c;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.webwx.ui.i */
public final class C72642i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72632c f211353d;

    /* renamed from: e */
    public final /* synthetic */ C75554c.C75555b f211354e;

    public C72642i(C72632c cVar, C75554c.C75555b bVar) {
        this.f211353d = cVar;
        this.f211354e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Chat_User", "filehelper");
        intent.putExtra("key_show_bottom_app_panel", true);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, this.f211353d.f211335z);
        Log.m105918d("MicroMsg.LoginDeviceAdapter", this.f211354e.f182221n + ", clicked file transfer bt, start filehelper");
        C72632c.C72633a aVar = this.f211353d.f211307A;
        if (aVar != null) {
            aVar.mo100073q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
