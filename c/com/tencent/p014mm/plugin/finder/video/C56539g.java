package com.tencent.p014mm.plugin.finder.video;

import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import e03.C20503g;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.mm.plugin.finder.video.g */
public final class C56539g implements C20503g {

    /* renamed from: a */
    public final /* synthetic */ FinderThumbPlayerProxy f161979a;

    /* renamed from: b */
    public final /* synthetic */ int f161980b;

    /* renamed from: c */
    public final /* synthetic */ FinderThumbPlayerProxy.C56502b f161981c;

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f161982d;

    public C56539g(FinderThumbPlayerProxy finderThumbPlayerProxy, int i, FinderThumbPlayerProxy.C56502b bVar, CountDownLatch countDownLatch) {
        this.f161979a = finderThumbPlayerProxy;
        this.f161980b = i;
        this.f161981c = bVar;
        this.f161982d = countDownLatch;
    }

    /* renamed from: a */
    public void mo32065a(int i) {
        if (i != 0) {
            String fTPPTag = this.f161979a.getFTPPTag();
            Log.m105928w(fTPPTag, "requestedResource fileId:" + this.f161980b + " requestVideoData fail, ret:" + i + ' ' + this);
            this.f161981c.mo79495d(false);
        } else {
            String fTPPTag2 = this.f161979a.getFTPPTag();
            Log.m105928w(fTPPTag2, "requestedResource fileId:" + this.f161980b + " requestVideoData success, ret:" + i + ' ' + this);
            this.f161981c.mo79495d(true);
        }
        this.f161982d.countDown();
    }
}
