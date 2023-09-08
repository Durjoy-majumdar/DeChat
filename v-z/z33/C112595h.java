package z33;

import android.os.Process;
import android.util.Size;
import bp3.C104160f;
import bp3.C79758p;
import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import n90.C109726b;
import p156gj.C107835h0;
import rx3.C13601g;
import rx3.C36568h;
import w80.C111744e;
import xi3.C78844a;

/* renamed from: z33.h */
public final class C112595h {

    /* renamed from: a */
    public static final C112595h f337166a = new C112595h();

    /* renamed from: b */
    public static boolean f337167b = false;

    /* renamed from: c */
    public static boolean f337168c = false;

    /* renamed from: d */
    public static boolean f337169d = true;

    /* renamed from: e */
    public static boolean f337170e;

    /* renamed from: f */
    public static boolean f337171f;

    /* renamed from: g */
    public static boolean f337172g;

    /* renamed from: h */
    public static boolean f337173h;

    /* renamed from: i */
    public static boolean f337174i;

    /* renamed from: j */
    public static boolean f337175j;

    /* renamed from: k */
    public static final boolean f337176k = (Process.myUid() / 100000 != 0);

    /* renamed from: l */
    public static final C13601g f337177l = C36568h.m40985a(C16098a.f43250d);

    /* renamed from: z33.h$a */
    public static final class C16098a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C16098a f43250d = new C16098a();

        public C16098a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C78844a.C15689b.f42385a.mo108842h(true));
        }
    }

    /* renamed from: a */
    public static final int m153917a() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_voip_camera_retry_timeout, 10) * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (oa1.C117731d.m166007c().mo182440a(new eg3.C107269a()) == 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r0.mo109883f(new eg3.C107269a()) == 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r0 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153918b() {
        /*
            bp3.p r0 = bp3.C79758p.f233760a
            eg3.a r1 = new eg3.a
            r1.<init>()
            int r1 = r0.mo109883f(r1)
            eg3.a r2 = new eg3.a
            r2.<init>()
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3 instanceof java.lang.Integer
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            int r3 = r3.intValue()
            if (r1 == r3) goto L_0x0031
        L_0x0022:
            eg3.a r1 = new eg3.a
            r1.<init>()
            int r0 = r0.mo109883f(r1)
            if (r0 != r6) goto L_0x002f
        L_0x002d:
            r0 = 1
            goto L_0x0081
        L_0x002f:
            r0 = 0
            goto L_0x0081
        L_0x0031:
            r0 = 4
            java.lang.String r7 = eb0.C86487f6.m107217a(r0)
            if (r7 == 0) goto L_0x0071
            java.lang.String r0 = ";"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r0 = z04.C112550d0.m153785U(r7, r8, r9, r10, r11, r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0071
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r3)
            java.lang.String r1 = "28002100"
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r3)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x004a
            java.lang.String r1 = "28002135"
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r3)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x004a
            goto L_0x002d
        L_0x0071:
            oa1.d r0 = oa1.C117731d.m166007c()
            eg3.a r1 = new eg3.a
            r1.<init>()
            int r0 = r0.mo182440a(r1)
            if (r0 != r6) goto L_0x002f
            goto L_0x002d
        L_0x0081:
            if (r0 == 0) goto L_0x0084
            return r6
        L_0x0084:
            bp3.p r0 = bp3.C79758p.f233760a
            eg3.d r1 = new eg3.d
            r1.<init>()
            int r1 = r0.mo109883f(r1)
            eg3.d r3 = new eg3.d
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            int r2 = r2.intValue()
            if (r1 == r2) goto L_0x00b0
        L_0x00a3:
            eg3.d r1 = new eg3.d
            r1.<init>()
            int r0 = r0.mo109883f(r1)
            if (r0 != r6) goto L_0x00af
            r5 = 1
        L_0x00af:
            return r5
        L_0x00b0:
            oa1.d r0 = oa1.C117731d.m166007c()
            eg3.d r1 = new eg3.d
            r1.<init>()
            int r0 = r0.mo182440a(r1)
            if (r0 != r6) goto L_0x00c0
            r5 = 1
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.m153918b():boolean");
    }

    /* renamed from: e */
    public static final boolean m153919e() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_DecodeUseThreadProcess_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_decode_thread_independence, true);
    }

    /* renamed from: f */
    public static final boolean m153920f() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_EncodeUseThreadProcess_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_encode_thread_independence, true);
    }

    /* renamed from: h */
    public static final boolean m153921h() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_SoftDataUseImageReader_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_soft_data_from_imagereader, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m153922i() {
        /*
            z33.h r0 = f337166a
            boolean r0 = r0.mo164370d()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_VOIP_FaceBeautyParams_Int
            r5 = -1
            int r6 = r0.mo109882e(r4, r5)
            if (r6 == r5) goto L_0x0020
            int r0 = r0.mo109882e(r4, r5)
            if (r0 != r1) goto L_0x001e
            r0 = 1
            goto L_0x0034
        L_0x001e:
            r0 = 0
            goto L_0x0034
        L_0x0020:
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322870J
            if (r0 != r2) goto L_0x001e
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_voip_xsetting_allow_voip_use_facebeautyrank
            boolean r0 = r0.mo58784wf(r4, r3)
        L_0x0034:
            if (r0 == 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING
            r5 = 0
            java.lang.String r0 = r0.mo119675I(r4, r5)
            if (r0 != 0) goto L_0x004c
            return r1
        L_0x004c:
            c30.g r4 = new c30.g
            r4.<init>((java.lang.String) r0)
            java.lang.String r0 = "version"
            boolean r5 = r4.has(r0)     // Catch:{ Exception -> 0x0065 }
            if (r5 != r2) goto L_0x005c
            r5 = 1
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            if (r5 == 0) goto L_0x0071
            int r0 = r4.getInt(r0)     // Catch:{ Exception -> 0x0065 }
            r1 = r0
            goto L_0x0071
        L_0x0065:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            java.lang.String r0 = "safeGetInt"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r2)
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.m153922i():int");
    }

    /* renamed from: j */
    public static final Size m153923j() {
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_ForceHardCameraInit_Int, 0);
        if (e == 0) {
            return null;
        }
        if (e == 1) {
            return new Size(480, v2helper.VOIP_ENC_HEIGHT_LV1);
        }
        if (e == 2) {
            return new Size(640, 480);
        }
        if (e == 3) {
            return new Size(1280, TAVExporter.VIDEO_EXPORT_WIDTH);
        }
        if (e != 4) {
            return null;
        }
        return new Size(1920, 1080);
    }

    /* renamed from: k */
    public static final Size m153924k() {
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_ForceHardEncode_Int, 0);
        if (e == 1) {
            return new Size(480, v2helper.VOIP_ENC_HEIGHT_LV1);
        }
        if (e == 2) {
            return new Size(640, 480);
        }
        if (e == 3) {
            return new Size(1280, TAVExporter.VIDEO_EXPORT_WIDTH);
        }
        if (e != 4) {
            return null;
        }
        return new Size(1920, 1080);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.xlabeffect.XEffectConfig m153925l() {
        /*
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            com.tencent.mm.storage.z1 r1 = eb0.C75592q0.m90777g()
            int r1 = r1.f149500H
            w80.e$a r2 = w80.C111744e.f334654d
            int r2 = r2.mo163483f()
            r3 = 1
            r4 = 0
            r5 = 70
            if (r2 > r5) goto L_0x003a
            bp3.p r2 = bp3.C79758p.f233760a
            bp3.f r5 = bp3.C104160f.RepairerConfig_VOIP_ForceFaceBeautyUseLowConfig_Int
            r6 = -1
            int r7 = r2.mo109882e(r5, r6)
            if (r7 == r6) goto L_0x0029
            int r2 = r2.mo109882e(r5, r6)
            if (r2 == r3) goto L_0x0027
            r2 = 1
            goto L_0x0035
        L_0x0027:
            r2 = 0
            goto L_0x0035
        L_0x0029:
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r5 = h81.C32735h.C32737c.clifig_voip_xsetting_force_beauty_lowconfig
            boolean r2 = r2.mo58784wf(r5, r4)
        L_0x0035:
            if (r2 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r2 = 0
            goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            z33.h r5 = f337166a
            bp3.p r6 = bp3.C79758p.f233760a
            bp3.f r7 = bp3.C104160f.RepairerConfig_VOIP_XEffectConfigEnable_Float
            r8 = 0
            float r6 = r6.mo109881d(r7, r8)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01ea
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r0 = new com.tencent.mm.plugin.xlabeffect.XEffectConfig
            r0.<init>()
            e43.e r1 = e43.C107227e.f320839a
            java.lang.String r2 = "skinBright"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0064
            int r2 = r2.intValue()
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r0.f318446j = r2
            java.lang.String r2 = "skinSmooth"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0074
            int r2 = r2.intValue()
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            r0.f318443g = r2
            java.lang.String r2 = "eyePouch"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0084
            int r2 = r2.intValue()
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            r0.f318449p = r2
            java.lang.String r2 = "smileFolds"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0094
            int r2 = r2.intValue()
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            r0.f318450q = r2
            java.lang.String r2 = "eyeBright"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x00a4
            int r2 = r2.intValue()
            goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            r0.f318447n = r2
            java.lang.String r2 = "sharpen"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x00b4
            int r2 = r2.intValue()
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r0.f318451r = r2
            java.lang.String r2 = "filterRate"
            java.lang.Integer r5 = r1.mo157691a(r2)
            if (r5 == 0) goto L_0x00c4
            int r5 = r5.intValue()
            goto L_0x00c5
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            if (r5 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            r0.f318442f = r3
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x00d6
            int r2 = r2.intValue()
            goto L_0x00d7
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            r0.f318438H = r2
            java.lang.String r2 = "faceMorph"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x00e6
            int r2 = r2.intValue()
            goto L_0x00e7
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            r0.f318445i = r2
            java.lang.String r2 = "rosy"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x00f6
            int r2 = r2.intValue()
            goto L_0x00f7
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            r0.f318448o = r2
            java.lang.String r2 = "teethBright"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0106
            int r2 = r2.intValue()
            goto L_0x0107
        L_0x0106:
            r2 = 0
        L_0x0107:
            r0.f318452s = r2
            java.lang.String r2 = "smallHead"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0116
            int r2 = r2.intValue()
            goto L_0x0117
        L_0x0116:
            r2 = 0
        L_0x0117:
            r0.f318453t = r2
            java.lang.String r2 = "cheekBone"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0126
            int r2 = r2.intValue()
            goto L_0x0127
        L_0x0126:
            r2 = 0
        L_0x0127:
            r0.f318454u = r2
            java.lang.String r2 = "lowerJawBone"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0136
            int r2 = r2.intValue()
            goto L_0x0137
        L_0x0136:
            r2 = 0
        L_0x0137:
            r0.f318455v = r2
            java.lang.String r2 = "wingOfNose"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0147
            int r2 = r2.intValue()
            goto L_0x0148
        L_0x0147:
            r2 = 0
        L_0x0148:
            r0.f318456w = r2
            java.lang.String r2 = "chinShort"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0157
            int r2 = r2.intValue()
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            r0.f318457x = r2
            java.lang.String r2 = "chinLong"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0167
            int r2 = r2.intValue()
            goto L_0x0168
        L_0x0167:
            r2 = 0
        L_0x0168:
            r0.f318458y = r2
            java.lang.String r2 = "hairLineHigh"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0177
            int r2 = r2.intValue()
            goto L_0x0178
        L_0x0177:
            r2 = 0
        L_0x0178:
            r0.f318459z = r2
            java.lang.String r2 = "hairLineLow"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0187
            int r2 = r2.intValue()
            goto L_0x0188
        L_0x0187:
            r2 = 0
        L_0x0188:
            r0.f318431A = r2
            java.lang.String r2 = "bigEye"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x0197
            int r2 = r2.intValue()
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            r0.f318432B = r2
            java.lang.String r2 = "boySlim"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x01a7
            int r2 = r2.intValue()
            goto L_0x01a8
        L_0x01a7:
            r2 = 0
        L_0x01a8:
            r0.f318433C = r2
            java.lang.String r2 = "girlSlim"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x01b7
            int r2 = r2.intValue()
            goto L_0x01b8
        L_0x01b7:
            r2 = 0
        L_0x01b8:
            r0.f318434D = r2
            java.lang.String r2 = "mouthMorph"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x01c7
            int r2 = r2.intValue()
            goto L_0x01c8
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            r0.f318435E = r2
            java.lang.String r2 = "zhaiLian"
            java.lang.Integer r2 = r1.mo157691a(r2)
            if (r2 == 0) goto L_0x01d8
            int r2 = r2.intValue()
            goto L_0x01d9
        L_0x01d8:
            r2 = 0
        L_0x01d9:
            r0.f318436F = r2
            java.lang.String r2 = "contour"
            java.lang.Integer r1 = r1.mo157691a(r2)
            if (r1 == 0) goto L_0x01e7
            int r4 = r1.intValue()
        L_0x01e7:
            r0.f318437G = r4
            return r0
        L_0x01ea:
            r6 = 0
            r7 = 2
            if (r1 != r7) goto L_0x01fb
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_voip_xsetting_female_beauty_config
            java.lang.String r0 = r0.Y60(r8, r6)
            goto L_0x0207
        L_0x01fb:
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_voip_xsetting_male_beauty_config
            java.lang.String r0 = r0.Y60(r8, r6)
        L_0x0207:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x023b
            if (r2 == 0) goto L_0x021b
            c30.g r6 = new c30.g     // Catch:{ Exception -> 0x0231 }
            r6.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r0 = "high"
            c30.g r0 = r6.getJSONObject(r0)     // Catch:{ Exception -> 0x0231 }
            goto L_0x0226
        L_0x021b:
            c30.g r6 = new c30.g     // Catch:{ Exception -> 0x0231 }
            r6.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r0 = "low"
            c30.g r0 = r6.getJSONObject(r0)     // Catch:{ Exception -> 0x0231 }
        L_0x0226:
            java.lang.String r6 = "xSettingConfig"
            gy3.C87412m.m108593f(r0, r6)     // Catch:{ Exception -> 0x0231 }
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r0 = r5.mo164373r(r0)     // Catch:{ Exception -> 0x0231 }
            return r0
        L_0x0231:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "MicroMsg.VoipRendererHelper"
            java.lang.String r8 = "getXSettingVoipBeautyConfig error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r8, r5)
        L_0x023b:
            r0 = 40
            r5 = 15
            r6 = 25
            if (r2 == 0) goto L_0x0299
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r2 = new com.tencent.mm.plugin.xlabeffect.XEffectConfig
            r2.<init>()
            r2.f318446j = r5
            if (r1 != r7) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r0 = 25
        L_0x024f:
            r2.f318443g = r0
            r0 = 80
            r5 = 60
            if (r1 != r7) goto L_0x025a
            r8 = 80
            goto L_0x025c
        L_0x025a:
            r8 = 60
        L_0x025c:
            r2.f318449p = r8
            if (r1 != r7) goto L_0x0261
            goto L_0x0263
        L_0x0261:
            r0 = 60
        L_0x0263:
            r2.f318450q = r0
            if (r1 != r7) goto L_0x026a
            r0 = 30
            goto L_0x026c
        L_0x026a:
            r0 = 25
        L_0x026c:
            r2.f318447n = r0
            r2.f318451r = r6
            r2.f318442f = r3
            r0 = 10
            r2.f318438H = r0
            r2.f318445i = r4
            r2.f318448o = r4
            r2.f318452s = r4
            r2.f318453t = r4
            r2.f318454u = r4
            r2.f318455v = r4
            r2.f318456w = r4
            r2.f318457x = r4
            r2.f318458y = r4
            r2.f318459z = r4
            r2.f318431A = r4
            r2.f318432B = r4
            r2.f318433C = r4
            r2.f318434D = r4
            r2.f318435E = r4
            r2.f318436F = r4
            r2.f318437G = r4
            goto L_0x02ab
        L_0x0299:
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r2 = new com.tencent.mm.plugin.xlabeffect.XEffectConfig
            r2.<init>()
            r2.f318446j = r5
            if (r1 != r7) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r0 = 25
        L_0x02a5:
            r2.f318443g = r0
            r2.f318442f = r4
            r2.f318451r = r6
        L_0x02ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.m153925l():com.tencent.mm.plugin.xlabeffect.XEffectConfig");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.mo109882e(r2, 0) == 1) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e3  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153926m() {
        /*
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            bp3.p r1 = bp3.C79758p.f233760a
            bp3.f r2 = bp3.C104160f.RepairerConfig_VOIP_UIFrameWork_Int
            r3 = 0
            int r4 = r1.mo109882e(r2, r3)
            java.lang.String r5 = "MicroMsg.VoipRendererHelper"
            r6 = 1
            if (r4 == 0) goto L_0x001a
            int r2 = r1.mo109882e(r2, r3)
            if (r2 != r6) goto L_0x0018
        L_0x0016:
            r2 = 1
            goto L_0x0077
        L_0x0018:
            r2 = 0
            goto L_0x0077
        L_0x001a:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 == 0) goto L_0x001f
            goto L_0x0016
        L_0x001f:
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_flutter_voip_disable_for_talkback
            boolean r4 = r2.mo58784wf(r4, r3)
            if (r4 == 0) goto L_0x003e
            rx3.g r4 = f337177l
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003e
            goto L_0x0018
        L_0x003e:
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_flutter_voip_disable_for_pad
            boolean r4 = r2.mo58784wf(r4, r3)
            if (r4 == 0) goto L_0x0071
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r4 == 0) goto L_0x0071
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "in special case, do not use flutter! inMagicWindowMode:"
            r2.append(r4)
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            r2.append(r4)
            java.lang.String r4 = ", inFoldEnv:"
            r2.append(r4)
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106207v()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x0018
        L_0x0071:
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_voip_use_flutter
            boolean r2 = r2.mo58784wf(r4, r6)
        L_0x0077:
            f337167b = r2
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_voip_xsetting_allow_voip_check_reject_reply_shortcut
            boolean r2 = r2.mo58784wf(r4, r3)
            f337168c = r2
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_voip_xsetting_allow_voip_decode_use_cropsize
            boolean r2 = r2.mo58784wf(r4, r6)
            f337169d = r2
            boolean r2 = m153921h()
            f337170e = r2
            bp3.f r2 = bp3.C104160f.RepairerConfig_VOIP_VoIPPreRender_Int
            int r4 = r1.mo109882e(r2, r3)
            if (r4 == 0) goto L_0x00ad
            int r1 = r1.mo109882e(r2, r3)
            if (r1 != r6) goto L_0x00ab
            r1 = 1
            goto L_0x00b9
        L_0x00ab:
            r1 = 0
            goto L_0x00b9
        L_0x00ad:
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_xsetting_voip_prerender
            boolean r1 = r1.mo58784wf(r2, r3)
        L_0x00b9:
            f337171f = r1
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_orientation_enable
            boolean r1 = r1.mo58784wf(r2, r3)
            f337172g = r1
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r2 = "settings_landscape_mode"
            boolean r1 = r1.getBoolean(r2, r3)
            f337175j = r1
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$b r2 = h81.C32735h.C32738b.clicfg_voip_orientation_check_landscape_mode
            boolean r1 = r1.mo58784wf(r2, r6)
            if (r1 == 0) goto L_0x00ea
            boolean r2 = f337172g
            boolean r4 = f337175j
            r2 = r2 & r4
            f337172g = r2
        L_0x00ea:
            boolean r2 = f337172g
            if (r2 == 0) goto L_0x00f3
            boolean r2 = f337176k
            if (r2 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            f337172g = r6
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_voip_orientation_apply_system_rotate_locked_enable
            boolean r2 = r2.mo58784wf(r4, r3)
            f337173h = r2
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_orientation_float_window_enable
            boolean r0 = r0.mo58784wf(r2, r3)
            f337174i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "initVoIPStrategy, checkLandscapeMode:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", isLandscapeMode:"
            r0.append(r1)
            boolean r1 = f337175j
            r0.append(r1)
            java.lang.String r1 = ", isMultipleUser:"
            r0.append(r1)
            boolean r1 = f337176k
            r0.append(r1)
            java.lang.String r1 = ", adaptiveRotateEnable:"
            r0.append(r1)
            boolean r1 = f337172g
            r0.append(r1)
            java.lang.String r1 = ", adaptiveRotateApplySystemRotateLockedEnable:"
            r0.append(r1)
            boolean r1 = f337173h
            r0.append(r1)
            java.lang.String r1 = ", adaptiveRotateFloatWindowEnable:"
            r0.append(r1)
            boolean r1 = f337174i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            m153918b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.m153926m():void");
    }

    /* renamed from: n */
    public static final boolean m153927n() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_CameraChangePreviewSize_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_camera_change_previewsize, true);
    }

    /* renamed from: o */
    public static final boolean m153928o() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_Use1080P_Int;
        return pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_camera_use_1080p, false);
    }

    /* renamed from: q */
    public static final boolean m153929q() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_CameraFrameWork_Int;
        if (pVar.mo109882e(fVar, 0) != 0) {
            return pVar.mo109882e(fVar, 0) == 3;
        }
        int i = C107835h0.f322856m.f322871K;
        return i != -1 ? i == 1 : C109726b.m149049d(12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo164369c() {
        /*
            r6 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING
            java.lang.String r2 = ""
            java.lang.String r0 = r0.mo119675I(r1, r2)
            boolean r1 = gy3.C87412m.m108589b(r0, r2)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0043
            if (r0 != 0) goto L_0x001b
            goto L_0x0043
        L_0x001b:
            c30.g r1 = new c30.g
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = "version"
            boolean r5 = r1.has(r0)     // Catch:{ Exception -> 0x0033 }
            if (r5 != r3) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            if (r5 == 0) goto L_0x003d
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x0033 }
            goto L_0x003e
        L_0x0033:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            java.lang.String r0 = "safeGetInt"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r2, r1)
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            r3 = 0
            goto L_0x0047
        L_0x0043:
            boolean r3 = r6.mo164370d()
        L_0x0047:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.mo164369c():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0117, code lost:
        if (r10 >= 0) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f6 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo164370d() {
        /*
            r18 = this;
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            int r0 = p156gj.C107842p.m146108a()
            r2 = r0 & 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r2 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            int r5 = r0 >> 12
            r5 = r5 & 15
            r6 = r0 & 255(0xff, float:3.57E-43)
            int r7 = android.os.Build.VERSION.SDK_INT
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r8 = p723vf.C90773a.m113841g(r8)
            r10 = 1024(0x400, float:1.435E-42)
            long r10 = (long) r10
            long r8 = r8 / r10
            long r8 = r8 / r10
            di3.d r10 = di3.C86312j.m106911c(r1)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_voip_beauty_cpu_core_num_threshold
            r12 = 4
            int r10 = r10.mo58779Qe(r11, r12)
            if (r5 < r10) goto L_0x0034
            r10 = 1
            goto L_0x0035
        L_0x0034:
            r10 = 0
        L_0x0035:
            di3.d r11 = di3.C86312j.m106911c(r1)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_voip_beauty_cpu_freq_threshold
            r14 = 45
            int r11 = r11.mo58779Qe(r13, r14)
            if (r6 < r11) goto L_0x0047
            r11 = 1
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            di3.d r13 = di3.C86312j.m106911c(r1)
            h81.h r13 = (h81.C32735h) r13
            h81.h$c r14 = h81.C32735h.C32737c.clicfg_voip_beauty_sdkint_threadshold
            r15 = 23
            int r13 = r13.mo58779Qe(r14, r15)
            if (r7 < r13) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            di3.d r14 = di3.C86312j.m106911c(r1)
            h81.h r14 = (h81.C32735h) r14
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_voip_beauty_totalmem_threshold
            r12 = 4096(0x1000, float:5.74E-42)
            int r12 = r14.mo58779Qe(r15, r12)
            long r14 = (long) r12
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 < 0) goto L_0x0070
            r12 = 1
            goto L_0x0071
        L_0x0070:
            r12 = 0
        L_0x0071:
            double r14 = p723vf.C90773a.m113835a()
            r3 = 11
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r17 = 1
            r3[r17] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r3[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r6 = 3
            r3[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r7 = 4
            r3[r7] = r0
            r0 = 5
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r3[r0] = r7
            r0 = 6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            r3[r0] = r7
            r0 = 7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r3[r0] = r7
            r0 = 8
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r13)
            r3[r0] = r7
            r0 = 9
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            r3[r0] = r7
            r0 = 10
            java.lang.Double r7 = java.lang.Double.valueOf(r14)
            r3[r0] = r7
            java.lang.String r7 = "MicroMsg.VoipRendererHelper"
            java.lang.String r0 = "checkVoipBeautyLocalConfig, cpuFlags:%s, isNeon:%s, nCores:%s, nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s, cpuRate:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r3)
            if (r2 == 0) goto L_0x00dc
            if (r10 == 0) goto L_0x00dc
            if (r11 == 0) goto L_0x00dc
            if (r13 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r3 = r2.f322794I
            int r2 = r2.f322795J
            java.lang.String r8 = ""
            r9 = -1
            if (r0 == 0) goto L_0x0120
            di3.d r0 = di3.C86312j.m106911c(r1)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_voip_beauty_manufacture
            java.lang.String r0 = r0.Y60(r10, r8)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r10 != 0) goto L_0x0120
            c30.g r10 = new c30.g     // Catch:{ Exception -> 0x011a }
            r10.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x011a }
            java.lang.String r11 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x011a }
            int r10 = r10.optInt(r11, r9)     // Catch:{ Exception -> 0x011a }
            java.lang.String r12 = "checkVoipBeautyManufactureConfig, config:%s, manufacture:%s, beautyCmd:%s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x011a }
            r6[r4] = r0     // Catch:{ Exception -> 0x011a }
            r13 = 1
            r6[r13] = r11     // Catch:{ Exception -> 0x011a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x011a }
            r6[r5] = r0     // Catch:{ Exception -> 0x011a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r6)     // Catch:{ Exception -> 0x011a }
            if (r10 < 0) goto L_0x0120
            goto L_0x0121
        L_0x011a:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r5)
        L_0x0120:
            r10 = 0
        L_0x0121:
            w80.d$a r0 = w80.C111742d.f334647a
            java.lang.String r5 = "GL_OES_EGL_image_external_essl3"
            boolean r0 = r0.mo163461d(r5)
            if (r0 != 0) goto L_0x012c
            return r4
        L_0x012c:
            if (r2 >= 0) goto L_0x0133
            if (r3 < 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r0 = 0
            goto L_0x0139
        L_0x0133:
            if (r3 < 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r3 = r2
        L_0x0137:
            r10 = r3
            r0 = 1
        L_0x0139:
            bp3.p r2 = bp3.C79758p.f233760a
            bp3.f r3 = bp3.C104160f.RepairerConfig_VOIP_FaceBeautyParams_Int
            int r5 = r2.mo109882e(r3, r9)
            if (r5 == r9) goto L_0x0148
            int r2 = r2.mo109882e(r3, r9)
            goto L_0x0154
        L_0x0148:
            di3.d r2 = di3.C86312j.m106911c(r1)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_voip_facebeauty_switch
            int r2 = r2.mo58779Qe(r3, r9)
        L_0x0154:
            if (r2 == r9) goto L_0x015c
            if (r2 == 0) goto L_0x015a
            r3 = 1
            goto L_0x015b
        L_0x015a:
            r3 = 0
        L_0x015b:
            return r3
        L_0x015c:
            if (r0 != 0) goto L_0x01f8
            if (r10 != 0) goto L_0x01f8
            di3.d r0 = di3.C86312j.m106911c(r1)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_xsetting_allow_checkgpu
            r3 = 1
            boolean r0 = r0.mo58784wf(r2, r3)
            if (r0 != 0) goto L_0x0171
            goto L_0x01f3
        L_0x0171:
            di3.d r0 = di3.C86312j.m106911c(r1)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_facebeauty_gpu_blacklist
            java.lang.String r11 = r0.Y60(r2, r8)
            java.lang.String r0 = "remoteRatingLimited"
            gy3.C87412m.m108593f(r11, r0)
            char[] r12 = new char[r3]
            r0 = 59
            r12[r4] = r0
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r0 = z04.C112550d0.m153784T(r11, r12, r13, r14, r15, r16)
            java.util.Iterator r2 = r0.iterator()
        L_0x0195:
            r0 = 0
        L_0x0196:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01bc
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r0 == 0) goto L_0x01a6
            r0 = 1
            goto L_0x01bc
        L_0x01a6:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0196
            z33.h r0 = f337166a     // Catch:{ Exception -> 0x01b3 }
            boolean r0 = r0.mo164371g(r3)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x0196
        L_0x01b3:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r5 = "isNotAllowToUseFaceBeautyByGPUInfo error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r5, r3)
            goto L_0x0195
        L_0x01bc:
            if (r0 == 0) goto L_0x01bf
            goto L_0x01f3
        L_0x01bf:
            w80.e$a r0 = w80.C111744e.f334654d
            int r0 = r0.mo163483f()
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_facebeauty_gpu_rating_limited
            r3 = 50
            int r1 = r1.mo58779Qe(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "gpu info rating is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " and remote limited is "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r0 < r1) goto L_0x01f3
            r0 = 1
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            if (r0 == 0) goto L_0x01f8
            r1 = 1
            return r1
        L_0x01f8:
            r1 = 1
            if (r10 <= 0) goto L_0x01fd
            r3 = 1
            goto L_0x01fe
        L_0x01fd:
            r3 = 0
        L_0x01fe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112595h.mo164370d():boolean");
    }

    /* renamed from: g */
    public final boolean mo164371g(String str) {
        C104289g gVar = new C104289g(str);
        int optInt = gVar.optInt("code");
        Log.m105924i("MicroMsg.VoipRendererHelper", "gpu faceBeauty black list is " + str);
        String e = C111744e.f334654d.mo163482e();
        if (Util.isNullOrNil(e)) {
            return false;
        }
        try {
            C104289g gVar2 = new C104289g(e);
            boolean z = true;
            if (optInt != 0) {
                if (optInt != gVar2.optInt("code")) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.VoipRendererHelper", "code is fit " + z + " cause code fit");
                }
            } else {
                if (!C87412m.m108589b(gVar.optString("vendor"), gVar2.optString("vendor")) || !C87412m.m108589b(gVar.optString("name"), gVar2.optString("name")) || !C87412m.m108589b(gVar.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION), gVar2.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION))) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.VoipRendererHelper", "code is fit " + z + " cause name and vendor and version fit");
                }
            }
            return z;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.VoipRendererHelper", e2, "checkPermissionByGpuInfo error", new Object[0]);
            return false;
        }
    }

    /* renamed from: p */
    public final boolean mo164372p() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_EncoderDataSource_Int;
        if (pVar.mo109882e(fVar, 0) != 0) {
            return pVar.mo109882e(fVar, 0) == 2;
        }
        int i = C107835h0.f322856m.f322873M;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_newrenderer_switch_gpu_crop, false);
        }
        return false;
    }

    /* renamed from: r */
    public final XEffectConfig mo164373r(C104289g gVar) {
        XEffectConfig xEffectConfig = new XEffectConfig();
        double d = (double) 100;
        xEffectConfig.f318443g = (int) (gVar.optDouble("skinSmooth") * d);
        xEffectConfig.f318446j = (int) (gVar.optDouble("skinBright") * d);
        xEffectConfig.f318432B = (int) (gVar.optDouble("eyeBigger") * d);
        xEffectConfig.f318447n = (int) (gVar.optDouble("eyeBright") * d);
        xEffectConfig.f318445i = (int) (gVar.optDouble("faceThin") * d);
        xEffectConfig.f318451r = (int) (gVar.optDouble("sharpenFilter") * d);
        xEffectConfig.f318453t = (int) (gVar.optDouble("smallHead") * d);
        xEffectConfig.f318450q = (int) (gVar.optDouble("smileFolds") * d);
        xEffectConfig.f318449p = (int) (gVar.optDouble("eyePouch") * d);
        xEffectConfig.f318452s = (int) (gVar.optDouble("teethBright") * d);
        xEffectConfig.f318456w = (int) (gVar.optDouble("wingOfNose") * d);
        xEffectConfig.f318455v = (int) (gVar.optDouble("lowerJawbone") * d);
        xEffectConfig.f318454u = (int) (gVar.optDouble("cheekBone") * d);
        xEffectConfig.f318438H = (int) (gVar.optDouble("naturalFilter") * d);
        return xEffectConfig;
    }
}
