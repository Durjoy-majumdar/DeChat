package com.tencent.p014mm.plugin.webview.luggage;

import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.luggage.c0 */
public class C43575c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f117808d;

    /* renamed from: e */
    public final /* synthetic */ String f117809e;

    /* renamed from: f */
    public final /* synthetic */ Map f117810f;

    /* renamed from: g */
    public final /* synthetic */ n$$c f117811g;

    public C43575c0(n$$c n__c, String str, String str2, Map map) {
        this.f117811g = n__c;
        this.f117808d = str;
        this.f117809e = str2;
        this.f117810f = map;
    }

    public void run() {
        this.f117811g.f117964a.mo65785L(this.f117808d, this.f117809e, this.f117810f);
    }
}
