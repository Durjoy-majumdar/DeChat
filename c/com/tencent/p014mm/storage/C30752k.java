package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.Arrays;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.k */
public class C30752k extends MAutoStorage<C30748j> {

    /* renamed from: e */
    public static final String[] f82697e = {MAutoStorage.getCreateSQLs(C30748j.f82690r, "BackupMoveTime")};

    /* renamed from: d */
    public ISQLiteDatabase f82698d;

    public C30752k(C91753f fVar) {
        super(fVar, C30748j.f82690r, "BackupMoveTime", (String[]) null);
        this.f82698d = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new String[]{"CREATE INDEX IF NOT EXISTS DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )"}));
        for (int i = 0; i < arrayList.size(); i++) {
            fVar.execSQL("BackupMoveTime", (String) arrayList.get(i));
        }
        Log.m105919d("MicroMsg.BackupMoveTimeStorage", "build new index last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        fVar.endTransaction(beginTransaction);
        Log.m105925i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public boolean deleteAllData() {
        boolean execSQL = this.f82698d.execSQL("BackupMoveTime", "delete from BackupMoveTime");
        Log.m105925i("MicroMsg.BackupMoveTimeStorage", "deleteAllData, result:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        return super.update(j, (C30748j) iAutoDBItem);
    }
}
