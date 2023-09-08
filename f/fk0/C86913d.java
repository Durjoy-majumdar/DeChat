package fk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83184t;
import com.tencent.p014mm.wexnet.SessionKeeper;
import com.tencent.p014mm.wexnet.TensorCpuB;
import com.tencent.p014mm.wexnet.XnetDataKind;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import sx3.C64197v;

/* renamed from: fk0.d */
public final class C86913d extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1092;
    public static final String NAME = "runInferenceSession";

    /* renamed from: g */
    public static final C86914a f252250g = new C86914a((C8480h) null);

    /* renamed from: h */
    public static final List<String> f252251h = C64197v.m75537f("uint8", "int8", "uint32", "int32", "float32", "int64");

    /* renamed from: fk0.d$a */
    public static final class C86914a {
        public C86914a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo121364a(String str) {
            C87412m.m108594g(str, "type");
            switch (str.hashCode()) {
                case -844996807:
                    if (str.equals("uint32")) {
                        return XnetDataKind.INSTANCE.getStorageDataKindUInt32();
                    }
                    break;
                case -766443077:
                    if (str.equals("float32")) {
                        return XnetDataKind.INSTANCE.getStorageDataKindFloat32();
                    }
                    break;
                case 3237417:
                    if (str.equals("int8")) {
                        return XnetDataKind.INSTANCE.getStorageDataKindInt8();
                    }
                    break;
                case 100359822:
                    if (str.equals("int32")) {
                        return XnetDataKind.INSTANCE.getStorageDataKindInt32();
                    }
                    break;
                case 100359917:
                    if (str.equals("int64")) {
                        return XnetDataKind.INSTANCE.getStorageDataKindInt64();
                    }
                    break;
                case 111289374:
                    if (str.equals("uint8")) {
                        return XnetDataKind.getStorageDataKindUInt8();
                    }
                    break;
            }
            throw new RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
        }

        /* renamed from: b */
        public final String mo121365b(int i) {
            if (i == XnetDataKind.getStorageDataKindUInt8()) {
                return "uint8";
            }
            XnetDataKind xnetDataKind = XnetDataKind.INSTANCE;
            if (i == xnetDataKind.getStorageDataKindInt8()) {
                return "int8";
            }
            if (i == xnetDataKind.getStorageDataKindUInt32()) {
                return "uint32";
            }
            if (i == xnetDataKind.getStorageDataKindInt32()) {
                return "int32";
            }
            if (i == xnetDataKind.getStorageDataKindFloat32()) {
                return "float32";
            }
            if (i == xnetDataKind.getStorageDataKindInt64()) {
                return "int64";
            }
            throw new RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
        }
    }

    /* renamed from: fk0.d$b */
    public static final class C86915b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86913d f252252d;

        /* renamed from: e */
        public final /* synthetic */ SessionKeeper f252253e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, TensorCpuB> f252254f;

        /* renamed from: g */
        public final /* synthetic */ HashMap<String, TensorCpuB> f252255g;

        /* renamed from: h */
        public final /* synthetic */ C82381f f252256h;

        /* renamed from: i */
        public final /* synthetic */ int f252257i;

        /* renamed from: j */
        public final /* synthetic */ List<Integer> f252258j;

        /* renamed from: n */
        public final /* synthetic */ int f252259n;

        /* renamed from: o */
        public final /* synthetic */ double f252260o;

        /* renamed from: p */
        public final /* synthetic */ C83184t f252261p;

        public C86915b(C86913d dVar, SessionKeeper sessionKeeper, HashMap<String, TensorCpuB> hashMap, HashMap<String, TensorCpuB> hashMap2, C82381f fVar, int i, List<Integer> list, int i2, double d, C83184t tVar) {
            this.f252252d = dVar;
            this.f252253e = sessionKeeper;
            this.f252254f = hashMap;
            this.f252255g = hashMap2;
            this.f252256h = fVar;
            this.f252257i = i;
            this.f252258j = list;
            this.f252259n = i2;
            this.f252260o = d;
            this.f252261p = tVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x025f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r5 = r1.f252256h;
            r6 = r1.f252257i;
            r7 = r1.f252252d;
            r7.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0271, code lost:
            if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG != false) goto L_0x0273;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0273, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004010, "fail:environment not ready");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0283, code lost:
            r3 = new org.json.JSONObject();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r3.put("errno", 2004010);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x028c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0297, code lost:
            r5.mo109647a(r6, r7.mo115115p("fail:environment not ready", r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x029e, code lost:
            r0 = r1.f252258j;
            r2 = r1.f252261p;
            r0 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x02aa, code lost:
            if (r0.hasNext() != false) goto L_0x02ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ac, code lost:
            r2.mo115400U(((java.lang.Number) r0.next()).intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x02ba, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x02bb, code lost:
            r2 = r1.f252258j;
            r3 = r1.f252261p;
            r2 = r2.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x02c7, code lost:
            if (r2.hasNext() != false) goto L_0x02c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x02c9, code lost:
            r3.mo115400U(((java.lang.Number) r2.next()).intValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x02d7, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0261 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r24 = this;
                r1 = r24
                java.lang.String r2 = "makeReturnJson with JSONObject, put errno, e=%s"
                java.lang.String r0 = "errno"
                java.lang.String r3 = "makeReturnJson, errno: %d, reason: %s"
                java.lang.String r4 = "MicroMsg.AppBrandJsApi"
                fk0.d r5 = r1.f252252d
                double r5 = r5.mo121363w()
                com.tencent.mm.wexnet.WeXNet$a r10 = com.tencent.p014mm.wexnet.WeXNet.Companion     // Catch:{ a -> 0x0261 }
                com.tencent.mm.wexnet.SessionKeeper r11 = r1.f252253e     // Catch:{ a -> 0x0261 }
                java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> r12 = r1.f252254f     // Catch:{ a -> 0x0261 }
                java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> r13 = r1.f252255g     // Catch:{ a -> 0x0261 }
                com.tencent.mm.wexnet.Result r10 = r10.mo120039b(r11, r12, r13)     // Catch:{ a -> 0x0261 }
                fk0.d r11 = r1.f252252d     // Catch:{ a -> 0x0261 }
                double r11 = r11.mo121363w()     // Catch:{ a -> 0x0261 }
                double r11 = r11 - r5
                java.util.List<java.lang.Integer> r13 = r1.f252258j
                com.tencent.mm.plugin.appbrand.jsruntime.t r14 = r1.f252261p
                java.util.Iterator r13 = r13.iterator()
            L_0x002b:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x003f
                java.lang.Object r15 = r13.next()
                java.lang.Number r15 = (java.lang.Number) r15
                int r15 = r15.intValue()
                r14.mo115400U(r15)
                goto L_0x002b
            L_0x003f:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "[runResult] for sessionId["
                r13.append(r14)
                int r14 = r1.f252259n
                r13.append(r14)
                java.lang.String r14 = "] status.success["
                r13.append(r14)
                boolean r14 = r10.getSuccess()
                r13.append(r14)
                r14 = 93
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "MicroMsg.JsApiRunInferenceSession"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
                boolean r13 = r10.getSuccess()
                java.lang.String r15 = "format(format, *args)"
                java.lang.String r9 = ""
                if (r13 == 0) goto L_0x01cf
                java.util.HashMap r10 = new java.util.HashMap
                r10.<init>()
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>()
                java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> r8 = r1.f252255g
                java.util.Set r8 = r8.keySet()
                java.lang.String r7 = "tensorCpuBOutMap.keys"
                gy3.C87412m.m108593f(r8, r7)
                java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> r7 = r1.f252255g
                r16 = r14
                com.tencent.mm.plugin.appbrand.jsapi.f r14 = r1.f252256h
                r17 = r11
                int r11 = r1.f252257i
                fk0.d r12 = r1.f252252d
                java.util.Iterator r8 = r8.iterator()
            L_0x0098:
                boolean r19 = r8.hasNext()
                if (r19 == 0) goto L_0x016f
                java.lang.Object r19 = r8.next()
                r20 = r8
                r8 = r19
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r19 = r7.get(r8)
                com.tencent.mm.wexnet.TensorCpuB r19 = (com.tencent.p014mm.wexnet.TensorCpuB) r19
                if (r19 == 0) goto L_0x0161
                r21 = r7
                java.lang.String r7 = "name"
                gy3.C87412m.m108593f(r8, r7)
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                r22 = r5
                fk0.d$a r5 = fk0.C86913d.f252250g     // Catch:{ RuntimeException -> 0x0102 }
                int r6 = r19.getDateType()     // Catch:{ RuntimeException -> 0x0102 }
                java.lang.String r5 = r5.mo121365b(r6)     // Catch:{ RuntimeException -> 0x0102 }
                java.lang.String r6 = "type"
                r7.put(r6, r5)
                com.tencent.mm.plugin.appbrand.jsruntime.i r5 = r14.getJsRuntime()
                java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.t> r6 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83184t.class
                com.tencent.mm.plugin.appbrand.jsruntime.j r5 = r5.mo63321n0(r6)
                com.tencent.mm.plugin.appbrand.jsruntime.t r5 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83184t) r5
                java.nio.ByteBuffer r6 = r19.getData()
                r6.clear()
                java.nio.ByteBuffer r6 = r19.getData()
                zg.g r1 = p774zg.C91708g.RW
                int r1 = r5.mo115409d1(r6, r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r5 = "data"
                r7.put(r5, r1)
                int[] r1 = r19.getDataShape()
                java.lang.String r5 = "shape"
                r7.put(r5, r1)
                r13.put(r8, r7)
                goto L_0x0165
            L_0x0102:
                r1 = 2004006(0x1e9426, float:2.80821E-39)
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r9)
                int r9 = r19.getDateType()
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                r9 = 0
                r6[r9] = r7
                r7 = 1
                r6[r7] = r8
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
                java.lang.String r5 = "fail:data type[%s] for output tensor[%s] is unsupported"
                java.lang.String r5 = java.lang.String.format(r5, r6)
                gy3.C87412m.m108593f(r5, r15)
                r12.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x0145
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r8 = 0
                r6[r8] = r7
                r7 = 1
                r6[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r6)
            L_0x0145:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r3.put(r0, r1)     // Catch:{ Exception -> 0x014e }
                goto L_0x0159
            L_0x014e:
                r0 = move-exception
                r1 = r0
                r6 = 1
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r6 = 0
                r0[r6] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
            L_0x0159:
                java.lang.String r0 = r12.mo115115p(r5, r3)
                r14.mo109647a(r11, r0)
                return
            L_0x0161:
                r22 = r5
                r21 = r7
            L_0x0165:
                r1 = r24
                r8 = r20
                r7 = r21
                r5 = r22
                goto L_0x0098
            L_0x016f:
                r22 = r5
                java.lang.String r0 = "output"
                r10.put(r0, r13)
                r1 = r24
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f252256h
                int r2 = r1.f252257i
                fk0.d r3 = r1.f252252d
                fl0.c r4 = fl0.C86920e.f252311a
                java.lang.String r3 = r3.mo115116q(r0, r4, r10)
                r0.mo109647a(r2, r3)
                fk0.d r0 = r1.f252252d
                double r2 = r0.mo121363w()
                double r2 = r2 - r22
                double r4 = r1.f252260o
                double r2 = r2 + r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "runInferenceSession invoke totalCost["
                r0.append(r4)
                java.text.DecimalFormat r4 = new java.text.DecimalFormat
                java.lang.String r5 = ".000"
                r4.<init>(r5)
                java.lang.String r2 = r4.format(r2)
                r0.append(r2)
                java.lang.String r2 = " ms]  nativeRunCost["
                r0.append(r2)
                java.text.DecimalFormat r2 = new java.text.DecimalFormat
                r2.<init>(r5)
                r11 = r17
                java.lang.String r2 = r2.format(r11)
                r0.append(r2)
                java.lang.String r2 = " ms]"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = r16
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x025e
            L_0x01cf:
                long[] r5 = r10.getCodes()
                int r6 = r5.length
                r11 = r9
                r7 = 0
                r8 = 0
            L_0x01d7:
                if (r7 >= r6) goto L_0x0210
                r12 = r5[r7]
                int r14 = r8 + 1
                r16 = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r11)
                r5.append(r12)
                r11 = 58
                r5.append(r11)
                java.lang.String[] r11 = r10.getDesc()
                int r11 = r11.length
                if (r11 <= r8) goto L_0x01fd
                java.lang.String[] r11 = r10.getDesc()
                r8 = r11[r8]
                goto L_0x01fe
            L_0x01fd:
                r8 = r9
            L_0x01fe:
                r5.append(r8)
                r8 = 10
                r5.append(r8)
                java.lang.String r11 = r5.toString()
                int r7 = r7 + 1
                r8 = r14
                r5 = r16
                goto L_0x01d7
            L_0x0210:
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.f252256h
                int r6 = r1.f252257i
                fk0.d r7 = r1.f252252d
                r8 = 2004009(0x1e9429, float:2.808215E-39)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r12 = 0
                r10[r12] = r11
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r9)
                java.lang.String r9 = "fail:run session fail(%s)"
                java.lang.String r9 = java.lang.String.format(r9, r10)
                gy3.C87412m.m108593f(r9, r15)
                r7.getClass()
                boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r10 == 0) goto L_0x0243
                r10 = 2
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                r12 = 0
                r10[r12] = r11
                r11 = 1
                r10[r11] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r10)
            L_0x0243:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r3.put(r0, r8)     // Catch:{ Exception -> 0x024c }
                goto L_0x0257
            L_0x024c:
                r0 = move-exception
                r8 = r0
                r10 = 1
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r10 = 0
                r0[r10] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
            L_0x0257:
                java.lang.String r0 = r7.mo115115p(r9, r3)
                r5.mo109647a(r6, r0)
            L_0x025e:
                return
            L_0x025f:
                r0 = move-exception
                goto L_0x02bb
            L_0x0261:
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.f252256h     // Catch:{ all -> 0x025f }
                int r6 = r1.f252257i     // Catch:{ all -> 0x025f }
                fk0.d r7 = r1.f252252d     // Catch:{ all -> 0x025f }
                r7.getClass()     // Catch:{ all -> 0x025f }
                r8 = 2004010(0x1e942a, float:2.808216E-39)
                java.lang.String r9 = "fail:environment not ready"
                boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x025f }
                if (r10 == 0) goto L_0x0283
                r10 = 2
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x025f }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x025f }
                r12 = 0
                r10[r12] = r11     // Catch:{ all -> 0x025f }
                r11 = 1
                r10[r11] = r9     // Catch:{ all -> 0x025f }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r10)     // Catch:{ all -> 0x025f }
            L_0x0283:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x025f }
                r3.<init>()     // Catch:{ all -> 0x025f }
                r3.put(r0, r8)     // Catch:{ Exception -> 0x028c }
                goto L_0x0297
            L_0x028c:
                r0 = move-exception
                r8 = r0
                r10 = 1
                java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x025f }
                r10 = 0
                r0[r10] = r8     // Catch:{ all -> 0x025f }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)     // Catch:{ all -> 0x025f }
            L_0x0297:
                java.lang.String r0 = r7.mo115115p(r9, r3)     // Catch:{ all -> 0x025f }
                r5.mo109647a(r6, r0)     // Catch:{ all -> 0x025f }
                java.util.List<java.lang.Integer> r0 = r1.f252258j
                com.tencent.mm.plugin.appbrand.jsruntime.t r2 = r1.f252261p
                java.util.Iterator r0 = r0.iterator()
            L_0x02a6:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x02ba
                java.lang.Object r3 = r0.next()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r2.mo115400U(r3)
                goto L_0x02a6
            L_0x02ba:
                return
            L_0x02bb:
                java.util.List<java.lang.Integer> r2 = r1.f252258j
                com.tencent.mm.plugin.appbrand.jsruntime.t r3 = r1.f252261p
                java.util.Iterator r2 = r2.iterator()
            L_0x02c3:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x02d7
                java.lang.Object r4 = r2.next()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                r3.mo115400U(r4)
                goto L_0x02c3
            L_0x02d7:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fk0.C86913d.C86915b.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x03dd  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r23, org.json.JSONObject r24, int r25) {
        /*
            r22 = this;
            r13 = r22
            r6 = r23
            r0 = r24
            r7 = r25
            if (r6 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r1 = "MicroMsg.JsApiRunInferenceSession"
            java.lang.String r2 = "[invoke] start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            double r1 = r22.mo121363w()
            r3 = -1
            if (r0 == 0) goto L_0x0022
            java.lang.String r4 = "sessionId"
            int r4 = r0.optInt(r4, r3)
            r14 = r4
            goto L_0x0023
        L_0x0022:
            r14 = -1
        L_0x0023:
            r4 = 2
            r5 = 0
            r15 = 1
            if (r14 != r3) goto L_0x005f
            r0 = 2004002(0x1e9422, float:2.808205E-39)
            java.lang.String r1 = "fail:sessionId is empty"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x0042
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r5] = r4
            r2[r15] = r1
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)
        L_0x0042:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x0057
        L_0x004d:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r5] = r0
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
        L_0x0057:
            java.lang.String r0 = r13.mo115115p(r1, r2)
            r6.mo109647a(r7, r0)
            return
        L_0x005f:
            if (r0 == 0) goto L_0x0068
            java.lang.String r3 = "input"
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == 0) goto L_0x03f8
            java.util.Iterator r3 = r0.keys()
            boolean r3 = r3.hasNext()
            if (r3 != 0) goto L_0x0077
            goto L_0x03f8
        L_0x0077:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.tencent.mm.plugin.appbrand.jsruntime.i r3 = r23.getJsRuntime()
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.t> r9 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83184t.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r3 = r3.mo63321n0(r9)
            r12 = r3
            com.tencent.mm.plugin.appbrand.jsruntime.t r12 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83184t) r12
            if (r12 != 0) goto L_0x00c0
            r0 = 4
            java.lang.String r1 = "fail:internal error"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x00a3
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r5] = r4
            r2[r15] = r1
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)
        L_0x00a3:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00b8
        L_0x00ae:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r5] = r0
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
        L_0x00b8:
            java.lang.String r0 = r13.mo115115p(r1, r2)
            r6.mo109647a(r7, r0)
            return
        L_0x00c0:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r0.keys()     // Catch:{ all -> 0x03d5 }
            java.lang.String r9 = "inputJSONObj.keys()"
            gy3.C87412m.m108593f(r3, r9)     // Catch:{ all -> 0x03d5 }
        L_0x00ce:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x03d5 }
            if (r9 == 0) goto L_0x0303
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x03d5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x03d5 }
            org.json.JSONObject r11 = r0.optJSONObject(r9)     // Catch:{ all -> 0x03d5 }
            if (r11 == 0) goto L_0x02f6
            java.lang.String r15 = "type"
            java.lang.String r5 = ""
            java.lang.String r5 = r11.optString(r15, r5)     // Catch:{ all -> 0x03d5 }
            java.util.List<java.lang.String> r15 = f252251h     // Catch:{ all -> 0x03d5 }
            boolean r15 = r15.contains(r5)     // Catch:{ all -> 0x03d5 }
            r4 = 2004004(0x1e9424, float:2.808208E-39)
            if (r15 != 0) goto L_0x015b
            java.lang.String r0 = "fail:data type[%s] for input tensor[%s] is unsupported"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x03d5 }
            r3 = 0
            r2[r3] = r5     // Catch:{ all -> 0x03d5 }
            r3 = 1
            r2[r3] = r9     // Catch:{ all -> 0x03d5 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x03d5 }
            java.lang.String r1 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ all -> 0x03d5 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x03d5 }
            java.lang.String r2 = "MicroMsg.AppBrandJsApi"
            if (r0 == 0) goto L_0x0124
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x03d5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r0[r5] = r3     // Catch:{ all -> 0x03d5 }
            r3 = 1
            r0[r3] = r1     // Catch:{ all -> 0x03d5 }
            java.lang.String r3 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r0)     // Catch:{ all -> 0x03d5 }
        L_0x0124:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x03d5 }
            r3.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "errno"
            r3.put(r0, r4)     // Catch:{ Exception -> 0x012f }
            goto L_0x013b
        L_0x012f:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)     // Catch:{ all -> 0x03d5 }
        L_0x013b:
            java.lang.String r0 = r13.mo115115p(r1, r3)     // Catch:{ all -> 0x03d5 }
            r6.mo109647a(r7, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r0 = r10.iterator()
        L_0x0146:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.mo115400U(r1)
            goto L_0x0146
        L_0x015a:
            return
        L_0x015b:
            java.lang.String r15 = "shape"
            org.json.JSONArray r15 = r11.optJSONArray(r15)     // Catch:{ all -> 0x03d5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03d5 }
            r4.<init>()     // Catch:{ all -> 0x03d5 }
            if (r15 == 0) goto L_0x0186
            r18 = r0
            int r0 = r15.length()     // Catch:{ all -> 0x03d5 }
            r19 = r3
            r3 = 0
        L_0x0172:
            if (r3 >= r0) goto L_0x018a
            int r20 = r15.getInt(r3)     // Catch:{ all -> 0x03d5 }
            r21 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x03d5 }
            r4.add(r0)     // Catch:{ all -> 0x03d5 }
            int r3 = r3 + 1
            r0 = r21
            goto L_0x0172
        L_0x0186:
            r18 = r0
            r19 = r3
        L_0x018a:
            int r0 = r4.size()     // Catch:{ all -> 0x03d5 }
            if (r0 != 0) goto L_0x01e4
            r0 = 2004008(0x1e9428, float:2.808213E-39)
            java.lang.String r1 = "fail:invalid shape"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x03d5 }
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x01ad
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x03d5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r2[r5] = r4     // Catch:{ all -> 0x03d5 }
            r4 = 1
            r2[r4] = r1     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)     // Catch:{ all -> 0x03d5 }
        L_0x01ad:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x03d5 }
            r2.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x01b8 }
            goto L_0x01c4
        L_0x01b8:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)     // Catch:{ all -> 0x03d5 }
        L_0x01c4:
            java.lang.String r0 = r13.mo115115p(r1, r2)     // Catch:{ all -> 0x03d5 }
            r6.mo109647a(r7, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r0 = r10.iterator()
        L_0x01cf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.mo115400U(r1)
            goto L_0x01cf
        L_0x01e3:
            return
        L_0x01e4:
            java.lang.String r0 = "data"
            int r0 = r11.optInt(r0)     // Catch:{ all -> 0x03d5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d5 }
            r10.add(r3)     // Catch:{ all -> 0x03d5 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03d5 }
            java.nio.ByteBuffer r0 = r12.mo115403Y0(r0)     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x028f
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x03d5 }
            r0.order(r3)     // Catch:{ all -> 0x03d5 }
            fk0.d$a r3 = f252250g     // Catch:{ RuntimeException -> 0x0222 }
            java.lang.String r11 = "type"
            gy3.C87412m.m108593f(r5, r11)     // Catch:{ RuntimeException -> 0x0222 }
            int r3 = r3.mo121364a(r5)     // Catch:{ RuntimeException -> 0x0222 }
            r0.clear()     // Catch:{ all -> 0x03d5 }
            java.lang.String r5 = "name"
            gy3.C87412m.m108593f(r9, r5)     // Catch:{ all -> 0x03d5 }
            com.tencent.mm.wexnet.TensorCpuB r5 = new com.tencent.mm.wexnet.TensorCpuB     // Catch:{ all -> 0x03d5 }
            int[] r4 = sx3.C110818d0.m150952x0(r4)     // Catch:{ all -> 0x03d5 }
            r5.<init>(r3, r4, r0)     // Catch:{ all -> 0x03d5 }
            r8.put(r9, r5)     // Catch:{ all -> 0x03d5 }
            goto L_0x02fa
        L_0x0222:
            java.lang.String r0 = "fail:data type[%s] for input tensor[%s] is unsupported"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x03d5 }
            r3 = 0
            r2[r3] = r5     // Catch:{ all -> 0x03d5 }
            r3 = 1
            r2[r3] = r9     // Catch:{ all -> 0x03d5 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x03d5 }
            java.lang.String r1 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ all -> 0x03d5 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x03d5 }
            java.lang.String r2 = "MicroMsg.AppBrandJsApi"
            if (r0 == 0) goto L_0x0255
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x03d5 }
            r3 = 2004004(0x1e9424, float:2.808208E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03d5 }
            r3 = 0
            r0[r3] = r4     // Catch:{ all -> 0x03d5 }
            r3 = 1
            r0[r3] = r1     // Catch:{ all -> 0x03d5 }
            java.lang.String r3 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r0)     // Catch:{ all -> 0x03d5 }
        L_0x0255:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x03d5 }
            r3.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "errno"
            r4 = 2004004(0x1e9424, float:2.808208E-39)
            r3.put(r0, r4)     // Catch:{ Exception -> 0x0263 }
            goto L_0x026f
        L_0x0263:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)     // Catch:{ all -> 0x03d5 }
        L_0x026f:
            java.lang.String r0 = r13.mo115115p(r1, r3)     // Catch:{ all -> 0x03d5 }
            r6.mo109647a(r7, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r0 = r10.iterator()
        L_0x027a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x028e
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.mo115400U(r1)
            goto L_0x027a
        L_0x028e:
            return
        L_0x028f:
            r0 = 2004007(0x1e9427, float:2.808212E-39)
            java.lang.String r1 = "fail:input tensor [%s] data is invalid"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x03d5 }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x03d5 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x03d5 }
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x03d5 }
            java.lang.String r2 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ all -> 0x03d5 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x03d5 }
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x02bf
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x03d5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r2[r5] = r4     // Catch:{ all -> 0x03d5 }
            r4 = 1
            r2[r4] = r1     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)     // Catch:{ all -> 0x03d5 }
        L_0x02bf:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x03d5 }
            r2.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x02ca }
            goto L_0x02d6
        L_0x02ca:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)     // Catch:{ all -> 0x03d5 }
        L_0x02d6:
            java.lang.String r0 = r13.mo115115p(r1, r2)     // Catch:{ all -> 0x03d5 }
            r6.mo109647a(r7, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r0 = r10.iterator()
        L_0x02e1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02f5
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.mo115400U(r1)
            goto L_0x02e1
        L_0x02f5:
            return
        L_0x02f6:
            r18 = r0
            r19 = r3
        L_0x02fa:
            r0 = r18
            r3 = r19
            r4 = 2
            r5 = 0
            r15 = 1
            goto L_0x00ce
        L_0x0303:
            java.lang.Class<bi0.a> r0 = bi0.C79706a.class
            ra.b r0 = r6.mo109668l(r0)     // Catch:{ all -> 0x03d5 }
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x03d5 }
            r3 = r0
            bi0.a r3 = (bi0.C79706a) r3     // Catch:{ all -> 0x03d5 }
            monitor-enter(r3)     // Catch:{ all -> 0x03d3 }
            java.util.Map<java.lang.Integer, com.tencent.mm.wexnet.SessionKeeper> r0 = r3.f233618e     // Catch:{ all -> 0x03ca }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x03ca }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ all -> 0x03ca }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x03ca }
            com.tencent.mm.wexnet.SessionKeeper r0 = (com.tencent.p014mm.wexnet.SessionKeeper) r0     // Catch:{ all -> 0x03ca }
            monitor-exit(r3)     // Catch:{ all -> 0x03d3 }
            if (r0 != 0) goto L_0x0375
            r0 = 2004005(0x1e9425, float:2.808209E-39)
            java.lang.String r1 = "fail:invalid session id"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x03d5 }
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x033e
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x03d5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r2[r5] = r4     // Catch:{ all -> 0x03d5 }
            r4 = 1
            r2[r4] = r1     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)     // Catch:{ all -> 0x03d5 }
        L_0x033e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x03d5 }
            r2.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0355
        L_0x0349:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d5 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)     // Catch:{ all -> 0x03d5 }
        L_0x0355:
            java.lang.String r0 = r13.mo115115p(r1, r2)     // Catch:{ all -> 0x03d5 }
            r6.mo109647a(r7, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r0 = r10.iterator()
        L_0x0360:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0374
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.mo115400U(r1)
            goto L_0x0360
        L_0x0374:
            return
        L_0x0375:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x03d5 }
            r5.<init>()     // Catch:{ all -> 0x03d5 }
            double r3 = r22.mo121363w()     // Catch:{ all -> 0x03d5 }
            double r16 = r3 - r1
            java.lang.String r15 = r23.getAppId()     // Catch:{ all -> 0x03c3 }
            java.lang.String r1 = "env.appId"
            gy3.C87412m.m108593f(r15, r1)     // Catch:{ all -> 0x03c3 }
            fk0.d$b r11 = new fk0.d$b     // Catch:{ all -> 0x03c3 }
            r1 = r11
            r2 = r22
            r3 = r0
            r4 = r8
            r6 = r23
            r7 = r25
            r8 = r10
            r9 = r14
            r18 = r10
            r0 = r11
            r10 = r16
            r23 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)     // Catch:{ all -> 0x03c1 }
            zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ all -> 0x03c1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c1 }
            r2.<init>()     // Catch:{ all -> 0x03c1 }
            java.lang.String r3 = "SessionRunnerGuard+"
            r2.append(r3)     // Catch:{ all -> 0x03c1 }
            r2.append(r15)     // Catch:{ all -> 0x03c1 }
            r3 = 43
            r2.append(r3)     // Catch:{ all -> 0x03c1 }
            r2.append(r14)     // Catch:{ all -> 0x03c1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03c1 }
            zt3.j r1 = (zt3.C119157j) r1     // Catch:{ all -> 0x03c1 }
            r1.mo183871b(r0, r2)     // Catch:{ all -> 0x03c1 }
            return
        L_0x03c1:
            r0 = move-exception
            goto L_0x03c8
        L_0x03c3:
            r0 = move-exception
            r18 = r10
            r23 = r12
        L_0x03c8:
            r5 = 1
            goto L_0x03db
        L_0x03ca:
            r0 = move-exception
            r18 = r10
            r23 = r12
            monitor-exit(r3)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x03d1:
            r0 = move-exception
            goto L_0x03da
        L_0x03d3:
            r0 = move-exception
            goto L_0x03d6
        L_0x03d5:
            r0 = move-exception
        L_0x03d6:
            r18 = r10
            r23 = r12
        L_0x03da:
            r5 = 0
        L_0x03db:
            if (r5 != 0) goto L_0x03f7
            java.util.Iterator r1 = r18.iterator()
        L_0x03e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03f7
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r23
            r3.mo115400U(r2)
            goto L_0x03e1
        L_0x03f7:
            throw r0
        L_0x03f8:
            r0 = 2004003(0x1e9423, float:2.808206E-39)
            java.lang.String r1 = "fail:input tensors is empty"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r3 = "MicroMsg.AppBrandJsApi"
            if (r2 == 0) goto L_0x0415
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r2[r5] = r4
            r4 = 1
            r2[r4] = r1
            java.lang.String r4 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)
        L_0x0415:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "errno"
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0420 }
            goto L_0x042c
        L_0x0420:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
        L_0x042c:
            java.lang.String r0 = r13.mo115115p(r1, r2)
            r6.mo109647a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk0.C86913d.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public final double mo121363w() {
        return ((double) System.nanoTime()) / 1000000.0d;
    }
}
