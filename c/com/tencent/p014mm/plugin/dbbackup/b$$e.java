package com.tencent.p014mm.plugin.dbbackup;

import android.content.DialogInterface;
import com.tencent.wcdb.support.CancellationSignal;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$e */
public final /* synthetic */ class b$$e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f345839d;

    public /* synthetic */ b$$e(CancellationSignal cancellationSignal) {
        this.f345839d = cancellationSignal;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f345839d.cancel();
    }
}
