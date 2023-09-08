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

/* renamed from: xh.j0 */
public class C38585j0 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102596f;

    /* renamed from: g */
    public static final String[] f102597g = new String[0];

    /* renamed from: h */
    public static final int f102598h = 1552595716;

    /* renamed from: i */
    public static final int f102599i = -22661567;

    /* renamed from: j */
    public static final int f102600j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102601n = initAutoDBInfo(C38585j0.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38585j0> f102602o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102603d = true;

    /* renamed from: e */
    public boolean f102604e = true;
    public String field_msgListDataId;
    public String field_sessionName;

    static {
        SingleTable singleTable = new SingleTable("BackupRecoverMsgListDataId");
        f102596f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgListDataId", "string", singleTable.getName(), "");
        new Column("sessionName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgListDataId";
        mAutoDBInfo.colsMap.put("msgListDataId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgListDataId";
        mAutoDBInfo.columns[1] = "sessionName";
        mAutoDBInfo.colsMap.put("sessionName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " msgListDataId TEXT PRIMARY KEY ,  sessionName TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38585j0)) {
            return false;
        }
        C38585j0 j0Var = (C38585j0) iAutoDBItem;
        return C46238a.m51546a(this.field_msgListDataId, j0Var.field_msgListDataId) && C46238a.m51546a(this.field_sessionName, j0Var.field_sessionName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102598h == hashCode) {
                    try {
                        this.field_msgListDataId = cursor.getString(i);
                        this.f102603d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102599i == hashCode) {
                    try {
                        this.field_sessionName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102600j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102603d) {
            contentValues.put("msgListDataId", this.field_msgListDataId);
        }
        if (this.field_sessionName == null) {
            this.field_sessionName = "";
        }
        if (this.f102604e) {
            contentValues.put("sessionName", this.field_sessionName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BackupRecoverMsgListDataId ( " + f102601n.sql + ");");
        for (String add : f102597g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BackupRecoverMsgListDataId", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102601n, "BackupRecoverMsgListDataId", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BackupRecoverMsgListDataId", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102601n;
    }

    public String[] getIndexCreateSQL() {
        return f102597g;
    }

    public StorageObserverOwner<C38585j0> getObserverOwner() {
        return f102602o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_msgListDataId;
    }

    public SingleTable getTable() {
        return f102596f;
    }

    public String getTableName() {
        return f102596f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgListDataId")) {
            this.field_msgListDataId = contentValues.getAsString("msgListDataId");
            if (z) {
                this.f102603d = true;
            }
        }
        if (contentValues.containsKey("sessionName")) {
            this.field_sessionName = contentValues.getAsString("sessionName");
            if (z) {
                this.f102604e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
