package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.C2292b;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.a */
public class C2291a implements C2292b.C2293a {

    /* renamed from: a */
    public final /* synthetic */ Context f12436a;

    public C2291a(FaceAgreementUI faceAgreementUI, Context context) {
        this.f12436a = context;
    }

    /* renamed from: a */
    public void mo2185a(String str) {
        Log.m105925i("MicroMsg.FaceAgreementUI", "click %s", str);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(this.f12436a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
