package com.tencent.p014mm.modelsimple;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.APPHasInitEvent;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1 */
public class NetSceneGetDisasterInfo$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f343976d;

    /* renamed from: e */
    public final /* synthetic */ boolean f343977e;

    /* renamed from: f */
    public final /* synthetic */ C29034v f343978f;

    public NetSceneGetDisasterInfo$1(C29034v vVar, String str, boolean z) {
        this.f343978f = vVar;
        this.f343976d = str;
        this.f343977e = z;
    }

    public void run() {
        Object[] objArr = new Object[2];
        String str = this.f343976d;
        objArr[0] = Integer.valueOf(str == null ? -1 : str.length());
        objArr[1] = Boolean.valueOf(this.f343977e);
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo broadcastEvent content len[%d], cache[%b]", objArr);
        BroadcastEvent broadcastEvent = new BroadcastEvent();
        BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
        aVar.f236156a = 5;
        aVar.f236157b = this.f343976d;
        broadcastEvent.publish();
        BroadcastEvent.C114669b bVar = broadcastEvent.f343530e;
        String str2 = bVar.f343538h;
        int i = bVar.f343539i;
        int i2 = bVar.f343535e;
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd event.result.Actionp[%d] noticeId[%s], position[%d], manualauthSucc[%b], noticeidTickMap[%s]", Integer.valueOf(i2), str2, Integer.valueOf(i), Boolean.valueOf(this.f343978f.f79571f), C29034v.f79567h);
        if (i == 1 && i2 == 6) {
            if (this.f343977e) {
                C29034v.m38532j1(this.f343978f, str2, this.f343976d);
            }
            if (this.f343978f.f79571f) {
                BroadcastEvent.C114669b bVar2 = broadcastEvent.f343530e;
                final String str3 = bVar2.f343533c;
                final String str4 = bVar2.f343532b;
                Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after init[%b]", Boolean.valueOf(MMApplicationContext.isAppHasInit()));
                C29034v vVar = this.f343978f;
                if (vVar.f79572g == null) {
                    vVar.f79572g = new IListener<APPHasInitEvent>(C40008f.f107254d) {
                        {
                            this.__eventId = -1206899071;
                        }

                        public boolean callback(IEvent iEvent) {
                            APPHasInitEvent aPPHasInitEvent = (APPHasInitEvent) iEvent;
                            NetSceneGetDisasterInfo$1.this.f343978f.f79572g.dead();
                            NetSceneGetDisasterInfo$1.this.f343978f.f79572g = null;
                            Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after 5s[%b]", Boolean.valueOf(MMApplicationContext.isAppHasInit()));
                            MMHandlerThread.postToMainThreadDelayed(new C55392u(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                            return true;
                        }
                    };
                }
                this.f343978f.f79572g.alive();
            } else {
                LoginDisasterEvent loginDisasterEvent = new LoginDisasterEvent();
                LoginDisasterEvent.C114679a aVar2 = loginDisasterEvent.f343570d;
                BroadcastEvent.C114669b bVar3 = broadcastEvent.f343530e;
                aVar2.f343571a = bVar3.f343533c;
                aVar2.f343572b = bVar3.f343532b;
                loginDisasterEvent.publish();
            }
            ((HashMap) C29034v.f79567h).put(str2, Long.valueOf(Util.currentTicks()));
        } else if (i2 == 2) {
            if (this.f343977e) {
                C29034v.m38532j1(this.f343978f, str2, this.f343976d);
            }
            ((HashMap) C29034v.f79567h).put(str2, Long.valueOf(Util.currentTicks()));
        }
    }
}
