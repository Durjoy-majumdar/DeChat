package kw2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import p749xh.C38547d6;

/* renamed from: kw2.h */
public final class C99267h extends MAutoStorage<C99266g> implements MStorage.IOnStorageChange {

    /* renamed from: e */
    public static final String[] f291070e = {MAutoStorage.getCreateSQLs(C99266g.f291068q, "MMStoryHistoryItem")};

    /* renamed from: f */
    public static final String f291071f = "select * from MMStoryHistoryItem ";

    /* renamed from: d */
    public final ISQLiteDatabase f291072d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99267h(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99266g.f291068q, "MMStoryHistoryItem", C38547d6.f102067g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99266g.f291068q;
        this.f291072d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final boolean mo138651Lo(C99266g gVar) {
        C87412m.m108594g(gVar, "storyHistoryInfo");
        String l2 = gVar.mo138649l2();
        Cursor rawQuery = this.f291072d.rawQuery(f291071f + " WHERE " + "MMStoryHistoryItem" + ".date = '" + l2 + '\'', (String[]) null);
        int count = rawQuery.getCount();
        rawQuery.close();
        return count > 0 ? update(gVar, FFmpegMetadataRetriever.METADATA_KEY_DATE) : super.replace(gVar);
    }

    /* renamed from: jo */
    public final C99266g mo138652jo(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_DATE);
        Cursor rawQuery = this.f291072d.rawQuery(f291071f + " WHERE " + "MMStoryHistoryItem" + ".date = '" + str + '\'', (String[]) null);
        if (rawQuery.moveToFirst()) {
            C99266g gVar = new C99266g();
            gVar.convertFrom(rawQuery);
            rawQuery.close();
            return gVar;
        }
        rawQuery.close();
        return null;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
    }
}
