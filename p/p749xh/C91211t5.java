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
import te3.C48761au;
import te3.C51662v83;
import te3.C64567n1;
import te3.C90436rm2;
import te3.b55;

/* renamed from: xh.t5 */
public class C91211t5 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f261728A = -1033321759;

    /* renamed from: B */
    public static final int f261729B = -1010580219;

    /* renamed from: C */
    public static final int f261730C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f261731D = initAutoDBInfo(C91211t5.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C91211t5> f261732E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f261733q;

    /* renamed from: r */
    public static final String[] f261734r = new String[0];

    /* renamed from: s */
    public static final int f261735s = 1197524554;

    /* renamed from: t */
    public static final int f261736t = 93028124;

    /* renamed from: u */
    public static final int f261737u = 583187401;

    /* renamed from: v */
    public static final int f261738v = -557656961;

    /* renamed from: w */
    public static final int f261739w = -300893578;

    /* renamed from: x */
    public static final int f261740x = -2033677001;

    /* renamed from: y */
    public static final int f261741y = 91660981;

    /* renamed from: z */
    public static final int f261742z = -1476341629;

    /* renamed from: d */
    public boolean f261743d = true;

    /* renamed from: e */
    public boolean f261744e = true;

    /* renamed from: f */
    public boolean f261745f = true;
    public C64567n1 field_actionsheetInfo;
    public String field_appId;
    public int field_appIdHash;
    public long field_expiredAtTimestampSeconds;
    public b55 field_hostInfo;
    public C48761au field_jsapiInfo;
    public C90436rm2 field_launchAction;
    public String field_opConfig;
    public String field_openId;
    public C51662v83 field_operationInfo;

    /* renamed from: g */
    public boolean f261746g = true;

    /* renamed from: h */
    public boolean f261747h = true;

    /* renamed from: i */
    public boolean f261748i = true;

    /* renamed from: j */
    public boolean f261749j = true;

    /* renamed from: n */
    public boolean f261750n = true;

    /* renamed from: o */
    public boolean f261751o = true;

    /* renamed from: p */
    public boolean f261752p = true;

    static {
        SingleTable singleTable = new SingleTable("LaunchWxaAppRespTable");
        f261733q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appIdHash", "int", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("launchAction", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LaunchAction");
        new Column("jsapiInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.CheckJsApiInfo");
        new Column("hostInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.WxaAppHostInfo");
        new Column("actionsheetInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.ActionSheetInfo");
        new Column("operationInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.OperationInfo");
        new Column("opConfig", "string", singleTable.getName(), "");
        new Column("expiredAtTimestampSeconds", "long", singleTable.getName(), "");
        new Column("openId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appIdHash";
        mAutoDBInfo.colsMap.put("appIdHash", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appIdHash";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "launchAction";
        mAutoDBInfo.colsMap.put("launchAction", "BLOB");
        mAutoDBInfo.columns[3] = "jsapiInfo";
        mAutoDBInfo.colsMap.put("jsapiInfo", "BLOB");
        mAutoDBInfo.columns[4] = "hostInfo";
        mAutoDBInfo.colsMap.put("hostInfo", "BLOB");
        mAutoDBInfo.columns[5] = "actionsheetInfo";
        mAutoDBInfo.colsMap.put("actionsheetInfo", "BLOB");
        mAutoDBInfo.columns[6] = "operationInfo";
        mAutoDBInfo.colsMap.put("operationInfo", "BLOB");
        mAutoDBInfo.columns[7] = "opConfig";
        mAutoDBInfo.colsMap.put("opConfig", "TEXT");
        mAutoDBInfo.columns[8] = "expiredAtTimestampSeconds";
        mAutoDBInfo.colsMap.put("expiredAtTimestampSeconds", "LONG");
        mAutoDBInfo.columns[9] = "openId";
        mAutoDBInfo.colsMap.put("openId", "TEXT");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " appIdHash INTEGER PRIMARY KEY ,  appId TEXT,  launchAction BLOB,  jsapiInfo BLOB,  hostInfo BLOB,  actionsheetInfo BLOB,  operationInfo BLOB,  opConfig TEXT,  expiredAtTimestampSeconds LONG,  openId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91211t5)) {
            return false;
        }
        C91211t5 t5Var = (C91211t5) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_appIdHash), Integer.valueOf(t5Var.field_appIdHash)) && C46238a.m51546a(this.field_appId, t5Var.field_appId) && C46238a.m51546a(this.field_launchAction, t5Var.field_launchAction) && C46238a.m51546a(this.field_jsapiInfo, t5Var.field_jsapiInfo) && C46238a.m51546a(this.field_hostInfo, t5Var.field_hostInfo) && C46238a.m51546a(this.field_actionsheetInfo, t5Var.field_actionsheetInfo) && C46238a.m51546a(this.field_operationInfo, t5Var.field_operationInfo) && C46238a.m51546a(this.field_opConfig, t5Var.field_opConfig) && C46238a.m51546a(Long.valueOf(this.field_expiredAtTimestampSeconds), Long.valueOf(t5Var.field_expiredAtTimestampSeconds)) && C46238a.m51546a(this.field_openId, t5Var.field_openId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261735s == hashCode) {
                    try {
                        this.field_appIdHash = cursor.getInt(i);
                        this.f261743d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261736t == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261737u == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_launchAction = (C90436rm2) new C90436rm2().parseFrom(blob);
                        }
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261738v == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_jsapiInfo = (C48761au) new C48761au().parseFrom(blob2);
                        }
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261739w == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_hostInfo = (b55) new b55().parseFrom(blob3);
                        }
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261740x == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_actionsheetInfo = (C64567n1) new C64567n1().parseFrom(blob4);
                        }
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261741y == hashCode) {
                    try {
                        byte[] blob5 = cursor.getBlob(i);
                        if (blob5 != null && blob5.length > 0) {
                            this.field_operationInfo = (C51662v83) new C51662v83().parseFrom(blob5);
                        }
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261742z == hashCode) {
                    try {
                        this.field_opConfig = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261728A == hashCode) {
                    try {
                        this.field_expiredAtTimestampSeconds = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261729B == hashCode) {
                    try {
                        this.field_openId = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261730C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C51662v83 v832;
        C64567n1 n1Var;
        b55 b55;
        C48761au auVar;
        C90436rm2 rm22;
        ContentValues contentValues = new ContentValues();
        if (this.f261743d) {
            contentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
        }
        if (this.f261744e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f261745f && (rm22 = this.field_launchAction) != null) {
            try {
                contentValues.put("launchAction", rm22.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e.getMessage());
            }
        }
        if (this.f261746g && (auVar = this.field_jsapiInfo) != null) {
            try {
                contentValues.put("jsapiInfo", auVar.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e2.getMessage());
            }
        }
        if (this.f261747h && (b55 = this.field_hostInfo) != null) {
            try {
                contentValues.put("hostInfo", b55.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e3.getMessage());
            }
        }
        if (this.f261748i && (n1Var = this.field_actionsheetInfo) != null) {
            try {
                contentValues.put("actionsheetInfo", n1Var.toByteArray());
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e4.getMessage());
            }
        }
        if (this.f261749j && (v832 = this.field_operationInfo) != null) {
            try {
                contentValues.put("operationInfo", v832.toByteArray());
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e5.getMessage());
            }
        }
        if (this.f261750n) {
            contentValues.put("opConfig", this.field_opConfig);
        }
        if (this.f261751o) {
            contentValues.put("expiredAtTimestampSeconds", Long.valueOf(this.field_expiredAtTimestampSeconds));
        }
        if (this.f261752p) {
            contentValues.put("openId", this.field_openId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LaunchWxaAppRespTable ( " + f261731D.sql + ");");
        for (String add : f261734r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LaunchWxaAppRespTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261731D, "LaunchWxaAppRespTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LaunchWxaAppRespTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261731D;
    }

    public String[] getIndexCreateSQL() {
        return f261734r;
    }

    public StorageObserverOwner<C91211t5> getObserverOwner() {
        return f261732E;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_appIdHash);
    }

    public SingleTable getTable() {
        return f261733q;
    }

    public String getTableName() {
        return f261733q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appIdHash")) {
            this.field_appIdHash = contentValues.getAsInteger("appIdHash").intValue();
            if (z) {
                this.f261743d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f261744e = true;
            }
        }
        if (contentValues.containsKey("launchAction")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("launchAction");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_launchAction = (C90436rm2) new C90436rm2().parseFrom(asByteArray);
                    if (z) {
                        this.f261745f = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e.getMessage());
            }
        }
        if (contentValues.containsKey("jsapiInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("jsapiInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_jsapiInfo = (C48761au) new C48761au().parseFrom(asByteArray2);
                    if (z) {
                        this.f261746g = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e2.getMessage());
            }
        }
        if (contentValues.containsKey("hostInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("hostInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_hostInfo = (b55) new b55().parseFrom(asByteArray3);
                    if (z) {
                        this.f261747h = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e3.getMessage());
            }
        }
        if (contentValues.containsKey("actionsheetInfo")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("actionsheetInfo");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_actionsheetInfo = (C64567n1) new C64567n1().parseFrom(asByteArray4);
                    if (z) {
                        this.f261748i = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e4.getMessage());
            }
        }
        if (contentValues.containsKey("operationInfo")) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray("operationInfo");
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_operationInfo = (C51662v83) new C51662v83().parseFrom(asByteArray5);
                    if (z) {
                        this.f261749j = true;
                    }
                }
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e5.getMessage());
            }
        }
        if (contentValues.containsKey("opConfig")) {
            this.field_opConfig = contentValues.getAsString("opConfig");
            if (z) {
                this.f261750n = true;
            }
        }
        if (contentValues.containsKey("expiredAtTimestampSeconds")) {
            this.field_expiredAtTimestampSeconds = contentValues.getAsLong("expiredAtTimestampSeconds").longValue();
            if (z) {
                this.f261751o = true;
            }
        }
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z) {
                this.f261752p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
