package com.tencent.p014mm.plugin.webwx.p129ui;

import android.view.View;
import com.tencent.p014mm.plugin.webwx.p129ui.C72632c;
import com.tencent.p014mm.sdk.platformtools.Log;
import e62.C75554c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webwx.ui.f */
public final class C72638f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75554c.C75555b f211343d;

    /* renamed from: e */
    public final /* synthetic */ boolean f211344e;

    /* renamed from: f */
    public final /* synthetic */ C72632c f211345f;

    /* renamed from: g */
    public final /* synthetic */ int f211346g;

    public C72638f(C75554c.C75555b bVar, boolean z, C72632c cVar, int i) {
        this.f211343d = bVar;
        this.f211344e = z;
        this.f211345f = cVar;
        this.f211346g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LoginDeviceAdapter", this.f211343d.f182221n + ", show/hide card, isShow:" + this.f211344e);
        C72632c.C72633a aVar = this.f211345f.f211307A;
        if (aVar != null) {
            aVar.mo100071Z0(this.f211344e ? -1 : this.f211346g);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
