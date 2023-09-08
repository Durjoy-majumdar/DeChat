package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43638d;
import nj3.C76879j;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.c */
public class C43636c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f117895d;

    /* renamed from: e */
    public final /* synthetic */ C43638d.C43639a f117896e;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.c$a */
    public class C43637a implements DialogInterface.OnClickListener {
        public C43637a(C43636c cVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C43636c(C43638d.C43639a aVar, boolean z) {
        this.f117896e = aVar;
        this.f117895d = z;
    }

    public void run() {
        if (this.f117895d) {
            C76879j.m92744o(this.f117896e.f117898e, C0966R.string.llb, C0966R.string.a3h, false, new C43637a(this));
            return;
        }
        Context context = this.f117896e.f117898e;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lla), 0).show();
    }
}
