package ag2;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: ag2.i0 */
public class C27895i0 implements C11385n {

    /* renamed from: d */
    public HashMap<Long, Integer> f77059d = new HashMap<>();

    /* renamed from: e */
    public HashMap<Long, String> f77060e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, Integer> f77061f = new HashMap<>();

    /* renamed from: g */
    public int f77062g = 0;

    public C27895i0() {
        new HashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        new HashMap();
        new ArrayList();
        new HashMap();
        C86709a0.m107529k().f251779b.mo123455a(483, this);
        C86709a0.m107529k().f251779b.mo123455a(484, this);
        C86709a0.m107529k().f251779b.mo123455a(485, this);
    }

    /* renamed from: a */
    public final ArrayList<Long> mo55672a(HashMap<Long, Integer> hashMap) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (Long add : hashMap.keySet()) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo55673b(C27901w wVar) {
        int i = this.f77062g + 1;
        this.f77062g = i;
        Log.m105925i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", Integer.valueOf(i));
        Iterator<C39583h> it = ((C39571d) wVar.f77073e.f127056b.f127083a).f106227e.iterator();
        while (it.hasNext()) {
            C39583h next = it.next();
            long j = (long) next.f106251d;
            int i2 = next.f106253f;
            if (this.f77059d.containsKey(Long.valueOf(j))) {
                Log.m105925i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", Long.valueOf(j), Integer.valueOf(i2));
                if (i2 == 0) {
                    this.f77059d.remove(Long.valueOf(j));
                    if (next.f106252e != null) {
                        Log.m105925i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", Long.valueOf(j), next.f106252e);
                        this.f77060e.put(Long.valueOf(j), next.f106252e);
                        this.f77061f.put(next.f106252e, Integer.valueOf(next.f106254g));
                    }
                } else {
                    this.f77059d.put(Long.valueOf(j), Integer.valueOf(i2));
                }
            }
        }
        if (this.f77059d.isEmpty()) {
            Log.m105924i("MicroMsg.ShareModeMailAppService", "all image is in server");
        } else if (this.f77062g < 3) {
            Log.m105924i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
            C86709a0.m107529k().f251779b.mo123460f(new C27901w(mo55672a(this.f77059d)));
        } else {
            mo55672a(this.f77059d);
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 0 || i2 != 0) {
            Log.m105921e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (yVar.getType() == 483) {
                mo55673b((C27901w) yVar);
            }
        } else if (yVar.getType() == 483) {
            mo55673b((C27901w) yVar);
        } else if (yVar.getType() == 484) {
            C39567b0 b0Var = (C39567b0) yVar;
        } else if (yVar.getType() == 485) {
            C39601x xVar = (C39601x) yVar;
        }
    }
}
