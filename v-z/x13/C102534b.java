package x13;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hd0.C98390b;
import hd0.C98392c;
import java.util.ArrayList;
import rx3.C13598b0;
import sp3.C110803f;
import sp3.C110807k;

/* renamed from: x13.b */
public final class C102534b implements C98392c {

    /* renamed from: a */
    public final String f301895a = ("MicroMsg.CompositionVideoTranscoderImpl@" + hashCode());

    /* renamed from: x13.b$a */
    public static final class C38444a extends C87413o implements C32228q<Boolean, Integer, ArrayList<PipelineIndicatorInfo>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f101403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38444a(C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
            super(3);
            this.f101403d = pVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((ArrayList) obj3, "<anonymous parameter 2>");
            this.f101403d.invoke(Boolean.valueOf(booleanValue), Integer.valueOf(intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x13.b$b */
    public static final class C38445b extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<AssetParallelExportSession> f101404d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f101405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38445b(C8479f0<AssetParallelExportSession> f0Var, C8478d0 d0Var) {
            super(1);
            this.f101404d = f0Var;
            this.f101405e = d0Var;
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            AssetParallelExportSession assetParallelExportSession = (AssetParallelExportSession) this.f101404d.f27484d;
            if (assetParallelExportSession != null) {
                C8478d0 d0Var = this.f101405e;
                int i = d0Var.f27483d;
                int parallelSize = assetParallelExportSession.parallelSize();
                if (i < parallelSize) {
                    i = parallelSize;
                }
                d0Var.f27483d = i;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x13.b$c */
    public static final class C102535c extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f301896d;

        /* renamed from: e */
        public final /* synthetic */ C102534b f301897e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f301898f;

        /* renamed from: g */
        public final /* synthetic */ C110807k f301899g;

        /* renamed from: h */
        public final /* synthetic */ C59741c0 f301900h;

        /* renamed from: i */
        public final /* synthetic */ C98390b f301901i;

        /* renamed from: j */
        public final /* synthetic */ C110807k.C101693a f301902j;

        /* renamed from: n */
        public final /* synthetic */ String f301903n;

        /* renamed from: o */
        public final /* synthetic */ C8478d0 f301904o;

        /* renamed from: p */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f301905p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102535c(long j, C102534b bVar, C8477a0 a0Var, C110807k kVar, C59741c0 c0Var, C98390b bVar2, C110807k.C101693a aVar, String str, C8478d0 d0Var, C32226l<? super Boolean, C13598b0> lVar) {
            super(2);
            this.f301896d = j;
            this.f301897e = bVar;
            this.f301898f = a0Var;
            this.f301899g = kVar;
            this.f301900h = c0Var;
            this.f301901i = bVar2;
            this.f301902j = aVar;
            this.f301903n = str;
            this.f301904o = d0Var;
            this.f301905p = lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            long ticksToNow = Util.ticksToNow(this.f301896d);
            String str = this.f301897e.f301895a;
            Log.m105924i(str, "export finished, success:" + booleanValue + ", errCode:" + intValue + ", cost:" + ticksToNow + ", isCallbackInvoked:" + this.f301898f.f27482d);
            C8477a0 a0Var = this.f301898f;
            if (!a0Var.f27482d) {
                boolean z = true;
                a0Var.f27482d = true;
                if (!booleanValue) {
                    C110807k kVar = this.f301899g;
                    kVar.f331515p = true;
                    AssetExportSession assetExportSession = kVar.f331518s;
                    if (assetExportSession != null) {
                        assetExportSession.cancelExport();
                    }
                }
                try {
                    C102534b.m135369b(this.f301897e, intValue, this.f301900h.f170634d, this.f301899g, this.f301901i, this.f301902j, ticksToNow, this.f301903n, this.f301904o.f27483d);
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f301897e.f301895a, e, "", new Object[0]);
                }
                if (!booleanValue || intValue != 0) {
                    z = false;
                }
                this.f301905p.invoke(Boolean.valueOf(z));
                C110803f.f331490g.mo162371a();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: xp3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: f23.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: f23.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: f23.b$d} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m135369b(x13.C102534b r22, int r23, float r24, sp3.C110807k r25, hd0.C98390b r26, sp3.C110807k.C101693a r27, long r28, java.lang.String r30, int r31) {
        /*
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r22.getClass()
            if (r0 >= 0) goto L_0x0010
            int r0 = -r0
        L_0x0010:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r6, r7)
            i23.c r7 = i23.C98593c.f289086a
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r7 = r7.mo137980c(r6)
            int r8 = r3.f297724h
            long r8 = (long) r8
            r7.f266476h = r8
            long r8 = (long) r0
            r7.f266481m = r8
            r7.f266484p = r4
            java.lang.String r0 = "RemuxVideoTimeMs"
            r7.mo86046c(r0, r4)
            r4 = 1
            r7.f266482n = r4
            r8 = 0
            r7.f266446C = r8
            r10 = 5
            r7.f266447D = r10
            f23.b r0 = new f23.b
            r0.<init>()
            r10 = 0
            r0.f286951d = r10
            java.util.ArrayList<sp3.c> r11 = r1.f331511l
            java.util.Iterator r11 = r11.iterator()
        L_0x004d:
            boolean r12 = r11.hasNext()
            r13 = 2
            r14 = 0
            r15 = 1
            if (r12 == 0) goto L_0x0128
            java.lang.Object r12 = r11.next()
            sp3.c r12 = (sp3.C110801c) r12
            i23.c r16 = i23.C98593c.f289086a
            java.lang.String r4 = "it"
            gy3.C87412m.m108594g(r12, r4)
            int r4 = r12.f331483u
            if (r4 != r13) goto L_0x00c5
            f23.b$f r4 = new f23.b$f
            r4.<init>()
            float r5 = r12.f331468f
            r4.f286963f = r5
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r5 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r13 = r12.f331482t
            rw.m$a r5 = r5.mo129931c(r13, r15)
            if (r5 == 0) goto L_0x00e4
            int r13 = r5.f180529e
            r4.f286962e = r13
            float r13 = r5.f180527c
            r4.f286961d = r13
            int r13 = r5.f180534j
            r4.f286964g = r13
            int r13 = r5.f180532h
            r4.f286965h = r13
            long r8 = r5.f180528d
            r4.f286968k = r8
            o80.a r8 = new o80.a
            java.lang.String r9 = r12.f331482t
            r8.<init>(r9)
            java.lang.String r9 = r8.mo161326c()
            java.lang.String r13 = ""
            if (r9 != 0) goto L_0x009f
            r9 = r13
        L_0x009f:
            r4.f286966i = r9
            java.lang.String r9 = r8.mo161324a()
            if (r9 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r13 = r9
        L_0x00a9:
            r4.f286967j = r13
            java.util.ArrayList<java.lang.Integer> r9 = r4.f286959b
            int r13 = r5.f180525a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9.add(r13)
            java.util.ArrayList<java.lang.Integer> r9 = r4.f286959b
            int r5 = r5.f180526b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.add(r5)
            r8.mo161327e()
            goto L_0x00e4
        L_0x00c5:
            if (r4 != r15) goto L_0x00e3
            f23.b$d r4 = new f23.b$d
            r4.<init>()
            java.util.ArrayList<java.lang.Integer> r5 = r4.f286959b
            int r8 = r12.f331471i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.add(r8)
            java.util.ArrayList<java.lang.Integer> r5 = r4.f286959b
            int r8 = r12.f331472j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.add(r8)
            goto L_0x00e4
        L_0x00e3:
            r4 = r14
        L_0x00e4:
            if (r4 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            int r5 = r12.f331483u
            r4.f286958a = r5
        L_0x00eb:
            if (r4 == 0) goto L_0x00fa
            java.util.ArrayList<java.lang.Long> r5 = r4.f286960c
            if (r5 == 0) goto L_0x00fa
            long r8 = r12.f331464b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
        L_0x00fa:
            if (r4 == 0) goto L_0x0109
            java.util.ArrayList<java.lang.Long> r5 = r4.f286960c
            if (r5 == 0) goto L_0x0109
            long r8 = r12.f331465c
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
        L_0x0109:
            boolean r5 = r4 instanceof f23.C97815b.C97821f
            if (r5 == 0) goto L_0x0110
            r14 = r4
            f23.b$f r14 = (f23.C97815b.C97821f) r14
        L_0x0110:
            if (r14 != 0) goto L_0x0113
            goto L_0x011b
        L_0x0113:
            android.graphics.Bitmap r5 = r1.f331513n
            if (r5 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r15 = 0
        L_0x0119:
            r14.f286969l = r15
        L_0x011b:
            if (r4 == 0) goto L_0x0122
            java.util.ArrayList<f23.b$e> r5 = r0.f286948a
            r5.add(r4)
        L_0x0122:
            r4 = 1
            r8 = 0
            goto L_0x004d
        L_0x0128:
            org.json.JSONObject r0 = r0.mo33258a()
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "reportJson.toJson().toString()"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r4 = ","
            java.lang.String r5 = ";"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r4, r5, r10)
            java.lang.String r8 = "OriginMediaInfo"
            java.lang.String r0 = r7.mo86045b(r8, r0, r15)
            r7.f266448E = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r8 = r3.f297717a
            java.lang.String r9 = "colorRange"
            r0.put(r9, r8)
            int r8 = r3.f297718b
            java.lang.String r9 = "colorStandard"
            r0.put(r9, r8)
            int r8 = r3.f297719c
            java.lang.String r9 = "colorTransfer"
            r0.put(r9, r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "jsonObj.toString()"
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r0 = z04.C112551y.m153814n(r0, r4, r5, r10)
            java.lang.String r4 = "ColorSpace"
            java.lang.String r0 = r7.mo86045b(r4, r0, r15)
            r7.f266449F = r0
            hd0.w r0 = r2.f288463g
            boolean r4 = r0.f89295a
            if (r4 == 0) goto L_0x017f
            int r0 = r0.f89296b
            goto L_0x0180
        L_0x017f:
            r0 = -1
        L_0x0180:
            r7.f266452I = r0
            r0 = r31
            r7.f266459P = r0
            i23.c r0 = i23.C98593c.f289086a
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r4 = r0.mo137980c(r6)
            r5 = r30
            r0.mo137981d(r4, r5)
            boolean r4 = r2.f288461e
            if (r4 == 0) goto L_0x019c
            boolean r8 = r2.f288460d
            if (r8 == 0) goto L_0x019c
            r7.f266492x = r15
            goto L_0x01a2
        L_0x019c:
            boolean r2 = r2.f288460d
            if (r2 == 0) goto L_0x01a2
            r7.f266492x = r13
        L_0x01a2:
            if (r4 == 0) goto L_0x01a7
            r8 = 1
            goto L_0x01a9
        L_0x01a7:
            r8 = 0
        L_0x01a9:
            r7.f266444A = r8
            java.lang.String r16 = fh2.C32051e.f85291b
            r19 = 0
            r20 = 4
            r21 = 0
            java.lang.String r17 = ","
            java.lang.String r18 = ";"
            java.lang.String r2 = z04.C112551y.m153816p(r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = "CpuName"
            java.lang.String r2 = r7.mo86045b(r4, r2, r15)
            r7.f266450G = r2
            xp3.g r2 = r1.f331509j
            if (r2 == 0) goto L_0x01c9
            xp3.d r14 = r2.f335867n
        L_0x01c9:
            if (r14 == 0) goto L_0x01e3
            fy3.a<java.lang.Long> r2 = r14.f303331c
            xp3.d$a r2 = (xp3.C102710d.C102711a) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            long r8 = r2.longValue()
            r7.f266475g = r8
            long r8 = r14.f303330b
            r7.f266489u = r8
            long r8 = r14.f303329a
            r7.f266490v = r8
        L_0x01e3:
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_audio_quality_analysis_switch
            int r2 = r2.mo58779Qe(r4, r10)
            if (r2 != r15) goto L_0x01f6
            r20 = 1
            goto L_0x01f8
        L_0x01f6:
            r20 = 0
        L_0x01f8:
            int r2 = r3.f297726j
            float r2 = (float) r2
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r17 = r2 / r4
            int r2 = r3.f297727k
            float r2 = (float) r2
            int r3 = r3.f297728l
            boolean r1 = r1.f331512m
            r16 = r30
            r18 = r2
            r19 = r3
            r21 = r1
            float r1 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119556a(r16, r17, r18, r19, r20, r21)
            r2 = 100
            float r2 = (float) r2
            float r1 = r1 * r2
            long r3 = (long) r1
            r7.f266493y = r3
            float r1 = r24 * r2
            long r1 = (long) r1
            r7.f266494z = r1
            r0.mo137979b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x13.C102534b.m135369b(x13.b, int, float, sp3.k, hd0.b, sp3.k$a, long, java.lang.String, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo137683a(java.lang.String r46, java.lang.String r47, hd0.C98390b r48, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r49) {
        /*
            r45 = this;
            r13 = r45
            r1 = r46
            r10 = r47
            r14 = r48
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r0 = "sourcePath"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "outputPath"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "outputCallback"
            r12 = r49
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = r13.f301895a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "transcodeVideo source:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", outputPath:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ", params:"
            r3.append(r4)
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r14.f288457a
            r3.append(r4)
            java.lang.String r4 = " parallel:"
            r3.append(r4)
            hd0.w r4 = r14.f288463g
            r3.append(r4)
            java.lang.String r4 = ", softEncode:"
            r3.append(r4)
            boolean r4 = r14.f288461e
            r3.append(r4)
            java.lang.String r4 = ", outputHevc:"
            r3.append(r4)
            boolean r4 = r14.f288460d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r46)
            r15 = 0
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = r13.f301895a
            java.lang.String r1 = "transcodeVideo source video not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r15
        L_0x007b:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r14.f288457a
            int r3 = r0.f267169g
            if (r3 <= 0) goto L_0x0480
            int r3 = r0.f267166d
            if (r3 <= 0) goto L_0x0480
            int r0 = r0.f267167e
            if (r0 > 0) goto L_0x008b
            goto L_0x0480
        L_0x008b:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r0 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            r11 = 1
            rw.m$a r3 = r0.mo129931c(r1, r11)
            java.lang.String r0 = r13.f301895a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "transcodeVideo source video info:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            if (r3 == 0) goto L_0x0474
            int r0 = r3.f180525a
            if (r0 <= 0) goto L_0x0474
            int r0 = r3.f180526b
            if (r0 > 0) goto L_0x00b7
            r2 = r13
            r1 = 0
            goto L_0x0477
        L_0x00b7:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r14.f288457a
            int r4 = r0.f267172j
            if (r4 > 0) goto L_0x00bf
            r0.f267172j = r11
        L_0x00bf:
            int r4 = r0.f267168f
            if (r4 > 0) goto L_0x00c8
            float r4 = r3.f180527c
            int r4 = (int) r4
            r0.f267168f = r4
        L_0x00c8:
            int r4 = r0.f267173n
            if (r4 > 0) goto L_0x00d0
            int r4 = r3.f180532h
            r0.f267173n = r4
        L_0x00d0:
            int r4 = r0.f267174o
            if (r4 > 0) goto L_0x00d8
            int r4 = r3.f180534j
            r0.f267174o = r4
        L_0x00d8:
            int r4 = r0.f267175p
            if (r4 > 0) goto L_0x00e0
            int r4 = r3.f180533i
            r0.f267175p = r4
        L_0x00e0:
            java.lang.String r0 = r13.f301895a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "after fix videoParam:"
            r4.append(r5)
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r14.f288457a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            sp3.c r0 = new sp3.c
            r4 = 2
            r0.<init>(r1, r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.mo162369g(r5)
            long r5 = r14.f288458b
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x011a
            long r11 = r14.f288459c
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x011a
            r0.mo162368f(r5)
            long r5 = r14.f288459c
            r0.mo162367e(r5)
            goto L_0x0122
        L_0x011a:
            r0.mo162368f(r7)
            long r5 = r0.f331470h
            r0.mo162367e(r5)
        L_0x0122:
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            sp3.k r12 = new sp3.k
            r12.<init>(r0)
            boolean r0 = r14.f288464h
            if (r0 == 0) goto L_0x018f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r0 == 0) goto L_0x018f
            int r5 = r14.f288465i     // Catch:{ Exception -> 0x0169, all -> 0x0166 }
            r6 = 1
            if (r5 != r6) goto L_0x014b
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x0169, all -> 0x0166 }
            java.lang.String r5 = "HDR_lut/HDR10.png"
            java.io.InputStream r5 = r0.open(r5)     // Catch:{ Exception -> 0x0169, all -> 0x0166 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Exception -> 0x0149 }
            goto L_0x015e
        L_0x0149:
            r0 = move-exception
            goto L_0x016b
        L_0x014b:
            if (r5 != r4) goto L_0x015c
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x0169, all -> 0x0166 }
            java.lang.String r5 = "HDR_lut/HLG.png"
            java.io.InputStream r5 = r0.open(r5)     // Catch:{ Exception -> 0x0169, all -> 0x0166 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Exception -> 0x0149 }
            goto L_0x015e
        L_0x015c:
            r0 = 0
            r5 = 0
        L_0x015e:
            if (r5 == 0) goto L_0x0180
            r5.close()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0180
        L_0x0166:
            r0 = move-exception
            r11 = 0
            goto L_0x0187
        L_0x0169:
            r0 = move-exception
            r5 = 0
        L_0x016b:
            java.lang.String r6 = r13.f301895a     // Catch:{ all -> 0x0185 }
            java.lang.String r7 = "open lut fail"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0185 }
            r9[r15] = r0     // Catch:{ all -> 0x0185 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r7, r9)     // Catch:{ all -> 0x0185 }
            if (r5 == 0) goto L_0x017f
            r5.close()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x017f:
            r0 = 0
        L_0x0180:
            r12.f331513n = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x018f
        L_0x0185:
            r0 = move-exception
            r11 = r5
        L_0x0187:
            if (r11 == 0) goto L_0x018e
            r11.close()
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x018e:
            throw r0
        L_0x018f:
            int r0 = r3.f180532h
            if (r0 <= 0) goto L_0x01a0
            int r0 = r3.f180533i
            if (r0 <= 0) goto L_0x01a0
            int r0 = r3.f180534j
            if (r0 <= 0) goto L_0x01a0
            r5 = 1
            r12.mo162382d(r5)
            goto L_0x01a3
        L_0x01a0:
            r12.mo162382d(r15)
        L_0x01a3:
            tp3.a r0 = new tp3.a
            ff3.a r5 = new ff3.a
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r14.f288457a
            int r7 = r6.f267174o
            int r6 = r6.f267175p
            r5.<init>(r7, r6)
            r0.<init>(r5)
            r12.f331510k = r0
            int r0 = r3.f180530f
            r5 = 180(0xb4, float:2.52E-43)
            if (r0 == 0) goto L_0x01c1
            if (r0 != r5) goto L_0x01be
            goto L_0x01c1
        L_0x01be:
            int r6 = r3.f180526b
            goto L_0x01c3
        L_0x01c1:
            int r6 = r3.f180525a
        L_0x01c3:
            if (r0 == 0) goto L_0x01cb
            if (r0 != r5) goto L_0x01c8
            goto L_0x01cb
        L_0x01c8:
            int r0 = r3.f180525a
            goto L_0x01cd
        L_0x01cb:
            int r0 = r3.f180526b
        L_0x01cd:
            r12.mo162391n(r6, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r15, r15, r6, r0)
            r12.mo162392o(r3)
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r14.f288457a
            int r3 = r0.f267166d
            int r0 = r0.f267167e
            gy3.c0 r7 = new gy3.c0
            r7.<init>()
            boolean r5 = r14.f288462f
            if (r5 == 0) goto L_0x0293
            java.util.ArrayList<sp3.c> r5 = r12.f331511l
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01f2:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x022c
            java.lang.Object r8 = r5.next()
            sp3.c r8 = (sp3.C110801c) r8
            int r9 = r8.f331483u
            if (r9 != r4) goto L_0x021a
            com.tencent.mm.plugin.vlog.model.b r9 = new com.tencent.mm.plugin.vlog.model.b
            java.lang.String r4 = r8.f331482t
            r24 = r12
            long r11 = r8.f331466d
            r25 = r2
            long r1 = r8.f331467e
            r17 = r9
            r18 = r4
            r19 = r11
            r21 = r1
            r17.<init>(r18, r19, r21)
            goto L_0x021f
        L_0x021a:
            r25 = r2
            r24 = r12
            r9 = 0
        L_0x021f:
            if (r9 == 0) goto L_0x0224
            r6.add(r9)
        L_0x0224:
            r1 = r46
            r12 = r24
            r2 = r25
            r4 = 2
            goto L_0x01f2
        L_0x022c:
            r25 = r2
            r24 = r12
            com.tencent.mm.plugin.vlog.model.d r17 = com.tencent.p014mm.plugin.vlog.model.C96534d.f282494a
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r14.f288457a
            int r2 = r1.f267166d
            int r4 = r1.f267167e
            r22 = 0
            r23 = 0
            r18 = r6
            r19 = r1
            r20 = r2
            r21 = r4
            com.tencent.mm.plugin.vlog.model.a r1 = r17.mo134593a(r18, r19, r20, r21, r22, r23)
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r14.f288457a
            int r4 = r1.f282483b
            r2.f267166d = r4
            int r4 = r1.f282484c
            r2.f267167e = r4
            java.lang.String r2 = r13.f301895a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "transcodeVideo abaResult:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", scene:"
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r1.f282486e
            if (r1 == 0) goto L_0x0297
            int r1 = r1.qualityLevel
            float r1 = (float) r1
            r7.f170634d = r1
            java.lang.String r1 = r13.f301895a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "export videoQuality: "
            r2.append(r4)
            float r4 = r7.f170634d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0297
        L_0x0293:
            r25 = r2
            r24 = r12
        L_0x0297:
            boolean r1 = r14.f288461e
            if (r1 == 0) goto L_0x02c7
            android.util.Size r1 = new android.util.Size
            r1.<init>(r3, r0)
            int r0 = r1.getWidth()
            int r2 = r0 % 4
            if (r2 != 0) goto L_0x02a9
            goto L_0x02b0
        L_0x02a9:
            int r2 = r0 % 4
            if (r2 == 0) goto L_0x02b0
            int r0 = r0 + 1
            goto L_0x02a9
        L_0x02b0:
            int r1 = r1.getHeight()
            int r2 = r1 % 2
            if (r2 == 0) goto L_0x02ba
            int r1 = r1 + 1
        L_0x02ba:
            android.util.Size r2 = new android.util.Size
            r2.<init>(r0, r1)
            int r3 = r2.getWidth()
            int r0 = r2.getHeight()
        L_0x02c7:
            java.lang.String r1 = r13.f301895a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "after process, output size:["
            r2.append(r4)
            r2.append(r3)
            r4 = 44
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = "] parallel:"
            r2.append(r4)
            hd0.w r4 = r14.f288463g
            boolean r4 = r4.f89295a
            r2.append(r4)
            java.lang.String r4 = " soft:"
            r2.append(r4)
            boolean r4 = r14.f288461e
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 1
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106448i(r10, r1)
            if (r12 == 0) goto L_0x0472
            int r2 = r12.length()
            if (r2 != 0) goto L_0x030b
            r16 = 1
            goto L_0x030d
        L_0x030b:
            r16 = 0
        L_0x030d:
            if (r16 == 0) goto L_0x0311
            goto L_0x0472
        L_0x0311:
            di3.d r2 = di3.C86312j.m106911c(r25)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_mediacodec_level_limit
            boolean r35 = r2.mo58784wf(r4, r1)
            sp3.k$a r11 = new sp3.k$a
            android.util.Size r1 = new android.util.Size
            r1.<init>(r3, r0)
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r14.f288457a
            int r2 = r0.f267169g
            int r3 = r0.f267168f
            int r4 = r0.f267172j
            int r5 = r0.f267173n
            int r6 = r0.f267174o
            int r0 = r0.f267175p
            r34 = 1
            r36 = 0
            boolean r8 = r14.f288460d
            r38 = 0
            r39 = 0
            r40 = 6144(0x1800, float:8.61E-42)
            r41 = 0
            r26 = r11
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r0
            r37 = r8
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = r14.f288461e
            if (r0 == 0) goto L_0x0363
            java.lang.String r0 = r13.f301895a
            java.lang.String r1 = "softEncode, not need correct size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r11.f297720d = r15
        L_0x0363:
            di3.d r0 = di3.C86312j.m106911c(r25)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_composition_transcode_timeout_enable
            r9 = 1
            boolean r0 = r0.mo58784wf(r1, r9)
            r11.f297721e = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r0 < r8) goto L_0x038e
            w80.i r0 = w80.C111750i.f334661a
            r1 = r46
            w80.i$a r0 = r0.mo163488a(r1)
            if (r0 == 0) goto L_0x038e
            int r1 = r0.f301461a
            r11.f297717a = r1
            int r1 = r0.f301462b
            r11.f297718b = r1
            int r0 = r0.f301463c
            r11.f297719c = r0
        L_0x038e:
            int r0 = r11.f297719c
            r1 = 6
            if (r0 != r1) goto L_0x039c
            com.tencent.mm.plugin.vlog.model.n0 r0 = new com.tencent.mm.plugin.vlog.model.n0
            r0.<init>()
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(r0)
            goto L_0x03a4
        L_0x039c:
            com.tencent.mm.plugin.vlog.model.o0 r0 = new com.tencent.mm.plugin.vlog.model.o0
            r0.<init>()
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(r0)
        L_0x03a4:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            gy3.d0 r0 = new gy3.d0
            r0.<init>()
            r1 = -1
            r0.f27483d = r1
            x13.b$c r6 = new x13.b$c
            r1 = r6
            r4 = r45
            r42 = r6
            r6 = r24
            r16 = 24
            r8 = r48
            r17 = 1
            r9 = r11
            r10 = r47
            r15 = r11
            r13 = 1
            r11 = r0
            r44 = r12
            r43 = r24
            r12 = r49
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r14.f288464h
            r2 = 3
            if (r1 == 0) goto L_0x03e6
            int r1 = r14.f288465i
            if (r1 == 0) goto L_0x03e6
            boolean r1 = p206nj.C11171e.m11046c(r16)
            if (r1 == 0) goto L_0x03e6
            r15.f297718b = r13
            r15.f297719c = r2
        L_0x03e6:
            hd0.w r1 = r14.f288463g
            boolean r1 = r1.f89295a
            if (r1 == 0) goto L_0x0434
            boolean r1 = r14.f288461e
            if (r1 == 0) goto L_0x040b
            com.tencent.tav.codec.DefaultMediaFactory r1 = new com.tencent.tav.codec.DefaultMediaFactory
            z13.b r3 = new z13.b
            r3.<init>(r13, r13)
            y13.d r4 = new y13.d
            r5 = 0
            r6 = 0
            r4.<init>(r5, r5, r2, r6)
            r1.<init>(r3, r4)
            r3 = r43
            r3.f331516q = r1
            com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory r1 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer.f316509b
            com.tencent.tav.decoder.muxer.MediaMuxerFactory.setMuxerCreator(r1)
            goto L_0x0414
        L_0x040b:
            r3 = r43
            com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer r1 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.f282626a
            com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory r1 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.f282627b
            com.tencent.tav.decoder.muxer.MediaMuxerFactory.setMuxerCreator(r1)
        L_0x0414:
            hd0.w r1 = r14.f288463g
            int r1 = r1.f89296b
            r15.f297733q = r1
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            x13.b$a r2 = new x13.b$a
            r4 = r42
            r2.<init>(r4)
            x13.b$b r4 = new x13.b$b
            r4.<init>(r1, r0)
            r0 = r44
            com.tencent.tav.core.AssetParallelExportSession r0 = r3.mo162390m(r0, r15, r2, r4)
            r1.f27484d = r0
            goto L_0x0471
        L_0x0434:
            r4 = r42
            r3 = r43
            r0 = r44
            boolean r1 = r14.f288461e
            if (r1 == 0) goto L_0x0460
            com.tencent.mm.plugin.vlog.model.TAVKitMuxer r1 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
            r1.mo134554a()
            com.tencent.tav.codec.DefaultMediaFactory r1 = new com.tencent.tav.codec.DefaultMediaFactory
            z13.b r5 = new z13.b
            r5.<init>(r13, r13)
            y13.d r6 = new y13.d
            r7 = 0
            r8 = 0
            r6.<init>(r7, r7, r2, r8)
            r1.<init>(r5, r6)
            r3.f331516q = r1
            r8 = 0
            r10 = 0
            r5 = r3
            r6 = r0
            r7 = r15
            r9 = r4
            r5.mo162383f(r6, r7, r8, r9, r10)
            goto L_0x0471
        L_0x0460:
            com.tencent.mm.plugin.vlog.model.TAVKitMuxer r1 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
            r1.mo134554a()
            r8 = 1
            r10 = 0
            r11 = 16
            r12 = 0
            r5 = r3
            r6 = r0
            r7 = r15
            r9 = r4
            sp3.C110807k.m150875e(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0471:
            return r13
        L_0x0472:
            r1 = 0
            return r1
        L_0x0474:
            r1 = 0
            r2 = r45
        L_0x0477:
            java.lang.String r0 = r2.f301895a
            java.lang.String r3 = "transcodeVideo source video info not valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            return r1
        L_0x0480:
            r2 = r13
            r1 = 0
            java.lang.String r0 = r2.f301895a
            java.lang.String r3 = "transcodeVideo error videoParam"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x13.C102534b.mo137683a(java.lang.String, java.lang.String, hd0.b, fy3.l):boolean");
    }
}
