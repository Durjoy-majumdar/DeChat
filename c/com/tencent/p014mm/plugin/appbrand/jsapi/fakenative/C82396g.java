package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.g */
public class C82396g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f241458d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface.OnCancelListener f241459e;

    /* renamed from: f */
    public final /* synthetic */ C82398i f241460f;

    public C82396g(C82398i iVar, Context context, DialogInterface.OnCancelListener onCancelListener) {
        this.f241460f = iVar;
        this.f241458d = context;
        this.f241459e = onCancelListener;
    }

    public void run() {
        C82398i iVar = this.f241460f;
        iVar.getClass();
        MMHandlerThread.postToMainThread(new C82397h(iVar));
        Context context = this.f241458d;
        if (context != null) {
            this.f241460f.f241463h = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f241458d.getString(C0966R.string.a4d), true, true, this.f241459e);
        }
    }
}
