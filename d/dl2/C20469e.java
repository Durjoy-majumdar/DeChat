package dl2;

import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import cl2.C28609a;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nl2.C21683r;
import zt3.C119157j;

/* renamed from: dl2.e */
public class C20469e {

    /* renamed from: u */
    public static int f57529u = C28609a.f78504d;

    /* renamed from: v */
    public static C20469e f57530v = new C20469e();

    /* renamed from: w */
    public static volatile C20471b f57531w = null;

    /* renamed from: x */
    public static volatile C20471b f57532x = null;

    /* renamed from: a */
    public boolean f57533a;

    /* renamed from: b */
    public volatile boolean f57534b;

    /* renamed from: c */
    public C20473d f57535c;

    /* renamed from: d */
    public C20472c f57536d;

    /* renamed from: e */
    public boolean f57537e;

    /* renamed from: f */
    public int f57538f = 0;

    /* renamed from: g */
    public SensorManager f57539g;

    /* renamed from: h */
    public Sensor f57540h;

    /* renamed from: i */
    public boolean f57541i = false;

    /* renamed from: j */
    public long f57542j = 0;

    /* renamed from: k */
    public C20474e f57543k = new C20474e();

    /* renamed from: l */
    public float f57544l;

    /* renamed from: m */
    public float f57545m;

    /* renamed from: n */
    public float f57546n;

    /* renamed from: o */
    public float f57547o;

    /* renamed from: p */
    public float f57548p;

    /* renamed from: q */
    public float f57549q;

    /* renamed from: r */
    public double f57550r;

    /* renamed from: s */
    public long f57551s;

    /* renamed from: t */
    public long f57552t;

    /* renamed from: dl2.e$a */
    public class C20470a implements C19027m0 {

        /* renamed from: d */
        public final /* synthetic */ Point f57553d;

        /* renamed from: e */
        public final /* synthetic */ int f57554e;

        /* renamed from: f */
        public final /* synthetic */ int f57555f;

        /* renamed from: g */
        public final /* synthetic */ boolean f57556g;

        public C20470a(Point point, int i, int i2, boolean z) {
            this.f57553d = point;
            this.f57554e = i;
            this.f57555f = i2;
            this.f57556g = z;
        }

        public void run() {
            C20469e.this.mo32020d(this.f57553d, this.f57554e, this.f57555f, this.f57556g);
        }
    }

    /* renamed from: dl2.e$b */
    public static class C20471b {

        /* renamed from: a */
        public long f57558a;

        /* renamed from: b */
        public byte[] f57559b;
    }

    /* renamed from: dl2.e$c */
    public class C20472c {

        /* renamed from: a */
        public int f57560a = 0;

        /* renamed from: b */
        public int f57561b = 0;

        /* renamed from: c */
        public int f57562c = 0;

        /* renamed from: d */
        public int f57563d = 0;

        /* renamed from: e */
        public int f57564e = 0;

        /* renamed from: f */
        public int f57565f = 0;

        /* renamed from: g */
        public int f57566g = 0;

        /* renamed from: h */
        public int f57567h = 0;

        /* renamed from: i */
        public int f57568i = 0;

        /* renamed from: j */
        public int f57569j = 0;

        /* renamed from: k */
        public int f57570k = 0;

        /* renamed from: l */
        public int f57571l = 0;

        /* renamed from: m */
        public int f57572m = 0;

        /* renamed from: n */
        public int f57573n = 0;

        /* renamed from: o */
        public int f57574o = 0;

        /* renamed from: p */
        public int f57575p = 0;

        /* renamed from: q */
        public int f57576q = 0;

        /* renamed from: r */
        public int f57577r = 0;

        public C20472c(C20469e eVar) {
        }
    }

    /* renamed from: dl2.e$d */
    public interface C20473d {
        /* renamed from: a */
        void mo24327a(C21683r rVar);
    }

    /* renamed from: dl2.e$e */
    public class C20474e implements SensorEventListener {
        public C20474e() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.m105918d("MicroMsg.ReIdAiScanImageDecodeQueue", "onAccuracyChanged:  accuracy=" + i);
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            if (sensorEvent != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                C20469e eVar = C20469e.this;
                eVar.f57544l = f;
                eVar.f57545m = f2;
                eVar.f57546n = f3;
                eVar.f57551s = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: e */
    public static void m22085e(C19027m0 m0Var) {
        ((C119157j) C119157j.f356862d).mo183876g(m0Var, "ReIdAiScanImageDecodeQueue_decode_task");
    }

    /* renamed from: a */
    public void mo32017a(byte[] bArr, Point point, int i, int i2, boolean z) {
        C20472c cVar;
        double d;
        byte[] bArr2 = bArr;
        if (!this.f57537e) {
            Log.m105920e("MicroMsg.ReIdAiScanImageDecodeQueue", "addDecodeTask is not working");
        } else if (bArr2 == null || bArr2.length == 0) {
            Log.m105920e("MicroMsg.ReIdAiScanImageDecodeQueue", "addDecodeTask previewData is empty");
        } else {
            C20472c cVar2 = this.f57536d;
            boolean z2 = true;
            if (cVar2 != null) {
                cVar2.f57560a++;
            }
            int i3 = this.f57538f;
            if (i3 < f57529u) {
                this.f57538f = i3 + 1;
                if (cVar2 != null) {
                    cVar2.f57562c++;
                }
                Log.m105926v("MicroMsg.ReIdAiScanImageDecodeQueue", "addDecodeTask skip frame, hasSkipCount:" + this.f57538f);
                return;
            }
            this.f57538f = 0;
            if (C28609a.f78510j) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.f57542j;
                this.f57542j = currentTimeMillis;
                long j2 = this.f57551s;
                if (currentTimeMillis - j2 <= 1000) {
                    long j3 = this.f57552t;
                    if (j2 > j3) {
                        long j4 = j2 - j3;
                        float f = this.f57544l;
                        float f2 = f - this.f57547o;
                        float f3 = this.f57545m;
                        float f4 = f3 - this.f57548p;
                        float f5 = this.f57546n;
                        float f6 = f5 - this.f57549q;
                        this.f57547o = f;
                        this.f57548p = f3;
                        this.f57549q = f5;
                        this.f57552t = j2;
                        this.f57550r = (((Math.pow((double) f2, 2.0d) + Math.pow((double) f4, 2.0d)) + Math.pow((double) f6, 2.0d)) / ((double) j4)) * 100.0d;
                        Log.m105927v("MicroMsg.ReIdAiScanImageDecodeQueue", "getShakeDeltaFromLastDetect  dx:%f, dy:%f, dz:%f, shakeDelta:%f, timeInterval:%d", Float.valueOf(f2), Float.valueOf(f4), Float.valueOf(f6), Double.valueOf(this.f57550r), Long.valueOf(j4));
                        d = this.f57550r;
                    } else {
                        Log.m105928w("MicroMsg.ReIdAiScanImageDecodeQueue", "getShakeDeltaFromLastDetect  return last delta " + this.f57550r);
                        d = this.f57550r;
                    }
                    if (BuildInfo.DEBUG) {
                        if (d > 8.0d) {
                            Log.m105920e("MicroMsg.ReIdAiScanImageDecodeQueue", "isWithinAcceptableShakeRange：" + d + "   duration:" + j);
                        } else if (d > 4.0d) {
                            Log.m105928w("MicroMsg.ReIdAiScanImageDecodeQueue", "isWithinAcceptableShakeRange：" + d + "   duration:" + j);
                        } else {
                            Log.m105918d("MicroMsg.ReIdAiScanImageDecodeQueue", "isWithinAcceptableShakeRange：" + d + "   duration:" + j);
                        }
                    }
                    z2 = d < 4.0d;
                }
            }
            if (!z2) {
                Log.m105920e("MicroMsg.ReIdAiScanImageDecodeQueue", "addDecodeTask beyond shake range");
                C20472c cVar3 = this.f57536d;
                if (cVar3 != null) {
                    cVar3.f57563d++;
                }
                m22085e(new C20477h(this));
                return;
            }
            if (!(f57531w == null || f57532x == null || f57531w.f57558a == f57532x.f57558a || (cVar = this.f57536d) == null)) {
                cVar.f57561b++;
            }
            if (this.f57536d != null) {
                Log.m105924i("MicroMsg.ReIdAiScanImageDecodeQueue", "addDecodeTask deal img:" + this.f57536d.f57564e);
            }
            C20471b bVar = new C20471b();
            bVar.f57559b = bArr;
            bVar.f57558a = System.currentTimeMillis();
            f57531w = bVar;
            mo32018b(point, i, i2, z, true);
        }
    }

    /* renamed from: b */
    public final void mo32018b(Point point, int i, int i2, boolean z, boolean z2) {
        if (this.f57534b) {
            Log.m105928w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image is decoding");
        } else if (f57531w == null) {
            Log.m105928w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage sPendingImage is null");
        } else if (f57532x == null || f57531w.f57558a != f57532x.f57558a) {
            this.f57534b = true;
            C20472c cVar = this.f57536d;
            if (cVar != null) {
                cVar.f57564e++;
            }
            if (z2) {
                m22085e(new C20470a(point, i, i2, z));
            } else {
                mo32020d(point, i, i2, z);
            }
        } else {
            Log.m105928w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image id is same, do not decode");
        }
    }

    /* renamed from: c */
    public void mo32019c() {
        if (this.f57537e && C28609a.f78510j) {
            if (this.f57539g == null) {
                this.f57539g = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            }
            SensorManager sensorManager = this.f57539g;
            if (sensorManager != null && this.f57540h == null) {
                this.f57540h = sensorManager.getDefaultSensor(10);
            }
            if (this.f57539g != null && this.f57540h != null && !this.f57541i) {
                Log.m105924i("MicroMsg.ReIdAiScanImageDecodeQueue", "startSensorShakeDetect");
                this.f57539g.registerListener(this.f57543k, this.f57540h, 3);
                this.f57541i = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32020d(android.graphics.Point r24, int r25, int r26, boolean r27) {
        /*
            r23 = this;
            r6 = r23
            r1 = r24
            r3 = r26
            dl2.a r0 = dl2.C20461a.f57497j
            r0 = 17
            r2 = 4
            if (r3 == r0) goto L_0x0016
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r3 == r0) goto L_0x0014
            r0 = -1
            goto L_0x0017
        L_0x0014:
            r0 = 4
            goto L_0x0017
        L_0x0016:
            r0 = 3
        L_0x0017:
            dl2.e$b r5 = f57531w
            java.lang.String r14 = "MicroMsg.ReIdAiScanImageDecodeQueue"
            r15 = 1
            r13 = 0
            if (r5 != 0) goto L_0x0027
            java.lang.String r0 = "runDecodeTaskImpl sPendingImage is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r4 = 0
            goto L_0x0077
        L_0x0027:
            boolean r5 = r6.f57533a
            if (r5 != 0) goto L_0x004d
            java.lang.String r5 = "runDecodeTaskImpl ScanFastFocusEngineManager init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            int r7 = r1.x
            int r8 = r1.y
            r12 = 1
            boolean r5 = cl2.C28609a.m38281a()
            r9 = r0
            r10 = r25
            r11 = r27
            r4 = 0
            r13 = r5
            int r5 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20102h(r7, r8, r9, r10, r11, r12, r13)
            if (r5 != 0) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            r6.f57533a = r13
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            boolean r5 = r6.f57533a
            if (r5 != 0) goto L_0x0059
            java.lang.String r0 = "runDecodeTaskImpl ffe init fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x0077
        L_0x0059:
            dl2.e$c r5 = r6.f57536d
            if (r5 == 0) goto L_0x0068
            int r7 = r5.f57565f
            int r7 = r7 + r15
            r5.f57565f = r7
            int r5 = r5.f57567h
            if (r5 <= 0) goto L_0x0068
            r13 = 1
            goto L_0x0069
        L_0x0068:
            r13 = 0
        L_0x0069:
            dl2.e$b r5 = f57531w
            f57532x = r5
            dl2.e$b r5 = f57532x
            if (r5 != 0) goto L_0x007b
            java.lang.String r0 = "runDecodeTaskImpl sDecodingImage is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
        L_0x0077:
            r0 = 0
            r15 = 0
            goto L_0x02a0
        L_0x007b:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r1
            dl2.e$b r7 = f57532x
            byte[] r7 = r7.f57559b
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r15] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r25)
            r12 = 2
            r5[r12] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)
            r8 = 3
            r5[r8] = r7
            java.lang.String r7 = "runDecodeTaskImpl resolution: %s, previewData length: %d, cameraRotation: %d, previewFormat: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r5)
            dl2.e$b r5 = f57532x
            byte[] r5 = r5.f57559b
            int r14 = r1.y
            int r11 = r1.x
            dl2.e$c r10 = r6.f57536d
            com.tencent.mm.plugin.scanner.model.i0 r7 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53455a
            java.lang.String r7 = "imageData"
            gy3.C87412m.m108594g(r5, r7)
            boolean r7 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53461g
            java.lang.String r9 = "MicroMsg.ScanFastFocusEngineManager"
            if (r7 == 0) goto L_0x0271
            long r16 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r7 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            r7.resetStatus()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r7 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            r8 = r5
            r18 = r9
            r9 = r14
            r19 = r10
            r10 = r11
            r20 = r11
            r11 = r0
            r0 = 2
            r12 = r25
            com.tencent.mm.plugin.scanner.model.ScanProductInfo[] r7 = r7.getScanProductInfoList(r8, r9, r10, r11, r12)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r16
            ol2.a r10 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53470p
            if (r10 == 0) goto L_0x00e7
            int r11 = (int) r8
            java.util.List<java.lang.Integer> r10 = r10.f61778c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r11)
        L_0x00e7:
            r10 = 7
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r11 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r11 = r11.trackInfoCount
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r4] = r11
            r10[r15] = r7
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            r10[r0] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)
            r12 = 3
            r10[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r10[r2] = r11
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r11 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r11 = r11.detectType
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 5
            r10[r12] = r11
            r11 = 6
            int r14 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r10[r11] = r14
            java.lang.String r11 = "getScanProductInfoList result: %d, result: %s, cost: %d, width: %d, height: %d, detectType: %d, scanNoResultFrameNum: %s"
            r14 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r11, r10)
            long r10 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53471q
            java.lang.String r12 = "MicroMsg.ScanProductPerformanceHelper"
            r17 = -1
            int r20 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r20 == 0) goto L_0x015d
            ol2.a r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53470p
            if (r0 == 0) goto L_0x015d
            long r20 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53469o
            long r2 = r0.f61776a
            int r22 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r22 == 0) goto L_0x013b
            goto L_0x015d
        L_0x013b:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Long r20 = java.lang.Long.valueOf(r2)
            r1[r4] = r20
            java.lang.String r4 = "finishScanProduct %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r4, r1)
            java.util.HashMap<java.lang.Long, ol2.a$a> r0 = r0.f61777b
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Object r0 = r0.get(r1)
            ol2.a$a r0 = (ol2.C21795a.C21796a) r0
            if (r0 != 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r0.f61780b = r2
        L_0x015d:
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53471q = r0
            ol2.a r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53470p
            if (r2 == 0) goto L_0x0194
            long r3 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53469o
            long r10 = r2.f61776a
            int r21 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r21 == 0) goto L_0x0170
            goto L_0x0194
        L_0x0170:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r10 = new java.lang.Object[r15]
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r20 = 0
            r10[r20] = r11
            java.lang.String r11 = "startScanProduct %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r11, r10)
            ol2.a$a r10 = new ol2.a$a
            r11 = 0
            r10.<init>(r3, r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap<java.lang.Long, ol2.a$a> r1 = r2.f61777b
            r1.put(r0, r10)
        L_0x0194:
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r1 = r0.trackInfoCount
            if (r1 <= 0) goto L_0x01ef
            if (r7 == 0) goto L_0x01ef
            r1 = 0
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c = r1
            nl2.r r0 = new nl2.r
            r0.<init>()
            r0.f61382c = r15
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r1 = r1.trackInfoCount
            r0.f61384e = r1
            r2 = 0
            r3 = 0
        L_0x01ae:
            if (r2 >= r1) goto L_0x01db
            java.lang.Object r4 = sx3.C110823p.m150982H(r7, r2)
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r4 = (com.tencent.p014mm.plugin.scanner.model.ScanProductInfo) r4
            if (r4 == 0) goto L_0x01d8
            boolean r5 = r4.getShouldShow()
            if (r5 == 0) goto L_0x01bf
            r3 = 1
        L_0x01bf:
            java.util.ArrayList<nl2.q> r5 = r0.f61383d
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r10 = new com.tencent.mm.plugin.scanner.model.ScanProductInfo
            r10.<init>()
            r10.copy(r4)
            nl2.q r4 = new nl2.q
            r4.<init>(r10)
            nl2.q$a r10 = r4.f61363f
            r10.f61370f = r8
            r10 = 0
            r4.f61359b = r10
            r5.add(r4)
        L_0x01d8:
            int r2 = r2 + 1
            goto L_0x01ae
        L_0x01db:
            r2 = r19
            if (r2 == 0) goto L_0x0283
            if (r3 == 0) goto L_0x01e8
            int r1 = r2.f57567h
            int r1 = r1 + r15
            r2.f57567h = r1
            goto L_0x0283
        L_0x01e8:
            int r1 = r2.f57566g
            int r1 = r1 + r15
            r2.f57566g = r1
            goto L_0x0283
        L_0x01ef:
            r2 = r19
            int r0 = r0.detectType
            r1 = 4
            if (r0 != r1) goto L_0x0239
            if (r2 == 0) goto L_0x01fd
            int r0 = r2.f57566g
            int r0 = r0 + r15
            r2.f57566g = r0
        L_0x01fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getScanProductInfoList detect by server, scanNoResultFrameNum: "
            r0.append(r1)
            int r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c
            r0.append(r1)
            java.lang.String r1 = ", isDetectingByServer: "
            r0.append(r1)
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53458d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            nl2.r r0 = new nl2.r
            r0.<init>()
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53456b
            if (r1 == 0) goto L_0x022c
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53458d
            if (r1 != 0) goto L_0x022c
            r1 = 1
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            r0.f61385f = r1
            if (r1 == 0) goto L_0x0283
            r0.f61386g = r5
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53458d = r15
            r1 = 0
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c = r1
            goto L_0x0283
        L_0x0239:
            dl2.e r1 = f57530v
            dl2.e$c r1 = r1.f57536d
            if (r1 == 0) goto L_0x026b
            if (r0 == 0) goto L_0x0266
            r2 = 2
            if (r0 == r2) goto L_0x0260
            r2 = 3
            if (r0 == r2) goto L_0x025a
            r2 = 4
            if (r0 == r2) goto L_0x0254
            r2 = 5
            if (r0 == r2) goto L_0x024e
            goto L_0x026b
        L_0x024e:
            int r0 = r1.f57577r
            int r0 = r0 + r15
            r1.f57577r = r0
            goto L_0x026b
        L_0x0254:
            int r0 = r1.f57576q
            int r0 = r0 + r15
            r1.f57576q = r0
            goto L_0x026b
        L_0x025a:
            int r0 = r1.f57575p
            int r0 = r0 + r15
            r1.f57575p = r0
            goto L_0x026b
        L_0x0260:
            int r0 = r1.f57573n
            int r0 = r0 + r15
            r1.f57573n = r0
            goto L_0x026b
        L_0x0266:
            int r0 = r1.f57574o
            int r0 = r0 + r15
            r1.f57574o = r0
        L_0x026b:
            int r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c
            int r0 = r0 + r15
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53457c = r0
            goto L_0x0272
        L_0x0271:
            r14 = r9
        L_0x0272:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53461g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "getScanProductInfoList result null isInit: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r0)
            r0 = 0
        L_0x0283:
            dl2.e$c r1 = r6.f57536d
            if (r1 == 0) goto L_0x028d
            if (r13 != 0) goto L_0x028d
            int r2 = r1.f57567h
            r1.f57568i = r2
        L_0x028d:
            if (r0 == 0) goto L_0x0298
            r1 = 3
            r0.f61380a = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f61381b = r1
        L_0x0298:
            dl2.e$d r1 = r6.f57535c
            if (r1 == 0) goto L_0x029f
            r1.mo24327a(r0)
        L_0x029f:
            r0 = 0
        L_0x02a0:
            r6.f57534b = r0
            if (r15 == 0) goto L_0x02b2
            r5 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r0.mo32018b(r1, r2, r3, r4, r5)
        L_0x02b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.C20469e.mo32020d(android.graphics.Point, int, int, boolean):void");
    }

    /* renamed from: f */
    public final void mo32021f() {
        if (C28609a.f78510j) {
            if (this.f57539g != null && this.f57541i) {
                Log.m105924i("MicroMsg.ReIdAiScanImageDecodeQueue", "stopSensorShakeDetect");
                this.f57539g.unregisterListener(this.f57543k);
            }
            this.f57541i = false;
        }
    }
}
