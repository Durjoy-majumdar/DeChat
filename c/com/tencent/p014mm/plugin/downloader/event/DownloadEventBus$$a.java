package com.tencent.p014mm.plugin.downloader.event;

import p237sp.C36768q;
import p261wl.C15510f;
import p261wl.C38172g;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.event.DownloadEventBus$$a */
public final /* synthetic */ class DownloadEventBus$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ int f110056a;

    /* renamed from: b */
    public final /* synthetic */ C53736a f110057b;

    public /* synthetic */ DownloadEventBus$$a(int i, C53736a aVar) {
        this.f110056a = i;
        this.f110057b = aVar;
    }

    public final boolean invoke(C15510f fVar) {
        ((C36768q.C36771c) fVar).mo5418f(this.f110056a, this.f110057b.field_downloadId);
        return false;
    }
}
