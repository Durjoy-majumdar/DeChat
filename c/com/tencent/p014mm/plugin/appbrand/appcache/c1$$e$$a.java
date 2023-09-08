package com.tencent.p014mm.plugin.appbrand.appcache;

import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c1$$e$$a */
public final /* synthetic */ class c1$$e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ICommLibReader f238627d;

    public /* synthetic */ c1$$e$$a(ICommLibReader iCommLibReader) {
        this.f238627d = iCommLibReader;
    }

    public final void run() {
        ICommLibReader iCommLibReader = this.f238627d;
        Toast.makeText(MMApplicationContext.getContext(), MMApplicationContext.getString(C0966R.string.m1g, iCommLibReader.mo113367M()), 0).show();
    }
}
