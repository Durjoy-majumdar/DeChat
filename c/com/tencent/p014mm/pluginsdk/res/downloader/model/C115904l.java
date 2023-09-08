package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.l */
public class C115904l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f347778d;

    /* renamed from: e */
    public final /* synthetic */ C85639p f347779e;

    /* renamed from: f */
    public final /* synthetic */ String f347780f;

    public C115904l(C115905m mVar, List list, C85639p pVar, String str) {
        this.f347778d = list;
        this.f347779e = pVar;
        this.f347780f = str;
    }

    public void run() {
        for (C115899e eVar : this.f347778d) {
            if (Util.nullAsNil(eVar.getGroupId()).equals(this.f347779e.f249597f)) {
                eVar.mo176429a(this.f347780f, this.f347779e);
            }
        }
    }
}
