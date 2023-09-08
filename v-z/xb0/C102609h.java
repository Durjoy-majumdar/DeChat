package xb0;

import android.content.Context;
import android.os.Build;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98403m0;
import hd0.C98408n0;
import java.util.ArrayList;
import java.util.Collections;
import kj2.C117407d;
import lc3.C10485b;
import org.json.JSONArray;
import org.json.JSONObject;
import p156gj.C107835h0;
import p156gj.C107842p;
import p156gj.C87203t;
import p206nj.C11171e;
import p645pj.C35511a;
import p823sg.C101615j;
import qe3.C89625d;
import uf0.C102015b;
import uf0.C102016c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xb0.h */
public class C102609h extends C86301e {

    /* renamed from: w */
    public static final int f302140w = C102016c.m134342d("dscp");

    /* renamed from: d */
    public C102608a f302141d = new C102608a();

    /* renamed from: e */
    public byte[] f302142e = null;

    /* renamed from: f */
    public C102015b f302143f;

    /* renamed from: g */
    public C102610j[] f302144g;

    /* renamed from: h */
    public C102610j[] f302145h;

    /* renamed from: i */
    public C102610j[] f302146i;

    /* renamed from: j */
    public C102610j[] f302147j;

    /* renamed from: n */
    public C102610j[] f302148n;

    /* renamed from: o */
    public C102610j[] f302149o;

    /* renamed from: p */
    public C102610j[] f302150p;

    /* renamed from: q */
    public C102610j[] f302151q;

    /* renamed from: r */
    public C102610j[] f302152r;

    /* renamed from: s */
    public C102610j[] f302153s;

    /* renamed from: t */
    public C102610j[] f302154t;

    /* renamed from: u */
    public C102610j[] f302155u;

    /* renamed from: v */
    public C102610j[] f302156v;

    /* renamed from: Am */
    public static boolean m135509Am() {
        long currentTicks = Util.currentTicks();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT, -1)).intValue();
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        String str = Build.BRAND;
        sb.append(str);
        sb.append(C87203t.m108275k());
        String sb4 = sb.toString();
        if (!Util.isNullOrNil((String) null)) {
            throw null;
        } else if (Util.isNullOrNil((String) null)) {
            boolean z = !C11171e.m11044a(18);
            if (str.equalsIgnoreCase("meizu")) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, Boolean.TRUE);
            }
            if (intValue == 0) {
                z = false;
            }
            Log.m105925i("MicroMsg.SubCoreVideoControl", "check can use mmvideoplayer[%b] api[%d, %s] device[%s, %s] abTestFlag[%d] costTime[%d]", Boolean.valueOf(z), Integer.valueOf(i), null, sb4, null, 1, Long.valueOf(Util.ticksToNow(currentTicks)));
            return z;
        } else {
            throw null;
        }
    }

    public static C102609h Fx0() {
        return (C102609h) C86312j.m106911c(C102609h.class);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        if ((r1 & 16) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if ((r1 & 1) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if ((r1 & 4) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if ((r1 & 2) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r0)).mo58784wf(h81.C32735h.C32737c.clicfg_check_h265_legency_config, false) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SubCoreVideoControl", "do not check legacy config, use codec1limit");
        r4 = ((p663qo.C101211h) di3.C86312j.m106911c(p663qo.C101211h.class)).mo140276It();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r7 = p156gj.C107835h0.f322856m.f322900g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r7 == -1) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r7 != 1) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SubCoreVideoControl", "check checkDeviceSupportHevc, scene:%s, flag:%s, configResult:%s, dynamicConfigResult:%s", java.lang.Integer.valueOf(r12), java.lang.Integer.valueOf(r1), java.lang.Boolean.valueOf(r4), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        if (r12 == 2) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if (r12 == 5) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r12 != 6) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r4 == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
        r7 = p156gj.C87203t.m108275k().toLowerCase();
        r9 = ((h81.C32735h) di3.C86312j.m106911c(r0)).Y60(h81.C32735h.C32737c.clicfg_sns_video_sns_disable_h265_download, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r9) != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        if (r9.contains(r7) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SubCoreVideoControl", "model %s is hit, expt:%s", r7, r9);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        if (r12 != 6) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r4 == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r1 = ((h81.C32735h) di3.C86312j.m106911c(r0)).Y60(h81.C32735h.C32737c.clicfg_ad_h265_black_list, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011e, code lost:
        if (r1.contains(r7) == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SubCoreVideoControl", "ad model %s is hit, expt:%s", r7, r1);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012c, code lost:
        if (r12 != 5) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012e, code lost:
        if (r4 == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0130, code lost:
        r12 = ((h81.C32735h) di3.C86312j.m106911c(r0)).mo58784wf(h81.C32735h.C32737c.clicfg_finder_live_video_disable_h265_download, false);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SubCoreVideoControl", "further check checkDeviceSupportHevc bH265PlayDisabled:%b ", java.lang.Boolean.valueOf(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        if (r12 == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SubCoreVideoControl", "model %s is hit", p156gj.C87203t.m108275k().toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        r4 = false;
     */
    /* renamed from: UY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m135510UY(int r12) {
        /*
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SUPPORT_HEVC_VIDEO_INT
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.mo119685f(r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x0030
            boolean r1 = s62.C101554f.m133322g()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4.mo119677K(r2, r5)
        L_0x0030:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.SubCoreVideoControl"
            java.lang.String r7 = "check device support hevc[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            if (r1 > 0) goto L_0x0044
            return r6
        L_0x0044:
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "VideoDownloadH265Flag"
            int r1 = r1.mo107404b(r4, r6)
            switch(r12) {
                case 1: goto L_0x0078;
                case 2: goto L_0x0073;
                case 3: goto L_0x006e;
                case 4: goto L_0x0062;
                case 5: goto L_0x005d;
                case 6: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            r4 = 0
            goto L_0x007d
        L_0x005b:
            r4 = 1
            goto L_0x007d
        L_0x005d:
            r4 = r1 & 16
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0062:
            r4 = r1 & 8
            if (r4 == 0) goto L_0x0068
            r4 = 1
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x007d
            goto L_0x005b
        L_0x006e:
            r4 = r1 & 1
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0073:
            r4 = r1 & 4
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0078:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x007d:
            di3.d r7 = di3.C86312j.m106911c(r0)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_check_h265_legency_config
            boolean r7 = r7.mo58784wf(r8, r6)
            if (r7 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x009e
        L_0x008d:
            java.lang.String r4 = "do not check legacy config, use codec1limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.Class<qo.h> r4 = p663qo.C101211h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            qo.h r4 = (p663qo.C101211h) r4
            boolean r4 = r4.mo140276It()
        L_0x009e:
            gj.m r7 = p156gj.C107835h0.f322856m
            int r7 = r7.f322900g0
            if (r7 == r3) goto L_0x00a9
            if (r7 != r2) goto L_0x00a8
            r4 = 1
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r3[r6] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r8 = 2
            r3[r8] = r1
            r1 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r1] = r7
            java.lang.String r1 = "check checkDeviceSupportHevc, scene:%s, flag:%s, configResult:%s, dynamicConfigResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r3)
            r1 = 6
            r3 = 5
            if (r12 == r8) goto L_0x00d3
            if (r12 == r3) goto L_0x00d3
            if (r12 != r1) goto L_0x012c
        L_0x00d3:
            if (r4 == 0) goto L_0x012c
            java.lang.String r7 = p156gj.C87203t.m108275k()
            java.lang.String r7 = r7.toLowerCase()
            di3.d r9 = di3.C86312j.m106911c(r0)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_sns_video_sns_disable_h265_download
            java.lang.String r11 = ""
            java.lang.String r9 = r9.Y60(r10, r11)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0104
            boolean r10 = r9.contains(r7)
            if (r10 == 0) goto L_0x0104
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r6] = r7
            r4[r2] = r9
            java.lang.String r9 = "model %s is hit, expt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r4)
            r4 = 0
        L_0x0104:
            if (r12 != r1) goto L_0x012c
            if (r4 == 0) goto L_0x012c
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_ad_h265_black_list
            java.lang.String r1 = r1.Y60(r9, r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r9 != 0) goto L_0x012c
            boolean r9 = r1.contains(r7)
            if (r9 == 0) goto L_0x012c
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r6] = r7
            r4[r2] = r1
            java.lang.String r1 = "ad model %s is hit, expt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r4)
            r4 = 0
        L_0x012c:
            if (r12 != r3) goto L_0x015e
            if (r4 == 0) goto L_0x015e
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_finder_live_video_disable_h265_download
            boolean r12 = r12.mo58784wf(r0, r6)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r0[r6] = r1
            java.lang.String r1 = "further check checkDeviceSupportHevc bH265PlayDisabled:%b "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            if (r12 == 0) goto L_0x015e
            java.lang.String r12 = p156gj.C87203t.m108275k()
            java.lang.String r12 = r12.toLowerCase()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r6] = r12
            java.lang.String r12 = "model %s is hit"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r12, r0)
            goto L_0x015f
        L_0x015e:
            r6 = r4
        L_0x015f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C102609h.m135510UY(int):boolean");
    }

    public static int vx0(C98408n0 n0Var) {
        if (!m135510UY(1)) {
            return 1;
        }
        String q = C98398h0.Bx0().mo137728q(n0Var.mo137700d());
        return (C86013q1.m106450k(q) && !C98403m0.m127702b(q)) ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int wx0(int r21, hd0.C98408n0 r22) {
        /*
            r0 = r21
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r2) goto L_0x0010
            if (r0 == r1) goto L_0x000b
            goto L_0x0015
        L_0x000b:
            int r0 = vx0(r22)
            goto L_0x0016
        L_0x0010:
            int r0 = vx0(r22)
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r3] = r4
            java.lang.String r3 = "MicroMsg.SubCoreVideoControl"
            java.lang.String r4 = "check c2c video format[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            if (r0 != r1) goto L_0x0035
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 354(0x162, double:1.75E-321)
            r8 = 130(0x82, double:6.4E-322)
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x0042
        L_0x0035:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 354(0x162, double:1.75E-321)
            r16 = 131(0x83, double:6.47E-322)
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C102609h.wx0(int, hd0.n0):int");
    }

    public static boolean yx0() {
        boolean z;
        String str = null;
        if (Util.isNullOrNil((String) null)) {
            str = "20:00-23:30";
        }
        int b = C101615j.m133462b(C86709a0.m107523b().mo121110g(), 30);
        if (!Util.isNullOrNil(str)) {
            try {
                int b2 = C38471b.m41886b();
                String[] split = str.split(";");
                int i = 0;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].split("-");
                    String[] split3 = split2[0].split(XVFSFile.PATH_SEPARATOR);
                    int safeParseInt = (Util.safeParseInt(split3[0]) * 60) + Util.safeParseInt(split3[1]);
                    String[] split4 = split2[1].split(XVFSFile.PATH_SEPARATOR);
                    int safeParseInt2 = (Util.safeParseInt(split4[0]) * 60) + Util.safeParseInt(split4[1]) + b;
                    if (safeParseInt >= safeParseInt2 ? !((b2 > 1440 || b2 < safeParseInt) && (b2 >= safeParseInt2 || b2 < 0)) : !(b2 >= safeParseInt2 || b2 < safeParseInt)) {
                        z = true;
                        break;
                    }
                    i++;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BusyTimeControlLogic", e, "", new Object[0]);
                Log.m105920e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + e.toString());
            }
            Log.m105925i("MicroMsg.SubCoreVideoControl", "check complete hevc needControl [%b] no complete range[%s] endHash[%d]", Boolean.valueOf(z), str, Integer.valueOf(b));
            return !z;
        }
        z = false;
        Log.m105925i("MicroMsg.SubCoreVideoControl", "check complete hevc needControl [%b] no complete range[%s] endHash[%d]", Boolean.valueOf(z), str, Integer.valueOf(b));
        return !z;
    }

    public final VideoTransPara Ax0(int i) {
        VideoTransPara videoTransPara = new VideoTransPara();
        videoTransPara.f267178s = true;
        videoTransPara.f267172j = 1;
        videoTransPara.f267173n = 48000;
        videoTransPara.f267176q = 2;
        videoTransPara.f267177r = 1;
        videoTransPara.f267175p = 1;
        if (i <= 120) {
            videoTransPara.f267168f = 30;
            videoTransPara.f267166d = TAVPlayer.VIDEO_PLAYER_WIDTH;
            videoTransPara.f267167e = 960;
            videoTransPara.f267169g = 1200000;
        } else {
            videoTransPara.f267168f = 24;
            videoTransPara.f267166d = v2helper.VOIP_ENC_HEIGHT_LV1;
            videoTransPara.f267167e = 640;
            videoTransPara.f267169g = 544000;
        }
        return videoTransPara;
    }

    public final VideoTransPara Bx0() {
        VideoTransPara videoTransPara = new VideoTransPara();
        videoTransPara.f267178s = true;
        videoTransPara.f267166d = 1072;
        videoTransPara.f267167e = (int) (((double) (((float) 1072) * 3.5f)) / 3.0d);
        videoTransPara.f267168f = 30;
        videoTransPara.f267169g = 2000000;
        videoTransPara.f267172j = 1;
        videoTransPara.f267173n = EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        videoTransPara.f267176q = 2;
        videoTransPara.f267177r = 1;
        videoTransPara.f267175p = 1;
        return videoTransPara;
    }

    public final VideoTransPara Cx0() {
        VideoTransPara videoTransPara = new VideoTransPara();
        videoTransPara.f267178s = true;
        videoTransPara.f267166d = TAVExporter.VIDEO_EXPORT_WIDTH;
        videoTransPara.f267167e = 1280;
        videoTransPara.f267168f = 30;
        videoTransPara.f267169g = 2000000;
        videoTransPara.f267172j = 10;
        videoTransPara.f267173n = 64000;
        videoTransPara.f267176q = 2;
        videoTransPara.f267177r = 1;
        videoTransPara.f267175p = 1;
        return videoTransPara;
    }

    public final VideoTransPara Dx0(VideoTransPara videoTransPara, int i) {
        boolean z;
        boolean z2;
        VideoTransPara videoTransPara2 = videoTransPara;
        int i2 = i;
        if (i2 == 2 || i2 == 4 || i2 == 1) {
            if (i2 == 1) {
                videoTransPara2.f267180u = 1;
                videoTransPara2.f267184y = 10;
                videoTransPara2.f267185z = 10;
            } else if (i2 == 2) {
                videoTransPara2.f267180u = 1;
                videoTransPara2.f267184y = 10;
                videoTransPara2.f267185z = 10;
            } else if (i2 != 4) {
                videoTransPara2.f267180u = 0;
            } else {
                videoTransPara2.f267180u = 1;
                videoTransPara2.f267184y = 25;
                videoTransPara2.f267185z = 10;
            }
            videoTransPara2.f267155B = 0;
            videoTransPara2.f267156C = 36;
            videoTransPara2.f267182w = 0.52f;
            videoTransPara2.f267183x = 1.0f;
            videoTransPara2.f267181v = 0;
            videoTransPara2.f267154A = 0;
            videoTransPara2.f267157D = 0;
            videoTransPara2.f267158E = 51;
            videoTransPara2.f267159F = videoTransPara2.f267169g;
            videoTransPara2.f267160G = i2;
            int a = C107842p.m146108a() & 255;
            if (a < 30 || Build.VERSION.SDK_INT <= 25) {
                videoTransPara2.f267180u = 0;
            }
            Log.m105925i("MicroMsg.SubCoreVideoControl", "ABA: Prams abaSwitch: [%d]  qpSwitch: [%d] swHevcRatio: [%f] hwHevcRatio: [%f] ceilingVideoBR: [%d] flooringVideoBR:[%d] minQP: [%d] maxQP: [%d] CPUlevel: [%d] AndroidVersionSDK: [%d] remuxSecene: [%d] isEnable1080p: [%d] maxVideoSize: [%d]", Integer.valueOf(videoTransPara2.f267180u), Integer.valueOf(videoTransPara2.f267181v), Float.valueOf(videoTransPara2.f267182w), Float.valueOf(videoTransPara2.f267183x), Integer.valueOf(videoTransPara2.f267184y), Integer.valueOf(videoTransPara2.f267185z), Integer.valueOf(videoTransPara2.f267157D), Integer.valueOf(videoTransPara2.f267158E), Integer.valueOf(a), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(videoTransPara2.f267160G), Integer.valueOf(videoTransPara2.f267155B), Integer.valueOf(videoTransPara2.f267156C));
        } else {
            videoTransPara2.f267180u = 0;
            videoTransPara2.f267181v = 0;
            videoTransPara2.f267159F = videoTransPara2.f267169g;
            videoTransPara2.f267157D = 0;
            videoTransPara2.f267158E = 51;
            Log.m105924i("MicroMsg.SubCoreVideoControl", "ABA: it does not use the ABA or MinMax QP Limitation");
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("HardcoderQP");
        if (mmkv != null) {
            String decodeString = mmkv.decodeString("HCMinQPKey", (String) null);
            String decodeString2 = mmkv.decodeString("HCMaxQPKey", (String) null);
            if (!(decodeString == null || decodeString2 == null)) {
                int i3 = C107835h0.f322852i.f322645A;
                if (i3 == 0) {
                    z2 = false;
                    z = true;
                } else {
                    z2 = i2 > 0 && i2 <= 3 && i3 > 0 && ((1 << (i2 + -1)) & i3) != 0;
                    z = false;
                }
                Log.m105925i("MicroMsg.SubCoreVideoControl", "steve:[hardcoder] get hardcoder QP key: min:%s, max:%s, forceHWQP:%s, qpSwitch:%s, deviceQPCfg:%s, forceHWQPOff:%s", decodeString, decodeString2, Boolean.valueOf(z2), 0, Integer.valueOf(i3), Boolean.valueOf(z));
                if (!z && z2) {
                    int max = Math.max(0, Math.min(51, 21));
                    int max2 = Math.max(0, Math.min(51, 39));
                    if (!(max == 0 || max2 == 51)) {
                        videoTransPara2.f267157D = max;
                        videoTransPara2.f267158E = max2;
                        Log.m105925i("MicroMsg.SubCoreVideoControl", "steve:[hardcoder] get hardcoder QP key: min:%s, max:%s, value: minQP:%d, maxQP:%d, Scence:%d", decodeString, decodeString2, Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(i));
                    }
                }
            }
        }
        return videoTransPara2;
    }

    public VideoTransPara Ex0(VideoTransPara videoTransPara, String str) {
        C102610j[] jVarArr;
        boolean z;
        int i;
        VideoTransPara videoTransPara2 = videoTransPara;
        if (videoTransPara2 == null) {
            Log.m105920e("MicroMsg.SubCoreVideoControl", "get c2c album video para but original video para is null.");
            return null;
        } else if (videoTransPara2.f267170h >= C35511a.f94971a.mo60283a()) {
            Log.m105929w("MicroMsg.SubCoreVideoControl", "this video duration is large than %s s", 300);
            return null;
        } else {
            long currentTicks = Util.currentTicks();
            VideoTransPara Ax0 = Ax0(videoTransPara2.f267170h);
            if (Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.SubCoreVideoControl", "check c2c album encode step %d", 1);
                if (this.f302155u == null) {
                    this.f302155u = Jx0("C2CAlbumVideoStepConfig");
                }
                jVarArr = this.f302155u;
            } else {
                jVarArr = Kx0(str);
            }
            if (jVarArr != null) {
                for (C102610j jVar : jVarArr) {
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
                        i = this.f302141d.mo142221a(jVar.f302163g, videoTransPara2, Ax0);
                        z = jVar.f302162f;
                        break;
                    }
                }
                i = 0;
            } else {
                Log.m105924i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
                i = this.f302141d.mo142221a((C102611k[]) null, videoTransPara2, Ax0);
            }
            z = true;
            if (i <= 0) {
                Ax0 = Ax0(videoTransPara2.f267170h);
            } else {
                Ax0.f267178s = false;
            }
            Dx0(Ax0, 1);
            if (!z) {
                C115669n.INSTANCE.idkeyStat(422, 1, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(422, 2, 1, false);
            }
            int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(Ax0.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 3, 8));
            C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
            Log.m105925i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(nullAsNil), Integer.valueOf(i), Ax0, videoTransPara2);
            return Ax0;
        }
    }

    public VideoTransPara Gu0() {
        int i;
        Class cls = C32735h.class;
        long currentTicks = Util.currentTicks();
        if (this.f302151q == null) {
            this.f302151q = Jx0("FinderRecordVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (this.f302151q != null) {
            int i2 = 0;
            while (true) {
                C102610j[] jVarArr = this.f302151q;
                if (i2 < jVarArr.length) {
                    C102610j jVar = jVarArr[i2];
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                        videoTransPara = jVar.mo142243a(0);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (videoTransPara == null) {
            videoTransPara = Bx0();
        }
        if (Log.getLogLevel() <= 1 && (i = MMApplicationContext.getContext().getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            videoTransPara.f267169g = i;
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267179t = TAVPlayer.VIDEO_PLAYER_WIDTH;
        Dx0(videoTransPara, 4);
        videoTransPara.f267170h = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_record_video_max_duration_android, 60);
        videoTransPara.f267171i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_record_video_min_duration_android, 1);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara);
        return videoTransPara;
    }

    public VideoTransPara Gx0() {
        boolean z;
        Class cls = C32735h.class;
        long currentTicks = Util.currentTicks();
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_video_control_immediate_effect, true);
        if (this.f302149o == null || wf) {
            C102610j[] Jx0 = Jx0("SnsAlbumVideoConfig");
            this.f302149o = Jx0;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(Jx0 == null);
            objArr[1] = Boolean.valueOf(wf);
            Log.m105925i("MicroMsg.SubCoreVideoControl", "snsAlbumControl is null:[%b] enable:[%b]", objArr);
        }
        VideoTransPara videoTransPara = null;
        if (this.f302149o != null) {
            int i = 0;
            while (true) {
                C102610j[] jVarArr = this.f302149o;
                if (i >= jVarArr.length) {
                    break;
                }
                C102610j jVar = jVarArr[i];
                if (jVar != null) {
                    Log.m105925i("MicroMsg.SubCoreVideoControl", "index:%d content:%s", Integer.valueOf(i), jVar.toString());
                }
                if (jVar != null && jVar.mo142245c()) {
                    Log.m105925i("MicroMsg.SubCoreVideoControl", "index:%d,it busy time, try to get sns album config.", Integer.valueOf(i));
                    videoTransPara = jVar.mo142244b(0);
                    z = jVar.f302162f;
                    break;
                }
                i++;
            }
        }
        z = true;
        if (videoTransPara == null) {
            videoTransPara = Cx0();
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267172j = 10;
        videoTransPara.f267179t = 200;
        videoTransPara.f267170h = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.mmsns_album_sight_max_timelength, 30);
        Dx0(videoTransPara, 2);
        if (!z) {
            C115669n.INSTANCE.idkeyStat(422, 21, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(422, 22, 1, false);
        }
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(videoTransPara.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 23, 28));
        C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get sns album para cost %d. %s rpt %d ", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara, Integer.valueOf(nullAsNil));
        return videoTransPara;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.modelcontrol.VideoTransPara Hx0() {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            java.lang.String r2 = "MicroMsg.SubCoreVideoControl"
            java.lang.String r3 = "getSnsTemplateVideoPara"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            di3.d r3 = di3.C86312j.m106911c(r1)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_video_control_immediate_effect
            r5 = 1
            boolean r3 = r3.mo58784wf(r4, r5)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            xb0.j[] r4 = r0.f302146i
            if (r4 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x002a
        L_0x0022:
            java.lang.String r3 = "SnsVideoTemplateVideoConfig"
            xb0.j[] r3 = r0.Jx0(r3)
            r0.f302146i = r3
        L_0x002a:
            r3 = 0
            xb0.j[] r4 = r0.f302146i
            r8 = 0
            if (r4 == 0) goto L_0x0050
            r4 = 0
        L_0x0031:
            xb0.j[] r9 = r0.f302146i
            int r10 = r9.length
            if (r4 >= r10) goto L_0x0050
            r9 = r9[r4]
            if (r9 == 0) goto L_0x004d
            boolean r10 = r9.mo142245c()
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = "it busy time, try to get sns Record config."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r9.mo142244b(r8)
            boolean r4 = r9.f302162f
            goto L_0x0051
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x0050:
            r4 = 1
        L_0x0051:
            if (r3 != 0) goto L_0x0057
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r25.Cx0()
        L_0x0057:
            r9 = 44100(0xac44, float:6.1797E-41)
            r3.f267174o = r9
            r9 = 10
            r3.f267172j = r9
            r9 = 200(0xc8, float:2.8E-43)
            r3.f267179t = r9
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_maas_export_max_duration
            r10 = 60
            int r1 = r1.mo58779Qe(r9, r10)
            r3.f267170h = r1
            r1 = 2
            r0.Dx0(r3, r1)
            if (r4 != 0) goto L_0x0088
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 422(0x1a6, double:2.085E-321)
            r12 = 31
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x0095
        L_0x0088:
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 422(0x1a6, double:2.085E-321)
            r20 = 32
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
        L_0x0095:
            int r4 = r3.f267169g
            int r4 = r4 / 1000
            r9 = 5
            int[] r9 = new int[r9]
            r9 = {350, 544, 800, 1200, 1600} // fill-array
            r10 = 33
            r11 = 38
            java.lang.Object r4 = kj2.C117407d.m165559s(r4, r9, r10, r11)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r4)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 422(0x1a6, double:2.085E-321)
            long r12 = (long) r4
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r9[r8] = r6
            r9[r5] = r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r1] = r4
            java.lang.String r1 = "get sns template para cost %d. %s rpt %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C102609h.Hx0():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    public byte[] Ix0() {
        if (Util.isNullOrNil(this.f302142e)) {
            try {
                String str = "{\"WXVer\":" + C89625d.f257841g + "}";
                this.f302142e = str.getBytes("UTF-8");
                Log.m105925i("MicroMsg.SubCoreVideoControl", "get weixin video meta %s", str);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SubCoreVideoControl", "get weixin meta error %s ", e.toString());
            }
        }
        return this.f302142e;
    }

    public final C102610j[] Jx0(String str) {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str);
        if (Util.isNullOrNil(c)) {
            Log.m105925i("MicroMsg.SubCoreVideoControl", "key %s config is null", str);
            return null;
        }
        Log.m105925i("MicroMsg.SubCoreVideoControl", "%s=%s ", str, c);
        return Kx0(c);
    }

    public final C102610j[] Kx0(String str) {
        if (!str.startsWith("[")) {
            str = "[" + str;
        }
        if (!str.endsWith("]")) {
            str = str + "]";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            Log.m105919d("MicroMsg.SubCoreVideoControl", "parse config root length %d", Integer.valueOf(length));
            C102610j[] jVarArr = new C102610j[length];
            for (int i = 0; i < length; i++) {
                jVarArr[i] = Lx0(jSONArray.getJSONObject(i));
            }
            return jVarArr;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SubCoreVideoControl", "parse Configs error : " + e.toString());
            return null;
        }
    }

    public final C102610j Lx0(JSONObject jSONObject) {
        JSONArray jSONArray;
        PInt pInt;
        PInt pInt2;
        PInt pInt3;
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "dura";
        C102610j jVar = new C102610j();
        try {
            String string = jSONObject2.isNull("time") ? "" : jSONObject2.getString("time");
            String string2 = jSONObject2.getString("abr");
            String string3 = jSONObject2.getString("intval");
            String string4 = jSONObject2.getString("prof");
            String string5 = jSONObject2.getString("preset");
            String string6 = jSONObject2.isNull("stepbr") ? "0" : jSONObject2.getString("stepbr");
            int i = -1;
            if (jSONObject2.has("codec")) {
                i = jSONObject2.getInt("codec");
            }
            Log.m105925i("MicroMsg.SubCoreVideoControl", "busy time %s audio bitrate %s iframe %s profile %s preset %s stepbr %s codec %d", string, string2, string3, string4, string5, string6, Integer.valueOf(i));
            jVar.f302157a = string;
            int i2 = Util.getInt(string2, 0);
            jVar.f302158b = i2;
            jVar.f302158b = i2 == 0 ? 64000 : i2 * 1000;
            jVar.f302159c = Util.getInt(string3, 10);
            jVar.f302160d = Util.getInt(string4, 2);
            jVar.f302161e = Util.getInt(string5, 1);
            jVar.f302162f = Util.getInt(string6, 0) >= 1;
            jVar.f302164h = i;
            JSONArray jSONArray2 = jSONObject2.getJSONArray("conf");
            ArrayList arrayList = new ArrayList();
            PInt pInt4 = new PInt();
            PInt pInt5 = new PInt();
            PInt pInt6 = new PInt();
            PInt pInt7 = new PInt();
            PInt pInt8 = new PInt();
            PInt pInt9 = new PInt();
            int length = jSONArray2.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                if (Mx0(!jSONObject3.isNull(str2) ? jSONObject3.getString(str2) : "", jSONObject3.getString("wh"), jSONObject3.getString(V2TXJSAdapterConstants.PUSHER_KEY_FPS), jSONObject3.getString("vbr"), pInt4, pInt5, pInt6, pInt7, pInt8, pInt9)) {
                    int i4 = pInt4.value;
                    jSONArray = jSONArray2;
                    int i5 = pInt5.value;
                    str = str2;
                    int i6 = pInt6.value;
                    pInt3 = pInt4;
                    int i7 = pInt7.value;
                    pInt2 = pInt5;
                    int i8 = pInt8.value;
                    pInt = pInt6;
                    int i9 = pInt9.value;
                    arrayList.add(new C102611k(i4, i5, i6, i7, i8, i9, i9));
                } else {
                    jSONArray = jSONArray2;
                    str = str2;
                    pInt3 = pInt4;
                    pInt2 = pInt5;
                    pInt = pInt6;
                }
                i3++;
                jSONArray2 = jSONArray;
                str2 = str;
                pInt4 = pInt3;
                pInt5 = pInt2;
                pInt6 = pInt;
            }
            Collections.sort(arrayList);
            if (arrayList.size() >= 2 && !jVar.f302162f) {
                int i15 = ((C102611k) arrayList.get(0)).f302171j;
                for (int i16 = 1; i16 < arrayList.size(); i16++) {
                    C102611k kVar = (C102611k) arrayList.get(i16);
                    kVar.f302170i = i15;
                    i15 = kVar.f302171j;
                }
            }
            C102611k[] kVarArr = new C102611k[arrayList.size()];
            jVar.f302163g = kVarArr;
            arrayList.toArray(kVarArr);
            Log.m105919d("MicroMsg.SubCoreVideoControl", "parseJsonObject %s", jVar);
            return jVar;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SubCoreVideoControl", "parseJsonObject error : " + e.toString());
            return null;
        }
    }

    public final boolean Mx0(String str, String str2, String str3, String str4, PInt pInt, PInt pInt2, PInt pInt3, PInt pInt4, PInt pInt5, PInt pInt6) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        PInt pInt7 = pInt;
        PInt pInt8 = pInt2;
        PInt pInt9 = pInt3;
        PInt pInt10 = pInt4;
        PInt pInt11 = pInt5;
        PInt pInt12 = pInt6;
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
            return false;
        }
        try {
            if (!Util.isNullOrNil(str)) {
                String[] split = str5.split("~");
                pInt7.value = Util.getInt(split[0], -1);
                int i = Util.getInt(split[1], -1);
                pInt8.value = i;
                if (pInt7.value <= -1 || i <= -1) {
                    return false;
                }
            } else {
                pInt8.value = 0;
                pInt7.value = 0;
            }
            String[] split2 = str6.split("x");
            pInt9.value = Util.getInt(split2[0], -1);
            int i2 = Util.getInt(split2[1], -1);
            pInt10.value = i2;
            if (pInt9.value > -1) {
                if (i2 > -1) {
                    pInt11.value = Util.getInt(str7, -1);
                    int i3 = Util.getInt(str8, -1);
                    pInt12.value = i3;
                    if (pInt11.value > -1) {
                        if (i3 > -1) {
                            pInt12.value = i3 * 1000;
                            Log.m105925i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str5, str6, str7, str8, Integer.valueOf(pInt7.value), Integer.valueOf(pInt8.value), Integer.valueOf(pInt9.value), Integer.valueOf(pInt10.value), Integer.valueOf(pInt11.value), Integer.valueOf(pInt12.value));
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SubCoreVideoControl", "parse video para error." + e.toString());
        }
    }

    /* renamed from: Xa */
    public VideoTransPara mo142236Xa() {
        boolean z;
        long currentTicks = Util.currentTicks();
        if (this.f302144g == null) {
            this.f302144g = Jx0("C2CRecordVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (this.f302144g != null) {
            int i = 0;
            while (true) {
                C102610j[] jVarArr = this.f302144g;
                if (i >= jVarArr.length) {
                    break;
                }
                C102610j jVar = jVarArr[i];
                if (jVar != null && jVar.mo142245c()) {
                    Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get c2c Record config.");
                    videoTransPara = jVar.mo142244b(0);
                    z = jVar.f302162f;
                    break;
                }
                i++;
            }
        }
        z = true;
        if (videoTransPara == null) {
            videoTransPara = new VideoTransPara();
            videoTransPara.f267178s = true;
            videoTransPara.f267166d = TAVPlayer.VIDEO_PLAYER_WIDTH;
            videoTransPara.f267167e = 960;
            videoTransPara.f267168f = 30;
            videoTransPara.f267169g = 1200000;
            videoTransPara.f267172j = 10;
            videoTransPara.f267173n = 64000;
            videoTransPara.f267176q = 2;
            videoTransPara.f267177r = 1;
            videoTransPara.f267175p = 1;
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267172j = 10;
        Dx0(videoTransPara, 1);
        videoTransPara.f267170h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.mmc2c_record_sight_max_timelength_new, 15);
        if (!z) {
            C115669n.INSTANCE.idkeyStat(422, 11, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(422, 12, 1, false);
        }
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(videoTransPara.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 13, 18));
        C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get c2c record para cost %d. %s rpt %d", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara, Integer.valueOf(nullAsNil));
        return videoTransPara;
    }

    public VideoTransPara ai0() {
        boolean z;
        long currentTicks = Util.currentTicks();
        if (this.f302150p == null) {
            this.f302150p = Jx0("StoryRecordVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (this.f302150p != null) {
            int i = 0;
            while (true) {
                C102610j[] jVarArr = this.f302150p;
                if (i >= jVarArr.length) {
                    break;
                }
                C102610j jVar = jVarArr[i];
                if (jVar != null && jVar.mo142245c()) {
                    Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                    videoTransPara = jVar.mo142244b(0);
                    z = jVar.f302162f;
                    break;
                }
                i++;
            }
        }
        z = true;
        if (videoTransPara == null) {
            videoTransPara = new VideoTransPara();
            videoTransPara.f267178s = true;
            videoTransPara.f267166d = TAVExporter.VIDEO_EXPORT_WIDTH;
            videoTransPara.f267167e = 1280;
            videoTransPara.f267168f = 30;
            videoTransPara.f267169g = 3500000;
            videoTransPara.f267172j = 10;
            videoTransPara.f267173n = 48000;
            videoTransPara.f267176q = 2;
            videoTransPara.f267177r = 1;
            videoTransPara.f267175p = 1;
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267172j = 10;
        videoTransPara.f267179t = 200;
        Dx0(videoTransPara, 3);
        if (videoTransPara.f267170h <= 0) {
            videoTransPara.f267170h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_story_capture_duration, 15);
        }
        if (!z) {
            C115669n.INSTANCE.idkeyStat(422, 31, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(422, 32, 1, false);
        }
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(videoTransPara.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 33, 38));
        C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get story record para cost %d. %s rpt %d", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara, Integer.valueOf(nullAsNil));
        return videoTransPara;
    }

    /* renamed from: c6 */
    public VideoTransPara mo142238c6() {
        int i;
        Class cls = C32735h.class;
        long currentTicks = Util.currentTicks();
        if (this.f302152r == null) {
            this.f302152r = Jx0("FinderPublishVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (this.f302152r != null) {
            int i2 = 0;
            while (true) {
                C102610j[] jVarArr = this.f302152r;
                if (i2 < jVarArr.length) {
                    C102610j jVar = jVarArr[i2];
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                        videoTransPara = jVar.mo142243a(0);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (videoTransPara == null) {
            videoTransPara = Bx0();
        }
        if (Log.getLogLevel() <= 1 && (i = MMApplicationContext.getContext().getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            videoTransPara.f267169g = i;
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267179t = TAVPlayer.VIDEO_PLAYER_WIDTH;
        Dx0(videoTransPara, 4);
        videoTransPara.f267170h = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_duration_android, 60);
        videoTransPara.f267171i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_min_duration_android, 1);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara);
        return videoTransPara;
    }

    /* renamed from: cw */
    public VideoTransPara mo142239cw() {
        boolean z;
        long currentTicks = Util.currentTicks();
        if (this.f302145h == null) {
            this.f302145h = Jx0("SnsRecordVideoConfig");
        }
        VideoTransPara videoTransPara = null;
        if (this.f302145h != null) {
            int i = 0;
            while (true) {
                C102610j[] jVarArr = this.f302145h;
                if (i >= jVarArr.length) {
                    break;
                }
                C102610j jVar = jVarArr[i];
                if (jVar != null && jVar.mo142245c()) {
                    Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
                    videoTransPara = jVar.mo142244b(0);
                    z = jVar.f302162f;
                    break;
                }
                i++;
            }
        }
        z = true;
        if (videoTransPara == null) {
            videoTransPara = Cx0();
        }
        videoTransPara.f267174o = 44100;
        videoTransPara.f267172j = 10;
        videoTransPara.f267179t = 200;
        videoTransPara.f267170h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.mmsns_record_sight_max_timelength, 30);
        Dx0(videoTransPara, 2);
        if (!z) {
            C115669n.INSTANCE.idkeyStat(422, 31, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(422, 32, 1, false);
        }
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(videoTransPara.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 33, 38));
        C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get sns record para cost %d. %s rpt %d", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara, Integer.valueOf(nullAsNil));
        return videoTransPara;
    }

    /* renamed from: id */
    public VideoTransPara mo142240id(int i) {
        VideoTransPara videoTransPara;
        long currentTicks = Util.currentTicks();
        if (this.f302154t == null) {
            if (i == 1) {
                this.f302154t = Jx0("GameRecordBigVideoConfig");
            } else {
                this.f302154t = Jx0("GameRecordVideoConfig");
            }
        }
        VideoTransPara videoTransPara2 = null;
        if (this.f302154t != null) {
            int i2 = 0;
            while (true) {
                C102610j[] jVarArr = this.f302154t;
                if (i2 < jVarArr.length) {
                    C102610j jVar = jVarArr[i2];
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get game Record config.");
                        videoTransPara2 = jVar.mo142244b(0);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (videoTransPara2 == null) {
            if (i == 1) {
                videoTransPara = new VideoTransPara();
                videoTransPara.f267178s = true;
                videoTransPara.f267166d = 1080;
                videoTransPara.f267167e = 1920;
                videoTransPara.f267168f = 30;
                videoTransPara.f267169g = 3500000;
                videoTransPara.f267172j = 10;
                videoTransPara.f267173n = 48000;
                videoTransPara.f267176q = 2;
                videoTransPara.f267177r = 1;
                videoTransPara.f267170h = 60;
                videoTransPara.f267175p = 1;
            } else {
                videoTransPara = new VideoTransPara();
                videoTransPara.f267178s = true;
                videoTransPara.f267166d = 1080;
                videoTransPara.f267167e = 1920;
                videoTransPara.f267168f = 30;
                videoTransPara.f267169g = 3500000;
                videoTransPara.f267172j = 10;
                videoTransPara.f267173n = 48000;
                videoTransPara.f267176q = 2;
                videoTransPara.f267177r = 1;
                videoTransPara.f267170h = 60;
                videoTransPara.f267175p = 1;
            }
            videoTransPara2 = videoTransPara;
        }
        videoTransPara2.f267174o = 44100;
        videoTransPara2.f267172j = 10;
        videoTransPara2.f267179t = 200;
        Dx0(videoTransPara2, 1);
        Log.m105925i("MicroMsg.SubCoreVideoControl", "get game record para cost %d. %s", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara2);
        return videoTransPara2;
    }

    public void onAccountReleased(Context context) {
        this.f302144g = null;
        this.f302155u = null;
        this.f302145h = null;
        this.f302149o = null;
    }

    public int xx0(VideoTransPara videoTransPara) {
        if (videoTransPara == null) {
            return 0;
        }
        int i = videoTransPara.f267170h;
        if (i != 10) {
            return i;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac A[SYNTHETIC, Splitter:B:40:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df A[SYNTHETIC, Splitter:B:50:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean zx0(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "MicroMsg.SubCoreVideoControl"
            uf0.b r0 = r1.f302143f
            if (r0 != 0) goto L_0x0011
            uf0.b r0 = new uf0.b
            r0.<init>()
            r1.f302143f = r0
        L_0x0011:
            uf0.b r0 = r1.f302143f
            r4 = -1
            r0.f300398b = r4
            r4 = 0
            r0.f300399c = r4
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            uf0.b r0 = r1.f302143f
            long r7 = r0.mo141510a(r2)
            r9 = 0
            r11 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            return r11
        L_0x002c:
            r9 = 1
            r10 = 2
            java.io.RandomAccessFile r12 = com.tencent.p014mm.vfs.C86013q1.m106420B(r2, r11)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            r12.seek(r7)     // Catch:{ Exception -> 0x0090 }
            r0 = 8
            byte[] r13 = new byte[r0]     // Catch:{ Exception -> 0x0090 }
            int r14 = uf0.C102014a.f300392v     // Catch:{ Exception -> 0x0090 }
            uf0.a r14 = uf0.C102016c.m134340b(r12, r13, r14)     // Catch:{ Exception -> 0x0090 }
            r15 = r4
        L_0x0040:
            if (r14 == 0) goto L_0x0064
            int r15 = f302140w     // Catch:{ Exception -> 0x0090 }
            uf0.a r15 = uf0.C102016c.m134340b(r12, r13, r15)     // Catch:{ Exception -> 0x0090 }
            if (r15 == 0) goto L_0x004b
            goto L_0x0064
        L_0x004b:
            r16 = r5
            long r4 = r14.f300396d     // Catch:{ Exception -> 0x0062 }
            long r18 = r14.mo141508a()     // Catch:{ Exception -> 0x0062 }
            long r4 = r4 + r18
            r12.seek(r4)     // Catch:{ Exception -> 0x0062 }
            int r4 = uf0.C102014a.f300392v     // Catch:{ Exception -> 0x0062 }
            uf0.a r14 = uf0.C102016c.m134340b(r12, r13, r4)     // Catch:{ Exception -> 0x0062 }
            r5 = r16
            r4 = 0
            goto L_0x0040
        L_0x0062:
            r0 = move-exception
            goto L_0x009b
        L_0x0064:
            r16 = r5
            if (r15 == 0) goto L_0x0086
            long r4 = r15.mo141508a()     // Catch:{ Exception -> 0x0062 }
            int r5 = (int) r4     // Catch:{ Exception -> 0x0062 }
            int r5 = r5 - r0
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x0062 }
            long r4 = r15.f300396d     // Catch:{ Exception -> 0x0062 }
            r13 = 8
            long r4 = r4 + r13
            r12.seek(r4)     // Catch:{ Exception -> 0x0062 }
            int r4 = r12.read(r0)     // Catch:{ Exception -> 0x0062 }
            if (r4 <= 0) goto L_0x0086
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r0, r5)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            r12.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x00b2
        L_0x008b:
            goto L_0x00b2
        L_0x008d:
            r0 = move-exception
            r4 = r12
            goto L_0x00dd
        L_0x0090:
            r0 = move-exception
            r16 = r5
            goto L_0x009b
        L_0x0094:
            r0 = move-exception
            r4 = 0
            goto L_0x00dd
        L_0x0097:
            r0 = move-exception
            r16 = r5
            r12 = 0
        L_0x009b:
            java.lang.String r4 = "check is wx meta error %s %s"
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x008d }
            r5[r11] = r2     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008d }
            r5[r9] = r0     // Catch:{ all -> 0x008d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x008d }
            if (r12 == 0) goto L_0x00b1
            r12.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r11] = r4
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r0[r9] = r5
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r16)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r10] = r5
            r5 = 3
            r0[r5] = r2
            java.lang.String r2 = "check is wx meta dscp %s moov %d cost %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "WXVer"
            boolean r0 = r4.contains(r0)
            return r0
        L_0x00dc:
            return r11
        L_0x00dd:
            if (r4 == 0) goto L_0x00e2
            r4.close()     // Catch:{ IOException -> 0x00e2 }
        L_0x00e2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C102609h.zx0(java.lang.String):boolean");
    }
}
