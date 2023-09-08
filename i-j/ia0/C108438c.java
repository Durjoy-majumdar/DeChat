package ia0;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53953u0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.maas.camerafun.MJAuditCaptureSettings;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.camerafun.MJVideoFrame;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.model.time.MJTime;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import di3.C86312j;
import e80.C107261i;
import eu3.C58834h;
import eu3.C97749e;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ha0.C108202h;
import ha0.C108203i;
import ha0.C108208l;
import ha0.C108210m;
import ha0.C108218r;
import ha0.C108221t;
import ha0.C108238y0;
import i80.C108400c;
import iy3.C60641c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.ResultKt;
import lh2.C109344g0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import xb0.C102609h;
import xx3.C15911a;
import y90.C66581h;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ia0.c */
public final class C108438c implements C109344g0, ImageReader.OnImageAvailableListener {

    /* renamed from: A */
    public MJTime f324695A;

    /* renamed from: B */
    public boolean f324696B;

    /* renamed from: d */
    public BaseScopePluginLayout f324697d;

    /* renamed from: e */
    public final ViewGroup f324698e;

    /* renamed from: f */
    public C108210m f324699f;

    /* renamed from: g */
    public final Context f324700g;

    /* renamed from: h */
    public ImageReader f324701h;

    /* renamed from: i */
    public final HandlerThread f324702i = C97749e.m126093a("RecordTemplate-Use", -2);

    /* renamed from: j */
    public boolean f324703j;

    /* renamed from: n */
    public C108436b f324704n;

    /* renamed from: o */
    public RecordConfigProvider f324705o;

    /* renamed from: p */
    public MJCaptureOptions f324706p;

    /* renamed from: q */
    public String f324707q;

    /* renamed from: r */
    public String f324708r;

    /* renamed from: s */
    public C53953u0<Boolean> f324709s;

    /* renamed from: t */
    public C53973z1 f324710t;

    /* renamed from: u */
    public C108453k f324711u = new C108453k((DimensionLevel) null, (C107261i) null, 0, 0, 0, 31, (C8480h) null);

    /* renamed from: v */
    public final C13601g f324712v = C36568h.m40985a(new C60257b(this));

    /* renamed from: w */
    public final C13601g f324713w = C36568h.m40985a(new C60259f(this));

    /* renamed from: x */
    public C87684j f324714x = new C87684j();

    /* renamed from: y */
    public C108454m f324715y = new C108454m(0, 0, 0, 0, 15, (C8480h) null);

    /* renamed from: z */
    public C87684j f324716z = new C87684j();

    /* renamed from: ia0.c$b */
    public static final class C60257b extends C87413o implements C32224a<C66581h> {

        /* renamed from: d */
        public final /* synthetic */ C108438c f171796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60257b(C108438c cVar) {
            super(0);
            this.f171796d = cVar;
        }

        public Object invoke() {
            Context context = this.f171796d.f324700g;
            C87412m.m108593f(context, "context");
            C66581h hVar = new C66581h(context);
            String q = C76577a.m92166q(this.f171796d.f324700g, C0966R.string.f361031lv2);
            C87412m.m108593f(q, "getString(context, R.str…plate_downloading_widget)");
            hVar.mo90633a(q);
            return hVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$onResume$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {203}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$d */
    public static final class C60258d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f171797d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f171798e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60258d(C108438c cVar, C15601d<? super C60258d> dVar) {
            super(2, dVar);
            this.f171798e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60258d(this.f171798e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60258d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f171797d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108438c cVar = this.f171798e;
                String str = cVar.f324708r;
                this.f171797d = 1;
                if (cVar.mo158987i(str, (C108400c) null, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ia0.c$f */
    public static final class C60259f extends C87413o implements C32224a<C53973z1> {

        /* renamed from: d */
        public final /* synthetic */ C108438c f171799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60259f(C108438c cVar) {
            super(0);
            this.f171799d = cVar;
        }

        public Object invoke() {
            C108438c cVar = this.f171799d;
            C53896h0 h0Var = C53872d1.f151117a;
            return BaseScopePluginLayout.m119451m(cVar.f324697d, C58901s.f168555a, (C53934p0) null, new C108451g(cVar, (C15601d<? super C108451g>) null), 2, (Object) null);
        }
    }

    /* renamed from: ia0.c$l */
    public static final class C60260l implements MJCamFunSession.OnProgress {

        /* renamed from: a */
        public final /* synthetic */ C108438c f171800a;

        public C60260l(C108438c cVar) {
            this.f171800a = cVar;
        }

        public final void onProgress(float f) {
            Log.m105918d("MicroMsg.FinderTemplateCorePlugin", "switchToTemplate onProgress:" + f);
            String string = this.f171800a.f324697d.getContext().getResources().getString(C0966R.string.f361032lv3, new Object[]{Integer.valueOf(C60641c.m70921b(f * ((float) 100)))});
            C87412m.m108593f(string, "pluginLayout.context.res…ToInt()\n                )");
            ((C66581h) ((C36570n) this.f171800a.f324712v).getValue()).mo90633a(string);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$toggleLoading$2", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$m */
    public static final class C60261m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ boolean f171801d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f171802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60261m(boolean z, C108438c cVar, C15601d<? super C60261m> dVar) {
            super(2, dVar);
            this.f171801d = z;
            this.f171802e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60261m(this.f171801d, this.f171802e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60261m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f171801d) {
                String q = C76577a.m92166q(this.f171802e.f324700g, C0966R.string.f361031lv2);
                C87412m.m108593f(q, "getString(context, R.str…plate_downloading_widget)");
                ((C66581h) ((C36570n) this.f171802e.f324712v).getValue()).mo90633a(q);
                ((C66581h) ((C36570n) this.f171802e.f324712v).getValue()).show();
            } else {
                ((C66581h) ((C36570n) this.f171802e.f324712v).getValue()).dismiss();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {140}, mo125471m = "awaitSetup")
    /* renamed from: ia0.c$a */
    public static final class C108439a extends C66704d {

        /* renamed from: d */
        public Object f324717d;

        /* renamed from: e */
        public /* synthetic */ Object f324718e;

        /* renamed from: f */
        public final /* synthetic */ C108438c f324719f;

        /* renamed from: g */
        public int f324720g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108439a(C108438c cVar, C15601d<? super C108439a> dVar) {
            super(dVar);
            this.f324719f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324718e = obj;
            this.f324720g |= Integer.MIN_VALUE;
            return this.f324719f.mo158981b(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$onPause$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {191}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$c */
    public static final class C108440c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324721d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f324722e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108440c(C108438c cVar, C15601d<? super C108440c> dVar) {
            super(2, dVar);
            this.f324722e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108440c(this.f324722e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108440c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324721d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "onPause switchToEmptyTemplate");
                C108438c cVar = this.f324722e;
                cVar.f324708r = cVar.f324707q;
                cVar.f324707q = null;
                C108210m mVar = cVar.f324699f;
                if (mVar != null) {
                    this.f324721d = 1;
                    obj = C108203i.m146548a("1005", new C108218r(mVar), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MJCaptureOptions mJCaptureOptions = (MJCaptureOptions) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$release$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {603}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$e */
    public static final class C108441e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324723d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f324724e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108441e(C108438c cVar, C15601d<? super C108441e> dVar) {
            super(2, dVar);
            this.f324724e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108441e(this.f324724e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108441e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324723d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "release");
                C108221t.f324032a.getClass();
                C108221t.f324043l = null;
                C108210m mVar = this.f324724e.f324699f;
                if (mVar != null) {
                    this.f324723d = 1;
                    Log.m105924i("MicroMsg.CamFunSessionManager", "release");
                    Object b = C108238y0.m146563b("1009", new C108202h(new C108208l(mVar)), this);
                    if (b != aVar) {
                        b = C13598b0.f38549a;
                    }
                    if (b == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "MaasManager release");
            C108221t.f324032a.mo158632l();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {441}, mo125471m = "startRecord")
    /* renamed from: ia0.c$g */
    public static final class C108442g extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f324725d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f324726e;

        /* renamed from: f */
        public int f324727f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108442g(C108438c cVar, C15601d<? super C108442g> dVar) {
            super(dVar);
            this.f324726e = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324725d = obj;
            this.f324727f |= Integer.MIN_VALUE;
            return this.f324726e.mo158984f((MJAuditCaptureSettings) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$startRecord$2", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {424}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$h */
    public static final class C108443h extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f324728d;

        /* renamed from: e */
        public final /* synthetic */ C108438c f324729e;

        /* renamed from: f */
        public final /* synthetic */ MJAuditCaptureSettings f324730f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108443h(C108438c cVar, MJAuditCaptureSettings mJAuditCaptureSettings, C15601d<? super C108443h> dVar) {
            super(2, dVar);
            this.f324729e = cVar;
            this.f324730f = mJAuditCaptureSettings;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108443h(this.f324729e, this.f324730f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108443h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f324728d
                r4 = 1
                java.lang.String r5 = "MicroMsg.FinderTemplateCorePlugin"
                if (r2 == 0) goto L_0x001b
                if (r2 != r4) goto L_0x0013
                kotlin.ResultKt.throwOnFailure(r17)
                r2 = r17
                goto L_0x0085
            L_0x0013:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r17)
                hi2.e r2 = hi2.C32925e.f89499a
                r6 = 3
                r7 = 0
                java.lang.String r2 = hi2.C32925e.m39859d(r2, r7, r7, r6, r7)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "startToRecord save path:"
                r6.append(r8)
                r6.append(r2)
                java.lang.String r8 = ", needAudio:"
                r6.append(r8)
                ia0.c r8 = r0.f324729e
                com.tencent.maas.camerafun.MJCaptureOptions r8 = r8.f324706p
                if (r8 == 0) goto L_0x0046
                boolean r7 = r8.isAudioEnabled()
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            L_0x0046:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                ia0.c r6 = r0.f324729e
                ha0.m r7 = r6.f324699f
                if (r7 == 0) goto L_0x008c
                com.tencent.maas.instamovie.MJRecordingSettings r15 = new com.tencent.maas.instamovie.MJRecordingSettings
                com.tencent.maas.instamovie.mediafoundation.VideoCodecId r9 = com.tencent.maas.instamovie.mediafoundation.VideoCodecId.H264
                com.tencent.maas.instamovie.mediafoundation.AudioCodecId r10 = com.tencent.maas.instamovie.mediafoundation.AudioCodecId.MPEG4AAC
                com.tencent.maas.instamovie.mediafoundation.MediaContainerType r11 = com.tencent.maas.instamovie.mediafoundation.MediaContainerType.MP4
                ia0.k r6 = r6.f324711u
                com.tencent.maas.instamovie.mediafoundation.DimensionLevel r12 = r6.f324763a
                int r13 = r6.f324765c
                int r14 = r6.f324766d
                int r6 = r6.f324767e
                r8 = r15
                r3 = r15
                r15 = r6
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                com.tencent.maas.camerafun.MJAuditCaptureSettings r6 = r0.f324730f
                r0.f324728d = r4
                ha0.o r8 = new ha0.o
                r8.<init>(r7, r2, r3, r6)
                ha0.h r2 = new ha0.h
                r2.<init>(r8)
                java.lang.String r3 = "1006"
                java.lang.Object r2 = ha0.C108238y0.m146563b(r3, r2, r0)
                if (r2 != r1) goto L_0x0085
                return r1
            L_0x0085:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r1 = r2.booleanValue()
                goto L_0x008d
            L_0x008c:
                r1 = 0
            L_0x008d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "startToRecord result:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                ia0.c r2 = r0.f324729e
                com.tencent.maas.camerafun.MJCaptureOptions r2 = r2.f324706p
                if (r2 == 0) goto L_0x00af
                boolean r2 = r2.isAudioEnabled()
                if (r2 != r4) goto L_0x00af
                r2 = 1
                goto L_0x00b0
            L_0x00af:
                r2 = 0
            L_0x00b0:
                if (r2 == 0) goto L_0x00f8
                ia0.c r2 = r0.f324729e
                boolean r3 = r2.f324703j
                if (r3 == 0) goto L_0x00b9
                goto L_0x00f8
            L_0x00b9:
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r2.f324705o
                if (r3 != 0) goto L_0x00be
                goto L_0x00f8
            L_0x00be:
                ia0.a r6 = new ia0.a
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f272926n
                int r7 = r3.f267174o
                int r3 = r3.f267175p
                r6.<init>(r7, r3)
                ia0.b r3 = new ia0.b
                r3.<init>(r6)
                r2.f324704n = r3
                ia0.i r6 = new ia0.i
                r6.<init>(r2)
                r3.f324693d = r6
                qh.f r2 = r3.f324692c
                boolean r2 = r2.mo161906k()
                java.lang.String r3 = r3.f324691b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "start ret:"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                java.lang.String r2 = "startAudioRecord"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            L_0x00f8:
                ia0.c r2 = r0.f324729e
                com.tencent.maas.camerafun.MJCaptureOptions r2 = r2.f324706p
                if (r2 == 0) goto L_0x0102
                if (r1 == 0) goto L_0x0102
                r3 = 1
                goto L_0x0103
            L_0x0102:
                r3 = 0
            L_0x0103:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.C108443h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {447, 450}, mo125471m = "stopRecord")
    /* renamed from: ia0.c$i */
    public static final class C108444i extends C66704d {

        /* renamed from: d */
        public Object f324731d;

        /* renamed from: e */
        public /* synthetic */ Object f324732e;

        /* renamed from: f */
        public final /* synthetic */ C108438c f324733f;

        /* renamed from: g */
        public int f324734g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108444i(C108438c cVar, C15601d<? super C108444i> dVar) {
            super(dVar);
            this.f324733f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324732e = obj;
            this.f324734g |= Integer.MIN_VALUE;
            return this.f324733f.mo158985g(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {393, 397, 405}, mo125471m = "switchEmptyTemplate")
    /* renamed from: ia0.c$j */
    public static final class C108445j extends C66704d {

        /* renamed from: d */
        public Object f324735d;

        /* renamed from: e */
        public /* synthetic */ Object f324736e;

        /* renamed from: f */
        public final /* synthetic */ C108438c f324737f;

        /* renamed from: g */
        public int f324738g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108445j(C108438c cVar, C15601d<? super C108445j> dVar) {
            super(dVar);
            this.f324737f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324736e = obj;
            this.f324738g |= Integer.MIN_VALUE;
            return this.f324737f.mo158986h(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {298, 301, 302, 303, 311, 328, 330, 333}, mo125471m = "switchToTemplate")
    /* renamed from: ia0.c$k */
    public static final class C108446k extends C66704d {

        /* renamed from: d */
        public Object f324739d;

        /* renamed from: e */
        public Object f324740e;

        /* renamed from: f */
        public Object f324741f;

        /* renamed from: g */
        public /* synthetic */ Object f324742g;

        /* renamed from: h */
        public final /* synthetic */ C108438c f324743h;

        /* renamed from: i */
        public int f324744i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108446k(C108438c cVar, C15601d<? super C108446k> dVar) {
            super(dVar);
            this.f324743h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324742g = obj;
            this.f324744i |= Integer.MIN_VALUE;
            return this.f324743h.mo158987i((String) null, (C108400c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {378, 381}, mo125471m = "toggleTemplateShow")
    /* renamed from: ia0.c$n */
    public static final class C108447n extends C66704d {

        /* renamed from: d */
        public Object f324745d;

        /* renamed from: e */
        public boolean f324746e;

        /* renamed from: f */
        public /* synthetic */ Object f324747f;

        /* renamed from: g */
        public final /* synthetic */ C108438c f324748g;

        /* renamed from: h */
        public int f324749h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108447n(C108438c cVar, C15601d<? super C108447n> dVar) {
            super(dVar);
            this.f324748g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324747f = obj;
            this.f324749h |= Integer.MIN_VALUE;
            return this.f324748g.mo158989k(false, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$toggleTemplateShow$2", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ia0.c$o */
    public static final class C108448o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C108438c f324750d;

        /* renamed from: e */
        public final /* synthetic */ boolean f324751e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108448o(C108438c cVar, boolean z, C15601d<? super C108448o> dVar) {
            super(2, dVar);
            this.f324750d = cVar;
            this.f324751e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108448o(this.f324750d, this.f324751e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108448o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f324750d.f324698e.setVisibility(this.f324751e ? 0 : 4);
            return C13598b0.f38549a;
        }
    }

    public C108438c(BaseScopePluginLayout baseScopePluginLayout, ViewGroup viewGroup) {
        C87412m.m108594g(baseScopePluginLayout, "pluginLayout");
        C87412m.m108594g(viewGroup, "templateLayout");
        this.f324697d = baseScopePluginLayout;
        this.f324698e = viewGroup;
        this.f324700g = baseScopePluginLayout.getContext();
        int i = C58834h.f168432b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        r0 = r10.getMaxRecordingDuration();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m146935a(ia0.C108438c r9, wx3.C15601d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof ia0.C108449e
            if (r0 == 0) goto L_0x0016
            r0 = r10
            ia0.e r0 = (ia0.C108449e) r0
            int r1 = r0.f324755g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f324755g = r1
            goto L_0x001b
        L_0x0016:
            ia0.e r0 = new ia0.e
            r0.<init>(r9, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f324753e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324755g
            java.lang.String r3 = "MicroMsg.FinderTemplateCorePlugin"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r9 = r0.f324752d
            ia0.c r9 = (ia0.C108438c) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00cc
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            java.lang.Object r9 = r0.f324752d
            ia0.c r9 = (ia0.C108438c) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0062
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = "prepareMaas"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            ia0.f r2 = new ia0.f
            r2.<init>(r9, r6)
            r0.f324752d = r9
            r0.f324755g = r5
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x0062
            goto L_0x0130
        L_0x0062:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x006e
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0130
        L_0x006e:
            ha0.m r10 = r9.f324699f
            if (r10 == 0) goto L_0x00cf
            r0.f324752d = r9
            r0.f324755g = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "maas_"
            r2.append(r4)
            int r4 = r10.hashCode()
            r2.append(r4)
            r4 = 95
            r2.append(r4)
            long r7 = java.lang.System.currentTimeMillis()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "value"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "setSessionKey "
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = ", field: "
            r4.append(r7)
            java.lang.String r7 = ja0.C60781a.f173118a
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            ja0.C60781a.f173118a = r2
            ha0.n r2 = new ha0.n
            r2.<init>(r10)
            java.lang.String r10 = "1000"
            java.lang.Object r10 = ha0.C108203i.m146548a(r10, r2, r0)
            if (r10 != r1) goto L_0x00cc
            goto L_0x0130
        L_0x00cc:
            com.tencent.maas.camerafun.MJCaptureOptions r10 = (com.tencent.maas.camerafun.MJCaptureOptions) r10
            goto L_0x00d0
        L_0x00cf:
            r10 = r6
        L_0x00d0:
            android.os.HandlerThread r9 = r9.f324702i
            r9.start()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "start camera session finished, success:"
            r9.append(r0)
            if (r10 == 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r5 = 0
        L_0x00e3:
            r9.append(r5)
            java.lang.String r0 = ", maxRecordingDuration:"
            r9.append(r0)
            if (r10 == 0) goto L_0x00fd
            com.tencent.maas.model.time.MJTime r0 = r10.getMaxRecordingDuration()
            if (r0 == 0) goto L_0x00fd
            double r0 = r0.toMilliseconds()
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
            goto L_0x00fe
        L_0x00fd:
            r2 = r6
        L_0x00fe:
            r9.append(r2)
            java.lang.String r0 = ", audioEnable:"
            r9.append(r0)
            if (r10 == 0) goto L_0x0111
            boolean r0 = r10.isAudioEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0112
        L_0x0111:
            r0 = r6
        L_0x0112:
            r9.append(r0)
            java.lang.String r0 = ", frontCamera:"
            r9.append(r0)
            if (r10 == 0) goto L_0x0124
            boolean r10 = r10.isUseFrontCamera()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
        L_0x0124:
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.m146935a(ia0.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158981b(wx3.C15601d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ia0.C108438c.C108439a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ia0.c$a r0 = (ia0.C108438c.C108439a) r0
            int r1 = r0.f324720g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324720g = r1
            goto L_0x0018
        L_0x0013:
            ia0.c$a r0 = new ia0.c$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f324718e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324720g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f324717d
            ia0.c r0 = (ia0.C108438c) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0050
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            a14.z1 r5 = r4.mo158983d()
            boolean r5 = r5.mo74466a()
            if (r5 == 0) goto L_0x004f
            a14.z1 r5 = r4.mo158983d()
            r0.f324717d = r4
            r0.f324720g = r3
            java.lang.Object r5 = r5.mo74521O(r0)
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0 = r4
        L_0x0050:
            a14.z1 r5 = r0.mo158983d()
            boolean r5 = r5.isCancelled()
            if (r5 == 0) goto L_0x0091
            a14.z1 r5 = r0.mo158983d()
            java.util.concurrent.CancellationException r5 = r5.mo74526Z()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setup failed:"
            r0.append(r1)
            r0.append(r5)
            r1 = 32
            r0.append(r1)
            java.lang.Throwable r2 = r5.getCause()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.FinderTemplateCorePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0091:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158981b(wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo158982c() {
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "closeImageReader:" + this.f324701h);
        ImageReader imageReader = this.f324701h;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f324701h = null;
    }

    /* renamed from: d */
    public final C53973z1 mo158983d() {
        return (C53973z1) ((C36570n) this.f324713w).getValue();
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158984f(com.tencent.maas.camerafun.MJAuditCaptureSettings r6, wx3.C15601d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ia0.C108438c.C108442g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ia0.c$g r0 = (ia0.C108438c.C108442g) r0
            int r1 = r0.f324727f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324727f = r1
            goto L_0x0018
        L_0x0013:
            ia0.c$g r0 = new ia0.c$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f324725d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324727f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0054
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout r7 = r5.f324697d
            ia0.c$h r2 = new ia0.c$h
            r4 = 0
            r2.<init>(r5, r6, r4)
            int r6 = com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout.f272974i
            wx3.g r6 = wx3.C66217g.f190253d
            a14.p0 r4 = a14.C53934p0.DEFAULT
            r7.getClass()
            a14.n0 r7 = r7.f272975h
            a14.u0 r6 = a14.C53895h.m60463a(r7, r6, r4, r2)
            r5.f324709s = r6
            r0.f324727f = r3
            java.lang.Object r7 = r6.mo74634A(r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158984f(com.tencent.maas.camerafun.MJAuditCaptureSettings, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158985g(wx3.C15601d<? super ia0.C60263l> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ia0.C108438c.C108444i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ia0.c$i r0 = (ia0.C108438c.C108444i) r0
            int r1 = r0.f324734g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324734g = r1
            goto L_0x0018
        L_0x0013:
            ia0.c$i r0 = new ia0.c$i
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f324732e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324734g
            r3 = 2
            java.lang.String r4 = "MicroMsg.FinderTemplateCorePlugin"
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r6) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.f324731d
            ia0.c r0 = (ia0.C108438c) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00cf
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003b:
            java.lang.Object r2 = r0.f324731d
            ia0.c r2 = (ia0.C108438c) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x007f
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "stopRecord start, currentCaptureOption:"
            r12.append(r2)
            com.tencent.maas.camerafun.MJCaptureOptions r2 = r11.f324706p
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            a14.u0<java.lang.Boolean> r12 = r11.f324709s
            if (r12 == 0) goto L_0x006a
            a14.a r12 = (a14.C53851a) r12
            boolean r12 = r12.mo74466a()
            if (r12 != r6) goto L_0x006a
            r12 = 1
            goto L_0x006b
        L_0x006a:
            r12 = 0
        L_0x006b:
            if (r12 == 0) goto L_0x007e
            a14.u0<java.lang.Boolean> r12 = r11.f324709s
            if (r12 == 0) goto L_0x007e
            r0.f324731d = r11
            r0.f324734g = r6
            a14.f2 r12 = (a14.C53884f2) r12
            java.lang.Object r12 = r12.mo74521O(r0)
            if (r12 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r2 = r11
        L_0x007f:
            boolean r12 = r2.f324703j
            if (r12 == 0) goto L_0x0084
            goto L_0x00b8
        L_0x0084:
            ia0.b r12 = r2.f324704n
            if (r12 == 0) goto L_0x00a6
            qh.f r6 = r12.f324692c
            boolean r6 = r6.mo161907l()
            java.lang.String r8 = r12.f324691b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "stop ret:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            r12.f324693d = r5
        L_0x00a6:
            r2.f324704n = r5
            ia0.j r12 = r2.f324716z
            java.util.ArrayList<java.nio.ByteBuffer> r6 = r12.f253964a
            r6.clear()
            r12.f253965b = r7
            r2.f324695A = r5
            java.lang.String r12 = "stopAudioRecord"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x00b8:
            ha0.m r12 = r2.f324699f
            if (r12 == 0) goto L_0x00d3
            r0.f324731d = r2
            r0.f324734g = r3
            ha0.q r6 = new ha0.q
            r6.<init>(r12)
            java.lang.String r12 = "1007"
            java.lang.Object r12 = ha0.C108203i.m146548a(r12, r6, r0)
            if (r12 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r0 = r2
        L_0x00cf:
            com.tencent.maas.camerafun.MJRecordingFinishInfo r12 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r12
            r2 = r0
            goto L_0x00d4
        L_0x00d3:
            r12 = r5
        L_0x00d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopRecord result path:"
            r0.append(r1)
            if (r12 == 0) goto L_0x00e5
            java.lang.String r1 = r12.getOutputFilePath()
            goto L_0x00e6
        L_0x00e5:
            r1 = r5
        L_0x00e6:
            r0.append(r1)
            java.lang.String r1 = " duration:"
            r0.append(r1)
            if (r12 == 0) goto L_0x0100
            com.tencent.maas.model.time.MJTime r1 = r12.getRecordingDuration()
            if (r1 == 0) goto L_0x0100
            double r8 = r1.toMilliseconds()
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r8)
            goto L_0x0101
        L_0x0100:
            r1 = r5
        L_0x0101:
            r0.append(r1)
            java.lang.String r1 = " originalImageSeqDirPath:"
            r0.append(r1)
            if (r12 == 0) goto L_0x0110
            java.lang.String r1 = r12.getOriginalImageSeqDirPath()
            goto L_0x0111
        L_0x0110:
            r1 = r5
        L_0x0111:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.getClass()
            r8 = 0
            long r0 = r0 - r8
            r6 = -4
            r8 = 2000(0x7d0, double:9.88E-321)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0137
            java.lang.String r12 = "stopRecord cost time not enough"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            ia0.l r12 = new ia0.l
            r12.<init>(r6, r5, r5)
            return r12
        L_0x0137:
            if (r12 == 0) goto L_0x013e
            java.lang.String r0 = r12.getOutputFilePath()
            goto L_0x013f
        L_0x013e:
            r0 = r5
        L_0x013f:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x023e
            qw1.k r0 = qw1.C63342k.f179710a
            if (r12 == 0) goto L_0x014e
            java.lang.String r1 = r12.getOutputFilePath()
            goto L_0x014f
        L_0x014e:
            r1 = r5
        L_0x014f:
            com.tencent.mm.plugin.sight.base.a r0 = r0.mo88239a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "export video info:"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            int r0 = r0.f273443a
            long r0 = (long) r0
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0179
            java.lang.String r12 = "stopRecord file duration not enough"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            ia0.l r12 = new ia0.l
            r12.<init>(r6, r5, r5)
            return r12
        L_0x0179:
            ia0.l r0 = new ia0.l
            if (r12 == 0) goto L_0x0182
            java.lang.String r1 = r12.getOutputFilePath()
            goto L_0x0183
        L_0x0182:
            r1 = r5
        L_0x0183:
            gy3.C87412m.m108591d(r12)
            com.tencent.maas.camerafun.MJCaptureOptions r6 = r2.f324706p
            if (r6 != 0) goto L_0x018c
            goto L_0x023a
        L_0x018c:
            te3.ap1 r5 = new te3.ap1
            r5.<init>()
            r5.f182116e = r3
            java.lang.String r3 = r2.f324707q
            r5.f182115d = r3
            r3 = 1011000(0xf6d38, float:1.416713E-39)
            r5.f182117f = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "templateName:"
            r3.append(r6)
            java.lang.String r2 = r2.f324707q
            r3.append(r2)
            java.lang.String r2 = " sdk_version:"
            r3.append(r2)
            int r2 = r5.f182117f
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            te3.gz3 r2 = new te3.gz3
            r2.<init>()
            java.lang.String r3 = r12.getOriginalImageSeqDirPath()
            java.lang.Iterable r3 = com.tencent.p014mm.vfs.C86013q1.m106459t(r3, r7)
            if (r3 == 0) goto L_0x021e
            java.util.Iterator r3 = r3.iterator()
        L_0x01cf:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x021e
            java.lang.Object r6 = r3.next()
            com.tencent.mm.vfs.b0 r6 = (com.tencent.p014mm.vfs.C86001b0) r6
            java.lang.String r8 = r6.f250471a
            java.lang.String r9 = "it.relPath"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "mjScy"
            boolean r8 = z04.C112550d0.m153801u(r8, r9, r7)
            if (r8 == 0) goto L_0x01cf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r12.getOriginalImageSeqDirPath()
            r8.append(r9)
            r9 = 47
            r8.append(r9)
            java.lang.String r6 = r6.f250472b
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.util.LinkedList<java.lang.String> r8 = r2.f134371d
            r8.add(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "frame_urls add path:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            goto L_0x01cf
        L_0x021e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "frame_urls size:"
            r12.append(r3)
            java.util.LinkedList<java.lang.String> r3 = r2.f134371d
            int r3 = r3.size()
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r5.f182122n = r2
        L_0x023a:
            r0.<init>(r7, r1, r5)
            return r0
        L_0x023e:
            r12 = -2
            ia0.l r0 = new ia0.l
            r0.<init>(r12, r5, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158985g(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158986h(wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ia0.C108438c.C108445j
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ia0.c$j r0 = (ia0.C108438c.C108445j) r0
            int r1 = r0.f324738g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324738g = r1
            goto L_0x0018
        L_0x0013:
            ia0.c$j r0 = new ia0.c$j
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f324736e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324738g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00eb
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0037:
            java.lang.Object r2 = r0.f324735d
            ia0.c r2 = (ia0.C108438c) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0080
        L_0x003f:
            java.lang.Object r2 = r0.f324735d
            ia0.c r2 = (ia0.C108438c) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x005c
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r11)
            r10.f324707q = r6
            r10.f324708r = r6
            r10.f324706p = r6
            r0.f324735d = r10
            r0.f324738g = r5
            java.lang.Object r11 = r10.mo158981b(r0)
            if (r11 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r10
        L_0x005c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x0067
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x0067:
            r2.getClass()
            ha0.m r11 = r2.f324699f
            if (r11 == 0) goto L_0x0083
            r0.f324735d = r2
            r0.f324738g = r4
            ha0.r r4 = new ha0.r
            r4.<init>(r11)
            java.lang.String r11 = "1005"
            java.lang.Object r11 = ha0.C108203i.m146548a(r11, r4, r0)
            if (r11 != r1) goto L_0x0080
            return r1
        L_0x0080:
            com.tencent.maas.camerafun.MJCaptureOptions r11 = (com.tencent.maas.camerafun.MJCaptureOptions) r11
            goto L_0x0084
        L_0x0083:
            r11 = r6
        L_0x0084:
            r2.mo158982c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "switchEmptyTemplate result,isAudioEnabled:["
            r4.append(r7)
            if (r11 == 0) goto L_0x009c
            boolean r7 = r11.isAudioEnabled()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x009d
        L_0x009c:
            r7 = r6
        L_0x009d:
            r4.append(r7)
            java.lang.String r7 = "] isUseFrontCamera:["
            r4.append(r7)
            if (r11 == 0) goto L_0x00b0
            boolean r7 = r11.isUseFrontCamera()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x00b1
        L_0x00b0:
            r7 = r6
        L_0x00b1:
            r4.append(r7)
            java.lang.String r7 = "]  maxRecordingDuration:["
            r4.append(r7)
            if (r11 == 0) goto L_0x00cb
            com.tencent.maas.model.time.MJTime r7 = r11.getMaxRecordingDuration()
            if (r7 == 0) goto L_0x00cb
            double r7 = r7.toMilliseconds()
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r7)
            goto L_0x00cc
        L_0x00cb:
            r9 = r6
        L_0x00cc:
            r4.append(r9)
            r7 = 93
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.FinderTemplateCorePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            if (r11 == 0) goto L_0x00ee
            r11 = 0
            r0.f324735d = r6
            r0.f324738g = r3
            java.lang.Object r11 = r2.mo158989k(r11, r5, r0)
            if (r11 != r1) goto L_0x00eb
            return r1
        L_0x00eb:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x00ee:
            java.lang.String r11 = "switchEmptyTemplate happen error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158986h(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bb, code lost:
        if (r12.f324706p == null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bd, code lost:
        r0 = r12.f324701h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bf, code lost:
        if (r0 == null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c1, code lost:
        r1 = r0.getSurface();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c8, code lost:
        if (r1 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ca, code lost:
        r0 = r12.f324706p;
        gy3.C87412m.m108591d(r0);
        r0 = r0.isUseFrontCamera();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d3, code lost:
        if (r5 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d5, code lost:
        r3.f324739d = r12;
        r3.f324740e = r1;
        r3.f324741f = null;
        r3.f324744i = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e4, code lost:
        if (r5.mo148278n(!r0, r3) != r4) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e7, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e8, code lost:
        r3.f324739d = r5;
        r3.f324740e = r1;
        r3.f324741f = null;
        r3.f324744i = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f6, code lost:
        if (r5.mo158988j(false, r3) != r4) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f8, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f9, code lost:
        if (r1 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02fb, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "switch to template error");
        r0 = r5.f324700g.getString(com.tencent.p014mm.C0966R.string.aui);
        gy3.C87412m.m108593f(r0, "context.getString(R.stri….can_not_switch_template)");
        r3.f324739d = r1;
        r3.f324740e = null;
        r3.f324744i = 8;
        r2 = a14.C53872d1.f151117a;
        r0 = a14.C53895h.m60469g(f14.C58901s.f168555a, new ia0.C60262h(r5, r0, (wx3.C15601d<? super ia0.C60262h>) null), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0321, code lost:
        if (r0 != r4) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0324, code lost:
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0326, code lost:
        if (r0 != r4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0328, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        r5 = r12.f324714x;
        r5.f253964a.clear();
        r5.f253965b = 0;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "start switchToTemplate: " + r1);
        r3.f324739d = r12;
        r3.f324740e = r1;
        r3.f324741f = r2;
        r3.f324744i = 2;
        r5 = r12.mo158981b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0111, code lost:
        if (r5 != r4) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0114, code lost:
        r21 = r12;
        r12 = r1;
        r1 = r21;
        r22 = r5;
        r5 = r2;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0124, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0126, code lost:
        r3.f324739d = r1;
        r3.f324740e = null;
        r3.f324741f = null;
        r3.f324744i = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0133, code lost:
        if (r1.mo158988j(false, r3) != r4) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0135, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0136, code lost:
        r2 = r1.f324700g.getString(com.tencent.p014mm.C0966R.string.aui);
        gy3.C87412m.m108593f(r2, "context.getString(R.stri….can_not_switch_template)");
        r3.f324739d = null;
        r3.f324744i = 4;
        r5 = a14.C53872d1.f151117a;
        r1 = a14.C53895h.m60469g(f14.C58901s.f168555a, new ia0.C60262h(r1, r2, (wx3.C15601d<? super ia0.C60262h>) null), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0151, code lost:
        if (r1 != r4) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0154, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0156, code lost:
        if (r1 != r4) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0158, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0159, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "start switchToTemplate cameraUsage:" + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016e, code lost:
        if (r5 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0170, code lost:
        r2 = r1.f324711u.f324764b;
        r13 = r2.f320920a;
        r2 = r2.f320921b;
        r14 = r1.f324701h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
        if (r14 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0180, code lost:
        if (r14.getWidth() != r13) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0182, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0184, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0185, code lost:
        if (r14 == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        r14 = r1.f324701h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        if (r14 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018f, code lost:
        if (r14.getHeight() != r2) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0191, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0194, code lost:
        if (r14 != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0196, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "recreate imageReader:[" + r13 + ',' + r2 + ']');
        r14 = r1.f324701h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b9, code lost:
        if (r14 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bb, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
        r2 = android.media.ImageReader.newInstance(r13, r2, 1, 1);
        r1.f324701h = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c4, code lost:
        if (r2 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c6, code lost:
        r2.setOnImageAvailableListener(r1, new android.os.Handler(r1.f324702i.getLooper()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d4, code lost:
        r1.getClass();
        r2 = r1.f324699f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        if (r2 == null) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01db, code lost:
        r13 = new ia0.C108438c.C60260l(r1);
        r3.f324739d = r1;
        r3.f324740e = r5;
        r3.f324741f = r1;
        r3.f324744i = 5;
        r14 = new ha0.C108219s(r2, r12, r13);
        r2 = new a14.C53921m(xx3.C66447b.m78392b(r3), 1);
        r2.mo74609p();
        r12 = java.lang.System.currentTimeMillis();
        r8 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) r14.invoke(ha0.C108197e.f323983a, new ha0.C108199f(r2, "1003", r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0211, code lost:
        if (r8.error == null) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0217, code lost:
        if (r2.mo74597a() == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0219, code lost:
        r14 = ja0.C108679b.f325464a;
        r15 = r8.error;
        gy3.C87412m.m108593f(r15, "task.error");
        r10 = r1;
        r14.mo159694a("1003", r15, java.lang.System.currentTimeMillis() - r12);
        r2.resumeWith(kotlin.Result.m168114constructorimpl((java.lang.Object) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0234, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0235, code lost:
        r2.mo74599v(new ha0.C108192d("1003", r12, (fy3.C32226l<? super com.tencent.maas.instamovie.MJAsyncTaskInfo, rx3.C13598b0>) null, r8));
        r2 = r2.mo74608o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0248, code lost:
        if (r2 != r4) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x024b, code lost:
        r1 = r10;
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024d, code lost:
        r2 = (com.tencent.maas.camerafun.MJCaptureOptions) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0250, code lost:
        r10 = r1;
        r2 = null;
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0253, code lost:
        r1.f324706p = r2;
        r0 = new java.lang.StringBuilder();
        r0.append("switchToTemplate finished, success:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0261, code lost:
        if (r12.f324706p == null) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0263, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0265, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0266, code lost:
        r0.append(r1);
        r0.append(", isUseFrontCamera:");
        r1 = r12.f324706p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0270, code lost:
        if (r1 == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0272, code lost:
        r1 = java.lang.Boolean.valueOf(r1.isUseFrontCamera());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027c, code lost:
        r0.append(r1);
        r0.append(", isAudioEnabled:");
        r1 = r12.f324706p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0286, code lost:
        if (r1 == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0288, code lost:
        r1 = java.lang.Boolean.valueOf(r1.isAudioEnabled());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0291, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0292, code lost:
        r0.append(r1);
        r0.append(", maxRecordingDuration:");
        r1 = r12.f324706p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029c, code lost:
        if (r1 == null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x029e, code lost:
        r1 = r1.getMaxRecordingDuration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a2, code lost:
        if (r1 == null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a4, code lost:
        r8 = new java.lang.Double(r1.toMilliseconds());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ae, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02af, code lost:
        r0.append(r8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderTemplateCorePlugin", r0.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158987i(java.lang.String r24, i80.C108400c r25, wx3.C15601d<? super android.view.Surface> r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            boolean r3 = r2 instanceof ia0.C108438c.C108446k
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ia0.c$k r3 = (ia0.C108438c.C108446k) r3
            int r4 = r3.f324744i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f324744i = r4
            goto L_0x001e
        L_0x0019:
            ia0.c$k r3 = new ia0.c$k
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f324742g
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f324744i
            java.lang.String r6 = "context.getString(R.stri….can_not_switch_template)"
            java.lang.String r7 = "MicroMsg.FinderTemplateCorePlugin"
            r8 = 2131822946(0x7f110962, float:1.9278678E38)
            r9 = 0
            r10 = 1
            r11 = 0
            switch(r5) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x0092;
                case 2: goto L_0x007b;
                case 3: goto L_0x0072;
                case 4: goto L_0x006d;
                case 5: goto L_0x005c;
                case 6: goto L_0x004f;
                case 7: goto L_0x0042;
                case 8: goto L_0x0039;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r1 = r3.f324739d
            android.view.Surface r1 = (android.view.Surface) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0329
        L_0x0042:
            java.lang.Object r1 = r3.f324740e
            android.view.Surface r1 = (android.view.Surface) r1
            java.lang.Object r5 = r3.f324739d
            ia0.c r5 = (ia0.C108438c) r5
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02f9
        L_0x004f:
            java.lang.Object r1 = r3.f324740e
            android.view.Surface r1 = (android.view.Surface) r1
            java.lang.Object r5 = r3.f324739d
            ia0.c r5 = (ia0.C108438c) r5
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02e8
        L_0x005c:
            java.lang.Object r1 = r3.f324741f
            ia0.c r1 = (ia0.C108438c) r1
            java.lang.Object r5 = r3.f324740e
            i80.c r5 = (i80.C108400c) r5
            java.lang.Object r12 = r3.f324739d
            ia0.c r12 = (ia0.C108438c) r12
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x024d
        L_0x006d:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0159
        L_0x0072:
            java.lang.Object r1 = r3.f324739d
            ia0.c r1 = (ia0.C108438c) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0136
        L_0x007b:
            java.lang.Object r1 = r3.f324741f
            i80.c r1 = (i80.C108400c) r1
            java.lang.Object r5 = r3.f324740e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r3.f324739d
            ia0.c r12 = (ia0.C108438c) r12
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r5
            r5 = r1
            r1 = r12
            r12 = r21
            goto L_0x011e
        L_0x0092:
            java.lang.Object r1 = r3.f324741f
            i80.c r1 = (i80.C108400c) r1
            java.lang.Object r5 = r3.f324740e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r3.f324739d
            ia0.c r12 = (ia0.C108438c) r12
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            r1 = r5
            goto L_0x00e7
        L_0x00a4:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "switchToTemplate name:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            java.lang.String r2 = r0.f324707q
            boolean r2 = gy3.C87412m.m108589b(r2, r1)
            if (r2 != 0) goto L_0x032a
            if (r1 == 0) goto L_0x00ce
            int r2 = r24.length()
            if (r2 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r2 = 0
            goto L_0x00cf
        L_0x00ce:
            r2 = 1
        L_0x00cf:
            if (r2 == 0) goto L_0x00d3
            goto L_0x032a
        L_0x00d3:
            r0.f324707q = r1
            r3.f324739d = r0
            r3.f324740e = r1
            r2 = r25
            r3.f324741f = r2
            r3.f324744i = r10
            java.lang.Object r5 = r0.mo158988j(r10, r3)
            if (r5 != r4) goto L_0x00e6
            return r4
        L_0x00e6:
            r12 = r0
        L_0x00e7:
            ia0.j r5 = r12.f324714x
            java.util.ArrayList<java.nio.ByteBuffer> r13 = r5.f253964a
            r13.clear()
            r5.f253965b = r11
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "start switchToTemplate: "
            r5.append(r13)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            r3.f324739d = r12
            r3.f324740e = r1
            r3.f324741f = r2
            r5 = 2
            r3.f324744i = r5
            java.lang.Object r5 = r12.mo158981b(r3)
            if (r5 != r4) goto L_0x0114
            return r4
        L_0x0114:
            r21 = r12
            r12 = r1
            r1 = r21
            r22 = r5
            r5 = r2
            r2 = r22
        L_0x011e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x015a
            r3.f324739d = r1
            r3.f324740e = r9
            r3.f324741f = r9
            r2 = 3
            r3.f324744i = r2
            java.lang.Object r2 = r1.mo158988j(r11, r3)
            if (r2 != r4) goto L_0x0136
            return r4
        L_0x0136:
            android.content.Context r2 = r1.f324700g
            java.lang.String r2 = r2.getString(r8)
            gy3.C87412m.m108593f(r2, r6)
            r3.f324739d = r9
            r5 = 4
            r3.f324744i = r5
            a14.h0 r5 = a14.C53872d1.f151117a
            a14.k2 r5 = f14.C58901s.f168555a
            ia0.h r6 = new ia0.h
            r6.<init>(r1, r2, r9)
            java.lang.Object r1 = a14.C53895h.m60469g(r5, r6, r3)
            if (r1 != r4) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0156:
            if (r1 != r4) goto L_0x0159
            return r4
        L_0x0159:
            return r9
        L_0x015a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "start switchToTemplate cameraUsage:"
            r2.append(r13)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r5 == 0) goto L_0x01d4
            ia0.k r2 = r1.f324711u
            e80.i r2 = r2.f324764b
            int r13 = r2.f320920a
            int r2 = r2.f320921b
            android.media.ImageReader r14 = r1.f324701h
            if (r14 == 0) goto L_0x0196
            int r14 = r14.getWidth()
            if (r14 != r13) goto L_0x0184
            r14 = 1
            goto L_0x0185
        L_0x0184:
            r14 = 0
        L_0x0185:
            if (r14 == 0) goto L_0x0196
            android.media.ImageReader r14 = r1.f324701h
            if (r14 == 0) goto L_0x0193
            int r14 = r14.getHeight()
            if (r14 != r2) goto L_0x0193
            r14 = 1
            goto L_0x0194
        L_0x0193:
            r14 = 0
        L_0x0194:
            if (r14 != 0) goto L_0x01d4
        L_0x0196:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "recreate imageReader:["
            r14.append(r15)
            r14.append(r13)
            r15 = 44
            r14.append(r15)
            r14.append(r2)
            r15 = 93
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            android.media.ImageReader r14 = r1.f324701h
            if (r14 == 0) goto L_0x01be
            r14.close()
        L_0x01be:
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r13, r2, r10, r10)
            r1.f324701h = r2
            if (r2 == 0) goto L_0x01d4
            android.os.Handler r13 = new android.os.Handler
            android.os.HandlerThread r14 = r1.f324702i
            android.os.Looper r14 = r14.getLooper()
            r13.<init>(r14)
            r2.setOnImageAvailableListener(r1, r13)
        L_0x01d4:
            r1.getClass()
            ha0.m r2 = r1.f324699f
            if (r2 == 0) goto L_0x0250
            ia0.c$l r13 = new ia0.c$l
            r13.<init>(r1)
            r3.f324739d = r1
            r3.f324740e = r5
            r3.f324741f = r1
            r14 = 5
            r3.f324744i = r14
            ha0.s r14 = new ha0.s
            r14.<init>(r2, r12, r13)
            r19 = 0
            a14.m r2 = new a14.m
            wx3.d r12 = xx3.C66447b.m78392b(r3)
            r2.<init>(r12, r10)
            r2.mo74609p()
            long r12 = java.lang.System.currentTimeMillis()
            ha0.e r15 = ha0.C108197e.f323983a
            ha0.f r8 = new ha0.f
            java.lang.String r11 = "1003"
            r8.<init>(r2, r11, r12)
            java.lang.Object r8 = r14.invoke(r15, r8)
            com.tencent.maas.instamovie.MJAsyncTaskInfo r8 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) r8
            com.tencent.maas.instamovie.base.MJError r14 = r8.error
            if (r14 == 0) goto L_0x0234
            boolean r14 = r2.mo74597a()
            if (r14 == 0) goto L_0x0234
            ja0.b r14 = ja0.C108679b.f325464a
            com.tencent.maas.instamovie.base.MJError r15 = r8.error
            java.lang.String r10 = "task.error"
            gy3.C87412m.m108593f(r15, r10)
            long r16 = java.lang.System.currentTimeMillis()
            r10 = r1
            long r0 = r16 - r12
            r14.mo159694a(r11, r15, r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r9)
            r2.resumeWith(r0)
            goto L_0x0235
        L_0x0234:
            r10 = r1
        L_0x0235:
            ha0.d r0 = new ha0.d
            r15 = r0
            r16 = r11
            r17 = r12
            r20 = r8
            r15.<init>(r16, r17, r19, r20)
            r2.mo74599v(r0)
            java.lang.Object r2 = r2.mo74608o()
            if (r2 != r4) goto L_0x024b
            return r4
        L_0x024b:
            r1 = r10
            r12 = r1
        L_0x024d:
            com.tencent.maas.camerafun.MJCaptureOptions r2 = (com.tencent.maas.camerafun.MJCaptureOptions) r2
            goto L_0x0253
        L_0x0250:
            r10 = r1
            r2 = r9
            r12 = r1
        L_0x0253:
            r1.f324706p = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "switchToTemplate finished, success:"
            r0.append(r1)
            com.tencent.maas.camerafun.MJCaptureOptions r1 = r12.f324706p
            if (r1 == 0) goto L_0x0265
            r1 = 1
            goto L_0x0266
        L_0x0265:
            r1 = 0
        L_0x0266:
            r0.append(r1)
            java.lang.String r1 = ", isUseFrontCamera:"
            r0.append(r1)
            com.tencent.maas.camerafun.MJCaptureOptions r1 = r12.f324706p
            if (r1 == 0) goto L_0x027b
            boolean r1 = r1.isUseFrontCamera()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x027c
        L_0x027b:
            r1 = r9
        L_0x027c:
            r0.append(r1)
            java.lang.String r1 = ", isAudioEnabled:"
            r0.append(r1)
            com.tencent.maas.camerafun.MJCaptureOptions r1 = r12.f324706p
            if (r1 == 0) goto L_0x0291
            boolean r1 = r1.isAudioEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0292
        L_0x0291:
            r1 = r9
        L_0x0292:
            r0.append(r1)
            java.lang.String r1 = ", maxRecordingDuration:"
            r0.append(r1)
            com.tencent.maas.camerafun.MJCaptureOptions r1 = r12.f324706p
            if (r1 == 0) goto L_0x02ae
            com.tencent.maas.model.time.MJTime r1 = r1.getMaxRecordingDuration()
            if (r1 == 0) goto L_0x02ae
            double r1 = r1.toMilliseconds()
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r1)
            goto L_0x02af
        L_0x02ae:
            r8 = r9
        L_0x02af:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.maas.camerafun.MJCaptureOptions r0 = r12.f324706p
            if (r0 == 0) goto L_0x02c7
            android.media.ImageReader r0 = r12.f324701h
            if (r0 == 0) goto L_0x02c7
            android.view.Surface r0 = r0.getSurface()
            r1 = r0
            goto L_0x02c8
        L_0x02c7:
            r1 = r9
        L_0x02c8:
            if (r1 == 0) goto L_0x02e7
            com.tencent.maas.camerafun.MJCaptureOptions r0 = r12.f324706p
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.isUseFrontCamera()
            if (r5 == 0) goto L_0x02e7
            r2 = 1
            r0 = r0 ^ r2
            r3.f324739d = r12
            r3.f324740e = r1
            r3.f324741f = r9
            r2 = 6
            r3.f324744i = r2
            java.lang.Object r0 = r5.mo148278n(r0, r3)
            if (r0 != r4) goto L_0x02e7
            return r4
        L_0x02e7:
            r5 = r12
        L_0x02e8:
            r3.f324739d = r5
            r3.f324740e = r1
            r3.f324741f = r9
            r0 = 7
            r3.f324744i = r0
            r0 = 0
            java.lang.Object r0 = r5.mo158988j(r0, r3)
            if (r0 != r4) goto L_0x02f9
            return r4
        L_0x02f9:
            if (r1 != 0) goto L_0x0329
            java.lang.String r0 = "switch to template error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            android.content.Context r0 = r5.f324700g
            r2 = 2131822946(0x7f110962, float:1.9278678E38)
            java.lang.String r0 = r0.getString(r2)
            gy3.C87412m.m108593f(r0, r6)
            r3.f324739d = r1
            r3.f324740e = r9
            r2 = 8
            r3.f324744i = r2
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            ia0.h r6 = new ia0.h
            r6.<init>(r5, r0, r9)
            java.lang.Object r0 = a14.C53895h.m60469g(r2, r6, r3)
            if (r0 != r4) goto L_0x0324
            goto L_0x0326
        L_0x0324:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0326:
            if (r0 != r4) goto L_0x0329
            return r4
        L_0x0329:
            return r1
        L_0x032a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158987i(java.lang.String, i80.c, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public final Object mo158988j(boolean z, C15601d<? super C13598b0> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C60261m(z, this, (C15601d<? super C60261m>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158989k(boolean r6, boolean r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ia0.C108438c.C108447n
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ia0.c$n r0 = (ia0.C108438c.C108447n) r0
            int r1 = r0.f324749h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324749h = r1
            goto L_0x0018
        L_0x0013:
            ia0.c$n r0 = new ia0.c$n
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f324747f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324749h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008b
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            boolean r6 = r0.f324746e
            java.lang.Object r7 = r0.f324745d
            ia0.c r7 = (ia0.C108438c) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0076
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r6 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x0075
            ha0.m r7 = r5.f324699f
            if (r7 == 0) goto L_0x0075
            r0.f324745d = r5
            r0.f324746e = r6
            r0.f324749h = r4
            java.lang.String r8 = "MicroMsg.CamFunSessionManager"
            java.lang.String r2 = "awaitFirstFrame"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            a14.z1 r8 = r7.f324012b
            if (r8 == 0) goto L_0x0070
            boolean r8 = r8.mo74466a()
            if (r8 != r4) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == 0) goto L_0x0070
            a14.z1 r7 = r7.f324012b
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r7.mo74521O(r0)
            if (r7 != r1) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0072
        L_0x0070:
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0072:
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r7 = r5
        L_0x0076:
            a14.h0 r8 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            ia0.c$o r2 = new ia0.c$o
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.f324745d = r4
            r0.f324749h = r3
            java.lang.Object r6 = a14.C53895h.m60469g(r8, r2, r0)
            if (r6 != r1) goto L_0x008b
            return r1
        L_0x008b:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C108438c.mo158989k(boolean, boolean, wx3.d):java.lang.Object");
    }

    public String name() {
        return C108438c.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onImageAvailable(ImageReader imageReader) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = null;
        Image acquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("onImageAvailable start timeStamp:");
        if (acquireNextImage != null) {
            l = Long.valueOf(acquireNextImage.getTimestamp());
        }
        sb.append(l);
        Log.m105918d("MicroMsg.FinderTemplateCorePlugin", sb.toString());
        if (acquireNextImage != null) {
            try {
                if (acquireNextImage.getPlanes() != null) {
                    Image.Plane plane = acquireNextImage.getPlanes()[0];
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.position(0);
                    this.f324714x.mo122117a(acquireNextImage.getWidth() * acquireNextImage.getHeight() * plane.getPixelStride());
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    C87684j jVar = this.f324714x;
                    ArrayList<ByteBuffer> arrayList = jVar.f253964a;
                    int i = jVar.f253965b;
                    jVar.f253965b = i + 1;
                    ByteBuffer byteBuffer = arrayList.get(i % arrayList.size());
                    C87412m.m108593f(byteBuffer, "pool[index++ % pool.size]");
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.clear();
                    SightVideoJNI.nativeBufferCopy(buffer, byteBuffer2, acquireNextImage.getWidth() * pixelStride, acquireNextImage.getHeight(), rowStride - (acquireNextImage.getWidth() * pixelStride));
                    MJVideoFrame mJVideoFrame = new MJVideoFrame(acquireNextImage.getWidth(), acquireNextImage.getHeight(), acquireNextImage.getWidth() * plane.getPixelStride(), acquireNextImage.getPlanes()[0].getPixelStride(), byteBuffer2, 0, acquireNextImage.getTimestamp());
                    this.f324715y.f324768a = acquireNextImage.getWidth();
                    this.f324715y.f324769b = acquireNextImage.getHeight();
                    this.f324715y.f324770c = acquireNextImage.getWidth() * plane.getPixelStride();
                    this.f324715y.f324771d = acquireNextImage.getPlanes()[0].getPixelStride();
                    C108210m mVar = this.f324699f;
                    if (mVar != null) {
                        mVar.f324011a.sendVideoFrame(mJVideoFrame);
                    }
                    acquireNextImage.close();
                    Log.m105918d("MicroMsg.FinderTemplateCorePlugin", "onImageAvailable end cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    return;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FinderTemplateCorePlugin", e, "onImageAvailable error", new Object[0]);
            } catch (Throwable th) {
                acquireNextImage.close();
                throw th;
            }
        }
        if (acquireNextImage != null) {
            acquireNextImage.close();
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "onPause templateName:" + this.f324707q);
        if (!TextUtils.isEmpty(this.f324707q)) {
            C108440c cVar = new C108440c(this, (C15601d<? super C108440c>) null);
            C53896h0 h0Var = C53872d1.f151117a;
            BaseScopePluginLayout.m119451m(this.f324697d, C58901s.f168555a, (C53934p0) null, cVar, 2, (Object) null);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "onResume");
        String str = this.f324708r;
        if (str != null) {
            if (!(str.length() == 0) && !TextUtils.isEmpty(this.f324708r)) {
                C60258d dVar = new C60258d(this, (C15601d<? super C60258d>) null);
                C53896h0 h0Var = C53872d1.f151117a;
                BaseScopePluginLayout.m119451m(this.f324697d, C58901s.f168555a, (C53934p0) null, dVar, 2, (Object) null);
            }
        }
    }

    public void release() {
        if (!this.f324696B) {
            Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "release");
            this.f324696B = true;
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C108441e(this, (C15601d<? super C108441e>) null), 2, (Object) null);
            C87684j jVar = this.f324716z;
            jVar.f253964a.clear();
            jVar.f253965b = 0;
            C87684j jVar2 = this.f324714x;
            jVar2.f253964a.clear();
            jVar2.f253965b = 0;
            mo158982c();
            this.f324707q = null;
            this.f324706p = null;
            this.f324702i.quitSafely();
        }
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f324705o = recordConfigProvider;
        VideoTransPara videoTransPara = recordConfigProvider.f272926n;
        if (videoTransPara == null) {
            videoTransPara = C102609h.Fx0().Gu0();
        }
        int i = 30;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_template_record_fps, 30);
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "recordFps:" + Qe);
        Integer valueOf = Integer.valueOf(Qe);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        C108453k kVar = this.f324711u;
        kVar.f324766d = videoTransPara.f267173n;
        kVar.f324765c = videoTransPara.f267169g / i;
        kVar.f324767e = videoTransPara.f267172j * i;
        int i2 = videoTransPara.f267166d;
        if (i2 <= 540) {
            DimensionLevel dimensionLevel = DimensionLevel.DIMENSION_LEVEL_540;
            C87412m.m108594g(dimensionLevel, "<set-?>");
            kVar.f324763a = dimensionLevel;
            C107261i iVar = this.f324711u.f324764b;
            iVar.f320920a = TAVPlayer.VIDEO_PLAYER_WIDTH;
            iVar.f320921b = 960;
        } else if (i2 <= 720) {
            DimensionLevel dimensionLevel2 = DimensionLevel.DIMENSION_LEVEL_720;
            C87412m.m108594g(dimensionLevel2, "<set-?>");
            kVar.f324763a = dimensionLevel2;
            C107261i iVar2 = this.f324711u.f324764b;
            iVar2.f320920a = TAVExporter.VIDEO_EXPORT_WIDTH;
            iVar2.f320921b = 1280;
        } else {
            DimensionLevel dimensionLevel3 = DimensionLevel.DIMENSION_LEVEL_1080;
            C87412m.m108594g(dimensionLevel3, "<set-?>");
            kVar.f324763a = dimensionLevel3;
            C107261i iVar3 = this.f324711u.f324764b;
            iVar3.f320920a = 1080;
            iVar3.f320921b = 1920;
        }
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "outputInfo:" + this.f324711u);
        mo158983d();
        if (!recordConfigProvider.f272912M.containsKey("key_topic_id")) {
            Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "initLogic: fetch topic info");
            this.f324710t = BaseScopePluginLayout.m119451m(this.f324697d, C53872d1.f151119c, (C53934p0) null, new C46212d(this, (C15601d<? super C46212d>) null), 2, (Object) null);
        }
    }
}
