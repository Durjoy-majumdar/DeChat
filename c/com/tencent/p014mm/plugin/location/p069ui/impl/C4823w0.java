package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.w0 */
public class C4823w0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f19898d;

    /* renamed from: e */
    public final /* synthetic */ C94167s0 f19899e;

    public C4823w0(C94167s0 s0Var, String str) {
        this.f19899e = s0Var;
        this.f19898d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f19899e.f271948d, C74928u.C45093i.class);
        Log.m105919d("MicroMsg.TrackMapUI", "click url %s", this.f19898d);
        intent.putExtra("rawUrl", this.f19898d);
        intent.putExtra("showShare", false);
        C88144b.m109801s(this.f19899e.f271948d, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
