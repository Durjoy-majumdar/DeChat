package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.nd4;
import te3.od4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.w1 */
public class C105716w1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f314306d;

    /* renamed from: e */
    public final /* synthetic */ boolean f314307e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314308f;

    public C105716w1(C105724z zVar, ArrayList arrayList, boolean z) {
        this.f314308f = zVar;
        this.f314306d = arrayList;
        this.f314307e = z;
    }

    public void run() {
        int i = this.f314308f.f314401n;
        if (i != 1) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", Integer.valueOf(i));
            return;
        }
        ArrayList arrayList = this.f314306d;
        if (arrayList == null) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", Integer.valueOf(i));
        } else if (arrayList.size() != 1 || this.f314307e) {
            int i2 = this.f314307e ? 640 : 480;
            LinkedList<od4> linkedList = new LinkedList<>();
            LinkedList<od4> linkedList2 = new LinkedList<>();
            Iterator it = this.f314306d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C105683r b = this.f314308f.f314388f.mo150550b(str);
                if (b != null) {
                    int i3 = b.f314237a;
                    od4 od4 = new od4();
                    od4.f332187d = i3;
                    od4.f332188e = i2;
                    int p = this.f314308f.mo150606p(i3);
                    if (p == 102 || p == 101) {
                        od4.f332188e = 240;
                        linkedList2.add(od4);
                    } else {
                        linkedList.add(od4);
                    }
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeByUsername, videoMembers memberId:%d,memberName%s", Integer.valueOf(i3), str);
                }
            }
            nd4 nd4 = this.f314308f.f314404o1;
            nd4.f332183d = linkedList;
            nd4.f332184e = linkedList2;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: subscribeByUsernames, videoMembers %s", nd4);
            C105714w.m141919d(this.f314308f.f314404o1);
        } else {
            this.f314308f.mo150587C();
        }
    }
}
