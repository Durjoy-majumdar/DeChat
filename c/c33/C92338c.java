package c33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import a33.C91947a;
import a33.C91954f;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import b62.C92178b;
import b62.C92179c;
import b62.C92180d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.xweb.file.XVFSFile;
import ei2.C31606c;
import ei2.C97651f;
import f14.C58901s;
import f40.C86709a0;
import fh2.C97882i;
import fy3.C32224a;
import fy3.C32227p;
import g33.C98080a;
import gf3.C98108b;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C32927f;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import jh2.C60863m;
import kotlin.Result;
import kotlin.ResultKt;
import p1206p4.C117979k;
import rx3.C13598b0;
import te3.C64346ep3;
import te3.C64899zy;
import te3.hi4;
import th2.C101891f;
import wh2.C102446b;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66703b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c33.c */
public final class C92338c extends C98108b {

    /* renamed from: b */
    public C97882i.C97883a f264215b;

    /* renamed from: c */
    public C98324b f264216c;

    /* renamed from: d */
    public RecordConfigProvider f264217d;

    /* renamed from: e */
    public C91947a f264218e;

    /* renamed from: f */
    public Context f264219f;

    /* renamed from: g */
    public C102446b f264220g;

    /* renamed from: h */
    public C91954f f264221h;

    /* renamed from: i */
    public C97882i f264222i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoBackgroundRemuxChain$remuxImpl$2", mo125469f = "VideoBackgroundRemuxChain.kt", mo125470l = {68, 72}, mo125471m = "invokeSuspend")
    /* renamed from: c33.c$a */
    public static final class C92339a extends C91594j implements C32227p<C0000n0, C15601d<? super MediaErrorInfo>, Object> {

        /* renamed from: d */
        public Object f264223d;

        /* renamed from: e */
        public Object f264224e;

        /* renamed from: f */
        public int f264225f;

        /* renamed from: g */
        public final /* synthetic */ C92338c f264226g;

        /* renamed from: h */
        public final /* synthetic */ C92178b f264227h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoBackgroundRemuxChain$remuxImpl$2$1", mo125469f = "VideoBackgroundRemuxChain.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: c33.c$a$a */
        public static final class C92340a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C92338c f264228d;

            /* renamed from: c33.c$a$a$a */
            public static final class C92341a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public static final C92341a f264229d = new C92341a();

                public C92341a() {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92340a(C92338c cVar, C15601d<? super C92340a> dVar) {
                super(2, dVar);
                this.f264228d = cVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C92340a(this.f264228d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C92340a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C92338c cVar = this.f264228d;
                C102446b bVar = cVar.f264220g;
                if (bVar == null) {
                    return null;
                }
                bVar.mo142015b(cVar.f264219f, false, C0966R.string.i3k, C92341a.f264229d);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: c33.c$a$b */
        public static final class C92342b extends C87413o implements C32227p<Boolean, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C15601d<MediaErrorInfo> f264230d;

            /* renamed from: e */
            public final /* synthetic */ C92338c f264231e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f264232f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92342b(C15601d<? super MediaErrorInfo> dVar, C92338c cVar, Bundle bundle) {
                super(2);
                this.f264230d = dVar;
                this.f264231e = cVar;
                this.f264232f = bundle;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                String valueOf = String.valueOf(System.currentTimeMillis());
                C101891f.f300035a.mo141370d(valueOf);
                if (!booleanValue) {
                    Log.m105920e("MicroMsg.VideoBackgroundRemuxChain", "download music failed");
                    C15601d<MediaErrorInfo> dVar = this.f264230d;
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(C92180d.MediaRemuxError, 1008, "Background remux audio error", (Bundle) null, 8, (C8480h) null)));
                } else {
                    Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "download music success, " + str);
                    C92338c cVar = this.f264231e;
                    C97882i.C97883a aVar = cVar.f264215b;
                    C91947a aVar2 = cVar.f264218e;
                    int i = aVar2 != null ? aVar2.f263232j : 0;
                    Bundle bundle = this.f264232f;
                    boolean z = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false;
                    Bundle bundle2 = this.f264232f;
                    boolean z2 = bundle2 != null ? bundle2.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false;
                    C91954f fVar = this.f264231e.f264221h;
                    Bundle bundle3 = this.f264232f;
                    int i2 = bundle3 != null ? bundle3.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
                    C92338c cVar2 = this.f264231e;
                    C97882i iVar = cVar2.f264222i;
                    RecordConfigProvider recordConfigProvider = cVar2.f264217d;
                    C87412m.m108591d(recordConfigProvider);
                    C92338c cVar3 = this.f264231e;
                    C92338c.m116155d(cVar3, z2, z, str, i2, aVar, i, recordConfigProvider, fVar, iVar, valueOf, new C92344d(this.f264230d, cVar3, valueOf));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: c33.c$a$c */
        public static final class C92343c extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C15601d<MediaErrorInfo> f264233d;

            /* renamed from: e */
            public final /* synthetic */ C92338c f264234e;

            /* renamed from: f */
            public final /* synthetic */ String f264235f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92343c(C15601d<? super MediaErrorInfo> dVar, C92338c cVar, String str) {
                super(2);
                this.f264233d = dVar;
                this.f264234e = cVar;
                this.f264235f = str;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int intValue = ((Number) obj2).intValue();
                C92180d dVar = C92180d.MediaRemuxSuccess;
                C92180d dVar2 = C92180d.MediaRemuxError;
                if (!booleanValue) {
                    C15601d<MediaErrorInfo> dVar3 = this.f264233d;
                    Result.Companion companion = Result.Companion;
                    dVar3.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(intValue == 0 ? dVar : dVar2, intValue, "ERROR_TARGET_BITRATE_ERROR remux error", (Bundle) null, 8, (C8480h) null)));
                } else {
                    C92338c.m116156e(this.f264234e, this.f264235f);
                    C15601d<MediaErrorInfo> dVar4 = this.f264233d;
                    Result.Companion companion2 = Result.Companion;
                    dVar4.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(intValue == 0 ? dVar : dVar2, intValue, "go to background remux", (Bundle) null, 8, (C8480h) null)));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92339a(C92338c cVar, C92178b bVar, C15601d<? super C92339a> dVar) {
            super(2, dVar);
            this.f264226g = cVar;
            this.f264227h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92339a(this.f264226g, this.f264227h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92339a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            C117979k kVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f264225f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecordConfigProvider recordConfigProvider = this.f264226g.f264217d;
                C87412m.m108591d(recordConfigProvider);
                Boolean bool = recordConfigProvider.f272933u;
                C87412m.m108593f(bool, "configProvider!!.forceForegroundMix");
                if (!bool.booleanValue()) {
                    C98080a aVar2 = C98080a.f287548a;
                    try {
                        synchronized (C117979k.f352603l) {
                            kVar = C117979k.f352601j;
                            if (kVar == null) {
                                kVar = C117979k.f352602k;
                            }
                        }
                        if (kVar != null) {
                            z = true;
                            if (z) {
                                Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "come in videoBackgroundRemuxChain");
                                C53896h0 h0Var = C53872d1.f151117a;
                                C53915k2 k2Var = C58901s.f168555a;
                                C92340a aVar3 = new C92340a(this.f264226g, (C15601d<? super C92340a>) null);
                                this.f264225f = 1;
                                if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
                        }
                    } catch (IllegalStateException e) {
                        Log.m105920e("MicroMsg.RemuxBackgroundManager", "checkWorkManagerInit is error " + e.getMessage());
                        z = false;
                    }
                }
                return new MediaErrorInfo(C92180d.MediaRemuxIgnore, 0, (String) null, (Bundle) null, 12, (C8480h) null);
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C92338c cVar = this.f264226g;
            C92178b bVar = this.f264227h;
            this.f264223d = cVar;
            this.f264224e = bVar;
            this.f264225f = 2;
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            RecordConfigProvider recordConfigProvider2 = cVar.f264217d;
            C87412m.m108591d(recordConfigProvider2);
            if (TextUtils.isEmpty(recordConfigProvider2.f272901B)) {
                C101891f.f300035a.mo141379m(1003);
                Log.m105920e("MicroMsg.VideoBackgroundRemuxChain", "reMux outPath is empty");
                Result.Companion companion = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(C92180d.MediaRemuxError, 1003, "BackgroundRemux remux output path is null", (Bundle) null, 8, (C8480h) null)));
            } else {
                Bundle bundle = bVar.f263830b;
                if (cVar.f264218e == null) {
                    C92351h hVar2 = C92351h.f264261a;
                    RecordConfigProvider recordConfigProvider3 = cVar.f264217d;
                    C87412m.m108591d(recordConfigProvider3);
                    C91947a a = hVar2.mo126330a(recordConfigProvider3, cVar.f264222i, cVar.f264215b, cVar.f264216c, bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false, bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false);
                    cVar.f264218e = a;
                    C66703b.m78687a(a.mo125796b());
                }
                C91947a aVar4 = cVar.f264218e;
                if (aVar4 != null) {
                    RecordConfigProvider recordConfigProvider4 = cVar.f264217d;
                    C87412m.m108591d(recordConfigProvider4);
                    aVar4.mo125795a(recordConfigProvider4.f272926n);
                }
                AudioCacheInfo audioCacheInfo = cVar.f264222i.f287142b;
                if (audioCacheInfo != null) {
                    C60863m.f173404c.mo85769c(audioCacheInfo, new C92342b(hVar, cVar, bundle));
                } else {
                    Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "no audioCacheInfo");
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    C101891f.f300035a.mo141370d(valueOf);
                    C97882i.C97883a aVar5 = cVar.f264215b;
                    C91947a aVar6 = cVar.f264218e;
                    int i2 = aVar6 != null ? aVar6.f263232j : 0;
                    boolean z2 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false;
                    boolean z3 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false;
                    C91954f fVar = cVar.f264221h;
                    int i3 = bundle != null ? bundle.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
                    C97882i iVar = cVar.f264222i;
                    RecordConfigProvider recordConfigProvider5 = cVar.f264217d;
                    C87412m.m108591d(recordConfigProvider5);
                    C92338c.m116155d(cVar, z3, z2, (String) null, i3, aVar5, i2, recordConfigProvider5, fVar, iVar, valueOf, new C92343c(hVar, cVar, valueOf));
                }
            }
            Object b = hVar.mo90314b();
            return b == aVar ? aVar : b;
        }
    }

    public C92338c(C97882i.C97883a aVar, C98324b bVar, RecordConfigProvider recordConfigProvider, C91947a aVar2, Context context, C102446b bVar2, C91954f fVar, C97882i iVar) {
        C87412m.m108594g(aVar, "encode");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(iVar, "editConfig");
        this.f264215b = aVar;
        this.f264216c = bVar;
        this.f264217d = recordConfigProvider;
        this.f264218e = aVar2;
        this.f264219f = context;
        this.f264220g = bVar2;
        this.f264221h = fVar;
        this.f264222i = iVar;
    }

    /* renamed from: d */
    public static final void m116155d(C92338c cVar, boolean z, boolean z2, String str, int i, C97882i.C97883a aVar, int i2, RecordConfigProvider recordConfigProvider, C91954f fVar, C97882i iVar, String str2, C32227p pVar) {
        boolean z3;
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        C91954f fVar2 = fVar;
        C32227p pVar2 = pVar;
        cVar.getClass();
        C64899zy e = C92351h.f264261a.mo126332e(recordConfigProvider, iVar, fVar, z, z2, str, i);
        if (e == null) {
            pVar2.invoke(Boolean.FALSE, 1009);
            return;
        }
        C32927f.f89501a.mo58869c(C86709a0.m107535s().f251807e + "mediaOpt/remux/tempVideo/");
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251807e + "mediaOpt/remux/tempVideo/");
        sb.append("sns_");
        sb.append(System.currentTimeMillis());
        String sb4 = sb.toString();
        Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "create dir:" + sb4 + " result:" + C86013q1.m106461v(sb4));
        LinkedList<hi4> linkedList = e.f186899d;
        C87412m.m108593f(linkedList, "compositionInfo.tracks");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            z3 = false;
            if (!it.hasNext()) {
                break;
            }
            hi4 hi4 = (hi4) it.next();
            Uri n = C116299g2.m163858n(hi4.f183504d);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            C87412m.m108593f(path2, "VFSFile(it.path).name");
            String str3 = sb4 + XVFSFile.SEPARATOR_CHAR + path2;
            C86013q1.m106442c(hi4.f183504d, str3);
            Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "file copy form:" + hi4.f183504d + " to:" + str3);
            hi4.f183504d = str3;
            if (fVar2 != null) {
                Rect rect = fVar2.f263264i;
                C64346ep3 ep32 = hi4.f183515r.f184196e;
                C87412m.m108593f(ep32, "it.cropInfo.cropRect");
                C96551o.m123877g(rect, ep32);
                Rect rect2 = fVar2.f263264i;
                C64346ep3 ep33 = hi4.f183515r.f184198g;
                C87412m.m108593f(ep33, "it.cropInfo.contentRect");
                C96551o.m123877g(rect2, ep33);
            }
        }
        C8479f0 f0Var = new C8479f0();
        C8479f0 f0Var2 = new C8479f0();
        try {
            f0Var.f27484d = e.toByteArray();
            Parcel obtain = Parcel.obtain();
            C87412m.m108593f(obtain, "obtain()");
            recordConfigProvider2.f272926n.writeToParcel(obtain, 0);
            f0Var2.f27484d = obtain.marshall();
            obtain.recycle();
            C0414a aVar2 = new C0414a(pVar2);
            C31606c e2 = C96551o.m123875e(e);
            EffectManager effectManager = new EffectManager();
            ((C97651f) e2).start();
            C96552p0 d = C96551o.m123874d(e, effectManager);
            d.mo134622s(e2);
            d.mo134617n(e.f186904i.f297897e, new C92345e(e2, effectManager, recordConfigProvider, aVar2, e));
            Bundle bundle = recordConfigProvider2.f272912M;
            if (bundle != null && bundle.getBoolean("key_save_composition_info")) {
                z3 = true;
            }
            if (z3) {
                CaptureDataManager.f272890c.f272892b.putByteArray("key_composition_info", e.toByteArray());
            }
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C92337b(str2, recordConfigProvider, i, i2, str, cVar, aVar, f0Var, f0Var2, (C15601d<? super C92337b>) null), 3, (Object) null);
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.VideoBackgroundRemuxChain", "parse byte error");
            pVar2.invoke(Boolean.FALSE, 1009);
        }
    }

    /* renamed from: e */
    public static final void m116156e(C92338c cVar, String str) {
        cVar.getClass();
        CaptureDataManager.f272890c.f272892b.putString("key_background_remux_work_id", str);
        CaptureDataManager.f272890c.f272892b.putBoolean("key_is_background_video", true);
        C92351h.f264261a.mo126333f(cVar.f264216c);
    }

    /* renamed from: c */
    public Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C92339a(this, bVar, (C15601d<? super C92339a>) null), dVar);
    }
}
