package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f23.C97814a;
import p232rw.C63679m;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.ui.o */
public final class C56405o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f161251d;

    public C56405o(String str) {
        this.f161251d = str;
    }

    public final void run() {
        C63679m.C63680a UU = ((C63679m) C86312j.m106911c(C63679m.class)).mo88484UU(this.f161251d, true);
        if (!(UU != null && UU.f180535k == -1)) {
            MultiMediaVideoChecker multiMediaVideoChecker = MultiMediaVideoChecker.f273077a;
            if (!C64197v.m75537f(0, 12, 35, 54, 55, 69, 70, 71, 72, 72, 95, 96, 101, 102, 107, 108, 129, 130, 133, 134).contains(Integer.valueOf(UU != null ? UU.f180535k : 0))) {
                StringBuilder sb = new StringBuilder();
                sb.append("select invalid pixelFormat video:");
                sb.append(UU != null ? Integer.valueOf(UU.f180535k) : null);
                Log.m105924i("Finder.AlbumUI", sb.toString());
                C97814a aVar = C97814a.f286944a;
                C115669n.INSTANCE.mo175913w(1371, 127, 1);
            }
        }
    }
}
