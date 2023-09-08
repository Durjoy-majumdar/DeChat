package com.tencent.p014mm.plugin.finder.live.model;

import b50.C54405b;
import b50.C54412f;
import j50.C60735a;

/* renamed from: com.tencent.mm.plugin.finder.live.model.b */
public final class C55933b implements Runnable {

    /* renamed from: d */
    public static final C55933b f159413d = new C55933b();

    public final void run() {
        C54405b bVar;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null && (bVar = aVar.f173032r) != null) {
            ((C54412f) bVar).mo75189c(finderLiveService.mo77650x());
        }
    }
}
