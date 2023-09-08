package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$a */
public final /* synthetic */ class AppBrandAuthorizeUI$$a implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f49780d;

    /* renamed from: e */
    public final /* synthetic */ int f49781e;

    public /* synthetic */ AppBrandAuthorizeUI$$a(AppBrandAuthorizeUI appBrandAuthorizeUI, int i) {
        this.f49780d = appBrandAuthorizeUI;
        this.f49781e = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f49780d;
        int i3 = this.f49781e;
        String[] strArr = AppBrandAuthorizeUI.f49731X;
        appBrandAuthorizeUI.getClass();
        if (i == 4 && i2 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", i3)) != i3) {
            appBrandAuthorizeUI.f49773y = true;
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, change bluetooth state to:%s", Integer.valueOf(intExtra));
            appBrandAuthorizeUI.mo22480b8(intExtra);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("scope.bluetooth");
            arrayList.add("scope.bluetoothBackground");
            appBrandAuthorizeUI.mo22476X7(arrayList, new C18040r(appBrandAuthorizeUI, intExtra, i3));
        }
    }
}
