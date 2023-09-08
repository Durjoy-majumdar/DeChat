package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import c63.C67345b;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C64891zq1;

/* renamed from: com.tencent.mm.plugin.mall.ui.m */
public class C69790m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C64891zq1 f201399d;

    public C69790m(MallIndexBaseUIv2$$d mallIndexBaseUIv2$$d, C64891zq1 zq12) {
        this.f201399d = zq12;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "onFunctionItemClick: onCancel");
        C67345b.C0426a.m370b(this.f201399d.f186829d.f184923d + "");
    }
}
