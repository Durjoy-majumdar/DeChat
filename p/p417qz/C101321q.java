package p417qz;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import hd0.C98403m0;
import p682rz.C36594q;
import xb0.C102609h;
import xb0.C102610j;

@C86522b
/* renamed from: qz.q */
public class C101321q extends C86301e implements C36594q {
    /* renamed from: Am */
    public boolean mo60728Am() {
        return C102609h.m135509Am();
    }

    /* renamed from: EJ */
    public int mo60729EJ(int i, String str) {
        int i2 = C102609h.f302140w;
        int i3 = 2;
        if (i == 0 || (!(i == 1 || i == 2) || !C102609h.m135510UY(3) || (C86013q1.m106450k(str) && !C98403m0.m127702b(str)))) {
            i3 = 1;
        }
        Log.m105925i("MicroMsg.SubCoreVideoControl", "check story video format[%d]", Integer.valueOf(i3));
        return i3;
    }

    public VideoTransPara Gu0() {
        return C102609h.Fx0().Gu0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* renamed from: HF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.modelcontrol.VideoTransPara mo60731HF() {
        /*
            r26 = this;
            xb0.h r0 = xb0.C102609h.Fx0()
            r0.getClass()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            xb0.j[] r3 = r0.f302156v
            if (r3 != 0) goto L_0x0017
            java.lang.String r3 = "NearbyRecordVideoConfig"
            xb0.j[] r3 = r0.Jx0(r3)
            r0.f302156v = r3
        L_0x0017:
            r3 = 0
            xb0.j[] r4 = r0.f302156v
            java.lang.String r5 = "MicroMsg.SubCoreVideoControl"
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0040
            r4 = 0
        L_0x0021:
            xb0.j[] r8 = r0.f302156v
            int r9 = r8.length
            if (r4 >= r9) goto L_0x0040
            r8 = r8[r4]
            if (r8 == 0) goto L_0x003d
            boolean r9 = r8.mo142245c()
            if (r9 == 0) goto L_0x003d
            java.lang.String r3 = "is busy time, try to get nearby record config."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r8.mo142244b(r6)
            boolean r4 = r8.f302162f
            goto L_0x0041
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0040:
            r4 = 1
        L_0x0041:
            if (r3 != 0) goto L_0x0047
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r0.Cx0()
        L_0x0047:
            r8 = 44100(0xac44, float:6.1797E-41)
            r3.f267174o = r8
            r8 = 10
            r3.f267172j = r8
            r9 = 200(0xc8, float:2.8E-43)
            r3.f267179t = r9
            r9 = 2
            r0.Dx0(r3, r9)
            int r0 = r3.f267170h
            if (r0 > 0) goto L_0x005e
            r3.f267170h = r8
        L_0x005e:
            if (r4 != 0) goto L_0x006e
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 422(0x1a6, double:2.085E-321)
            r13 = 31
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            goto L_0x007b
        L_0x006e:
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 422(0x1a6, double:2.085E-321)
            r21 = 32
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
        L_0x007b:
            int r0 = r3.f267169g
            int r0 = r0 / 1000
            r4 = 5
            int[] r4 = new int[r4]
            r4 = {350, 544, 800, 1200, 1600} // fill-array
            r8 = 33
            r10 = 38
            java.lang.Object r0 = kj2.C117407d.m165559s(r0, r4, r8, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r0)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 422(0x1a6, double:2.085E-321)
            long r13 = (long) r0
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r6] = r1
            r4[r7] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            java.lang.String r0 = "get nearby record para cost %d. %s rpt %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p417qz.C101321q.mo60731HF():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057 A[Catch:{ Exception -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Le0(int r18) {
        /*
            r17 = this;
            r1 = r18
            int r0 = xb0.C102609h.f302140w
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String[] r3 = s62.C101554f.f297301b
            java.lang.String r4 = "MicroMsg.SubCoreVideoControl"
            r5 = 5
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 != r5) goto L_0x004c
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0044 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0044 }
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_finder_live_video_hw265_white_list     // Catch:{ Exception -> 0x0044 }
            java.lang.String r10 = ""
            java.lang.String r0 = r0.Y60(r9, r10)     // Catch:{ Exception -> 0x0044 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0044 }
            if (r9 != 0) goto L_0x004c
            java.lang.String r9 = ","
            java.lang.String[] r9 = r0.split(r9)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r10 = "check device support scene live,hw265WhiteList is %s, hw265WhiteStrList size is %d!"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0044 }
            r11[r8] = r0     // Catch:{ Exception -> 0x0044 }
            int r0 = r9.length     // Catch:{ Exception -> 0x0044 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
            r11[r7] = r0     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = java.lang.String.format(r10, r11)     // Catch:{ Exception -> 0x0044 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x0044 }
            int r0 = r9.length     // Catch:{ Exception -> 0x0044 }
            if (r0 <= 0) goto L_0x004c
            r3 = r9
            r0 = 1
            goto L_0x004d
        L_0x0044:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x004c:
            r0 = 0
        L_0x004d:
            java.lang.String r9 = "MicroMsg.MediaCodecUtil"
            r10 = 21
            boolean r10 = p206nj.C11171e.m11046c(r10)     // Catch:{ Exception -> 0x00f4 }
            if (r10 == 0) goto L_0x00f2
            java.lang.String[] r10 = s62.C101554f.f297301b     // Catch:{ Exception -> 0x00f4 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "extraHw265Config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0062
        L_0x0061:
            r3 = r10
        L_0x0062:
            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch:{ Exception -> 0x00f4 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00f4 }
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()     // Catch:{ Exception -> 0x00f4 }
            int r10 = r0.length     // Catch:{ Exception -> 0x00f4 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f4 }
            r11.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f4 }
            r12.<init>()     // Catch:{ Exception -> 0x00f4 }
            r13 = 0
        L_0x0077:
            if (r13 >= r10) goto L_0x00e8
            r14 = r0[r13]     // Catch:{ Exception -> 0x00f4 }
            boolean r15 = r14.isEncoder()     // Catch:{ Exception -> 0x00f4 }
            if (r15 != 0) goto L_0x0084
        L_0x0081:
            r16 = r0
            goto L_0x00df
        L_0x0084:
            java.lang.String[] r15 = r14.getSupportedTypes()     // Catch:{ Exception -> 0x00f4 }
            r6 = 0
        L_0x0089:
            int r5 = r15.length     // Catch:{ Exception -> 0x00f4 }
            if (r6 >= r5) goto L_0x0081
            r5 = r15[r6]     // Catch:{ Exception -> 0x00f4 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x00f4 }
            if (r5 != 0) goto L_0x00d6
            r5 = r15[r6]     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = "hevc"
            boolean r5 = r5.contains(r7)     // Catch:{ Exception -> 0x00f4 }
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r14.getName()     // Catch:{ Exception -> 0x00f4 }
            int r7 = r3.length     // Catch:{ Exception -> 0x00f4 }
        L_0x00a3:
            if (r8 >= r7) goto L_0x00d6
            r16 = r0
            r0 = r3[r8]     // Catch:{ Exception -> 0x00f4 }
            boolean r0 = r5.startsWith(r0)     // Catch:{ Exception -> 0x00f4 }
            if (r0 == 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f4 }
            r0.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = "steve : recognized H.265 HW encoder found:"
            r0.append(r7)     // Catch:{ Exception -> 0x00f4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00f4 }
            r11.add(r0)     // Catch:{ Exception -> 0x00f4 }
            r0 = r15[r6]     // Catch:{ Exception -> 0x00f4 }
            r12.add(r0)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00d8
        L_0x00d1:
            int r8 = r8 + 1
            r0 = r16
            goto L_0x00a3
        L_0x00d6:
            r16 = r0
        L_0x00d8:
            int r6 = r6 + 1
            r0 = r16
            r7 = 1
            r8 = 0
            goto L_0x0089
        L_0x00df:
            int r13 = r13 + 1
            r0 = r16
            r5 = 5
            r6 = 2
            r7 = 1
            r8 = 0
            goto L_0x0077
        L_0x00e8:
            boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x00f4 }
            if (r0 == 0) goto L_0x00ef
            goto L_0x00f2
        L_0x00ef:
            r0 = 1
            r3 = 0
            goto L_0x00ff
        L_0x00f2:
            r3 = 0
            goto L_0x00fe
        L_0x00f4:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "isSupportHevcEnc error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r6, r5)
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r6[r3] = r5
            java.lang.String r5 = "check device support hevcenc[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "no hevc encoder found!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0160
        L_0x0116:
            r5 = 5
            if (r1 != r5) goto L_0x0160
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_live_video_disable_h265_encoding
            boolean r0 = r0.mo58784wf(r2, r3)
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r2[r3] = r6
            java.lang.String r6 = "further check checkDeviceSupportHevcEnc bH265EncDisabled:%b "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r2)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = p156gj.C87203t.m108275k()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r0
            java.lang.String r0 = "model %s is hit"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            r0 = 0
            goto L_0x014a
        L_0x0149:
            r0 = 1
        L_0x014a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r2[r3] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2[r5] = r1
            java.lang.String r1 = "check checkDeviceSupportHevcEnc, scene:%s, configResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r2)
            r8 = r0
            goto L_0x0161
        L_0x0160:
            r8 = 0
        L_0x0161:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p417qz.C101321q.Le0(int):boolean");
    }

    /* renamed from: UY */
    public boolean mo60733UY(int i) {
        return C102609h.m135510UY(i);
    }

    /* renamed from: Xa */
    public VideoTransPara mo60734Xa() {
        return C102609h.Fx0().mo142236Xa();
    }

    public VideoTransPara ai0() {
        return C102609h.Fx0().ai0();
    }

    /* renamed from: bW */
    public VideoTransPara mo60736bW(int i) {
        int i2;
        C102609h Fx0 = C102609h.Fx0();
        Fx0.getClass();
        long currentTicks = Util.currentTicks();
        if (Fx0.f302153s == null) {
            Fx0.f302153s = Fx0.Jx0("PublishMegaVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (Fx0.f302153s != null) {
            int i3 = 0;
            while (true) {
                C102610j[] jVarArr = Fx0.f302153s;
                if (i3 < jVarArr.length) {
                    C102610j jVar = jVarArr[i3];
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                        videoTransPara = jVar.mo142243a(0);
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        }
        if (videoTransPara == null) {
            videoTransPara = Fx0.Bx0();
        }
        if (Log.getLogLevel() <= 1 && (i2 = MMApplicationContext.getContext().getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            videoTransPara.f267169g = i2;
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267179t = TAVExporter.VIDEO_EXPORT_WIDTH;
        Fx0.Dx0(videoTransPara, 4);
        videoTransPara.f267170h = i;
        videoTransPara.f267171i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_duration_android, 60);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara);
        return videoTransPara;
    }

    /* renamed from: c6 */
    public VideoTransPara mo60737c6() {
        return C102609h.Fx0().mo142238c6();
    }

    /* renamed from: cw */
    public VideoTransPara mo60738cw() {
        return C102609h.Fx0().mo142239cw();
    }

    /* renamed from: id */
    public VideoTransPara mo60739id(int i) {
        return C102609h.Fx0().mo142240id(i);
    }
}
