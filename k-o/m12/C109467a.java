package m12;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ipcall.C105379e;
import com.tencent.p014mm.plugin.ipcall.IPCallManager;
import com.tencent.p014mm.plugin.ipcall.model.C105382f;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j12.C108528a;
import k12.C108828c;
import l12.C109120a;
import l12.C109121b;
import l12.C109123c;
import m12.C109468b;
import p12.C62188o;
import s12.C13614k;

/* renamed from: m12.a */
public class C109467a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C109468b f327639a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109467a(C109468b bVar, Looper looper) {
        super(looper);
        this.f327639a = bVar;
    }

    public void handleMessage(Message message) {
        int i;
        if (message == null || (i = message.what) != 59998) {
            super.handleMessage(message);
            return;
        }
        Log.m105919d("MicroMsg.IPCallEngineManager", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", Integer.valueOf(i), message.obj, Integer.valueOf(message.arg1), Integer.valueOf(message.arg2));
        int i2 = message.arg1;
        if (i2 == 3) {
            Log.m105918d("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEV");
        } else if (i2 == 4) {
            Log.m105924i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
            C109468b bVar = this.f327639a;
            bVar.getClass();
            Log.m105918d("MicroMsg.IPCallEngineManager", "handleStartDevFailed");
            C109468b.C109469a aVar = bVar.f327645f;
            if (aVar != null) {
                IPCallManager iPCallManager = (IPCallManager) aVar;
                Log.m105925i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", C105385g.Fx0().mo150083a());
                if (iPCallManager.mo150067j(6, 0)) {
                    iPCallManager.mo150066i(6, (String) null, MMApplicationContext.getContext().getString(C0966R.string.aud), 1);
                }
            }
        } else if (i2 == 5) {
            Log.m105924i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
            int i3 = message.arg2;
            if (i3 == 4) {
                Log.m105924i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
                C109468b.m148687a(this.f327639a, 34);
            } else if (i3 == 1) {
                Log.m105924i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
                C109468b.m148687a(this.f327639a, 20);
            } else if (i3 == 5) {
                Log.m105924i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
                C109468b.m148687a(this.f327639a, 30);
            }
        } else if (i2 == 6) {
            C109468b bVar2 = this.f327639a;
            bVar2.getClass();
            Log.m105918d("MicroMsg.IPCallEngineManager", "channel connect!");
            if (bVar2.f327643d) {
                Log.m105918d("MicroMsg.IPCallEngineManager", "channel already connect! do call not startEngine again");
                return;
            }
            int startEngine = bVar2.f327640a.startEngine();
            Log.m105919d("MicroMsg.IPCallEngineManager", "startNativeEngine, ret: %d", Integer.valueOf(startEngine));
            if (startEngine == 0) {
                bVar2.f327640a.f317558D0 = 0;
            } else {
                bVar2.f327640a.f317558D0 = 1;
            }
            bVar2.f327640a.setInactive();
            bVar2.f327643d = true;
            C109468b.C109469a aVar2 = bVar2.f327645f;
            if (aVar2 != null) {
                IPCallManager iPCallManager2 = (IPCallManager) aVar2;
                Log.m105925i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", C105385g.Fx0().mo150083a());
                C105385g.Ex0().mo143090f();
                IPCallManager.f313218v.removeCallbacks(iPCallManager2.f313229q);
                if (C105385g.Fx0().mo150084b()) {
                    C109123c yx02 = C105385g.yx0();
                    yx02.f326758b.mo161478U("ipcall", 4);
                    Log.m105919d("MicroMsg.IPCallDeviceManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", Boolean.valueOf(yx02.f326758b.mo161474P(3)), Boolean.valueOf(yx02.f326758b.mo161474P(4)));
                    C108528a aVar3 = yx02.f326758b;
                    C109121b bVar3 = aVar3.f324868m;
                    if (bVar3 != null) {
                        if (bVar3.f326752c) {
                            Log.m105918d("MicroMsg.IPCallAudioPlayer", "startPlay, already start");
                        } else {
                            Log.m105924i("MicroMsg.IPCallAudioPlayer", "startPlay");
                            if (bVar3.f326750a == null) {
                                C106336d dVar = new C106336d();
                                bVar3.f326750a = dVar;
                                dVar.mo152544c(v2protocal.f317532S1, 1, 20, 1);
                            }
                            bVar3.f326750a.mo152543b(MMApplicationContext.getContext(), false);
                            C106336d dVar2 = bVar3.f326750a;
                            dVar2.f317212q = new C109120a(bVar3);
                            if (dVar2.mo152545d() <= 0) {
                                C109470c Dx0 = C105385g.Dx0();
                                if (Dx0.f327651F == 0) {
                                    Dx0.f327651F = 1;
                                }
                            }
                            bVar3.f326754e.mo18028n(bVar3.f326753d);
                            bVar3.f326752c = true;
                        }
                    }
                    C108528a.C108529a aVar4 = aVar3.f324867l;
                    if (aVar4 != null) {
                        ((C105420i2) aVar4).mo150163e(aVar3.mo161472N() == 3);
                    }
                    C108528a.C108529a aVar5 = aVar3.f324867l;
                    if (aVar5 != null) {
                        ((C105420i2) aVar5).mo150162d(aVar3.mo161472N() == 4);
                    }
                }
                C109470c Dx02 = C105385g.Dx0();
                Dx02.getClass();
                Log.m105924i("MicroMsg.IPCallReportHelper", "channelConnect");
                Dx02.f327660h = 1;
                C105385g.yx0().mo160365c();
                if (C105385g.Fx0().mo150085c() && !iPCallManager2.f313221f) {
                    C109470c Dx03 = C105385g.Dx0();
                    Dx03.getClass();
                    Log.m105918d("MicroMsg.IPCallReportHelper", "markStartTalk");
                    if (Dx03.f327673u == 0) {
                        Dx03.f327673u = System.currentTimeMillis();
                    }
                    C109468b zx02 = C105385g.zx0();
                    zx02.getClass();
                    Log.m105918d("MicroMsg.IPCallEngineManager", "setChannelActiveAfterAccept");
                    if (!zx02.f327643d) {
                        Log.m105918d("MicroMsg.IPCallEngineManager", "channel not connect now");
                    }
                    zx02.f327640a.setActive();
                    iPCallManager2.f313221f = true;
                    iPCallManager2.f313232t = Util.nowSecond();
                    iPCallManager2.mo150071n();
                    C105379e eVar = iPCallManager2.f313219d;
                    if (eVar != null) {
                        ((C105420i2) eVar).mo150164f();
                    }
                    C13614k kVar = iPCallManager2.f313220e;
                    if (kVar != null) {
                        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "recordStartTalk, localId: %d", Long.valueOf(kVar.systemRowid));
                        if (kVar.systemRowid != -1) {
                            kVar.field_status = 3;
                            C105385g.Cx0().mo13011Lo(kVar);
                        }
                    }
                    C105385g.Dx0().mo160705a();
                    C106343f0.m143231a().mo152577d();
                    C106343f0.m143231a().mo152575b(iPCallManager2);
                }
            }
        } else if (i2 == 9) {
            Log.m105924i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
        } else if (i2 == 10) {
            Log.m105924i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
            this.f327639a.getClass();
            Log.m105924i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
            C105382f Gx0 = C105385g.Gx0();
            Gx0.getClass();
            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
            if (Gx0.f313262w) {
                Log.m105924i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
                return;
            }
            Gx0.f313263x = true;
            C108828c cVar = Gx0.f313260u;
            if (cVar != null) {
                cVar.f325908m = 2;
                C97625j3.m125815e().mo123460f(new C62188o(cVar.f325896a, cVar.f325897b, cVar.mo159938b(), Gx0.f313260u.f325898c, true));
            }
            Gx0.mo150096k(2);
        }
    }
}
