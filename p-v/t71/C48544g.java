package t71;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C49507g3;
import te3.C49649h3;
import te3.C51723vp1;
import v71.C37689c;
import w71.C38028a;

/* renamed from: t71.g */
public class C48544g extends C46947a<C49507g3, C49649h3> {

    /* renamed from: f */
    public List<String> f129826f;

    /* renamed from: g */
    public ArrayList<C51723vp1> f129827g;

    /* renamed from: h */
    public final WeakReference<C46948b<C48544g>> f129828h;

    public C48544g(List<String> list, C46948b<C48544g> bVar) {
        this.f129826f = list;
        this.f129828h = new WeakReference<>(bVar);
    }

    public int getType() {
        return 1777;
    }

    public String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/addfollow";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C49507g3();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C49649h3();
    }

    /* renamed from: m1 */
    public void mo72133m1(C47465a aVar) {
        C49507g3 g3Var = (C49507g3) aVar;
        for (String add : this.f129826f) {
            g3Var.f133823d.add(add);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C46948b bVar;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105919d("MicroMsg.NetSceneAddFollow", "ap: errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C49649h3 h3Var = (C49649h3) mo72130j1();
            this.f129827g = new ArrayList<>();
            LinkedList<C51723vp1> linkedList = h3Var.f134422d;
            if (linkedList != null) {
                Iterator<C51723vp1> it = linkedList.iterator();
                while (it.hasNext()) {
                    C51723vp1 next = it.next();
                    Log.m105919d("MicroMsg.NetSceneAddFollow", "follow: index:%s step: %s username: %s", Integer.valueOf(next.f143614d), Integer.valueOf(next.f143616f), next.f143615e);
                    this.f129827g.add(next);
                }
                Log.m105919d("MicroMsg.NetSceneAddFollow", "follows: %s, %d", this.f129827g.toString(), Integer.valueOf(h3Var.f134422d.size()));
            }
            C38028a Ax0 = C41166r1.Ax0();
            ArrayList<C51723vp1> arrayList = this.f129827g;
            Ax0.getClass();
            if (arrayList != null) {
                Iterator<C51723vp1> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C51723vp1 next2 = it4.next();
                    C37689c cVar = new C37689c();
                    cVar.field_rankID = "hardcode_rank_id";
                    cVar.field_step = next2.f143616f;
                    cVar.field_username = next2.f143615e;
                    cVar.field_appusername = "hardcode_app_name";
                    Ax0.mo61486Ow(cVar);
                }
            }
        }
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        WeakReference<C46948b<C48544g>> weakReference = this.f129828h;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.mo64355a(i4, i5, str2, this);
        }
    }
}
