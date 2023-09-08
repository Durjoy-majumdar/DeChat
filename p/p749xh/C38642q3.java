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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C49712hj1;

/* renamed from: xh.q3 */
public class C38642q3 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103381j;

    /* renamed from: n */
    public static final String[] f103382n = new String[0];

    /* renamed from: o */
    public static final int f103383o = 338409958;

    /* renamed from: p */
    public static final int f103384p = -1651192659;

    /* renamed from: q */
    public static final int f103385q = 109254796;

    /* renamed from: r */
    public static final int f103386r = -338830379;

    /* renamed from: s */
    public static final int f103387s = 273771720;

    /* renamed from: t */
    public static final int f103388t = -894276359;

    /* renamed from: u */
    public static final int f103389u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103390v = initAutoDBInfo(C38642q3.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38642q3> f103391w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103392d = true;

    /* renamed from: e */
    public boolean f103393e = true;

    /* renamed from: f */
    public boolean f103394f = true;
    public C49712hj1 field_contextObj;
    public boolean field_isPrivate;
    public int field_likeAction;
    public long field_localId;
    public int field_scene;
    public boolean field_showTips;

    /* renamed from: g */
    public boolean f103395g = true;

    /* renamed from: h */
    public boolean f103396h = true;

    /* renamed from: i */
    public boolean f103397i = true;

    static {
        SingleTable singleTable = new SingleTable("FinderLocalOperation");
        f103381j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("likeAction", "int", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("showTips", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("contextObj", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderReportContextObj");
        new Column("isPrivate", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "likeAction";
        mAutoDBInfo.colsMap.put("likeAction", "INTEGER");
        mAutoDBInfo.columns[2] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[3] = "showTips";
        mAutoDBInfo.colsMap.put("showTips", "INTEGER");
        mAutoDBInfo.columns[4] = "contextObj";
        mAutoDBInfo.colsMap.put("contextObj", "BLOB");
        mAutoDBInfo.columns[5] = "isPrivate";
        mAutoDBInfo.colsMap.put("isPrivate", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  likeAction INTEGER,  scene INTEGER,  showTips INTEGER,  contextObj BLOB,  isPrivate INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38642q3)) {
            return false;
        }
        C38642q3 q3Var = (C38642q3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(q3Var.field_localId)) && C46238a.m51546a(Integer.valueOf(this.field_likeAction), Integer.valueOf(q3Var.field_likeAction)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(q3Var.field_scene)) && C46238a.m51546a(Boolean.valueOf(this.field_showTips), Boolean.valueOf(q3Var.field_showTips)) && C46238a.m51546a(this.field_contextObj, q3Var.field_contextObj) && C46238a.m51546a(Boolean.valueOf(this.field_isPrivate), Boolean.valueOf(q3Var.field_isPrivate));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103383o == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f103392d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103384p == hashCode) {
                    try {
                        this.field_likeAction = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103385q == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103386r == hashCode) {
                    try {
                        this.field_showTips = cursor.getInt(i) != 0;
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103387s == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_contextObj = (C49712hj1) new C49712hj1().parseFrom(blob);
                        }
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103388t == hashCode) {
                    try {
                        this.field_isPrivate = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLocalOperation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103389u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C49712hj1 hj12;
        ContentValues contentValues = new ContentValues();
        if (this.f103392d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f103393e) {
            contentValues.put("likeAction", Integer.valueOf(this.field_likeAction));
        }
        if (this.f103394f) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f103395g) {
            if (this.field_showTips) {
                contentValues.put("showTips", 1);
            } else {
                contentValues.put("showTips", 0);
            }
        }
        if (this.f103396h && (hj12 = this.field_contextObj) != null) {
            try {
                contentValues.put("contextObj", hj12.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLocalOperation", e.getMessage());
            }
        }
        if (this.f103397i) {
            if (this.field_isPrivate) {
                contentValues.put("isPrivate", 1);
            } else {
                contentValues.put("isPrivate", 0);
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
            Log.m105920e("MicroMsg.SDK.BaseFinderLocalOperation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLocalOperation ( " + f103390v.sql + ");");
        for (String add : f103382n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLocalOperation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLocalOperation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103390v, "FinderLocalOperation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLocalOperation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLocalOperation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLocalOperation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103390v;
    }

    public String[] getIndexCreateSQL() {
        return f103382n;
    }

    public StorageObserverOwner<C38642q3> getObserverOwner() {
        return f103391w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f103381j;
    }

    public String getTableName() {
        return f103381j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f103392d = true;
            }
        }
        if (contentValues.containsKey("likeAction")) {
            this.field_likeAction = contentValues.getAsInteger("likeAction").intValue();
            if (z) {
                this.f103393e = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103394f = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("showTips")) {
            this.field_showTips = contentValues.getAsInteger("showTips").intValue() != 0;
            if (z) {
                this.f103395g = true;
            }
        }
        if (contentValues.containsKey("contextObj")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("contextObj");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_contextObj = (C49712hj1) new C49712hj1().parseFrom(asByteArray);
                    if (z) {
                        this.f103396h = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLocalOperation", e.getMessage());
            }
        }
        if (contentValues.containsKey("isPrivate")) {
            if (contentValues.getAsInteger("isPrivate").intValue() != 0) {
                z2 = true;
            }
            this.field_isPrivate = z2;
            if (z) {
                this.f103397i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
