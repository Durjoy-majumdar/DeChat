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
import org.json.JSONObject;

/* renamed from: xh.b7 */
public class C38533b7 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f101798n;

    /* renamed from: o */
    public static final String[] f101799o = new String[0];

    /* renamed from: p */
    public static final int f101800p = 93029116;

    /* renamed from: q */
    public static final int f101801q = 899170259;

    /* renamed from: r */
    public static final int f101802r = -1613589672;

    /* renamed from: s */
    public static final int f101803s = 1524956312;

    /* renamed from: t */
    public static final int f101804t = -988136023;

    /* renamed from: u */
    public static final int f101805u = 651281060;

    /* renamed from: v */
    public static final int f101806v = -295931082;

    /* renamed from: w */
    public static final int f101807w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f101808x = initAutoDBInfo(C38533b7.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38533b7> f101809y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101810d = true;

    /* renamed from: e */
    public boolean f101811e = true;

    /* renamed from: f */
    public boolean f101812f = true;
    public String field_appid;
    public String field_language;
    public String field_pinyin;
    public String field_quanpin;
    public long field_updateTime;
    public String field_wording;
    public String field_wordingId;

    /* renamed from: g */
    public boolean f101813g = true;

    /* renamed from: h */
    public boolean f101814h = true;

    /* renamed from: i */
    public boolean f101815i = true;

    /* renamed from: j */
    public boolean f101816j = true;

    static {
        SingleTable singleTable = new SingleTable("OpenIMWordingInfo");
        f101798n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appid", "string", singleTable.getName(), "");
        new Column("wordingId", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "string", singleTable.getName(), "");
        new Column("wording", "string", singleTable.getName(), "");
        new Column("pinyin", "string", singleTable.getName(), "");
        new Column("quanpin", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appid";
        mAutoDBInfo.colsMap.put("appid", "TEXT");
        mAutoDBInfo.columns[1] = "wordingId";
        mAutoDBInfo.colsMap.put("wordingId", "TEXT");
        mAutoDBInfo.columns[2] = FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        mAutoDBInfo.columns[3] = "wording";
        mAutoDBInfo.colsMap.put("wording", "TEXT");
        mAutoDBInfo.columns[4] = "pinyin";
        mAutoDBInfo.colsMap.put("pinyin", "TEXT");
        mAutoDBInfo.columns[5] = "quanpin";
        mAutoDBInfo.colsMap.put("quanpin", "TEXT");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " appid TEXT,  wordingId TEXT,  language TEXT,  wording TEXT,  pinyin TEXT,  quanpin TEXT,  updateTime LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38533b7)) {
            return false;
        }
        C38533b7 b7Var = (C38533b7) iAutoDBItem;
        return C46238a.m51546a(this.field_appid, b7Var.field_appid) && C46238a.m51546a(this.field_wordingId, b7Var.field_wordingId) && C46238a.m51546a(this.field_language, b7Var.field_language) && C46238a.m51546a(this.field_wording, b7Var.field_wording) && C46238a.m51546a(this.field_pinyin, b7Var.field_pinyin) && C46238a.m51546a(this.field_quanpin, b7Var.field_quanpin) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(b7Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101800p == hashCode) {
                    try {
                        this.field_appid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101801q == hashCode) {
                    try {
                        this.field_wordingId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101802r == hashCode) {
                    try {
                        this.field_language = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101803s == hashCode) {
                    try {
                        this.field_wording = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101804t == hashCode) {
                    try {
                        this.field_pinyin = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101805u == hashCode) {
                    try {
                        this.field_quanpin = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101806v == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMWordingInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101807w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101810d) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f101811e) {
            contentValues.put("wordingId", this.field_wordingId);
        }
        if (this.f101812f) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f101813g) {
            contentValues.put("wording", this.field_wording);
        }
        if (this.f101814h) {
            contentValues.put("pinyin", this.field_pinyin);
        }
        if (this.f101815i) {
            contentValues.put("quanpin", this.field_quanpin);
        }
        if (this.f101816j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMWordingInfo ( " + f101808x.sql + ");");
        for (String add : f101799o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMWordingInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101808x, "OpenIMWordingInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMWordingInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMWordingInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101808x;
    }

    public String[] getIndexCreateSQL() {
        return f101799o;
    }

    public StorageObserverOwner<C38533b7> getObserverOwner() {
        return f101809y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101798n;
    }

    public String getTableName() {
        return f101798n.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "appid", this.field_appid);
            C46238a.m51547b(jSONObject, "wordingId", this.field_wordingId);
            C46238a.m51547b(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            C46238a.m51547b(jSONObject, "wording", this.field_wording);
            C46238a.m51547b(jSONObject, "pinyin", this.field_pinyin);
            C46238a.m51547b(jSONObject, "quanpin", this.field_quanpin);
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z) {
                this.f101810d = true;
            }
        }
        if (contentValues.containsKey("wordingId")) {
            this.field_wordingId = contentValues.getAsString("wordingId");
            if (z) {
                this.f101811e = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z) {
                this.f101812f = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.field_wording = contentValues.getAsString("wording");
            if (z) {
                this.f101813g = true;
            }
        }
        if (contentValues.containsKey("pinyin")) {
            this.field_pinyin = contentValues.getAsString("pinyin");
            if (z) {
                this.f101814h = true;
            }
        }
        if (contentValues.containsKey("quanpin")) {
            this.field_quanpin = contentValues.getAsString("quanpin");
            if (z) {
                this.f101815i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f101816j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
