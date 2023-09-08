package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.BatchInsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import te3.C50271lj0;
import te3.C64267br2;
import te3.C64447ih1;
import te3.C64532lq2;
import te3.C64736tq2;

/* renamed from: xh.f3 */
public class C66261f3 extends IAutoDBItem {
    public static final Column CLIPLIST;
    public static final String COL_CLIPLIST = "clipList";
    public static final String COL_CREATETIME = "createTime";
    public static final String COL_CUSTOMDATA = "customData";
    public static final String COL_FINDEROBJECT = "finderObject";
    public static final String COL_HALFMEDIAEXTLIST = "halfMediaExtList";
    public static final String COL_ID = "id";
    public static final String COL_LOCALFLAG = "localFlag";
    public static final String COL_LOCALID = "localId";
    public static final String COL_LONGVIDEOMEDIAEXTLIST = "longVideoMediaExtList";
    public static final String COL_MEDIAEXTLIST = "mediaExtList";
    public static final String COL_POSTEXTRADATA = "postExtraData";
    public static final String COL_POSTINFO = "postinfo";
    public static final String COL_REPORTOBJECT = "reportObject";
    public static final String COL_SOURCEFLAG = "sourceFlag";
    public static final String COL_UPDATETIME = "updateTime";
    public static final String COL_USERNAME = "username";
    public static final String COL_WATERMARKFLAG = "watermarkFlag";
    public static final Column CREATETIME;
    public static final Column CUSTOMDATA;
    public static final IAutoDBItem.MAutoDBInfo DB_INFO = initAutoDBInfo(C66261f3.class);
    public static final Column FINDEROBJECT;
    public static final Column HALFMEDIAEXTLIST;

    /* renamed from: ID */
    public static final Column f190567ID;
    public static final String[] INDEX_CREATE = {"CREATE INDEX IF NOT EXISTS FinderFeedItem_local_index ON FinderFeedItem(localId)", "CREATE INDEX IF NOT EXISTS FinderFeedItem_Id ON FinderFeedItem(id)", "CREATE INDEX IF NOT EXISTS FinderFeedItem_create_time ON FinderFeedItem(createTime)", "CREATE INDEX IF NOT EXISTS FinderFeedItem__Local_Flag ON FinderFeedItem(localFlag)"};
    public static final Column LOCALFLAG;
    public static final Column LOCALID;
    public static final Column LONGVIDEOMEDIAEXTLIST;
    public static final Column MEDIAEXTLIST;
    public static final StorageObserverOwner<C66261f3> OBSERVER_OWNER = new StorageObserverOwner<>();
    public static final Column POSTEXTRADATA;
    public static final Column POSTINFO;
    public static final Column REPORTOBJECT;
    public static final Column ROWID;
    public static final Column SOURCEFLAG;
    public static final SingleTable TABLE;
    public static final String TABLE_NAME = "FinderFeedItem";
    private static final String TAG_ = "MicroMsg.SDK.BaseFinderFeedItem";
    public static final Column UPDATETIME;
    public static final Column USERNAME;
    public static final Column WATERMARKFLAG;
    private static final int clipList_HASHCODE = 917544974;
    private static final int createTime_HASHCODE = 1369213417;
    private static final int customData_HASHCODE = -1582182725;
    private static final int finderObject_HASHCODE = 463590149;
    private static final int halfMediaExtList_HASHCODE = -1102948946;
    private static final int id_HASHCODE = 3355;
    private static final int localFlag_HASHCODE = -1205623433;
    private static final int localId_HASHCODE = 338409958;
    private static final int longVideoMediaExtList_HASHCODE = 832388826;
    private static final int mediaExtList_HASHCODE = -1286867493;
    private static final int postExtraData_HASHCODE = -1414616294;
    private static final int postinfo_HASHCODE = 757640526;
    private static final int reportObject_HASHCODE = 472001939;
    private static final int rowid_HASHCODE = 108705909;
    private static final int sourceFlag_HASHCODE = -1111861721;
    private static final int updateTime_HASHCODE = -295931082;
    private static final int username_HASHCODE = -265713450;
    private static final int watermarkFlag_HASHCODE = -1225389584;
    private boolean __hadSetclipList = true;
    private boolean __hadSetcreateTime = true;
    private boolean __hadSetcustomData = true;
    private boolean __hadSetfinderObject = true;
    private boolean __hadSethalfMediaExtList = true;
    private boolean __hadSetid = true;
    private boolean __hadSetlocalFlag = true;
    private boolean __hadSetlocalId = true;
    private boolean __hadSetlongVideoMediaExtList = true;
    private boolean __hadSetmediaExtList = true;
    private boolean __hadSetpostExtraData = true;
    private boolean __hadSetpostinfo = true;
    private boolean __hadSetreportObject = true;
    private boolean __hadSetsourceFlag = true;
    private boolean __hadSetupdateTime = true;
    private boolean __hadSetusername = true;
    private boolean __hadSetwatermarkFlag = true;
    public C64532lq2 field_clipList;
    public long field_createTime;
    public C50271lj0 field_customData;
    public FinderObject field_finderObject;
    public C64267br2 field_halfMediaExtList;
    public long field_id;
    public int field_localFlag;
    public long field_localId;
    public C64267br2 field_longVideoMediaExtList;
    public C64267br2 field_mediaExtList;
    public C64447ih1 field_postExtraData;
    public C64736tq2 field_postinfo;
    public FinderFeedReportObject field_reportObject;
    public int field_sourceFlag;
    public long field_updateTime;
    public String field_username;
    public int field_watermarkFlag;

    /* renamed from: xh.f3$a */
    public static class C66262a {
        public C66262a() {
            new ContentValues();
        }
    }

    /* renamed from: xh.f3$b */
    public static class C66263b {
    }

    /* renamed from: xh.f3$c */
    public static class C66264c {

        /* renamed from: a */
        public List<Column> f190568a = new LinkedList();

        /* renamed from: b */
        public ISqlCondition f190569b;

        /* renamed from: c */
        public List<ISqlOrder> f190570c = new LinkedList();

        /* renamed from: d */
        public List<Column> f190571d = new LinkedList();

        /* renamed from: a */
        public final SelectSql mo90363a() {
            return C66261f3.TABLE.select((List<? extends ISqlColumn>) this.f190568a).where(this.f190569b).orderBy((List<? extends ISqlOrder>) this.f190570c).groupBy((List<? extends Column>) this.f190571d).build();
        }
    }

    /* renamed from: xh.f3$d */
    public static class C66265d {
        public C66265d() {
            new ContentValues();
        }
    }

    static {
        SingleTable singleTable = new SingleTable(TABLE_NAME);
        TABLE = singleTable;
        ROWID = new Column("rowid", "long", singleTable.getName(), "");
        LOCALID = new Column(COL_LOCALID, "long", singleTable.getName(), "");
        f190567ID = new Column("id", "long", singleTable.getName(), "");
        CREATETIME = new Column("createTime", "long", singleTable.getName(), "");
        USERNAME = new Column("username", "string", singleTable.getName(), "");
        SOURCEFLAG = new Column(COL_SOURCEFLAG, "int", singleTable.getName(), "");
        UPDATETIME = new Column(COL_UPDATETIME, "long", singleTable.getName(), "");
        FINDEROBJECT = new Column(COL_FINDEROBJECT, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderObject");
        LOCALFLAG = new Column("localFlag", "int", singleTable.getName(), "");
        POSTINFO = new Column(COL_POSTINFO, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalFinderPostInfo");
        MEDIAEXTLIST = new Column(COL_MEDIAEXTLIST, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        REPORTOBJECT = new Column(COL_REPORTOBJECT, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderFeedReportObject");
        POSTEXTRADATA = new Column(COL_POSTEXTRADATA, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderPostExtra");
        CUSTOMDATA = new Column(COL_CUSTOMDATA, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderCustomFeedData");
        LONGVIDEOMEDIAEXTLIST = new Column(COL_LONGVIDEOMEDIAEXTLIST, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        HALFMEDIAEXTLIST = new Column(COL_HALFMEDIAEXTLIST, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalMediaListExt");
        CLIPLIST = new Column(COL_CLIPLIST, TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalClipListExt");
        WATERMARKFLAG = new Column(COL_WATERMARKFLAG, "int", singleTable.getName(), "");
    }

    public static final BatchInsertExecutor batchInsert(List<C66261f3> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C66261f3 next : list) {
            if (z) {
                arrayList.add(new InsertExecutor(next, true, next.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new InsertExecutor(next, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_));
            }
        }
        return new BatchInsertExecutor(arrayList);
    }

    private final void buildBuff() {
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e(TAG_, "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(getCreateSQLs());
        for (String add : INDEX_CREATE) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i(TAG_, "createTableSql %s", str);
            iSQLiteDatabase.execSQL(TABLE_NAME, str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(DB_INFO, TABLE_NAME, iSQLiteDatabase)) {
            Log.m105925i(TAG_, "updateTableSql %s", next);
            iSQLiteDatabase.execSQL(TABLE_NAME, next);
        }
        Log.m105925i(TAG_, "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static final C66262a cvBuilder() {
        return new C66262a();
    }

    public static final C66263b delete() {
        return new C66263b();
    }

    private static String getCreateSQLs() {
        return "CREATE TABLE IF NOT EXISTS FinderFeedItem ( " + DB_INFO.sql + ");";
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[17];
        String[] strArr = new String[18];
        mAutoDBInfo.columns = strArr;
        strArr[0] = COL_LOCALID;
        mAutoDBInfo.colsMap.put(COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = COL_LOCALID;
        mAutoDBInfo.columns[1] = "id";
        mAutoDBInfo.colsMap.put("id", "LONG");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[3] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[4] = COL_SOURCEFLAG;
        mAutoDBInfo.colsMap.put(COL_SOURCEFLAG, "INTEGER");
        mAutoDBInfo.columns[5] = COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = COL_FINDEROBJECT;
        mAutoDBInfo.colsMap.put(COL_FINDEROBJECT, "BLOB");
        mAutoDBInfo.columns[7] = "localFlag";
        mAutoDBInfo.colsMap.put("localFlag", "INTEGER");
        mAutoDBInfo.columns[8] = COL_POSTINFO;
        mAutoDBInfo.colsMap.put(COL_POSTINFO, "BLOB");
        mAutoDBInfo.columns[9] = COL_MEDIAEXTLIST;
        mAutoDBInfo.colsMap.put(COL_MEDIAEXTLIST, "BLOB");
        mAutoDBInfo.columns[10] = COL_REPORTOBJECT;
        mAutoDBInfo.colsMap.put(COL_REPORTOBJECT, "BLOB");
        mAutoDBInfo.columns[11] = COL_POSTEXTRADATA;
        mAutoDBInfo.colsMap.put(COL_POSTEXTRADATA, "BLOB");
        mAutoDBInfo.columns[12] = COL_CUSTOMDATA;
        mAutoDBInfo.colsMap.put(COL_CUSTOMDATA, "BLOB");
        mAutoDBInfo.columns[13] = COL_LONGVIDEOMEDIAEXTLIST;
        mAutoDBInfo.colsMap.put(COL_LONGVIDEOMEDIAEXTLIST, "BLOB");
        mAutoDBInfo.columns[14] = COL_HALFMEDIAEXTLIST;
        mAutoDBInfo.colsMap.put(COL_HALFMEDIAEXTLIST, "BLOB");
        mAutoDBInfo.columns[15] = COL_CLIPLIST;
        mAutoDBInfo.colsMap.put(COL_CLIPLIST, "BLOB");
        mAutoDBInfo.columns[16] = COL_WATERMARKFLAG;
        mAutoDBInfo.colsMap.put(COL_WATERMARKFLAG, "INTEGER");
        mAutoDBInfo.columns[17] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  id LONG,  createTime LONG,  username TEXT,  sourceFlag INTEGER,  updateTime LONG,  finderObject BLOB,  localFlag INTEGER,  postinfo BLOB,  mediaExtList BLOB,  reportObject BLOB,  postExtraData BLOB,  customData BLOB,  longVideoMediaExtList BLOB,  halfMediaExtList BLOB,  clipList BLOB,  watermarkFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public static final InsertExecutor insert(C66261f3 f3Var, boolean z) {
        if (!z) {
            return new InsertExecutor(f3Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(f3Var, true, f3Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final InsertExecutor insertOrThrow(C66261f3 f3Var, boolean z) {
        if (!z) {
            return new InsertExecutor(f3Var, false, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(f3Var, false, f3Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final SelectSql isExistByLocalId(long j) {
        SingleTable singleTable = TABLE;
        Column column = LOCALID;
        return singleTable.select(column).where(column.equal((Number) Long.valueOf(j))).log(TAG_).limit(1, 0).build();
    }

    public static final void observe(C0125s sVar, IStorageObserver<? extends C66261f3> iStorageObserver) {
        OBSERVER_OWNER.observe(sVar, iStorageObserver);
    }

    private final void parseBuff() {
    }

    public static final void removeObserve(IStorageObserver<? extends C66261f3> iStorageObserver) {
        OBSERVER_OWNER.removeObserver(iStorageObserver);
    }

    public static final ReplaceExecutor replace(C66261f3 f3Var, boolean z) {
        return z ? new ReplaceExecutor(f3Var, f3Var.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new ReplaceExecutor(f3Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final C66264c select() {
        return new C66264c();
    }

    public static final SelectSql selectByCreateTime(long j) {
        return TABLE.selectAll().where(CREATETIME.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectByCreateTimeList(List<Long> list) {
        return TABLE.selectAll().where(CREATETIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectById(long j) {
        return TABLE.selectAll().where(f190567ID.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectByIdList(List<Long> list) {
        return TABLE.selectAll().where(f190567ID.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByLocalFlag(int i) {
        return TABLE.selectAll().where(LOCALFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByLocalFlagList(List<Integer> list) {
        return TABLE.selectAll().where(LOCALFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByLocalId(long j) {
        return TABLE.selectAll().where(LOCALID.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectByLocalIdList(List<Long> list) {
        return TABLE.selectAll().where(LOCALID.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectBySourceFlag(int i) {
        return TABLE.selectAll().where(SOURCEFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectBySourceFlagList(List<Integer> list) {
        return TABLE.selectAll().where(SOURCEFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByUpdateTime(long j) {
        return TABLE.selectAll().where(UPDATETIME.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectByUpdateTimeList(List<Long> list) {
        return TABLE.selectAll().where(UPDATETIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByUsername(String str) {
        return TABLE.selectAll().where(USERNAME.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByUsernameList(List<String> list) {
        return TABLE.selectAll().where(USERNAME.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectByWatermarkFlag(int i) {
        return TABLE.selectAll().where(WATERMARKFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByWatermarkFlagList(List<Integer> list) {
        return TABLE.selectAll().where(WATERMARKFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final long selectCreateTimeByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(CREATETIME);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_createTime;
        }
        return 0;
    }

    public static final SelectSql selectExistListByLocalId(List<Long> list) {
        SingleTable singleTable = TABLE;
        Column column = LOCALID;
        return singleTable.select(column).where(column.inNumber(list)).log(TAG_).build();
    }

    public static final long selectIdByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(f190567ID);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_id;
        }
        return 0;
    }

    public static final int selectLocalFlagByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(LOCALFLAG);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_localFlag;
        }
        return 0;
    }

    public static final int selectSourceFlagByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(SOURCEFLAG);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_sourceFlag;
        }
        return 0;
    }

    public static final long selectUpdateTimeByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(UPDATETIME);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_updateTime;
        }
        return 0;
    }

    public static final String selectUsernameByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(USERNAME);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_username;
        }
        return null;
    }

    public static final int selectWatermarkFlagByLocalId(ISQLiteDatabase iSQLiteDatabase, long j) {
        C66264c select = select();
        ((LinkedList) select.f190568a).add(WATERMARKFLAG);
        select.f190569b = LOCALID.equal((Number) Long.valueOf(j));
        C66261f3 f3Var = (C66261f3) select.mo90363a().singleQuery(iSQLiteDatabase, C66261f3.class);
        if (f3Var != null) {
            return f3Var.field_watermarkFlag;
        }
        return 0;
    }

    public static final C66265d update() {
        return new C66265d();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66261f3)) {
            return false;
        }
        C66261f3 f3Var = (C66261f3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(f3Var.field_localId)) && C46238a.m51546a(Long.valueOf(this.field_id), Long.valueOf(f3Var.field_id)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(f3Var.field_createTime)) && C46238a.m51546a(this.field_username, f3Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_sourceFlag), Integer.valueOf(f3Var.field_sourceFlag)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(f3Var.field_updateTime)) && C46238a.m51546a(this.field_finderObject, f3Var.field_finderObject) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(f3Var.field_localFlag)) && C46238a.m51546a(this.field_postinfo, f3Var.field_postinfo) && C46238a.m51546a(this.field_mediaExtList, f3Var.field_mediaExtList) && C46238a.m51546a(this.field_reportObject, f3Var.field_reportObject) && C46238a.m51546a(this.field_postExtraData, f3Var.field_postExtraData) && C46238a.m51546a(this.field_customData, f3Var.field_customData) && C46238a.m51546a(this.field_longVideoMediaExtList, f3Var.field_longVideoMediaExtList) && C46238a.m51546a(this.field_halfMediaExtList, f3Var.field_halfMediaExtList) && C46238a.m51546a(this.field_clipList, f3Var.field_clipList) && C46238a.m51546a(Integer.valueOf(this.field_watermarkFlag), Integer.valueOf(f3Var.field_watermarkFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (localId_HASHCODE == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.__hadSetlocalId = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace(TAG_, th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (id_HASHCODE == hashCode) {
                    try {
                        this.field_id = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace(TAG_, th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (createTime_HASHCODE == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace(TAG_, th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (username_HASHCODE == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace(TAG_, th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (sourceFlag_HASHCODE == hashCode) {
                    try {
                        this.field_sourceFlag = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace(TAG_, th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (updateTime_HASHCODE == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace(TAG_, th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (finderObject_HASHCODE == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_finderObject = (FinderObject) new FinderObject().parseFrom(blob);
                        }
                    } catch (Throwable th9) {
                        Log.printErrStackTrace(TAG_, th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (localFlag_HASHCODE == hashCode) {
                    try {
                        this.field_localFlag = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace(TAG_, th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (postinfo_HASHCODE == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_postinfo = (C64736tq2) new C64736tq2().parseFrom(blob2);
                        }
                    } catch (Throwable th11) {
                        Log.printErrStackTrace(TAG_, th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (mediaExtList_HASHCODE == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_mediaExtList = (C64267br2) new C64267br2().parseFrom(blob3);
                        }
                    } catch (Throwable th12) {
                        Log.printErrStackTrace(TAG_, th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (reportObject_HASHCODE == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_reportObject = (FinderFeedReportObject) new FinderFeedReportObject().parseFrom(blob4);
                        }
                    } catch (Throwable th13) {
                        Log.printErrStackTrace(TAG_, th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (postExtraData_HASHCODE == hashCode) {
                    try {
                        byte[] blob5 = cursor.getBlob(i);
                        if (blob5 != null && blob5.length > 0) {
                            this.field_postExtraData = (C64447ih1) new C64447ih1().parseFrom(blob5);
                        }
                    } catch (Throwable th14) {
                        Log.printErrStackTrace(TAG_, th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (customData_HASHCODE == hashCode) {
                    try {
                        byte[] blob6 = cursor.getBlob(i);
                        if (blob6 != null && blob6.length > 0) {
                            this.field_customData = (C50271lj0) new C50271lj0().parseFrom(blob6);
                        }
                    } catch (Throwable th15) {
                        Log.printErrStackTrace(TAG_, th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (longVideoMediaExtList_HASHCODE == hashCode) {
                    try {
                        byte[] blob7 = cursor.getBlob(i);
                        if (blob7 != null && blob7.length > 0) {
                            this.field_longVideoMediaExtList = (C64267br2) new C64267br2().parseFrom(blob7);
                        }
                    } catch (Throwable th16) {
                        Log.printErrStackTrace(TAG_, th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (halfMediaExtList_HASHCODE == hashCode) {
                    try {
                        byte[] blob8 = cursor.getBlob(i);
                        if (blob8 != null && blob8.length > 0) {
                            this.field_halfMediaExtList = (C64267br2) new C64267br2().parseFrom(blob8);
                        }
                    } catch (Throwable th17) {
                        Log.printErrStackTrace(TAG_, th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (clipList_HASHCODE == hashCode) {
                    try {
                        byte[] blob9 = cursor.getBlob(i);
                        if (blob9 != null && blob9.length > 0) {
                            this.field_clipList = (C64532lq2) new C64532lq2().parseFrom(blob9);
                        }
                    } catch (Throwable th18) {
                        Log.printErrStackTrace(TAG_, th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (watermarkFlag_HASHCODE == hashCode) {
                    try {
                        this.field_watermarkFlag = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace(TAG_, th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (rowid_HASHCODE == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64532lq2 lq22;
        C64267br2 br22;
        C64267br2 br23;
        C50271lj0 lj02;
        C64447ih1 ih12;
        FinderFeedReportObject finderFeedReportObject;
        C64267br2 br24;
        C64736tq2 tq22;
        FinderObject finderObject;
        buildBuff();
        ContentValues contentValues = new ContentValues();
        if (this.__hadSetlocalId) {
            contentValues.put(COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.__hadSetid) {
            contentValues.put("id", Long.valueOf(this.field_id));
        }
        if (this.__hadSetcreateTime) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.__hadSetusername) {
            contentValues.put("username", this.field_username);
        }
        if (this.__hadSetsourceFlag) {
            contentValues.put(COL_SOURCEFLAG, Integer.valueOf(this.field_sourceFlag));
        }
        if (this.__hadSetupdateTime) {
            contentValues.put(COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.__hadSetfinderObject && (finderObject = this.field_finderObject) != null) {
            try {
                contentValues.put(COL_FINDEROBJECT, finderObject.toByteArray());
            } catch (IOException e) {
                Log.m105920e(TAG_, e.getMessage());
            }
        }
        if (this.__hadSetlocalFlag) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.__hadSetpostinfo && (tq22 = this.field_postinfo) != null) {
            try {
                contentValues.put(COL_POSTINFO, tq22.toByteArray());
            } catch (IOException e2) {
                Log.m105920e(TAG_, e2.getMessage());
            }
        }
        if (this.__hadSetmediaExtList && (br24 = this.field_mediaExtList) != null) {
            try {
                contentValues.put(COL_MEDIAEXTLIST, br24.toByteArray());
            } catch (IOException e3) {
                Log.m105920e(TAG_, e3.getMessage());
            }
        }
        if (this.__hadSetreportObject && (finderFeedReportObject = this.field_reportObject) != null) {
            try {
                contentValues.put(COL_REPORTOBJECT, finderFeedReportObject.toByteArray());
            } catch (IOException e4) {
                Log.m105920e(TAG_, e4.getMessage());
            }
        }
        if (this.__hadSetpostExtraData && (ih12 = this.field_postExtraData) != null) {
            try {
                contentValues.put(COL_POSTEXTRADATA, ih12.toByteArray());
            } catch (IOException e5) {
                Log.m105920e(TAG_, e5.getMessage());
            }
        }
        if (this.__hadSetcustomData && (lj02 = this.field_customData) != null) {
            try {
                contentValues.put(COL_CUSTOMDATA, lj02.toByteArray());
            } catch (IOException e6) {
                Log.m105920e(TAG_, e6.getMessage());
            }
        }
        if (this.__hadSetlongVideoMediaExtList && (br23 = this.field_longVideoMediaExtList) != null) {
            try {
                contentValues.put(COL_LONGVIDEOMEDIAEXTLIST, br23.toByteArray());
            } catch (IOException e7) {
                Log.m105920e(TAG_, e7.getMessage());
            }
        }
        if (this.__hadSethalfMediaExtList && (br22 = this.field_halfMediaExtList) != null) {
            try {
                contentValues.put(COL_HALFMEDIAEXTLIST, br22.toByteArray());
            } catch (IOException e8) {
                Log.m105920e(TAG_, e8.getMessage());
            }
        }
        if (this.__hadSetclipList && (lq22 = this.field_clipList) != null) {
            try {
                contentValues.put(COL_CLIPLIST, lq22.toByteArray());
            } catch (IOException e9) {
                Log.m105920e(TAG_, e9.getMessage());
            }
        }
        if (this.__hadSetwatermarkFlag) {
            contentValues.put(COL_WATERMARKFLAG, Integer.valueOf(this.field_watermarkFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public StorageObserverEvent<? extends C66261f3> createDeleteEvent() {
        StorageObserverEvent<? extends C66261f3> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getDELETE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C66261f3> createInsertEvent() {
        StorageObserverEvent<? extends C66261f3> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getINSERT(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public StorageObserverEvent<? extends C66261f3> createReplaceEvent() {
        StorageObserverEvent<? extends C66261f3> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C66261f3> createUpdateEvent() {
        StorageObserverEvent<? extends C66261f3> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public int deleteFromDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return delete(this, z).execute(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return DB_INFO;
    }

    public String[] getIndexCreateSQL() {
        return INDEX_CREATE;
    }

    public StorageObserverOwner<C66261f3> getObserverOwner() {
        return OBSERVER_OWNER;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return TABLE;
    }

    public String getTableName() {
        return TABLE.getName();
    }

    public long insertOrThrowToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insertOrThrow(this, z).execute(iSQLiteDatabase);
    }

    public long insertToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insert(this, z).execute(iSQLiteDatabase);
    }

    public boolean isExistByLocalIdInDB(ISQLiteDatabase iSQLiteDatabase) {
        return isExistByLocalId(this.field_localId).isExist(iSQLiteDatabase);
    }

    public long replaceToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return replace(this, z).execute(iSQLiteDatabase);
    }

    public void reset() {
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return update(this, z).execute(iSQLiteDatabase);
    }

    public static final DeleteExecutor delete(C66261f3 f3Var, boolean z) {
        if (z) {
            return new DeleteExecutor(f3Var, f3Var.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new DeleteExecutor(f3Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final UpdateExecutor update(C66261f3 f3Var, boolean z) {
        if (z) {
            return new UpdateExecutor(f3Var, f3Var.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new UpdateExecutor(f3Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public SelectSql selectByCreateTime() {
        return selectByCreateTime(this.field_createTime);
    }

    public SelectSql selectById() {
        return selectById(this.field_id);
    }

    public SelectSql selectByLocalFlag() {
        return selectByLocalFlag(this.field_localFlag);
    }

    public SelectSql selectByLocalId() {
        return selectByLocalId(this.field_localId);
    }

    public SelectSql selectBySourceFlag() {
        return selectBySourceFlag(this.field_sourceFlag);
    }

    public SelectSql selectByUpdateTime() {
        return selectByUpdateTime(this.field_updateTime);
    }

    public SelectSql selectByUsername() {
        return selectByUsername(this.field_username);
    }

    public SelectSql selectByWatermarkFlag() {
        return selectByWatermarkFlag(this.field_watermarkFlag);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(COL_LOCALID).longValue();
            if (z) {
                this.__hadSetlocalId = true;
            }
        }
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsLong("id").longValue();
            if (z) {
                this.__hadSetid = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.__hadSetcreateTime = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.__hadSetusername = true;
            }
        }
        if (contentValues.containsKey(COL_SOURCEFLAG)) {
            this.field_sourceFlag = contentValues.getAsInteger(COL_SOURCEFLAG).intValue();
            if (z) {
                this.__hadSetsourceFlag = true;
            }
        }
        if (contentValues.containsKey(COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(COL_UPDATETIME).longValue();
            if (z) {
                this.__hadSetupdateTime = true;
            }
        }
        if (contentValues.containsKey(COL_FINDEROBJECT)) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray(COL_FINDEROBJECT);
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_finderObject = (FinderObject) new FinderObject().parseFrom(asByteArray);
                    if (z) {
                        this.__hadSetfinderObject = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e(TAG_, e.getMessage());
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z) {
                this.__hadSetlocalFlag = true;
            }
        }
        if (contentValues.containsKey(COL_POSTINFO)) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray(COL_POSTINFO);
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_postinfo = (C64736tq2) new C64736tq2().parseFrom(asByteArray2);
                    if (z) {
                        this.__hadSetpostinfo = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e(TAG_, e2.getMessage());
            }
        }
        if (contentValues.containsKey(COL_MEDIAEXTLIST)) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray(COL_MEDIAEXTLIST);
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_mediaExtList = (C64267br2) new C64267br2().parseFrom(asByteArray3);
                    if (z) {
                        this.__hadSetmediaExtList = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e(TAG_, e3.getMessage());
            }
        }
        if (contentValues.containsKey(COL_REPORTOBJECT)) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray(COL_REPORTOBJECT);
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_reportObject = (FinderFeedReportObject) new FinderFeedReportObject().parseFrom(asByteArray4);
                    if (z) {
                        this.__hadSetreportObject = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e(TAG_, e4.getMessage());
            }
        }
        if (contentValues.containsKey(COL_POSTEXTRADATA)) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray(COL_POSTEXTRADATA);
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_postExtraData = (C64447ih1) new C64447ih1().parseFrom(asByteArray5);
                    if (z) {
                        this.__hadSetpostExtraData = true;
                    }
                }
            } catch (IOException e5) {
                Log.m105920e(TAG_, e5.getMessage());
            }
        }
        if (contentValues.containsKey(COL_CUSTOMDATA)) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray(COL_CUSTOMDATA);
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.field_customData = (C50271lj0) new C50271lj0().parseFrom(asByteArray6);
                    if (z) {
                        this.__hadSetcustomData = true;
                    }
                }
            } catch (IOException e6) {
                Log.m105920e(TAG_, e6.getMessage());
            }
        }
        if (contentValues.containsKey(COL_LONGVIDEOMEDIAEXTLIST)) {
            try {
                byte[] asByteArray7 = contentValues.getAsByteArray(COL_LONGVIDEOMEDIAEXTLIST);
                if (asByteArray7 != null && asByteArray7.length > 0) {
                    this.field_longVideoMediaExtList = (C64267br2) new C64267br2().parseFrom(asByteArray7);
                    if (z) {
                        this.__hadSetlongVideoMediaExtList = true;
                    }
                }
            } catch (IOException e7) {
                Log.m105920e(TAG_, e7.getMessage());
            }
        }
        if (contentValues.containsKey(COL_HALFMEDIAEXTLIST)) {
            try {
                byte[] asByteArray8 = contentValues.getAsByteArray(COL_HALFMEDIAEXTLIST);
                if (asByteArray8 != null && asByteArray8.length > 0) {
                    this.field_halfMediaExtList = (C64267br2) new C64267br2().parseFrom(asByteArray8);
                    if (z) {
                        this.__hadSethalfMediaExtList = true;
                    }
                }
            } catch (IOException e8) {
                Log.m105920e(TAG_, e8.getMessage());
            }
        }
        if (contentValues.containsKey(COL_CLIPLIST)) {
            try {
                byte[] asByteArray9 = contentValues.getAsByteArray(COL_CLIPLIST);
                if (asByteArray9 != null && asByteArray9.length > 0) {
                    this.field_clipList = (C64532lq2) new C64532lq2().parseFrom(asByteArray9);
                    if (z) {
                        this.__hadSetclipList = true;
                    }
                }
            } catch (IOException e9) {
                Log.m105920e(TAG_, e9.getMessage());
            }
        }
        if (contentValues.containsKey(COL_WATERMARKFLAG)) {
            this.field_watermarkFlag = contentValues.getAsInteger(COL_WATERMARKFLAG).intValue();
            if (z) {
                this.__hadSetwatermarkFlag = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
