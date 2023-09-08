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
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.x2 */
public class C38696x2 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104199i;

    /* renamed from: j */
    public static final String[] f104200j = new String[0];

    /* renamed from: n */
    public static final int f104201n = -1294411543;

    /* renamed from: o */
    public static final int f104202o = -565909657;

    /* renamed from: p */
    public static final int f104203p = 98437;

    /* renamed from: q */
    public static final int f104204q = -1421131984;

    /* renamed from: r */
    public static final int f104205r = -735662143;

    /* renamed from: s */
    public static final int f104206s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104207t = initAutoDBInfo(C38696x2.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38696x2> f104208u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104209d = true;

    /* renamed from: e */
    public boolean f104210e = true;

    /* renamed from: f */
    public boolean f104211f = true;
    public String field_aeskey;
    public String field_cgi;
    public String field_filePath;
    public long field_msgSvrId;
    public long field_overwriteNewMsgId;

    /* renamed from: g */
    public boolean f104212g = true;

    /* renamed from: h */
    public boolean f104213h = true;

    static {
        SingleTable singleTable = new SingleTable("FileMsgInfo");
        f104199i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("overwriteNewMsgId", "long", singleTable.getName(), "");
        new Column("cgi", "string", singleTable.getName(), "");
        new Column("aeskey", "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgSvrId";
        mAutoDBInfo.columns[1] = "overwriteNewMsgId";
        mAutoDBInfo.colsMap.put("overwriteNewMsgId", "LONG");
        mAutoDBInfo.columns[2] = "cgi";
        mAutoDBInfo.colsMap.put("cgi", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "aeskey";
        mAutoDBInfo.colsMap.put("aeskey", "TEXT default '' ");
        mAutoDBInfo.columns[4] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT default '' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " msgSvrId LONG PRIMARY KEY ,  overwriteNewMsgId LONG,  cgi TEXT default '' ,  aeskey TEXT default '' ,  filePath TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38696x2)) {
            return false;
        }
        C38696x2 x2Var = (C38696x2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(x2Var.field_msgSvrId)) && C46238a.m51546a(Long.valueOf(this.field_overwriteNewMsgId), Long.valueOf(x2Var.field_overwriteNewMsgId)) && C46238a.m51546a(this.field_cgi, x2Var.field_cgi) && C46238a.m51546a(this.field_aeskey, x2Var.field_aeskey) && C46238a.m51546a(this.field_filePath, x2Var.field_filePath);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104201n == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                        this.f104209d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104202o == hashCode) {
                    try {
                        this.field_overwriteNewMsgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104203p == hashCode) {
                    try {
                        this.field_cgi = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104204q == hashCode) {
                    try {
                        this.field_aeskey = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104205r == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104206s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104209d) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f104210e) {
            contentValues.put("overwriteNewMsgId", Long.valueOf(this.field_overwriteNewMsgId));
        }
        if (this.field_cgi == null) {
            this.field_cgi = "";
        }
        if (this.f104211f) {
            contentValues.put("cgi", this.field_cgi);
        }
        if (this.field_aeskey == null) {
            this.field_aeskey = "";
        }
        if (this.f104212g) {
            contentValues.put("aeskey", this.field_aeskey);
        }
        if (this.field_filePath == null) {
            this.field_filePath = "";
        }
        if (this.f104213h) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFileMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FileMsgInfo ( " + f104207t.sql + ");");
        for (String add : f104200j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFileMsgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FileMsgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104207t, "FileMsgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFileMsgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FileMsgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFileMsgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104207t;
    }

    public String[] getIndexCreateSQL() {
        return f104200j;
    }

    public StorageObserverOwner<C38696x2> getObserverOwner() {
        return f104208u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgSvrId);
    }

    public SingleTable getTable() {
        return f104199i;
    }

    public String getTableName() {
        return f104199i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f104209d = true;
            }
        }
        if (contentValues.containsKey("overwriteNewMsgId")) {
            this.field_overwriteNewMsgId = contentValues.getAsLong("overwriteNewMsgId").longValue();
            if (z) {
                this.f104210e = true;
            }
        }
        if (contentValues.containsKey("cgi")) {
            this.field_cgi = contentValues.getAsString("cgi");
            if (z) {
                this.f104211f = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.field_aeskey = contentValues.getAsString("aeskey");
            if (z) {
                this.f104212g = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f104213h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
