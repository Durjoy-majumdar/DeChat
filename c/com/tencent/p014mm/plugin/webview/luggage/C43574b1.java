package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.b1 */
public class C43574b1 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117807a;

    public C43574b1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117807a = luggageWebViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("img_path", str);
        Context context = this.f117807a.f117787i.f148196d;
        Intent intent = new Intent();
        intent.putExtra("task_class_name", LuggageWebViewLongClickHelper.C43570j.class.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        C88144b.m109791i(context, "webview", ".luggage.ipc.IpcProxyUI", intent, (Bundle) null);
    }
}
