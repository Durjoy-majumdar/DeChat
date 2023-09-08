package com.tencent.p014mm.sdk.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;

/* renamed from: com.tencent.mm.sdk.storage.IAutoStorage */
public interface IAutoStorage<T extends IAutoDBItem> {
    boolean delete(long j);

    boolean delete(T t, boolean z, String... strArr);

    boolean delete(T t, String... strArr);

    boolean deleteNotify(long j, boolean z);

    boolean execSQL(String str, String str2);

    boolean get(long j, T t);

    boolean get(T t, String... strArr);

    Cursor getAll();

    int getCount();

    boolean insert(T t);

    boolean insertNotify(T t, boolean z);

    Cursor rawQuery(String str, String... strArr);

    boolean replace(T t);

    boolean update(long j, T t);

    boolean update(long j, T t, boolean z);

    boolean update(T t, String... strArr);

    boolean updateNotify(T t, boolean z, String... strArr);
}
