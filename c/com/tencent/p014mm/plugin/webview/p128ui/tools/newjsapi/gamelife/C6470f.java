package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f */
public final class C6470f extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f23532d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6470f(LinkedList<String> linkedList) {
        super(1);
        this.f23532d = linkedList;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "username");
        boolean z = false;
        if (C72996z1.m85831b5(str)) {
            z = true;
        } else {
            Log.m105924i("GameLife.PluginGameLife", "check username failed");
        }
        if (z) {
            this.f23532d.add(str);
        }
        return C13598b0.f38549a;
    }
}
