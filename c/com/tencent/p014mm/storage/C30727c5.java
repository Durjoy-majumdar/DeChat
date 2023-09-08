package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import junit.framework.Assert;
import p749xh.C38535b9;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.c5 */
public class C30727c5 extends MAutoStorage<C38535b9> {

    /* renamed from: e */
    public static final String[] f82643e = {MAutoStorage.getCreateSQLs(C30724b5.f82638p, "TablesVersion")};

    /* renamed from: d */
    public C91753f f82644d;

    public C30727c5(C91753f fVar) {
        super(fVar, C30724b5.f82638p, "TablesVersion", C38535b9.f101835g);
        this.f82644d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo57620Lo(int i, String str) {
        Assert.assertTrue(i != 0);
        Assert.assertNotNull(str);
        C30724b5 b5Var = new C30724b5();
        b5Var.field_tableHash = i;
        b5Var.field_tableSQLMD5 = str;
        this.f82644d.replace("TablesVersion", "tableHash", b5Var.convertTo());
        return true;
    }

    /* renamed from: jo */
    public String mo57621jo(int i) {
        C30724b5 b5Var;
        Cursor rawQuery = rawQuery("select * from TablesVersion where tableHash = " + i, new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                b5Var = new C30724b5();
                b5Var.convertFrom(rawQuery);
            } else {
                b5Var = null;
            }
            rawQuery.close();
        } else {
            b5Var = null;
        }
        if (b5Var == null) {
            return null;
        }
        return b5Var.field_tableSQLMD5;
    }
}
