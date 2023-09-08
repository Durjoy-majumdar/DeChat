package mn2;

import android.content.ContentValues;
import android.database.Cursor;
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

/* renamed from: mn2.c */
public class C34609c extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f93083i;

    /* renamed from: j */
    public static final String[] f93084j = new String[0];

    /* renamed from: n */
    public static final int f93085n = -265713450;

    /* renamed from: o */
    public static final int f93086o = 629233382;

    /* renamed from: p */
    public static final int f93087p = 110371416;

    /* renamed from: q */
    public static final int f93088q = 1638795862;

    /* renamed from: r */
    public static final int f93089r = 1370166729;

    /* renamed from: s */
    public static final int f93090s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f93091t = initAutoDBInfo(C34609c.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C34609c> f93092u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f93093d = true;

    /* renamed from: e */
    public boolean f93094e = true;

    /* renamed from: f */
    public boolean f93095f = true;
    public long field_createtime;
    public String field_deeplink;
    public String field_iconurl;
    public String field_title;
    public String field_username;

    /* renamed from: g */
    public boolean f93096g = true;

    /* renamed from: h */
    public boolean f93097h = true;

    static {
        SingleTable singleTable = new SingleTable("ShakeTvHistory");
        f93083i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("deeplink", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("iconurl", "string", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "deeplink";
        mAutoDBInfo.colsMap.put("deeplink", "TEXT default '' ");
        mAutoDBInfo.columns[2] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        mAutoDBInfo.columns[3] = "iconurl";
        mAutoDBInfo.colsMap.put("iconurl", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG default '' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  deeplink TEXT default '' ,  title TEXT default '' ,  iconurl TEXT default '' ,  createtime LONG default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C34609c)) {
            return false;
        }
        C34609c cVar = (C34609c) iAutoDBItem;
        return C46238a.m51546a(this.field_username, cVar.field_username) && C46238a.m51546a(this.field_deeplink, cVar.field_deeplink) && C46238a.m51546a(this.field_title, cVar.field_title) && C46238a.m51546a(this.field_iconurl, cVar.field_iconurl) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(cVar.field_createtime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f93085n == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f93093d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93086o == hashCode) {
                    try {
                        this.field_deeplink = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93087p == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93088q == hashCode) {
                    try {
                        this.field_iconurl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93089r == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93090s == hashCode) {
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
        if (this.f93093d) {
            contentValues.put("username", this.field_username);
        }
        if (this.field_deeplink == null) {
            this.field_deeplink = "";
        }
        if (this.f93094e) {
            contentValues.put("deeplink", this.field_deeplink);
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f93095f) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.field_iconurl == null) {
            this.field_iconurl = "";
        }
        if (this.f93096g) {
            contentValues.put("iconurl", this.field_iconurl);
        }
        if (this.f93097h) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShakeTvHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShakeTvHistory ( " + f93091t.sql + ");");
        for (String add : f93084j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShakeTvHistory", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShakeTvHistory", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f93091t, "ShakeTvHistory", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShakeTvHistory", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShakeTvHistory", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShakeTvHistory", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93091t;
    }

    public String[] getIndexCreateSQL() {
        return f93084j;
    }

    public StorageObserverOwner<C34609c> getObserverOwner() {
        return f93092u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f93083i;
    }

    public String getTableName() {
        return f93083i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f93093d = true;
            }
        }
        if (contentValues.containsKey("deeplink")) {
            this.field_deeplink = contentValues.getAsString("deeplink");
            if (z) {
                this.f93094e = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f93095f = true;
            }
        }
        if (contentValues.containsKey("iconurl")) {
            this.field_iconurl = contentValues.getAsString("iconurl");
            if (z) {
                this.f93096g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f93097h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
