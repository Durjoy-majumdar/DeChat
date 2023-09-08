package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import hd0.C98398h0;
import java.util.HashMap;
import lc3.C10485b;
import te3.C101804kv2;
import uf0.C102022j;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper */
public class OnlineVideoViewHelper {

    /* renamed from: A */
    public boolean f277300A = false;

    /* renamed from: B */
    public VideoConfigs f277301B;

    /* renamed from: C */
    public final Object f277302C = new Object();

    /* renamed from: a */
    public final String f277303a;

    /* renamed from: b */
    public int f277304b = 0;

    /* renamed from: c */
    public int f277305c = 0;

    /* renamed from: d */
    public HashMap<String, Integer> f277306d = null;

    /* renamed from: e */
    public C102022j f277307e;

    /* renamed from: f */
    public IVideoUICallback f277308f;

    /* renamed from: g */
    public C101804kv2 f277309g;

    /* renamed from: h */
    public int f277310h;

    /* renamed from: i */
    public String f277311i;

    /* renamed from: j */
    public String f277312j;

    /* renamed from: k */
    public String f277313k;

    /* renamed from: l */
    public int f277314l;

    /* renamed from: m */
    public int f277315m;

    /* renamed from: n */
    public int f277316n;

    /* renamed from: o */
    public int f277317o;

    /* renamed from: p */
    public boolean f277318p;

    /* renamed from: q */
    public int f277319q = 0;

    /* renamed from: r */
    public int f277320r;

    /* renamed from: s */
    public boolean f277321s = false;

    /* renamed from: t */
    public boolean f277322t = false;

    /* renamed from: u */
    public int f277323u = 0;

    /* renamed from: v */
    public long f277324v;

    /* renamed from: w */
    public long f277325w;

    /* renamed from: x */
    public long f277326x;

    /* renamed from: y */
    public long f277327y;

    /* renamed from: z */
    public int f277328z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$IVideoUICallback */
    public interface IVideoUICallback {
        int getPlayErrorCode();

        int getPlayVideoDuration();

        int getPlayVideoDurationByResume();

        VideoRptStruct getRptStruct();

        int getUiStayTime();
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$VideoConfigs */
    public static class VideoConfigs {

        /* renamed from: a */
        public int f277331a;

        /* renamed from: b */
        public int f277332b;

        /* renamed from: c */
        public int f277333c;

        private VideoConfigs() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$VideoRptStruct */
    public static class VideoRptStruct {

        /* renamed from: a */
        public long f277334a = 0;

        /* renamed from: b */
        public String f277335b = "";

        /* renamed from: c */
        public int f277336c = 0;

        /* renamed from: d */
        public String f277337d = "";

        /* renamed from: e */
        public String f277338e = "";

        /* renamed from: f */
        public String f277339f = "";

        /* renamed from: g */
        public String f277340g = "";

        /* renamed from: h */
        public String f277341h = "";

        /* renamed from: i */
        public String f277342i = "";

        /* renamed from: j */
        public String f277343j = "";
    }

    public OnlineVideoViewHelper(IVideoUICallback iVideoUICallback) {
        String str = "MicroMsg.OnlineVideoViewHelper[" + hashCode() + ']';
        this.f277303a = str;
        this.f277308f = iVideoUICallback;
        this.f277307e = new C102022j();
        this.f277306d = new HashMap<>();
        this.f277301B = new VideoConfigs();
        Class cls = C10485b.class;
        SnsMethodCalculate.markStartTimeMs("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f277301B.f277331a = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoPreloadSec", 5);
        this.f277301B.f277332b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoDownloadSec", 1);
        this.f277301B.f277333c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoFullDownloadPercent", 101);
        Log.m105925i(str, "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", Integer.valueOf(this.f277301B.f277331a), Integer.valueOf(this.f277301B.f277332b), Integer.valueOf(this.f277301B.f277333c));
        SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        mo132416o();
        this.f277300A = false;
    }

    /* renamed from: a */
    public final boolean mo132402a(int i, PInt pInt, PInt pInt2) {
        SnsMethodCalculate.markStartTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        pInt.value = Math.max(i, this.f277319q);
        int i2 = this.f277305c;
        if (i2 == 1) {
            pInt.value = i;
            pInt2.value = this.f277320r + i;
        }
        if (i2 == 2) {
            int i3 = i - 8;
            pInt.value = i3;
            if (i3 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f277320r + 8;
        }
        if (i2 == 3 || i2 == 4) {
            pInt.value = this.f277319q;
            pInt2.value = this.f277320r + i + 1 + this.f277301B.f277332b;
        }
        int i4 = pInt2.value;
        int i5 = this.f277314l;
        if (i4 >= i5 + 1) {
            pInt2.value = i5 + 1;
        }
        int i6 = pInt2.value;
        int i7 = pInt.value;
        if (i6 < i7) {
            pInt2.value = i7 + this.f277301B.f277332b;
            SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return false;
        }
        Log.m105925i(this.f277303a, "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", Integer.valueOf(i7), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f277305c), Integer.valueOf(this.f277319q), Integer.valueOf(this.f277320r));
        SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return true;
    }

    /* renamed from: b */
    public boolean mo132403b(String str) {
        SnsMethodCalculate.markStartTimeMs("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        boolean isEqual = Util.isEqual(this.f277313k, str);
        SnsMethodCalculate.markEndTimeMs("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return isEqual;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a5  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132404c(int r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "checkTimer"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r0 = r1.f277300A
            r4 = 0
            if (r0 == 0) goto L_0x0012
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0012:
            int r0 = r1.f277317o
            r5 = -1
            if (r0 == r5) goto L_0x0019
            r6 = r0
            goto L_0x001b
        L_0x0019:
            r6 = r17
        L_0x001b:
            java.lang.String r0 = r1.f277303a
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r7[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9 = 1
            r7[r9] = r8
            int r8 = r1.f277319q
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 2
            r7[r10] = r8
            int r8 = r1.f277314l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 3
            r7[r11] = r8
            int r8 = r1.f277305c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12 = 4
            r7[r12] = r8
            int r8 = r1.f277304b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 5
            r7[r13] = r8
            r8 = 6
            java.lang.String r14 = r1.f277313k
            r7[r8] = r14
            r8 = 7
            long r14 = r1.f277326x
            long r12 = r1.f277324v
            long r14 = r14 - r12
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r7[r8] = r12
            r8 = 8
            boolean r12 = r1.f277321s
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r7[r8] = r12
            java.lang.String r8 = "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s firPlayWait{%d} isPrepareVideo[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r7)
            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$IVideoUICallback r0 = r1.f277308f
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = r1.f277303a
            java.lang.String r5 = "ui is null, checkTimer false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0082:
            int r0 = r1.f277304b
            if (r0 == r9) goto L_0x00d5
            if (r0 == r10) goto L_0x00cc
            if (r0 == r11) goto L_0x0093
            java.lang.String r0 = r1.f277303a
            java.lang.String r4 = "check time default."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            goto L_0x0291
        L_0x0093:
            r16.mo132412k()
            boolean r0 = r1.f277321s
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r1.f277318p
            if (r0 == 0) goto L_0x00b1
            int r0 = r1.f277317o
            if (r0 == r5) goto L_0x00aa
            r1.mo132421t(r0, r9)
            r1.f277317o = r5
            r1.f277318p = r4
            goto L_0x00b1
        L_0x00aa:
            boolean r0 = r16.mo132420s()
            r0 = r0 ^ r9
            r1.f277318p = r0
        L_0x00b1:
            r1.f277305c = r11
            r1.mo132422u(r6)
            goto L_0x0291
        L_0x00b8:
            int r0 = r1.f277305c
            r5 = 5
            if (r0 != r5) goto L_0x00bf
            r1.f277305c = r9
        L_0x00bf:
            boolean r0 = r16.mo132411j()
            if (r0 == 0) goto L_0x0291
            r1.mo132419r(r4)
            r1.f277321s = r9
            goto L_0x0291
        L_0x00cc:
            java.lang.String r0 = r1.f277303a
            java.lang.String r4 = "download error."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            goto L_0x0291
        L_0x00d5:
            java.lang.String r7 = "checkCanPlay"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            int r0 = r1.f277304b
            if (r0 != r11) goto L_0x00e3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            r8 = 1
            goto L_0x013c
        L_0x00e3:
            int r0 = r1.f277319q
            int r8 = r0 - r6
            if (r8 > r9) goto L_0x00f2
            int r8 = r1.f277314l
            if (r0 >= r8) goto L_0x00f2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            r8 = 0
            goto L_0x013c
        L_0x00f2:
            com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
            r0.<init>()
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            uf0.j r12 = r1.f277307e     // Catch:{ Exception -> 0x011d }
            int r13 = r6 + 1
            boolean r12 = r12.mo89449d(r6, r13, r0, r8)     // Catch:{ Exception -> 0x011d }
            if (r12 == 0) goto L_0x011b
            com.tencent.mm.modelcdntran.e0 r12 = hd0.C98398h0.xx0()     // Catch:{ Exception -> 0x011d }
            java.lang.String r13 = r1.f277313k     // Catch:{ Exception -> 0x011d }
            int r0 = r0.value     // Catch:{ Exception -> 0x011d }
            int r8 = r8.value     // Catch:{ Exception -> 0x011d }
            boolean r8 = r12.mo126989m(r13, r0, r8)     // Catch:{ Exception -> 0x011d }
            if (r8 != 0) goto L_0x0139
            r1.f277319q = r6     // Catch:{ Exception -> 0x0119 }
            goto L_0x0139
        L_0x0119:
            r0 = move-exception
            goto L_0x011f
        L_0x011b:
            r8 = 0
            goto L_0x0139
        L_0x011d:
            r0 = move-exception
            r8 = 0
        L_0x011f:
            java.lang.String r12 = r1.f277303a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "check video data error: "
            r13.append(r14)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0139:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x013c:
            if (r8 != 0) goto L_0x01a5
            java.lang.String r0 = "pauseByLoadData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            r1.f277318p = r9
            int r7 = r1.f277319q
            if (r7 > 0) goto L_0x0154
            int r7 = r1.f277317o
            if (r7 != r5) goto L_0x0151
            r1.f277305c = r9
            goto L_0x019f
        L_0x0151:
            r1.f277305c = r10
            goto L_0x019f
        L_0x0154:
            java.lang.String r7 = r1.f277303a
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r11 = r1.f277313k
            r8[r4] = r11
            int r11 = r1.f277323u
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r9] = r11
            int r11 = r1.f277305c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r10] = r11
            java.lang.String r11 = "pause by load data cdnMediaId %s, pauseByLoadDataCount %d, playStatus %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r8)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f277327y = r7
            int r7 = r1.f277305c
            if (r7 == r10) goto L_0x0198
            r8 = 4
            if (r7 == r8) goto L_0x0198
            int r7 = r1.f277320r
            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$VideoConfigs r8 = r1.f277301B
            int r8 = r8.f277331a
            int r7 = r7 + r8
            r1.f277320r = r7
            r8 = 60
            int r7 = java.lang.Math.min(r7, r8)
            r1.f277320r = r7
            int r7 = r1.f277323u
            int r7 = r7 + r9
            r1.f277323u = r7
            r7 = 4
            r1.f277305c = r7
        L_0x0198:
            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$IVideoUICallback r7 = r1.f277308f
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r7
            r7.mo132316F()
        L_0x019f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            r0 = 0
            goto L_0x0258
        L_0x01a5:
            r16.mo132412k()
            boolean r0 = r1.f277321s
            if (r0 == 0) goto L_0x0237
            r1.mo132422u(r6)
            boolean r0 = r16.mo132411j()
            if (r0 == 0) goto L_0x0257
            java.lang.String r0 = "resumeByDataGain"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            boolean r7 = r1.f277318p
            if (r7 == 0) goto L_0x0214
            int r7 = r1.f277323u
            r12 = 0
            if (r7 != 0) goto L_0x01cf
            long r7 = r1.f277326x
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x01cf
            r16.mo132412k()
            goto L_0x01e0
        L_0x01cf:
            long r7 = r1.f277327y
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e0
            int r12 = r1.f277328z
            long r12 = (long) r12
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r7)
            long r12 = r12 + r7
            int r7 = (int) r12
            r1.f277328z = r7
        L_0x01e0:
            java.lang.String r7 = r1.f277303a
            java.lang.Object[] r8 = new java.lang.Object[r11]
            int r12 = r1.f277323u
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r4] = r12
            int r12 = r1.f277328z
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r9] = r12
            java.lang.String r12 = r1.f277313k
            r8[r10] = r12
            java.lang.String r10 = "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d cdnMediaId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r8)
            r1.f277305c = r11
            int r7 = r1.f277317o
            if (r7 == r5) goto L_0x020c
            r1.mo132421t(r7, r9)
            r1.f277317o = r5
            r1.f277318p = r4
            goto L_0x0233
        L_0x020c:
            boolean r7 = r16.mo132420s()
            r7 = r7 ^ r9
            r1.f277318p = r7
            goto L_0x0233
        L_0x0214:
            int r7 = r1.f277305c
            if (r7 == r11) goto L_0x0233
            java.lang.String r8 = r1.f277303a
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10[r4] = r7
            java.lang.String r7 = "start to play video playStatus[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r10)
            boolean r7 = r16.mo132420s()
            if (r7 == 0) goto L_0x022f
            goto L_0x0231
        L_0x022f:
            int r11 = r1.f277305c
        L_0x0231:
            r1.f277305c = r11
        L_0x0233:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x0257
        L_0x0237:
            java.lang.String r0 = r1.f277303a
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r8 = r1.f277313k
            r7[r4] = r8
            java.lang.String r8 = "prepare cdnMediaId [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r7)
            int r0 = r1.f277305c
            r7 = 5
            if (r0 != r7) goto L_0x024c
            r1.f277305c = r9
        L_0x024c:
            boolean r0 = r16.mo132411j()
            if (r0 == 0) goto L_0x0257
            r1.mo132419r(r9)
            r1.f277321s = r9
        L_0x0257:
            r0 = 1
        L_0x0258:
            r1.mo132422u(r6)
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            boolean r6 = r1.mo132402a(r6, r7, r8)
            if (r6 == 0) goto L_0x0280
            int r5 = r7.value
            int r6 = r8.value
            boolean r4 = r1.mo132415n(r5, r6, r4)
            if (r4 == 0) goto L_0x0290
            int r0 = r1.f277319q
            int r4 = r8.value
            int r0 = java.lang.Math.max(r0, r4)
            r1.f277319q = r0
            goto L_0x0291
        L_0x0280:
            java.lang.String r6 = r1.f277303a
            java.lang.String r7 = "can not calc download."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            com.tencent.mm.modelcdntran.e0 r6 = hd0.C98398h0.xx0()
            java.lang.String r7 = r1.f277313k
            r6.mo126990n(r7, r4, r5, r4)
        L_0x0290:
            r9 = r0
        L_0x0291:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoViewHelper.mo132404c(int):boolean");
    }

    /* renamed from: d */
    public void mo132405d() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        Log.m105924i(this.f277303a, "clear");
        this.f277300A = true;
        mo132416o();
        synchronized (this.f277302C) {
            try {
                this.f277308f = null;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
        this.f277307e = null;
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: e */
    public final Object[] mo132406e() {
        String str;
        String str2;
        String str3;
        long j;
        int i;
        String str4;
        int i2;
        int i3;
        int i4;
        int i5;
        SnsMethodCalculate.markStartTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        Object[] objArr = new Object[14];
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    i5 = iVideoUICallback.getPlayVideoDuration();
                    i4 = this.f277308f.getUiStayTime();
                    i3 = this.f277308f.getPlayErrorCode();
                    i2 = this.f277308f.getRptStruct().f277336c;
                    str4 = this.f277308f.getRptStruct().f277335b;
                    j = this.f277308f.getRptStruct().f277334a;
                    str3 = this.f277308f.getRptStruct().f277337d;
                    str2 = this.f277308f.getRptStruct().f277338e;
                    str = this.f277308f.getRptStruct().f277339f;
                    i = this.f277308f.getPlayVideoDurationByResume();
                } else {
                    str4 = "";
                    str3 = "";
                    str2 = "";
                    str = "";
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                    j = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
        objArr[0] = Integer.valueOf(i5);
        long j2 = j;
        if (this.f277326x <= 0) {
            this.f277326x = Util.nowMilliSecond();
        }
        int i6 = (int) (this.f277326x - this.f277324v);
        if (i6 <= 0) {
            i6 = 0;
        }
        objArr[1] = Integer.valueOf(i6);
        if (this.f277325w <= 0) {
            this.f277325w = Util.nowMilliSecond();
        }
        int i7 = i4;
        int i8 = (int) (this.f277325w - this.f277324v);
        if (i8 <= 0) {
            i8 = 0;
        }
        objArr[2] = Integer.valueOf(i8);
        objArr[3] = Integer.valueOf(this.f277323u);
        if (this.f277323u > 0) {
            int i9 = this.f277328z;
            if (i9 == 0) {
                this.f277328z = (int) (((long) i9) + Util.milliSecondsToNow(this.f277327y));
            }
            objArr[4] = Integer.valueOf(this.f277328z / this.f277323u);
        } else {
            objArr[4] = 0;
        }
        objArr[5] = Integer.valueOf(i7);
        objArr[6] = Integer.valueOf(i3);
        objArr[7] = Integer.valueOf(i2);
        objArr[8] = str4;
        objArr[9] = Long.valueOf(j2);
        objArr[10] = str3;
        objArr[11] = str2;
        objArr[12] = str;
        objArr[13] = Integer.valueOf(i);
        SnsMethodCalculate.markEndTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return objArr;
    }

    /* renamed from: f */
    public void mo132407f(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f277322t = false;
        if (i <= -1 || i2 <= -1) {
            Log.m105929w(this.f277303a, "deal data available error offset[%d], length[%d]", Integer.valueOf(i), Integer.valueOf(i2));
            SnsMethodCalculate.markEndTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        if (mo132403b(str)) {
            Integer num = this.f277306d.get(this.f277313k + i + "_" + i2);
            if (num == null || num.intValue() <= 0) {
                try {
                    this.f277319q = this.f277307e.mo89448c(i, i2);
                } catch (Exception e) {
                    String str2 = this.f277303a;
                    Log.m105920e(str2, "deal data available file pos to video time error: " + e.toString());
                }
            } else {
                this.f277319q = num.intValue();
            }
            Log.m105925i(this.f277303a, "deal data available. offset[%d] length[%d] cachePlayTime[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f277319q));
        }
        SnsMethodCalculate.markEndTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: g */
    public void mo132408g(long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        Log.m105925i(this.f277303a, "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", Long.valueOf(j), Integer.valueOf(this.f277314l), this.f277313k, Long.valueOf(j2), Long.valueOf(this.f277324v));
        if (this.f277314l != 0) {
            Log.m105928w(this.f277303a, "moov had callback, do nothing.");
            SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        long j3 = this.f277324v;
        if (j2 > j3) {
            j3 = j2;
        }
        this.f277324v = j3;
        this.f277325w = Util.nowMilliSecond();
        try {
            C102022j jVar = this.f277307e;
            if (jVar == null) {
                Log.m105928w(this.f277303a, "parser is null, thread is error.");
                SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return;
            }
            long j4 = j;
            if (jVar.mo89446a(this.f277312j, j)) {
                int i = this.f277307e.f300429f;
                this.f277314l = i;
                Log.m105925i(this.f277303a, "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", Integer.valueOf(i), this.f277313k, Boolean.valueOf(z));
                if (!z) {
                    SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    MMHandlerThread.postToMainThread(new Runnable() {
                        public void run() {
                            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                            OnlineVideoViewHelper onlineVideoViewHelper = OnlineVideoViewHelper.this;
                            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            IVideoUICallback iVideoUICallback = onlineVideoViewHelper.f277308f;
                            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            if (iVideoUICallback != null && OnlineVideoViewHelper.this.mo132404c(0)) {
                                OnlineVideoViewHelper onlineVideoViewHelper2 = OnlineVideoViewHelper.this;
                                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                IVideoUICallback iVideoUICallback2 = onlineVideoViewHelper2.f277308f;
                                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                if (iVideoUICallback2 != null) {
                                    OnlineVideoViewHelper onlineVideoViewHelper3 = OnlineVideoViewHelper.this;
                                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    boolean j = onlineVideoViewHelper3.mo132411j();
                                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    if (j) {
                                        OnlineVideoViewHelper onlineVideoViewHelper4 = OnlineVideoViewHelper.this;
                                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        onlineVideoViewHelper4.mo132412k();
                                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        OnlineVideoViewHelper onlineVideoViewHelper5 = OnlineVideoViewHelper.this;
                                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        onlineVideoViewHelper5.mo132419r(true);
                                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        OnlineVideoViewHelper onlineVideoViewHelper6 = OnlineVideoViewHelper.this;
                                        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        onlineVideoViewHelper6.f277321s = true;
                                        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    }
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                        }
                    });
                    SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                }
                if (this.f277317o == -1) {
                    this.f277305c = 1;
                } else {
                    this.f277305c = 2;
                }
                SnsMethodCalculate.markStartTimeMs("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                C115669n.INSTANCE.idkeyStat(354, 204, 1, false);
                SnsMethodCalculate.markEndTimeMs("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            } else {
                Log.m105929w(this.f277303a, "mp4 parse moov error. cdnMediaId %s", this.f277313k);
                C98398h0.xx0().mo126990n(this.f277313k, 0, -1, 0);
                mo132417p();
            }
            SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        } catch (Exception e) {
            String str = this.f277303a;
            Log.m105920e(str, "deal moov ready error: " + e.toString());
        }
    }

    /* renamed from: h */
    public void mo132409h(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (mo132403b(str)) {
            this.f277315m = i2;
            this.f277316n = (i * 100) / i2;
            Log.m105925i(this.f277303a, "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", this.f277313k, Integer.valueOf(i), Integer.valueOf(this.f277315m), Integer.valueOf(this.f277316n));
        }
        if (this.f277316n >= 100) {
            this.f277304b = 3;
        }
        SnsMethodCalculate.markEndTimeMs("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: i */
    public void mo132410i() {
        SnsMethodCalculate.markStartTimeMs("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        Log.m105925i(this.f277303a, "deal stream finish. playStatus %d cdnMediaId %s", Integer.valueOf(this.f277305c), this.f277313k);
        this.f277322t = false;
        this.f277304b = 3;
        SnsMethodCalculate.markStartTimeMs("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        C115669n.INSTANCE.idkeyStat(354, 206, 1, false);
        SnsMethodCalculate.markEndTimeMs("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        int i = this.f277305c;
        if (i == 0) {
            Log.m105928w(this.f277303a, "it had not moov callback and download finish start to play video.");
            mo132413l();
        } else if (i == 5) {
            String str = this.f277303a;
            Log.m105928w(str, "it had play error, it request all video data finish, start to play." + this.f277313k);
            mo132413l();
        }
        SnsMethodCalculate.markEndTimeMs("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: j */
    public final boolean mo132411j() {
        SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z = ((OnlineVideoView) iVideoUICallback).f277170R0;
                    SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    Log.m105925i(this.f277303a, "isPlayAllowed: %s", Boolean.toString(z));
                    OnlineVideoView onlineVideoView = (OnlineVideoView) this.f277308f;
                    onlineVideoView.getClass();
                    SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z2 = onlineVideoView.f277170R0;
                    SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return z2;
                }
                SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return false;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo132412k() {
        SnsMethodCalculate.markStartTimeMs("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (this.f277326x == 0) {
            this.f277326x = Util.nowMilliSecond();
        }
        SnsMethodCalculate.markEndTimeMs("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: l */
    public final void mo132413l() {
        SnsMethodCalculate.markStartTimeMs("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        Log.m105925i(this.f277303a, "play offline video %s ", this.f277313k);
        mo132412k();
        MMHandlerThread.postToMainThread(new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
                OnlineVideoViewHelper onlineVideoViewHelper = OnlineVideoViewHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                boolean j = onlineVideoViewHelper.mo132411j();
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                if (j) {
                    OnlineVideoViewHelper onlineVideoViewHelper2 = OnlineVideoViewHelper.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    IVideoUICallback iVideoUICallback = onlineVideoViewHelper2.f277308f;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (iVideoUICallback != null) {
                        OnlineVideoViewHelper onlineVideoViewHelper3 = OnlineVideoViewHelper.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        onlineVideoViewHelper3.mo132419r(false);
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
            }
        });
        SnsMethodCalculate.markEndTimeMs("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: m */
    public void mo132414m() {
        SnsMethodCalculate.markStartTimeMs("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        String str = this.f277313k + 0 + "_" + -1;
        if (!this.f277306d.containsKey(str)) {
            Log.m105925i(this.f277303a, "request all data. [%s]", this.f277313k);
            C98398h0.xx0().mo126990n(this.f277313k, 0, -1, 0);
            this.f277306d.put(str, 0);
            SnsMethodCalculate.markStartTimeMs("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(354, 207, 1, false);
            nVar.mo160131h(13836, 403, Long.valueOf(Util.nowSecond()), "");
            SnsMethodCalculate.markEndTimeMs("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        }
        this.f277305c = 5;
        this.f277318p = true;
        this.f277321s = false;
        SnsMethodCalculate.markEndTimeMs("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0050  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo132415n(int r12, int r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "requestVideoData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
            r2.<init>()
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            r4 = 0
            uf0.j r5 = r11.f277307e     // Catch:{ Exception -> 0x0032 }
            boolean r12 = r5.mo89449d(r12, r13, r2, r3)     // Catch:{ Exception -> 0x0032 }
            if (r12 == 0) goto L_0x004d
            int r12 = r3.value     // Catch:{ Exception -> 0x0032 }
            r5 = 81920(0x14000, float:1.14794E-40)
            int r12 = r12 + r5
            r3.value = r12     // Catch:{ Exception -> 0x0032 }
            com.tencent.mm.modelcdntran.e0 r12 = hd0.C98398h0.xx0()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r5 = r11.f277313k     // Catch:{ Exception -> 0x0032 }
            int r6 = r2.value     // Catch:{ Exception -> 0x0032 }
            int r7 = r3.value     // Catch:{ Exception -> 0x0032 }
            boolean r12 = r12.mo126989m(r5, r6, r7)     // Catch:{ Exception -> 0x0032 }
            goto L_0x004e
        L_0x0032:
            r12 = move-exception
            java.lang.String r5 = r11.f277303a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "check video data error: "
            r6.append(r7)
            java.lang.String r12 = r12.toString()
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r12)
        L_0x004d:
            r12 = 0
        L_0x004e:
            if (r12 != 0) goto L_0x0111
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r11.f277306d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r11.f277313k
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "_"
            r6.append(r7)
            r8 = -1
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L_0x0118
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r11.f277313k
            r5.append(r6)
            int r6 = r2.value
            r5.append(r6)
            r5.append(r7)
            int r6 = r3.value
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r11.f277303a
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r2.value
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            int r8 = r3.value
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r7[r9] = r8
            r8 = 2
            boolean r10 = r11.f277322t
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7[r8] = r10
            r8 = 3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            r7[r8] = r10
            java.lang.String r8 = "request video data [%d, %d] isRequestNow[%b] isSeek[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r11.f277306d
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x00fa
            boolean r6 = r11.f277322t
            if (r6 == 0) goto L_0x00c7
            if (r14 == 0) goto L_0x00fa
        L_0x00c7:
            r11.f277322t = r9
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r11.f277306d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.put(r5, r13)
            com.tencent.mm.modelcdntran.e0 r13 = hd0.C98398h0.xx0()
            java.lang.String r14 = r11.f277313k
            int r2 = r2.value
            int r3 = r3.value
            int r13 = r13.mo126990n(r14, r2, r3, r4)
            if (r13 == 0) goto L_0x0118
            r11.f277322t = r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r11.f277306d
            r14.remove(r5)
            java.lang.String r14 = r11.f277303a
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r4] = r13
            java.lang.String r13 = "requestVideoData not success %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r2)
            goto L_0x0118
        L_0x00fa:
            java.lang.String r13 = r11.f277303a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "already request video : "
            r14.append(r2)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            goto L_0x0118
        L_0x0111:
            java.lang.String r13 = r11.f277303a
            java.lang.String r14 = "already had video data."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
        L_0x0118:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoViewHelper.mo132415n(int, int, boolean):boolean");
    }

    /* renamed from: o */
    public void mo132416o() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f277313k = "";
        this.f277317o = -1;
        this.f277319q = 0;
        this.f277314l = 0;
        this.f277323u = 0;
        this.f277305c = 0;
        this.f277304b = 0;
        this.f277318p = false;
        this.f277321s = false;
        this.f277322t = false;
        this.f277306d.clear();
        this.f277309g = null;
        this.f277310h = 0;
        this.f277311i = null;
        VideoConfigs videoConfigs = this.f277301B;
        if (videoConfigs != null) {
            this.f277320r = videoConfigs.f277331a;
        }
        this.f277325w = 0;
        this.f277324v = 0;
        this.f277328z = 0;
        long j = (long) 0;
        this.f277327y = j;
        this.f277326x = j;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: p */
    public final void mo132417p() {
        SnsMethodCalculate.markStartTimeMs("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(354, 205, 1, false);
        nVar.mo160131h(13836, 402, Long.valueOf(Util.nowSecond()), "");
        SnsMethodCalculate.markEndTimeMs("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: q */
    public boolean mo132418q() {
        boolean z;
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("stopStreamDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (!Util.isNullOrNil(this.f277313k)) {
            boolean z2 = this.f277304b == 3;
            Log.m105925i(this.f277303a, "stop online download video %s isFinish %b percent %d", this.f277313k, Boolean.valueOf(z2), Integer.valueOf(this.f277316n));
            C94866e1.hy0().mo131037w(this.f277313k, mo132406e());
            if (this.f277316n >= this.f277301B.f277333c && !z2) {
                C94866e1.hy0().mo131028n(this.f277309g, this.f277310h, this.f277311i, false, false, 36, this.f277313k);
            }
            SnsMethodCalculate.markStartTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            C115669n.INSTANCE.idkeyStat(354, 203, 1, false);
            SnsMethodCalculate.markEndTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            str2 = "stopStreamDownload";
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            z = true;
        } else {
            SnsMethodCalculate.markStartTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            Object[] e = mo132406e();
            long j = (long) 0;
            PInt pInt = new PInt();
            new PInt().value = 0;
            pInt.value = 0;
            int iOSNetType = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
            int intValue = ((Integer) e[1]).intValue();
            int intValue2 = ((Integer) e[2]).intValue();
            int intValue3 = ((Integer) e[3]).intValue();
            int intValue4 = ((Integer) e[4]).intValue();
            int intValue5 = ((Integer) e[5]).intValue();
            int intValue6 = ((Integer) e[6]).intValue();
            int intValue7 = ((Integer) e[7]).intValue();
            int intValue8 = ((Long) e[9]).intValue();
            int i = intValue6;
            long intValue9 = (long) (((Integer) e[13]).intValue() * 1000);
            int i2 = intValue4;
            long l = C86013q1.m106451l((String) e[12]);
            SnsOnlineVideoReportStruct snsOnlineVideoReportStruct = new SnsOnlineVideoReportStruct();
            snsOnlineVideoReportStruct.f266140n = (long) iOSNetType;
            snsOnlineVideoReportStruct.f266126g = j;
            snsOnlineVideoReportStruct.f266101K = j;
            snsOnlineVideoReportStruct.f266124f = l;
            snsOnlineVideoReportStruct.f266104N = snsOnlineVideoReportStruct.mo86045b("SnsPublishid", (String) e[10], true);
            snsOnlineVideoReportStruct.f266120d = snsOnlineVideoReportStruct.mo86045b("SnsVideoUrl", (String) e[11], true);
            snsOnlineVideoReportStruct.f266130i = intValue9;
            snsOnlineVideoReportStruct.f266132j = (long) intValue;
            snsOnlineVideoReportStruct.f266134k = (long) intValue2;
            snsOnlineVideoReportStruct.f266136l = (long) intValue3;
            snsOnlineVideoReportStruct.f266138m = (long) i2;
            snsOnlineVideoReportStruct.f266099I = (long) intValue5;
            snsOnlineVideoReportStruct.f266100J = i;
            snsOnlineVideoReportStruct.f266112V = intValue7;
            z = true;
            snsOnlineVideoReportStruct.f266113W = snsOnlineVideoReportStruct.mo86045b("AutoPlaySessionID", (String) e[8], true);
            snsOnlineVideoReportStruct.f266114X = intValue8;
            snsOnlineVideoReportStruct.mo86054n();
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            SnsMethodCalculate.markEndTimeMs("rptVideoPause", str);
            str2 = "stopStreamDownload";
        }
        SnsMethodCalculate.markEndTimeMs(str2, str);
        return z;
    }

    /* renamed from: r */
    public final void mo132419r(boolean z) {
        SnsMethodCalculate.markStartTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    ((OnlineVideoView) iVideoUICallback).mo132318H(this.f277312j, z);
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: s */
    public final boolean mo132420s() {
        SnsMethodCalculate.markStartTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    boolean J = ((OnlineVideoView) iVideoUICallback).mo132320J();
                    SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return J;
                }
                SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return true;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo132421t(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    ((OnlineVideoView) iVideoUICallback).mo132322N(i, z);
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* renamed from: u */
    public final void mo132422u(int i) {
        SnsMethodCalculate.markStartTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.f277302C) {
            try {
                IVideoUICallback iVideoUICallback = this.f277308f;
                if (iVideoUICallback != null) {
                    ((OnlineVideoView) iVideoUICallback).mo132336b0(i * 1000);
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }
}
