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

/* renamed from: xh.g */
public class C78808g extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C78808g> f230615A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f230616o;

    /* renamed from: p */
    public static final String[] f230617p = new String[0];

    /* renamed from: q */
    public static final int f230618q = -1067400928;

    /* renamed from: r */
    public static final int f230619r = 96572;

    /* renamed from: s */
    public static final int f230620s = 109595795;

    /* renamed from: t */
    public static final int f230621t = 1691969358;

    /* renamed from: u */
    public static final int f230622u = 2054532978;

    /* renamed from: v */
    public static final int f230623v = 398301669;

    /* renamed from: w */
    public static final int f230624w = 1661834217;

    /* renamed from: x */
    public static final int f230625x = 100897;

    /* renamed from: y */
    public static final int f230626y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f230627z = initAutoDBInfo(C78808g.class);

    /* renamed from: d */
    public boolean f230628d = true;

    /* renamed from: e */
    public boolean f230629e = true;

    /* renamed from: f */
    public boolean f230630f = true;
    public String field_aid;
    public String field_ext;
    public int field_isAsync;
    public int field_isSelected;
    public String field_sessionKey;
    public String field_snsid;
    public long field_storeTime;
    public String field_traceid;

    /* renamed from: g */
    public boolean f230631g = true;

    /* renamed from: h */
    public boolean f230632h = true;

    /* renamed from: i */
    public boolean f230633i = true;

    /* renamed from: j */
    public boolean f230634j = true;

    /* renamed from: n */
    public boolean f230635n = true;

    static {
        SingleTable singleTable = new SingleTable("AdPullRecordsInfo");
        f230616o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("traceid", "string", singleTable.getName(), "");
        new Column("aid", "string", singleTable.getName(), "");
        new Column("snsid", "string", singleTable.getName(), "");
        new Column("storeTime", "long", singleTable.getName(), "");
        new Column("isAsync", "int", singleTable.getName(), "");
        new Column("isSelected", "int", singleTable.getName(), "");
        new Column("sessionKey", "string", singleTable.getName(), "");
        new Column("ext", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "traceid";
        mAutoDBInfo.colsMap.put("traceid", "TEXT");
        mAutoDBInfo.columns[1] = "aid";
        mAutoDBInfo.colsMap.put("aid", "TEXT");
        mAutoDBInfo.columns[2] = "snsid";
        mAutoDBInfo.colsMap.put("snsid", "TEXT");
        mAutoDBInfo.columns[3] = "storeTime";
        mAutoDBInfo.colsMap.put("storeTime", "LONG");
        mAutoDBInfo.columns[4] = "isAsync";
        mAutoDBInfo.colsMap.put("isAsync", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "isSelected";
        mAutoDBInfo.colsMap.put("isSelected", "INTEGER default '1' ");
        mAutoDBInfo.columns[6] = "sessionKey";
        mAutoDBInfo.colsMap.put("sessionKey", "TEXT");
        mAutoDBInfo.columns[7] = "ext";
        mAutoDBInfo.colsMap.put("ext", "TEXT");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " traceid TEXT,  aid TEXT,  snsid TEXT,  storeTime LONG,  isAsync INTEGER default '0' ,  isSelected INTEGER default '1' ,  sessionKey TEXT,  ext TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78808g)) {
            return false;
        }
        C78808g gVar = (C78808g) iAutoDBItem;
        return C46238a.m51546a(this.field_traceid, gVar.field_traceid) && C46238a.m51546a(this.field_aid, gVar.field_aid) && C46238a.m51546a(this.field_snsid, gVar.field_snsid) && C46238a.m51546a(Long.valueOf(this.field_storeTime), Long.valueOf(gVar.field_storeTime)) && C46238a.m51546a(Integer.valueOf(this.field_isAsync), Integer.valueOf(gVar.field_isAsync)) && C46238a.m51546a(Integer.valueOf(this.field_isSelected), Integer.valueOf(gVar.field_isSelected)) && C46238a.m51546a(this.field_sessionKey, gVar.field_sessionKey) && C46238a.m51546a(this.field_ext, gVar.field_ext);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230618q == hashCode) {
                    try {
                        this.field_traceid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230619r == hashCode) {
                    try {
                        this.field_aid = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230620s == hashCode) {
                    try {
                        this.field_snsid = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230621t == hashCode) {
                    try {
                        this.field_storeTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230622u == hashCode) {
                    try {
                        this.field_isAsync = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230623v == hashCode) {
                    try {
                        this.field_isSelected = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230624w == hashCode) {
                    try {
                        this.field_sessionKey = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230625x == hashCode) {
                    try {
                        this.field_ext = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdPullRecordsInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230626y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230628d) {
            contentValues.put("traceid", this.field_traceid);
        }
        if (this.f230629e) {
            contentValues.put("aid", this.field_aid);
        }
        if (this.f230630f) {
            contentValues.put("snsid", this.field_snsid);
        }
        if (this.f230631g) {
            contentValues.put("storeTime", Long.valueOf(this.field_storeTime));
        }
        if (this.f230632h) {
            contentValues.put("isAsync", Integer.valueOf(this.field_isAsync));
        }
        if (this.f230633i) {
            contentValues.put("isSelected", Integer.valueOf(this.field_isSelected));
        }
        if (this.f230634j) {
            contentValues.put("sessionKey", this.field_sessionKey);
        }
        if (this.f230635n) {
            contentValues.put("ext", this.field_ext);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AdPullRecordsInfo ( " + f230627z.sql + ");");
        for (String add : f230617p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AdPullRecordsInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230627z, "AdPullRecordsInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAdPullRecordsInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AdPullRecordsInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230627z;
    }

    public String[] getIndexCreateSQL() {
        return f230617p;
    }

    public StorageObserverOwner<C78808g> getObserverOwner() {
        return f230615A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f230616o;
    }

    public String getTableName() {
        return f230616o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("traceid")) {
            this.field_traceid = contentValues.getAsString("traceid");
            if (z) {
                this.f230628d = true;
            }
        }
        if (contentValues.containsKey("aid")) {
            this.field_aid = contentValues.getAsString("aid");
            if (z) {
                this.f230629e = true;
            }
        }
        if (contentValues.containsKey("snsid")) {
            this.field_snsid = contentValues.getAsString("snsid");
            if (z) {
                this.f230630f = true;
            }
        }
        if (contentValues.containsKey("storeTime")) {
            this.field_storeTime = contentValues.getAsLong("storeTime").longValue();
            if (z) {
                this.f230631g = true;
            }
        }
        if (contentValues.containsKey("isAsync")) {
            this.field_isAsync = contentValues.getAsInteger("isAsync").intValue();
            if (z) {
                this.f230632h = true;
            }
        }
        if (contentValues.containsKey("isSelected")) {
            this.field_isSelected = contentValues.getAsInteger("isSelected").intValue();
            if (z) {
                this.f230633i = true;
            }
        }
        if (contentValues.containsKey("sessionKey")) {
            this.field_sessionKey = contentValues.getAsString("sessionKey");
            if (z) {
                this.f230634j = true;
            }
        }
        if (contentValues.containsKey("ext")) {
            this.field_ext = contentValues.getAsString("ext");
            if (z) {
                this.f230635n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
