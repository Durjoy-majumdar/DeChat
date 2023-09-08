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

/* renamed from: xh.ra */
public class C38654ra extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103552g;

    /* renamed from: h */
    public static final String[] f103553h = new String[0];

    /* renamed from: i */
    public static final int f103554i = 93028124;

    /* renamed from: j */
    public static final int f103555j = 1484112759;

    /* renamed from: n */
    public static final int f103556n = 1304010549;

    /* renamed from: o */
    public static final int f103557o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103558p = initAutoDBInfo(C38654ra.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38654ra> f103559q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103560d = true;

    /* renamed from: e */
    public boolean f103561e = true;

    /* renamed from: f */
    public boolean f103562f = true;
    public String field_appId;
    public int field_appVersion;
    public long field_templateId;

    static {
        SingleTable singleTable = new SingleTable("WxaVersionTemplateIdMapping");
        f103552g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("templateId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "templateId";
        mAutoDBInfo.colsMap.put("templateId", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  appVersion INTEGER,  templateId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38654ra)) {
            return false;
        }
        C38654ra raVar = (C38654ra) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, raVar.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(raVar.field_appVersion)) && C46238a.m51546a(Long.valueOf(this.field_templateId), Long.valueOf(raVar.field_templateId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103554i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103555j == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103556n == hashCode) {
                    try {
                        this.field_templateId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103557o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103560d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103561e) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f103562f) {
            contentValues.put("templateId", Long.valueOf(this.field_templateId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaVersionTemplateIdMapping ( " + f103558p.sql + ");");
        for (String add : f103553h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaVersionTemplateIdMapping", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103558p, "WxaVersionTemplateIdMapping", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaVersionTemplateIdMapping", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103558p;
    }

    public String[] getIndexCreateSQL() {
        return f103553h;
    }

    public StorageObserverOwner<C38654ra> getObserverOwner() {
        return f103559q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103552g;
    }

    public String getTableName() {
        return f103552g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103560d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f103561e = true;
            }
        }
        if (contentValues.containsKey("templateId")) {
            this.field_templateId = contentValues.getAsLong("templateId").longValue();
            if (z) {
                this.f103562f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
