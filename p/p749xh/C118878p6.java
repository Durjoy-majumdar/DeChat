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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.vg4;

/* renamed from: xh.p6 */
public class C118878p6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f355882A = 683025089;

    /* renamed from: B */
    public static final int f355883B = -260676247;

    /* renamed from: C */
    public static final int f355884C = 376569651;

    /* renamed from: D */
    public static final int f355885D = -1596363504;

    /* renamed from: E */
    public static final int f355886E = 1637261197;

    /* renamed from: F */
    public static final int f355887F = -120656733;

    /* renamed from: G */
    public static final int f355888G = -1306498449;

    /* renamed from: H */
    public static final int f355889H = -540284875;

    /* renamed from: I */
    public static final int f355890I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f355891J = initAutoDBInfo(C118878p6.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C118878p6> f355892K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f355893t;

    /* renamed from: u */
    public static final String[] f355894u = new String[0];

    /* renamed from: v */
    public static final int f355895v = 110366486;

    /* renamed from: w */
    public static final int f355896w = 1812602813;

    /* renamed from: x */
    public static final int f355897x = -873573404;

    /* renamed from: y */
    public static final int f355898y = -1311637899;

    /* renamed from: z */
    public static final int f355899z = -1180527256;

    /* renamed from: d */
    public boolean f355900d = true;

    /* renamed from: e */
    public boolean f355901e = true;

    /* renamed from: f */
    public boolean f355902f = true;
    public long field_beginShowTime;
    public long field_disappearTime;
    public String field_extInfo;
    public boolean field_hadRead;
    public boolean field_isExit;
    public boolean field_isReject;
    public long field_overdueTime;
    public long field_pagestaytime;
    public int field_tipId;
    public int field_tipType;
    public int field_tipVersion;
    public String field_tipkey;
    public vg4 field_tipsShowInfo;

    /* renamed from: g */
    public boolean f355903g = true;

    /* renamed from: h */
    public boolean f355904h = true;

    /* renamed from: i */
    public boolean f355905i = true;

    /* renamed from: j */
    public boolean f355906j = true;

    /* renamed from: n */
    public boolean f355907n = true;

    /* renamed from: o */
    public boolean f355908o = true;

    /* renamed from: p */
    public boolean f355909p = true;

    /* renamed from: q */
    public boolean f355910q = true;

    /* renamed from: r */
    public boolean f355911r = true;

    /* renamed from: s */
    public boolean f355912s = true;

    static {
        SingleTable singleTable = new SingleTable("NewTipsInfo");
        f355893t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("tipId", "int", singleTable.getName(), "");
        new Column("tipVersion", "int", singleTable.getName(), "");
        new Column("tipkey", "string", singleTable.getName(), "");
        new Column("tipType", "int", singleTable.getName(), "");
        new Column("isExit", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("hadRead", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isReject", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("beginShowTime", "long", singleTable.getName(), "");
        new Column("disappearTime", "long", singleTable.getName(), "");
        new Column("overdueTime", "long", singleTable.getName(), "");
        new Column("tipsShowInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.TipsShowInfo");
        new Column("extInfo", "string", singleTable.getName(), "");
        new Column("pagestaytime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "tipId";
        mAutoDBInfo.colsMap.put("tipId", "INTEGER default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "tipId";
        mAutoDBInfo.columns[1] = "tipVersion";
        mAutoDBInfo.colsMap.put("tipVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "tipkey";
        mAutoDBInfo.colsMap.put("tipkey", "TEXT");
        mAutoDBInfo.columns[3] = "tipType";
        mAutoDBInfo.colsMap.put("tipType", "INTEGER");
        mAutoDBInfo.columns[4] = "isExit";
        mAutoDBInfo.colsMap.put("isExit", "INTEGER");
        mAutoDBInfo.columns[5] = "hadRead";
        mAutoDBInfo.colsMap.put("hadRead", "INTEGER");
        mAutoDBInfo.columns[6] = "isReject";
        mAutoDBInfo.colsMap.put("isReject", "INTEGER");
        mAutoDBInfo.columns[7] = "beginShowTime";
        mAutoDBInfo.colsMap.put("beginShowTime", "LONG");
        mAutoDBInfo.columns[8] = "disappearTime";
        mAutoDBInfo.colsMap.put("disappearTime", "LONG");
        mAutoDBInfo.columns[9] = "overdueTime";
        mAutoDBInfo.colsMap.put("overdueTime", "LONG");
        mAutoDBInfo.columns[10] = "tipsShowInfo";
        mAutoDBInfo.colsMap.put("tipsShowInfo", "BLOB");
        mAutoDBInfo.columns[11] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "TEXT");
        mAutoDBInfo.columns[12] = "pagestaytime";
        mAutoDBInfo.colsMap.put("pagestaytime", "LONG");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " tipId INTEGER default '0'  PRIMARY KEY ,  tipVersion INTEGER,  tipkey TEXT,  tipType INTEGER,  isExit INTEGER,  hadRead INTEGER,  isReject INTEGER,  beginShowTime LONG,  disappearTime LONG,  overdueTime LONG,  tipsShowInfo BLOB,  extInfo TEXT,  pagestaytime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118878p6)) {
            return false;
        }
        C118878p6 p6Var = (C118878p6) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_tipId), Integer.valueOf(p6Var.field_tipId)) && C46238a.m51546a(Integer.valueOf(this.field_tipVersion), Integer.valueOf(p6Var.field_tipVersion)) && C46238a.m51546a(this.field_tipkey, p6Var.field_tipkey) && C46238a.m51546a(Integer.valueOf(this.field_tipType), Integer.valueOf(p6Var.field_tipType)) && C46238a.m51546a(Boolean.valueOf(this.field_isExit), Boolean.valueOf(p6Var.field_isExit)) && C46238a.m51546a(Boolean.valueOf(this.field_hadRead), Boolean.valueOf(p6Var.field_hadRead)) && C46238a.m51546a(Boolean.valueOf(this.field_isReject), Boolean.valueOf(p6Var.field_isReject)) && C46238a.m51546a(Long.valueOf(this.field_beginShowTime), Long.valueOf(p6Var.field_beginShowTime)) && C46238a.m51546a(Long.valueOf(this.field_disappearTime), Long.valueOf(p6Var.field_disappearTime)) && C46238a.m51546a(Long.valueOf(this.field_overdueTime), Long.valueOf(p6Var.field_overdueTime)) && C46238a.m51546a(this.field_tipsShowInfo, p6Var.field_tipsShowInfo) && C46238a.m51546a(this.field_extInfo, p6Var.field_extInfo) && C46238a.m51546a(Long.valueOf(this.field_pagestaytime), Long.valueOf(p6Var.field_pagestaytime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355895v == hashCode) {
                    try {
                        this.field_tipId = cursor.getInt(i);
                        this.f355900d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355896w == hashCode) {
                    try {
                        this.field_tipVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355897x == hashCode) {
                    try {
                        this.field_tipkey = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355898y == hashCode) {
                    try {
                        this.field_tipType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355899z == hashCode) {
                    try {
                        this.field_isExit = cursor.getInt(i) != 0;
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355882A == hashCode) {
                    try {
                        this.field_hadRead = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355883B == hashCode) {
                    try {
                        this.field_isReject = cursor.getInt(i) != 0;
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355884C == hashCode) {
                    try {
                        this.field_beginShowTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355885D == hashCode) {
                    try {
                        this.field_disappearTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355886E == hashCode) {
                    try {
                        this.field_overdueTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355887F == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_tipsShowInfo = (vg4) new vg4().parseFrom(blob);
                        }
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355888G == hashCode) {
                    try {
                        this.field_extInfo = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355889H == hashCode) {
                    try {
                        this.field_pagestaytime = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355890I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        vg4 vg4;
        ContentValues contentValues = new ContentValues();
        if (this.f355900d) {
            contentValues.put("tipId", Integer.valueOf(this.field_tipId));
        }
        if (this.f355901e) {
            contentValues.put("tipVersion", Integer.valueOf(this.field_tipVersion));
        }
        if (this.f355902f) {
            contentValues.put("tipkey", this.field_tipkey);
        }
        if (this.f355903g) {
            contentValues.put("tipType", Integer.valueOf(this.field_tipType));
        }
        if (this.f355904h) {
            if (this.field_isExit) {
                contentValues.put("isExit", 1);
            } else {
                contentValues.put("isExit", 0);
            }
        }
        if (this.f355905i) {
            if (this.field_hadRead) {
                contentValues.put("hadRead", 1);
            } else {
                contentValues.put("hadRead", 0);
            }
        }
        if (this.f355906j) {
            if (this.field_isReject) {
                contentValues.put("isReject", 1);
            } else {
                contentValues.put("isReject", 0);
            }
        }
        if (this.f355907n) {
            contentValues.put("beginShowTime", Long.valueOf(this.field_beginShowTime));
        }
        if (this.f355908o) {
            contentValues.put("disappearTime", Long.valueOf(this.field_disappearTime));
        }
        if (this.f355909p) {
            contentValues.put("overdueTime", Long.valueOf(this.field_overdueTime));
        }
        if (this.f355910q && (vg4 = this.field_tipsShowInfo) != null) {
            try {
                contentValues.put("tipsShowInfo", vg4.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo", e.getMessage());
            }
        }
        if (this.f355911r) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f355912s) {
            contentValues.put("pagestaytime", Long.valueOf(this.field_pagestaytime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS NewTipsInfo ( " + f355891J.sql + ");");
        for (String add : f355894u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("NewTipsInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355891J, "NewTipsInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("NewTipsInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355891J;
    }

    public String[] getIndexCreateSQL() {
        return f355894u;
    }

    public StorageObserverOwner<C118878p6> getObserverOwner() {
        return f355892K;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_tipId);
    }

    public SingleTable getTable() {
        return f355893t;
    }

    public String getTableName() {
        return f355893t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("tipId")) {
            this.field_tipId = contentValues.getAsInteger("tipId").intValue();
            if (z) {
                this.f355900d = true;
            }
        }
        if (contentValues.containsKey("tipVersion")) {
            this.field_tipVersion = contentValues.getAsInteger("tipVersion").intValue();
            if (z) {
                this.f355901e = true;
            }
        }
        if (contentValues.containsKey("tipkey")) {
            this.field_tipkey = contentValues.getAsString("tipkey");
            if (z) {
                this.f355902f = true;
            }
        }
        if (contentValues.containsKey("tipType")) {
            this.field_tipType = contentValues.getAsInteger("tipType").intValue();
            if (z) {
                this.f355903g = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isExit")) {
            this.field_isExit = contentValues.getAsInteger("isExit").intValue() != 0;
            if (z) {
                this.f355904h = true;
            }
        }
        if (contentValues.containsKey("hadRead")) {
            this.field_hadRead = contentValues.getAsInteger("hadRead").intValue() != 0;
            if (z) {
                this.f355905i = true;
            }
        }
        if (contentValues.containsKey("isReject")) {
            if (contentValues.getAsInteger("isReject").intValue() != 0) {
                z2 = true;
            }
            this.field_isReject = z2;
            if (z) {
                this.f355906j = true;
            }
        }
        if (contentValues.containsKey("beginShowTime")) {
            this.field_beginShowTime = contentValues.getAsLong("beginShowTime").longValue();
            if (z) {
                this.f355907n = true;
            }
        }
        if (contentValues.containsKey("disappearTime")) {
            this.field_disappearTime = contentValues.getAsLong("disappearTime").longValue();
            if (z) {
                this.f355908o = true;
            }
        }
        if (contentValues.containsKey("overdueTime")) {
            this.field_overdueTime = contentValues.getAsLong("overdueTime").longValue();
            if (z) {
                this.f355909p = true;
            }
        }
        if (contentValues.containsKey("tipsShowInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("tipsShowInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_tipsShowInfo = (vg4) new vg4().parseFrom(asByteArray);
                    if (z) {
                        this.f355910q = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z) {
                this.f355911r = true;
            }
        }
        if (contentValues.containsKey("pagestaytime")) {
            this.field_pagestaytime = contentValues.getAsLong("pagestaytime").longValue();
            if (z) {
                this.f355912s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
