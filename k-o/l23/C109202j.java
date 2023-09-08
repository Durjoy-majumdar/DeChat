package l23;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.C106193d0;
import com.tencent.p014mm.plugin.vlog.model.C106195f0;
import com.tencent.p014mm.plugin.vlog.model.C106204p;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C106206s;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.MultiEditCropLayout;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.MultiEditCropOperationLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.xweb.util.WXWebReporter;
import d23.C106976a;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import i33.C98595b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l23.C109195h0;
import lh2.C99417a;
import me3.C109612c;
import me3.C109623f;
import n23.C109676b;
import qh2.C101198e;
import rx3.C13598b0;
import sx3.C64197v;
import t23.C101717a;
import wp3.C111824b;
import wp3.C111825c;
import zp3.C112660e0;

/* renamed from: l23.j */
public final class C109202j extends C99417a implements View.OnClickListener {

    /* renamed from: A */
    public boolean f326956A;

    /* renamed from: B */
    public WxCropOperationLayout.C94436h f326957B;

    /* renamed from: C */
    public final C99301e f326958C;

    /* renamed from: D */
    public C99301e f326959D;

    /* renamed from: E */
    public long f326960E;

    /* renamed from: F */
    public final C109195h0 f326961F;

    /* renamed from: G */
    public C109215k0 f326962G;

    /* renamed from: H */
    public int f326963H;

    /* renamed from: I */
    public final C106206s f326964I;

    /* renamed from: J */
    public long f326965J;

    /* renamed from: f */
    public MultiEditCropLayout f326966f;

    /* renamed from: g */
    public MultiEditCropOperationLayout f326967g;

    /* renamed from: h */
    public final Context f326968h;

    /* renamed from: i */
    public final ViewGroup f326969i;

    /* renamed from: j */
    public VideoCompositionPlayView f326970j;

    /* renamed from: n */
    public C96552p0 f326971n;

    /* renamed from: o */
    public final RectF f326972o = new RectF();

    /* renamed from: p */
    public final LinkedList<C99300b> f326973p = new LinkedList<>();

    /* renamed from: q */
    public C101717a f326974q = new C101717a();

    /* renamed from: r */
    public CropLayout.C106804b f326975r;

    /* renamed from: s */
    public long f326976s;

    /* renamed from: t */
    public long f326977t = -1;

    /* renamed from: u */
    public final RectF f326978u = new RectF();

    /* renamed from: v */
    public C106195f0 f326979v;

    /* renamed from: w */
    public int f326980w;

    /* renamed from: x */
    public TextView f326981x;

    /* renamed from: y */
    public String f326982y;

    /* renamed from: z */
    public Rect f326983z;

    /* renamed from: l23.j$b */
    public interface C99300b {
    }

    /* renamed from: l23.j$e */
    public interface C99301e {

        /* renamed from: l23.j$e$a */
        public static final class C99302a {
            /* renamed from: a */
            public static /* synthetic */ void m129467a(C99301e eVar, long j, Object obj, int i, Object obj2) {
                if (obj2 == null) {
                    if ((i & 2) != 0) {
                        obj = null;
                    }
                    eVar.mo138704k(j, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seek");
            }
        }

        /* renamed from: k */
        void mo138704k(long j, Object obj);

        void pause();

        void resume();
    }

    /* renamed from: l23.j$g */
    public static final class C99303g implements C111825c {

        /* renamed from: a */
        public final /* synthetic */ C109202j f291199a;

        public C99303g(C109202j jVar) {
            this.f291199a = jVar;
        }

        /* renamed from: a */
        public void mo138707a(long j) {
            Log.m105918d("MicroMsg.EditMultiPreviewPlugin", "onUpdateComposition: " + j);
            C101717a aVar = this.f291199a.f326974q;
            if (aVar.f297774b.size() < 50) {
                aVar.f297774b.add(Long.valueOf(j));
            }
            C115669n.INSTANCE.mo175912v(1468, 11);
            C115669n.INSTANCE.mo175913w(1468, 12, j);
        }

        /* renamed from: d */
        public void mo138708d(long j) {
            Log.m105918d("MicroMsg.EditMultiPreviewPlugin", "onSeek: " + j);
            C101717a aVar = this.f291199a.f326974q;
            if (aVar.f297773a.size() < 50) {
                aVar.f297773a.add(Long.valueOf(j));
            }
            C115669n.INSTANCE.mo175912v(1468, 1);
            C115669n.INSTANCE.mo175913w(1468, 2, j);
            if (j <= 30) {
                C115669n.INSTANCE.mo175912v(1468, 4);
            } else if (j <= 100) {
                C115669n.INSTANCE.mo175912v(1468, 5);
            } else if (j <= 500) {
                C115669n.INSTANCE.mo175912v(1468, 6);
            } else if (j <= 1000) {
                C115669n.INSTANCE.mo175912v(1468, 7);
            } else {
                C115669n.INSTANCE.mo175912v(1468, 8);
            }
        }
    }

    /* renamed from: l23.j$a */
    public static final class C109203a implements C109216l0 {

        /* renamed from: a */
        public final /* synthetic */ C109202j f326984a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f326985b;

        public C109203a(C109202j jVar, C101198e eVar) {
            this.f326984a = jVar;
            this.f326985b = eVar;
        }

        /* renamed from: a */
        public WxCropOperationLayout mo160463a() {
            return this.f326984a.f326967g;
        }

        /* renamed from: b */
        public ViewGroup mo160464b() {
            return this.f326984a.f326969i;
        }

        /* renamed from: c */
        public TextView mo160465c() {
            return this.f326984a.f326981x;
        }

        /* renamed from: d */
        public void mo160466d() {
            C101198e.C62622a.m73576a(this.f326985b, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: e */
        public CropLayout mo160467e() {
            return this.f326984a.f326966f;
        }

        public VideoCompositionPlayView getVideoView() {
            this.f326984a.mo160461y();
            VideoCompositionPlayView videoCompositionPlayView = this.f326984a.f326970j;
            C87412m.m108591d(videoCompositionPlayView);
            return videoCompositionPlayView;
        }
    }

    /* renamed from: l23.j$c */
    public interface C109204c extends C99300b {
        /* renamed from: c */
        void mo138712c(long j);

        /* renamed from: d */
        void mo138713d(C99301e eVar);

        void onFinish();
    }

    /* renamed from: l23.j$d */
    public interface C109205d extends C99300b {

        /* renamed from: l23.j$d$a */
        public static final class C109206a {
            /* renamed from: a */
            public static /* synthetic */ void m148291a(C109205d dVar, C96552p0 p0Var, long j, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        j = -1;
                    }
                    if ((i & 4) != 0) {
                        z = false;
                    }
                    dVar.mo159389s(p0Var, j, z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onUpdate");
            }
        }

        /* renamed from: s */
        void mo159389s(C96552p0 p0Var, long j, boolean z);
    }

    /* renamed from: l23.j$f */
    public static final class C109207f implements C111824b {

        /* renamed from: d */
        public final /* synthetic */ C109202j f326986d;

        public C109207f(C109202j jVar) {
            this.f326986d = jVar;
        }

        /* renamed from: b */
        public void mo79528b(long j) {
            Log.m105918d("MicroMsg.EditMultiPreviewPlugin", "onPlayProgress timeMs:" + j);
            for (C99300b bVar : this.f326986d.f326973p) {
                if (bVar instanceof C109204c) {
                    ((C109204c) bVar).mo138712c(j);
                }
            }
        }

        /* renamed from: h */
        public void mo79529h() {
        }

        /* renamed from: i */
        public void mo79530i() {
            for (C99300b bVar : this.f326986d.f326973p) {
                if (bVar instanceof C109204c) {
                    ((C109204c) bVar).onFinish();
                }
            }
        }

        /* renamed from: n */
        public void mo84658n() {
            VideoCompositionPlayView videoCompositionPlayView = this.f326986d.f326970j;
            if (videoCompositionPlayView != null && videoCompositionPlayView.isPlaying()) {
                C109202j jVar = this.f326986d;
                if (jVar.f326965J == 0) {
                    jVar.f326965J = Util.currentTicks();
                }
                C106206s sVar = this.f326986d.f326964I;
                if (sVar.f316503b == 0) {
                    sVar.f316503b = Util.currentTicks();
                } else {
                    sVar.f316502a++;
                }
                if (Util.ticksToNow(this.f326986d.f326965J) >= 1000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onFrame: fps ");
                    C106206s sVar2 = this.f326986d.f326964I;
                    int i = sVar2.f316502a;
                    sb.append(i == 0 ? 0 : (int) (((long) (i * 1000)) / Util.ticksToNow(sVar2.f316503b)));
                    Log.m105918d("MicroMsg.EditMultiPreviewPlugin", sb.toString());
                    C106206s sVar3 = this.f326986d.f326964I;
                    int i2 = sVar3.f316502a;
                    int ticksToNow = i2 == 0 ? 0 : (int) (((long) (i2 * 1000)) / Util.ticksToNow(sVar3.f316503b));
                    if (ticksToNow > 60) {
                        C115669n.INSTANCE.mo175912v(1468, 21);
                    } else if (ticksToNow > 40) {
                        C115669n.INSTANCE.mo175912v(1468, 22);
                    } else if (ticksToNow > 30) {
                        C115669n.INSTANCE.mo175912v(1468, 23);
                    } else if (ticksToNow > 20) {
                        C115669n.INSTANCE.mo175912v(1468, 24);
                    } else if (ticksToNow > 10) {
                        C115669n.INSTANCE.mo175912v(1468, 25);
                    } else {
                        C115669n.INSTANCE.mo175912v(1468, 26);
                    }
                    C109202j jVar2 = this.f326986d;
                    jVar2.f326965J = 0;
                    C106206s sVar4 = jVar2.f326964I;
                    sVar4.f316503b = 0;
                    sVar4.f316502a = 0;
                }
            }
        }

        /* renamed from: o */
        public void mo79531o() {
            long j;
            C109202j jVar = this.f326986d;
            for (C99300b bVar : jVar.f326973p) {
                if (bVar instanceof C109204c) {
                    ((C109204c) bVar).mo138713d(jVar.f326958C);
                }
            }
            C109202j jVar2 = this.f326986d;
            VideoCompositionPlayView videoCompositionPlayView = jVar2.f326970j;
            if (videoCompositionPlayView != null) {
                j = videoCompositionPlayView.getPosition();
            } else {
                C96552p0 p0Var = jVar2.f326971n;
                j = 0 - ((p0Var != null ? p0Var.mo134615l() : 0) / ((long) 1000));
            }
            C109202j jVar3 = this.f326986d;
            C99301e eVar = jVar3.f326959D;
            if (eVar != null) {
                C99301e.C99302a.m129467a(eVar, jVar3.f326960E + j, (Object) null, 2, (Object) null);
            }
        }

        /* renamed from: r */
        public void mo79532r() {
            VideoCompositionPlayView videoCompositionPlayView = this.f326986d.f326970j;
            C87412m.m108592e(videoCompositionPlayView, "null cannot be cast to non-null type android.view.View");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(videoCompositionPlayView, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            videoCompositionPlayView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C101198e.C62622a.m73576a(this.f326986d.f291492d, C101198e.C101199b.EDIT_VIDEO_PREPARE, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: u */
        public void mo79533u() {
        }
    }

    /* renamed from: l23.j$h */
    public static final class C109208h extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ boolean f326987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109208h(boolean z) {
            super(1);
            this.f326987d = z;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Matrix) obj, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f326987d);
        }
    }

    /* renamed from: l23.j$i */
    public static final class C109209i implements WxCropOperationLayout.C105987g {

        /* renamed from: a */
        public boolean f326988a = true;

        /* renamed from: b */
        public final /* synthetic */ C109202j f326989b;

        /* renamed from: c */
        public final /* synthetic */ long f326990c;

        /* renamed from: d */
        public final /* synthetic */ C106205q0 f326991d;

        public C109209i(C109202j jVar, long j, C106205q0 q0Var) {
            this.f326989b = jVar;
            this.f326990c = j;
            this.f326991d = q0Var;
        }

        /* renamed from: a */
        public void mo151325a(boolean z) {
        }

        /* renamed from: b */
        public void mo151326b(boolean z) {
            this.f326988a = false;
        }

        /* renamed from: c */
        public void mo151327c(RectF rectF) {
            LinkedList<C106205q0> linkedList;
            float f;
            C87412m.m108594g(rectF, "rectF");
            C109202j jVar = this.f326989b;
            long j = this.f326990c;
            long j2 = jVar.f326976s;
            if (j2 == j || j2 == 0) {
                jVar.f326978u.set(rectF);
            }
            C109202j jVar2 = this.f326989b;
            C106195f0 f0Var = jVar2.f326979v;
            if (!(f0Var == null || (linkedList = f0Var.f316428g) == null)) {
                C106205q0 q0Var = this.f326991d;
                for (C106205q0 q0Var2 : linkedList) {
                    C106204p pVar = q0Var2.f316498i;
                    rectF.round(pVar.f316484b);
                    if (!C87412m.m108589b(q0Var, q0Var2) && !jVar2.f326956A) {
                        Rect rect = pVar.f316484b;
                        int i = rect.bottom;
                        Rect rect2 = pVar.f316486d;
                        int i2 = i - rect2.bottom;
                        int i3 = rect.top - rect2.top;
                        if (i2 > 0 || i3 < 0) {
                            Matrix matrix = new Matrix();
                            RectF rectF2 = new RectF(pVar.f316486d);
                            float height = rectF.height() / rectF2.height();
                            if (height < 1.0f) {
                                f = i3 < 0 ? (float) i3 : (float) i2;
                                height = 1.0f;
                            } else {
                                f = rectF.centerY() - rectF2.centerY();
                            }
                            matrix.postTranslate(0.0f, f);
                            matrix.postScale(height, height, rectF.centerX(), rectF.centerY());
                            matrix.mapRect(rectF2);
                            rectF2.round(pVar.f316486d);
                            pVar.f316483a.postConcat(matrix);
                        }
                    }
                }
            }
            this.f326989b.f326966f.mo152391w(rectF, false);
            CropLayout.C106804b bVar = this.f326989b.f326975r;
            if (bVar != null) {
                bVar.onChange();
            }
            if (!this.f326988a) {
                this.f326989b.f326980w++;
            }
            this.f326988a = true;
        }
    }

    /* renamed from: l23.j$j */
    public static final class C109210j implements CropLayout.C106805c {

        /* renamed from: a */
        public float f326992a = 1.0f;

        /* renamed from: b */
        public final /* synthetic */ C106205q0 f326993b;

        /* renamed from: c */
        public final /* synthetic */ C112660e0 f326994c;

        /* renamed from: d */
        public final /* synthetic */ C109202j f326995d;

        public C109210j(C106205q0 q0Var, C112660e0 e0Var, C109202j jVar) {
            this.f326993b = q0Var;
            this.f326994c = e0Var;
            this.f326995d = jVar;
        }

        /* renamed from: a */
        public void mo154489a() {
            C106205q0 q0Var = this.f326993b;
            if (!(this.f326992a == C106193d0.m142869a(q0Var.f316498i.f316483a))) {
                q0Var.f316500k.scaleCount++;
                return;
            }
            q0Var.f316500k.dragCount++;
        }

        /* renamed from: b */
        public void mo154490b() {
            this.f326992a = C106193d0.m142869a(this.f326993b.f316498i.f316483a);
        }

        public void onChange() {
            float[] fArr = new float[9];
            this.f326993b.f316498i.f316483a.getValues(fArr);
            float f = fArr[0];
            double d = (double) fArr[3];
            if (((float) Math.sqrt(((double) (f * f)) + (d * d))) > 0.0f) {
                C109623f presenter = this.f326994c.getPresenter();
                float[] fArr2 = new float[9];
                this.f326993b.f316498i.f316483a.getValues(fArr2);
                float f2 = fArr2[0];
                double d2 = (double) (f2 * f2);
                double d3 = (double) fArr2[3];
                ((C109612c) presenter).f328158a.getBaseBoardView().setInitScale(((float) 1) / ((float) Math.sqrt(d2 + (d3 * d3))));
            }
            C109202j jVar = this.f326995d;
            if (!jVar.f326956A) {
                this.f326993b.f316498i.f316486d.set(jVar.f326966f.getContentRect());
            }
        }
    }

    /* renamed from: l23.j$k */
    public static final class C109211k implements WxCropOperationLayout.C105987g {

        /* renamed from: a */
        public boolean f326996a = true;

        /* renamed from: b */
        public final /* synthetic */ C109202j f326997b;

        public C109211k(C109202j jVar) {
            this.f326997b = jVar;
        }

        /* renamed from: a */
        public void mo151325a(boolean z) {
            WxCropOperationLayout.C105987g b;
            C109215k0 k0Var = this.f326997b.f326962G;
            if (k0Var != null && (b = k0Var.mo160436b()) != null) {
                b.mo151325a(z);
            }
        }

        /* renamed from: b */
        public void mo151326b(boolean z) {
            WxCropOperationLayout.C105987g b;
            C109215k0 k0Var = this.f326997b.f326962G;
            if (!(k0Var == null || (b = k0Var.mo160436b()) == null)) {
                b.mo151326b(z);
            }
            this.f326996a = false;
        }

        /* renamed from: c */
        public void mo151327c(RectF rectF) {
            C109195h0.C109200e eVar;
            C87412m.m108594g(rectF, "rectF");
            C109215k0 k0Var = this.f326997b.f326962G;
            if (!(k0Var == null || (eVar = ((C109195h0) k0Var).f326944s) == null)) {
                eVar.mo151327c(rectF);
            }
            CropLayout.C106804b bVar = this.f326997b.f326975r;
            if (bVar != null) {
                bVar.onChange();
            }
            if (!this.f326996a) {
                this.f326997b.f326980w++;
            }
            this.f326996a = true;
        }
    }

    /* renamed from: l23.j$l */
    public static final class C109212l implements C99301e {

        /* renamed from: d */
        public final /* synthetic */ C109202j f326998d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f326999e;

        public C109212l(C109202j jVar, C101198e eVar) {
            this.f326998d = jVar;
            this.f326999e = eVar;
        }

        /* renamed from: k */
        public void mo138704k(long j, Object obj) {
            C115669n.INSTANCE.mo175912v(1468, 0);
            VideoCompositionPlayView videoCompositionPlayView = this.f326998d.f326970j;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.mo154762i(j);
            }
        }

        public void pause() {
            C101198e.C62622a.m73576a(this.f326999e, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
        }

        public void resume() {
            C101198e.C62622a.m73576a(this.f326999e, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109202j(MultiEditCropLayout multiEditCropLayout, MultiEditCropOperationLayout multiEditCropOperationLayout, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(multiEditCropLayout, "layout");
        C87412m.m108594g(multiEditCropOperationLayout, "operationLayout");
        C87412m.m108594g(eVar, "status");
        this.f326966f = multiEditCropLayout;
        this.f326967g = multiEditCropOperationLayout;
        this.f326968h = multiEditCropLayout.getContext();
        ViewParent parent = this.f326966f.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f326969i = viewGroup;
        this.f326981x = new TextView(viewGroup.getContext());
        this.f326982y = "";
        this.f326983z = new Rect();
        this.f326957B = WxCropOperationLayout.C94436h.RECT_ADJUST;
        this.f326958C = new C109212l(this, eVar);
        this.f326963H = -1;
        this.f326964I = new C106206s();
        MultiEditCropLayout multiEditCropLayout2 = this.f326966f;
        multiEditCropLayout2.setHasBorder(false);
        multiEditCropLayout2.setEnableScale(true);
        multiEditCropLayout2.setEnableFling(true);
        multiEditCropLayout2.setEnableTouch(true);
        multiEditCropLayout2.setEnableOverScroll(false);
        this.f326966f.setBackgroundColor(0);
        C109195h0 h0Var = new C109195h0(new C109203a(this, eVar));
        this.f326961F = h0Var;
        mo160452K(h0Var);
        MultiEditCropOperationLayout multiEditCropOperationLayout2 = this.f326967g;
        multiEditCropOperationLayout2.f315419F = false;
        multiEditCropOperationLayout2.setVisibility(8);
        this.f326967g.setBlockOutsideTouch(true);
    }

    /* renamed from: J */
    public static /* synthetic */ void m148263J(C109202j jVar, boolean z, boolean z2, boolean z3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            j = -1;
        }
        jVar.mo160451I(z, z2, z3, j);
    }

    /* renamed from: A */
    public final void mo160443A() {
        VideoCompositionPlayView videoCompositionPlayView = this.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154755e();
        }
    }

    /* renamed from: B */
    public final Rect mo160444B() {
        C109215k0 k0Var = this.f326962G;
        Rect e = k0Var != null ? k0Var.mo160437e() : null;
        if (e != null) {
            return e;
        }
        Rect contentRect = this.f326966f.getContentRect();
        RectF visibilityRect = this.f326966f.getVisibilityRect();
        Rect rect = new Rect();
        visibilityRect.round(rect);
        float width = (((float) contentRect.width()) * 1.0f) / ((float) this.f326966f.getContentOriginalRect().width());
        int i = rect.left - contentRect.left;
        int i2 = rect.top - contentRect.top;
        return new Rect((int) (((float) i) / width), (int) (((float) i2) / width), (int) (((float) (rect.width() + i)) / width), (int) (((float) (rect.height() + i2)) / width));
    }

    /* renamed from: C */
    public final C106204p mo160445C(String str) {
        LinkedList<C106205q0> linkedList;
        T t;
        C106204p pVar;
        C87412m.m108594g(str, "path");
        C106195f0 f0Var = this.f326979v;
        if (!(f0Var == null || (linkedList = f0Var.f316428g) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C106205q0) t).f316490a, str)) {
                    break;
                }
            }
            C106205q0 q0Var = (C106205q0) t;
            if (!(q0Var == null || (pVar = q0Var.f316498i) == null)) {
                return pVar;
            }
        }
        return new C106204p();
    }

    /* renamed from: D */
    public final RectF mo160446D() {
        return this.f326972o;
    }

    /* renamed from: E */
    public final void mo160447E() {
        this.f326967g.setVisibility(8);
    }

    /* renamed from: F */
    public final void mo160448F() {
        this.f326967g.setVisibility(0);
    }

    /* renamed from: G */
    public final C106204p mo160449G(C112660e0 e0Var, String str, boolean z) {
        LinkedList<C106205q0> linkedList;
        C112660e0 e0Var2 = e0Var;
        String str2 = str;
        C87412m.m108594g(e0Var2, "drawingView");
        C87412m.m108594g(str2, "mediaPath");
        T t = null;
        this.f326962G = null;
        C106195f0 f0Var = this.f326979v;
        if (!(f0Var == null || (linkedList = f0Var.f316428g) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C87412m.m108589b(((C106205q0) next).f316490a, str2)) {
                    t = next;
                    break;
                }
            }
            t = (C106205q0) t;
        }
        T t2 = t;
        this.f326982y = str2;
        long j = t2 != null ? (long) t2.f316493d : 0;
        if (j == this.f326977t && !z) {
            return mo160445C(str2);
        }
        if (t2 == null) {
            return mo160445C(str2);
        }
        this.f326977t = j;
        Log.m105924i("MicroMsg.EditMultiPreviewPlugin", "onPreviewImage");
        this.f326966f.mo154436B(true);
        if (!this.f326956A) {
            this.f326966f.setEnableScale(true);
        }
        WxCropOperationLayout.m142543d(this.f326967g, 0, 0, 2, (Object) null);
        int i = t2.f316495f;
        int i2 = t2.f316496g;
        this.f326966f.getVisibilityRect().set(this.f326978u);
        if (!this.f326956A) {
            this.f326967g.getVisibilityRect().set(this.f326978u);
        }
        if (0 == this.f326976s) {
            this.f326976s = j;
        }
        long j2 = this.f326976s;
        if (j2 == j || j2 == 0) {
            this.f326967g.setStyle(this.f326957B);
        } else {
            this.f326967g.setStyle(WxCropOperationLayout.C94436h.RECT_HARD);
        }
        this.f326966f.setMaxScaleValue(t2.f316498i.f316488f);
        this.f326966f.setMinScaleValue(t2.f316498i.f316489g);
        this.f326966f.mo154438D(e0Var, i, i2, t2.f316498i.f316483a, CropLayout.C97279e.CENTER_CROP, new C109208h(this.f326966f.getContentRect().isEmpty()));
        if (t2.f316498i.f316487e > 0.0f) {
            ((C109612c) e0Var.getPresenter()).f328158a.getBaseBoardView().setInitScale(((float) 1) / t2.f316498i.f316487e);
        }
        this.f326967g.setOnOperationCallback(new C109209i(this, j, t2));
        this.f326966f.setOnChangeListener(new C109210j(t2, e0Var2, this));
        this.f326966f.setClickListener(this);
        if (!this.f326956A) {
            this.f326967g.setVisibility(0);
        }
        mo160460x();
        mo160457P();
        return t2.f316498i;
    }

    /* renamed from: H */
    public final void mo160450H(boolean z) {
        m148263J(this, z, true, false, 0, 12, (Object) null);
    }

    /* renamed from: I */
    public final void mo160451I(boolean z, boolean z2, boolean z3, long j) {
        C99301e eVar;
        Log.m105924i("MicroMsg.EditMultiPreviewPlugin", "onUpdateVideo, playAfterUpdate:" + z2 + ", seekToOriginPosition:" + z3 + ", seekTo:" + j);
        this.f326982y = "";
        mo160461y();
        this.f326977t = -1;
        C106195f0 f0Var = this.f326979v;
        C109195h0.C109196a aVar = null;
        C96552p0 p0Var = f0Var != null ? f0Var.f316438t : null;
        this.f326971n = p0Var;
        if (p0Var != null) {
            p0Var.mo81185d(!z);
        }
        C96552p0 p0Var2 = this.f326971n;
        if (p0Var2 != null) {
            for (C99300b bVar : this.f326973p) {
                if (bVar instanceof C109205d) {
                    ((C109205d) bVar).mo159389s(p0Var2, j, z3);
                }
            }
        }
        C109215k0 k0Var = this.f326962G;
        if (k0Var != null) {
            ((C109195h0) k0Var).f326939n = false;
        }
        this.f326962G = this.f326961F;
        C106195f0 f0Var2 = this.f326979v;
        if (f0Var2 != null) {
            new Size(f0Var2.f316431j, f0Var2.f316432n);
            C109215k0 k0Var2 = this.f326962G;
        }
        this.f326961F.f326941p = this.f326959D;
        C109215k0 k0Var3 = this.f326962G;
        if (k0Var3 != null) {
            ((C109195h0) k0Var3).f326939n = true;
        }
        this.f326967g.setOnOperationCallback(new C109211k(this));
        this.f326966f.setClickListener(this);
        MultiEditCropLayout multiEditCropLayout = this.f326966f;
        C109215k0 k0Var4 = this.f326962G;
        if (k0Var4 != null) {
            aVar = ((C109195h0) k0Var4).f326943r;
        }
        multiEditCropLayout.setOnChangeListener(aVar);
        C96552p0 p0Var3 = this.f326971n;
        if (p0Var3 != null) {
            int i = this.f326963H;
            Log.m105924i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i);
            if (i > 0) {
                p0Var3.f282577j = i;
            }
        }
        C109215k0 k0Var5 = this.f326962G;
        if (k0Var5 != null) {
            C96552p0 p0Var4 = this.f326971n;
            C87412m.m108591d(p0Var4);
            ((C109195h0) k0Var5).mo160438f(p0Var4, z2, z3, j);
        }
        if (!this.f326956A) {
            this.f326967g.setVisibility(0);
        }
        if (z2 && (eVar = this.f326959D) != null) {
            eVar.resume();
        }
        mo160460x();
    }

    /* renamed from: K */
    public final void mo160452K(C99300b bVar) {
        C87412m.m108594g(bVar, "callback");
        if (!this.f326973p.contains(bVar)) {
            this.f326973p.add(bVar);
        }
    }

    /* renamed from: L */
    public final void mo160453L(long j) {
        VideoCompositionPlayView videoCompositionPlayView = this.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154762i(j);
        }
        C115669n.INSTANCE.mo175912v(1468, 0);
    }

    /* renamed from: M */
    public final void mo160454M(long j) {
        this.f326960E = j;
    }

    /* renamed from: N */
    public final void mo160455N(long j, long j2) {
        VideoCompositionPlayView videoCompositionPlayView = this.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154764j(j, j2);
        }
    }

    /* renamed from: O */
    public final void mo160456O(RectF rectF) {
        C87412m.m108594g(rectF, "rect");
        C109195h0 h0Var = this.f326961F;
        h0Var.getClass();
        h0Var.f326938j.set(rectF);
        this.f326978u.set(rectF);
        if (!this.f326956A) {
            this.f326967g.getVisibilityRect().set(rectF);
            this.f326967g.postInvalidate();
            this.f326967g.setVisibility(0);
        }
    }

    /* renamed from: P */
    public final void mo160457P() {
        C13598b0 b0Var;
        C109215k0 k0Var = this.f326962G;
        if (k0Var != null) {
            k0Var.mo160435a();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            if (this.f326982y.length() > 0) {
                this.f326981x.setText(C109676b.f328306a.mo160901b(C106976a.f320208a.mo157399c(this.f326982y)));
            }
        }
    }

    /* renamed from: Q */
    public final void mo160458Q(boolean z, boolean z2, boolean z3) {
        float f;
        int i;
        Class cls = C60200t1.class;
        C101198e.C101199b bVar = C101198e.C101199b.EDIT_PREVIEW_MODE_CHANGE;
        Point h = C85875k4.m106184h(this.f326968h);
        int i2 = h.x;
        int i3 = h.y;
        Size size = new Size(i2, i3);
        if (!z3 || this.f326979v == null) {
            float f2 = (float) i2;
            float c = C98595b.f289089a.mo137985c() * f2;
            float f3 = 0.5625f * f2;
            int h2 = C76577a.m92157h(this.f326968h, C0966R.dimen.f3709c2);
            int h3 = C76577a.m92157h(this.f326968h, C0966R.dimen.f3720ca);
            if (z2) {
                h3 = C76577a.m92151b(this.f326968h, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL) + C76577a.m92157h(this.f326968h, C0966R.dimen.f3743cv);
            }
            int h4 = (((C85875k4.m106184h(this.f326968h).y - h2) - h3) - (z ? C76577a.m92157h(this.f326968h, C0966R.dimen.f3761db) : 0)) - C75044y4.m89991c(this.f326968h);
            Log.m105924i("MicroMsg.EditMultiPreviewPlugin", "maxVisibleHeight:" + c + " ,validHeight:" + h4);
            float f4 = (float) h4;
            float min = Math.min(c, 1.0f * f4);
            this.f326967g.setLimitMaxHeight(min);
            this.f326967g.setLimitMinHeight(f3);
            this.f326967g.mo151288b();
            if (min < c) {
                i = 2;
                f = ((((float) 1) - (min / c)) * f2) / ((float) 2);
            } else {
                i = 2;
                f = 0.0f;
            }
            float f5 = ((float) h2) + ((f4 - min) / ((float) i));
            this.f326972o.set(f, f5, f2 - f, min + f5);
        } else {
            float f6 = (float) i2;
            float f7 = (float) i3;
            float f8 = f6 / f7;
            C98595b bVar2 = C98595b.f289089a;
            float f9 = (1.0f / C98595b.f289090b) + 0.01f;
            float c2 = 1.0f / bVar2.mo137985c();
            boolean St0 = ((C60200t1) C86312j.m106911c(cls)).St0();
            boolean ku = ((C60200t1) C86312j.m106911c(cls)).mo76860ku();
            Log.m105924i("MicroMsg.EditMultiPreviewPlugin", "updateValidArea, isDisablePostHalfScreen:" + St0 + ", isAllowEditFillingFullScreen:" + ku);
            RectF rectF = new RectF();
            this.f326967g.setVisibility(8);
            if (f8 <= f8) {
                C106195f0 f0Var = this.f326979v;
                C87412m.m108591d(f0Var);
                int width = size.getWidth();
                int height = size.getHeight();
                Rect rect = new Rect();
                Iterator<T> it = f0Var.f316428g.iterator();
                while (it.hasNext()) {
                    C106205q0 q0Var = (C106205q0) it.next();
                    C106204p pVar = q0Var.f316498i;
                    Iterator<T> it4 = it;
                    float f15 = ((float) width) * (((float) q0Var.f316496g) / ((float) q0Var.f316495f));
                    C101198e.C101199b bVar3 = bVar;
                    int i4 = height;
                    float f16 = (((float) height) - f15) / ((float) 2);
                    pVar.f316486d.set(0, (int) f16, width, (int) (f15 + f16));
                    Rect rect2 = pVar.f316486d;
                    if (size.getWidth() * size.getHeight() < rect2.width() * rect2.height()) {
                        rect.set(0, 0, size.getWidth(), size.getHeight());
                    } else {
                        rect.set(rect2);
                    }
                    C106193d0.m142870b(pVar.f316483a, new RectF(0.0f, 0.0f, (float) q0Var.f316495f, (float) q0Var.f316496g), new RectF(rect));
                    float a = C106193d0.m142869a(pVar.f316483a);
                    pVar.f316487e = a;
                    pVar.f316488f = 5.0f * a;
                    pVar.f316489g = a * 0.25f;
                    q0Var.f316501l.f331476n = true;
                    it = it4;
                    height = i4;
                    bVar = bVar3;
                    width = width;
                }
                C101198e.C101199b bVar4 = bVar;
                float f17 = f6 / c2;
                float f18 = (f7 - f17) / ((float) 2);
                rectF.set(0.0f, f18, f6, f17 + f18);
                this.f326972o.set(0.0f, 0.0f, f6, f7);
                this.f326967g.f316994R0 = false;
                C101198e eVar = this.f291492d;
                Bundle bundle = new Bundle();
                bundle.putInt("PARAM_1_INT", St0 ? 3 : 1);
                C13598b0 b0Var = C13598b0.f38549a;
                eVar.mo14585p(bVar4, bundle);
            } else {
                C101198e.C101199b bVar5 = bVar;
                if (f8 <= f9) {
                    if (ku) {
                        C106195f0 f0Var2 = this.f326979v;
                        C87412m.m108591d(f0Var2);
                        f0Var2.mo152127y(false, size);
                    } else {
                        C106195f0 f0Var3 = this.f326979v;
                        C87412m.m108591d(f0Var3);
                        f0Var3.mo152127y(true, size);
                    }
                    float f19 = f6 / c2;
                    float f25 = (f7 - f19) / ((float) 2);
                    rectF.set(0.0f, f25, f6, f19 + f25);
                    if (ku) {
                        this.f326972o.set(0.0f, 0.0f, f6, f7);
                    } else {
                        RectF rectF2 = this.f326972o;
                        C106195f0 f0Var4 = this.f326979v;
                        C87412m.m108591d(f0Var4);
                        rectF2.set(f0Var4.mo152122s());
                    }
                    this.f326967g.f316994R0 = false;
                    C101198e eVar2 = this.f291492d;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("PARAM_1_INT", St0 ? 3 : 1);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    eVar2.mo14585p(bVar5, bundle2);
                } else if (f8 <= c2) {
                    C106195f0 f0Var5 = this.f326979v;
                    C87412m.m108591d(f0Var5);
                    f0Var5.mo152127y(true, size);
                    float f26 = f6 / c2;
                    float f27 = (f7 - f26) / ((float) 2);
                    rectF.set(0.0f, f27, f6, f26 + f27);
                    RectF rectF3 = this.f326972o;
                    C106195f0 f0Var6 = this.f326979v;
                    C87412m.m108591d(f0Var6);
                    rectF3.set(f0Var6.mo152122s());
                    this.f326967g.f316994R0 = false;
                    C101198e eVar3 = this.f291492d;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("PARAM_1_INT", St0 ? 3 : 1);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                    eVar3.mo14585p(bVar5, bundle3);
                } else if (f8 <= 1.7777778f) {
                    C106195f0 f0Var7 = this.f326979v;
                    C87412m.m108591d(f0Var7);
                    f0Var7.mo152127y(true, size);
                    C106195f0 f0Var8 = this.f326979v;
                    C87412m.m108591d(f0Var8);
                    rectF.set(f0Var8.mo152122s());
                    RectF rectF4 = this.f326972o;
                    C106195f0 f0Var9 = this.f326979v;
                    C87412m.m108591d(f0Var9);
                    rectF4.set(f0Var9.mo152122s());
                    C101198e eVar4 = this.f291492d;
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("PARAM_1_INT", 3);
                    C13598b0 b0Var4 = C13598b0.f38549a;
                    eVar4.mo14585p(bVar5, bundle4);
                } else {
                    C106195f0 f0Var10 = this.f326979v;
                    C87412m.m108591d(f0Var10);
                    f0Var10.mo152127y(true, size);
                    C106195f0 f0Var11 = this.f326979v;
                    C87412m.m108591d(f0Var11);
                    rectF.set(f0Var11.mo152122s());
                    RectF rectF5 = this.f326972o;
                    C106195f0 f0Var12 = this.f326979v;
                    C87412m.m108591d(f0Var12);
                    rectF5.set(f0Var12.mo152122s());
                    C101198e eVar5 = this.f291492d;
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("PARAM_1_INT", 3);
                    C13598b0 b0Var5 = C13598b0.f38549a;
                    eVar5.mo14585p(bVar5, bundle5);
                }
            }
            this.f326966f.setEnableTouch(true);
            this.f326966f.setEnableScale(false);
            this.f326966f.setEnableFling(false);
            this.f326966f.setEnableScroll(false);
            this.f326967g.setLimitMaxHeight(rectF.height());
            this.f326967g.setLimitMinHeight(rectF.height());
            this.f326967g.getVisibilityRect().set(rectF);
            this.f326967g.getMaxVisibilityRect().set(this.f326972o);
            this.f326967g.postInvalidate();
            this.f326967g.f315419F = true;
            rectF.round(this.f326983z);
            Rect rect3 = this.f326983z;
            RectF rectF6 = this.f326972o;
            rect3.offset(-((int) rectF6.left), -((int) rectF6.top));
            C106195f0 f0Var13 = this.f326979v;
            C87412m.m108591d(f0Var13);
            RectF rectF7 = this.f326972o;
            C87412m.m108594g(rectF7, "maxVisibleRect");
            int i5 = 0;
            for (T next : f0Var13.f316428g) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    C106205q0 q0Var2 = (C106205q0) next;
                    C106204p pVar2 = q0Var2.f316498i;
                    if (i5 == 0) {
                        pVar2.f316486d.offset(-((int) rectF7.left), -((int) rectF7.top));
                    }
                    q0Var2.f316501l.f331474l.set(pVar2.f316486d);
                    pVar2.f316485c.set(pVar2.f316486d);
                    i5 = i6;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            MultiEditCropLayout multiEditCropLayout = this.f326966f;
            int i7 = CropLayout.f319541y0;
            multiEditCropLayout.mo152391w(rectF, false);
            this.f326956A = true;
            this.f326966f.f316992Q0 = true;
            this.f326967g.f316993Q0 = true;
            this.f326961F.f326940o = true;
        }
        C109195h0 h0Var = this.f326961F;
        RectF rectF8 = this.f326972o;
        h0Var.getClass();
        C87412m.m108594g(rectF8, "rect");
        h0Var.f326937i.set(rectF8);
        C106195f0 f0Var14 = this.f326979v;
        if (f0Var14 != null) {
            f0Var14.f316431j = (int) this.f326972o.width();
            f0Var14.f316432n = (int) this.f326972o.height();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
        VideoCompositionPlayView videoCompositionPlayView = this.f326970j;
        if (videoCompositionPlayView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(videoCompositionPlayView, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            videoCompositionPlayView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void release() {
        VideoCompositionPlayView videoCompositionPlayView = this.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154756f();
            this.f326970j = null;
        }
        this.f326973p.clear();
    }

    public void reset() {
        this.f326976s = 0;
        this.f326966f.mo154436B(true);
    }

    /* renamed from: x */
    public final void mo160460x() {
        C109676b bVar = C109676b.f328306a;
        boolean z = false;
        if (MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SCENE_INT_SYNC", 0) == 1) {
            z = true;
        }
        if (z && !C87412m.m108589b(this.f326981x.getParent(), this.f326969i)) {
            this.f326981x.setTextColor(-65536);
            int dimensionPixelSize = this.f326969i.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            this.f326981x.setTextSize((float) dimensionPixelSize);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ((int) this.f326972o.top) + dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.addRule(10);
            layoutParams.addRule(21);
            this.f326969i.addView(this.f326981x, 1, layoutParams);
        }
    }

    /* renamed from: y */
    public final void mo160461y() {
        if (this.f326970j == null) {
            Context context = this.f326968h;
            C87412m.m108593f(context, "context");
            VideoCompositionPlayView videoCompositionPlayView = new VideoCompositionPlayView(context);
            this.f326970j = videoCompositionPlayView;
            videoCompositionPlayView.setPlayerCallback(new C109207f(this));
            VideoCompositionPlayView videoCompositionPlayView2 = this.f326970j;
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.setPlayerProfileCallback(new C99303g(this));
            }
        }
    }

    /* renamed from: z */
    public final C96552p0 mo160462z() {
        return this.f326971n;
    }
}
