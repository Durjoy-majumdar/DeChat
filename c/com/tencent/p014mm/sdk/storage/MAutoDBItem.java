package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Field;
import java.util.HashMap;

@Deprecated
/* renamed from: com.tencent.mm.sdk.storage.MAutoDBItem */
public abstract class MAutoDBItem extends IAutoDBItem {
    private static final String TAG = "MicroMsg.SDK.MAutoDBItem";

    public void convertFrom(Cursor cursor) {
        int nullAs;
        String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            Log.m105920e(TAG, "convertFrom: get column names failed");
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < columnNames.length; i++) {
            hashMap.put(columnNames[i], Integer.valueOf(i));
        }
        for (Field field : getDBInfo().fields) {
            String colName = IAutoDBItem.getColName(field);
            if (!Util.isNullOrNil(colName) && (nullAs = Util.nullAs((Integer) hashMap.get(colName), -1)) >= 0) {
                try {
                    CursorFieldHelper.setter(field.getType()).invoke(field, this, cursor, nullAs);
                } catch (Exception e) {
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                }
            }
        }
        int nullAs2 = Util.nullAs((Integer) hashMap.get("rowid"), -1);
        if (nullAs2 >= 0) {
            this.systemRowid = cursor.getLong(nullAs2);
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        for (Field field : getDBInfo().fields) {
            try {
                CursorFieldHelper.getter(field.getType()).invoke(field, this, contentValues);
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }
}
