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

/* renamed from: xh.e5 */
public class C38553e5 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102139A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f102140B = initAutoDBInfo(C38553e5.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38553e5> f102141C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f102142p;

    /* renamed from: q */
    public static final String[] f102143q = new String[0];

    /* renamed from: r */
    public static final int f102144r = 104192092;

    /* renamed from: s */
    public static final int f102145s = -1274506345;

    /* renamed from: t */
    public static final int f102146t = -1421131984;

    /* renamed from: u */
    public static final int f102147u = 107902;

    /* renamed from: v */
    public static final int f102148v = 3530753;

    /* renamed from: w */
    public static final int f102149w = -881080743;

    /* renamed from: x */
    public static final int f102150x = 635675911;

    /* renamed from: y */
    public static final int f102151y = -855009709;

    /* renamed from: z */
    public static final int f102152z = 298869077;

    /* renamed from: d */
    public boolean f102153d = true;

    /* renamed from: e */
    public boolean f102154e = true;

    /* renamed from: f */
    public boolean f102155f = true;
    public String field_aeskey;
    public int field_cdnType;
    public String field_fileThumbUrl;
    public String field_fileUrl;
    public String field_fileid;
    public String field_md5;
    public long field_msgid;
    public int field_size;
    public String field_talker;

    /* renamed from: g */
    public boolean f102156g = true;

    /* renamed from: h */
    public boolean f102157h = true;

    /* renamed from: i */
    public boolean f102158i = true;

    /* renamed from: j */
    public boolean f102159j = true;

    /* renamed from: n */
    public boolean f102160n = true;

    /* renamed from: o */
    public boolean f102161o = true;

    static {
        SingleTable singleTable = new SingleTable("HardIotCdnInfo");
        f102142p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgid", "long", singleTable.getName(), "");
        new Column("fileid", "string", singleTable.getName(), "");
        new Column("aeskey", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("size", "int", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("cdnType", "int", singleTable.getName(), "");
        new Column("fileUrl", "string", singleTable.getName(), "");
        new Column("fileThumbUrl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgid";
        mAutoDBInfo.colsMap.put("msgid", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgid";
        mAutoDBInfo.columns[1] = "fileid";
        mAutoDBInfo.colsMap.put("fileid", "TEXT");
        mAutoDBInfo.columns[2] = "aeskey";
        mAutoDBInfo.colsMap.put("aeskey", "TEXT");
        mAutoDBInfo.columns[3] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[4] = "size";
        mAutoDBInfo.colsMap.put("size", "INTEGER");
        mAutoDBInfo.columns[5] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[6] = "cdnType";
        mAutoDBInfo.colsMap.put("cdnType", "INTEGER");
        mAutoDBInfo.columns[7] = "fileUrl";
        mAutoDBInfo.colsMap.put("fileUrl", "TEXT");
        mAutoDBInfo.columns[8] = "fileThumbUrl";
        mAutoDBInfo.colsMap.put("fileThumbUrl", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " msgid LONG PRIMARY KEY ,  fileid TEXT,  aeskey TEXT,  md5 TEXT,  size INTEGER,  talker TEXT,  cdnType INTEGER,  fileUrl TEXT,  fileThumbUrl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38553e5)) {
            return false;
        }
        C38553e5 e5Var = (C38553e5) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgid), Long.valueOf(e5Var.field_msgid)) && C46238a.m51546a(this.field_fileid, e5Var.field_fileid) && C46238a.m51546a(this.field_aeskey, e5Var.field_aeskey) && C46238a.m51546a(this.field_md5, e5Var.field_md5) && C46238a.m51546a(Integer.valueOf(this.field_size), Integer.valueOf(e5Var.field_size)) && C46238a.m51546a(this.field_talker, e5Var.field_talker) && C46238a.m51546a(Integer.valueOf(this.field_cdnType), Integer.valueOf(e5Var.field_cdnType)) && C46238a.m51546a(this.field_fileUrl, e5Var.field_fileUrl) && C46238a.m51546a(this.field_fileThumbUrl, e5Var.field_fileThumbUrl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102144r == hashCode) {
                    try {
                        this.field_msgid = cursor.getLong(i);
                        this.f102153d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102145s == hashCode) {
                    try {
                        this.field_fileid = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102146t == hashCode) {
                    try {
                        this.field_aeskey = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102147u == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102148v == hashCode) {
                    try {
                        this.field_size = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102149w == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102150x == hashCode) {
                    try {
                        this.field_cdnType = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102151y == hashCode) {
                    try {
                        this.field_fileUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102152z == hashCode) {
                    try {
                        this.field_fileThumbUrl = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardIotCdnInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102139A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102153d) {
            contentValues.put("msgid", Long.valueOf(this.field_msgid));
        }
        if (this.f102154e) {
            contentValues.put("fileid", this.field_fileid);
        }
        if (this.f102155f) {
            contentValues.put("aeskey", this.field_aeskey);
        }
        if (this.f102156g) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f102157h) {
            contentValues.put("size", Integer.valueOf(this.field_size));
        }
        if (this.f102158i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f102159j) {
            contentValues.put("cdnType", Integer.valueOf(this.field_cdnType));
        }
        if (this.f102160n) {
            contentValues.put("fileUrl", this.field_fileUrl);
        }
        if (this.f102161o) {
            contentValues.put("fileThumbUrl", this.field_fileThumbUrl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardIotCdnInfo ( " + f102140B.sql + ");");
        for (String add : f102143q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardIotCdnInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102140B, "HardIotCdnInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardIotCdnInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardIotCdnInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102140B;
    }

    public String[] getIndexCreateSQL() {
        return f102143q;
    }

    public StorageObserverOwner<C38553e5> getObserverOwner() {
        return f102141C;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgid);
    }

    public SingleTable getTable() {
        return f102142p;
    }

    public String getTableName() {
        return f102142p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z) {
                this.f102153d = true;
            }
        }
        if (contentValues.containsKey("fileid")) {
            this.field_fileid = contentValues.getAsString("fileid");
            if (z) {
                this.f102154e = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.field_aeskey = contentValues.getAsString("aeskey");
            if (z) {
                this.f102155f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f102156g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z) {
                this.f102157h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f102158i = true;
            }
        }
        if (contentValues.containsKey("cdnType")) {
            this.field_cdnType = contentValues.getAsInteger("cdnType").intValue();
            if (z) {
                this.f102159j = true;
            }
        }
        if (contentValues.containsKey("fileUrl")) {
            this.field_fileUrl = contentValues.getAsString("fileUrl");
            if (z) {
                this.f102160n = true;
            }
        }
        if (contentValues.containsKey("fileThumbUrl")) {
            this.field_fileThumbUrl = contentValues.getAsString("fileThumbUrl");
            if (z) {
                this.f102161o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
