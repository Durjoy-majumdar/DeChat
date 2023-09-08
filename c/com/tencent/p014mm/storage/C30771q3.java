package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import g62.C32327i;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.storage.q3 */
public class C30771q3 extends MAutoStorage<C30765p3> implements C32327i {

    /* renamed from: f */
    public static final String[] f82745f = {MAutoStorage.getCreateSQLs(C30765p3.f82733r, "FriendUser")};

    /* renamed from: d */
    public ISQLiteDatabase f82746d;

    /* renamed from: e */
    public final MStorageEvent<C32327i.C32328a, C30765p3> f82747e = new C30772a(this);

    /* renamed from: com.tencent.mm.storage.q3$a */
    public class C30772a extends MStorageEvent<C32327i.C32328a, C30765p3> {
        public C30772a(C30771q3 q3Var) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C32327i.C32328a) obj).mo58567A3((C30765p3) obj2);
        }
    }

    public C30771q3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30765p3.f82733r, "FriendUser", (String[]) null);
        this.f82746d = iSQLiteDatabase;
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C30765p3 p3Var = (C30765p3) iAutoDBItem;
        if (p3Var == null) {
            return false;
        }
        boolean insert = super.insert(p3Var);
        if (!insert || !this.f82747e.event(p3Var)) {
            return insert;
        }
        this.f82747e.doNotify();
        return insert;
    }

    /* renamed from: jo */
    public C30765p3 mo57694jo(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        C30765p3 p3Var = new C30765p3();
        Cursor query = this.f82746d.query("FriendUser", (String[]) null, "encryptUsername = ?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            p3Var.convertFrom(query);
        }
        query.close();
        return p3Var;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C30765p3 p3Var = (C30765p3) iAutoDBItem;
        Assert.assertTrue("FriendUser NULL !", p3Var != null);
        Log.m105919d("MicroMsg.FriendUserStorage", "replace : encryptUsername=%s, username=%s", p3Var.mo57686l2(), p3Var.mo57687m2());
        if (!(this.f82746d.replace("FriendUser", "", p3Var.convertTo()) > 0)) {
            return false;
        }
        if (this.f82747e.event(p3Var)) {
            this.f82747e.doNotify();
        }
        return true;
    }
}
