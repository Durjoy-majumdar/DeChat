package xb1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p261wl.C38166b;
import p261wl.C38174i;
import pb1.C100720k1;
import pb1.C100723m0;
import pb1.C100724n0;
import pb1.C100746u;
import pb1.C100755z;

/* renamed from: xb1.a */
public class C102612a extends MAutoStorage<C100746u> implements C100724n0 {

    /* renamed from: d */
    public ISQLiteDatabase f302172d;

    /* renamed from: e */
    public final List<C100723m0> f302173e = new CopyOnWriteArrayList();

    public C102612a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C100746u.f295156U, "FavCdnInfo", (String[]) null);
        this.f302172d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean delete(C100746u uVar, String... strArr) {
        if (!super.delete(uVar, strArr)) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f302173e).iterator();
        while (it.hasNext()) {
            C100723m0 m0Var = (C100723m0) it.next();
            if (m0Var != null) {
                m0Var.mo128275R4(uVar);
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100720k1.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((C100720k1) ((C38174i) bVar.next()).get()).mo140154R4(uVar);
        }
        return true;
    }

    /* renamed from: Ow */
    public List<C100746u> mo142249Ow(long j) {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f302172d.rawQuery("select * from FavCdnInfo where favLocalId = " + j, (String[]) null, 2);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C100746u uVar = new C100746u();
                uVar.convertFrom(rawQuery);
                arrayList.add(uVar);
            }
            rawQuery.close();
        }
        Log.m105927v("MicroMsg.FavCdnStorage", "getInfos size:%d", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* renamed from: SE */
    public void mo142250SE(C100723m0 m0Var) {
        if (m0Var != null) {
            ((CopyOnWriteArrayList) this.f302173e).remove(m0Var);
        }
    }

    /* renamed from: TE */
    public void mo142251TE(C100755z zVar) {
        long nowMilliSecond = Util.nowMilliSecond();
        this.f302172d.execSQL("FavCdnInfo", "update FavCdnInfo set status = 1,modifyTime = " + nowMilliSecond + " where " + "favLocalId" + " = " + zVar.field_localId + " and " + "type" + " = " + 0 + " and " + "status" + " <> " + 3);
    }

    /* renamed from: Yt */
    public C100746u mo142252Yt(String str) {
        C100746u uVar = null;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FavCdnStorage", "md5 null");
            return null;
        }
        Cursor rawQuery = this.f302172d.rawQuery("select * from FavCdnInfo where dataId = '" + str + "'", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            uVar = new C100746u();
            uVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return uVar;
    }

    /* renamed from: bD */
    public int mo142253bD(long j, int i) {
        Cursor rawQuery = this.f302172d.rawQuery("select status from FavCdnInfo where favLocalId = " + j + " and " + "type" + " = " + i, (String[]) null, 2);
        if (rawQuery == null) {
            return 3;
        }
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return 3;
        }
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        do {
            int i2 = rawQuery.getInt(0);
            if (i2 == 1) {
                rawQuery.close();
                return 1;
            }
            if (i2 != 4) {
                z2 = false;
            }
            if (i2 != 2) {
                z = false;
            }
            if (i2 != 3) {
                z3 = false;
            }
        } while (rawQuery.moveToNext());
        rawQuery.close();
        if (z) {
            return 2;
        }
        if (z2) {
            return 4;
        }
        return z3 ? 3 : 0;
    }

    /* renamed from: bF */
    public boolean update(C100746u uVar, String... strArr) {
        if (!super.update(uVar, strArr)) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f302173e).iterator();
        while (it.hasNext()) {
            C100723m0 m0Var = (C100723m0) it.next();
            if (m0Var != null) {
                m0Var.mo128275R4(uVar);
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100720k1.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((C100720k1) ((C38174i) bVar.next()).get()).mo140154R4(uVar);
        }
        return true;
    }

    /* renamed from: jo */
    public void mo142255jo(C100723m0 m0Var) {
        if (m0Var != null && !((CopyOnWriteArrayList) this.f302173e).contains(m0Var)) {
            ((CopyOnWriteArrayList) this.f302173e).add(m0Var);
        }
    }

    /* renamed from: kD */
    public boolean insert(C100746u uVar) {
        if (uVar == null || !super.insert(uVar)) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f302173e).iterator();
        while (it.hasNext()) {
            C100723m0 m0Var = (C100723m0) it.next();
            if (m0Var != null) {
                m0Var.mo128275R4(uVar);
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100720k1.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((C100720k1) ((C38174i) bVar.next()).get()).mo140154R4(uVar);
        }
        return true;
    }

    /* renamed from: qq */
    public void mo142257qq(long j) {
        this.f302172d.execSQL("FavCdnInfo", String.format("delete from %s where %s = %d and %s = %d", new Object[]{"FavCdnInfo", "favLocalId", Long.valueOf(j), "type", 0}));
    }
}
