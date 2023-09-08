package tc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.sdk.platformtools.Log;
import g62.C75880o;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.y$$d;
import qe3.C89631w;
import te3.C48684a93;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51024qx;
import te3.C52232z83;

/* renamed from: tc0.d */
public class C48623d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f130153d;

    /* renamed from: e */
    public C48624a f130154e;

    /* renamed from: f */
    public final List<C75880o> f130155f;

    /* renamed from: tc0.d$a */
    public static class C48624a extends C117746w {

        /* renamed from: a */
        public final C48625b f130156a = new C48625b();

        /* renamed from: b */
        public final C48626c f130157b = new C48626c();

        public C89631w.C89634d getReqObjImp() {
            return this.f130156a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f130157b;
        }

        public int getType() {
            return C1805j.CTRL_INDEX;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/oplog";
        }
    }

    /* renamed from: tc0.d$b */
    public static class C48625b extends C89631w.C89634d implements C89631w.C89633b {

        /* renamed from: a */
        public C52232z83 f130158a = new C52232z83();

        public int getFuncId() {
            return C1805j.CTRL_INDEX;
        }

        public byte[] toProtoBuf() {
            return this.f130158a.toByteArray();
        }
    }

    /* renamed from: tc0.d$c */
    public static class C48626c extends C89631w.C89636e implements C89631w.C89635c {

        /* renamed from: a */
        public C48684a93 f130159a = new C48684a93();

        public int fromProtoBuf(byte[] bArr) {
            C48684a93 a932 = (C48684a93) new C48684a93().parseFrom(bArr);
            this.f130159a = a932;
            return a932.f130390d;
        }
    }

    public C48623d(List<C75880o> list) {
        ArrayList arrayList = new ArrayList();
        this.f130155f = arrayList;
        arrayList.addAll(list);
        C48624a aVar = new C48624a();
        this.f130154e = aVar;
        C52232z83 z832 = ((C48625b) aVar.getReqObj()).f130158a;
        C51024qx qxVar = new C51024qx();
        for (C75880o next : list) {
            byte[] a = next.mo106149a();
            C50886px pxVar = new C50886px();
            pxVar.f140037d = next.mo58568b();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(a);
            pxVar.f140038e = qv32;
            qxVar.f140594e.add(pxVar);
        }
        qxVar.f140593d = list.size();
        Log.m105918d("MicroMsg.NetSceneOplog", "summeroplog oplogs size=" + list.size());
        z832.f145765d = qxVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f130153d = nVar;
        return dispatch(gVar, this.f130154e, this);
    }

    public int getType() {
        return C1805j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f130153d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 5;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
