package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.ui.b0 */
public class C44707b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f121229d;

    /* renamed from: e */
    public final /* synthetic */ Intent f121230e;

    public C44707b0(Context context, Intent intent) {
        this.f121229d = context;
        this.f121230e = intent;
    }

    public void run() {
        try {
            Context context = this.f121229d;
            ((C79138l) C86312j.m106911c(C79138l.class)).mo74000Sy(context, this.f121230e, context.getString(C0966R.string.cbe));
        } catch (Throwable unused) {
        }
    }
}
