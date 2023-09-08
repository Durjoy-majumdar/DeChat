package com.tencent.p014mm.plugin.ext.qrcode;

import com.tencent.p014mm.sdk.platformtools.SyncTask;
import f40.C86709a0;
import za1.C53766a;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.h */
public class C41392h extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ String f111437a;

    /* renamed from: b */
    public final /* synthetic */ int f111438b;

    /* renamed from: c */
    public final /* synthetic */ int f111439c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41392h(C93387f fVar, long j, Boolean bool, boolean z, String str, int i, int i2) {
        super(j, bool, z);
        this.f111437a = str;
        this.f111438b = i;
        this.f111439c = i2;
    }

    public Object run() {
        C86709a0.m107529k().f251779b.mo123455a(782, new C41391g(this));
        C86709a0.m107529k().f251779b.mo123460f(new C53766a(this.f111437a, this.f111438b, this.f111439c));
        return Boolean.TRUE;
    }
}
