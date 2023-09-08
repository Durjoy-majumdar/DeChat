package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.ui.i2 */
public class C74782i2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f219905d;

    public C74782i2(Activity activity) {
        this.f219905d = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C115669n.INSTANCE.idkeyStat(405, 37, 1, true);
        this.f219905d.finish();
        MMAppMgr.m85985e(this.f219905d, true);
    }
}
