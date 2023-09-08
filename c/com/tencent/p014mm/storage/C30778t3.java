package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import g62.C75882t;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.t3 */
public class C30778t3 extends MAutoStorage<C30776s3> implements C75882t {

    /* renamed from: e */
    public static final String[] f82757e = {MAutoStorage.getCreateSQLs(C30776s3.f82755L, "GetSysCmdMsgInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f82758d;

    public C30778t3(C91753f fVar) {
        super(fVar, C30776s3.f82755L, "GetSysCmdMsgInfo", (String[]) null);
        this.f82758d = fVar;
    }
}
