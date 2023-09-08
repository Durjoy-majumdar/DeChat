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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C101801kd0;

/* renamed from: xh.v7 */
public class C102674v7 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f303016A = -377281442;

    /* renamed from: B */
    public static final int f303017B = 3575610;

    /* renamed from: C */
    public static final int f303018C = -892481550;

    /* renamed from: D */
    public static final int f303019D = -1075703451;

    /* renamed from: E */
    public static final int f303020E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f303021F = initAutoDBInfo(C102674v7.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C102674v7> f303022G = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f303023q;

    /* renamed from: r */
    public static final Column f303024r;

    /* renamed from: s */
    public static final Column f303025s;

    /* renamed from: t */
    public static final String[] f303026t = new String[0];

    /* renamed from: u */
    public static final int f303027u = 338409958;

    /* renamed from: v */
    public static final int f303028v = 104191100;

    /* renamed from: w */
    public static final int f303029w = 1355322678;

    /* renamed from: x */
    public static final int f303030x = -868828954;

    /* renamed from: y */
    public static final int f303031y = 110371416;

    /* renamed from: z */
    public static final int f303032z = 3079825;

    /* renamed from: d */
    public boolean f303033d = true;

    /* renamed from: e */
    public boolean f303034e = true;

    /* renamed from: f */
    public boolean f303035f = true;
    public C101801kd0 field_dataProto;
    public String field_desc;
    public String field_favFrom;
    public int field_localId;
    public long field_msgId;
    public long field_oriMsgId;
    public int field_status;
    public String field_title;
    public String field_toUser;
    public int field_type;

    /* renamed from: g */
    public boolean f303036g = true;

    /* renamed from: h */
    public boolean f303037h = true;

    /* renamed from: i */
    public boolean f303038i = true;

    /* renamed from: j */
    public boolean f303039j = true;

    /* renamed from: n */
    public boolean f303040n = true;

    /* renamed from: o */
    public boolean f303041o = true;

    /* renamed from: p */
    public boolean f303042p = true;

    static {
        SingleTable singleTable = new SingleTable("RecordMessageInfo");
        f303023q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "int", singleTable.getName(), "");
        f303024r = new Column("msgId", "long", singleTable.getName(), "");
        new Column("oriMsgId", "long", singleTable.getName(), "");
        new Column("toUser", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("dataProto", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FavProtoItem");
        f303025s = new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("favFrom", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG default '-1' ");
        mAutoDBInfo.columns[2] = "oriMsgId";
        mAutoDBInfo.colsMap.put("oriMsgId", "LONG default '-1' ");
        mAutoDBInfo.columns[3] = "toUser";
        mAutoDBInfo.colsMap.put("toUser", "TEXT default '' ");
        mAutoDBInfo.columns[4] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[5] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[6] = "dataProto";
        mAutoDBInfo.colsMap.put("dataProto", "BLOB");
        mAutoDBInfo.columns[7] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "favFrom";
        mAutoDBInfo.colsMap.put("favFrom", "TEXT");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " localId INTEGER PRIMARY KEY ,  msgId LONG default '-1' ,  oriMsgId LONG default '-1' ,  toUser TEXT default '' ,  title TEXT,  desc TEXT,  dataProto BLOB,  type INTEGER default '0' ,  status INTEGER default '0' ,  favFrom TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102674v7)) {
            return false;
        }
        C102674v7 v7Var = (C102674v7) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_localId), Integer.valueOf(v7Var.field_localId)) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(v7Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_oriMsgId), Long.valueOf(v7Var.field_oriMsgId)) && C46238a.m51546a(this.field_toUser, v7Var.field_toUser) && C46238a.m51546a(this.field_title, v7Var.field_title) && C46238a.m51546a(this.field_desc, v7Var.field_desc) && C46238a.m51546a(this.field_dataProto, v7Var.field_dataProto) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(v7Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(v7Var.field_status)) && C46238a.m51546a(this.field_favFrom, v7Var.field_favFrom);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f303027u == hashCode) {
                    try {
                        this.field_localId = cursor.getInt(i);
                        this.f303033d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303028v == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303029w == hashCode) {
                    try {
                        this.field_oriMsgId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303030x == hashCode) {
                    try {
                        this.field_toUser = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303031y == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303032z == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303016A == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_dataProto = (C101801kd0) new C101801kd0().parseFrom(blob);
                        }
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303017B == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303018C == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303019D == hashCode) {
                    try {
                        this.field_favFrom = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordMessageInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303020E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C101801kd0 kd02;
        ContentValues contentValues = new ContentValues();
        if (this.f303033d) {
            contentValues.put(C66261f3.COL_LOCALID, Integer.valueOf(this.field_localId));
        }
        if (this.f303034e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f303035f) {
            contentValues.put("oriMsgId", Long.valueOf(this.field_oriMsgId));
        }
        if (this.field_toUser == null) {
            this.field_toUser = "";
        }
        if (this.f303036g) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f303037h) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f303038i) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f303039j && (kd02 = this.field_dataProto) != null) {
            try {
                contentValues.put("dataProto", kd02.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseRecordMessageInfo", e.getMessage());
            }
        }
        if (this.f303040n) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f303041o) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f303042p) {
            contentValues.put("favFrom", this.field_favFrom);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseRecordMessageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS RecordMessageInfo ( " + f303021F.sql + ");");
        for (String add : f303026t) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseRecordMessageInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("RecordMessageInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f303021F, "RecordMessageInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseRecordMessageInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("RecordMessageInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseRecordMessageInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303021F;
    }

    public String[] getIndexCreateSQL() {
        return f303026t;
    }

    public StorageObserverOwner<C102674v7> getObserverOwner() {
        return f303022G;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f303023q;
    }

    public String getTableName() {
        return f303023q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsInteger(C66261f3.COL_LOCALID).intValue();
            if (z) {
                this.f303033d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f303034e = true;
            }
        }
        if (contentValues.containsKey("oriMsgId")) {
            this.field_oriMsgId = contentValues.getAsLong("oriMsgId").longValue();
            if (z) {
                this.f303035f = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z) {
                this.f303036g = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f303037h = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f303038i = true;
            }
        }
        if (contentValues.containsKey("dataProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("dataProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_dataProto = (C101801kd0) new C101801kd0().parseFrom(asByteArray);
                    if (z) {
                        this.f303039j = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseRecordMessageInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f303040n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f303041o = true;
            }
        }
        if (contentValues.containsKey("favFrom")) {
            this.field_favFrom = contentValues.getAsString("favFrom");
            if (z) {
                this.f303042p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
