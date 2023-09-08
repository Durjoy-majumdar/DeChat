package com.tencent.p014mm.plugin.webview.luggage;

import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$a */
public final /* synthetic */ class n$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43658n f117959d;

    /* renamed from: e */
    public final /* synthetic */ String f117960e;

    /* renamed from: f */
    public final /* synthetic */ Map f117961f;

    /* renamed from: g */
    public final /* synthetic */ String f117962g;

    public /* synthetic */ n$$a(C43658n nVar, String str, Map map, String str2) {
        this.f117959d = nVar;
        this.f117960e = str;
        this.f117961f = map;
        this.f117962g = str2;
    }

    public final void run() {
        C43658n nVar = this.f117959d;
        String str = this.f117960e;
        Map map = this.f117961f;
        String str2 = this.f117962g;
        nVar.f148259i.f148252s = false;
        if (!nVar.mo65778B(str) && !nVar.f117938W && !nVar.f117927Q0) {
            if (map == null || map.size() <= 0) {
                nVar.f148259i.mo73821i(str2);
            } else {
                nVar.f148259i.f148245i.loadUrl(str2, map);
            }
        }
    }
}
