package com.tencent.p014mm.plugin.vlog.model;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import b23.C92167b;
import b23.C92168c;
import bp3.C104160f;
import bp3.C79758p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.p014mm.xeffect.effect.EffectProfileData;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.thumbplayer.api.TPOptionalID;
import di3.C86312j;
import ei2.C31606c;
import f23.C97814a;
import f23.C97815b;
import fh2.C32051e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hi2.C98453h;
import i23.C98593c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import p232rw.C63679m;
import qw1.C63342k;
import rx3.C13598b0;
import rx3.C13604l;
import sp3.C110807k;
import sx3.C110818d0;
import te3.C101758az;
import te3.C64270bz;
import te3.C64899zy;
import w80.C111744e;
import xp3.C102710d;
import xp3.C112170g;
import y13.C112374d;
import z04.C112551y;
import z13.C112570b;

/* renamed from: com.tencent.mm.plugin.vlog.model.f */
public final class C96536f implements C57463v {

    /* renamed from: o */
    public static final /* synthetic */ int f282495o = 0;

    /* renamed from: a */
    public int f282496a = 1;

    /* renamed from: b */
    public boolean f282497b = true;

    /* renamed from: c */
    public int f282498c;

    /* renamed from: d */
    public boolean f282499d = true;

    /* renamed from: e */
    public final C112374d f282500e = new C112374d(false, false, 3, (C8480h) null);

    /* renamed from: f */
    public final C112570b f282501f = new C112570b(false, false);

    /* renamed from: g */
    public int f282502g;

    /* renamed from: h */
    public final LinkedList<Integer> f282503h = new LinkedList<>();

    /* renamed from: i */
    public boolean f282504i;

    /* renamed from: j */
    public VideoTransPara f282505j;

    /* renamed from: k */
    public C32226l<? super Float, C13598b0> f282506k;

    /* renamed from: l */
    public C32226l<? super C96553q, C13598b0> f282507l;

    /* renamed from: m */
    public C110807k f282508m;

    /* renamed from: n */
    public boolean f282509n;

    /* renamed from: com.tencent.mm.plugin.vlog.model.f$c */
    public static final class C30514c extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32228q<Boolean, Integer, ArrayList<PipelineIndicatorInfo>, C13598b0> f82221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30514c(C32228q<? super Boolean, ? super Integer, ? super ArrayList<PipelineIndicatorInfo>, C13598b0> qVar) {
            super(2);
            this.f82221d = qVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f82221d.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), Integer.valueOf(((Number) obj2).intValue()), null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.model.f$a */
    public static final class C96537a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C96536f f282510d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f282511e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96537a(C96536f fVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f282510d = fVar;
            this.f282511e = aVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.CompositionExporter", "export: canceled");
            C96536f fVar = this.f282510d;
            C110807k kVar = fVar.f282508m;
            if (kVar != null) {
                kVar.f331519t = null;
            }
            C32226l<? super C96553q, C13598b0> lVar = fVar.f282507l;
            if (lVar != null) {
                lVar.invoke(new C96553q(false, true, true, 0, false, false, false, 120, (C8480h) null));
            }
            this.f282510d.f282507l = null;
            C32224a<C13598b0> aVar = this.f282511e;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.model.f$b */
    public static final class C96538b extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C96553q, C13598b0> f282512d;

        /* renamed from: e */
        public final /* synthetic */ C96536f f282513e;

        /* renamed from: f */
        public final /* synthetic */ C64899zy f282514f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C32226l<C96553q, C13598b0>> f282515g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96538b(C32226l<? super C96553q, C13598b0> lVar, C96536f fVar, C64899zy zyVar, C8479f0<C32226l<C96553q, C13598b0>> f0Var) {
            super(1);
            this.f282512d = lVar;
            this.f282513e = fVar;
            this.f282514f = zyVar;
            this.f282515g = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
            if (com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82216s == 1) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
            if (r4 == false) goto L_0x0133;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                com.tencent.mm.plugin.vlog.model.q r1 = (com.tencent.p014mm.plugin.vlog.model.C96553q) r1
                java.lang.String r2 = "it"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "export: result:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.CompositionExporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                boolean r2 = r1.f282584c
                if (r2 == 0) goto L_0x002d
                fy3.l<com.tencent.mm.plugin.vlog.model.q, rx3.b0> r2 = r0.f282512d
                r2.invoke(r1)
                goto L_0x01b0
            L_0x002d:
                com.tencent.mm.plugin.vlog.model.f r2 = r0.f282513e
                java.util.LinkedList<java.lang.Integer> r2 = r2.f282503h
                int r4 = r1.f282585d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2.add(r4)
                com.tencent.mm.plugin.vlog.model.f r2 = r0.f282513e
                r2.getClass()
                java.lang.Class<h81.h> r4 = h81.C32735h.class
                boolean r5 = r1.f282582a
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x0049
                goto L_0x015a
            L_0x0049:
                int r5 = r1.f282585d
                r8 = 10001(0x2711, float:1.4014E-41)
                if (r5 == r8) goto L_0x015a
                r8 = -204(0xffffffffffffff34, float:NaN)
                int r8 = java.lang.Math.abs(r8)
                if (r5 == r8) goto L_0x015a
                int r5 = r1.f282585d
                r8 = -203(0xffffffffffffff35, float:NaN)
                int r8 = java.lang.Math.abs(r8)
                if (r5 != r8) goto L_0x0063
                goto L_0x015a
            L_0x0063:
                di3.d r5 = di3.C86312j.m106911c(r4)
                h81.h r5 = (h81.C32735h) r5
                h81.h$c r8 = h81.C32735h.C32737c.clicfg_finder_soft_encode_auto_fallback
                boolean r5 = r5.mo58784wf(r8, r7)
                if (r5 != 0) goto L_0x0087
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "export, fallback:"
                r2.append(r4)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                goto L_0x015a
            L_0x0087:
                boolean r5 = r1.f282588g
                if (r5 == 0) goto L_0x00ba
                b23.c r5 = b23.C92168c.f263796a
                di3.d r4 = di3.C86312j.m106911c(r4)
                h81.h r4 = (h81.C32735h) r4
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_vc_video_parallel_downgrading_enable
                boolean r4 = r4.mo58784wf(r5, r7)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "enableParallelVideoDowngrading:"
                r5.append(r8)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r8 = "MicroMsg.VideoCompositionExportConfig"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
                if (r4 == 0) goto L_0x015a
                java.lang.String r4 = "checkFallbackConfig: retry without parallel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                r2.f282499d = r6
                goto L_0x0159
            L_0x00ba:
                int r5 = r1.f282585d
                r8 = -201(0xffffffffffffff37, float:NaN)
                int r8 = java.lang.Math.abs(r8)
                if (r5 != r8) goto L_0x00d5
                y13.d r5 = r2.f282500e
                boolean r5 = r5.f336467a
                if (r5 != 0) goto L_0x00d5
                java.lang.String r4 = "checkFallbackConfig: retry video soft decode"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                y13.d r2 = r2.f282500e
                r2.f336467a = r7
                goto L_0x0159
            L_0x00d5:
                int r5 = r1.f282585d
                r8 = -202(0xffffffffffffff36, float:NaN)
                int r8 = java.lang.Math.abs(r8)
                if (r5 == r8) goto L_0x00e9
                int r5 = r1.f282585d
                r8 = -212(0xffffffffffffff2c, float:NaN)
                int r8 = java.lang.Math.abs(r8)
                if (r5 != r8) goto L_0x00f9
            L_0x00e9:
                y13.d r5 = r2.f282500e
                boolean r5 = r5.f336468b
                if (r5 != 0) goto L_0x00f9
                java.lang.String r4 = "checkFallbackConfig: retry audio soft decode"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                y13.d r2 = r2.f282500e
                r2.f336468b = r7
                goto L_0x0159
            L_0x00f9:
                z13.b r5 = r2.f282501f
                boolean r5 = r5.f337040a
                if (r5 != 0) goto L_0x0142
                com.tencent.mm.plugin.vlog.model.FinderVideoShell r5 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82198a
                boolean r5 = r5.mo57453a()
                if (r5 == 0) goto L_0x010c
                int r4 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82216s
                if (r4 != r7) goto L_0x0133
                goto L_0x0135
            L_0x010c:
                java.lang.String r5 = "FINDER_CONFIG_USER_KEY"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r5)
                java.lang.String r8 = "USERINFO_FINDER_ENABLE_SOFT_ENCODE_FALLBACK_INT_SYNC"
                int r5 = r5.getInt(r8, r6)
                if (r5 != r7) goto L_0x011c
                r5 = 1
                goto L_0x011d
            L_0x011c:
                r5 = 0
            L_0x011d:
                di3.d r4 = di3.C86312j.m106911c(r4)
                h81.h r4 = (h81.C32735h) r4
                h81.h$c r8 = h81.C32735h.C32737c.clicfg_finder_enable_soft_encode_fallback
                int r4 = r4.mo58779Qe(r8, r6)
                if (r4 != r7) goto L_0x012d
                r4 = 1
                goto L_0x012e
            L_0x012d:
                r4 = 0
            L_0x012e:
                if (r5 != 0) goto L_0x0135
                if (r4 == 0) goto L_0x0133
                goto L_0x0135
            L_0x0133:
                r4 = 0
                goto L_0x0136
            L_0x0135:
                r4 = 1
            L_0x0136:
                if (r4 == 0) goto L_0x0142
                java.lang.String r4 = "checkFallbackConfig: retry video soft encode"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                z13.b r2 = r2.f282501f
                r2.f337040a = r7
                goto L_0x0159
            L_0x0142:
                z13.b r4 = r2.f282501f
                boolean r5 = r4.f337041b
                if (r5 != 0) goto L_0x015a
                boolean r5 = r2.mo134594h(r7)
                r4.f337041b = r5
                z13.b r2 = r2.f282501f
                boolean r2 = r2.f337041b
                if (r2 == 0) goto L_0x015a
                java.lang.String r2 = "checkFallbackConfig: retry audio soft encode"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            L_0x0159:
                r6 = 1
            L_0x015a:
                if (r6 == 0) goto L_0x0172
                java.lang.String r1 = "export: checkFallbackConfig true"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
                com.tencent.mm.plugin.vlog.model.h r1 = new com.tencent.mm.plugin.vlog.model.h
                com.tencent.mm.plugin.vlog.model.f r2 = r0.f282513e
                te3.zy r3 = r0.f282514f
                gy3.f0<fy3.l<com.tencent.mm.plugin.vlog.model.q, rx3.b0>> r4 = r0.f282515g
                r1.<init>(r2, r3, r4)
                java.lang.String r2 = "CompositionExporter_export"
                o40.C61926c.m72657B(r2, r7, r1)
                goto L_0x01b0
            L_0x0172:
                java.lang.String r2 = "export: callback result"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.plugin.vlog.model.f r2 = r0.f282513e
                te3.zy r3 = r0.f282514f
                java.lang.String r2 = r2.mo134596j(r3)
                i23.c r3 = i23.C98593c.f289086a
                com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r2 = r3.mo137980c(r2)
                com.tencent.mm.plugin.vlog.model.f r4 = r0.f282513e
                java.util.LinkedList<java.lang.Integer> r8 = r4.f282503h
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 62
                r16 = 0
                java.lang.String r9 = "#"
                java.lang.String r4 = sx3.C110818d0.m150921S(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r5 = "RetryResult"
                java.lang.String r4 = r2.mo86045b(r5, r4, r7)
                r2.f266468Y = r4
                com.tencent.mm.plugin.vlog.model.f r2 = r0.f282513e
                te3.zy r4 = r0.f282514f
                java.lang.String r2 = r2.mo134596j(r4)
                r3.mo137979b(r2)
                fy3.l<com.tencent.mm.plugin.vlog.model.q, rx3.b0> r2 = r0.f282512d
                r2.invoke(r1)
            L_0x01b0:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96536f.C96538b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.model.f$d */
    public static final class C96539d extends C87413o implements C32228q<Boolean, Integer, ArrayList<PipelineIndicatorInfo>, C13598b0> {

        /* renamed from: A */
        public final /* synthetic */ C59741c0 f282516A;

        /* renamed from: d */
        public final /* synthetic */ String f282517d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f282518e;

        /* renamed from: f */
        public final /* synthetic */ long f282519f;

        /* renamed from: g */
        public final /* synthetic */ C96536f f282520g;

        /* renamed from: h */
        public final /* synthetic */ C96553q f282521h;

        /* renamed from: i */
        public final /* synthetic */ C64899zy f282522i;

        /* renamed from: j */
        public final /* synthetic */ long f282523j;

        /* renamed from: n */
        public final /* synthetic */ C96552p0 f282524n;

        /* renamed from: o */
        public final /* synthetic */ int f282525o;

        /* renamed from: p */
        public final /* synthetic */ C8478d0 f282526p;

        /* renamed from: q */
        public final /* synthetic */ boolean f282527q;

        /* renamed from: r */
        public final /* synthetic */ boolean f282528r;

        /* renamed from: s */
        public final /* synthetic */ C8479f0<AssetParallelExportSession> f282529s;

        /* renamed from: t */
        public final /* synthetic */ C8479f0<AssetExportSession> f282530t;

        /* renamed from: u */
        public final /* synthetic */ C110807k.C101693a f282531u;

        /* renamed from: v */
        public final /* synthetic */ EffectManager f282532v;

        /* renamed from: w */
        public final /* synthetic */ C101758az f282533w;

        /* renamed from: x */
        public final /* synthetic */ C8479f0<C31606c> f282534x;

        /* renamed from: y */
        public final /* synthetic */ String f282535y;

        /* renamed from: z */
        public final /* synthetic */ C13604l<Boolean, Integer> f282536z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96539d(String str, C8478d0 d0Var, long j, C96536f fVar, C96553q qVar, C64899zy zyVar, long j2, C96552p0 p0Var, int i, C8478d0 d0Var2, boolean z, boolean z2, C8479f0<AssetParallelExportSession> f0Var, C8479f0<AssetExportSession> f0Var2, C110807k.C101693a aVar, EffectManager effectManager, C101758az azVar, C8479f0<C31606c> f0Var3, String str2, C13604l<Boolean, Integer> lVar, C59741c0 c0Var) {
            super(3);
            this.f282517d = str;
            this.f282518e = d0Var;
            this.f282519f = j;
            this.f282520g = fVar;
            this.f282521h = qVar;
            this.f282522i = zyVar;
            this.f282523j = j2;
            this.f282524n = p0Var;
            this.f282525o = i;
            this.f282526p = d0Var2;
            this.f282527q = z;
            this.f282528r = z2;
            this.f282529s = f0Var;
            this.f282530t = f0Var2;
            this.f282531u = aVar;
            this.f282532v = effectManager;
            this.f282533w = azVar;
            this.f282534x = f0Var3;
            this.f282535y = str2;
            this.f282536z = lVar;
            this.f282516A = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            Class cls;
            int i;
            boolean z;
            int i2;
            ExportErrorStatus exportErrorStatus;
            ExportErrorStatus exportErrorStatus2;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            ArrayList<PipelineIndicatorInfo> arrayList = (ArrayList) obj3;
            Class cls2 = C32735h.class;
            Log.m105924i("MicroMsg.CompositionExporter", "export finished, success:" + booleanValue + ", errCode:" + intValue + ", outputPath:" + this.f282517d + " parallel:" + this.f282518e.f27483d + " cost:" + Util.ticksToNow(this.f282519f));
            StringBuilder sb = new StringBuilder();
            sb.append("export finished, audioSoftDecode:");
            sb.append(this.f282520g.f282500e.f336472f);
            sb.append(", isCanceled:");
            sb.append(this.f282520g.f282509n);
            Log.m105924i("MicroMsg.CompositionExporter", sb.toString());
            if (!this.f282520g.f282509n) {
                int i3 = C96536f.f282495o;
                int abs = Math.abs(intValue);
                this.f282521h.f282582a = booleanValue;
                if (booleanValue) {
                    C63679m.C63680a c = MultiMediaVideoChecker.f273077a.mo129931c(this.f282517d, false);
                    boolean z2 = c == null || !c.mo88493g();
                    this.f282521h.f282582a = !z2;
                    Log.m105924i("MicroMsg.CompositionExporter", "exportImpl: output error " + z2);
                    if (z2) {
                        Log.m105928w("MicroMsg.CompositionExporter", "output video info error " + c);
                        abs = 20001;
                    }
                }
                VideoCompositionPerformanceStruct c2 = C98593c.f289086a.mo137980c(this.f282520g.mo134596j(this.f282522i));
                c2.f266461R = (long) this.f282520g.f282502g;
                c2.f266480l = c2.mo86045b("EditId", this.f282522i.f186911s, true);
                c2.f266476h = (long) this.f282522i.f186904i.f297904o;
                c2.f266481m = (long) Math.abs(intValue);
                long ticksToNow = Util.ticksToNow(this.f282519f);
                c2.f266484p = ticksToNow;
                c2.mo86046c("RemuxVideoTimeMs", ticksToNow);
                c2.f266482n = 1;
                long j = this.f282523j;
                c2.f266487s = j;
                c2.mo86046c("UpdateCompositionTimeMs", j);
                c2.f266446C = (long) this.f282522i.f186904i.f297912w;
                c2.f266447D = (long) this.f282520g.f282498c;
                C96552p0 p0Var = this.f282524n;
                C97815b bVar = new C97815b();
                bVar.f286951d = false;
                Iterator<C106205q0> it = p0Var.f282570c.iterator();
                while (it.hasNext()) {
                    C97815b.C97820e a = C98593c.f289086a.mo137978a(it.next());
                    C97815b.C97821f fVar = a instanceof C97815b.C97821f ? (C97815b.C97821f) a : null;
                    if (fVar != null) {
                        fVar.f286969l = p0Var.mo134611h().f331513n != null;
                    }
                    if (a != null) {
                        bVar.f286948a.add(a);
                    }
                }
                String jSONObject = bVar.mo33258a().toString();
                C87412m.m108593f(jSONObject, "reportJson.toJson().toString()");
                c2.f266448E = c2.mo86045b("OriginMediaInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
                c2.f266452I = 1;
                c2.f266456M = c2.mo86045b("CodecInstanceInfoBefore", String.valueOf(this.f282525o), true);
                c2.f266457N = c2.mo86045b("CodecInstanceInfoExport", String.valueOf(this.f282526p.f27483d), true);
                c2.f266458O = c2.mo86045b("CodecInstanceInfoAfter", String.valueOf(MediaCodecAnalyse.Companion.instanceCount()), true);
                c2.f266459P = this.f282518e.f27483d;
                c2.f266462S = C111744e.f334654d.mo163483f();
                c2.f266463T = this.f282527q ? 1 : 0;
                c2.f266471b0 = this.f282528r ? 1 : 0;
                String jSONArray = this.f282520g.mo134597k(this.f282522i).toString();
                C87412m.m108593f(jSONArray, "packageMediaCodecCapabil…mpositionInfo).toString()");
                c2.f266453J = c2.mo86045b("CodecInfo", C112551y.m153814n(jSONArray, ",", ";", false), true);
                Log.m105924i("MicroMsg.CompositionExporter", "codecInfo " + jSONArray);
                if (arrayList != null) {
                    C8478d0 d0Var = this.f282518e;
                    C64899zy zyVar = this.f282522i;
                    C13604l<Boolean, Integer> lVar = this.f282536z;
                    C96553q qVar = this.f282521h;
                    StringBuilder sb4 = new StringBuilder();
                    i2 = intValue;
                    sb4.append("indicators size:");
                    sb4.append(arrayList.size());
                    sb4.append(" maxParallelCount:");
                    sb4.append(d0Var.f27483d);
                    Log.m105924i("MicroMsg.CompositionExporter", sb4.toString());
                    c2.f266452I = arrayList.size();
                    C92168c cVar = C92168c.f263796a;
                    int size = arrayList.size();
                    int i4 = d0Var.f27483d;
                    int intValue2 = ((Number) lVar.f38556e).intValue();
                    z = booleanValue;
                    C87412m.m108594g(zyVar, "compositionInfo");
                    StringBuilder sb5 = new StringBuilder();
                    i = abs;
                    sb5.append("indicatorSize:");
                    sb5.append(size);
                    sb5.append(" parallelSize:");
                    sb5.append(i4);
                    Log.m105924i("MicroMsg.VideoCompositionExportConfig", sb5.toString());
                    C94554a a2 = C63342k.f179710a.mo88239a(C86013q1.m106448i(zyVar.f186899d.get(0).f183504d, false));
                    JSONArray b = cVar.mo126130b();
                    int i5 = a2.f273445c;
                    cls = cls2;
                    C8479f0 f0Var = new C8479f0();
                    JSONUtils.forEach(b, new C92167b(((i5 / 100) * (a2.f273446d / 100)) / 10, f0Var));
                    JSONObject jSONObject2 = (JSONObject) f0Var.f27484d;
                    if (jSONObject2 != null) {
                        if (i4 != size) {
                            cVar.mo126133e(jSONObject2, jSONObject2.optInt("hit", -1) - 2);
                            if (jSONObject2.optInt("hit", -1) < 0) {
                                cVar.mo126133e(jSONObject2, 0);
                                C87412m.m108593f(jSONObject2.put("count", jSONObject2.optInt("count", -1) - 1), "this.put(\"count\", count)");
                                Log.m105924i("MicroMsg.VideoCompositionExportConfig", "decrease parallel size:" + jSONObject2);
                            }
                        } else if (jSONObject2.optInt("count", -1) < i4) {
                            C87412m.m108593f(jSONObject2.put("count", i4), "this.put(\"count\", count)");
                            cVar.mo126133e(jSONObject2, 0);
                        } else if (jSONObject2.optInt("count", -1) == i4) {
                            cVar.mo126133e(jSONObject2, jSONObject2.optInt("hit", -1) + 1);
                            if (jSONObject2.optInt("hit", -1) >= 3) {
                                cVar.mo126133e(jSONObject2, 0);
                                int i6 = i4 + 1;
                                if (i6 > 4) {
                                    i6 = 4;
                                }
                                C87412m.m108593f(jSONObject2.put("count", i6), "this.put(\"count\", count)");
                                Log.m105924i("MicroMsg.VideoCompositionExportConfig", "increase parallel size:" + jSONObject2);
                            }
                        }
                    } else if (intValue2 == size || i4 < size) {
                        int i7 = a2.f273445c;
                        int i8 = a2.f273446d;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("key", ((i7 / 100) * (i8 / 100)) / 10);
                        jSONObject3.put("width", i7);
                        jSONObject3.put("height", i8);
                        jSONObject3.put("count", i4);
                        jSONObject3.put("hit", 0);
                        Log.m105924i("MicroMsg.VideoCompositionExportConfig", "add JSONObjectInstance " + jSONObject3);
                        b.put(jSONObject3);
                    }
                    C92168c.f263797b.encode("PARALLEL_COUNT_HISTORY_DATA_V2", b.toString());
                    JSONArray jSONArray2 = new JSONArray();
                    for (PipelineIndicatorInfo pipelineIndicatorInfo : arrayList) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", pipelineIndicatorInfo.type);
                        jSONObject4.put(FirebaseAnalytics.C113379b.INDEX, pipelineIndicatorInfo.getIndex());
                        jSONObject4.put("range", pipelineIndicatorInfo.timeRange.toString());
                        jSONObject4.put("status", pipelineIndicatorInfo.getSegmentStatus());
                        jSONObject4.put("cost", pipelineIndicatorInfo.getExportCostTimeMs());
                        jSONArray2.put(jSONObject4);
                    }
                    String jSONArray3 = jSONArray2.toString();
                    C87412m.m108593f(jSONArray3, "indicatorStr.toString()");
                    c2.f266454K = c2.mo86045b("ParallelSegmentInfo", C112551y.m153814n(jSONArray3, ",", ";", false), true);
                    Log.m105924i("MicroMsg.CompositionExporter", "indicatorStr:" + jSONArray2);
                    qVar.f282588g = true;
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    z = booleanValue;
                    i2 = intValue;
                    cls = cls2;
                    i = abs;
                }
                AssetParallelExportSession assetParallelExportSession = (AssetParallelExportSession) this.f282529s.f27484d;
                if (!(assetParallelExportSession == null || (exportErrorStatus2 = assetParallelExportSession.processErrorStatus) == null)) {
                    this.f282520g.f282503h.add(Integer.valueOf(exportErrorStatus2.code));
                    Log.m105924i("MicroMsg.CompositionExporter", "parallel export process happen error:" + exportErrorStatus2.code);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                AssetExportSession assetExportSession = (AssetExportSession) this.f282530t.f27484d;
                if (!(assetExportSession == null || (exportErrorStatus = assetExportSession.processErrorStatus) == null)) {
                    this.f282520g.f282503h.add(Integer.valueOf(exportErrorStatus.code));
                    Log.m105924i("MicroMsg.CompositionExporter", "export process happen error:" + exportErrorStatus.code);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                }
                C110807k.C101693a aVar = this.f282531u;
                C87412m.m108594g(aVar, "config");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("colorRange", aVar.f297717a);
                jSONObject5.put("colorStandard", aVar.f297718b);
                jSONObject5.put("colorTransfer", aVar.f297719c);
                String jSONObject6 = jSONObject5.toString();
                C87412m.m108593f(jSONObject6, "jsonObj.toString()");
                c2.f266449F = c2.mo86045b(ExifInterface.TAG_COLOR_SPACE, C112551y.m153814n(jSONObject6, ",", ";", false), true);
                C98593c cVar2 = C98593c.f289086a;
                cVar2.mo137981d(cVar2.mo137980c(this.f282520g.mo134596j(this.f282522i)), this.f282522i.f186904i.f297896d);
                C64899zy zyVar2 = this.f282522i;
                int abs2 = (int) Math.abs(c2.f266483o - (zyVar2.f186901f - zyVar2.f186900e));
                c2.f266464U = abs2;
                C96553q qVar2 = this.f282521h;
                if (qVar2.f282582a && qVar2.f282588g && abs2 >= 3000) {
                    C92168c cVar3 = C92168c.f263796a;
                    boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_vc_video_parallel_time_check_enable, true);
                    Log.m105924i("MicroMsg.VideoCompositionExportConfig", "enableParallelVideoTimeCheck:" + wf);
                    if (wf) {
                        Log.m105920e("MicroMsg.CompositionExporter", "timeGap error:" + c2.f266464U);
                        this.f282521h.f282582a = false;
                        c2.f266481m = 20002;
                    }
                }
                EffectProfileData m = this.f282532v.mo154933m();
                c2.f266473e = (long) m.mo136476b().f285782a;
                c2.f266474f = (long) m.mo136476b().f285783b;
                C13598b0 b0Var4 = C13598b0.f38549a;
                c2.f266475g = this.f282532v.mo154933m().mo136477c().f285784c;
                JSONArray jSONArray4 = new JSONArray();
                LinkedList<C64270bz> linkedList = this.f282522i.f186910r;
                C87412m.m108593f(linkedList, "compositionInfo.trackLabelInfoList");
                for (C64270bz bzVar : linkedList) {
                    jSONArray4.put(new JSONObject().put(String.valueOf(bzVar.f182338e), bzVar.f182339f));
                }
                String jSONArray5 = jSONArray4.toString();
                C87412m.m108593f(jSONArray5, "labelArray.toString()");
                c2.f266488t = c2.mo86045b("IntelligentFilterSceneResult", C112551y.m153814n(jSONArray5, ",", ";", false), true);
                if (this.f282533w.f297913x) {
                    if (this.f282520g.f282501f.f337040a) {
                        c2.f266492x = 1;
                    } else {
                        c2.f266492x = 2;
                    }
                }
                C96536f fVar2 = this.f282520g;
                C112570b bVar2 = fVar2.f282501f;
                c2.f266444A = bVar2.f337040a ? 1 : 0;
                c2.f266460Q = bVar2.f337042c;
                C112374d dVar = fVar2.f282500e;
                c2.f266465V = dVar.f336472f;
                c2.f266466W = dVar.f336473g;
                c2.f266450G = c2.mo86045b("CpuName", C112551y.m153816p(C32051e.f85291b, ",", ";", false, 4, (Object) null), true);
                C112170g gVar = this.f282524n.mo134611h().f331509j;
                C102710d dVar2 = gVar != null ? gVar.f335867n : null;
                if (dVar2 != null) {
                    c2.f266475g = ((Number) ((C102710d.C102711a) dVar2.f303331c).invoke()).longValue();
                    c2.f266489u = dVar2.f303330b;
                    c2.f266490v = dVar2.f303329a;
                    C13598b0 b0Var5 = C13598b0.f38549a;
                }
                VideoTransPara videoTransPara = this.f282520g.f282505j;
                if (videoTransPara != null) {
                    C64899zy zyVar3 = this.f282522i;
                    String str = this.f282517d;
                    C59741c0 c0Var = this.f282516A;
                    float f = (float) 100;
                    c2.f266493y = (long) (AdaptiveAdjustBitrate.m119556a(str, ((float) videoTransPara.f267173n) / 1000.0f, (float) videoTransPara.f267174o, videoTransPara.f267175p, ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_audio_quality_analysis_switch, 0) == 1, zyVar3.f186902g) * f);
                    c2.f266494z = (long) (c0Var.f170634d * f);
                    C13598b0 b0Var6 = C13598b0.f38549a;
                }
                C96536f fVar3 = this.f282520g;
                int i9 = i;
                fVar3.f282502g = i9;
                C96553q qVar3 = this.f282521h;
                qVar3.f282585d = i9;
                C112570b bVar3 = fVar3.f282501f;
                qVar3.f282586e = bVar3.f337040a;
                qVar3.f282587f = bVar3.f337041b;
                C31606c cVar4 = (C31606c) this.f282534x.f27484d;
                if (cVar4 != null) {
                    cVar4.destroy();
                    C13598b0 b0Var7 = C13598b0.f38549a;
                }
                this.f282532v.mo154931k();
                if (z) {
                    boolean z3 = this.f282520g.f282501f.f337040a;
                    boolean z4 = z3 && this.f282533w.f297913x;
                    boolean z5 = !z3 && this.f282533w.f297913x;
                    C97814a aVar2 = C97814a.f286944a;
                    String str2 = this.f282535y;
                    C87412m.m108593f(str2, "path");
                    long ticksToNow2 = Util.ticksToNow(this.f282519f);
                    C96552p0 p0Var2 = this.f282524n;
                    aVar2.mo137150a(str2, ticksToNow2, p0Var2.f282573f, p0Var2.f282574g, z4, z5);
                    if (!this.f282533w.f297909t.isEmpty()) {
                        try {
                            String str3 = this.f282535y;
                            LinkedList<Integer> linkedList2 = this.f282533w.f297909t;
                            C87412m.m108593f(linkedList2, "outputConfig.abaParams");
                            SightVideoJNI.addReportArrayMetadata(str3, C110818d0.m150952x0(linkedList2), this.f282533w.f297910u, 0);
                        } catch (Throwable unused) {
                        }
                    }
                }
                int i15 = i2;
                if (i15 == -121 || i15 == -103) {
                    C96536f fVar4 = this.f282520g;
                    C64899zy zyVar4 = this.f282522i;
                    fVar4.getClass();
                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("video_composition_export_config");
                    C87412m.m108593f(mmkv, "getMMKV(kvName)");
                    if (mmkv.getInt("fallback_size", 0) == 0) {
                        MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("video_composition_export_config");
                        C87412m.m108593f(mmkv2, "getMMKV(kvName)");
                        mmkv2.putInt("fallback_size", 1).commit();
                    } else {
                        Log.m105928w("MicroMsg.CompositionExporter", "checkFallbackSize : fallback size failed " + zyVar4.f186904i.f297901i + ", " + zyVar4.f186904i.f297902j);
                    }
                }
                C32226l<? super C96553q, C13598b0> lVar2 = this.f282520g.f282507l;
                if (lVar2 != null) {
                    lVar2.invoke(this.f282521h);
                    C13598b0 b0Var8 = C13598b0.f38549a;
                }
                C96536f fVar5 = this.f282520g;
                fVar5.f282507l = null;
                C97814a aVar3 = C97814a.f286944a;
                boolean z6 = fVar5.f282497b;
                int i16 = fVar5.f282496a;
                boolean z7 = fVar5.f282501f.f337040a;
                int i17 = !z6 ? z ? 90 : 91 : i16 != 1 ? i16 != 2 ? z ? z7 ? TPOptionalID.f349338xc9bdf6cd : 96 : z7 ? 144 : 97 : z ? z7 ? 141 : 94 : z7 ? TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS : 95 : z ? 92 : 93;
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1371, (long) i17, 1);
                if (i15 != 0) {
                    Log.m105924i("MicroMsg.MultiMediaIDKeyStat", "muxErrCode:" + i15);
                    if (i15 == -15) {
                        nVar.mo175913w(1372, 9, 1);
                    } else if (i15 == -14) {
                        nVar.mo175913w(1372, 8, 1);
                    } else if (i15 == -11) {
                        nVar.mo175913w(1372, 6, 1);
                    } else if (i15 != -10) {
                        switch (i15) {
                            case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                                nVar.mo175913w(1372, 41, 1);
                                break;
                            case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                                nVar.mo175913w(1372, 40, 1);
                                break;
                            case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                                nVar.mo175913w(1372, 39, 1);
                                break;
                            case ExportErrorStatus.WRITE_VIDEO_SAMPLE /*-121*/:
                                nVar.mo175913w(1372, 38, 1);
                                break;
                            default:
                                switch (i15) {
                                    case ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS /*-113*/:
                                        nVar.mo175913w(1372, 37, 1);
                                        break;
                                    case ExportErrorStatus.RENDER_SAMPLE_BUFFER /*-112*/:
                                        nVar.mo175913w(1372, 36, 1);
                                        break;
                                    case ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT /*-111*/:
                                        nVar.mo175913w(1372, 35, 1);
                                        break;
                                    case ExportErrorStatus.APPEND_BUFFER /*-110*/:
                                        nVar.mo175913w(1372, 34, 1);
                                        break;
                                    default:
                                        switch (i15) {
                                            case -104:
                                                nVar.mo175913w(1372, 33, 1);
                                                break;
                                            case -103:
                                                nVar.mo175913w(1372, 32, 1);
                                                break;
                                            case -102:
                                                nVar.mo175913w(1372, 31, 1);
                                                break;
                                            case -101:
                                                nVar.mo175913w(1372, 30, 1);
                                                break;
                                            default:
                                                nVar.mo175913w(1372, 16, 1);
                                                break;
                                        }
                                }
                        }
                    } else {
                        nVar.mo175913w(1372, 5, 1);
                    }
                }
                if (z) {
                    C92168c cVar5 = C92168c.f263796a;
                    Object a3 = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_MediaParallel_SaveVideo_Int, 0);
                    C87412m.m108592e(a3, "null cannot be cast to non-null type kotlin.Int");
                    boolean z8 = ((Integer) a3).intValue() == 1;
                    Log.m105924i("MicroMsg.VideoCompositionExportConfig", "forceSaveVideoToAlbum " + z8);
                    if (z8) {
                        C98453h.f288774a.mo137815m(this.f282533w.f297896d);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.model.f$e */
    public static final class C96540e extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<AssetParallelExportSession> f282537d;

        /* renamed from: e */
        public final /* synthetic */ C96536f f282538e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f282539f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f282540g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96540e(C8479f0<AssetParallelExportSession> f0Var, C96536f fVar, C8478d0 d0Var, C8478d0 d0Var2) {
            super(1);
            this.f282537d = f0Var;
            this.f282538e = fVar;
            this.f282539f = d0Var;
            this.f282540g = d0Var2;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            AssetParallelExportSession assetParallelExportSession = (AssetParallelExportSession) this.f282537d.f27484d;
            if (assetParallelExportSession != null) {
                C8478d0 d0Var = this.f282539f;
                C8478d0 d0Var2 = this.f282540g;
                int i = d0Var.f27483d;
                int parallelSize = assetParallelExportSession.parallelSize();
                if (i < parallelSize) {
                    i = parallelSize;
                }
                d0Var.f27483d = i;
                int i2 = d0Var2.f27483d;
                int instanceCount = MediaCodecAnalyse.Companion.instanceCount();
                if (i2 < instanceCount) {
                    i2 = instanceCount;
                }
                d0Var2.f27483d = i2;
            }
            C32226l<? super Float, C13598b0> lVar = this.f282538e.f282506k;
            if (lVar != null) {
                lVar.invoke(Float.valueOf(floatValue));
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new LinkedList();
    }

    /* renamed from: a */
    public void mo81173a(boolean z, VideoTransPara videoTransPara) {
        C87412m.m108594g(videoTransPara, "videoTransPara");
        this.f282504i = z;
        this.f282505j = videoTransPara;
    }

    /* renamed from: b */
    public void mo81174b(C32226l<? super Float, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.f282506k = lVar;
    }

    /* renamed from: c */
    public void mo81175c(int i) {
        this.f282498c = i;
    }

    /* renamed from: d */
    public void mo81176d(boolean z) {
        this.f282497b = z;
    }

    /* renamed from: e */
    public float mo81177e(C64899zy zyVar, boolean z, C32226l<? super C96553q, C13598b0> lVar) {
        C87412m.m108594g(zyVar, "compositionInfo");
        C87412m.m108594g(lVar, "callback");
        this.f282501f.f337041b = mo134594h(false);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new C96538b(lVar, this, zyVar, f0Var);
        Log.m105918d("MicroMsg.CompositionExporter", "export: checkFallbackConfig false");
        return mo134595i(zyVar, (C32226l) f0Var.f27484d);
    }

    /* renamed from: f */
    public void mo81178f(int i) {
        this.f282496a = i;
    }

    /* renamed from: g */
    public void mo81179g(C32224a<C13598b0> aVar) {
        Log.m105924i("MicroMsg.CompositionExporter", "cancel: ");
        this.f282509n = true;
        C110807k kVar = this.f282508m;
        if (kVar != null) {
            kVar.f331519t = new C96537a(this, aVar);
        }
        C110807k kVar2 = this.f282508m;
        if (kVar2 != null) {
            kVar2.f331515p = true;
            AssetExportSession assetExportSession = kVar2.f331518s;
            if (assetExportSession != null) {
                assetExportSession.cancelExport();
            }
        }
    }

    /* renamed from: h */
    public final boolean mo134594h(boolean z) {
        Class cls = C32735h.class;
        boolean z2 = false;
        if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_finder_soft_encode_audio_enable, false)) {
            Log.m105924i("MicroMsg.CompositionExporter", "exportImpl: audio soft enable");
            z2 = true;
        }
        if (z2 || !z || !((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_finder_soft_encode_audio_fallback, true)) {
            return z2;
        }
        Log.m105924i("MicroMsg.CompositionExporter", "exportImpl: audio soft fallback");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0235, code lost:
        if (r2 != 7) goto L_0x0272;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0744  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x074a  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x07c5  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x07cb  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0ad5  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0aea  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0785 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float mo134595i(te3.C64899zy r49, fy3.C32226l<? super com.tencent.p014mm.plugin.vlog.model.C96553q, rx3.C13598b0> r50) {
        /*
            r48 = this;
            r15 = r48
            r14 = r49
            r0 = r50
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            java.lang.String r2 = "compositionInfo"
            gy3.C87412m.m108594g(r14, r2)
            java.lang.String r2 = "callback"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start export, retryCount:"
            r2.append(r3)
            int r3 = r15.f282496a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r12 = "MicroMsg.CompositionExporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.vlog.model.q r11 = new com.tencent.mm.plugin.vlog.model.q
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 127(0x7f, float:1.78E-43)
            r25 = 0
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            te3.az r10 = r14.f186904i
            java.lang.String r2 = "outputConfig"
            gy3.C87412m.m108593f(r10, r2)
            te3.n93 r2 = r10.f297915z
            if (r2 == 0) goto L_0x0059
            int r3 = r2.f184447e
            r10.f297901i = r3
            int r2 = r2.f184448f
            r10.f297902j = r2
            goto L_0x0065
        L_0x0059:
            te3.n93 r2 = r10.f297894A
            if (r2 == 0) goto L_0x0065
            int r3 = r2.f184447e
            r10.f297901i = r3
            int r2 = r2.f184448f
            r10.f297902j = r2
        L_0x0065:
            com.tencent.mm.xeffect.effect.EffectManager r8 = new com.tencent.mm.xeffect.effect.EffectManager
            r8.<init>()
            com.tencent.mm.plugin.vlog.model.p0 r9 = com.tencent.p014mm.plugin.vlog.model.C96551o.m123874d(r14, r8)
            boolean r13 = r10.f297895B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "outputScale: "
            r2.append(r3)
            float r3 = r10.f297900h
            r2.append(r3)
            java.lang.String r3 = ", enableExport1080WidescreenVideo: "
            r2.append(r3)
            di3.d r3 = di3.C86312j.m106911c(r1)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_enable_export_1080_widescreen_video
            r7 = 1
            int r3 = r3.mo58779Qe(r4, r7)
            if (r3 != r7) goto L_0x0096
            r3 = 1
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            float r2 = r10.f297900h
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 4
            r6 = 2
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x01db
            di3.d r2 = di3.C86312j.m106911c(r1)
            h81.h r2 = (h81.C32735h) r2
            int r2 = r2.mo58779Qe(r4, r7)
            if (r2 != r7) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            if (r2 == 0) goto L_0x01db
            java.lang.String r2 = "ready to enlarge resolution"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            int r2 = r10.f297901i
            float r2 = (float) r2
            float r4 = r10.f297900h
            float r2 = r2 * r4
            int r2 = (int) r2
            r4 = 16
            int r2 = r15.mo134598l(r2, r4)
            r10.f297901i = r2
            int r2 = r10.f297902j
            float r2 = (float) r2
            float r4 = r10.f297900h
            float r2 = r2 * r4
            int r2 = (int) r2
            int r2 = r15.mo134598l(r2, r5)
            r10.f297902j = r2
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r2 = r9.f282570c
            java.util.Iterator r2 = r2.iterator()
        L_0x00e6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.vlog.model.q0 r4 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r4
            sp3.c r4 = r4.f316501l
            android.graphics.Rect r4 = r4.f331474l
            float r5 = r10.f297900h
            sp3.C101692i.m133584b(r4, r5)
            r5 = 4
            goto L_0x00e6
        L_0x00fd:
            sp3.k r2 = r9.f282568a
            r2.getClass()
            android.util.Size r4 = new android.util.Size
            int r5 = r2.f331503d
            int r2 = r2.f331504e
            r4.<init>(r5, r2)
            int r2 = r4.getWidth()
            float r2 = (float) r2
            float r5 = r10.f297900h
            float r2 = r2 * r5
            int r2 = (int) r2
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r5 = r10.f297900h
            float r4 = r4 * r5
            int r4 = (int) r4
            r9.mo81184c(r2, r4)
            te3.n93 r2 = r10.f297894A
            if (r2 == 0) goto L_0x0195
            te3.ep3 r2 = r2.f184446d
            if (r2 == 0) goto L_0x0195
            android.graphics.Rect r4 = new android.graphics.Rect
            java.util.LinkedList<java.lang.Integer> r5 = r2.f183015d
            r3 = 0
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r3 = "cropRectProto.values[0]"
            gy3.C87412m.m108593f(r5, r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r5.intValue()
            java.util.LinkedList<java.lang.Integer> r5 = r2.f183015d
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r7 = "cropRectProto.values[1]"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.util.LinkedList<java.lang.Integer> r7 = r2.f183015d
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r6 = "cropRectProto.values[2]"
            gy3.C87412m.m108593f(r7, r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            java.util.LinkedList<java.lang.Integer> r2 = r2.f183015d
            r7 = 3
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r7 = "cropRectProto.values[3]"
            gy3.C87412m.m108593f(r2, r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4.<init>(r3, r5, r6, r2)
            float r2 = r10.f297900h
            sp3.C101692i.m133584b(r4, r2)
            r9.mo81183b(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enlarge cropRect:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0195:
            r10.f297900h = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "enlarge done, targetWidth:"
            r2.append(r4)
            int r4 = r10.f297901i
            r2.append(r4)
            java.lang.String r4 = ", targetHeight:"
            r2.append(r4)
            int r4 = r10.f297902j
            r2.append(r4)
            java.lang.String r4 = ", renderSize:"
            r2.append(r4)
            sp3.k r4 = r9.f282568a
            r4.getClass()
            android.util.Size r5 = new android.util.Size
            int r6 = r4.f331503d
            int r4 = r4.f331504e
            r5.<init>(r6, r4)
            r2.append(r5)
            java.lang.String r4 = ", outputSize:"
            r2.append(r4)
            sp3.k r4 = r9.f282568a
            android.util.Size r4 = r4.mo162385h()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
        L_0x01db:
            java.lang.String r2 = r14.f186903h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r4 = 1
            r19 = r2 ^ 1
            int r2 = r15.f282498c
            r5 = 6
            if (r2 == r4) goto L_0x0276
            r3 = 2
            if (r2 != r3) goto L_0x01ee
            goto L_0x0276
        L_0x01ee:
            boolean r3 = r10.f297913x
            java.lang.String r7 = ", scene: "
            if (r3 == 0) goto L_0x0228
            r6 = 4
            if (r2 != r6) goto L_0x0228
            fh2.e r2 = fh2.C32051e.f85290a
            boolean r2 = r2.mo58472c(r4, r4)
            z13.b r3 = r15.f282501f
            boolean r4 = r3.f337040a
            if (r4 != 0) goto L_0x0208
            if (r2 == 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r4 = 0
            goto L_0x0209
        L_0x0208:
            r4 = 1
        L_0x0209:
            r3.f337040a = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "c2c enableHevcSoft:"
            r3.append(r4)
            r3.append(r2)
            r3.append(r7)
            int r2 = r15.f282498c
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x0270
        L_0x0228:
            if (r3 == 0) goto L_0x0270
            if (r2 == r5) goto L_0x0238
            r6 = 9
            r4 = 8
            if (r2 == r6) goto L_0x023c
            if (r2 == r4) goto L_0x023c
            r3 = 7
            if (r2 != r3) goto L_0x0272
            goto L_0x023c
        L_0x0238:
            r4 = 8
            r6 = 9
        L_0x023c:
            fh2.e r2 = fh2.C32051e.f85290a
            r3 = 2
            r4 = 1
            boolean r2 = r2.mo58472c(r4, r3)
            z13.b r3 = r15.f282501f
            boolean r4 = r3.f337040a
            if (r4 != 0) goto L_0x024f
            if (r2 == 0) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r4 = 0
            goto L_0x0250
        L_0x024f:
            r4 = 1
        L_0x0250:
            r3.f337040a = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "sns enableHevcSoft:"
            r3.append(r4)
            r3.append(r2)
            r3.append(r7)
            int r2 = r15.f282498c
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x0272
        L_0x0270:
            r6 = 9
        L_0x0272:
            r26 = r8
            goto L_0x02e4
        L_0x0276:
            r6 = 9
            long r2 = r9.getDurationMs()
            xb0.h r4 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.mo142238c6()
            int r4 = r4.f267170h
            int r4 = r4 * 1000
            boolean r7 = r10.f297913x
            if (r7 == 0) goto L_0x0299
            long r6 = (long) r4
            int r25 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r25 <= 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            boolean r6 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39117f(r6, r2)
            goto L_0x029a
        L_0x0299:
            r6 = 0
        L_0x029a:
            boolean r7 = r10.f297913x
            if (r7 == 0) goto L_0x02a3
            boolean r7 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39116e()
            goto L_0x02a4
        L_0x02a3:
            r7 = 0
        L_0x02a4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r26 = r8
            java.lang.String r8 = "enableHevcSoft:"
            r5.append(r8)
            r5.append(r6)
            java.lang.String r8 = ", enableHevcHard:"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r7 = ", durationMs:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = ", longVideoDurationLimit:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            z13.b r2 = r15.f282501f
            boolean r3 = r2.f337040a
            if (r3 != 0) goto L_0x02e1
            boolean r3 = r10.f297913x
            if (r3 == 0) goto L_0x02df
            if (r6 == 0) goto L_0x02df
            goto L_0x02e1
        L_0x02df:
            r3 = 0
            goto L_0x02e2
        L_0x02e1:
            r3 = 1
        L_0x02e2:
            r2.f337040a = r3
        L_0x02e4:
            z13.b r2 = r15.f282501f
            bp3.p r3 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Media_VideoEncodeForceSoftOrHard_Int
            r5 = 0
            int r3 = r3.mo109882e(r4, r5)
            r4 = 1
            if (r3 == r4) goto L_0x02f9
            r6 = 2
            if (r3 == r6) goto L_0x02f6
            goto L_0x02fb
        L_0x02f6:
            r2.f337040a = r5
            goto L_0x02fb
        L_0x02f9:
            r2.f337040a = r4
        L_0x02fb:
            java.lang.String r2 = r10.f297896d
            java.lang.String r3 = "outputConfig.outputPath"
            gy3.C87412m.m108593f(r2, r3)
            z13.b r3 = r15.f282501f
            boolean r3 = r3.f337040a
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r4 = r9.f282570c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r4.iterator()
        L_0x0312:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0331
            java.lang.Object r7 = r6.next()
            r8 = r7
            com.tencent.mm.plugin.vlog.model.q0 r8 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r8
            int r8 = r8.f316491b
            r27 = r6
            r6 = 2
            if (r8 != r6) goto L_0x0328
            r6 = 1
            goto L_0x0329
        L_0x0328:
            r6 = 0
        L_0x0329:
            if (r6 == 0) goto L_0x032e
            r5.add(r7)
        L_0x032e:
            r6 = r27
            goto L_0x0312
        L_0x0331:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x0340:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0352
            java.lang.Object r7 = r5.next()
            com.tencent.mm.plugin.vlog.model.q0 r7 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r7
            java.lang.String r7 = r7.f316490a
            r6.add(r7)
            goto L_0x0340
        L_0x0352:
            f23.a r5 = f23.C97814a.f286944a
            int r5 = r4.size()
            int r7 = r6.size()
            int r4 = r4.size()
            if (r7 >= r4) goto L_0x0364
            r4 = 1
            goto L_0x0365
        L_0x0364:
            r4 = 0
        L_0x0365:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "markMuxTrackCount, count:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = ", videoAndImage:"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.MultiMediaIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            if (r4 == 0) goto L_0x0391
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 1371(0x55b, double:6.774E-321)
            r30 = 2
            r32 = 1
            r27.mo175913w(r28, r30, r32)
        L_0x0391:
            r4 = 1
            if (r5 > r4) goto L_0x03a0
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 1371(0x55b, double:6.774E-321)
            r30 = 3
            r32 = 1
            r27.mo175913w(r28, r30, r32)
            goto L_0x03b6
        L_0x03a0:
            r4 = 2
            if (r4 > r5) goto L_0x03a8
            r4 = 4
            if (r5 >= r4) goto L_0x03a8
            r4 = 1
            goto L_0x03a9
        L_0x03a8:
            r4 = 0
        L_0x03a9:
            if (r4 == 0) goto L_0x03b8
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 1371(0x55b, double:6.774E-321)
            r30 = 4
            r32 = 1
            r27.mo175913w(r28, r30, r32)
        L_0x03b6:
            r7 = 6
            goto L_0x03da
        L_0x03b8:
            r4 = 4
            r7 = 6
            if (r4 > r5) goto L_0x03c0
            if (r5 >= r7) goto L_0x03c0
            r4 = 1
            goto L_0x03c1
        L_0x03c0:
            r4 = 0
        L_0x03c1:
            if (r4 == 0) goto L_0x03cf
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 1371(0x55b, double:6.774E-321)
            r30 = 5
            r32 = 1
            r27.mo175913w(r28, r30, r32)
            goto L_0x03da
        L_0x03cf:
            com.tencent.mm.plugin.report.service.n r34 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r35 = 1371(0x55b, double:6.774E-321)
            r37 = 6
            r39 = 1
            r34.mo175913w(r35, r37, r39)
        L_0x03da:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startMux, pathList:"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ", outputPath:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", softEncode:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            boolean r4 = r6.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            r18 = 0
            java.lang.String r5 = ", "
            if (r4 == 0) goto L_0x05cf
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = f23.C97814a.f286945b
            r17 = r13
            r7 = 0
            int r13 = r4.getInt(r2, r7)
            int r7 = f23.C97814a.f286946c
            if (r13 != r7) goto L_0x042e
            java.lang.String r7 = "check mux may be resume from previous error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            int r7 = f23.C97814a.f286947d
            r4.putInt(r2, r7)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1371(0x55b, double:6.774E-321)
            r31 = 99
            r33 = 1
            r28.mo175913w(r29, r31, r33)
            goto L_0x0431
        L_0x042e:
            r4.putInt(r2, r7)
        L_0x0431:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r36 = 1371(0x55b, double:6.774E-321)
            r38 = 0
            r40 = 1
            r35 = r2
            r35.mo175913w(r36, r38, r40)
            if (r3 == 0) goto L_0x044b
            r36 = 1371(0x55b, double:6.774E-321)
            r38 = 139(0x8b, double:6.87E-322)
            r40 = 1
            r35 = r2
            r35.mo175913w(r36, r38, r40)
        L_0x044b:
            r38 = 8
            int r3 = r6.size()
            long r3 = (long) r3
            r36 = 1371(0x55b, double:6.774E-321)
            r35 = r2
            r40 = r3
            r35.mo175913w(r36, r38, r40)
            r38 = 9
            r40 = 1
            r35.mo175913w(r36, r38, r40)
            java.util.Iterator r2 = r6.iterator()
        L_0x0466:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05d1
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 != 0) goto L_0x0483
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1372(0x55c, double:6.78E-321)
            r31 = 1
            r33 = 0
            r28.mo175913w(r29, r31, r33)
        L_0x0483:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r4 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            rw.m$a r4 = r4.mo129930b(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "startMux, videoInfo:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            if (r4 == 0) goto L_0x055b
            int r6 = r4.f180525a
            if (r6 <= 0) goto L_0x055b
            int r6 = r4.f180526b
            if (r6 <= 0) goto L_0x055b
            float r6 = r4.f180527c
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 > 0) goto L_0x04b0
            goto L_0x055b
        L_0x04b0:
            boolean r6 = r4.f180531g
            if (r6 == 0) goto L_0x04d4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "video is h265 path:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1371(0x55b, double:6.774E-321)
            r31 = 25
            r33 = 1
            r28.mo175913w(r29, r31, r33)
        L_0x04d4:
            int r6 = r4.f180525a
            r7 = 2000(0x7d0, float:2.803E-42)
            if (r6 >= r7) goto L_0x04de
            int r6 = r4.f180526b
            if (r6 < r7) goto L_0x0510
        L_0x04de:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "video high resolution:["
            r6.append(r7)
            int r7 = r4.f180525a
            r6.append(r7)
            r6.append(r5)
            int r7 = r4.f180526b
            r6.append(r7)
            java.lang.String r7 = "], path:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1371(0x55b, double:6.774E-321)
            r31 = 26
            r33 = 1
            r28.mo175913w(r29, r31, r33)
        L_0x0510:
            float r6 = r4.f180527c
            r7 = 1109393408(0x42200000, float:40.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0542
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "video high fps:"
            r6.append(r7)
            float r7 = r4.f180527c
            r6.append(r7)
            java.lang.String r7 = ", path:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1371(0x55b, double:6.774E-321)
            r31 = 27
            r33 = 1
            r28.mo175913w(r29, r31, r33)
        L_0x0542:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r38 = 12
            float r4 = r4.f180527c
            long r6 = (long) r4
            r36 = 1371(0x55b, double:6.774E-321)
            r35 = r3
            r40 = r6
            r35.mo175913w(r36, r38, r40)
            r38 = 13
            r40 = 1
            r35.mo175913w(r36, r38, r40)
            goto L_0x0466
        L_0x055b:
            if (r4 != 0) goto L_0x057e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "cannot get videoInfo path:"
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1372(0x55c, double:6.78E-321)
            r31 = 0
            r33 = 1
            r28.mo175913w(r29, r31, r33)
            goto L_0x0466
        L_0x057e:
            int r6 = r4.f180525a
            if (r6 <= 0) goto L_0x05ae
            int r6 = r4.f180526b
            if (r6 > 0) goto L_0x0587
            goto L_0x05ae
        L_0x0587:
            float r4 = r4.f180527c
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x0466
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "cannot get video fps path:"
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1372(0x55c, double:6.78E-321)
            r31 = 3
            r33 = 1
            r28.mo175913w(r29, r31, r33)
            goto L_0x0466
        L_0x05ae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "cannot get video width/height path:"
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 1372(0x55c, double:6.78E-321)
            r31 = 2
            r33 = 1
            r28.mo175913w(r29, r31, r33)
            goto L_0x0466
        L_0x05cf:
            r17 = r13
        L_0x05d1:
            gy3.c0 r8 = new gy3.c0
            r8.<init>()
            boolean r2 = r15.f282504i
            if (r2 == 0) goto L_0x0667
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r15.f282505j
            if (r2 == 0) goto L_0x0667
            z13.b r2 = r15.f282501f
            boolean r2 = r2.f337040a
            if (r2 == 0) goto L_0x05fc
            boolean r3 = r10.f297913x
            r4 = 1
            if (r3 != r4) goto L_0x05eb
            r3 = 1
            goto L_0x05ec
        L_0x05eb:
            r3 = 0
        L_0x05ec:
            if (r3 == 0) goto L_0x05fd
            java.lang.String r2 = "start calculate aba set soft hevc encode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r15.f282505j
            if (r2 != 0) goto L_0x05f9
            goto L_0x0612
        L_0x05f9:
            r2.f267154A = r4
            goto L_0x0612
        L_0x05fc:
            r4 = 1
        L_0x05fd:
            if (r2 != 0) goto L_0x0612
            boolean r2 = r10.f297913x
            if (r2 != r4) goto L_0x0612
            java.lang.String r2 = "start calculate aba set hevc hard encode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r15.f282505j
            if (r2 != 0) goto L_0x060e
            goto L_0x0612
        L_0x060e:
            r6 = 2
            r2.f267154A = r6
            goto L_0x0613
        L_0x0612:
            r6 = 2
        L_0x0613:
            com.tencent.mm.plugin.vlog.model.i$a r13 = com.tencent.p014mm.plugin.vlog.model.C96543i.f282548f
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r15.f282505j
            gy3.C87412m.m108591d(r4)
            int r7 = r10.f297901i
            int r3 = r10.f297902j
            te3.yy r2 = r14.f186906n
            java.util.LinkedList<te3.ea> r2 = r2.f186611e
            java.lang.String r6 = "compositionInfo.editData.baseItemData"
            gy3.C87412m.m108593f(r2, r6)
            boolean r2 = r2.isEmpty()
            r20 = 1
            r28 = r2 ^ 1
            r2 = r13
            r6 = r3
            r22 = 1065353216(0x3f800000, float:1.0)
            r3 = r9
            r23 = 8
            r0 = r5
            r16 = r11
            r11 = 3
            r5 = r7
            r7 = 9
            r11 = 0
            r7 = r28
            com.tencent.mm.plugin.vlog.model.a r2 = r2.mo134603b(r3, r4, r5, r6, r7)
            r13.mo134602a(r2, r10)
            com.tencent.mm.plugin.sight.base.ABAPrams r2 = r2.f282486e
            if (r2 == 0) goto L_0x066d
            int r2 = r2.qualityLevel
            float r2 = (float) r2
            r8.f170634d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "export videoQuality: "
            r2.append(r3)
            float r3 = r8.f170634d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x066d
        L_0x0667:
            r0 = r5
            r16 = r11
            r11 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
        L_0x066d:
            java.lang.String r2 = "video_composition_export_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)
            java.lang.String r3 = "getMMKV(kvName)"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = "fallback_size"
            int r2 = r2.getInt(r3, r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkTargetSize: origin "
            r3.append(r4)
            te3.az r4 = r14.f186904i
            int r4 = r4.f297901i
            r3.append(r4)
            r3.append(r0)
            te3.az r4 = r14.f186904i
            int r4 = r4.f297902j
            r3.append(r4)
            java.lang.String r4 = ", type "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            te3.az r3 = r14.f186904i
            r3.f297912w = r2
            if (r2 == 0) goto L_0x06f1
            r7 = 1
            if (r2 == r7) goto L_0x06b3
            goto L_0x071b
        L_0x06b3:
            di3.d r2 = di3.C86312j.m106911c(r1)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_remux_retry_max_width
            r4 = 720(0x2d0, float:1.009E-42)
            int r2 = r2.mo58779Qe(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkTargetSize: config "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            te3.az r3 = r14.f186904i
            int r4 = r3.f297901i
            if (r4 <= r2) goto L_0x071b
            float r5 = (float) r2
            float r5 = r5 * r22
            float r4 = (float) r4
            float r5 = r5 / r4
            int r3 = r3.f297902j
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r3 = f72.C97842b.m126284a(r3)
            te3.az r4 = r14.f186904i
            r4.f297901i = r2
            r4.f297902j = r3
            goto L_0x071b
        L_0x06f1:
            r7 = 1
            di3.d r2 = di3.C86312j.m106911c(r1)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_remux_max_height
            r4 = 1920(0x780, float:2.69E-42)
            int r2 = r2.mo58779Qe(r3, r4)
            te3.az r3 = r14.f186904i
            int r4 = r3.f297902j
            if (r4 <= r2) goto L_0x071b
            float r5 = (float) r2
            float r5 = r5 * r22
            float r4 = (float) r4
            float r5 = r5 / r4
            int r3 = r3.f297901i
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r3 = f72.C97842b.m126284a(r3)
            te3.az r4 = r14.f186904i
            r4.f297901i = r3
            r4.f297902j = r2
        L_0x071b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "export: size "
            r2.append(r3)
            int r3 = r10.f297901i
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            int r3 = r10.f297902j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            te3.yy r2 = r14.f186906n
            if (r2 == 0) goto L_0x0747
            te3.ep3 r3 = r2.f186610d
            goto L_0x0748
        L_0x0747:
            r3 = 0
        L_0x0748:
            if (r3 == 0) goto L_0x0762
            if (r2 == 0) goto L_0x074f
            te3.ep3 r2 = r2.f186613g
            goto L_0x0750
        L_0x074f:
            r2 = 0
        L_0x0750:
            if (r2 == 0) goto L_0x0762
            ei2.c r2 = com.tencent.p014mm.plugin.vlog.model.C96551o.m123875e(r49)
            r6.f27484d = r2
            r9.mo134622s(r2)
            T r2 = r6.f27484d
            ei2.c r2 = (ei2.C31606c) r2
            r2.start()
        L_0x0762:
            java.util.LinkedList<te3.hi4> r2 = r14.f186899d
            java.lang.String r3 = "compositionInfo.tracks"
            gy3.C87412m.m108593f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x076d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0785
            java.lang.Object r4 = r2.next()
            r13 = r4
            te3.hi4 r13 = (te3.hi4) r13
            int r13 = r13.f183505e
            r5 = 3
            if (r13 != r5) goto L_0x0781
            r13 = 1
            goto L_0x0782
        L_0x0781:
            r13 = 0
        L_0x0782:
            if (r13 == 0) goto L_0x076d
            goto L_0x0786
        L_0x0785:
            r4 = 0
        L_0x0786:
            if (r4 == 0) goto L_0x078a
            r2 = 1
            goto L_0x078b
        L_0x078a:
            r2 = 0
        L_0x078b:
            if (r19 != 0) goto L_0x078f
            if (r2 == 0) goto L_0x07cd
        L_0x078f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "export: has music, audio info "
            r2.append(r4)
            int r4 = r10.f297906q
            r2.append(r4)
            r2.append(r0)
            int r4 = r10.f297907r
            r2.append(r4)
            r2.append(r0)
            int r0 = r10.f297908s
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            int r0 = r10.f297906q
            if (r0 != 0) goto L_0x07be
            r0 = 128000(0x1f400, float:1.79366E-40)
            r10.f297906q = r0
        L_0x07be:
            int r0 = r10.f297907r
            r2 = 44100(0xac44, float:6.1797E-41)
            if (r0 >= r2) goto L_0x07c7
            r10.f297907r = r2
        L_0x07c7:
            int r0 = r10.f297908s
            if (r0 != 0) goto L_0x07cd
            r10.f297908s = r7
        L_0x07cd:
            com.tencent.mm.plugin.vlog.model.j r0 = com.tencent.p014mm.plugin.vlog.model.C96545j.f282554a
            z13.b r2 = r15.f282501f
            boolean r2 = r2.f337040a
            sp3.k$a r5 = r0.mo134606a(r10, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "codec size:"
            r0.append(r2)
            android.util.Size r2 = r5.f297722f
            r0.append(r2)
            java.lang.String r2 = " render size:"
            r0.append(r2)
            android.util.Size r2 = r5.f297734r
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            java.lang.String r4 = r10.f297896d
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106458s(r4)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r2 != 0) goto L_0x0806
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
        L_0x0806:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106444e(r4)
            if (r0 != 0) goto L_0x0818
            r2 = r16
            r2.f282582a = r11
            r2.f282583b = r11
            r0 = r50
            r0.invoke(r2)
            return r18
        L_0x0818:
            r0 = r50
            r2 = r16
            java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r7)
            gy3.C87412m.m108591d(r13)
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r7 = r5.f297727k
            int r11 = r5.f297728l
            r9.f282579l = r7
            r9.f282580m = r11
            boolean r7 = r9.f282576i
            if (r7 == 0) goto L_0x0843
            java.lang.String r7 = "enable video enhancement"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            d23.a r7 = d23.C106976a.f320208a
            zt3.t r7 = zt3.C119157j.f356862d
            d23.g r11 = d23.C106981g.f320228d
            zt3.j r7 = (zt3.C119157j) r7
            r7.mo183875f(r11)
        L_0x0843:
            sp3.k r11 = r9.mo134611h()
            r15.f282508m = r11
            r7 = 0
            r15.f282509n = r7
            long r21 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r18)
            java.util.ArrayList<sp3.c> r7 = r11.f331511l
            r16 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x085d:
            boolean r23 = r7.hasNext()
            if (r23 == 0) goto L_0x0884
            r23 = r3
            java.lang.Object r3 = r7.next()
            r24 = r4
            r4 = r3
            sp3.c r4 = (sp3.C110801c) r4
            int r4 = r4.f331483u
            r25 = r10
            r10 = 2
            if (r4 != r10) goto L_0x0877
            r4 = 1
            goto L_0x0878
        L_0x0877:
            r4 = 0
        L_0x0878:
            if (r4 == 0) goto L_0x087d
            r2.add(r3)
        L_0x087d:
            r3 = r23
            r4 = r24
            r10 = r25
            goto L_0x085d
        L_0x0884:
            r23 = r3
            r24 = r4
            r25 = r10
            r10 = 2
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L_0x092e
            java.util.ArrayList<sp3.c> r2 = r11.f331511l
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x089f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x089f
            goto L_0x08bb
        L_0x089f:
            java.util.Iterator r2 = r2.iterator()
        L_0x08a3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x08bb
            java.lang.Object r3 = r2.next()
            sp3.c r3 = (sp3.C110801c) r3
            int r3 = r3.f331483u
            r4 = 1
            if (r3 != r4) goto L_0x08b6
            r7 = 1
            goto L_0x08b7
        L_0x08b6:
            r7 = 0
        L_0x08b7:
            if (r7 == 0) goto L_0x08a3
            r7 = 0
            goto L_0x08bc
        L_0x08bb:
            r7 = 1
        L_0x08bc:
            if (r7 == 0) goto L_0x092e
            java.lang.String r2 = "export only one video, check colorSpace"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            java.util.ArrayList<sp3.c> r2 = r11.f331511l
            java.util.Iterator r2 = r2.iterator()
        L_0x08c9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x08e0
            java.lang.Object r3 = r2.next()
            r4 = r3
            sp3.c r4 = (sp3.C110801c) r4
            int r4 = r4.f331483u
            if (r4 != r10) goto L_0x08dc
            r7 = 1
            goto L_0x08dd
        L_0x08dc:
            r7 = 0
        L_0x08dd:
            if (r7 == 0) goto L_0x08c9
            goto L_0x08e1
        L_0x08e0:
            r3 = 0
        L_0x08e1:
            sp3.c r3 = (sp3.C110801c) r3
            if (r3 == 0) goto L_0x092e
            java.lang.String r2 = r3.f331482t
            java.lang.String r3 = "src"
            gy3.C87412m.m108594g(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0907
            w80.i r3 = w80.C111750i.f334661a
            w80.i$a r2 = r3.mo163488a(r2)
            if (r2 == 0) goto L_0x0907
            int r3 = r2.f301461a
            r5.f297717a = r3
            int r3 = r2.f301462b
            r5.f297718b = r3
            int r2 = r2.f301463c
            r5.f297719c = r2
        L_0x0907:
            int r2 = r15.f282498c
            r3 = 6
            if (r2 == r3) goto L_0x0914
            r3 = 9
            if (r2 == r3) goto L_0x0914
            r3 = 8
            if (r2 != r3) goto L_0x092c
        L_0x0914:
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_sns_video_enable_hdr_lut
            r3 = 1
            int r1 = r1.mo58779Qe(r2, r3)
            if (r1 != r3) goto L_0x092c
            boolean r1 = p206nj.C11171e.m11046c(r4)
            if (r1 == 0) goto L_0x092c
            r9.mo134610g(r5)
        L_0x092c:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x092e:
            gy3.d0 r2 = new gy3.d0
            r2.<init>()
            r1 = 1
            r2.f27483d = r1
            com.tencent.tav.codec.MediaCodecAnalyse$Companion r1 = com.tencent.tav.codec.MediaCodecAnalyse.Companion
            int r28 = r1.instanceCount()
            gy3.d0 r7 = new gy3.d0
            r7.<init>()
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            com.tencent.mm.plugin.vlog.model.f$e r1 = new com.tencent.mm.plugin.vlog.model.f$e
            r1.<init>(r3, r15, r2, r7)
            r15.f282507l = r0
            boolean r0 = r15.f282499d
            if (r0 != 0) goto L_0x0966
            rx3.l r0 = new rx3.l
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r30 = r1
            r29 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r0.<init>(r10, r1)
            goto L_0x0970
        L_0x0966:
            r30 = r1
            r29 = 1
            b23.c r0 = b23.C92168c.f263796a
            rx3.l r0 = r0.mo126129a(r14)
        L_0x0970:
            r10 = r0
            b23.c r0 = b23.C92168c.f263796a
            boolean r1 = r0.mo126132d(r14)
            r0 = r13
            r31 = r17
            r13 = r1
            r50 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r17 = r3
            java.lang.String r3 = "checkEnableParallelExport:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = " isEdited:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            com.tencent.mm.plugin.vlog.model.f$d r3 = new com.tencent.mm.plugin.vlog.model.f$d
            r32 = r50
            r0 = r3
            r42 = r30
            r30 = r1
            r1 = r32
            r44 = r3
            r50 = r17
            r43 = r23
            r23 = r24
            r24 = r4
            r3 = r18
            r33 = r5
            r5 = r48
            r20 = r6
            r6 = r16
            r17 = r7
            r18 = 0
            r7 = r49
            r34 = r8
            r19 = r26
            r26 = r9
            r8 = r21
            r21 = r25
            r25 = r10
            r10 = r26
            r46 = r11
            r45 = r16
            r11 = r28
            r47 = r12
            r12 = r17
            r14 = r31
            r15 = r50
            r16 = r24
            r17 = r33
            r18 = r19
            r19 = r21
            r21 = r23
            r22 = r25
            r23 = r34
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r49
            java.util.LinkedList<te3.hi4> r0 = r0.f186899d
            r1 = r43
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x09ff
        L_0x09fc:
            r2 = r47
            goto L_0x0a3b
        L_0x09ff:
            java.util.Iterator r0 = r0.iterator()
        L_0x0a03:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x09fc
            java.lang.Object r1 = r0.next()
            te3.hi4 r1 = (te3.hi4) r1
            java.lang.String r2 = r1.f183504d
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0a1b
            r2 = r47
            r7 = 1
            goto L_0x0a34
        L_0x0a1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file deleted "
            r2.append(r3)
            java.lang.String r1 = r1.f183504d
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = r47
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r7 = 0
        L_0x0a34:
            if (r7 != 0) goto L_0x0a38
            r7 = 0
            goto L_0x0a3c
        L_0x0a38:
            r47 = r2
            goto L_0x0a03
        L_0x0a3b:
            r7 = 1
        L_0x0a3c:
            if (r7 != 0) goto L_0x0a5b
            java.lang.String r0 = "failed due to file deleted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r0 = r45
            r1 = 0
            r0.f282583b = r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = r44
            r4 = 0
            r3.invoke(r0, r1, r4)
            r5 = r34
            float r0 = r5.f170634d
            return r0
        L_0x0a5b:
            r6 = r26
            r5 = r34
            r3 = r44
            r0 = r45
            r1 = 0
            r4 = 0
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r6 = r6.f282570c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0a70:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a8b
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.tencent.mm.plugin.vlog.model.q0 r9 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r9
            int r9 = r9.f316491b
            r10 = 2
            if (r9 != r10) goto L_0x0a84
            r9 = 1
            goto L_0x0a85
        L_0x0a84:
            r9 = 0
        L_0x0a85:
            if (r9 == 0) goto L_0x0a70
            r7.add(r8)
            goto L_0x0a70
        L_0x0a8b:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0a93
        L_0x0a91:
            r10 = 1
            goto L_0x0ad2
        L_0x0a93:
            java.util.Iterator r6 = r7.iterator()
        L_0x0a97:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0a91
            java.lang.Object r7 = r6.next()
            com.tencent.mm.plugin.vlog.model.q0 r7 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r7
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r8 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r9 = r7.f316490a
            r10 = 1
            rw.m$a r8 = r8.mo129931c(r9, r10)
            if (r8 == 0) goto L_0x0ab6
            boolean r8 = r8.mo88493g()
            if (r8 == 0) goto L_0x0ab6
            r7 = 1
            goto L_0x0ace
        L_0x0ab6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "video invalid "
            r8.append(r9)
            java.lang.String r7 = r7.f316490a
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            r7 = 0
        L_0x0ace:
            if (r7 != 0) goto L_0x0a97
            r7 = 0
            goto L_0x0ad3
        L_0x0ad2:
            r7 = 1
        L_0x0ad3:
            if (r7 != 0) goto L_0x0aea
            java.lang.String r6 = "failed due to video invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
            r0.f282583b = r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 10002(0x2712, float:1.4016E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.invoke(r0, r1, r4)
            float r0 = r5.f170634d
            return r0
        L_0x0aea:
            r0 = r48
            if (r31 == 0) goto L_0x0b04
            z13.b r4 = r0.f282501f
            boolean r4 = r4.f337040a
            if (r4 == 0) goto L_0x0b04
            java.lang.String r4 = "exportImpl: set VideoConfigurationContentMode = scaleToFit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            sp3.k r4 = r0.f282508m
            if (r4 == 0) goto L_0x0b04
            com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode r6 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.scaleToFit
            r4.mo162394q(r6)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0b04:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "select parallel export result:"
            r4.append(r6)
            r6 = r25
            A r7 = r6.f38555d
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r4.append(r7)
            java.lang.String r7 = " size:"
            r4.append(r7)
            B r7 = r6.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r4.append(r7)
            java.lang.String r7 = " retry count:"
            r4.append(r7)
            int r7 = r0.f282496a
            r4.append(r7)
            java.lang.String r7 = " videoSoftEncode:"
            r4.append(r7)
            z13.b r7 = r0.f282501f
            boolean r7 = r7.f337040a
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            z13.b r4 = r0.f282501f
            boolean r4 = r4.f337040a
            if (r4 != 0) goto L_0x0b92
            A r4 = r6.f38555d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0b92
            int r4 = r0.f282496a
            if (r4 > r10) goto L_0x0b92
            java.lang.String r4 = "select parallel export"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer r2 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.f282626a
            com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory r2 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.f282627b
            com.tencent.tav.decoder.muxer.MediaMuxerFactory.setMuxerCreator(r2)
            B r2 = r6.f38556e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = r33
            r4.f297733q = r2
            r4.f297732p = r1
            com.tencent.tav.codec.DefaultMediaFactory r1 = new com.tencent.tav.codec.DefaultMediaFactory
            z13.b r2 = r0.f282501f
            y13.d r6 = r0.f282500e
            r1.<init>(r2, r6)
            r6 = r46
            r6.f331516q = r1
            r1 = r32
            r7 = r42
            com.tencent.tav.core.AssetParallelExportSession r1 = r6.mo162390m(r1, r4, r3, r7)
            r2 = r50
            r2.f27484d = r1
            goto L_0x0bc7
        L_0x0b92:
            r1 = r32
            r4 = r33
            r7 = r42
            r6 = r46
            java.lang.String r8 = "select single export"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            com.tencent.mm.plugin.vlog.model.TAVKitMuxer r2 = com.tencent.p014mm.plugin.vlog.model.TAVKitMuxer.f282480a
            r2.mo134554a()
            com.tencent.tav.codec.DefaultMediaFactory r2 = new com.tencent.tav.codec.DefaultMediaFactory
            z13.b r8 = r0.f282501f
            y13.d r9 = r0.f282500e
            r2.<init>(r8, r9)
            r6.f331516q = r2
            com.tencent.mm.plugin.vlog.model.f$c r2 = new com.tencent.mm.plugin.vlog.model.f$c
            r2.<init>(r3)
            r27 = r6
            r28 = r1
            r29 = r4
            r31 = r2
            r32 = r7
            com.tencent.tav.core.AssetExportSession r1 = r27.mo162383f(r28, r29, r30, r31, r32)
            r2 = r24
            r2.f27484d = r1
        L_0x0bc7:
            float r1 = r5.f170634d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96536f.mo134595i(te3.zy, fy3.l):float");
    }

    /* renamed from: j */
    public String mo134596j(C64899zy zyVar) {
        C87412m.m108594g(zyVar, "<this>");
        String str = zyVar.f186911s;
        if (str != null) {
            return str;
        }
        String str2 = zyVar.f186904i.f297896d;
        C87412m.m108593f(str2, "outputConfig.outputPath");
        return str2;
    }

    /* renamed from: k */
    public JSONArray mo134597k(C64899zy zyVar) {
        C87412m.m108594g(zyVar, "compositionInfo");
        String str = zyVar.f186899d.get(0).f183504d;
        JSONArray jSONArray = new JSONArray();
        if (!C86013q1.m106450k(str)) {
            return jSONArray;
        }
        AssetExtractor assetExtractor = new AssetExtractor();
        assetExtractor.setDataSource(str);
        int firstTrackIndex = DecoderUtils.getFirstTrackIndex(assetExtractor, "video/");
        if (firstTrackIndex < 0) {
            return jSONArray;
        }
        assetExtractor.selectTrack(firstTrackIndex);
        MediaFormat trackFormat = assetExtractor.getTrackFormat(firstTrackIndex);
        C87412m.m108593f(trackFormat, "extractor.getTrackFormat(trackIndex)");
        String string = trackFormat.getString("mime");
        int integer = trackFormat.containsKey("width") ? trackFormat.getInteger("width") : 0;
        int integer2 = trackFormat.containsKey("height") ? trackFormat.getInteger("height") : 0;
        if (TextUtils.isEmpty(string)) {
            return jSONArray;
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            String[] supportedTypes = codecInfoAt.getSupportedTypes();
            int length = supportedTypes.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C112551y.m153809i(supportedTypes[i2], string, true)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("encode", codecInfoAt.isEncoder());
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(string);
                    if (Build.VERSION.SDK_INT >= 23) {
                        jSONObject.put("maxSupportedInstances", capabilitiesForType.getMaxSupportedInstances());
                    }
                    MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                    jSONObject.put("bitRange", videoCapabilities.getBitrateRange().toString());
                    jSONObject.put("frameRange", videoCapabilities.getSupportedFrameRates().toString());
                    if (videoCapabilities.isSizeSupported(integer, integer2)) {
                        jSONObject.put("sizeFrame", videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
                    } else {
                        jSONObject.put("sizeSupported", false);
                    }
                    jSONArray.put(jSONObject);
                } else {
                    i2++;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: l */
    public int mo134598l(int i, int i2) {
        if (i <= i2) {
            return i2;
        }
        Integer valueOf = Integer.valueOf((i2 - 1) & i);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i2 ? (i - intValue) + i2 : i - intValue;
    }
}
