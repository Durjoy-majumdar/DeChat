package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$m */
public class n$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f117980d;

    /* renamed from: e */
    public final /* synthetic */ int f117981e;

    /* renamed from: f */
    public final /* synthetic */ C43658n f117982f;

    public n$$m(C43658n nVar, String str, int i) {
        this.f117982f = nVar;
        this.f117980d = str;
        this.f117981e = i;
    }

    public void run() {
        if (this.f117982f.f117951u != null) {
            if (!Util.isNullOrNil(this.f117980d)) {
                this.f117982f.f117951u.setTitleText(this.f117980d);
            }
            int i = this.f117981e;
            if (i != 0) {
                this.f117982f.f117951u.setTitleColor(i);
            }
        }
    }
}
