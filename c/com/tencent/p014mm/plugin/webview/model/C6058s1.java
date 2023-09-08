package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import ke3.C88144b;
import vn2.C14913a;
import vn2.C14914d;

/* renamed from: com.tencent.mm.plugin.webview.model.s1 */
public class C6058s1 extends C14913a implements C14914d {
    /* renamed from: q */
    public void mo1972q(Context context, Intent intent) {
        intent.putExtra("type", 4);
        String str = "";
        intent.putExtra("id", str);
        try {
            str = URLDecoder.decode(IntentUtil.getStringExtra(intent, "ext_info"), "utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
        if (!Util.isNullOrNil(str)) {
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", str);
            intent2.putExtra("from_shortcut", true);
            intent2.addFlags(268435456);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
        }
    }
}
