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

/* renamed from: xh.h8 */
public class C118876h8 extends IAutoDBItem {

    /* renamed from: A */
    public static final String[] f355792A = {"CREATE INDEX IF NOT EXISTS ShareCardInfo_card_tp_id_index ON ShareCardInfo(card_tp_id)"};

    /* renamed from: B */
    public static final int f355793B = 553933994;

    /* renamed from: C */
    public static final int f355794C = 993874895;

    /* renamed from: D */
    public static final int f355795D = -45243957;

    /* renamed from: E */
    public static final int f355796E = -567770122;

    /* renamed from: F */
    public static final int f355797F = -1411074055;

    /* renamed from: G */
    public static final int f355798G = -892481550;

    /* renamed from: H */
    public static final int f355799H = -1787965651;

    /* renamed from: I */
    public static final int f355800I = 1178839178;

    /* renamed from: J */
    public static final int f355801J = -295931082;

    /* renamed from: K */
    public static final int f355802K = 1112183971;

    /* renamed from: L */
    public static final int f355803L = 1725551537;

    /* renamed from: M */
    public static final int f355804M = -1949209898;

    /* renamed from: N */
    public static final int f355805N = 1286327134;

    /* renamed from: P */
    public static final int f355806P = 1504693058;

    /* renamed from: Q */
    public static final int f355807Q = 1666431812;

    /* renamed from: R */
    public static final int f355808R = 97592951;

    /* renamed from: S */
    public static final int f355809S = -907236722;

    /* renamed from: T */
    public static final int f355810T = 426250584;

    /* renamed from: U */
    public static final int f355811U = 2133307775;

    /* renamed from: V */
    public static final int f355812V = 108705909;

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f355813W = initAutoDBInfo(C118876h8.class);

    /* renamed from: X */
    public static final StorageObserverOwner<C118876h8> f355814X = new StorageObserverOwner<>();

    /* renamed from: z */
    public static final SingleTable f355815z;

    /* renamed from: d */
    public boolean f355816d = true;

    /* renamed from: e */
    public boolean f355817e = true;

    /* renamed from: f */
    public boolean f355818f = true;
    public String field_app_id;
    public long field_begin_time;
    public long field_block_mask;
    public byte[] field_cardTpInfoData;
    public String field_card_id;
    public String field_card_tp_id;
    public int field_categoryType;
    public String field_consumer;
    public byte[] field_dataInfoData;
    public long field_end_time;
    public String field_from_username;
    public int field_itemIndex;
    public long field_local_updateTime;
    public byte[] field_shareInfoData;
    public long field_share_time;
    public byte[] field_shopInfoData;
    public int field_status;
    public long field_updateSeq;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f355819g = true;

    /* renamed from: h */
    public boolean f355820h = true;

    /* renamed from: i */
    public boolean f355821i = true;

    /* renamed from: j */
    public boolean f355822j = true;

    /* renamed from: n */
    public boolean f355823n = true;

    /* renamed from: o */
    public boolean f355824o = true;

    /* renamed from: p */
    public boolean f355825p = true;

    /* renamed from: q */
    public boolean f355826q = true;

    /* renamed from: r */
    public boolean f355827r = true;

    /* renamed from: s */
    public boolean f355828s = true;

    /* renamed from: t */
    public boolean f355829t = true;

    /* renamed from: u */
    public boolean f355830u = true;

    /* renamed from: v */
    public boolean f355831v = true;

    /* renamed from: w */
    public boolean f355832w = true;

    /* renamed from: x */
    public boolean f355833x = true;

    /* renamed from: y */
    public boolean f355834y = true;

    static {
        SingleTable singleTable = new SingleTable("ShareCardInfo");
        f355815z = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("card_tp_id", "string", singleTable.getName(), "");
        new Column("from_username", "string", singleTable.getName(), "");
        new Column("consumer", "string", singleTable.getName(), "");
        new Column("app_id", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("share_time", "long", singleTable.getName(), "");
        new Column("local_updateTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("begin_time", "long", singleTable.getName(), "");
        new Column("end_time", "long", singleTable.getName(), "");
        new Column("updateSeq", "long", singleTable.getName(), "");
        new Column("block_mask", "long", singleTable.getName(), "");
        new Column("dataInfoData", "byte[]", singleTable.getName(), "");
        new Column("cardTpInfoData", "byte[]", singleTable.getName(), "");
        new Column("shareInfoData", "byte[]", singleTable.getName(), "");
        new Column("shopInfoData", "byte[]", singleTable.getName(), "");
        new Column("categoryType", "int", singleTable.getName(), "");
        new Column("itemIndex", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[19];
        String[] strArr = new String[20];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "card_id";
        mAutoDBInfo.columns[1] = "card_tp_id";
        mAutoDBInfo.colsMap.put("card_tp_id", "TEXT");
        mAutoDBInfo.columns[2] = "from_username";
        mAutoDBInfo.colsMap.put("from_username", "TEXT");
        mAutoDBInfo.columns[3] = "consumer";
        mAutoDBInfo.colsMap.put("consumer", "TEXT");
        mAutoDBInfo.columns[4] = "app_id";
        mAutoDBInfo.colsMap.put("app_id", "TEXT");
        mAutoDBInfo.columns[5] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[6] = "share_time";
        mAutoDBInfo.colsMap.put("share_time", "LONG");
        mAutoDBInfo.columns[7] = "local_updateTime";
        mAutoDBInfo.colsMap.put("local_updateTime", "LONG");
        mAutoDBInfo.columns[8] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[9] = "begin_time";
        mAutoDBInfo.colsMap.put("begin_time", "LONG");
        mAutoDBInfo.columns[10] = "end_time";
        mAutoDBInfo.colsMap.put("end_time", "LONG");
        mAutoDBInfo.columns[11] = "updateSeq";
        mAutoDBInfo.colsMap.put("updateSeq", "LONG");
        mAutoDBInfo.columns[12] = "block_mask";
        mAutoDBInfo.colsMap.put("block_mask", "LONG");
        mAutoDBInfo.columns[13] = "dataInfoData";
        mAutoDBInfo.colsMap.put("dataInfoData", "BLOB");
        mAutoDBInfo.columns[14] = "cardTpInfoData";
        mAutoDBInfo.colsMap.put("cardTpInfoData", "BLOB");
        mAutoDBInfo.columns[15] = "shareInfoData";
        mAutoDBInfo.colsMap.put("shareInfoData", "BLOB");
        mAutoDBInfo.columns[16] = "shopInfoData";
        mAutoDBInfo.colsMap.put("shopInfoData", "BLOB");
        mAutoDBInfo.columns[17] = "categoryType";
        mAutoDBInfo.colsMap.put("categoryType", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "itemIndex";
        mAutoDBInfo.colsMap.put("itemIndex", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "rowid";
        mAutoDBInfo.sql = " card_id TEXT PRIMARY KEY ,  card_tp_id TEXT,  from_username TEXT,  consumer TEXT,  app_id TEXT,  status INTEGER,  share_time LONG,  local_updateTime LONG,  updateTime LONG,  begin_time LONG,  end_time LONG,  updateSeq LONG,  block_mask LONG,  dataInfoData BLOB,  cardTpInfoData BLOB,  shareInfoData BLOB,  shopInfoData BLOB,  categoryType INTEGER default '0' ,  itemIndex INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118876h8)) {
            return false;
        }
        C118876h8 h8Var = (C118876h8) iAutoDBItem;
        return C46238a.m51546a(this.field_card_id, h8Var.field_card_id) && C46238a.m51546a(this.field_card_tp_id, h8Var.field_card_tp_id) && C46238a.m51546a(this.field_from_username, h8Var.field_from_username) && C46238a.m51546a(this.field_consumer, h8Var.field_consumer) && C46238a.m51546a(this.field_app_id, h8Var.field_app_id) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(h8Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_share_time), Long.valueOf(h8Var.field_share_time)) && C46238a.m51546a(Long.valueOf(this.field_local_updateTime), Long.valueOf(h8Var.field_local_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(h8Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_begin_time), Long.valueOf(h8Var.field_begin_time)) && C46238a.m51546a(Long.valueOf(this.field_end_time), Long.valueOf(h8Var.field_end_time)) && C46238a.m51546a(Long.valueOf(this.field_updateSeq), Long.valueOf(h8Var.field_updateSeq)) && C46238a.m51546a(Long.valueOf(this.field_block_mask), Long.valueOf(h8Var.field_block_mask)) && C46238a.m51546a(this.field_dataInfoData, h8Var.field_dataInfoData) && C46238a.m51546a(this.field_cardTpInfoData, h8Var.field_cardTpInfoData) && C46238a.m51546a(this.field_shareInfoData, h8Var.field_shareInfoData) && C46238a.m51546a(this.field_shopInfoData, h8Var.field_shopInfoData) && C46238a.m51546a(Integer.valueOf(this.field_categoryType), Integer.valueOf(h8Var.field_categoryType)) && C46238a.m51546a(Integer.valueOf(this.field_itemIndex), Integer.valueOf(h8Var.field_itemIndex));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355793B == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                        this.f355816d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355794C == hashCode) {
                    try {
                        this.field_card_tp_id = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355795D == hashCode) {
                    try {
                        this.field_from_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355796E == hashCode) {
                    try {
                        this.field_consumer = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355797F == hashCode) {
                    try {
                        this.field_app_id = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355798G == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355799H == hashCode) {
                    try {
                        this.field_share_time = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355800I == hashCode) {
                    try {
                        this.field_local_updateTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355801J == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355802K == hashCode) {
                    try {
                        this.field_begin_time = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355803L == hashCode) {
                    try {
                        this.field_end_time = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355804M == hashCode) {
                    try {
                        this.field_updateSeq = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355805N == hashCode) {
                    try {
                        this.field_block_mask = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355806P == hashCode) {
                    try {
                        this.field_dataInfoData = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355807Q == hashCode) {
                    try {
                        this.field_cardTpInfoData = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355808R == hashCode) {
                    try {
                        this.field_shareInfoData = cursor.getBlob(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355809S == hashCode) {
                    try {
                        this.field_shopInfoData = cursor.getBlob(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355810T == hashCode) {
                    try {
                        this.field_categoryType = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355811U == hashCode) {
                    try {
                        this.field_itemIndex = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShareCardInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355812V == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f355816d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f355817e) {
            contentValues.put("card_tp_id", this.field_card_tp_id);
        }
        if (this.f355818f) {
            contentValues.put("from_username", this.field_from_username);
        }
        if (this.f355819g) {
            contentValues.put("consumer", this.field_consumer);
        }
        if (this.f355820h) {
            contentValues.put("app_id", this.field_app_id);
        }
        if (this.f355821i) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f355822j) {
            contentValues.put("share_time", Long.valueOf(this.field_share_time));
        }
        if (this.f355823n) {
            contentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
        }
        if (this.f355824o) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f355825p) {
            contentValues.put("begin_time", Long.valueOf(this.field_begin_time));
        }
        if (this.f355826q) {
            contentValues.put("end_time", Long.valueOf(this.field_end_time));
        }
        if (this.f355827r) {
            contentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
        }
        if (this.f355828s) {
            contentValues.put("block_mask", Long.valueOf(this.field_block_mask));
        }
        if (this.f355829t) {
            contentValues.put("dataInfoData", this.field_dataInfoData);
        }
        if (this.f355830u) {
            contentValues.put("cardTpInfoData", this.field_cardTpInfoData);
        }
        if (this.f355831v) {
            contentValues.put("shareInfoData", this.field_shareInfoData);
        }
        if (this.f355832w) {
            contentValues.put("shopInfoData", this.field_shopInfoData);
        }
        if (this.f355833x) {
            contentValues.put("categoryType", Integer.valueOf(this.field_categoryType));
        }
        if (this.f355834y) {
            contentValues.put("itemIndex", Integer.valueOf(this.field_itemIndex));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShareCardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShareCardInfo ( " + f355813W.sql + ");");
        for (String add : f355792A) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShareCardInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShareCardInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355813W, "ShareCardInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShareCardInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShareCardInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShareCardInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355813W;
    }

    public String[] getIndexCreateSQL() {
        return f355792A;
    }

    public StorageObserverOwner<C118876h8> getObserverOwner() {
        return f355814X;
    }

    public Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    public SingleTable getTable() {
        return f355815z;
    }

    public String getTableName() {
        return f355815z.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f355816d = true;
            }
        }
        if (contentValues.containsKey("card_tp_id")) {
            this.field_card_tp_id = contentValues.getAsString("card_tp_id");
            if (z) {
                this.f355817e = true;
            }
        }
        if (contentValues.containsKey("from_username")) {
            this.field_from_username = contentValues.getAsString("from_username");
            if (z) {
                this.f355818f = true;
            }
        }
        if (contentValues.containsKey("consumer")) {
            this.field_consumer = contentValues.getAsString("consumer");
            if (z) {
                this.f355819g = true;
            }
        }
        if (contentValues.containsKey("app_id")) {
            this.field_app_id = contentValues.getAsString("app_id");
            if (z) {
                this.f355820h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f355821i = true;
            }
        }
        if (contentValues.containsKey("share_time")) {
            this.field_share_time = contentValues.getAsLong("share_time").longValue();
            if (z) {
                this.f355822j = true;
            }
        }
        if (contentValues.containsKey("local_updateTime")) {
            this.field_local_updateTime = contentValues.getAsLong("local_updateTime").longValue();
            if (z) {
                this.f355823n = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f355824o = true;
            }
        }
        if (contentValues.containsKey("begin_time")) {
            this.field_begin_time = contentValues.getAsLong("begin_time").longValue();
            if (z) {
                this.f355825p = true;
            }
        }
        if (contentValues.containsKey("end_time")) {
            this.field_end_time = contentValues.getAsLong("end_time").longValue();
            if (z) {
                this.f355826q = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsLong("updateSeq").longValue();
            if (z) {
                this.f355827r = true;
            }
        }
        if (contentValues.containsKey("block_mask")) {
            this.field_block_mask = contentValues.getAsLong("block_mask").longValue();
            if (z) {
                this.f355828s = true;
            }
        }
        if (contentValues.containsKey("dataInfoData")) {
            this.field_dataInfoData = contentValues.getAsByteArray("dataInfoData");
            if (z) {
                this.f355829t = true;
            }
        }
        if (contentValues.containsKey("cardTpInfoData")) {
            this.field_cardTpInfoData = contentValues.getAsByteArray("cardTpInfoData");
            if (z) {
                this.f355830u = true;
            }
        }
        if (contentValues.containsKey("shareInfoData")) {
            this.field_shareInfoData = contentValues.getAsByteArray("shareInfoData");
            if (z) {
                this.f355831v = true;
            }
        }
        if (contentValues.containsKey("shopInfoData")) {
            this.field_shopInfoData = contentValues.getAsByteArray("shopInfoData");
            if (z) {
                this.f355832w = true;
            }
        }
        if (contentValues.containsKey("categoryType")) {
            this.field_categoryType = contentValues.getAsInteger("categoryType").intValue();
            if (z) {
                this.f355833x = true;
            }
        }
        if (contentValues.containsKey("itemIndex")) {
            this.field_itemIndex = contentValues.getAsInteger("itemIndex").intValue();
            if (z) {
                this.f355834y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
