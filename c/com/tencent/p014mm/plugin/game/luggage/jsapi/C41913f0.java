package com.tencent.p014mm.plugin.game.luggage.jsapi;

import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.wepkg.event.C44476a;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.f0 */
public class C41913f0 implements C44476a {

    /* renamed from: a */
    public final /* synthetic */ String f112919a;

    /* renamed from: b */
    public final /* synthetic */ C43620m2.C5947b f112920b;

    /* renamed from: c */
    public final /* synthetic */ C41911e0 f112921c;

    public C41913f0(C41911e0 e0Var, String str, C43620m2.C5947b bVar) {
        this.f112921c = e0Var;
        this.f112919a = str;
        this.f112920b = bVar;
    }

    public void notify(Object obj) {
        if ((obj instanceof DownloadBigPkgCompleteNotify) && this.f112919a.equals(((DownloadBigPkgCompleteNotify) obj).f120600d)) {
            C44478c.m48835b(this.f112921c.f112914e);
            this.f112920b.mo6945a((String) null, this.f112921c.mo65754f(this.f112919a));
            ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.JsApiGetWepkgFileList");
        }
    }
}
