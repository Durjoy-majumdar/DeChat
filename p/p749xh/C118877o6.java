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
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.wg4;

/* renamed from: xh.o6 */
public class C118877o6 extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f355835B;

    /* renamed from: C */
    public static final String[] f355836C = new String[0];

    /* renamed from: D */
    public static final int f355837D = -294460212;

    /* renamed from: E */
    public static final int f355838E = 3433509;

    /* renamed from: F */
    public static final int f355839F = -338815017;

    /* renamed from: G */
    public static final int f355840G = 110371416;

    /* renamed from: H */
    public static final int f355841H = -737588055;

    /* renamed from: I */
    public static final int f355842I = -793375479;

    /* renamed from: J */
    public static final int f355843J = 110366486;

    /* renamed from: K */
    public static final int f355844K = -1165461084;

    /* renamed from: L */
    public static final int f355845L = -1311637899;

    /* renamed from: M */
    public static final int f355846M = 376569651;

    /* renamed from: N */
    public static final int f355847N = -1648924556;

    /* renamed from: P */
    public static final int f355848P = 1637261197;

    /* renamed from: Q */
    public static final int f355849Q = -1596363504;

    /* renamed from: R */
    public static final int f355850R = 111723337;

    /* renamed from: S */
    public static final int f355851S = 1359467867;

    /* renamed from: T */
    public static final int f355852T = 1423336329;

    /* renamed from: U */
    public static final int f355853U = -1306498449;

    /* renamed from: V */
    public static final int f355854V = 109757585;

    /* renamed from: W */
    public static final int f355855W = -258801404;

    /* renamed from: X */
    public static final int f355856X = 3314158;

    /* renamed from: Y */
    public static final int f355857Y = -1348655006;

    /* renamed from: Z */
    public static final int f355858Z = 108705909;

    /* renamed from: p0 */
    public static final IAutoDBItem.MAutoDBInfo f355859p0 = initAutoDBInfo(C118877o6.class);

    /* renamed from: x0 */
    public static final StorageObserverOwner<C118877o6> f355860x0 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f355861A = true;

    /* renamed from: d */
    public boolean f355862d = true;

    /* renamed from: e */
    public boolean f355863e = true;

    /* renamed from: f */
    public boolean f355864f = true;
    public long field_beginShowTime;
    public long field_disappearTime;
    public String field_dynamicPath;
    public long field_exposureDisappearTime;
    public long field_exposureTime;
    public String field_extInfo;
    public String field_icon_url;
    public String field_lang;
    public int field_maxClientVersion;
    public int field_minClientVersion;
    public long field_overdueTime;
    public wg4 field_parents;
    public int field_path;
    public int field_priority;
    public String field_regCountry;
    public int field_showType;
    public int field_state;
    public int field_tipId;
    public int field_tipType;
    public String field_title;
    public String field_uniqueId;

    /* renamed from: g */
    public boolean f355865g = true;

    /* renamed from: h */
    public boolean f355866h = true;

    /* renamed from: i */
    public boolean f355867i = true;

    /* renamed from: j */
    public boolean f355868j = true;

    /* renamed from: n */
    public boolean f355869n = true;

    /* renamed from: o */
    public boolean f355870o = true;

    /* renamed from: p */
    public boolean f355871p = true;

    /* renamed from: q */
    public boolean f355872q = true;

    /* renamed from: r */
    public boolean f355873r = true;

    /* renamed from: s */
    public boolean f355874s = true;

    /* renamed from: t */
    public boolean f355875t = true;

    /* renamed from: u */
    public boolean f355876u = true;

    /* renamed from: v */
    public boolean f355877v = true;

    /* renamed from: w */
    public boolean f355878w = true;

    /* renamed from: x */
    public boolean f355879x = true;

    /* renamed from: y */
    public boolean f355880y = true;

    /* renamed from: z */
    public boolean f355881z = true;

    static {
        SingleTable singleTable = new SingleTable("NewTipsInfo2");
        f355835B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("uniqueId", "string", singleTable.getName(), "");
        new Column("path", "int", singleTable.getName(), "");
        new Column("showType", "int", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("icon_url", "string", singleTable.getName(), "");
        new Column("parents", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.TipsShowInfoParentList");
        new Column("tipId", "int", singleTable.getName(), "");
        new Column(DownloadInfo.PRIORITY, "int", singleTable.getName(), "");
        new Column("tipType", "int", singleTable.getName(), "");
        new Column("beginShowTime", "long", singleTable.getName(), "");
        new Column(C102646h.COL_EXPOSURETIME, "long", singleTable.getName(), "");
        new Column("overdueTime", "long", singleTable.getName(), "");
        new Column("disappearTime", "long", singleTable.getName(), "");
        new Column("exposureDisappearTime", "long", singleTable.getName(), "");
        new Column("minClientVersion", "int", singleTable.getName(), "");
        new Column("maxClientVersion", "int", singleTable.getName(), "");
        new Column("extInfo", "string", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("dynamicPath", "string", singleTable.getName(), "");
        new Column(IXWebPreferences.XWEB_LANGUAGE, "string", singleTable.getName(), "");
        new Column("regCountry", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[21];
        String[] strArr = new String[22];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "uniqueId";
        mAutoDBInfo.colsMap.put("uniqueId", "TEXT");
        mAutoDBInfo.columns[1] = "path";
        mAutoDBInfo.colsMap.put("path", "INTEGER");
        mAutoDBInfo.columns[2] = "showType";
        mAutoDBInfo.colsMap.put("showType", "INTEGER");
        mAutoDBInfo.columns[3] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[4] = "icon_url";
        mAutoDBInfo.colsMap.put("icon_url", "TEXT");
        mAutoDBInfo.columns[5] = "parents";
        mAutoDBInfo.colsMap.put("parents", "BLOB");
        mAutoDBInfo.columns[6] = "tipId";
        mAutoDBInfo.colsMap.put("tipId", "INTEGER");
        mAutoDBInfo.columns[7] = DownloadInfo.PRIORITY;
        mAutoDBInfo.colsMap.put(DownloadInfo.PRIORITY, "INTEGER");
        mAutoDBInfo.columns[8] = "tipType";
        mAutoDBInfo.colsMap.put("tipType", "INTEGER");
        mAutoDBInfo.columns[9] = "beginShowTime";
        mAutoDBInfo.colsMap.put("beginShowTime", "LONG");
        mAutoDBInfo.columns[10] = C102646h.COL_EXPOSURETIME;
        mAutoDBInfo.colsMap.put(C102646h.COL_EXPOSURETIME, "LONG");
        mAutoDBInfo.columns[11] = "overdueTime";
        mAutoDBInfo.colsMap.put("overdueTime", "LONG");
        mAutoDBInfo.columns[12] = "disappearTime";
        mAutoDBInfo.colsMap.put("disappearTime", "LONG");
        mAutoDBInfo.columns[13] = "exposureDisappearTime";
        mAutoDBInfo.colsMap.put("exposureDisappearTime", "LONG");
        mAutoDBInfo.columns[14] = "minClientVersion";
        mAutoDBInfo.colsMap.put("minClientVersion", "INTEGER");
        mAutoDBInfo.columns[15] = "maxClientVersion";
        mAutoDBInfo.colsMap.put("maxClientVersion", "INTEGER");
        mAutoDBInfo.columns[16] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "TEXT");
        mAutoDBInfo.columns[17] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "dynamicPath";
        mAutoDBInfo.colsMap.put("dynamicPath", "TEXT");
        mAutoDBInfo.columns[19] = IXWebPreferences.XWEB_LANGUAGE;
        mAutoDBInfo.colsMap.put(IXWebPreferences.XWEB_LANGUAGE, "TEXT");
        mAutoDBInfo.columns[20] = "regCountry";
        mAutoDBInfo.colsMap.put("regCountry", "TEXT");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " uniqueId TEXT,  path INTEGER,  showType INTEGER,  title TEXT,  icon_url TEXT,  parents BLOB,  tipId INTEGER,  priority INTEGER,  tipType INTEGER,  beginShowTime LONG,  exposureTime LONG,  overdueTime LONG,  disappearTime LONG,  exposureDisappearTime LONG,  minClientVersion INTEGER,  maxClientVersion INTEGER,  extInfo TEXT,  state INTEGER default '0' ,  dynamicPath TEXT,  lang TEXT,  regCountry TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118877o6)) {
            return false;
        }
        C118877o6 o6Var = (C118877o6) iAutoDBItem;
        return C46238a.m51546a(this.field_uniqueId, o6Var.field_uniqueId) && C46238a.m51546a(Integer.valueOf(this.field_path), Integer.valueOf(o6Var.field_path)) && C46238a.m51546a(Integer.valueOf(this.field_showType), Integer.valueOf(o6Var.field_showType)) && C46238a.m51546a(this.field_title, o6Var.field_title) && C46238a.m51546a(this.field_icon_url, o6Var.field_icon_url) && C46238a.m51546a(this.field_parents, o6Var.field_parents) && C46238a.m51546a(Integer.valueOf(this.field_tipId), Integer.valueOf(o6Var.field_tipId)) && C46238a.m51546a(Integer.valueOf(this.field_priority), Integer.valueOf(o6Var.field_priority)) && C46238a.m51546a(Integer.valueOf(this.field_tipType), Integer.valueOf(o6Var.field_tipType)) && C46238a.m51546a(Long.valueOf(this.field_beginShowTime), Long.valueOf(o6Var.field_beginShowTime)) && C46238a.m51546a(Long.valueOf(this.field_exposureTime), Long.valueOf(o6Var.field_exposureTime)) && C46238a.m51546a(Long.valueOf(this.field_overdueTime), Long.valueOf(o6Var.field_overdueTime)) && C46238a.m51546a(Long.valueOf(this.field_disappearTime), Long.valueOf(o6Var.field_disappearTime)) && C46238a.m51546a(Long.valueOf(this.field_exposureDisappearTime), Long.valueOf(o6Var.field_exposureDisappearTime)) && C46238a.m51546a(Integer.valueOf(this.field_minClientVersion), Integer.valueOf(o6Var.field_minClientVersion)) && C46238a.m51546a(Integer.valueOf(this.field_maxClientVersion), Integer.valueOf(o6Var.field_maxClientVersion)) && C46238a.m51546a(this.field_extInfo, o6Var.field_extInfo) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(o6Var.field_state)) && C46238a.m51546a(this.field_dynamicPath, o6Var.field_dynamicPath) && C46238a.m51546a(this.field_lang, o6Var.field_lang) && C46238a.m51546a(this.field_regCountry, o6Var.field_regCountry);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355837D == hashCode) {
                    try {
                        this.field_uniqueId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355838E == hashCode) {
                    try {
                        this.field_path = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355839F == hashCode) {
                    try {
                        this.field_showType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355840G == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355841H == hashCode) {
                    try {
                        this.field_icon_url = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355842I == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_parents = (wg4) new wg4().parseFrom(blob);
                        }
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355843J == hashCode) {
                    try {
                        this.field_tipId = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355844K == hashCode) {
                    try {
                        this.field_priority = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355845L == hashCode) {
                    try {
                        this.field_tipType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355846M == hashCode) {
                    try {
                        this.field_beginShowTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355847N == hashCode) {
                    try {
                        this.field_exposureTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355848P == hashCode) {
                    try {
                        this.field_overdueTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355849Q == hashCode) {
                    try {
                        this.field_disappearTime = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355850R == hashCode) {
                    try {
                        this.field_exposureDisappearTime = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355851S == hashCode) {
                    try {
                        this.field_minClientVersion = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355852T == hashCode) {
                    try {
                        this.field_maxClientVersion = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355853U == hashCode) {
                    try {
                        this.field_extInfo = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355854V == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355855W == hashCode) {
                    try {
                        this.field_dynamicPath = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355856X == hashCode) {
                    try {
                        this.field_lang = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355857Y == hashCode) {
                    try {
                        this.field_regCountry = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNewTipsInfo2", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355858Z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        wg4 wg4;
        ContentValues contentValues = new ContentValues();
        if (this.f355862d) {
            contentValues.put("uniqueId", this.field_uniqueId);
        }
        if (this.f355863e) {
            contentValues.put("path", Integer.valueOf(this.field_path));
        }
        if (this.f355864f) {
            contentValues.put("showType", Integer.valueOf(this.field_showType));
        }
        if (this.f355865g) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f355866h) {
            contentValues.put("icon_url", this.field_icon_url);
        }
        if (this.f355867i && (wg4 = this.field_parents) != null) {
            try {
                contentValues.put("parents", wg4.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo2", e.getMessage());
            }
        }
        if (this.f355868j) {
            contentValues.put("tipId", Integer.valueOf(this.field_tipId));
        }
        if (this.f355869n) {
            contentValues.put(DownloadInfo.PRIORITY, Integer.valueOf(this.field_priority));
        }
        if (this.f355870o) {
            contentValues.put("tipType", Integer.valueOf(this.field_tipType));
        }
        if (this.f355871p) {
            contentValues.put("beginShowTime", Long.valueOf(this.field_beginShowTime));
        }
        if (this.f355872q) {
            contentValues.put(C102646h.COL_EXPOSURETIME, Long.valueOf(this.field_exposureTime));
        }
        if (this.f355873r) {
            contentValues.put("overdueTime", Long.valueOf(this.field_overdueTime));
        }
        if (this.f355874s) {
            contentValues.put("disappearTime", Long.valueOf(this.field_disappearTime));
        }
        if (this.f355875t) {
            contentValues.put("exposureDisappearTime", Long.valueOf(this.field_exposureDisappearTime));
        }
        if (this.f355876u) {
            contentValues.put("minClientVersion", Integer.valueOf(this.field_minClientVersion));
        }
        if (this.f355877v) {
            contentValues.put("maxClientVersion", Integer.valueOf(this.field_maxClientVersion));
        }
        if (this.f355878w) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f355879x) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f355880y) {
            contentValues.put("dynamicPath", this.field_dynamicPath);
        }
        if (this.f355881z) {
            contentValues.put(IXWebPreferences.XWEB_LANGUAGE, this.field_lang);
        }
        if (this.f355861A) {
            contentValues.put("regCountry", this.field_regCountry);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS NewTipsInfo2 ( " + f355859p0.sql + ");");
        for (String add : f355836C) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("NewTipsInfo2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355859p0, "NewTipsInfo2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("NewTipsInfo2", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseNewTipsInfo2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355859p0;
    }

    public String[] getIndexCreateSQL() {
        return f355836C;
    }

    public StorageObserverOwner<C118877o6> getObserverOwner() {
        return f355860x0;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f355835B;
    }

    public String getTableName() {
        return f355835B.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("uniqueId")) {
            this.field_uniqueId = contentValues.getAsString("uniqueId");
            if (z) {
                this.f355862d = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsInteger("path").intValue();
            if (z) {
                this.f355863e = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.field_showType = contentValues.getAsInteger("showType").intValue();
            if (z) {
                this.f355864f = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f355865g = true;
            }
        }
        if (contentValues.containsKey("icon_url")) {
            this.field_icon_url = contentValues.getAsString("icon_url");
            if (z) {
                this.f355866h = true;
            }
        }
        if (contentValues.containsKey("parents")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("parents");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_parents = (wg4) new wg4().parseFrom(asByteArray);
                    if (z) {
                        this.f355867i = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseNewTipsInfo2", e.getMessage());
            }
        }
        if (contentValues.containsKey("tipId")) {
            this.field_tipId = contentValues.getAsInteger("tipId").intValue();
            if (z) {
                this.f355868j = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.PRIORITY)) {
            this.field_priority = contentValues.getAsInteger(DownloadInfo.PRIORITY).intValue();
            if (z) {
                this.f355869n = true;
            }
        }
        if (contentValues.containsKey("tipType")) {
            this.field_tipType = contentValues.getAsInteger("tipType").intValue();
            if (z) {
                this.f355870o = true;
            }
        }
        if (contentValues.containsKey("beginShowTime")) {
            this.field_beginShowTime = contentValues.getAsLong("beginShowTime").longValue();
            if (z) {
                this.f355871p = true;
            }
        }
        if (contentValues.containsKey(C102646h.COL_EXPOSURETIME)) {
            this.field_exposureTime = contentValues.getAsLong(C102646h.COL_EXPOSURETIME).longValue();
            if (z) {
                this.f355872q = true;
            }
        }
        if (contentValues.containsKey("overdueTime")) {
            this.field_overdueTime = contentValues.getAsLong("overdueTime").longValue();
            if (z) {
                this.f355873r = true;
            }
        }
        if (contentValues.containsKey("disappearTime")) {
            this.field_disappearTime = contentValues.getAsLong("disappearTime").longValue();
            if (z) {
                this.f355874s = true;
            }
        }
        if (contentValues.containsKey("exposureDisappearTime")) {
            this.field_exposureDisappearTime = contentValues.getAsLong("exposureDisappearTime").longValue();
            if (z) {
                this.f355875t = true;
            }
        }
        if (contentValues.containsKey("minClientVersion")) {
            this.field_minClientVersion = contentValues.getAsInteger("minClientVersion").intValue();
            if (z) {
                this.f355876u = true;
            }
        }
        if (contentValues.containsKey("maxClientVersion")) {
            this.field_maxClientVersion = contentValues.getAsInteger("maxClientVersion").intValue();
            if (z) {
                this.f355877v = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z) {
                this.f355878w = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f355879x = true;
            }
        }
        if (contentValues.containsKey("dynamicPath")) {
            this.field_dynamicPath = contentValues.getAsString("dynamicPath");
            if (z) {
                this.f355880y = true;
            }
        }
        if (contentValues.containsKey(IXWebPreferences.XWEB_LANGUAGE)) {
            this.field_lang = contentValues.getAsString(IXWebPreferences.XWEB_LANGUAGE);
            if (z) {
                this.f355881z = true;
            }
        }
        if (contentValues.containsKey("regCountry")) {
            this.field_regCountry = contentValues.getAsString("regCountry");
            if (z) {
                this.f355861A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
