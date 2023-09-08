package t71;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C49974jc2;
import te3.C50111kc2;
import te3.C52292zp1;

/* renamed from: t71.l */
public class C48550l extends C46947a<C49974jc2, C50111kc2> {

    /* renamed from: f */
    public List<String> f129867f;

    /* renamed from: g */
    public List<String> f129868g;

    /* renamed from: h */
    public List<String> f129869h;

    /* renamed from: i */
    public final WeakReference<C46948b<C48550l>> f129870i;

    public C48550l(C46948b<C48550l> bVar) {
        this.f129870i = new WeakReference<>(bVar);
    }

    public int getType() {
        return 1758;
    }

    public String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C49974jc2();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C50111kc2();
    }

    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo72133m1(C47465a aVar) {
        C49974jc2 jc22 = (C49974jc2) aVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C75700k0.class;
        Log.m105919d("MicroMsg.NetSceneGetWeRunFollowerList", "ap: errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C50111kc2 kc22 = (C50111kc2) mo72130j1();
            this.f129869h = new ArrayList();
            Iterator<String> it = kc22.f136664d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69724s3(next)) {
                    this.f129869h.add(next);
                }
            }
            this.f129867f = new ArrayList();
            this.f129868g = new ArrayList();
            LinkedList<C52292zp1> linkedList = kc22.f136665e;
            if (linkedList != null) {
                Iterator<C52292zp1> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C52292zp1 next2 = it4.next();
                    if (next2.f146172e) {
                        this.f129868g.add(next2.f146171d);
                    }
                    if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69724s3(next2.f146171d)) {
                        this.f129867f.add(next2.f146171d);
                    }
                }
            }
            Log.m105919d("MicroMsg.NetSceneGetWeRunFollowerList", "follow:%s %s", Integer.valueOf(this.f129868g.size()), this.f129868g.toString());
            Log.m105919d("MicroMsg.NetSceneGetWeRunFollowerList", "all follow:%s %s", Integer.valueOf(this.f129867f.size()), this.f129867f);
        }
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        WeakReference<C46948b<C48550l>> weakReference = this.f129870i;
        if (weakReference != null) {
            C46948b bVar = weakReference.get();
            if (bVar != null) {
                Log.m105918d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is not null");
                bVar.mo64355a(i2, i3, str, this);
                return;
            }
            Log.m105918d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is null");
        }
    }
}
