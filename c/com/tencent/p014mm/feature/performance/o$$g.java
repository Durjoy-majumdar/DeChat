package com.tencent.p014mm.feature.performance;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.feature.performance.o$$g */
public final /* synthetic */ class o$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f10307d;

    /* renamed from: e */
    public final /* synthetic */ C86009m1 f10308e;

    public /* synthetic */ o$$g(long j, C86009m1 m1Var) {
        this.f10307d = j;
        this.f10308e = m1Var;
    }

    public final void run() {
        long j = this.f10307d;
        C86009m1 m1Var = this.f10308e;
        Context context = MMApplicationContext.getContext();
        C76701a.makeText(context, (CharSequence) "Done. cost " + (System.currentTimeMillis() - j) + "ms, file:\n" + m1Var.mo119971i(), 1).show();
    }
}
