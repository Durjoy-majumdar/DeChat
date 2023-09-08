package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59670o2;
import gr1.C59675s2;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.u */
public final class C56748u implements C59675s2 {

    /* renamed from: a */
    public final /* synthetic */ FinderVideoRecycler f162654a;

    /* renamed from: b */
    public final /* synthetic */ C59670o2 f162655b;

    /* renamed from: c */
    public final /* synthetic */ long f162656c;

    /* renamed from: d */
    public final /* synthetic */ String f162657d;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.u$a */
    public static final class C56749a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162658d;

        /* renamed from: e */
        public final /* synthetic */ C59670o2 f162659e;

        /* renamed from: f */
        public final /* synthetic */ long f162660f;

        /* renamed from: g */
        public final /* synthetic */ String f162661g;

        public C56749a(FinderVideoRecycler finderVideoRecycler, C59670o2 o2Var, long j, String str) {
            this.f162658d = finderVideoRecycler;
            this.f162659e = o2Var;
            this.f162660f = j;
            this.f162661g = str;
        }

        public final void run() {
            FinderVideoRecycler.m65428c3(this.f162658d, this.f162659e);
            this.f162658d.f162541x.remove(Integer.valueOf(this.f162659e.hashCode()));
            Log.m105924i("Finder.VideoRecycler", "[releaseVideoView] completed! cost=" + (System.currentTimeMillis() - this.f162660f) + "ms, release view=" + this.f162659e.hashCode() + " source=" + this.f162661g);
        }
    }

    public C56748u(FinderVideoRecycler finderVideoRecycler, C59670o2 o2Var, long j, String str) {
        this.f162654a = finderVideoRecycler;
        this.f162655b = o2Var;
        this.f162656c = j;
        this.f162657d = str;
    }

    /* renamed from: a */
    public void mo80115a() {
        FinderVideoRecycler finderVideoRecycler = this.f162654a;
        finderVideoRecycler.f162528h.post(new C56749a(finderVideoRecycler, this.f162655b, this.f162656c, this.f162657d));
        ((FinderThumbPlayerProxy) this.f162655b).setOnPlayerStopListener((C59675s2) null);
    }
}
