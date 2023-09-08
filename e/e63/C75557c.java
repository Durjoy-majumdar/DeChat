package e63;

import com.tencent.p014mm.plugin.wallet_core.model.BankcardScene;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;
import java.util.List;
import p749xh.C78820m9;

/* renamed from: e63.c */
public class C75557c extends MAutoStorage<BankcardScene> {

    /* renamed from: f */
    public static final String[] f221975f = {MAutoStorage.getCreateSQLs(BankcardScene.f209432Q2, "WalletBankcardScene")};

    /* renamed from: d */
    public ISQLiteDatabase f221976d;

    /* renamed from: e */
    public List<C75558a> f221977e = new LinkedList();

    /* renamed from: e63.c$a */
    public interface C75558a {
        /* renamed from: a */
        void mo105864a(BankcardScene bankcardScene);
    }

    public C75557c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, BankcardScene.f209432Q2, "WalletBankcardScene", C78820m9.f231116Z0);
        this.f221976d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean mo105862Lo(List<BankcardScene> list) {
        for (BankcardScene insert : list) {
            super.insert(insert);
        }
        for (C75558a a : this.f221977e) {
            a.mo105864a((BankcardScene) null);
        }
        return true;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        BankcardScene bankcardScene = (BankcardScene) iAutoDBItem;
        if (!super.delete(bankcardScene, strArr)) {
            return false;
        }
        for (C75558a a : this.f221977e) {
            a.mo105864a(bankcardScene);
        }
        return true;
    }

    /* renamed from: jo */
    public boolean insert(BankcardScene bankcardScene) {
        if (!super.insert(bankcardScene)) {
            return false;
        }
        for (C75558a a : this.f221977e) {
            a.mo105864a(bankcardScene);
        }
        return true;
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        BankcardScene bankcardScene = (BankcardScene) iAutoDBItem;
        if (!super.update(bankcardScene, strArr)) {
            return false;
        }
        for (C75558a a : this.f221977e) {
            a.mo105864a(bankcardScene);
        }
        return true;
    }
}
