package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import p261wl.C38166b;
import p763ym.C53538j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.f */
public class C44552f implements C11385n, C53538j {

    /* renamed from: d */
    public Map<Integer, Set<C44583u0>> f120819d = new HashMap();

    public C44552f() {
        C86709a0.m107529k().f251779b.mo123455a(452, this);
    }

    /* renamed from: a */
    public void mo69347a(int i, C44583u0 u0Var) {
        MMHandlerThread.postToMainThread(new f$$b(this, i, u0Var));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C44551e1)) {
            Log.m105924i("MicroMsg.AppCenterNetSceneService", "onSceneEnd, the scene is not a instance of NetSceneAppCenter");
            return;
        }
        C44551e1 e1Var = (C44551e1) yVar;
        Set set = (Set) ((HashMap) this.f120819d).get(Integer.valueOf(e1Var.f120817f));
        if (set != null && set.size() > 0) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C44583u0 u0Var = (C44583u0) it.next();
                if (u0Var != null && set.contains(u0Var)) {
                    u0Var.mo69343c3(i, i2, str, e1Var.f120818g);
                }
            }
        }
        C38166b.m41756c(C44587y0.class, Integer.valueOf(e1Var.f120817f), new f$$a(i, i2, str, e1Var));
    }
}
