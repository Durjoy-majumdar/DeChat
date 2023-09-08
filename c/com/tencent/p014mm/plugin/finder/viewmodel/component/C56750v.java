package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59670o2;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.v */
public final class C56750v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoRecycler f162662d;

    /* renamed from: e */
    public final /* synthetic */ C59670o2 f162663e;

    /* renamed from: f */
    public final /* synthetic */ long f162664f;

    /* renamed from: g */
    public final /* synthetic */ String f162665g;

    public C56750v(FinderVideoRecycler finderVideoRecycler, C59670o2 o2Var, long j, String str) {
        this.f162662d = finderVideoRecycler;
        this.f162663e = o2Var;
        this.f162664f = j;
        this.f162665g = str;
    }

    public final void run() {
        FinderVideoRecycler.m65428c3(this.f162662d, this.f162663e);
        this.f162662d.f162541x.remove(Integer.valueOf(this.f162663e.hashCode()));
        Log.m105924i("Finder.VideoRecycler", "[releaseVideoView] completed! cost=" + (System.currentTimeMillis() - this.f162664f) + "ms, release view=" + this.f162663e.hashCode() + " source=" + this.f162665g);
    }
}
