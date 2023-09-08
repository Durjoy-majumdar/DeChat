package p749xh;

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

/* renamed from: xh.j9 */
public class C78814j9 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f230833A = 3599307;

    /* renamed from: B */
    public static final int f230834B = 104192092;

    /* renamed from: C */
    public static final int f230835C = -1019779949;

    /* renamed from: D */
    public static final int f230836D = -1928440101;

    /* renamed from: E */
    public static final int f230837E = -849883055;

    /* renamed from: F */
    public static final int f230838F = -892481550;

    /* renamed from: G */
    public static final int f230839G = 1370166729;

    /* renamed from: H */
    public static final int f230840H = -572019299;

    /* renamed from: I */
    public static final int f230841I = 908409382;

    /* renamed from: J */
    public static final int f230842J = 642510128;

    /* renamed from: K */
    public static final int f230843K = 2110247717;

    /* renamed from: L */
    public static final int f230844L = 99639597;

    /* renamed from: M */
    public static final int f230845M = 480095145;

    /* renamed from: N */
    public static final int f230846N = 1310513097;

    /* renamed from: P */
    public static final int f230847P = 2022955529;

    /* renamed from: Q */
    public static final int f230848Q = 2022955530;

    /* renamed from: R */
    public static final int f230849R = 108705909;

    /* renamed from: S */
    public static final IAutoDBItem.MAutoDBInfo f230850S = initAutoDBInfo(C78814j9.class);

    /* renamed from: T */
    public static final StorageObserverOwner<C78814j9> f230851T = new StorageObserverOwner<>();

    /* renamed from: x */
    public static final SingleTable f230852x;

    /* renamed from: y */
    public static final String[] f230853y = {"CREATE INDEX IF NOT EXISTS voiceRemindFileNameIndex ON VoiceRemindInfo(filename)"};

    /* renamed from: z */
    public static final int f230854z = -734768633;

    /* renamed from: d */
    public boolean f230855d = true;

    /* renamed from: e */
    public boolean f230856e = true;

    /* renamed from: f */
    public boolean f230857f = true;
    public String field_clientid;
    public long field_createtime;
    public String field_filename;
    public int field_filenowsize;
    public String field_human;
    public long field_lastmodifytime;
    public long field_msgid;
    public int field_msglocalid;
    public int field_nettimes;
    public int field_offset;
    public int field_reserved1;
    public String field_reserved2;
    public int field_status;
    public int field_totallen;
    public String field_user;
    public int field_voiceformat;
    public int field_voicelenght;

    /* renamed from: g */
    public boolean f230858g = true;

    /* renamed from: h */
    public boolean f230859h = true;

    /* renamed from: i */
    public boolean f230860i = true;

    /* renamed from: j */
    public boolean f230861j = true;

    /* renamed from: n */
    public boolean f230862n = true;

    /* renamed from: o */
    public boolean f230863o = true;

    /* renamed from: p */
    public boolean f230864p = true;

    /* renamed from: q */
    public boolean f230865q = true;

    /* renamed from: r */
    public boolean f230866r = true;

    /* renamed from: s */
    public boolean f230867s = true;

    /* renamed from: t */
    public boolean f230868t = true;

    /* renamed from: u */
    public boolean f230869u = true;

    /* renamed from: v */
    public boolean f230870v = true;

    /* renamed from: w */
    public boolean f230871w = true;

    static {
        SingleTable singleTable = new SingleTable("VoiceRemindInfo");
        f230852x = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, "string", singleTable.getName(), "");
        new Column("user", "string", singleTable.getName(), "");
        new Column("msgid", "long", singleTable.getName(), "");
        new Column("offset", "int", singleTable.getName(), "");
        new Column("filenowsize", "int", singleTable.getName(), "");
        new Column("totallen", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
        new Column("lastmodifytime", "long", singleTable.getName(), "");
        new Column("clientid", "string", singleTable.getName(), "");
        new Column("voicelenght", "int", singleTable.getName(), "");
        new Column("msglocalid", "int", singleTable.getName(), "");
        new Column("human", "string", singleTable.getName(), "");
        new Column("voiceformat", "int", singleTable.getName(), "");
        new Column("nettimes", "int", singleTable.getName(), "");
        new Column("reserved1", "int", singleTable.getName(), "");
        new Column("reserved2", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[17];
        String[] strArr = new String[18];
        mAutoDBInfo.columns = strArr;
        strArr[0] = FFmpegMetadataRetriever.METADATA_KEY_FILENAME;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, "TEXT");
        mAutoDBInfo.columns[1] = "user";
        mAutoDBInfo.colsMap.put("user", "TEXT");
        mAutoDBInfo.columns[2] = "msgid";
        mAutoDBInfo.colsMap.put("msgid", "LONG");
        mAutoDBInfo.columns[3] = "offset";
        mAutoDBInfo.colsMap.put("offset", "INTEGER");
        mAutoDBInfo.columns[4] = "filenowsize";
        mAutoDBInfo.colsMap.put("filenowsize", "INTEGER");
        mAutoDBInfo.columns[5] = "totallen";
        mAutoDBInfo.colsMap.put("totallen", "INTEGER");
        mAutoDBInfo.columns[6] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[7] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG");
        mAutoDBInfo.columns[8] = "lastmodifytime";
        mAutoDBInfo.colsMap.put("lastmodifytime", "LONG");
        mAutoDBInfo.columns[9] = "clientid";
        mAutoDBInfo.colsMap.put("clientid", "TEXT");
        mAutoDBInfo.columns[10] = "voicelenght";
        mAutoDBInfo.colsMap.put("voicelenght", "INTEGER");
        mAutoDBInfo.columns[11] = "msglocalid";
        mAutoDBInfo.colsMap.put("msglocalid", "INTEGER");
        mAutoDBInfo.columns[12] = "human";
        mAutoDBInfo.colsMap.put("human", "TEXT");
        mAutoDBInfo.columns[13] = "voiceformat";
        mAutoDBInfo.colsMap.put("voiceformat", "INTEGER");
        mAutoDBInfo.columns[14] = "nettimes";
        mAutoDBInfo.colsMap.put("nettimes", "INTEGER");
        mAutoDBInfo.columns[15] = "reserved1";
        mAutoDBInfo.colsMap.put("reserved1", "INTEGER");
        mAutoDBInfo.columns[16] = "reserved2";
        mAutoDBInfo.colsMap.put("reserved2", "TEXT");
        mAutoDBInfo.columns[17] = "rowid";
        mAutoDBInfo.sql = " filename TEXT,  user TEXT,  msgid LONG,  offset INTEGER,  filenowsize INTEGER,  totallen INTEGER,  status INTEGER,  createtime LONG,  lastmodifytime LONG,  clientid TEXT,  voicelenght INTEGER,  msglocalid INTEGER,  human TEXT,  voiceformat INTEGER,  nettimes INTEGER,  reserved1 INTEGER,  reserved2 TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78814j9)) {
            return false;
        }
        C78814j9 j9Var = (C78814j9) iAutoDBItem;
        return C46238a.m51546a(this.field_filename, j9Var.field_filename) && C46238a.m51546a(this.field_user, j9Var.field_user) && C46238a.m51546a(Long.valueOf(this.field_msgid), Long.valueOf(j9Var.field_msgid)) && C46238a.m51546a(Integer.valueOf(this.field_offset), Integer.valueOf(j9Var.field_offset)) && C46238a.m51546a(Integer.valueOf(this.field_filenowsize), Integer.valueOf(j9Var.field_filenowsize)) && C46238a.m51546a(Integer.valueOf(this.field_totallen), Integer.valueOf(j9Var.field_totallen)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(j9Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(j9Var.field_createtime)) && C46238a.m51546a(Long.valueOf(this.field_lastmodifytime), Long.valueOf(j9Var.field_lastmodifytime)) && C46238a.m51546a(this.field_clientid, j9Var.field_clientid) && C46238a.m51546a(Integer.valueOf(this.field_voicelenght), Integer.valueOf(j9Var.field_voicelenght)) && C46238a.m51546a(Integer.valueOf(this.field_msglocalid), Integer.valueOf(j9Var.field_msglocalid)) && C46238a.m51546a(this.field_human, j9Var.field_human) && C46238a.m51546a(Integer.valueOf(this.field_voiceformat), Integer.valueOf(j9Var.field_voiceformat)) && C46238a.m51546a(Integer.valueOf(this.field_nettimes), Integer.valueOf(j9Var.field_nettimes)) && C46238a.m51546a(Integer.valueOf(this.field_reserved1), Integer.valueOf(j9Var.field_reserved1)) && C46238a.m51546a(this.field_reserved2, j9Var.field_reserved2);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230854z == hashCode) {
                    try {
                        this.field_filename = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230833A == hashCode) {
                    try {
                        this.field_user = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230834B == hashCode) {
                    try {
                        this.field_msgid = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230835C == hashCode) {
                    try {
                        this.field_offset = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230836D == hashCode) {
                    try {
                        this.field_filenowsize = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230837E == hashCode) {
                    try {
                        this.field_totallen = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230838F == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230839G == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230840H == hashCode) {
                    try {
                        this.field_lastmodifytime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230841I == hashCode) {
                    try {
                        this.field_clientid = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230842J == hashCode) {
                    try {
                        this.field_voicelenght = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230843K == hashCode) {
                    try {
                        this.field_msglocalid = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230844L == hashCode) {
                    try {
                        this.field_human = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230845M == hashCode) {
                    try {
                        this.field_voiceformat = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230846N == hashCode) {
                    try {
                        this.field_nettimes = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230847P == hashCode) {
                    try {
                        this.field_reserved1 = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230848Q == hashCode) {
                    try {
                        this.field_reserved2 = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceRemindInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230849R == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230855d) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, this.field_filename);
        }
        if (this.f230856e) {
            contentValues.put("user", this.field_user);
        }
        if (this.f230857f) {
            contentValues.put("msgid", Long.valueOf(this.field_msgid));
        }
        if (this.f230858g) {
            contentValues.put("offset", Integer.valueOf(this.field_offset));
        }
        if (this.f230859h) {
            contentValues.put("filenowsize", Integer.valueOf(this.field_filenowsize));
        }
        if (this.f230860i) {
            contentValues.put("totallen", Integer.valueOf(this.field_totallen));
        }
        if (this.f230861j) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f230862n) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f230863o) {
            contentValues.put("lastmodifytime", Long.valueOf(this.field_lastmodifytime));
        }
        if (this.f230864p) {
            contentValues.put("clientid", this.field_clientid);
        }
        if (this.f230865q) {
            contentValues.put("voicelenght", Integer.valueOf(this.field_voicelenght));
        }
        if (this.f230866r) {
            contentValues.put("msglocalid", Integer.valueOf(this.field_msglocalid));
        }
        if (this.f230867s) {
            contentValues.put("human", this.field_human);
        }
        if (this.f230868t) {
            contentValues.put("voiceformat", Integer.valueOf(this.field_voiceformat));
        }
        if (this.f230869u) {
            contentValues.put("nettimes", Integer.valueOf(this.field_nettimes));
        }
        if (this.f230870v) {
            contentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
        }
        if (this.f230871w) {
            contentValues.put("reserved2", this.field_reserved2);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseVoiceRemindInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS VoiceRemindInfo ( " + f230850S.sql + ");");
        for (String add : f230853y) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseVoiceRemindInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("VoiceRemindInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230850S, "VoiceRemindInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseVoiceRemindInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("VoiceRemindInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseVoiceRemindInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230850S;
    }

    public String[] getIndexCreateSQL() {
        return f230853y;
    }

    public StorageObserverOwner<C78814j9> getObserverOwner() {
        return f230851T;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f230852x;
    }

    public String getTableName() {
        return f230852x.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_FILENAME)) {
            this.field_filename = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
            if (z) {
                this.f230855d = true;
            }
        }
        if (contentValues.containsKey("user")) {
            this.field_user = contentValues.getAsString("user");
            if (z) {
                this.f230856e = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z) {
                this.f230857f = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z) {
                this.f230858g = true;
            }
        }
        if (contentValues.containsKey("filenowsize")) {
            this.field_filenowsize = contentValues.getAsInteger("filenowsize").intValue();
            if (z) {
                this.f230859h = true;
            }
        }
        if (contentValues.containsKey("totallen")) {
            this.field_totallen = contentValues.getAsInteger("totallen").intValue();
            if (z) {
                this.f230860i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f230861j = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f230862n = true;
            }
        }
        if (contentValues.containsKey("lastmodifytime")) {
            this.field_lastmodifytime = contentValues.getAsLong("lastmodifytime").longValue();
            if (z) {
                this.f230863o = true;
            }
        }
        if (contentValues.containsKey("clientid")) {
            this.field_clientid = contentValues.getAsString("clientid");
            if (z) {
                this.f230864p = true;
            }
        }
        if (contentValues.containsKey("voicelenght")) {
            this.field_voicelenght = contentValues.getAsInteger("voicelenght").intValue();
            if (z) {
                this.f230865q = true;
            }
        }
        if (contentValues.containsKey("msglocalid")) {
            this.field_msglocalid = contentValues.getAsInteger("msglocalid").intValue();
            if (z) {
                this.f230866r = true;
            }
        }
        if (contentValues.containsKey("human")) {
            this.field_human = contentValues.getAsString("human");
            if (z) {
                this.f230867s = true;
            }
        }
        if (contentValues.containsKey("voiceformat")) {
            this.field_voiceformat = contentValues.getAsInteger("voiceformat").intValue();
            if (z) {
                this.f230868t = true;
            }
        }
        if (contentValues.containsKey("nettimes")) {
            this.field_nettimes = contentValues.getAsInteger("nettimes").intValue();
            if (z) {
                this.f230869u = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z) {
                this.f230870v = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsString("reserved2");
            if (z) {
                this.f230871w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
