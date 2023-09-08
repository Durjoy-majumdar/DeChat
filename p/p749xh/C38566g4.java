package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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

/* renamed from: xh.g4 */
public class C38566g4 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102343n;

    /* renamed from: o */
    public static final String[] f102344o = new String[0];

    /* renamed from: p */
    public static final int f102345p = 104191100;

    /* renamed from: q */
    public static final int f102346q = 118807;

    /* renamed from: r */
    public static final int f102347r = 93028124;

    /* renamed from: s */
    public static final int f102348s = 110371416;

    /* renamed from: t */
    public static final int f102349t = -1724546052;

    /* renamed from: u */
    public static final int f102350u = -896505829;

    /* renamed from: v */
    public static final int f102351v = 3575610;

    /* renamed from: w */
    public static final int f102352w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102353x = initAutoDBInfo(C38566g4.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38566g4> f102354y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102355d = true;

    /* renamed from: e */
    public boolean f102356e = true;

    /* renamed from: f */
    public boolean f102357f = true;
    public String field_appId;
    public String field_description;
    public long field_msgId;
    public String field_source;
    public String field_title;
    public int field_type;
    public String field_xml;

    /* renamed from: g */
    public boolean f102358g = true;

    /* renamed from: h */
    public boolean f102359h = true;

    /* renamed from: i */
    public boolean f102360i = true;

    /* renamed from: j */
    public boolean f102361j = true;

    static {
        SingleTable singleTable = new SingleTable("GameLifeAppMessage");
        f102343n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("xml", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("description", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "xml";
        mAutoDBInfo.colsMap.put("xml", "TEXT");
        mAutoDBInfo.columns[2] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[3] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[4] = "description";
        mAutoDBInfo.colsMap.put("description", "TEXT");
        mAutoDBInfo.columns[5] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "TEXT");
        mAutoDBInfo.columns[6] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " msgId LONG default '0'  PRIMARY KEY ,  xml TEXT,  appId TEXT,  title TEXT,  description TEXT,  source TEXT,  type INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38566g4)) {
            return false;
        }
        C38566g4 g4Var = (C38566g4) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(g4Var.field_msgId)) && C46238a.m51546a(this.field_xml, g4Var.field_xml) && C46238a.m51546a(this.field_appId, g4Var.field_appId) && C46238a.m51546a(this.field_title, g4Var.field_title) && C46238a.m51546a(this.field_description, g4Var.field_description) && C46238a.m51546a(this.field_source, g4Var.field_source) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(g4Var.field_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102345p == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f102355d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102346q == hashCode) {
                    try {
                        this.field_xml = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102347r == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102348s == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102349t == hashCode) {
                    try {
                        this.field_description = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102350u == hashCode) {
                    try {
                        this.field_source = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102351v == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeAppMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102352w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102355d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102356e) {
            contentValues.put("xml", this.field_xml);
        }
        if (this.f102357f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102358g) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f102359h) {
            contentValues.put("description", this.field_description);
        }
        if (this.f102360i) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, this.field_source);
        }
        if (this.f102361j) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameLifeAppMessage ( " + f102353x.sql + ");");
        for (String add : f102344o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameLifeAppMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102353x, "GameLifeAppMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeAppMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameLifeAppMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102353x;
    }

    public String[] getIndexCreateSQL() {
        return f102344o;
    }

    public StorageObserverOwner<C38566g4> getObserverOwner() {
        return f102354y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f102343n;
    }

    public String getTableName() {
        return f102343n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102355d = true;
            }
        }
        if (contentValues.containsKey("xml")) {
            this.field_xml = contentValues.getAsString("xml");
            if (z) {
                this.f102356e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102357f = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f102358g = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z) {
                this.f102359h = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsString(FirebaseAnalytics.C113379b.SOURCE);
            if (z) {
                this.f102360i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f102361j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
