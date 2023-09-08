package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import je1.C9360p1;
import te3.C49335eu3;
import u60.C14121l;
import u60.C65233m;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.h */
public final class C3349h implements C9360p1.C9362b {

    /* renamed from: a */
    public final /* synthetic */ NearbyVideoFeedLoader.C3330a f15798a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f15799b;

    public C3349h(NearbyVideoFeedLoader.C3330a aVar, C14121l lVar) {
        this.f15798a = aVar;
        this.f15799b = lVar;
    }

    /* renamed from: a */
    public boolean mo2804a(int i, int i2, String str, C49335eu3 eu32) {
        C87412m.m108594g(eu32, "resp");
        C65233m mVar = this.f15798a.f15765f;
        if (mVar != null && mVar.f187773f == this.f15799b.f39521h) {
            return false;
        }
        this.f15799b.mo11853b(C65234n.OK);
        String tag = this.f15798a.getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("[isFetchConsume] executorToken=");
        C65233m mVar2 = this.f15798a.f15765f;
        sb.append(mVar2 != null ? Integer.valueOf(mVar2.f187773f) : null);
        sb.append(" taskToken=");
        sb.append(this.f15799b.f39521h);
        Log.m105928w(tag, sb.toString());
        return true;
    }
}
