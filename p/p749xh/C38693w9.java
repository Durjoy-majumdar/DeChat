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

/* renamed from: xh.w9 */
public class C38693w9 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f104156j;

    /* renamed from: n */
    public static final String[] f104157n = new String[0];

    /* renamed from: o */
    public static final int f104158o = -799234740;

    /* renamed from: p */
    public static final int f104159p = 3321850;

    /* renamed from: q */
    public static final int f104160q = 110371416;

    /* renamed from: r */
    public static final int f104161r = -896505829;

    /* renamed from: s */
    public static final int f104162s = -1185088852;

    /* renamed from: t */
    public static final int f104163t = 25573622;

    /* renamed from: u */
    public static final int f104164u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f104165v = initAutoDBInfo(C38693w9.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38693w9> f104166w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104167d = true;

    /* renamed from: e */
    public boolean f104168e = true;

    /* renamed from: f */
    public boolean f104169f = true;
    public String field_imgUrl;
    public String field_link;
    public String field_recordId;
    public String field_source;
    public long field_timeStamp;
    public String field_title;

    /* renamed from: g */
    public boolean f104170g = true;

    /* renamed from: h */
    public boolean f104171h = true;

    /* renamed from: i */
    public boolean f104172i = true;

    static {
        SingleTable singleTable = new SingleTable("WebViewHistory");
        f104156j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("recordId", "string", singleTable.getName(), "");
        new Column("link", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "string", singleTable.getName(), "");
        new Column("imgUrl", "string", singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "recordId";
        mAutoDBInfo.colsMap.put("recordId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "recordId";
        mAutoDBInfo.columns[1] = "link";
        mAutoDBInfo.colsMap.put("link", "TEXT");
        mAutoDBInfo.columns[2] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[3] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "TEXT");
        mAutoDBInfo.columns[4] = "imgUrl";
        mAutoDBInfo.colsMap.put("imgUrl", "TEXT");
        mAutoDBInfo.columns[5] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " recordId TEXT PRIMARY KEY ,  link TEXT,  title TEXT,  source TEXT,  imgUrl TEXT,  timeStamp LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38693w9)) {
            return false;
        }
        C38693w9 w9Var = (C38693w9) iAutoDBItem;
        return C46238a.m51546a(this.field_recordId, w9Var.field_recordId) && C46238a.m51546a(this.field_link, w9Var.field_link) && C46238a.m51546a(this.field_title, w9Var.field_title) && C46238a.m51546a(this.field_source, w9Var.field_source) && C46238a.m51546a(this.field_imgUrl, w9Var.field_imgUrl) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(w9Var.field_timeStamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104158o == hashCode) {
                    try {
                        this.field_recordId = cursor.getString(i);
                        this.f104167d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104159p == hashCode) {
                    try {
                        this.field_link = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104160q == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104161r == hashCode) {
                    try {
                        this.field_source = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104162s == hashCode) {
                    try {
                        this.field_imgUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104163t == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHistory", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104164u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104167d) {
            contentValues.put("recordId", this.field_recordId);
        }
        if (this.f104168e) {
            contentValues.put("link", this.field_link);
        }
        if (this.f104169f) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f104170g) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, this.field_source);
        }
        if (this.f104171h) {
            contentValues.put("imgUrl", this.field_imgUrl);
        }
        if (this.f104172i) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWebViewHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WebViewHistory ( " + f104165v.sql + ");");
        for (String add : f104157n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewHistory", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WebViewHistory", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104165v, "WebViewHistory", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWebViewHistory", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WebViewHistory", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWebViewHistory", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104165v;
    }

    public String[] getIndexCreateSQL() {
        return f104157n;
    }

    public StorageObserverOwner<C38693w9> getObserverOwner() {
        return f104166w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_recordId;
    }

    public SingleTable getTable() {
        return f104156j;
    }

    public String getTableName() {
        return f104156j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsString("recordId");
            if (z) {
                this.f104167d = true;
            }
        }
        if (contentValues.containsKey("link")) {
            this.field_link = contentValues.getAsString("link");
            if (z) {
                this.f104168e = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f104169f = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsString(FirebaseAnalytics.C113379b.SOURCE);
            if (z) {
                this.f104170g = true;
            }
        }
        if (contentValues.containsKey("imgUrl")) {
            this.field_imgUrl = contentValues.getAsString("imgUrl");
            if (z) {
                this.f104171h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f104172i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
