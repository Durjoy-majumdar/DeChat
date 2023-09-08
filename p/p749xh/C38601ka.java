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

/* renamed from: xh.ka */
public class C38601ka extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102882f;

    /* renamed from: g */
    public static final String[] f102883g = new String[0];

    /* renamed from: h */
    public static final int f102884h = 93028124;

    /* renamed from: i */
    public static final int f102885i = -141251434;

    /* renamed from: j */
    public static final int f102886j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102887n = initAutoDBInfo(C38601ka.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38601ka> f102888o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102889d = true;

    /* renamed from: e */
    public boolean f102890e = true;
    public String field_appId;
    public byte[] field_permissionProtoBlob;

    static {
        SingleTable singleTable = new SingleTable("WxaJsApiPluginInfo");
        f102882f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("permissionProtoBlob", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "permissionProtoBlob";
        mAutoDBInfo.colsMap.put("permissionProtoBlob", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  permissionProtoBlob BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38601ka)) {
            return false;
        }
        C38601ka kaVar = (C38601ka) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, kaVar.field_appId) && C46238a.m51546a(this.field_permissionProtoBlob, kaVar.field_permissionProtoBlob);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102884h == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f102889d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaJsApiPluginInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102885i == hashCode) {
                    try {
                        this.field_permissionProtoBlob = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaJsApiPluginInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102886j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102889d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102890e) {
            contentValues.put("permissionProtoBlob", this.field_permissionProtoBlob);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaJsApiPluginInfo ( " + f102887n.sql + ");");
        for (String add : f102883g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaJsApiPluginInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102887n, "WxaJsApiPluginInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaJsApiPluginInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaJsApiPluginInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102887n;
    }

    public String[] getIndexCreateSQL() {
        return f102883g;
    }

    public StorageObserverOwner<C38601ka> getObserverOwner() {
        return f102888o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f102882f;
    }

    public String getTableName() {
        return f102882f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102889d = true;
            }
        }
        if (contentValues.containsKey("permissionProtoBlob")) {
            this.field_permissionProtoBlob = contentValues.getAsByteArray("permissionProtoBlob");
            if (z) {
                this.f102890e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
