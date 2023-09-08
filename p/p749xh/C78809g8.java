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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.g8 */
public class C78809g8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f230636A = -1353158665;

    /* renamed from: B */
    public static final int f230637B = 1712009421;

    /* renamed from: C */
    public static final int f230638C = 1917739624;

    /* renamed from: D */
    public static final int f230639D = -1180128302;

    /* renamed from: E */
    public static final int f230640E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f230641F = initAutoDBInfo(C78809g8.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C78809g8> f230642G = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f230643r;

    /* renamed from: s */
    public static final String[] f230644s = new String[0];

    /* renamed from: t */
    public static final int f230645t = 109833162;

    /* renamed from: u */
    public static final int f230646u = -892481550;

    /* renamed from: v */
    public static final int f230647v = 3575610;

    /* renamed from: w */
    public static final int f230648w = 109254796;

    /* renamed from: x */
    public static final int f230649x = 1370166729;

    /* renamed from: y */
    public static final int f230650y = -881080743;

    /* renamed from: z */
    public static final int f230651z = 951530617;

    /* renamed from: d */
    public boolean f230652d = true;

    /* renamed from: e */
    public boolean f230653e = true;

    /* renamed from: f */
    public boolean f230654f = true;
    public String field_content;
    public long field_createtime;
    public String field_imgpath;
    public int field_isSend;
    public String field_sayhicontent;
    public String field_sayhiuser;
    public int field_scene;
    public int field_status;
    public long field_svrid;
    public String field_talker;
    public int field_type;

    /* renamed from: g */
    public boolean f230655g = true;

    /* renamed from: h */
    public boolean f230656h = true;

    /* renamed from: i */
    public boolean f230657i = true;

    /* renamed from: j */
    public boolean f230658j = true;

    /* renamed from: n */
    public boolean f230659n = true;

    /* renamed from: o */
    public boolean f230660o = true;

    /* renamed from: p */
    public boolean f230661p = true;

    /* renamed from: q */
    public boolean f230662q = true;

    static {
        SingleTable singleTable = new SingleTable("ShakeVerifyMessage");
        f230643r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("svrid", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("sayhiuser", "string", singleTable.getName(), "");
        new Column("sayhicontent", "string", singleTable.getName(), "");
        new Column("imgpath", "string", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "svrid";
        mAutoDBInfo.colsMap.put("svrid", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "svrid";
        mAutoDBInfo.columns[1] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[4] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG");
        mAutoDBInfo.columns[5] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[6] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[7] = "sayhiuser";
        mAutoDBInfo.colsMap.put("sayhiuser", "TEXT");
        mAutoDBInfo.columns[8] = "sayhicontent";
        mAutoDBInfo.colsMap.put("sayhicontent", "TEXT");
        mAutoDBInfo.columns[9] = "imgpath";
        mAutoDBInfo.colsMap.put("imgpath", "TEXT");
        mAutoDBInfo.columns[10] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " svrid LONG default '0'  PRIMARY KEY ,  status INTEGER,  type INTEGER,  scene INTEGER,  createtime LONG,  talker TEXT,  content TEXT,  sayhiuser TEXT,  sayhicontent TEXT,  imgpath TEXT,  isSend INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78809g8)) {
            return false;
        }
        C78809g8 g8Var = (C78809g8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_svrid), Long.valueOf(g8Var.field_svrid)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(g8Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(g8Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(g8Var.field_scene)) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(g8Var.field_createtime)) && C46238a.m51546a(this.field_talker, g8Var.field_talker) && C46238a.m51546a(this.field_content, g8Var.field_content) && C46238a.m51546a(this.field_sayhiuser, g8Var.field_sayhiuser) && C46238a.m51546a(this.field_sayhicontent, g8Var.field_sayhicontent) && C46238a.m51546a(this.field_imgpath, g8Var.field_imgpath) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(g8Var.field_isSend));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230645t == hashCode) {
                    try {
                        this.field_svrid = cursor.getLong(i);
                        this.f230652d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230646u == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230647v == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230648w == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230649x == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230650y == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230651z == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230636A == hashCode) {
                    try {
                        this.field_sayhiuser = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230637B == hashCode) {
                    try {
                        this.field_sayhicontent = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230638C == hashCode) {
                    try {
                        this.field_imgpath = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230639D == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230640E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230652d) {
            contentValues.put("svrid", Long.valueOf(this.field_svrid));
        }
        if (this.f230653e) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f230654f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f230655g) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f230656h) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f230657i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f230658j) {
            contentValues.put("content", this.field_content);
        }
        if (this.f230659n) {
            contentValues.put("sayhiuser", this.field_sayhiuser);
        }
        if (this.f230660o) {
            contentValues.put("sayhicontent", this.field_sayhicontent);
        }
        if (this.f230661p) {
            contentValues.put("imgpath", this.field_imgpath);
        }
        if (this.f230662q) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShakeVerifyMessage ( " + f230641F.sql + ");");
        for (String add : f230644s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShakeVerifyMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230641F, "ShakeVerifyMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShakeVerifyMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShakeVerifyMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230641F;
    }

    public String[] getIndexCreateSQL() {
        return f230644s;
    }

    public StorageObserverOwner<C78809g8> getObserverOwner() {
        return f230642G;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_svrid);
    }

    public SingleTable getTable() {
        return f230643r;
    }

    public String getTableName() {
        return f230643r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsLong("svrid").longValue();
            if (z) {
                this.f230652d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f230653e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f230654f = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f230655g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f230656h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f230657i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f230658j = true;
            }
        }
        if (contentValues.containsKey("sayhiuser")) {
            this.field_sayhiuser = contentValues.getAsString("sayhiuser");
            if (z) {
                this.f230659n = true;
            }
        }
        if (contentValues.containsKey("sayhicontent")) {
            this.field_sayhicontent = contentValues.getAsString("sayhicontent");
            if (z) {
                this.f230660o = true;
            }
        }
        if (contentValues.containsKey("imgpath")) {
            this.field_imgpath = contentValues.getAsString("imgpath");
            if (z) {
                this.f230661p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f230662q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
