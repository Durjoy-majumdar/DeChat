package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.j */
public class C115902j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f347772d;

    /* renamed from: e */
    public final /* synthetic */ C85639p f347773e;

    /* renamed from: f */
    public final /* synthetic */ String f347774f;

    public C115902j(C115905m mVar, List list, C85639p pVar, String str) {
        this.f347772d = list;
        this.f347773e = pVar;
        this.f347774f = str;
    }

    public void run() {
        for (C115899e eVar : this.f347772d) {
            if (Util.nullAsNil(eVar.getGroupId()).equals(this.f347773e.f249597f)) {
                eVar.mo176431c(this.f347774f, this.f347773e);
            }
        }
    }
}
