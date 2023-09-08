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

/* renamed from: xh.g2 */
public class C53337g2 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149405A = -1868521062;

    /* renamed from: B */
    public static final int f149406B = 1122179898;

    /* renamed from: C */
    public static final int f149407C = 1837153178;

    /* renamed from: D */
    public static final int f149408D = -2035383834;

    /* renamed from: E */
    public static final int f149409E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f149410F = initAutoDBInfo(C53337g2.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C53337g2> f149411G = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f149412r;

    /* renamed from: s */
    public static final String[] f149413s = new String[0];

    /* renamed from: t */
    public static final int f149414t = -1289150094;

    /* renamed from: u */
    public static final int f149415u = 293428218;

    /* renamed from: v */
    public static final int f149416v = -1308937496;

    /* renamed from: w */
    public static final int f149417w = -862962046;

    /* renamed from: x */
    public static final int f149418x = -2129294769;

    /* renamed from: y */
    public static final int f149419y = -1607243192;

    /* renamed from: z */
    public static final int f149420z = -1922307631;

    /* renamed from: d */
    public boolean f149421d = true;

    /* renamed from: e */
    public boolean f149422e = true;

    /* renamed from: f */
    public boolean f149423f = true;
    public long field_bucketSrc;
    public long field_endTime;
    public String field_exptCheckSum;
    public String field_exptContent;
    public int field_exptId;
    public int field_exptSeq;
    public int field_exptType;
    public int field_groupId;
    public String field_paramHashVal;
    public long field_startTime;
    public int field_subType;

    /* renamed from: g */
    public boolean f149424g = true;

    /* renamed from: h */
    public boolean f149425h = true;

    /* renamed from: i */
    public boolean f149426i = true;

    /* renamed from: j */
    public boolean f149427j = true;

    /* renamed from: n */
    public boolean f149428n = true;

    /* renamed from: o */
    public boolean f149429o = true;

    /* renamed from: p */
    public boolean f149430p = true;

    /* renamed from: q */
    public boolean f149431q = true;

    static {
        SingleTable singleTable = new SingleTable("ExptItem");
        f149412r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("exptId", "int", singleTable.getName(), "");
        new Column("groupId", "int", singleTable.getName(), "");
        new Column("exptSeq", "int", singleTable.getName(), "");
        new Column("exptContent", "string", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
        new Column("exptType", "int", singleTable.getName(), "");
        new Column("subType", "int", singleTable.getName(), "");
        new Column("exptCheckSum", "string", singleTable.getName(), "");
        new Column("bucketSrc", "long", singleTable.getName(), "");
        new Column("paramHashVal", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "exptId";
        mAutoDBInfo.colsMap.put("exptId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "exptId";
        mAutoDBInfo.columns[1] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "INTEGER");
        mAutoDBInfo.columns[2] = "exptSeq";
        mAutoDBInfo.colsMap.put("exptSeq", "INTEGER");
        mAutoDBInfo.columns[3] = "exptContent";
        mAutoDBInfo.colsMap.put("exptContent", "TEXT");
        mAutoDBInfo.columns[4] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[5] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[6] = "exptType";
        mAutoDBInfo.colsMap.put("exptType", "INTEGER");
        mAutoDBInfo.columns[7] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER");
        mAutoDBInfo.columns[8] = "exptCheckSum";
        mAutoDBInfo.colsMap.put("exptCheckSum", "TEXT");
        mAutoDBInfo.columns[9] = "bucketSrc";
        mAutoDBInfo.colsMap.put("bucketSrc", "LONG");
        mAutoDBInfo.columns[10] = "paramHashVal";
        mAutoDBInfo.colsMap.put("paramHashVal", "TEXT");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " exptId INTEGER PRIMARY KEY ,  groupId INTEGER,  exptSeq INTEGER,  exptContent TEXT,  startTime LONG,  endTime LONG,  exptType INTEGER,  subType INTEGER,  exptCheckSum TEXT,  bucketSrc LONG,  paramHashVal TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53337g2)) {
            return false;
        }
        C53337g2 g2Var = (C53337g2) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_exptId), Integer.valueOf(g2Var.field_exptId)) && C46238a.m51546a(Integer.valueOf(this.field_groupId), Integer.valueOf(g2Var.field_groupId)) && C46238a.m51546a(Integer.valueOf(this.field_exptSeq), Integer.valueOf(g2Var.field_exptSeq)) && C46238a.m51546a(this.field_exptContent, g2Var.field_exptContent) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(g2Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(g2Var.field_endTime)) && C46238a.m51546a(Integer.valueOf(this.field_exptType), Integer.valueOf(g2Var.field_exptType)) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(g2Var.field_subType)) && C46238a.m51546a(this.field_exptCheckSum, g2Var.field_exptCheckSum) && C46238a.m51546a(Long.valueOf(this.field_bucketSrc), Long.valueOf(g2Var.field_bucketSrc)) && C46238a.m51546a(this.field_paramHashVal, g2Var.field_paramHashVal);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149414t == hashCode) {
                    try {
                        this.field_exptId = cursor.getInt(i);
                        this.f149421d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149415u == hashCode) {
                    try {
                        this.field_groupId = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149416v == hashCode) {
                    try {
                        this.field_exptSeq = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149417w == hashCode) {
                    try {
                        this.field_exptContent = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149418x == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149419y == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149420z == hashCode) {
                    try {
                        this.field_exptType = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149405A == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149406B == hashCode) {
                    try {
                        this.field_exptCheckSum = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149407C == hashCode) {
                    try {
                        this.field_bucketSrc = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149408D == hashCode) {
                    try {
                        this.field_paramHashVal = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseExptItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149409E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149421d) {
            contentValues.put("exptId", Integer.valueOf(this.field_exptId));
        }
        if (this.f149422e) {
            contentValues.put("groupId", Integer.valueOf(this.field_groupId));
        }
        if (this.f149423f) {
            contentValues.put("exptSeq", Integer.valueOf(this.field_exptSeq));
        }
        if (this.f149424g) {
            contentValues.put("exptContent", this.field_exptContent);
        }
        if (this.f149425h) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f149426i) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        if (this.f149427j) {
            contentValues.put("exptType", Integer.valueOf(this.field_exptType));
        }
        if (this.f149428n) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.f149429o) {
            contentValues.put("exptCheckSum", this.field_exptCheckSum);
        }
        if (this.f149430p) {
            contentValues.put("bucketSrc", Long.valueOf(this.field_bucketSrc));
        }
        if (this.f149431q) {
            contentValues.put("paramHashVal", this.field_paramHashVal);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseExptItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ExptItem ( " + f149410F.sql + ");");
        for (String add : f149413s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseExptItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ExptItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149410F, "ExptItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseExptItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ExptItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseExptItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149410F;
    }

    public String[] getIndexCreateSQL() {
        return f149413s;
    }

    public StorageObserverOwner<C53337g2> getObserverOwner() {
        return f149411G;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_exptId);
    }

    public SingleTable getTable() {
        return f149412r;
    }

    public String getTableName() {
        return f149412r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("exptId")) {
            this.field_exptId = contentValues.getAsInteger("exptId").intValue();
            if (z) {
                this.f149421d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsInteger("groupId").intValue();
            if (z) {
                this.f149422e = true;
            }
        }
        if (contentValues.containsKey("exptSeq")) {
            this.field_exptSeq = contentValues.getAsInteger("exptSeq").intValue();
            if (z) {
                this.f149423f = true;
            }
        }
        if (contentValues.containsKey("exptContent")) {
            this.field_exptContent = contentValues.getAsString("exptContent");
            if (z) {
                this.f149424g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f149425h = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f149426i = true;
            }
        }
        if (contentValues.containsKey("exptType")) {
            this.field_exptType = contentValues.getAsInteger("exptType").intValue();
            if (z) {
                this.f149427j = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.f149428n = true;
            }
        }
        if (contentValues.containsKey("exptCheckSum")) {
            this.field_exptCheckSum = contentValues.getAsString("exptCheckSum");
            if (z) {
                this.f149429o = true;
            }
        }
        if (contentValues.containsKey("bucketSrc")) {
            this.field_bucketSrc = contentValues.getAsLong("bucketSrc").longValue();
            if (z) {
                this.f149430p = true;
            }
        }
        if (contentValues.containsKey("paramHashVal")) {
            this.field_paramHashVal = contentValues.getAsString("paramHashVal");
            if (z) {
                this.f149431q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
