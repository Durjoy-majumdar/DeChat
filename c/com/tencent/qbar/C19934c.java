package com.tencent.qbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.QbarNative;
import di3.C86312j;
import gt3.C20839a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p200lx.C21473d0;
import p200lx.C99712h0;
import qs3.C22126b;
import rx3.C36570n;
import sk2.C101643c;
import vl2.C37756o;
import wl2.C15513c;
import wl2.C15514d;
import wl2.C15516e;
import wl2.C15519h;
import wl2.C15520i;

/* renamed from: com.tencent.qbar.c */
public class C19934c implements C99712h0 {

    /* renamed from: h */
    public static C19934c f56868h = new C19934c();

    /* renamed from: i */
    public static C15520i f56869i = null;

    /* renamed from: a */
    public Map<Long, String> f56870a = new HashMap();

    /* renamed from: b */
    public Map<Long, C99712h0.C99713a> f56871b = new HashMap();

    /* renamed from: c */
    public Map<String, List<Long>> f56872c = new HashMap();

    /* renamed from: d */
    public Object f56873d = new Object();

    /* renamed from: e */
    public C19937e f56874e = new C19937e("WxFileDecodeQueue");

    /* renamed from: f */
    public String f56875f = "";

    /* renamed from: g */
    public ExecutorService f56876g = Executors.newSingleThreadExecutor();

    /* renamed from: com.tencent.qbar.c$a */
    public class C19935a implements Runnable {

        /* renamed from: d */
        public String f56877d;

        /* renamed from: e */
        public Bitmap f56878e;

        /* renamed from: f */
        public QbarNative.QbarAiModelParam f56879f;

        /* renamed from: g */
        public int[] f56880g = {0};

        /* renamed from: h */
        public C99712h0.C99714b f56881h;

        public C19935a(String str, Bitmap bitmap, QbarNative.QbarAiModelParam qbarAiModelParam, int[] iArr, C99712h0.C99714b bVar) {
            this.f56877d = str;
            this.f56878e = bitmap;
            this.f56879f = qbarAiModelParam;
            if (iArr != null && iArr.length > 0) {
                this.f56880g = iArr;
            }
            this.f56881h = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0308, code lost:
            r9 = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01d3 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x030a A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0162  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x01c7  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01f1 A[LOOP:1: B:48:0x01eb->B:50:0x01f1, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x026f  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x02cc  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x02cf  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x02fe  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x034d  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0350  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r31 = this;
                r1 = r31
                android.graphics.Bitmap r0 = r1.f56878e
                if (r0 == 0) goto L_0x0016
                boolean r0 = r0.isRecycled()
                if (r0 != 0) goto L_0x0016
                java.lang.String r0 = "WxFileDecodeQueue"
                java.lang.String r2 = "decodeFile use bitmap"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                android.graphics.Bitmap r0 = r1.f56878e
                goto L_0x001e
            L_0x0016:
                java.lang.String r0 = r1.f56877d
                lx.h0$b r2 = r1.f56881h
                android.graphics.Bitmap r0 = com.tencent.qbar.C19934c.m21737c(r0, r2)
            L_0x001e:
                com.tencent.qbar.c r2 = com.tencent.qbar.C19934c.this
                com.tencent.qbar.e r10 = r2.f56874e
                monitor-enter(r10)
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.c r2 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.e r2 = r2.f56874e     // Catch:{ all -> 0x0412 }
                boolean r3 = r2.f59753c     // Catch:{ all -> 0x0412 }
                r13 = 1
                if (r3 != 0) goto L_0x0039
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.QbarNative$QbarAiModelParam r4 = r1.f56879f     // Catch:{ all -> 0x0412 }
                r2.mo33089f(r3, r13, r4)     // Catch:{ all -> 0x0412 }
            L_0x0039:
                com.tencent.qbar.c r2 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.e r2 = r2.f56874e     // Catch:{ all -> 0x0412 }
                boolean r3 = r2.f59753c     // Catch:{ all -> 0x0412 }
                if (r3 == 0) goto L_0x0046
                int[] r3 = r1.f56880g     // Catch:{ all -> 0x0412 }
                r2.mo33091h(r3)     // Catch:{ all -> 0x0412 }
            L_0x0046:
                lx.h0$c r14 = new lx.h0$c     // Catch:{ all -> 0x0412 }
                r14.<init>()     // Catch:{ all -> 0x0412 }
                if (r0 == 0) goto L_0x0374
                java.lang.String r2 = "WxFileDecodeQueue"
                java.lang.String r3 = "decodeFile image size: %d, %d"
                r15 = 2
                java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x0412 }
                int r5 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0412 }
                r9 = 0
                r4[r9] = r5     // Catch:{ all -> 0x0412 }
                int r5 = r0.getHeight()     // Catch:{ all -> 0x0412 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0412 }
                r4[r13] = r5     // Catch:{ all -> 0x0412 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x0412 }
                int r2 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                int r3 = r0.getHeight()     // Catch:{ all -> 0x0412 }
                int r2 = r2 * r3
                int[] r8 = new int[r2]     // Catch:{ all -> 0x0412 }
                r4 = 0
                int r5 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                r6 = 0
                r7 = 0
                int r16 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                int r17 = r0.getHeight()     // Catch:{ all -> 0x0412 }
                r2 = r0
                r3 = r8
                r18 = r8
                r8 = r16
                r15 = 0
                r9 = r17
                r2.getPixels(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0412 }
                eb0.v0 r2 = eb0.C86493v0.m107224d()     // Catch:{ all -> 0x0412 }
                java.lang.String r3 = "basescanui@datacenter"
                eb0.v0$c r2 = r2.mo120948e(r3)     // Catch:{ all -> 0x0412 }
                if (r2 == 0) goto L_0x00f5
                java.lang.String r4 = "key_basescanui_screen_position"
                boolean r4 = r2.mo120957d(r4, r15)     // Catch:{ all -> 0x0412 }
                r5 = 0
                if (r4 == 0) goto L_0x00ce
                android.graphics.PointF r4 = new android.graphics.PointF     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = "key_basescanui_screen_x"
                java.lang.Float r7 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0412 }
                java.lang.Object r6 = r2.mo120956c(r6, r7)     // Catch:{ all -> 0x0412 }
                java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x0412 }
                float r6 = r6.floatValue()     // Catch:{ all -> 0x0412 }
                java.lang.String r7 = "key_basescanui_screen_y"
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0412 }
                java.lang.Object r2 = r2.mo120956c(r7, r5)     // Catch:{ all -> 0x0412 }
                java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x0412 }
                float r2 = r2.floatValue()     // Catch:{ all -> 0x0412 }
                r4.<init>(r6, r2)     // Catch:{ all -> 0x0412 }
                goto L_0x00f6
            L_0x00ce:
                android.graphics.PointF r4 = new android.graphics.PointF     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = "key_basescanui_touch_normalize_x"
                java.lang.Float r7 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0412 }
                java.lang.Object r6 = r2.mo120956c(r6, r7)     // Catch:{ all -> 0x0412 }
                java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x0412 }
                float r6 = r6.floatValue()     // Catch:{ all -> 0x0412 }
                java.lang.String r7 = "key_basescanui_touch_normalize_y"
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0412 }
                java.lang.Object r2 = r2.mo120956c(r7, r5)     // Catch:{ all -> 0x0412 }
                java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x0412 }
                float r2 = r2.floatValue()     // Catch:{ all -> 0x0412 }
                r4.<init>(r6, r2)     // Catch:{ all -> 0x0412 }
                r9 = 1
                goto L_0x00f7
            L_0x00f5:
                r4 = 0
            L_0x00f6:
                r9 = 0
            L_0x00f7:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0412 }
                r2.<init>()     // Catch:{ all -> 0x0412 }
                r14.f292252b = r2     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0412 }
                r2.<init>()     // Catch:{ all -> 0x0412 }
                r14.f292253c = r2     // Catch:{ all -> 0x0412 }
                android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x0412 }
                int r5 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                int r6 = r0.getHeight()     // Catch:{ all -> 0x0412 }
                r2.<init>(r5, r6)     // Catch:{ all -> 0x0412 }
                r14.f292254d = r2     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.c r5 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.e r5 = r5.f56874e     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.QbarNative$QBarPoint> r6 = r14.f292252b     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r7 = r14.f292253c     // Catch:{ all -> 0x0412 }
                r22 = 1
                r16 = r5
                r17 = r18
                r18 = r2
                r19 = r4
                r20 = r6
                r21 = r7
                java.util.List r2 = r16.mo27323i(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0412 }
                r14.f292251a = r2     // Catch:{ all -> 0x0412 }
                lx.h0$b r2 = r1.f56881h     // Catch:{ all -> 0x0412 }
                if (r2 == 0) goto L_0x0137
                int r2 = r2.f292250b     // Catch:{ all -> 0x0412 }
                goto L_0x0138
            L_0x0137:
                r2 = 0
            L_0x0138:
                r14.f292255e = r2     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.c r2 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.e r2 = r2.f56874e     // Catch:{ all -> 0x0412 }
                java.lang.String r2 = r2.mo27324j()     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r5 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                r5.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0412 }
                r6[r15] = r2     // Catch:{ all -> 0x0412 }
                java.lang.String r7 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "setCallSnapShot: %s,"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)     // Catch:{ all -> 0x0412 }
                r5.f56840F = r2     // Catch:{ all -> 0x0412 }
                java.lang.String r5 = "WxFileDecodeQueue"
                java.lang.String r6 = "alvinluo decodeFile get %d decode results, isFingerPositionNormalize: %b, finger: %s"
                r7 = 3
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r3 = r14.f292251a     // Catch:{ all -> 0x0412 }
                if (r3 != 0) goto L_0x0162
                r3 = 0
                goto L_0x0168
            L_0x0162:
                java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0412 }
                int r3 = r3.size()     // Catch:{ all -> 0x0412 }
            L_0x0168:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0412 }
                r8[r15] = r3     // Catch:{ all -> 0x0412 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0412 }
                r8[r13] = r3     // Catch:{ all -> 0x0412 }
                r3 = 2
                r8[r3] = r4     // Catch:{ all -> 0x0412 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)     // Catch:{ all -> 0x0412 }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0412 }
                long r3 = r3 - r11
                int r4 = (int) r3     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r3 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0412 }
                int r6 = r3.f56844c     // Catch:{ all -> 0x0412 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0412 }
                r5[r15] = r6     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "addScanFrame, current scan frame: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r5)     // Catch:{ all -> 0x0412 }
                int r5 = r3.f56844c     // Catch:{ all -> 0x0412 }
                int r5 = r5 + r13
                r3.f56844c = r5     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r3 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                long r4 = (long) r4     // Catch:{ all -> 0x0412 }
                r3.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0412 }
                java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0412 }
                r6[r15] = r8     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "MicroMsg.QBarEngineReporter"
                java.lang.String r9 = "addScanTime: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)     // Catch:{ all -> 0x0412 }
                long r8 = r3.f56842a     // Catch:{ all -> 0x0412 }
                long r8 = r8 + r4
                r3.f56842a = r8     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r3 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                int r6 = r0.getWidth()     // Catch:{ all -> 0x0412 }
                int r0 = r0.getHeight()     // Catch:{ all -> 0x0412 }
                r3.mo27312e(r6, r0)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r0 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                int[] r3 = r1.f56880g     // Catch:{ all -> 0x0412 }
                r9 = 0
            L_0x01c4:
                int r6 = r3.length     // Catch:{ all -> 0x0412 }
                if (r9 >= r6) goto L_0x01d3
                r6 = r3[r9]     // Catch:{ all -> 0x0412 }
                if (r6 == r7) goto L_0x01d1
                if (r6 != 0) goto L_0x01ce
                goto L_0x01d1
            L_0x01ce:
                int r9 = r9 + 1
                goto L_0x01c4
            L_0x01d1:
                r9 = 1
                goto L_0x01d4
            L_0x01d3:
                r9 = 0
            L_0x01d4:
                r0.f56864w = r9     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r0 = r14.f292251a     // Catch:{ all -> 0x0412 }
                r3 = 4
                if (r0 == 0) goto L_0x02ba
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0412 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0412 }
                if (r0 != 0) goto L_0x02ba
                java.util.List<com.tencent.qbar.a$a> r0 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0412 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0412 }
            L_0x01eb:
                boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0412 }
                if (r6 == 0) goto L_0x021a
                java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "WxFileDecodeQueue"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0412 }
                r9.<init>()     // Catch:{ all -> 0x0412 }
                java.lang.String r11 = "decodeFile result "
                r9.append(r11)     // Catch:{ all -> 0x0412 }
                java.lang.String r11 = r6.f56828e     // Catch:{ all -> 0x0412 }
                r9.append(r11)     // Catch:{ all -> 0x0412 }
                java.lang.String r11 = ","
                r9.append(r11)     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = r6.f56829f     // Catch:{ all -> 0x0412 }
                r9.append(r6)     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0412 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ all -> 0x0412 }
                goto L_0x01eb
            L_0x021a:
                com.tencent.qbar.b r0 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                r0.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "markScanSuccess"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x0412 }
                r0.f56843b = r13     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r0 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                r0.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0412 }
                java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0412 }
                r6[r15] = r8     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "MicroMsg.QBarEngineReporter"
                java.lang.String r9 = "setScanSuccessTime: %s,"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)     // Catch:{ all -> 0x0412 }
                r0.f56845d = r4     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.b r23 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r0 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0412 }
                java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.a$a r0 = (com.tencent.qbar.C19931a.C19932a) r0     // Catch:{ all -> 0x0412 }
                java.lang.String r0 = r0.f56828e     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r6 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0412 }
                java.lang.Object r6 = r6.get(r15)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = r6.f56829f     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r8 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0412 }
                java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.a$a r8 = (com.tencent.qbar.C19931a.C19932a) r8     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = r8.f56831h     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r9 = r14.f292253c     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0412 }
                boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0412 }
                if (r9 == 0) goto L_0x0272
                r27 = 0
                goto L_0x027e
            L_0x0272:
                java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r9 = r14.f292253c     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0412 }
                java.lang.Object r9 = r9.get(r15)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.WxQbarNative$QBarReportMsg r9 = (com.tencent.qbar.WxQbarNative.QBarReportMsg) r9     // Catch:{ all -> 0x0412 }
                r27 = r9
            L_0x027e:
                java.util.List<com.tencent.qbar.a$a> r9 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0412 }
                int r28 = r9.size()     // Catch:{ all -> 0x0412 }
                r29 = 0
                java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r9 = r14.f292253c     // Catch:{ all -> 0x0412 }
                r24 = r0
                r25 = r6
                r26 = r8
                r30 = r9
                r23.mo27311d(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0412 }
                int r0 = r14.f292255e     // Catch:{ all -> 0x0412 }
                r6 = 2
                if (r0 == r6) goto L_0x029c
                if (r0 != r3) goto L_0x02ba
            L_0x029c:
                qs3.b r0 = qs3.C22126b.f62577E     // Catch:{ all -> 0x0412 }
                r0.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0412 }
                r6.<init>()     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "setScanSuccessTime: "
                r6.append(r8)     // Catch:{ all -> 0x0412 }
                r6.append(r4)     // Catch:{ all -> 0x0412 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "MicroMsg.ScanCodeReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r6)     // Catch:{ all -> 0x0412 }
                r0.f62585e = r4     // Catch:{ all -> 0x0412 }
            L_0x02ba:
                com.tencent.qbar.b r0 = com.tencent.qbar.C19933b.f56834I     // Catch:{ all -> 0x0412 }
                r0.mo27309b()     // Catch:{ all -> 0x0412 }
                int r0 = r14.f292255e     // Catch:{ all -> 0x0412 }
                r6 = 2
                if (r0 == r6) goto L_0x02ca
                if (r0 != r3) goto L_0x02c7
                goto L_0x02ca
            L_0x02c7:
                r0 = 0
                goto L_0x0345
            L_0x02ca:
                if (r0 != r6) goto L_0x02cf
                qs3.b r0 = qs3.C22126b.f62576D     // Catch:{ all -> 0x0412 }
                goto L_0x02d2
            L_0x02cf:
                qs3.b r0 = qs3.C22126b.f62576D     // Catch:{ all -> 0x0412 }
                r3 = 3
            L_0x02d2:
                qs3.b r0 = qs3.C22126b.f62577E     // Catch:{ all -> 0x0412 }
                r0.getClass()     // Catch:{ all -> 0x0412 }
                java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0412 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0412 }
                r6[r15] = r8     // Catch:{ all -> 0x0412 }
                java.lang.String r8 = "MicroMsg.ScanCodeReporter"
                java.lang.String r9 = "setScanScene, scene: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)     // Catch:{ all -> 0x0412 }
                r0.f62586f = r3     // Catch:{ all -> 0x0412 }
                android.graphics.Point r3 = r14.f292254d     // Catch:{ all -> 0x0412 }
                int r6 = r3.x     // Catch:{ all -> 0x0412 }
                int r3 = r3.y     // Catch:{ all -> 0x0412 }
                r0.mo35212f(r6, r3)     // Catch:{ all -> 0x0412 }
                r0.mo35207a()     // Catch:{ all -> 0x0412 }
                r0.mo35208b(r4, r13)     // Catch:{ all -> 0x0412 }
                int[] r3 = r1.f56880g     // Catch:{ all -> 0x0412 }
                r9 = 0
            L_0x02fb:
                int r4 = r3.length     // Catch:{ all -> 0x0412 }
                if (r9 >= r4) goto L_0x030a
                r4 = r3[r9]     // Catch:{ all -> 0x0412 }
                if (r4 == r7) goto L_0x0308
                if (r4 != 0) goto L_0x0305
                goto L_0x0308
            L_0x0305:
                int r9 = r9 + 1
                goto L_0x02fb
            L_0x0308:
                r9 = 1
                goto L_0x030b
            L_0x030a:
                r9 = 0
            L_0x030b:
                r0.f62589i = r9     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.a$a> r3 = r14.f292251a     // Catch:{ all -> 0x0412 }
                java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r4 = r14.f292253c     // Catch:{ all -> 0x0412 }
                r0.mo35213g(r3, r4)     // Catch:{ all -> 0x0412 }
                java.lang.String r3 = "snapShot"
                gy3.C87412m.m108594g(r2, r3)     // Catch:{ all -> 0x0412 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0412 }
                r3.<init>()     // Catch:{ all -> 0x0412 }
                java.lang.String r4 = "setCallSnapShot: "
                r3.append(r4)     // Catch:{ all -> 0x0412 }
                r3.append(r2)     // Catch:{ all -> 0x0412 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0412 }
                java.lang.String r4 = "MicroMsg.ScanCodeReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)     // Catch:{ all -> 0x0412 }
                r0.f62594n = r2     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.c r2 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                java.lang.String r2 = r2.f56875f     // Catch:{ all -> 0x0412 }
                java.lang.String r3 = "detectModelVersion"
                gy3.C87412m.m108594g(r2, r3)     // Catch:{ all -> 0x0412 }
                r0.f62590j = r2     // Catch:{ all -> 0x0412 }
                r0.mo35209c()     // Catch:{ all -> 0x0412 }
                r0.mo35211e()     // Catch:{ all -> 0x0412 }
                goto L_0x02c7
            L_0x0345:
                r1.f56878e = r0     // Catch:{ all -> 0x0412 }
                int r0 = vl2.C37756o.m41531e()     // Catch:{ all -> 0x0412 }
                if (r0 != r13) goto L_0x0350
                r0 = 1722(0x6ba, float:2.413E-42)
                goto L_0x0352
            L_0x0350:
                r0 = 1229(0x4cd, float:1.722E-42)
            L_0x0352:
                java.lang.String r2 = "WxFileDecodeQueue"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0412 }
                r3.<init>()     // Catch:{ all -> 0x0412 }
                java.lang.String r4 = "QBar init report, WxFileDecodeQueue idKey:"
                r3.append(r4)     // Catch:{ all -> 0x0412 }
                r3.append(r0)     // Catch:{ all -> 0x0412 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0412 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0412 }
                com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0412 }
                long r2 = (long) r0     // Catch:{ all -> 0x0412 }
                r18 = 20
                r20 = 1
                r16 = r2
                r15.mo175913w(r16, r18, r20)     // Catch:{ all -> 0x0412 }
            L_0x0374:
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x0412 }
                java.lang.Object r2 = r0.f56873d     // Catch:{ all -> 0x0412 }
                monitor-enter(r2)     // Catch:{ all -> 0x0412 }
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f56872c     // Catch:{ all -> 0x040f }
                java.lang.String r3 = r1.f56877d     // Catch:{ all -> 0x040f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x040f }
                boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x040f }
                if (r0 == 0) goto L_0x03f2
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f56872c     // Catch:{ all -> 0x040f }
                java.lang.String r3 = r1.f56877d     // Catch:{ all -> 0x040f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x040f }
                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x040f }
                java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x040f }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x040f }
            L_0x0399:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x040f }
                if (r3 == 0) goto L_0x03e7
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x040f }
                java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x040f }
                long r3 = r3.longValue()     // Catch:{ all -> 0x040f }
                com.tencent.qbar.c r5 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.Long, lx.h0$a> r5 = r5.f56871b     // Catch:{ all -> 0x040f }
                java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x040f }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x040f }
                boolean r5 = r5.containsKey(r6)     // Catch:{ all -> 0x040f }
                if (r5 == 0) goto L_0x03d9
                com.tencent.qbar.c r5 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.Long, lx.h0$a> r5 = r5.f56871b     // Catch:{ all -> 0x040f }
                java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x040f }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x040f }
                java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x040f }
                lx.h0$a r5 = (p200lx.C99712h0.C99713a) r5     // Catch:{ all -> 0x040f }
                r5.mo24342a(r3, r14)     // Catch:{ all -> 0x040f }
                com.tencent.qbar.c r5 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.Long, lx.h0$a> r5 = r5.f56871b     // Catch:{ all -> 0x040f }
                java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x040f }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x040f }
                r5.remove(r6)     // Catch:{ all -> 0x040f }
            L_0x03d9:
                com.tencent.qbar.c r5 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.Long, java.lang.String> r5 = r5.f56870a     // Catch:{ all -> 0x040f }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x040f }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x040f }
                r5.remove(r3)     // Catch:{ all -> 0x040f }
                goto L_0x0399
            L_0x03e7:
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f56872c     // Catch:{ all -> 0x040f }
                java.lang.String r3 = r1.f56877d     // Catch:{ all -> 0x040f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x040f }
                r0.remove(r3)     // Catch:{ all -> 0x040f }
            L_0x03f2:
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f56872c     // Catch:{ all -> 0x040f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x040f }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040f }
                if (r0 == 0) goto L_0x040c
                java.lang.String r0 = "WxFileDecodeQueue"
                java.lang.String r3 = "release QBar"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x040f }
                com.tencent.qbar.c r0 = com.tencent.qbar.C19934c.this     // Catch:{ all -> 0x040f }
                com.tencent.qbar.e r0 = r0.f56874e     // Catch:{ all -> 0x040f }
                r0.mo33090g()     // Catch:{ all -> 0x040f }
            L_0x040c:
                monitor-exit(r2)     // Catch:{ all -> 0x040f }
                monitor-exit(r10)     // Catch:{ all -> 0x0412 }
                return
            L_0x040f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x040f }
                throw r0     // Catch:{ all -> 0x0412 }
            L_0x0412:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0412 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qbar.C19934c.C19935a.run():void");
        }
    }

    public C19934c() {
        C19937e eVar = this.f56874e;
        boolean cr02 = ((C101643c) C86312j.m106911c(C101643c.class)).cr0();
        C19936d dVar = (C19936d) eVar.f59752b;
        dVar.getClass();
        Log.m105925i("MicroMsg.WxQBar", "setEnableMultiCode: %b", Boolean.valueOf(cr02));
        dVar.f56888e = cr02;
    }

    /* renamed from: c */
    public static Bitmap m21737c(String str, C99712h0.C99714b bVar) {
        int i;
        try {
            if (f56869i == null) {
                f56869i = new C15514d();
            }
            C15513c cVar = new C15513c(str);
            cVar.f42056c = bVar != null && bVar.f292249a;
            C15519h a = C15516e.m14538a(cVar, f56869i);
            Point point = a.f42062b;
            if (!(point == null || bVar == null || ((i = bVar.f292250b) != 2 && i != 4))) {
                C22126b.f62577E.mo35214h(point.x, point.y);
            }
            return a.f42061a;
        } catch (Exception e) {
            Log.m105920e("WxFileDecodeQueue", "decode file to bitmap error! " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public void mo27314a(Context context, long j, String str, Bitmap bitmap, C99712h0.C99713a aVar, int[] iArr, C99712h0.C99714b bVar) {
        String str2 = str;
        C99712h0.C99713a aVar2 = aVar;
        C99712h0.C99714b bVar2 = bVar;
        synchronized (this.f56873d) {
            if (bVar2 != null) {
                int i = bVar2.f292250b;
                if (!(i == 2 || i == 4)) {
                    C37756o oVar = C37756o.f100004a;
                    if (((Boolean) ((C36570n) C37756o.f100013j).getValue()).booleanValue()) {
                        if (((Boolean) ((C36570n) C37756o.f100014k).getValue()).booleanValue()) {
                            C20839a.f58862l = false;
                            com.tencent.stubs.logger.Log.m106505i("ScanUtil", "setQBarOptForceDM :false");
                        }
                    }
                }
            }
            int size = ((HashMap) this.f56870a).size();
            if (size < 9) {
                Log.m105925i("WxFileDecodeQueue", "addDecodeTask submit decode task %d, fileMap: %d", Long.valueOf(j), Integer.valueOf(size));
                ((HashMap) this.f56870a).put(Long.valueOf(j), str2);
                if (aVar2 != null) {
                    ((HashMap) this.f56871b).put(Long.valueOf(j), aVar2);
                }
                if (!((HashMap) this.f56872c).containsKey(str2)) {
                    ((HashMap) this.f56872c).put(str2, new ArrayList());
                    QbarNative.QbarAiModelParam Gw = ((C21473d0) C86312j.m106911c(C21473d0.class)).mo33645Gw();
                    this.f56875f = Gw != null ? Gw.detectModelVersion : "";
                    this.f56876g.execute(new C19935a(str, bitmap, Gw, iArr, bVar));
                }
                ((List) ((HashMap) this.f56872c).get(str2)).add(Long.valueOf(j));
            } else {
                Log.m105929w("WxFileDecodeQueue", "too many files are waiting and ignore: %d", Long.valueOf(j));
                long j2 = j;
                aVar2.mo24342a(j, (C99712h0.C99715c) null);
            }
        }
    }

    /* renamed from: b */
    public void mo27315b(Context context, long j, String str, C99712h0.C99713a aVar) {
        mo27314a(context, j, str, (Bitmap) null, aVar, new int[]{0}, (C99712h0.C99714b) null);
    }

    /* renamed from: d */
    public List<C99712h0.C99715c> mo27316d(Context context, List<String> list) {
        ArrayList arrayList;
        Iterator<String> it;
        if (BuildInfo.IS_FLAVOR_RED && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("can not direct scan code in main thread");
        } else if (list == null || list.isEmpty()) {
            Log.m105920e("WxFileDecodeQueue", "directScanCodeForFile imagePathList is empty");
            return null;
        } else {
            synchronized (this.f56874e) {
                arrayList = new ArrayList();
                Iterator<String> it4 = list.iterator();
                while (it4.hasNext()) {
                    String next = it4.next();
                    C99712h0.C99715c cVar = new C99712h0.C99715c();
                    C99712h0.C99714b bVar = new C99712h0.C99714b();
                    Bitmap c = m21737c(next, bVar);
                    if (c != null) {
                        int[] iArr = {0};
                        QbarNative.QbarAiModelParam Gw = ((C21473d0) C86312j.m106911c(C21473d0.class)).mo33645Gw();
                        this.f56875f = Gw != null ? Gw.detectModelVersion : "";
                        C19937e eVar = this.f56874e;
                        if (!eVar.f59753c) {
                            eVar.mo33089f(MMApplicationContext.getContext(), 1, Gw);
                        }
                        C19937e eVar2 = this.f56874e;
                        if (eVar2.f59753c) {
                            eVar2.mo33091h(iArr);
                        }
                        int[] iArr2 = new int[(c.getWidth() * c.getHeight())];
                        it = it4;
                        c.getPixels(iArr2, 0, c.getWidth(), 0, 0, c.getWidth(), c.getHeight());
                        cVar.f292252b = new ArrayList();
                        cVar.f292253c = new ArrayList();
                        Point point = new Point(c.getWidth(), c.getHeight());
                        cVar.f292254d = point;
                        List<C19931a.C19932a> i = this.f56874e.mo27323i(iArr2, point, (PointF) null, cVar.f292252b, cVar.f292253c, true);
                        cVar.f292251a = i;
                        cVar.f292255e = bVar.f292250b;
                        Object[] objArr = new Object[1];
                        objArr[0] = Integer.valueOf(i == null ? 0 : i.size());
                        Log.m105925i("WxFileDecodeQueue", "directScanCodeForFile get %d decode results", objArr);
                    } else {
                        it = it4;
                        Log.m105921e("WxFileDecodeQueue", "directScanCodeForFile bitmap == null, imagePath:%s", next);
                    }
                    arrayList.add(cVar);
                    it4 = it;
                }
                if (this.f56874e.f59753c) {
                    Log.m105924i("WxFileDecodeQueue", "directScanCodeForFile release QBar");
                    this.f56874e.mo33090g();
                }
            }
            return arrayList;
        }
    }
}
