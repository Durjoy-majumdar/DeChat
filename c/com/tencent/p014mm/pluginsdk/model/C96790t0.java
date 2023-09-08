package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelimage.C80999a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import f62.C75700k0;
import hd0.C98394e0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import ig3.C98692n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kj2.C117407d;
import te3.C101783gu2;

/* renamed from: com.tencent.mm.pluginsdk.model.t0 */
public class C96790t0 extends Thread {

    /* renamed from: v */
    public static HashMap<String, C96793d> f283532v = new HashMap<>();

    /* renamed from: w */
    public static Object f283533w = new byte[0];

    /* renamed from: x */
    public static QueueWorkerThread f283534x;

    /* renamed from: y */
    public static int f283535y;

    /* renamed from: d */
    public Context f283536d;

    /* renamed from: e */
    public List<String> f283537e;

    /* renamed from: f */
    public Intent f283538f;

    /* renamed from: g */
    public String f283539g;

    /* renamed from: h */
    public int f283540h;

    /* renamed from: i */
    public boolean f283541i;

    /* renamed from: j */
    public C80999a f283542j;

    /* renamed from: n */
    public String f283543n;

    /* renamed from: o */
    public List<Integer> f283544o;

    /* renamed from: p */
    public List<String> f283545p;

    /* renamed from: q */
    public List<String> f283546q;

    /* renamed from: r */
    public List<Integer> f283547r;

    /* renamed from: s */
    public C85608c f283548s;

    /* renamed from: t */
    public boolean f283549t;

    /* renamed from: u */
    public C96792b f283550u = new C96792b();

    /* renamed from: com.tencent.mm.pluginsdk.model.t0$c */
    public interface C85608c {
        /* renamed from: a */
        void mo102714a(List<Integer> list, List<String> list2, List<String> list3, List<Integer> list4);
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.t0$a */
    public class C96791a implements Runnable {
        public C96791a() {
        }

        public void run() {
            C96790t0 t0Var = C96790t0.this;
            t0Var.f283548s.mo102714a(t0Var.f283544o, t0Var.f283545p, t0Var.f283546q, t0Var.f283547r);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.t0$b */
    public static class C96792b {

        /* renamed from: a */
        public ABAPrams f283552a;
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.t0$d */
    public static class C96793d implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public String f283553d;

        /* renamed from: e */
        public String f283554e;

        /* renamed from: f */
        public String f283555f;

        /* renamed from: g */
        public int f283556g;

        /* renamed from: h */
        public int f283557h;

        /* renamed from: i */
        public String f283558i;

        /* renamed from: j */
        public VideoTransPara f283559j;

        /* renamed from: n */
        public ABAPrams f283560n;

        /* renamed from: o */
        public boolean f283561o;

        /* renamed from: p */
        public boolean f283562p = false;

        /* renamed from: q */
        public int f283563q;

        /* renamed from: r */
        public int f283564r;

        /* renamed from: s */
        public boolean f283565s;

        /* renamed from: t */
        public int f283566t = 0;

        /* renamed from: u */
        public boolean f283567u = false;

        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0500, code lost:
            if (r0.f267180u == 1) goto L_0x0502;
         */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x042b  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0463  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x015e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo135069a() {
            /*
                r45 = this;
                r1 = r45
                java.lang.String r2 = "/"
                java.lang.String r3 = ""
                java.lang.Class<eu.g> r4 = p509eu.C97708g.class
                java.lang.Class<h81.h> r5 = h81.C32735h.class
                com.tencent.mm.hardcoder.WXHardCoderJNI r6 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r7 = r0.getHcEncodeVideoEnable()
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r8 = r0.getHcEncodeVideoDelay()
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r9 = r0.getHcEncodeVideoCPU()
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r10 = r0.getHcEncodeVideoIO()
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r0 = r0.getHcEncodeVideoThr()
                r14 = 0
                if (r0 == 0) goto L_0x003f
                int r0 = android.os.Process.myTid()
                r11 = r0
                goto L_0x0040
            L_0x003f:
                r11 = 0
            L_0x0040:
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r12 = r0.getHcEncodeVideoTimeout()
                r13 = 603(0x25b, float:8.45E-43)
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                long r15 = r0.getHcEncodeVideoAction()
                java.lang.String r0 = "MicroMsg.ImportMultiVideo"
                r14 = r15
                r16 = r0
                int r0 = r6.startPerformance(r7, r8, r9, r10, r11, r12, r13, r14, r16)
                com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y = r0
                r14 = 1
                java.lang.Object[] r6 = new java.lang.Object[r14]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7 = 0
                r6[r7] = r0
                java.lang.String r8 = "MicroMsg.ImportMultiVideo"
                java.lang.String r0 = "hardcoder summerPerformance startPerformance: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r6)
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.f283559j
                r6 = 18
                r9 = 19
                r11 = 2
                if (r0 == 0) goto L_0x0085
                boolean r12 = r0.f267178s
                if (r12 != 0) goto L_0x0085
                int r12 = r0.f267166d
                r1.f283563q = r12
                int r0 = r0.f267167e
                r1.f283564r = r0
                goto L_0x0126
            L_0x0085:
                int[] r12 = new int[r11]
                java.lang.String r0 = r1.f283554e
                java.lang.String r13 = "getImportProperRemuxingResolutionForC2C Width:%d Height:%d"
                oj.c r15 = new oj.c     // Catch:{ all -> 0x00e7 }
                r15.<init>()     // Catch:{ all -> 0x00e7 }
                r15.setDataSource(r0)     // Catch:{ all -> 0x00e5 }
                java.lang.String r0 = r15.extractMetadata(r6)     // Catch:{ all -> 0x00e5 }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)     // Catch:{ all -> 0x00e5 }
                java.lang.String r10 = r15.extractMetadata(r9)     // Catch:{ all -> 0x00e5 }
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r7)     // Catch:{ all -> 0x00e5 }
                r9 = 720(0x2d0, float:1.009E-42)
                if (r0 <= r10) goto L_0x00b1
                if (r0 <= r9) goto L_0x00ba
                r12[r7] = r9     // Catch:{ all -> 0x00e5 }
                int r10 = r10 * 720
                int r10 = r10 / r0
                r12[r14] = r10     // Catch:{ all -> 0x00e5 }
                goto L_0x00ba
            L_0x00b1:
                if (r10 <= r9) goto L_0x00ba
                int r0 = r0 * 720
                int r0 = r0 / r10
                r12[r7] = r0     // Catch:{ all -> 0x00e5 }
                r12[r14] = r9     // Catch:{ all -> 0x00e5 }
            L_0x00ba:
                r15.release()
                r0 = r12[r7]
                int r9 = r0 % 2
                if (r9 == 0) goto L_0x00c6
                int r0 = r0 + r14
                r12[r7] = r0
            L_0x00c6:
                r0 = r12[r14]
                int r9 = r0 % 2
                if (r9 == 0) goto L_0x00cf
                int r0 = r0 + r14
                r12[r14] = r0
            L_0x00cf:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r9 = r12[r7]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r0[r7] = r9
                r9 = r12[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r0[r14] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r0)
                goto L_0x011e
            L_0x00e5:
                r0 = move-exception
                goto L_0x00e9
            L_0x00e7:
                r0 = move-exception
                r15 = 0
            L_0x00e9:
                java.lang.String r9 = "VFSMediaMetadataRetriever error"
                java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ all -> 0x0789 }
                r10[r7] = r0     // Catch:{ all -> 0x0789 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r10)     // Catch:{ all -> 0x0789 }
                if (r15 == 0) goto L_0x00f7
                r15.release()
            L_0x00f7:
                r0 = r12[r7]
                int r9 = r0 % 2
                if (r9 == 0) goto L_0x0100
                int r0 = r0 + r14
                r12[r7] = r0
            L_0x0100:
                r0 = r12[r14]
                int r9 = r0 % 2
                if (r9 == 0) goto L_0x0109
                int r0 = r0 + r14
                r12[r14] = r0
            L_0x0109:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r9 = r12[r7]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r0[r7] = r9
                r9 = r12[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r0[r14] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r0)
            L_0x011e:
                r0 = r12[r7]
                r1.f283563q = r0
                r0 = r12[r14]
                r1.f283564r = r0
            L_0x0126:
                com.tencent.mm.pointers.PString r0 = new com.tencent.mm.pointers.PString
                r0.<init>()
                com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
                r9.<init>()
                di3.d r10 = di3.C86312j.m106911c(r4)
                eu.g r10 = (p509eu.C97708g) r10
                eu.d r10 = r10.mo58053A1()
                java.lang.String r12 = r1.f283554e
                com.tencent.mm.storage.d4 r10 = (com.tencent.p014mm.storage.C30731d4) r10
                boolean r10 = r10.mo57628b(r12, r0, r9)
                if (r10 == 0) goto L_0x015e
                java.lang.String r0 = r0.value
                java.lang.String r10 = r1.f283555f
                long r12 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r10, r7)
                r18 = 0
                int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
                if (r0 < 0) goto L_0x015e
                java.lang.String r0 = "copy remuxing file success, do not remuxing again."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                int r0 = r9.value
                r1.f283556g = r0
                r1.f283565s = r14
                return r14
            L_0x015e:
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                di3.d r0 = di3.C86312j.m106911c(r5)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r12 = h81.C32735h.C32737c.clicfg_c2c_remuxing_enable_video_composition
                int r0 = r0.mo58779Qe(r12, r14)
                if (r0 != r14) goto L_0x0172
                r0 = 1
                goto L_0x0173
            L_0x0172:
                r0 = 0
            L_0x0173:
                java.lang.Object[] r12 = new java.lang.Object[r14]
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
                r12[r7] = r13
                java.lang.String r13 = "expt enableUseCompositionTranscoder:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r12)
                bp3.p r12 = bp3.C79758p.f233760a
                bp3.f r13 = bp3.C104160f.RepairerConfig_Media_ImportVideoUseComposition_Int
                int r12 = r12.mo109882e(r13, r7)
                if (r12 == 0) goto L_0x019d
                java.lang.Object[] r0 = new java.lang.Object[r14]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r0[r7] = r13
                java.lang.String r13 = "debug repairerConfig:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r0)
                if (r12 != r14) goto L_0x019b
                r12 = 1
                goto L_0x019e
            L_0x019b:
                r12 = 0
                goto L_0x019e
            L_0x019d:
                r12 = r0
            L_0x019e:
                java.lang.Object[] r0 = new java.lang.Object[r14]
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)
                r0[r7] = r13
                java.lang.String r13 = "final enableUseCompositionTranscoder:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r0)
                oj.c r0 = new oj.c     // Catch:{ Exception -> 0x01e0 }
                r0.<init>()     // Catch:{ Exception -> 0x01e0 }
                java.lang.String r13 = r1.f283554e     // Catch:{ Exception -> 0x01e0 }
                r0.setDataSource(r13)     // Catch:{ Exception -> 0x01e0 }
                java.lang.String r6 = r0.extractMetadata(r6)     // Catch:{ Exception -> 0x01e0 }
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x01e0 }
                r13 = 19
                java.lang.String r13 = r0.extractMetadata(r13)     // Catch:{ Exception -> 0x01e0 }
                int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r7)     // Catch:{ Exception -> 0x01e0 }
                r15 = 9
                java.lang.String r0 = r0.extractMetadata(r15)     // Catch:{ Exception -> 0x01e0 }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)     // Catch:{ Exception -> 0x01e0 }
                float r0 = (float) r0     // Catch:{ Exception -> 0x01e0 }
                r15 = 1148846080(0x447a0000, float:1000.0)
                float r0 = r0 / r15
                int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x01e0 }
                r1.f283556g = r0     // Catch:{ Exception -> 0x01e0 }
                boolean r0 = com.tencent.p014mm.pluginsdk.model.C6661v.m6941a(r6, r13)     // Catch:{ Exception -> 0x01e0 }
                goto L_0x01e7
            L_0x01e0:
                r0 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r7]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r6)
                r0 = 0
            L_0x01e7:
                com.tencent.mm.pluginsdk.model.u0 r6 = com.tencent.p014mm.pluginsdk.model.C30685u0.f82571a
                boolean r6 = r6.mo57539a()
                java.lang.Object[] r13 = new java.lang.Object[r14]
                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r6)
                r13[r7] = r15
                java.lang.String r15 = "remuxing exportHevc:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r13)
                r17 = 4606416806863364424(0x3fed47ae147ae148, double:0.915)
                if (r6 != 0) goto L_0x020f
                com.tencent.mm.modelcontrol.VideoTransPara r13 = r1.f283559j
                int r15 = r13.f267169g
                r20 = r12
                double r11 = (double) r15
                double r11 = r11 * r17
                int r11 = (int) r11
                r13.f267169g = r11
                goto L_0x0211
            L_0x020f:
                r20 = r12
            L_0x0211:
                if (r6 == 0) goto L_0x022b
                java.lang.String r0 = "exportHevc set forceMediaCodec"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.f283559j
                r0.f267154A = r14
                com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r22 = 106(0x6a, double:5.24E-322)
                r24 = 101(0x65, double:5.0E-322)
                r26 = 1
                r28 = 0
                r21.idkeyStat(r22, r24, r26, r28)
                r6 = 1
                goto L_0x022c
            L_0x022b:
                r6 = r0
            L_0x022c:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r22 = 106(0x6a, double:5.24E-322)
                r24 = 53
                r26 = 1
                r28 = 0
                r21 = r0
                r21.idkeyStat(r22, r24, r26, r28)
                java.lang.Object[] r11 = new java.lang.Object[r14]
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
                r11[r7] = r12
                java.lang.String r12 = "forceMediaCodec :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
                if (r20 != 0) goto L_0x0385
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f283559j
                if (r12 == 0) goto L_0x0307
                java.lang.Object[] r13 = new java.lang.Object[r14]
                r13[r7] = r12
                java.lang.String r12 = "remuxing new para %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r13)
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f283559j
                int r13 = r12.f267169g
                r29 = r8
                double r7 = (double) r13
                double r7 = r7 * r17
                int r7 = (int) r7
                r12.f267169g = r7
                com.tencent.mm.pluginsdk.model.v0 r7 = com.tencent.p014mm.pluginsdk.model.C96794v0.f283568a
                boolean r7 = r7.mo135070a()
                boolean r8 = r1.f283567u
                if (r8 != 0) goto L_0x02ae
                if (r6 != 0) goto L_0x02ae
                if (r7 == 0) goto L_0x0273
                goto L_0x02ae
            L_0x0273:
                java.lang.String r0 = r1.f283554e
                java.lang.String r7 = r1.f283555f
                int r8 = r1.f283563q
                int r12 = r1.f283564r
                com.tencent.mm.modelcontrol.VideoTransPara r13 = r1.f283559j
                int r15 = r13.f267169g
                int r11 = r13.f267177r
                r36 = 8
                int r14 = r13.f267176q
                r38 = 1103626240(0x41c80000, float:25.0)
                int r13 = r13.f267168f
                float r13 = (float) r13
                r40 = 0
                r41 = 0
                r42 = 1
                r43 = 0
                r44 = 51
                r30 = r0
                r31 = r7
                r32 = r8
                r33 = r12
                r34 = r15
                r35 = r11
                r37 = r14
                r39 = r13
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
                r1.f283556g = r0
                r8 = r29
                goto L_0x0382
            L_0x02ae:
                r22 = 354(0x162, double:1.75E-321)
                r24 = 245(0xf5, double:1.21E-321)
                r26 = 1
                r28 = 0
                r21 = r0
                r21.idkeyStat(r22, r24, r26, r28)
                com.tencent.mm.modelcontrol.VideoTransPara r8 = r1.f283559j
                int r11 = r1.f283563q
                r8.f267166d = r11
                int r11 = r1.f283564r
                r8.f267167e = r11
                int r8 = r8.f267154A
                r11 = 1
                if (r8 != r11) goto L_0x02cc
                r14 = 1
                goto L_0x02cd
            L_0x02cc:
                r14 = 0
            L_0x02cd:
                if (r14 == 0) goto L_0x02d1
                r14 = 0
                goto L_0x02d2
            L_0x02d1:
                r14 = r7
            L_0x02d2:
                if (r14 == 0) goto L_0x02ea
                java.lang.String r7 = "report avc hard encode"
                r8 = r29
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
                r22 = 106(0x6a, double:5.24E-322)
                r24 = 52
                r26 = 1
                r28 = 0
                r21 = r0
                r21.idkeyStat(r22, r24, r26, r28)
                goto L_0x02ec
            L_0x02ea:
                r8 = r29
            L_0x02ec:
                java.lang.String r7 = r1.f283554e
                java.lang.String r11 = r1.f283555f
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f283559j
                int r7 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117177j(r7, r11, r12, r14)
                if (r7 >= 0) goto L_0x0382
                r22 = 354(0x162, double:1.75E-321)
                r24 = 246(0xf6, double:1.215E-321)
                r26 = 1
                r28 = 0
                r21 = r0
                r21.idkeyStat(r22, r24, r26, r28)
                goto L_0x0382
            L_0x0307:
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.String r7 = r1.f283553d
                r11 = 0
                r0[r11] = r7
                java.lang.String r7 = "remuxing but new para is null. %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r7, r0)
                int r0 = com.tencent.p014mm.plugin.sight.base.C85457c.f249058c
                double r11 = (double) r0
                double r11 = r11 * r17
                int r0 = (int) r11
                com.tencent.p014mm.plugin.sight.base.C85457c.f249058c = r0
                boolean r7 = r1.f283567u
                if (r7 != 0) goto L_0x0351
                if (r6 == 0) goto L_0x0324
                goto L_0x0351
            L_0x0324:
                java.lang.String r7 = r1.f283554e
                java.lang.String r11 = r1.f283555f
                int r12 = r1.f283563q
                int r13 = r1.f283564r
                int r34 = com.tencent.p014mm.plugin.sight.base.C85457c.f249057b
                r35 = 8
                r36 = 2
                r37 = 1103626240(0x41c80000, float:25.0)
                float r38 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
                r39 = 0
                r40 = 0
                r41 = 1
                r42 = 0
                r43 = 51
                r29 = r7
                r30 = r11
                r31 = r12
                r32 = r13
                r33 = r0
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                r1.f283556g = r0
                goto L_0x0382
            L_0x0351:
                com.tencent.mm.modelcontrol.VideoTransPara r0 = new com.tencent.mm.modelcontrol.VideoTransPara
                r0.<init>()
                r1.f283559j = r0
                int r7 = r1.f283563q
                r0.f267166d = r7
                int r7 = r1.f283564r
                r0.f267167e = r7
                int r7 = com.tencent.p014mm.plugin.sight.base.C85457c.f249058c
                r0.f267169g = r7
                int r7 = com.tencent.p014mm.plugin.sight.base.C85457c.f249057b
                r0.f267177r = r7
                r7 = 2
                r0.f267176q = r7
                float r7 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
                int r7 = (int) r7
                r0.f267168f = r7
                java.lang.String r7 = r1.f283554e
                int r7 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117173f(r7)
                r0.f267170h = r7
                java.lang.String r0 = r1.f283554e
                java.lang.String r7 = r1.f283555f
                com.tencent.mm.modelcontrol.VideoTransPara r11 = r1.f283559j
                r12 = 0
                com.tencent.p014mm.modelvideoh265toh264.C92862f.m117177j(r0, r7, r11, r12)
            L_0x0382:
                r11 = 1
                goto L_0x0480
            L_0x0385:
                r12 = 0
                di3.d r0 = di3.C86312j.m106911c(r5)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_c2c_video_composition_lut_enable
                bp3.f r11 = bp3.C104160f.RepairerConfig_Media_CompositionUseLut_Int
                int r0 = r0.dl0(r7, r11, r12)
                r7 = 1
                if (r0 != r7) goto L_0x0399
                r14 = 1
                goto L_0x039a
            L_0x0399:
                r14 = 0
            L_0x039a:
                if (r14 == 0) goto L_0x03fd
                java.lang.String r0 = r1.f283558i
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85809L5(r0)
                if (r0 != 0) goto L_0x03ac
                java.lang.String r0 = r1.f283558i
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
                if (r0 == 0) goto L_0x03fd
            L_0x03ac:
                boolean r0 = p206nj.C88960n.m111088a()
                if (r0 == 0) goto L_0x03ba
                r0 = 29
                boolean r0 = p206nj.C11171e.m11045b(r0)
                if (r0 == 0) goto L_0x03fd
            L_0x03ba:
                r0 = 23
                boolean r0 = p206nj.C11171e.m11045b(r0)
                if (r0 == 0) goto L_0x03fd
                java.lang.Class<x80.b> r0 = x80.C102578b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                x80.b r0 = (x80.C102578b) r0
                java.lang.String r7 = r1.f283554e
                java.lang.String r0 = r0.mo141938i3(r7)
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x03f0 }
                r7.<init>(r0)     // Catch:{ Exception -> 0x03f0 }
                java.lang.String r0 = "colorTransfer"
                int r0 = r7.getInt(r0)     // Catch:{ Exception -> 0x03f0 }
                java.lang.String r11 = "colorStandard"
                int r7 = r7.getInt(r11)     // Catch:{ Exception -> 0x03f0 }
                r11 = 6
                if (r0 != r11) goto L_0x03e8
                if (r7 != r11) goto L_0x03e8
                r14 = 1
                goto L_0x03ee
            L_0x03e8:
                r12 = 7
                if (r0 != r12) goto L_0x03fd
                if (r7 != r11) goto L_0x03fd
                r14 = 2
            L_0x03ee:
                r0 = 1
                goto L_0x03ff
            L_0x03f0:
                r0 = move-exception
                r7 = 1
                java.lang.Object[] r11 = new java.lang.Object[r7]
                r7 = 0
                r11[r7] = r0
                java.lang.String r0 = "parse color space error"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r0, r11)
            L_0x03fd:
                r0 = 0
                r14 = 0
            L_0x03ff:
                com.tencent.mm.modelcontrol.VideoTransPara r7 = r1.f283559j
                if (r7 != 0) goto L_0x042b
                com.tencent.mm.modelcontrol.VideoTransPara r7 = new com.tencent.mm.modelcontrol.VideoTransPara
                r7.<init>()
                r1.f283559j = r7
                int r11 = r1.f283563q
                r7.f267166d = r11
                int r11 = r1.f283564r
                r7.f267167e = r11
                int r11 = com.tencent.p014mm.plugin.sight.base.C85457c.f249058c
                r7.f267169g = r11
                int r11 = com.tencent.p014mm.plugin.sight.base.C85457c.f249057b
                r7.f267177r = r11
                r11 = 2
                r7.f267176q = r11
                float r11 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
                int r11 = (int) r11
                r7.f267168f = r11
                java.lang.String r11 = r1.f283554e
                int r11 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117173f(r11)
                r7.f267170h = r11
                goto L_0x0433
            L_0x042b:
                int r11 = r1.f283563q
                r7.f267166d = r11
                int r11 = r1.f283564r
                r7.f267167e = r11
            L_0x0433:
                com.tencent.mm.modelcontrol.VideoTransPara r7 = r1.f283559j
                r7.f267162I = r14
                r7.f267161H = r0
                r11 = 1
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r12 = 0
                r0[r12] = r7
                java.lang.String r7 = "use composition transcoder, newPara:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r0)
                java.lang.String r0 = r1.f283554e
                java.lang.String r7 = r1.f283555f
                com.tencent.mm.modelcontrol.VideoTransPara r13 = r1.f283559j
                int r0 = com.tencent.p014mm.pluginsdk.model.C96794v0.m124290b(r0, r7, r13, r12)
                r1.f283556g = r0
                java.lang.Object[] r7 = new java.lang.Object[r11]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7[r12] = r0
                java.lang.String r0 = "transferVideo finished retDuration:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r7)
                int r0 = r1.f283556g
                if (r0 > 0) goto L_0x0480
                java.lang.Object[] r0 = new java.lang.Object[r11]
                com.tencent.mm.modelcontrol.VideoTransPara r7 = r1.f283559j
                int r7 = r7.f267154A
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0[r12] = r7
                java.lang.String r7 = "composition transcoder failed, force retry softEncode, isHevc:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r0)
                java.lang.String r0 = r1.f283554e
                java.lang.String r7 = r1.f283555f
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f283559j
                int r0 = com.tencent.p014mm.pluginsdk.model.C96794v0.m124290b(r0, r7, r12, r11)
                r1.f283556g = r0
            L_0x0480:
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
                int r0 = (int) r12
                r1.f283566t = r0
                r7 = 6
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.String r7 = r1.f283554e
                r12 = 0
                r0[r12] = r7
                java.lang.String r7 = r1.f283555f
                r0[r11] = r7
                int r7 = r1.f283556g
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r11 = 2
                r0[r11] = r7
                int r7 = r1.f283563q
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r11 = 3
                r0[r11] = r7
                int r7 = r1.f283564r
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r12 = 4
                r0[r12] = r7
                r7 = 5
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r0[r7] = r9
                java.lang.String r7 = "remuxing [%s] to [%s], result %d, resolution:[%d, %d], cost:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r0)
                int r0 = r1.f283556g
                if (r0 < 0) goto L_0x04c5
                r14 = 1
                goto L_0x04c6
            L_0x04c5:
                r14 = 0
            L_0x04c6:
                r1.f283565s = r14
                com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
                r0.<init>()
                com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
                r7.<init>()
                int r9 = r1.f283556g
                if (r9 > 0) goto L_0x04e2
                java.lang.String r9 = r1.f283555f
                boolean r7 = hd0.C98429r0.m127821l(r9, r0, r7)
                if (r7 == 0) goto L_0x04e2
                int r0 = r0.value
                r1.f283556g = r0
            L_0x04e2:
                boolean r0 = r1.f283565s
                if (r0 == 0) goto L_0x051f
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.f283559j
                int r7 = r0.f267181v
                r9 = r7 & 1
                if (r9 == 0) goto L_0x04f2
                boolean r9 = r1.f283567u
                if (r9 == 0) goto L_0x04fb
            L_0x04f2:
                r9 = 2
                r7 = r7 & r9
                if (r7 == 0) goto L_0x04fd
                boolean r7 = r1.f283567u
                if (r7 != 0) goto L_0x04fb
                goto L_0x04fd
            L_0x04fb:
                r7 = 1
                goto L_0x0502
            L_0x04fd:
                int r0 = r0.f267180u
                r7 = 1
                if (r0 != r7) goto L_0x051f
            L_0x0502:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                int r7 = com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9 = 0
                r0[r9] = r7
                java.lang.String r7 = "hseasun:[hardcoder] hwenc qp add metadata flag"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r0)
                java.lang.String r0 = r1.f283555f
                com.tencent.mm.plugin.sight.base.ABAPrams r7 = r1.f283560n
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r1.f283559j
                int r10 = r9.f267180u
                int r9 = r9.f267181v
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r0, r7, r10, r9)
            L_0x051f:
                ig3.n r29 = ig3.C98692n.f289404a
                boolean r0 = r1.f283567u
                if (r20 == 0) goto L_0x0527
                r0 = 3
                goto L_0x052f
            L_0x0527:
                if (r0 != 0) goto L_0x052e
                if (r6 == 0) goto L_0x052c
                goto L_0x052e
            L_0x052c:
                r0 = 2
                goto L_0x052f
            L_0x052e:
                r0 = 4
            L_0x052f:
                boolean r6 = r1.f283565s
                java.lang.String r7 = r1.f283554e
                java.lang.String r9 = r1.f283555f
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r1.f283559j
                if (r10 == 0) goto L_0x053d
                java.lang.String r3 = r10.toString()
            L_0x053d:
                r20 = r3
                int r3 = r1.f283566t
                di3.d r5 = di3.C86312j.m106911c(r5)
                h81.h r5 = (h81.C32735h) r5
                h81.h$c r10 = h81.C32735h.C32737c.clicfg_c2c_video_send_report_enable
                r13 = 1
                boolean r5 = r5.mo58784wf(r10, r13)
                if (r5 != 0) goto L_0x0552
                goto L_0x05d3
            L_0x0552:
                com.tencent.mm.autogen.mmdata.rpt.VideoSendLogStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.VideoSendLogStruct
                r5.<init>()
                r5.f266516d = r13
                if (r6 == 0) goto L_0x055d
                r14 = 0
                goto L_0x055e
            L_0x055d:
                r14 = -2
            L_0x055e:
                r5.f266522j = r14
                r5.f266523k = r3
                r5.f266517e = r0
                r0 = -1
                r5.f266518f = r0
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r3 == 0) goto L_0x058c
                java.lang.String r21 = com.tencent.p014mm.plugin.sight.base.C94555d.m119568d(r7)
                if (r21 == 0) goto L_0x0582
                r22 = 44
                r23 = 59
                r24 = 0
                r25 = 4
                r26 = 0
                java.lang.String r3 = z04.C112551y.m153815o(r21, r22, r23, r24, r25, r26)
                goto L_0x0583
            L_0x0582:
                r3 = 0
            L_0x0583:
                java.lang.String r7 = "OriginMediaInfo"
                r10 = 1
                java.lang.String r3 = r5.mo86045b(r7, r3, r10)
                r5.f266519g = r3
            L_0x058c:
                if (r6 == 0) goto L_0x05b3
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
                if (r3 == 0) goto L_0x05b3
                java.lang.String r21 = com.tencent.p014mm.plugin.sight.base.C94555d.m119568d(r9)
                if (r21 == 0) goto L_0x05a9
                r22 = 44
                r23 = 59
                r24 = 0
                r25 = 4
                r26 = 0
                java.lang.String r3 = z04.C112551y.m153815o(r21, r22, r23, r24, r25, r26)
                goto L_0x05aa
            L_0x05a9:
                r3 = 0
            L_0x05aa:
                java.lang.String r6 = "OutputMediaInfo"
                r7 = 1
                java.lang.String r3 = r5.mo86045b(r6, r3, r7)
                r5.f266521i = r3
            L_0x05b3:
                if (r20 == 0) goto L_0x05c4
                r21 = 44
                r22 = 59
                r23 = 0
                r24 = 4
                r25 = 0
                java.lang.String r10 = z04.C112551y.m153815o(r20, r21, r22, r23, r24, r25)
                goto L_0x05c5
            L_0x05c4:
                r10 = 0
            L_0x05c5:
                java.lang.String r3 = "RemuxInfo"
                r6 = 1
                java.lang.String r3 = r5.mo86045b(r3, r10, r6)
                r5.f266520h = r3
                r5.f266524l = r0
                r5.mo86054n()
            L_0x05d3:
                boolean r0 = r1.f283565s
                if (r0 != 0) goto L_0x0613
                java.lang.String r0 = "remuxing video error, copy source video to send."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
                java.lang.String r0 = r1.f283555f
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
                java.lang.String r0 = r1.f283554e
                java.lang.String r2 = r1.f283555f
                com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r2)
                java.lang.String r0 = r1.f283554e
                long r37 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                java.lang.String r0 = r1.f283558i
                java.lang.String r2 = r1.f283553d
                r32 = 1
                int r3 = r1.f283556g
                long r3 = (long) r3
                r5 = 1000(0x3e8, double:4.94E-321)
                long r33 = r3 * r5
                int r3 = r1.f283557h
                long r39 = com.tencent.p014mm.pluginsdk.model.C96790t0.m124281b(r3)
                boolean r3 = r1.f283561o
                r42 = -1
                r30 = r0
                r31 = r2
                r35 = r37
                r41 = r3
                r29.mo138104e(r30, r31, r32, r33, r35, r37, r39, r41, r42)
                goto L_0x0737
            L_0x0613:
                java.lang.String r0 = "remuxing video sucess,insert to media duplication storage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                java.lang.String r0 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r0.getPath()     // Catch:{ Exception -> 0x073a }
                if (r3 == 0) goto L_0x0640
                r5 = 0
                java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r5, r5)     // Catch:{ Exception -> 0x073a }
                java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x073a }
                boolean r5 = r5.equals(r3)     // Catch:{ Exception -> 0x073a }
                if (r5 != 0) goto L_0x0640
                android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x073a }
                android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x073a }
                android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x073a }
            L_0x0640:
                java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x073a }
                int r3 = r0.lastIndexOf(r2)     // Catch:{ Exception -> 0x073a }
                if (r3 >= 0) goto L_0x064b
                goto L_0x0651
            L_0x064b:
                r5 = 1
                int r3 = r3 + r5
                java.lang.String r0 = r0.substring(r3)     // Catch:{ Exception -> 0x073a }
            L_0x0651:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x073a }
                r3.<init>()     // Catch:{ Exception -> 0x073a }
                java.lang.String r5 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                r3.append(r5)     // Catch:{ Exception -> 0x073a }
                java.lang.String r5 = ".tmp"
                r3.append(r5)     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x073a }
                com.tencent.mm.pointers.PInt r5 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x073a }
                r6 = 0
                r5.<init>(r6)     // Catch:{ Exception -> 0x073a }
                java.lang.String r6 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                boolean r6 = uf0.C90657e.m113638b(r6, r3, r5)     // Catch:{ Exception -> 0x073a }
                if (r6 == 0) goto L_0x06c6
                java.lang.String r5 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x073a }
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x073a }
                r6.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x073a }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x073a }
                r3.<init>()     // Catch:{ Exception -> 0x073a }
                java.lang.String r7 = r6.mo119973k()     // Catch:{ Exception -> 0x073a }
                r3.append(r7)     // Catch:{ Exception -> 0x073a }
                r3.append(r2)     // Catch:{ Exception -> 0x073a }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r6.getName()     // Catch:{ Exception -> 0x073a }
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106435Q(r2, r3, r0)     // Catch:{ Exception -> 0x073a }
                java.lang.String r2 = "fast start success. delOld[%b] rename[%b] path[%s] target[%s]"
                java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x073a }
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x073a }
                r7 = 0
                r3[r7] = r5     // Catch:{ Exception -> 0x073a }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x073a }
                r5 = 1
                r3[r5] = r0     // Catch:{ Exception -> 0x073a }
                java.lang.String r0 = r6.mo119971i()     // Catch:{ Exception -> 0x073a }
                r5 = 2
                r3[r5] = r0     // Catch:{ Exception -> 0x073a }
                java.lang.String r0 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                r3[r11] = r0     // Catch:{ Exception -> 0x073a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r3)     // Catch:{ Exception -> 0x073a }
                com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x073a }
                r13 = 354(0x162, double:1.75E-321)
                r15 = 30
                r17 = 1
                r19 = 0
                r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ Exception -> 0x073a }
                goto L_0x0722
            L_0x06c6:
                int r0 = r5.value     // Catch:{ Exception -> 0x073a }
                r2 = 1
                if (r0 == r2) goto L_0x06d9
                com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x073a }
                r21 = 354(0x162, double:1.75E-321)
                r23 = 31
                r25 = 1
                r27 = 0
                r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x073a }
                goto L_0x0708
            L_0x06d9:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x073a }
                r30 = 354(0x162, double:1.75E-321)
                r32 = 32
                r34 = 1
                r36 = 0
                r29 = r0
                r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x073a }
                r2 = 13836(0x360c, float:1.9388E-41)
                java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x073a }
                r6 = 600(0x258, float:8.41E-43)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x073a }
                r7 = 0
                r3[r7] = r6     // Catch:{ Exception -> 0x073a }
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x073a }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x073a }
                r7 = 1
                r3[r7] = r6     // Catch:{ Exception -> 0x073a }
                java.lang.String r6 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                r7 = 2
                r3[r7] = r6     // Catch:{ Exception -> 0x073a }
                r0.mo160131h(r2, r3)     // Catch:{ Exception -> 0x073a }
            L_0x0708:
                java.lang.String r0 = "fast start fail. msg[%d] importpath[%s] targetPath[%s]"
                java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x073a }
                int r3 = r5.value     // Catch:{ Exception -> 0x073a }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x073a }
                r5 = 0
                r2[r5] = r3     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r1.f283554e     // Catch:{ Exception -> 0x073a }
                r5 = 1
                r2[r5] = r3     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                r5 = 2
                r2[r5] = r3     // Catch:{ Exception -> 0x073a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r2)     // Catch:{ Exception -> 0x073a }
            L_0x0722:
                di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x073a }
                eu.g r0 = (p509eu.C97708g) r0     // Catch:{ Exception -> 0x073a }
                eu.d r0 = r0.mo58053A1()     // Catch:{ Exception -> 0x073a }
                java.lang.String r2 = r1.f283554e     // Catch:{ Exception -> 0x073a }
                java.lang.String r3 = r1.f283555f     // Catch:{ Exception -> 0x073a }
                int r4 = r1.f283556g     // Catch:{ Exception -> 0x073a }
                com.tencent.mm.storage.d4 r0 = (com.tencent.p014mm.storage.C30731d4) r0     // Catch:{ Exception -> 0x073a }
                r0.mo57630e(r2, r3, r4)     // Catch:{ Exception -> 0x073a }
            L_0x0737:
                r2 = 1
                r4 = 0
                goto L_0x074a
            L_0x073a:
                r0 = move-exception
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r0 = r0.toString()
                r4 = 0
                r3[r4] = r0
                java.lang.String r0 = "fast start exception e[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r3)
            L_0x074a:
                boolean r0 = r1.f283562p
                if (r0 == 0) goto L_0x075e
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = r1.f283554e
                r0[r4] = r2
                java.lang.String r2 = "import use temp copy file, delete the importPath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
                java.lang.String r0 = r1.f283554e
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            L_0x075e:
                int r0 = com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y
                if (r0 == 0) goto L_0x0787
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r2 = r2.getHcEncodeVideoEnable()
                int r3 = com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y
                r0.stopPerformance(r2, r3)
                r2 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                int r3 = com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r0[r4] = r3
                java.lang.String r3 = "hardcoder summerPerformance stopPerformance %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r0)
                com.tencent.p014mm.pluginsdk.model.C96790t0.f283535y = r4
                goto L_0x0788
            L_0x0787:
                r2 = 1
            L_0x0788:
                return r2
            L_0x0789:
                r0 = move-exception
                if (r15 == 0) goto L_0x078f
                r15.release()
            L_0x078f:
                r2 = 0
                r3 = r12[r2]
                int r4 = r3 % 2
                if (r4 == 0) goto L_0x079b
                r4 = 1
                int r3 = r3 + r4
                r12[r2] = r3
                goto L_0x079c
            L_0x079b:
                r4 = 1
            L_0x079c:
                r2 = r12[r4]
                int r3 = r2 % 2
                if (r3 == 0) goto L_0x07a5
                int r2 = r2 + r4
                r12[r4] = r2
            L_0x07a5:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r5 = r12[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r3] = r5
                r3 = r12[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r4] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96790t0.C96793d.mo135069a():boolean");
        }

        public boolean doInBackground() {
            boolean z;
            synchronized (C96790t0.f283533w) {
                z = !C96790t0.f283532v.containsKey(this.f283553d);
            }
            if (!z) {
                z = C98429r0.m127818i(this.f283553d) == null;
            }
            if (z) {
                Log.m105929w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", this.f283553d);
                return true;
            }
            mo135069a();
            return true;
        }

        public boolean onPostExecute() {
            Log.m105924i("MicroMsg.ImportMultiVideo", "onPostExecute");
            synchronized (C96790t0.f283533w) {
                C96790t0.f283532v.remove(this.f283553d);
            }
            if (this.f283565s) {
                String str = this.f283555f;
                if (this.f283557h == 2) {
                    long l = C86013q1.m106451l(str) / 1024;
                    int[] iArr = {512, 1024, 2048, 5120, 8192, Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
                    C115669n nVar = C115669n.INSTANCE;
                    int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s((int) l, iArr, 247, 255));
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.idkeyStat(106, (long) nullAsNil, 1, false);
                    nVar2.idkeyStat(106, 246, 1, false);
                    Log.m105918d("MicroMsg.ImportMultiVideo", "report compress video report id : " + nullAsNil + " file len : " + l + "K");
                }
            } else {
                C96790t0.m124284h(this.f283555f, this.f283557h);
            }
            C96790t0.m124283f(this.f283565s, this.f283554e, this.f283555f);
            int i = this.f283566t;
            String str2 = this.f283554e;
            String str3 = this.f283555f;
            int i2 = this.f283556g;
            long l2 = C86013q1.m106451l(str2);
            if (l2 > 0) {
                long l3 = C86013q1.m106451l(str3);
                int i3 = (int) ((100 * l3) / l2);
                Log.m105925i("MicroMsg.ImportMultiVideo", "kv report video compression isNew[%d], oriSize[%d], remuxingSize[%d], compressionRatio[%d], bitrate[%d], preset[%d], retDuration[%d]", 1, Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i3), Integer.valueOf(i), 0, Integer.valueOf(i2));
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr = new Object[7];
                objArr[0] = 1;
                objArr[1] = Long.valueOf(l2);
                objArr[2] = Long.valueOf(l3);
                objArr[3] = Integer.valueOf(i3);
                objArr[4] = Integer.valueOf(i);
                objArr[5] = 0;
                Object[] objArr2 = objArr;
                objArr2[6] = Integer.valueOf(i2);
                nVar3.mo160131h(13432, objArr2);
            } else {
                Log.m105920e("MicroMsg.ImportMultiVideo", "file canot be empty");
            }
            C98394e0.vx0().wx0(this.f283554e, this.f283555f, this.f283558i, "", "", this.f283557h == 1 ? 8 : 1, this.f283565s ? 1 : 3);
            C98692n.f289404a.mo138103d(this.f283558i, this.f283553d, ((long) this.f283556g) * 1000, C86013q1.m106451l(this.f283554e), C86013q1.m106451l(this.f283555f), C96790t0.m124281b(this.f283557h), this.f283561o);
            Log.m105924i("MicroMsg.ImportMultiVideo", "updateVideo");
            String str4 = this.f283553d;
            int i4 = this.f283556g;
            Class cls = C75700k0.class;
            C98408n0 i5 = C98429r0.m127818i(str4);
            if (i5 == null) {
                Log.m105929w("MicroMsg.VideoLogic", "update, but video info is null, fileName %s, msgType %d", str4, 43);
            } else {
                int m = C98410o0.m127731m(C98398h0.Bx0().mo137728q(str4));
                Log.m105925i("MicroMsg.VideoLogic", "update, video size %d, msgType %d, fileName: %s", Integer.valueOf(m), 43, str4);
                i5.f288559f = m;
                i5.f288566m = i4;
                C101783gu2 gu22 = i5.f288538F;
                gu22.f298308d = false;
                i5.f288538F = gu22;
                i5.f288562i = 102;
                i5.f288561h = C98410o0.m127731m(C98398h0.Bx0().mo137729r(str4));
                Log.m105924i("MicroMsg.VideoLogic", "update prepare:" + str4 + " thumbsize:" + i5.f288561h);
                i5.f288548P = 4512;
                Log.m105925i("MicroMsg.VideoLogic", "update to db, result %B, msgType %d", Boolean.valueOf(C98429r0.m127808N(i5)), 43);
                if (i5.f288576w != 4) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i5.f288567n);
                    Log.m105925i("MicroMsg.VideoLogic", "before update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", Long.valueOf(b002.getMsgId()), Long.valueOf(b002.mo108774y2()), b002.mo108768t(), Integer.valueOf(b002.getType()), Integer.valueOf(b002.mo108769t2()), b002.mo108765s2(), Integer.valueOf(b002.getStatus()), Long.valueOf(b002.getCreateTime()));
                    b002.mo108749c3(i5.mo137707k());
                    b002.setType(43);
                    b002.mo108740T2(1);
                    b002.mo108739S2(str4);
                    b002.mo100991d(1);
                    Log.m105925i("MicroMsg.VideoLogic", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", Long.valueOf(b002.getMsgId()), Long.valueOf(b002.mo108774y2()), b002.mo108768t(), Integer.valueOf(b002.getType()), Integer.valueOf(b002.mo108769t2()), b002.mo108765s2(), Integer.valueOf(b002.getStatus()), Long.valueOf(b002.getCreateTime()));
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(i5.f288567n, b002);
                }
            }
            C98429r0.m127805K(this.f283553d);
            return false;
        }
    }

    public C96790t0(Context context, List<String> list, Intent intent, String str, int i, C85608c cVar, boolean z) {
        this.f283536d = context;
        this.f283537e = list;
        this.f283538f = intent;
        this.f283544o = new ArrayList();
        this.f283545p = new ArrayList();
        this.f283546q = new ArrayList();
        this.f283547r = new ArrayList();
        this.f283548s = cVar;
        this.f283539g = str;
        this.f283540h = i;
        this.f283541i = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r2.release();
        r6 = r7[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if ((r6 % 2) == 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r7[0] = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r6 = r7[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if ((r6 % 2) == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r7[1] = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0096 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m124280a(java.lang.String r6, int[] r7, int r8, int r9) {
        /*
            r0 = 1
            r1 = 0
            oj.c r2 = new oj.c     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            r2.setDataSource(r6)     // Catch:{ all -> 0x0073 }
            r6 = 18
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ all -> 0x0073 }
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r1)     // Catch:{ all -> 0x0073 }
            r3 = 19
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ all -> 0x0073 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r1)     // Catch:{ all -> 0x0073 }
            r7[r1] = r6     // Catch:{ all -> 0x0073 }
            r7[r0] = r3     // Catch:{ all -> 0x0073 }
            r4 = 0
        L_0x0023:
            r5 = 3
            if (r4 >= r5) goto L_0x0059
            int r5 = r6 % 2
            if (r5 != 0) goto L_0x0043
            int r5 = r3 % 2
            if (r5 == 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            if (r6 < r3) goto L_0x0035
            if (r6 <= r8) goto L_0x0059
            if (r3 <= r9) goto L_0x0059
        L_0x0035:
            if (r6 > r3) goto L_0x003c
            if (r6 <= r9) goto L_0x0059
            if (r3 > r8) goto L_0x003c
            goto L_0x0059
        L_0x003c:
            int r6 = r6 / 2
            int r3 = r3 / 2
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0043:
            r2.release()
            r6 = r7[r1]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x004f
            int r6 = r6 + r0
            r7[r1] = r6
        L_0x004f:
            r6 = r7[r0]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x0058
            int r6 = r6 + r0
            r7[r0] = r6
        L_0x0058:
            return
        L_0x0059:
            r7[r1] = r6     // Catch:{ all -> 0x0073 }
            r7[r0] = r3     // Catch:{ all -> 0x0073 }
            r2.release()
            r6 = r7[r1]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x0069
            int r6 = r6 + r0
            r7[r1] = r6
        L_0x0069:
            r6 = r7[r0]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x0099
            int r6 = r6 + r0
            r7[r0] = r6
            goto L_0x0099
        L_0x0073:
            r6 = move-exception
            goto L_0x0077
        L_0x0075:
            r6 = move-exception
            r2 = 0
        L_0x0077:
            java.lang.String r8 = "MicroMsg.ImportMultiVideo"
            java.lang.String r9 = "VFSMediaMetadataRetriever error"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x009a }
            r3[r1] = r6     // Catch:{ all -> 0x009a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r3)     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0087
            r2.release()
        L_0x0087:
            r6 = r7[r1]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x0090
            int r6 = r6 + r0
            r7[r1] = r6
        L_0x0090:
            r6 = r7[r0]
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x0099
            int r6 = r6 + r0
            r7[r0] = r6
        L_0x0099:
            return
        L_0x009a:
            r6 = move-exception
            if (r2 == 0) goto L_0x00a0
            r2.release()
        L_0x00a0:
            r8 = r7[r1]
            int r9 = r8 % 2
            if (r9 == 0) goto L_0x00a9
            int r8 = r8 + r0
            r7[r1] = r8
        L_0x00a9:
            r8 = r7[r0]
            int r9 = r8 % 2
            if (r9 == 0) goto L_0x00b2
            int r8 = r8 + r0
            r7[r0] = r8
        L_0x00b2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96790t0.m124280a(java.lang.String, int[], int, int):void");
    }

    /* renamed from: b */
    public static long m124281b(int i) {
        return i != 1 ? 2 : 5;
    }

    /* renamed from: c */
    public static boolean m124282c(String str) {
        boolean containsKey;
        synchronized (f283533w) {
            containsKey = f283532v.containsKey(str);
        }
        Log.m105925i("MicroMsg.ImportMultiVideo", "check %s is remuxing, ret %B", str, Boolean.valueOf(containsKey));
        return containsKey;
    }

    /* renamed from: f */
    public static void m124283f(boolean z, String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
            return;
        }
        try {
            long l = C86013q1.m106451l(str);
            long l2 = C86013q1.m106451l(str2);
            String str3 = (z ? 1 : 0) + ";" + l + ";" + l2 + ";" + ((int) ((100 * l2) / l));
            Log.m105918d("MicroMsg.AtomStatUtil", "report video remuxing : " + str3);
            C115669n.INSTANCE.mo160131h(11098, 8001, str3);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AtomStatUtil", e, "", new Object[0]);
            Log.m105920e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + e.toString());
        }
    }

    /* renamed from: h */
    public static void m124284h(String str, int i) {
        int i2;
        int i3;
        int i4;
        if (i == 1) {
            i2 = 220;
            i4 = 228;
            i3 = 219;
        } else {
            i2 = 234;
            i4 = 242;
            i3 = 233;
        }
        long l = C86013q1.m106451l(str) / 1024;
        int[] iArr = {512, 1024, 2048, 5120, 8192, Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
        C115669n nVar = C115669n.INSTANCE;
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s((int) l, iArr, i2, i4));
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.idkeyStat(106, (long) nullAsNil, 1, false);
        nVar2.idkeyStat(106, (long) i3, 1, false);
        Log.m105918d("MicroMsg.ImportMultiVideo", "report no compress video report id : " + nullAsNil + " file len : " + l + "K");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        r12 = (android.net.Uri) r50.getExtras().getParcelable("android.intent.extra.STREAM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x065b, code lost:
        if (r5 > 1500) goto L_0x0670;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0731 A[SYNTHETIC, Splitter:B:272:0x0731] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0767  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ba  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135063d(android.content.Context r49, android.content.Intent r50) {
        /*
            r48 = this;
            r8 = r48
            r1 = r49
            r7 = r50
            java.lang.String r0 = r8.f283539g
            sg.i<java.lang.String, java.util.ArrayList<hd0.n0>> r2 = hd0.C98410o0.f288586c
            java.lang.String r3 = hd0.C98426q0.m127793a(r0)
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r2 = r0.mo137729r(r3)
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r4 = r0.mo137728q(r3)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            java.lang.String r6 = "MicroMsg.GetVideoMetadata"
            java.lang.String r9 = "android.intent.extra.STREAM"
            java.lang.String r10 = "file://"
            r11 = 7
            if (r7 == 0) goto L_0x01bf
            android.net.Uri r14 = r50.getData()
            if (r14 != 0) goto L_0x0037
            goto L_0x01bf
        L_0x0037:
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r5 = r50.getDataString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "get video file name, dataString "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
            if (r5 != 0) goto L_0x005c
            java.lang.String r5 = "dataString empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            goto L_0x01c4
        L_0x005c:
            android.content.ContentResolver r17 = r49.getContentResolver()
            android.net.Uri r12 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            java.lang.String r12 = r12.toString()
            boolean r12 = r5.startsWith(r12)
            if (r12 == 0) goto L_0x007f
            android.net.Uri r18 = r50.getData()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22)
            r12 = 0
            goto L_0x0136
        L_0x007f:
            java.lang.String r12 = "content://"
            boolean r12 = r5.startsWith(r12)
            if (r12 == 0) goto L_0x0090
            android.net.Uri r5 = r50.getData()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r1, r5)
            goto L_0x00c2
        L_0x0090:
            boolean r12 = r5.startsWith(r10)
            if (r12 == 0) goto L_0x00c1
            android.os.Bundle r12 = r50.getExtras()
            if (r12 == 0) goto L_0x00b7
            android.os.Bundle r12 = r50.getExtras()
            android.os.Parcelable r12 = r12.getParcelable(r9)
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 == 0) goto L_0x00b7
            java.lang.String r13 = r12.getPath()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x00b7
            java.lang.String r12 = r12.getPath()
            goto L_0x00b8
        L_0x00b7:
            r12 = 0
        L_0x00b8:
            if (r12 != 0) goto L_0x00bf
            java.lang.String r5 = r5.substring(r11)
            goto L_0x00c2
        L_0x00bf:
            r5 = r12
            goto L_0x00c2
        L_0x00c1:
            r5 = 0
        L_0x00c2:
            if (r5 == 0) goto L_0x0134
            java.lang.String r12 = "/storage/emulated/legacy"
            boolean r12 = r5.startsWith(r12)
            if (r12 == 0) goto L_0x00ea
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.io.File r13 = p206nj.C88956h.m111061b()
            java.lang.String r13 = r13.getAbsolutePath()
            r12.append(r13)
            r13 = 24
            java.lang.String r5 = r5.substring(r13)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            goto L_0x010d
        L_0x00ea:
            java.lang.String r12 = "/sdcard"
            boolean r12 = r5.startsWith(r12)
            if (r12 == 0) goto L_0x010d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.io.File r13 = p206nj.C88956h.m111061b()
            java.lang.String r13 = r13.getAbsolutePath()
            r12.append(r13)
            java.lang.String r5 = r5.substring(r11)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
        L_0x010d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "_data LIKE "
            r12.append(r13)
            java.lang.String r13 = android.database.DatabaseUtils.sqlEscapeString(r5)
            r12.append(r13)
            java.lang.String r20 = r12.toString()
            android.net.Uri r18 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r19 = 0
            r21 = 0
            r22 = 0
            android.database.Cursor r12 = r17.query(r18, r19, r20, r21, r22)
            r47 = r12
            r12 = r5
            r5 = r47
            goto L_0x0136
        L_0x0134:
            r12 = r5
            r5 = 0
        L_0x0136:
            if (r5 == 0) goto L_0x0150
            int r13 = r5.getCount()
            if (r13 <= 0) goto L_0x014d
            r5.moveToFirst()
            if (r12 != 0) goto L_0x014d
            java.lang.String r12 = "_data"
            int r12 = r5.getColumnIndexOrThrow(r12)
            java.lang.String r12 = r5.getString(r12)
        L_0x014d:
            r5.close()
        L_0x0150:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "get video filename:"
            r5.append(r13)
            r5.append(r12)
            java.lang.String r13 = ", cost time: "
            r5.append(r13)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r14)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 != 0) goto L_0x01b6
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            java.lang.String r6 = r5.getPath()
            if (r6 == 0) goto L_0x019b
            r13 = 0
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r13, r13)
            java.lang.String r13 = r5.getPath()
            boolean r13 = r13.equals(r6)
            if (r13 != 0) goto L_0x019b
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
        L_0x019b:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r13)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x01aa
            r5 = 0
            goto L_0x01b2
        L_0x01aa:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r6.mo119948x(r5)
        L_0x01b2:
            if (r5 == 0) goto L_0x01b6
            r5 = r12
            goto L_0x01c5
        L_0x01b6:
            android.net.Uri r5 = r50.getData()
            java.lang.String r5 = p914oj.C100361a.m131252a(r1, r5)
            goto L_0x01c5
        L_0x01bf:
            java.lang.String r5 = "input invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
        L_0x01c4:
            r5 = 0
        L_0x01c5:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r12 = "GetVideoMetadata filed."
            java.lang.String r13 = "MicroMsg.ImportMultiVideo"
            if (r6 == 0) goto L_0x01e1
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)
            r2 = -50005(0xffffffffffff3cab, float:NaN)
            r6 = 0
            r0 = 0
            r1 = r48
            r4 = r5
            r5 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x01e1:
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r14 = r6.getPath()
            if (r14 == 0) goto L_0x0206
            r15 = 0
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r15 = r6.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x0206
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r14)
            android.net.Uri r6 = r6.build()
        L_0x0206:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r6 = r14.mo177799l(r6, r15)
            boolean r14 = r6.mo177810a()
            if (r14 != 0) goto L_0x0215
            r6 = 0
            goto L_0x0230
        L_0x0215:
            com.tencent.mm.vfs.FileSystem$c r14 = r6.f348991a
            java.lang.String r15 = r6.f348992b
            r11 = 0
            java.lang.String r15 = r14.mo119947w(r15, r11)
            if (r15 == 0) goto L_0x022a
            java.io.File r6 = new java.io.File
            r6.<init>(r15)
            boolean r6 = r6.canRead()
            goto L_0x0230
        L_0x022a:
            java.lang.String r6 = r6.f348992b
            boolean r6 = r14.mo119948x(r6)
        L_0x0230:
            if (r6 != 0) goto L_0x02ab
            java.lang.String r6 = "importPath cannot read, try get from intent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r6)
            java.lang.String r6 = "ImportVideoTempPath"
            boolean r14 = r7.hasExtra(r6)
            if (r14 == 0) goto L_0x02ab
            java.lang.String r6 = r7.getStringExtra(r6)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r14 != 0) goto L_0x02ab
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r15 = r14.getPath()
            if (r15 == 0) goto L_0x026e
            r11 = 0
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r11, r11)
            java.lang.String r11 = r14.getPath()
            boolean r11 = r11.equals(r15)
            if (r11 != 0) goto L_0x026e
            android.net.Uri$Builder r11 = r14.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r15)
            android.net.Uri r14 = r11.build()
        L_0x026e:
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r11 = r11.mo177799l(r14, r15)
            boolean r14 = r11.mo177810a()
            if (r14 != 0) goto L_0x027f
            r19 = r5
            r5 = 0
            goto L_0x029c
        L_0x027f:
            com.tencent.mm.vfs.FileSystem$c r14 = r11.f348991a
            java.lang.String r15 = r11.f348992b
            r19 = r5
            r5 = 0
            java.lang.String r15 = r14.mo119947w(r15, r5)
            if (r15 == 0) goto L_0x0296
            java.io.File r5 = new java.io.File
            r5.<init>(r15)
            boolean r5 = r5.canRead()
            goto L_0x029c
        L_0x0296:
            java.lang.String r5 = r11.f348992b
            boolean r5 = r14.mo119948x(r5)
        L_0x029c:
            if (r5 == 0) goto L_0x02ad
            r5 = 1
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r5 = 0
            r11[r5] = r6
            java.lang.String r5 = "intent filePath can read %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r11)
            r5 = 1
            goto L_0x02b0
        L_0x02ab:
            r19 = r5
        L_0x02ad:
            r6 = r19
            r5 = 0
        L_0x02b0:
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r14 = r11.getPath()
            if (r14 == 0) goto L_0x02d5
            r15 = 0
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r15 = r11.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x02d5
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r14)
            android.net.Uri r11 = r11.build()
        L_0x02d5:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r11 = r14.mo177799l(r11, r15)
            boolean r14 = r11.mo177810a()
            if (r14 != 0) goto L_0x02e6
            r35 = r2
            r2 = 0
            goto L_0x0303
        L_0x02e6:
            com.tencent.mm.vfs.FileSystem$c r14 = r11.f348991a
            java.lang.String r15 = r11.f348992b
            r35 = r2
            r2 = 0
            java.lang.String r15 = r14.mo119947w(r15, r2)
            if (r15 == 0) goto L_0x02fd
            java.io.File r2 = new java.io.File
            r2.<init>(r15)
            boolean r2 = r2.canRead()
            goto L_0x0303
        L_0x02fd:
            java.lang.String r2 = r11.f348992b
            boolean r2 = r14.mo119948x(r2)
        L_0x0303:
            if (r2 != 0) goto L_0x031f
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r6
            java.lang.String r1 = "error final importPath cannot read:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            r2 = -50005(0xffffffffffff3cab, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x031f:
            boolean r2 = uf0.C102016c.m134339a(r6)
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r11 = (int) r14
            java.lang.String r15 = "mp4 format: %s"
            if (r2 == 0) goto L_0x0533
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r16 = 0
            r0[r16] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r0)
            com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
            r0.<init>()
            com.tencent.mm.pluginsdk.model.t0$b r14 = r8.f283550u
            java.lang.String r15 = r8.f283543n
            xb0.h r8 = xb0.C102609h.Fx0()
            boolean r8 = r8.zx0(r6)
            if (r8 == 0) goto L_0x037b
            r8 = 1
            java.lang.Object[] r14 = new java.lang.Object[r8]
            r14[r16] = r6
            java.lang.String r15 = "check remuxing, this video had wx meta do not remuxing. %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            r0.value = r8
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 422(0x1a6, double:2.085E-321)
            r22 = 51
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
            r43 = r2
            r42 = r3
            r37 = r4
            r41 = r5
            r39 = r9
            r40 = r10
            r44 = r11
            r38 = r12
        L_0x0377:
            r2 = r0
        L_0x0378:
            r0 = 0
            goto L_0x0529
        L_0x037b:
            com.tencent.mm.modelcontrol.VideoTransPara r8 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117168a(r6)
            boolean r20 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117175h(r6)
            java.lang.Boolean r36 = java.lang.Boolean.valueOf(r20)
            r37 = r4
            r38 = r12
            r4 = 2
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r4 = 0
            r12[r4] = r8
            r4 = 1
            r12[r4] = r15
            java.lang.String r4 = "check remuxing old para %s, customVideoTransPara: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r4, r12)
            xb0.h r4 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.Ex0(r8, r15)
            if (r4 != 0) goto L_0x03be
            r12 = 1
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r15 = 0
            r4[r15] = r8
            java.lang.String r8 = "get C2C album video para is null. old para %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r8, r4)
            r4 = -5
            r0.value = r4
            r43 = r2
            r42 = r3
            r41 = r5
            r39 = r9
            r40 = r10
            r44 = r11
            goto L_0x0377
        L_0x03be:
            r12 = 1
            r15 = 0
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r15] = r4
            java.lang.String r15 = "check remuxing new para %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r15, r1)
            com.tencent.mm.pluginsdk.model.u0 r1 = com.tencent.p014mm.pluginsdk.model.C30685u0.f82571a
            boolean r1 = r1.mo57539a()
            if (r1 == 0) goto L_0x03d3
            r4.f267154A = r12
        L_0x03d3:
            r1 = 3
            int[] r15 = new int[r1]
            r15 = {0, 0, 0} // fill-array
            int r1 = r4.f267169g
            r16 = 0
            r15[r16] = r1
            r39 = r9
            int r9 = r4.f267166d
            r15[r12] = r9
            int r12 = r4.f267167e
            r40 = r10
            r10 = 2
            r15[r10] = r12
            int r7 = r4.f267180u
            r41 = r5
            r5 = 1
            if (r7 == r5) goto L_0x03f5
            if (r7 != r10) goto L_0x03ff
        L_0x03f5:
            int r7 = r4.f267160G
            if (r7 == r10) goto L_0x0412
            r10 = 4
            if (r7 == r10) goto L_0x0412
            if (r7 != r5) goto L_0x03ff
            goto L_0x0412
        L_0x03ff:
            java.lang.String r1 = "c2c ABA: No use ABA algorithm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r45 = r0
            r43 = r2
            r42 = r3
            r46 = r8
            r44 = r11
            r0 = 2
        L_0x040f:
            r1 = 0
            goto L_0x0498
        L_0x0412:
            int r5 = r4.f267168f
            r24 = 1092616192(0x41200000, float:10.0)
            r25 = 0
            float r10 = r4.f267182w
            r28 = 0
            r42 = r3
            int r3 = r4.f267184y
            r43 = r2
            int r2 = r4.f267185z
            r44 = r11
            int r11 = r4.f267154A
            r45 = r0
            int r0 = r4.f267155B
            r46 = r8
            int r8 = r4.f267156C
            r34 = 0
            r19 = r6
            r20 = r12
            r21 = r9
            r22 = r5
            r23 = r1
            r26 = r7
            r27 = r10
            r29 = r3
            r30 = r2
            r31 = r11
            r32 = r0
            r33 = r8
            com.tencent.mm.plugin.sight.base.ABAPrams r0 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r14.f283552a = r0
            if (r0 == 0) goto L_0x0459
            int r1 = r0.outputKbps
            int r1 = r1 * 1000
            r2 = 0
            r15[r2] = r1
        L_0x0459:
            if (r0 == 0) goto L_0x046a
            int r1 = r0.resolutionAdjust
            if (r1 <= 0) goto L_0x046a
            int r1 = r0.outputWidth
            r2 = 1
            r15[r2] = r1
            int r0 = r0.outputHeight
            r1 = 2
            r15[r1] = r0
            goto L_0x046b
        L_0x046a:
            r2 = 1
        L_0x046b:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3 = 0
            r0 = r15[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            r0 = r15[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            r0 = 2
            r2 = r15[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            java.lang.String r2 = "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            com.tencent.mm.modelcdntran.e0 r1 = hd0.C98398h0.xx0()
            com.tencent.mm.plugin.sight.base.ABAPrams r2 = r14.f283552a
            r1.mo126991o(r2)
            goto L_0x040f
        L_0x0498:
            r2 = r15[r1]
            r4.f267169g = r2
            r1 = 1
            r3 = r15[r1]
            r4.f267166d = r3
            r1 = r15[r0]
            r4.f267167e = r1
            r0 = r46
            int r1 = r0.f267169g
            r3 = 640000(0x9c400, float:8.96831E-40)
            if (r1 <= r3) goto L_0x050b
            if (r2 <= r1) goto L_0x04b1
            goto L_0x050b
        L_0x04b1:
            int r0 = r0.f267170h
            int r0 = r0 * 1000
            pj.a r1 = p645pj.C35511a.f94971a
            int r2 = r1.mo60283a()
            int r2 = r2 * 1000
            if (r0 < r2) goto L_0x04c6
            r0 = -6
            r2 = r45
            r2.value = r0
            goto L_0x0378
        L_0x04c6:
            r2 = r45
            boolean r0 = r36.booleanValue()
            if (r0 == 0) goto L_0x04d2
            r3 = 0
            r2.value = r3
            goto L_0x0509
        L_0x04d2:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            int r3 = r4.f267166d
            int r5 = r4.f267167e
            if (r0 == 0) goto L_0x04e3
            r22 = 10485760(0xa00000, float:1.469368E-38)
            goto L_0x04e9
        L_0x04e3:
            int r7 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            r22 = r7
        L_0x04e9:
            if (r0 == 0) goto L_0x04f1
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            goto L_0x04f8
        L_0x04f1:
            int r0 = r1.mo60283a()
            int r0 = r0 * 1000
            double r0 = (double) r0
        L_0x04f8:
            r23 = r0
            r25 = 1000000(0xf4240, float:1.401298E-39)
            r19 = r6
            r20 = r3
            r21 = r5
            int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(r19, r20, r21, r22, r23, r25)
            r2.value = r0
        L_0x0509:
            r0 = r4
            goto L_0x0529
        L_0x050b:
            r2 = r45
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r4
            r4 = 1
            r3[r4] = r0
            java.lang.String r5 = "new bitrate is bigger than old bitrate %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r3)
            boolean r3 = r36.booleanValue()
            if (r3 == 0) goto L_0x0525
            r2.value = r1
            goto L_0x0529
        L_0x0525:
            r2.value = r4
            goto L_0x0378
        L_0x0529:
            int r1 = r2.value
            r7 = r0
            r2 = r1
            r0 = r44
            r1 = 1
            r3 = 4
            r4 = 0
            goto L_0x0568
        L_0x0533:
            r43 = r2
            r42 = r3
            r37 = r4
            r41 = r5
            r39 = r9
            r40 = r10
            r44 = r11
            r38 = r12
            r4 = -5
            if (r0 == 0) goto L_0x054b
            r0 = r44
            r14 = 10485760(0xa00000, float:1.469368E-38)
            goto L_0x0551
        L_0x054b:
            int r14 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            r0 = r44
        L_0x0551:
            if (r0 <= r14) goto L_0x0558
            r1 = 1
            r2 = -5
            r3 = 4
            r4 = 0
            goto L_0x0567
        L_0x0558:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r43)
            r4 = 0
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r2)
            r2 = 1
            r3 = 4
        L_0x0567:
            r7 = 0
        L_0x0568:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3[r4] = r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r43)
            r3[r1] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4 = 2
            r3[r4] = r1
            int r1 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r3[r4] = r1
            java.lang.String r1 = "check remuxing, ret %d isMp4 %b length %d config:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r3)
            switch(r2) {
                case -6: goto L_0x07a3;
                case -5: goto L_0x078e;
                case -4: goto L_0x07a3;
                case -3: goto L_0x07a3;
                case -2: goto L_0x07a3;
                case -1: goto L_0x0779;
                case 0: goto L_0x05c4;
                case 1: goto L_0x05ab;
                case 2: goto L_0x05ab;
                case 3: goto L_0x05ab;
                case 4: goto L_0x05ab;
                case 5: goto L_0x05ab;
                default: goto L_0x0590;
            }
        L_0x0590:
            r9 = r48
            r8 = r50
            java.lang.String r0 = "unknown check type"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r2 = -50001(0xffffffffffff3caf, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x05ab:
            int r1 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            if (r0 <= r1) goto L_0x05c2
            r2 = -50002(0xffffffffffff3cae, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x05c2:
            r1 = 0
            goto L_0x05c5
        L_0x05c4:
            r1 = 1
        L_0x05c5:
            java.lang.String r2 = ""
            if (r41 != 0) goto L_0x06a9
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$b r3 = h81.C32735h.C32738b.clicfg_c2c_video_thumb_use_adaptive
            r4 = 1
            boolean r3 = r0.mo58784wf(r3, r4)
            if (r3 == 0) goto L_0x066e
            oj.c r0 = new oj.c     // Catch:{ Exception -> 0x0663 }
            r0.<init>()     // Catch:{ Exception -> 0x0663 }
            r8 = r50
            if (r8 == 0) goto L_0x0670
            java.lang.String r4 = r50.getDataString()     // Catch:{ Exception -> 0x0661 }
            r5 = r40
            boolean r5 = r4.startsWith(r5)     // Catch:{ Exception -> 0x0661 }
            if (r5 == 0) goto L_0x0670
            android.os.Bundle r5 = r50.getExtras()     // Catch:{ Exception -> 0x0661 }
            if (r5 == 0) goto L_0x0612
            android.os.Bundle r5 = r50.getExtras()     // Catch:{ Exception -> 0x0661 }
            r9 = r39
            android.os.Parcelable r5 = r5.getParcelable(r9)     // Catch:{ Exception -> 0x0661 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ Exception -> 0x0661 }
            if (r5 == 0) goto L_0x0612
            java.lang.String r9 = r5.getPath()     // Catch:{ Exception -> 0x0661 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0661 }
            if (r9 != 0) goto L_0x0612
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x0661 }
            goto L_0x0613
        L_0x0612:
            r5 = 0
        L_0x0613:
            if (r5 != 0) goto L_0x061a
            r5 = 7
            java.lang.String r5 = r4.substring(r5)     // Catch:{ Exception -> 0x0661 }
        L_0x061a:
            r0.setDataSource(r5)     // Catch:{ Exception -> 0x0661 }
            r4 = 9
            java.lang.String r4 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0661 }
            r9 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r9)     // Catch:{ Exception -> 0x0661 }
            r0.release()     // Catch:{ Exception -> 0x0661 }
            r20 = 0
            float r0 = (float) r4     // Catch:{ Exception -> 0x0661 }
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = r5
            r21 = r0
            int r5 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119562h(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0661 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x065e }
            r0.<init>()     // Catch:{ Exception -> 0x065e }
            java.lang.String r9 = "video dark frame check, available time = "
            r0.append(r9)     // Catch:{ Exception -> 0x065e }
            r0.append(r5)     // Catch:{ Exception -> 0x065e }
            java.lang.String r9 = " video duration = "
            r0.append(r9)     // Catch:{ Exception -> 0x065e }
            r0.append(r4)     // Catch:{ Exception -> 0x065e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x065e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ Exception -> 0x065e }
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r5 <= r0) goto L_0x0671
            goto L_0x0670
        L_0x065e:
            r0 = move-exception
            r4 = 0
            goto L_0x0668
        L_0x0661:
            r0 = move-exception
            goto L_0x0666
        L_0x0663:
            r0 = move-exception
            r8 = r50
        L_0x0666:
            r4 = 0
            r5 = 0
        L_0x0668:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r9)
            goto L_0x0671
        L_0x066e:
            r8 = r50
        L_0x0670:
            r5 = 0
        L_0x0671:
            if (r3 == 0) goto L_0x0676
            int r5 = r5 * 1000
            goto L_0x0677
        L_0x0676:
            r5 = -1
        L_0x0677:
            r3 = r49
            oj.a$a r0 = p914oj.C100361a.m131253b(r3, r8, r5)     // Catch:{ Exception -> 0x067f }
            r12 = r0
            goto L_0x0688
        L_0x067f:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r3, r2, r0)
            r12 = 0
        L_0x0688:
            if (r12 != 0) goto L_0x06a0
            r3 = r38
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r3)
            r2 = -50005(0xffffffffffff3cab, float:NaN)
            r0 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r5 = 0
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x06a0:
            int r0 = r12.f224999c
            long r3 = (long) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r3)
            r5 = r0
            goto L_0x06bc
        L_0x06a9:
            r8 = r50
            r3 = 1
            r5 = 0
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r6, r3)
            if (r0 == 0) goto L_0x06bb
            int r0 = r0.f273443a
            long r3 = (long) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r3)
            r5 = r0
        L_0x06bb:
            r12 = 0
        L_0x06bc:
            if (r1 != 0) goto L_0x06d0
            r3 = r37
            com.tencent.p014mm.vfs.C86013q1.m106442c(r6, r3)
            r9 = r48
            int r0 = r9.f283540h
            m124284h(r3, r0)
            r4 = 0
            m124283f(r4, r6, r3)
            r4 = 0
            goto L_0x06da
        L_0x06d0:
            r9 = r48
            r3 = r37
            r0 = -50006(0xffffffffffff3caa, float:NaN)
            r4 = -50006(0xffffffffffff3caa, float:NaN)
        L_0x06da:
            r10 = 60
            if (r12 == 0) goto L_0x0706
            android.graphics.Bitmap r0 = r12.f224998b
            if (r0 == 0) goto L_0x0706
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x06f7 }
            r12 = r35
            r14 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r10, r11, r12, r14)     // Catch:{ Exception -> 0x06f5 }
            r9.mo135066i(r14)     // Catch:{ Exception -> 0x06f1 }
        L_0x06ed:
            r11 = 0
            r16 = 0
            goto L_0x072f
        L_0x06f1:
            r0 = move-exception
            r11 = r0
            r0 = 0
            goto L_0x06fc
        L_0x06f5:
            r0 = move-exception
            goto L_0x06fa
        L_0x06f7:
            r0 = move-exception
            r12 = r35
        L_0x06fa:
            r11 = r0
            r0 = 1
        L_0x06fc:
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r11, r2, r15)
            r16 = r0
            r11 = 0
            goto L_0x072f
        L_0x0706:
            r12 = r35
            if (r41 == 0) goto L_0x072c
            java.lang.String r0 = "create video thumb from temp copy path"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            r11 = 1
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r6, r11)     // Catch:{ Exception -> 0x0722 }
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0722 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r10, r14, r12, r11)     // Catch:{ Exception -> 0x0722 }
            r9.mo135066i(r11)     // Catch:{ Exception -> 0x071d }
            goto L_0x06ed
        L_0x071d:
            r0 = move-exception
            r11 = 0
            r16 = 0
            goto L_0x0726
        L_0x0722:
            r0 = move-exception
            r11 = 0
            r16 = 1
        L_0x0726:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r14)
            goto L_0x072f
        L_0x072c:
            r11 = 0
            r16 = 1
        L_0x072f:
            if (r16 == 0) goto L_0x074c
            r9.mo135066i(r11)     // Catch:{ Exception -> 0x0745 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = 320(0x140, float:4.48E-43)
            r14 = 480(0x1e0, float:6.73E-43)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r11, r14)     // Catch:{ Exception -> 0x0745 }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0745 }
            r14 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r10, r11, r12, r14)     // Catch:{ Exception -> 0x0745 }
            goto L_0x074c
        L_0x0745:
            r0 = move-exception
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r10)
        L_0x074c:
            if (r1 != 0) goto L_0x0757
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r0 != 0) goto L_0x0757
            r4 = -50003(0xffffffffffff3cad, float:NaN)
        L_0x0757:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r0 != 0) goto L_0x0764
            r0 = -50004(0xffffffffffff3cac, float:NaN)
            r2 = -50004(0xffffffffffff3cac, float:NaN)
            goto L_0x0765
        L_0x0764:
            r2 = r4
        L_0x0765:
            if (r41 == 0) goto L_0x076d
            java.lang.String r0 = "ImportUseVideoTempCopyPath"
            r1 = 1
            r8.putExtra(r0, r1)
        L_0x076d:
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r7
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x0779:
            r9 = r48
            r8 = r50
            r2 = -50007(0xffffffffffff3ca9, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x078e:
            r9 = r48
            r8 = r50
            r2 = -50008(0xffffffffffff3ca8, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        L_0x07a3:
            r9 = r48
            r8 = r50
            r2 = -50002(0xffffffffffff3cae, float:NaN)
            r0 = 0
            r5 = 0
            r1 = r48
            r3 = r42
            r4 = r6
            r6 = r0
            r7 = r50
            r1.mo135065g(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96790t0.mo135063d(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135064e(java.lang.String r19, java.lang.String r20, java.lang.String r21, android.content.Intent r22, int r23, int r24) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r24
            java.lang.String r5 = ""
            java.lang.String r6 = "ImportMsgLocalId"
            java.lang.String r7 = "MicroMsg.ImportMultiVideo"
            r8 = -1
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = "import for only upload, do not insert msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            long r10 = r3.getLongExtra(r6, r8)
            goto L_0x001d
        L_0x001c:
            r10 = r8
        L_0x001d:
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00bb
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r10 = 5
            r0.mo100991d(r10)
            r0.mo108749c3(r1)
            long r8 = eb0.C75604z3.m90843o(r19)
            r0.mo108733M2(r8)
            r0.mo108740T2(r15)
            r0.mo108739S2(r2)
            r8 = 43
            r0.setType(r8)
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            long r8 = r8.my0(r0)
            r11 = 8
            java.lang.Object[] r11 = new java.lang.Object[r11]
            long r16 = r0.getMsgId()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r11[r14] = r16
            long r16 = r0.mo108774y2()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r11[r15] = r16
            java.lang.String r16 = r0.mo108768t()
            r11[r13] = r16
            r16 = 3
            int r17 = r0.getType()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r11[r16] = r17
            int r16 = r0.mo108769t2()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r11[r12] = r16
            java.lang.String r16 = r0.mo108765s2()
            r11[r10] = r16
            r10 = 6
            int r16 = r0.getStatus()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r11[r10] = r16
            r10 = 7
            long r16 = r0.getCreateTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r11[r10] = r0
            java.lang.String r0 = "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r11)
            r10 = -1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00ba
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r14] = r1
            java.lang.String r1 = "[insertErrMsg] :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r0)
            return
        L_0x00ba:
            r10 = r8
        L_0x00bb:
            hd0.n0 r0 = hd0.C98429r0.m127818i(r20)
            java.lang.String r8 = "[insertErrMsg] localMsgId:%s"
            if (r0 != 0) goto L_0x0187
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r0.mo137729r(r2)
            r12 = -1
            r13 = r18
            android.content.Context r0 = r13.f283536d     // Catch:{ Exception -> 0x0101 }
            oj.a$a r0 = p914oj.C100361a.m131253b(r0, r3, r12)     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Bitmap r14 = r0.f224998b     // Catch:{ Exception -> 0x0101 }
            if (r14 == 0) goto L_0x00ed
            int r14 = r0.f224999c     // Catch:{ Exception -> 0x0101 }
            long r12 = (long) r14     // Catch:{ Exception -> 0x0101 }
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r12)     // Catch:{ Exception -> 0x0101 }
            android.graphics.Bitmap r0 = r0.f224998b     // Catch:{ Exception -> 0x00eb }
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00eb }
            r14 = 60
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r14, r13, r9, r15)     // Catch:{ Exception -> 0x00eb }
            goto L_0x010a
        L_0x00eb:
            r0 = move-exception
            goto L_0x0104
        L_0x00ed:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = 320(0x140, float:4.48E-43)
            r13 = 480(0x1e0, float:6.73E-43)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r12, r13)     // Catch:{ Exception -> 0x0101 }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0101 }
            r13 = 60
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r13, r12, r9, r15)     // Catch:{ Exception -> 0x0101 }
            r12 = r23
            goto L_0x010a
        L_0x0101:
            r0 = move-exception
            r12 = r23
        L_0x0104:
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r5, r14)
        L_0x010a:
            int r0 = hd0.C98410o0.m127731m(r9)
            hd0.o0 r9 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r9.mo137728q(r2)
            int r9 = hd0.C98410o0.m127731m(r9)
            hd0.n0 r13 = new hd0.n0
            r13.<init>()
            r13.f288554a = r2
            if (r9 <= 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r9 = 0
        L_0x0125:
            r13.f288559f = r9
            r13.f288561h = r0
            r13.f288566m = r12
            r13.f288570q = r1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 2
            java.lang.Object r0 = r0.mo119684e(r1, r5)
            java.lang.String r0 = (java.lang.String) r0
            r13.f288571r = r0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r13.f288563j = r0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r13.f288564k = r0
            r0 = 0
            r13.f288575v = r0
            r1 = r21
            r13.f288574u = r1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r0 != 0) goto L_0x0159
            r13.f288572s = r15
        L_0x0159:
            if (r3 == 0) goto L_0x0167
            r1 = -1
            long r5 = r3.getLongExtra(r6, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0167
            r12 = 4
            goto L_0x0168
        L_0x0167:
            r12 = -1
        L_0x0168:
            r13.f288576w = r12
            r13.f288562i = r4
            int r0 = (int) r10
            long r0 = (long) r0
            r13.f288567n = r0
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            boolean r0 = r0.mo137730s(r13)
            if (r0 != 0) goto L_0x019f
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r2 = 0
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r0)
            goto L_0x019f
        L_0x0187:
            r0.f288562i = r4
            hd0.o0 r1 = hd0.C98398h0.Bx0()
            boolean r0 = r1.mo137733w(r0)
            if (r0 != 0) goto L_0x019f
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r2 = 0
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r0)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96790t0.mo135064e(java.lang.String, java.lang.String, java.lang.String, android.content.Intent, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0289, code lost:
        if (hd0.C98398h0.Bx0().mo137730s(r12) != false) goto L_0x028e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135065g(int r44, java.lang.String r45, java.lang.String r46, int r47, com.tencent.p014mm.modelcontrol.VideoTransPara r48, android.content.Intent r49) {
        /*
            r43 = this;
            r8 = r43
            r0 = r44
            r15 = r45
            r7 = r46
            r9 = r47
            r5 = r49
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_remove_video_metadata_before_send
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "MicroMsg.ImportMultiVideo"
            java.lang.String r4 = "finish to import %s to %s | ret %d | duration %d"
            r6 = 4
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r11 = 0
            r10[r11] = r7
            r13 = 1
            r10[r13] = r15
            java.lang.Integer r12 = java.lang.Integer.valueOf(r44)
            r14 = 2
            r10[r14] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r47)
            r16 = 3
            r10[r16] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r10)
            monitor-enter(r43)
            java.util.List<java.lang.Integer> r3 = r8.f283544o     // Catch:{ all -> 0x0519 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r44)     // Catch:{ all -> 0x0519 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0519 }
            r3.add(r4)     // Catch:{ all -> 0x0519 }
            java.util.List<java.lang.String> r3 = r8.f283545p     // Catch:{ all -> 0x0519 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0519 }
            r3.add(r15)     // Catch:{ all -> 0x0519 }
            java.util.List<java.lang.String> r3 = r8.f283546q     // Catch:{ all -> 0x0519 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0519 }
            r3.add(r7)     // Catch:{ all -> 0x0519 }
            java.util.List<java.lang.Integer> r3 = r8.f283547r     // Catch:{ all -> 0x0519 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r47)     // Catch:{ all -> 0x0519 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0519 }
            r3.add(r4)     // Catch:{ all -> 0x0519 }
            monitor-exit(r43)
            long r33 = com.tencent.p014mm.vfs.C86013q1.m106451l(r46)
            r3 = -50002(0xffffffffffff3cae, float:NaN)
            if (r0 != r3) goto L_0x00aa
            int r0 = r8.f283540h
            if (r0 != r13) goto L_0x0065
            r0 = 230(0xe6, float:3.22E-43)
            goto L_0x0067
        L_0x0065:
            r0 = 245(0xf5, float:3.43E-43)
        L_0x0067:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report video too big reportId : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " importType : "
            r1.append(r2)
            int r2 = r8.f283540h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ImportMultiVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 106(0x6a, double:5.24E-322)
            long r0 = (long) r0
            r21 = 1
            r23 = 0
            r19 = r0
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.String r2 = r8.f283539g
            r0 = 141(0x8d, float:1.98E-43)
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r49
            r6 = r47
            r7 = r0
            r1.mo135064e(r2, r3, r4, r5, r6, r7)
            goto L_0x0518
        L_0x00aa:
            r3 = -50008(0xffffffffffff3ca8, float:NaN)
            if (r0 != r3) goto L_0x00d0
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 106(0x6a, double:5.24E-322)
            r19 = 210(0xd2, double:1.04E-321)
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.String r2 = r8.f283539g
            r0 = 140(0x8c, float:1.96E-43)
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r49
            r6 = r47
            r7 = r0
            r1.mo135064e(r2, r3, r4, r5, r6, r7)
            goto L_0x0518
        L_0x00d0:
            r3 = -50006(0xffffffffffff3caa, float:NaN)
            r16 = 1048576(0x100000, double:5.180654E-318)
            r35 = 1000(0x3e8, double:4.94E-321)
            r6 = -1
            if (r0 != r3) goto L_0x0356
            if (r5 == 0) goto L_0x00e7
            java.lang.String r0 = "ImportMsgLocalId"
            long r18 = r5.getLongExtra(r0, r6)
            r37 = r18
            goto L_0x00e9
        L_0x00e7:
            r37 = r6
        L_0x00e9:
            com.tencent.mm.pluginsdk.model.t0$d r0 = new com.tencent.mm.pluginsdk.model.t0$d
            r0.<init>()
            java.lang.Object r3 = f283533w
            monitor-enter(r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.pluginsdk.model.t0$d> r6 = f283532v     // Catch:{ all -> 0x0353 }
            r6.put(r15, r0)     // Catch:{ all -> 0x0353 }
            monitor-exit(r3)     // Catch:{ all -> 0x0353 }
            if (r9 > 0) goto L_0x00fb
            r3 = 1
            goto L_0x00fc
        L_0x00fb:
            r3 = r9
        L_0x00fc:
            java.lang.String r6 = r8.f283539g
            com.tencent.mm.modelimage.a r7 = r8.f283542j
            java.lang.String r7 = com.tencent.p014mm.modelimage.C80999a.m98901a(r7)
            boolean r10 = r8.f283541i
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            java.lang.String r4 = "MicroMsg.VideoLogic"
            r39 = 0
            r12 = 43
            if (r20 == 0) goto L_0x0120
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r11] = r2
            java.lang.String r2 = "do prepare, but file name is null, type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
            goto L_0x0143
        L_0x0120:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r20 == 0) goto L_0x0134
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r11] = r2
            java.lang.String r2 = "do prepare, but toUser is null, type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
            goto L_0x0143
        L_0x0134:
            if (r3 > 0) goto L_0x0149
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r11] = r2
            java.lang.String r2 = "do prepare, but video len error, type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
        L_0x0143:
            r14 = r46
            r42 = r0
            goto L_0x028c
        L_0x0149:
            hd0.n0 r12 = new hd0.n0
            r12.<init>()
            if (r10 == 0) goto L_0x01f3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            java.lang.String r11 = "origin"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            hd0.o0 r11 = hd0.C98398h0.Bx0()
            java.lang.String r11 = r11.mo137728q(r10)
            r14 = r46
            com.tencent.p014mm.vfs.C86013q1.m106442c(r14, r11)
            boolean r18 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r18 == 0) goto L_0x01b8
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            boolean r13 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r11)
            long r20 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            long r20 = r20 - r18
            r41 = r7
            long r7 = java.lang.Math.abs(r20)
            if (r13 == 0) goto L_0x0193
            int r18 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            r42 = r0
            goto L_0x01bc
        L_0x0193:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r14, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r42 = r0
            java.lang.String r0 = "do prepare, modify moov fail, copy origin video again, optimize ret = "
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = " file length diff = "
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x01bc
        L_0x01b8:
            r42 = r0
            r41 = r7
        L_0x01bc:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            r2 = 1
            int r0 = r0.mo58779Qe(r1, r2)
            if (r0 != r2) goto L_0x01cc
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.removeVideoMetadata(r11, r2, r2)
        L_0x01cc:
            r17 = 0
            r21 = 0
            r23 = 43
            r24 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 1
            java.lang.String r22 = ""
            java.lang.String r25 = ""
            r16 = r10
            r18 = r3
            r19 = r6
            r20 = r46
            r31 = r37
            hd0.C98429r0.m127828s(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            r12.f288546N = r10
            r0 = 1
            r12.f288552T = r0
            goto L_0x01f9
        L_0x01f3:
            r14 = r46
            r42 = r0
            r41 = r7
        L_0x01f9:
            r12.f288554a = r15
            r12.f288566m = r3
            r12.f288570q = r6
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.String r1 = ""
            r8 = 2
            java.lang.Object r0 = r0.mo119684e(r8, r1)
            java.lang.String r0 = (java.lang.String) r0
            r12.f288571r = r0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r12.f288563j = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r12.f288564k = r2
            r4 = 0
            r12.f288575v = r4
            r12.f288574u = r14
            r0 = r41
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            r12.f288543K = r0
            r0 = 1
            r12.f288551S = r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r46)
            if (r1 != 0) goto L_0x0236
            r12.f288572s = r0
        L_0x0236:
            int r0 = r12.f288572s
            if (r0 != 0) goto L_0x023c
            r0 = 1
            goto L_0x023d
        L_0x023c:
            r0 = -1
        L_0x023d:
            r12.f288576w = r0
            r0 = 0
            r12.f288559f = r0
            r0 = 106(0x6a, float:1.49E-43)
            r12.f288562i = r0
            int r0 = (r37 > r39 ? 1 : (r37 == r39 ? 0 : -1))
            if (r0 >= 0) goto L_0x0278
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            java.lang.String r1 = r12.mo137707k()
            r0.mo108749c3(r1)
            r1 = 43
            r0.setType(r1)
            r1 = 1
            r0.mo108740T2(r1)
            r0.mo108739S2(r15)
            r5 = 8
            r0.mo100991d(r5)
            java.lang.String r1 = r12.mo137707k()
            long r1 = eb0.C75604z3.m90843o(r1)
            r0.mo108733M2(r1)
            long r0 = eb0.C75604z3.m90852x(r0)
            r6 = r0
            goto L_0x027d
        L_0x0278:
            r0 = 4
            r12.f288576w = r0
            r6 = r37
        L_0x027d:
            int r0 = (int) r6
            long r0 = (long) r0
            r12.f288567n = r0
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            boolean r0 = r0.mo137730s(r12)
            if (r0 == 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            r6 = -1
        L_0x028e:
            int r0 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d9
            r8 = r43
            java.lang.String r2 = r8.f283539g
            r7 = 142(0x8e, float:1.99E-43)
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r49
            r6 = r47
            r1.mo135064e(r2, r3, r4, r5, r6, r7)
            ig3.n r0 = ig3.C98692n.f289404a
            java.lang.String r10 = r8.f283539g
            r12 = 2
            long r1 = (long) r9
            long r13 = r1 * r35
            int r1 = r8.f283540h
            long r19 = m124281b(r1)
            boolean r1 = r8.f283541i
            r22 = -1
            r9 = r0
            r11 = r45
            r7 = r15
            r15 = r33
            r17 = r33
            r21 = r1
            r9.mo138104e(r10, r11, r12, r13, r15, r17, r19, r21, r22)
            java.lang.String r0 = "MicroMsg.ImportMultiVideo"
            java.lang.String r1 = "prepare"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            java.lang.Object r1 = f283533w
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.tencent.mm.pluginsdk.model.t0$d> r0 = f283532v     // Catch:{ all -> 0x02d6 }
            r0.remove(r7)     // Catch:{ all -> 0x02d6 }
            monitor-exit(r1)     // Catch:{ all -> 0x02d6 }
            return
        L_0x02d6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d6 }
            throw r0
        L_0x02d9:
            r8 = r43
            r7 = r15
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r0 = f283534x
            if (r0 != 0) goto L_0x0303
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r0 = new com.tencent.mm.sdk.platformtools.QueueWorkerThread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remuxing-thread-"
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r3 = 1
            r10 = 5
            r0.<init>(r10, r1, r3, r2)
            f283534x = r0
        L_0x0303:
            r0 = r42
            r0.f283553d = r7
            r0.f283554e = r14
            hd0.o0 r1 = hd0.C98398h0.Bx0()
            java.lang.String r1 = r1.mo137728q(r7)
            r0.f283555f = r1
            int r1 = r8.f283540h
            r0.f283557h = r1
            java.lang.String r1 = r8.f283539g
            r0.f283558i = r1
            r1 = r48
            r0.f283559j = r1
            com.tencent.mm.pluginsdk.model.t0$b r1 = r8.f283550u
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r1.f283552a
            r0.f283560n = r1
            boolean r1 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117175h(r46)
            r0.f283567u = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r1 = r8.f283541i
            r0.f283561o = r1
            java.lang.String r1 = "ImportUseVideoTempCopyPath"
            r6 = r49
            boolean r1 = r6.hasExtra(r1)
            if (r1 == 0) goto L_0x034c
            java.lang.String r1 = "ImportUseVideoTempCopyPath"
            r2 = 0
            boolean r1 = r6.getBooleanExtra(r1, r2)
            r0.f283562p = r1
        L_0x034c:
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r1 = f283534x
            r1.add(r0)
            goto L_0x0518
        L_0x0353:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0353 }
            throw r0
        L_0x0356:
            r14 = r46
            r6 = r5
            r7 = r15
            r4 = 0
            r5 = 8
            r10 = 5
            r15 = r8
            r8 = 2
            if (r0 >= 0) goto L_0x03e1
            int r1 = r15.f283540h
            r2 = 1
            if (r1 != r2) goto L_0x036a
            r1 = 229(0xe5, float:3.21E-43)
            goto L_0x036c
        L_0x036a:
            r1 = 244(0xf4, float:3.42E-43)
        L_0x036c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report video file error reportId : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " importType : "
            r2.append(r3)
            int r3 = r15.f283540h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.ImportMultiVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 106(0x6a, double:5.24E-322)
            long r1 = (long) r1
            r21 = 1
            r23 = 0
            r19 = r1
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.String r2 = r15.f283539g
            r11 = 142(0x8e, float:1.99E-43)
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r49
            r6 = r47
            r13 = r7
            r7 = r11
            r1.mo135064e(r2, r3, r4, r5, r6, r7)
            r1 = -50007(0xffffffffffff3ca9, float:NaN)
            if (r0 == r1) goto L_0x03bf
            r1 = -50001(0xffffffffffff3caf, float:NaN)
            if (r0 == r1) goto L_0x03ba
            r12 = 2
            goto L_0x03c0
        L_0x03ba:
            r0 = 11
            r12 = 11
            goto L_0x03c0
        L_0x03bf:
            r12 = 5
        L_0x03c0:
            ig3.n r0 = ig3.C98692n.f289404a
            java.lang.String r10 = r15.f283539g
            long r1 = (long) r9
            long r1 = r1 * r35
            int r3 = r15.f283540h
            long r19 = m124281b(r3)
            boolean r3 = r15.f283541i
            r22 = -1
            r9 = r0
            r11 = r45
            r13 = r1
            r8 = r15
            r15 = r33
            r17 = r33
            r21 = r3
            r9.mo138104e(r10, r11, r12, r13, r15, r17, r19, r21, r22)
            goto L_0x0518
        L_0x03e1:
            r13 = r7
            r8 = r15
            if (r9 > 0) goto L_0x03ff
            oj.c r3 = new oj.c
            r3.<init>()
            r3.setDataSource(r14)
            r7 = 9
            java.lang.String r3 = r3.extractMetadata(r7)
            r7 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)
            long r9 = (long) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r9)
            r7 = r3
            goto L_0x0400
        L_0x03ff:
            r7 = r9
        L_0x0400:
            if (r6 == 0) goto L_0x040b
            java.lang.String r3 = "ImportMsgLocalId"
            r9 = -1
            long r9 = r6.getLongExtra(r3, r9)
            goto L_0x040d
        L_0x040b:
            r9 = -1
        L_0x040d:
            r26 = r9
            boolean r3 = r8.f283541i
            if (r3 == 0) goto L_0x04ae
            java.lang.String r3 = "MicroMsg.ImportMultiVideo"
            java.lang.String r4 = "import origin video"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r4 = "origin"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            hd0.o0 r4 = hd0.C98398h0.Bx0()
            java.lang.String r4 = r4.mo137728q(r3)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r14, r4)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r6 == 0) goto L_0x0478
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            boolean r6 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(r4)
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            long r11 = r11 - r9
            long r9 = java.lang.Math.abs(r11)
            if (r6 == 0) goto L_0x0454
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0478
        L_0x0454:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r14, r4)
            java.lang.String r6 = "MicroMsg.ImportMultiVideo"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "import origin video, modify moov fail, copy origin video again, optimize ret = "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = " file length diff = "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
        L_0x0478:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            r2 = 1
            int r0 = r0.mo58779Qe(r1, r2)
            if (r0 != r2) goto L_0x0488
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.removeVideoMetadata(r4, r2, r2)
        L_0x0488:
            r10 = 0
            java.lang.String r12 = r8.f283539g
            r0 = 0
            r14 = r0
            java.lang.String r15 = ""
            r16 = 43
            r17 = 0
            java.lang.String r18 = ""
            r19 = 0
            r21 = 0
            com.tencent.mm.modelimage.a r0 = r8.f283542j
            java.lang.String r22 = com.tencent.p014mm.modelimage.C80999a.m98901a(r0)
            r23 = 1
            r9 = r3
            r11 = r7
            r6 = r13
            r0 = 1
            r13 = r46
            r24 = r26
            hd0.C98429r0.m127828s(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            r10 = r3
            goto L_0x04b1
        L_0x04ae:
            r6 = r13
            r0 = 1
            r10 = r4
        L_0x04b1:
            java.lang.String r12 = r8.f283539g
            r14 = 0
            java.lang.String r15 = ""
            r16 = 43
            r17 = 0
            java.lang.String r18 = ""
            r19 = 0
            r21 = 0
            com.tencent.mm.modelimage.a r1 = r8.f283542j
            java.lang.String r22 = com.tencent.p014mm.modelimage.C80999a.m98901a(r1)
            r23 = 0
            r9 = r45
            r11 = r7
            r13 = r46
            r24 = r26
            hd0.C98429r0.m127828s(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            hd0.C98429r0.m127805K(r45)
            int r1 = r8.f283540h
            if (r1 != r0) goto L_0x04dc
            r9 = 8
            goto L_0x04dd
        L_0x04dc:
            r9 = 1
        L_0x04dd:
            r10 = 2
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r11 = r0.mo137728q(r6)
            hd0.e0 r0 = hd0.C98394e0.vx0()
            java.lang.String r3 = r8.f283539g
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r1 = r46
            r2 = r11
            r6 = r9
            r9 = r7
            r7 = r10
            r0.wx0(r1, r2, r3, r4, r5, r6, r7)
            ig3.n r0 = ig3.C98692n.f289404a
            java.lang.String r10 = r8.f283539g
            long r1 = (long) r9
            long r12 = r1 * r35
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r46)
            long r16 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r1 = r8.f283540h
            long r18 = m124281b(r1)
            boolean r1 = r8.f283541i
            r9 = r0
            r11 = r45
            r20 = r1
            r9.mo138103d(r10, r11, r12, r14, r16, r18, r20)
        L_0x0518:
            return
        L_0x0519:
            r0 = move-exception
            monitor-exit(r43)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96790t0.mo135065g(int, java.lang.String, java.lang.String, int, com.tencent.mm.modelcontrol.VideoTransPara, android.content.Intent):void");
    }

    /* renamed from: i */
    public final void mo135066i(boolean z) {
        int i = this.f283540h == 1 ? z ? 217 : 218 : z ? 231 : 232;
        Log.m105918d("MicroMsg.ImportMultiVideo", "report video thumb reportId : " + i + " had Thumb : " + z + " importType : " + this.f283540h);
        C115669n.INSTANCE.idkeyStat(106, (long) i, 1, false);
    }

    public void run() {
        List<String> list = this.f283537e;
        if (list == null || list.size() <= 0) {
            mo135063d(this.f283536d, this.f283538f);
        } else {
            for (int i = 0; i < this.f283537e.size() && !this.f283549t; i++) {
                Log.m105925i("MicroMsg.ImportMultiVideo", "start to import %s", this.f283537e.get(i));
                Intent intent = new Intent();
                intent.setData(Uri.parse("file://" + this.f283537e.get(i)));
                Intent intent2 = this.f283538f;
                if (intent2 != null) {
                    intent.putExtra("ImportMsgLocalId", intent2.getLongExtra("ImportMsgLocalId", -1));
                }
                mo135063d(this.f283536d, intent);
            }
        }
        if (this.f283548s != null && !this.f283549t) {
            MMHandlerThread.postToMainThread(new C96791a());
        }
    }
}
