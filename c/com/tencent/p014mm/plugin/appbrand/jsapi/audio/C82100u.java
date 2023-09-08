package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import eb0.C86493v0;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.u */
public class C82100u implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ MainProcessTask f240749d;

    /* renamed from: e */
    public final /* synthetic */ String f240750e;

    public C82100u(JsApiSetBackgroundAudioStateWC jsApiSetBackgroundAudioStateWC, MainProcessTask mainProcessTask, String str) {
        this.f240749d = mainProcessTask;
        this.f240750e = str;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.DESTROYED == bVar) {
            this.f240749d.mo114397h();
            C86493v0.C86495c e = C86493v0.m107224d().mo120948e(this.f240750e);
            if (e != null) {
                e.mo120961h();
            }
        }
    }
}
