package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.u2 */
public class C78826u2 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231431A = 116079;

    /* renamed from: B */
    public static final int f231432B = 805808750;

    /* renamed from: C */
    public static final int f231433C = -1949207578;

    /* renamed from: D */
    public static final int f231434D = 722979968;

    /* renamed from: E */
    public static final int f231435E = -738054082;

    /* renamed from: F */
    public static final int f231436F = 55126294;

    /* renamed from: G */
    public static final int f231437G = 108705909;

    /* renamed from: H */
    public static final IAutoDBItem.MAutoDBInfo f231438H = initAutoDBInfo(C78826u2.class);

    /* renamed from: I */
    public static final StorageObserverOwner<C78826u2> f231439I = new StorageObserverOwner<>();

    /* renamed from: s */
    public static final SingleTable f231440s;

    /* renamed from: t */
    public static final String[] f231441t = new String[0];

    /* renamed from: u */
    public static final int f231442u = -420503887;

    /* renamed from: v */
    public static final int f231443v = 110371416;

    /* renamed from: w */
    public static final int f231444w = -1307249055;

    /* renamed from: x */
    public static final int f231445x = -1497890291;

    /* renamed from: y */
    public static final int f231446y = 114586;

    /* renamed from: z */
    public static final int f231447z = 1851881104;

    /* renamed from: d */
    public boolean f231448d = true;

    /* renamed from: e */
    public boolean f231449e = true;

    /* renamed from: f */
    public boolean f231450f = true;
    public int field_actionType;
    public String field_androidUrl;
    public int field_featureId;
    public String field_helpUrl;
    public String field_iconPath;
    public String field_tag;
    public long field_timestamp;
    public String field_title;
    public String field_titlePY;
    public String field_titleShortPY;
    public String field_updateUrl;
    public String field_url;

    /* renamed from: g */
    public boolean f231451g = true;

    /* renamed from: h */
    public boolean f231452h = true;

    /* renamed from: i */
    public boolean f231453i = true;

    /* renamed from: j */
    public boolean f231454j = true;

    /* renamed from: n */
    public boolean f231455n = true;

    /* renamed from: o */
    public boolean f231456o = true;

    /* renamed from: p */
    public boolean f231457p = true;

    /* renamed from: q */
    public boolean f231458q = true;

    /* renamed from: r */
    public boolean f231459r = true;

    static {
        SingleTable singleTable = new SingleTable("Feature");
        f231440s = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("featureId", "int", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("titlePY", "string", singleTable.getName(), "");
        new Column("titleShortPY", "string", singleTable.getName(), "");
        new Column("tag", "string", singleTable.getName(), "");
        new Column("actionType", "int", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("helpUrl", "string", singleTable.getName(), "");
        new Column("updateUrl", "string", singleTable.getName(), "");
        new Column("androidUrl", "string", singleTable.getName(), "");
        new Column("iconPath", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[12];
        String[] strArr = new String[13];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "featureId";
        mAutoDBInfo.colsMap.put("featureId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "featureId";
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[2] = "titlePY";
        mAutoDBInfo.colsMap.put("titlePY", "TEXT");
        mAutoDBInfo.columns[3] = "titleShortPY";
        mAutoDBInfo.colsMap.put("titleShortPY", "TEXT");
        mAutoDBInfo.columns[4] = "tag";
        mAutoDBInfo.colsMap.put("tag", "TEXT");
        mAutoDBInfo.columns[5] = "actionType";
        mAutoDBInfo.colsMap.put("actionType", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[7] = "helpUrl";
        mAutoDBInfo.colsMap.put("helpUrl", "TEXT");
        mAutoDBInfo.columns[8] = "updateUrl";
        mAutoDBInfo.colsMap.put("updateUrl", "TEXT");
        mAutoDBInfo.columns[9] = "androidUrl";
        mAutoDBInfo.colsMap.put("androidUrl", "TEXT");
        mAutoDBInfo.columns[10] = "iconPath";
        mAutoDBInfo.colsMap.put("iconPath", "TEXT");
        mAutoDBInfo.columns[11] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        mAutoDBInfo.columns[12] = "rowid";
        mAutoDBInfo.sql = " featureId INTEGER PRIMARY KEY ,  title TEXT,  titlePY TEXT,  titleShortPY TEXT,  tag TEXT,  actionType INTEGER default '0' ,  url TEXT,  helpUrl TEXT,  updateUrl TEXT,  androidUrl TEXT,  iconPath TEXT,  timestamp LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78826u2)) {
            return false;
        }
        C78826u2 u2Var = (C78826u2) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_featureId), Integer.valueOf(u2Var.field_featureId)) && C46238a.m51546a(this.field_title, u2Var.field_title) && C46238a.m51546a(this.field_titlePY, u2Var.field_titlePY) && C46238a.m51546a(this.field_titleShortPY, u2Var.field_titleShortPY) && C46238a.m51546a(this.field_tag, u2Var.field_tag) && C46238a.m51546a(Integer.valueOf(this.field_actionType), Integer.valueOf(u2Var.field_actionType)) && C46238a.m51546a(this.field_url, u2Var.field_url) && C46238a.m51546a(this.field_helpUrl, u2Var.field_helpUrl) && C46238a.m51546a(this.field_updateUrl, u2Var.field_updateUrl) && C46238a.m51546a(this.field_androidUrl, u2Var.field_androidUrl) && C46238a.m51546a(this.field_iconPath, u2Var.field_iconPath) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(u2Var.field_timestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231442u == hashCode) {
                    try {
                        this.field_featureId = cursor.getInt(i);
                        this.f231448d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231443v == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231444w == hashCode) {
                    try {
                        this.field_titlePY = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231445x == hashCode) {
                    try {
                        this.field_titleShortPY = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231446y == hashCode) {
                    try {
                        this.field_tag = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231447z == hashCode) {
                    try {
                        this.field_actionType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231431A == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231432B == hashCode) {
                    try {
                        this.field_helpUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231433C == hashCode) {
                    try {
                        this.field_updateUrl = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231434D == hashCode) {
                    try {
                        this.field_androidUrl = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231435E == hashCode) {
                    try {
                        this.field_iconPath = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231436F == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFeature", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231437G == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231448d) {
            contentValues.put("featureId", Integer.valueOf(this.field_featureId));
        }
        if (this.f231449e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f231450f) {
            contentValues.put("titlePY", this.field_titlePY);
        }
        if (this.f231451g) {
            contentValues.put("titleShortPY", this.field_titleShortPY);
        }
        if (this.f231452h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f231453i) {
            contentValues.put("actionType", Integer.valueOf(this.field_actionType));
        }
        if (this.f231454j) {
            contentValues.put("url", this.field_url);
        }
        if (this.f231455n) {
            contentValues.put("helpUrl", this.field_helpUrl);
        }
        if (this.f231456o) {
            contentValues.put("updateUrl", this.field_updateUrl);
        }
        if (this.f231457p) {
            contentValues.put("androidUrl", this.field_androidUrl);
        }
        if (this.f231458q) {
            contentValues.put("iconPath", this.field_iconPath);
        }
        if (this.f231459r) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFeature", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS Feature ( " + f231438H.sql + ");");
        for (String add : f231441t) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFeature", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("Feature", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231438H, "Feature", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFeature", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("Feature", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFeature", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231438H;
    }

    public String[] getIndexCreateSQL() {
        return f231441t;
    }

    public StorageObserverOwner<C78826u2> getObserverOwner() {
        return f231439I;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_featureId);
    }

    public SingleTable getTable() {
        return f231440s;
    }

    public String getTableName() {
        return f231440s.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("featureId")) {
            this.field_featureId = contentValues.getAsInteger("featureId").intValue();
            if (z) {
                this.f231448d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f231449e = true;
            }
        }
        if (contentValues.containsKey("titlePY")) {
            this.field_titlePY = contentValues.getAsString("titlePY");
            if (z) {
                this.f231450f = true;
            }
        }
        if (contentValues.containsKey("titleShortPY")) {
            this.field_titleShortPY = contentValues.getAsString("titleShortPY");
            if (z) {
                this.f231451g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z) {
                this.f231452h = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.field_actionType = contentValues.getAsInteger("actionType").intValue();
            if (z) {
                this.f231453i = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f231454j = true;
            }
        }
        if (contentValues.containsKey("helpUrl")) {
            this.field_helpUrl = contentValues.getAsString("helpUrl");
            if (z) {
                this.f231455n = true;
            }
        }
        if (contentValues.containsKey("updateUrl")) {
            this.field_updateUrl = contentValues.getAsString("updateUrl");
            if (z) {
                this.f231456o = true;
            }
        }
        if (contentValues.containsKey("androidUrl")) {
            this.field_androidUrl = contentValues.getAsString("androidUrl");
            if (z) {
                this.f231457p = true;
            }
        }
        if (contentValues.containsKey("iconPath")) {
            this.field_iconPath = contentValues.getAsString("iconPath");
            if (z) {
                this.f231458q = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f231459r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
