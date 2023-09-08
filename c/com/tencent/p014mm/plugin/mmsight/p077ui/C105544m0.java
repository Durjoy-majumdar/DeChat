package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f72.C97842b;
import i72.C108375b;
import i72.C108377g;
import i72.C108388k;
import i72.C108389l;
import i72.C108392r;
import i72.C98609j;
import lu3.C88656g;
import org.json.JSONObject;
import p206nj.C100115c;
import te3.C101783gu2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.m0 */
public class C105544m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313951d;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.m0$a */
    public class C105545a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ long f313952d;

        public C105545a(long j) {
            this.f313952d = j;
        }

        public String getKey() {
            return "BigSightFFMpegRecorder_markAfterCaptureFinish_idkeystat";
        }

        public void run() {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            String filePath = C105544m0.this.f313951d.f313871j.getFilePath();
            C101783gu2 gu22 = C105544m0.this.f313951d.f313834M;
            C108392r rVar = C108388k.f324540d;
            int i6 = rVar.f324551a;
            int i7 = rVar.f324557g;
            try {
                if (!Util.isNullOrNil(filePath)) {
                    if (C86013q1.m106450k(filePath)) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(440, 87, 1, false);
                        JSONObject jSONObject = new JSONObject(SightVideoJNI.getSimpleMp4InfoVFS(filePath));
                        int i8 = (int) jSONObject.getDouble("videoFPS");
                        int optInt = jSONObject.optInt("videoBitrate");
                        Log.m105925i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s, recorderType: %s, resolutionLimit: %s", Integer.valueOf(i8), Integer.valueOf(optInt), Integer.valueOf(i6), Integer.valueOf(i7));
                        int i9 = 50;
                        C108375b.m146794b().mo158889a(filePath, i8);
                        if (i6 == 1) {
                            i9 = 69;
                            i4 = 2;
                            i5 = i8;
                            i = optInt;
                            nVar.idkeyStat(440, 89, 1, false);
                            nVar.idkeyStat(440, 49, (long) i5, false);
                            i3 = 93;
                            i2 = 73;
                        } else {
                            i5 = i8;
                            i = optInt;
                            i4 = 2;
                            nVar.idkeyStat(440, 88, 1, false);
                            nVar.idkeyStat(440, 48, (long) i5, false);
                            i3 = 90;
                            i2 = 54;
                        }
                        if (i7 == 720) {
                            i9 += 6;
                            i3++;
                            i2 += 6;
                        } else {
                            C108392r rVar2 = C108388k.f324540d;
                            if ((rVar2.f324552b.f267166d < rVar2.f324557g) || i7 == 1080) {
                                i9 += 12;
                                i3 += 2;
                                i2 += 12;
                            }
                        }
                        int i15 = i3;
                        long j = (long) i5;
                        int i16 = i9;
                        nVar.idkeyStat(440, (long) i2, j, false);
                        nVar.idkeyStat(440, (long) i15, 1, false);
                        nVar.idkeyStat(440, 47, j, false);
                        Object[] objArr = new Object[i4];
                        objArr[0] = filePath;
                        objArr[1] = Integer.valueOf(i16);
                        Log.m105925i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", objArr);
                        if (i5 < 0 || i5 > 10) {
                            int i17 = i16;
                            if (i5 > 10 && i5 <= 15) {
                                nVar.idkeyStat(440, (long) (i17 + 1), 1, false);
                            } else if (i5 > 15 && i5 <= 20) {
                                nVar.idkeyStat(440, (long) (i17 + 2), 1, false);
                            } else if (i5 > 20 && i5 <= 30) {
                                nVar.idkeyStat(440, (long) (i17 + 3), 1, false);
                            }
                        } else {
                            nVar.idkeyStat(440, (long) i16, 1, false);
                        }
                        int i18 = i;
                        if (i18 > 0) {
                            if (i6 == i4) {
                                long j2 = (long) i18;
                                nVar.idkeyStat(440, 175, j2, false);
                                nVar.idkeyStat(440, 176, 1, false);
                                if (gu22 != null) {
                                    int i19 = gu22.f298311g;
                                    if (i19 == 1) {
                                        nVar.idkeyStat(440, 184, j2, false);
                                        nVar.idkeyStat(440, 185, 1, false);
                                    } else if (i19 == i4) {
                                        nVar.idkeyStat(440, 194, j2, false);
                                        nVar.idkeyStat(440, 195, 1, false);
                                    }
                                }
                            } else {
                                long j3 = (long) i18;
                                nVar.idkeyStat(440, 179, j3, false);
                                nVar.idkeyStat(440, 180, 1, false);
                                if (gu22 != null) {
                                    int i25 = gu22.f298311g;
                                    if (i25 == 1) {
                                        nVar.idkeyStat(440, 189, j3, false);
                                        nVar.idkeyStat(440, 190, 1, false);
                                    } else if (i25 == i4) {
                                        nVar.idkeyStat(440, 199, j3, false);
                                        nVar.idkeyStat(440, 200, 1, false);
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
            } catch (Exception e) {
                z = false;
                Log.m105921e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e.getMessage());
            }
            C108389l.m146841b(z, this.f313952d);
        }
    }

    public C105544m0(SightCaptureUI sightCaptureUI, int i, int i2) {
        this.f313951d = sightCaptureUI;
    }

    public void run() {
        SightCaptureUI sightCaptureUI = this.f313951d;
        Log.printInfoStack("MicroMsg.SightCaptureUI", "call stop callback now, currentStatus: %s", sightCaptureUI.mo150353V7(sightCaptureUI.f313866g));
        this.f313951d.f313870i.mo158908m(C108377g.C108380c.Stoping);
        this.f313951d.mo150345N7();
        long o = C97842b.m126298o("TIME_RECODER_2_PLAY");
        ((C119157j) C119157j.f356862d).mo183875f(new C105545a(o));
        Log.m105927v("MicroMsg.TestCaptureUiEvent", "doStopRecorderAndStartPreviewDone %s", Util.getStack().toString());
        Log.m105925i("MicroMsg.SightCaptureUI", "stop finish, filepath: %s %s time_takevideo %s", this.f313951d.f313871j.getFilePath(), Long.valueOf(C86013q1.m106451l(this.f313951d.f313871j.getFilePath())), Long.valueOf(o));
        SightCaptureUI sightCaptureUI2 = this.f313951d;
        sightCaptureUI2.f313852X0 = sightCaptureUI2.f313871j.getMd5();
        SightCaptureUI.m141708I7(this.f313951d);
        SightCaptureUI sightCaptureUI3 = this.f313951d;
        sightCaptureUI3.getClass();
        C98609j.f289118a.postToWorker(new C105547n0(sightCaptureUI3));
        SightCaptureUI sightCaptureUI4 = this.f313951d;
        sightCaptureUI4.getClass();
        Log.m105924i("MicroMsg.SightCaptureUI", "start preview");
        C100115c cVar = sightCaptureUI4.f313884x0;
        if (cVar != null) {
            cVar.mo139415b();
        }
        sightCaptureUI4.f313829H.setVisibility(0);
        sightCaptureUI4.f313829H.setAlpha(0.0f);
        sightCaptureUI4.f313829H.setVideoPath(sightCaptureUI4.f313871j.getFilePath());
        sightCaptureUI4.f313829H.setLoop(true);
        sightCaptureUI4.f313829H.setForceScaleFullScreen(true);
        sightCaptureUI4.f313829H.setVideoCallback(sightCaptureUI4.f313869h1);
        MMHandlerThread.postToMainThreadDelayed(this.f313951d.f313867g1, 1000);
        int i = this.f313951d.f313847V.f248458o;
        if (i == 1 || i == 2 || i == 7) {
            C115669n.INSTANCE.mo160131h(13819, 2, Integer.valueOf(this.f313951d.f313847V.f248458o), this.f313951d.f313847V.f248460q, Long.valueOf(Util.nowSecond()));
        }
    }
}
