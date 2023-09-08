package i52;

import com.tencent.p014mm.console.C92618a;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d42.C31066c0;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p237sp.C13754y;
import tw0.C90587j;
import zt3.C119157j;

/* renamed from: i52.d */
public enum C87657d {
    INSTANCE;
    

    /* renamed from: d */
    public LinkedList<Long> f253894d;

    /* renamed from: e */
    public Map<Long, C87660b> f253895e;

    /* renamed from: f */
    public C40952u f253896f;

    /* renamed from: i52.d$a */
    public class C87658a implements C40952u {

        /* renamed from: i52.d$a$a */
        public class C87659a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87660b f253898d;

            /* renamed from: e */
            public final /* synthetic */ long f253899e;

            /* renamed from: f */
            public final /* synthetic */ String f253900f;

            public C87659a(C87660b bVar, long j, String str) {
                this.f253898d = bVar;
                this.f253899e = j;
                this.f253900f = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:223:0x050c A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:226:0x0522 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:227:0x0527 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:230:0x053e A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:231:0x0543 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:233:0x0547 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:234:0x054c A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:236:0x0550 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:237:0x0555 A[Catch:{ Exception -> 0x055e }] */
            /* JADX WARNING: Removed duplicated region for block: B:245:0x0575  */
            /* JADX WARNING: Removed duplicated region for block: B:248:0x058b  */
            /* JADX WARNING: Removed duplicated region for block: B:249:0x0590  */
            /* JADX WARNING: Removed duplicated region for block: B:252:0x05a7  */
            /* JADX WARNING: Removed duplicated region for block: B:253:0x05ac  */
            /* JADX WARNING: Removed duplicated region for block: B:255:0x05b0  */
            /* JADX WARNING: Removed duplicated region for block: B:256:0x05b5  */
            /* JADX WARNING: Removed duplicated region for block: B:258:0x05b9  */
            /* JADX WARNING: Removed duplicated region for block: B:259:0x05be  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r29 = this;
                    r1 = r29
                    i52.d$a r0 = i52.C87657d.C87658a.this
                    i52.d r0 = i52.C87657d.this
                    i52.d$b r2 = r1.f253898d
                    long r3 = r1.f253899e
                    java.lang.String r5 = r1.f253900f
                    i52.d r6 = i52.C87657d.INSTANCE
                    r0.getClass()
                    java.lang.Class<com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor> r6 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.class
                    r0 = 1
                    java.lang.Object[] r7 = new java.lang.Object[r0]
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)
                    r4 = 0
                    r7[r4] = r3
                    java.lang.String r3 = "MicroMsg.MagicPkgDownloadPkg"
                    java.lang.String r8 = "dealDownloadTask id:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
                    if (r2 != 0) goto L_0x002d
                    java.lang.String r0 = "dealDownloadTask taskInfo is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    goto L_0x05c5
                L_0x002d:
                    boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                    java.lang.String r8 = "downloadMagicPkg"
                    if (r7 == 0) goto L_0x0058
                    java.lang.String r0 = r2.f253902a
                    boolean r0 = r0.equals(r8)
                    if (r0 == 0) goto L_0x004b
                    d42.c0 r0 = r2.f253904c
                    if (r0 == 0) goto L_0x004b
                    r2 = 13
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0
                    java.lang.String r3 = "savedFilePath is nil"
                    r0.mo112588a(r2, r3)
                L_0x004b:
                    com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r5 = 1909(0x775, double:9.43E-321)
                    r7 = 13
                    r9 = 1
                    r4.mo175913w(r5, r7, r9)
                    goto L_0x05c5
                L_0x0058:
                    com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 11
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)
                    java.lang.String r9 = r2.f253902a
                    boolean r8 = r9.equals(r8)
                    if (r8 != 0) goto L_0x0085
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 14
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)
                    d42.c0 r0 = r2.f253904c
                    if (r0 == 0) goto L_0x05c5
                    r2 = 14
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0
                    java.lang.String r3 = "error task type"
                    r0.mo112588a(r2, r3)
                    goto L_0x05c5
                L_0x0085:
                    tw0.j r8 = r2.f253903b
                    r9 = 3
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    java.lang.String r11 = r8.f260278j
                    r10[r4] = r11
                    java.lang.String r11 = r8.f260274f
                    r10[r0] = r11
                    r11 = 2
                    java.lang.String r12 = r8.f260273e
                    r10[r11] = r12
                    java.lang.String r11 = "download %s success.patchId:%s, fileMd5:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r10)
                    java.lang.String r10 = r8.f260273e
                    java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)
                    boolean r10 = r10.equalsIgnoreCase(r11)
                    java.lang.String r14 = "scene"
                    r15 = 0
                    if (r10 != 0) goto L_0x010a
                    java.lang.String r0 = "pkg md5 not match"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    r12 = 1909(0x775, double:9.43E-321)
                    r3 = 22
                    r16 = 1
                    r11 = r7
                    r5 = r14
                    r10 = r15
                    r14 = r3
                    r11.mo175913w(r12, r14, r16)
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r3 = r2.f253905d
                    if (r3 == 0) goto L_0x00c8
                    java.lang.String r15 = r3.f81564d
                    r17 = r15
                    goto L_0x00ca
                L_0x00c8:
                    r17 = r10
                L_0x00ca:
                    r21 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r4 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download
                    r23 = 2
                    r24 = 10001(0x2711, float:1.4014E-41)
                    gy3.C87412m.m108594g(r4, r5)
                    di3.d r5 = di3.C86312j.m106911c(r6)
                    r16 = r5
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r16 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r16
                    if (r3 == 0) goto L_0x00e4
                    java.lang.String r15 = r3.f81571n
                    r18 = r15
                    goto L_0x00e6
                L_0x00e4:
                    r18 = r10
                L_0x00e6:
                    if (r3 == 0) goto L_0x00ed
                    java.lang.String r15 = r3.f81572o
                    r19 = r15
                    goto L_0x00ef
                L_0x00ed:
                    r19 = r10
                L_0x00ef:
                    if (r3 == 0) goto L_0x00f6
                    java.lang.String r15 = r3.f81566f
                    r20 = r15
                    goto L_0x00f8
                L_0x00f6:
                    r20 = r10
                L_0x00f8:
                    r22 = r4
                    r16.ir0(r17, r18, r19, r20, r21, r22, r23, r24)
                    d42.c0 r2 = r2.f253904c
                    if (r2 == 0) goto L_0x05c5
                    r3 = 22
                    com.tencent.mm.console.a$a r2 = (com.tencent.p014mm.console.C92618a.C80834a) r2
                    r2.mo112588a(r3, r0)
                    goto L_0x05c5
                L_0x010a:
                    r10 = r15
                    java.lang.Integer r11 = r8.f260271c     // Catch:{ Exception -> 0x0563 }
                    int r11 = r11.intValue()     // Catch:{ Exception -> 0x0563 }
                    if (r11 != r9) goto L_0x035b
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r9 = r2.f253905d     // Catch:{ Exception -> 0x0356 }
                    if (r9 == 0) goto L_0x02f6
                    java.lang.String r11 = r9.f81571n     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r12 = r8.f260274f     // Catch:{ Exception -> 0x0356 }
                    boolean r11 = r11.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0356 }
                    if (r11 != 0) goto L_0x028e
                    java.lang.String r11 = r8.f260278j     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r12 = i52.C33209f.m39989e()     // Catch:{ Exception -> 0x0356 }
                    boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0356 }
                    if (r13 == 0) goto L_0x012f
                    r15 = r10
                    goto L_0x0143
                L_0x012f:
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0356 }
                    r13.<init>()     // Catch:{ Exception -> 0x0356 }
                    r13.append(r12)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r12 = "/tmp/"
                    r13.append(r12)     // Catch:{ Exception -> 0x0356 }
                    r13.append(r11)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r15 = r13.toString()     // Catch:{ Exception -> 0x0356 }
                L_0x0143:
                    r12 = 16
                    if (r15 != 0) goto L_0x0192
                    d42.c0 r0 = r2.f253904c     // Catch:{ Exception -> 0x0563 }
                    if (r0 == 0) goto L_0x0152
                    java.lang.String r5 = "get temp path error"
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0     // Catch:{ Exception -> 0x0563 }
                    r0.mo112588a(r12, r5)     // Catch:{ Exception -> 0x0563 }
                L_0x0152:
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x0563 }
                    if (r0 == 0) goto L_0x015b
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x0563 }
                    r17 = r15
                    goto L_0x015d
                L_0x015b:
                    r17 = r10
                L_0x015d:
                    r21 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r5 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x0563 }
                    r23 = 2
                    r24 = 10008(0x2718, float:1.4024E-41)
                    gy3.C87412m.m108594g(r5, r14)     // Catch:{ Exception -> 0x0563 }
                    di3.d r7 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0563 }
                    r16 = r7
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r16 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r16     // Catch:{ Exception -> 0x0563 }
                    if (r0 == 0) goto L_0x0177
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x0563 }
                    r18 = r15
                    goto L_0x0179
                L_0x0177:
                    r18 = r10
                L_0x0179:
                    if (r0 == 0) goto L_0x0180
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x0563 }
                    r19 = r15
                    goto L_0x0182
                L_0x0180:
                    r19 = r10
                L_0x0182:
                    if (r0 == 0) goto L_0x0189
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x0563 }
                    r20 = r15
                    goto L_0x018b
                L_0x0189:
                    r20 = r10
                L_0x018b:
                    r22 = r5
                    r16.ir0(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0563 }
                    goto L_0x05c5
                L_0x0192:
                    android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r13 = r11.getPath()     // Catch:{ Exception -> 0x0356 }
                    if (r13 == 0) goto L_0x01b6
                    java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r4, r4)     // Catch:{ Exception -> 0x0563 }
                    java.lang.String r12 = r11.getPath()     // Catch:{ Exception -> 0x0563 }
                    boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0563 }
                    if (r12 != 0) goto L_0x01b6
                    android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ Exception -> 0x0563 }
                    android.net.Uri$Builder r11 = r11.path(r13)     // Catch:{ Exception -> 0x0563 }
                    android.net.Uri r11 = r11.build()     // Catch:{ Exception -> 0x0563 }
                L_0x01b6:
                    com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0356 }
                    com.tencent.mm.vfs.f0$h r13 = r12.mo177799l(r11, r10)     // Catch:{ Exception -> 0x0356 }
                    boolean r17 = r13.mo177810a()     // Catch:{ Exception -> 0x0356 }
                    if (r17 != 0) goto L_0x01c3
                    goto L_0x01cb
                L_0x01c3:
                    com.tencent.mm.vfs.FileSystem$c r10 = r13.f348991a     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r4 = r13.f348992b     // Catch:{ Exception -> 0x0356 }
                    boolean r4 = r10.mo119948x(r4)     // Catch:{ Exception -> 0x0356 }
                L_0x01cb:
                    if (r4 != 0) goto L_0x01df
                    com.tencent.mm.vfs.f0$h r4 = r12.mo177799l(r11, r13)     // Catch:{ Exception -> 0x0356 }
                    boolean r10 = r4.mo177810a()     // Catch:{ Exception -> 0x0356 }
                    if (r10 != 0) goto L_0x01d8
                    goto L_0x01df
                L_0x01d8:
                    com.tencent.mm.vfs.FileSystem$c r10 = r4.f348991a     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x0356 }
                    r10.mo119937g(r4)     // Catch:{ Exception -> 0x0356 }
                L_0x01df:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0356 }
                    r4.<init>()     // Catch:{ Exception -> 0x0356 }
                    r4.append(r15)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r10 = "/"
                    r4.append(r10)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r10 = r8.f260274f     // Catch:{ Exception -> 0x0356 }
                    r4.append(r10)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r10 = ".zip"
                    r4.append(r10)     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0356 }
                    java.lang.Class<xn.m> r10 = p271xn.C38771m.class
                    di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x0356 }
                    xn.m r10 = (p271xn.C38771m) r10     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r9 = r9.f81567g     // Catch:{ Exception -> 0x0356 }
                    java.lang.String r11 = r8.f260279k     // Catch:{ Exception -> 0x0356 }
                    int r9 = r10.mo61566no(r9, r5, r4, r11)     // Catch:{ Exception -> 0x0356 }
                    if (r9 == 0) goto L_0x028a
                    java.lang.String r8 = "merge fail ret:%d"
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0356 }
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0356 }
                    r11 = 0
                    r0[r11] = r10     // Catch:{ Exception -> 0x0356 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r0)     // Catch:{ Exception -> 0x0356 }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ Exception -> 0x0356 }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x0356 }
                    r12 = 1909(0x775, double:9.43E-321)
                    r4 = 16
                    r20 = 1
                    r11 = r7
                    r0 = 16
                    r10 = r14
                    r14 = r4
                    r16 = r20
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x0560 }
                    d42.c0 r4 = r2.f253904c     // Catch:{ Exception -> 0x0560 }
                    if (r4 == 0) goto L_0x024a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0560 }
                    r5.<init>()     // Catch:{ Exception -> 0x0560 }
                    java.lang.String r7 = "merge pkg error:"
                    r5.append(r7)     // Catch:{ Exception -> 0x0560 }
                    r5.append(r9)     // Catch:{ Exception -> 0x0560 }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0560 }
                    com.tencent.mm.console.a$a r4 = (com.tencent.p014mm.console.C92618a.C80834a) r4     // Catch:{ Exception -> 0x0560 }
                    r4.mo112588a(r0, r5)     // Catch:{ Exception -> 0x0560 }
                L_0x024a:
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x0253
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x0560 }
                    r21 = r15
                    goto L_0x0255
                L_0x0253:
                    r21 = 0
                L_0x0255:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r4 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x0560 }
                    r27 = 2
                    r28 = 10002(0x2712, float:1.4016E-41)
                    gy3.C87412m.m108594g(r4, r10)     // Catch:{ Exception -> 0x0560 }
                    di3.d r5 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0560 }
                    r20 = r5
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x026f
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x0560 }
                    r22 = r15
                    goto L_0x0271
                L_0x026f:
                    r22 = 0
                L_0x0271:
                    if (r0 == 0) goto L_0x0278
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x0560 }
                    r23 = r15
                    goto L_0x027a
                L_0x0278:
                    r23 = 0
                L_0x027a:
                    if (r0 == 0) goto L_0x0281
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x0560 }
                    r24 = r15
                    goto L_0x0283
                L_0x0281:
                    r24 = 0
                L_0x0283:
                    r26 = r4
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0560 }
                    goto L_0x05c5
                L_0x028a:
                    r10 = r14
                    r5 = r4
                    goto L_0x035c
                L_0x028e:
                    r10 = r14
                    java.lang.String r4 = "current patchid:%s is equal,no need change"
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0560 }
                    java.lang.String r8 = r8.f260274f     // Catch:{ Exception -> 0x0560 }
                    r9 = 0
                    r0[r9] = r8     // Catch:{ Exception -> 0x0560 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)     // Catch:{ Exception -> 0x0560 }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x0560 }
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 15
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x0560 }
                    d42.c0 r0 = r2.f253904c     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x02b6
                    r4 = 15
                    java.lang.String r5 = "pkg existed"
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0     // Catch:{ Exception -> 0x0560 }
                    r0.mo112588a(r4, r5)     // Catch:{ Exception -> 0x0560 }
                L_0x02b6:
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x02bf
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x0560 }
                    r21 = r15
                    goto L_0x02c1
                L_0x02bf:
                    r21 = 0
                L_0x02c1:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r4 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x0560 }
                    r27 = 2
                    r28 = 10003(0x2713, float:1.4017E-41)
                    gy3.C87412m.m108594g(r4, r10)     // Catch:{ Exception -> 0x0560 }
                    di3.d r5 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0560 }
                    r20 = r5
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x02db
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x0560 }
                    r22 = r15
                    goto L_0x02dd
                L_0x02db:
                    r22 = 0
                L_0x02dd:
                    if (r0 == 0) goto L_0x02e4
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x0560 }
                    r23 = r15
                    goto L_0x02e6
                L_0x02e4:
                    r23 = 0
                L_0x02e6:
                    if (r0 == 0) goto L_0x02ed
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x0560 }
                    r24 = r15
                    goto L_0x02ef
                L_0x02ed:
                    r24 = 0
                L_0x02ef:
                    r26 = r4
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0560 }
                    goto L_0x05c5
                L_0x02f6:
                    r10 = r14
                    java.lang.String r0 = "local pkg is nil,can not patch"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x0560 }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x0560 }
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 21
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x0560 }
                    d42.c0 r0 = r2.f253904c     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x0316
                    r4 = 21
                    java.lang.String r5 = "local pkg not existed"
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0     // Catch:{ Exception -> 0x0560 }
                    r0.mo112588a(r4, r5)     // Catch:{ Exception -> 0x0560 }
                L_0x0316:
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x031f
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x0560 }
                    r21 = r15
                    goto L_0x0321
                L_0x031f:
                    r21 = 0
                L_0x0321:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r4 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x0560 }
                    r27 = 2
                    r28 = 10004(0x2714, float:1.4019E-41)
                    gy3.C87412m.m108594g(r4, r10)     // Catch:{ Exception -> 0x0560 }
                    di3.d r5 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0560 }
                    r20 = r5
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x033b
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x0560 }
                    r22 = r15
                    goto L_0x033d
                L_0x033b:
                    r22 = 0
                L_0x033d:
                    if (r0 == 0) goto L_0x0344
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x0560 }
                    r23 = r15
                    goto L_0x0346
                L_0x0344:
                    r23 = 0
                L_0x0346:
                    if (r0 == 0) goto L_0x034d
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x0560 }
                    r24 = r15
                    goto L_0x034f
                L_0x034d:
                    r24 = 0
                L_0x034f:
                    r26 = r4
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0560 }
                    goto L_0x05c5
                L_0x0356:
                    r0 = move-exception
                    r10 = r14
                L_0x0358:
                    r4 = 0
                    goto L_0x0566
                L_0x035b:
                    r10 = r14
                L_0x035c:
                    java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)     // Catch:{ Exception -> 0x0560 }
                    java.lang.String r9 = r8.f260279k     // Catch:{ Exception -> 0x0560 }
                    boolean r4 = r4.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0560 }
                    if (r4 != 0) goto L_0x03ce
                    java.lang.String r4 = "file md5 not match:%s"
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0560 }
                    java.lang.String r8 = r8.f260279k     // Catch:{ Exception -> 0x0560 }
                    r9 = 0
                    r0[r9] = r8     // Catch:{ Exception -> 0x0560 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)     // Catch:{ Exception -> 0x0560 }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x0560 }
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 23
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x0560 }
                    d42.c0 r0 = r2.f253904c     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x038e
                    r4 = 23
                    java.lang.String r5 = "file md5 not match"
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0     // Catch:{ Exception -> 0x0560 }
                    r0.mo112588a(r4, r5)     // Catch:{ Exception -> 0x0560 }
                L_0x038e:
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x0397
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x0560 }
                    r21 = r15
                    goto L_0x0399
                L_0x0397:
                    r21 = 0
                L_0x0399:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r4 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x0560 }
                    r27 = 2
                    r28 = 10005(0x2715, float:1.402E-41)
                    gy3.C87412m.m108594g(r4, r10)     // Catch:{ Exception -> 0x0560 }
                    di3.d r5 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0560 }
                    r20 = r5
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x0560 }
                    if (r0 == 0) goto L_0x03b3
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x0560 }
                    r22 = r15
                    goto L_0x03b5
                L_0x03b3:
                    r22 = 0
                L_0x03b5:
                    if (r0 == 0) goto L_0x03bc
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x0560 }
                    r23 = r15
                    goto L_0x03be
                L_0x03bc:
                    r23 = 0
                L_0x03be:
                    if (r0 == 0) goto L_0x03c5
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x0560 }
                    r24 = r15
                    goto L_0x03c7
                L_0x03c5:
                    r24 = 0
                L_0x03c7:
                    r26 = r4
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0560 }
                    goto L_0x05c5
                L_0x03ce:
                    java.lang.String r0 = r8.f260278j     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r4 = r8.f260274f     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r0 = i52.C33209f.m39987c(r0, r4)     // Catch:{ Exception -> 0x04fb }
                    android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r4.getPath()     // Catch:{ Exception -> 0x04fb }
                    if (r9 == 0) goto L_0x03fb
                    r11 = 0
                    java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r11, r11)     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r11 = r4.getPath()     // Catch:{ Exception -> 0x04fb }
                    boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x04fb }
                    if (r11 != 0) goto L_0x03fb
                    android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x04fb }
                    android.net.Uri$Builder r4 = r4.path(r9)     // Catch:{ Exception -> 0x04fb }
                    android.net.Uri r4 = r4.build()     // Catch:{ Exception -> 0x04fb }
                L_0x03fb:
                    com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x04fb }
                    r11 = 0
                    com.tencent.mm.vfs.f0$h r12 = r9.mo177799l(r4, r11)     // Catch:{ Exception -> 0x04f8 }
                    boolean r11 = r12.mo177810a()     // Catch:{ Exception -> 0x04fb }
                    if (r11 != 0) goto L_0x040a
                    r11 = 0
                    goto L_0x0412
                L_0x040a:
                    com.tencent.mm.vfs.FileSystem$c r11 = r12.f348991a     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r13 = r12.f348992b     // Catch:{ Exception -> 0x04fb }
                    boolean r11 = r11.mo119948x(r13)     // Catch:{ Exception -> 0x04fb }
                L_0x0412:
                    if (r11 != 0) goto L_0x0426
                    com.tencent.mm.vfs.f0$h r4 = r9.mo177799l(r4, r12)     // Catch:{ Exception -> 0x04fb }
                    boolean r9 = r4.mo177810a()     // Catch:{ Exception -> 0x04fb }
                    if (r9 != 0) goto L_0x041f
                    goto L_0x0426
                L_0x041f:
                    com.tencent.mm.vfs.FileSystem$c r9 = r4.f348991a     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x04fb }
                    r9.mo119937g(r4)     // Catch:{ Exception -> 0x04fb }
                L_0x0426:
                    java.lang.String r4 = r8.f260278j     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260274f     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r4 = i52.C33209f.m39990f(r4, r9)     // Catch:{ Exception -> 0x04fb }
                    com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r4)     // Catch:{ Exception -> 0x04fb }
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r5 = new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo     // Catch:{ Exception -> 0x04fb }
                    r5.<init>()     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260278j     // Catch:{ Exception -> 0x04fb }
                    r5.f81564d = r9     // Catch:{ Exception -> 0x04fb }
                    r5.f81567g = r4     // Catch:{ Exception -> 0x04fb }
                    r5.f81568h = r0     // Catch:{ Exception -> 0x04fb }
                    java.lang.Integer r9 = r8.f260271c     // Catch:{ Exception -> 0x04fb }
                    int r9 = r9.intValue()     // Catch:{ Exception -> 0x04fb }
                    r5.f81570j = r9     // Catch:{ Exception -> 0x04fb }
                    long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04fb }
                    r13 = 1000(0x3e8, double:4.94E-321)
                    long r11 = r11 / r13
                    r5.f81574q = r11     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260274f     // Catch:{ Exception -> 0x04fb }
                    r5.f81571n = r9     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260279k     // Catch:{ Exception -> 0x04fb }
                    r5.f81566f = r9     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260280l     // Catch:{ Exception -> 0x04fb }
                    r5.f81572o = r9     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260281m     // Catch:{ Exception -> 0x04fb }
                    r5.f81569i = r9     // Catch:{ Exception -> 0x04fb }
                    boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x04fb }
                    if (r9 == 0) goto L_0x0479
                    r9 = 0
                    java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r9)     // Catch:{ Exception -> 0x04fb }
                    com.tencent.p014mm.vfs.C86013q1.m106436R(r4, r0)     // Catch:{ Exception -> 0x04fb }
                    q52.o r0 = q52.C35766o.f95534a     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r4 = r5.f81568h     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r0 = r0.mo60387a(r4)     // Catch:{ Exception -> 0x04fb }
                    r5.f81573p = r0     // Catch:{ Exception -> 0x04fb }
                    r4 = 0
                    goto L_0x048b
                L_0x0479:
                    java.lang.String r0 = r8.f260278j     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r9 = r8.f260281m     // Catch:{ Exception -> 0x04fb }
                    java.lang.String r0 = i52.C33209f.m39986b(r0, r9)     // Catch:{ Exception -> 0x04fb }
                    com.tencent.p014mm.vfs.C86013q1.m106463x(r4, r0)     // Catch:{ Exception -> 0x04fb }
                    r5.f81567g = r0     // Catch:{ Exception -> 0x04fb }
                    r4 = 0
                    r5.f81568h = r4     // Catch:{ Exception -> 0x04f6 }
                    r5.f81573p = r0     // Catch:{ Exception -> 0x04f6 }
                L_0x048b:
                    i52.e r0 = i52.C87661e.m109006d()     // Catch:{ Exception -> 0x04f6 }
                    java.lang.String r9 = r8.f260278j     // Catch:{ Exception -> 0x04f6 }
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r0.mo122082e(r9)     // Catch:{ Exception -> 0x04f6 }
                    i52.e r9 = i52.C87661e.m109006d()     // Catch:{ Exception -> 0x04f6 }
                    r9.mo122086i(r5)     // Catch:{ Exception -> 0x04f6 }
                    i52.c r9 = i52.C33208c.f90103a     // Catch:{ Exception -> 0x04f6 }
                    java.lang.String r8 = r8.f260278j     // Catch:{ Exception -> 0x04f6 }
                    r9.mo59019a(r8, r0)     // Catch:{ Exception -> 0x04f6 }
                    d42.c0 r0 = r2.f253904c     // Catch:{ Exception -> 0x04f6 }
                    if (r0 == 0) goto L_0x04ac
                    com.tencent.mm.console.a$a r0 = (com.tencent.p014mm.console.C92618a.C80834a) r0     // Catch:{ Exception -> 0x04f6 }
                    r0.mo112589b(r5)     // Catch:{ Exception -> 0x04f6 }
                L_0x04ac:
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 19
                    r16 = 1
                    r11 = r7
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x04f6 }
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x04f6 }
                    if (r0 == 0) goto L_0x04bf
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x04f6 }
                    r21 = r15
                    goto L_0x04c1
                L_0x04bf:
                    r21 = r4
                L_0x04c1:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r5 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x04f6 }
                    r27 = 1
                    r28 = 0
                    gy3.C87412m.m108594g(r5, r10)     // Catch:{ Exception -> 0x04f6 }
                    di3.d r7 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x04f6 }
                    r20 = r7
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x04f6 }
                    if (r0 == 0) goto L_0x04db
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x04f6 }
                    r22 = r15
                    goto L_0x04dd
                L_0x04db:
                    r22 = r4
                L_0x04dd:
                    if (r0 == 0) goto L_0x04e4
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x04f6 }
                    r23 = r15
                    goto L_0x04e6
                L_0x04e4:
                    r23 = r4
                L_0x04e6:
                    if (r0 == 0) goto L_0x04ed
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x04f6 }
                    r24 = r15
                    goto L_0x04ef
                L_0x04ed:
                    r24 = r4
                L_0x04ef:
                    r26 = r5
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x04f6 }
                    goto L_0x05c5
                L_0x04f6:
                    r0 = move-exception
                    goto L_0x04fd
                L_0x04f8:
                    r0 = move-exception
                    r4 = r11
                    goto L_0x04fd
                L_0x04fb:
                    r0 = move-exception
                    r4 = 0
                L_0x04fd:
                    com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x055e }
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 18
                    r16 = 1
                    r11.mo175913w(r12, r14, r16)     // Catch:{ Exception -> 0x055e }
                    d42.c0 r5 = r2.f253904c     // Catch:{ Exception -> 0x055e }
                    if (r5 == 0) goto L_0x0516
                    r7 = 18
                    java.lang.String r8 = "update pkg exception"
                    com.tencent.mm.console.a$a r5 = (com.tencent.p014mm.console.C92618a.C80834a) r5     // Catch:{ Exception -> 0x055e }
                    r5.mo112588a(r7, r8)     // Catch:{ Exception -> 0x055e }
                L_0x0516:
                    java.lang.String r5 = "MagicPkgDownloadPkg:update"
                    r7 = 0
                    java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x055e }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r8)     // Catch:{ Exception -> 0x055e }
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d     // Catch:{ Exception -> 0x055e }
                    if (r0 == 0) goto L_0x0527
                    java.lang.String r15 = r0.f81564d     // Catch:{ Exception -> 0x055e }
                    r21 = r15
                    goto L_0x0529
                L_0x0527:
                    r21 = r4
                L_0x0529:
                    r25 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r5 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download     // Catch:{ Exception -> 0x055e }
                    r27 = 2
                    r28 = 10006(0x2716, float:1.4021E-41)
                    gy3.C87412m.m108594g(r5, r10)     // Catch:{ Exception -> 0x055e }
                    di3.d r7 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x055e }
                    r20 = r7
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r20 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r20     // Catch:{ Exception -> 0x055e }
                    if (r0 == 0) goto L_0x0543
                    java.lang.String r15 = r0.f81571n     // Catch:{ Exception -> 0x055e }
                    r22 = r15
                    goto L_0x0545
                L_0x0543:
                    r22 = r4
                L_0x0545:
                    if (r0 == 0) goto L_0x054c
                    java.lang.String r15 = r0.f81572o     // Catch:{ Exception -> 0x055e }
                    r23 = r15
                    goto L_0x054e
                L_0x054c:
                    r23 = r4
                L_0x054e:
                    if (r0 == 0) goto L_0x0555
                    java.lang.String r15 = r0.f81566f     // Catch:{ Exception -> 0x055e }
                    r24 = r15
                    goto L_0x0557
                L_0x0555:
                    r24 = r4
                L_0x0557:
                    r26 = r5
                    r20.ir0(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x055e }
                    goto L_0x05c5
                L_0x055e:
                    r0 = move-exception
                    goto L_0x0566
                L_0x0560:
                    r0 = move-exception
                    goto L_0x0358
                L_0x0563:
                    r0 = move-exception
                    r4 = r10
                    r10 = r14
                L_0x0566:
                    com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r12 = 1909(0x775, double:9.43E-321)
                    r14 = 17
                    r16 = 1
                    r11.mo175913w(r12, r14, r16)
                    d42.c0 r5 = r2.f253904c
                    if (r5 == 0) goto L_0x057f
                    r7 = 17
                    com.tencent.mm.console.a$a r5 = (com.tencent.p014mm.console.C92618a.C80834a) r5
                    java.lang.String r8 = "unzip pkg exception"
                    r5.mo112588a(r7, r8)
                L_0x057f:
                    r5 = 0
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    java.lang.String r7 = "MagicPkgDownloadPkg:unzip"
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r5)
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r2.f253905d
                    if (r0 == 0) goto L_0x0590
                    java.lang.String r15 = r0.f81564d
                    r17 = r15
                    goto L_0x0592
                L_0x0590:
                    r17 = r4
                L_0x0592:
                    r21 = 0
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene r2 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.MagicPkgScene.Download
                    r23 = 2
                    r24 = 10007(0x2717, float:1.4023E-41)
                    gy3.C87412m.m108594g(r2, r10)
                    di3.d r3 = di3.C86312j.m106911c(r6)
                    r16 = r3
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r16 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r16
                    if (r0 == 0) goto L_0x05ac
                    java.lang.String r15 = r0.f81571n
                    r18 = r15
                    goto L_0x05ae
                L_0x05ac:
                    r18 = r4
                L_0x05ae:
                    if (r0 == 0) goto L_0x05b5
                    java.lang.String r15 = r0.f81572o
                    r19 = r15
                    goto L_0x05b7
                L_0x05b5:
                    r19 = r4
                L_0x05b7:
                    if (r0 == 0) goto L_0x05be
                    java.lang.String r15 = r0.f81566f
                    r20 = r15
                    goto L_0x05c0
                L_0x05be:
                    r20 = r4
                L_0x05c0:
                    r22 = r2
                    r16.ir0(r17, r18, r19, r20, r21, r22, r23, r24)
                L_0x05c5:
                    i52.d$a r0 = i52.C87657d.C87658a.this
                    i52.d r0 = i52.C87657d.this
                    java.util.Map<java.lang.Long, i52.d$b> r0 = r0.f253895e
                    long r2 = r1.f253899e
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    r0.remove(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i52.C87657d.C87658a.C87659a.run():void");
            }
        }

        public C87658a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            C87657d.this.f253894d.remove(Long.valueOf(j));
            ((ConcurrentHashMap) C87657d.this.f253895e).remove(Long.valueOf(j));
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
        }

        /* renamed from: S */
        public void mo1800S(long j) {
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            if (C87657d.this.f253894d.contains(Long.valueOf(j))) {
                Log.m105921e("MicroMsg.MagicPkgDownloadPkg", "down fail, id:%d,errCode:%d", Long.valueOf(j), Integer.valueOf(i));
                C115669n.INSTANCE.mo175913w(1909, 12, 1);
                C87660b bVar = (C87660b) ((ConcurrentHashMap) C87657d.this.f253895e).get(Long.valueOf(j));
                C31066c0 c0Var = bVar.f253904c;
                if (c0Var != null) {
                    ((C92618a.C80834a) c0Var).mo112588a(12, "download fail");
                }
                WxaMagicPkgInfo wxaMagicPkgInfo = bVar.f253905d;
                String str = null;
                String str2 = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f81564d : null;
                IMagicBrushMonitor.MagicPkgScene magicPkgScene = IMagicBrushMonitor.MagicPkgScene.Download;
                C87412m.m108594g(magicPkgScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                IMagicBrushMonitor iMagicBrushMonitor = (IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class);
                String str3 = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f81571n : null;
                String str4 = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f81572o : null;
                if (wxaMagicPkgInfo != null) {
                    str = wxaMagicPkgInfo.f81566f;
                }
                iMagicBrushMonitor.ir0(str2, str3, str4, str, 0, magicPkgScene, 2, 10000);
                C87657d.this.f253894d.remove(Long.valueOf(j));
                ((ConcurrentHashMap) C87657d.this.f253895e).remove(Long.valueOf(j));
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            if (C87657d.this.f253894d.contains(Long.valueOf(j))) {
                Log.m105925i("MicroMsg.MagicPkgDownloadPkg", "onTaskStarted id:%s savedFilePath:%s", Long.valueOf(j), str);
            }
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            if (C87657d.this.f253894d.contains(Long.valueOf(j))) {
                Log.m105925i("MicroMsg.MagicPkgDownloadPkg", "onTaskFinished id:%s savedFilePath:%s", Long.valueOf(j), str);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C87657d.this.f253895e;
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.mo183876g(new C87659a((C87660b) concurrentHashMap.get(Long.valueOf(j)), j, str), "MagicPkgDownloadPkg");
                C87657d.this.f253894d.remove(Long.valueOf(j));
            }
        }
    }

    /* renamed from: i52.d$b */
    public class C87660b {

        /* renamed from: a */
        public String f253902a;

        /* renamed from: b */
        public C90587j f253903b;

        /* renamed from: c */
        public C31066c0 f253904c;

        /* renamed from: d */
        public WxaMagicPkgInfo f253905d;

        public C87660b(C87657d dVar, String str, C90587j jVar, WxaMagicPkgInfo wxaMagicPkgInfo, C31066c0 c0Var) {
            this.f253902a = str;
            this.f253903b = jVar;
            this.f253905d = wxaMagicPkgInfo;
            this.f253904c = c0Var;
        }
    }

    /* renamed from: a */
    public void mo122077a(C90587j jVar, WxaMagicPkgInfo wxaMagicPkgInfo, String str, C31066c0 c0Var) {
        C90587j jVar2 = jVar;
        WxaMagicPkgInfo wxaMagicPkgInfo2 = wxaMagicPkgInfo;
        Class cls = IMagicBrushMonitor.class;
        C115669n.INSTANCE.mo175913w(1909, 10, 1);
        WxaMagicPkgInfo wxaMagicPkgInfo3 = new WxaMagicPkgInfo();
        if (wxaMagicPkgInfo2 == null) {
            wxaMagicPkgInfo3.f81564d = str;
            wxaMagicPkgInfo3.f81571n = "default";
            IMagicBrushMonitor.MagicPkgScene magicPkgScene = IMagicBrushMonitor.MagicPkgScene.Download;
            C87412m.m108594g(magicPkgScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str, wxaMagicPkgInfo3.f81571n, wxaMagicPkgInfo3.f81572o, wxaMagicPkgInfo3.f81566f, 0, magicPkgScene, 0, 0);
        } else {
            String str2 = wxaMagicPkgInfo2.f81564d;
            IMagicBrushMonitor.MagicPkgScene magicPkgScene2 = IMagicBrushMonitor.MagicPkgScene.Download;
            C87412m.m108594g(magicPkgScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            ((IMagicBrushMonitor) C86312j.m106911c(cls)).ir0(str2, wxaMagicPkgInfo2.f81571n, wxaMagicPkgInfo2.f81572o, wxaMagicPkgInfo2.f81566f, 0, magicPkgScene2, 0, 0);
        }
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110176a = jVar2.f260272d;
        nVar.f110179d = jVar2.f260273e;
        nVar.f110181f = 2;
        nVar.f110185j = false;
        long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
        ((ConcurrentHashMap) this.f253895e).put(Long.valueOf(b), new C87660b(this, "downloadMagicPkg", jVar, wxaMagicPkgInfo2 != null ? wxaMagicPkgInfo2 : wxaMagicPkgInfo3, c0Var));
        this.f253894d.add(Long.valueOf(b));
        Log.m105925i("MicroMsg.MagicPkgDownloadPkg", "downloadMagicPkg:taskId%s", Long.valueOf(b));
    }
}
