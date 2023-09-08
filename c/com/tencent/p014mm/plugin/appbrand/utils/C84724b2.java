package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.b2 */
public final class C84724b2 implements AutoCloseable {

    /* renamed from: d */
    public final ISQLiteDatabase f247118d;

    /* renamed from: e */
    public final long f247119e;

    public C84724b2(ISQLiteDatabase iSQLiteDatabase, long j, C8480h hVar) {
        this.f247118d = iSQLiteDatabase;
        this.f247119e = j;
    }

    public void close() {
        this.f247118d.endTransaction(this.f247119e);
    }
}
