package m43;

import a43.C103310i;
import android.graphics.Point;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.plugin.voip.video.p806cs.MovableVideoView;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import i43.C108367a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k43.C108886d;
import k43.C108887f;
import l43.C109255b;
import l43.C109267c;
import m43.C109499b;
import p375qh.C110390f;
import pe3.C89349b;
import te3.np4;
import z33.C112597j;
import zt3.C119157j;

/* renamed from: m43.a */
public class C109498a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C109499b f327736a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109498a(C109499b bVar, Looper looper) {
        super(looper);
        this.f327736a = bVar;
    }

    public void handleMessage(Message message) {
        if (message == null) {
            super.handleMessage(message);
            return;
        }
        int i = 0;
        Log.m105919d("MicroMsg.VoipCSEngine", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", Integer.valueOf(message.what), message.obj, Integer.valueOf(message.arg1), Integer.valueOf(message.arg2));
        int i2 = message.arg1;
        if (i2 == 3) {
            this.f327736a.getClass();
            Log.m105918d("MicroMsg.VoipCSEngine", "start dev!");
        } else if (i2 == 8) {
            byte[] bArr = (byte[]) message.obj;
            C109499b bVar = this.f327736a;
            bVar.getClass();
            try {
                np4 np4 = (np4) new np4().parseFrom(bArr);
                C112597j.m153938c("MicroMsg.VoipCSEngine", "steve: onRecvRUDPCmd:" + np4.f332185d);
                if (np4.f332185d == 3) {
                    C89349b bVar2 = np4.f332186e;
                    if (bVar2 != null) {
                        byte[] bArr2 = bVar2.f257327a;
                        C112597j.m153938c("MicroMsg.VoipCSEngine", "steve: remote new network type:" + bArr2);
                        int appCmd = bVar.f327737a.setAppCmd(302, bArr2, 4);
                        if (appCmd < 0) {
                            C112597j.m153938c("MicroMsg.VoipCSEngine", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type " + bArr2 + "fail:" + appCmd + ", [roomid=" + bVar.f327737a.f317659o + ", roomkey=" + bVar.f327737a.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.VoipCSEngine", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
                }
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.VoipCSEngine", "onVoipLocalNetTypeChange Error");
            }
        } else if (i2 == 5) {
            Log.m105924i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_RESET");
            int i3 = message.arg2;
            if (i3 == 4) {
                Log.m105924i("MicroMsg.VoipCSEngine", "channel broken...");
                C108886d.vx0().f326107w = 1;
            } else if (i3 == 5) {
                Log.m105924i("MicroMsg.VoipCSEngine", "channel event network failer...");
                C108886d.vx0().f326107w = 6;
            } else {
                Log.m105924i("MicroMsg.VoipCSEngine", "channel connect fail...");
                C108886d.vx0().f326107w = 5;
            }
            C109499b bVar3 = this.f327736a;
            bVar3.getClass();
            Log.m105924i("MicroMsg.VoipCSEngine", "channel connect failed!");
            C108886d.vx0().f326081a = 1;
            C109499b.C109500a aVar = bVar3.f327740d;
            if (aVar != null) {
                Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "onChannelConnectFailed now finish it!");
                ((VoipCSMainUI) aVar).f318240d.mo160487e(5);
            }
        } else if (i2 == 6) {
            Log.m105924i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_CHANNEL_CONNECTED");
            C108887f vx02 = C108886d.vx0();
            vx02.getClass();
            Log.m105918d("MicroMsg.VoipCSReportHelper", "channelConnect");
            vx02.f326056B = 1;
            C109499b bVar4 = this.f327736a;
            bVar4.getClass();
            Log.m105924i("MicroMsg.VoipCSEngine", "channel connect!");
            if (bVar4.f327739c) {
                Log.m105924i("MicroMsg.VoipCSEngine", "channel already connect! do call not startEngine again");
                return;
            }
            bVar4.f327739c = true;
            Log.m105924i("MicroMsg.VoipCSEngine", "start engine");
            bVar4.f327737a.setInactive();
            Log.m105918d("MicroMsg.VoipCSEngine", "setChannelActiveAfterAccept");
            if (!bVar4.f327739c) {
                Log.m105918d("MicroMsg.VoipCSEngine", "channel not connect now");
            }
            bVar4.f327737a.setActive();
            int startEngine = bVar4.f327737a.startEngine();
            if (startEngine == 0) {
                Log.m105924i("MicroMsg.VoipCSEngine", "start engine suc!");
                int[] iArr = {C108886d.wx0().f327737a.f317649k1, C108886d.wx0().f327737a.f317652l1};
                Log.m105924i("MicroMsg.VoipCSEngine", "steve: Get server config! MaxBR:" + iArr[0] + ", MaxFps:" + iArr[1]);
                if (iArr[0] > 0 && iArr[1] > 0) {
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(iArr);
                    byte[] array = allocate.array();
                    if (C108886d.wx0().f327737a.setAppCmd(34, array, array.length) < 0) {
                        Log.m105924i("MicroMsg.VoipCSEngine", "setAppCmd: type:34,qosparam:" + iArr[0] + "," + iArr[1] + ",ret:" + startEngine);
                    }
                }
                C108886d.vx0().f326110z = 1;
            } else {
                Log.m105924i("MicroMsg.VoipCSEngine", "start engine fail!");
                C108886d.vx0().f326110z = 0;
            }
            if (bVar4.f327740d != null && C108886d.xx0().f326118n != 2) {
                VoipCSMainUI voipCSMainUI = (VoipCSMainUI) bVar4.f327740d;
                C109255b bVar5 = voipCSMainUI.f318240d;
                bVar5.f327097I.stopTimer();
                bVar5.f327098J.stopTimer();
                bVar5.f327093E.mo161577a();
                bVar5.f327113j.setVisibility(8);
                bVar5.f327112i.setText(C0966R.string.kg9);
                bVar5.f327111h.setText(C0966R.string.kfx);
                bVar5.mo160490h(0);
                bVar5.f327117q.setOnClickListener(bVar5);
                String str = bVar5.f327107d.f318249p;
                if (str != null && str.equals("1")) {
                    bVar5.f327120t.setVisibility(0);
                    bVar5.f327122v = true;
                    Point d = bVar5.mo160486d(true);
                    ((MovableVideoView) bVar5.f327120t).mo67523h(d.x, d.y);
                    if (bVar5.f327103P != null) {
                        Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
                        C109255b.C109266k kVar = bVar5.f327103P;
                        kVar.f327136e = true;
                        kVar.mo97819a();
                        bVar5.f327103P = null;
                    }
                    C109255b.C109266k kVar2 = new C109255b.C109266k();
                    bVar5.f327103P = kVar2;
                    ((C119157j) C119157j.f356862d).mo183875f(kVar2);
                    Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "start video decode thread..");
                }
                Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "trigger dismiss button");
                bVar5.f327123w.postDelayed(new C109267c(bVar5), 10000);
                bVar5.f327092D = true;
                if (bVar5.f327100L == null) {
                    bVar5.f327100L = new MTimerHandler(Looper.getMainLooper(), bVar5.f327099K, true);
                }
                if (!bVar5.f327090B) {
                    if (bVar5.f327091C == -1) {
                        bVar5.f327091C = Util.nowSecond();
                    }
                    bVar5.f327090B = true;
                    bVar5.f327100L.startTimer(1000, 1000);
                    C106343f0.m143231a().mo152577d();
                    C106343f0.m143231a().mo152575b(bVar5);
                }
                voipCSMainUI.f318241e.mo158860h0();
                C110390f fVar = voipCSMainUI.f318241e.f324418l;
                int i4 = -1;
                if (fVar != null) {
                    Boolean valueOf = Boolean.valueOf(fVar.mo161906k());
                    C108886d.vx0().f326058D = 1;
                    if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
                        i4 = 1;
                    }
                }
                C108886d.vx0().f326082a0 = i4;
                C108367a aVar2 = voipCSMainUI.f318241e;
                C106336d dVar = aVar2.f324419m;
                if (dVar == null) {
                    C108886d.wx0().f327737a.f317575J = Math.abs(1);
                } else {
                    Integer valueOf2 = Integer.valueOf(dVar.mo152545d());
                    C106336d dVar2 = aVar2.f324419m;
                    if (dVar2 != null) {
                        i = dVar2.mo152545d();
                    }
                    if (i <= 0) {
                        C108886d.wx0().f327737a.f317575J = Math.abs(1);
                    }
                    if (valueOf2 != null) {
                        valueOf2.intValue();
                    }
                }
                C103310i iVar = voipCSMainUI.f318242f.f327085a;
                if (iVar != null) {
                    iVar.mo143090f();
                }
                C108887f vx03 = C108886d.vx0();
                if (vx03.f326077W != 0) {
                    vx03.f326061G = ((int) (System.currentTimeMillis() / 1000)) - vx03.f326077W;
                }
                C108887f vx04 = C108886d.vx0();
                vx04.getClass();
                Log.m105918d("MicroMsg.VoipCSReportHelper", "markStartTalk");
                if (vx04.f326079Y == 0) {
                    vx04.f326079Y = (int) (System.currentTimeMillis() / 1000);
                }
                C108887f vx05 = C108886d.vx0();
                vx05.getClass();
                Log.m105918d("MicroMsg.VoipCSReportHelper", "markConnect");
                if (vx05.f326078X != 0) {
                    vx05.f326063I = (long) (((int) (System.currentTimeMillis() / 1000)) - vx05.f326078X);
                }
                C108886d.xx0().f326118n = 2;
            }
        } else if (i2 == 100) {
            C112597j.m153943h((byte[]) message.obj, "MicroMsg.VoipCSEngine", message.arg2);
        } else if (i2 == 101) {
            C112597j.m153943h((byte[]) message.obj, "MicroMsg.VoipCSEngine-JNI_CORE", message.arg2);
        }
    }
}
