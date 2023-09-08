package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import java.util.HashMap;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$a */
public final /* synthetic */ class e$$a implements C90271s.C13751b {

    /* renamed from: a */
    public final /* synthetic */ C19391e f249142a;

    /* renamed from: b */
    public final /* synthetic */ String f249143b;

    public /* synthetic */ e$$a(C19391e eVar, String str) {
        this.f249142a = eVar;
        this.f249143b = str;
    }

    /* renamed from: b */
    public final void mo13120b(int i, String str) {
        C19391e eVar = this.f249142a;
        String str2 = this.f249143b;
        eVar.getClass();
        HashMap hashMap = new HashMap(1);
        if (i == 0) {
            hashMap.put("err_msg", "launchApplication:ok");
        } else {
            hashMap.put("err_msg", "launchApplication:fail." + str);
        }
        eVar.mo25053k(str2, hashMap);
    }
}
