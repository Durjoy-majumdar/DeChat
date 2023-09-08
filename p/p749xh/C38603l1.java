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

/* renamed from: xh.l1 */
public class C38603l1 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102902f;

    /* renamed from: g */
    public static final String[] f102903g = new String[0];

    /* renamed from: h */
    public static final int f102904h = -265713450;

    /* renamed from: i */
    public static final int f102905i = -1356940551;

    /* renamed from: j */
    public static final int f102906j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102907n = initAutoDBInfo(C38603l1.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38603l1> f102908o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102909d = true;

    /* renamed from: e */
    public boolean f102910e = true;
    public byte[] field_cmdbuf;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("ContactCmdBuf");
        f102902f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("cmdbuf", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "cmdbuf";
        mAutoDBInfo.colsMap.put("cmdbuf", "BLOB default '' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  cmdbuf BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38603l1)) {
            return false;
        }
        C38603l1 l1Var = (C38603l1) iAutoDBItem;
        return C46238a.m51546a(this.field_username, l1Var.field_username) && C46238a.m51546a(this.field_cmdbuf, l1Var.field_cmdbuf);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102904h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f102909d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactCmdBuf", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102905i == hashCode) {
                    try {
                        this.field_cmdbuf = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContactCmdBuf", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102906j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f102909d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f102910e) {
            contentValues.put("cmdbuf", this.field_cmdbuf);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseContactCmdBuf", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ContactCmdBuf ( " + f102907n.sql + ");");
        for (String add : f102903g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseContactCmdBuf", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ContactCmdBuf", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102907n, "ContactCmdBuf", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseContactCmdBuf", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ContactCmdBuf", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseContactCmdBuf", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102907n;
    }

    public String[] getIndexCreateSQL() {
        return f102903g;
    }

    public StorageObserverOwner<C38603l1> getObserverOwner() {
        return f102908o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f102902f;
    }

    public String getTableName() {
        return f102902f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102909d = true;
            }
        }
        if (contentValues.containsKey("cmdbuf")) {
            this.field_cmdbuf = contentValues.getAsByteArray("cmdbuf");
            if (z) {
                this.f102910e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
