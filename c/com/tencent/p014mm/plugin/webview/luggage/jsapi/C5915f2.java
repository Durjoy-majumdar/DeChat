package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f2 */
public class C5915f2 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ String f22145d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f22146e;

    /* renamed from: f */
    public final /* synthetic */ C43620m2.C5947b f22147f;

    public C5915f2(C5883b2 b2Var, String str, MMActivity mMActivity, C43620m2.C5947b bVar) {
        this.f22145d = str;
        this.f22146e = mMActivity;
        this.f22147f = bVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 2) {
            boolean z = false;
            if (i2 == -1) {
                z = true;
            }
            C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 3, z ? 48 : 56, 0, this.f22145d);
            this.f22146e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            this.f22147f.mo6945a((String) null, (JSONObject) null);
        }
    }
}
