package n81;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j81.C87906e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51651v60;
import te3.C51789w60;
import te3.C51930x60;
import te3.C52073y60;
import u24.C90599h;
import w81.C90900a;
import x81.C118864a;
import x81.C53297c;

/* renamed from: n81.a */
public class C47206a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126762d;

    /* renamed from: e */
    public List<C51789w60> f126763e;

    /* renamed from: f */
    public C53297c f126764f;

    public C47206a(List<C51789w60> list, C53297c cVar) {
        this.f126763e = list;
        this.f126764f = cVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126762d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51930x60();
        bVar.f127067b = new C52073y60();
        bVar.f127068c = "/cgi-bin/mmfddataecappsvr/edgerealtimereport";
        bVar.f127069d = 4871;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        ((C51930x60) a.f127055a.f127080a).f144482d.addAll(this.f126763e);
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 4871;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<String> linkedList;
        boolean z = false;
        Log.m105925i("MicroMsg.NetSceneEdgeComputingRtReport", "[onGYNetEnd] netId[%d] errType[%d] errCode[%d] errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C52073y60 y602 = (C52073y60) ((C47350c) uVar).f127056b.f127083a;
            C53297c cVar = this.f126764f;
            long j = y602.f145137d;
            LinkedList<C51651v60> linkedList2 = y602.f145138e;
            List<C51789w60> list = this.f126763e;
            C118864a aVar = (C118864a) cVar;
            aVar.getClass();
            MultiProcessMMKV f = C87906e.m109412f();
            if (f != null) {
                f.putLong("mmkv_key_realtime_report_period", j);
            }
            aVar.f355575b = j;
            if (!(linkedList2 == null || list == null)) {
                for (C51651v60 next : linkedList2) {
                    Iterator<C51789w60> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C51789w60 next2 = it.next();
                        if (C90599h.m113509b(next2.f143875d, next.f143339d) && next2.f143876e == next.f143340e) {
                            if (next.f143341f != 0 && (linkedList = next2.f143877f) != null) {
                                Iterator<String> it4 = linkedList.iterator();
                                while (it4.hasNext()) {
                                    C115669n.INSTANCE.kvStat(next2.f143876e, it4.next());
                                }
                                Log.m105920e("EdgeComputingReporter", "report realtimeReport svr reject configID : " + next2.f143875d + ", logID : " + next2.f143876e + ", dropFlag : " + next.f143341f + ", contents size : " + next2.f143877f.size());
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    C90900a.m114031d(5);
                } else {
                    C90900a.m114031d(4);
                }
            }
            C90900a.m114031d(2);
        } else {
            C53297c cVar2 = this.f126764f;
            List<C51789w60> list2 = this.f126763e;
            ((C118864a) cVar2).getClass();
            if (list2 != null && list2.size() > 0) {
                for (C51789w60 next3 : list2) {
                    Iterator<String> it5 = next3.f143877f.iterator();
                    while (it5.hasNext()) {
                        C115669n.INSTANCE.kvStat(next3.f143876e, it5.next());
                    }
                }
                C90900a.m114031d(3);
            }
        }
        this.f126762d.onSceneEnd(i2, i3, str, this);
    }
}
