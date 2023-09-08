package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.widget.input.C104930w0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.x0 */
public class C104935x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311576d;

    /* renamed from: e */
    public final /* synthetic */ String f311577e;

    /* renamed from: f */
    public final /* synthetic */ int f311578f;

    /* renamed from: g */
    public final /* synthetic */ int f311579g;

    /* renamed from: h */
    public final /* synthetic */ C104930w0.C104934d f311580h;

    public C104935x0(C104930w0.C104934d dVar, boolean z, String str, int i, int i2) {
        this.f311580h = dVar;
        this.f311576d = z;
        this.f311577e = str;
        this.f311578f = i;
        this.f311579g = i2;
    }

    public void run() {
        if (this.f311576d) {
            C104930w0.this.mo148919B(this.f311577e);
        } else {
            C104930w0.this.setText(this.f311577e);
        }
        try {
            C104930w0.this.setSelection(Math.min(this.f311578f + this.f311579g, this.f311577e.length()));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", e);
        }
    }
}
