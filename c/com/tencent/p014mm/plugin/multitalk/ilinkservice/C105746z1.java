package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import te3.nd4;
import te3.od4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z1 */
public class C105746z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Integer f314456d;

    /* renamed from: e */
    public final /* synthetic */ boolean f314457e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314458f;

    public C105746z1(C105724z zVar, Integer num, boolean z) {
        this.f314458f = zVar;
        this.f314456d = num;
        this.f314457e = z;
    }

    public void run() {
        int i = this.f314458f.f314401n;
        if (i != 1) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", Integer.valueOf(i));
        } else if (this.f314456d.intValue() < 0) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", Integer.valueOf(this.f314458f.f314401n));
        } else {
            int i2 = this.f314457e ? 640 : 480;
            LinkedList<od4> linkedList = new LinkedList<>();
            LinkedList<od4> linkedList2 = new LinkedList<>();
            od4 od4 = new od4();
            od4.f332187d = this.f314456d.intValue();
            od4.f332188e = i2;
            int p = this.f314458f.mo150606p(this.f314456d.intValue());
            if (p == 102 || p == 101) {
                linkedList2.add(od4);
            } else {
                linkedList.add(od4);
            }
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeOneByUserMid, videoMembers memberId:%d", this.f314456d);
            nd4 nd4 = this.f314458f.f314404o1;
            nd4.f332183d = linkedList;
            if (p == 102 || p == 101) {
                od4.f332188e = 240;
            }
            nd4.f332184e = linkedList2;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: subscribeOneByUserMid, videoMembers %s", nd4);
            C105714w.m141919d(this.f314458f.f314404o1);
        }
    }
}
