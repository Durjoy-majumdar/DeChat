package ie0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C44668u3;
import cy3.C58003b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import p749xh.C53354z6;
import rx3.C13598b0;
import zh3.C91753f;

/* renamed from: ie0.q */
public final class C46226q extends MAutoStorage<C46220j> {

    /* renamed from: f */
    public static final String[] f124608f = {MAutoStorage.getCreateSQLs(C46220j.f124589p0, "OpenIMKefuContact")};

    /* renamed from: d */
    public final ISQLiteDatabase f124609d;

    /* renamed from: e */
    public final C44668u3 f124610e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46226q(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C46220j.f124589p0, "OpenIMKefuContact", C53354z6.f150115A);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C46220j.f124589p0;
        this.f124609d = iSQLiteDatabase;
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        C87412m.m108593f(Ni, "service(IMessengerStorage::class.java).contactStg");
        this.f124610e = Ni;
    }

    /* renamed from: jo */
    public final C46220j mo71637jo(String str) {
        C46220j jVar;
        C87412m.m108594g(str, "username");
        Cursor rawQuery = this.f124609d.rawQuery("SELECT *, rowid FROM OpenIMKefuContact WHERE username = " + C91753f.m115264e(str), (String[]) null, 2);
        boolean z = false;
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    z = true;
                }
            } catch (Throwable th) {
                C58003b.m67160a(rawQuery, th);
                throw th;
            }
        }
        if (z) {
            jVar = new C46220j();
            jVar.convertFrom(rawQuery);
            jVar.f124591Z = jVar.systemRowid;
            jVar.f124590Y = true;
        } else {
            jVar = null;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        C58003b.m67160a(rawQuery, (Throwable) null);
        return jVar;
    }
}
