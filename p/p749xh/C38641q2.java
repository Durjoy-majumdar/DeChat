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
import te3.C101855vc0;

/* renamed from: xh.q2 */
public class C38641q2 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f103366i;

    /* renamed from: j */
    public static final String[] f103367j = {"CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)"};

    /* renamed from: n */
    public static final int f103368n = 338409958;

    /* renamed from: o */
    public static final int f103369o = 1226130741;

    /* renamed from: p */
    public static final int f103370p = 3560141;

    /* renamed from: q */
    public static final int f103371q = 3575610;

    /* renamed from: r */
    public static final int f103372r = 109254796;

    /* renamed from: s */
    public static final int f103373s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f103374t = initAutoDBInfo(C38641q2.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38641q2> f103375u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103376d = true;

    /* renamed from: e */
    public boolean f103377e = true;

    /* renamed from: f */
    public boolean f103378f = true;
    public long field_localId;
    public C101855vc0 field_modItem;
    public int field_scene;
    public long field_time;
    public int field_type;

    /* renamed from: g */
    public boolean f103379g = true;

    /* renamed from: h */
    public boolean f103380h = true;

    static {
        SingleTable singleTable = new SingleTable("FavEditInfo");
        f103366i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("modItem", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FavEditItem");
        new Column("time", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG");
        mAutoDBInfo.columns[1] = "modItem";
        mAutoDBInfo.colsMap.put("modItem", "BLOB");
        mAutoDBInfo.columns[2] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[3] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[4] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER default '1' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " localId LONG,  modItem BLOB,  time LONG,  type INTEGER,  scene INTEGER default '1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38641q2)) {
            return false;
        }
        C38641q2 q2Var = (C38641q2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(q2Var.field_localId)) && C46238a.m51546a(this.field_modItem, q2Var.field_modItem) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(q2Var.field_time)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(q2Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(q2Var.field_scene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103368n == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103369o == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_modItem = (C101855vc0) new C101855vc0().parseFrom(blob);
                        }
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103370p == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103371q == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103372r == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103373s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C101855vc0 vc02;
        ContentValues contentValues = new ContentValues();
        if (this.f103376d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f103377e && (vc02 = this.field_modItem) != null) {
            try {
                contentValues.put("modItem", vc02.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFavEditInfo", e.getMessage());
            }
        }
        if (this.f103378f) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        if (this.f103379g) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f103380h) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavEditInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavEditInfo ( " + f103374t.sql + ");");
        for (String add : f103367j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavEditInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavEditInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103374t, "FavEditInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavEditInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavEditInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavEditInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103374t;
    }

    public String[] getIndexCreateSQL() {
        return f103367j;
    }

    public StorageObserverOwner<C38641q2> getObserverOwner() {
        return f103375u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103366i;
    }

    public String getTableName() {
        return f103366i.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
            C46238a.m51547b(jSONObject, "modItem", this.field_modItem);
            C46238a.m51547b(jSONObject, "time", Long.valueOf(this.field_time));
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f103376d = true;
            }
        }
        if (contentValues.containsKey("modItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("modItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_modItem = (C101855vc0) new C101855vc0().parseFrom(asByteArray);
                    if (z) {
                        this.f103377e = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFavEditInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f103378f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103379g = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103380h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
