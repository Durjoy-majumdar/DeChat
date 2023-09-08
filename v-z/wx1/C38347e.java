package wx1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import gy3.C87412m;
import p749xh.C38617n4;
import sw1.C48484q;
import tw1.C52370d;

/* renamed from: wx1.e */
public final class C38347e extends MAutoStorage<C38343a> {

    /* renamed from: e */
    public static final String[] f101205e = {MAutoStorage.getCreateSQLs(C38343a.f101201B, "GameResourceDownload")};

    /* renamed from: d */
    public final ISQLiteDatabase f101206d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38347e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38343a.f101201B, "GameResourceDownload", C38617n4.f103101p);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38343a.f101201B;
        this.f101206d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final C38343a mo61626Lo(String str) {
        C87412m.m108594g(str, "packageName");
        C38343a aVar = null;
        if (str.length() == 0) {
            return null;
        }
        String str2 = "select * from GameResourceDownload where packageName=\"" + str + '\"';
        Log.m105925i("MicroMsg.GameResourceDownloadStorage", "getDownloadStage, sql : %s", str2);
        Cursor rawQuery = rawQuery(str2, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            aVar = new C38343a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }

    /* renamed from: Ow */
    public final void mo61627Ow(String str, int i, long j, int i2) {
        C87412m.m108594g(str, "packageName");
        Log.m105924i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:" + str);
        C38343a Lo = mo61626Lo(str);
        if (Lo != null) {
            Lo.field_checkCgiTime = j;
            Lo.field_intervalSeconds = i;
            Lo.field_expiredSeconds = i2;
            update(Lo, new String[0]);
        }
        C53217b.f148462a.mo73890g();
    }

    /* renamed from: Yt */
    public final void mo61628Yt(String str, int i, int i2, C52370d dVar) {
        C87412m.m108594g(str, "packageName");
        C87412m.m108594g(dVar, "gameResDownloadList");
        Log.m105924i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:" + str);
        C38343a Lo = mo61626Lo(str);
        if (Lo != null) {
            Lo.field_checkCgiTime = Util.nowSecond();
            Lo.field_intervalSeconds = i;
            Lo.field_downloadItemList = dVar.toByteArray();
            Lo.field_expiredSeconds = i2;
            update(Lo, new String[0]);
        }
        C53217b.f148462a.mo73890g();
    }

    /* renamed from: g */
    public final void mo61629g(String str, String str2, int i, int i2, long j, int i3, C52370d dVar) {
        C87412m.m108594g(str, "packageName");
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(dVar, "gameResDownloadList");
        C38343a aVar = new C38343a();
        aVar.field_packageName = str;
        aVar.field_appId = str2;
        aVar.field_intervalSeconds = i;
        aVar.field_expiredSeconds = i2;
        aVar.field_taskExpiredSeconds = j;
        aVar.field_scene = i3;
        aVar.field_createTime = Util.nowSecond();
        aVar.field_checkCgiTime = Util.nowSecond();
        aVar.field_finishDownloadTime = Util.nowSecond();
        aVar.field_downloadItemList = dVar.toByteArray();
        boolean insert = ((C48484q) C86312j.m106911c(C48484q.class)).Og0().insert(aVar);
        Log.m105924i("MicroMsg.GameResourceDownloadStorage", "insert db ret:" + insert + ", packageName:" + str + ", interval:" + i + ", expiredTime:" + i2);
        C53217b.f148462a.mo73890g();
    }

    /* renamed from: jo */
    public final boolean mo61630jo(String str) {
        C87412m.m108594g(str, "packageName");
        String str2 = "delete from GameResourceDownload where packageName=\"" + str + '\"';
        boolean execSQL = execSQL("GameResourceDownload", str2);
        Log.m105924i("MicroMsg.GameResourceDownloadStorage", "delDownloadInfo, sql:" + str2 + ", ret:" + execSQL);
        C53217b.f148462a.mo73890g();
        return execSQL;
    }
}
