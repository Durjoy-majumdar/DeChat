package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.x0 */
public class C30170x0 extends MAutoStorage<C30167w0> {

    /* renamed from: e */
    public static final String[] f81556e = {MAutoStorage.getCreateSQLs(C30167w0.f81551D, "LuckyMoneyEnvelopeResource")};

    /* renamed from: d */
    public ISQLiteDatabase f81557d;

    public C30170x0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30167w0.f81551D, "LuckyMoneyEnvelopeResource", (String[]) null);
        this.f81557d = iSQLiteDatabase;
    }
}
