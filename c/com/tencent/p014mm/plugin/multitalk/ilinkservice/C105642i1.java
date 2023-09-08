package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C64407gz;
import te3.C64433hz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.i1 */
public class C105642i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64433hz f314133d;

    /* renamed from: e */
    public final /* synthetic */ int f314134e;

    /* renamed from: f */
    public final /* synthetic */ C105724z.C105726c f314135f;

    public C105642i1(C105724z.C105726c cVar, C64433hz hzVar, int i) {
        this.f314135f = cVar;
        this.f314133d = hzVar;
        this.f314134e = i;
    }

    public void run() {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "update avmembers, imroomid:%d roomid:%d memberList:%s", Long.valueOf(this.f314133d.f183568d), Long.valueOf(this.f314133d.f183569e), this.f314133d.f183570f);
        if (C105724z.this.f314401n != 1) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: not in room. do not notify");
        } else if (this.f314134e == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C64407gz> it = this.f314133d.f183570f.iterator();
            while (it.hasNext()) {
                C64407gz next = it.next();
                if ((next.f183379e & 2) != 0) {
                    arrayList.add(Integer.valueOf(next.f183378d));
                }
                int i = next.f183379e;
                if ((i & 4) != 0 || (i & 8) != 0) {
                    arrayList2.add(Integer.valueOf(next.f183378d));
                }
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "avmemberchange, mid:%d, avstatus:%d", Integer.valueOf(next.f183378d), Integer.valueOf(next.f183379e));
            }
            C105724z zVar = C105724z.this;
            if (!zVar.f314402n1) {
                zVar.f314406p0.mo150492e(zVar.f314388f, this.f314133d.f183570f);
            }
            C105724z zVar2 = C105724z.this;
            LinkedList<C64407gz> linkedList = this.f314133d.f183570f;
            zVar2.f314399l1 = linkedList;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "update avmembers, cachedMemberList:%s", linkedList);
        } else {
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: invalid avmember list change. will ignore");
        }
    }
}
