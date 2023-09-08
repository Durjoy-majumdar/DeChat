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

/* renamed from: xh.l5 */
public class C102654l5 extends IAutoDBItem {

    /* renamed from: A */
    public static final Column f302570A;

    /* renamed from: B */
    public static final Column f302571B;

    /* renamed from: C */
    public static final Column f302572C;

    /* renamed from: D */
    public static final String[] f302573D = new String[0];

    /* renamed from: E */
    public static final int f302574E = 109594803;

    /* renamed from: F */
    public static final int f302575F = -266666762;

    /* renamed from: G */
    public static final int f302576G = -1205623433;

    /* renamed from: H */
    public static final int f302577H = 1369213417;

    /* renamed from: I */
    public static final int f302578I = 3198432;

    /* renamed from: J */
    public static final int f302579J = -1746354280;

    /* renamed from: K */
    public static final int f302580K = 3575610;

    /* renamed from: L */
    public static final int f302581L = -1111431691;

    /* renamed from: M */
    public static final int f302582M = 1102348195;

    /* renamed from: N */
    public static final int f302583N = -1388287679;

    /* renamed from: P */
    public static final int f302584P = -189292914;

    /* renamed from: Q */
    public static final int f302585Q = -787570221;

    /* renamed from: R */
    public static final int f302586R = 748883849;

    /* renamed from: S */
    public static final int f302587S = 951530617;

    /* renamed from: T */
    public static final int f302588T = -674882878;

    /* renamed from: U */
    public static final int f302589U = -391239245;

    /* renamed from: V */
    public static final int f302590V = -1868521062;

    /* renamed from: W */
    public static final int f302591W = -331264918;

    /* renamed from: X */
    public static final int f302592X = 108705909;

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f302593Y = initAutoDBInfo(C102654l5.class);

    /* renamed from: Z */
    public static final StorageObserverOwner<C102654l5> f302594Z = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f302595y;

    /* renamed from: z */
    public static final Column f302596z;

    /* renamed from: d */
    public boolean f302597d = false;

    /* renamed from: e */
    public boolean f302598e = false;

    /* renamed from: f */
    public boolean f302599f = false;
    private byte[] field_attrBuf;
    private byte[] field_content;
    private int field_createTime;
    private int field_head;
    private int field_likeFlag;
    private int field_localFlag;
    private int field_localPrivate;
    private byte[] field_postBuf;
    private int field_pravited;
    private int field_serverExtFlag;
    private long field_snsId;
    private int field_sourceType;
    private String field_stringSeq;
    private int field_subType;
    private int field_type;
    private String field_userName;
    private String field_withTa;
    private int field_withTaHasOther;

    /* renamed from: g */
    public boolean f302600g = false;

    /* renamed from: h */
    public boolean f302601h = false;

    /* renamed from: i */
    public boolean f302602i = false;

    /* renamed from: j */
    public boolean f302603j = false;

    /* renamed from: n */
    public boolean f302604n = false;

    /* renamed from: o */
    public boolean f302605o = false;

    /* renamed from: p */
    public boolean f302606p = false;

    /* renamed from: q */
    public boolean f302607q = false;

    /* renamed from: r */
    public boolean f302608r = false;

    /* renamed from: s */
    public boolean f302609s = false;

    /* renamed from: t */
    public boolean f302610t = false;

    /* renamed from: u */
    public boolean f302611u = false;

    /* renamed from: v */
    public boolean f302612v = false;

    /* renamed from: w */
    public boolean f302613w = false;

    /* renamed from: x */
    public boolean f302614x = false;

    static {
        SingleTable singleTable = new SingleTable(C102661q8.TABLE_NAME);
        f302595y = singleTable;
        f302596z = new Column("rowid", "long", singleTable.getName(), "");
        new Column("snsId", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("localFlag", "int", singleTable.getName(), "");
        f302570A = new Column("createTime", "int", singleTable.getName(), "");
        new Column("head", "int", singleTable.getName(), "");
        new Column("localPrivate", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        f302571B = new Column("sourceType", "int", singleTable.getName(), "");
        new Column("likeFlag", "int", singleTable.getName(), "");
        new Column("pravited", "int", singleTable.getName(), "");
        f302572C = new Column("stringSeq", "string", singleTable.getName(), "");
        new Column(C102661q8.COL_WITHTA, "string", singleTable.getName(), "");
        new Column(C102661q8.COL_WITHTAHASOTHER, "int", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
        new Column("attrBuf", "byte[]", singleTable.getName(), "");
        new Column("postBuf", "byte[]", singleTable.getName(), "");
        new Column("subType", "int", singleTable.getName(), "");
        new Column(C102661q8.COL_SERVEREXTFLAG, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "snsId";
        mAutoDBInfo.colsMap.put("snsId", "LONG");
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT");
        mAutoDBInfo.columns[2] = "localFlag";
        mAutoDBInfo.colsMap.put("localFlag", "INTEGER");
        mAutoDBInfo.columns[3] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[4] = "head";
        mAutoDBInfo.colsMap.put("head", "INTEGER");
        mAutoDBInfo.columns[5] = "localPrivate";
        mAutoDBInfo.colsMap.put("localPrivate", "INTEGER");
        mAutoDBInfo.columns[6] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[7] = "sourceType";
        mAutoDBInfo.colsMap.put("sourceType", "INTEGER");
        mAutoDBInfo.columns[8] = "likeFlag";
        mAutoDBInfo.colsMap.put("likeFlag", "INTEGER");
        mAutoDBInfo.columns[9] = "pravited";
        mAutoDBInfo.colsMap.put("pravited", "INTEGER");
        mAutoDBInfo.columns[10] = "stringSeq";
        mAutoDBInfo.colsMap.put("stringSeq", "TEXT");
        mAutoDBInfo.columns[11] = C102661q8.COL_WITHTA;
        mAutoDBInfo.colsMap.put(C102661q8.COL_WITHTA, "TEXT");
        mAutoDBInfo.columns[12] = C102661q8.COL_WITHTAHASOTHER;
        mAutoDBInfo.colsMap.put(C102661q8.COL_WITHTAHASOTHER, "INTEGER");
        mAutoDBInfo.columns[13] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB");
        mAutoDBInfo.columns[14] = "attrBuf";
        mAutoDBInfo.colsMap.put("attrBuf", "BLOB");
        mAutoDBInfo.columns[15] = "postBuf";
        mAutoDBInfo.colsMap.put("postBuf", "BLOB");
        mAutoDBInfo.columns[16] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER");
        mAutoDBInfo.columns[17] = C102661q8.COL_SERVEREXTFLAG;
        mAutoDBInfo.colsMap.put(C102661q8.COL_SERVEREXTFLAG, "INTEGER");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  withTa TEXT,  withTaHasOther INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  subType INTEGER,  serverExtFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102654l5)) {
            return false;
        }
        C102654l5 l5Var = (C102654l5) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_snsId), Long.valueOf(l5Var.field_snsId)) && C46238a.m51546a(this.field_userName, l5Var.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(l5Var.field_localFlag)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(l5Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_head), Integer.valueOf(l5Var.field_head)) && C46238a.m51546a(Integer.valueOf(this.field_localPrivate), Integer.valueOf(l5Var.field_localPrivate)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(l5Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(l5Var.field_sourceType)) && C46238a.m51546a(Integer.valueOf(this.field_likeFlag), Integer.valueOf(l5Var.field_likeFlag)) && C46238a.m51546a(Integer.valueOf(this.field_pravited), Integer.valueOf(l5Var.field_pravited)) && C46238a.m51546a(this.field_stringSeq, l5Var.field_stringSeq) && C46238a.m51546a(this.field_withTa, l5Var.field_withTa) && C46238a.m51546a(Integer.valueOf(this.field_withTaHasOther), Integer.valueOf(l5Var.field_withTaHasOther)) && C46238a.m51546a(this.field_content, l5Var.field_content) && C46238a.m51546a(this.field_attrBuf, l5Var.field_attrBuf) && C46238a.m51546a(this.field_postBuf, l5Var.field_postBuf) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(l5Var.field_subType)) && C46238a.m51546a(Integer.valueOf(this.field_serverExtFlag), Integer.valueOf(l5Var.field_serverExtFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302574E == hashCode) {
                    try {
                        this.field_snsId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302575F == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302576G == hashCode) {
                    try {
                        this.field_localFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302577H == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302578I == hashCode) {
                    try {
                        this.field_head = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302579J == hashCode) {
                    try {
                        this.field_localPrivate = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302580K == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302581L == hashCode) {
                    try {
                        this.field_sourceType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302582M == hashCode) {
                    try {
                        this.field_likeFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302583N == hashCode) {
                    try {
                        this.field_pravited = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302584P == hashCode) {
                    try {
                        this.field_stringSeq = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302585Q == hashCode) {
                    try {
                        this.field_withTa = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302586R == hashCode) {
                    try {
                        this.field_withTaHasOther = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302587S == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302588T == hashCode) {
                    try {
                        this.field_attrBuf = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302589U == hashCode) {
                    try {
                        this.field_postBuf = cursor.getBlob(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302590V == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302591W == hashCode) {
                    try {
                        this.field_serverExtFlag = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseImproveSnsInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302592X == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302597d) {
            contentValues.put("snsId", Long.valueOf(this.field_snsId));
        }
        if (this.f302598e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f302599f) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.f302600g) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f302601h) {
            contentValues.put("head", Integer.valueOf(this.field_head));
        }
        if (this.f302602i) {
            contentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
        }
        if (this.f302603j) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302604n) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        if (this.f302605o) {
            contentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
        }
        if (this.f302606p) {
            contentValues.put("pravited", Integer.valueOf(this.field_pravited));
        }
        if (this.f302607q) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.f302608r) {
            contentValues.put(C102661q8.COL_WITHTA, this.field_withTa);
        }
        if (this.f302609s) {
            contentValues.put(C102661q8.COL_WITHTAHASOTHER, Integer.valueOf(this.field_withTaHasOther));
        }
        if (this.f302610t) {
            contentValues.put("content", this.field_content);
        }
        if (this.f302611u) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.f302612v) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.f302613w) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.f302614x) {
            contentValues.put(C102661q8.COL_SERVEREXTFLAG, Integer.valueOf(this.field_serverExtFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseImproveSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsInfo ( " + f302593Y.sql + ");");
        for (String add : f302573D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseImproveSnsInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL(C102661q8.TABLE_NAME, str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302593Y, C102661q8.TABLE_NAME, iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseImproveSnsInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL(C102661q8.TABLE_NAME, next);
        }
        Log.m105925i("MicroMsg.SDK.BaseImproveSnsInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public int getCreateTime() {
        return this.field_createTime;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302593Y;
    }

    public int getHead() {
        return this.field_head;
    }

    public String[] getIndexCreateSQL() {
        return f302573D;
    }

    public int getLikeFlag() {
        return this.field_likeFlag;
    }

    public int getLocalFlag() {
        return this.field_localFlag;
    }

    public int getLocalPrivate() {
        return this.field_localPrivate;
    }

    public StorageObserverOwner<C102654l5> getObserverOwner() {
        return f302594Z;
    }

    public byte[] getPostBuf() {
        return this.field_postBuf;
    }

    public int getPravited() {
        return this.field_pravited;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public int getSourceType() {
        return this.field_sourceType;
    }

    public String getStringSeq() {
        return this.field_stringSeq;
    }

    public SingleTable getTable() {
        return f302595y;
    }

    public String getTableName() {
        return f302595y.getName();
    }

    public int getType() {
        return this.field_type;
    }

    public String getUserName() {
        return this.field_userName;
    }

    /* renamed from: l2 */
    public ContentValues mo142397l2() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("snsId", Long.valueOf(this.field_snsId));
        contentValues.put("userName", this.field_userName);
        contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        contentValues.put("head", Integer.valueOf(this.field_head));
        contentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
        contentValues.put("type", Integer.valueOf(this.field_type));
        contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        contentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
        contentValues.put("pravited", Integer.valueOf(this.field_pravited));
        contentValues.put("stringSeq", this.field_stringSeq);
        contentValues.put(C102661q8.COL_WITHTA, this.field_withTa);
        contentValues.put(C102661q8.COL_WITHTAHASOTHER, Integer.valueOf(this.field_withTaHasOther));
        contentValues.put("content", this.field_content);
        contentValues.put("attrBuf", this.field_attrBuf);
        contentValues.put("postBuf", this.field_postBuf);
        contentValues.put("subType", Integer.valueOf(this.field_subType));
        contentValues.put(C102661q8.COL_SERVEREXTFLAG, Integer.valueOf(this.field_serverExtFlag));
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    /* renamed from: m2 */
    public byte[] mo142398m2() {
        return this.field_attrBuf;
    }

    /* renamed from: n2 */
    public byte[] mo142399n2() {
        return this.field_content;
    }

    /* renamed from: o2 */
    public int mo142400o2() {
        return this.field_serverExtFlag;
    }

    /* renamed from: p2 */
    public long mo142401p2() {
        return this.field_snsId;
    }

    /* renamed from: q2 */
    public void mo142402q2(byte[] bArr) {
        this.field_content = bArr;
        this.f302610t = true;
    }

    /* renamed from: r2 */
    public void mo142403r2(int i) {
        this.field_localPrivate = i;
        this.f302602i = true;
    }

    /* renamed from: s2 */
    public void mo142404s2(String str) {
        this.field_withTa = str;
        this.f302608r = true;
    }

    public void setCreateTime(int i) {
        this.field_createTime = i;
        this.f302600g = true;
    }

    public void setHead(int i) {
        this.field_head = i;
        this.f302601h = true;
    }

    public void setLikeFlag(int i) {
        this.field_likeFlag = i;
        this.f302605o = true;
    }

    public void setSnsId(long j) {
        this.field_snsId = j;
        this.f302597d = true;
    }

    /* renamed from: t2 */
    public void mo142408t2(int i) {
        this.field_withTaHasOther = i;
        this.f302609s = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z) {
                this.f302597d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f302598e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z) {
                this.f302599f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f302600g = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.field_head = contentValues.getAsInteger("head").intValue();
            if (z) {
                this.f302601h = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
            if (z) {
                this.f302602i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302603j = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z) {
                this.f302604n = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
            if (z) {
                this.f302605o = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.field_pravited = contentValues.getAsInteger("pravited").intValue();
            if (z) {
                this.f302606p = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.field_stringSeq = contentValues.getAsString("stringSeq");
            if (z) {
                this.f302607q = true;
            }
        }
        if (contentValues.containsKey(C102661q8.COL_WITHTA)) {
            this.field_withTa = contentValues.getAsString(C102661q8.COL_WITHTA);
            if (z) {
                this.f302608r = true;
            }
        }
        if (contentValues.containsKey(C102661q8.COL_WITHTAHASOTHER)) {
            this.field_withTaHasOther = contentValues.getAsInteger(C102661q8.COL_WITHTAHASOTHER).intValue();
            if (z) {
                this.f302609s = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f302610t = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z) {
                this.f302611u = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z) {
                this.f302612v = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.f302613w = true;
            }
        }
        if (contentValues.containsKey(C102661q8.COL_SERVEREXTFLAG)) {
            this.field_serverExtFlag = contentValues.getAsInteger(C102661q8.COL_SERVEREXTFLAG).intValue();
            if (z) {
                this.f302614x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
