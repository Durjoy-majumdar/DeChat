package com.tencent.p014mm.plugin.appbrand.utils;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.q0 */
public final class C84776q0 {
    /* renamed from: a */
    public static final boolean m104439a(ISQLiteDatabase iSQLiteDatabase, String str) {
        C87412m.m108594g(iSQLiteDatabase, "<this>");
        C87412m.m108594g(str, "tableName");
        return iSQLiteDatabase.execSQL(str, "DROP TABLE IF EXISTS " + str + ';');
    }

    /* renamed from: b */
    public static final boolean m104440b(ISQLiteDatabase iSQLiteDatabase, String str) {
        C87412m.m108594g(iSQLiteDatabase, "<this>");
        C87412m.m108594g(str, "tableName");
        Cursor rawQuery = iSQLiteDatabase.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name='" + str + "';", (String[]) null);
        if (rawQuery == null) {
            return false;
        }
        boolean moveToNext = rawQuery.moveToNext();
        rawQuery.close();
        return moveToNext;
    }
}
