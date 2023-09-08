package pa0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a70.C112760b;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import bp3.C104160f;
import ca0.C54679b;
import ca0.C54683f0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.maas.instamovie.MJRecommendOptions;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.MJMusicOptions;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55302j;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55304k;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ha0.C108221t;
import i21.C60242i;
import iy3.C60641c;
import ja0.C24789f;
import ja0.C60781a;
import ja0.C60784e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.C60960c;
import kotlin.ResultKt;
import la0.C61242a;
import lc3.C10485b;
import ma0.C46974e;
import na0.C100107b;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p232rw.C63679m;
import p415q0.C110261c;
import p823sg.C90193h;
import qa0.C62586b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.e94;
import te3.pr4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y90.C66581h;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: pa0.a */
public final class C62211a extends UIComponent implements C61242a.C61246d {

    /* renamed from: d */
    public final ArrayList<GalleryItem$MediaItem> f176861d = new ArrayList<>();

    /* renamed from: e */
    public final C13601g f176862e;

    /* renamed from: f */
    public final List<pr4> f176863f;

    /* renamed from: g */
    public final C13601g f176864g;

    /* renamed from: h */
    public final boolean f176865h;

    /* renamed from: i */
    public final boolean f176866i;

    /* renamed from: j */
    public final C60690y0 f176867j;

    /* renamed from: n */
    public C54683f0 f176868n;

    /* renamed from: o */
    public final C60690y0 f176869o;

    /* renamed from: p */
    public String f176870p;

    /* renamed from: q */
    public boolean f176871q;

    /* renamed from: r */
    public int f176872r;

    /* renamed from: s */
    public final C13601g f176873s;

    /* renamed from: t */
    public final C13601g f176874t;

    /* renamed from: u */
    public final C13601g f176875u;

    /* renamed from: v */
    public final C62220i f176876v;

    /* renamed from: w */
    public final C62219h f176877w;

    /* renamed from: x */
    public final C60690y0 f176878x;

    /* renamed from: y */
    public C60690y0<Double> f176879y;

    /* renamed from: z */
    public long f176880z;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {521, 523}, mo125471m = "awaitSpringTemplateList")
    /* renamed from: pa0.a$a */
    public static final class C62212a extends C66704d {

        /* renamed from: d */
        public Object f176881d;

        /* renamed from: e */
        public /* synthetic */ Object f176882e;

        /* renamed from: f */
        public final /* synthetic */ C62211a f176883f;

        /* renamed from: g */
        public int f176884g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62212a(C62211a aVar, C15601d<? super C62212a> dVar) {
            super(dVar);
            this.f176883f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f176882e = obj;
            this.f176884g |= Integer.MIN_VALUE;
            return this.f176883f.mo87295e3(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$awaitSpringTemplateList$2$1", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {528}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.a$b */
    public static final class C62213b extends C91594j implements C32227p<C0000n0, C15601d<? super List<? extends C55319n1.C55323d>>, Object> {

        /* renamed from: d */
        public int f176885d;

        /* renamed from: e */
        public final /* synthetic */ C62211a f176886e;

        /* renamed from: f */
        public final /* synthetic */ List<pr4> f176887f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62213b(C62211a aVar, List<? extends pr4> list, C15601d<? super C62213b> dVar) {
            super(2, dVar);
            this.f176886e = aVar;
            this.f176887f = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62213b(this.f176886e, this.f176887f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62213b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0084 A[LOOP:0: B:14:0x007e->B:16:0x0084, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r4.f176885d
                java.lang.String r2 = "MicroMsg.SnsTemplate.TemplateControlUIC"
                r3 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r3) goto L_0x000f
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x0043
            L_0x000f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0017:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.String r5 = "show wecaht backend list"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
                pa0.a r5 = r4.f176886e
                boolean r1 = r5.f176866i
                if (r1 == 0) goto L_0x006d
                bl3.r r1 = bl3.C39818r.f106831a
                android.app.Activity r5 = r5.getContext()
                bl3.r$a r5 = r1.mo62443b(r5)
                java.lang.Class<la0.a> r1 = la0.C61242a.class
                bl3.c r5 = r5.mo62447c(r1)
                la0.a r5 = (la0.C61242a) r5
                java.util.List<te3.pr4> r1 = r4.f176887f
                r4.f176885d = r3
                java.lang.Object r5 = r5.mo86205G1(r1, r4)
                if (r5 != r0) goto L_0x0043
                return r0
            L_0x0043:
                java.util.List r5 = (java.util.List) r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "template list filter before: "
                r0.append(r1)
                java.util.List<te3.pr4> r1 = r4.f176887f
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = " after: "
                r0.append(r1)
                int r1 = r5.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x006f
            L_0x006d:
                java.util.List<te3.pr4> r5 = r4.f176887f
            L_0x006f:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = sx3.C36907w.m41090l(r5, r1)
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L_0x007e:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0094
                java.lang.Object r1 = r5.next()
                te3.pr4 r1 = (te3.pr4) r1
                com.tencent.mm.mj_template.sns.compose.widget.n1$d$a r2 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d.f157561i
                com.tencent.mm.mj_template.sns.compose.widget.n1$d r1 = r2.mo76616a(r1)
                r0.add(r1)
                goto L_0x007e
            L_0x0094:
                pa0.a r5 = r4.f176886e
                com.tencent.mm.mj_template.sns.compose.widget.y1 r5 = r5.mo87297g3()
                r5.mo76620c(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pa0.C62211a.C62213b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {266, 277, 279, 292}, mo125471m = "beforeInitMovieSession")
    /* renamed from: pa0.a$c */
    public static final class C62214c extends C66704d {

        /* renamed from: d */
        public Object f176888d;

        /* renamed from: e */
        public Object f176889e;

        /* renamed from: f */
        public Object f176890f;

        /* renamed from: g */
        public Object f176891g;

        /* renamed from: h */
        public /* synthetic */ Object f176892h;

        /* renamed from: i */
        public final /* synthetic */ C62211a f176893i;

        /* renamed from: j */
        public int f176894j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62214c(C62211a aVar, C15601d<? super C62214c> dVar) {
            super(dVar);
            this.f176893i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f176892h = obj;
            this.f176894j |= Integer.MIN_VALUE;
            return this.f176893i.mo75243f0(this);
        }
    }

    /* renamed from: pa0.a$d */
    public static final class C62215d extends C87413o implements C32224a<MMComposeView> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62215d(C62211a aVar) {
            super(0);
            this.f176895d = aVar;
        }

        public Object invoke() {
            return (MMComposeView) this.f176895d.findViewById(C0966R.C0970id.bks);
        }
    }

    /* renamed from: pa0.a$e */
    public static final class C62216e extends C87413o implements C32224a<e94> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62216e(C62211a aVar) {
            super(0);
            this.f176896d = aVar;
        }

        public Object invoke() {
            byte[] byteArrayExtra = this.f176896d.getIntent().getByteArrayExtra("key_video_template_info");
            if (byteArrayExtra == null) {
                return null;
            }
            e94 e94 = new e94();
            try {
                e94.parseFrom(byteArrayExtra);
                return e94;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                return e94;
            }
        }
    }

    /* renamed from: pa0.a$f */
    public static final class C62217f extends C87413o implements C32224a<C66581h> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62217f(C62211a aVar) {
            super(0);
            this.f176897d = aVar;
        }

        public Object invoke() {
            C66581h hVar = new C66581h(this.f176897d.getContext());
            hVar.mo90633a(this.f176897d.getString(C0966R.string.gss));
            return hVar;
        }
    }

    /* renamed from: pa0.a$g */
    public static final class C62218g extends C87413o implements C32224a<C55304k> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62218g(C62211a aVar) {
            super(0);
            this.f176898d = aVar;
        }

        public Object invoke() {
            C55304k kVar = new C55304k(this.f176898d.getMainScope());
            kVar.f157517d = new C62235l(this.f176898d);
            return kVar;
        }
    }

    /* renamed from: pa0.a$h */
    public static final class C62219h implements C54679b {

        /* renamed from: a */
        public final /* synthetic */ C62211a f176899a;

        public C62219h(C62211a aVar) {
            this.f176899a = aVar;
        }

        /* renamed from: a */
        public void mo75602a(String str) {
            C87412m.m108594g(str, "songId");
            C24789f.f70694a.mo51769a(this.f176899a.mo87297g3().mo76618a(), str);
        }
    }

    /* renamed from: pa0.a$i */
    public static final class C62220i implements C55302j {

        /* renamed from: a */
        public int f176900a;

        /* renamed from: b */
        public String f176901b = "";

        /* renamed from: a */
        public void mo76610a() {
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelClose: ");
            if (this.f176901b.length() > 0) {
                C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "musicSearchClk", String.valueOf(this.f176900a), C60242i.APPEND, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            }
            this.f176901b = "";
            this.f176900a = 0;
        }

        /* renamed from: b */
        public void mo76611b() {
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelShow: ");
            C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "musicSearchFlag", 1, (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
            this.f176901b = "";
            this.f176900a = 0;
        }

        /* renamed from: c */
        public void mo76612c(String str) {
            C60242i iVar = C60242i.APPEND;
            C87412m.m108594g(str, "keyword");
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onSearch: ");
            if (this.f176901b.length() > 0) {
                C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "musicSearchClk", String.valueOf(this.f176900a), iVar, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            }
            this.f176900a = 0;
            this.f176901b = str;
            C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "musicSearchKw", str, iVar, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
        }

        /* renamed from: d */
        public void mo76613d(String str) {
            C87412m.m108594g(str, "musicId");
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onMusicSelected: ");
            this.f176900a++;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$onCreateBefore$1$1", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.a$j */
    public static final class C62221j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62221j(C62211a aVar, C15601d<? super C62221j> dVar) {
            super(2, dVar);
            this.f176902d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62221j(this.f176902d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62221j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            JSONArray jSONArray = new JSONArray();
            for (GalleryItem$MediaItem galleryItem$MediaItem : this.f176902d.f176861d) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("md5", C90193h.m112876d(galleryItem$MediaItem.f162747d));
                jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, 2);
                boolean z = galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem;
                int i = 0;
                jSONObject.put("dur", z ? ((GalleryItem$VideoMediaItem) galleryItem$MediaItem).f162766w : 0);
                if (z) {
                    MultiMediaVideoChecker multiMediaVideoChecker = MultiMediaVideoChecker.f273077a;
                    String str = ((GalleryItem$VideoMediaItem) galleryItem$MediaItem).f162747d;
                    C87412m.m108593f(str, "mediaInfo.originalPath");
                    C63679m.C63680a b = multiMediaVideoChecker.mo129930b(str);
                    jSONObject.put("height", b != null ? b.f180526b : 0);
                    if (b != null) {
                        i = b.f180525a;
                    }
                    jSONObject.put("width", i);
                } else {
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(galleryItem$MediaItem.f162747d);
                    jSONObject.put("height", imageOptions != null ? imageOptions.outHeight : 0);
                    if (imageOptions != null) {
                        i = imageOptions.outWidth;
                    }
                    jSONObject.put("width", i);
                }
                jSONArray.put(jSONObject);
            }
            String jSONArray2 = jSONArray.toString();
            C87412m.m108593f(jSONArray2, "JSONArray().also { array…             }.toString()");
            C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "mediadetail", "data", jSONArray2, (C60242i) null, false, (String) null, (String) null, 208, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$onCreateBefore$2", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {439}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.a$k */
    public static final class C62222k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f176903d;

        /* renamed from: e */
        public final /* synthetic */ C62211a f176904e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62222k(C62211a aVar, C15601d<? super C62222k> dVar) {
            super(2, dVar);
            this.f176904e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62222k(this.f176904e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62222k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f176903d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C62211a aVar2 = this.f176904e;
                this.f176903d = 1;
                if (aVar2.mo87295e3(this) == aVar) {
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

    /* renamed from: pa0.a$l */
    public static final class C62223l<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176905d;

        public C62223l(C62211a aVar) {
            this.f176905d = aVar;
        }

        public void onChanged(Object obj) {
            List list = (List) obj;
            C55366y1 g3 = this.f176905d.mo87297g3();
            C87412m.m108593f(list, LocaleUtil.ITALIAN);
            g3.mo76621d(list);
            this.f176905d.mo87298i3();
        }
    }

    /* renamed from: pa0.a$m */
    public static final class C62224m implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176906d;

        public C62224m(C62211a aVar) {
            this.f176906d = aVar;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "surfaceChanged() called with: holder = " + surfaceHolder + ", format = " + i + ", width = " + i2 + ", height = " + i3);
            ((C61242a) C39818r.f106831a.mo62443b(this.f176906d.getContext()).mo62447c(C61242a.class)).notifySurfaceChanged(i, i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "surfaceChanged: ");
            ((C61242a) C39818r.f106831a.mo62443b(this.f176906d.getContext()).mo62447c(C61242a.class)).mo86213O1(surfaceHolder.getSurface());
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "surfaceDestroyed: ");
            ((C61242a) C39818r.f106831a.mo62443b(this.f176906d.getContext()).mo62447c(C61242a.class)).mo86213O1((Surface) null);
        }
    }

    /* renamed from: pa0.a$n */
    public static final class C62225n extends C87413o implements C32224a<C55366y1> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62225n(C62211a aVar) {
            super(0);
            this.f176907d = aVar;
        }

        public Object invoke() {
            C55366y1 y1Var = new C55366y1(this.f176907d.getMainScope(), this.f176907d.f176863f, C64186f0.f181907d, true);
            C62211a aVar = this.f176907d;
            y1Var.f157671g = new C62249s(aVar);
            y1Var.f157678n = new C62250t(aVar);
            return y1Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62211a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C13602i iVar = C13602i.NONE;
        this.f176862e = C36568h.m40986b(iVar, new C62215d(this));
        this.f176863f = new ArrayList();
        this.f176864g = C36568h.m40986b(iVar, new C62216e(this));
        C46974e eVar = C46974e.f126289a;
        this.f176865h = !eVar.mo72161c(C104160f.RepairerConfig_Maas_SnsSpringStrategy_Int, "SnsVideoTemplateMiaojianRecommendEnabled", true);
        this.f176866i = eVar.mo72161c(C104160f.RepairerConfig_Maas_SnsSpringOfflineStrategy_Int, "SnsVideoTemplateCdnDownloadDisabled", false);
        this.f176867j = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f176869o = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
        StringBuilder sb = new StringBuilder();
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        sb.append(C112760b.m154236i0("SnsTemplateExport").mo119971i());
        sb.append(XVFSFile.SEPARATOR_CHAR);
        this.f176870p = sb.toString();
        this.f176873s = C36568h.m40986b(iVar, new C62217f(this));
        this.f176874t = C36568h.m40986b(iVar, new C62225n(this));
        this.f176875u = C36568h.m40986b(iVar, new C62218g(this));
        this.f176876v = new C62220i();
        this.f176877w = new C62219h(this);
        this.f176878x = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);
        this.f176879y = C108500f2.m146996c(Double.valueOf(0.0d), (C108497e2) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m73132c3(pa0.C62211a r8, java.lang.String r9, wx3.C15601d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof pa0.C62236m
            if (r0 == 0) goto L_0x0016
            r0 = r10
            pa0.m r0 = (pa0.C62236m) r0
            int r1 = r0.f176926i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f176926i = r1
            goto L_0x001b
        L_0x0016:
            pa0.m r0 = new pa0.m
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f176924g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f176926i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r8 = r0.f176922e
            gy3.a0 r8 = (gy3.C8477a0) r8
            java.lang.Object r9 = r0.f176921d
            pa0.a r9 = (pa0.C62211a) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00bb
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            java.lang.Object r8 = r0.f176923f
            gy3.a0 r8 = (gy3.C8477a0) r8
            java.lang.Object r9 = r0.f176922e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f176921d
            pa0.a r2 = (pa0.C62211a) r2
            kotlin.ResultKt.throwOnFailure(r10)
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
            goto L_0x008d
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r10)
            y90.h r10 = r8.mo87296f3()
            r2 = 2131832926(0x7f11305e, float:1.929892E38)
            java.lang.String r2 = r8.getString(r2)
            r10.mo90633a(r2)
            r10.show()
            gy3.a0 r10 = new gy3.a0
            r10.<init>()
            bl3.r r2 = bl3.C39818r.f106831a
            android.app.Activity r6 = r8.getContext()
            bl3.r$a r2 = r2.mo62443b(r6)
            java.lang.Class<la0.a> r6 = la0.C61242a.class
            bl3.c r2 = r2.mo62447c(r6)
            la0.a r2 = (la0.C61242a) r2
            r0.f176921d = r8
            r0.f176922e = r9
            r0.f176923f = r10
            r0.f176926i = r4
            java.lang.Object r2 = r2.mo86202A1(r9, r0)
            if (r2 != r1) goto L_0x008d
            goto L_0x00e4
        L_0x008d:
            d14.f r2 = (d14.C45252f) r2
            if (r2 == 0) goto L_0x00bf
            pa0.n r4 = new pa0.n
            r4.<init>(r8, r5)
            d14.t r6 = new d14.t
            r6.<init>(r2, r4)
            pa0.o r2 = new pa0.o
            r2.<init>(r10, r8, r9, r5)
            d14.q r9 = new d14.q
            r9.<init>(r6, r2)
            pa0.p r2 = new pa0.p
            r2.<init>(r8)
            r0.f176921d = r8
            r0.f176922e = r10
            r0.f176923f = r5
            r0.f176926i = r3
            java.lang.Object r9 = r9.mo31880a(r2, r0)
            if (r9 != r1) goto L_0x00b9
            goto L_0x00e4
        L_0x00b9:
            r9 = r8
            r8 = r10
        L_0x00bb:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r10 = r8
            r8 = r9
        L_0x00bf:
            if (r5 != 0) goto L_0x00de
            java.lang.String r9 = "MicroMsg.SnsTemplate.TemplateControlUIC"
            java.lang.String r0 = "unexpected null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            y90.h r9 = r8.mo87296f3()
            r9.dismiss()
            android.app.Activity r9 = r8.getContext()
            r0 = 2131822946(0x7f110962, float:1.9278678E38)
            java.lang.String r8 = r8.getString(r0)
            nj3.C76912y0.m92767f(r9, r8)
        L_0x00de:
            boolean r8 = r10.f27482d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
        L_0x00e4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62211a.m73132c3(pa0.a, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public static final void m73133d3(C62211a aVar) {
        aVar.getClass();
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "preloadMusic: ");
        C61242a aVar2 = (C61242a) C39818r.f106831a.mo62443b(aVar.getContext()).mo62447c(C61242a.class);
        List<MJMusicInfo> value = aVar2.mo86217Z0().mo86231c().getValue();
        if (value == null) {
            Log.m105928w("MicroMsg.SnsTemplate.TemplateControlUIC", "preloadMusic: music info list is null");
            return;
        }
        MJMusicInfo value2 = aVar2.mo86217Z0().mo86230b().getValue();
        String musicID = value2 != null ? value2.getMusicID() : null;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(value, 10));
        for (MJMusicInfo musicID2 : value) {
            arrayList.add(musicID2.getMusicID());
        }
        int indexOf = arrayList.indexOf(musicID);
        C108221t.f324032a.mo158633m(C64186f0.f181907d, arrayList.subList(Math.max(0, indexOf), Math.min(indexOf + 3, arrayList.size())));
    }

    /* renamed from: W1 */
    public void mo86237W1() {
        SurfaceHolder holder;
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onMovieSessionCreated: ");
        ((C108494d2) this.f176867j).setValue(new SurfaceView(getActivity()));
        SurfaceView surfaceView = (SurfaceView) ((C108494d2) this.f176867j).getValue();
        if (surfaceView != null) {
            surfaceView.setVisibility(4);
        }
        SurfaceView surfaceView2 = (SurfaceView) ((C108494d2) this.f176867j).getValue();
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.addCallback(new C62224m(this));
        }
    }

    /* renamed from: d0 */
    public void mo86238d0() {
        Integer num;
        T t;
        C60242i iVar = C60242i.APPEND;
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPreview");
        mo87296f3().dismiss();
        SurfaceView surfaceView = (SurfaceView) ((C108494d2) this.f176867j).getValue();
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        ((C108494d2) this.f176869o).setValue(Boolean.TRUE);
        mo87300k3();
        String a = mo87297g3().mo76618a();
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85927k("SnsTemplate", "egpreviewcnt", 1, iVar);
        C60960c.C60961a aVar2 = aVar;
        String str = "SnsTemplate";
        C60960c.C60961a.m71445p(aVar2, "SnsTemplate", "editdetail", "td", Integer.valueOf(this.f176872r), (C60242i) null, true, "egtd", (String) null, 144, (Object) null);
        C60960c.C60961a.m71445p(aVar2, "SnsTemplate", "editdetail", "maasSessionKey", C60781a.f173118a, (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        C60960c.C60961a.m71445p(aVar2, "SnsTemplate", "editdetail", "egid", a, (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        Iterator<T> it = mo87297g3().mo76619b().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C55319n1) t).f157555a, a)) {
                break;
            }
        }
        C55319n1 n1Var = (C55319n1) t;
        if (n1Var != null) {
            num = Integer.valueOf(mo87297g3().mo76619b().indexOf(n1Var));
        }
        C60960c.C60961a aVar3 = C60960c.f173618a;
        C60960c.C60961a aVar4 = aVar3;
        C60960c.C60961a.m71445p(aVar4, "SnsTemplate", "editdetail", "eglocation", Integer.valueOf(num != null ? num.intValue() : 0), (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        C60960c.C60961a.m71445p(aVar4, "SnsTemplate", "editdetail", "vediotime", Long.valueOf(((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class)).mo86219c0()), (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        aVar3.mo85926j("SnsPublishProcess", "Maaskey", C60781a.f173118a);
        C60960c.C60961a.m71445p(aVar4, "SnsTemplate", "mediadetail", "maasSessionKey", C60781a.f173118a, (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        C60960c.C60961a.m71445p(aVar3, "SnsTemplate", "editdetail", "musicSearchFlag", (Object) null, (C60242i) null, false, (String) null, (String) null, 240, (Object) null);
        aVar3.mo85927k(str, "musiccnt", 0, iVar);
        String str2 = a;
        C60960c.C60961a.m71445p(aVar3, "SnsTemplate", "editdetail", "musiccnt", 0, iVar, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
        C24789f.f70694a.mo51769a(str2, "");
        mo87299j3(str2);
        this.f176880z = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87295e3(wx3.C15601d<? super java.util.List<com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pa0.C62211a.C62212a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            pa0.a$a r0 = (pa0.C62211a.C62212a) r0
            int r1 = r0.f176884g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f176884g = r1
            goto L_0x0018
        L_0x0013:
            pa0.a$a r0 = new pa0.a$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f176882e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f176884g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.f176881d
            pa0.a r0 = (pa0.C62211a) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0037:
            java.lang.Object r2 = r0.f176881d
            pa0.a r2 = (pa0.C62211a) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0053
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r8)
            qa0.b r8 = qa0.C62586b.f177739a
            r2 = 3
            r0.f176881d = r7
            r0.f176884g = r5
            java.lang.String r5 = "cache_key_sns"
            java.lang.Object r8 = r8.mo87645e(r2, r5, r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r7
        L_0x0053:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0073
            a14.h0 r5 = a14.C53872d1.f151117a
            a14.k2 r5 = f14.C58901s.f168555a
            pa0.a$b r6 = new pa0.a$b
            r6.<init>(r2, r8, r3)
            r0.f176881d = r2
            r0.f176884g = r4
            java.lang.Object r8 = a14.C53895h.m60469g(r5, r6, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0 = r2
        L_0x006c:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0072
            r3 = r8
            goto L_0x0083
        L_0x0072:
            r2 = r0
        L_0x0073:
            com.tencent.mm.mj_template.sns.compose.widget.y1 r8 = r2.mo87297g3()
            sx3.f0 r0 = sx3.C64186f0.f181907d
            r8.mo76620c(r0)
            java.lang.String r8 = "MicroMsg.SnsTemplate.TemplateControlUIC"
            java.lang.String r0 = "get template list info error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0083:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62211a.mo87295e3(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v46, types: [bl3.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b7 A[LOOP:0: B:54:0x01b1->B:56:0x01b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0304  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75243f0(wx3.C15601d<? super rx3.C13598b0> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Class<la0.a> r2 = la0.C61242a.class
            boolean r3 = r1 instanceof pa0.C62211a.C62214c
            if (r3 == 0) goto L_0x0019
            r3 = r1
            pa0.a$c r3 = (pa0.C62211a.C62214c) r3
            int r4 = r3.f176894j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f176894j = r4
            goto L_0x001e
        L_0x0019:
            pa0.a$c r3 = new pa0.a$c
            r3.<init>(r0, r1)
        L_0x001e:
            java.lang.Object r1 = r3.f176892h
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f176894j
            java.lang.String r6 = ""
            java.lang.String r7 = "it.templateId"
            r8 = 4
            r9 = 0
            java.lang.String r10 = "MicroMsg.SnsTemplate.TemplateControlUIC"
            r11 = 2131822944(0x7f110960, float:1.9278674E38)
            r13 = 1
            r14 = 2
            r15 = 3
            if (r5 == 0) goto L_0x008d
            if (r5 == r13) goto L_0x0078
            if (r5 == r14) goto L_0x0062
            if (r5 == r15) goto L_0x0051
            if (r5 != r8) goto L_0x0049
            java.lang.Object r4 = r3.f176889e
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r3 = r3.f176888d
            pa0.a r3 = (pa0.C62211a) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0205
        L_0x0049:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0051:
            java.lang.Object r5 = r3.f176890f
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r3.f176889e
            gy3.f0 r7 = (gy3.C8479f0) r7
            java.lang.Object r13 = r3.f176888d
            pa0.a r13 = (pa0.C62211a) r13
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0173
        L_0x0062:
            java.lang.Object r5 = r3.f176890f
            gy3.f0 r5 = (gy3.C8479f0) r5
            java.lang.Object r7 = r3.f176889e
            la0.a r7 = (la0.C61242a) r7
            java.lang.Object r13 = r3.f176888d
            pa0.a r13 = (pa0.C62211a) r13
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r7
            r7 = r5
        L_0x0074:
            r5 = r16
            goto L_0x0158
        L_0x0078:
            java.lang.Object r5 = r3.f176891g
            te3.e94 r5 = (te3.e94) r5
            java.lang.Object r13 = r3.f176890f
            gy3.f0 r13 = (gy3.C8479f0) r13
            java.lang.Object r12 = r3.f176889e
            la0.a r12 = (la0.C61242a) r12
            java.lang.Object r15 = r3.f176888d
            pa0.a r15 = (pa0.C62211a) r15
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0106
        L_0x008d:
            kotlin.ResultKt.throwOnFailure(r1)
            bl3.r r1 = bl3.C39818r.f106831a
            android.app.Activity r5 = r17.getContext()
            bl3.r$a r1 = r1.mo62443b(r5)
            bl3.c r1 = r1.mo62447c(r2)
            r12 = r1
            la0.a r12 = (la0.C61242a) r12
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            ja0.f r5 = ja0.C24789f.f70694a
            rx3.g r5 = r0.f176864g
            java.lang.Object r5 = r5.getValue()
            te3.e94 r5 = (te3.e94) r5
            if (r5 == 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = 0
        L_0x00b5:
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct r15 = ja0.C24789f.f70695b
            if (r5 == 0) goto L_0x00bb
            r5 = 2
            goto L_0x00bc
        L_0x00bb:
            r5 = 1
        L_0x00bc:
            r15.f69541v = r5
            rx3.g r5 = r0.f176864g
            java.lang.Object r5 = r5.getValue()
            te3.e94 r5 = (te3.e94) r5
            if (r5 == 0) goto L_0x0136
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = "cut same mode "
            r15.append(r14)
            java.lang.String r14 = r5.f182943e
            r15.append(r14)
            r14 = 32
            r15.append(r14)
            java.lang.String r14 = r5.f182944f
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            qa0.b r14 = qa0.C62586b.f177739a
            java.lang.String r15 = r5.f182943e
            gy3.C87412m.m108593f(r15, r7)
            r3.f176888d = r0
            r3.f176889e = r12
            r3.f176890f = r1
            r3.f176891g = r5
            r3.f176894j = r13
            java.lang.Object r13 = r14.mo87644d(r15, r8, r3)
            if (r13 != r4) goto L_0x0100
            return r4
        L_0x0100:
            r15 = r0
            r16 = r13
            r13 = r1
            r1 = r16
        L_0x0106:
            te3.pr4 r1 = (te3.pr4) r1
            if (r1 == 0) goto L_0x010f
            r13.f27484d = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0110
        L_0x010f:
            r1 = r9
        L_0x0110:
            if (r1 != 0) goto L_0x0129
            java.lang.String r1 = "get template info error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            android.app.Activity r1 = r15.getContext()
            java.lang.String r14 = r15.getString(r11)
            nj3.C76912y0.m92767f(r1, r14)
            android.app.Activity r1 = r15.getContext()
            r1.finish()
        L_0x0129:
            java.lang.String r1 = r5.f182943e
            gy3.C87412m.m108593f(r1, r7)
            java.lang.String r5 = r5.f182944f
            r12.mo86220d1(r1, r5)
            r7 = r12
            r1 = r13
            goto L_0x0138
        L_0x0136:
            r15 = r0
            r7 = r12
        L_0x0138:
            java.lang.String r5 = "main entry mode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            ma0.e r5 = ma0.C46974e.f126289a
            r3.f176888d = r15
            r3.f176889e = r7
            r3.f176890f = r1
            r3.f176891g = r9
            r12 = 2
            r3.f176894j = r12
            java.lang.Object r5 = r5.mo72163e(r3)
            if (r5 != r4) goto L_0x0151
            return r4
        L_0x0151:
            r13 = r15
            r16 = r7
            r7 = r1
            r1 = r5
            goto L_0x0074
        L_0x0158:
            java.util.List r1 = (java.util.List) r1
            boolean r12 = r13.f176866i
            if (r12 == 0) goto L_0x01a2
            r3.f176888d = r13
            r3.f176889e = r7
            r3.f176890f = r1
            r12 = 3
            r3.f176894j = r12
            java.lang.Object r5 = r5.mo86205G1(r1, r3)
            if (r5 != r4) goto L_0x016e
            return r4
        L_0x016e:
            r16 = r5
            r5 = r1
            r1 = r16
        L_0x0173:
            java.util.List r1 = (java.util.List) r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "default list filter before: "
            r12.append(r14)
            int r14 = r5.size()
            r12.append(r14)
            java.lang.String r14 = " after: "
            r12.append(r14)
            int r14 = r1.size()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            java.util.List<te3.pr4> r12 = r13.f176863f
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.addAll(r1)
            r1 = r5
            goto L_0x01a9
        L_0x01a2:
            java.util.List<te3.pr4> r5 = r13.f176863f
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.addAll(r1)
        L_0x01a9:
            java.util.List<te3.pr4> r5 = r13.f176863f
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x01b1:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x01d9
            java.lang.Object r12 = r5.next()
            te3.pr4 r12 = (te3.pr4) r12
            qa0.b r14 = qa0.C62586b.f177739a
            r14.getClass()
            java.lang.String r14 = "template"
            gy3.C87412m.m108594g(r12, r14)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.pr4> r14 = qa0.C62586b.f177740b
            java.lang.String r15 = r12.f139919d
            java.lang.String r11 = "template.id"
            gy3.C87412m.m108593f(r15, r11)
            r14.put(r15, r12)
            r11 = 2131822944(0x7f110960, float:1.9278674E38)
            goto L_0x01b1
        L_0x01d9:
            T r5 = r7.f27484d
            te3.pr4 r5 = (te3.pr4) r5
            if (r5 == 0) goto L_0x01e6
            java.util.List<te3.pr4> r11 = r13.f176863f
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r5)
        L_0x01e6:
            java.util.List<te3.pr4> r5 = r13.f176863f
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0270
            boolean r1 = r13.f176866i
            if (r1 == 0) goto L_0x026a
            r3.f176888d = r13
            r3.f176889e = r7
            r3.f176890f = r9
            r3.f176894j = r8
            java.lang.Object r1 = r13.mo87295e3(r3)
            if (r1 != r4) goto L_0x0203
            return r4
        L_0x0203:
            r4 = r7
            r3 = r13
        L_0x0205:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0240
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.mj_template.sns.compose.widget.n1$d r1 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d) r1
            if (r1 == 0) goto L_0x0240
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "start creation preview with "
            r5.append(r7)
            java.lang.String r7 = r1.f157555a
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            bl3.r r5 = bl3.C39818r.f106831a
            android.app.Activity r7 = r3.getContext()
            bl3.r$a r5 = r5.mo62443b(r7)
            bl3.c r2 = r5.mo62447c(r2)
            la0.a r2 = (la0.C61242a) r2
            java.lang.String r1 = r1.f157555a
            r2.mo86220d1(r1, r6)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0241
        L_0x0240:
            r1 = r9
        L_0x0241:
            if (r1 != 0) goto L_0x0267
            java.lang.String r1 = "no res to creation"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            y90.h r1 = r3.mo87296f3()
            r1.dismiss()
            android.app.Activity r1 = r3.getContext()
            r2 = 2131822944(0x7f110960, float:1.9278674E38)
            java.lang.String r2 = r3.getString(r2)
            nj3.C76912y0.m92767f(r1, r2)
            android.app.Activity r1 = r3.getContext()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0267:
            r13 = r3
            r7 = r4
            goto L_0x02a2
        L_0x026a:
            java.lang.String r1 = "defaultTemplateList is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            goto L_0x02a2
        L_0x0270:
            T r3 = r7.f27484d
            if (r3 != 0) goto L_0x029c
            java.lang.String r3 = "start form main entry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            bl3.r r3 = bl3.C39818r.f106831a
            android.app.Activity r4 = r13.getContext()
            bl3.r$a r3 = r3.mo62443b(r4)
            bl3.c r2 = r3.mo62447c(r2)
            la0.a r2 = (la0.C61242a) r2
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            te3.pr4 r1 = (te3.pr4) r1
            java.lang.String r1 = r1.f139919d
            java.lang.String r3 = "defaultList[0].id"
            gy3.C87412m.m108593f(r1, r3)
            r2.mo86220d1(r1, r6)
            goto L_0x02a2
        L_0x029c:
            java.lang.String r1 = "start form cut same"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x02a2:
            ja0.f r1 = ja0.C24789f.f70694a
            java.util.List<te3.pr4> r1 = r13.f176863f
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r1, r3)
            r2.<init>(r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x02b7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02f4
            java.lang.Object r3 = r1.next()
            te3.pr4 r3 = (te3.pr4) r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = r3.f139919d
            java.lang.String r6 = "tid"
            r4.put(r6, r5)
            java.lang.String r3 = r3.f139919d
            T r5 = r7.f27484d
            te3.pr4 r5 = (te3.pr4) r5
            if (r5 == 0) goto L_0x02db
            java.lang.String r5 = r5.f139919d
            goto L_0x02dc
        L_0x02db:
            r5 = r9
        L_0x02dc:
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            java.lang.String r5 = "src"
            if (r3 == 0) goto L_0x02eb
            r3 = 0
            r4.put(r5, r3)
            r6 = 3
            goto L_0x02f0
        L_0x02eb:
            r3 = 0
            r6 = 3
            r4.put(r5, r6)
        L_0x02f0:
            r2.add(r4)
            goto L_0x02b7
        L_0x02f4:
            ja0.C24789f.f70698e = r2
            com.tencent.mm.mj_template.sns.compose.widget.y1 r1 = r13.mo87297g3()
            r1.mo76623f()
            r13.mo87298i3()
            T r2 = r7.f27484d
            if (r2 == 0) goto L_0x030e
            te3.pr4 r2 = (te3.pr4) r2
            java.lang.String r2 = r2.f139919d
            if (r2 == 0) goto L_0x031f
            r1.mo76622e(r2)
            goto L_0x031f
        L_0x030e:
            java.util.List<te3.pr4> r2 = r1.f157666b
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.pr4 r2 = (te3.pr4) r2
            if (r2 == 0) goto L_0x031f
            java.lang.String r2 = r2.f139919d
            if (r2 == 0) goto L_0x031f
            r1.mo76622e(r2)
        L_0x031f:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62211a.mo75243f0(wx3.d):java.lang.Object");
    }

    /* renamed from: f3 */
    public final C66581h mo87296f3() {
        return (C66581h) this.f176873s.getValue();
    }

    /* renamed from: g3 */
    public final C55366y1 mo87297g3() {
        return (C55366y1) this.f176874t.getValue();
    }

    /* renamed from: i3 */
    public final void mo87298i3() {
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "preloadTemplate: ");
        List<C55319n1> b = mo87297g3().mo76619b();
        ArrayList<C55319n1> arrayList = new ArrayList<>();
        Iterator<T> it = b.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C55319n1 n1Var = (C55319n1) next;
            if (n1Var.f157557c && !C112550d0.m153803w(n1Var.f157555a, "@@", false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C55319n1 n1Var2 : arrayList) {
            arrayList2.add(n1Var2.f157555a);
        }
        int indexOf = arrayList2.indexOf(mo87297g3().mo76618a());
        if (indexOf > 0) {
            ArrayList arrayList3 = new ArrayList();
            int i = indexOf - 1;
            int i2 = indexOf + 2;
            int size = arrayList2.size();
            if (i2 <= size) {
                size = i2;
            }
            arrayList3.addAll(arrayList2.subList(i, size));
            if (i > 0) {
                int size2 = arrayList2.size();
                if (i > size2) {
                    i = size2;
                }
                arrayList3.addAll(arrayList2.subList(0, i));
            }
            if (i2 < arrayList2.size()) {
                arrayList3.addAll(arrayList2.subList(i2, arrayList2.size()));
            }
            arrayList2 = arrayList3;
        }
        C108221t.f324032a.mo158633m(arrayList2, C64186f0.f181907d);
    }

    /* renamed from: j3 */
    public final void mo87299j3(String str) {
        int i;
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "refreshFinalReport: ");
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85926j("SnsTemplate", "final_egid", str);
        MJMusicOptions U0 = ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class)).mo86215U0();
        if (U0 != null) {
            String musicID = U0.getMusicInfo().getMusicID();
            if (musicID == null) {
                musicID = "";
            }
            aVar.mo85926j("SnsTemplate", "final_musicid", musicID);
            i = Integer.valueOf(Integer.valueOf(U0.getSourceType().getValue()).intValue());
        } else {
            i = 0;
        }
        aVar.mo85926j("SnsTemplate", "final_musictype", i);
    }

    /* renamed from: k3 */
    public final void mo87300k3() {
        double videoRatio = ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class)).getVideoRatio();
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "refreshScreenRatio: " + videoRatio);
        ((C108494d2) this.f176879y).setValue(Double.valueOf(videoRatio));
    }

    /* renamed from: l3 */
    public final void mo87301l3(int i) {
        if (!this.f176871q) {
            C60784e.f173126a.mo85717b(i);
            this.f176871q = true;
        }
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        mo87301l3(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo87296f3().show();
        ((MMComposeView) this.f176862e.getValue()).setContent(C110261c.m149879c(-1087136750, true, new C62234k(this, (C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class))));
        if (this.f176865h) {
            C62586b.f177739a.mo87648h(3, "cache_key_sns");
        }
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85926j("SnsTemplate", "moreAction", 2);
        aVar.mo85926j("SnsPublishProcess", "ifMiaojian", 1);
        aVar.mo85926j("SnsTemplate", "goToMJAppResult", 0);
    }

    public void onCreateBefore(Bundle bundle) {
        Class cls = C32735h.class;
        Class cls2 = C61242a.class;
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("Template_Media_List");
        if (parcelableArrayListExtra != null) {
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "media size :" + parcelableArrayListExtra.size());
            int i = 0;
            for (Object next : parcelableArrayListExtra) {
                int i2 = i + 1;
                if (i >= 0) {
                    Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "index:" + i + " path:" + ((GalleryItem$MediaItem) next).f162747d);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            this.f176861d.addAll(parcelableArrayListExtra);
        }
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "showSpringStrategy:" + this.f176865h);
        super.onCreateBefore(bundle);
        C39818r rVar = C39818r.f106831a;
        C61242a aVar = (C61242a) rVar.mo62443b(getContext()).mo62447c(cls2);
        C61242a aVar2 = (C61242a) rVar.mo62443b(getContext()).mo62447c(cls2);
        this.f176872r = C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "mediadetail", "data", "", (C60242i) null, true, (String) null, (String) null, 208, (Object) null);
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C62221j(this, (C15601d<? super C62221j>) null), 3, (Object) null);
        aVar2.setMediaList(this.f176861d);
        aVar2.mo86226s0(false);
        aVar2.mo86204E2(C100107b.f293258a);
        aVar2.mo86218b1(this);
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_sns_maas_export_max_duration;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 60);
        C46974e eVar = C46974e.f126289a;
        List<String> d = eVar.mo72162d();
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 60);
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsVideoDefaultTemplatetBgmRecommendEnabled", 1) == 1;
        Log.m105924i("SnsMaasConfigImpl", "enableDefaultBGMRecommend() called enable: " + z);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(eVar.mo72162d());
        e94 e94 = (e94) this.f176864g.getValue();
        if (e94 != null) {
            String str = e94.f182943e;
            C87412m.m108593f(str, "info.templateId");
            arrayList.add(str);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        boolean c = eVar.mo72161c(C104160f.RepairerConfig_Maas_RecommendTempalteBgmRecommendEnable_Int, "SnsVideoNondefaultTemplateBgmRecommendEnabled", true);
        Log.m105924i("SnsMaasConfigImpl", "enableRecommendBGMRecommend() called enable: " + c);
        aVar2.mo86210L0(new C61242a.C61245c(MJRecommendOptions.SCENE_MOMENT, false, false, Qe, true, d, Qe2, z, arrayList, c));
        if (this.f176865h) {
            Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "set homepage template from wechat backend");
            aVar.mo86221d2(false);
            C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C62222k(this, (C15601d<? super C62222k>) null), 3, (Object) null);
            return;
        }
        Log.m105924i("MicroMsg.SnsTemplate.TemplateControlUIC", "set homepage template from maas");
        aVar.mo86221d2(true);
        Activity context = getContext();
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar != null) {
            ((C61242a) rVar.mo62443b(getContext()).mo62447c(cls2)).mo86216U2().observe(sVar, new C62223l(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r5 = this;
            super.onDestroy()
            j0.y0 r0 = r5.f176867j
            j0.d2 r0 = (p175j0.C108494d2) r0
            r1 = 0
            r0.setValue(r1)
            com.tencent.mm.mj_template.sns.compose.widget.n1$d$a r0 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d.f157561i
            android.util.ArrayMap<java.lang.String, com.tencent.mm.mj_template.sns.compose.widget.n1$d> r0 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d.f157562j
            r0.clear()
            r0 = 5
            r5.mo87301l3(r0)
            k21.c$a r0 = k21.C60960c.f173618a
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x0023
            r1 = r2
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
        L_0x0023:
            if (r1 == 0) goto L_0x002a
            long r1 = r1.getActivityBrowseTimeMs()
            goto L_0x002c
        L_0x002a:
            r1 = 0
        L_0x002c:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            i21.i r2 = i21.C60242i.APPEND
            java.lang.String r3 = "SnsPublishProcess"
            java.lang.String r4 = "egEditTime"
            r0.mo85927k(r3, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62211a.onDestroy():void");
    }

    public void onPause() {
        super.onPause();
        C60960c.C60961a.m71445p(C60960c.f173618a, "SnsTemplate", "editdetail", "egpreviewtime", Long.valueOf(System.currentTimeMillis() - this.f176880z), C60242i.APPEND, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
    }

    public void onResume() {
        super.onResume();
        this.f176880z = System.currentTimeMillis();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            int c = C75044y4.m89991c(getActivity());
            ((C108494d2) this.f176878x).setValue(Integer.valueOf(c));
        }
    }

    /* renamed from: p */
    public void mo75247p(String str) {
        C87412m.m108594g(str, "msg");
        Log.m105920e("MicroMsg.SnsTemplate.TemplateControlUIC", "onSdkError:" + str);
        mo87296f3().dismiss();
        C76912y0.m92767f(getContext(), getContext().getString(C0966R.string.lqd));
        getContext().finish();
    }

    /* renamed from: w */
    public void mo86239w(float f) {
        C66581h f3 = mo87296f3();
        String string = getResources().getString(C0966R.string.gst, new Object[]{Integer.valueOf(C60641c.m70921b(f * ((float) 100)))});
        C87412m.m108593f(string, "resources.getString(\n   …oundToInt()\n            )");
        f3.mo90633a(string);
    }
}
