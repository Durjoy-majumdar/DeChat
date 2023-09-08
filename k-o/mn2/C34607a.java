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

/* renamed from: mn2.a */
public class C34607a extends IAutoDBItem {

    /* renamed from: A */
    public static final int f93041A = -892481550;

    /* renamed from: B */
    public static final int f93042B = 110371416;

    /* renamed from: C */
    public static final int f93043C = 3079825;

    /* renamed from: D */
    public static final int f93044D = 1566948313;

    /* renamed from: E */
    public static final int f93045E = 2022955529;

    /* renamed from: F */
    public static final int f93046F = 2022955530;

    /* renamed from: G */
    public static final int f93047G = 2022955531;

    /* renamed from: H */
    public static final int f93048H = -1559901653;

    /* renamed from: I */
    public static final int f93049I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f93050J = initAutoDBInfo(C34607a.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C34607a> f93051K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f93052t;

    /* renamed from: u */
    public static final String[] f93053u = new String[0];

    /* renamed from: v */
    public static final int f93054v = 109833162;

    /* renamed from: w */
    public static final int f93055w = 3575610;

    /* renamed from: x */
    public static final int f93056x = -1867567750;

    /* renamed from: y */
    public static final int f93057y = 1370166729;

    /* renamed from: z */
    public static final int f93058z = 114586;

    /* renamed from: d */
    public boolean f93059d = true;

    /* renamed from: e */
    public boolean f93060e = true;

    /* renamed from: f */
    public boolean f93061f = true;
    public long field_createtime;
    public String field_desc;
    public String field_reserved1;
    public String field_reserved2;
    public int field_reserved3;
    public byte[] field_reservedBuf;
    public int field_status;
    public int field_subtype;
    public long field_svrid;
    public String field_tag;
    public String field_thumburl;
    public String field_title;
    public int field_type;

    /* renamed from: g */
    public boolean f93062g = true;

    /* renamed from: h */
    public boolean f93063h = true;

    /* renamed from: i */
    public boolean f93064i = true;

    /* renamed from: j */
    public boolean f93065j = true;

    /* renamed from: n */
    public boolean f93066n = true;

    /* renamed from: o */
    public boolean f93067o = true;

    /* renamed from: p */
    public boolean f93068p = true;

    /* renamed from: q */
    public boolean f93069q = true;

    /* renamed from: r */
    public boolean f93070r = true;

    /* renamed from: s */
    public boolean f93071s = true;

    static {
        SingleTable singleTable = new SingleTable("ShakeMessage");
        f93052t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("svrid", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("subtype", "int", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
        new Column("tag", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("thumburl", "string", singleTable.getName(), "");
        new Column("reserved1", "string", singleTable.getName(), "");
        new Column("reserved2", "string", singleTable.getName(), "");
        new Column("reserved3", "int", singleTable.getName(), "");
        new Column("reservedBuf", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "svrid";
        mAutoDBInfo.colsMap.put("svrid", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "svrid";
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[2] = "subtype";
        mAutoDBInfo.colsMap.put("subtype", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG");
        mAutoDBInfo.columns[4] = "tag";
        mAutoDBInfo.colsMap.put("tag", "TEXT");
        mAutoDBInfo.columns[5] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[6] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[7] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[8] = "thumburl";
        mAutoDBInfo.colsMap.put("thumburl", "TEXT");
        mAutoDBInfo.columns[9] = "reserved1";
        mAutoDBInfo.colsMap.put("reserved1", "TEXT");
        mAutoDBInfo.columns[10] = "reserved2";
        mAutoDBInfo.colsMap.put("reserved2", "TEXT");
        mAutoDBInfo.columns[11] = "reserved3";
        mAutoDBInfo.colsMap.put("reserved3", "INTEGER");
        mAutoDBInfo.columns[12] = "reservedBuf";
        mAutoDBInfo.colsMap.put("reservedBuf", "BLOB");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " svrid LONG default '0'  PRIMARY KEY ,  type INTEGER,  subtype INTEGER default '0' ,  createtime LONG,  tag TEXT,  status INTEGER,  title TEXT,  desc TEXT,  thumburl TEXT,  reserved1 TEXT,  reserved2 TEXT,  reserved3 INTEGER,  reservedBuf BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C34607a)) {
            return false;
        }
        C34607a aVar = (C34607a) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_svrid), Long.valueOf(aVar.field_svrid)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(aVar.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_subtype), Integer.valueOf(aVar.field_subtype)) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(aVar.field_createtime)) && C46238a.m51546a(this.field_tag, aVar.field_tag) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(aVar.field_status)) && C46238a.m51546a(this.field_title, aVar.field_title) && C46238a.m51546a(this.field_desc, aVar.field_desc) && C46238a.m51546a(this.field_thumburl, aVar.field_thumburl) && C46238a.m51546a(this.field_reserved1, aVar.field_reserved1) && C46238a.m51546a(this.field_reserved2, aVar.field_reserved2) && C46238a.m51546a(Integer.valueOf(this.field_reserved3), Integer.valueOf(aVar.field_reserved3)) && C46238a.m51546a(this.field_reservedBuf, aVar.field_reservedBuf);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f93054v == hashCode) {
                    try {
                        this.field_svrid = cursor.getLong(i);
                        this.f93059d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93055w == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93056x == hashCode) {
                    try {
                        this.field_subtype = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93057y == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93058z == hashCode) {
                    try {
                        this.field_tag = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93041A == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93042B == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93043C == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93044D == hashCode) {
                    try {
                        this.field_thumburl = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93045E == hashCode) {
                    try {
                        this.field_reserved1 = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93046F == hashCode) {
                    try {
                        this.field_reserved2 = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93047G == hashCode) {
                    try {
                        this.field_reserved3 = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93048H == hashCode) {
                    try {
                        this.field_reservedBuf = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93049I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f93059d) {
            contentValues.put("svrid", Long.valueOf(this.field_svrid));
        }
        if (this.f93060e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f93061f) {
            contentValues.put("subtype", Integer.valueOf(this.field_subtype));
        }
        if (this.f93062g) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f93063h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f93064i) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f93065j) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f93066n) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f93067o) {
            contentValues.put("thumburl", this.field_thumburl);
        }
        if (this.f93068p) {
            contentValues.put("reserved1", this.field_reserved1);
        }
        if (this.f93069q) {
            contentValues.put("reserved2", this.field_reserved2);
        }
        if (this.f93070r) {
            contentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
        }
        if (this.f93071s) {
            contentValues.put("reservedBuf", this.field_reservedBuf);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShakeMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShakeMessage ( " + f93050J.sql + ");");
        for (String add : f93053u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShakeMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShakeMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f93050J, "ShakeMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShakeMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShakeMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShakeMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93050J;
    }

    public String[] getIndexCreateSQL() {
        return f93053u;
    }

    public StorageObserverOwner<C34607a> getObserverOwner() {
        return f93051K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_svrid);
    }

    public SingleTable getTable() {
        return f93052t;
    }

    public String getTableName() {
        return f93052t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsLong("svrid").longValue();
            if (z) {
                this.f93059d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f93060e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z) {
                this.f93061f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f93062g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z) {
                this.f93063h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f93064i = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f93065j = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f93066n = true;
            }
        }
        if (contentValues.containsKey("thumburl")) {
            this.field_thumburl = contentValues.getAsString("thumburl");
            if (z) {
                this.f93067o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsString("reserved1");
            if (z) {
                this.f93068p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsString("reserved2");
            if (z) {
                this.f93069q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsInteger("reserved3").intValue();
            if (z) {
                this.f93070r = true;
            }
        }
        if (contentValues.containsKey("reservedBuf")) {
            this.field_reservedBuf = contentValues.getAsByteArray("reservedBuf");
            if (z) {
                this.f93071s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
