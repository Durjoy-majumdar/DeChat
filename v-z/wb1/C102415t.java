package wb1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.Scheduler;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100738r0;
import pb1.C100739r1;
import pb1.C100742s0;
import pb1.C100751w0;
import pb1.C100755z;
import pb1.C35443x;
import te3.C101855vc0;
import xb1.C102613c;
import xb1.C102614d;

/* renamed from: wb1.t */
public class C102415t implements C11385n, C100742s0 {

    /* renamed from: d */
    public Map<String, C102416a> f301645d = new HashMap();

    /* renamed from: wb1.t$a */
    public static class C102416a {

        /* renamed from: a */
        public C35443x f301646a;

        /* renamed from: b */
        public int f301647b;

        /* renamed from: c */
        public long f301648c;

        /* renamed from: d */
        public int f301649d;
    }

    public C102415t() {
        C86709a0.m107524d().mo123455a(v2helper.EMethodSetAgcRxOn, this);
        C86709a0.m107524d().mo123455a(401, this);
    }

    /* renamed from: a */
    public static void m135134a(C102415t tVar, C102416a aVar, boolean z) {
        int i;
        tVar.getClass();
        int i2 = aVar.f301649d - 1;
        aVar.f301649d = i2;
        if (i2 < 0) {
            if (SystemClock.elapsedRealtime() - aVar.f301648c < Scheduler.RE_SCHEDULER_APPEND_TIME) {
                Log.m105925i("MicroMsg.Fav.FavEditService", "try mod item fail time limit, favid %d, localId %d, edit type %d", Integer.valueOf(aVar.f301647b), Long.valueOf(aVar.f301646a.field_localId), Integer.valueOf(aVar.f301646a.field_type));
                return;
            }
            aVar.f301648c = SystemClock.elapsedRealtime();
            aVar.f301649d = 3;
        }
        int i3 = aVar.f301647b;
        if (i3 <= 0) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(aVar.f301646a.field_localId);
            if (Yt == null || (i = Yt.field_id) <= 0) {
                Log.m105929w("MicroMsg.Fav.FavEditService", "want to start mod item, but favid is invalid, local id %d", Long.valueOf(aVar.f301646a.field_localId));
                return;
            }
            aVar.f301647b = i;
            Log.m105925i("MicroMsg.Fav.FavEditService", "want mod item, find id %d by local id %d", Integer.valueOf(i), Long.valueOf(aVar.f301646a.field_localId));
        } else if (!z) {
            Log.m105929w("MicroMsg.Fav.FavEditService", "want to mod item, favid %d, it is running, but not enforce, return", Integer.valueOf(i3));
            return;
        }
        Log.m105925i("MicroMsg.Fav.FavEditService", "try mod item, enforce %B, favid %d, edit type %d", Boolean.valueOf(z), Integer.valueOf(aVar.f301647b), Integer.valueOf(aVar.f301646a.field_type));
        int i4 = aVar.f301647b;
        C35443x xVar = aVar.f301646a;
        C101855vc0 vc02 = xVar.field_modItem;
        C100739r1 r1Var = new C100739r1(i4, vc02.f299663d, vc02.f299664e, 1);
        r1Var.f295140h = xVar;
        C86709a0.m107524d().mo123460f(r1Var);
    }

    /* renamed from: b */
    public static String m135135b(long j, int i) {
        return j + "&&" + i;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C100718j1.class;
        if (yVar != null) {
            int i3 = 1;
            Log.m105925i("MicroMsg.Fav.FavEditService", "on edit service scene end, errType=%d errCode=%d, %s, scene type %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
            if (yVar.getType() == 401) {
                Log.m105924i("MicroMsg.Fav.FavEditService", "on add fav item scene end, try mod item");
                C86709a0.m107525e().postToWorker(new C102413r(this));
                return;
            }
            C100739r1 r1Var = (C100739r1) yVar;
            if (r1Var.f295139g != 0) {
                int i4 = -1;
                long j = -1;
                if (i == 0 && i2 == 0) {
                    C35443x xVar = r1Var.f295140h;
                    String b = m135135b(xVar == null ? -1 : xVar.field_localId, xVar == null ? -1 : xVar.field_type);
                    Log.m105925i("MicroMsg.Fav.FavEditService", "clear job, key %s", b);
                    ((HashMap) this.f301645d).remove(b);
                    C100738r0 a102 = ((C100718j1) C86312j.m106911c(cls)).a10();
                    C35443x xVar2 = r1Var.f295140h;
                    long j2 = xVar2 == null ? -1 : xVar2.field_localId;
                    if (xVar2 != null) {
                        i4 = xVar2.field_type;
                    }
                    ((C102613c) a102).f302174d.delete("FavEditInfo", "localId=? and type=?", new String[]{String.valueOf(j2), String.valueOf(i4)});
                    C100751w0 Jq = ((C100718j1) C86312j.m106911c(cls)).mo128199Jq();
                    C35443x xVar3 = r1Var.f295140h;
                    if (xVar3 != null) {
                        j = xVar3.field_localId;
                    }
                    C100755z Yt = ((C102614d) Jq).mo142266Yt(j);
                    if (Yt != null) {
                        long j3 = (long) Yt.field_id;
                        int size = Yt.field_tagProto.f186495e.size();
                        C35443x xVar4 = r1Var.f295140h;
                        if (xVar4 != null) {
                            i3 = xVar4.field_scene;
                        }
                        C100695a0.m131730e(j3, size, i3);
                        return;
                    }
                    return;
                }
                C35443x xVar5 = r1Var.f295140h;
                if (xVar5 != null) {
                    j = xVar5.field_localId;
                }
                if (xVar5 != null) {
                    i4 = xVar5.field_type;
                }
                String b2 = m135135b(j, i4);
                Log.m105925i("MicroMsg.Fav.FavEditService", "retry job, key %s", b2);
                C102416a aVar = (C102416a) ((HashMap) this.f301645d).get(b2);
                if (aVar == null) {
                    Log.m105929w("MicroMsg.Fav.FavEditService", "want to retry mod item, localid %d, type %d", Long.valueOf(j), Integer.valueOf(i4));
                } else {
                    C86709a0.m107525e().postToWorkerDelayed(new C102414s(this, aVar), 3000);
                }
            }
        }
    }
}
