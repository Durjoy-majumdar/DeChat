package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.n1 */
public final class C6523n1<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23672d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23673e;

    public C6523n1(C13855j jVar, C13851h1 h1Var) {
        this.f23672d = jVar;
        this.f23673e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        HashMap hashMap = new HashMap();
        if (((IPCBoolean) obj).f10312d) {
            hashMap.put("code", 100);
            hashMap.put(StateEvent.Name.MESSAGE, "post successful");
            C13849g gVar = this.f23672d.f39001d;
            String str = this.f23673e.f38990c;
            gVar.mo10774a(str, this.f23673e.f38996i + ":ok", hashMap);
            return;
        }
        hashMap.put("code", 200);
        hashMap.put(StateEvent.Name.MESSAGE, "post cancel");
        C13849g gVar2 = this.f23672d.f39001d;
        String str2 = this.f23673e.f38990c;
        gVar2.mo10774a(str2, this.f23673e.f38996i + ":fail", hashMap);
    }
}
