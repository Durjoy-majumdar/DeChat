package com.tencent.qbar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.WxQbarNative;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ml2.C34589b;
import ml2.C34590d;
import p200lx.C21473d0;
import qs3.C22126b;
import qs3.C22128d;
import ss3.C36788a;
import ss3.C36791b;
import ss3.C36794e;
import vl2.C37756o;
import zt3.C119157j;

/* renamed from: com.tencent.qbar.f */
public class C19938f {

    /* renamed from: w */
    public static C19938f f56890w = new C19938f();

    /* renamed from: a */
    public C34590d f56891a = new C34589b();

    /* renamed from: b */
    public boolean f56892b = false;

    /* renamed from: c */
    public C36788a f56893c = new C36788a();

    /* renamed from: d */
    public int[] f56894d;

    /* renamed from: e */
    public int[] f56895e;

    /* renamed from: f */
    public Map f56896f;

    /* renamed from: g */
    public final Object f56897g;

    /* renamed from: h */
    public long f56898h;

    /* renamed from: i */
    public volatile C19941c f56899i;

    /* renamed from: j */
    public boolean f56900j;

    /* renamed from: k */
    public int f56901k;

    /* renamed from: l */
    public long f56902l;

    /* renamed from: m */
    public C19937e f56903m;

    /* renamed from: n */
    public boolean f56904n;

    /* renamed from: o */
    public long f56905o;

    /* renamed from: p */
    public Runnable f56906p;

    /* renamed from: q */
    public ScanDecodeFrameData f56907q;

    /* renamed from: r */
    public boolean f56908r;

    /* renamed from: s */
    public int f56909s;

    /* renamed from: t */
    public int f56910t;

    /* renamed from: u */
    public String f56911u;

    /* renamed from: v */
    public ConcurrentHashMap<String, Long> f56912v;

    /* renamed from: com.tencent.qbar.f$a */
    public class C19939a implements Runnable {

        /* renamed from: d */
        public long f56913d;

        /* renamed from: e */
        public byte[] f56914e;

        /* renamed from: f */
        public Point f56915f;

        /* renamed from: g */
        public Rect f56916g;

        /* renamed from: h */
        public int f56917h;

        /* renamed from: i */
        public long f56918i;

        public C19939a(long j, long j2, byte[] bArr, Point point, int i, Rect rect) {
            this.f56918i = j;
            this.f56913d = j2;
            this.f56914e = bArr;
            this.f56915f = point;
            this.f56917h = i;
            this.f56916g = rect;
        }

        public void run() {
            byte[] c;
            Log.m105924i("MicroMsg.WxScanDecodeQueue", "CropGrayTask");
            int[] iArr = new int[2];
            synchronized (C19938f.this.f56903m) {
                long currentTimeMillis = System.currentTimeMillis();
                c = C19938f.this.f56903m.mo33086c(this.f56914e, this.f56915f, this.f56917h, this.f56916g, iArr);
                long currentTimeMillis2 = System.currentTimeMillis();
                C36788a aVar = C19938f.this.f56893c;
                aVar.getClass();
                ((C119157j) C119157j.f356862d).mo183876g(new C36791b(aVar, this.f56918i, currentTimeMillis2 - currentTimeMillis), "ScanCostManager");
            }
            synchronized (C19938f.this.f56897g) {
                if (c != null) {
                    long j = this.f56913d;
                    C19938f fVar = C19938f.this;
                    if (j == fVar.f56898h) {
                        ((HashMap) fVar.f56896f).put("param_gray_data", c);
                        ((HashMap) C19938f.this.f56896f).put("param_out_size", new Point(iArr[0], iArr[1]));
                        ((HashMap) C19938f.this.f56896f).put("param_preview_data", this.f56914e);
                        ((HashMap) C19938f.this.f56896f).put("param_resolution", this.f56915f);
                        ((HashMap) C19938f.this.f56896f).put("param_decode_task_id", Long.valueOf(this.f56918i));
                        C19938f fVar2 = C19938f.this;
                        if (!fVar2.f56900j) {
                            Log.m105925i("MicroMsg.WxScanDecodeQueue", "%d submit decode gray", Long.valueOf(fVar2.f56898h));
                            ThreadPool.post(new C19940b(this.f56913d), "WxScanDecodeQueue_Decode_Gray");
                        }
                        if (C19938f.this.f56899i != null) {
                            C19938f.this.f56899i.mo24429a(C19938f.this.f56898h, 10);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.qbar.f$b */
    public class C19940b implements Runnable {

        /* renamed from: d */
        public long f56920d;

        /* renamed from: e */
        public byte[] f56921e;

        /* renamed from: f */
        public byte[] f56922f;

        /* renamed from: g */
        public ScanIdentifyReportInfo f56923g;

        /* renamed from: h */
        public Point f56924h;

        /* renamed from: i */
        public long f56925i;

        public C19940b(long j) {
            this.f56920d = j;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: com.tencent.qbar.WxQbarNative$QBarReportMsg} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x029c, code lost:
            if (r10 == null) goto L_0x02ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x029e, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WxScanDecodeQueue", "isZoom %b, zoomFactor %f", java.lang.Boolean.valueOf(r10.isZoom), java.lang.Float.valueOf(r10.zoomFactor));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b9, code lost:
            if (r3 == null) goto L_0x02c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bf, code lost:
            if (r3.isEmpty() == false) goto L_0x02ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c3, code lost:
            if (r10.isZoom == false) goto L_0x02ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c5, code lost:
            r5.putFloat("param_zoom_ratio", r10.zoomFactor);
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ce, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02cf, code lost:
            r8 = com.tencent.qbar.C19938f.m21754a(r1.f56926j, r3);
            r13 = new java.lang.Object[3];
            r13[0] = java.lang.Boolean.valueOf(r8);
            r13[1] = java.lang.Boolean.valueOf(r1.f56926j.f56904n);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ee, code lost:
            if (r3 != null) goto L_0x02f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f0, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f2, code lost:
            r7 = r3.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f6, code lost:
            r13[2] = java.lang.Integer.valueOf(r7);
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WxScanDecodeQueue", "alvinluo decodeGrayData ignoreResult: %b, isZooming: %b, result size: %d", r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0303, code lost:
            if (r5.isEmpty() != false) goto L_0x030e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0305, code lost:
            r1.f56926j.f56899i.mo24430b(r1.f56920d, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x030e, code lost:
            if (r3 == null) goto L_0x0424;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0314, code lost:
            if (r3.isEmpty() != false) goto L_0x0424;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0316, code lost:
            if (r8 != false) goto L_0x0424;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0318, code lost:
            r5 = com.tencent.qbar.C19933b.f56833H;
            r5.getClass();
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.QBarEngineReporter", "markScanSuccess");
            r5.f56843b = true;
            r5 = com.tencent.qbar.C19933b.f56833H;
            r5.getClass();
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.QBarEngineReporter", "setScanSuccessTime: %s,", java.lang.Long.valueOf(r11));
            r5.f56845d = r11;
            r8 = com.tencent.qbar.C19933b.f56833H;
            r9 = r3.get(0).f56828e;
            r10 = r3.get(0).f56829f;
            r6 = r3.get(0).f56831h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x035f, code lost:
            if (r0.isEmpty() == false) goto L_0x0364;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0361, code lost:
            r16 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0364, code lost:
            r16 = r0.get(0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x036d, code lost:
            r6 = r17;
            r5 = r15;
            r8.mo27311d(r9, r10, r6, r16, r3.size(), 0, r0);
            com.tencent.qbar.C19933b.f56833H.f56862u = r6;
            com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.QBarEngineReporter", "alvinluo setWaitingFrameCount: %d", java.lang.Integer.valueOf(r6));
            com.tencent.qbar.C19933b.f56833H.mo27309b();
            r6 = qs3.C22126b.f62576D;
            r6.getClass();
            r8 = new java.lang.StringBuilder();
            r8.append("setScanSuccessTime: ");
            r9 = r11;
            r8.append(r9);
            com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.ScanCodeReporter", r8.toString());
            r6.f62585e = r9;
            r6.f62602v = 2;
            r6.mo35213g(r3, r0);
            r6.mo35209c();
            r14 = new android.os.Bundle();
            com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.WxScanDecodeQueue", "alvinluo decodeSuccess result size: %d, isZooming: %b", java.lang.Integer.valueOf(r3.size()), java.lang.Boolean.valueOf(r1.f56926j.f56904n));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x03ea, code lost:
            if (r3.size() <= 1) goto L_0x03f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ec, code lost:
            r6 = r1.f56926j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x03f0, code lost:
            if (r6.f56904n == false) goto L_0x03f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x03f2, code lost:
            r14.putParcelable("decode_success_frame_data", r6.f56907q);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f9, code lost:
            r14.putString("decode_debug_string", r5);
            r14.putLong("decode_success_cost_time", java.lang.System.currentTimeMillis() - r1.f56926j.f56902l);
            r14.putParcelable("ScanIdentifyReportInfo.DecodeKey", r1.f56923g);
            r1.f56926j.f56899i.mo24431c(r1.f56926j.f56898h, r3, r2, r0, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0422, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0424, code lost:
            if (r6 == false) goto L_0x043e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0426, code lost:
            r0 = r1.f56926j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x042a, code lost:
            if (r0.f56908r == false) goto L_0x043e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x042c, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.WxScanDecodeQueue", "alvinluo onZoomStart");
            r0.f56904n = true;
            r0.f56910t = 0;
            com.tencent.qbar.C19938f.m21755b(r1.f56926j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x043e, code lost:
            com.tencent.qbar.C19938f.m21756c(r1.f56926j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0443, code lost:
            if (r6 != false) goto L_0x0453;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0445, code lost:
            r0 = r1.f56926j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0449, code lost:
            if (r0.f56904n != false) goto L_0x0453;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a6, code lost:
            r5 = java.lang.System.currentTimeMillis();
            r0 = new java.util.ArrayList();
            r2 = new java.util.ArrayList();
            r15 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x044b, code lost:
            r0.f56899i.mo24432d(r1.f56922f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0453, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.WxScanDecodeQueue", "onDecodeNothing not called");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x045a, code lost:
            r1.f56926j.f56900j = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0460, code lost:
            r8.f56900j = false;
            com.tencent.qbar.C19938f.m21756c(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0466, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0467, code lost:
            r0 = r1.f56926j.f56893c;
            r2 = java.lang.System.currentTimeMillis();
            r0.getClass();
            ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new ss3.C36793d(r0, r2), "ScanCostManager");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0480, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0482, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b8, code lost:
            if (r1.f56921e == null) goto L_0x049e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0489, code lost:
            r18 = r14;
            r8.f56900j = false;
            com.tencent.qbar.C19938f.m21756c(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0491, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0492, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0493, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0495, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0496, code lost:
            r18 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x049b, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
            if (r1.f56924h == null) goto L_0x049e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x049c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x049e, code lost:
            r0 = r1.f56926j;
            r0.f56900j = false;
            com.tencent.qbar.C19938f.m21756c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x04a6, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00be, code lost:
            r14 = r1.f56926j.f56903m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r8 = r1.f56926j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
            if (r8.f56903m.f59753c == false) goto L_0x0489;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cb, code lost:
            r16 = java.lang.System.currentTimeMillis();
            r8 = r1.f56926j;
            r8.f56901k++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
            if (r8.f56904n == false) goto L_0x0103;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
            r9 = r8.f56910t + 1;
            r8.f56910t = r9;
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WxScanDecodeQueue", "alvinluo decodeGrayData isZooming and reset, currentFrameNumWhenZooming: %d", java.lang.Integer.valueOf(r9));
            r8 = r1.f56926j.f56903m;
            r9 = r8.f59754d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f4, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r8 = r8.f59752b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f7, code lost:
            if (r8 == null) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
            ((com.tencent.qbar.C19936d) r8).mo27319g(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fe, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
            r8 = r1.f56926j.f56903m;
            r9 = r1.f56921e;
            r10 = r1.f56924h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
            r18 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r8 = r8.mo27321a(r9, r10.x, r10.y, false, r2, r0);
            r9 = r1.f56926j.f56903m.f59752b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
            if (r9.f56825a >= 0) goto L_0x0129;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
            r10 = new com.tencent.qbar.QbarNative.QBarZoomInfo();
            r9.f56826b.GetZoomInfo(r10, r9.f56825a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0135, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r9 = r1.f56926j.f56903m;
            r11 = r9.f59754d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            r14 = r9.f56889e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
            if (vl2.C37756o.f100005b == false) goto L_0x014c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
            r15 = r1.f56926j.f56903m.mo27325k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x014c, code lost:
            r11 = java.lang.System.currentTimeMillis();
            r9 = r1.f56926j.f56893c;
            r3 = r1.f56925i;
            r9.getClass();
            ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new ss3.C36791b(r9, r3, r11 - r16), "ScanCostManager");
            r3 = r1.f56926j.f56893c;
            r11 = r1.f56925i;
            r3.getClass();
            ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new ss3.C36792c(r3, r11), "ScanCostManager");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0186, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0187, code lost:
            r3 = r1.f56926j;
            r4 = r3.f56891a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x018b, code lost:
            if (r4 == null) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x018f, code lost:
            if (r3.f56892b == false) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0191, code lost:
            r3 = r4.filter(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
            r3 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0197, code lost:
            r4 = (int) (java.lang.System.currentTimeMillis() - r5);
            r5 = com.tencent.qbar.C19933b.f56833H;
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.QBarEngineReporter", "addScanFrame, current scan frame: %s", java.lang.Integer.valueOf(r5.f56844c));
            r5.f56844c++;
            r5 = com.tencent.qbar.C19933b.f56833H;
            r11 = (long) r4;
            r5.getClass();
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.QBarEngineReporter", "addScanTime: %s", java.lang.Long.valueOf(r11));
            r5.f56842a += r11;
            r4 = com.tencent.qbar.C19933b.f56833H;
            r5 = r1.f56924h;
            r4.mo27312e(r5.x, r5.y);
            r4 = com.tencent.qbar.C19933b.f56833H;
            r5 = r1.f56926j;
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e0, code lost:
            r8 = r5.f56895e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e4, code lost:
            if (r6 >= r8.length) goto L_0x01f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e6, code lost:
            r8 = r8[r6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e8, code lost:
            if (r8 == 3) goto L_0x01f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ea, code lost:
            if (r8 != 0) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ed, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f0, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f2, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f3, code lost:
            r4.f56864w = r5;
            r4 = qs3.C22126b.f62576D;
            r4.mo35207a();
            r4.mo35208b(r11, false);
            r5 = r1.f56924h;
            r4.mo35214h(r5.x, r5.y);
            r5 = r1.f56924h;
            r4.mo35212f(r5.x, r5.y);
            r5 = r1.f56926j;
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0212, code lost:
            r8 = r5.f56895e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
            if (r6 >= r8.length) goto L_0x0223;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0217, code lost:
            r8 = r8[r6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0219, code lost:
            if (r8 == 3) goto L_0x0221;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x021b, code lost:
            if (r8 != 0) goto L_0x021e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x021e, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0221, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0223, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
            r4.f62589i = r5;
            r5 = r1.f56926j.f56911u;
            gy3.C87412m.m108594g(r5, "detectModelVersion");
            r4.f62590j = r5;
            r4 = r1.f56926j.f56897g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0235, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            r5 = r1.f56920d;
            r8 = r1.f56926j;
            r17 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0240, code lost:
            if (r5 != r8.f56898h) goto L_0x0460;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0242, code lost:
            r8 = new java.lang.Object[2];
            r8[0] = com.tencent.qbar.QbarNative.GetVersion();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x024f, code lost:
            if (r3 != null) goto L_0x0253;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0251, code lost:
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0253, code lost:
            r13 = r3.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0257, code lost:
            r8[1] = java.lang.Integer.valueOf(r13);
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WxScanDecodeQueue", "qbar version %s, get %d decode results", r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0262, code lost:
            if (r3 == null) goto L_0x0297;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0264, code lost:
            r5 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x026c, code lost:
            if (r5.hasNext() == false) goto L_0x0297;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x026e, code lost:
            r6 = r5.next();
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.WxScanDecodeQueue", "result " + r6.f56828e + "," + r6.f56829f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0297, code lost:
            r5 = new android.os.Bundle();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r27 = this;
                r1 = r27
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this
                java.lang.Object r2 = r0.f56897g
                monitor-enter(r2)
                long r3 = r1.f56920d     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                long r5 = r0.f56898h     // Catch:{ all -> 0x04af }
                r7 = 0
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L_0x04a7
                r3 = 1
                r0.f56900j = r3     // Catch:{ all -> 0x04af }
                java.util.Map r0 = r0.f56896f     // Catch:{ all -> 0x04af }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x04af }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04af }
                r4 = 0
                if (r0 != 0) goto L_0x00a5
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r0 = r0.f56896f     // Catch:{ all -> 0x04af }
                java.lang.String r5 = "param_gray_data"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x04af }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x04af }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x04af }
                int r5 = r0.length     // Catch:{ all -> 0x04af }
                byte[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch:{ all -> 0x04af }
                r1.f56921e = r0     // Catch:{ all -> 0x04af }
                android.graphics.Point r0 = new android.graphics.Point     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r5 = r5.f56896f     // Catch:{ all -> 0x04af }
                java.lang.String r6 = "param_out_size"
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x04af }
                java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x04af }
                android.graphics.Point r5 = (android.graphics.Point) r5     // Catch:{ all -> 0x04af }
                r0.<init>(r5)     // Catch:{ all -> 0x04af }
                r1.f56924h = r0     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r0 = r0.f56896f     // Catch:{ all -> 0x04af }
                java.lang.String r5 = "param_preview_data"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x04af }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x04af }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x04af }
                r1.f56922f = r0     // Catch:{ all -> 0x04af }
                android.graphics.Point r0 = new android.graphics.Point     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r5 = r5.f56896f     // Catch:{ all -> 0x04af }
                java.lang.String r6 = "param_resolution"
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x04af }
                java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x04af }
                android.graphics.Point r5 = (android.graphics.Point) r5     // Catch:{ all -> 0x04af }
                r0.<init>(r5)     // Catch:{ all -> 0x04af }
                com.tencent.qbar.ScanIdentifyReportInfo r5 = new com.tencent.qbar.ScanIdentifyReportInfo     // Catch:{ all -> 0x04af }
                byte[] r6 = r1.f56922f     // Catch:{ all -> 0x04af }
                r5.<init>(r4, r4, r4)     // Catch:{ all -> 0x04af }
                if (r6 == 0) goto L_0x0081
                int r8 = r6.length     // Catch:{ all -> 0x04af }
                byte[] r6 = java.util.Arrays.copyOf(r6, r8)     // Catch:{ all -> 0x04af }
                java.lang.String r8 = "copyOf(this, size)"
                gy3.C87412m.m108593f(r6, r8)     // Catch:{ all -> 0x04af }
                goto L_0x0082
            L_0x0081:
                r6 = r4
            L_0x0082:
                r5.f285785d = r6     // Catch:{ all -> 0x04af }
                r5.f285786e = r0     // Catch:{ all -> 0x04af }
                r1.f56923g = r5     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r0 = r0.f56896f     // Catch:{ all -> 0x04af }
                java.lang.String r5 = "param_decode_task_id"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x04af }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x04af }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x04af }
                long r5 = r0.longValue()     // Catch:{ all -> 0x04af }
                r1.f56925i = r5     // Catch:{ all -> 0x04af }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x04af }
                java.util.Map r0 = r0.f56896f     // Catch:{ all -> 0x04af }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x04af }
                r0.clear()     // Catch:{ all -> 0x04af }
            L_0x00a5:
                monitor-exit(r2)     // Catch:{ all -> 0x04af }
                long r5 = java.lang.System.currentTimeMillis()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.String r15 = ""
                byte[] r8 = r1.f56921e
                if (r8 == 0) goto L_0x049e
                android.graphics.Point r8 = r1.f56924h
                if (r8 == 0) goto L_0x049e
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this
                com.tencent.qbar.e r14 = r8.f56903m
                monitor-enter(r14)
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.e r9 = r8.f56903m     // Catch:{ all -> 0x0495 }
                boolean r9 = r9.f59753c     // Catch:{ all -> 0x0495 }
                if (r9 == 0) goto L_0x0489
                long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0495 }
                int r9 = r8.f56901k     // Catch:{ all -> 0x0495 }
                int r9 = r9 + r3
                r8.f56901k = r9     // Catch:{ all -> 0x0495 }
                boolean r9 = r8.f56904n     // Catch:{ all -> 0x0495 }
                if (r9 == 0) goto L_0x0103
                int r9 = r8.f56910t     // Catch:{ all -> 0x0495 }
                int r9 = r9 + r3
                r8.f56910t = r9     // Catch:{ all -> 0x0495 }
                java.lang.String r8 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r10 = "alvinluo decodeGrayData isZooming and reset, currentFrameNumWhenZooming: %d"
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x0495 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0495 }
                r11[r7] = r9     // Catch:{ all -> 0x0495 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r11)     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.e r8 = r8.f56903m     // Catch:{ all -> 0x0495 }
                java.lang.Object r9 = r8.f59754d     // Catch:{ all -> 0x0495 }
                monitor-enter(r9)     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.a r8 = r8.f59752b     // Catch:{ all -> 0x0100 }
                if (r8 == 0) goto L_0x00fe
                com.tencent.qbar.d r8 = (com.tencent.qbar.C19936d) r8     // Catch:{ all -> 0x0100 }
                r8.mo27319g(r3)     // Catch:{ all -> 0x0100 }
            L_0x00fe:
                monitor-exit(r9)     // Catch:{ all -> 0x0100 }
                goto L_0x0103
            L_0x0100:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0100 }
                throw r0     // Catch:{ all -> 0x0495 }
            L_0x0103:
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0495 }
                com.tencent.qbar.e r8 = r8.f56903m     // Catch:{ all -> 0x0495 }
                byte[] r9 = r1.f56921e     // Catch:{ all -> 0x0495 }
                android.graphics.Point r10 = r1.f56924h     // Catch:{ all -> 0x0495 }
                int r11 = r10.x     // Catch:{ all -> 0x0495 }
                int r12 = r10.y     // Catch:{ all -> 0x0495 }
                r13 = 0
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r2
                r18 = r14
                r14 = r0
                java.util.List r8 = r8.mo27321a(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.f r9 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.e r9 = r9.f56903m     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.a r9 = r9.f59752b     // Catch:{ all -> 0x0493 }
                monitor-enter(r9)     // Catch:{ all -> 0x0493 }
                int r10 = r9.f56825a     // Catch:{ all -> 0x0486 }
                if (r10 >= 0) goto L_0x0129
                monitor-exit(r9)     // Catch:{ all -> 0x0486 }
                r10 = r4
                goto L_0x0136
            L_0x0129:
                com.tencent.qbar.QbarNative$QBarZoomInfo r10 = new com.tencent.qbar.QbarNative$QBarZoomInfo     // Catch:{ all -> 0x0486 }
                r10.<init>()     // Catch:{ all -> 0x0486 }
                com.tencent.qbar.QbarNative r11 = r9.f56826b     // Catch:{ all -> 0x0486 }
                int r12 = r9.f56825a     // Catch:{ all -> 0x0486 }
                r11.GetZoomInfo(r10, r12)     // Catch:{ all -> 0x0486 }
                monitor-exit(r9)     // Catch:{ all -> 0x0486 }
            L_0x0136:
                com.tencent.qbar.f r9 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.e r9 = r9.f56903m     // Catch:{ all -> 0x0493 }
                java.lang.Object r11 = r9.f59754d     // Catch:{ all -> 0x0493 }
                monitor-enter(r11)     // Catch:{ all -> 0x0493 }
                int r14 = r9.f56889e     // Catch:{ all -> 0x0483 }
                monitor-exit(r11)     // Catch:{ all -> 0x0483 }
                boolean r9 = vl2.C37756o.f100005b     // Catch:{ all -> 0x0493 }
                if (r9 == 0) goto L_0x014c
                com.tencent.qbar.f r9 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.e r9 = r9.f56903m     // Catch:{ all -> 0x0493 }
                java.lang.String r15 = r9.mo27325k()     // Catch:{ all -> 0x0493 }
            L_0x014c:
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.f r9 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0493 }
                ss3.a r9 = r9.f56893c     // Catch:{ all -> 0x0493 }
                long r3 = r1.f56925i     // Catch:{ all -> 0x0493 }
                long r23 = r11 - r16
                r9.getClass()     // Catch:{ all -> 0x0493 }
                ss3.b r11 = new ss3.b     // Catch:{ all -> 0x0493 }
                r19 = r11
                r20 = r9
                r21 = r3
                r19.<init>(r20, r21, r23)     // Catch:{ all -> 0x0493 }
                zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0493 }
                zt3.j r3 = (zt3.C119157j) r3     // Catch:{ all -> 0x0493 }
                java.lang.String r4 = "ScanCostManager"
                r3.mo183876g(r11, r4)     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.f r3 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0493 }
                ss3.a r3 = r3.f56893c     // Catch:{ all -> 0x0493 }
                long r11 = r1.f56925i     // Catch:{ all -> 0x0493 }
                r3.getClass()     // Catch:{ all -> 0x0493 }
                ss3.c r4 = new ss3.c     // Catch:{ all -> 0x0493 }
                r4.<init>(r3, r11)     // Catch:{ all -> 0x0493 }
                zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0493 }
                zt3.j r3 = (zt3.C119157j) r3     // Catch:{ all -> 0x0493 }
                java.lang.String r9 = "ScanCostManager"
                r3.mo183876g(r4, r9)     // Catch:{ all -> 0x0493 }
                monitor-exit(r18)     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.f r3 = com.tencent.qbar.C19938f.this
                ml2.d r4 = r3.f56891a
                if (r4 == 0) goto L_0x0196
                boolean r3 = r3.f56892b
                if (r3 == 0) goto L_0x0196
                java.util.List r3 = r4.filter(r8)
                goto L_0x0197
            L_0x0196:
                r3 = r8
            L_0x0197:
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r5
                int r4 = (int) r8
                com.tencent.qbar.b r5 = com.tencent.qbar.C19933b.f56833H
                r6 = 1
                java.lang.Object[] r8 = new java.lang.Object[r6]
                int r9 = r5.f56844c
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r7] = r9
                java.lang.String r9 = "MicroMsg.QBarEngineReporter"
                java.lang.String r11 = "addScanFrame, current scan frame: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r8)
                int r8 = r5.f56844c
                int r8 = r8 + r6
                r5.f56844c = r8
                com.tencent.qbar.b r5 = com.tencent.qbar.C19933b.f56833H
                long r11 = (long) r4
                r5.getClass()
                java.lang.Object[] r4 = new java.lang.Object[r6]
                java.lang.Long r6 = java.lang.Long.valueOf(r11)
                r4[r7] = r6
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "addScanTime: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
                long r8 = r5.f56842a
                long r8 = r8 + r11
                r5.f56842a = r8
                com.tencent.qbar.b r4 = com.tencent.qbar.C19933b.f56833H
                android.graphics.Point r5 = r1.f56924h
                int r6 = r5.x
                int r5 = r5.y
                r4.mo27312e(r6, r5)
                com.tencent.qbar.b r4 = com.tencent.qbar.C19933b.f56833H
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this
                r6 = 0
            L_0x01e0:
                int[] r8 = r5.f56895e
                int r9 = r8.length
                r13 = 3
                if (r6 >= r9) goto L_0x01f2
                r8 = r8[r6]
                if (r8 == r13) goto L_0x01f0
                if (r8 != 0) goto L_0x01ed
                goto L_0x01f0
            L_0x01ed:
                int r6 = r6 + 1
                goto L_0x01e0
            L_0x01f0:
                r5 = 1
                goto L_0x01f3
            L_0x01f2:
                r5 = 0
            L_0x01f3:
                r4.f56864w = r5
                qs3.b r4 = qs3.C22126b.f62576D
                r4.mo35207a()
                r4.mo35208b(r11, r7)
                android.graphics.Point r5 = r1.f56924h
                int r6 = r5.x
                int r5 = r5.y
                r4.mo35214h(r6, r5)
                android.graphics.Point r5 = r1.f56924h
                int r6 = r5.x
                int r5 = r5.y
                r4.mo35212f(r6, r5)
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this
                r6 = 0
            L_0x0212:
                int[] r8 = r5.f56895e
                int r9 = r8.length
                if (r6 >= r9) goto L_0x0223
                r8 = r8[r6]
                if (r8 == r13) goto L_0x0221
                if (r8 != 0) goto L_0x021e
                goto L_0x0221
            L_0x021e:
                int r6 = r6 + 1
                goto L_0x0212
            L_0x0221:
                r5 = 1
                goto L_0x0224
            L_0x0223:
                r5 = 0
            L_0x0224:
                r4.f62589i = r5
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this
                java.lang.String r5 = r5.f56911u
                java.lang.String r6 = "detectModelVersion"
                gy3.C87412m.m108594g(r5, r6)
                r4.f62590j = r5
                com.tencent.qbar.f r4 = com.tencent.qbar.C19938f.this
                java.lang.Object r4 = r4.f56897g
                monitor-enter(r4)
                long r5 = r1.f56920d     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                r17 = r14
                long r13 = r8.f56898h     // Catch:{ all -> 0x0422 }
                int r18 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r18 != 0) goto L_0x0460
                java.lang.String r5 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r6 = "qbar version %s, get %d decode results"
                r14 = 2
                java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x0422 }
                java.lang.String r13 = com.tencent.qbar.QbarNative.GetVersion()     // Catch:{ all -> 0x0422 }
                r8[r7] = r13     // Catch:{ all -> 0x0422 }
                if (r3 != 0) goto L_0x0253
                r13 = 0
                goto L_0x0257
            L_0x0253:
                int r13 = r3.size()     // Catch:{ all -> 0x0422 }
            L_0x0257:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0422 }
                r18 = 1
                r8[r18] = r13     // Catch:{ all -> 0x0422 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)     // Catch:{ all -> 0x0422 }
                if (r3 == 0) goto L_0x0297
                java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x0422 }
            L_0x0268:
                boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0422 }
                if (r6 == 0) goto L_0x0297
                java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0422 }
                java.lang.String r8 = "MicroMsg.WxScanDecodeQueue"
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0422 }
                r13.<init>()     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = "result "
                r13.append(r9)     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = r6.f56828e     // Catch:{ all -> 0x0422 }
                r13.append(r9)     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = ","
                r13.append(r9)     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = r6.f56829f     // Catch:{ all -> 0x0422 }
                r13.append(r6)     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x0422 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ all -> 0x0422 }
                goto L_0x0268
            L_0x0297:
                android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0422 }
                r5.<init>()     // Catch:{ all -> 0x0422 }
                if (r10 == 0) goto L_0x02ce
                java.lang.String r6 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r8 = "isZoom %b, zoomFactor %f"
                java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ all -> 0x0422 }
                boolean r13 = r10.isZoom     // Catch:{ all -> 0x0422 }
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0422 }
                r9[r7] = r13     // Catch:{ all -> 0x0422 }
                float r13 = r10.zoomFactor     // Catch:{ all -> 0x0422 }
                java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x0422 }
                r19 = 1
                r9[r19] = r13     // Catch:{ all -> 0x0422 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)     // Catch:{ all -> 0x0422 }
                if (r3 == 0) goto L_0x02c5
                boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0422 }
                if (r6 == 0) goto L_0x02ce
                boolean r6 = r10.isZoom     // Catch:{ all -> 0x0422 }
                if (r6 == 0) goto L_0x02ce
            L_0x02c5:
                java.lang.String r6 = "param_zoom_ratio"
                float r8 = r10.zoomFactor     // Catch:{ all -> 0x0422 }
                r5.putFloat(r6, r8)     // Catch:{ all -> 0x0422 }
                r6 = 1
                goto L_0x02cf
            L_0x02ce:
                r6 = 0
            L_0x02cf:
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r8 = com.tencent.qbar.C19938f.m21754a(r8, r3)     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r10 = "alvinluo decodeGrayData ignoreResult: %b, isZooming: %b, result size: %d"
                r13 = 3
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0422 }
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0422 }
                r13[r7] = r18     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r7 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r7 = r7.f56904n     // Catch:{ all -> 0x0422 }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0422 }
                r18 = 1
                r13[r18] = r7     // Catch:{ all -> 0x0422 }
                if (r3 != 0) goto L_0x02f2
                r7 = 0
                goto L_0x02f6
            L_0x02f2:
                int r7 = r3.size()     // Catch:{ all -> 0x0422 }
            L_0x02f6:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0422 }
                r13[r14] = r7     // Catch:{ all -> 0x0422 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r13)     // Catch:{ all -> 0x0422 }
                boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x0422 }
                if (r7 != 0) goto L_0x030e
                com.tencent.qbar.f r7 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f$c r7 = r7.f56899i     // Catch:{ all -> 0x0422 }
                long r9 = r1.f56920d     // Catch:{ all -> 0x0422 }
                r7.mo24430b(r9, r5)     // Catch:{ all -> 0x0422 }
            L_0x030e:
                if (r3 == 0) goto L_0x0424
                boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x0422 }
                if (r5 != 0) goto L_0x0424
                if (r8 != 0) goto L_0x0424
                com.tencent.qbar.b r5 = com.tencent.qbar.C19933b.f56833H     // Catch:{ all -> 0x0422 }
                r5.getClass()     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r7 = "markScanSuccess"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0422 }
                r6 = 1
                r5.f56843b = r6     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.b r5 = com.tencent.qbar.C19933b.f56833H     // Catch:{ all -> 0x0422 }
                r5.getClass()     // Catch:{ all -> 0x0422 }
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0422 }
                java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0422 }
                r8 = 0
                r7[r8] = r6     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "setScanSuccessTime: %s,"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)     // Catch:{ all -> 0x0422 }
                r5.f56845d = r11     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.b r8 = com.tencent.qbar.C19933b.f56833H     // Catch:{ all -> 0x0422 }
                r5 = 0
                java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = r6.f56828e     // Catch:{ all -> 0x0422 }
                java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0422 }
                java.lang.String r10 = r6.f56829f     // Catch:{ all -> 0x0422 }
                java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.a$a r6 = (com.tencent.qbar.C19931a.C19932a) r6     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = r6.f56831h     // Catch:{ all -> 0x0422 }
                boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x0422 }
                if (r7 == 0) goto L_0x0364
                r16 = 0
                goto L_0x036d
            L_0x0364:
                java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x0422 }
                r5 = r7
                com.tencent.qbar.WxQbarNative$QBarReportMsg r5 = (com.tencent.qbar.WxQbarNative.QBarReportMsg) r5     // Catch:{ all -> 0x0422 }
                r16 = r5
            L_0x036d:
                int r13 = r3.size()     // Catch:{ all -> 0x0422 }
                r5 = 0
                r25 = r11
                r11 = r6
                r12 = r16
                r6 = r17
                r7 = 2
                r14 = r5
                r5 = r15
                r15 = r0
                r8.mo27311d(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.b r8 = com.tencent.qbar.C19933b.f56833H     // Catch:{ all -> 0x0422 }
                r8.f56862u = r6     // Catch:{ all -> 0x0422 }
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0422 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0422 }
                r8 = 0
                r9[r8] = r6     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = "MicroMsg.QBarEngineReporter"
                java.lang.String r8 = "alvinluo setWaitingFrameCount: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r8, r9)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.b r6 = com.tencent.qbar.C19933b.f56833H     // Catch:{ all -> 0x0422 }
                r6.mo27309b()     // Catch:{ all -> 0x0422 }
                qs3.b r6 = qs3.C22126b.f62576D     // Catch:{ all -> 0x0422 }
                r6.getClass()     // Catch:{ all -> 0x0422 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0422 }
                r8.<init>()     // Catch:{ all -> 0x0422 }
                java.lang.String r9 = "setScanSuccessTime: "
                r8.append(r9)     // Catch:{ all -> 0x0422 }
                r9 = r25
                r8.append(r9)     // Catch:{ all -> 0x0422 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0422 }
                java.lang.String r11 = "MicroMsg.ScanCodeReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r8)     // Catch:{ all -> 0x0422 }
                r6.f62585e = r9     // Catch:{ all -> 0x0422 }
                r6.f62602v = r7     // Catch:{ all -> 0x0422 }
                r6.mo35213g(r3, r0)     // Catch:{ all -> 0x0422 }
                r6.mo35209c()     // Catch:{ all -> 0x0422 }
                android.os.Bundle r14 = new android.os.Bundle     // Catch:{ all -> 0x0422 }
                r14.<init>()     // Catch:{ all -> 0x0422 }
                java.lang.String r6 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r8 = "alvinluo decodeSuccess result size: %d, isZooming: %b"
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0422 }
                int r9 = r3.size()     // Catch:{ all -> 0x0422 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0422 }
                r10 = 0
                r7[r10] = r9     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r9 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r9 = r9.f56904n     // Catch:{ all -> 0x0422 }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0422 }
                r10 = 1
                r7[r10] = r9     // Catch:{ all -> 0x0422 }
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r8, r7)     // Catch:{ all -> 0x0422 }
                int r6 = r3.size()     // Catch:{ all -> 0x0422 }
                if (r6 <= r10) goto L_0x03f9
                com.tencent.qbar.f r6 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r7 = r6.f56904n     // Catch:{ all -> 0x0422 }
                if (r7 == 0) goto L_0x03f9
                java.lang.String r7 = "decode_success_frame_data"
                com.tencent.qbar.ScanDecodeFrameData r6 = r6.f56907q     // Catch:{ all -> 0x0422 }
                r14.putParcelable(r7, r6)     // Catch:{ all -> 0x0422 }
            L_0x03f9:
                java.lang.String r6 = "decode_debug_string"
                r14.putString(r6, r5)     // Catch:{ all -> 0x0422 }
                java.lang.String r5 = "decode_success_cost_time"
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r8 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                long r8 = r8.f56902l     // Catch:{ all -> 0x0422 }
                long r6 = r6 - r8
                r14.putLong(r5, r6)     // Catch:{ all -> 0x0422 }
                java.lang.String r5 = "ScanIdentifyReportInfo.DecodeKey"
                com.tencent.qbar.ScanIdentifyReportInfo r6 = r1.f56923g     // Catch:{ all -> 0x0422 }
                r14.putParcelable(r5, r6)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f$c r8 = r5.f56899i     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r5 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                long r9 = r5.f56898h     // Catch:{ all -> 0x0422 }
                r11 = r3
                r12 = r2
                r13 = r0
                r8.mo24431c(r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0422 }
                goto L_0x045a
            L_0x0422:
                r0 = move-exception
                goto L_0x0481
            L_0x0424:
                if (r6 == 0) goto L_0x043e
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r2 = r0.f56908r     // Catch:{ all -> 0x0422 }
                if (r2 == 0) goto L_0x043e
                java.lang.String r2 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r3 = "alvinluo onZoomStart"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0422 }
                r2 = 1
                r0.f56904n = r2     // Catch:{ all -> 0x0422 }
                r2 = 0
                r0.f56910t = r2     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.C19938f.m21755b(r0)     // Catch:{ all -> 0x0422 }
            L_0x043e:
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.C19938f.m21756c(r0)     // Catch:{ all -> 0x0422 }
                if (r6 != 0) goto L_0x0453
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                boolean r2 = r0.f56904n     // Catch:{ all -> 0x0422 }
                if (r2 != 0) goto L_0x0453
                com.tencent.qbar.f$c r0 = r0.f56899i     // Catch:{ all -> 0x0422 }
                byte[] r2 = r1.f56922f     // Catch:{ all -> 0x0422 }
                r0.mo24432d(r2)     // Catch:{ all -> 0x0422 }
                goto L_0x045a
            L_0x0453:
                java.lang.String r0 = "MicroMsg.WxScanDecodeQueue"
                java.lang.String r2 = "onDecodeNothing not called"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0422 }
            L_0x045a:
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this     // Catch:{ all -> 0x0422 }
                r2 = 0
                r0.f56900j = r2     // Catch:{ all -> 0x0422 }
                goto L_0x0466
            L_0x0460:
                r0 = 0
                r8.f56900j = r0     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.C19938f.m21756c(r8)     // Catch:{ all -> 0x0422 }
            L_0x0466:
                monitor-exit(r4)     // Catch:{ all -> 0x0422 }
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this
                ss3.a r0 = r0.f56893c
                long r2 = java.lang.System.currentTimeMillis()
                r0.getClass()
                ss3.d r4 = new ss3.d
                r4.<init>(r0, r2)
                zt3.t r0 = zt3.C119157j.f356862d
                zt3.j r0 = (zt3.C119157j) r0
                java.lang.String r2 = "ScanCostManager"
                r0.mo183876g(r4, r2)
                return
            L_0x0481:
                monitor-exit(r4)     // Catch:{ all -> 0x0422 }
                throw r0
            L_0x0483:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0483 }
                throw r0     // Catch:{ all -> 0x0493 }
            L_0x0486:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0486 }
                throw r0     // Catch:{ all -> 0x0493 }
            L_0x0489:
                r18 = r14
                r0 = 0
                r8.f56900j = r0     // Catch:{ all -> 0x0493 }
                com.tencent.qbar.C19938f.m21756c(r8)     // Catch:{ all -> 0x0493 }
                monitor-exit(r18)     // Catch:{ all -> 0x0493 }
                return
            L_0x0493:
                r0 = move-exception
                goto L_0x0498
            L_0x0495:
                r0 = move-exception
                r18 = r14
            L_0x0498:
                r14 = r18
            L_0x049a:
                monitor-exit(r14)     // Catch:{ all -> 0x049c }
                throw r0
            L_0x049c:
                r0 = move-exception
                goto L_0x049a
            L_0x049e:
                com.tencent.qbar.f r0 = com.tencent.qbar.C19938f.this
                r2 = 0
                r0.f56900j = r2
                com.tencent.qbar.C19938f.m21756c(r0)
                return
            L_0x04a7:
                r3 = 0
                r0.f56900j = r3     // Catch:{ all -> 0x04af }
                com.tencent.qbar.C19938f.m21756c(r0)     // Catch:{ all -> 0x04af }
                monitor-exit(r2)     // Catch:{ all -> 0x04af }
                return
            L_0x04af:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x04af }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qbar.C19938f.C19940b.run():void");
        }
    }

    /* renamed from: com.tencent.qbar.f$c */
    public interface C19941c {
        /* renamed from: a */
        void mo24429a(long j, long j2);

        /* renamed from: b */
        void mo24430b(long j, Bundle bundle);

        /* renamed from: c */
        void mo24431c(long j, List<C19931a.C19932a> list, List<QbarNative.QBarPoint> list2, List<WxQbarNative.QBarReportMsg> list3, Bundle bundle);

        /* renamed from: d */
        void mo24432d(byte[] bArr);
    }

    /* renamed from: com.tencent.qbar.f$d */
    public static class C19942d {

        /* renamed from: a */
        public String f56927a = "";

        /* renamed from: b */
        public String f56928b = "";
    }

    public C19938f() {
        int[] iArr = {0};
        this.f56894d = iArr;
        this.f56895e = iArr;
        this.f56896f = new HashMap();
        this.f56897g = new Object();
        this.f56902l = 0;
        this.f56903m = new C19937e("MicroMsg.WxScanDecodeQueue");
        this.f56904n = false;
        this.f56905o = 1000;
        this.f56906p = null;
        this.f56907q = null;
        this.f56908r = false;
        this.f56909s = 2;
        this.f56910t = 0;
        this.f56911u = "";
        this.f56912v = new ConcurrentHashMap<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x002a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21754a(com.tencent.qbar.C19938f r12, java.util.List r13) {
        /*
            boolean r0 = r12.f56904n
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            if (r13 == 0) goto L_0x001d
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x001d
            int r0 = r13.size()
            if (r0 <= r2) goto L_0x001d
            int r0 = r12.f56910t
            int r3 = r12.f56909s
            if (r0 > r3) goto L_0x001d
            r1 = 1
            goto L_0x00ba
        L_0x001d:
            if (r13 == 0) goto L_0x00ba
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00ba
            r0 = 0
            java.util.Iterator r3 = r13.iterator()
        L_0x002a:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "MicroMsg.WxScanDecodeQueue"
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r3.next()
            com.tencent.qbar.a$a r4 = (com.tencent.qbar.C19931a.C19932a) r4
            if (r4 == 0) goto L_0x002a
            java.lang.String r6 = r4.f56829f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r7 = r12.f56912v     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ Exception -> 0x0060 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x0060 }
            if (r7 == 0) goto L_0x0068
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0060 }
            long r10 = r7.longValue()     // Catch:{ Exception -> 0x0060 }
            long r8 = r8 - r10
            int r7 = vl2.C37756o.m41530d()     // Catch:{ Exception -> 0x0060 }
            long r10 = (long) r7     // Catch:{ Exception -> 0x0060 }
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            r7 = 1
            goto L_0x0069
        L_0x005a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r7 = r12.f56912v     // Catch:{ Exception -> 0x0060 }
            r7.remove(r6)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0068
        L_0x0060:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r9 = "isCodeNotRecognize"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r7, r9, r8)
        L_0x0068:
            r7 = 0
        L_0x0069:
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r8[r2] = r6
            java.lang.String r6 = "isCodeNotRecognize  code:%s, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r8)
            if (r7 == 0) goto L_0x002a
            if (r0 != 0) goto L_0x0082
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0082:
            r0.add(r4)
            goto L_0x002a
        L_0x0086:
            if (r0 == 0) goto L_0x00ba
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x00ba
            java.util.Iterator r12 = r0.iterator()
        L_0x0092:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r12.next()
            com.tencent.qbar.a$a r0 = (com.tencent.qbar.C19931a.C19932a) r0
            if (r0 == 0) goto L_0x0092
            r13.remove(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ignoreResults remove ignoreResult: "
            r2.append(r3)
            java.lang.String r0 = r0.f56829f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0092
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qbar.C19938f.m21754a(com.tencent.qbar.f, java.util.List):boolean");
    }

    /* renamed from: b */
    public static void m21755b(C19938f fVar) {
        Log.m105925i("MicroMsg.WxScanDecodeQueue", "alvinluo triggerZoomFinishTimer zoomDuration: %d", Long.valueOf(fVar.f56905o));
        Runnable runnable = fVar.f56906p;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
        if (fVar.f56906p == null) {
            fVar.f56906p = new C22128d(fVar);
        }
        MMHandlerThread.postToMainThreadDelayed(fVar.f56906p, fVar.f56905o);
    }

    /* renamed from: c */
    public static void m21756c(C19938f fVar) {
        if (!((HashMap) fVar.f56896f).isEmpty()) {
            long j = fVar.f56898h;
            if (j != 0) {
                Log.m105925i("MicroMsg.WxScanDecodeQueue", "%d decode hit cache", Long.valueOf(j));
                ThreadPool.post(new C19940b(fVar.f56898h), "WxScanDecodeQueue_Decode_Gray");
                return;
            }
        }
        synchronized (fVar.f56897g) {
            if (fVar.f56899i != null) {
                fVar.f56899i.mo24429a(fVar.f56898h, 0);
            }
        }
    }

    /* renamed from: d */
    public void mo27326d(byte[] bArr, Point point, int i, Rect rect) {
        Point point2 = point;
        synchronized (this.f56897g) {
            Log.m105919d("MicroMsg.WxScanDecodeQueue", "%d submit crop gray", Long.valueOf(this.f56898h));
            if (this.f56898h != 0) {
                ThreadPool.post(new C19939a(System.currentTimeMillis(), this.f56898h, bArr, point, i, rect), "WxScanDecodeQueue_Crop_Gray");
            }
            if (this.f56904n && this.f56908r) {
                byte[] bArr2 = bArr;
                this.f56907q = new ScanDecodeFrameData(bArr, point2.x, point2.y, i);
            }
        }
    }

    /* renamed from: e */
    public void mo27327e(Context context) {
        synchronized (this.f56903m) {
            if (!this.f56903m.f59753c) {
                QbarNative.QbarAiModelParam Gw = ((C21473d0) C86312j.m106911c(C21473d0.class)).mo33645Gw();
                this.f56911u = Gw != null ? Gw.detectModelVersion : "";
                this.f56903m.mo33089f(context, 0, Gw);
                C19937e eVar = this.f56903m;
                if (eVar.f59753c) {
                    eVar.mo27322b();
                    this.f56903m.mo33091h(this.f56895e);
                }
                C36788a aVar = this.f56893c;
                aVar.getClass();
                Log.m105924i("MicroMsg.ScanCostManager", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                aVar.f97701g = false;
                aVar.f97702h = System.currentTimeMillis();
            }
        }
        this.f56908r = true;
        this.f56905o = 1000;
        this.f56909s = 2;
        Log.m105925i("MicroMsg.WxScanDecodeQueue", "alvinluo initScanDecodeQueue needShowSuccessFrameWhenZoom: %b, zoomDuration: %d, ignoreFrameNum: %d", true, Long.valueOf(this.f56905o), Integer.valueOf(this.f56909s));
        int i = C37756o.m41531e() == 1 ? 1722 : 1229;
        Log.m105924i("MicroMsg.WxScanDecodeQueue", "QBar init report, WxScanDecodeQueue idKey:" + i);
        C115669n.INSTANCE.mo175913w((long) i, 21, 1);
    }

    /* renamed from: f */
    public void mo27328f() {
        Log.m105924i("MicroMsg.WxScanDecodeQueue", "release QBar");
        this.f56895e = this.f56894d;
        mo27330h(this.f56898h);
        synchronized (this.f56903m) {
            this.f56903m.mo33090g();
        }
        C19933b.f56833H.f56860s = 1.0f;
        Runnable runnable = this.f56906p;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
        C36788a aVar = this.f56893c;
        aVar.getClass();
        if (System.currentTimeMillis() - aVar.f97702h < 1000 || aVar.f97698d < 5) {
            Log.m105928w("MicroMsg.ScanCostManager", "releaseAndDumpCost start not over 1s and ignore");
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(new C36794e(aVar), "ScanCostManager");
        }
        try {
            this.f56912v.clear();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxScanDecodeQueue", e, "resetNoRecognizeCodeStringData", new Object[0]);
        }
    }

    /* renamed from: g */
    public void mo27329g(long j, int i, C19942d dVar, C19941c cVar) {
        synchronized (this.f56897g) {
            C19933b.f56833H.mo27310c();
            C19933b bVar = C19933b.f56833H;
            bVar.getClass();
            bVar.f56858q = System.currentTimeMillis();
            C19933b.f56833H.mo27313f(0);
            C19933b bVar2 = C19933b.f56833H;
            bVar2.getClass();
            Log.m105925i("MicroMsg.QBarEngineReporter", "alvinluo setReportTabType tabType: %d", Integer.valueOf(i));
            bVar2.f56857p = i;
            C19933b bVar3 = C19933b.f56833H;
            bVar3.getClass();
            if (dVar != null) {
                bVar3.f56838D = dVar.f56927a;
                bVar3.f56839E = dVar.f56928b;
            }
            C22126b bVar4 = C22126b.f62576D;
            bVar4.mo35211e();
            int i2 = i == 4 ? 2 : 1;
            Log.m105925i("MicroMsg.ScanCodeReporter", "setScanScene, scene: %s", Integer.valueOf(i2));
            bVar4.f62586f = i2;
            if (dVar != null) {
                String str = dVar.f56927a;
                C87412m.m108593f(str, "sessionInfo.tabSession");
                bVar4.f62592l = str;
                String str2 = dVar.f56928b;
                C87412m.m108593f(str2, "sessionInfo.scanSession");
                bVar4.f62593m = str2;
                bVar4.f62582b = System.currentTimeMillis();
            }
            this.f56898h = j;
            this.f56899i = cVar;
            this.f56901k = 0;
            this.f56902l = System.currentTimeMillis();
            this.f56893c.getClass();
        }
        synchronized (this.f56903m) {
            C19937e eVar = this.f56903m;
            if (eVar.f59753c) {
                synchronized (eVar.f59754d) {
                    C19931a aVar = eVar.f59752b;
                    if (aVar != null) {
                        ((C19936d) aVar).mo27319g(false);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo27330h(long j) {
        synchronized (this.f56897g) {
            if (this.f56898h == j) {
                this.f56898h = 0;
                this.f56901k = 0;
                this.f56899i = null;
                ((HashMap) this.f56896f).clear();
                this.f56904n = false;
                this.f56902l = 0;
                this.f56893c.f97697c = -1;
            }
        }
        Runnable runnable = this.f56906p;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
    }
}
