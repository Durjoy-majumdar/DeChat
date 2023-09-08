package com.tencent.p014mm.plugin.appbrand.launching;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38658s5;
import te3.C90446wm2;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.y2 */
public class C29592y2 extends MAutoStorage<C29590x2> {

    /* renamed from: d */
    public static final String[] f80519d = {MAutoStorage.getCreateSQLs(C29590x2.f80517p, "LaunchWxaAppPBTable")};

    public C29592y2(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29590x2.f80517p, "LaunchWxaAppPBTable", C38658s5.f103615g);
    }

    /* renamed from: jo */
    public boolean mo56832jo(String str, C90446wm2 wm22) {
        if (TextUtils.isEmpty(str) || wm22 == null) {
            return false;
        }
        C29590x2 x2Var = new C29590x2();
        x2Var.field_appId = str;
        x2Var.field_launchPB = wm22;
        return super.replace(x2Var);
    }
}
