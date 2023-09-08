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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import org.json.JSONObject;
import te3.C101801kd0;
import te3.C64853yd0;

/* renamed from: xh.r2 */
public class C102666r2 extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f302877B;

    /* renamed from: C */
    public static final Column f302878C;

    /* renamed from: D */
    public static final String[] f302879D = {"CREATE INDEX IF NOT EXISTS FavItemInfo_id_Index ON FavItemInfo(id)", "CREATE INDEX IF NOT EXISTS FavItemInfo_type_Index ON FavItemInfo(type)", "CREATE INDEX IF NOT EXISTS FavItemInfo_updateSeq_Index ON FavItemInfo(updateSeq)", "CREATE INDEX IF NOT EXISTS FavItemInfo_flag_Index ON FavItemInfo(flag)", "CREATE INDEX IF NOT EXISTS FavItemInfo_sourceId_Index ON FavItemInfo(sourceId)", "CREATE INDEX IF NOT EXISTS FavItemInfo_datatotalsize_Index ON FavItemInfo(datatotalsize)"};

    /* renamed from: E */
    public static final int f302880E = 338409958;

    /* renamed from: F */
    public static final int f302881F = 3355;

    /* renamed from: G */
    public static final int f302882G = 3575610;

    /* renamed from: H */
    public static final int f302883H = 1900783860;

    /* renamed from: I */
    public static final int f302884I = -1949209898;

    /* renamed from: J */
    public static final int f302885J = 3145580;

    /* renamed from: K */
    public static final int f302886K = 1746327190;

    /* renamed from: L */
    public static final int f302887L = 1999789285;

    /* renamed from: M */
    public static final int f302888M = -1111431691;

    /* renamed from: N */
    public static final int f302889N = 1002154084;

    /* renamed from: P */
    public static final int f302890P = -295931082;

    /* renamed from: Q */
    public static final int f302891Q = -1244622187;

    /* renamed from: R */
    public static final int f302892R = -868828954;

    /* renamed from: S */
    public static final int f302893S = -1584572991;

    /* renamed from: T */
    public static final int f302894T = 1022166925;

    /* renamed from: U */
    public static final int f302895U = 118807;

    /* renamed from: V */
    public static final int f302896V = 100897;

    /* renamed from: W */
    public static final int f302897W = 1602989015;

    /* renamed from: X */
    public static final int f302898X = -777729426;

    /* renamed from: Y */
    public static final int f302899Y = 607796817;

    /* renamed from: Z */
    public static final int f302900Z = -90666789;

    /* renamed from: p0 */
    public static final int f302901p0 = 108705909;

    /* renamed from: x0 */
    public static final IAutoDBItem.MAutoDBInfo f302902x0 = initAutoDBInfo(C102666r2.class);

    /* renamed from: y0 */
    public static final StorageObserverOwner<C102666r2> f302903y0 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f302904A = true;

    /* renamed from: d */
    public boolean f302905d = true;

    /* renamed from: e */
    public boolean f302906e = true;

    /* renamed from: f */
    public boolean f302907f = true;
    public long field_datatotalsize;
    public long field_edittime;
    public String field_ext;
    public C101801kd0 field_favProto;
    public int field_flag;
    public String field_fromUser;
    public int field_id;
    public int field_itemStatus;
    public long field_localId;
    public int field_localSeq;
    public String field_realChatName;
    public String field_sessionId;
    public long field_sourceCreateTime;
    public String field_sourceId;
    public int field_sourceType;
    public C64853yd0 field_tagProto;
    public String field_toUser;
    public int field_type;
    public int field_updateSeq;
    public long field_updateTime;
    public String field_xml;

    /* renamed from: g */
    public boolean f302908g = true;

    /* renamed from: h */
    public boolean f302909h = true;

    /* renamed from: i */
    public boolean f302910i = true;

    /* renamed from: j */
    public boolean f302911j = true;

    /* renamed from: n */
    public boolean f302912n = true;

    /* renamed from: o */
    public boolean f302913o = true;

    /* renamed from: p */
    public boolean f302914p = true;

    /* renamed from: q */
    public boolean f302915q = true;

    /* renamed from: r */
    public boolean f302916r = true;

    /* renamed from: s */
    public boolean f302917s = true;

    /* renamed from: t */
    public boolean f302918t = true;

    /* renamed from: u */
    public boolean f302919u = true;

    /* renamed from: v */
    public boolean f302920v = true;

    /* renamed from: w */
    public boolean f302921w = true;

    /* renamed from: x */
    public boolean f302922x = true;

    /* renamed from: y */
    public boolean f302923y = true;

    /* renamed from: z */
    public boolean f302924z = true;

    static {
        SingleTable singleTable = new SingleTable("FavItemInfo");
        f302877B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("id", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("localSeq", "int", singleTable.getName(), "");
        new Column("updateSeq", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("sourceId", "string", singleTable.getName(), "");
        f302878C = new Column("itemStatus", "int", singleTable.getName(), "");
        new Column("sourceType", "int", singleTable.getName(), "");
        new Column("sourceCreateTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("fromUser", "string", singleTable.getName(), "");
        new Column("toUser", "string", singleTable.getName(), "");
        new Column("realChatName", "string", singleTable.getName(), "");
        new Column("favProto", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FavProtoItem");
        new Column("xml", "string", singleTable.getName(), "");
        new Column("ext", "string", singleTable.getName(), "");
        new Column("edittime", "long", singleTable.getName(), "");
        new Column("tagProto", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FavTagList");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("datatotalsize", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[21];
        String[] strArr = new String[22];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "id";
        mAutoDBInfo.colsMap.put("id", "INTEGER");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "localSeq";
        mAutoDBInfo.colsMap.put("localSeq", "INTEGER");
        mAutoDBInfo.columns[4] = "updateSeq";
        mAutoDBInfo.colsMap.put("updateSeq", "INTEGER");
        mAutoDBInfo.columns[5] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[6] = "sourceId";
        mAutoDBInfo.colsMap.put("sourceId", "TEXT");
        mAutoDBInfo.columns[7] = "itemStatus";
        mAutoDBInfo.colsMap.put("itemStatus", "INTEGER");
        mAutoDBInfo.columns[8] = "sourceType";
        mAutoDBInfo.colsMap.put("sourceType", "INTEGER");
        mAutoDBInfo.columns[9] = "sourceCreateTime";
        mAutoDBInfo.colsMap.put("sourceCreateTime", "LONG");
        mAutoDBInfo.columns[10] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[11] = "fromUser";
        mAutoDBInfo.colsMap.put("fromUser", "TEXT");
        mAutoDBInfo.columns[12] = "toUser";
        mAutoDBInfo.colsMap.put("toUser", "TEXT");
        mAutoDBInfo.columns[13] = "realChatName";
        mAutoDBInfo.colsMap.put("realChatName", "TEXT");
        mAutoDBInfo.columns[14] = "favProto";
        mAutoDBInfo.colsMap.put("favProto", "BLOB");
        mAutoDBInfo.columns[15] = "xml";
        mAutoDBInfo.colsMap.put("xml", "TEXT");
        mAutoDBInfo.columns[16] = "ext";
        mAutoDBInfo.colsMap.put("ext", "TEXT");
        mAutoDBInfo.columns[17] = "edittime";
        mAutoDBInfo.colsMap.put("edittime", "LONG");
        mAutoDBInfo.columns[18] = "tagProto";
        mAutoDBInfo.colsMap.put("tagProto", "BLOB");
        mAutoDBInfo.columns[19] = "sessionId";
        mAutoDBInfo.colsMap.put("sessionId", "TEXT");
        mAutoDBInfo.columns[20] = "datatotalsize";
        mAutoDBInfo.colsMap.put("datatotalsize", "LONG");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  id INTEGER,  type INTEGER,  localSeq INTEGER,  updateSeq INTEGER,  flag INTEGER,  sourceId TEXT,  itemStatus INTEGER,  sourceType INTEGER,  sourceCreateTime LONG,  updateTime LONG,  fromUser TEXT,  toUser TEXT,  realChatName TEXT,  favProto BLOB,  xml TEXT,  ext TEXT,  edittime LONG,  tagProto BLOB,  sessionId TEXT,  datatotalsize LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102666r2)) {
            return false;
        }
        C102666r2 r2Var = (C102666r2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(r2Var.field_localId)) && C46238a.m51546a(Integer.valueOf(this.field_id), Integer.valueOf(r2Var.field_id)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(r2Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_localSeq), Integer.valueOf(r2Var.field_localSeq)) && C46238a.m51546a(Integer.valueOf(this.field_updateSeq), Integer.valueOf(r2Var.field_updateSeq)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(r2Var.field_flag)) && C46238a.m51546a(this.field_sourceId, r2Var.field_sourceId) && C46238a.m51546a(Integer.valueOf(this.field_itemStatus), Integer.valueOf(r2Var.field_itemStatus)) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(r2Var.field_sourceType)) && C46238a.m51546a(Long.valueOf(this.field_sourceCreateTime), Long.valueOf(r2Var.field_sourceCreateTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(r2Var.field_updateTime)) && C46238a.m51546a(this.field_fromUser, r2Var.field_fromUser) && C46238a.m51546a(this.field_toUser, r2Var.field_toUser) && C46238a.m51546a(this.field_realChatName, r2Var.field_realChatName) && C46238a.m51546a(this.field_favProto, r2Var.field_favProto) && C46238a.m51546a(this.field_xml, r2Var.field_xml) && C46238a.m51546a(this.field_ext, r2Var.field_ext) && C46238a.m51546a(Long.valueOf(this.field_edittime), Long.valueOf(r2Var.field_edittime)) && C46238a.m51546a(this.field_tagProto, r2Var.field_tagProto) && C46238a.m51546a(this.field_sessionId, r2Var.field_sessionId) && C46238a.m51546a(Long.valueOf(this.field_datatotalsize), Long.valueOf(r2Var.field_datatotalsize));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302880E == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f302905d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302881F == hashCode) {
                    try {
                        this.field_id = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302882G == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302883H == hashCode) {
                    try {
                        this.field_localSeq = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302884I == hashCode) {
                    try {
                        this.field_updateSeq = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302885J == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302886K == hashCode) {
                    try {
                        this.field_sourceId = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302887L == hashCode) {
                    try {
                        this.field_itemStatus = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302888M == hashCode) {
                    try {
                        this.field_sourceType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302889N == hashCode) {
                    try {
                        this.field_sourceCreateTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302890P == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302891Q == hashCode) {
                    try {
                        this.field_fromUser = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302892R == hashCode) {
                    try {
                        this.field_toUser = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302893S == hashCode) {
                    try {
                        this.field_realChatName = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302894T == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_favProto = (C101801kd0) new C101801kd0().parseFrom(blob);
                        }
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302895U == hashCode) {
                    try {
                        this.field_xml = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302896V == hashCode) {
                    try {
                        this.field_ext = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302897W == hashCode) {
                    try {
                        this.field_edittime = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302898X == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_tagProto = (C64853yd0) new C64853yd0().parseFrom(blob2);
                        }
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302899Y == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302900Z == hashCode) {
                    try {
                        this.field_datatotalsize = cursor.getLong(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavItemInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302901p0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64853yd0 yd02;
        C101801kd0 kd02;
        ContentValues contentValues = new ContentValues();
        if (this.f302905d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f302906e) {
            contentValues.put("id", Integer.valueOf(this.field_id));
        }
        if (this.f302907f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302908g) {
            contentValues.put("localSeq", Integer.valueOf(this.field_localSeq));
        }
        if (this.f302909h) {
            contentValues.put("updateSeq", Integer.valueOf(this.field_updateSeq));
        }
        if (this.f302910i) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f302911j) {
            contentValues.put("sourceId", this.field_sourceId);
        }
        if (this.f302912n) {
            contentValues.put("itemStatus", Integer.valueOf(this.field_itemStatus));
        }
        if (this.f302913o) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        if (this.f302914p) {
            contentValues.put("sourceCreateTime", Long.valueOf(this.field_sourceCreateTime));
        }
        if (this.f302915q) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f302916r) {
            contentValues.put("fromUser", this.field_fromUser);
        }
        if (this.f302917s) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f302918t) {
            contentValues.put("realChatName", this.field_realChatName);
        }
        if (this.f302919u && (kd02 = this.field_favProto) != null) {
            try {
                contentValues.put("favProto", kd02.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFavItemInfo", e.getMessage());
            }
        }
        if (this.f302920v) {
            contentValues.put("xml", this.field_xml);
        }
        if (this.f302921w) {
            contentValues.put("ext", this.field_ext);
        }
        if (this.f302922x) {
            contentValues.put("edittime", Long.valueOf(this.field_edittime));
        }
        if (this.f302923y && (yd02 = this.field_tagProto) != null) {
            try {
                contentValues.put("tagProto", yd02.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFavItemInfo", e2.getMessage());
            }
        }
        if (this.f302924z) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.f302904A) {
            contentValues.put("datatotalsize", Long.valueOf(this.field_datatotalsize));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavItemInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavItemInfo ( " + f302902x0.sql + ");");
        for (String add : f302879D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavItemInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavItemInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302902x0, "FavItemInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavItemInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavItemInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavItemInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302902x0;
    }

    public String[] getIndexCreateSQL() {
        return f302879D;
    }

    public StorageObserverOwner<C102666r2> getObserverOwner() {
        return f302903y0;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f302877B;
    }

    public String getTableName() {
        return f302877B.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
            C46238a.m51547b(jSONObject, "id", Integer.valueOf(this.field_id));
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, "localSeq", Integer.valueOf(this.field_localSeq));
            C46238a.m51547b(jSONObject, "updateSeq", Integer.valueOf(this.field_updateSeq));
            C46238a.m51547b(jSONObject, "flag", Integer.valueOf(this.field_flag));
            C46238a.m51547b(jSONObject, "sourceId", this.field_sourceId);
            C46238a.m51547b(jSONObject, "itemStatus", Integer.valueOf(this.field_itemStatus));
            C46238a.m51547b(jSONObject, "sourceType", Integer.valueOf(this.field_sourceType));
            C46238a.m51547b(jSONObject, "sourceCreateTime", Long.valueOf(this.field_sourceCreateTime));
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
            C46238a.m51547b(jSONObject, "fromUser", this.field_fromUser);
            C46238a.m51547b(jSONObject, "toUser", this.field_toUser);
            C46238a.m51547b(jSONObject, "realChatName", this.field_realChatName);
            C46238a.m51547b(jSONObject, "favProto", this.field_favProto);
            C46238a.m51547b(jSONObject, "xml", this.field_xml);
            C46238a.m51547b(jSONObject, "ext", this.field_ext);
            C46238a.m51547b(jSONObject, "edittime", Long.valueOf(this.field_edittime));
            C46238a.m51547b(jSONObject, "tagProto", this.field_tagProto);
            C46238a.m51547b(jSONObject, "sessionId", this.field_sessionId);
            C46238a.m51547b(jSONObject, "datatotalsize", Long.valueOf(this.field_datatotalsize));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f302905d = true;
            }
        }
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsInteger("id").intValue();
            if (z) {
                this.f302906e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302907f = true;
            }
        }
        if (contentValues.containsKey("localSeq")) {
            this.field_localSeq = contentValues.getAsInteger("localSeq").intValue();
            if (z) {
                this.f302908g = true;
            }
        }
        if (contentValues.containsKey("updateSeq")) {
            this.field_updateSeq = contentValues.getAsInteger("updateSeq").intValue();
            if (z) {
                this.f302909h = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f302910i = true;
            }
        }
        if (contentValues.containsKey("sourceId")) {
            this.field_sourceId = contentValues.getAsString("sourceId");
            if (z) {
                this.f302911j = true;
            }
        }
        if (contentValues.containsKey("itemStatus")) {
            this.field_itemStatus = contentValues.getAsInteger("itemStatus").intValue();
            if (z) {
                this.f302912n = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z) {
                this.f302913o = true;
            }
        }
        if (contentValues.containsKey("sourceCreateTime")) {
            this.field_sourceCreateTime = contentValues.getAsLong("sourceCreateTime").longValue();
            if (z) {
                this.f302914p = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f302915q = true;
            }
        }
        if (contentValues.containsKey("fromUser")) {
            this.field_fromUser = contentValues.getAsString("fromUser");
            if (z) {
                this.f302916r = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z) {
                this.f302917s = true;
            }
        }
        if (contentValues.containsKey("realChatName")) {
            this.field_realChatName = contentValues.getAsString("realChatName");
            if (z) {
                this.f302918t = true;
            }
        }
        if (contentValues.containsKey("favProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("favProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_favProto = (C101801kd0) new C101801kd0().parseFrom(asByteArray);
                    if (z) {
                        this.f302919u = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFavItemInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("xml")) {
            this.field_xml = contentValues.getAsString("xml");
            if (z) {
                this.f302920v = true;
            }
        }
        if (contentValues.containsKey("ext")) {
            this.field_ext = contentValues.getAsString("ext");
            if (z) {
                this.f302921w = true;
            }
        }
        if (contentValues.containsKey("edittime")) {
            this.field_edittime = contentValues.getAsLong("edittime").longValue();
            if (z) {
                this.f302922x = true;
            }
        }
        if (contentValues.containsKey("tagProto")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tagProto");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tagProto = (C64853yd0) new C64853yd0().parseFrom(asByteArray2);
                    if (z) {
                        this.f302923y = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFavItemInfo", e2.getMessage());
            }
        }
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f302924z = true;
            }
        }
        if (contentValues.containsKey("datatotalsize")) {
            this.field_datatotalsize = contentValues.getAsLong("datatotalsize").longValue();
            if (z) {
                this.f302904A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
