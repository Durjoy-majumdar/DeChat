package xm2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C99681n;

/* renamed from: xm2.z */
public class C78869z implements C61173o {

    /* renamed from: d */
    public final /* synthetic */ HashSet f231715d;

    /* renamed from: e */
    public final /* synthetic */ long f231716e;

    /* renamed from: f */
    public final /* synthetic */ long f231717f;

    /* renamed from: g */
    public final /* synthetic */ C78858a0 f231718g;

    public C78869z(C78858a0 a0Var, HashSet hashSet, long j, long j2) {
        this.f231718g = a0Var;
        this.f231715d = hashSet;
        this.f231716e = j;
        this.f231717f = j2;
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        int i;
        char c;
        Class cls = C75700k0.class;
        List<C99681n> list = lVar.f32076e;
        if (list != null) {
            for (C99681n next : list) {
                this.f231715d.remove(next.f292151e);
                this.f231718g.f231688h.add(next.f292151e);
            }
        }
        Iterator it = this.f231715d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
            long j = this.f231716e;
            long currentTimeMillis = System.currentTimeMillis();
            C72972g4 g4Var = (C72972g4) LE;
            g4Var.getClass();
            Cursor rawQuery = g4Var.f212775p.rawQuery("SELECT COUNT(*) FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "type" + " = " + 50 + " AND " + "createTime" + " >= " + j + " AND " + "createTime" + " <= " + currentTimeMillis + " LIMIT " + 1, (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                c = 0;
                i = rawQuery.getInt(0);
            } else {
                c = 0;
                i = 0;
            }
            rawQuery.close();
            if (i > 0) {
                Object[] objArr = new Object[2];
                objArr[c] = str;
                objArr[1] = Integer.valueOf(i);
                Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] talker:%s voipCount:%s", objArr);
            } else {
                Cursor dy02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).dy0(str, this.f231716e, System.currentTimeMillis(), true, 1);
                if (dy02.getCount() > 0) {
                    Cursor dy03 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).dy0(str, this.f231716e, System.currentTimeMillis(), false, 1);
                    if (dy03.getCount() <= 0) {
                        this.f231718g.f231688h.add(str);
                    }
                    dy03.close();
                } else {
                    this.f231718g.f231688h.add(str);
                }
                dy02.close();
            }
        }
        Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] query:%s cost:%sms", Long.valueOf(this.f231716e), Long.valueOf(System.currentTimeMillis() - this.f231717f));
        this.f231718g.f231684d.countDown();
    }
}
