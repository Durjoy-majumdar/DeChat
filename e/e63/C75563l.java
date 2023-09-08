package e63;

import android.database.Cursor;
import b63.C67203r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;
import java.util.List;

/* renamed from: e63.l */
public class C75563l extends MAutoStorage<C67203r0> {

    /* renamed from: f */
    public static final String[] f221986f = {MAutoStorage.getCreateSQLs(C67203r0.f192940n1, "WalletUserInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f221987d;

    /* renamed from: e */
    public List<C75564a> f221988e = new LinkedList();

    /* renamed from: e63.l$a */
    public interface C75564a {
        /* renamed from: a */
        void mo105874a(C67203r0 r0Var);
    }

    public C75563l(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C67203r0.f192940n1, "WalletUserInfo", (String[]) null);
        Log.m105924i("MicroMsg.WalletUserInfoStorage", "already call constructor.");
        this.f221987d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C67203r0 r0Var) {
        if (!super.insert(r0Var)) {
            return false;
        }
        for (C75564a a : this.f221988e) {
            a.mo105874a(r0Var);
        }
        return true;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        C67203r0 r0Var = (C67203r0) iAutoDBItem;
        if (!super.delete(r0Var, strArr)) {
            return false;
        }
        for (C75564a a : this.f221988e) {
            a.mo105874a(r0Var);
        }
        return true;
    }

    /* renamed from: jo */
    public C67203r0 mo105873jo() {
        C67203r0 r0Var = new C67203r0();
        Cursor rawQuery = this.f221987d.rawQuery("select * from WalletUserInfo", (String[]) null, 2);
        r0Var.field_is_reg = -1;
        if (rawQuery == null) {
            return r0Var;
        }
        if (rawQuery.moveToNext()) {
            r0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return r0Var;
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        C67203r0 r0Var = (C67203r0) iAutoDBItem;
        if (!super.update(r0Var, strArr)) {
            return false;
        }
        for (C75564a a : this.f221988e) {
            a.mo105874a(r0Var);
        }
        return true;
    }
}
