package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import m11.C109466a;
import p156gj.C107823c;
import p156gj.C107835h0;
import p375qh.C110390f;
import pu0.C110248b;
import qu0.C110472b;
import te3.C49918iz;
import te3.C50633o40;
import te3.C50778p40;
import te3.C51198s40;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x */
public class C105186x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49918iz f312409d;

    /* renamed from: e */
    public final /* synthetic */ C105188y f312410e;

    public C105186x(C105188y yVar, C49918iz izVar) {
        this.f312410e = yVar;
        this.f312409d = izVar;
    }

    public void run() {
        int i;
        int i2;
        int i3;
        int U;
        C105181w wVar = this.f312410e.f312413b;
        wVar.f312366W0 = true;
        C105141g gVar = wVar.f312377g;
        C49918iz izVar = this.f312409d;
        gVar.getClass();
        if (izVar != null) {
            C50633o40 o402 = izVar.f135764e;
            gVar.f312187n = o402.f138945d;
            gVar.f312188o = o402.f138947f;
            gVar.f312189p = o402.f138946e;
        }
        C105141g gVar2 = this.f312410e.f312413b.f312377g;
        if (gVar2.f312177d == 2) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "dev start already...");
        } else {
            C105149i iVar = gVar2.f312174a;
            C109466a aVar = iVar.f312216c;
            aVar.getClass();
            C110248b.C110249a aVar2 = C110248b.f329777h;
            aVar2.mo161659d().f329778d.registerBroadcasts();
            aVar.mo157512y();
            aVar2.mo161664i(aVar, "openvoice");
            C7335d c = C86312j.m106911c(C110248b.class);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            ((C110248b) c).f329778d.registerBroadcasts();
            C109466a aVar3 = iVar.f312216c;
            aVar3.getClass();
            C110472b bVar = C110472b.f330365a;
            if (bVar.mo161950a()) {
                Log.m105924i("MicroMsg.OpenVoiceAudioManager", "tryRequestBluetoothDevice, ret:" + aVar3.mo161478U("openvoice", 4));
            }
            Log.m105925i("MicroMsg.OpenVoiceAudioManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b %s", Boolean.valueOf(aVar3.mo161474P(3)), Boolean.valueOf(aVar3.mo161474P(4)), Integer.valueOf(aVar3.hashCode()));
            aVar3.f327638n.mo139415b();
            if (!aVar3.mo161475Q() && !bVar.mo161950a()) {
                aVar3.mo161478U("openvoice", 1);
                aVar3.f327636l &= aVar3.mo160702e0(true);
            } else if (aVar3.mo161474P(4) && (U = aVar3.mo161478U("openvoice", 4)) == -1) {
                Log.m105921e("MicroMsg.OpenVoiceAudioManager", "hy: start bluetooth failed %d", Integer.valueOf(U));
                aVar3.mo161477T("openvoice");
            }
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "start device......");
            gVar2.f312177d = 2;
            gVar2.f312176c.getClass();
            C107835h0.f322846c.mo158230d();
            gVar2.f312176c.getClass();
            byte[] bArr = {0};
            byte[] bArr2 = new byte[2];
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioCompatHelper", "hy: audio info dump begin");
            C107835h0.f322846c.mo158230d();
            int i4 = C107835h0.f322846c.f322706O;
            if (i4 > -1) {
                bArr2[0] = (byte) i4;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(406, bArr2, 1);
            } else if (i4 == -2) {
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(407, bArr, 1);
            }
            C107823c cVar = C107835h0.f322846c;
            int i5 = cVar.f322716T;
            if (i5 > -1) {
                byte[] bArr3 = new byte[8];
                byte[] bArr4 = new byte[2];
                int i6 = cVar.f322718U;
                if (i6 > -1 && (i3 = cVar.f322720V) > -1) {
                    byte b = (byte) i6;
                    bArr4[0] = b;
                    byte b2 = (byte) i3;
                    bArr4[1] = b2;
                    if (cVar.f322722W > -1) {
                        bArr3[0] = (byte) i5;
                        bArr3[1] = b2;
                        bArr3[2] = b2;
                        bArr3[3] = b2;
                        bArr3[4] = b;
                        bArr3[5] = (byte) cVar.f322738d0;
                        bArr3[6] = (byte) cVar.f322740e0;
                        bArr3[7] = (byte) cVar.f322724X;
                        C105181w.INSTANCE.getClass();
                        C105172s.m141221b(404, bArr3, 8);
                    } else {
                        C105181w.INSTANCE.getClass();
                        C105172s.m141221b(404, bArr4, 2);
                    }
                } else if (i6 > -1 && (i2 = cVar.f322726Y) > -1) {
                    bArr3[0] = (byte) i5;
                    bArr3[1] = (byte) i2;
                    bArr3[2] = (byte) cVar.f322728Z;
                    bArr3[3] = (byte) cVar.f322731a0;
                    bArr3[4] = (byte) i6;
                    bArr3[5] = (byte) cVar.f322738d0;
                    bArr3[6] = (byte) cVar.f322740e0;
                    bArr3[7] = (byte) cVar.f322724X;
                    C105181w.INSTANCE.getClass();
                    C105172s.m141221b(404, bArr3, 8);
                }
            } else if (i5 == -2) {
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(405, bArr, 1);
            }
            int i7 = C107835h0.f322846c.f322708P;
            if (i7 > -1) {
                bArr2[0] = (byte) i7;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(408, bArr2, 1);
            } else if (i7 == -2) {
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(409, bArr, 1);
            }
            short[] sArr = C107835h0.f322846c.f322772u0;
            short s = sArr[0];
            if (s > 0 || sArr[1] > 0) {
                bArr2[0] = 0;
                bArr2[1] = 0;
                if (s > 0 && s < 10000) {
                    bArr2[0] = (byte) s;
                }
                short s2 = sArr[1];
                if (s2 > 0 && s2 < 10000) {
                    bArr2[1] = (byte) s2;
                }
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodSetNgStrength, bArr2, 2);
            }
            C107823c cVar2 = C107835h0.f322846c;
            int i8 = cVar2.f322757n;
            if (i8 > -1 || cVar2.f322761p > -1) {
                bArr2[0] = -1;
                bArr2[1] = -1;
                if (i8 > -1) {
                    bArr2[0] = (byte) i8;
                }
                int i9 = cVar2.f322761p;
                if (i9 > -1) {
                    bArr2[1] = (byte) i9;
                }
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(414, bArr2, 2);
            }
            C107823c cVar3 = C107835h0.f322846c;
            int i15 = cVar3.f322759o;
            if (i15 > -1 || cVar3.f322763q > -1) {
                bArr2[0] = -1;
                bArr2[1] = -1;
                if (i15 > -1) {
                    bArr2[0] = (byte) i15;
                }
                int i16 = cVar3.f322763q;
                if (i16 > -1) {
                    bArr2[1] = (byte) i16;
                }
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodOutputVolumeScaleEnable, bArr2, 2);
            }
            C107823c cVar4 = C107835h0.f322846c;
            int i17 = cVar4.f322765r;
            if (i17 > -1 || cVar4.f322767s > -1) {
                bArr2[0] = -1;
                bArr2[1] = -1;
                if (i17 > -1) {
                    bArr2[0] = (byte) i17;
                }
                int i18 = cVar4.f322767s;
                if (i18 > -1) {
                    bArr2[1] = (byte) i18;
                }
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodOutputVolumeGainEnable, bArr2, 2);
            }
            int i19 = C107835h0.f322846c.f322777x;
            if (i19 > -1) {
                bArr2[0] = (byte) i19;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodEhanceHeadsetEC, bArr2, 1);
            }
            int i25 = C107835h0.f322846c.f322779y;
            if (i25 > -1 && i25 != 5) {
                bArr2[0] = (byte) i25;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(417, bArr2, 1);
            }
            int i26 = C107835h0.f322846c.f322781z;
            if (i26 > -1 && i26 != 5) {
                bArr2[0] = (byte) i26;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(418, bArr2, 1);
            }
            int i27 = C107835h0.f322846c.f322678A;
            if (i27 > -1) {
                bArr2[0] = (byte) i27;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(419, bArr2, 1);
            }
            if (1 == C107835h0.f322846c.f322768s0) {
                byte[] bArr5 = new byte[30];
                for (int i28 = 0; i28 < 15; i28++) {
                    int i29 = i28 * 2;
                    short s3 = C107835h0.f322846c.f322770t0[i28];
                    bArr5[i29] = (byte) (s3 & 255);
                    bArr5[i29 + 1] = (byte) ((s3 >> 8) & 255);
                }
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodSetPlayerPreCorrectCofOn, bArr5, 30);
            }
            if (C107835h0.f322846c.f322768s0 == 0) {
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodSetPlayerPreCorrectCofOff, bArr, 1);
            }
            int i35 = C107835h0.f322846c.f322774v0;
            if (i35 > 0) {
                bArr2[0] = (byte) i35;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodSetSpkEnhance, bArr2, 1);
            }
            int i36 = C107835h0.f322846c.f322680B;
            if (i36 > 0) {
                bArr2[0] = (byte) i36;
                C105181w.INSTANCE.getClass();
                i = 4;
                C105172s.m141221b(431, bArr2, 4);
            } else {
                i = 4;
            }
            C107823c cVar5 = C107835h0.f322846c;
            int i37 = cVar5.f322685D0;
            if (i37 > -1) {
                byte[] bArr6 = new byte[i];
                bArr6[0] = (byte) i37;
                bArr6[1] = (byte) cVar5.f322687E0;
                bArr6[2] = (byte) cVar5.f322689F0;
                bArr6[3] = (byte) cVar5.f322691G0;
                C105181w.INSTANCE.getClass();
                C105172s.m141221b(v2helper.EMethodSetAgcRxOn, bArr6, 4);
            }
            String str = C112760b.m154231g() + "voip/Models";
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioCompatHelper", "qipengfeng, model path: " + str + ", len: " + str.length());
            byte[] bytes = str.getBytes();
            C105181w wVar2 = C105181w.INSTANCE;
            int length = str.length();
            wVar2.getClass();
            C105172s.m141221b(938, bytes, length);
            int i38 = gVar2.f312178e;
            if (i38 <= 10) {
                if (i38 <= 0) {
                    gVar2.f312181h = 1;
                }
                gVar2.f312178e = 92;
            }
            gVar2.f312175b = new C110390f(gVar2.f312187n, gVar2.f312188o, 1);
            gVar2.f312175b.mo161902g(gVar2.f312189p);
            gVar2.f312175b.mo161905j(true);
            gVar2.f312175b.mo161901f(true);
            gVar2.f312175b.f330234m = -19;
            gVar2.f312175b.mo161903h(1, false);
            gVar2.f312175b.mo161904i(true);
            C105172s.m141221b(401, new byte[1], 1);
            gVar2.f312175b.f330245x = gVar2.f312190q;
        }
        C105140f1 f1Var = this.f312410e.f312413b.f312378h;
        C49918iz izVar2 = this.f312409d;
        f1Var.getClass();
        Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "set param.");
        if (izVar2 != null) {
            C51198s40 s402 = izVar2.f135765f;
            if (s402 != null) {
                C50778p40 p402 = s402.f141312e;
                if (p402 != null) {
                    int i39 = p402.f139568i;
                    int i44 = p402.f139569j;
                    if ((1920 == i39 && i44 == 1080) || (1280 == i39 && i44 == 720)) {
                        f1Var.f312172e = i39;
                        f1Var.f312173f = i44;
                        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "set cap res: w: " + i39 + ", h: " + i44);
                    } else {
                        Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "illegal res: w: " + i39 + ", h: " + i44);
                    }
                } else {
                    Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "param.video_param.front_camera is null!!!");
                }
            } else {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "param.video_param is null!!!");
            }
        } else {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "param is null!!!");
        }
        this.f312410e.f312413b.f312378h.getClass();
        C105188y yVar = this.f312410e;
        yVar.f312413b.mo149506m(yVar.f312412a);
    }
}
