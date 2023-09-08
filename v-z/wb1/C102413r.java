package wb1;

import android.database.Cursor;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import pb1.C100718j1;
import pb1.C35443x;
import wb1.C102415t;
import xb1.C102613c;

/* renamed from: wb1.r */
public class C102413r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102415t f301642d;

    public C102413r(C102415t tVar) {
        this.f301642d = tVar;
    }

    public void run() {
        C102613c cVar = (C102613c) ((C100718j1) C86312j.m106911c(C100718j1.class)).a10();
        ArrayList<C35443x> arrayList = null;
        Cursor rawQuery = cVar.f302174d.rawQuery("select count(*) from FavEditInfo", (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.Fav.FavEditInfoStorage", "count all edit info, cursor is null");
        } else {
            try {
                if (rawQuery.moveToFirst()) {
                    Log.m105925i("MicroMsg.Fav.FavEditInfoStorage", "get all edit infos, count %d", Integer.valueOf(rawQuery.getInt(0)));
                }
                rawQuery.close();
                Cursor rawQuery2 = cVar.f302174d.rawQuery("select * from FavEditInfo", (String[]) null, 2);
                if (rawQuery2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        if (rawQuery2.moveToFirst()) {
                            do {
                                C35443x xVar = new C35443x();
                                xVar.convertFrom(rawQuery2);
                                arrayList2.add(xVar);
                            } while (rawQuery2.moveToNext());
                        }
                        rawQuery2.close();
                        arrayList = arrayList2;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", e, "", new Object[0]);
                        rawQuery2.close();
                    }
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Fav.FavEditInfoStorage", e2, "", new Object[0]);
                rawQuery.close();
            }
        }
        if (arrayList != null) {
            Log.m105925i("MicroMsg.Fav.FavEditService", "infos size %d", Integer.valueOf(arrayList.size()));
            for (C35443x xVar2 : arrayList) {
                String b = C102415t.m135135b(xVar2.field_localId, xVar2.field_type);
                C102415t.C102416a aVar = (C102415t.C102416a) ((HashMap) this.f301642d.f301645d).get(b);
                if (aVar == null) {
                    Log.m105925i("MicroMsg.Fav.FavEditService", "not match key %s", b);
                    C102415t.C102416a aVar2 = new C102415t.C102416a();
                    aVar2.f301646a = xVar2;
                    aVar2.f301649d = 3;
                    aVar2.f301648c = SystemClock.elapsedRealtime();
                    ((HashMap) this.f301642d.f301645d).put(b, aVar2);
                    C102415t.m135134a(this.f301642d, aVar2, true);
                } else {
                    Log.m105925i("MicroMsg.Fav.FavEditService", "match key %s, check start", b);
                    C102415t.m135134a(this.f301642d, aVar, false);
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
