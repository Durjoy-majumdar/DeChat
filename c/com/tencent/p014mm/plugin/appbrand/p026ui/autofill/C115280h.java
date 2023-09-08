package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.h */
public class C115280h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f345490d;

    /* renamed from: e */
    public final /* synthetic */ String f345491e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandIDCardUI.C115267a f345492f;

    public C115280h(AppBrandIDCardUI.C115267a aVar, int i, String str) {
        this.f345492f = aVar;
        this.f345490d = i;
        this.f345491e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra("intent_err_code", Util.nullAsInt(Integer.valueOf(this.f345490d), 0));
        intent.putExtra("intent_err_msg", Util.nullAsNil(this.f345491e));
        AppBrandIDCardUI.this.setResult(1, intent);
        AppBrandIDCardUI.this.finish();
    }
}
