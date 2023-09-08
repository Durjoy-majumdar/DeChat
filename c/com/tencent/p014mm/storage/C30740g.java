package com.tencent.p014mm.storage;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38577i;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.g */
public class C30740g extends MAutoStorage<C38577i> {

    /* renamed from: f */
    public static final String[] f82667f = {MAutoStorage.getCreateSQLs(C38577i.initAutoDBInfo((Class<?>) null), "AddContactAntispamTicket")};

    /* renamed from: d */
    public SparseArray<String> f82668d = new SparseArray<>();

    /* renamed from: e */
    public C91753f f82669e;

    /* renamed from: com.tencent.mm.storage.g$a */
    public static class C30741a extends C38577i {
        public IAutoDBItem.MAutoDBInfo getDBInfo() {
            return C38577i.initAutoDBInfo((Class<?>) null);
        }
    }

    public C30740g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38577i.initAutoDBInfo((Class<?>) null), "AddContactAntispamTicket", (String[]) null);
        this.f82669e = (C91753f) iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public String mo57650Lo(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String str2 = this.f82668d.get(str.hashCode());
        if (!Util.isNullOrNil(str2)) {
            return str2;
        }
        C30741a aVar = new C30741a();
        aVar.field_userName = str;
        if (!get(aVar, "userName")) {
            return null;
        }
        zi0(aVar.field_userName, aVar.field_scene, aVar.field_ticket);
        return aVar.field_ticket;
    }

    /* renamed from: jo */
    public void mo57651jo(String str, int i, String str2) {
        if (!Util.isNullOrNil(str)) {
            C30741a aVar = new C30741a();
            aVar.field_userName = str;
            aVar.field_scene = i;
            aVar.field_ticket = str2;
            replace(aVar);
            zi0(str, i, str2);
        }
    }

    public void zi0(String str, int i, String str2) {
        if (!Util.isNullOrNil(str)) {
            this.f82668d.put(str.hashCode(), str2);
        }
    }
}
