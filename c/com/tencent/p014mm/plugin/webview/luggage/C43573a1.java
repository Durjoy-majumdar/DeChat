package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.a1 */
public class C43573a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117806d;

    public C43573a1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117806d = luggageWebViewLongClickHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = this.f117806d.f117785g;
        if (nVar != null && nVar.mo107563h()) {
            this.f117806d.f117785g.mo107572p();
        }
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = this.f117806d;
        luggageWebViewLongClickHelper.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("type", 3);
        bundle.putString("preUsername", luggageWebViewLongClickHelper.f117787i.f148261n.getString("preUsername"));
        bundle.putString("preChatName", luggageWebViewLongClickHelper.f117787i.f148261n.getString("preChatName"));
        bundle.putString("rawUrl", luggageWebViewLongClickHelper.f117787i.mo67941t());
        String string = luggageWebViewLongClickHelper.f117787i.f148261n.getString("pre_username");
        if (string == null || !C6013c.m5891c(string)) {
            bundle.putString("pre_username", luggageWebViewLongClickHelper.f117787i.f148261n.getString(C74928u.C45093i.f122324p));
        } else {
            bundle.putString("pre_username", string);
        }
        bundle.putString("result", luggageWebViewLongClickHelper.f117779a);
        String str = luggageWebViewLongClickHelper.f117779a;
        if (Util.isNullOrNil(str)) {
            str = "";
        } else if (str.length() > 1024) {
            str = str.substring(0, 1024);
        }
        bundle.putString("imageUrl", str);
        bundle.putString("url", luggageWebViewLongClickHelper.f117787i.mo67943v());
        bundle.putInt("codeType", luggageWebViewLongClickHelper.f117780b);
        bundle.putInt("codeVersion", luggageWebViewLongClickHelper.f117781c);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, LuggageWebViewLongClickHelper.QBarLogicTask.class, (C1256g) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
