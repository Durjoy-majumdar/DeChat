package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.offline.ui.p */
public class C42594p implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f115257d;

    /* renamed from: e */
    public final /* synthetic */ String f115258e;

    public C42594p(Activity activity, String str) {
        this.f115257d = activity;
        this.f115258e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C75228t.m90219L(this.f115257d, this.f115258e, true);
        C75228t.m90243e0(3, 1);
        dialogInterface.dismiss();
    }
}
