package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.webview.model.p1 */
public class C6053p1 extends MAutoStorage<C6051o1> {

    /* renamed from: d */
    public static final String[] f22345d = {MAutoStorage.getCreateSQLs(C6051o1.f22344v, "WebviewLocalData")};

    public C6053p1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C6051o1.f22344v, "WebviewLocalData", (String[]) null);
    }
}
