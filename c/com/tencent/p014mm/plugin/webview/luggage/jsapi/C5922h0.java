package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import p156gj.C87203t;
import p168i6.C87663a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.h0 */
public class C5922h0 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "getSystemInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("cpuCores", Integer.valueOf(C87663a.m109020d()));
        hashMap.put("cpuFreqHz", Integer.valueOf(C87663a.m109018b()));
        hashMap.put("memory", Long.valueOf(C87663a.m109021e(MMApplicationContext.getContext())));
        hashMap.put("brand", Build.BRAND);
        hashMap.put("model", C87203t.m108275k());
        aVar.mo73779d(hashMap);
    }
}
