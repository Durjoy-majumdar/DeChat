package com.tencent.p014mm.plugin.emoji.model;

import a14.C53930o0;
import android.content.DialogInterface;
import java.util.concurrent.CancellationException;

/* renamed from: com.tencent.mm.plugin.emoji.model.i */
public final class C41049i implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C41045h f110527d;

    public C41049i(C41045h hVar) {
        this.f110527d = hVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C53930o0.m60558e(this.f110527d.f110516d, (CancellationException) null, 1, (Object) null);
    }
}
