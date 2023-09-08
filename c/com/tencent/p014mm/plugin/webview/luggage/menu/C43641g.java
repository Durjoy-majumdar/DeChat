package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.FavUrlTask;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.g */
public class C43641g implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ C43658n f117899a;

    public C43641g(C43642h hVar, C43658n nVar) {
        this.f117899a = nVar;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        if (i2 == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong("fav_local_id", this.f117899a.f148261n.getLong("fav_local_id", -1));
            FavUrlTask favUrlTask = new FavUrlTask();
            favUrlTask.f283014f = 4;
            favUrlTask.f283015g = bundle;
            favUrlTask.mo114396f();
            if (favUrlTask.f283017i) {
                this.f117899a.mo67938q(true);
            }
        }
    }
}
