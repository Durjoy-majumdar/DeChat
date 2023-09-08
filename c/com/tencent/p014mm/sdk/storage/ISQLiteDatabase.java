package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: com.tencent.mm.sdk.storage.ISQLiteDatabase */
public interface ISQLiteDatabase {
    public static final int CURSOR_ASYNC = 3;
    public static final int CURSOR_DEFAULT = 0;
    public static final int CURSOR_HEAP = 4;
    public static final int CURSOR_IMMEDIATE = 2;
    public static final int CURSOR_WINDOWED = 1;

    long beginTransaction(long j);

    void close();

    int delete(String str, String str2, String[] strArr);

    int endTransaction(long j);

    boolean execSQL(String str, String str2);

    long insert(String str, String str2, ContentValues contentValues);

    long insertOrThrow(String str, String str2, ContentValues contentValues);

    boolean isClose();

    Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i);

    Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i, String str6);

    Cursor rawQuery(String str, String[] strArr);

    Cursor rawQuery(String str, String[] strArr, int i);

    Cursor rawQueryWithCancel(String str, String[] strArr);

    long replace(String str, String str2, ContentValues contentValues);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
