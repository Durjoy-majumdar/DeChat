package tg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ik1.C33345k;
import ik1.C33353m;
import java.util.Vector;
import js3.C33659a;
import o40.C61926c;
import p565ir.C60606n;
import p749xh.C38624o3;

/* renamed from: tg1.f */
public final class C37102f implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C38624o3 f98279a;

    public C37102f(C38624o3 o3Var) {
        this.f98279a = o3Var;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        C33345k b;
        C37095e eVar = C37095e.f98274a;
        Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert callback, " + C61926c.m72691p(j) + ", status:" + i + ", sourceType:" + this.f98279a.field_sourceType);
        if (i == 1 && (b = C37095e.m41219b(C37095e.f98274a)) != null) {
            C38624o3 o3Var = this.f98279a;
            C87412m.m108594g(o3Var, "item");
            boolean insert = b.insert(o3Var);
            if (insert) {
                Vector<C38624o3> vector = C33345k.f90389i;
                synchronized (vector) {
                    C61926c.m72674S(vector, new C33353m(o3Var));
                    vector.add(o3Var);
                }
            }
            String str = C33345k.f90387g;
            Log.m105924i(str, "insertLiveTipsBar " + o3Var.field_hostRoomId + ", " + C61926c.m72691p(o3Var.field_liveId) + " result:" + insert);
            C33659a aVar = b.f90393e;
            if (aVar != null) {
                String str2 = o3Var.field_hostRoomId;
                C87412m.m108593f(str2, "item.field_hostRoomId");
                aVar.mo59247a(str2);
            }
            String str3 = o3Var.field_hostRoomId;
            C87412m.m108593f(str3, "item.field_hostRoomId");
            b.mo59089qq(str3);
        }
    }
}
