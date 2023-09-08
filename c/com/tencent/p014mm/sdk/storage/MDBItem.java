package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: com.tencent.mm.sdk.storage.MDBItem */
public interface MDBItem {
    void convertFrom(ContentValues contentValues, boolean z);

    void convertFrom(Cursor cursor);

    ContentValues convertTo();
}
