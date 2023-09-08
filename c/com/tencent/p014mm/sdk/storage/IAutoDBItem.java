package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.storage.IAutoDBItem */
public abstract class IAutoDBItem implements MDBItem {
    public static final String COL_ROWID = "rowid";
    public static final String FIELD_PREFIX = "field_";
    public static final String SYSTEM_ROWID_FIELD = "rowid";
    private static final String TAG = "MicroMsg.SDK.IAutoDBItem";
    public long systemRowid = -1;

    /* renamed from: com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo */
    public static class MAutoDBInfo {
        public Map<String, String> colsMap = new HashMap();
        public String[] columns;
        public Field[] fields;
        public String primaryKey;
        public String sql;
    }

    private static boolean checkBlobEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null && bArr2 != null) {
            return false;
        }
        if ((bArr != null && bArr2 == null) || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIOEqual(ContentValues contentValues, Cursor cursor) {
        if (contentValues == null) {
            return cursor == null;
        }
        if (cursor != null && cursor.getCount() == 1) {
            cursor.moveToFirst();
            int columnCount = cursor.getColumnCount();
            int size = contentValues.size();
            if (contentValues.containsKey("rowid")) {
                size--;
            }
            if (cursor.getColumnIndex("rowid") != -1) {
                columnCount--;
            }
            if (size != columnCount) {
                return false;
            }
            try {
                for (Map.Entry<String, Object> key : contentValues.valueSet()) {
                    String str = (String) key.getKey();
                    if (!str.equals("rowid")) {
                        int columnIndex = cursor.getColumnIndex(str);
                        if (columnIndex == -1) {
                            return false;
                        }
                        if (contentValues.get(str) instanceof byte[]) {
                            if (!checkBlobEqual((byte[]) contentValues.get(str), cursor.getBlob(columnIndex))) {
                                return false;
                            }
                        } else if ((cursor.getString(columnIndex) == null && contentValues.get(str) != null) || contentValues.get(str) == null || !contentValues.get(str).toString().equals(cursor.getString(columnIndex))) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return false;
    }

    public static String getColName(Field field) {
        String name;
        if (field == null || (name = field.getName()) == null || name.length() <= 0) {
            return null;
        }
        return name.startsWith(FIELD_PREFIX) ? name.substring(6) : name;
    }

    private static Map<String, String> getColsMap(Field[] fieldArr) {
        HashMap hashMap = new HashMap();
        for (Field field : fieldArr) {
            String type = CursorFieldHelper.type(field.getType());
            if (type == null) {
                Log.m105920e(TAG, "failed identify on column: " + field.getName() + ", skipped");
            } else {
                String colName = getColName(field);
                if (!Util.isNullOrNil(colName)) {
                    hashMap.put(colName, type);
                }
            }
        }
        return hashMap;
    }

    public static Cursor getCursorForProjection(ContentValues contentValues, String[] strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = contentValues.get(strArr[i]);
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    private static String[] getFullColumns(Field[] fieldArr) {
        String[] strArr = new String[(fieldArr.length + 1)];
        for (int i = 0; i < fieldArr.length; i++) {
            strArr[i] = getColName(fieldArr[i]);
            Assert.assertTrue("getFullColumns failed:" + fieldArr[i].getName(), !Util.isNullOrNil(strArr[i]));
        }
        strArr[fieldArr.length] = "rowid";
        return strArr;
    }

    private static String getSql(Field[] fieldArr) {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < fieldArr.length; i2++) {
            Field field = fieldArr[i2];
            String type = CursorFieldHelper.type(field.getType());
            if (type == null) {
                Log.m105920e(TAG, "failed identify on column: " + field.getName() + ", skipped");
            } else {
                String colName = getColName(field);
                if (!Util.isNullOrNil(colName)) {
                    String str2 = "";
                    if (field.isAnnotationPresent(MAutoDBFieldAnnotation.class)) {
                        str = " default '" + ((MAutoDBFieldAnnotation) field.getAnnotation(MAutoDBFieldAnnotation.class)).defValue() + "' ";
                        i = ((MAutoDBFieldAnnotation) field.getAnnotation(MAutoDBFieldAnnotation.class)).primaryKey();
                    } else {
                        str = str2;
                        i = 0;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(colName);
                    sb4.append(" ");
                    sb4.append(type);
                    sb4.append(str);
                    sb4.append(i == 1 ? " PRIMARY KEY " : str2);
                    sb.append(sb4.toString());
                    if (i2 != fieldArr.length - 1) {
                        str2 = ", ";
                    }
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static Field[] getValidFields(Class<?> cls) {
        return initAutoDBInfo(cls).fields;
    }

    public static MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        MAutoDBInfo mAutoDBInfo = new MAutoDBInfo();
        LinkedList linkedList = new LinkedList();
        for (Field field : cls.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            String name = field.getName();
            if (name != null && Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers)) {
                String substring = name.startsWith(FIELD_PREFIX) ? name.substring(6) : name;
                if (field.isAnnotationPresent(MAutoDBFieldAnnotation.class)) {
                    if (((MAutoDBFieldAnnotation) field.getAnnotation(MAutoDBFieldAnnotation.class)).primaryKey() == 1) {
                        mAutoDBInfo.primaryKey = substring;
                    }
                } else if (!name.startsWith(FIELD_PREFIX)) {
                }
                if (!Util.isNullOrNil(substring)) {
                    if (substring.equals("rowid")) {
                        Assert.assertTrue("field_rowid reserved by MAutoDBItem, change now!", false);
                    }
                    linkedList.add(field);
                }
            }
        }
        Field[] fieldArr = (Field[]) linkedList.toArray(new Field[0]);
        mAutoDBInfo.fields = fieldArr;
        mAutoDBInfo.columns = getFullColumns(fieldArr);
        mAutoDBInfo.colsMap = getColsMap(mAutoDBInfo.fields);
        mAutoDBInfo.sql = getSql(mAutoDBInfo.fields);
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        return equals(iAutoDBItem);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
    }

    public abstract void convertFrom(Cursor cursor);

    public abstract ContentValues convertTo();

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
    }

    public abstract MAutoDBInfo getDBInfo();

    public String[] getIndexCreateSQL() {
        return new String[0];
    }

    public StorageObserverOwner<? extends IAutoDBItem> getObserverOwner() {
        return new StorageObserverOwner<>();
    }

    public Object getPrimaryKeyValue() {
        return "";
    }

    public SingleTable getTable() {
        return new SingleTable(getTableName());
    }

    public String getTableName() {
        return "";
    }

    public Object toJSON() {
        return "";
    }
}
