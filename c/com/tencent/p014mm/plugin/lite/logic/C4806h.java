package com.tencent.p014mm.plugin.lite.logic;

import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import nj3.C76912y0;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.lite.logic.h */
public class C4806h implements C115477b {

    /* renamed from: a */
    public final /* synthetic */ String[] f19839a;

    /* renamed from: b */
    public final /* synthetic */ String f19840b;

    public C4806h(C115484j jVar, String[] strArr, String str) {
        this.f19839a = strArr;
        this.f19840b = str;
    }

    /* renamed from: a */
    public void mo5700a(String str, int i) {
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "下载失败", 0).show();
    }

    /* renamed from: b */
    public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("appId", wxaLiteAppInfo.f339290d);
        String str2 = this.f19839a[0];
        if (str2 != null) {
            bundle.putString("path", str2);
        }
        String str3 = this.f19839a[1];
        if (str3 != null) {
            bundle.putString(SearchIntents.EXTRA_QUERY, str3);
        }
        if (!"".equals(this.f19840b) && (str = this.f19840b) != null) {
            bundle.putString("qr_url_query_string", str);
        }
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, false, (C14088e.C14090b) null);
    }
}
