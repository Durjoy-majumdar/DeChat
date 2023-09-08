package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82807l;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n */
public class C82814n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C46888b f242202d;

    public C82814n(C82807l.C82812d dVar, C46888b bVar) {
        this.f242202d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f242202d.mo72091a(new Exception("cancel"));
    }
}
