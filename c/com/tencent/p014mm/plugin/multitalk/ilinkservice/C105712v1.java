package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.nd4;
import te3.od4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.v1 */
public class C105712v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f314297d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f314298e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314299f;

    public C105712v1(C105724z zVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f314299f = zVar;
        this.f314297d = arrayList;
        this.f314298e = arrayList2;
    }

    public void run() {
        int i = this.f314299f.f314401n;
        if (i != 1) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", Integer.valueOf(i));
            return;
        }
        LinkedList<od4> linkedList = new LinkedList<>();
        LinkedList<od4> linkedList2 = new LinkedList<>();
        Iterator it = this.f314297d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C105683r b = this.f314299f.f314388f.mo150550b(str);
            if (b != null) {
                int i2 = b.f314237a;
                od4 od4 = new od4();
                od4.f332187d = i2;
                od4.f332188e = 480;
                int p = this.f314299f.mo150606p(i2);
                if (p == 102 || p == 101) {
                    od4.f332188e = 240;
                    linkedList2.add(od4);
                } else {
                    linkedList.add(od4);
                }
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeByUserList, small memberId:%d,memberName:%s,len:%d", Integer.valueOf(i2), str, Integer.valueOf(od4.f332188e));
            }
        }
        Iterator it4 = this.f314298e.iterator();
        while (it4.hasNext()) {
            String str2 = (String) it4.next();
            C105683r b2 = this.f314299f.f314388f.mo150550b(str2);
            if (b2 != null) {
                int i3 = b2.f314237a;
                od4 od42 = new od4();
                od42.f332187d = i3;
                od42.f332188e = 640;
                int p2 = this.f314299f.mo150606p(i3);
                if (p2 == 102 || p2 == 101) {
                    od42.f332188e = 1920;
                    linkedList2.add(od42);
                } else {
                    linkedList.add(od42);
                }
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeByUserList, small memberId:%d,memberName:%s,len:%d", Integer.valueOf(i3), str2, Integer.valueOf(od42.f332188e));
            }
        }
        nd4 nd4 = this.f314299f.f314404o1;
        nd4.f332183d = linkedList;
        nd4.f332184e = linkedList2;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: subscribeByUsernames, videoMembers %s", nd4);
        C105714w.m141919d(this.f314299f.f314404o1);
    }
}
