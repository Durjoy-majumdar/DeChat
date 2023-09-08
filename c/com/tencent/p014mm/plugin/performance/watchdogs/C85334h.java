package com.tencent.p014mm.plugin.performance.watchdogs;

import android.content.Context;
import android.content.Intent;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.h */
public final class C85334h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f248666d;

    /* renamed from: e */
    public final /* synthetic */ int f248667e;

    /* renamed from: f */
    public final /* synthetic */ long f248668f;

    /* renamed from: g */
    public final /* synthetic */ Intent f248669g;

    public C85334h(Context context, int i, long j, Intent intent) {
        this.f248666d = context;
        this.f248667e = i;
        this.f248668f = j;
        this.f248669g = intent;
    }

    public final void run() {
        Context context = this.f248666d;
        C87412m.m108593f(context, "context");
        int i = this.f248667e;
        StringBuilder sb = new StringBuilder();
        sb.append("当前 Java Runtime 内存 ");
        C85331g gVar = C85331g.f248653a;
        sb.append(C85331g.m105347a(gVar, this.f248668f));
        sb.append("MB 超过阈值 ");
        sb.append(C85331g.m105347a(gVar, C85331g.f248657e - 52428800));
        sb.append("MB");
        C85336j.m105351a(context, i, sb.toString(), "点击转发 HPROF 文件，如有疑问请联系 @aurorani", this.f248669g);
    }
}
