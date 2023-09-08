package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import p206nj.C76861g;

public class g$$b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C76540g f224032d;

    public g$$b(C76540g gVar) {
        this.f224032d = gVar;
    }

    public boolean onTimerExpired() {
        C76551y o = C76552z.m92077o(this.f224032d.f224013f);
        if (o != null) {
            int i = o.f224058i;
            if ((i > 1 && i <= 3) || i == 8) {
                if (!(this.f224032d.f224019o || 3 == i || 8 == i)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if ((currentTimeMillis / 1000) - o.f224060k > 30) {
                        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Error ModifyTime in Read file:" + this.f224032d.f224013f);
                        this.f224032d.f224017j = C76861g.m92658a() + 10000;
                        C76540g gVar = this.f224032d;
                        gVar.f224011d.onSceneEnd(3, -1, "doScene failed", gVar);
                        return false;
                    }
                    C76540g gVar2 = this.f224032d;
                    if (currentTimeMillis - gVar2.f224016i < 2000) {
                        Log.m105918d("MicroMsg.NetSceneUploadVoice", "TimerExpired :" + this.f224032d.f224013f + " but last send time:" + (currentTimeMillis - this.f224032d.f224016i));
                        return true;
                    }
                    C60998j d = C76552z.m92073k(gVar2.f224013f).mo106771d(o.f224055f, 6000);
                    Log.m105918d("MicroMsg.NetSceneUploadVoice", "pusher doscene:" + this.f224032d.f224013f + " readByte:" + d.f173720b + " stat:" + o.f224058i);
                    if (d.f173720b < 2000) {
                        return true;
                    }
                }
                C76540g gVar3 = this.f224032d;
                if (gVar3.doScene(gVar3.dispatcher(), this.f224032d.f224011d) == -1) {
                    this.f224032d.f224017j = C76861g.m92658a() + 10000;
                    C76540g gVar4 = this.f224032d;
                    gVar4.f224011d.onSceneEnd(3, -1, "doScene failed", gVar4);
                }
                return false;
            }
        }
        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.f224032d.f224013f);
        this.f224032d.f224017j = C76861g.m92658a() + 10000;
        C76540g gVar5 = this.f224032d;
        gVar5.f224011d.onSceneEnd(3, -1, "doScene failed", gVar5);
        return false;
    }
}
