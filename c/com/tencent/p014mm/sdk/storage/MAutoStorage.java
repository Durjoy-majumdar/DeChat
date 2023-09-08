package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.storage.MAutoStorage */
public abstract class MAutoStorage<T extends IAutoDBItem> extends MStorage implements IAutoStorage<T> {
    private static final String TAG = "MicroMsg.SDK.MAutoStorage";

    /* renamed from: db */
    private final ISQLiteDatabase f82615db;
    private final IAutoDBItem.MAutoDBInfo dbInfo;
    public int field_MARK_CURSOR_CHECK_IGNORE = 1;
    private final String table;

    public MAutoStorage(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        this.f82615db = iSQLiteDatabase;
        this.dbInfo = mAutoDBInfo;
        mAutoDBInfo.primaryKey = Util.isNullOrNil(mAutoDBInfo.primaryKey) ? "rowid" : mAutoDBInfo.primaryKey;
        this.table = str;
        updateColumnSQLs(strArr);
    }

    private void LOGD(String str) {
        Log.m105918d(TAG, getTableName() + XVFSFile.PATH_SEPARATOR + str);
    }

    private void LOGE(String str) {
        Log.m105920e(TAG, getTableName() + XVFSFile.PATH_SEPARATOR + str);
    }

    private static StringBuilder checkKeysWithValues(ContentValues contentValues, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str + " = ? AND ");
            if (contentValues.get(str) == null) {
                return null;
            }
        }
        sb.append(" 1=1");
        return sb;
    }

    private boolean checkOld(ContentValues contentValues) {
        ISQLiteDatabase iSQLiteDatabase = this.f82615db;
        String tableName = getTableName();
        String[] strArr = this.dbInfo.columns;
        Cursor query = iSQLiteDatabase.query(tableName, strArr, this.dbInfo.primaryKey + " = ?", new String[]{Util.nullAsNil(contentValues.getAsString(this.dbInfo.primaryKey))}, (String) null, (String) null, (String) null);
        boolean checkIOEqual = IAutoDBItem.checkIOEqual(contentValues, query);
        query.close();
        return checkIOEqual;
    }

    public static String getCreateSQLs(IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS " + str + " ( ");
        sb.append(mAutoDBInfo.sql);
        sb.append(");");
        return sb.toString();
    }

    public static List<String> getUpdateSQLs(IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, ISQLiteDatabase iSQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (iSQLiteDatabase == null || str == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(iSQLiteDatabase == null);
            objArr[1] = str;
            Log.m105921e(TAG, "dk getUpdateSQLs db==null :%b  table:%s", objArr);
            return arrayList;
        }
        Cursor rawQuery = iSQLiteDatabase.rawQuery("PRAGMA table_info( " + str + " )", new String[0], 2);
        if (rawQuery == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        int columnIndex = rawQuery.getColumnIndex("name");
        int columnIndex2 = rawQuery.getColumnIndex("type");
        while (rawQuery.moveToNext()) {
            hashMap.put(rawQuery.getString(columnIndex), rawQuery.getString(columnIndex2));
        }
        rawQuery.close();
        for (Map.Entry next : mAutoDBInfo.colsMap.entrySet()) {
            String str2 = (String) next.getValue();
            String str3 = (String) next.getKey();
            if (str2 != null && str2.length() > 0) {
                String str4 = (String) hashMap.get(str3);
                if (str4 == null) {
                    arrayList.add("ALTER TABLE " + str + " ADD COLUMN " + str3 + " " + str2 + ";");
                    hashMap.remove(str3);
                } else if (!str2.toLowerCase().startsWith(str4.toLowerCase())) {
                    Log.m105920e(TAG, "conflicting alter table on column: " + str3 + ", " + str4 + "<o-n>" + str2);
                    hashMap.remove(str3);
                }
            }
        }
        return arrayList;
    }

    private void updateColumnSQLs(String[] strArr) {
        List<String> updateSQLs = getUpdateSQLs(this.dbInfo, getTableName(), this.f82615db);
        for (int i = 0; i < updateSQLs.size(); i++) {
            if (!this.f82615db.execSQL(this.table, updateSQLs.get(i))) {
                Log.m105925i(TAG, "updateColumnSQLs table failed %s, sql %s", this.table, updateSQLs.get(i));
            }
        }
        if (strArr != null && strArr.length > 0) {
            for (String execSQL : strArr) {
                this.f82615db.execSQL(this.table, execSQL);
            }
        }
    }

    private static String[] valuesFromKeys(String[] strArr, ContentValues contentValues) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = Util.nullAsNil(contentValues.getAsString(strArr[i]));
        }
        return strArr2;
    }

    public boolean delete(T t, boolean z, String... strArr) {
        ContentValues convertTo = t.convertTo();
        boolean z2 = false;
        if (convertTo == null || convertTo.size() <= 0) {
            LOGE("delete failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            LOGD("delete with primary key");
            ISQLiteDatabase iSQLiteDatabase = this.f82615db;
            String tableName = getTableName();
            if (iSQLiteDatabase.delete(tableName, this.dbInfo.primaryKey + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.dbInfo.primaryKey))}) > 0) {
                z2 = true;
            }
            if (z2 && z) {
                doNotify(convertTo.getAsString(this.dbInfo.primaryKey), 5, t);
            }
            return z2;
        } else {
            StringBuilder checkKeysWithValues = checkKeysWithValues(convertTo, strArr);
            if (checkKeysWithValues == null) {
                LOGE("delete failed, check keys failed");
                return false;
            } else if (this.f82615db.delete(getTableName(), checkKeysWithValues.toString(), valuesFromKeys(strArr, convertTo)) <= 0 || !z) {
                LOGE("delete failed");
                return false;
            } else {
                doNotify(convertTo.getAsString(this.dbInfo.primaryKey), 5, t);
                return true;
            }
        }
    }

    public boolean deleteNotify(long j, boolean z) {
        ISQLiteDatabase iSQLiteDatabase = this.f82615db;
        String tableName = getTableName();
        boolean z2 = true;
        if (iSQLiteDatabase.delete(tableName, "rowid = ?", new String[]{"" + j}) <= 0) {
            z2 = false;
        }
        if (z2 && z) {
            doNotify("*", 5, (Object) null);
        }
        return z2;
    }

    public boolean execSQL(String str, String str2) {
        if (str == null || str.length() == 0) {
            LOGE("null or nill table");
            return false;
        } else if (str2 != null && str2.length() != 0) {
            return this.f82615db.execSQL(str, str2);
        } else {
            LOGE("null or nill sql");
            return false;
        }
    }

    public boolean get(long j, T t) {
        ISQLiteDatabase iSQLiteDatabase = this.f82615db;
        String tableName = getTableName();
        String[] strArr = this.dbInfo.columns;
        Cursor query = iSQLiteDatabase.query(tableName, strArr, "rowid = ?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            t.convertFrom(query);
            query.close();
            return true;
        }
        query.close();
        return false;
    }

    public Cursor getAll() {
        return this.f82615db.query(getTableName(), this.dbInfo.columns, (String) null, (String[]) null, (String) null, (String) null, (String) null);
    }

    public int getCount() {
        Cursor rawQuery = rawQuery("select count(*) from " + getTableName(), new String[0]);
        if (rawQuery == null) {
            return 0;
        }
        rawQuery.moveToFirst();
        int i = rawQuery.getInt(0);
        rawQuery.close();
        return i;
    }

    public String getPrimaryKey() {
        return this.dbInfo.primaryKey;
    }

    public String getTableName() {
        return this.table;
    }

    public boolean insert(T t) {
        return insertNotify(t, true);
    }

    public boolean insertNotify(T t, boolean z) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            LOGE("insert failed, value.size <= 0");
            return false;
        }
        long insert = this.f82615db.insert(getTableName(), this.dbInfo.primaryKey, convertTo);
        t.systemRowid = insert;
        if (insert <= 0) {
            LOGE("insert failed");
            return false;
        }
        convertTo.put("rowid", Long.valueOf(insert));
        if (!z) {
            return true;
        }
        doNotify(convertTo.getAsString(this.dbInfo.primaryKey), 2, t);
        return true;
    }

    public Cursor rawQuery(String str, String... strArr) {
        return this.f82615db.rawQuery(str, strArr);
    }

    public boolean replace(T t) {
        return replace(t, true);
    }

    public boolean update(long j, T t, boolean z) {
        long j2 = j;
        ContentValues convertTo = t.convertTo();
        boolean z2 = false;
        if (convertTo == null || convertTo.size() <= 0) {
            LOGE("update failed, value.size <= 0");
            return false;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f82615db;
        String tableName = getTableName();
        String[] strArr = this.dbInfo.columns;
        Cursor query = iSQLiteDatabase.query(tableName, strArr, "rowid = ?", new String[]{"" + j2}, (String) null, (String) null, (String) null);
        if (IAutoDBItem.checkIOEqual(convertTo, query)) {
            query.close();
            LOGD("no need replace , fields no change");
            return true;
        }
        query.close();
        ISQLiteDatabase iSQLiteDatabase2 = this.f82615db;
        String tableName2 = getTableName();
        if (iSQLiteDatabase2.update(tableName2, convertTo, "rowid = ?", new String[]{"" + j2}) > 0) {
            z2 = true;
        }
        if (z2 && z) {
            doNotify("*", 3, t);
        }
        return z2;
    }

    public boolean updateNotify(T t, boolean z, String... strArr) {
        ContentValues convertTo = t.convertTo();
        boolean z2 = false;
        if (convertTo == null || convertTo.size() <= 0) {
            LOGE("update failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            LOGD("update with primary key");
            if (checkOld(convertTo)) {
                LOGD("no need replace , fields no change");
                return true;
            }
            ISQLiteDatabase iSQLiteDatabase = this.f82615db;
            String tableName = getTableName();
            if (iSQLiteDatabase.update(tableName, convertTo, this.dbInfo.primaryKey + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.dbInfo.primaryKey))}) > 0) {
                z2 = true;
            }
            if (z2 && z) {
                doNotify(convertTo.getAsString(this.dbInfo.primaryKey), 3, t);
            }
            return z2;
        } else {
            StringBuilder checkKeysWithValues = checkKeysWithValues(convertTo, strArr);
            if (checkKeysWithValues == null) {
                LOGE("update failed, check keys failed");
                return false;
            } else if (this.f82615db.update(getTableName(), convertTo, checkKeysWithValues.toString(), valuesFromKeys(strArr, convertTo)) > 0) {
                if (z) {
                    doNotify(convertTo.getAsString(this.dbInfo.primaryKey), 3, t);
                }
                return true;
            } else {
                LOGE("update failed");
                return false;
            }
        }
    }

    public boolean replace(T t, boolean z) {
        Assert.assertTrue("replace primaryKey == null", !Util.isNullOrNil(this.dbInfo.primaryKey));
        ContentValues convertTo = t.convertTo();
        boolean z2 = false;
        if (convertTo == null || convertTo.size() != t.getDBInfo().fields.length + (convertTo.containsKey("rowid") ? 1 : 0)) {
            LOGE("replace failed, cv.size() != item.fields().length");
            return false;
        } else if (checkOld(convertTo)) {
            LOGD("no need replace , fields no change");
            return true;
        } else {
            long replace = this.f82615db.replace(getTableName(), this.dbInfo.primaryKey, convertTo);
            t.systemRowid = replace;
            if (replace > 0) {
                z2 = true;
            }
            if (!z2 || !z) {
                if (!z2) {
                    LOGE("replace failed");
                }
                return z2;
            }
            doNotify(this.dbInfo.primaryKey, 4, t);
            return true;
        }
    }

    public boolean get(T t, String... strArr) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            LOGE("get failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            ISQLiteDatabase iSQLiteDatabase = this.f82615db;
            String tableName = getTableName();
            String[] strArr2 = this.dbInfo.columns;
            Cursor query = iSQLiteDatabase.query(tableName, strArr2, this.dbInfo.primaryKey + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.dbInfo.primaryKey))}, (String) null, (String) null, (String) null, 2);
            if (query.moveToFirst()) {
                t.convertFrom(query);
                query.close();
                return true;
            }
            query.close();
            return false;
        } else {
            StringBuilder checkKeysWithValues = checkKeysWithValues(convertTo, strArr);
            if (checkKeysWithValues == null) {
                LOGE("get failed, check keys failed");
                return false;
            }
            Cursor query2 = this.f82615db.query(getTableName(), this.dbInfo.columns, checkKeysWithValues.toString(), valuesFromKeys(strArr, convertTo), (String) null, (String) null, (String) null, 2);
            if (query2.moveToFirst()) {
                t.convertFrom(query2);
                query2.close();
                return true;
            }
            query2.close();
            LOGD("get failed, not found");
            return false;
        }
    }

    public boolean update(long j, T t) {
        return update(j, t, true);
    }

    public boolean update(T t, String... strArr) {
        return updateNotify(t, true, strArr);
    }

    public boolean delete(T t, String... strArr) {
        return delete(t, true, strArr);
    }

    public int delete(String str, String str2, String[] strArr) {
        return this.f82615db.delete(str, str2, strArr);
    }

    public boolean delete(long j) {
        return deleteNotify(j, true);
    }
}
