package sq1;

import android.content.ContentValues;
import com.tencent.p014mm.autogen.events.UniCommentChangeEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.wcdb.database.SQLiteException;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p749xh.C66259d9;
import sx3.C110823p;
import zh3.C91753f;

/* renamed from: sq1.d */
public final class C64149d extends MAutoStorage<C64146a> {

    /* renamed from: f */
    public static final C64150a f181862f = new C64150a((C8480h) null);

    /* renamed from: g */
    public static final String[] f181863g = {MAutoStorage.getCreateSQLs(C64146a.f181856L, "UniAction")};

    /* renamed from: h */
    public static final String f181864h = "UniAction";

    /* renamed from: i */
    public static final String[] f181865i;

    /* renamed from: d */
    public final ISQLiteDatabase f181866d;

    /* renamed from: e */
    public final String f181867e = "SELECT * FROM UniAction";

    /* renamed from: sq1.d$a */
    public static final class C64150a {
        public C64150a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C64149d mo88889a() {
            C91753f fVar = new C91753f();
            String str = C86709a0.m107535s().f251807e + "UniComment.db";
            C64150a aVar = C64149d.f181862f;
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(C64149d.f181864h.hashCode()), C64148c.f181861a);
            if (fVar.mo125626p(str, hashMap, true, true)) {
                return new C64149d(fVar);
            }
            throw new SQLiteException("db init failed");
        }
    }

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C64146a.f181856L;
        String[] strArr = C66259d9.f190517u;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        List c0 = C110823p.m151003c0(strArr);
        ArrayList arrayList = (ArrayList) c0;
        arrayList.add("CREATE INDEX IF NOT EXISTS " + C64146a.f181857M + " ON " + "UniAction" + " ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + C64146a.f181858N + " ON " + "UniAction" + " (actionType,feedId, postTime)");
        Object[] array = c0.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f181865i = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64149d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C64146a.f181856L, "UniAction", f181865i);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C64146a.f181856L;
        this.f181866d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final boolean mo88886Lo(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f181866d;
        boolean z = true;
        if (iSQLiteDatabase.delete("UniAction", "localCommentId=?", new String[]{"" + j}) <= 0) {
            z = false;
        }
        Log.m105924i("MicroMsg.MusicUni.UniActionStorage", "removeUnsentComment " + j + " ret:" + z);
        return z;
    }

    /* renamed from: jo */
    public final void mo88887jo(long j, long j2, long j3, int i, C64147b bVar) {
        UniCommentChangeEvent uniCommentChangeEvent = new UniCommentChangeEvent();
        UniCommentChangeEvent.C55171a aVar = uniCommentChangeEvent.f154888d;
        aVar.f154889a = j;
        aVar.f154890b = j2;
        aVar.f154891c = j3;
        aVar.f154892d = i;
        aVar.f154893e = bVar;
        Log.m105924i("MicroMsg.MusicUni.UniActionStorage", "postEvent, feedId:" + j + ", commentId:" + j2 + ", localId:" + j3 + ", opType:" + i);
        uniCommentChangeEvent.publish();
    }

    /* renamed from: qq */
    public final boolean mo88888qq(long j, C64147b bVar, boolean z) {
        C87412m.m108594g(bVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        ContentValues convertTo = bVar.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f181866d;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        boolean z2 = iSQLiteDatabase.update("UniAction", convertTo, "localCommentId=?", new String[]{sb.toString()}) > 0;
        if (z) {
            mo88887jo(bVar.field_feedId, bVar.mo88875m2(), bVar.field_localCommentId, 3, bVar);
        }
        return z2;
    }
}
