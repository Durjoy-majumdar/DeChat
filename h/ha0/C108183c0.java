package ha0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.maas.analytics.MJAnalyticsS12;
import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.instamovie.MJMovieOptions;
import com.tencent.maas.instamovie.MJMovieOutroInfo;
import com.tencent.maas.instamovie.MJMovieOutroType;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJMovieSessionState;
import com.tencent.maas.instamovie.MJRecommendOptions;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.base.asset.MJAssetIdentifierType;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.instamovie.base.asset.MJAssetMediaType;
import com.tencent.maas.instamovie.mediafoundation.FrameRate;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSCreationReportStruct;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C45252f;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60187m5;
import ht1.C60208v1;
import ja0.C108679b;
import ja0.C60781a;
import ja0.C60783d;
import ja0.C60784e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import la0.C61242a;
import org.json.JSONObject;
import p823sg.C77710q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112551y;

/* renamed from: ha0.c0 */
public final class C108183c0 {

    /* renamed from: a */
    public final MJMovieSession f323934a;

    /* renamed from: b */
    public final C61242a.C61245c f323935b;

    /* renamed from: c */
    public MJMovieOptions f323936c;

    /* renamed from: d */
    public final C13601g f323937d = C36568h.m40985a(C108184b.f323939d);

    /* renamed from: e */
    public final C0000n0 f323938e = C53930o0.m60555b();

    /* renamed from: ha0.c0$a */
    public static final class C59775a implements MJTextResolver {

        /* renamed from: a */
        public static final C59775a f170666a = new C59775a();

        public final String resolve(String str) {
            C60187m5 x402;
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode != -265713450) {
                if (hashCode == 780988929 && str.equals(MJTextResolver.KEY_DEVICE_NAME)) {
                    return "";
                }
                return null;
            } else if (!str.equals("username") || (x402 = ((C60208v1) C86312j.m106911c(C60208v1.class)).x40(C75592q0.m90778h())) == null) {
                return null;
            } else {
                return x402.mo84196w1();
            }
        }
    }

    /* renamed from: ha0.c0$d */
    public static final class C59776d extends C87413o implements C32226l<MJAsyncTaskInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f170667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59776d(C108183c0 c0Var) {
            super(1);
            this.f170667d = c0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((MJAsyncTaskInfo) obj, LocaleUtil.ITALIAN);
            C108183c0 c0Var = this.f170667d;
            C53895h.m60466d(c0Var.f323938e, (C66212f) null, (C53934p0) null, new C59792r0(c0Var, (C15601d<? super C59792r0>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ha0.c0$g */
    public static final class C59777g extends C87413o implements C32226l<MJAsyncTaskInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f170668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59777g(C108183c0 c0Var) {
            super(1);
            this.f170668d = c0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((MJAsyncTaskInfo) obj, LocaleUtil.ITALIAN);
            C108183c0 c0Var = this.f170668d;
            C53895h.m60466d(c0Var.f323938e, (C66212f) null, (C53934p0) null, new C59804v0(c0Var, (C15601d<? super C59804v0>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ha0.c0$j */
    public static final class C59778j extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f170669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59778j(C108183c0 c0Var) {
            super(1);
            this.f170669d = c0Var;
        }

        public Object invoke(Object obj) {
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
            C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
            return this.f170669d.f323934a.stopPlaying(onComplete);
        }
    }

    /* renamed from: ha0.c0$b */
    public static final class C108184b extends C87413o implements C32224a<MJMovieOutroInfo> {

        /* renamed from: d */
        public static final C108184b f323939d = new C108184b();

        public C108184b() {
            super(0);
        }

        public Object invoke() {
            return new MJMovieOutroInfo(MJMovieOutroType.Null);
        }
    }

    /* renamed from: ha0.c0$c */
    public static final class C108185c extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

        /* renamed from: d */
        public final /* synthetic */ String f323940d;

        /* renamed from: e */
        public final /* synthetic */ C108183c0 f323941e;

        /* renamed from: f */
        public final /* synthetic */ String f323942f;

        /* renamed from: g */
        public final /* synthetic */ List<MJAssetInfo> f323943g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<MJRecommendOptions.Mode> f323944h;

        /* renamed from: i */
        public final /* synthetic */ MJMovieSession.OnComplete f323945i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108185c(String str, C108183c0 c0Var, String str2, List<? extends MJAssetInfo> list, C8479f0<MJRecommendOptions.Mode> f0Var, MJMovieSession.OnComplete onComplete) {
            super(2);
            this.f323940d = str;
            this.f323941e = c0Var;
            this.f323942f = str2;
            this.f323943g = list;
            this.f323944h = f0Var;
            this.f323945i = onComplete;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
            C87412m.m108594g(onTaskProgress, "onProgress");
            C87412m.m108594g(onComplete, "onComplate");
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "startMovieCreation " + this.f323940d);
            MJMovieSession mJMovieSession = this.f323941e.f323934a;
            String str2 = this.f323940d;
            String str3 = this.f323942f;
            if (str3 != null) {
                if (str3.length() == 0) {
                    str3 = null;
                }
                str = str3;
            } else {
                str = null;
            }
            List<MJAssetInfo> list = this.f323943g;
            C108183c0 c0Var = this.f323941e;
            MJAsyncTaskInfo startMovieCreationUsingTemplate = mJMovieSession.startMovieCreationUsingTemplate(str2, str, list, c0Var.f323936c, new MJRecommendOptions((MJRecommendOptions.Mode) this.f323944h.f27484d, c0Var.f323935b.f174314a), (MJMovieOutroInfo) ((C36570n) this.f323941e.f323937d).getValue(), onTaskProgress, onComplete, this.f323945i);
            C87412m.m108593f(startMovieCreationUsingTemplate, "movieSession.startMovieC…dyProxy\n                )");
            return startMovieCreationUsingTemplate;
        }
    }

    /* renamed from: ha0.c0$e */
    public static final class C108186e implements MJMovieSession.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ long f323946a;

        /* renamed from: b */
        public final /* synthetic */ MJMovieSession.OnComplete f323947b;

        public C108186e(long j, MJMovieSession.OnComplete onComplete) {
            this.f323946a = j;
            this.f323947b = onComplete;
        }

        public final void onComplete(MJError mJError) {
            if (mJError != null) {
                Log.m105921e("MicroMsg.MaasMovieSessionManager", mJError.f154609ec + ' ' + mJError.message, new Throwable());
                C108679b.f325464a.mo159694a("203", mJError, System.currentTimeMillis() - this.f323946a);
            } else {
                C108679b.f325464a.mo159695b("203", System.currentTimeMillis() - this.f323946a);
            }
            this.f323947b.onComplete(mJError);
        }
    }

    /* renamed from: ha0.c0$f */
    public static final class C108187f extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

        /* renamed from: d */
        public final /* synthetic */ List<GalleryItem$MediaItem> f323948d;

        /* renamed from: e */
        public final /* synthetic */ boolean f323949e;

        /* renamed from: f */
        public final /* synthetic */ MJRecommendOptions.Mode f323950f;

        /* renamed from: g */
        public final /* synthetic */ C108183c0 f323951g;

        /* renamed from: h */
        public final /* synthetic */ String f323952h;

        /* renamed from: i */
        public final /* synthetic */ MJMovieSession.OnComplete f323953i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108187f(List<? extends GalleryItem$MediaItem> list, boolean z, MJRecommendOptions.Mode mode, C108183c0 c0Var, String str, MJMovieSession.OnComplete onComplete) {
            super(2);
            this.f323948d = list;
            this.f323949e = z;
            this.f323950f = mode;
            this.f323951g = c0Var;
            this.f323952h = str;
            this.f323953i = onComplete;
        }

        public Object invoke(Object obj, Object obj2) {
            MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
            C87412m.m108594g(onTaskProgress, "onProgress");
            C87412m.m108594g(onComplete, "onComplete");
            List<GalleryItem$MediaItem> list = this.f323948d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (GalleryItem$MediaItem galleryItem$MediaItem : list) {
                arrayList.add(new MJAssetInfo(MJAssetIdentifierType.Filepath, galleryItem$MediaItem.f162747d, galleryItem$MediaItem.getType() == 1 ? MJAssetMediaType.Image : MJAssetMediaType.Video));
            }
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "startMovieCreationWithBlankTemplate recommend: " + this.f323949e + ", mode:" + this.f323950f);
            C108183c0 c0Var = this.f323951g;
            MJAsyncTaskInfo startMovieCreationUsingBlankTemplate = c0Var.f323934a.startMovieCreationUsingBlankTemplate(arrayList, this.f323952h, c0Var.f323936c, new MJRecommendOptions(this.f323950f, c0Var.f323935b.f174314a), onTaskProgress, onComplete, this.f323953i);
            C87412m.m108593f(startMovieCreationUsingBlankTemplate, "movieSession.startMovieC…dyProxy\n                )");
            return startMovieCreationUsingBlankTemplate;
        }
    }

    /* renamed from: ha0.c0$h */
    public static final class C108188h implements MJMovieSession.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ long f323954a;

        /* renamed from: b */
        public final /* synthetic */ MJMovieSession.OnComplete f323955b;

        public C108188h(long j, MJMovieSession.OnComplete onComplete) {
            this.f323954a = j;
            this.f323955b = onComplete;
        }

        public final void onComplete(MJError mJError) {
            if (mJError != null) {
                Log.m105921e("MicroMsg.MaasMovieSessionManager", mJError.f154609ec + ' ' + mJError.message, new Throwable());
                C108679b.f325464a.mo159694a("203", mJError, System.currentTimeMillis() - this.f323954a);
            } else {
                C108679b.f325464a.mo159695b("203", System.currentTimeMillis() - this.f323954a);
            }
            this.f323955b.onComplete(mJError);
        }
    }

    /* renamed from: ha0.c0$i */
    public static final class C108189i extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f323956d;

        /* renamed from: e */
        public final /* synthetic */ MJTime f323957e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108189i(C108183c0 c0Var, MJTime mJTime) {
            super(1);
            this.f323956d = c0Var;
            this.f323957e = mJTime;
        }

        public Object invoke(Object obj) {
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
            C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
            return this.f323956d.f323934a.startPlaying(MJTimeRange.fromStartEnd(MJTime.ZeroTime, this.f323956d.f323934a.getPlaybackDuration()), this.f323957e, 999, true, onComplete);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasMovieSessionManager", mo125469f = "MaasMovieSessionManager.kt", mo125470l = {331}, mo125471m = "updateMovieOption")
    /* renamed from: ha0.c0$k */
    public static final class C108190k extends C66704d {

        /* renamed from: d */
        public Object f323958d;

        /* renamed from: e */
        public Object f323959e;

        /* renamed from: f */
        public /* synthetic */ Object f323960f;

        /* renamed from: g */
        public final /* synthetic */ C108183c0 f323961g;

        /* renamed from: h */
        public int f323962h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108190k(C108183c0 c0Var, C15601d<? super C108190k> dVar) {
            super(dVar);
            this.f323961g = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f323960f = obj;
            this.f323962h |= Integer.MIN_VALUE;
            return this.f323961g.mo158622l(false, false, this);
        }
    }

    /* renamed from: ha0.c0$l */
    public static final class C108191l extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f323963d;

        /* renamed from: e */
        public final /* synthetic */ MJMovieOptions f323964e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108191l(C108183c0 c0Var, MJMovieOptions mJMovieOptions) {
            super(1);
            this.f323963d = c0Var;
            this.f323964e = mJMovieOptions;
        }

        public Object invoke(Object obj) {
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
            C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
            return this.f323963d.f323934a.updateMovieOptions(this.f323964e, onComplete);
        }
    }

    public C108183c0(MJMovieSession mJMovieSession, C61242a.C61245c cVar) {
        C87412m.m108594g(mJMovieSession, "movieSession");
        C87412m.m108594g(cVar, "initialPatams");
        this.f323934a = mJMovieSession;
        this.f323935b = cVar;
        mJMovieSession.setTextResolver(C59775a.f170666a);
        this.f323936c = mo158613b(cVar.f174315b, cVar.f174316c);
    }

    /* renamed from: a */
    public static final C45252f m146536a(C108183c0 c0Var, String str, MJExportSettings mJExportSettings, boolean z) {
        C108183c0 c0Var2 = c0Var;
        String str2 = str;
        c0Var.getClass();
        if (z) {
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "retry export");
            C86009m1 m1Var = new C86009m1(str2);
            if (m1Var.mo119967g()) {
                Log.m105924i("MicroMsg.MaasMovieSessionManager", "delete previous video file");
                m1Var.mo119966f();
            }
        }
        String i = C86013q1.m106448i(str2, true);
        if (i == null) {
            i = str2;
        }
        C87412m.m108593f(i, "VFSFileOp.exportExternal…outPath, true) ?: outPath");
        C60784e eVar = C60784e.f173126a;
        MJTemplateInfo currentTemplateInfo = c0Var2.f323934a.getCurrentTemplateInfo();
        String str3 = null;
        String templateID = currentTemplateInfo != null ? currentTemplateInfo.getTemplateID() : null;
        String str4 = "";
        if (templateID == null) {
            templateID = str4;
        }
        MJMusicInfo currentMusicInfo = c0Var2.f323934a.getCurrentMusicInfo();
        if (currentMusicInfo != null) {
            str3 = currentMusicInfo.getMusicID();
        }
        if (str3 != null) {
            str4 = str3;
        }
        MJMovieOptions mJMovieOptions = c0Var2.f323936c;
        C87412m.m108594g(mJMovieOptions, "movieOption");
        C87412m.m108594g(mJExportSettings, "exportSettings");
        MaaSCreationReportStruct maaSCreationReportStruct = C60784e.f173128c;
        maaSCreationReportStruct.f156487n = maaSCreationReportStruct.mo86045b("exportTemplateId", C112551y.m153814n(templateID, ",", ";", false), true);
        MaaSCreationReportStruct maaSCreationReportStruct2 = C60784e.f173128c;
        maaSCreationReportStruct2.f156488o = maaSCreationReportStruct2.mo86045b("exportMusicId", C112551y.m153814n(str4, ",", ";", false), true);
        C60784e.f173128c.f156483j = (mJMovieOptions.isBGMMuted() ? 0 : 4) | (mJMovieOptions.isOSTMuted() ? 0 : 2) | 1;
        MaaSCreationReportStruct maaSCreationReportStruct3 = C60784e.f173128c;
        JSONObject jSONObject = new JSONObject();
        FrameRate frameRate = mJExportSettings.getFrameRate();
        C87412m.m108593f(frameRate, "frameRate");
        int typeId = frameRate.getType().getTypeId();
        jSONObject.put("f", typeId != 5 ? typeId != 8 ? 1 : 60 : 30);
        int videoBitsPerFrame = mJExportSettings.getVideoBitsPerFrame();
        FrameRate frameRate2 = mJExportSettings.getFrameRate();
        C87412m.m108593f(frameRate2, "frameRate");
        int typeId2 = frameRate2.getType().getTypeId();
        jSONObject.put("vb", videoBitsPerFrame * (typeId2 != 5 ? typeId2 != 8 ? 1 : 60 : 30));
        jSONObject.put("ab", mJExportSettings.getAverageAudioBitRate());
        jSONObject.put("maxgop", mJExportSettings.getMaxKeyframeInterval());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …val)\n        }.toString()");
        maaSCreationReportStruct3.f156489p = maaSCreationReportStruct3.mo86045b("exportParams", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        return C108238y0.m146562a(!z ? "260" : "261", new C108200f0(str, i, mJExportSettings, c0Var, System.currentTimeMillis()), new C59781h0(c0Var2));
    }

    /* renamed from: j */
    public static /* synthetic */ Object m146537j(C108183c0 c0Var, MJTime mJTime, C15601d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mJTime = MJTime.ZeroTime;
            C87412m.m108593f(mJTime, "ZeroTime");
        }
        return c0Var.mo158620i(mJTime, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0119  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.maas.instamovie.MJMovieOptions mo158613b(boolean r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            com.tencent.maas.instamovie.MJMovieOptions r13 = new com.tencent.maas.instamovie.MJMovieOptions
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_maas_enable_video_transcode_opt
            bp3.f r4 = bp3.C104160f.RepairerConfig_Maas_DisableVideoTranscodeOpt_Int
            r14 = 1
            int r0 = r0.dl0(r3, r4, r14)
            r15 = 0
            if (r0 != r14) goto L_0x001a
            r9 = 1
            goto L_0x001b
        L_0x001a:
            r9 = 0
        L_0x001b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isEnableVideoTranscodeOptimize: "
            r0.append(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.MaasAlbumTemplateGlobalConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            w80.e$a r0 = w80.C111744e.f334654d
            int r0 = r0.mo163483f()
            di3.d r4 = di3.C86312j.m106911c(r2)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_finder_maas_enable_video_transcode_dimen_limit
            java.lang.String r6 = ""
            java.lang.String r4 = r4.Y60(r5, r6)
            if (r4 == 0) goto L_0x0050
            int r5 = r4.length()
            if (r5 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r5 = 0
            goto L_0x0051
        L_0x0050:
            r5 = 1
        L_0x0051:
            r16 = 0
            if (r5 == 0) goto L_0x0058
        L_0x0055:
            r10 = r16
            goto L_0x00ba
        L_0x0058:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x00b1 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00b1 }
            int r4 = r5.length()     // Catch:{ Exception -> 0x00b1 }
            r6 = 0
        L_0x0062:
            r7 = -1
            if (r6 >= r4) goto L_0x007e
            org.json.JSONObject r8 = r5.optJSONObject(r6)     // Catch:{ Exception -> 0x00b1 }
            if (r8 != 0) goto L_0x006c
            goto L_0x007b
        L_0x006c:
            java.lang.String r10 = "rating"
            int r10 = r8.optInt(r10, r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r11 = "limit"
            int r7 = r8.optInt(r11, r7)     // Catch:{ Exception -> 0x00b1 }
            if (r10 != r0) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            int r6 = r6 + 1
            goto L_0x0062
        L_0x007e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r4.<init>()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r5 = "videoTranscodeDimensionLimit: "
            r4.append(r5)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r5 = ", gpuRating:"
            r4.append(r5)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x00b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x00b1 }
            if (r7 <= 0) goto L_0x00ad
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = y90.C38981g.f105028e     // Catch:{ Exception -> 0x00b1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00b1 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00ad
            com.tencent.maas.instamovie.mediafoundation.DimensionLevel r0 = com.tencent.maas.instamovie.mediafoundation.DimensionLevel.valueOf((int) r7)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00af
        L_0x00ad:
            r0 = r16
        L_0x00af:
            r10 = r0
            goto L_0x00ba
        L_0x00b1:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.String r5 = "parse videoTranscodeDimensionLimit error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r4)
            goto L_0x0055
        L_0x00ba:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_maas_disable_ai_analysis
            bp3.f r5 = bp3.C104160f.RepairerConfig_Maas_DisableAiAnalysis_Int
            int r0 = r0.dl0(r4, r5, r15)
            if (r0 != r14) goto L_0x00cc
            r0 = 1
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "disableAiAnalysis: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r11 = r0 ^ 1
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_maas_preproc_timeout_limit
            bp3.f r3 = bp3.C104160f.RepairerConfig_Maas_PreprocTimeoutLimit_Int
            r4 = 20
            int r0 = r0.dl0(r2, r3, r4)
            float r12 = (float) r0
            r4 = 1
            r7 = 0
            r8 = 0
            r3 = r13
            r5 = r19
            r6 = r18
            r3.<init>((boolean) r4, (boolean) r5, (boolean) r6, (boolean) r7, (float) r8, (boolean) r9, (com.tencent.maas.instamovie.mediafoundation.DimensionLevel) r10, (boolean) r11, (float) r12)
            la0.a$c r0 = r1.f323935b
            int r0 = r0.f174317d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            if (r2 <= 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r14 = 0
        L_0x010f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x011b
            r16 = r0
        L_0x011b:
            if (r16 == 0) goto L_0x0128
            int r0 = r16.intValue()
            double r2 = (double) r0
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.fromSeconds(r2)
            if (r0 != 0) goto L_0x012a
        L_0x0128:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
        L_0x012a:
            r13.setMaxDuration(r0)
            la0.a$c r0 = r1.f323935b
            boolean r0 = r0.f174318e
            r13.setShouldRetainOriginalMediaDuration(r0)
            la0.a$c r0 = r1.f323935b
            boolean r0 = r0.f174321h
            r13.setShouldAutoRecommendBGM(r0)
            la0.a$c r0 = r1.f323935b
            boolean r0 = r0.f174323j
            r13.setShouldRecommendBGMForRecommendedTemplates(r0)
            la0.a$c r0 = r1.f323935b
            int r0 = r0.f174320g
            double r2 = (double) r0
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.fromSeconds(r2)
            r13.setRetainOriginalMediaDurationThreshold(r0)
            la0.a$c r0 = r1.f323935b
            java.util.List<java.lang.String> r0 = r0.f174319f
            r13.setDefaultTemplateIDs(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108183c0.mo158613b(boolean, boolean):com.tencent.maas.instamovie.MJMovieOptions");
    }

    /* renamed from: c */
    public final String mo158614c() {
        StringBuilder sb = new StringBuilder();
        sb.append("maas_");
        C86718e b = C86709a0.m107523b();
        sb.append(C77710q.m93738a(b != null ? b.mo121110g() : 0));
        sb.append('_');
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* renamed from: d */
    public final MJAnalyticsS12.MJAnalyticsMovieSession mo158615d() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(MJAnalyticsS12.MJAnalyticsMovieSession.parseFrom(this.f323934a.getTemplateAnalysisPbData()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        return (MJAnalyticsS12.MJAnalyticsMovieSession) obj;
    }

    /* renamed from: e */
    public final boolean mo158616e() {
        return this.f323934a.getCurrentState() == MJMovieSessionState.Ready;
    }

    /* renamed from: f */
    public final void mo158617f() {
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "release");
        C108221t tVar = C108221t.f324032a;
        MJMovieSession mJMovieSession = this.f323934a;
        tVar.getClass();
        C87412m.m108594g(mJMovieSession, "movieSession");
        C108221t.f324040i = C53895h.m60466d(C108221t.f324036e, (C66212f) null, (C53934p0) null, new C108181b0(mJMovieSession, (C15601d<? super C108181b0>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public final C45252f<Float> mo158618g(String str, String str2, List<? extends GalleryItem$MediaItem> list, boolean z, MJMovieSession.OnComplete onComplete) {
        boolean z2;
        C87412m.m108594g(str, "templateId");
        C87412m.m108594g(list, "mediaInfo");
        C87412m.m108594g(onComplete, "onRecommendReady");
        String c = mo158614c();
        C87412m.m108594g(c, "value");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + c + ", field: " + C60781a.f173118a);
        C60781a.f173118a = c;
        C60784e eVar = C60784e.f173126a;
        C60784e.f173129d = C53895h.m60466d(C60784e.f173127b, (C66212f) null, (C53934p0) null, new C60783d(C60784e.f173129d, list, (C15601d<? super C60783d>) null), 3, (Object) null);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) it.next();
            arrayList.add(new MJAssetInfo(MJAssetIdentifierType.Filepath, galleryItem$MediaItem.f162747d, galleryItem$MediaItem.getType() == 1 ? MJAssetMediaType.Image : MJAssetMediaType.Video));
        }
        C108186e eVar2 = new C108186e(System.currentTimeMillis(), onComplete);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = MJRecommendOptions.Mode.Foreground;
        if (str.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            if (z) {
                f0Var.f27484d = MJRecommendOptions.Mode.Background;
            } else {
                f0Var.f27484d = MJRecommendOptions.Mode.None;
            }
        }
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "startMovieCreation: mode:" + f0Var.f27484d);
        return C108238y0.m146562a("200", new C108185c(str, this, str2, arrayList, f0Var, eVar2), new C59776d(this));
    }

    /* renamed from: h */
    public final C45252f<Float> mo158619h(List<? extends GalleryItem$MediaItem> list, String str, boolean z, MJMovieSession.OnComplete onComplete) {
        C87412m.m108594g(list, "mediaInfo");
        C87412m.m108594g(onComplete, "onRecommendReady");
        String c = mo158614c();
        C87412m.m108594g(c, "value");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + c + ", field: " + C60781a.f173118a);
        C60781a.f173118a = c;
        C60784e eVar = C60784e.f173126a;
        C60784e.f173129d = C53895h.m60466d(C60784e.f173127b, (C66212f) null, (C53934p0) null, new C60783d(C60784e.f173129d, list, (C15601d<? super C60783d>) null), 3, (Object) null);
        return C108238y0.m146562a("202", new C108187f(list, z, z ? MJRecommendOptions.Mode.Background : MJRecommendOptions.Mode.None, this, str, new C108188h(System.currentTimeMillis(), onComplete)), new C59777g(this));
    }

    /* renamed from: i */
    public final Object mo158620i(MJTime mJTime, C15601d<? super Boolean> dVar) {
        boolean z = this.f323934a.getCurrentState() == MJMovieSessionState.Playing;
        boolean e = mo158616e();
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "startPlay, isPlaying: " + z + " ready: " + e);
        return (z || !e) ? Boolean.FALSE : C108238y0.m146563b("241", new C108189i(this, mJTime), dVar);
    }

    /* renamed from: k */
    public final Object mo158621k(C15601d<? super Boolean> dVar) {
        boolean z = true;
        if (this.f323934a.getCurrentState() == MJMovieSessionState.Initial) {
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "cur state is initial, no need to stop");
            return Boolean.TRUE;
        }
        if (this.f323934a.getCurrentState() != MJMovieSessionState.Playing) {
            z = false;
        }
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "stopPlay, isPlaying: " + z);
        return z ? C108238y0.m146563b("242", new C59778j(this), dVar) : Boolean.FALSE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158622l(boolean r5, boolean r6, wx3.C15601d<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ha0.C108183c0.C108190k
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ha0.c0$k r0 = (ha0.C108183c0.C108190k) r0
            int r1 = r0.f323962h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f323962h = r1
            goto L_0x0018
        L_0x0013:
            ha0.c0$k r0 = new ha0.c0$k
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f323960f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f323962h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f323959e
            com.tencent.maas.instamovie.MJMovieOptions r5 = (com.tencent.maas.instamovie.MJMovieOptions) r5
            java.lang.Object r6 = r0.f323958d
            ha0.c0 r6 = (ha0.C108183c0) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.maas.instamovie.MJMovieOptions r5 = r4.mo158613b(r5, r6)
            ha0.c0$l r6 = new ha0.c0$l
            r6.<init>(r4, r5)
            r0.f323958d = r4
            r0.f323959e = r5
            r0.f323962h = r3
            java.lang.String r7 = "240"
            java.lang.Object r7 = ha0.C108238y0.m146563b(r7, r6, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r6 = r4
        L_0x0053:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x005d
            r6.f323936c = r5
        L_0x005d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108183c0.mo158622l(boolean, boolean, wx3.d):java.lang.Object");
    }
}
