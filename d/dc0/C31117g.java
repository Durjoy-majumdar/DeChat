package dc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50051jy1;

/* renamed from: dc0.g */
public class C31117g implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ int f83443d;

    /* renamed from: e */
    public final /* synthetic */ C31113d f83444e;

    public C31117g(C31113d dVar, int i) {
        this.f83444e = dVar;
        this.f83443d = i;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (yVar.getType() != 182) {
            return 0;
        }
        C31113d dVar = this.f83444e;
        dVar.f83415a = false;
        if (i == 0 && i2 == 0) {
            if (!dVar.f83418d.isEmpty() && this.f83444e.f83422h.stopped()) {
                this.f83444e.f83422h.startTimer(500);
            }
            if (cVar != null) {
                C31113d dVar2 = this.f83444e;
                d$$g d__g = new d$$g(dVar2);
                d__g.f83438c = this.f83443d;
                d__g.f83436a = (C50051jy1) cVar.f127056b.f127083a;
                ((LinkedList) dVar2.f83419e).add(d__g);
            }
            if (!this.f83444e.f83419e.isEmpty() && this.f83444e.f83423i.stopped()) {
                this.f83444e.f83423i.startTimer(50);
            }
            return 0;
        }
        Log.m105920e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd errType:" + i + " errCode:" + i2 + " getScene:" + this.f83443d + " will retry");
        this.f83444e.f83422h.startTimer(10000);
        return 0;
    }
}
