package c33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a33.C91947a;
import a33.C91954f;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import b62.C92178b;
import b62.C92179c;
import b62.C92180d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fh2.C97882i;
import fy3.C32224a;
import fy3.C32227p;
import gf3.C98108b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import jh2.C60863m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64899zy;
import th2.C101891f;
import wh2.C102446b;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66703b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c33.i */
public final class C92353i extends C98108b {

    /* renamed from: b */
    public C97882i.C97883a f264268b;

    /* renamed from: c */
    public C98324b f264269c;

    /* renamed from: d */
    public RecordConfigProvider f264270d;

    /* renamed from: e */
    public C91947a f264271e;

    /* renamed from: f */
    public Context f264272f;

    /* renamed from: g */
    public C102446b f264273g;

    /* renamed from: h */
    public C91954f f264274h;

    /* renamed from: i */
    public C97882i f264275i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoForegroundRemuxChain$remuxImpl$2", mo125469f = "VideoForegroundRemuxChain.kt", mo125470l = {44, 47}, mo125471m = "invokeSuspend")
    /* renamed from: c33.i$a */
    public static final class C92354a extends C91594j implements C32227p<C0000n0, C15601d<? super MediaErrorInfo>, Object> {

        /* renamed from: d */
        public Object f264276d;

        /* renamed from: e */
        public Object f264277e;

        /* renamed from: f */
        public int f264278f;

        /* renamed from: g */
        public final /* synthetic */ C92353i f264279g;

        /* renamed from: h */
        public final /* synthetic */ C92178b f264280h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoForegroundRemuxChain$remuxImpl$2$1", mo125469f = "VideoForegroundRemuxChain.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: c33.i$a$a */
        public static final class C92355a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C92353i f264281d;

            /* renamed from: c33.i$a$a$a */
            public static final class C92356a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public static final C92356a f264282d = new C92356a();

                public C92356a() {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92355a(C92353i iVar, C15601d<? super C92355a> dVar) {
                super(2, dVar);
                this.f264281d = iVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C92355a(this.f264281d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C92355a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C92353i iVar = this.f264281d;
                C102446b bVar = iVar.f264273g;
                if (bVar == null) {
                    return null;
                }
                bVar.mo142015b(iVar.f264272f, false, C0966R.string.i3k, C92356a.f264282d);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: c33.i$a$b */
        public static final class C92357b extends C87413o implements C32227p<Boolean, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C15601d<MediaErrorInfo> f264283d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f264284e;

            /* renamed from: f */
            public final /* synthetic */ C92353i f264285f;

            /* renamed from: g */
            public final /* synthetic */ C32227p<Integer, String, C13598b0> f264286g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92357b(C15601d<? super MediaErrorInfo> dVar, Bundle bundle, C92353i iVar, C32227p<? super Integer, ? super String, C13598b0> pVar) {
                super(2);
                this.f264283d = dVar;
                this.f264284e = bundle;
                this.f264285f = iVar;
                this.f264286g = pVar;
            }

            public Object invoke(Object obj, Object obj2) {
                Bundle bundle;
                Bundle bundle2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                C92180d dVar = C92180d.MediaRemuxError;
                if (!booleanValue) {
                    Log.m105920e("MicroMsg.VideoForegroundRemuxChain", "download music failed");
                    C15601d<MediaErrorInfo> dVar2 = this.f264283d;
                    Result.Companion companion = Result.Companion;
                    dVar2.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(dVar, 1008, "Foreground remux audio error", (Bundle) null, 8, (C8480h) null)));
                } else {
                    Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "download music success, " + str);
                    Bundle bundle3 = this.f264284e;
                    int i = bundle3 != null ? bundle3.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
                    C92351h hVar = C92351h.f264261a;
                    RecordConfigProvider recordConfigProvider = this.f264285f.f264270d;
                    C87412m.m108591d(recordConfigProvider);
                    Bundle bundle4 = this.f264284e;
                    boolean z = bundle4 != null ? bundle4.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false;
                    Bundle bundle5 = this.f264284e;
                    boolean z2 = bundle5 != null ? bundle5.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false;
                    C92353i iVar = this.f264285f;
                    C64899zy e = hVar.mo126332e(recordConfigProvider, iVar.f264275i, iVar.f264274h, z2, z, str, i);
                    if (e == null) {
                        Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "composition info is null");
                        C15601d<MediaErrorInfo> dVar3 = this.f264283d;
                        Result.Companion companion2 = Result.Companion;
                        dVar3.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(dVar, 1009, "ERROR_TARGET_BITRATE_ERROR remux error", (Bundle) null, 8, (C8480h) null)));
                    } else {
                        RecordConfigProvider recordConfigProvider2 = this.f264285f.f264270d;
                        boolean z3 = true;
                        if (recordConfigProvider2 == null || (bundle2 = recordConfigProvider2.f272912M) == null || !bundle2.getBoolean("key_save_composition_info")) {
                            z3 = false;
                        }
                        if (z3) {
                            CaptureDataManager.f272890c.f272892b.putByteArray("key_composition_info", e.toByteArray());
                        }
                        C92353i iVar2 = this.f264285f;
                        C97882i.C97883a aVar = iVar2.f264268b;
                        C91947a aVar2 = iVar2.f264271e;
                        int i2 = aVar2 != null ? aVar2.f263232j : 0;
                        RecordConfigProvider recordConfigProvider3 = iVar2.f264270d;
                        C87412m.m108591d(recordConfigProvider3);
                        RecordConfigProvider recordConfigProvider4 = this.f264285f.f264270d;
                        hVar.mo126331c(e, recordConfigProvider3, (recordConfigProvider4 == null || (bundle = recordConfigProvider4.f272912M) == null) ? 0 : bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0), aVar, i2, i, this.f264286g, "");
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: c33.i$a$c */
        public static final class C92358c extends C87413o implements C32227p<Integer, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92353i f264287d;

            /* renamed from: e */
            public final /* synthetic */ String f264288e;

            /* renamed from: f */
            public final /* synthetic */ C15601d<MediaErrorInfo> f264289f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92358c(C92353i iVar, String str, C15601d<? super MediaErrorInfo> dVar) {
                super(2);
                this.f264287d = iVar;
                this.f264288e = str;
                this.f264289f = dVar;
            }

            public Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                String str = (String) obj2;
                C92180d dVar = C92180d.MediaRemuxError;
                C87412m.m108594g(str, "msg");
                Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> code: " + intValue + ", msg: " + str);
                if (intValue == 0) {
                    C92351h hVar = C92351h.f264261a;
                    RecordConfigProvider recordConfigProvider = this.f264287d.f264270d;
                    C87412m.m108591d(recordConfigProvider);
                    C92353i iVar = this.f264287d;
                    C97882i.C97883a aVar = iVar.f264268b;
                    C98324b bVar = iVar.f264269c;
                    String str2 = this.f264288e;
                    C87412m.m108593f(str2, "outPath");
                    C87412m.m108594g(aVar, "encode");
                    boolean z = recordConfigProvider.f272937y;
                    String str3 = recordConfigProvider.f272902C;
                    C87412m.m108593f(str3, "configProvider.thumbPath");
                    String str4 = recordConfigProvider.f272900A;
                    C87412m.m108593f(str4, "configProvider.inputVideoPath");
                    boolean b = C92351h.m116161b(hVar, z, str3, str4, str2, recordConfigProvider.f272938z, bVar != null ? bVar.f288182c : false, aVar.f287160j, bVar, false, 256, (Object) null);
                    Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> dealAfterRemuxSuccess result: " + b);
                    if (!b) {
                        C15601d<MediaErrorInfo> dVar2 = this.f264289f;
                        Result.Companion companion = Result.Companion;
                        dVar2.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(dVar, 1012, "save thumb error", (Bundle) null, 8, (C8480h) null)));
                        return C13598b0.f38549a;
                    }
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C101891f fVar = C101891f.f300035a;
                Log.m105924i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
                C101891f.f300036b.f265883Q = elapsedRealtime;
                C15601d<MediaErrorInfo> dVar3 = this.f264289f;
                Result.Companion companion2 = Result.Companion;
                dVar3.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(intValue == 0 ? C92180d.MediaRemuxSuccess : dVar, intValue, str, (Bundle) null, 8, (C8480h) null)));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92354a(C92353i iVar, C92178b bVar, C15601d<? super C92354a> dVar) {
            super(2, dVar);
            this.f264279g = iVar;
            this.f264280h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92354a(this.f264279g, this.f264280h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92354a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Bundle bundle;
            C92180d dVar = C92180d.MediaRemuxError;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f264278f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "come in remux foreground chain");
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C92355a aVar2 = new C92355a(this.f264279g, (C15601d<? super C92355a>) null);
                this.f264278f = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C92353i iVar = this.f264279g;
            C92178b bVar = this.f264280h;
            this.f264276d = iVar;
            this.f264277e = bVar;
            this.f264278f = 2;
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "come in VideoForegroundRemux");
            RecordConfigProvider recordConfigProvider = iVar.f264270d;
            C87412m.m108591d(recordConfigProvider);
            String str = recordConfigProvider.f272901B;
            if (TextUtils.isEmpty(str)) {
                C101891f.f300035a.mo141379m(1003);
                Log.m105920e("MicroMsg.VideoForegroundRemuxChain", "reMux outPath is empty");
                Result.Companion companion = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(dVar, 1003, "Foreground remux output path is null", (Bundle) null, 8, (C8480h) null)));
            } else {
                Bundle bundle2 = bVar.f263830b;
                if (iVar.f264271e == null) {
                    C92351h hVar2 = C92351h.f264261a;
                    RecordConfigProvider recordConfigProvider2 = iVar.f264270d;
                    C87412m.m108591d(recordConfigProvider2);
                    C91947a a = hVar2.mo126330a(recordConfigProvider2, iVar.f264275i, iVar.f264268b, iVar.f264269c, bundle2 != null ? bundle2.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false, bundle2 != null ? bundle2.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false);
                    iVar.f264271e = a;
                    C66703b.m78687a(a.mo125796b());
                }
                C91947a aVar3 = iVar.f264271e;
                if (aVar3 != null) {
                    RecordConfigProvider recordConfigProvider3 = iVar.f264270d;
                    aVar3.mo125795a(recordConfigProvider3 != null ? recordConfigProvider3.f272926n : null);
                }
                C92358c cVar = new C92358c(iVar, str, hVar);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C101891f fVar = C101891f.f300035a;
                Log.m105924i("MicroMsg.VideoWidgetReporter", "setMuxStartTimeStamp >> " + elapsedRealtime);
                C101891f.f300036b.f265882P = elapsedRealtime;
                AudioCacheInfo audioCacheInfo = iVar.f264275i.f287142b;
                if (audioCacheInfo != null) {
                    C60863m.f173404c.mo85769c(audioCacheInfo, new C92357b(hVar, bundle2, iVar, cVar));
                } else {
                    Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl no audio info");
                    int i2 = bundle2 != null ? bundle2.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
                    C92351h hVar3 = C92351h.f264261a;
                    RecordConfigProvider recordConfigProvider4 = iVar.f264270d;
                    C87412m.m108591d(recordConfigProvider4);
                    C64899zy e = hVar3.mo126332e(recordConfigProvider4, iVar.f264275i, iVar.f264274h, bundle2 != null ? bundle2.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false, bundle2 != null ? bundle2.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false, (String) null, i2);
                    if (e == null) {
                        Log.m105924i("MicroMsg.VideoForegroundRemuxChain", "composition info is null");
                        Result.Companion companion2 = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(dVar, 1009, "ERROR_TARGET_BITRATE_ERROR remux error", (Bundle) null, 8, (C8480h) null)));
                    } else {
                        C97882i.C97883a aVar4 = iVar.f264268b;
                        C91947a aVar5 = iVar.f264271e;
                        int i3 = aVar5 != null ? aVar5.f263232j : 0;
                        RecordConfigProvider recordConfigProvider5 = iVar.f264270d;
                        C87412m.m108591d(recordConfigProvider5);
                        RecordConfigProvider recordConfigProvider6 = iVar.f264270d;
                        hVar3.mo126331c(e, recordConfigProvider5, (recordConfigProvider6 == null || (bundle = recordConfigProvider6.f272912M) == null) ? 0 : bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0), aVar4, i3, i2, cVar, "");
                    }
                }
            }
            Object b = hVar.mo90314b();
            return b == aVar ? aVar : b;
        }
    }

    public C92353i(C97882i.C97883a aVar, C98324b bVar, RecordConfigProvider recordConfigProvider, C91947a aVar2, Context context, C102446b bVar2, C91954f fVar, C97882i iVar) {
        C87412m.m108594g(aVar, "encode");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(iVar, "editConfig");
        this.f264268b = aVar;
        this.f264269c = bVar;
        this.f264270d = recordConfigProvider;
        this.f264271e = aVar2;
        this.f264272f = context;
        this.f264273g = bVar2;
        this.f264274h = fVar;
        this.f264275i = iVar;
    }

    /* renamed from: c */
    public Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C92354a(this, bVar, (C15601d<? super C92354a>) null), dVar);
    }
}
