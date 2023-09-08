package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8794p5;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je1.C60815y3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89137b0;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C64313dg1;
import zc1.C66785b;

/* renamed from: ne1.z0 */
public abstract class C61685z0<T> extends C86301e implements C11385n {

    /* renamed from: d */
    public final LinkedHashMap<T, WeakReference<C8794p5<T>>> f175382d = new LinkedHashMap<>();

    public static void Ax0(C61685z0 z0Var, Object obj, C8794p5 p5Var, boolean z, boolean z2, int i, Object obj2) {
        if (obj2 == null) {
            boolean z3 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                z2 = false;
            }
            synchronized (z0Var.f175382d) {
                C50401mh0 mh02 = new C50401mh0();
                mh02.f138028d = z0Var.xx0();
                mh02.f138029e = z0Var.vx0(obj);
                z0Var.f175382d.put(obj, new WeakReference(p5Var));
                C89137b0 d = C86709a0.m107524d();
                C60815y3 y3Var = new C60815y3(C66785b.f191882e.mo90662O5(), C26236u.m33719b(mh02), z3, 0, (String) null, 24, (C8480h) null);
                y3Var.f173212o = z2;
                d.mo123460f(y3Var);
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryDoNext");
    }

    public static void wx0(C61685z0 z0Var, C8794p5 p5Var, Object obj, C50542nh0 nh02, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                nh02 = new C50542nh0();
                nh02.f138602d = z0Var.xx0();
                nh02.f138603e = -1;
            }
            z0Var.getClass();
            if (p5Var != null) {
                p5Var.mo705c5(obj, nh02);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doCallback");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object obj;
        C8794p5 p5Var;
        Log.m105924i(yx0(), "errType " + i + " errCode " + i2 + " errMsg " + str);
        if (yVar instanceof C60815y3) {
            C60815y3 y3Var = (C60815y3) yVar;
            List<C50542nh0> l1 = y3Var.mo85733l1();
            C47350c cVar = y3Var.f173208h;
            C87412m.m108591d(cVar);
            C47465a aVar = cVar.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogRequest");
            LinkedList<C50401mh0> linkedList = ((C64313dg1) aVar).f182704e;
            C87412m.m108593f(linkedList, "rr!!.requestProtoBuf as …nderOplogRequest).cmdList");
            Iterator<C50401mh0> it = linkedList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it.next().f138028d == xx0()) {
                    break;
                }
                i3++;
            }
            Object obj2 = null;
            if (i3 < 0) {
                String yx02 = yx0();
                StringBuilder sb = new StringBuilder();
                sb.append("not cares cmdId: ");
                C50401mh0 mh02 = (C50401mh0) C110818d0.m150916N(linkedList);
                if (mh02 != null) {
                    obj2 = Integer.valueOf(mh02.f138028d);
                }
                sb.append(obj2);
                Log.m105924i(yx02, sb.toString());
                return;
            }
            String yx03 = yx0();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("retList ");
            LinkedList linkedList2 = (LinkedList) l1;
            sb4.append(linkedList2.size());
            Log.m105924i(yx03, sb4.toString());
            synchronized (this.f175382d) {
                if (!this.f175382d.isEmpty()) {
                    Iterator<Map.Entry<T, WeakReference<C8794p5<T>>>> it4 = this.f175382d.entrySet().iterator();
                    Map.Entry next = it4.next();
                    obj = next.getKey();
                    Object obj3 = ((WeakReference) next.getValue()).get();
                    it4.remove();
                    obj2 = obj3;
                } else {
                    obj = null;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (obj2 == null) {
                Log.m105924i("NetSceneFinderOplog", "callback is null");
            }
            if (i == 0 && i2 == 0) {
                Iterator<C50542nh0> it5 = l1.iterator();
                int i4 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (it5.next().f138602d == xx0()) {
                        break;
                    }
                    i4++;
                }
                if (!(i4 == -1 || obj == null)) {
                    Log.m105924i("NetSceneFinderOplog", "handleUpdateResult " + ((C50542nh0) linkedList2.get(i4)).f138603e);
                    zx0(obj, ((C50542nh0) linkedList2.get(i4)).f138603e);
                    C8794p5 p5Var2 = (C8794p5) obj2;
                    if (p5Var2 != null) {
                        p5Var2.mo705c5(obj, (C50542nh0) linkedList2.get(i4));
                    }
                }
            } else if (!(obj == null || (p5Var = (C8794p5) obj2) == null)) {
                C50542nh0 nh02 = new C50542nh0();
                nh02.f138602d = xx0();
                nh02.f138603e = -1;
                p5Var.mo705c5(obj, nh02);
            }
            synchronized (this.f175382d) {
                if (!this.f175382d.isEmpty()) {
                    Map.Entry next2 = this.f175382d.entrySet().iterator().next();
                    Ax0(this, next2.getKey(), (C8794p5) ((WeakReference) next2.getValue()).get(), false, false, 12, (Object) null);
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    public abstract C89349b vx0(T t);

    public abstract int xx0();

    public abstract String yx0();

    public abstract void zx0(T t, int i);
}
