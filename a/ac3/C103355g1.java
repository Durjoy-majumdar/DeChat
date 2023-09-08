package ac3;

import android.opengl.GLES20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionBaseDataStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WevisionSwitchResStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import com.tencent.p014mm.xeffect.IWeVisReport;
import com.tencent.p014mm.xeffect.WeEffectCallbackMgr;
import com.tencent.p014mm.xeffect.WeEffectRender;
import com.tencent.p014mm.xeffect.WeVisReportWrapper;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import p564iq.C87790d;
import p80.C110192a;
import p80.C110194c;
import q00.C110264g;
import q00.C110268h;
import q00.C12024e;
import qr3.C110470e;
import qr3.C36070f;
import rh3.C101382f;
import rh3.C101383g;
import rx3.C13598b0;
import sx3.C36907w;
import u80.C111139a;
import u80.C111141c;

/* renamed from: ac3.g1 */
public final class C103355g1 implements C110264g, C110268h {

    /* renamed from: J */
    public static final C103357b f304769J;

    /* renamed from: K */
    public static final String[] f304770K = {"/Slimer/natureslim", "/smallhead/smallhead", "/shouquangu/shouquangu", "/shouxiagu/shouxiagu", "/shoubiyi/shoubiyi", "/chin/chin", "/chin/chin1", "/hairline/hairline", "/hairline/hairline1", "/bigeye/bigeye", "/Slimer/boyslim", "/Slimer/girlslim", "/zhailian/zhailian1"};

    /* renamed from: L */
    public static final String[] f304771L = {"/contour"};

    /* renamed from: A */
    public final int[] f304772A;

    /* renamed from: B */
    public C110264g.C110266c f304773B;

    /* renamed from: C */
    public boolean f304774C;

    /* renamed from: D */
    public WeVisionBaseDataStruct f304775D;

    /* renamed from: E */
    public C103360i1 f304776E;

    /* renamed from: F */
    public boolean f304777F;

    /* renamed from: G */
    public boolean f304778G;

    /* renamed from: H */
    public final LinkedList<C54008d0> f304779H;

    /* renamed from: I */
    public C111141c f304780I;

    /* renamed from: a */
    public final int f304781a;

    /* renamed from: b */
    public final boolean f304782b;

    /* renamed from: c */
    public final C110264g.C47730a f304783c;

    /* renamed from: d */
    public final long f304784d;

    /* renamed from: e */
    public int f304785e;

    /* renamed from: f */
    public int f304786f;

    /* renamed from: g */
    public int f304787g;

    /* renamed from: h */
    public long f304788h;

    /* renamed from: i */
    public long f304789i;

    /* renamed from: j */
    public long f304790j;

    /* renamed from: k */
    public final ArrayList<Long> f304791k;

    /* renamed from: l */
    public long f304792l;

    /* renamed from: m */
    public int f304793m;

    /* renamed from: n */
    public long f304794n;

    /* renamed from: o */
    public final int[] f304795o;

    /* renamed from: p */
    public C111139a f304796p;

    /* renamed from: q */
    public int f304797q;

    /* renamed from: r */
    public C110192a f304798r;

    /* renamed from: s */
    public int f304799s;

    /* renamed from: t */
    public int f304800t;

    /* renamed from: u */
    public boolean f304801u;

    /* renamed from: v */
    public int f304802v;

    /* renamed from: w */
    public long f304803w;

    /* renamed from: x */
    public long[] f304804x;

    /* renamed from: y */
    public int[] f304805y;

    /* renamed from: z */
    public final long[] f304806z;

    /* renamed from: ac3.g1$a */
    public static final class C103356a implements IWeVisReport {
        public void report(long j, String str) {
            C103357b bVar = C103355g1.f304769J;
            Log.m105924i("MicroMsg.XLabEffect", "report id:" + j + ", value: " + str);
            C115669n.INSTANCE.kvStat((int) j, str);
        }
    }

    /* renamed from: ac3.g1$b */
    public static final class C103357b {
        public C103357b(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo143261a() {
            Class cls = C87790d.class;
            if (((C87790d) C86312j.m106911c(cls)).isInstalled("xlab")) {
                C36070f.f96151a = ((C87790d) C86312j.m106911c(cls)).mo122034R0("xlabeffect");
                C103367l1.m137008a();
            }
        }
    }

    /* renamed from: ac3.g1$c */
    public static final class C103358c extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103355g1 f304807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103358c(C103355g1 g1Var) {
            super(2);
            this.f304807d = g1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C103355g1 g1Var = this.f304807d;
            g1Var.f304795o[intValue] = intValue2;
            g1Var.mo143253t(intValue, intValue2);
            return C13598b0.f38549a;
        }
    }

    static {
        C103357b bVar = new C103357b((C8480h) null);
        f304769J = bVar;
        boolean z = C103367l1.f304841a;
        boolean z2 = C36070f.f96151a;
        C103364k1 k1Var = C103364k1.f304831d;
        C87412m.m108595h(k1Var, "loader");
        C36070f.f96152b = k1Var;
        bVar.mo143261a();
        WeVisReportWrapper.INSTANCE.setImpl(new C103356a());
    }

    public C103355g1(int i) {
        this(i, false, false, false, false, false, (C110264g.C47730a) null, 126, (C8480h) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103355g1(int r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, q00.C110264g.C47730a r28, int r29, gy3.C8480h r30) {
        /*
            r21 = this;
            r1 = r21
            r0 = r29 & 1
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = 0
            goto L_0x000b
        L_0x0009:
            r0 = r22
        L_0x000b:
            r3 = r29 & 2
            r4 = 1
            if (r3 == 0) goto L_0x0012
            r3 = 1
            goto L_0x0014
        L_0x0012:
            r3 = r23
        L_0x0014:
            r5 = r29 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r24
        L_0x001c:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r25
        L_0x0024:
            r7 = r29 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r26
        L_0x002c:
            r8 = r29 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 1
            goto L_0x0034
        L_0x0032:
            r8 = r27
        L_0x0034:
            r9 = r29 & 64
            if (r9 == 0) goto L_0x003b
            q00.g$a r9 = q00.C110264g.C47730a.APP_UNSPECIFIED
            goto L_0x003d
        L_0x003b:
            r9 = r28
        L_0x003d:
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            java.lang.String r11 = "appScene"
            gy3.C87412m.m108594g(r9, r11)
            r21.<init>()
            r1.f304781a = r0
            r1.f304782b = r3
            r1.f304783c = r9
            r1.f304787g = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f304791k = r0
            r11 = -1
            r1.f304803w = r11
            r0 = 13
            long[] r3 = new long[r0]
            r9 = 0
        L_0x005f:
            if (r9 >= r0) goto L_0x0066
            r3[r9] = r11
            int r9 = r9 + 1
            goto L_0x005f
        L_0x0066:
            r1.f304804x = r3
            int[] r3 = new int[r0]
            r9 = 0
        L_0x006b:
            r13 = -1
            if (r9 >= r0) goto L_0x0073
            r3[r9] = r13
            int r9 = r9 + 1
            goto L_0x006b
        L_0x0073:
            r1.f304805y = r3
            long[] r0 = new long[r4]
            r3 = 0
        L_0x0078:
            if (r3 >= r4) goto L_0x007f
            r0[r3] = r11
            int r3 = r3 + 1
            goto L_0x0078
        L_0x007f:
            r1.f304806z = r0
            int[] r0 = new int[r4]
            r3 = 0
        L_0x0084:
            if (r3 >= r4) goto L_0x008b
            r0[r3] = r13
            int r3 = r3 + 1
            goto L_0x0084
        L_0x008b:
            r1.f304772A = r0
            q00.g$c r0 = q00.C110264g.C110266c.SEGMENT_NONE
            r1.f304773B = r0
            ac3.i1 r0 = new ac3.i1
            r0.<init>()
            r1.f304776E = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.f304779H = r0
            java.lang.String r3 = "MicroMsg.XLabEffect"
            java.lang.String r0 = "WeVisionEffect init begin...."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            ac3.i1 r0 = r1.f304776E
            r0.getClass()
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.f304814g = r11
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r0 = r1.f304781a
            java.lang.String r9 = ", "
            java.lang.String r13 = "xlab_effect_config"
            r15 = 3
            if (r0 <= 0) goto L_0x00c1
            r2 = r0
            goto L_0x0105
        L_0x00c1:
            ac3.j1 r0 = ac3.C103362j1.f304817a
            com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            int r0 = ac3.C103362j1.f304823g
            int r16 = ac3.C103362j1.f304824h
            int r0 = r0 - r16
            if (r0 >= r15) goto L_0x00d0
            r0 = 1
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            r14 = 1012(0x3f4, float:1.418E-42)
            if (r0 == 0) goto L_0x00dd
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 101(0x65, float:1.42E-43)
            r15.mo175911u(r14, r2)
            goto L_0x00e4
        L_0x00dd:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 102(0x66, float:1.43E-43)
            r2.mo175911u(r14, r15)
        L_0x00e4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "getNumOfThread: "
            r2.append(r14)
            r2.append(r4)
            r2.append(r9)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r14 = "MicroMsg.XLabEffectConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            if (r0 == 0) goto L_0x0104
            r2 = 2
            goto L_0x0105
        L_0x0104:
            r2 = 1
        L_0x0105:
            ac3.g1$b r0 = f304769J
            r0.mo143261a()
            int r0 = ac3.C103362j1.f304823g
            int r0 = r0 + r4
            ac3.C103362j1.f304823g = r0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            int r14 = ac3.C103362j1.f304823g
            java.lang.String r15 = "start_count"
            r0.putInt(r15, r14)
            ac3.q0 r0 = ac3.C91992q0.f263331a
            r0.mo125828b()
            w80.e$a r0 = w80.C111744e.f334654d
            int r14 = r0.mo163483f()
            java.lang.String r15 = r0.mo163482e()
            c30.g r0 = new c30.g     // Catch:{ Exception -> 0x0150 }
            r0.<init>((java.lang.String) r15)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r4 = "name"
            java.lang.String r0 = r0.optString(r4)     // Catch:{ Exception -> 0x0150 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r4 = "Mali-G78"
            r17 = r9
            r9 = 0
            boolean r4 = z04.C112550d0.m153801u(r0, r4, r9)     // Catch:{ Exception -> 0x014b }
            if (r4 != 0) goto L_0x0149
            java.lang.String r4 = "Mali-G77"
            boolean r0 = z04.C112550d0.m153801u(r0, r4, r9)     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x015b
        L_0x0149:
            r0 = 1
            goto L_0x015c
        L_0x014b:
            r0 = move-exception
            goto L_0x0153
        L_0x014d:
            r17 = r9
            goto L_0x015b
        L_0x0150:
            r0 = move-exception
            r17 = r9
        L_0x0153:
            r4 = 0
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r9)
        L_0x015b:
            r0 = 0
        L_0x015c:
            di3.d r4 = di3.C86312j.m106911c(r10)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_wevision_allow_arm_fp16
            r18 = r11
            r11 = 0
            boolean r4 = r4.mo58784wf(r9, r11)
            di3.d r9 = di3.C86312j.m106911c(r10)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_voip_virtual_background_gpu_rating_high_end
            r11 = 70
            int r9 = r9.mo58779Qe(r10, r11)
            if (r6 == 0) goto L_0x017f
            if (r14 >= r9) goto L_0x017f
            r10 = 1
            goto L_0x0180
        L_0x017f:
            r10 = 0
        L_0x0180:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "XLabEffect: init deviceRating = "
            r11.append(r12)
            r11.append(r14)
            java.lang.String r12 = ", remoteRatingLimited = "
            r11.append(r12)
            r12 = 80
            r11.append(r12)
            java.lang.String r12 = ", runWithGPU = "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r12 = ", allowFP16 = "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = " deviceModel =  "
            r11.append(r12)
            r11.append(r15)
            java.lang.String r12 = ", isBlockGpu = "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = ", lowEndUseMiniSegmentModel = "
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = ", highEndGPURating = "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = ", tryUseMiniSegmentModel = "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 21526(0x5416, float:3.0164E-41)
            r9 = 3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r12 = 0
            r11[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r12 = 1
            r11[r12] = r9
            r9 = 2
            r11[r9] = r15
            r0.mo160131h(r6, r11)
            java.lang.Class<iq.d> r0 = p564iq.C87790d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            iq.d r0 = (p564iq.C87790d) r0
            java.lang.String r6 = "xlab"
            boolean r0 = r0.isInstalled(r6)
            r6 = 0
            r11 = 0
            if (r0 == 0) goto L_0x0271
            boolean r0 = qr3.C36070f.f96151a
            if (r0 != 0) goto L_0x020a
            goto L_0x0271
        L_0x020a:
            java.lang.String r0 = "WeVisionEffect init init init...."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            ac3.e1 r0 = ac3.C103352e1.f304762a
            r9 = 0
            q00.g$a r14 = r1.f304783c
            r15 = 1
            r20 = 0
            r22 = r0
            r23 = r9
            r24 = r10
            r25 = r14
            r26 = r15
            r27 = r20
            java.util.Map r0 = ac3.C103352e1.m136945a(r22, r23, r24, r25, r26, r27)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = ac3.C91992q0.f263334d
            r9.append(r10)
            java.lang.String r10 = "/OpenCLCNNLib.bin"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            q00.g$a r10 = r1.f304783c
            int r10 = r10.ordinal()
            int r14 = com.tencent.p014mm.xeffect.WeEffectRender.f319985a
            qr3.e$a r14 = qr3.C110470e.f330364b
            java.lang.String[] r0 = r14.mo161949a(r0)
            r22 = r0
            r23 = r2
            r24 = r9
            r25 = r7
            r26 = r4
            r27 = r10
            long r9 = com.tencent.p014mm.xeffect.WeEffectRender.nInitWithMap(r22, r23, r24, r25, r26, r27)
            r1.f304784d = r9
            ac3.h0 r0 = ac3.C39538h0.f106157d
            r0.getClass()
            ac3.i0 r0 = ac3.C39541i0.f106166d
            r4 = 1
            o40.C61926c.m72658C(r6, r0, r4, r6)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x026d
            ac3.i1 r0 = r1.f304776E
            r0.f304813f = r4
        L_0x026d:
            r21.mo143223B()
            goto L_0x0273
        L_0x0271:
            r1.f304784d = r11
        L_0x0273:
            if (r8 == 0) goto L_0x0280
            long r7 = r1.f304784d
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x027c
            goto L_0x0280
        L_0x027c:
            r4 = 1
            com.tencent.p014mm.xeffect.WeEffectRender.nSetupReport(r7, r4)
        L_0x0280:
            long r7 = r1.f304784d
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0287
            goto L_0x02b3
        L_0x0287:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "[WeVisionConfig] render compute async: "
            r0.append(r4)
            r4 = 1
            r0.append(r4)
            java.lang.String r4 = ", enableParallel:"
            r0.append(r4)
            boolean r4 = r1.f304782b
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = r1.f304782b
            if (r0 == 0) goto L_0x02b3
            long r7 = r1.f304784d
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "ConfigComputeRenderAsync"
            com.tencent.p014mm.xeffect.WeEffectRender.nSetConfigFlags(r7, r4, r0)
        L_0x02b3:
            int r0 = ac3.C103362j1.f304824h
            r4 = 1
            int r0 = r0 + r4
            ac3.C103362j1.f304824h = r0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            int r4 = ac3.C103362j1.f304824h
            java.lang.String r7 = "end_count"
            r0.putInt(r7, r4)
            if (r5 == 0) goto L_0x02ce
            ac3.i r0 = new ac3.i
            r4 = 3
            r5 = 0
            r0.<init>(r5, r5, r4, r6)
            goto L_0x02d5
        L_0x02ce:
            r4 = 3
            r5 = 0
            ac3.j r0 = new ac3.j
            r0.<init>(r5, r5, r4, r6)
        L_0x02d5:
            r1.f304796p = r0
            ac3.f1 r4 = new ac3.f1
            r4.<init>(r1)
            r0.f332762q = r4
            long r4 = r1.f304784d
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x02ee
            p80.b r0 = p80.C110193b.f329648a
            r4 = 13
            p80.a r0 = r0.mo161592a(r4)
            r1.f304798r = r0
        L_0x02ee:
            r0 = 6
            int[] r0 = new int[r0]
            int r4 = ac3.C103362j1.f304818b
            r5 = 0
            r0[r5] = r4
            int r4 = ac3.C103362j1.f304819c
            r5 = 1
            r0[r5] = r4
            int r4 = ac3.C103362j1.f304820d
            r5 = 2
            r0[r5] = r4
            int r4 = ac3.C103362j1.f304821e
            r5 = 3
            r0[r5] = r4
            int r4 = ac3.C103362j1.f304822f
            r5 = 4
            r0[r5] = r4
            r4 = 5
            r5 = 20
            r0[r4] = r5
            r1.f304795o = r0
            ac3.i1 r0 = r1.f304776E
            long r4 = r0.f304814g
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
            r0.f304808a = r4
            java.lang.String r0 = "WeVisionEffect init end...."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "XLabEffect: init "
            r0.append(r4)
            long r4 = r1.f304784d
            r0.append(r4)
            java.lang.String r4 = ", numOfThread:"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = ", cost:"
            r0.append(r2)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r18)
            r0.append(r4)
            r2 = r17
            r0.append(r2)
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct
            r0.<init>()
            r1.f304775D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103355g1.<init>(int, boolean, boolean, boolean, boolean, boolean, q00.g$a, int, gy3.h):void");
    }

    /* renamed from: F */
    public static int m136947F(C103355g1 g1Var, C110194c cVar, C110194c cVar2, long j, int i, boolean z, boolean z2, int i2, Object obj) {
        C110194c cVar3 = cVar;
        C110194c cVar4 = cVar2;
        long j2 = (i2 & 4) != 0 ? 0 : j;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        boolean z3 = (i2 & 16) != 0 ? false : z;
        boolean z4 = (i2 & 32) != 0 ? true : z2;
        g1Var.getClass();
        if (cVar3 == null || cVar4 == null) {
            return -1;
        }
        return C110264g.C110265b.m149907b(g1Var, cVar3.f329652e, cVar4.f329652e, j2, i3, z3, z4, false, 64, (Object) null);
    }

    /* renamed from: A */
    public final void mo143222A(int i, int i2, boolean z, int i3, boolean z2) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int i7 = -1;
        if (!z) {
            C110192a aVar = this.f304798r;
            if (aVar != null) {
                i7 = aVar.f329644e;
            }
            GLES20.glBindFramebuffer(36160, i7);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
            GLES20.glBindTexture(3553, i5);
            GLES20.glCopyTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, 0, 0, this.f304786f, this.f304785e, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(3553, 0);
            return;
        }
        if (this.f304780I == null) {
            this.f304780I = new C111141c(this.f304786f, this.f304785e, 0, 0, 2, 0, 44, (C8480h) null);
        }
        C111141c cVar = this.f304780I;
        if (cVar != null) {
            cVar.f332801G = i4;
        }
        if (z2) {
            if (cVar != null) {
                cVar.mo143262q(360 - i6);
            }
        } else if (cVar != null) {
            cVar.mo143262q(i6);
        }
        C111141c cVar2 = this.f304780I;
        if (cVar2 != null) {
            cVar2.f332760o = !z2;
        }
        if (cVar2 != null) {
            cVar2.mo162879m();
        }
        C110192a aVar2 = this.f304798r;
        if (aVar2 != null) {
            i7 = aVar2.f329644e;
        }
        GLES20.glBindFramebuffer(36160, i7);
        C111141c cVar3 = this.f304780I;
        C110194c cVar4 = cVar3 != null ? cVar3.f332754i : null;
        C87412m.m108591d(cVar4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, cVar4.f329652e, 0);
        GLES20.glBindTexture(3553, i5);
        GLES20.glCopyTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, 0, 0, this.f304786f, this.f304785e, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: B */
    public final void mo143223B() {
        C91992q0 q0Var = C91992q0.f263331a;
        C110264g.C47730a aVar = this.f304783c;
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int ordinal = aVar.ordinal();
        String str = null;
        String str2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 6 ? null : "sightcap.ini" : "voip_highrank.ini" : "live_highrank.ini" : "live.ini" : "zpbq.ini" : "voip.ini";
        if (str2 != null) {
            String str3 = C91992q0.f263340j + XVFSFile.SEPARATOR_CHAR + str2;
            if (C86013q1.m106450k(str3)) {
                str = str3;
            } else {
                Log.m105924i("MicroMsg.WeVisFileUtil", "getIniFilePath: file not exist " + str3);
            }
        }
        Log.m105924i("MicroMsg.XLabEffect", "initSettings: " + str);
        if (this.f304784d != 0 && str != null) {
            Map<String, String> i402 = ((C12024e) C86312j.m106911c(C12024e.class)).i40(this.f304783c);
            long j = this.f304784d;
            int i = WeEffectRender.f319985a;
            String nInitSettings = WeEffectRender.nInitSettings(j, str, C110470e.f330364b.mo161949a(i402));
            if (nInitSettings != null) {
                int ordinal2 = this.f304783c.ordinal();
                WevisionSwitchResStruct wevisionSwitchResStruct = new WevisionSwitchResStruct();
                if (C110470e.f330363a == 0) {
                    C110470e.f330363a = 2011400;
                }
                wevisionSwitchResStruct.f79234d = C110470e.f330363a;
                wevisionSwitchResStruct.f79236f = 4;
                wevisionSwitchResStruct.f79235e = ordinal2;
                wevisionSwitchResStruct.f79238h = wevisionSwitchResStruct.mo86045b("SwitchRes", nInitSettings, true);
                Log.m105924i("MicroMsg.WeVisConfigReporter", "reportUsage: " + wevisionSwitchResStruct.mo1006q());
                wevisionSwitchResStruct.mo86054n();
            }
        }
    }

    /* renamed from: C */
    public void mo143224C(int i, int i2) {
        if (this.f304786f != i || this.f304785e != i2) {
            Log.m105924i("MicroMsg.XLabEffect", "setSize: " + i + ", " + i2);
            this.f304786f = i;
            this.f304785e = i2;
            this.f304796p.mo143263u(i, i2);
        }
    }

    /* renamed from: D */
    public int mo143225D(int i, int i2, long j, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, int i6) {
        if (this.f304784d == 0) {
            mo143222A(i, i2, z, i3, z3);
            return -1;
        }
        int z4 = mo143259z(i4);
        int z5 = mo143259z(i3);
        long currentTicks = Util.currentTicks();
        mo143258y();
        C103360i1 i1Var = this.f304776E;
        i1Var.getClass();
        i1Var.f304816i = Util.currentTicks();
        int nRenderToTextureOutputRotate = WeEffectRender.nRenderToTextureOutputRotate(this.f304784d, i, i2, i5, i6, z5, z4, z, z3);
        this.f304776E.mo143265a();
        if (z2) {
            GLES20.glFinish();
        }
        Log.m105918d("MicroMsg.XLabEffect", "render: " + this.f304784d + ' ' + nRenderToTextureOutputRotate + ", cost:" + Util.ticksToNow(currentTicks));
        return nRenderToTextureOutputRotate;
    }

    /* renamed from: E */
    public int mo143226E(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = bArr;
        C87412m.m108594g(bArr, "inputBuffer");
        byte[] bArr4 = bArr2;
        C87412m.m108594g(bArr2, "outputBuffer");
        if (this.f304784d == 0) {
            return -1;
        }
        C103360i1 i1Var = this.f304776E;
        i1Var.getClass();
        i1Var.f304816i = Util.currentTicks();
        int nRenderToBuffer = WeEffectRender.nRenderToBuffer(this.f304784d, bArr, i, i2, bArr2, i3, 0, false);
        GLES20.glFinish();
        this.f304776E.mo143265a();
        return nRenderToBuffer;
    }

    /* renamed from: G */
    public void mo143227G(int i, int i2, int i3, int i4, int i5) {
        Log.m105924i("MicroMsg.XLabEffect", "setBeautyConfig: skinSmooth " + i + ", eyeMorph " + i2 + ", faceMorph " + i3 + ", skinBright " + i4 + ", eyeBright " + i5);
        int[] iArr = this.f304795o;
        if (i < 0) {
            C103362j1 j1Var = C103362j1.f304817a;
            i = C103362j1.f304818b;
        }
        iArr[0] = i;
        if (i2 < 0) {
            C103362j1 j1Var2 = C103362j1.f304817a;
            i2 = C103362j1.f304819c;
        }
        iArr[1] = i2;
        if (i3 < 0) {
            C103362j1 j1Var3 = C103362j1.f304817a;
            i3 = C103362j1.f304820d;
        }
        iArr[2] = i3;
        if (i4 < 0) {
            C103362j1 j1Var4 = C103362j1.f304817a;
            i4 = C103362j1.f304821e;
        }
        iArr[3] = i4;
        if (i5 < 0) {
            C103362j1 j1Var5 = C103362j1.f304817a;
            i5 = C103362j1.f304822f;
        }
        iArr[4] = i5;
    }

    /* renamed from: H */
    public void mo143228H(boolean z, int i) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            C91992q0 q0Var = C91992q0.f263331a;
            sb.append(C91992q0.f263332b);
            sb.append("/LutFilters/DefaultLut");
            mo143239f(sb.toString(), ((float) i) / 100.0f);
            return;
        }
        mo143239f((String) null, 1.0f);
    }

    /* renamed from: I */
    public void mo143229I(boolean z) {
        if (z) {
            mo143253t(0, this.f304795o[0]);
            mo143253t(1, this.f304795o[1]);
            mo143253t(2, this.f304795o[2]);
            mo143253t(3, this.f304795o[3]);
            mo143253t(4, this.f304795o[4]);
            C103362j1 j1Var = C103362j1.f304817a;
            C103362j1.f304825i = new C103358c(this);
            return;
        }
        mo143253t(0, 0);
        mo143253t(1, 0);
        mo143253t(2, 0);
        mo143253t(3, 0);
        mo143253t(4, 0);
    }

    /* renamed from: J */
    public void mo143230J(boolean z, float f, C110264g.C110266c cVar) {
        C87412m.m108594g(cVar, "mode");
        long j = this.f304784d;
        if (j != 0) {
            if (z != this.f304774C || cVar != this.f304773B) {
                this.f304774C = z;
                this.f304773B = cVar;
                WeEffectRender.nSetSegmentBgBlur(j, z, f, cVar.ordinal());
            }
        }
    }

    /* renamed from: K */
    public void mo143231K(C110264g.C110267d dVar, int i) {
        C87412m.m108594g(dVar, "type");
        if (this.f304784d != 0) {
            int ordinal = dVar.ordinal();
            long j = this.f304804x[ordinal];
            if (j >= 0 || i > 0) {
                float f = ((float) i) / 100.0f;
                if (i > 0 && j < 0) {
                    StringBuilder sb = new StringBuilder();
                    C91992q0 q0Var = C91992q0.f263331a;
                    sb.append(C91992q0.f263337g);
                    sb.append("/slimer_temp");
                    sb.append(f304770K[ordinal]);
                    this.f304804x[ordinal] = WeEffectRender.nAddFaceAutoSlimer(this.f304784d, sb.toString());
                    WeEffectRender.nSetRenderTextureCropSize(this.f304784d, 0.95f);
                }
                if (this.f304805y[ordinal] != i) {
                    WeEffectRender.nSetSlimerRate(this.f304784d, this.f304804x[ordinal], f);
                }
                this.f304805y[ordinal] = i;
                long[] jArr = this.f304804x;
                int length = jArr.length;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (jArr[i2] >= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    this.f304787g = this.f304787g | 2048 | 4096;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143232L() {
        /*
            r10 = this;
            long r0 = r10.f304784d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r10.f304802v
            r1 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x0023
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setSegment:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.XLabEffect"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r4 = r10.f304784d
            r7 = 0
            if (r6 == 0) goto L_0x004a
            r3 = 4
            r8 = 4
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            r9 = -1
            com.tencent.p014mm.xeffect.WeEffectRender.nSetSegment(r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103355g1.mo143232L():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (((r4.f304802v & 1024) != 0) != false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143233a(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 1
            if (r5 == 0) goto L_0x0010
            int r3 = r4.f304802v
            r3 = r3 & r1
            if (r3 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            if (r3 == 0) goto L_0x001a
        L_0x0010:
            if (r5 != 0) goto L_0x0022
            int r3 = r4.f304802v
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            r0 = 10
            r4.mo143255v(r0, r5)
            r4.mo143232L()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103355g1.mo143233a(boolean):void");
    }

    /* renamed from: b */
    public int mo143234b(int i, int i2, long j, int i3, boolean z, boolean z2, boolean z3) {
        if (this.f304784d == 0) {
            mo143222A(i, i2, z, i3, z3);
            return -1;
        }
        int z4 = mo143259z(i3);
        long currentTicks = Util.currentTicks();
        mo143258y();
        C103360i1 i1Var = this.f304776E;
        i1Var.getClass();
        i1Var.f304816i = Util.currentTicks();
        int nRenderToTexture = WeEffectRender.nRenderToTexture(this.f304784d, i, i2, this.f304786f, this.f304785e, z4, z, z3);
        this.f304776E.mo143265a();
        if (z2) {
            GLES20.glFinish();
        }
        Log.m105918d("MicroMsg.XLabEffect", "render: " + this.f304784d + ' ' + nRenderToTexture + ", cost:" + Util.ticksToNow(currentTicks));
        return nRenderToTexture;
    }

    /* renamed from: c */
    public WeVisionBaseDataStruct mo143235c() {
        return this.f304775D;
    }

    /* renamed from: d */
    public void mo143236d(IWeJsonMessageCallback iWeJsonMessageCallback) {
        WeEffectRender.m144536b(this.f304784d, iWeJsonMessageCallback);
    }

    public void destroy() {
        Log.m105924i("MicroMsg.XLabEffect", "destroy: " + this.f304784d + ' ' + Util.getStack());
        C103362j1 j1Var = C103362j1.f304817a;
        C103362j1.f304825i = null;
        C111141c cVar = this.f304780I;
        if (cVar != null) {
            cVar.mo158471l();
        }
        this.f304796p.mo158471l();
        long j = this.f304784d;
        if (j != 0) {
            WeEffectRender.nRemoveResource(j, this.f304788h);
            WeEffectRender.nRemoveResource(this.f304784d, this.f304789i);
            WeEffectRender.nRemoveResource(this.f304784d, this.f304790j);
            for (Number longValue : this.f304791k) {
                WeEffectRender.nRemoveResource(this.f304784d, longValue.longValue());
            }
            WeEffectRender.m144536b(this.f304784d, (IWeJsonMessageCallback) null);
            WeEffectRender.nDestroy(this.f304784d);
            WeEffectCallbackMgr.INSTANCE.clearCallback(this.f304784d);
        } else {
            C110192a aVar = this.f304798r;
            if (aVar != null) {
                aVar.close();
            }
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wevision_data_report, false)) {
            this.f304775D.mo86054n();
        }
    }

    /* renamed from: e */
    public void mo143238e(boolean z) {
        this.f304777F = z;
    }

    /* renamed from: f */
    public void mo143239f(String str, float f) {
        if (this.f304784d != 0) {
            if (TextUtils.isEmpty(str)) {
                WeEffectRender.nRemoveFilter(this.f304784d, this.f304803w);
                Log.m105924i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f304803w);
                mo143255v(9, false);
                return;
            }
            long j = this.f304784d;
            C87412m.m108591d(str);
            long nCreateFilterWithConfig = WeEffectRender.nCreateFilterWithConfig(j, str);
            this.f304803w = nCreateFilterWithConfig;
            WeEffectRender.nSetFilterColorWeight(this.f304784d, nCreateFilterWithConfig, f);
            Log.m105924i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f304803w);
            mo143255v(9, true);
        }
    }

    /* renamed from: g */
    public void mo143240g(C54008d0 d0Var) {
        if (d0Var != null && !this.f304779H.contains(d0Var)) {
            this.f304779H.add(d0Var);
        }
    }

    /* renamed from: h */
    public long mo143241h(int i, String str) {
        C87412m.m108594g(str, "path");
        long j = this.f304784d;
        if (j == 0) {
            return -1;
        }
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? WeEffectRender.nCreateMakeUp(j, 4, str) : WeEffectRender.nCreateMakeUp(j, 3, str) : WeEffectRender.nCreateMakeUp(j, 2, str) : WeEffectRender.nCreateMakeUp(j, 1, str) : WeEffectRender.nCreateMakeUp(j, 0, str);
    }

    /* renamed from: i */
    public void mo143242i(int i, int i2, boolean z) {
        long j = this.f304784d;
        if (j != 0 ? WeEffectRender.nNeedFaceTrack(j) : false) {
            this.f304797q = mo143259z(0);
            this.f304796p.mo159578p(i);
            this.f304796p.mo143262q(i2);
            this.f304796p.mo158479j(z);
            this.f304796p.f332766u = true;
            this.f304796p.mo162879m();
        }
    }

    /* renamed from: j */
    public long mo143243j(String str) {
        C87412m.m108594g(str, "path");
        long j = this.f304784d;
        if (j == 0) {
            return -1;
        }
        return WeEffectRender.nCreateSticker(j, 0, str);
    }

    /* renamed from: k */
    public void mo143244k(long j, String str, int i) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        long j2 = this.f304784d;
        if (j2 != 0) {
            WeEffectRender.nReceiveJsonMessage(j2, j, str, str.length(), i);
        }
    }

    /* renamed from: l */
    public void mo143245l(boolean z) {
        if (z) {
            this.f304787g |= 1;
        } else {
            this.f304787g &= -2;
        }
    }

    /* renamed from: m */
    public void mo143246m(C54008d0 d0Var) {
        if (d0Var != null) {
            this.f304779H.remove(d0Var);
        }
    }

    /* renamed from: n */
    public void mo143247n(long j, IWeEffectCallback iWeEffectCallback) {
        long j2 = this.f304784d;
        if (j2 != 0) {
            WeEffectRender.m144535a(j2, j, iWeEffectCallback);
        }
    }

    /* renamed from: o */
    public long mo143248o() {
        return this.f304784d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo143249p(rh3.C101382f r9) {
        /*
            r8 = this;
            java.lang.String r0 = "sticker"
            gy3.C87412m.m108594g(r9, r0)
            long r0 = r8.f304784d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            r0 = -1
            return r0
        L_0x0010:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "create sticker: "
            r0.append(r1)
            java.lang.String r1 = r9.f296972d
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r9.f296971c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.XLabEffect"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r8.f304787g
            r2 = 2
            r0 = r0 | r2
            r0 = r0 | 4
            r8.f304787g = r0
            java.util.HashMap<java.lang.String, rh3.e> r0 = r9.f296974f
            java.util.Collection r0 = r0.values()
            java.lang.String r3 = "elements.values"
            gy3.C87412m.m108593f(r0, r3)
            boolean r4 = r0.isEmpty()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x004e
            goto L_0x006f
        L_0x004e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r0.next()
            rh3.e r4 = (rh3.C101381e) r4
            int r4 = r4.f296964b
            r7 = 10
            if (r7 > r4) goto L_0x006a
            r7 = 18
            if (r4 >= r7) goto L_0x006a
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            if (r4 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r0 == 0) goto L_0x0077
            int r0 = r8.f304787g
            r0 = r0 | r1
            r8.f304787g = r0
        L_0x0077:
            java.util.HashMap<java.lang.String, rh3.e> r0 = r9.f296974f
            java.util.Collection r0 = r0.values()
            gy3.C87412m.m108593f(r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0087
            goto L_0x00a8
        L_0x0087:
            java.util.Iterator r0 = r0.iterator()
        L_0x008b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r0.next()
            rh3.e r1 = (rh3.C101381e) r1
            int r1 = r1.f296964b
            r3 = 100
            if (r3 > r1) goto L_0x00a3
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 >= r3) goto L_0x00a3
            r1 = 1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            if (r1 == 0) goto L_0x008b
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 == 0) goto L_0x00b1
            int r0 = r8.f304787g
            r0 = r0 | 16
            r8.f304787g = r0
        L_0x00b1:
            java.lang.String r0 = r9.f296971c
            int r1 = r0.hashCode()
            switch(r1) {
                case -2052467665: goto L_0x00f2;
                case -1890090921: goto L_0x00e0;
                case -964830573: goto L_0x00cd;
                case -656591085: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x0104
        L_0x00bb:
            java.lang.String r1 = "Segment"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c4
            goto L_0x0104
        L_0x00c4:
            long r0 = r8.f304784d
            java.lang.String r9 = r9.f296972d
            long r0 = com.tencent.p014mm.xeffect.WeEffectRender.nCreateSticker(r0, r5, r9)
            goto L_0x010c
        L_0x00cd:
            java.lang.String r1 = "FaceDeformation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d6
            goto L_0x0104
        L_0x00d6:
            long r0 = r8.f304784d
            r2 = 3
            java.lang.String r9 = r9.f296972d
            long r0 = com.tencent.p014mm.xeffect.WeEffectRender.nCreateSticker(r0, r2, r9)
            goto L_0x010c
        L_0x00e0:
            java.lang.String r1 = "StickerFixed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0104
        L_0x00e9:
            long r0 = r8.f304784d
            java.lang.String r9 = r9.f296972d
            long r0 = com.tencent.p014mm.xeffect.WeEffectRender.nCreateSticker(r0, r2, r9)
            goto L_0x010c
        L_0x00f2:
            java.lang.String r1 = "Sticker2D"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fb
            goto L_0x0104
        L_0x00fb:
            long r0 = r8.f304784d
            java.lang.String r9 = r9.f296972d
            long r0 = com.tencent.p014mm.xeffect.WeEffectRender.nCreateSticker(r0, r6, r9)
            goto L_0x010c
        L_0x0104:
            long r0 = r8.f304784d
            java.lang.String r9 = r9.f296972d
            long r0 = com.tencent.p014mm.xeffect.WeEffectRender.nCreateSticker(r0, r6, r9)
        L_0x010c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103355g1.mo143249p(rh3.f):long");
    }

    /* renamed from: q */
    public void mo143250q(String str, float f) {
        if (this.f304784d != 0) {
            if (TextUtils.isEmpty(str)) {
                WeEffectRender.nRemoveFilter(this.f304784d, this.f304803w);
                Log.m105924i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f304803w);
                mo143255v(9, false);
                return;
            }
            long j = this.f304784d;
            C87412m.m108591d(str);
            this.f304803w = WeEffectRender.nCreateFilter(j, str, f);
            Log.m105924i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f304803w);
            mo143255v(9, true);
        }
    }

    /* renamed from: r */
    public void mo143251r(long j) {
        long j2 = this.f304784d;
        if (j2 != 0) {
            WeEffectRender.nRemoveResource(j2, j);
            WeEffectRender.m144535a(this.f304784d, j, (IWeEffectCallback) null);
        }
    }

    /* renamed from: s */
    public void mo143252s(XEffectConfig xEffectConfig) {
        long j;
        int i;
        C87412m.m108594g(xEffectConfig, "config");
        boolean z = false;
        mo143253t(0, xEffectConfig.f318443g);
        mo143253t(1, xEffectConfig.f318444h);
        mo143253t(8, xEffectConfig.f318445i);
        mo143253t(3, xEffectConfig.f318446j);
        mo143253t(4, xEffectConfig.f318447n);
        mo143253t(5, xEffectConfig.f318448o);
        int i2 = xEffectConfig.f318435E;
        long j2 = this.f304784d;
        if (j2 != 0) {
            WeEffectRender.nSetMouthMorph(j2, ((float) i2) / 100.0f);
        }
        int i3 = xEffectConfig.f318449p;
        int i4 = xEffectConfig.f318450q;
        long j3 = this.f304784d;
        if (j3 != 0) {
            WeEffectRender.nSetBeautyDeFaceWrinkle(j3, ((float) i3) / 100.0f, ((float) i4) / 100.0f);
        }
        int i5 = xEffectConfig.f318451r;
        long j4 = this.f304784d;
        if (j4 != 0) {
            WeEffectRender.nSetBeautySharpenFilter(j4, ((float) i5) / 100.0f);
        }
        int i6 = xEffectConfig.f318452s;
        long j5 = this.f304784d;
        if (j5 != 0) {
            if (i6 > 0 && this.f304777F) {
                this.f304787g |= 32768;
            }
            WeEffectRender.nSetTeethBright(j5, ((float) i6) / 100.0f);
        }
        mo143231K(C110264g.C110267d.SmallHead, xEffectConfig.f318453t);
        mo143231K(C110264g.C110267d.CheekBone, xEffectConfig.f318454u);
        mo143231K(C110264g.C110267d.LowerJawbone, xEffectConfig.f318455v);
        mo143231K(C110264g.C110267d.WingOfNose, xEffectConfig.f318456w);
        mo143231K(C110264g.C110267d.ChinShort, xEffectConfig.f318457x);
        mo143231K(C110264g.C110267d.ChinLong, xEffectConfig.f318458y);
        mo143231K(C110264g.C110267d.HairLineHigh, xEffectConfig.f318459z);
        mo143231K(C110264g.C110267d.HairLineLow, xEffectConfig.f318431A);
        mo143231K(C110264g.C110267d.BigEye, xEffectConfig.f318432B);
        mo143231K(C110264g.C110267d.BoySlim, xEffectConfig.f318433C);
        mo143231K(C110264g.C110267d.GirlSlim, xEffectConfig.f318434D);
        mo143231K(C110264g.C110267d.ZhaiLian, xEffectConfig.f318436F);
        int i7 = xEffectConfig.f318437G;
        long j6 = this.f304784d;
        if (j6 != 0 && (j >= 0 || i7 > 0)) {
            float f = ((float) i7) / 100.0f;
            if (i7 > 0) {
                if (i < 0) {
                    this.f304806z[0] = WeEffectRender.nCreateSticker(this.f304784d, 0, C91992q0.f263337g + f304771L[0]);
                }
                if (this.f304772A[0] != i7) {
                    WeEffectRender.nSetMakeUpAlpha(this.f304784d, this.f304806z[0], f);
                }
            } else if (i >= 0) {
                WeEffectRender.nRemoveResource(j6, (j = this.f304806z[0]));
                this.f304806z[0] = -1;
            }
            this.f304772A[0] = i7;
            long[] jArr = this.f304806z;
            int length = jArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (jArr[i8] >= 0) {
                    z = true;
                    break;
                }
                i8++;
            }
            if (z) {
                this.f304787g = this.f304787g | 128 | 2048;
            }
        }
        if (xEffectConfig.f318452s > 40 || xEffectConfig.f318437G > 40 || xEffectConfig.f318449p > 40 || xEffectConfig.f318450q > 40) {
            this.f304787g |= 32768;
        } else {
            this.f304787g &= -32769;
        }
    }

    /* renamed from: t */
    public void mo143253t(int i, int i2) {
        if (this.f304784d != 0) {
            if (i != 5) {
                if (i != 8) {
                    Log.m105924i("MicroMsg.XLabEffect", "setEffectLevel: " + i + ", " + i2);
                    WeEffectRender.nSetEffectLevel(this.f304784d, i, ((float) i2) / 100.0f, this.f304783c.ordinal());
                } else {
                    mo143231K(C110264g.C110267d.FaceMorph, i2);
                }
            } else if (this.f304793m != i2) {
                Log.m105924i("MicroMsg.XLabEffect", "setRosy: " + i2);
                long j = this.f304792l;
                if (j > 0 && i2 <= 0) {
                    WeEffectRender.nRemoveFilter(this.f304784d, j);
                    this.f304792l = 0;
                }
                if (this.f304792l <= 0 && i2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    C91992q0 q0Var = C91992q0.f263331a;
                    sb.append(C91992q0.f263332b);
                    sb.append("/LutFilters/WechatRosy/");
                    this.f304792l = WeEffectRender.nCreateFilterWithConfig(this.f304784d, sb.toString());
                }
                long j2 = this.f304792l;
                if (j2 > 0 && i2 > 0) {
                    WeEffectRender.nSetFilterColorWeight(this.f304784d, j2, ((float) i2) / 100.0f);
                }
                this.f304793m = i2;
            }
            mo143255v(i, i2 > 0);
        }
    }

    /* renamed from: u */
    public boolean mo143254u() {
        return this.f304777F;
    }

    /* renamed from: v */
    public void mo143255v(int i, boolean z) {
        if (z) {
            this.f304802v |= 1 << i;
            if (i == 14) {
                this.f304787g |= 8192;
            } else if (i == 17) {
                this.f304787g |= 2048;
            }
        } else {
            this.f304802v &= ~(1 << i);
            if (i == 14) {
                this.f304787g &= -8193;
            } else if (i == 17) {
                this.f304787g &= -2049;
            }
        }
    }

    /* renamed from: w */
    public void mo143256w(boolean z) {
        this.f304778G = z;
    }

    /* renamed from: x */
    public void mo143257x(C101383g gVar) {
        long j = this.f304784d;
        if (j != 0) {
            WeEffectRender.nRemoveResource(j, this.f304788h);
            WeEffectRender.nRemoveResource(this.f304784d, this.f304789i);
            WeEffectRender.nRemoveResource(this.f304784d, this.f304790j);
            for (Number longValue : this.f304791k) {
                WeEffectRender.nRemoveResource(this.f304784d, longValue.longValue());
            }
            this.f304788h = 0;
            this.f304789i = 0;
            this.f304790j = 0;
            this.f304791k.clear();
            boolean z = false;
            mo143255v(11, false);
            mo143255v(12, false);
            mo143255v(13, false);
            if (gVar != null && gVar.mo140864a()) {
                z = true;
            }
            if (z) {
                C101382f fVar = gVar.f296983h;
                if (fVar != null) {
                    this.f304788h = mo143249p(fVar);
                    mo143255v(11, true);
                }
                C101382f fVar2 = gVar.f296984i;
                if (fVar2 != null) {
                    this.f304789i = mo143249p(fVar2);
                    mo143255v(12, true);
                }
                C101382f fVar3 = gVar.f296985j;
                if (fVar3 != null) {
                    this.f304790j = mo143249p(fVar3);
                    mo143255v(13, true);
                }
                ArrayList<Long> arrayList = this.f304791k;
                ArrayList<C101382f> arrayList2 = gVar.f296986k;
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                for (C101382f p : arrayList2) {
                    arrayList3.add(Long.valueOf(mo143249p(p)));
                }
                arrayList.addAll(arrayList3);
            } else {
                this.f304787g &= -51;
            }
            mo143232L();
            Log.m105924i("MicroMsg.XLabEffect", "change sticker " + this.f304788h + ", " + this.f304790j + ", " + this.f304791k);
        }
    }

    /* renamed from: y */
    public final void mo143258y() {
        if (this.f304784d != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f304794n < elapsedRealtime) {
                WeEffectRender.nUpdateSticker(this.f304784d);
                long j = this.f304794n + 83;
                this.f304794n = j;
                if (j < elapsedRealtime) {
                    this.f304794n = elapsedRealtime;
                }
            }
        }
    }

    /* renamed from: z */
    public final int mo143259z(int i) {
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }
}
