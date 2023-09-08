package com.tencent.p014mm.pluginsdk.model.app;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ld2.C46848g;
import ob0.C89137b0;
import p763ym.C39070r;

/* renamed from: com.tencent.mm.pluginsdk.model.app.a1 */
public class C115863a1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C115864b1 f347635d;

    public C115863a1(C115864b1 b1Var) {
        this.f347635d = b1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105928w("MicroMsg.LoadAppInfoAfterLogin", "do init canceled");
        C89137b0 d = C86709a0.m107524d();
        this.f347635d.getClass();
        d.getClass();
        C46848g.yx0().mo69347a(7, this.f347635d);
        C39070r.C39071a aVar = this.f347635d.f347636d;
        if (aVar != null) {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            simpleLoginUI.mo7681K7(-1);
        }
    }
}
