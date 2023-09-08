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
import org.json.JSONObject;

/* renamed from: xh.a7 */
public class C38523a7 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f101656f;

    /* renamed from: g */
    public static final String[] f101657g = new String[0];

    /* renamed from: h */
    public static final int f101658h = -2124225564;

    /* renamed from: i */
    public static final int f101659i = -312491978;

    /* renamed from: j */
    public static final int f101660j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f101661n = initAutoDBInfo(C38523a7.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38523a7> f101662o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101663d = true;

    /* renamed from: e */
    public boolean f101664e = true;
    public long field_openIMSnsFlag;
    public String field_openIMUsername;

    static {
        SingleTable singleTable = new SingleTable("OpenIMSnsFlag");
        f101656f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("openIMUsername", "string", singleTable.getName(), "");
        new Column("openIMSnsFlag", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "openIMUsername";
        mAutoDBInfo.colsMap.put("openIMUsername", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "openIMUsername";
        mAutoDBInfo.columns[1] = "openIMSnsFlag";
        mAutoDBInfo.colsMap.put("openIMSnsFlag", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " openIMUsername TEXT PRIMARY KEY ,  openIMSnsFlag LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38523a7)) {
            return false;
        }
        C38523a7 a7Var = (C38523a7) iAutoDBItem;
        return C46238a.m51546a(this.field_openIMUsername, a7Var.field_openIMUsername) && C46238a.m51546a(Long.valueOf(this.field_openIMSnsFlag), Long.valueOf(a7Var.field_openIMSnsFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101658h == hashCode) {
                    try {
                        this.field_openIMUsername = cursor.getString(i);
                        this.f101663d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMSnsFlag", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101659i == hashCode) {
                    try {
                        this.field_openIMSnsFlag = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMSnsFlag", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101660j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101663d) {
            contentValues.put("openIMUsername", this.field_openIMUsername);
        }
        if (this.f101664e) {
            contentValues.put("openIMSnsFlag", Long.valueOf(this.field_openIMSnsFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMSnsFlag ( " + f101661n.sql + ");");
        for (String add : f101657g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMSnsFlag", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101661n, "OpenIMSnsFlag", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMSnsFlag", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMSnsFlag", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMSnsFlag", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101661n;
    }

    public String[] getIndexCreateSQL() {
        return f101657g;
    }

    public StorageObserverOwner<C38523a7> getObserverOwner() {
        return f101662o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_openIMUsername;
    }

    public SingleTable getTable() {
        return f101656f;
    }

    public String getTableName() {
        return f101656f.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "openIMUsername", this.field_openIMUsername);
            C46238a.m51547b(jSONObject, "openIMSnsFlag", Long.valueOf(this.field_openIMSnsFlag));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("openIMUsername")) {
            this.field_openIMUsername = contentValues.getAsString("openIMUsername");
            if (z) {
                this.f101663d = true;
            }
        }
        if (contentValues.containsKey("openIMSnsFlag")) {
            this.field_openIMSnsFlag = contentValues.getAsLong("openIMSnsFlag").longValue();
            if (z) {
                this.f101664e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
