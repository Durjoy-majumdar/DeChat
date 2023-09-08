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
import te3.C49076d1;

/* renamed from: xh.v6 */
public class C38685v6 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103986h;

    /* renamed from: i */
    public static final String[] f103987i = new String[0];

    /* renamed from: j */
    public static final int f103988j = -1595499544;

    /* renamed from: n */
    public static final int f103989n = -1613589672;

    /* renamed from: o */
    public static final int f103990o = 1119775541;

    /* renamed from: p */
    public static final int f103991p = -295931082;

    /* renamed from: q */
    public static final int f103992q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103993r = initAutoDBInfo(C38685v6.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38685v6> f103994s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103995d = true;

    /* renamed from: e */
    public boolean f103996e = true;

    /* renamed from: f */
    public boolean f103997f = true;
    public C49076d1 field_accTypeRec;
    public String field_acctTypeId;
    public String field_language;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f103998g = true;

    static {
        SingleTable singleTable = new SingleTable("OpenIMAccTypeInfo");
        f103986h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("acctTypeId", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "string", singleTable.getName(), "");
        new Column("accTypeRec", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AcctTypeResource");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "acctTypeId";
        mAutoDBInfo.colsMap.put("acctTypeId", "TEXT");
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "TEXT");
        mAutoDBInfo.columns[2] = "accTypeRec";
        mAutoDBInfo.colsMap.put("accTypeRec", "BLOB");
        mAutoDBInfo.columns[3] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " acctTypeId TEXT,  language TEXT,  accTypeRec BLOB,  updateTime LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38685v6)) {
            return false;
        }
        C38685v6 v6Var = (C38685v6) iAutoDBItem;
        return C46238a.m51546a(this.field_acctTypeId, v6Var.field_acctTypeId) && C46238a.m51546a(this.field_language, v6Var.field_language) && C46238a.m51546a(this.field_accTypeRec, v6Var.field_accTypeRec) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(v6Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103988j == hashCode) {
                    try {
                        this.field_acctTypeId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103989n == hashCode) {
                    try {
                        this.field_language = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103990o == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_accTypeRec = (C49076d1) new C49076d1().parseFrom(blob);
                        }
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103991p == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103992q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C49076d1 d1Var;
        ContentValues contentValues = new ContentValues();
        if (this.f103995d) {
            contentValues.put("acctTypeId", this.field_acctTypeId);
        }
        if (this.f103996e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
        }
        if (this.f103997f && (d1Var = this.field_accTypeRec) != null) {
            try {
                contentValues.put("accTypeRec", d1Var.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e.getMessage());
            }
        }
        if (this.f103998g) {
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
            Log.m105920e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMAccTypeInfo ( " + f103993r.sql + ");");
        for (String add : f103987i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMAccTypeInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103993r, "OpenIMAccTypeInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMAccTypeInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103993r;
    }

    public String[] getIndexCreateSQL() {
        return f103987i;
    }

    public StorageObserverOwner<C38685v6> getObserverOwner() {
        return f103994s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103986h;
    }

    public String getTableName() {
        return f103986h.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "acctTypeId", this.field_acctTypeId);
            C46238a.m51547b(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.field_language);
            C46238a.m51547b(jSONObject, "accTypeRec", this.field_accTypeRec);
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("acctTypeId")) {
            this.field_acctTypeId = contentValues.getAsString("acctTypeId");
            if (z) {
                this.f103995d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
            this.field_language = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            if (z) {
                this.f103996e = true;
            }
        }
        if (contentValues.containsKey("accTypeRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("accTypeRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_accTypeRec = (C49076d1) new C49076d1().parseFrom(asByteArray);
                    if (z) {
                        this.f103997f = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103998g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
