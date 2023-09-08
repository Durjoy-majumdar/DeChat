package com.tencent.p014mm.plugin.webwx.p129ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import e62.C75554c;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webwx.ui.d */
public final class C72634d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75554c.C75555b f211336d;

    /* renamed from: e */
    public final /* synthetic */ C72632c f211337e;

    public C72634d(C75554c.C75555b bVar, C72632c cVar) {
        this.f211336d = bVar;
        this.f211337e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f211336d.f221968v + "&lang=" + LocaleUtil.getApplicationLanguage());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        C88144b.m109791i(this.f211337e.f211335z, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
