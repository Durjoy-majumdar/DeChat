package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* renamed from: xh.sa */
public class C38663sa extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103715h;

    /* renamed from: i */
    public static final String[] f103716i = new String[0];

    /* renamed from: j */
    public static final int f103717j = 93028124;

    /* renamed from: n */
    public static final int f103718n = 487289539;

    /* renamed from: o */
    public static final int f103719o = -1922646203;

    /* renamed from: p */
    public static final int f103720p = -896505829;

    /* renamed from: q */
    public static final int f103721q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103722r = initAutoDBInfo(C38663sa.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38663sa> f103723s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103724d = true;

    /* renamed from: e */
    public boolean f103725e = true;

    /* renamed from: f */
    public boolean f103726f = true;
    public String field_appId;
    public String field_exptInfo;
    public long field_issueTimestampMs;
    public int field_source;

    /* renamed from: g */
    public boolean f103727g = true;

    static {
        SingleTable singleTable = new SingleTable("WxaWeDataExptInfo");
        f103715h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("issueTimestampMs", "long", singleTable.getName(), "");
        new Column("exptInfo", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "issueTimestampMs";
        mAutoDBInfo.colsMap.put("issueTimestampMs", "LONG");
        mAutoDBInfo.columns[2] = "exptInfo";
        mAutoDBInfo.colsMap.put("exptInfo", "TEXT");
        mAutoDBInfo.columns[3] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  issueTimestampMs LONG,  exptInfo TEXT,  source INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38663sa)) {
            return false;
        }
        C38663sa saVar = (C38663sa) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, saVar.field_appId) && C46238a.m51546a(Long.valueOf(this.field_issueTimestampMs), Long.valueOf(saVar.field_issueTimestampMs)) && C46238a.m51546a(this.field_exptInfo, saVar.field_exptInfo) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(saVar.field_source));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103717j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f103724d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103718n == hashCode) {
                    try {
                        this.field_issueTimestampMs = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103719o == hashCode) {
                    try {
                        this.field_exptInfo = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103720p == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaWeDataExptInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103721q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103724d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103725e) {
            contentValues.put("issueTimestampMs", Long.valueOf(this.field_issueTimestampMs));
        }
        if (this.f103726f) {
            contentValues.put("exptInfo", this.field_exptInfo);
        }
        if (this.f103727g) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaWeDataExptInfo ( " + f103722r.sql + ");");
        for (String add : f103716i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaWeDataExptInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103722r, "WxaWeDataExptInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaWeDataExptInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103722r;
    }

    public String[] getIndexCreateSQL() {
        return f103716i;
    }

    public StorageObserverOwner<C38663sa> getObserverOwner() {
        return f103723s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f103715h;
    }

    public String getTableName() {
        return f103715h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103724d = true;
            }
        }
        if (contentValues.containsKey("issueTimestampMs")) {
            this.field_issueTimestampMs = contentValues.getAsLong("issueTimestampMs").longValue();
            if (z) {
                this.f103725e = true;
            }
        }
        if (contentValues.containsKey("exptInfo")) {
            this.field_exptInfo = contentValues.getAsString("exptInfo");
            if (z) {
                this.f103726f = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f103727g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
