package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.webkit.ValueCallback;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.e2 */
public class C44635e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44625c2.C44629d f121034d;

    public C44635e2(C44625c2.C44629d dVar) {
        this.f121034d = dVar;
    }

    public void run() {
        this.f121034d.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}", (ValueCallback<String>) null);
    }
}
