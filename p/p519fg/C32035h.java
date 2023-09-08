package p519fg;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zh3.C91753f;

/* renamed from: fg.h */
public final class C32035h {

    /* renamed from: a */
    public static final C32035h f85269a = new C32035h();

    /* renamed from: b */
    public static C32029b f85270b;

    /* renamed from: a */
    public final List<C32028a> mo58461a(String str, String str2) {
        ArrayList arrayList;
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "slotId");
        C32029b b = mo58462b();
        if (b != null) {
            arrayList = new ArrayList();
            Cursor rawQuery = b.rawQuery("select * from AdvertisePushDBInfo where message_slotid=" + str2, new String[0]);
            while (rawQuery.moveToNext()) {
                C32028a aVar = new C32028a();
                aVar.convertFrom(rawQuery);
                arrayList.add(aVar);
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.AdvertisePushDBInfoStorage", "getSpecificSlotMsg:" + arrayList);
        } else {
            arrayList = new ArrayList();
        }
        C115669n.INSTANCE.mo160131h(27060, str, 1, str2, Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* renamed from: b */
    public final C32029b mo58462b() {
        if (f85270b == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (f85270b == null) {
                    f85270b = f85269a.mo58463c();
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        return f85270b;
    }

    /* renamed from: c */
    public final C32029b mo58463c() {
        String str = C86709a0.m107535s().f251807e + "AdvertisePushMsg.db";
        C91753f fVar = new C91753f();
        if (fVar.mo125626p(str, C90364q0.m113146e(new C13604l(1254747469, C32034g.f85268a)), true, true)) {
            return new C32029b(fVar);
        }
        throw new SQLiteException("AdvertisePushMsg db init failed");
    }
}
