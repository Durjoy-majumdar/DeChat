package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.b0 */
public class C6079b0 extends MAutoStorage<C6081p> {

    /* renamed from: e */
    public static final String[] f22403e = {MAutoStorage.getCreateSQLs(C6081p.f22413p, "WebViewHostsFilter")};

    /* renamed from: d */
    public final ISQLiteDatabase f22404d;

    public C6079b0(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f22404d = iSQLiteDatabase;
    }
}
