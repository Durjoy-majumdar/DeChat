package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;

/* renamed from: com.tencent.mm.plugin.webview.luggage.a0 */
public class C5871a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f22082d;

    /* renamed from: e */
    public final /* synthetic */ C43658n f22083e;

    public C5871a0(C43658n nVar, String str) {
        this.f22083e = nVar;
        this.f22082d = str;
    }

    public void run() {
        this.f22083e.f117948r.setBackgroundColor(C6600v.m6908c(this.f22082d, this.f22083e.f148196d.getResources().getColor(C0966R.color.akq)));
        this.f22083e.f117948r.setPullDownViewVisibility(8);
    }
}
