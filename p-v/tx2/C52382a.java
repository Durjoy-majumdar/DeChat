package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49113d90;
import te3.C49250e90;
import te3.ff4;
import te3.gf4;

/* renamed from: tx2.a */
public class C52382a extends C52387f {

    /* renamed from: d */
    public C11385n f146414d;

    /* renamed from: e */
    public final C47350c f146415e;

    /* renamed from: f */
    public final String f146416f;

    /* renamed from: g */
    public int f146417g;

    /* renamed from: h */
    public long f146418h;

    /* renamed from: i */
    public int f146419i;

    /* renamed from: j */
    public int f146420j;

    /* renamed from: n */
    public LinkedList<gf4> f146421n;

    /* renamed from: o */
    public LinkedList<ff4> f146422o;

    /* renamed from: p */
    public int f146423p;

    public C52382a(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f146423p = i;
        bVar.f127066a = new C49113d90();
        bVar.f127067b = new C49250e90();
        bVar.f127068c = "/cgi-bin/micromsg-bin/entertalkroom";
        bVar.f127069d = 332;
        bVar.f127070e = 147;
        bVar.f127071f = 1000000147;
        C47350c a = bVar.mo72403a();
        this.f146415e = a;
        C47465a aVar = a.f127055a.f127080a;
        ((C49113d90) aVar).f132194d = str;
        ((C49113d90) aVar).f132195e = i;
        this.f146416f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105919d("MicroMsg.NetSceneEnterTalkRoom", "doScene %d", Integer.valueOf(this.f146423p));
        this.f146414d = nVar;
        return dispatch(gVar, this.f146415e, this);
    }

    public int getType() {
        return 332;
    }

    /* renamed from: j1 */
    public String mo73384j1() {
        return this.f146416f;
    }

    /* renamed from: k1 */
    public int mo73385k1() {
        return this.f146423p;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneEnterTalkRoom", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            C49250e90 e902 = (C49250e90) this.f146415e.f127056b.f127083a;
            Log.m105925i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", e902.toString());
            this.f146417g = e902.f132803d;
            this.f146418h = e902.f132804e;
            this.f146419i = e902.f132805f;
            this.f146420j = e902.f132808i;
            LinkedList<gf4> linkedList = e902.f132807h;
            LinkedList<gf4> linkedList2 = new LinkedList<>();
            Iterator<gf4> it = linkedList.iterator();
            while (it.hasNext()) {
                gf4 next = it.next();
                if (!Util.isNullOrNil(next.f134027e)) {
                    linkedList2.add(next);
                }
            }
            this.f146421n = linkedList2;
            LinkedList<ff4> linkedList3 = e902.f132810n;
            LinkedList<ff4> linkedList4 = new LinkedList<>();
            Iterator<ff4> it4 = linkedList3.iterator();
            while (it4.hasNext()) {
                linkedList4.add(it4.next());
            }
            this.f146422o = linkedList4;
            this.f146414d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f146414d.onSceneEnd(i2, i3, str, this);
    }
}
