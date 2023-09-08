package p466cn;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p1088th.C101879a;
import p375qh.C35873j;
import p492dn.C107053k;
import p492dn.C107057m;

@C86522b
/* renamed from: cn.c */
public class C104382c extends C86301e implements C107057m, C107053k {
    public void Kp0(int i, int i2) {
        Integer[] numArr = C101879a.f299973a;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 1) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceUseMic");
                    C115669n.INSTANCE.mo175913w(1202, 0, 1);
                } else if (i2 == 7) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceUseVoiceCommunicationFailed");
                    C115669n.INSTANCE.mo175913w(1202, 1, 1);
                }
            }
        } else if (i2 == 1) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceUseMicFailed");
            C115669n.INSTANCE.mo175913w(1201, 0, 1);
        } else if (i2 == 7) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceUseVoiceCommunicationFailed");
            C115669n.INSTANCE.mo175913w(1201, 1, 1);
        }
    }

    public void Q80(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoRecordReport");
            C115669n.INSTANCE.mo175913w(1201, 42, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoRecordReport");
            C115669n.INSTANCE.mo175913w(1202, 42, 1);
        }
    }

    /* renamed from: Qs */
    public void mo146055Qs(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markZeroDataCauseUseHeadsetPlugged");
            C115669n.INSTANCE.mo175913w(1201, 48, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markZeroDataCauseUseHeadsetPlugged");
            C115669n.INSTANCE.mo175913w(1202, 48, 1);
        }
    }

    /* renamed from: To */
    public void mo146056To(int i, int i2, String str, int i3, int i4, int i5, int i6) {
        String str2 = str;
        Integer[] numArr = C101879a.f299973a;
        C87412m.m108594g(str2, "featureKey");
        if (C101879a.f299974b != 0) {
            int intValue = (C101879a.f299973a[0].intValue() * 100) / C101879a.f299974b;
            int intValue2 = (C101879a.f299973a[1].intValue() * 100) / C101879a.f299974b;
            int intValue3 = (C101879a.f299973a[2].intValue() * 100) / C101879a.f299974b;
            int intValue4 = (C101879a.f299973a[3].intValue() * 100) / C101879a.f299974b;
            Log.m105924i("MicroMsg.AudioRecordReportUtil", "audioType = " + i + " ,scenes = " + i2 + ",featureKey=" + str2 + ",pcmSilent=" + intValue + ", pcmLow=" + intValue2 + ",pcmMiddle=" + intValue3 + ",pcmHigh=" + intValue4 + ",systemSilent=0,systemLow=0,systemMiddle=0,systemHigh=0,audioSource=" + i3 + ",sampleRate=" + i4 + ",mChannelConfig=" + i5 + ",mRecordDetailState=" + i6);
            C115669n.INSTANCE.mo160140o(18554, true, true, Integer.valueOf(i), Integer.valueOf(i2), str2, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), 0, 0, 0, 0, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
            C101879a.f299975c = 0;
        }
    }

    /* renamed from: UF */
    public void mo146057UF(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoMinBufferSizeError");
            C115669n.INSTANCE.mo175913w(1201, 38, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoMinBufferSizeError");
            C115669n.INSTANCE.mo175913w(1202, 38, 1);
        }
    }

    public void Vn0(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoNewAudioRecordeError");
            C115669n.INSTANCE.mo175913w(1201, 39, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoNewAudioRecordeError");
            C115669n.INSTANCE.mo175913w(1202, 39, 1);
        }
    }

    /* renamed from: XY */
    public boolean mo146059XY() {
        return 1 == C35873j.m40885a("EnableRecorderCheckUnreasonableData", 1);
    }

    /* renamed from: aE */
    public void mo146060aE(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markZeroDataCauseMute");
            C115669n.INSTANCE.mo175913w(1201, 47, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markZeroDataCauseMute");
            C115669n.INSTANCE.mo175913w(1202, 47, 1);
        }
    }

    /* renamed from: eB */
    public void mo146061eB(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoRecordModeNullError");
            C115669n.INSTANCE.mo175913w(1201, 41, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoRecordModeNullError");
            C115669n.INSTANCE.mo175913w(1202, 41, 1);
        }
    }

    /* renamed from: hu */
    public void mo146062hu(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Integer[] numArr = C101879a.f299973a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i4 == 1) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceSwitchMicSuccess");
                    C115669n.INSTANCE.mo175913w(1202, 4, 1);
                } else if (i4 == 7) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceSwitchVCSuccess");
                    C115669n.INSTANCE.mo175913w(1202, 2, 1);
                }
            }
        } else if (i4 == 1) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceSwitchMicSuccess");
            C115669n.INSTANCE.mo175913w(1201, 4, 1);
        } else if (i4 == 7) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceSwitchVCSuccess");
            C115669n.INSTANCE.mo175913w(1201, 2, 1);
        }
    }

    /* renamed from: hw */
    public void mo146063hw(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioRecordHasBeenInit");
            C115669n.INSTANCE.mo175913w(1201, 37, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioRecordHasBeenInit");
            C115669n.INSTANCE.mo175913w(1202, 37, 1);
        }
    }

    /* renamed from: lu */
    public void mo146064lu(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Integer[] numArr = C101879a.f299973a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i4 == 1) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceSwitchMicFailed");
                    C115669n.INSTANCE.mo175913w(1202, 5, 1);
                } else if (i4 == 7) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceSwitchVCFailed");
                    C115669n.INSTANCE.mo175913w(1202, 3, 1);
                }
            }
        } else if (i4 == 1) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceSwitchMicFailed");
            C115669n.INSTANCE.mo175913w(1201, 5, 1);
        } else if (i4 == 7) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceSwitchVCFailed");
            C115669n.INSTANCE.mo175913w(1201, 3, 1);
        }
    }

    /* renamed from: oS */
    public void mo146065oS(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Integer[] numArr = C101879a.f299973a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i4 == 1) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestMIC");
                    C115669n.INSTANCE.mo175913w(1202, 34, 1);
                } else if (i4 == 7) {
                    Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestVC");
                    C115669n.INSTANCE.mo175913w(1202, 35, 1);
                }
            }
        } else if (i4 == 1) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestMIC");
            C115669n.INSTANCE.mo175913w(1201, 34, 1);
        } else if (i4 == 7) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestVC");
            C115669n.INSTANCE.mo175913w(1201, 35, 1);
        }
    }

    /* renamed from: oh */
    public void mo146066oh(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markMicroPhonesMute");
            C115669n.INSTANCE.mo175913w(1201, 36, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markMicroPhonesMute");
            C115669n.INSTANCE.mo175913w(1202, 36, 1);
        }
    }

    public void wu0(int i) {
        Integer[] numArr = C101879a.f299973a;
        if (i == 0) {
            Log.m105924i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoStartRecordError");
            C115669n.INSTANCE.mo175913w(1201, 40, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoStartRecordError");
            C115669n.INSTANCE.mo175913w(1202, 40, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void yd0(int r45) {
        /*
            r44 = this;
            r0 = r45
            int r1 = p1088th.C101879a.f299974b
            if (r1 == 0) goto L_0x060b
            java.lang.Integer[] r1 = p1088th.C101879a.f299973a
            int r2 = r1.length
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x05f7
            r6 = r1[r4]
            int r7 = r5 + 1
            int r6 = r6.intValue()
            r8 = 100
            int r6 = r6 * 100
            int r9 = p1088th.C101879a.f299974b
            int r9 = r6 / r9
            long r13 = (long) r9
            java.lang.String r9 = "markPCMAmplitudeHigh "
            java.lang.String r10 = "markPCMAmplitudeMiddle: "
            java.lang.String r11 = "markPCMAmplitudeInLow="
            java.lang.String r12 = "markPCMAmplitudeSilent "
            java.lang.String r15 = "MicroMsg.VOIPPCMRecorderIDKeyStat"
            java.lang.String r3 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat"
            r8 = 3
            r16 = r11
            r11 = 2
            r17 = r12
            r12 = 1
            if (r0 == 0) goto L_0x00da
            if (r0 == r12) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            if (r5 == 0) goto L_0x00b4
            if (r5 == r12) goto L_0x008e
            if (r5 == r11) goto L_0x006a
            if (r5 == r8) goto L_0x0042
        L_0x003e:
            r8 = r15
            r15 = 2
            goto L_0x00ec
        L_0x0042:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1202(0x4b2, double:5.94E-321)
            r19 = 33
            r8 = 1
            r9 = 2
            r11 = r17
            r21 = r13
            r13 = r19
            r8 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x006a:
            r21 = r13
            r8 = r15
            r9 = 2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r13)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r15 = 26
            r13 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x008e:
            r21 = r13
            r8 = r15
            r9 = 2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r16
            r10.append(r11)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r15 = 19
            r13 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x00b4:
            r21 = r13
            r8 = r15
            r9 = 2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r12 = r17
            r10.append(r12)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r15 = 12
            r13 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x00da:
            r21 = r13
            r8 = r15
            r11 = r16
            r12 = r17
            r15 = 2
            if (r5 == 0) goto L_0x0156
            r13 = 1
            if (r5 == r13) goto L_0x0134
            if (r5 == r15) goto L_0x0112
            r11 = 3
            if (r5 == r11) goto L_0x00ef
        L_0x00ec:
            r9 = 2
            goto L_0x0179
        L_0x00ef:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r13 = r21
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r19 = 33
            r13 = r19
            r9 = 2
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x0112:
            r9 = 2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r13 = r21
            r11.append(r13)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r15 = 26
            r13 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x0134:
            r9 = 2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r13 = r21
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r15 = 19
            r13 = r15
            r15 = r21
            r10.mo175913w(r11, r13, r15)
            goto L_0x0179
        L_0x0156:
            r9 = 2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r13 = r21
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r15 = 12
            r19 = r13
            r13 = r15
            r15 = r19
            r10.mo175913w(r11, r13, r15)
        L_0x0179:
            int r10 = p1088th.C101879a.f299974b
            int r6 = r6 / r10
            java.lang.String r10 = "markPCMAmplitudeHighPercentAround40"
            java.lang.String r11 = "markPCMAmplitudeMiddlePercentAround40"
            java.lang.String r12 = "markPCMAmplitudeLowPercentAround40"
            java.lang.String r13 = "markPCMAmplitudeSilentPercentAround40"
            java.lang.String r14 = "markPCMAmplitudeHighPercentAround20"
            java.lang.String r15 = "markPCMAmplitudeMiddlePercentAround20"
            java.lang.String r9 = "markPCMAmplitudeLowPercentAround20"
            r17 = r1
            java.lang.String r1 = "markPCMAmplitudeSilentPercentAround20"
            r19 = r2
            java.lang.String r2 = "markPCMAmplitudeHighPercentAround0"
            r20 = r7
            java.lang.String r7 = "markPCMAmplitudeMiddlePercentAround0"
            r21 = r4
            java.lang.String r4 = "markPCMAmplitudeLowPercentAround0"
            r22 = r3
            java.lang.String r3 = "markPCMAmplitudeSilentPercentAround0"
            r23 = r13
            java.lang.String r13 = "markPCMAmplitudeMiddlePercentAround100"
            r24 = r1
            java.lang.String r1 = "markPCMAmplitudeHighPercentAround60"
            r25 = r3
            java.lang.String r3 = "markPCMAmplitudeMiddlePercentAround80"
            r26 = r12
            java.lang.String r12 = "markPCMAmplitudeLowPercentAround100"
            r27 = r12
            java.lang.String r12 = "markPCMAmplitudeMiddlePercentAround60"
            r28 = r9
            java.lang.String r9 = "markPCMAmplitudeLowPercentAround80"
            r29 = r9
            java.lang.String r9 = "markPCMAmplitudeSilentPercentAround100"
            r30 = r9
            java.lang.String r9 = "markPCMAmplitudeLowPercentAround60"
            r31 = r9
            java.lang.String r9 = "markPCMAmplitudeSilentPercentAround80"
            r32 = r9
            java.lang.String r9 = "markPCMAmplitudeSilentPercentAround60"
            r33 = r9
            java.lang.String r9 = "markPCMAmplitudeHighPercentAround100"
            r34 = r4
            java.lang.String r4 = "markPCMAmplitudeHighPercentAround80"
            r35 = r13
            if (r0 == 0) goto L_0x03d5
            r13 = 1
            if (r0 == r13) goto L_0x01d7
            goto L_0x05eb
        L_0x01d7:
            if (r5 == 0) goto L_0x0353
            if (r5 == r13) goto L_0x02d1
            r13 = 2
            if (r5 == r13) goto L_0x0259
            r13 = 3
            if (r5 == r13) goto L_0x01e3
            goto L_0x05eb
        L_0x01e3:
            if (r6 != 0) goto L_0x01f5
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 27
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x01f5:
            r2 = 20
            if (r6 > r2) goto L_0x0209
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r14)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 28
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x0209:
            r2 = 40
            if (r6 > r2) goto L_0x021d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 29
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x021d:
            r2 = 60
            if (r6 > r2) goto L_0x0231
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r13 = 30
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x0231:
            r1 = 80
            if (r6 > r1) goto L_0x0245
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r13 = 31
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x0245:
            r1 = 100
            if (r6 > r1) goto L_0x05eb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1202(0x4b2, double:5.94E-321)
            r13 = 32
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x0259:
            if (r6 != 0) goto L_0x026b
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1202(0x4b2, double:5.94E-321)
            r4 = 20
            r6 = 1
            r1.mo175913w(r2, r4, r6)
            goto L_0x05eb
        L_0x026b:
            r1 = 20
            if (r6 > r1) goto L_0x027f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 21
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x027f:
            r1 = 40
            if (r6 > r1) goto L_0x0293
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 22
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x0293:
            r1 = 60
            if (r6 > r1) goto L_0x02a7
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1202(0x4b2, double:5.94E-321)
            r25 = 23
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x02a7:
            r1 = 80
            if (r6 > r1) goto L_0x02bb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 24
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x02bb:
            r1 = 100
            if (r6 > r1) goto L_0x05eb
            r13 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1202(0x4b2, double:5.94E-321)
            r4 = 25
            r6 = 1
            r1.mo175913w(r2, r4, r6)
            goto L_0x05eb
        L_0x02d1:
            if (r6 != 0) goto L_0x02e5
            r1 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 13
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x02e5:
            r1 = 20
            if (r6 > r1) goto L_0x02fb
            r1 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 14
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x02fb:
            r1 = 40
            if (r6 > r1) goto L_0x0311
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 15
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x0311:
            r1 = 60
            if (r6 > r1) goto L_0x0327
            r1 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 16
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x0327:
            r1 = 80
            if (r6 > r1) goto L_0x033d
            r1 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 17
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x033d:
            r1 = 100
            if (r6 > r1) goto L_0x05eb
            r1 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 18
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x0353:
            if (r6 != 0) goto L_0x0367
            r1 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 6
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x0367:
            r1 = 20
            if (r6 > r1) goto L_0x037d
            r1 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 7
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x037d:
            r1 = 40
            if (r6 > r1) goto L_0x0393
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 8
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x0393:
            r1 = 60
            if (r6 > r1) goto L_0x03a9
            r1 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 9
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x03a9:
            r1 = 80
            if (r6 > r1) goto L_0x03bf
            r1 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 10
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x03bf:
            r1 = 100
            if (r6 > r1) goto L_0x05eb
            r1 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1202(0x4b2, double:5.94E-321)
            r12 = 11
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x05eb
        L_0x03d5:
            r36 = r24
            r37 = r25
            r38 = r27
            r0 = r28
            r39 = r29
            r40 = r30
            r41 = r31
            r42 = r32
            r43 = r33
            r8 = r34
            r13 = r35
            if (r5 == 0) goto L_0x056e
            r28 = r0
            r0 = 1
            if (r5 == r0) goto L_0x04ec
            r0 = 2
            if (r5 == r0) goto L_0x0474
            r0 = 3
            if (r5 == r0) goto L_0x03fa
            goto L_0x05eb
        L_0x03fa:
            if (r6 != 0) goto L_0x040e
            r0 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 27
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x040e:
            r0 = r22
            r2 = 20
            if (r6 > r2) goto L_0x0424
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 28
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x0424:
            r2 = 40
            if (r6 > r2) goto L_0x0438
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 29
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x0438:
            r2 = 60
            if (r6 > r2) goto L_0x044c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r13 = 30
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x044c:
            r1 = 80
            if (r6 > r1) goto L_0x0460
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r13 = 31
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x0460:
            r1 = 100
            if (r6 != r1) goto L_0x05eb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1201(0x4b1, double:5.934E-321)
            r13 = 32
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x05eb
        L_0x0474:
            r0 = r22
            if (r6 != 0) goto L_0x0488
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1201(0x4b1, double:5.934E-321)
            r3 = 20
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x05eb
        L_0x0488:
            r1 = 20
            if (r6 > r1) goto L_0x049c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 21
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x049c:
            r1 = 40
            if (r6 > r1) goto L_0x04b0
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 22
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x04b0:
            r1 = 60
            if (r6 > r1) goto L_0x04c4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 23
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x04c4:
            r1 = 80
            if (r6 > r1) goto L_0x04d8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 24
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x04d8:
            r1 = 100
            if (r6 != r1) goto L_0x05eb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1201(0x4b1, double:5.934E-321)
            r25 = 25
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            goto L_0x05eb
        L_0x04ec:
            r0 = r22
            if (r6 != 0) goto L_0x0500
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1201(0x4b1, double:5.934E-321)
            r3 = 13
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x05eb
        L_0x0500:
            r1 = 20
            if (r6 > r1) goto L_0x0516
            r1 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 14
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x0516:
            r1 = 40
            if (r6 > r1) goto L_0x052c
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 15
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x052c:
            r1 = 60
            if (r6 > r1) goto L_0x0542
            r1 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 16
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x0542:
            r1 = 80
            if (r6 > r1) goto L_0x0558
            r1 = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 17
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x0558:
            r1 = 100
            if (r6 != r1) goto L_0x05eb
            r1 = r38
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1201(0x4b1, double:5.934E-321)
            r5 = 18
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x05eb
        L_0x056e:
            r0 = r22
            if (r6 != 0) goto L_0x0583
            r1 = r37
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 6
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x0583:
            r1 = 20
            if (r6 > r1) goto L_0x0598
            r1 = r36
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 7
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x0598:
            r1 = 40
            if (r6 > r1) goto L_0x05ad
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 8
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x05ad:
            r1 = 60
            if (r6 > r1) goto L_0x05c2
            r1 = r43
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 9
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x05c2:
            r1 = 80
            if (r6 > r1) goto L_0x05d7
            r1 = r42
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1201(0x4b1, double:5.934E-321)
            r10 = 10
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            goto L_0x05eb
        L_0x05d7:
            r1 = 100
            if (r6 != r1) goto L_0x05eb
            r1 = r40
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1201(0x4b1, double:5.934E-321)
            r5 = 11
            r7 = 1
            r2.mo175913w(r3, r5, r7)
        L_0x05eb:
            int r4 = r21 + 1
            r0 = r45
            r1 = r17
            r2 = r19
            r5 = r20
            goto L_0x000b
        L_0x05f7:
            r0 = 0
            p1088th.C101879a.f299974b = r0
            r1 = 4
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r3 = 0
        L_0x05fe:
            if (r3 >= r1) goto L_0x0609
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x05fe
        L_0x0609:
            p1088th.C101879a.f299973a = r2
        L_0x060b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466cn.C104382c.yd0(int):void");
    }
}
