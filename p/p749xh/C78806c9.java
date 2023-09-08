package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
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
import te3.hh4;

/* renamed from: xh.c9 */
public class C78806c9 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f230584h;

    /* renamed from: i */
    public static final Column f230585i;

    /* renamed from: j */
    public static final String[] f230586j = {"CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_chatRoomName_index ON TopMsgInfoRecord(chatRoomName)", "CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_id_index ON TopMsgInfoRecord(id)"};

    /* renamed from: n */
    public static final int f230587n = 787786110;

    /* renamed from: o */
    public static final int f230588o = 3355;

    /* renamed from: p */
    public static final int f230589p = -693690300;

    /* renamed from: q */
    public static final int f230590q = 1556641517;

    /* renamed from: r */
    public static final int f230591r = 108705909;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f230592s = initAutoDBInfo(C78806c9.class);

    /* renamed from: t */
    public static final StorageObserverOwner<C78806c9> f230593t = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f230594d = false;

    /* renamed from: e */
    public boolean f230595e = false;

    /* renamed from: f */
    public boolean f230596f = false;
    private String field_chatRoomName;
    private int field_id;
    private boolean field_isCancel;
    private hh4 field_topMsgInfoItem;

    /* renamed from: g */
    public boolean f230597g = false;

    static {
        SingleTable singleTable = new SingleTable("TopMsgInfoRecord");
        f230584h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f230585i = new Column("chatRoomName", "string", singleTable.getName(), "");
        new Column("id", "int", singleTable.getName(), "");
        new Column("isCancel", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("topMsgInfoItem", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.TopMsgInfoItem");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TopMsgInfoRecord ( " + f230592s.sql + ");");
        for (String add : f230586j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TopMsgInfoRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230592s, "TopMsgInfoRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTopMsgInfoRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TopMsgInfoRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chatRoomName";
        mAutoDBInfo.colsMap.put("chatRoomName", "TEXT");
        mAutoDBInfo.columns[1] = "id";
        mAutoDBInfo.colsMap.put("id", "INTEGER");
        mAutoDBInfo.columns[2] = "isCancel";
        mAutoDBInfo.colsMap.put("isCancel", "INTEGER default 'false' ");
        mAutoDBInfo.columns[3] = "topMsgInfoItem";
        mAutoDBInfo.colsMap.put("topMsgInfoItem", "BLOB");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " chatRoomName TEXT,  id INTEGER,  isCancel INTEGER default 'false' ,  topMsgInfoItem BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78806c9)) {
            return false;
        }
        C78806c9 c9Var = (C78806c9) iAutoDBItem;
        return C46238a.m51546a(this.field_chatRoomName, c9Var.field_chatRoomName) && C46238a.m51546a(Integer.valueOf(this.field_id), Integer.valueOf(c9Var.field_id)) && C46238a.m51546a(Boolean.valueOf(this.field_isCancel), Boolean.valueOf(c9Var.field_isCancel)) && C46238a.m51546a(this.field_topMsgInfoItem, c9Var.field_topMsgInfoItem);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230587n == hashCode) {
                    try {
                        this.field_chatRoomName = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230588o == hashCode) {
                    try {
                        this.field_id = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230589p == hashCode) {
                    try {
                        this.field_isCancel = cursor.getInt(i) != 0;
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230590q == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_topMsgInfoItem = (hh4) new hh4().parseFrom(blob);
                        }
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTopMsgInfoRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230591r == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        hh4 hh4;
        ContentValues contentValues = new ContentValues();
        if (this.f230594d) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f230595e) {
            contentValues.put("id", Integer.valueOf(this.field_id));
        }
        if (this.f230596f) {
            if (this.field_isCancel) {
                contentValues.put("isCancel", 1);
            } else {
                contentValues.put("isCancel", 0);
            }
        }
        if (this.f230597g && (hh4 = this.field_topMsgInfoItem) != null) {
            try {
                contentValues.put("topMsgInfoItem", hh4.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseTopMsgInfoRecord", e.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public int deleteFromDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        DeleteExecutor deleteExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getDELETE(), String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            storageObserverEvent.setObj(this);
            deleteExecutor = new DeleteExecutor(this, storageObserverEvent, f230593t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            deleteExecutor = new DeleteExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return deleteExecutor.execute(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230592s;
    }

    public int getId() {
        return this.field_id;
    }

    public String[] getIndexCreateSQL() {
        return f230586j;
    }

    public StorageObserverOwner<C78806c9> getObserverOwner() {
        return f230593t;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f230584h;
    }

    public String getTableName() {
        return f230584h.getName();
    }

    /* renamed from: l2 */
    public String mo108714l2() {
        return this.field_chatRoomName;
    }

    /* renamed from: m2 */
    public boolean mo108715m2() {
        return this.field_isCancel;
    }

    /* renamed from: n2 */
    public final hh4 mo108716n2() {
        return this.field_topMsgInfoItem;
    }

    /* renamed from: o2 */
    public void mo108717o2(String str) {
        this.field_chatRoomName = str;
        this.f230594d = true;
    }

    /* renamed from: p2 */
    public void mo108718p2(int i) {
        this.field_id = i;
        this.f230595e = true;
    }

    /* renamed from: q2 */
    public void mo108719q2(boolean z) {
        this.field_isCancel = z;
        this.f230596f = true;
    }

    /* renamed from: r2 */
    public final void mo108720r2(hh4 hh4) {
        this.field_topMsgInfoItem = hh4;
        this.f230597g = true;
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        UpdateExecutor updateExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            storageObserverEvent.setObj(this);
            updateExecutor = new UpdateExecutor(this, storageObserverEvent, f230593t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            updateExecutor = new UpdateExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return updateExecutor.execute(iSQLiteDatabase);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z) {
                this.f230594d = true;
            }
        }
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsInteger("id").intValue();
            if (z) {
                this.f230595e = true;
            }
        }
        if (contentValues.containsKey("isCancel")) {
            this.field_isCancel = contentValues.getAsInteger("isCancel").intValue() != 0;
            if (z) {
                this.f230596f = true;
            }
        }
        if (contentValues.containsKey("topMsgInfoItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("topMsgInfoItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_topMsgInfoItem = (hh4) new hh4().parseFrom(asByteArray);
                    if (z) {
                        this.f230597g = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseTopMsgInfoRecord", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
