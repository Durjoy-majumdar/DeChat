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

/* renamed from: xh.oa */
public class C38629oa extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103269f;

    /* renamed from: g */
    public static final String[] f103270g = new String[0];

    /* renamed from: h */
    public static final int f103271h = 93028124;

    /* renamed from: i */
    public static final int f103272i = 905053173;

    /* renamed from: j */
    public static final int f103273j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103274n = initAutoDBInfo(C38629oa.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38629oa> f103275o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103276d = true;

    /* renamed from: e */
    public boolean f103277e = true;
    public String field_appId;
    public String field_securityKeySalt;

    static {
        SingleTable singleTable = new SingleTable("WxaSecurityStorageInfo");
        f103269f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("securityKeySalt", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "securityKeySalt";
        mAutoDBInfo.colsMap.put("securityKeySalt", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  securityKeySalt TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38629oa)) {
            return false;
        }
        C38629oa oaVar = (C38629oa) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, oaVar.field_appId) && C46238a.m51546a(this.field_securityKeySalt, oaVar.field_securityKeySalt);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103271h == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103272i == hashCode) {
                    try {
                        this.field_securityKeySalt = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103273j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103276d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103277e) {
            contentValues.put("securityKeySalt", this.field_securityKeySalt);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaSecurityStorageInfo ( " + f103274n.sql + ");");
        for (String add : f103270g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaSecurityStorageInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103274n, "WxaSecurityStorageInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaSecurityStorageInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103274n;
    }

    public String[] getIndexCreateSQL() {
        return f103270g;
    }

    public StorageObserverOwner<C38629oa> getObserverOwner() {
        return f103275o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103269f;
    }

    public String getTableName() {
        return f103269f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103276d = true;
            }
        }
        if (contentValues.containsKey("securityKeySalt")) {
            this.field_securityKeySalt = contentValues.getAsString("securityKeySalt");
            if (z) {
                this.f103277e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
