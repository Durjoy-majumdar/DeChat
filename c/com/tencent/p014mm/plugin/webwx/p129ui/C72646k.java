package com.tencent.p014mm.plugin.webwx.p129ui;

import android.view.View;
import com.tencent.p014mm.plugin.webwx.p129ui.C72632c;
import com.tencent.p014mm.sdk.platformtools.Log;
import e62.C75554c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webwx.ui.k */
public final class C72646k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75554c.C75555b f211360d;

    /* renamed from: e */
    public final /* synthetic */ C72632c f211361e;

    public C72646k(C75554c.C75555b bVar, C72632c cVar) {
        this.f211360d = bVar;
        this.f211361e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.LoginDeviceAdapter", this.f211360d.f182221n + ", logout webwx");
        C72632c.C72633a aVar = this.f211361e.f211307A;
        if (aVar != null) {
            C75554c.C75555b bVar = this.f211360d;
            int i = bVar.f182214d;
            int i2 = bVar.f182220j;
            String str = bVar.f221964r;
            C87412m.m108593f(str, "onlineInfo.exitConfirm");
            aVar.mo100070U6(i, i2, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
