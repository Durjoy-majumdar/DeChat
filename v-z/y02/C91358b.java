package y02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import te3.C90430p93;
import te3.C90435r93;
import te3.C90439s93;
import te3.C90441u93;
import te3.C90448yt3;
import tw0.C90586i;
import tw0.C90587j;
import tw0.C90588k;

/* renamed from: y02.b */
public class C91358b extends C91357a {

    /* renamed from: p */
    public C90586i f262034p;

    /* renamed from: q */
    public String f262035q;

    public C91358b(C90588k kVar, C90586i iVar) {
        this.f262035q = kVar.f260282a;
        this.f262034p = iVar;
        this.f262030i = "liteappconfig_" + kVar.f260282a;
        this.f262027f = kVar.f260283b;
        this.f262028g = kVar.f260284c;
        this.f262033o = kVar.f260285d;
        this.f262029h.addAll(C91363f.m114614b());
        LinkedList<C90430p93> linkedList = this.f262029h;
        C90430p93 p932 = new C90430p93();
        p932.f259737d = "package_id";
        p932.f259738e = "wechat-android";
        linkedList.add(p932);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(24470, this.f262030i, kVar.f260282a, Integer.valueOf(this.f262033o), Boolean.FALSE);
        nVar.mo175911u(1821, 2);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C90587j jVar;
        Log.m105925i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C90435r93 r932 = (C90435r93) ((C47350c) uVar).f127056b.f127083a;
            C90441u93 u932 = r932.f259789d;
            Log.m105918d("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "node is no empty. try to process");
            jVar = new C90587j();
            if (u932 != null) {
                C90448yt3 yt32 = u932.f259857i;
                if (yt32 != null) {
                    jVar.f260273e = yt32.f259943d;
                    jVar.f260272d = yt32.f259945f;
                    jVar.f260276h = yt32.f259950n;
                }
                jVar.f260270b = Integer.valueOf(u932.f259853e);
                jVar.f260271c = Integer.valueOf(u932.f259855g);
                jVar.f260274f = u932.f259852d;
                jVar.f260269a = this.f262035q;
                LinkedList<C90439s93> linkedList = u932.f259859n;
                if (linkedList != null) {
                    Iterator<C90439s93> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C90439s93 next = it.next();
                        if ("signature_key".equals(next.f259833d)) {
                            jVar.f260275g = next.f259834e;
                        }
                    }
                }
            }
            jVar.f260277i = r932.f259794i;
        } else {
            Log.m105918d("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "check tinker update failed.");
            jVar = new C90587j();
            jVar.f260277i = -1;
        }
        this.f262034p.mo122088b(jVar);
        this.f262026e.onSceneEnd(i2, i3, str, this);
    }
}
