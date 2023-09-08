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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C48680a9;

/* renamed from: xh.i0 */
public class C38578i0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102499g;

    /* renamed from: h */
    public static final String[] f102500h = new String[0];

    /* renamed from: i */
    public static final int f102501i = 1109191185;

    /* renamed from: j */
    public static final int f102502j = -22661567;

    /* renamed from: n */
    public static final int f102503n = -104418754;

    /* renamed from: o */
    public static final int f102504o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102505p = initAutoDBInfo(C38578i0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38578i0> f102506q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102507d = true;

    /* renamed from: e */
    public boolean f102508e = true;

    /* renamed from: f */
    public boolean f102509f = true;
    public String field_deviceId;
    public C48680a9 field_moveTime;
    public String field_sessionName;

    static {
        SingleTable singleTable = new SingleTable("BackupMoveTime");
        f102499g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("deviceId", "string", singleTable.getName(), "");
        new Column("sessionName", "string", singleTable.getName(), "");
        new Column("moveTime", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.BackupTimePairList");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "deviceId";
        mAutoDBInfo.colsMap.put("deviceId", "TEXT default '' ");
        mAutoDBInfo.columns[1] = "sessionName";
        mAutoDBInfo.colsMap.put("sessionName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "moveTime";
        mAutoDBInfo.colsMap.put("moveTime", "BLOB default '' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " deviceId TEXT default '' ,  sessionName TEXT default '' ,  moveTime BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38578i0)) {
            return false;
        }
        C38578i0 i0Var = (C38578i0) iAutoDBItem;
        return C46238a.m51546a(this.field_deviceId, i0Var.field_deviceId) && C46238a.m51546a(this.field_sessionName, i0Var.field_sessionName) && C46238a.m51546a(this.field_moveTime, i0Var.field_moveTime);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102501i == hashCode) {
                    try {
                        this.field_deviceId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102502j == hashCode) {
                    try {
                        this.field_sessionName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102503n == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_moveTime = (C48680a9) new C48680a9().parseFrom(blob);
                        }
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupMoveTime", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102504o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C48680a9 a9Var;
        ContentValues contentValues = new ContentValues();
        if (this.field_deviceId == null) {
            this.field_deviceId = "";
        }
        if (this.f102507d) {
            contentValues.put("deviceId", this.field_deviceId);
        }
        if (this.field_sessionName == null) {
            this.field_sessionName = "";
        }
        if (this.f102508e) {
            contentValues.put("sessionName", this.field_sessionName);
        }
        if (this.f102509f && (a9Var = this.field_moveTime) != null) {
            try {
                contentValues.put("moveTime", a9Var.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseBackupMoveTime", e.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBackupMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BackupMoveTime ( " + f102505p.sql + ");");
        for (String add : f102500h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBackupMoveTime", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BackupMoveTime", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102505p, "BackupMoveTime", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBackupMoveTime", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BackupMoveTime", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBackupMoveTime", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102505p;
    }

    public String[] getIndexCreateSQL() {
        return f102500h;
    }

    public StorageObserverOwner<C38578i0> getObserverOwner() {
        return f102506q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102499g;
    }

    public String getTableName() {
        return f102499g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("deviceId")) {
            this.field_deviceId = contentValues.getAsString("deviceId");
            if (z) {
                this.f102507d = true;
            }
        }
        if (contentValues.containsKey("sessionName")) {
            this.field_sessionName = contentValues.getAsString("sessionName");
            if (z) {
                this.f102508e = true;
            }
        }
        if (contentValues.containsKey("moveTime")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("moveTime");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_moveTime = (C48680a9) new C48680a9().parseFrom(asByteArray);
                    if (z) {
                        this.f102509f = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseBackupMoveTime", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
