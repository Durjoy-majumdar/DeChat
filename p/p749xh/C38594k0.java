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

/* renamed from: xh.k0 */
public class C38594k0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102739g;

    /* renamed from: h */
    public static final String[] f102740h = new String[0];

    /* renamed from: i */
    public static final int f102741i = -22661567;

    /* renamed from: j */
    public static final int f102742j = -2129294769;

    /* renamed from: n */
    public static final int f102743n = -1607243192;

    /* renamed from: o */
    public static final int f102744o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102745p = initAutoDBInfo(C38594k0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38594k0> f102746q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102747d = true;

    /* renamed from: e */
    public boolean f102748e = true;

    /* renamed from: f */
    public boolean f102749f = true;
    public long field_endTime;
    public String field_sessionName;
    public long field_startTime;

    static {
        SingleTable singleTable = new SingleTable("BackupTempMoveTime");
        f102739g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionName", "string", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "sessionName";
        mAutoDBInfo.colsMap.put("sessionName", "TEXT default '' ");
        mAutoDBInfo.columns[1] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " sessionName TEXT default '' ,  startTime LONG default '0' ,  endTime LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38594k0)) {
            return false;
        }
        C38594k0 k0Var = (C38594k0) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionName, k0Var.field_sessionName) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(k0Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(k0Var.field_endTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102741i == hashCode) {
                    try {
                        this.field_sessionName = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102742j == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102743n == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupTempMoveTime", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102744o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_sessionName == null) {
            this.field_sessionName = "";
        }
        if (this.f102747d) {
            contentValues.put("sessionName", this.field_sessionName);
        }
        if (this.f102748e) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f102749f) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BackupTempMoveTime ( " + f102745p.sql + ");");
        for (String add : f102740h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BackupTempMoveTime", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102745p, "BackupTempMoveTime", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBackupTempMoveTime", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BackupTempMoveTime", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102745p;
    }

    public String[] getIndexCreateSQL() {
        return f102740h;
    }

    public StorageObserverOwner<C38594k0> getObserverOwner() {
        return f102746q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102739g;
    }

    public String getTableName() {
        return f102739g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionName")) {
            this.field_sessionName = contentValues.getAsString("sessionName");
            if (z) {
                this.f102747d = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f102748e = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f102749f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
