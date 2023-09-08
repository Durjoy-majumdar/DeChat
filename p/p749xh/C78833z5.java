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

/* renamed from: xh.z5 */
public class C78833z5 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C78833z5> f231640A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f231641o;

    /* renamed from: p */
    public static final String[] f231642p = {"CREATE INDEX IF NOT EXISTS LocalStoryDetailPacketIdIndex ON LocalStoryDetail(packet_id)"};

    /* renamed from: q */
    public static final int f231643q = 1939875509;

    /* renamed from: r */
    public static final int f231644r = 2140787348;

    /* renamed from: s */
    public static final int f231645s = 2140779171;

    /* renamed from: t */
    public static final int f231646t = -1221029593;

    /* renamed from: u */
    public static final int f231647u = 113126854;

    /* renamed from: v */
    public static final int f231648v = 1806137394;

    /* renamed from: w */
    public static final int f231649w = 138801484;

    /* renamed from: x */
    public static final int f231650x = 138793307;

    /* renamed from: y */
    public static final int f231651y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f231652z = initAutoDBInfo(C78833z5.class);

    /* renamed from: d */
    public boolean f231653d = true;

    /* renamed from: e */
    public boolean f231654e = true;

    /* renamed from: f */
    public boolean f231655f = true;
    public int field_height;
    public String field_media_fuzzy_thumbnail_md5;
    public String field_media_fuzzy_thumbnail_url;
    public String field_media_md5;
    public int field_media_type;
    public String field_media_url;
    public String field_packet_id;
    public int field_width;

    /* renamed from: g */
    public boolean f231656g = true;

    /* renamed from: h */
    public boolean f231657h = true;

    /* renamed from: i */
    public boolean f231658i = true;

    /* renamed from: j */
    public boolean f231659j = true;

    /* renamed from: n */
    public boolean f231660n = true;

    static {
        SingleTable singleTable = new SingleTable("LocalStoryDetail");
        f231641o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("media_type", "int", singleTable.getName(), "");
        new Column("media_url", "string", singleTable.getName(), "");
        new Column("media_md5", "string", singleTable.getName(), "");
        new Column("height", "int", singleTable.getName(), "");
        new Column("width", "int", singleTable.getName(), "");
        new Column("packet_id", "string", singleTable.getName(), "");
        new Column("media_fuzzy_thumbnail_url", "string", singleTable.getName(), "");
        new Column("media_fuzzy_thumbnail_md5", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "media_type";
        mAutoDBInfo.colsMap.put("media_type", "INTEGER");
        mAutoDBInfo.columns[1] = "media_url";
        mAutoDBInfo.colsMap.put("media_url", "TEXT");
        mAutoDBInfo.columns[2] = "media_md5";
        mAutoDBInfo.colsMap.put("media_md5", "TEXT");
        mAutoDBInfo.columns[3] = "height";
        mAutoDBInfo.colsMap.put("height", "INTEGER");
        mAutoDBInfo.columns[4] = "width";
        mAutoDBInfo.colsMap.put("width", "INTEGER");
        mAutoDBInfo.columns[5] = "packet_id";
        mAutoDBInfo.colsMap.put("packet_id", "TEXT");
        mAutoDBInfo.columns[6] = "media_fuzzy_thumbnail_url";
        mAutoDBInfo.colsMap.put("media_fuzzy_thumbnail_url", "TEXT");
        mAutoDBInfo.columns[7] = "media_fuzzy_thumbnail_md5";
        mAutoDBInfo.colsMap.put("media_fuzzy_thumbnail_md5", "TEXT");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " media_type INTEGER,  media_url TEXT,  media_md5 TEXT,  height INTEGER,  width INTEGER,  packet_id TEXT,  media_fuzzy_thumbnail_url TEXT,  media_fuzzy_thumbnail_md5 TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78833z5)) {
            return false;
        }
        C78833z5 z5Var = (C78833z5) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_media_type), Integer.valueOf(z5Var.field_media_type)) && C46238a.m51546a(this.field_media_url, z5Var.field_media_url) && C46238a.m51546a(this.field_media_md5, z5Var.field_media_md5) && C46238a.m51546a(Integer.valueOf(this.field_height), Integer.valueOf(z5Var.field_height)) && C46238a.m51546a(Integer.valueOf(this.field_width), Integer.valueOf(z5Var.field_width)) && C46238a.m51546a(this.field_packet_id, z5Var.field_packet_id) && C46238a.m51546a(this.field_media_fuzzy_thumbnail_url, z5Var.field_media_fuzzy_thumbnail_url) && C46238a.m51546a(this.field_media_fuzzy_thumbnail_md5, z5Var.field_media_fuzzy_thumbnail_md5);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231643q == hashCode) {
                    try {
                        this.field_media_type = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231644r == hashCode) {
                    try {
                        this.field_media_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231645s == hashCode) {
                    try {
                        this.field_media_md5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231646t == hashCode) {
                    try {
                        this.field_height = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231647u == hashCode) {
                    try {
                        this.field_width = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231648v == hashCode) {
                    try {
                        this.field_packet_id = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231649w == hashCode) {
                    try {
                        this.field_media_fuzzy_thumbnail_url = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231650x == hashCode) {
                    try {
                        this.field_media_fuzzy_thumbnail_md5 = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231651y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231653d) {
            contentValues.put("media_type", Integer.valueOf(this.field_media_type));
        }
        if (this.f231654e) {
            contentValues.put("media_url", this.field_media_url);
        }
        if (this.f231655f) {
            contentValues.put("media_md5", this.field_media_md5);
        }
        if (this.f231656g) {
            contentValues.put("height", Integer.valueOf(this.field_height));
        }
        if (this.f231657h) {
            contentValues.put("width", Integer.valueOf(this.field_width));
        }
        if (this.f231658i) {
            contentValues.put("packet_id", this.field_packet_id);
        }
        if (this.f231659j) {
            contentValues.put("media_fuzzy_thumbnail_url", this.field_media_fuzzy_thumbnail_url);
        }
        if (this.f231660n) {
            contentValues.put("media_fuzzy_thumbnail_md5", this.field_media_fuzzy_thumbnail_md5);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLocalStoryDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LocalStoryDetail ( " + f231652z.sql + ");");
        for (String add : f231642p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLocalStoryDetail", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LocalStoryDetail", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231652z, "LocalStoryDetail", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLocalStoryDetail", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LocalStoryDetail", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLocalStoryDetail", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231652z;
    }

    public String[] getIndexCreateSQL() {
        return f231642p;
    }

    public StorageObserverOwner<C78833z5> getObserverOwner() {
        return f231640A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231641o;
    }

    public String getTableName() {
        return f231641o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("media_type")) {
            this.field_media_type = contentValues.getAsInteger("media_type").intValue();
            if (z) {
                this.f231653d = true;
            }
        }
        if (contentValues.containsKey("media_url")) {
            this.field_media_url = contentValues.getAsString("media_url");
            if (z) {
                this.f231654e = true;
            }
        }
        if (contentValues.containsKey("media_md5")) {
            this.field_media_md5 = contentValues.getAsString("media_md5");
            if (z) {
                this.f231655f = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.field_height = contentValues.getAsInteger("height").intValue();
            if (z) {
                this.f231656g = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.field_width = contentValues.getAsInteger("width").intValue();
            if (z) {
                this.f231657h = true;
            }
        }
        if (contentValues.containsKey("packet_id")) {
            this.field_packet_id = contentValues.getAsString("packet_id");
            if (z) {
                this.f231658i = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_url")) {
            this.field_media_fuzzy_thumbnail_url = contentValues.getAsString("media_fuzzy_thumbnail_url");
            if (z) {
                this.f231659j = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_md5")) {
            this.field_media_fuzzy_thumbnail_md5 = contentValues.getAsString("media_fuzzy_thumbnail_md5");
            if (z) {
                this.f231660n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
