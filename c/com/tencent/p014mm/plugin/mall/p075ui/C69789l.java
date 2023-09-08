package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.DialogInterface;
import c63.C67345b;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C64891zq1;

/* renamed from: com.tencent.mm.plugin.mall.ui.l */
public class C69789l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64891zq1 f201396d;

    /* renamed from: e */
    public final /* synthetic */ int f201397e;

    /* renamed from: f */
    public final /* synthetic */ MallIndexBaseUIv2$$d f201398f;

    public C69789l(MallIndexBaseUIv2$$d mallIndexBaseUIv2$$d, C64891zq1 zq12, int i) {
        this.f201398f = mallIndexBaseUIv2$$d;
        this.f201396d = zq12;
        this.f201397e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "onFunctionItemClick: onClick");
        C67345b.C0426a.m370b(this.f201396d.f186829d.f184923d + "");
        MallIndexBaseUIv2.m82089I7(this.f201398f.f201200a, this.f201396d, this.f201397e);
    }
}
