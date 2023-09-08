package p749xh;

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

/* renamed from: xh.i5 */
public class C66266i5 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f190572n;

    /* renamed from: o */
    public static final String[] f190573o = new String[0];

    /* renamed from: p */
    public static final int f190574p = 109832170;

    /* renamed from: q */
    public static final int f190575q = -1180158496;

    /* renamed from: r */
    public static final int f190576r = 110371416;

    /* renamed from: s */
    public static final int f190577s = 951530617;

    /* renamed from: t */
    public static final int f190578t = 1775982855;

    /* renamed from: u */
    public static final int f190579u = 1343750747;

    /* renamed from: v */
    public static final int f190580v = 1556838686;

    /* renamed from: w */
    public static final int f190581w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f190582x = initAutoDBInfo(C66266i5.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C66266i5> f190583y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f190584d = true;

    /* renamed from: e */
    public boolean f190585e = true;

    /* renamed from: f */
    public boolean f190586f = true;
    public String field_content;
    public String field_descUrl;
    public short field_isRead;
    public int field_msgType;
    public long field_pushTime;
    public long field_svrId;
    public String field_title;

    /* renamed from: g */
    public boolean f190587g = true;

    /* renamed from: h */
    public boolean f190588h = true;

    /* renamed from: i */
    public boolean f190589i = true;

    /* renamed from: j */
    public boolean f190590j = true;

    static {
        SingleTable singleTable = new SingleTable("IPCallMsg");
        f190572n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("svrId", "long", singleTable.getName(), "");
        new Column("isRead", "short", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("pushTime", "long", singleTable.getName(), "");
        new Column("msgType", "int", singleTable.getName(), "");
        new Column("descUrl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "svrId";
        mAutoDBInfo.colsMap.put("svrId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "svrId";
        mAutoDBInfo.columns[1] = "isRead";
        mAutoDBInfo.colsMap.put("isRead", "SHORT default '0' ");
        mAutoDBInfo.columns[2] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[3] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[4] = "pushTime";
        mAutoDBInfo.colsMap.put("pushTime", "LONG");
        mAutoDBInfo.columns[5] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "INTEGER");
        mAutoDBInfo.columns[6] = "descUrl";
        mAutoDBInfo.colsMap.put("descUrl", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " svrId LONG PRIMARY KEY ,  isRead SHORT default '0' ,  title TEXT,  content TEXT,  pushTime LONG,  msgType INTEGER,  descUrl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66266i5)) {
            return false;
        }
        C66266i5 i5Var = (C66266i5) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_svrId), Long.valueOf(i5Var.field_svrId)) && C46238a.m51546a(Short.valueOf(this.field_isRead), Short.valueOf(i5Var.field_isRead)) && C46238a.m51546a(this.field_title, i5Var.field_title) && C46238a.m51546a(this.field_content, i5Var.field_content) && C46238a.m51546a(Long.valueOf(this.field_pushTime), Long.valueOf(i5Var.field_pushTime)) && C46238a.m51546a(Integer.valueOf(this.field_msgType), Integer.valueOf(i5Var.field_msgType)) && C46238a.m51546a(this.field_descUrl, i5Var.field_descUrl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190574p == hashCode) {
                    try {
                        this.field_svrId = cursor.getLong(i);
                        this.f190584d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190575q == hashCode) {
                    try {
                        this.field_isRead = cursor.getShort(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190576r == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190577s == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190578t == hashCode) {
                    try {
                        this.field_pushTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190579u == hashCode) {
                    try {
                        this.field_msgType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190580v == hashCode) {
                    try {
                        this.field_descUrl = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190581w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f190584d) {
            contentValues.put("svrId", Long.valueOf(this.field_svrId));
        }
        if (this.f190585e) {
            contentValues.put("isRead", Short.valueOf(this.field_isRead));
        }
        if (this.f190586f) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f190587g) {
            contentValues.put("content", this.field_content);
        }
        if (this.f190588h) {
            contentValues.put("pushTime", Long.valueOf(this.field_pushTime));
        }
        if (this.f190589i) {
            contentValues.put("msgType", Integer.valueOf(this.field_msgType));
        }
        if (this.f190590j) {
            contentValues.put("descUrl", this.field_descUrl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseIPCallMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS IPCallMsg ( " + f190582x.sql + ");");
        for (String add : f190573o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallMsg", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("IPCallMsg", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190582x, "IPCallMsg", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallMsg", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("IPCallMsg", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseIPCallMsg", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190582x;
    }

    public String[] getIndexCreateSQL() {
        return f190573o;
    }

    public StorageObserverOwner<C66266i5> getObserverOwner() {
        return f190583y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_svrId);
    }

    public SingleTable getTable() {
        return f190572n;
    }

    public String getTableName() {
        return f190572n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("svrId")) {
            this.field_svrId = contentValues.getAsLong("svrId").longValue();
            if (z) {
                this.f190584d = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsShort("isRead").shortValue();
            if (z) {
                this.f190585e = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f190586f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f190587g = true;
            }
        }
        if (contentValues.containsKey("pushTime")) {
            this.field_pushTime = contentValues.getAsLong("pushTime").longValue();
            if (z) {
                this.f190588h = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z) {
                this.f190589i = true;
            }
        }
        if (contentValues.containsKey("descUrl")) {
            this.field_descUrl = contentValues.getAsString("descUrl");
            if (z) {
                this.f190590j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
