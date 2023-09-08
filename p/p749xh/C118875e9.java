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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.e9 */
public class C118875e9 extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f355743C;

    /* renamed from: D */
    public static final String[] f355744D = {"CREATE INDEX IF NOT EXISTS UserCardInfo_card_type_index ON UserCardInfo(card_type)"};

    /* renamed from: E */
    public static final int f355745E = 553933994;

    /* renamed from: F */
    public static final int f355746F = 993874895;

    /* renamed from: G */
    public static final int f355747G = -45243957;

    /* renamed from: H */
    public static final int f355748H = -892481550;

    /* renamed from: I */
    public static final int f355749I = -709538450;

    /* renamed from: J */
    public static final int f355750J = 1178839178;

    /* renamed from: K */
    public static final int f355751K = -295931082;

    /* renamed from: L */
    public static final int f355752L = -1949209898;

    /* renamed from: M */
    public static final int f355753M = -493574096;

    /* renamed from: N */
    public static final int f355754N = 1112183971;

    /* renamed from: P */
    public static final int f355755P = 1725551537;

    /* renamed from: Q */
    public static final int f355756Q = 1286327134;

    /* renamed from: Q0 */
    public static final StorageObserverOwner<C118875e9> f355757Q0 = new StorageObserverOwner<>();

    /* renamed from: R */
    public static final int f355758R = 1504693058;

    /* renamed from: S */
    public static final int f355759S = 1666431812;

    /* renamed from: T */
    public static final int f355760T = 97592951;

    /* renamed from: U */
    public static final int f355761U = -907236722;

    /* renamed from: V */
    public static final int f355762V = 2132201577;

    /* renamed from: W */
    public static final int f355763W = 1090750495;

    /* renamed from: X */
    public static final int f355764X = 1442069968;

    /* renamed from: Y */
    public static final int f355765Y = -245025015;

    /* renamed from: Z */
    public static final int f355766Z = 1584393805;

    /* renamed from: p0 */
    public static final int f355767p0 = -669890006;

    /* renamed from: x0 */
    public static final int f355768x0 = 108705909;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f355769y0 = initAutoDBInfo(C118875e9.class);

    /* renamed from: A */
    public boolean f355770A = true;

    /* renamed from: B */
    public boolean f355771B = true;

    /* renamed from: d */
    public boolean f355772d = true;

    /* renamed from: e */
    public boolean f355773e = true;

    /* renamed from: f */
    public boolean f355774f = true;
    public long field_begin_time;
    public String field_block_mask;
    public byte[] field_cardTpInfoData;
    public String field_card_id;
    public String field_card_tp_id;
    public int field_card_type;
    public long field_create_time;
    public byte[] field_dataInfoData;
    public int field_delete_state_flag;
    public long field_end_time;
    public String field_from_username;
    public boolean field_is_dynamic;
    public String field_label_wording;
    public long field_local_updateTime;
    public byte[] field_shareInfoData;
    public byte[] field_shopInfoData;
    public int field_status;
    public String field_stickyAnnouncement;
    public int field_stickyEndTime;
    public int field_stickyIndex;
    public long field_updateSeq;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f355775g = true;

    /* renamed from: h */
    public boolean f355776h = true;

    /* renamed from: i */
    public boolean f355777i = true;

    /* renamed from: j */
    public boolean f355778j = true;

    /* renamed from: n */
    public boolean f355779n = true;

    /* renamed from: o */
    public boolean f355780o = true;

    /* renamed from: p */
    public boolean f355781p = true;

    /* renamed from: q */
    public boolean f355782q = true;

    /* renamed from: r */
    public boolean f355783r = true;

    /* renamed from: s */
    public boolean f355784s = true;

    /* renamed from: t */
    public boolean f355785t = true;

    /* renamed from: u */
    public boolean f355786u = true;

    /* renamed from: v */
    public boolean f355787v = true;

    /* renamed from: w */
    public boolean f355788w = true;

    /* renamed from: x */
    public boolean f355789x = true;

    /* renamed from: y */
    public boolean f355790y = true;

    /* renamed from: z */
    public boolean f355791z = true;

    static {
        SingleTable singleTable = new SingleTable("UserCardInfo");
        f355743C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("card_tp_id", "string", singleTable.getName(), "");
        new Column("from_username", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("delete_state_flag", "int", singleTable.getName(), "");
        new Column("local_updateTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("updateSeq", "long", singleTable.getName(), "");
        new Column("create_time", "long", singleTable.getName(), "");
        new Column("begin_time", "long", singleTable.getName(), "");
        new Column("end_time", "long", singleTable.getName(), "");
        new Column("block_mask", "string", singleTable.getName(), "");
        new Column("dataInfoData", "byte[]", singleTable.getName(), "");
        new Column("cardTpInfoData", "byte[]", singleTable.getName(), "");
        new Column("shareInfoData", "byte[]", singleTable.getName(), "");
        new Column("shopInfoData", "byte[]", singleTable.getName(), "");
        new Column("stickyIndex", "int", singleTable.getName(), "");
        new Column("stickyEndTime", "int", singleTable.getName(), "");
        new Column("stickyAnnouncement", "string", singleTable.getName(), "");
        new Column("card_type", "int", singleTable.getName(), "");
        new Column("label_wording", "string", singleTable.getName(), "");
        new Column("is_dynamic", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "card_id";
        mAutoDBInfo.columns[1] = "card_tp_id";
        mAutoDBInfo.colsMap.put("card_tp_id", "TEXT");
        mAutoDBInfo.columns[2] = "from_username";
        mAutoDBInfo.colsMap.put("from_username", "TEXT");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[4] = "delete_state_flag";
        mAutoDBInfo.colsMap.put("delete_state_flag", "INTEGER");
        mAutoDBInfo.columns[5] = "local_updateTime";
        mAutoDBInfo.colsMap.put("local_updateTime", "LONG");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[7] = "updateSeq";
        mAutoDBInfo.colsMap.put("updateSeq", "LONG");
        mAutoDBInfo.columns[8] = "create_time";
        mAutoDBInfo.colsMap.put("create_time", "LONG");
        mAutoDBInfo.columns[9] = "begin_time";
        mAutoDBInfo.colsMap.put("begin_time", "LONG");
        mAutoDBInfo.columns[10] = "end_time";
        mAutoDBInfo.colsMap.put("end_time", "LONG");
        mAutoDBInfo.columns[11] = "block_mask";
        mAutoDBInfo.colsMap.put("block_mask", "TEXT");
        mAutoDBInfo.columns[12] = "dataInfoData";
        mAutoDBInfo.colsMap.put("dataInfoData", "BLOB");
        mAutoDBInfo.columns[13] = "cardTpInfoData";
        mAutoDBInfo.colsMap.put("cardTpInfoData", "BLOB");
        mAutoDBInfo.columns[14] = "shareInfoData";
        mAutoDBInfo.colsMap.put("shareInfoData", "BLOB");
        mAutoDBInfo.columns[15] = "shopInfoData";
        mAutoDBInfo.colsMap.put("shopInfoData", "BLOB");
        mAutoDBInfo.columns[16] = "stickyIndex";
        mAutoDBInfo.colsMap.put("stickyIndex", "INTEGER");
        mAutoDBInfo.columns[17] = "stickyEndTime";
        mAutoDBInfo.colsMap.put("stickyEndTime", "INTEGER");
        mAutoDBInfo.columns[18] = "stickyAnnouncement";
        mAutoDBInfo.colsMap.put("stickyAnnouncement", "TEXT");
        mAutoDBInfo.columns[19] = "card_type";
        mAutoDBInfo.colsMap.put("card_type", "INTEGER default '-1' ");
        mAutoDBInfo.columns[20] = "label_wording";
        mAutoDBInfo.colsMap.put("label_wording", "TEXT");
        mAutoDBInfo.columns[21] = "is_dynamic";
        mAutoDBInfo.colsMap.put("is_dynamic", "INTEGER");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " card_id TEXT PRIMARY KEY ,  card_tp_id TEXT,  from_username TEXT,  status INTEGER,  delete_state_flag INTEGER,  local_updateTime LONG,  updateTime LONG,  updateSeq LONG,  create_time LONG,  begin_time LONG,  end_time LONG,  block_mask TEXT,  dataInfoData BLOB,  cardTpInfoData BLOB,  shareInfoData BLOB,  shopInfoData BLOB,  stickyIndex INTEGER,  stickyEndTime INTEGER,  stickyAnnouncement TEXT,  card_type INTEGER default '-1' ,  label_wording TEXT,  is_dynamic INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118875e9)) {
            return false;
        }
        C118875e9 e9Var = (C118875e9) iAutoDBItem;
        return C46238a.m51546a(this.field_card_id, e9Var.field_card_id) && C46238a.m51546a(this.field_card_tp_id, e9Var.field_card_tp_id) && C46238a.m51546a(this.field_from_username, e9Var.field_from_username) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(e9Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_delete_state_flag), Integer.valueOf(e9Var.field_delete_state_flag)) && C46238a.m51546a(Long.valueOf(this.field_local_updateTime), Long.valueOf(e9Var.field_local_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(e9Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_updateSeq), Long.valueOf(e9Var.field_updateSeq)) && C46238a.m51546a(Long.valueOf(this.field_create_time), Long.valueOf(e9Var.field_create_time)) && C46238a.m51546a(Long.valueOf(this.field_begin_time), Long.valueOf(e9Var.field_begin_time)) && C46238a.m51546a(Long.valueOf(this.field_end_time), Long.valueOf(e9Var.field_end_time)) && C46238a.m51546a(this.field_block_mask, e9Var.field_block_mask) && C46238a.m51546a(this.field_dataInfoData, e9Var.field_dataInfoData) && C46238a.m51546a(this.field_cardTpInfoData, e9Var.field_cardTpInfoData) && C46238a.m51546a(this.field_shareInfoData, e9Var.field_shareInfoData) && C46238a.m51546a(this.field_shopInfoData, e9Var.field_shopInfoData) && C46238a.m51546a(Integer.valueOf(this.field_stickyIndex), Integer.valueOf(e9Var.field_stickyIndex)) && C46238a.m51546a(Integer.valueOf(this.field_stickyEndTime), Integer.valueOf(e9Var.field_stickyEndTime)) && C46238a.m51546a(this.field_stickyAnnouncement, e9Var.field_stickyAnnouncement) && C46238a.m51546a(Integer.valueOf(this.field_card_type), Integer.valueOf(e9Var.field_card_type)) && C46238a.m51546a(this.field_label_wording, e9Var.field_label_wording) && C46238a.m51546a(Boolean.valueOf(this.field_is_dynamic), Boolean.valueOf(e9Var.field_is_dynamic));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355745E == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                        this.f355772d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355746F == hashCode) {
                    try {
                        this.field_card_tp_id = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355747G == hashCode) {
                    try {
                        this.field_from_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355748H == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355749I == hashCode) {
                    try {
                        this.field_delete_state_flag = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355750J == hashCode) {
                    try {
                        this.field_local_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355751K == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355752L == hashCode) {
                    try {
                        this.field_updateSeq = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355753M == hashCode) {
                    try {
                        this.field_create_time = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355754N == hashCode) {
                    try {
                        this.field_begin_time = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355755P == hashCode) {
                    try {
                        this.field_end_time = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355756Q == hashCode) {
                    try {
                        this.field_block_mask = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355758R == hashCode) {
                    try {
                        this.field_dataInfoData = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355759S == hashCode) {
                    try {
                        this.field_cardTpInfoData = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355760T == hashCode) {
                    try {
                        this.field_shareInfoData = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355761U == hashCode) {
                    try {
                        this.field_shopInfoData = cursor.getBlob(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355762V == hashCode) {
                    try {
                        this.field_stickyIndex = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355763W == hashCode) {
                    try {
                        this.field_stickyEndTime = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355764X == hashCode) {
                    try {
                        this.field_stickyAnnouncement = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355765Y == hashCode) {
                    try {
                        this.field_card_type = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355766Z == hashCode) {
                    try {
                        this.field_label_wording = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355767p0 == hashCode) {
                    try {
                        this.field_is_dynamic = cursor.getInt(i) != 0;
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseUserCardInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355768x0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f355772d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f355773e) {
            contentValues.put("card_tp_id", this.field_card_tp_id);
        }
        if (this.f355774f) {
            contentValues.put("from_username", this.field_from_username);
        }
        if (this.f355775g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f355776h) {
            contentValues.put("delete_state_flag", Integer.valueOf(this.field_delete_state_flag));
        }
        if (this.f355777i) {
            contentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
        }
        if (this.f355778j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f355779n) {
            contentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
        }
        if (this.f355780o) {
            contentValues.put("create_time", Long.valueOf(this.field_create_time));
        }
        if (this.f355781p) {
            contentValues.put("begin_time", Long.valueOf(this.field_begin_time));
        }
        if (this.f355782q) {
            contentValues.put("end_time", Long.valueOf(this.field_end_time));
        }
        if (this.f355783r) {
            contentValues.put("block_mask", this.field_block_mask);
        }
        if (this.f355784s) {
            contentValues.put("dataInfoData", this.field_dataInfoData);
        }
        if (this.f355785t) {
            contentValues.put("cardTpInfoData", this.field_cardTpInfoData);
        }
        if (this.f355786u) {
            contentValues.put("shareInfoData", this.field_shareInfoData);
        }
        if (this.f355787v) {
            contentValues.put("shopInfoData", this.field_shopInfoData);
        }
        if (this.f355788w) {
            contentValues.put("stickyIndex", Integer.valueOf(this.field_stickyIndex));
        }
        if (this.f355789x) {
            contentValues.put("stickyEndTime", Integer.valueOf(this.field_stickyEndTime));
        }
        if (this.f355790y) {
            contentValues.put("stickyAnnouncement", this.field_stickyAnnouncement);
        }
        if (this.f355791z) {
            contentValues.put("card_type", Integer.valueOf(this.field_card_type));
        }
        if (this.f355770A) {
            contentValues.put("label_wording", this.field_label_wording);
        }
        if (this.f355771B) {
            if (this.field_is_dynamic) {
                contentValues.put("is_dynamic", 1);
            } else {
                contentValues.put("is_dynamic", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseUserCardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS UserCardInfo ( " + f355769y0.sql + ");");
        for (String add : f355744D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseUserCardInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("UserCardInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355769y0, "UserCardInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseUserCardInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("UserCardInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseUserCardInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355769y0;
    }

    public String[] getIndexCreateSQL() {
        return f355744D;
    }

    public StorageObserverOwner<C118875e9> getObserverOwner() {
        return f355757Q0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    public SingleTable getTable() {
        return f355743C;
    }

    public String getTableName() {
        return f355743C.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f355772d = true;
            }
        }
        if (contentValues.containsKey("card_tp_id")) {
            this.field_card_tp_id = contentValues.getAsString("card_tp_id");
            if (z) {
                this.f355773e = true;
            }
        }
        if (contentValues.containsKey("from_username")) {
            this.field_from_username = contentValues.getAsString("from_username");
            if (z) {
                this.f355774f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f355775g = true;
            }
        }
        if (contentValues.containsKey("delete_state_flag")) {
            this.field_delete_state_flag = contentValues.getAsInteger("delete_state_flag").intValue();
            if (z) {
                this.f355776h = true;
            }
        }
        if (contentValues.containsKey("local_updateTime")) {
            this.field_local_updateTime = contentValues.getAsLong("local_updateTime").longValue();
            if (z) {
                this.f355777i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f355778j = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsLong("updateSeq").longValue();
            if (z) {
                this.f355779n = true;
            }
        }
        if (contentValues.containsKey("create_time")) {
            this.field_create_time = contentValues.getAsLong("create_time").longValue();
            if (z) {
                this.f355780o = true;
            }
        }
        if (contentValues.containsKey("begin_time")) {
            this.field_begin_time = contentValues.getAsLong("begin_time").longValue();
            if (z) {
                this.f355781p = true;
            }
        }
        if (contentValues.containsKey("end_time")) {
            this.field_end_time = contentValues.getAsLong("end_time").longValue();
            if (z) {
                this.f355782q = true;
            }
        }
        if (contentValues.containsKey("block_mask")) {
            this.field_block_mask = contentValues.getAsString("block_mask");
            if (z) {
                this.f355783r = true;
            }
        }
        if (contentValues.containsKey("dataInfoData")) {
            this.field_dataInfoData = contentValues.getAsByteArray("dataInfoData");
            if (z) {
                this.f355784s = true;
            }
        }
        if (contentValues.containsKey("cardTpInfoData")) {
            this.field_cardTpInfoData = contentValues.getAsByteArray("cardTpInfoData");
            if (z) {
                this.f355785t = true;
            }
        }
        if (contentValues.containsKey("shareInfoData")) {
            this.field_shareInfoData = contentValues.getAsByteArray("shareInfoData");
            if (z) {
                this.f355786u = true;
            }
        }
        if (contentValues.containsKey("shopInfoData")) {
            this.field_shopInfoData = contentValues.getAsByteArray("shopInfoData");
            if (z) {
                this.f355787v = true;
            }
        }
        if (contentValues.containsKey("stickyIndex")) {
            this.field_stickyIndex = contentValues.getAsInteger("stickyIndex").intValue();
            if (z) {
                this.f355788w = true;
            }
        }
        if (contentValues.containsKey("stickyEndTime")) {
            this.field_stickyEndTime = contentValues.getAsInteger("stickyEndTime").intValue();
            if (z) {
                this.f355789x = true;
            }
        }
        if (contentValues.containsKey("stickyAnnouncement")) {
            this.field_stickyAnnouncement = contentValues.getAsString("stickyAnnouncement");
            if (z) {
                this.f355790y = true;
            }
        }
        if (contentValues.containsKey("card_type")) {
            this.field_card_type = contentValues.getAsInteger("card_type").intValue();
            if (z) {
                this.f355791z = true;
            }
        }
        if (contentValues.containsKey("label_wording")) {
            this.field_label_wording = contentValues.getAsString("label_wording");
            if (z) {
                this.f355770A = true;
            }
        }
        if (contentValues.containsKey("is_dynamic")) {
            this.field_is_dynamic = contentValues.getAsInteger("is_dynamic").intValue() != 0;
            if (z) {
                this.f355771B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
