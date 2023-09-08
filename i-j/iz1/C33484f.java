package iz1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C38587j4;
import yy1.C53641c;

/* renamed from: iz1.f */
public final class C33484f extends MAutoStorage<C33478b> {

    /* renamed from: g */
    public static final String[] f90673g = {MAutoStorage.getCreateSQLs(C33478b.f90664t, "GameLifeSessionInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f90674d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, C33478b> f90675e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C33478b> f90676f = new ConcurrentHashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33484f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33478b.f90664t, "GameLifeSessionInfo", C38587j4.f102615i);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33478b.f90664t;
        this.f90674d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo59164Lo(String str, String str2, String str3, C53641c cVar) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "selfUsername");
        C87412m.m108594g(str3, "talker");
        C33478b bVar = new C33478b();
        bVar.field_sessionId = str;
        bVar.field_talker = str3;
        bVar.field_selfUserName = str2;
        bVar.field_extInfo = cVar;
        StringBuilder sb = new StringBuilder();
        sb.append("[replaceSessionInfo] sessionId=");
        sb.append(str);
        sb.append(", talker=");
        sb.append(str3);
        sb.append(", selfUsername=");
        sb.append(bVar.field_selfUserName);
        sb.append(" extInfo:");
        C53641c cVar2 = bVar.field_extInfo;
        Long l = null;
        sb.append(cVar2 != null ? Long.valueOf(cVar2.f150689e) : null);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        C53641c cVar3 = bVar.field_extInfo;
        if (cVar3 != null) {
            l = Long.valueOf(cVar3.f150688d);
        }
        sb.append(l);
        Log.m105924i("GameLife.GameLifeSessionInfoStorage", sb.toString());
        this.f90676f.put(str, bVar);
        this.f90675e.put(mo59166qq(str2, str3), bVar);
        replace(bVar);
    }

    /* renamed from: jo */
    public final C33478b mo59165jo(String str) {
        if (str == null || str.length() == 0) {
            return new C33478b();
        }
        C33478b bVar = this.f90676f.get(str);
        if (bVar != null) {
            return bVar;
        }
        Cursor rawQuery = this.f90674d.rawQuery("select * , rowid from GameLifeSessionInfo where sessionId = '" + str + "' ", (String[]) null);
        C33478b bVar2 = new C33478b();
        bVar2.field_sessionId = str;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                bVar2.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        if (bVar2.systemRowid > 0) {
            this.f90676f.put(str, bVar2);
            ConcurrentHashMap<String, C33478b> concurrentHashMap = this.f90675e;
            String str2 = bVar2.field_selfUserName;
            C87412m.m108593f(str2, "cache.field_selfUserName");
            String str3 = bVar2.field_talker;
            C87412m.m108593f(str3, "cache.field_talker");
            concurrentHashMap.put(mo59166qq(str2, str3), bVar2);
        }
        return bVar2;
    }

    /* renamed from: qq */
    public final String mo59166qq(String str, String str2) {
        return str + '_' + str2;
    }
}
