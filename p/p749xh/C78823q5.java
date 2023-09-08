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

/* renamed from: xh.q5 */
public class C78823q5 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231300A = 1370166729;

    /* renamed from: B */
    public static final int f231301B = -881080743;

    /* renamed from: C */
    public static final int f231302C = 951530617;

    /* renamed from: D */
    public static final int f231303D = -1353158665;

    /* renamed from: E */
    public static final int f231304E = 1712009421;

    /* renamed from: F */
    public static final int f231305F = 1917739624;

    /* renamed from: G */
    public static final int f231306G = -1180128302;

    /* renamed from: H */
    public static final int f231307H = 1151735300;

    /* renamed from: I */
    public static final int f231308I = -873960692;

    /* renamed from: J */
    public static final int f231309J = 3145580;

    /* renamed from: K */
    public static final int f231310K = 108705909;

    /* renamed from: L */
    public static final IAutoDBItem.MAutoDBInfo f231311L = initAutoDBInfo(C78823q5.class);

    /* renamed from: M */
    public static final StorageObserverOwner<C78823q5> f231312M = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f231313u;

    /* renamed from: v */
    public static final String[] f231314v = {"CREATE INDEX IF NOT EXISTS lbsverifymessage_unread_index ON LBSVerifyMessage(status)", "CREATE INDEX IF NOT EXISTS lbsverifymessage_createtimeIndex ON LBSVerifyMessage(createtime)"};

    /* renamed from: w */
    public static final int f231315w = 109833162;

    /* renamed from: x */
    public static final int f231316x = -892481550;

    /* renamed from: y */
    public static final int f231317y = 3575610;

    /* renamed from: z */
    public static final int f231318z = 109254796;

    /* renamed from: d */
    public boolean f231319d = true;

    /* renamed from: e */
    public boolean f231320e = true;

    /* renamed from: f */
    public boolean f231321f = true;
    public String field_content;
    public long field_createtime;
    public int field_flag;
    public String field_imgpath;
    public int field_isSend;
    public String field_sayhicontent;
    public String field_sayhiencryptuser;
    public String field_sayhiuser;
    public int field_scene;
    public int field_status;
    public long field_svrid;
    public String field_talker;
    public String field_ticket;
    public int field_type;

    /* renamed from: g */
    public boolean f231322g = true;

    /* renamed from: h */
    public boolean f231323h = true;

    /* renamed from: i */
    public boolean f231324i = true;

    /* renamed from: j */
    public boolean f231325j = true;

    /* renamed from: n */
    public boolean f231326n = true;

    /* renamed from: o */
    public boolean f231327o = true;

    /* renamed from: p */
    public boolean f231328p = true;

    /* renamed from: q */
    public boolean f231329q = true;

    /* renamed from: r */
    public boolean f231330r = true;

    /* renamed from: s */
    public boolean f231331s = true;

    /* renamed from: t */
    public boolean f231332t = true;

    static {
        SingleTable singleTable = new SingleTable("LBSVerifyMessage");
        f231313u = singleTable;
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
        new Column("sayhiencryptuser", "string", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
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
        mAutoDBInfo.columns[11] = "sayhiencryptuser";
        mAutoDBInfo.colsMap.put("sayhiencryptuser", "TEXT");
        mAutoDBInfo.columns[12] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT");
        mAutoDBInfo.columns[13] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " svrid LONG default '0'  PRIMARY KEY ,  status INTEGER,  type INTEGER,  scene INTEGER,  createtime LONG,  talker TEXT,  content TEXT,  sayhiuser TEXT,  sayhicontent TEXT,  imgpath TEXT,  isSend INTEGER,  sayhiencryptuser TEXT,  ticket TEXT,  flag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78823q5)) {
            return false;
        }
        C78823q5 q5Var = (C78823q5) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_svrid), Long.valueOf(q5Var.field_svrid)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(q5Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(q5Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(q5Var.field_scene)) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(q5Var.field_createtime)) && C46238a.m51546a(this.field_talker, q5Var.field_talker) && C46238a.m51546a(this.field_content, q5Var.field_content) && C46238a.m51546a(this.field_sayhiuser, q5Var.field_sayhiuser) && C46238a.m51546a(this.field_sayhicontent, q5Var.field_sayhicontent) && C46238a.m51546a(this.field_imgpath, q5Var.field_imgpath) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(q5Var.field_isSend)) && C46238a.m51546a(this.field_sayhiencryptuser, q5Var.field_sayhiencryptuser) && C46238a.m51546a(this.field_ticket, q5Var.field_ticket) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(q5Var.field_flag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231315w == hashCode) {
                    try {
                        this.field_svrid = cursor.getLong(i);
                        this.f231319d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231316x == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231317y == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231318z == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231300A == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231301B == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231302C == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231303D == hashCode) {
                    try {
                        this.field_sayhiuser = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231304E == hashCode) {
                    try {
                        this.field_sayhicontent = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231305F == hashCode) {
                    try {
                        this.field_imgpath = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231306G == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231307H == hashCode) {
                    try {
                        this.field_sayhiencryptuser = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231308I == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231309J == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLBSVerifyMessage", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231310K == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231319d) {
            contentValues.put("svrid", Long.valueOf(this.field_svrid));
        }
        if (this.f231320e) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f231321f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f231322g) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f231323h) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f231324i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f231325j) {
            contentValues.put("content", this.field_content);
        }
        if (this.f231326n) {
            contentValues.put("sayhiuser", this.field_sayhiuser);
        }
        if (this.f231327o) {
            contentValues.put("sayhicontent", this.field_sayhicontent);
        }
        if (this.f231328p) {
            contentValues.put("imgpath", this.field_imgpath);
        }
        if (this.f231329q) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f231330r) {
            contentValues.put("sayhiencryptuser", this.field_sayhiencryptuser);
        }
        if (this.f231331s) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f231332t) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLBSVerifyMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LBSVerifyMessage ( " + f231311L.sql + ");");
        for (String add : f231314v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLBSVerifyMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LBSVerifyMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231311L, "LBSVerifyMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLBSVerifyMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LBSVerifyMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLBSVerifyMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231311L;
    }

    public String[] getIndexCreateSQL() {
        return f231314v;
    }

    public StorageObserverOwner<C78823q5> getObserverOwner() {
        return f231312M;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_svrid);
    }

    public SingleTable getTable() {
        return f231313u;
    }

    public String getTableName() {
        return f231313u.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsLong("svrid").longValue();
            if (z) {
                this.f231319d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f231320e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f231321f = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f231322g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f231323h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f231324i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f231325j = true;
            }
        }
        if (contentValues.containsKey("sayhiuser")) {
            this.field_sayhiuser = contentValues.getAsString("sayhiuser");
            if (z) {
                this.f231326n = true;
            }
        }
        if (contentValues.containsKey("sayhicontent")) {
            this.field_sayhicontent = contentValues.getAsString("sayhicontent");
            if (z) {
                this.f231327o = true;
            }
        }
        if (contentValues.containsKey("imgpath")) {
            this.field_imgpath = contentValues.getAsString("imgpath");
            if (z) {
                this.f231328p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f231329q = true;
            }
        }
        if (contentValues.containsKey("sayhiencryptuser")) {
            this.field_sayhiencryptuser = contentValues.getAsString("sayhiencryptuser");
            if (z) {
                this.f231330r = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f231331s = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f231332t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
