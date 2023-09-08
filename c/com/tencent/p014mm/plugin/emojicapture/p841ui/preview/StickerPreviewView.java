package com.tencent.p014mm.plugin.emojicapture.p841ui.preview;

import ac3.C103355g1;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView;
import com.tencent.p014mm.plugin.mmsight.p077ui.CameraFrontSightView;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import com.tencent.p014mm.sticker.p1079ui.view.CaptureStickerHint;
import com.tencent.p014mm.vfs.C86013q1;
import e71.C97607d;
import f90.C107509b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98323a;
import i72.C108388k;
import j20.C117292a;
import j71.C108598r;
import j90.C108667e;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import l90.C109291a;
import m90.C88716b;
import o40.C61926c;
import p207nl.C89008j;
import rh3.C101383g;
import rx3.C13598b0;
import s80.C110777a;
import sh3.C101624e;
import sh3.C101630j;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import x61.C102566a;
import z04.C112551y;
import z04.C66713a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll90/a;", "", "url", "Lrx3/b0;", "setStickerUrl", "", "getRecordScene", "getResolutionLimit", "Lh90/a;", "getEncodeConfig", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoTransPara", "Lj90/e;", "getCameraPreviewView", "Ls80/a;", "getPreviewRenderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView */
public final class StickerPreviewView extends ConstraintLayout implements C109291a {

    /* renamed from: A */
    public final View f269375A;

    /* renamed from: B */
    public final CaptureStickerHint f269376B;

    /* renamed from: C */
    public final FontAnimTextView f269377C;

    /* renamed from: D */
    public final C107509b f269378D;

    /* renamed from: E */
    public C108598r f269379E;

    /* renamed from: F */
    public final int f269380F;

    /* renamed from: G */
    public final int f269381G;

    /* renamed from: H */
    public final Rect f269382H;

    /* renamed from: I */
    public boolean f269383I;

    /* renamed from: J */
    public String f269384J;

    /* renamed from: K */
    public final C93350d f269385K;

    /* renamed from: v */
    public final String f269386v;

    /* renamed from: w */
    public final ViewGroup f269387w;

    /* renamed from: x */
    public final CameraPreviewGLTextureView f269388x;

    /* renamed from: y */
    public final CameraFrontSightView f269389y;

    /* renamed from: z */
    public final View f269390z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$b */
    public static final class C68878b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f197895d;

        /* renamed from: e */
        public final /* synthetic */ StickerPreviewView f197896e;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$b$a */
        public static final class C68879a extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ StickerPreviewView f197897d;

            /* renamed from: e */
            public final /* synthetic */ C104428a f197898e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C68879a(StickerPreviewView stickerPreviewView, C104428a aVar) {
                super(1);
                this.f197897d = stickerPreviewView;
                this.f197898e = aVar;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                ViewGroup.LayoutParams layoutParams = this.f197897d.f269387w.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams3 = this.f197897d.f269377C.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                if (intValue == 0) {
                    StickerPreviewView stickerPreviewView = this.f197897d;
                    int i = stickerPreviewView.f269380F;
                    layoutParams2.width = i;
                    layoutParams2.height = i;
                    layoutParams2.topMargin = stickerPreviewView.f269381G;
                    int width = stickerPreviewView.getWidth();
                    StickerPreviewView stickerPreviewView2 = this.f197897d;
                    int i2 = stickerPreviewView2.f269380F;
                    int i3 = (width - i2) / 2;
                    int i4 = stickerPreviewView2.f269381G;
                    stickerPreviewView2.f269382H.set(i3, i4, i3 + i2, i2 + i4);
                    layoutParams4.f44455k = 0;
                    layoutParams4.f44451i = -1;
                } else if (intValue == 1) {
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    if (this.f197897d.getWidth() * 16 > this.f197897d.getHeight() * 9) {
                        int width2 = (this.f197897d.getWidth() - ((this.f197897d.getHeight() * 9) / 16)) / 2;
                        StickerPreviewView stickerPreviewView3 = this.f197897d;
                        stickerPreviewView3.f269382H.set(width2, 0, stickerPreviewView3.getWidth() - width2, this.f197897d.getHeight());
                    } else {
                        int height = (this.f197897d.getHeight() - ((this.f197897d.getWidth() * 16) / 9)) / 2;
                        StickerPreviewView stickerPreviewView4 = this.f197897d;
                        stickerPreviewView4.f269382H.set(0, height, stickerPreviewView4.getWidth(), this.f197897d.getHeight() - height);
                    }
                    layoutParams4.f44455k = -1;
                    layoutParams4.f44451i = C0966R.C0970id.k2g;
                } else if (intValue == 2) {
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    layoutParams2.topMargin = 0;
                    StickerPreviewView stickerPreviewView5 = this.f197897d;
                    stickerPreviewView5.f269382H.set(0, 0, stickerPreviewView5.getWidth(), this.f197897d.getHeight());
                    layoutParams4.f44455k = -1;
                    layoutParams4.f44451i = C0966R.C0970id.k2g;
                }
                StickerPreviewView stickerPreviewView6 = this.f197897d;
                stickerPreviewView6.f269388x.mo148312q(new C105222b(stickerPreviewView6, intValue));
                this.f197898e.dismiss();
                return C13598b0.f38549a;
            }
        }

        public C68878b(Context context, StickerPreviewView stickerPreviewView) {
            this.f197895d = context;
            this.f197896e = stickerPreviewView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C104428a aVar = new C104428a(this.f197895d, 0);
            Context context = this.f197895d;
            C87412m.m108594g(context, "context");
            StickerPreviewChangeMode stickerPreviewChangeMode = new StickerPreviewChangeMode(context, (AttributeSet) null);
            stickerPreviewChangeMode.setBackgroundResource(C0966R.C0969drawable.emoji_capture_sticker_panel_bg);
            stickerPreviewChangeMode.setOnModeSelected(new C68879a(this.f197896e, aVar));
            aVar.setContentView((View) stickerPreviewChangeMode);
            aVar.show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$a */
    public static final class C93348a implements MMSightCaptureTouchView.C105491a {

        /* renamed from: a */
        public final /* synthetic */ StickerPreviewView f269391a;

        public C93348a(StickerPreviewView stickerPreviewView) {
            this.f269391a = stickerPreviewView;
        }

        /* renamed from: a */
        public void mo128048a() {
            this.f269391a.f269378D.mo157942p(true, false, 1);
        }

        /* renamed from: b */
        public void mo128049b() {
            this.f269391a.f269378D.mo157942p(false, false, 1);
        }

        /* renamed from: c */
        public void mo128050c() {
            C107509b bVar = this.f269391a.f269378D;
            if (bVar.f321652l == 0) {
                bVar.f321642b.mo143187y();
            }
            StickerPreviewView stickerPreviewView = this.f269391a;
            stickerPreviewView.f269383I = stickerPreviewView.f269378D.mo157939m(false);
        }

        /* renamed from: e */
        public void mo128051e(float f, float f2) {
            StickerPreviewView stickerPreviewView = this.f269391a;
            stickerPreviewView.f269378D.mo157930c(f, f2, stickerPreviewView.f269387w.getWidth(), this.f269391a.f269387w.getHeight(), 400);
            this.f269391a.f269389y.mo129481a(f, f2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$c */
    public static final class C93349c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewView f269392d;

        public C93349c(StickerPreviewView stickerPreviewView) {
            this.f269392d = stickerPreviewView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f269392d.f269378D.mo157939m(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$d */
    public static final class C93350d implements C65231j<C101630j> {

        /* renamed from: a */
        public final /* synthetic */ StickerPreviewView f269393a;

        public C93350d(StickerPreviewView stickerPreviewView) {
            this.f269393a = stickerPreviewView;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            if (C87412m.m108589b(jVar.f297495f.f284105i, this.f269393a.f269384J)) {
                String str = this.f269393a.f269386v;
                Log.m105924i(str, "onLoaderFin: " + nVar);
                if (nVar == C65234n.OK) {
                    C101383g gVar = new C101383g();
                    StringBuilder sb = new StringBuilder();
                    String str2 = C101624e.f297487d;
                    sb.append(str2);
                    sb.append("preview/");
                    String sb4 = sb.toString();
                    C87412m.m108594g(sb4, "<set-?>");
                    gVar.f296978c = sb4;
                    gVar.mo140865b(str2 + "preview/");
                    this.f269393a.mo128144r(gVar);
                    return;
                }
                this.f269393a.mo128144r((C101383g) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$e */
    public static final class C93351e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101383g f269394d;

        /* renamed from: e */
        public final /* synthetic */ StickerPreviewView f269395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93351e(C101383g gVar, StickerPreviewView stickerPreviewView) {
            super(0);
            this.f269394d = gVar;
            this.f269395e = stickerPreviewView;
        }

        public Object invoke() {
            int i;
            int i2;
            C101383g gVar = this.f269394d;
            String str = null;
            String str2 = gVar != null ? gVar.f296979d : null;
            boolean z = true;
            int i3 = 0;
            if (str2 == null || str2.length() == 0) {
                this.f269395e.f269377C.mo149567c((CharSequence) null, -16777216, C97607d.m125781a(-16777216));
            } else {
                C101383g gVar2 = this.f269394d;
                String str3 = gVar2 != null ? gVar2.f296980e : null;
                String str4 = gVar2 != null ? gVar2.f296981f : null;
                if (!(str3 == null || C112551y.m153811k(str3))) {
                    C87412m.m108594g(str3, "stringColor");
                    if (C112551y.m153819s(str3, "#", false)) {
                        i = Color.parseColor(str3);
                    } else {
                        try {
                            C66713a.m78712a(16);
                            i = (Integer.parseInt(str3, 16) & -1) | -16777216;
                        } catch (Exception unused) {
                            i = 0;
                        }
                    }
                } else {
                    i = -1;
                }
                if (str4 != null && !C112551y.m153811k(str4)) {
                    z = false;
                }
                if (!z) {
                    C87412m.m108594g(str4, "stringColor");
                    if (C112551y.m153819s(str4, "#", false)) {
                        i2 = Color.parseColor(str4);
                    } else {
                        try {
                            C66713a.m78712a(16);
                            i3 = (Integer.parseInt(str4, 16) & -1) | -16777216;
                        } catch (Exception unused2) {
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = C97607d.m125781a(i);
                }
                FontAnimTextView fontAnimTextView = this.f269395e.f269377C;
                C101383g gVar3 = this.f269394d;
                if (gVar3 != null) {
                    str = gVar3.f296979d;
                }
                fontAnimTextView.mo149567c(str, i, i2);
            }
            this.f269395e.f269376B.setStickerPack(this.f269394d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$f */
    public static final class C93352f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewView f269396d;

        /* renamed from: e */
        public final /* synthetic */ C101383g f269397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93352f(StickerPreviewView stickerPreviewView, C101383g gVar) {
            super(0);
            this.f269396d = stickerPreviewView;
            this.f269397e = gVar;
        }

        public Object invoke() {
            C108598r rVar = this.f269396d.f269379E;
            C101383g gVar = this.f269397e;
            C103355g1 g1Var = rVar.f325143w;
            if (g1Var != null) {
                g1Var.mo143257x(gVar);
            }
            rVar.f325144x = gVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView$g */
    public static final class C93353g implements C98323a {
        /* renamed from: b */
        public String mo128056b() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            C89008j jVar = C89008j.f256613a;
            sb4.append(C89008j.f256615c);
            sb4.append("capture_emoji/");
            String sb5 = sb4.toString();
            C86013q1.m106461v(sb5);
            sb.append(sb5);
            sb.append("temp_thumb");
            sb.append(Util.nowMilliSecond());
            return sb.toString();
        }

        /* renamed from: c */
        public int mo128057c() {
            return 2;
        }

        public String getFilePath() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            C89008j jVar = C89008j.f256613a;
            sb4.append(C89008j.f256615c);
            sb4.append("capture_emoji/");
            String sb5 = sb4.toString();
            C86013q1.m106461v(sb5);
            sb.append(sb5);
            sb.append("video_");
            sb.append(Util.nowMilliSecond());
            return sb.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269386v = "MicroMsg.StickerPreviewView";
        this.f269379E = new C108598r(0, 1, (C8480h) null);
        this.f269382H = new Rect();
        this.f269384J = "";
        C93350d dVar = new C93350d(this);
        this.f269385K = dVar;
        View.inflate(context, C0966R.C0971layout.c5r, this);
        this.f269380F = getResources().getDimensionPixelSize(C0966R.dimen.a3d);
        this.f269381G = getResources().getDimensionPixelSize(C0966R.dimen.f3727cg);
        View findViewById = findViewById(C0966R.C0970id.f359290k20);
        C87412m.m108593f(findViewById, "findViewById(R.id.sticker_preview_capture_layout)");
        this.f269387w = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k28);
        C87412m.m108593f(findViewById2, "findViewById(R.id.sticker_preview_capture_view)");
        CameraPreviewGLTextureView cameraPreviewGLTextureView = (CameraPreviewGLTextureView) findViewById2;
        this.f269388x = cameraPreviewGLTextureView;
        View findViewById3 = findViewById(C0966R.C0970id.k1z);
        C87412m.m108593f(findViewById3, "findViewById(R.id.sticke…view_capture_focus_frame)");
        CameraFrontSightView cameraFrontSightView = (CameraFrontSightView) findViewById3;
        this.f269389y = cameraFrontSightView;
        View findViewById4 = findViewById(C0966R.C0970id.k27);
        C87412m.m108593f(findViewById4, "findViewById(R.id.sticke…eview_capture_touch_view)");
        View findViewById5 = findViewById(C0966R.C0970id.f359294k24);
        C87412m.m108593f(findViewById5, "findViewById(R.id.sticke…view_capture_switch_mode)");
        this.f269390z = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.f359291k21);
        C87412m.m108593f(findViewById6, "findViewById(R.id.sticke…ew_capture_switch_camera)");
        this.f269375A = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.k25);
        C87412m.m108593f(findViewById7, "findViewById(R.id.sticke…capture_switch_mode_icon)");
        ImageView imageView = (ImageView) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.f359292k22);
        C87412m.m108593f(findViewById8, "findViewById(R.id.sticke…pture_switch_camera_icon)");
        C97607d.m125784d((ImageView) findViewById8, C0966R.raw.icons_filled_camera_switch, -1);
        View findViewById9 = findViewById(C0966R.C0970id.k2h);
        C87412m.m108593f(findViewById9, "findViewById(R.id.sticker_preview_switch_bottom)");
        ((Guideline) findViewById9).setGuidelineEnd(C75044y4.m89991c(context) + getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0));
        View findViewById10 = findViewById(C0966R.C0970id.k2_);
        C87412m.m108593f(findViewById10, "findViewById(R.id.sticker_preview_hint)");
        this.f269376B = (CaptureStickerHint) findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.k2f);
        C87412m.m108593f(findViewById11, "findViewById(R.id.sticker_preview_subtitle)");
        this.f269377C = (FontAnimTextView) findViewById11;
        int b = C76577a.m92151b(context, 120);
        cameraFrontSightView.mo129482b(b, b);
        cameraPreviewGLTextureView.setOpaque(false);
        this.f269378D = new C107509b(this);
        ((MMSightCaptureTouchView) findViewById4).setTouchCallback(new C93348a(this));
        findViewById5.setOnClickListener(new C68878b(context, this));
        findViewById6.setOnClickListener(new C93349c(this));
        C101624e.f297484a.mo141088e(dVar);
        C101383g gVar = new C101383g();
        StringBuilder sb = new StringBuilder();
        String str = C101624e.f297487d;
        sb.append(str);
        sb.append("preview/");
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "<set-?>");
        gVar.f296978c = sb4;
        gVar.mo140865b(str + "preview/");
        mo128144r(gVar);
    }

    /* renamed from: b */
    public boolean mo128015b() {
        return false;
    }

    /* renamed from: d */
    public boolean mo128017d() {
        return ((C102566a.C102567a) C102566a.f302002b.mo138761d()).f302005b;
    }

    /* renamed from: f */
    public boolean mo128018f() {
        return false;
    }

    public C108667e getCameraPreviewView() {
        return this.f269388x;
    }

    public VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    public C98323a getEncodeConfig() {
        return new C93353g();
    }

    public C110777a getPreviewRenderer() {
        return this.f269379E;
    }

    public C110777a getRecordRenderer() {
        return null;
    }

    public int getRecordScene() {
        return 10;
    }

    public C88716b getRecorder() {
        return null;
    }

    public int getResolutionLimit() {
        return ((C102566a.C102567a) C102566a.f302002b.mo138761d()).f302004a;
    }

    public VideoTransPara getVideoTransPara() {
        VideoTransPara videoTransPara = C108388k.f324540d.f324552b;
        return videoTransPara != null ? videoTransPara : new VideoTransPara();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && i > 0) {
            int width = getWidth();
            int i5 = this.f269380F;
            int i6 = (width - i5) / 2;
            int i7 = this.f269381G;
            this.f269382H.set(i6, i7, i6 + i5, i5 + i7);
            C108598r rVar = this.f269379E;
            Rect rect = this.f269382H;
            rVar.getClass();
            C87412m.m108594g(rect, "previewRect");
            rVar.f325139B.set(rect);
        }
    }

    /* renamed from: r */
    public final void mo128144r(C101383g gVar) {
        C61926c.m72668M(new C93351e(gVar, this));
        this.f269388x.mo148312q(new C93352f(this, gVar));
    }

    public final void setStickerUrl(String str) {
        C87412m.m108594g(str, "url");
        this.f269384J = str;
        C101624e eVar = C101624e.f297484a;
        StickerLoadInfo stickerLoadInfo = new StickerLoadInfo(1);
        stickerLoadInfo.f284105i = str;
        eVar.mo141087d(stickerLoadInfo);
    }

    /* renamed from: v */
    public boolean mo128038v() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
