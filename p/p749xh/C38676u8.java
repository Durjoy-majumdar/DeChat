package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.u8 */
public class C38676u8 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103900g;

    /* renamed from: h */
    public static final String[] f103901h = new String[0];

    /* renamed from: i */
    public static final int f103902i = 293428218;

    /* renamed from: j */
    public static final int f103903j = -1482988052;

    /* renamed from: n */
    public static final int f103904n = 759304656;

    /* renamed from: o */
    public static final int f103905o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103906p = initAutoDBInfo(C38676u8.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38676u8> f103907q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103908d = true;

    /* renamed from: e */
    public boolean f103909e = true;

    /* renamed from: f */
    public boolean f103910f = true;
    public long field_groupId;
    public byte[] field_groupStrcut;
    public int field_groupTime;

    static {
        SingleTable singleTable = new SingleTable("SnsWsFoldGroupDetail");
        f103900g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("groupId", "long", singleTable.getName(), "");
        new Column("groupTime", "int", singleTable.getName(), "");
        new Column("groupStrcut", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "groupId";
        mAutoDBInfo.columns[1] = "groupTime";
        mAutoDBInfo.colsMap.put("groupTime", "INTEGER");
        mAutoDBInfo.columns[2] = "groupStrcut";
        mAutoDBInfo.colsMap.put("groupStrcut", "BLOB");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " groupId LONG PRIMARY KEY ,  groupTime INTEGER,  groupStrcut BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38676u8)) {
            return false;
        }
        C38676u8 u8Var = (C38676u8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_groupId), Long.valueOf(u8Var.field_groupId)) && C46238a.m51546a(Integer.valueOf(this.field_groupTime), Integer.valueOf(u8Var.field_groupTime)) && C46238a.m51546a(this.field_groupStrcut, u8Var.field_groupStrcut);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103902i == hashCode) {
                    try {
                        this.field_groupId = cursor.getLong(i);
                        this.f103908d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103903j == hashCode) {
                    try {
                        this.field_groupTime = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103904n == hashCode) {
                    try {
                        this.field_groupStrcut = cursor.getBlob(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103905o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103908d) {
            contentValues.put("groupId", Long.valueOf(this.field_groupId));
        }
        if (this.f103909e) {
            contentValues.put("groupTime", Integer.valueOf(this.field_groupTime));
        }
        if (this.f103910f) {
            contentValues.put("groupStrcut", this.field_groupStrcut);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsWsFoldGroupDetail ( " + f103906p.sql + ");");
        for (String add : f103901h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsWsFoldGroupDetail", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103906p, "SnsWsFoldGroupDetail", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsWsFoldGroupDetail", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103906p;
    }

    public String[] getIndexCreateSQL() {
        return f103901h;
    }

    public StorageObserverOwner<C38676u8> getObserverOwner() {
        return f103907q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_groupId);
    }

    public SingleTable getTable() {
        return f103900g;
    }

    public String getTableName() {
        return f103900g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsLong("groupId").longValue();
            if (z) {
                this.f103908d = true;
            }
        }
        if (contentValues.containsKey("groupTime")) {
            this.field_groupTime = contentValues.getAsInteger("groupTime").intValue();
            if (z) {
                this.f103909e = true;
            }
        }
        if (contentValues.containsKey("groupStrcut")) {
            this.field_groupStrcut = contentValues.getAsByteArray("groupStrcut");
            if (z) {
                this.f103910f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
