package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e1 */
public class C82426e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f241514d;

    public C82426e1(C82429f1 f1Var, Activity activity) {
        this.f241514d = activity;
    }

    public void run() {
        Activity activity = this.f241514d;
        C75026b.m89951a(activity, activity.getString(C0966R.string.cph));
    }
}
