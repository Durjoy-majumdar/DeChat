package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82993v;
import com.tencent.p014mm.plugin.voip.model.VoipModelResMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import fm0.C86940g0;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p156gj.C107823c;
import p156gj.C107835h0;
import ql0.C89699b;
import vn0.C90846d;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.l */
public class C105653l {
    /* renamed from: a */
    public void mo150519a() {
        int i;
        int i2;
        int i3;
        Class cls = C32735h.class;
        byte[] bArr = {0};
        byte[] bArr2 = new byte[2];
        Log.m105924i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "hy: audio info dump begin");
        C107835h0.f322846c.mo158230d();
        int i4 = C107835h0.f322846c.f322706O;
        if (i4 > -1) {
            bArr2[0] = (byte) i4;
            C105724z.INSTANCE.mo150610t(406, bArr2, 1);
        } else if (i4 == -2) {
            C105724z.INSTANCE.mo150610t(407, bArr, 1);
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_cldnn_ns, -1);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_cldnn_ns_ct, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, cldnn_ns_config:%d, cldnn_ns_ct:%d", Integer.valueOf(Qe), Integer.valueOf(Qe2));
        if (Qe > 0) {
            int i5 = Qe & 1;
            int i6 = (Qe >> 1) & 3;
            Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, cldnn ns para: %d, %d, %d", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(Qe2));
            C105724z.INSTANCE.mo150610t(470, new byte[]{(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 24) & 255), (byte) (i6 & 255), (byte) ((i6 >> 8) & 255), (byte) ((i6 >> 16) & 255), (byte) ((i6 >> 24) & 255), (byte) (Qe2 & 255), (byte) ((Qe2 >> 8) & 255), (byte) ((Qe2 >> 16) & 255), (byte) ((Qe2 >> 24) & 255)}, 3);
        }
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_agc_params_ex, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x_agc_paras = %d", Integer.valueOf(Qe3));
        if (Qe3 > 0) {
            byte b = (byte) (Qe3 & 1);
            Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc_switch = %d", Byte.valueOf(b));
            if (b > 0) {
                byte b2 = (byte) ((Qe3 >> 1) & 3);
                byte[] bArr3 = {b2, (byte) ((Qe3 >> 3) & 31), (byte) ((Qe3 >> 8) & 31), (byte) ((Qe3 >> 13) & 31), (byte) ((Qe3 >> 18) & 31), (byte) ((Qe3 >> 23) & 7), (byte) ((Qe3 >> 26) & 15), (byte) ((Qe3 >> 30) & 1)};
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc para: %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(b2), Byte.valueOf(bArr3[1]), Byte.valueOf(bArr3[2]), Byte.valueOf(bArr3[3]), Byte.valueOf(bArr3[4]), Byte.valueOf(bArr3[5]), Byte.valueOf(bArr3[6]), Byte.valueOf(bArr3[7]));
                i = 8;
                C105724z.INSTANCE.mo150610t(404, bArr3, 8);
            } else {
                i = 8;
                C105724z.INSTANCE.mo150610t(405, bArr, 1);
            }
        } else {
            i = 8;
        }
        C107823c cVar = C107835h0.f322846c;
        int i7 = cVar.f322716T;
        if (i7 > -1) {
            byte[] bArr4 = new byte[i];
            byte[] bArr5 = new byte[2];
            int i8 = cVar.f322718U;
            if (i8 > -1 && (i3 = cVar.f322720V) > -1) {
                bArr5[0] = (byte) i8;
                bArr5[1] = (byte) i3;
                if (cVar.f322722W > -1) {
                    bArr4[0] = (byte) i7;
                    byte b3 = (byte) i3;
                    bArr4[1] = b3;
                    bArr4[2] = b3;
                    bArr4[3] = b3;
                    bArr4[4] = (byte) i8;
                    bArr4[5] = (byte) cVar.f322738d0;
                    bArr4[6] = (byte) cVar.f322740e0;
                    bArr4[7] = (byte) cVar.f322724X;
                    C105724z.INSTANCE.mo150610t(404, bArr4, 8);
                } else {
                    C105724z.INSTANCE.mo150610t(404, bArr5, 2);
                }
            } else if (i8 > -1 && (i2 = cVar.f322726Y) > -1) {
                bArr4[0] = (byte) i7;
                bArr4[1] = (byte) i2;
                bArr4[2] = (byte) cVar.f322728Z;
                bArr4[3] = (byte) cVar.f322731a0;
                bArr4[4] = (byte) i8;
                bArr4[5] = (byte) cVar.f322738d0;
                bArr4[6] = (byte) cVar.f322740e0;
                bArr4[7] = (byte) cVar.f322724X;
                C105724z.INSTANCE.mo150610t(404, bArr4, 8);
            }
        } else if (i7 == -2) {
            C105724z.INSTANCE.mo150610t(405, bArr, 1);
        }
        int g = C112597j.m153942g("ladder_cpu");
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, nLadderCPU:%d", Integer.valueOf(g));
        if (g >= 0) {
            C105724z.INSTANCE.mo150610t(97, new byte[]{(byte) (g & 255), (byte) ((g >> 8) & 255), (byte) ((g >> 16) & 255), (byte) ((g >> 24) & 255)}, 1);
        }
        long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_mt_wave_agc, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x-expt settings, wave_agc_paras: %d", Long.valueOf(He));
        if (He > -1) {
            byte[] bArr6 = new byte[11];
            byte b4 = (byte) ((int) (3 & He));
            bArr6[0] = b4;
            Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x-expt settings, wave agc mode: %d", Byte.valueOf(b4));
            byte b5 = bArr6[0];
            if (b5 == 1) {
                bArr6[1] = (byte) ((int) ((He >> 2) & 31));
                bArr6[2] = (byte) ((int) ((He >> 7) & 31));
                bArr6[3] = (byte) ((int) ((He >> 12) & 31));
                bArr6[4] = (byte) ((int) ((He >> 17) & 31));
                bArr6[5] = (byte) ((int) ((He >> 22) & 15));
                bArr6[6] = (byte) ((int) ((He >> 26) & 15));
                bArr6[7] = (byte) ((int) ((He >> 30) & 1));
                bArr6[8] = (byte) ((int) ((He >> 31) & 31));
                bArr6[9] = (byte) ((int) ((He >> 36) & 31));
                bArr6[10] = (byte) ((int) ((He >> 41) & 31));
                C105724z.INSTANCE.mo150610t(461, bArr6, 11);
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr6[1]), Byte.valueOf(bArr6[2]), Byte.valueOf(bArr6[3]), Byte.valueOf(bArr6[4]), Byte.valueOf(bArr6[5]), Byte.valueOf(bArr6[6]), Byte.valueOf(bArr6[7]), Byte.valueOf(bArr6[8]), Byte.valueOf(bArr6[9]), Byte.valueOf(bArr6[10]));
            } else if (b5 == 2) {
                bArr6[1] = (byte) ((int) ((He >> 2) & 31));
                bArr6[2] = (byte) ((int) ((He >> 7) & 31));
                bArr6[3] = (byte) ((int) ((He >> 12) & 31));
                bArr6[4] = (byte) ((int) ((He >> 17) & 31));
                bArr6[5] = (byte) ((int) ((He >> 22) & 15));
                bArr6[6] = (byte) ((int) ((He >> 26) & 15));
                C105724z.INSTANCE.mo150610t(461, bArr6, 7);
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr6[1]), Byte.valueOf(bArr6[2]), Byte.valueOf(bArr6[3]), Byte.valueOf(bArr6[4]), Byte.valueOf(bArr6[5]), Byte.valueOf(bArr6[6]));
            } else if (b5 == 0) {
                C105724z.INSTANCE.mo150610t(462, bArr6, 1);
            }
        }
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, device-model config, SrvDeviceInfo.mAudioInfo.waveAgcMode: %d", Integer.valueOf(C107835h0.f322846c.f322742f0));
        C107823c cVar2 = C107835h0.f322846c;
        int i9 = cVar2.f322742f0;
        if (i9 > -1) {
            byte[] bArr7 = new byte[11];
            byte b6 = (byte) i9;
            bArr7[0] = b6;
            if (b6 == 1) {
                bArr7[1] = (byte) cVar2.f322756m0;
                bArr7[2] = (byte) cVar2.f322758n0;
                bArr7[3] = (byte) cVar2.f322760o0;
                bArr7[4] = (byte) cVar2.f322750j0;
                bArr7[5] = (byte) cVar2.f322752k0;
                bArr7[6] = (byte) cVar2.f322754l0;
                bArr7[7] = (byte) cVar2.f322762p0;
                bArr7[8] = (byte) cVar2.f322744g0;
                bArr7[9] = (byte) cVar2.f322746h0;
                bArr7[10] = (byte) cVar2.f322748i0;
                C105724z.INSTANCE.mo150610t(461, bArr7, 11);
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]), Byte.valueOf(bArr7[7]), Byte.valueOf(bArr7[8]), Byte.valueOf(bArr7[9]), Byte.valueOf(bArr7[10]));
            } else if (b6 == 2) {
                bArr7[1] = (byte) cVar2.f322744g0;
                bArr7[2] = (byte) cVar2.f322746h0;
                bArr7[3] = (byte) cVar2.f322748i0;
                bArr7[4] = (byte) cVar2.f322750j0;
                bArr7[5] = (byte) cVar2.f322752k0;
                bArr7[6] = (byte) cVar2.f322754l0;
                C105724z.INSTANCE.mo150610t(461, bArr7, 7);
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]));
            } else if (b6 == 0) {
                C105724z.INSTANCE.mo150610t(462, bArr7, 1);
            }
        }
        int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multiparty_rnn_value, 1002);
        if (Qe4 > 0) {
            C105724z.INSTANCE.mo150610t(408, new byte[]{(byte) (Qe4 & 255), (byte) ((Qe4 >> 8) & 255), (byte) ((Qe4 >> 16) & 255), (byte) ((Qe4 >> 24) & 255)}, 4);
        } else if (Qe4 == 0) {
            bArr[0] = (byte) (Qe4 & 255);
            C105724z.INSTANCE.mo150610t(409, bArr, 1);
        }
        int i15 = C107835h0.f322846c.f322710Q;
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang SrvDeviceInfo.mAudioInfo.nsModeNewMulti %d", Integer.valueOf(i15));
        int i16 = C107835h0.f322846c.f322710Q;
        if (i16 > -1) {
            if (i15 > 0) {
                int floor = ((int) Math.floor(((double) i15) / 1000.0d)) % 100;
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang SrvDeviceInfo.mAudioInfo.iflag %d", Integer.valueOf(floor));
                if (floor > 0) {
                    C105724z.INSTANCE.mo150610t(408, new byte[]{(byte) (i15 & 255), (byte) ((i15 >> 8) & 255), (byte) ((i15 >> 16) & 255), (byte) ((i15 >> 24) & 255)}, 4);
                }
            } else if (i15 == 0) {
                bArr[0] = (byte) (i15 & 255);
                C105724z.INSTANCE.mo150610t(409, bArr, 1);
            }
        } else if (i16 == -2) {
            bArr[0] = (byte) (i15 & 255);
            C105724z.INSTANCE.mo150610t(409, bArr, 1);
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
            C105724z.INSTANCE.mo150610t(v2helper.EMethodSetNgStrength, bArr2, 2);
        }
        C107823c cVar3 = C107835h0.f322846c;
        int i17 = cVar3.f322757n;
        if (i17 > -1 || cVar3.f322761p > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i17 > -1) {
                bArr2[0] = (byte) i17;
            }
            int i18 = cVar3.f322761p;
            if (i18 > -1) {
                bArr2[1] = (byte) i18;
            }
            C105724z.INSTANCE.mo150610t(414, bArr2, 2);
        }
        C107823c cVar4 = C107835h0.f322846c;
        int i19 = cVar4.f322759o;
        if (i19 > -1 || cVar4.f322763q > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i19 > -1) {
                bArr2[0] = (byte) i19;
            }
            int i25 = cVar4.f322763q;
            if (i25 > -1) {
                bArr2[1] = (byte) i25;
            }
            C105724z.INSTANCE.mo150610t(v2helper.EMethodOutputVolumeScaleEnable, bArr2, 2);
        }
        C107823c cVar5 = C107835h0.f322846c;
        int i26 = cVar5.f322765r;
        if (i26 > -1 || cVar5.f322767s > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i26 > -1) {
                bArr2[0] = (byte) i26;
            }
            int i27 = cVar5.f322767s;
            if (i27 > -1) {
                bArr2[1] = (byte) i27;
            }
            C105724z.INSTANCE.mo150610t(v2helper.EMethodOutputVolumeGainEnable, bArr2, 2);
        }
        int i28 = C107835h0.f322846c.f322777x;
        if (i28 > -1) {
            bArr2[0] = (byte) i28;
            C105724z.INSTANCE.mo150610t(v2helper.EMethodEhanceHeadsetEC, bArr2, 1);
        }
        int i29 = C107835h0.f322846c.f322779y;
        if (i29 > -1 && i29 != 5) {
            bArr2[0] = (byte) i29;
            C105724z.INSTANCE.mo150610t(417, bArr2, 1);
        }
        int i35 = C107835h0.f322846c.f322781z;
        if (i35 > -1 && i35 != 5) {
            bArr2[0] = (byte) i35;
            C105724z.INSTANCE.mo150610t(418, bArr2, 1);
        }
        int i36 = C107835h0.f322846c.f322678A;
        if (i36 > -1) {
            bArr2[0] = (byte) i36;
            C105724z.INSTANCE.mo150610t(419, bArr2, 1);
        }
        if (1 == C107835h0.f322846c.f322768s0) {
            byte[] bArr8 = new byte[30];
            for (int i37 = 0; i37 < 15; i37++) {
                int i38 = i37 * 2;
                short s3 = C107835h0.f322846c.f322770t0[i37];
                bArr8[i38] = (byte) (s3 & 255);
                bArr8[i38 + 1] = (byte) ((s3 >> 8) & 255);
            }
            C105724z.INSTANCE.mo150610t(v2helper.EMethodSetPlayerPreCorrectCofOn, bArr8, 30);
        }
        if (C107835h0.f322846c.f322768s0 == 0) {
            C105724z.INSTANCE.mo150610t(v2helper.EMethodSetPlayerPreCorrectCofOff, bArr, 1);
        }
        int i39 = C107835h0.f322846c.f322774v0;
        if (i39 > 0) {
            bArr2[0] = (byte) i39;
            C105724z.INSTANCE.mo150610t(v2helper.EMethodSetSpkEnhance, bArr2, 1);
        }
        int i44 = C107835h0.f322846c.f322680B;
        if (i44 > 0) {
            bArr2[0] = (byte) i44;
            C105724z.INSTANCE.mo150610t(431, bArr2, 4);
        }
        int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_agcrx_params, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x_agcrx_paras: %d", Integer.valueOf(Qe5));
        if (Qe5 > 0) {
            byte b7 = (byte) (Qe5 & 1);
            Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agcrx_switch: %d", Byte.valueOf(b7));
            if (b7 > 0) {
                byte[] bArr9 = {(byte) ((Qe5 >> 1) & 3), (byte) ((Qe5 >> 3) & 31), (byte) ((Qe5 >> 8) & 31), (byte) ((Qe5 >> 13) & 1)};
                C105724z.INSTANCE.mo150610t(v2helper.EMethodSetAgcRxOn, bArr9, 4);
                Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc rx para: %d, %d, %d, %d", Byte.valueOf(bArr9[0]), Byte.valueOf(bArr9[1]), Byte.valueOf(bArr9[2]), Byte.valueOf(bArr9[3]));
            }
        }
        C107823c cVar6 = C107835h0.f322846c;
        int i45 = cVar6.f322685D0;
        if (i45 > -1) {
            C105724z.INSTANCE.mo150610t(v2helper.EMethodSetAgcRxOn, new byte[]{(byte) i45, (byte) cVar6.f322687E0, (byte) cVar6.f322689F0, (byte) cVar6.f322691G0}, 4);
        }
        int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_play_fadeinfadeout_switch, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_play_fadeinfadeout_switch = %d", Integer.valueOf(Qe6));
        byte[] bArr10 = {0};
        if (Qe6 > 0) {
            bArr10[0] = (byte) Qe6;
        }
        C105724z zVar = C105724z.INSTANCE;
        zVar.mo150610t(451, bArr10, 1);
        int Qe7 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_play_fadeinfadeout_thresh, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_play_fadeinfadeout_thresh = %d", Integer.valueOf(Qe7));
        bArr10[0] = 0;
        if (Qe7 > 0) {
            bArr10[0] = (byte) Qe7;
        }
        zVar.mo150610t(452, bArr10, 1);
        long[] jArr = {((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_activerangecnt, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange1, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange2, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange3, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange4, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange5, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange6, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange7, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange8, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange9, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange10, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange11, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange12, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange13, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange14, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange15, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange16, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange17, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange18, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange19, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange20, -1)};
        ByteBuffer order = ByteBuffer.allocate(168).order(ByteOrder.LITTLE_ENDIAN);
        order.asLongBuffer().put(jArr);
        byte[] array = order.array();
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_loss_control[0] %d,multi_loss_control[1] %d multi_loss_control[2] %d", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]), Long.valueOf(jArr[2]));
        zVar.mo150610t(453, array, array.length);
        int Qe8 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_rcnnvadctr, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, rcnnvad_switch = %d", Integer.valueOf(Qe8));
        if (Qe8 > 0) {
            zVar.mo150610t(C86940g0.CTRL_INDEX, new byte[]{(byte) Qe8}, 1);
        }
        StringBuilder sb = new StringBuilder(1024);
        VoipModelResMgr.f207454a.mo98750b(sb);
        Log.m105924i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "get ModelRoot: " + sb.toString());
        zVar.mo150610t(938, sb.toString().getBytes(), sb.toString().length());
        int Qe9 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_aec_value, 0);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "dennyliang, iink aec_value = %d", Integer.valueOf(Qe9));
        if (Qe9 > 0) {
            zVar.mo150610t(460, new byte[]{(byte) (Qe9 & 255), (byte) ((Qe9 >> 8) & 255), (byte) ((Qe9 >> 16) & 255), (byte) ((Qe9 >> 24) & 255)}, 4);
        }
        int Qe10 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_howlsup_value, 0);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "dennyliang, ilink howlsup_value = %d", Integer.valueOf(Qe10));
        if (Qe10 > 0) {
            zVar.mo150610t(JsApiAddDownloadTask.CTRL_INDEX, new byte[]{(byte) (Qe10 & 255), (byte) ((Qe10 >> 8) & 255), (byte) ((Qe10 >> 16) & 255), (byte) ((Qe10 >> 24) & 255)}, 4);
        }
        int Qe11 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_frz_sta_peroid, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, iLink updateAudioAdaption, frz_sta_p_x = %d", Integer.valueOf(Qe11));
        if (Qe11 > 0) {
            zVar.mo150610t(C82993v.CTRL_INDEX, new byte[]{(byte) (Qe11 & 255), (byte) ((Qe11 >> 8) & 255), (byte) ((Qe11 >> 16) & 255), (byte) ((Qe11 >> 24) & 255)}, 4);
        }
        int Qe12 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_new_net_state_tips, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, net_state_xexpt = %d", Integer.valueOf(Qe12));
        byte[] bArr11 = {0};
        if (Qe12 == 1) {
            bArr11[0] = 1;
        }
        zVar.mo150610t(C90846d.CTRL_INDEX, bArr11, 1);
        int Qe13 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_play_volume_factor, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, play_vol = %d", Integer.valueOf(Qe13));
        byte[] bArr12 = {0};
        if (Qe13 > 0 && Qe13 < 20) {
            bArr12[0] = (byte) Qe13;
            zVar.mo150610t(C89699b.C89702c.CTRL_INDEX, bArr12, 1);
        }
        int i46 = C107835h0.f322846c.f322736c0;
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, SrvDeviceInfo.mAudioInfo.playVolMT: %d", Integer.valueOf(i46));
        if (i46 > 0 && i46 < 20) {
            bArr12[0] = (byte) i46;
            zVar.mo150610t(C89699b.C89702c.CTRL_INDEX, bArr12, 1);
        }
        int Qe14 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_engine_get_data_config, -1);
        Log.m105925i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, switch_flag_x = %d", Integer.valueOf(Qe14));
        byte[] bArr13 = {0};
        if (Qe14 > 0) {
            bArr13[0] = 1;
        }
        zVar.mo150610t(450, bArr13, 1);
    }
}
