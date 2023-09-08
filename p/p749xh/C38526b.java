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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.b */
public class C38526b extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f101701h;

    /* renamed from: i */
    public static final String[] f101702i = new String[0];

    /* renamed from: j */
    public static final int f101703j = -1389017048;

    /* renamed from: n */
    public static final int f101704n = -384451032;

    /* renamed from: o */
    public static final int f101705o = 1287057361;

    /* renamed from: p */
    public static final int f101706p = -892481550;

    /* renamed from: q */
    public static final int f101707q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f101708r = initAutoDBInfo(C38526b.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38526b> f101709s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101710d = true;

    /* renamed from: e */
    public boolean f101711e = true;

    /* renamed from: f */
    public boolean f101712f = true;
    public String field_billNo;
    public boolean field_insertmsg;
    public long field_localMsgId;
    public int field_status;

    /* renamed from: g */
    public boolean f101713g = true;

    static {
        SingleTable singleTable = new SingleTable("AARecord");
        f101701h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("billNo", "string", singleTable.getName(), "");
        new Column("insertmsg", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("localMsgId", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "billNo";
        mAutoDBInfo.colsMap.put("billNo", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "billNo";
        mAutoDBInfo.columns[1] = "insertmsg";
        mAutoDBInfo.colsMap.put("insertmsg", "INTEGER");
        mAutoDBInfo.columns[2] = "localMsgId";
        mAutoDBInfo.colsMap.put("localMsgId", "LONG");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '-1' ");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " billNo TEXT PRIMARY KEY ,  insertmsg INTEGER,  localMsgId LONG,  status INTEGER default '-1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38526b)) {
            return false;
        }
        C38526b bVar = (C38526b) iAutoDBItem;
        return C46238a.m51546a(this.field_billNo, bVar.field_billNo) && C46238a.m51546a(Boolean.valueOf(this.field_insertmsg), Boolean.valueOf(bVar.field_insertmsg)) && C46238a.m51546a(Long.valueOf(this.field_localMsgId), Long.valueOf(bVar.field_localMsgId)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(bVar.field_status));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101703j == hashCode) {
                    try {
                        this.field_billNo = cursor.getString(i);
                        this.f101710d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101704n == hashCode) {
                    try {
                        this.field_insertmsg = cursor.getInt(i) != 0;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101705o == hashCode) {
                    try {
                        this.field_localMsgId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101706p == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAARecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101707q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101710d) {
            contentValues.put("billNo", this.field_billNo);
        }
        if (this.f101711e) {
            if (this.field_insertmsg) {
                contentValues.put("insertmsg", 1);
            } else {
                contentValues.put("insertmsg", 0);
            }
        }
        if (this.f101712f) {
            contentValues.put("localMsgId", Long.valueOf(this.field_localMsgId));
        }
        if (this.f101713g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAARecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AARecord ( " + f101708r.sql + ");");
        for (String add : f101702i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAARecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AARecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101708r, "AARecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAARecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AARecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAARecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101708r;
    }

    public String[] getIndexCreateSQL() {
        return f101702i;
    }

    public StorageObserverOwner<C38526b> getObserverOwner() {
        return f101709s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_billNo;
    }

    public SingleTable getTable() {
        return f101701h;
    }

    public String getTableName() {
        return f101701h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("billNo")) {
            this.field_billNo = contentValues.getAsString("billNo");
            if (z) {
                this.f101710d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.field_insertmsg = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z) {
                this.f101711e = true;
            }
        }
        if (contentValues.containsKey("localMsgId")) {
            this.field_localMsgId = contentValues.getAsLong("localMsgId").longValue();
            if (z) {
                this.f101712f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f101713g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
