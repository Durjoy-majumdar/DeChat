package my2;

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

/* renamed from: my2.b */
public class C34687b extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f93268h;

    /* renamed from: i */
    public static final String[] f93269i = new String[0];

    /* renamed from: j */
    public static final int f93270j = -356714073;

    /* renamed from: n */
    public static final int f93271n = -1516193902;

    /* renamed from: o */
    public static final int f93272o = -873960692;

    /* renamed from: p */
    public static final int f93273p = 3560141;

    /* renamed from: q */
    public static final int f93274q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f93275r = initAutoDBInfo(C34687b.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C34687b> f93276s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f93277d = true;

    /* renamed from: e */
    public boolean f93278e = true;

    /* renamed from: f */
    public boolean f93279f = true;
    public String field_guardianUserName;
    public String field_ticket;
    public long field_time;
    public String field_wardUserName;

    /* renamed from: g */
    public boolean f93280g = true;

    static {
        SingleTable singleTable = new SingleTable("TeenModeBindGuardian");
        f93268h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("guardianUserName", "string", singleTable.getName(), "");
        new Column("wardUserName", "string", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
        new Column("time", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "guardianUserName";
        mAutoDBInfo.colsMap.put("guardianUserName", "TEXT");
        mAutoDBInfo.columns[1] = "wardUserName";
        mAutoDBInfo.colsMap.put("wardUserName", "TEXT");
        mAutoDBInfo.columns[2] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT");
        mAutoDBInfo.columns[3] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " guardianUserName TEXT,  wardUserName TEXT,  ticket TEXT,  time LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C34687b)) {
            return false;
        }
        C34687b bVar = (C34687b) iAutoDBItem;
        return C46238a.m51546a(this.field_guardianUserName, bVar.field_guardianUserName) && C46238a.m51546a(this.field_wardUserName, bVar.field_wardUserName) && C46238a.m51546a(this.field_ticket, bVar.field_ticket) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(bVar.field_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f93270j == hashCode) {
                    try {
                        this.field_guardianUserName = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93271n == hashCode) {
                    try {
                        this.field_wardUserName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93272o == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93273p == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeBindGuardian", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93274q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f93277d) {
            contentValues.put("guardianUserName", this.field_guardianUserName);
        }
        if (this.f93278e) {
            contentValues.put("wardUserName", this.field_wardUserName);
        }
        if (this.f93279f) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f93280g) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TeenModeBindGuardian ( " + f93275r.sql + ");");
        for (String add : f93269i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TeenModeBindGuardian", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f93275r, "TeenModeBindGuardian", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTeenModeBindGuardian", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TeenModeBindGuardian", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93275r;
    }

    public String[] getIndexCreateSQL() {
        return f93269i;
    }

    public StorageObserverOwner<C34687b> getObserverOwner() {
        return f93276s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f93268h;
    }

    public String getTableName() {
        return f93268h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("guardianUserName")) {
            this.field_guardianUserName = contentValues.getAsString("guardianUserName");
            if (z) {
                this.f93277d = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.field_wardUserName = contentValues.getAsString("wardUserName");
            if (z) {
                this.f93278e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f93279f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f93280g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
