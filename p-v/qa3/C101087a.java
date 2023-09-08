package qa3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.List;
import ra3.C118229a;
import zh3.C91753f;

/* renamed from: qa3.a */
public class C101087a extends MAutoStorage<C118229a> {

    /* renamed from: d */
    public ISQLiteDatabase f295917d;

    public C101087a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C118229a.f353392O1, "LabAppInfo", (String[]) null);
        this.f295917d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo140536Lo(List<C118229a> list) {
        long j;
        C91753f fVar;
        ISQLiteDatabase iSQLiteDatabase = this.f295917d;
        if (iSQLiteDatabase instanceof C91753f) {
            fVar = (C91753f) iSQLiteDatabase;
            j = fVar.mo125613a();
        } else {
            fVar = null;
            j = 0;
        }
        for (C118229a next : list) {
            if (!replace(next)) {
                insert(next);
            }
        }
        if (fVar != null) {
            fVar.endTransaction(j);
        }
    }

    /* renamed from: jo */
    public List<C118229a> mo140537jo() {
        Cursor all = getAll();
        ArrayList arrayList = new ArrayList();
        while (all.moveToNext()) {
            C118229a aVar = new C118229a();
            aVar.convertFrom(all);
            arrayList.add(aVar);
        }
        all.close();
        return arrayList;
    }

    /* renamed from: qq */
    public boolean replace(C118229a aVar) {
        C118229a aVar2 = new C118229a();
        aVar2.field_LabsAppId = aVar.field_LabsAppId;
        get(aVar2, new String[0]);
        if (aVar.field_expId != aVar2.field_expId || aVar.field_sequence >= aVar2.field_sequence) {
            return super.replace(aVar);
        }
        Log.m105924i("LabAppInfoStorage", "sequence old origin.seq " + aVar2.field_sequence + " old.seq " + aVar.field_sequence);
        return false;
    }
}
