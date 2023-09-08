package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.k */
public class C115903k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f347775d;

    /* renamed from: e */
    public final /* synthetic */ C85639p f347776e;

    /* renamed from: f */
    public final /* synthetic */ String f347777f;

    public C115903k(C115905m mVar, List list, C85639p pVar, String str) {
        this.f347775d = list;
        this.f347776e = pVar;
        this.f347777f = str;
    }

    public void run() {
        for (C115899e eVar : this.f347775d) {
            if (Util.nullAsNil(eVar.getGroupId()).equals(this.f347776e.f249597f)) {
                eVar.mo176430b(this.f347777f, this.f347776e);
            }
        }
    }
}
