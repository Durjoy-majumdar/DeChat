package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import je1.C9360p1;
import te3.C49335eu3;
import u60.C14121l;
import u60.C65233m;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.a0 */
public final class C2777a0 implements C9360p1.C9362b {

    /* renamed from: a */
    public final /* synthetic */ FinderLbsLoader.C2700c f13953a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f13954b;

    public C2777a0(FinderLbsLoader.C2700c cVar, C14121l lVar) {
        this.f13953a = cVar;
        this.f13954b = lVar;
    }

    /* renamed from: a */
    public boolean mo2804a(int i, int i2, String str, C49335eu3 eu32) {
        C87412m.m108594g(eu32, "resp");
        C65233m mVar = this.f13953a.f13672d;
        if (mVar != null && mVar.f187773f == this.f13954b.f39521h) {
            return false;
        }
        this.f13954b.mo11853b(C65234n.OK);
        String tag = this.f13953a.getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("[isFetchConsume] executorToken=");
        C65233m mVar2 = this.f13953a.f13672d;
        sb.append(mVar2 != null ? Integer.valueOf(mVar2.f187773f) : null);
        sb.append(" taskToken=");
        sb.append(this.f13954b.f39521h);
        Log.m105928w(tag, sb.toString());
        return true;
    }
}
