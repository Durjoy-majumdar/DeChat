package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Arrays;
import p749xh.C38579i1;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.r1 */
public class C6716r1 extends MAutoStorage<C38579i1> {

    /* renamed from: e */
    public static final String[] f24128e = {MAutoStorage.getCreateSQLs(C6715q1.f24127z, "CleanDeleteItem")};

    /* renamed from: f */
    public static C6716r1 f24129f;

    /* renamed from: d */
    public ISQLiteDatabase f24130d;

    public C6716r1(C91753f fVar) {
        super(fVar, C6715q1.f24127z, "CleanDeleteItem", (String[]) null);
        this.f24130d = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new String[]{"CREATE INDEX IF NOT EXISTS ID ON CleanDeleteItem ( id )"}));
        for (int i = 0; i < arrayList.size(); i++) {
            fVar.execSQL("CleanDeleteItem", (String) arrayList.get(i));
        }
        Log.m105919d("MicroMsg.CleanDeleteItemStorage", "build new index last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        fVar.endTransaction(beginTransaction);
        Log.m105925i("MicroMsg.CleanDeleteItemStorage", "executeInitSQL last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: jo */
    public static C6716r1 m7012jo() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (f24129f == null) {
            f24129f = new C6716r1(C86709a0.m107535s().f251811i);
        }
        return f24129f;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        return super.update(j, (C38579i1) iAutoDBItem);
    }
}
