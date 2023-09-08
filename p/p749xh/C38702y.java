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
import te3.C90419io3;

/* renamed from: xh.y */
public class C38702y extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104294f;

    /* renamed from: g */
    public static final String[] f104295g = new String[0];

    /* renamed from: h */
    public static final int f104296h = 93028124;

    /* renamed from: i */
    public static final int f104297i = -1142472212;

    /* renamed from: j */
    public static final int f104298j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104299n = initAutoDBInfo(C38702y.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38702y> f104300o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104301d = true;

    /* renamed from: e */
    public boolean f104302e = true;
    public String field_appId;
    public C90419io3 field_recommendCard;

    static {
        SingleTable singleTable = new SingleTable("AppBrandRecommendCard");
        f104294f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("recommendCard", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.RecommendCard");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "recommendCard";
        mAutoDBInfo.colsMap.put("recommendCard", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  recommendCard BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38702y)) {
            return false;
        }
        C38702y yVar = (C38702y) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, yVar.field_appId) && C46238a.m51546a(this.field_recommendCard, yVar.field_recommendCard);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104296h == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f104301d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandRecommendCard", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104297i == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_recommendCard = (C90419io3) new C90419io3().parseFrom(blob);
                        }
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandRecommendCard", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104298j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C90419io3 io32;
        ContentValues contentValues = new ContentValues();
        if (this.f104301d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104302e && (io32 = this.field_recommendCard) != null) {
            try {
                contentValues.put("recommendCard", io32.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseAppBrandRecommendCard", e.getMessage());
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
            Log.m105920e("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandRecommendCard ( " + f104299n.sql + ");");
        for (String add : f104295g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandRecommendCard", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104299n, "AppBrandRecommendCard", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandRecommendCard", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandRecommendCard", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104299n;
    }

    public String[] getIndexCreateSQL() {
        return f104295g;
    }

    public StorageObserverOwner<C38702y> getObserverOwner() {
        return f104300o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f104294f;
    }

    public String getTableName() {
        return f104294f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104301d = true;
            }
        }
        if (contentValues.containsKey("recommendCard")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("recommendCard");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_recommendCard = (C90419io3) new C90419io3().parseFrom(asByteArray);
                    if (z) {
                        this.f104302e = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseAppBrandRecommendCard", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
