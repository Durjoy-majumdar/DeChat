package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import te3.pa4;

/* renamed from: xh.d5 */
public class C53333d5 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C53333d5> f149181A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f149182o;

    /* renamed from: p */
    public static final String[] f149183p = new String[0];

    /* renamed from: q */
    public static final int f149184q = -938280377;

    /* renamed from: r */
    public static final int f149185r = 417550839;

    /* renamed from: s */
    public static final int f149186s = -265713450;

    /* renamed from: t */
    public static final int f149187t = 978116570;

    /* renamed from: u */
    public static final int f149188u = 109264530;

    /* renamed from: v */
    public static final int f149189v = -160053288;

    /* renamed from: w */
    public static final int f149190w = -1061613234;

    /* renamed from: x */
    public static final int f149191x = -657581851;

    /* renamed from: y */
    public static final int f149192y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f149193z = initAutoDBInfo(C53333d5.class);

    /* renamed from: d */
    public boolean f149194d = true;

    /* renamed from: e */
    public boolean f149195e = true;

    /* renamed from: f */
    public boolean f149196f = true;
    public String field_appusername;
    public int field_likecount;
    public String field_rankID;
    public int field_ranknum;
    public int field_score;
    public int field_selfLikeState;
    public pa4 field_sportRecord;
    public String field_username;

    /* renamed from: g */
    public boolean f149197g = true;

    /* renamed from: h */
    public boolean f149198h = true;

    /* renamed from: i */
    public boolean f149199i = true;

    /* renamed from: j */
    public boolean f149200j = true;

    /* renamed from: n */
    public boolean f149201n = true;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceRankInfo");
        f149182o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("rankID", "string", singleTable.getName(), "");
        new Column("appusername", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("ranknum", "int", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SCORE, "int", singleTable.getName(), "");
        new Column("likecount", "int", singleTable.getName(), "");
        new Column("selfLikeState", "int", singleTable.getName(), "");
        new Column("sportRecord", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.SportRecord");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "rankID";
        mAutoDBInfo.colsMap.put("rankID", "TEXT");
        mAutoDBInfo.columns[1] = "appusername";
        mAutoDBInfo.colsMap.put("appusername", "TEXT");
        mAutoDBInfo.columns[2] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[3] = "ranknum";
        mAutoDBInfo.colsMap.put("ranknum", "INTEGER");
        mAutoDBInfo.columns[4] = FirebaseAnalytics.C113379b.SCORE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SCORE, "INTEGER");
        mAutoDBInfo.columns[5] = "likecount";
        mAutoDBInfo.colsMap.put("likecount", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "selfLikeState";
        mAutoDBInfo.colsMap.put("selfLikeState", "INTEGER default '3' ");
        mAutoDBInfo.columns[7] = "sportRecord";
        mAutoDBInfo.colsMap.put("sportRecord", "BLOB");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " rankID TEXT,  appusername TEXT,  username TEXT,  ranknum INTEGER,  score INTEGER,  likecount INTEGER default '0' ,  selfLikeState INTEGER default '3' ,  sportRecord BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53333d5)) {
            return false;
        }
        C53333d5 d5Var = (C53333d5) iAutoDBItem;
        return C46238a.m51546a(this.field_rankID, d5Var.field_rankID) && C46238a.m51546a(this.field_appusername, d5Var.field_appusername) && C46238a.m51546a(this.field_username, d5Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_ranknum), Integer.valueOf(d5Var.field_ranknum)) && C46238a.m51546a(Integer.valueOf(this.field_score), Integer.valueOf(d5Var.field_score)) && C46238a.m51546a(Integer.valueOf(this.field_likecount), Integer.valueOf(d5Var.field_likecount)) && C46238a.m51546a(Integer.valueOf(this.field_selfLikeState), Integer.valueOf(d5Var.field_selfLikeState)) && C46238a.m51546a(this.field_sportRecord, d5Var.field_sportRecord);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149184q == hashCode) {
                    try {
                        this.field_rankID = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149185r == hashCode) {
                    try {
                        this.field_appusername = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149186s == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149187t == hashCode) {
                    try {
                        this.field_ranknum = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149188u == hashCode) {
                    try {
                        this.field_score = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149189v == hashCode) {
                    try {
                        this.field_likecount = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149190w == hashCode) {
                    try {
                        this.field_selfLikeState = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149191x == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_sportRecord = (pa4) new pa4().parseFrom(blob);
                        }
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149192y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        pa4 pa4;
        ContentValues contentValues = new ContentValues();
        if (this.f149194d) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f149195e) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f149196f) {
            contentValues.put("username", this.field_username);
        }
        if (this.f149197g) {
            contentValues.put("ranknum", Integer.valueOf(this.field_ranknum));
        }
        if (this.f149198h) {
            contentValues.put(FirebaseAnalytics.C113379b.SCORE, Integer.valueOf(this.field_score));
        }
        if (this.f149199i) {
            contentValues.put("likecount", Integer.valueOf(this.field_likecount));
        }
        if (this.f149200j) {
            contentValues.put("selfLikeState", Integer.valueOf(this.field_selfLikeState));
        }
        if (this.f149201n && (pa4 = this.field_sportRecord) != null) {
            try {
                contentValues.put("sportRecord", pa4.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseHardDeviceRankInfo", e.getMessage());
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
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceRankInfo ( " + f149193z.sql + ");");
        for (String add : f149183p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceRankInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149193z, "HardDeviceRankInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceRankInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149193z;
    }

    public String[] getIndexCreateSQL() {
        return f149183p;
    }

    public StorageObserverOwner<C53333d5> getObserverOwner() {
        return f149181A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f149182o;
    }

    public String getTableName() {
        return f149182o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z) {
                this.f149194d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z) {
                this.f149195e = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f149196f = true;
            }
        }
        if (contentValues.containsKey("ranknum")) {
            this.field_ranknum = contentValues.getAsInteger("ranknum").intValue();
            if (z) {
                this.f149197g = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SCORE)) {
            this.field_score = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SCORE).intValue();
            if (z) {
                this.f149198h = true;
            }
        }
        if (contentValues.containsKey("likecount")) {
            this.field_likecount = contentValues.getAsInteger("likecount").intValue();
            if (z) {
                this.f149199i = true;
            }
        }
        if (contentValues.containsKey("selfLikeState")) {
            this.field_selfLikeState = contentValues.getAsInteger("selfLikeState").intValue();
            if (z) {
                this.f149200j = true;
            }
        }
        if (contentValues.containsKey("sportRecord")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("sportRecord");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_sportRecord = (pa4) new pa4().parseFrom(asByteArray);
                    if (z) {
                        this.f149201n = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseHardDeviceRankInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
