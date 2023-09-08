package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.DialogInterface;
import d62.C45286l;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.fts.ui.p */
public class C68990p implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C45286l f198237d;

    /* renamed from: e */
    public final /* synthetic */ FTSBaseMainUI f198238e;

    public C68990p(FTSBaseMainUI fTSBaseMainUI, C45286l lVar) {
        this.f198238e = fTSBaseMainUI;
        this.f198237d = lVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f198237d);
        this.f198238e.f52742z = null;
    }
}
