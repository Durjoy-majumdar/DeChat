package e63;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: e63.d */
public class C75559d extends MAutoStorage<Bankcard> {

    /* renamed from: f */
    public static final String[] f221978f = {MAutoStorage.getCreateSQLs(Bankcard.f209387V2, "WalletBankcard")};

    /* renamed from: d */
    public ISQLiteDatabase f221979d;

    /* renamed from: e */
    public List<C75560a> f221980e = new LinkedList();

    /* renamed from: e63.d$a */
    public interface C75560a {
        /* renamed from: a */
        void mo105868a(Bankcard bankcard);
    }

    public C75559d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, Bankcard.f209387V2, "WalletBankcard", (String[]) null);
        this.f221979d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(Bankcard bankcard) {
        if (!super.insert(bankcard)) {
            return false;
        }
        for (C75560a a : this.f221980e) {
            a.mo105868a(bankcard);
        }
        return true;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        Bankcard bankcard = (Bankcard) iAutoDBItem;
        if (!super.delete(bankcard, strArr)) {
            return false;
        }
        for (C75560a a : this.f221980e) {
            a.mo105868a(bankcard);
        }
        return true;
    }

    /* renamed from: jo */
    public ArrayList<Bankcard> mo105866jo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
        ArrayList<Bankcard> arrayList = null;
        Cursor rawQuery = this.f221979d.rawQuery("select * from WalletBankcard where cardType <= 7 OR cardType & 128 != 0", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            ArrayList<Bankcard> arrayList2 = new ArrayList<>();
            do {
                Bankcard bankcard = new Bankcard();
                bankcard.convertFrom(rawQuery);
                arrayList2.add(bankcard);
            } while (rawQuery.moveToNext());
            arrayList = arrayList2;
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: qq */
    public boolean mo105867qq(List<Bankcard> list) {
        for (Bankcard insert : list) {
            super.insert(insert);
        }
        for (C75560a a : this.f221980e) {
            a.mo105868a((Bankcard) null);
        }
        return true;
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        Bankcard bankcard = (Bankcard) iAutoDBItem;
        if (!super.update(bankcard, strArr)) {
            return false;
        }
        for (C75560a a : this.f221980e) {
            a.mo105868a(bankcard);
        }
        return true;
    }
}
