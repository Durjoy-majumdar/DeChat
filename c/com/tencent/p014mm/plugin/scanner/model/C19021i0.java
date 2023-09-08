package com.tencent.p014mm.plugin.scanner.model;

import android.content.SharedPreferences;
import android.graphics.RectF;
import com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo;
import com.tencent.p014mm.plugin.scanner.model.C106067f0;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ol2.C21795a;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import te3.C51734vs2;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.i0 */
public final class C19021i0 {

    /* renamed from: a */
    public static final C19021i0 f53455a;

    /* renamed from: b */
    public static boolean f53456b = true;

    /* renamed from: c */
    public static int f53457c;

    /* renamed from: d */
    public static transient boolean f53458d;

    /* renamed from: e */
    public static MultiProcessMMKV f53459e;

    /* renamed from: f */
    public static ScanFastFocusEngineNative f53460f = new ScanFastFocusEngineNative();

    /* renamed from: g */
    public static boolean f53461g;

    /* renamed from: h */
    public static int f53462h = -1;

    /* renamed from: i */
    public static String f53463i;

    /* renamed from: j */
    public static boolean f53464j;

    /* renamed from: k */
    public static boolean f53465k;

    /* renamed from: l */
    public static C106084y0 f53466l = new C106084y0();

    /* renamed from: m */
    public static int f53467m;

    /* renamed from: n */
    public static int f53468n;

    /* renamed from: o */
    public static long f53469o;

    /* renamed from: p */
    public static C21795a f53470p;

    /* renamed from: q */
    public static long f53471q = -1;

    /* renamed from: r */
    public static final C13601g f53472r = C36568h.m40985a(C19022a.f53475d);

    /* renamed from: s */
    public static boolean f53473s;

    /* renamed from: t */
    public static boolean f53474t;

    /* renamed from: com.tencent.mm.plugin.scanner.model.i0$a */
    public static final class C19022a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C19022a f53475d = new C19022a();

        public C19022a() {
            super(0);
        }

        public Object invoke() {
            int i = 0;
            try {
                int nativeFocusEngineVersion = C19021i0.f53460f.nativeFocusEngineVersion();
                Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "focusEngineVersion " + nativeFocusEngineVersion);
                i = nativeFocusEngineVersion;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", th, "getFocusEngineVersion exception", new Object[0]);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.i0$b */
    public static final class C19023b implements C106067f0.C106068a {

        /* renamed from: a */
        public final /* synthetic */ int f53476a;

        public C19023b(int i) {
            this.f53476a = i;
        }

        /* renamed from: a */
        public void mo24272a(int i, int i2, String str) {
            Log.m105921e("MicroMsg.ScanFastFocusEngineManager", "alvinluo updateScanConfig onFailed errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }

        /* renamed from: b */
        public void mo24273b(C51734vs2 vs22) {
            MultiProcessMMKV multiProcessMMKV;
            SharedPreferences.Editor putString;
            MultiProcessMMKV multiProcessMMKV2;
            SharedPreferences.Editor putString2;
            SharedPreferences.Editor putString3;
            MultiProcessMMKV multiProcessMMKV3;
            SharedPreferences.Editor putString4;
            MultiProcessMMKV multiProcessMMKV4;
            SharedPreferences.Editor putString5;
            SharedPreferences.Editor putString6;
            if (vs22 != null) {
                boolean z = false;
                Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "alvinluo updateScanConfig onSuccess type: %d, version: %s, config: %s, guide: %s", Integer.valueOf(vs22.f143677d), vs22.f143678e, vs22.f143679f, vs22.f143680g);
                C19021i0 i0Var = C19021i0.f53455a;
                int i = this.f53476a;
                i0Var.mo24270m(i, System.currentTimeMillis());
                if (i == 2) {
                    String str = vs22.f143679f;
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (!z && (multiProcessMMKV = C19021i0.f53459e) != null && (putString = multiProcessMMKV.putString("scan_config_focus_engine_config", vs22.f143679f)) != null) {
                        putString.apply();
                    }
                } else if (i != 3) {
                    String str2 = "";
                    if (i == 4) {
                        String str3 = vs22.f143679f;
                        if (str3 == null || str3.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            String str4 = vs22.f143679f;
                            if (str4 != null) {
                                str2 = str4;
                            }
                            C19021i0.f53463i = str2;
                            MultiProcessMMKV multiProcessMMKV5 = C19021i0.f53459e;
                            if (multiProcessMMKV5 != null && (putString3 = multiProcessMMKV5.putString("scan_config_phash_config", str4)) != null) {
                                putString3.apply();
                            }
                        }
                    } else if (i == 6) {
                        String str5 = vs22.f143679f;
                        if (!(str5 == null || str5.length() == 0)) {
                            MultiProcessMMKV multiProcessMMKV6 = C19021i0.f53459e;
                            if (!(multiProcessMMKV6 == null || (putString6 = multiProcessMMKV6.putString("scan_config_scan_merge_engine_config", vs22.f143679f)) == null)) {
                                putString6.apply();
                            }
                            String str6 = vs22.f143679f;
                            if (str6 != null) {
                                str2 = str6;
                            }
                            ((C119157j) C119157j.f356862d).mo183875f(new C19026l0(str2));
                        }
                        String str7 = vs22.f143680g;
                        if (!((str7 == null || str7.length() == 0) || (multiProcessMMKV4 = C19021i0.f53459e) == null || (putString5 = multiProcessMMKV4.putString("scan_config_scan_merge_wording", vs22.f143680g)) == null)) {
                            putString5.apply();
                        }
                        String str8 = vs22.f143681h;
                        if (str8 == null || str8.length() == 0) {
                            z = true;
                        }
                        if (!z && (multiProcessMMKV3 = C19021i0.f53459e) != null && (putString4 = multiProcessMMKV3.putString("scan_config_scan_retrieval_lite_succ_wording", vs22.f143681h)) != null) {
                            putString4.apply();
                        }
                    }
                } else {
                    String str9 = vs22.f143679f;
                    if (str9 == null || str9.length() == 0) {
                        z = true;
                    }
                    if (!z && (multiProcessMMKV2 = C19021i0.f53459e) != null && (putString2 = multiProcessMMKV2.putString("scan_config_guide_wording", vs22.f143679f)) != null) {
                        putString2.apply();
                    }
                }
            }
        }
    }

    static {
        C19021i0 i0Var = new C19021i0();
        f53455a = i0Var;
        i0Var.mo24268b();
    }

    /* renamed from: a */
    public static final Integer m20096a(C19021i0 i0Var, String str, String str2, String str3) {
        boolean z;
        i0Var.getClass();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            int groupCount = matcher.groupCount();
            Log.m105918d("MicroMsg.ScanFastFocusEngineManager", "getScanProductServerConfigByKey groupCount: " + groupCount);
            if (groupCount > 0) {
                String group = matcher.group();
                C87412m.m108593f(group, "matcher.group()");
                List U = C112550d0.m153785U(group, new String[]{"="}, false, 0, 6, (Object) null);
                if (U.size() >= 2) {
                    boolean z2 = false;
                    String str4 = (String) C110818d0.m150917O(U, 0);
                    String str5 = (String) C110818d0.m150917O(U, 1);
                    if (str4 != null) {
                        if (str3 != null) {
                            z = str4.contentEquals(str3);
                        } else if (str3 instanceof String) {
                            z = C87412m.m108589b(str4, str3);
                        } else {
                            if (str4 != str3) {
                                if (str3 != null && str4.length() == str3.length()) {
                                    int length = str4.length();
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        } else if (str4.charAt(i) != str3.charAt(i)) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        }
                        if (z) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getScanProductServerConfigByKey key: " + str3 + ", value: " + str5);
                        return Integer.valueOf(Util.safeParseInt(str5));
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final ScanImagePHashInfo m20097c(byte[] bArr, int i, int i2, boolean z) {
        String str;
        C87412m.m108594g(bArr, "imageData");
        if (!ScanFastFocusEngineNative.isSoLoaded()) {
            return null;
        }
        ScanFastFocusEngineNative scanFastFocusEngineNative = f53460f;
        String str2 = "";
        if (f53463i == null) {
            MultiProcessMMKV multiProcessMMKV = f53459e;
            if (multiProcessMMKV == null || (str = multiProcessMMKV.getString("scan_config_phash_config", str2)) == null) {
                str = str2;
            }
            f53463i = str;
        }
        C19021i0 i0Var = f53455a;
        if (i0Var.mo24269i(4)) {
            i0Var.mo24271n(4);
        }
        String str3 = f53463i;
        if (str3 != null) {
            str2 = str3;
        }
        scanFastFocusEngineNative.setPHashConfig(str2);
        return f53460f.computeImagePHash(bArr, i, i2, z);
    }

    /* renamed from: d */
    public static final GoodsObject m20098d() {
        if (!f53461g) {
            return null;
        }
        Log.m105927v("MicroMsg.ScanFastFocusEngineManager", "alvinluo getCropObject %f, %f, %f, %f", Float.valueOf(f53460f.cropObject.relative_minx), Float.valueOf(f53460f.cropObject.relative_maxx), Float.valueOf(f53460f.cropObject.relative_miny), Float.valueOf(f53460f.cropObject.relative_maxy));
        return f53460f.cropObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.scanner.model.ScanFastFocusEngineNative m20099e(int r11, float r12, float r13, float r14, float r15) {
        /*
            boolean r0 = f53461g
            r1 = 0
            if (r0 == 0) goto L_0x006d
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r0 = f53460f
            r0.resetStatus()
            android.graphics.RectF r12 = m20100f(r12, r13, r14, r15)
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r15 = 0
            r14[r15] = r12
            java.lang.String r0 = "MicroMsg.ScanFastFocusEngineManager"
            java.lang.String r4 = "getCropYUVByTrackId expandCropSize: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r4, r14)
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r5 = f53460f
            float r7 = r12.left
            float r8 = r12.top
            float r9 = r12.right
            float r10 = r12.bottom
            r6 = r11
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r12 = r5.getCropYUVByTrackId(r6, r7, r8, r9, r10)
            long r4 = java.lang.System.currentTimeMillis()
            r14 = 6
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r15] = r11
            byte[] r11 = r12.bestImageData
            r14[r13] = r11
            r13 = 2
            if (r11 == 0) goto L_0x0047
            int r11 = r11.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
        L_0x0047:
            r14[r13] = r1
            r11 = 3
            long r4 = r4 - r2
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r14[r11] = r13
            r11 = 4
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r13 = f53460f
            int r13 = r13.width
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r11] = r13
            r11 = 5
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r13 = f53460f
            int r13 = r13.height
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r11] = r13
            java.lang.String r11 = "getCropYUVByTrackId trackId: %s, result image: %s, yuv size: %d, cost: %d, width: %d, height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r11, r14)
            return r12
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19021i0.m20099e(int, float, float, float, float):com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative");
    }

    /* renamed from: f */
    public static final RectF m20100f(float f, float f2, float f3, float f4) {
        float f5 = (1.2f - ((float) 1)) / 2.0f;
        float f6 = (f3 - f) * f5;
        float f7 = (f4 - f2) * f5;
        return new RectF(Math.max(0.0f, f - f6), Math.max(0.0f, f2 - f7), Math.min(1.0f, f3 + f6), Math.min(1.0f, f4 + f7));
    }

    /* renamed from: g */
    public static final C106084y0 m20101g() {
        Integer num = null;
        if (!f53461g) {
            return null;
        }
        f53466l.f315843a = f53460f.getPointObjects();
        C106084y0 y0Var = f53466l;
        int i = f53460f.pointCount;
        y0Var.f315844b = i;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(f53466l.hashCode());
        ScanPoint[] scanPointArr = f53466l.f315843a;
        if (scanPointArr != null) {
            num = Integer.valueOf(scanPointArr.hashCode());
        }
        objArr[2] = num;
        Log.m105927v("MicroMsg.ScanFastFocusEngineManager", "alvinluo getPointObjects pointCount: %d, hashCode: %d, %d", objArr);
        return f53466l;
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0370, code lost:
        if (r0 == 13) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d7, code lost:
        if (r9 == null) goto L_0x02dc;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m20102h(int r23, int r24, int r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            r0 = r28
            r14 = r29
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            boolean r2 = f53461g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r15 = 0
            r1[r15] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r13 = 1
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r3 = 2
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r3 = 3
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r12 = 4
            r1[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r27)
            r3 = 5
            r1[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r29)
            r11 = 6
            r1[r11] = r2
            java.lang.String r10 = "MicroMsg.ScanFastFocusEngineManager"
            java.lang.String r2 = "alvinluo initFocusEngine isInit: %b, width: %d, height: %d, pixelFormat: %s, cameraRotation: %d, useAI: %b, useXNet: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            boolean r1 = f53461g
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "alvinluo initFocusEngine has inited and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return r15
        L_0x004b:
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.ScanFastFocusEngineNative.tryLoadLibrary()
            if (r1 != 0) goto L_0x0053
            r0 = -1
            return r0
        L_0x0053:
            long r16 = java.lang.System.currentTimeMillis()
            r6 = r26
            int r1 = r6 % 360
            r2 = r1 ^ 360(0x168, float:5.04E-43)
            int r3 = -r1
            r3 = r3 | r1
            r2 = r2 & r3
            int r2 = r2 >> 31
            r2 = r2 & 360(0x168, float:5.04E-43)
            int r1 = r1 + r2
            if (r1 == 0) goto L_0x006c
            f53467m = r24
            f53468n = r23
            goto L_0x0070
        L_0x006c:
            f53467m = r23
            f53468n = r24
        L_0x0070:
            java.lang.String r9 = ""
            r8 = 1259(0x4eb, float:1.764E-42)
            if (r14 == 0) goto L_0x010e
            java.lang.Class<q00.i> r1 = q00.C62571i.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            q00.i r2 = (q00.C62571i) r2
            q00.f r2 = r2.mo87567IR()
            java.lang.String r3 = "MODEL_CSC_DET"
            java.lang.String r2 = r2.mo11889a(r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            java.lang.String r4 = "MicroMsg.ScanProductModelConfigManager"
            if (r3 != 0) goto L_0x00a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "cscDetectModelPath not exist: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            pl2.C21998b.f62253a = r9
            goto L_0x00ac
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            r2 = r9
        L_0x00aa:
            pl2.C21998b.f62253a = r2
        L_0x00ac:
            di3.d r1 = di3.C86312j.m106911c(r1)
            q00.i r1 = (q00.C62571i) r1
            q00.f r1 = r1.mo87567IR()
            java.lang.String r2 = "MODEL_SCAN_CLS"
            java.lang.String r1 = r1.mo11889a(r2)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 != 0) goto L_0x00da
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "scanClsModelPath not exist: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            pl2.C21998b.f62254b = r9
            goto L_0x00df
        L_0x00da:
            if (r1 != 0) goto L_0x00dd
            r1 = r9
        L_0x00dd:
            pl2.C21998b.f62254b = r1
        L_0x00df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initScanProductModelConfig detectModel: "
            r1.append(r2)
            java.lang.String r2 = pl2.C21998b.f62253a
            r1.append(r2)
            java.lang.String r2 = ", scanClsModel: "
            r1.append(r2)
            java.lang.String r2 = pl2.C21998b.f62254b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r3 = 233(0xe9, float:3.27E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r15] = r3
            r1.mo160131h(r8, r2)
        L_0x010e:
            nl2.n$a r1 = nl2.C21678n.f61347f
            nl2.n r7 = r1.mo33946a(r0, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "alvinluo initFocusEngine useXNet: "
            r1.append(r2)
            boolean r2 = r7.f61352e
            r1.append(r2)
            java.lang.String r2 = ", binPath: "
            r1.append(r2)
            java.lang.String r2 = r7.f61348a
            r1.append(r2)
            java.lang.String r2 = ", paramPath: "
            r1.append(r2)
            java.lang.String r2 = r7.f61349b
            r1.append(r2)
            java.lang.String r2 = ", opBinPath: "
            r1.append(r2)
            java.lang.String r2 = r7.f61351d
            r1.append(r2)
            java.lang.String r2 = ", opParamPath: "
            r1.append(r2)
            java.lang.String r2 = r7.f61350c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r1 = f53460f
            r4 = 0
            java.lang.String r5 = r7.f61348a
            java.lang.String r3 = r7.f61349b
            java.lang.String r2 = r7.f61350c
            java.lang.String r11 = r7.f61351d
            boolean r13 = r7.f61352e
            r18 = r2
            r2 = r23
            r19 = r3
            r3 = r24
            r20 = r5
            r5 = r25
            r6 = r26
            r15 = r7
            r7 = r20
            r8 = r19
            r21 = r9
            r9 = r18
            r22 = r10
            r10 = r11
            r11 = r27
            r12 = r28
            int r1 = r1.nativeInit(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = r15.f61348a
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x018b
            r13 = 1
            goto L_0x018c
        L_0x018b:
            r13 = 0
        L_0x018c:
            java.lang.String r2 = "MicroMsg.ScanFocusEngineInitModelParam"
            if (r13 == 0) goto L_0x019d
            java.lang.String r3 = r15.f61348a
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 != 0) goto L_0x019d
            java.lang.String r3 = "alvinluo checkInitModelParam binPath not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x019d:
            java.lang.String r3 = r15.f61349b
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x01a7
            r13 = 1
            goto L_0x01a8
        L_0x01a7:
            r13 = 0
        L_0x01a8:
            if (r13 == 0) goto L_0x01b7
            java.lang.String r3 = r15.f61349b
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 != 0) goto L_0x01b7
            java.lang.String r3 = "alvinluo checkInitModelParam paramPath not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x01b7:
            java.lang.String r3 = r15.f61351d
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x01c1
            r13 = 1
            goto L_0x01c2
        L_0x01c1:
            r13 = 0
        L_0x01c2:
            if (r13 == 0) goto L_0x01d1
            java.lang.String r3 = r15.f61351d
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = "alvinluo checkInitModelParam opBinPath not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x01d1:
            java.lang.String r3 = r15.f61350c
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x01db
            r13 = 1
            goto L_0x01dc
        L_0x01db:
            r13 = 0
        L_0x01dc:
            if (r13 == 0) goto L_0x01eb
            java.lang.String r3 = r15.f61350c
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 != 0) goto L_0x01eb
            java.lang.String r3 = "alvinluo checkInitModelParam opParamPath not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x01eb:
            boolean r2 = r15.f61352e
            f53474t = r2
            if (r14 == 0) goto L_0x0221
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "reportInitUseXNetResult "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.ScanFocusEngineReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            if (r2 == 0) goto L_0x0212
            r2 = 234(0xea, float:3.28E-43)
            goto L_0x0214
        L_0x0212:
            r2 = 235(0xeb, float:3.3E-43)
        L_0x0214:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r5[r6] = r2
            r2 = 1259(0x4eb, float:1.764E-42)
            r3.mo160131h(r2, r5)
            goto L_0x0224
        L_0x0221:
            r2 = 1259(0x4eb, float:1.764E-42)
            r4 = 1
        L_0x0224:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "initFocusEngine result:"
            r3.append(r7)
            r3.append(r1)
            java.lang.String r7 = "  init cost:"
            r3.append(r7)
            long r5 = r5 - r16
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            if (r1 == 0) goto L_0x0258
            boolean r0 = f53473s
            if (r0 != 0) goto L_0x0257
            f53473s = r4
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 232(0xe8, float:3.25E-43)
            r0.mo175911u(r2, r3)
        L_0x0257:
            return r1
        L_0x0258:
            f53461g = r4
            if (r0 != 0) goto L_0x028c
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = f53460f
            boolean r2 = r2.isUsingAI()
            f53464j = r2
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = f53460f
            boolean r2 = r2.isAICrop()
            f53465k = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initFocusEngine isUsingAI:"
            r2.append(r3)
            boolean r3 = f53464j
            r2.append(r3)
            java.lang.String r3 = "  isAICrop:"
            r2.append(r3)
            boolean r3 = f53465k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
        L_0x028c:
            ob0.b0 r2 = f40.C86709a0.m107524d()
            int r2 = r2.mo123467m()
            r3 = 6
            if (r2 == r3) goto L_0x02a2
            ob0.b0 r2 = f40.C86709a0.m107524d()
            int r2 = r2.mo123467m()
            r3 = 4
            if (r2 != r3) goto L_0x02ae
        L_0x02a2:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r2)
            if (r2 != 0) goto L_0x02ae
            r13 = 0
            goto L_0x02af
        L_0x02ae:
            r13 = 1
        L_0x02af:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = "alvinluo initNetSpeed: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            boolean r2 = f53461g
            if (r2 == 0) goto L_0x02c6
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = f53460f
            r2.setNetSpeed(r13)
        L_0x02c6:
            if (r0 == 0) goto L_0x0422
            java.lang.Class<pl2.c> r2 = pl2.C35526c.class
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = f53459e
            if (r0 == 0) goto L_0x02da
            java.lang.String r3 = "scan_config_scan_merge_engine_config"
            r6 = r21
            java.lang.String r9 = r0.getString(r3, r6)
            if (r9 != 0) goto L_0x02dd
            goto L_0x02dc
        L_0x02da:
            r6 = r21
        L_0x02dc:
            r9 = r6
        L_0x02dd:
            di3.d r0 = di3.C86312j.m106911c(r2)
            pl2.c r0 = (pl2.C35526c) r0
            boolean r3 = r0.wx0()
            di3.d r0 = di3.C86312j.m106911c(r2)
            pl2.c r0 = (pl2.C35526c) r0
            boolean r7 = r0.wx0()
            java.lang.String r8 = "MicroMsg.ScanProductModelResLogic"
            if (r7 != 0) goto L_0x02fc
            java.lang.String r0 = "getReadyModelConfigVersion res is not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r7 = 0
            goto L_0x031b
        L_0x02fc:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "getReadyModelConfigVersion:"
            r7.append(r10)
            r0.requireAccountInitialized()
            int r10 = r0.f95004f
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            r0.requireAccountInitialized()
            int r0 = r0.f95004f
            r7 = r0
        L_0x031b:
            boolean r0 = z04.C112551y.m153811k(r9)
            java.lang.String r8 = " , isDownloadModelResReady:"
            java.lang.String r10 = " , 新数据："
            java.lang.String r11 = "使用模型config  下发版本："
            if (r0 != 0) goto L_0x03c2
            boolean r0 = z04.C112551y.m153811k(r9)
            if (r0 == 0) goto L_0x0330
            r0 = 0
            goto L_0x035b
        L_0x0330:
            java.lang.String r0 = "NanoDetector"
            java.lang.String r12 = "version"
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r13 = f53460f     // Catch:{ Exception -> 0x033d }
            r14 = 0
            int r0 = r13.getModelConfigIntValue(r9, r0, r12, r14)     // Catch:{ Exception -> 0x033d }
            goto L_0x0347
        L_0x033d:
            r0 = move-exception
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r12 = "getScanMergeEngineConfigVersion"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r12, r13)
            r0 = 0
        L_0x0347:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "getScanMergeEngineConfigVersion  version:"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
        L_0x035b:
            r12 = 13
            if (r3 == 0) goto L_0x0370
            if (r0 != r7) goto L_0x0362
            goto L_0x0374
        L_0x0362:
            if (r12 <= r7) goto L_0x0365
            goto L_0x0373
        L_0x0365:
            di3.d r6 = di3.C86312j.m106911c(r2)
            pl2.c r6 = (pl2.C35526c) r6
            java.lang.String r9 = r6.Bx0()
            goto L_0x0374
        L_0x0370:
            if (r0 != r12) goto L_0x0373
            goto L_0x0374
        L_0x0373:
            r9 = r6
        L_0x0374:
            di3.d r2 = di3.C86312j.m106911c(r2)
            pl2.c r2 = (pl2.C35526c) r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            r6.append(r7)
            java.lang.String r11 = " , 后台版本："
            r6.append(r11)
            r6.append(r0)
            r6.append(r10)
            boolean r10 = z04.C112551y.m153811k(r9)
            r10 = r10 ^ r4
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r2.Ix0(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "getScanMergeEngineConfig  has serverConfig data, serverConfigVersion:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = " , readyConfigVersion:"
            r2.append(r0)
            r2.append(r7)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x040d
        L_0x03c2:
            if (r3 == 0) goto L_0x03cf
            di3.d r0 = di3.C86312j.m106911c(r2)
            pl2.c r0 = (pl2.C35526c) r0
            java.lang.String r9 = r0.Bx0()
            goto L_0x03d0
        L_0x03cf:
            r9 = r6
        L_0x03d0:
            di3.d r0 = di3.C86312j.m106911c(r2)
            pl2.c r0 = (pl2.C35526c) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r7)
            r2.append(r10)
            boolean r6 = z04.C112551y.m153811k(r9)
            r6 = r6 ^ r4
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.Ix0(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getScanMergeEngineConfig  no serverConfig data, readyConfigVersion:"
            r0.append(r2)
            r0.append(r7)
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x040d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getScanMergeEngineConfig  configStr:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0435
        L_0x0422:
            r6 = r21
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = f53459e
            if (r0 == 0) goto L_0x0430
            java.lang.String r2 = "scan_config_focus_engine_config"
            java.lang.String r0 = r0.getString(r2, r6)
            goto L_0x0431
        L_0x0430:
            r0 = 0
        L_0x0431:
            r9 = r0
            if (r9 != 0) goto L_0x0435
            r9 = r6
        L_0x0435:
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x043d
            r13 = 1
            goto L_0x043e
        L_0x043d:
            r13 = 0
        L_0x043e:
            if (r13 == 0) goto L_0x0453
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2 = 0
            r0[r2] = r9
            java.lang.String r2 = "setEngineConfig %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            com.tencent.mm.plugin.scanner.model.j0 r0 = new com.tencent.mm.plugin.scanner.model.j0
            r0.<init>(r9)
            m20105l(r0)
        L_0x0453:
            boolean r0 = f53461g
            java.lang.String r2 = "scan_config_server_detect_frame_count"
            if (r0 == 0) goto L_0x0490
            vl2.q r0 = vl2.C37764q.f100029a
            int r0 = cl2.C28609a.f78506f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = f53459e
            if (r3 == 0) goto L_0x0466
            int r0 = r3.getInt(r2, r0)
        L_0x0466:
            boolean r3 = vl2.C37764q.f100031c
            if (r3 != 0) goto L_0x046b
            goto L_0x0476
        L_0x046b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = vl2.C37764q.f100030b
            if (r3 == 0) goto L_0x0476
            java.lang.String r6 = "scan_product_server_detect_frame_count"
            int r0 = r3.getInt(r6, r0)
        L_0x0476:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "updateServerDetectFrameCount: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r3 = f53460f
            r3.setServerDetectFrameCount(r0)
        L_0x0490:
            boolean r0 = cl2.C28609a.f78505e
            r0 = r0 ^ r4
            f53456b = r0
            int r0 = cl2.C28609a.f78506f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = f53459e
            if (r3 == 0) goto L_0x049e
            r3.getInt(r2, r0)
        L_0x049e:
            r2 = 0
            f53457c = r2
            f53458d = r2
            long r2 = java.lang.System.currentTimeMillis()
            f53469o = r2
            ol2.a r0 = new ol2.a
            r0.<init>(r2)
            f53470p = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19021i0.m20102h(int, int, int, int, boolean, boolean, boolean):int");
    }

    /* renamed from: j */
    public static final ScanFastFocusEngineNative m20103j(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        C87412m.m108594g(bArr, "imageData");
        Integer num = null;
        if (!f53461g) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f53460f.resetStatus();
        ScanFastFocusEngineNative process = f53460f.process(bArr, i, i2);
        long currentTimeMillis2 = System.currentTimeMillis();
        Object[] objArr = new Object[5];
        objArr[0] = process != null ? Integer.valueOf(process.result) : null;
        objArr[1] = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
        objArr[2] = process != null ? Integer.valueOf(process.width) : null;
        objArr[3] = process != null ? Integer.valueOf(process.height) : null;
        if (!(process == null || (bArr2 = process.bestImageData) == null)) {
            num = Integer.valueOf(bArr2.length);
        }
        objArr[4] = num;
        Log.m105919d("MicroMsg.ScanFastFocusEngineManager", "alvinluo process result: %s, cost: %d, width: %d, height: %d, bestImageData: %s", objArr);
        return process;
    }

    /* renamed from: k */
    public static final void m20104k() {
        if (f53461g) {
            Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "alvinluo release");
            f53460f.resetStatus();
            f53460f.nativeRelease();
            f53461g = false;
            f53457c = 0;
            f53458d = false;
            C21795a aVar = f53470p;
            if (aVar != null) {
                long j = 0;
                int i = 0;
                for (Map.Entry next : aVar.f61777b.entrySet()) {
                    if (!(((C21795a.C21796a) next.getValue()).f61779a == 0 || ((C21795a.C21796a) next.getValue()).f61780b == 0)) {
                        j += ((C21795a.C21796a) next.getValue()).f61780b - ((C21795a.C21796a) next.getValue()).f61779a;
                        i++;
                    }
                }
                Iterator it = ((ArrayList) aVar.f61778c).iterator();
                int i2 = 0;
                int i3 = 0;
                while (it.hasNext()) {
                    i2 += ((Number) it.next()).intValue();
                    i3++;
                }
                Log.m105925i("MicroMsg.ScanProductPerformanceHelper", "dumpPerformance costTotal: %s, count: %s, average: %s, frameCost: %s, ave: %s, frameCount: %s", Long.valueOf(j), Integer.valueOf(i), Float.valueOf((((float) j) * 1.0f) / ((float) i)), Integer.valueOf(i2), Float.valueOf((((float) i2) * 1.0f) / ((float) i3)), Integer.valueOf(i3));
            }
            C21795a aVar2 = f53470p;
            if (aVar2 != null && f53469o == aVar2.f61776a) {
                aVar2.f61777b.clear();
            }
            f53469o = 0;
        }
    }

    /* renamed from: l */
    public static final void m20105l(C19027m0 m0Var) {
        C87412m.m108594g(m0Var, "task");
        ((C119157j) C119157j.f356862d).mo183876g(m0Var, "AiScanImageDecodeQueue_decode_task");
    }

    /* renamed from: b */
    public final void mo24268b() {
        try {
            boolean a = C86709a0.m107522a();
            Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "initMMKV %s, mmkv: %s", Boolean.valueOf(a), f53459e);
            if (a && f53459e == null) {
                f53459e = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "_scan_config_mmkv");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", e, "alvinluo checkInitMMKV exception", new Object[0]);
        }
    }

    /* renamed from: i */
    public final boolean mo24269i(int i) {
        long j;
        MultiProcessMMKV multiProcessMMKV = f53459e;
        if (multiProcessMMKV != null) {
            j = multiProcessMMKV.getLong("scan_config_last_update_" + i, 0);
        } else {
            j = 0;
        }
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        return i2 == 0 || (i2 > 0 && System.currentTimeMillis() - j >= 86400000);
    }

    /* renamed from: m */
    public final void mo24270m(int i, long j) {
        Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "saveUpdateScanConfigTime type: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j));
        MultiProcessMMKV multiProcessMMKV = f53459e;
        if (multiProcessMMKV != null) {
            SharedPreferences.Editor putLong = multiProcessMMKV.putLong("scan_config_last_update_" + i, j);
            if (putLong != null) {
                putLong.apply();
            }
        }
    }

    /* renamed from: n */
    public final void mo24271n(int i) {
        Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "alvinluo updateScanConfig type: %d", Integer.valueOf(i));
        mo24270m(i, System.currentTimeMillis());
        C19023b bVar = new C19023b(i);
        C106067f0 f0Var = C106067f0.f315807d;
        ((C119157j) C119157j.f356862d).mo183876g(new C106070g0(i, bVar), "ScanConfigSync");
    }
}
