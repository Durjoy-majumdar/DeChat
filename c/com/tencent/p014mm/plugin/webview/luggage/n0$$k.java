package com.tencent.p014mm.plugin.webview.luggage;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$k */
public class n0$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f118020d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f118021e;

    /* renamed from: f */
    public final /* synthetic */ String f118022f;

    /* renamed from: g */
    public final /* synthetic */ int f118023g;

    /* renamed from: h */
    public final /* synthetic */ boolean f118024h;

    /* renamed from: i */
    public final /* synthetic */ C43661n0 f118025i;

    public n0$$k(C43661n0 n0Var, boolean z, Bitmap bitmap, String str, int i, boolean z2) {
        this.f118025i = n0Var;
        this.f118020d = z;
        this.f118021e = bitmap;
        this.f118022f = str;
        this.f118023g = i;
        this.f118024h = z2;
    }

    public void run() {
        C43661n0 n0Var = this.f118025i;
        if (n0Var != null && n0Var.f117992e != null) {
            if (this.f118020d) {
                n0Var.mo67957a(true);
                return;
            }
            n0Var.mo67957a(false);
            C43661n0 n0Var2 = this.f118025i;
            if (n0Var2.f118000p != null && n0Var2.f118001q != null) {
                n0Var2.f118007w = false;
                Bitmap bitmap = this.f118021e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f118025i.f118000p.setVisibility(0);
                    this.f118025i.f118000p.setImageBitmap(this.f118021e);
                    this.f118025i.f118001q.setVisibility(8);
                    this.f118025i.f118007w = true;
                } else if (!Util.isNullOrNil(this.f118022f)) {
                    this.f118025i.f118000p.setVisibility(8);
                    this.f118025i.f118001q.setVisibility(0);
                    this.f118025i.f118001q.setText(this.f118022f);
                    int i = this.f118023g;
                    if (i != -1) {
                        this.f118025i.f118001q.setTextColor(i);
                    }
                }
                if (this.f118024h) {
                    C43661n0 n0Var3 = this.f118025i;
                    n0Var3.f118000p.setOnClickListener(n0Var3.f117990E);
                    C43661n0 n0Var4 = this.f118025i;
                    n0Var4.f118001q.setOnClickListener(n0Var4.f117990E);
                }
            }
        }
    }
}
