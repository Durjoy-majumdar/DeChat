package vl2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ScanMaterialCodeEvent;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p275xz.C15919f;
import p910lj.C76701a;

public class j$$w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102212j f300985d;

    /* renamed from: e */
    public final /* synthetic */ ScanMaterialCodeEvent f300986e;

    /* renamed from: f */
    public final /* synthetic */ Context f300987f;

    /* renamed from: g */
    public final /* synthetic */ int f300988g;

    /* renamed from: h */
    public final /* synthetic */ String f300989h;

    /* renamed from: i */
    public final /* synthetic */ int f300990i;

    public j$$w(C102212j jVar, ScanMaterialCodeEvent scanMaterialCodeEvent, Context context, int i, String str, int i2) {
        this.f300985d = jVar;
        this.f300986e = scanMaterialCodeEvent;
        this.f300987f = context;
        this.f300988g = i;
        this.f300989h = str;
        this.f300990i = i2;
    }

    public void run() {
        if (!Util.isNullOrNil(this.f300986e.f265076e.f265082a)) {
            Context context = this.f300987f;
            if (context != null) {
                C76701a.makeText(context, (CharSequence) this.f300986e.f265076e.f265082a, 1).show();
            }
            this.f300985d.mo141750n(false, (Bundle) null);
        } else if (Util.isNullOrNil(this.f300986e.f265076e.f265084c)) {
            Log.m105928w("MicroMsg.QBarStringHandler", "resp url is null!");
            this.f300985d.mo141750n(false, (Bundle) null);
        } else if (this.f300986e.f265076e.f265083b == 1) {
            ((C15919f) C86312j.m106911c(C15919f.class)).lm0(this.f300987f, this.f300986e.f265076e.f265084c, this.f300988g, this.f300989h, this.f300990i, (Bundle) null);
            this.f300985d.mo141750n(true, (Bundle) null);
        } else {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f300986e.f265076e.f265084c);
            ((C67654r1) C5176w.m5203a()).mo93190w(intent, this.f300987f);
            this.f300985d.mo141750n(true, (Bundle) null);
        }
    }
}
