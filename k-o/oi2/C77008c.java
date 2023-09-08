package oi2;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceAdapterUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import yq3.C79148e;

/* renamed from: oi2.c */
public class C77008c extends C79148e {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.RemittanceProcess", "start Process : RemittanceProcess");
        mo109103B(activity, RemittanceAdapterUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "RemittanceProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109109g(activity);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
