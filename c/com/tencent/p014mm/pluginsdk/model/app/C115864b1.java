package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ld2.C46848g;
import p763ym.C39070r;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.pluginsdk.model.app.b1 */
public final class C115864b1 implements C44583u0 {

    /* renamed from: d */
    public C39070r.C39071a f347636d;

    /* renamed from: e */
    public Context f347637e;

    /* renamed from: f */
    public C89779i0 f347638f;

    public C115864b1(Context context, C39070r.C39071a aVar) {
        this.f347637e = context;
        this.f347636d = aVar;
    }

    /* renamed from: c3 */
    public void mo69343c3(int i, int i2, String str, C44549d1 d1Var) {
        Log.m105925i("MicroMsg.LoadAppInfoAfterLogin", "OnScenEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        C46848g.yx0().mo69347a(7, this);
        C89779i0 i0Var = this.f347638f;
        if (i0Var != null && i0Var.isShowing()) {
            this.f347638f.dismiss();
            this.f347638f = null;
        }
        C39070r.C39071a aVar = this.f347636d;
        if (aVar != null) {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i3 = SimpleLoginUI.f345053v;
            simpleLoginUI.mo7681K7(-1);
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference != null) {
            defaultPreference.edit().putString("key_app_ids_registion_while_not_login", "").commit();
        }
    }
}
