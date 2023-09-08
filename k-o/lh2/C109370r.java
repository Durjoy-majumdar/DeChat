package lh2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C98453h;
import hi2.C98460k;
import ig3.C108460i;
import java.util.ArrayList;
import kotlin.ResultKt;
import lh2.C109344g0;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p248ug.C111161j0;
import p248ug.C111162m0;
import p248ug.C111164r0;
import p248ug.C111167t;
import p248ug.C14183h;
import p511ew.C58849b;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th2.C101891f;
import th2.C110992d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C112660e0;
import zt3.C119157j;

/* renamed from: lh2.r */
public final class C109370r implements C109344g0 {

    /* renamed from: d */
    public FrameLayout f327407d;

    /* renamed from: e */
    public C101198e f327408e;

    /* renamed from: f */
    public final C13601g f327409f = C36568h.m40985a(C99465c.f291626d);

    /* renamed from: g */
    public final C13601g f327410g = C36568h.m40985a(C99464b.f291625d);

    /* renamed from: h */
    public C111164r0 f327411h;

    /* renamed from: i */
    public RecordConfigProvider f327412i;

    /* renamed from: j */
    public C98324b f327413j;

    /* renamed from: n */
    public C112660e0 f327414n;

    /* renamed from: o */
    public C109623f f327415o;

    /* renamed from: p */
    public final Context f327416p = this.f327407d.getContext();

    /* renamed from: q */
    public boolean f327417q;

    /* renamed from: r */
    public boolean f327418r;

    /* renamed from: s */
    public C111167t f327419s = C111167t.DEFAULT;

    /* renamed from: t */
    public int f327420t = -1;

    /* renamed from: u */
    public int f327421u = -1;

    /* renamed from: v */
    public float f327422v = 1.0f;

    /* renamed from: lh2.r$a */
    public static final class C99461a implements C111161j0 {

        /* renamed from: a */
        public final /* synthetic */ long f291611a;

        /* renamed from: b */
        public final /* synthetic */ C109370r f291612b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList<IEmojiInfo> f291613c;

        /* renamed from: d */
        public final /* synthetic */ boolean f291614d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> f291615e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.EditPhotoContainerPlugin$doFinish$2$onSuccess$1$1", mo125469f = "EditPhotoContainerPlugin.kt", mo125470l = {403}, mo125471m = "invokeSuspend")
        /* renamed from: lh2.r$a$a */
        public static final class C99462a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f291616d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f291617e;

            /* renamed from: f */
            public final /* synthetic */ C109370r f291618f;

            /* renamed from: g */
            public final /* synthetic */ long f291619g;

            /* renamed from: h */
            public final /* synthetic */ ArrayList<IEmojiInfo> f291620h;

            /* renamed from: i */
            public final /* synthetic */ boolean f291621i;

            /* renamed from: j */
            public final /* synthetic */ C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> f291622j;

            @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.EditPhotoContainerPlugin$doFinish$2$onSuccess$1$1$2", mo125469f = "EditPhotoContainerPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: lh2.r$a$a$a */
            public static final class C99463a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C109370r f291623d;

                /* renamed from: e */
                public final /* synthetic */ C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> f291624e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C99463a(C109370r rVar, C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar, C15601d<? super C99463a> dVar) {
                    super(2, dVar);
                    this.f291623d = rVar;
                    this.f291624e = lVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C99463a(this.f291623d, this.f291624e, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C99463a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = Boolean.TRUE;
                    RecordConfigProvider recordConfigProvider = this.f291623d.f327412i;
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = new CaptureDataManager.CaptureVideoNormalModel(bool, "", recordConfigProvider != null ? recordConfigProvider.f272904E : null, new Long(-1), bool, C110992d.f332425a.mo162676j());
                    C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar = this.f291624e;
                    if (lVar != null) {
                        lVar.invoke(captureVideoNormalModel);
                    } else {
                        CaptureDataManager.f272890c.mo129794a(this.f291623d.f327416p, captureVideoNormalModel);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99462a(Bitmap bitmap, C109370r rVar, long j, ArrayList<IEmojiInfo> arrayList, boolean z, C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar, C15601d<? super C99462a> dVar) {
                super(2, dVar);
                this.f291617e = bitmap;
                this.f291618f = rVar;
                this.f291619g = j;
                this.f291620h = arrayList;
                this.f291621i = z;
                this.f291622j = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C99462a(this.f291617e, this.f291618f, this.f291619g, this.f291620h, this.f291621i, this.f291622j, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C99462a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f291616d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C110992d dVar = C110992d.f332425a;
                    dVar.mo162677k("KEY_CROP_MEDIA_WIDTH_INT", new Integer(this.f291617e.getWidth()));
                    dVar.mo162677k("KEY_CROP_MEDIA_HEIGHT_INT", new Integer(this.f291617e.getHeight()));
                    dVar.mo162672f();
                    Log.m105924i("MicroMsg.EditPhotoPluginLayout", "photo width: " + this.f291617e.getWidth() + "  height:" + this.f291617e.getHeight());
                    Bitmap bitmap = this.f291617e;
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    RecordConfigProvider recordConfigProvider = this.f291618f.f327412i;
                    BitmapUtil.saveBitmapToImage(bitmap, 100, compressFormat, recordConfigProvider != null ? recordConfigProvider.f272904E : null, true);
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveBitmapToImage  cost:");
                    sb.append(Util.ticksToNow(this.f291619g));
                    sb.append("  path:");
                    RecordConfigProvider recordConfigProvider2 = this.f291618f.f327412i;
                    sb.append(recordConfigProvider2 != null ? recordConfigProvider2.f272904E : null);
                    Log.m105924i("MicroMsg.EditPhotoPluginLayout", sb.toString());
                    boolean z = false;
                    this.f291618f.f327417q = false;
                    ArrayList arrayList = new ArrayList();
                    for (IEmojiInfo iEmojiInfo : this.f291620h) {
                        if (!(iEmojiInfo == null || iEmojiInfo.mo62639J() == null)) {
                            arrayList.add(iEmojiInfo.mo62639J());
                        }
                    }
                    CaptureDataManager.f272890c.f272892b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList);
                    RecordConfigProvider recordConfigProvider3 = this.f291618f.f327412i;
                    String str = recordConfigProvider3 != null ? recordConfigProvider3.f272904E : null;
                    if (str == null) {
                        str = "";
                    }
                    C14183h.m13518b(str, arrayList);
                    C98453h hVar = C98453h.f288774a;
                    C109370r rVar = this.f291618f;
                    RecordConfigProvider recordConfigProvider4 = rVar.f327412i;
                    C98324b bVar = rVar.f327413j;
                    if (bVar != null) {
                        z = bVar.f288182c;
                    }
                    boolean z2 = this.f291621i;
                    Log.m105924i("MicroMsg.MediaFileUtil", "configProvider : " + recordConfigProvider4 + "  isCaptureMedia:" + z + "   change:" + z2);
                    if (recordConfigProvider4 != null) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C98460k(recordConfigProvider4, recordConfigProvider4, z, z2), "mux_save_work");
                    }
                    Log.m105918d("MicroMsg.EditPhotoPluginLayout", "new ThreadPool  cost:" + Util.ticksToNow(this.f291619g) + ", selectedEmotionSafeStrategyInfoList size:" + arrayList.size());
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C99463a aVar2 = new C99463a(this.f291618f, this.f291622j, (C15601d<? super C99463a>) null);
                    this.f291616d = 1;
                    if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
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

        public C99461a(long j, C109370r rVar, ArrayList<IEmojiInfo> arrayList, boolean z, C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar) {
            this.f291611a = j;
            this.f291612b = rVar;
            this.f291613c = arrayList;
            this.f291614d = z;
            this.f291615e = lVar;
        }

        /* renamed from: a */
        public void mo79184a(Bitmap bitmap, boolean z) {
            Bitmap bitmap2 = bitmap;
            Log.m105924i("MicroMsg.EditPhotoPluginLayout", "photoEditor onSuccess: " + bitmap2 + " isNever：" + z + "  cost:" + Util.ticksToNow(this.f291611a));
            C115669n.INSTANCE.idkeyStat(985, 128, Util.ticksToNow(this.f291611a), false);
            if (bitmap2 == null) {
                C115669n.INSTANCE.idkeyStat(985, 126, 1, false);
            }
            if (bitmap2 != null) {
                C109370r rVar = this.f291612b;
                long j = this.f291611a;
                ArrayList<IEmojiInfo> arrayList = this.f291613c;
                boolean z2 = this.f291614d;
                C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar = this.f291615e;
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C99462a(bitmap, rVar, j, arrayList, z2, lVar, (C15601d<? super C99462a>) null), 2, (Object) null);
            }
        }

        /* renamed from: b */
        public void mo79185b(Exception exc) {
            C87412m.m108594g(exc, "e");
            Log.m105921e("MicroMsg.EditPhotoPluginLayout", "photoEditor onError: %s", exc);
            C115669n.INSTANCE.idkeyStat(985, 125, 1, false);
            C115669n.INSTANCE.idkeyStat(985, 128, Util.ticksToNow(this.f291611a), false);
            C110992d.f332425a.mo162672f();
            this.f291612b.f327417q = false;
        }
    }

    /* renamed from: lh2.r$b */
    public static final class C99464b extends C87413o implements C32224a<C111164r0> {

        /* renamed from: d */
        public static final C99464b f291625d = new C99464b();

        public C99464b() {
            super(0);
        }

        public Object invoke() {
            return ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        }
    }

    /* renamed from: lh2.r$c */
    public static final class C99465c extends C87413o implements C32224a<C111164r0> {

        /* renamed from: d */
        public static final C99465c f291626d = new C99465c();

        public C99465c() {
            super(0);
        }

        public Object invoke() {
            return ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        }
    }

    public C109370r(FrameLayout frameLayout, C101198e eVar) {
        C87412m.m108594g(frameLayout, "photoLayout");
        C87412m.m108594g(eVar, "status");
        this.f327407d = frameLayout;
        this.f327408e = eVar;
    }

    /* renamed from: a */
    public static final void m148521a(C109370r rVar, MotionEvent motionEvent) {
        rVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    rVar.f327418r = true;
                    C101198e.C62622a.m73576a(rVar.f327408e, C101198e.C101199b.EDIT_PHOTO_DOODLE_MOVE_START, (Bundle) null, 2, (Object) null);
                    return;
                } else if (!(actionMasked == 5 || actionMasked == 6)) {
                    return;
                }
            }
            if (rVar.f327418r) {
                C101198e.C62622a.m73576a(rVar.f327408e, C101198e.C101199b.EDIT_PHOTO_DOODLE_MOVE_STOP, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(rVar.f327408e, C101198e.C101199b.EDIT_PHOTO_DOODLE_CLICK, (Bundle) null, 2, (Object) null);
            }
        } else {
            rVar.f327418r = false;
        }
    }

    /* renamed from: b */
    public final void mo160569b() {
        this.f327419s = C111167t.DEFAULT;
        C109623f fVar = this.f327415o;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150363c(C111167t.CROP_PHOTO, 2, (Object) null);
        }
    }

    /* renamed from: c */
    public final void mo160570c(C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0> lVar) {
        C110992d dVar = C110992d.f332425a;
        C111164r0 r0Var = this.f327411h;
        Integer num = null;
        C111162m0 b = r0Var != null ? r0Var.mo162893b() : null;
        C87412m.m108591d(b);
        dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(((C108460i) b).mo159002b()));
        C111164r0 r0Var2 = this.f327411h;
        C111162m0 b2 = r0Var2 != null ? r0Var2.mo162893b() : null;
        C87412m.m108591d(b2);
        dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(((C108460i) b2).mo159005e()));
        C111164r0 r0Var3 = this.f327411h;
        C111162m0 b3 = r0Var3 != null ? r0Var3.mo162893b() : null;
        C87412m.m108591d(b3);
        dVar.mo162677k("KEY_ADD_DOODLE_COUNT_INT", Integer.valueOf(((C108460i) b3).mo159001a()));
        C111164r0 r0Var4 = this.f327411h;
        C111162m0 b4 = r0Var4 != null ? r0Var4.mo162893b() : null;
        C87412m.m108591d(b4);
        dVar.mo162677k("KEY_ADD_DOODLE_COLOR_COUNT_INT", Integer.valueOf(((C108460i) b4).mo159004d()));
        C111164r0 r0Var5 = this.f327411h;
        C111162m0 b5 = r0Var5 != null ? r0Var5.mo162893b() : null;
        C87412m.m108591d(b5);
        dVar.mo162677k("KEY_ADD_MOSAIC_COUNT_INT", Integer.valueOf(((C108460i) b5).mo159003c()));
        C111164r0 r0Var6 = this.f327411h;
        C111162m0 b6 = r0Var6 != null ? r0Var6.mo162893b() : null;
        C87412m.m108591d(b6);
        dVar.mo162677k("KEY_ROTATE_INT", Integer.valueOf(((C108460i) b6).mo159008h() ? 1 : 0));
        C109623f fVar = this.f327415o;
        dVar.mo162677k("KEY_ZOOM_IN_OUT_COUNT", Integer.valueOf(fVar != null ? ((C109612c) fVar).f328171n : 0));
        dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
        C101891f fVar2 = C101891f.f300035a;
        int[] iArr = new int[3];
        C111164r0 r0Var7 = this.f327411h;
        C111162m0 b7 = r0Var7 != null ? r0Var7.mo162893b() : null;
        C87412m.m108591d(b7);
        iArr[0] = ((C108460i) b7).mo159002b();
        C111164r0 r0Var8 = this.f327411h;
        C111162m0 b8 = r0Var8 != null ? r0Var8.mo162893b() : null;
        C87412m.m108591d(b8);
        iArr[1] = ((C108460i) b8).mo159005e();
        iArr[2] = -1;
        fVar2.mo141374h(iArr);
        fVar2.mo141375i(1, 2);
        C111164r0 r0Var9 = this.f327411h;
        C111162m0 b9 = r0Var9 != null ? r0Var9.mo162893b() : null;
        C87412m.m108591d(b9);
        boolean g = ((C108460i) b9).mo159007g();
        dVar.mo162677k("KEY_PHOTO_IS_EDITED_BOOLEAN", Boolean.valueOf(g));
        if (g) {
            C115669n.INSTANCE.idkeyStat(985, 118, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(985, 127, 1, false);
        if (!this.f327417q) {
            Context context = this.f327416p;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            if (!((Activity) context).isFinishing()) {
                this.f327417q = true;
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.EditPhotoPluginLayout", "dofinish time: " + currentTicks + ' ' + g);
                ArrayList arrayList = new ArrayList();
                C109623f fVar3 = this.f327415o;
                if (fVar3 != null) {
                    arrayList.addAll(((C109612c) fVar3).mo160823g());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("doFinish: currentSelectedEmojiList size=");
                C109623f fVar4 = this.f327415o;
                if (fVar4 != null) {
                    num = Integer.valueOf(((ArrayList) ((C109612c) fVar4).mo160823g()).size());
                }
                sb.append(num);
                Log.m105924i("MicroMsg.EditPhotoPluginLayout", sb.toString());
                C111164r0 r0Var10 = this.f327411h;
                if (r0Var10 != null) {
                    r0Var10.mo162898g(new C99461a(currentTicks, this, arrayList, g, lVar));
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        C111167t tVar = this.f327419s;
        C111167t tVar2 = C111167t.CROP_PHOTO;
        if (tVar != tVar2) {
            return false;
        }
        this.f327419s = C111167t.DEFAULT;
        C109623f fVar = this.f327415o;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150363c(tVar2, 1, (Object) null);
        }
        return true;
    }

    public String name() {
        return C109370r.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        Object value = ((C36570n) this.f327409f).getValue();
        C87412m.m108593f(value, "<get-mPortraitPhotoEditor>(...)");
        ((C111164r0) value).mo162897f();
        Object value2 = ((C36570n) this.f327410g).getValue();
        C87412m.m108593f(value2, "<get-mLandscapePhotoEditor>(...)");
        ((C111164r0) value2).mo162897f();
        this.f327407d.removeAllViews();
        this.f327407d.setVisibility(8);
        C109623f fVar = this.f327415o;
        if (fVar != null) {
            ((C109612c) fVar).mo160828l();
        }
    }

    public void reset() {
        C111167t tVar = C111167t.DEFAULT;
        this.f327419s = tVar;
        C109623f fVar = this.f327415o;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f327415o;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, -1, (Object) null);
        }
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
