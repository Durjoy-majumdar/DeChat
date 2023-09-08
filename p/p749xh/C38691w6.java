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
import org.json.JSONObject;
import te3.C50915q5;

/* renamed from: xh.w6 */
public class C38691w6 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f104122j;

    /* renamed from: n */
    public static final String[] f104123n = new String[0];

    /* renamed from: o */
    public static final int f104124o = 93029116;

    /* renamed from: p */
    public static final int f104125p = -1613589672;

    /* renamed from: q */
    public static final int f104126q = -1411086673;

    /* renamed from: r */
    public static final int f104127r = -295931082;

    /* renamed from: s */
    public static final int f104128s = -1595499544;

    /* renamed from: t */
    public static final int f104129t = -1868521062;

    /* renamed from: u */
    public static final int f104130u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f104131v = initAutoDBInfo(C38691w6.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38691w6> f104132w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104133d = true;

    /* renamed from: e */
    public boolean f104134e = true;

    /* renamed from: f */
    public boolean f104135f = true;
    public String field_acctTypeId;
    public C50915q5 field_appRec;
    public String field_appid;
    public String field_language;
    public int field_subType;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f104136g = true;

    /* renamed from: h */
    public boolean f104137h = true;

    /* renamed from: i */
    public boolean f104138i = true;

    static {
        SingleTable singleTable = new SingleTable("OpenIMAppIdInfo");
        f104122j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appid", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "string", singleTable.getName(), "");
        new Column("appRec", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AppIdResource");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("acctTypeId", "string", singleTable.getName(), "");
        new Column("subType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appid";
        mAutoDBInfo.colsMap.put("appid", "TEXT");
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        mAutoDBInfo.columns[2] = "appRec";
        mAutoDBInfo.colsMap.put("appRec", "BLOB");
        mAutoDBInfo.columns[3] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[4] = "acctTypeId";
        mAutoDBInfo.colsMap.put("acctTypeId", "TEXT");
        mAutoDBInfo.columns[5] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " appid TEXT,  language TEXT,  appRec BLOB,  updateTime LONG default '0' ,  acctTypeId TEXT,  subType INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38691w6)) {
            return false;
        }
        C38691w6 w6Var = (C38691w6) iAutoDBItem;
        return C46238a.m51546a(this.field_appid, w6Var.field_appid) && C46238a.m51546a(this.field_language, w6Var.field_language) && C46238a.m51546a(this.field_appRec, w6Var.field_appRec) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(w6Var.field_updateTime)) && C46238a.m51546a(this.field_acctTypeId, w6Var.field_acctTypeId) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(w6Var.field_subType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104124o == hashCode) {
                    try {
                        this.field_appid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104125p == hashCode) {
                    try {
                        this.field_language = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104126q == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_appRec = (C50915q5) new C50915q5().parseFrom(blob);
                        }
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104127r == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104128s == hashCode) {
                    try {
                        this.field_acctTypeId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104129t == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAppIdInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104130u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C50915q5 q5Var;
        ContentValues contentValues = new ContentValues();
        if (this.f104133d) {
            contentValues.put("appid", this.field_appid);
        }
        if (this.f104134e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f104135f && (q5Var = this.field_appRec) != null) {
            try {
                contentValues.put("appRec", q5Var.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e.getMessage());
            }
        }
        if (this.f104136g) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f104137h) {
            contentValues.put("acctTypeId", this.field_acctTypeId);
        }
        if (this.f104138i) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMAppIdInfo ( " + f104131v.sql + ");");
        for (String add : f104123n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMAppIdInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104131v, "OpenIMAppIdInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMAppIdInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104131v;
    }

    public String[] getIndexCreateSQL() {
        return f104123n;
    }

    public StorageObserverOwner<C38691w6> getObserverOwner() {
        return f104132w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104122j;
    }

    public String getTableName() {
        return f104122j.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "appid", this.field_appid);
            C46238a.m51547b(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            C46238a.m51547b(jSONObject, "appRec", this.field_appRec);
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
            C46238a.m51547b(jSONObject, "acctTypeId", this.field_acctTypeId);
            C46238a.m51547b(jSONObject, "subType", Integer.valueOf(this.field_subType));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appid")) {
            this.field_appid = contentValues.getAsString("appid");
            if (z) {
                this.f104133d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z) {
                this.f104134e = true;
            }
        }
        if (contentValues.containsKey("appRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("appRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_appRec = (C50915q5) new C50915q5().parseFrom(asByteArray);
                    if (z) {
                        this.f104135f = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f104136g = true;
            }
        }
        if (contentValues.containsKey("acctTypeId")) {
            this.field_acctTypeId = contentValues.getAsString("acctTypeId");
            if (z) {
                this.f104137h = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.f104138i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
