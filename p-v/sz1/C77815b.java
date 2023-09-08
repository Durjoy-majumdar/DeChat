package sz1;

import android.util.Pair;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import wz1.C78747b;
import wz1.C78753c;
import wz1.C78757e;
import xz1.C79013a;
import xz1.C79015c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: sz1.b */
public class C77815b extends C86301e {

    /* renamed from: d */
    public C78753c f226689d = null;

    /* renamed from: e */
    public C79015c f226690e = null;

    /* renamed from: f */
    public C78757e f226691f = null;

    public C78753c vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f226689d == null) {
            this.f226689d = new C78753c();
        }
        return this.f226689d;
    }

    public C78757e wx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f226691f == null) {
            this.f226691f = new C78757e();
        }
        return this.f226691f;
    }

    public C79015c xx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f226690e == null) {
            C86709a0.m107528h();
            this.f226690e = new C79015c(C86709a0.m107535s().f251811i);
        }
        return this.f226690e;
    }

    public void yx0(String str, String str2, C79013a aVar, C79013a aVar2, C79013a aVar3, boolean z) {
        Class cls = C77815b.class;
        if (aVar2 != null) {
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195570f = str;
            bVar.f195582i = 53;
            bVar.f195637v2 = new Pair<>(aVar2.field_key, C78747b.m95101a(str, aVar2, false));
            Pair<Integer, Long> qE = C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", str2, "", (byte[]) null);
            if (z && qE != null) {
                ((C77815b) C86312j.m106911c(cls)).wx0().mo108680a(((Long) qE.second).longValue(), aVar2, aVar3, true, 1);
            } else if (!z) {
                ((C77815b) C86312j.m106911c(cls)).wx0().mo108688i(aVar2, aVar3, 1);
            }
            if (qE != null) {
                C78747b.m95100L(((Long) qE.second).longValue(), C75592q0.m90789s(), aVar);
            }
            Log.m105925i("MicroMsg.groupsolitaire.PluginGroupSolitaire", "sendGroupSolitatire() content ret:%s", qE);
        }
    }
}
