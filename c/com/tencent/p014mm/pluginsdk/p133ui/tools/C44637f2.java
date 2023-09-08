package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.webkit.ValueCallback;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.f2 */
public class C44637f2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f121036d;

    /* renamed from: e */
    public final /* synthetic */ C44625c2.C44629d f121037e;

    /* renamed from: f */
    public final /* synthetic */ String f121038f;

    /* renamed from: g */
    public final /* synthetic */ String f121039g;

    public C44637f2(boolean z, C44625c2.C44629d dVar, String str, String str2) {
        this.f121036d = z;
        this.f121037e = dVar;
        this.f121038f = str;
        this.f121039g = str2;
    }

    public void run() {
        if (this.f121036d) {
            C44625c2.C44629d dVar = this.f121037e;
            dVar.evaluateJavascript("javascript:document.getElementById('_edw_iframe_').src = '" + this.f121038f + "' + " + this.f121039g, (ValueCallback<String>) null);
            return;
        }
        C44625c2.C44629d dVar2 = this.f121037e;
        dVar2.evaluateJavascript("javascript:console.log('" + this.f121038f + "' + " + this.f121039g + ")", (ValueCallback<String>) null);
    }
}
