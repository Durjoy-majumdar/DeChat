package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import hp3.C87581a;
import ht1.C60216z4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49724hm1;
import te3.C51137rp0;

/* renamed from: er1.j3 */
public final class C7820j3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C60216z4.C8821a<Integer> f26344a;

    /* renamed from: b */
    public final /* synthetic */ int f26345b;

    /* renamed from: c */
    public final /* synthetic */ C60216z4.C8821a<Integer> f26346c;

    public C7820j3(C60216z4.C8821a<Integer> aVar, int i, C60216z4.C8821a<Integer> aVar2) {
        this.f26344a = aVar;
        this.f26345b = i;
        this.f26346c = aVar2;
    }

    public Object call(Object obj) {
        LinkedList<C49724hm1> linkedList;
        T t;
        boolean z;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            HashMap<Integer, Integer> hashMap = C7825k3.f26362a;
            C51137rp0 rp02 = (C51137rp0) cVar.f256796d;
            C7825k3.f26363b = rp02 != null ? rp02.f141070e : 300;
            if (!(rp02 == null || (linkedList = rp02.f141069d) == null)) {
                int i = this.f26345b;
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C49724hm1) t).f134729f == i) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C49724hm1 hm12 = (C49724hm1) t;
                if (hm12 != null) {
                    int i2 = this.f26345b;
                    C60216z4.C8821a<Integer> aVar = this.f26346c;
                    HashMap<Integer, Integer> hashMap2 = C7825k3.f26362a;
                    int i3 = hm12.f134727d;
                    Log.m105924i("Finder.FinderSvrExptManager", "setHitCache, exptId:" + i2 + ", value:" + i3);
                    if (i2 == 1) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, Integer.valueOf(i3));
                    }
                    if (aVar != null) {
                        aVar.mo6382a(Integer.valueOf(hm12.f134727d));
                    }
                }
            }
        } else {
            C60216z4.C8821a<Integer> aVar2 = this.f26344a;
            if (aVar2 != null) {
                aVar2.mo6382a(Integer.valueOf(cVar.f256794b));
            }
        }
        int i4 = cVar.f256793a;
        if ((i4 == 0 && cVar.f256794b == 0) || i4 == 4) {
            C7825k3.f26362a.put(Integer.valueOf(this.f26345b), Integer.valueOf(C31543z5.m39455e()));
        }
        return C13598b0.f38549a;
    }
}
