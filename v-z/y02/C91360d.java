package y02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import te3.C90430p93;
import te3.C90432q93;
import te3.C90435r93;
import te3.C90439s93;
import te3.C90441u93;
import te3.C90448yt3;
import tw0.C90586i;
import tw0.C90587j;
import tw0.C90588k;

/* renamed from: y02.d */
public class C91360d extends C91357a {

    /* renamed from: p */
    public C90586i f262038p;

    /* renamed from: q */
    public List<C90588k> f262039q;

    public C91360d(List<C90588k> list, C90586i iVar) {
        this.f262039q = list;
        this.f262038p = iVar;
        this.f262032n = 2;
        this.f262028g = "";
        this.f262027f = "";
        this.f262030i = "";
        this.f262033o = 0;
        for (C90588k next : list) {
            C90432q93 q932 = new C90432q93();
            q932.f259754d = next.f260283b;
            q932.f259755e = next.f260284c;
            q932.f259758h = "liteappconfig_" + next.f260282a;
            q932.f259760j = 2;
            q932.f259761n = next.f260285d;
            q932.f259759i = new LinkedList<>();
            LinkedList<C90430p93> linkedList = new LinkedList<>();
            q932.f259756f = linkedList;
            linkedList.addAll(C91363f.m114614b());
            LinkedList<C90430p93> linkedList2 = q932.f259756f;
            C90430p93 p932 = new C90430p93();
            p932.f259737d = "package_id";
            p932.f259738e = "wechat-android";
            linkedList2.add(p932);
            this.f262031j.add(q932);
        }
        C115669n.INSTANCE.mo175911u(1821, 2);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", Integer.valueOf(i2), Integer.valueOf(i3), str);
        ArrayList arrayList = new ArrayList();
        if (i2 == 0 && i3 == 0) {
            Iterator<C90435r93> it = ((C90435r93) ((C47350c) uVar).f127056b.f127083a).f259793h.iterator();
            while (it.hasNext()) {
                C90435r93 next = it.next();
                C90441u93 u932 = next.f259789d;
                C90587j jVar = new C90587j();
                if (u932 != null) {
                    C90448yt3 yt32 = u932.f259857i;
                    if (yt32 != null) {
                        jVar.f260273e = yt32.f259943d;
                        jVar.f260272d = yt32.f259945f;
                        jVar.f260276h = yt32.f259950n;
                    } else {
                        LinkedList<C90448yt3> linkedList = u932.f259861p;
                        if (linkedList != null && linkedList.size() > 0) {
                            C90448yt3 first = u932.f259861p.getFirst();
                            jVar.f260273e = first.f259943d;
                            jVar.f260272d = first.f259945f;
                            jVar.f260276h = first.f259950n;
                        }
                    }
                    jVar.f260270b = Integer.valueOf(u932.f259853e);
                    jVar.f260271c = Integer.valueOf(u932.f259855g);
                    jVar.f260274f = u932.f259852d;
                    LinkedList<C90439s93> linkedList2 = u932.f259859n;
                    if (linkedList2 != null) {
                        Iterator<C90439s93> it4 = linkedList2.iterator();
                        while (it4.hasNext()) {
                            C90439s93 next2 = it4.next();
                            if ("signature_key".equals(next2.f259833d)) {
                                jVar.f260275g = next2.f259834e;
                            }
                        }
                    }
                }
                jVar.f260269a = next.f259790e;
                jVar.f260277i = next.f259794i;
                arrayList.add(jVar);
            }
        } else {
            Log.m105918d("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "check tinker update failed.");
            for (C90588k kVar : this.f262039q) {
                C90587j jVar2 = new C90587j();
                jVar2.f260269a = kVar.f260282a;
                jVar2.f260277i = -1;
                arrayList.add(jVar2);
            }
        }
        if (this.f262039q.size() > arrayList.size()) {
            HashSet hashSet = new HashSet();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                hashSet.add(((C90587j) it5.next()).f260269a);
            }
            for (C90588k next3 : this.f262039q) {
                if (!hashSet.contains(next3.f260282a)) {
                    C90587j jVar3 = new C90587j();
                    jVar3.f260269a = next3.f260282a;
                    jVar3.f260277i = -1;
                    arrayList.add(jVar3);
                }
            }
        }
        this.f262038p.mo122087a(arrayList);
        this.f262026e.onSceneEnd(i2, i3, str, this);
    }
}
