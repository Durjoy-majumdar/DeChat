package nn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: nn2.g */
public class C47289g extends MAutoStorage<C47288f> {

    /* renamed from: e */
    public static final String[] f126950e = {MAutoStorage.getCreateSQLs(C47288f.f126947y0, "shakeitem1")};

    /* renamed from: d */
    public ISQLiteDatabase f126951d;

    public C47289g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C47288f.f126947y0, "shakeitem1", (String[]) null);
        this.f126951d = iSQLiteDatabase;
        Log.m105918d("MicroMsg.NewShakeItemStorage", "ShakeItemStorage");
        iSQLiteDatabase.execSQL("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
        iSQLiteDatabase.execSQL("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
    }

    /* renamed from: Lo */
    public int mo72322Lo(int i) {
        ISQLiteDatabase iSQLiteDatabase = this.f126951d;
        int delete = iSQLiteDatabase.delete("shakeitem1", "shakeItemID=?", new String[]{"" + i});
        doNotify();
        Log.m105924i("MicroMsg.NewShakeItemStorage", "delById id:" + i + " result:" + delete);
        return delete;
    }

    /* renamed from: Ow */
    public void mo72323Ow() {
        Log.m105924i("MicroMsg.NewShakeItemStorage", "setAllOld");
        C47288f fVar = new C47288f();
        fVar.field_insertBatch = 0;
        fVar.f126948p0 = 1024;
        if (-1 != this.f126951d.update("shakeitem1", fVar.convertTo(), "insertBatch!=?", new String[]{"0"})) {
            doNotify();
        }
    }

    /* renamed from: Yt */
    public boolean mo72324Yt(C47288f fVar, boolean z) {
        if (fVar == null) {
            return false;
        }
        if (!z && !Util.isNullOrNil(fVar.field_username)) {
            mo72326qq(fVar.field_username);
        }
        fVar.f126948p0 = -1;
        return super.insert(fVar);
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return mo72324Yt((C47288f) iAutoDBItem, false);
    }

    /* renamed from: jo */
    public boolean mo72325jo(int i) {
        boolean z;
        if (i == 0) {
            ISQLiteDatabase iSQLiteDatabase = this.f126951d;
            z = iSQLiteDatabase.execSQL("shakeitem1", "delete from shakeitem1 where type = " + i + " or " + "type" + " is null");
        } else {
            ISQLiteDatabase iSQLiteDatabase2 = this.f126951d;
            z = iSQLiteDatabase2.execSQL("shakeitem1", "delete from shakeitem1 where type = " + i);
        }
        doNotify();
        return z;
    }

    /* renamed from: qq */
    public int mo72326qq(String str) {
        ISQLiteDatabase iSQLiteDatabase = this.f126951d;
        int delete = iSQLiteDatabase.delete("shakeitem1", "(username=?)", new String[]{"" + str});
        if (delete > 0) {
            doNotify();
        }
        Log.m105924i("MicroMsg.NewShakeItemStorage", "delByusername:" + str + " result:" + delete);
        return delete;
    }
}
