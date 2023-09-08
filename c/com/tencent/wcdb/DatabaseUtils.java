package com.tencent.wcdb;

import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.wcdb.database.SQLiteAbortException;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConstraintException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDiskIOException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;

public final class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int EX_HAS_REPLY_HEADER = -128;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    private static final String TAG = "WCDB.DatabaseUtils";
    private static Collator mColl = null;

    @Deprecated
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private String mInsertSQL = null;
        private SQLiteStatement mInsertStatement = null;
        private SQLiteStatement mPreparedStatement = null;
        private SQLiteStatement mReplaceStatement = null;
        private final String mTableName;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            StringBuilder sb4 = new StringBuilder(128);
            sb4.append("VALUES (");
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.mDb;
                cursor = sQLiteDatabase.rawQuery("PRAGMA table_info(" + this.mTableName + ")", (Object[]) null);
                this.mColumns = new HashMap<>(cursor.getCount());
                int i = 1;
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(4);
                    this.mColumns.put(string, Integer.valueOf(i));
                    sb.append("'");
                    sb.append(string);
                    sb.append("'");
                    if (string2 == null) {
                        sb4.append("?");
                    } else {
                        sb4.append("COALESCE(?, ");
                        sb4.append(string2);
                        sb4.append(")");
                    }
                    String str = ", ";
                    sb.append(i == cursor.getCount() ? ") " : str);
                    if (i == cursor.getCount()) {
                        str = ");";
                    }
                    sb4.append(str);
                    i++;
                }
                cursor.close();
                sb.append(sb4);
                this.mInsertSQL = sb.toString();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        private SQLiteStatement getStatement(boolean z) {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        private long insertInternal(ContentValues contentValues, boolean z) {
            this.mDb.beginTransactionNonExclusive();
            try {
                SQLiteStatement statement = getStatement(z);
                statement.clearBindings();
                for (Map.Entry next : contentValues.valueSet()) {
                    DatabaseUtils.bindObjectToProgram(statement, getColumnIndex((String) next.getKey()), next.getValue());
                }
                long executeInsert = statement.executeInsert();
                this.mDb.setTransactionSuccessful();
                return executeInsert;
            } catch (SQLException e) {
                Log.m164294e(DatabaseUtils.TAG, "Error inserting " + contentValues + " into table  " + this.mTableName, e);
                return -1;
            } finally {
                this.mDb.endTransaction();
            }
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        public long execute() {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement != null) {
                try {
                    return sQLiteStatement.executeInsert();
                } catch (SQLException e) {
                    Log.m164294e(DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e);
                    return -1;
                } finally {
                    this.mPreparedStatement = null;
                }
            } else {
                throw new IllegalStateException("you must prepare this inserter before calling execute");
            }
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("column '" + str + "' is invalid");
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public void prepareForInsert() {
            SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, (double) f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, (long) i2);
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1 : 0);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }
    }

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("NULL");
        } else if (!(obj instanceof Boolean)) {
            appendEscapedSQLString(sb, obj.toString());
        } else if (((Boolean) obj).booleanValue()) {
            sb.append('1');
        } else {
            sb.append('0');
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1);
            } else {
                sQLiteProgram.bindLong(i, 0);
            }
        } else if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static void createDbFromSqlStatements(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, String str2) {
        SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, 0, (SQLiteDatabase.CursorFactory) null);
        for (String str3 : TextUtils.split(str2, ";\n")) {
            if (!TextUtils.isEmpty(str3)) {
                openOrCreateDatabase.execSQL(str3);
            }
        }
        openOrCreateDatabase.setVersion(i);
        openOrCreateDatabase.close();
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, (Double) null);
        }
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndex)));
        }
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorFillWindow(Cursor cursor, int i, CursorWindow cursorWindow) {
        boolean z;
        if (i >= 0 && i < cursor.getCount()) {
            int position = cursor.getPosition();
            int columnCount = cursor.getColumnCount();
            cursorWindow.clear();
            cursorWindow.setStartPosition(i);
            cursorWindow.setNumColumns(columnCount);
            if (cursor.moveToPosition(i)) {
                while (cursorWindow.allocRow()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        }
                        int type = cursor.getType(i2);
                        if (type == 0) {
                            z = cursorWindow.putNull(i, i2);
                        } else if (type == 1) {
                            z = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                        } else if (type == 2) {
                            z = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                        } else if (type != 4) {
                            String string = cursor.getString(i2);
                            z = string != null ? cursorWindow.putString(string, i, i2) : cursorWindow.putNull(i, i2);
                        } else {
                            byte[] blob = cursor.getBlob(i2);
                            z = blob != null ? cursorWindow.putBlob(blob, i, i2) : cursorWindow.putNull(i, i2);
                        }
                        if (!z) {
                            cursorWindow.freeLastRow();
                            break;
                        }
                        i2++;
                    }
                    i++;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
            }
            cursor.moveToPosition(position);
        }
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndex)));
        }
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndex)));
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Long.valueOf(cursor.getLong(columnIndex)));
        }
    }

    public static int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Short.valueOf(cursor.getShort(columnIndex)));
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, cursor.getString(columnIndex));
        }
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    private static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[(r0 << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }

    private static int extractSqlCode(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int charAt = str.charAt(i2);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                return 0;
            }
            i |= (charAt & 127) << (i2 * 8);
        }
        return i;
    }

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    private static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator instance = Collator.getInstance();
            mColl = instance;
            instance.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static int getKeyLen(byte[] bArr) {
        return bArr[bArr.length + -1] != 0 ? bArr.length : bArr.length - 1;
    }

    public static int getSqlStatementType(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        switch (extractSqlCode(trim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static boolean objectEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean queryIsEmpty(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select exists(select 1 from ");
        sb.append(str);
        sb.append(")");
        return longForQuery(sQLiteDatabase, sb.toString(), (String[]) null) == 0;
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        return queryNumEntries(sQLiteDatabase, str, (String) null, (String[]) null);
    }

    private static final int readExceptionCode(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != EX_HAS_REPLY_HEADER) {
            return readInt;
        }
        if (parcel.readInt() != 0) {
            return 0;
        }
        Log.m164293e(TAG, "Unexpected zero-sized Parcel reply header.");
        return 0;
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            readExceptionFromParcel(parcel, parcel.readString(), readExceptionCode);
        }
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            String readString = parcel.readString();
            if (readExceptionCode != 1) {
                readExceptionFromParcel(parcel, readString, readExceptionCode);
                return;
            }
            throw new FileNotFoundException(readString);
        }
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            String readString = parcel.readString();
            if (readExceptionCode != 10) {
                readExceptionFromParcel(parcel, readString, readExceptionCode);
                return;
            }
            throw new OperationApplicationException(readString);
        }
    }

    public static String sqlEscapeString(String str) {
        StringBuilder sb = new StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeExceptionToParcel(android.os.Parcel r6, java.lang.Exception r7) {
        /*
            boolean r0 = r7 instanceof java.io.FileNotFoundException
            java.lang.String r1 = "Writing exception to parcel"
            java.lang.String r2 = "WCDB.DatabaseUtils"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000d
            r0 = 1
        L_0x000b:
            r5 = 0
            goto L_0x004e
        L_0x000d:
            boolean r0 = r7 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0014
            r0 = 2
        L_0x0012:
            r5 = 1
            goto L_0x004e
        L_0x0014:
            boolean r0 = r7 instanceof java.lang.UnsupportedOperationException
            if (r0 == 0) goto L_0x001a
            r0 = 3
            goto L_0x0012
        L_0x001a:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteAbortException
            if (r0 == 0) goto L_0x0020
            r0 = 4
            goto L_0x0012
        L_0x0020:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteConstraintException
            if (r0 == 0) goto L_0x0026
            r0 = 5
            goto L_0x0012
        L_0x0026:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException
            if (r0 == 0) goto L_0x002c
            r0 = 6
            goto L_0x0012
        L_0x002c:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteFullException
            if (r0 == 0) goto L_0x0032
            r0 = 7
            goto L_0x0012
        L_0x0032:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteDiskIOException
            if (r0 == 0) goto L_0x0039
            r0 = 8
            goto L_0x0012
        L_0x0039:
            boolean r0 = r7 instanceof com.tencent.wcdb.database.SQLiteException
            if (r0 == 0) goto L_0x0040
            r0 = 9
            goto L_0x0012
        L_0x0040:
            boolean r0 = r7 instanceof android.content.OperationApplicationException
            if (r0 == 0) goto L_0x0047
            r0 = 10
            goto L_0x0012
        L_0x0047:
            boolean r0 = r7 instanceof com.tencent.wcdb.support.OperationCanceledException
            if (r0 == 0) goto L_0x0062
            r0 = 11
            goto L_0x000b
        L_0x004e:
            r6.writeInt(r0)
            java.lang.String r0 = r7.getMessage()
            r6.writeString(r0)
            if (r5 == 0) goto L_0x0061
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r7
            com.tencent.wcdb.support.Log.m164294e(r2, r1, r6)
        L_0x0061:
            return
        L_0x0062:
            r6.writeException(r7)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r7
            com.tencent.wcdb.support.Log.m164294e(r2, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.DatabaseUtils.writeExceptionToParcel(android.os.Parcel, java.lang.Exception):void");
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (Integer) null);
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (Long) null);
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + str);
        }
        printStream.println("}");
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return queryNumEntries(sQLiteDatabase, str, str2, (String[]) null);
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String str3;
        if (!TextUtils.isEmpty(str2)) {
            str3 = " where " + str2;
        } else {
            str3 = "";
        }
        return longForQuery(sQLiteDatabase, "select count(*) from " + str + str3, strArr);
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            case 11:
                throw new OperationCanceledException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public static void createDbFromSqlStatements(Context context, String str, int i, String str2) {
        createDbFromSqlStatements(context, str, (byte[]) null, (SQLiteCipherSpec) null, i, str2);
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        sb.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + str + "\n");
        }
        sb.append("}\n");
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }
}
