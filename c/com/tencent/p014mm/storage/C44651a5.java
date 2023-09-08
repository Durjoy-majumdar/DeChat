package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import g62.C45888s;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.storage.a5 */
public class C44651a5 extends MAutoStorage<C44673z4> implements C45888s {

    /* renamed from: f */
    public static final String[] f121059f = {MAutoStorage.getCreateSQLs(C44673z4.f121103v, "Stranger")};

    /* renamed from: d */
    public ISQLiteDatabase f121060d;

    /* renamed from: e */
    public final MStorageEvent<C45888s.C45889a, C44673z4> f121061e = new C44652a(this);

    /* renamed from: com.tencent.mm.storage.a5$a */
    public class C44652a extends MStorageEvent<C45888s.C45889a, C44673z4> {
        public C44652a(C44651a5 a5Var) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C45888s.C45889a) obj).mo71318O3((C44673z4) obj2);
        }
    }

    public C44651a5(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C44673z4.f121103v, "Stranger", (String[]) null);
        this.f121060d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C44673z4 mo69630Lo(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        C44673z4 z4Var = new C44673z4();
        Cursor query = this.f121060d.query("Stranger", (String[]) null, "encryptUsername = ?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            z4Var.convertFrom(query);
        }
        query.close();
        return z4Var;
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C44673z4 z4Var = (C44673z4) iAutoDBItem;
        if (z4Var == null) {
            return false;
        }
        boolean insert = super.insert(z4Var);
        if (!insert || !this.f121061e.event(z4Var)) {
            return insert;
        }
        this.f121061e.doNotify();
        return insert;
    }

    /* renamed from: jo */
    public int mo69631jo(String str) {
        ISQLiteDatabase iSQLiteDatabase = this.f121060d;
        int delete = iSQLiteDatabase.delete("Stranger", "(encryptUsername=?)", new String[]{"" + str});
        if (delete > 0) {
            doNotify();
        }
        Log.m105924i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + str + " result:" + delete);
        return delete;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C44673z4 z4Var = (C44673z4) iAutoDBItem;
        Assert.assertTrue("stranger NULL !", z4Var != null);
        Log.m105919d("MicroMsg.StrangerStorage", "replace : encryptUsername=%s, conRemark=%s", z4Var.mo69827m2(), z4Var.mo69826l2());
        if (!(this.f121060d.replace("Stranger", "", z4Var.convertTo()) > 0)) {
            return false;
        }
        if (this.f121061e.event(z4Var)) {
            this.f121061e.doNotify();
        }
        return true;
    }
}
