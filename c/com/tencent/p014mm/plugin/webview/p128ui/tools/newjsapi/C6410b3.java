package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b3 */
public final class C6410b3<T> implements C19877i.C19878a {

    /* renamed from: a */
    public final /* synthetic */ C13855j f23391a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23392b;

    public C6410b3(C13855j jVar, C13851h1 h1Var) {
        this.f23391a = jVar;
        this.f23392b = h1Var;
    }

    public final void onResult(boolean z, int i, int i2, int i3) {
        String str = C6420d3.f23419e;
        Log.m105924i(str, "date set hasSetResult=" + z + ", " + i + ", " + i2 + ", " + i3);
        if (z) {
            HashMap hashMap = new HashMap();
            String format = String.format("%d-%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
            C87412m.m108593f(format, "format(format, *args)");
            hashMap.put("selectTime", format);
            C13849g gVar = this.f23391a.f39001d;
            String str2 = this.f23392b.f38990c;
            gVar.mo10774a(str2, this.f23392b.f38996i + ":ok", hashMap);
            return;
        }
        Log.m105924i(str, "cancel date set");
        C13849g gVar2 = this.f23391a.f39001d;
        String str3 = this.f23392b.f38990c;
        gVar2.mo10774a(str3, this.f23392b.f38996i + ":cancel", (Map<String, Object>) null);
    }
}
