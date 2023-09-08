package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.s0 */
public class C68658s0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Context f197211d;

    /* renamed from: e */
    public final /* synthetic */ C77390c0 f197212e;

    public C68658s0(Context context, C77390c0 c0Var) {
        this.f197211d = context;
        this.f197212e = c0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f197211d);
        if (castActivityOrNull != null) {
            castActivityOrNull.finish();
        }
        this.f197212e.setOnCancelListener((DialogInterface.OnCancelListener) null);
    }
}
