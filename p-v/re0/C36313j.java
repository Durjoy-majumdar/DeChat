package re0;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p239sv.C36840r;
import zh3.C91753f;

/* renamed from: re0.j */
public class C36313j extends MAutoStorage<C36312i> implements C36840r {

    /* renamed from: e */
    public static final String[] f96667e = {MAutoStorage.getCreateSQLs(C36312i.f96666p, "OpenIMSnsFlag")};

    /* renamed from: d */
    public C91753f f96668d;

    public C36313j(C91753f fVar) {
        super(fVar, C36312i.f96666p, "OpenIMSnsFlag", (String[]) null);
        this.f96668d = fVar;
    }

    /* renamed from: Lo */
    public long mo60611Lo(String str) {
        String str2 = "SELECT * FROM OpenIMSnsFlag WHERE openIMUsername = \"" + str + FastJsonResponse.QUOTE;
        Log.m105918d("MicroMsg.Openim.OpenIMSnsFlagStg", "getFlag:" + str2);
        Cursor rawQuery = this.f96668d.rawQuery(str2, (String[]) null, 2);
        long j = 0;
        if (rawQuery == null) {
            Log.m105921e("MicroMsg.Openim.OpenIMSnsFlagStg", "getFlag failed, openIMUsername:%s", str);
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            C36312i iVar = new C36312i();
            iVar.convertFrom(rawQuery);
            j = iVar.field_openIMSnsFlag;
        }
        rawQuery.close();
        return j;
    }

    /* renamed from: jo */
    public void mo60612jo() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        try {
            j = this.f96668d.mo125613a();
            this.f96668d.execSQL("OpenIMSnsFlag", "DROP TABLE OpenIMSnsFlag");
            this.f96668d.execSQL("OpenIMSnsFlag", f96667e[0]);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Openim.OpenIMSnsFlagStg", "drop table Error :" + e.getMessage());
        } catch (Throwable th) {
            this.f96668d.endTransaction(j);
            throw th;
        }
        this.f96668d.endTransaction(j);
        Log.m105925i("MicroMsg.Openim.OpenIMSnsFlagStg", "deleteTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: qq */
    public boolean replace(C36312i iVar) {
        Log.m105924i("MicroMsg.Openim.OpenIMSnsFlagStg", "replace " + iVar.field_openIMUsername + "," + iVar.field_openIMSnsFlag);
        return super.replace(iVar);
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        C36312i iVar = (C36312i) iAutoDBItem;
        Log.m105924i("MicroMsg.Openim.OpenIMSnsFlagStg", "update " + iVar.field_openIMUsername + "," + iVar.field_openIMSnsFlag);
        return super.update(iVar, strArr);
    }
}
