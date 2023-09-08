package com.tencent.p014mm.plugin.webview.luggage;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43579d1;
import di3.C86312j;
import pb1.C47453t0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.c1 */
public class C43576c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f117812d;

    /* renamed from: e */
    public final /* synthetic */ C43579d1.C43580a f117813e;

    public C43576c1(C43579d1.C43580a aVar, Bundle bundle) {
        this.f117813e = aVar;
        this.f117812d = bundle;
    }

    public void run() {
        int i = this.f117812d.getInt("fav_simple_img_result");
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = C43579d1.this.f117816a;
        ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(i, 34, (Activity) luggageWebViewLongClickHelper.f117787i.f148196d, luggageWebViewLongClickHelper.f117789k);
    }
}
