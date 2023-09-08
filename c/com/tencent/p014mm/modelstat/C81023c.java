package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: com.tencent.mm.modelstat.c */
public class C81023c extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C81016b f237991a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81023c(C81016b bVar, long j, Boolean bool) {
        super(j, bool);
        this.f237991a = bVar;
    }

    public Object run() {
        C81016b.m98926b(this.f237991a);
        return Boolean.TRUE;
    }
}
