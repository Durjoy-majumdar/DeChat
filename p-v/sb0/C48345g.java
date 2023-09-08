package sb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import p749xh.C38631p0;

/* renamed from: sb0.g */
public class C48345g extends MAutoStorage<C38631p0> {

    /* renamed from: f */
    public static final String[] f129438f = {MAutoStorage.getCreateSQLs(C36650f.f97414p, "BizChatMyUserInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f129439d;

    /* renamed from: e */
    public final MStorageEvent<C48347b, C48347b.C48348a> f129440e = new C48346a(this);

    /* renamed from: sb0.g$a */
    public class C48346a extends MStorageEvent<C48347b, C48347b.C48348a> {
        public C48346a(C48345g gVar) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C48347b) obj).mo73053a((C48347b.C48348a) obj2);
        }
    }

    /* renamed from: sb0.g$b */
    public interface C48347b {

        /* renamed from: sb0.g$b$a */
        public static class C48348a {
        }

        /* renamed from: a */
        void mo73053a(C48348a aVar);
    }

    public C48345g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36650f.f97414p, "BizChatMyUserInfo", (String[]) null);
        this.f129439d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("BizChatMyUserInfo", "CREATE INDEX IF NOT EXISTS bizChatbrandUserNameIndex ON BizChatMyUserInfo ( brandUserName )");
    }

    /* renamed from: Lo */
    public C36650f mo73049Lo(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "get： wrong argument");
            return null;
        }
        C36650f fVar = new C36650f();
        fVar.field_brandUserName = str;
        super.get(fVar, new String[0]);
        return fVar;
    }

    /* renamed from: Yt */
    public boolean mo73050Yt(C36650f fVar) {
        Log.m105918d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update");
        if (fVar == null) {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "update wrong argument");
            return false;
        }
        boolean replace = super.replace(fVar);
        if (replace) {
            this.f129440e.event(new C48347b.C48348a());
            this.f129440e.doNotify();
        } else {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update fail");
        }
        return replace;
    }

    public int getCount() {
        Log.m105918d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage getCount");
        Cursor rawQuery = this.f129439d.rawQuery("SELECT COUNT(*) FROM BizChatMyUserInfo", (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: jo */
    public boolean mo73051jo(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "delete wrong argument");
            return false;
        }
        C36650f fVar = new C36650f();
        fVar.field_brandUserName = str;
        boolean delete = super.delete(fVar, "brandUserName");
        if (delete) {
            this.f129440e.event(new C48347b.C48348a());
            this.f129440e.doNotify();
        }
        return delete;
    }

    /* renamed from: qq */
    public boolean mo73052qq(C36650f fVar) {
        Log.m105918d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert");
        if (fVar == null) {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(fVar);
        if (insert) {
            this.f129440e.event(new C48347b.C48348a());
            this.f129440e.doNotify();
        } else {
            Log.m105928w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert fail");
        }
        return insert;
    }
}
