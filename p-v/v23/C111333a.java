package v23;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.MultiTrackCropView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i33.C98595b;
import iy3.C60641c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l23.C109190g0;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110807k;

/* renamed from: v23.a */
public final class C111333a extends C99417a implements C109190g0.C109192b, C109202j.C109204c {

    /* renamed from: f */
    public final ViewGroup f333323f;

    /* renamed from: g */
    public final EditorPanelHolder f333324g;

    /* renamed from: h */
    public final C13601g f333325h = C36568h.m40985a(new C111339f(this));

    /* renamed from: i */
    public final C13601g f333326i = C36568h.m40985a(new C111344k(this));

    /* renamed from: j */
    public final C13601g f333327j = C36568h.m40985a(new C111336c(this));

    /* renamed from: n */
    public final C13601g f333328n = C36568h.m40985a(new C111334a(this));

    /* renamed from: o */
    public final C13601g f333329o = C36568h.m40985a(new C111337d(this));

    /* renamed from: p */
    public final C13601g f333330p = C36568h.m40985a(new C111343j(this));

    /* renamed from: q */
    public final C13601g f333331q = C36568h.m40985a(new C111342i(this));

    /* renamed from: r */
    public final C13601g f333332r = C36568h.m40985a(new C111335b(this));

    /* renamed from: s */
    public final C13601g f333333s = C36568h.m40985a(new C111341h(this));

    /* renamed from: t */
    public final C13601g f333334t = C36568h.m40985a(new C111340g(this));

    /* renamed from: u */
    public boolean f333335u;

    /* renamed from: v */
    public long f333336v;

    /* renamed from: w */
    public boolean f333337w;

    /* renamed from: x */
    public C109202j.C99301e f333338x;

    /* renamed from: y */
    public final C111338e f333339y;

    /* renamed from: v23.a$a */
    public static final class C111334a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111334a(C111333a aVar) {
            super(0);
            this.f333340d = aVar;
        }

        public Object invoke() {
            return (ImageView) this.f333340d.mo163020x().findViewById(C0966R.C0970id.l_f);
        }
    }

    /* renamed from: v23.a$b */
    public static final class C111335b extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111335b(C111333a aVar) {
            super(0);
            this.f333341d = aVar;
        }

        public Object invoke() {
            return (WeImageView) this.f333341d.f333323f.findViewById(C0966R.C0970id.l_9);
        }
    }

    /* renamed from: v23.a$c */
    public static final class C111336c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111336c(C111333a aVar) {
            super(0);
            this.f333342d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f333342d.mo163020x().findViewById(C0966R.C0970id.l_j);
        }
    }

    /* renamed from: v23.a$d */
    public static final class C111337d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111337d(C111333a aVar) {
            super(0);
            this.f333343d = aVar;
        }

        public Object invoke() {
            return (ImageView) this.f333343d.mo163020x().findViewById(C0966R.C0970id.l_g);
        }
    }

    /* renamed from: v23.a$e */
    public static final class C111338e implements MultiTrackCropView.C106270a {

        /* renamed from: a */
        public final /* synthetic */ C111333a f333344a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f333345b;

        public C111338e(C111333a aVar, C101198e eVar) {
            this.f333344a = aVar;
            this.f333345b = eVar;
        }

        /* renamed from: a */
        public void mo152338a(int i, boolean z, long j, long j2) {
            View view = (View) ((C36570n) this.f333344a.f333331q).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C109202j.C99301e eVar = this.f333344a.f333338x;
            if (eVar != null) {
                eVar.pause();
            }
            C101198e eVar2 = this.f333345b;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_COMPOSITION_TAP_DOWN;
            Bundle bundle = new Bundle();
            int i2 = i;
            bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i);
            boolean z2 = z;
            bundle.putBoolean("EDIT_COMPOSITION_LEFT", z);
            long j3 = j;
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j2);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar2.mo14585p(bVar, bundle);
        }

        /* renamed from: b */
        public void mo152339b(int i, boolean z, long j, long j2) {
            this.f333344a.mo163019A();
        }

        /* renamed from: c */
        public void mo152340c(int i, boolean z, long j, long j2) {
            View view = (View) ((C36570n) this.f333344a.f333331q).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101198e eVar = this.f333345b;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_COMPOSITION_TAP_DOWN;
            Bundle bundle = new Bundle();
            int i2 = i;
            bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i);
            boolean z2 = z;
            bundle.putBoolean("EDIT_COMPOSITION_LEFT", z);
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j2);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
            this.f333344a.mo163019A();
        }

        public void pause() {
            C109202j.C99301e eVar = this.f333344a.f333338x;
            if (eVar != null) {
                eVar.pause();
            }
        }

        public void seekTo(long j) {
            C109202j.C99301e eVar = this.f333344a.f333338x;
            if (eVar != null) {
                C109202j.C99301e.C99302a.m129467a(eVar, j, (Object) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: v23.a$f */
    public static final class C111339f extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111339f(C111333a aVar) {
            super(0);
            this.f333346d = aVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f333346d.f333324g.getContext()).inflate(C0966R.C0971layout.b46, this.f333346d.f333324g, false);
            EditorPanelHolder editorPanelHolder = this.f333346d.f333324g;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: v23.a$g */
    public static final class C111340g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111340g(C111333a aVar) {
            super(0);
            this.f333347d = aVar;
        }

        public Object invoke() {
            return this.f333347d.mo163020x().findViewById(C0966R.C0970id.l__);
        }
    }

    /* renamed from: v23.a$h */
    public static final class C111341h extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111341h(C111333a aVar) {
            super(0);
            this.f333348d = aVar;
        }

        public Object invoke() {
            return (WeImageView) this.f333348d.mo163020x().findViewById(C0966R.C0970id.l_9);
        }
    }

    /* renamed from: v23.a$i */
    public static final class C111342i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111342i(C111333a aVar) {
            super(0);
            this.f333349d = aVar;
        }

        public Object invoke() {
            return this.f333349d.mo163020x().findViewById(C0966R.C0970id.l_h);
        }
    }

    /* renamed from: v23.a$j */
    public static final class C111343j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111343j(C111333a aVar) {
            super(0);
            this.f333350d = aVar;
        }

        public Object invoke() {
            return (TextView) this.f333350d.mo163020x().findViewById(C0966R.C0970id.l_i);
        }
    }

    /* renamed from: v23.a$k */
    public static final class C111344k extends C87413o implements C32224a<MultiTrackCropView> {

        /* renamed from: d */
        public final /* synthetic */ C111333a f333351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111344k(C111333a aVar) {
            super(0);
            this.f333351d = aVar;
        }

        public Object invoke() {
            return (MultiTrackCropView) this.f333351d.mo163020x().findViewById(C0966R.C0970id.kt_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111333a(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        this.f333323f = viewGroup;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "layout.context");
        EditorPanelHolder editorPanelHolder = new EditorPanelHolder(context);
        viewGroup.addView(editorPanelHolder);
        editorPanelHolder.setVisibility(8);
        this.f333324g = editorPanelHolder;
        this.f333339y = new C111338e(this, eVar);
    }

    /* renamed from: A */
    public final void mo163019A() {
        long c = C60641c.m70922c((double) (((float) Math.min(this.f333336v, mo163021y().getCutDuration())) / 1000.0f));
        int i = 0;
        ((TextView) ((C36570n) this.f333327j).getValue()).setText(this.f333324g.getContext().getString(C0966R.string.kbp, new Object[]{Long.valueOf(c)}));
        TextView textView = (TextView) ((C36570n) this.f333327j).getValue();
        if (mo163021y().getSourceDuration() <= this.f333336v) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        if (this.f333324g.mo151464b()) {
            mo163021y().setProgress(j);
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
        this.f333338x = eVar;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f333324g.mo151464b()) {
            return false;
        }
        this.f333337w = false;
        this.f333324g.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void onVideoPause() {
        ((WeImageView) ((C36570n) this.f333333s).getValue()).setImageDrawable(C74933u4.m89768e(this.f333323f.getContext(), C0966R.raw.icons_filled_play, -1));
        ((View) ((C36570n) this.f333334t).getValue()).setContentDescription(mo163020x().getContext().getString(C0966R.string.f7935ws));
        ((WeImageView) ((C36570n) this.f333332r).getValue()).setContentDescription(mo163020x().getContext().getString(C0966R.string.f7935ws));
    }

    public void onVideoPlay() {
        ((WeImageView) ((C36570n) this.f333333s).getValue()).setImageDrawable(C74933u4.m89768e(this.f333323f.getContext(), C0966R.raw.icons_filled_pause, -1));
        ((View) ((C36570n) this.f333334t).getValue()).setContentDescription(mo163020x().getContext().getString(C0966R.string.a1a));
        ((WeImageView) ((C36570n) this.f333332r).getValue()).setContentDescription(mo163020x().getContext().getString(C0966R.string.a1a));
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f333337w = false;
            this.f333324g.setShow(false);
        }
    }

    /* renamed from: x */
    public final ViewGroup mo163020x() {
        return (ViewGroup) ((C36570n) this.f333325h).getValue();
    }

    /* renamed from: y */
    public final MultiTrackCropView mo163021y() {
        return (MultiTrackCropView) ((C36570n) this.f333326i).getValue();
    }

    /* renamed from: z */
    public final void mo163022z(C110807k kVar, long j) {
        C87412m.m108594g(kVar, "composition");
        this.f333337w = false;
        if (!this.f333335u) {
            this.f333335u = true;
            this.f333324g.setCloseTouchOutside(false);
            mo163021y().setCallback(this.f333339y);
            C98595b bVar = C98595b.f289089a;
            ImageView imageView = (ImageView) ((C36570n) this.f333328n).getValue();
            C87412m.m108593f(imageView, "cancelView");
            bVar.mo137988f(imageView);
            ImageView imageView2 = (ImageView) ((C36570n) this.f333329o).getValue();
            C87412m.m108593f(imageView2, "okView");
            bVar.mo137988f(imageView2);
            Context context = mo163020x().getContext();
            C87412m.m108593f(context, "panelRoot.context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            ((TextView) ((C36570n) this.f333330p).getValue()).setTextSize(1, (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
            ((ImageView) ((C36570n) this.f333328n).getValue()).setOnClickListener(new C111345b(this));
            ((ImageView) ((C36570n) this.f333329o).getValue()).setOnClickListener(new C111346c(this));
            ((View) ((C36570n) this.f333334t).getValue()).setOnClickListener(new C78323d(this));
            this.f333324g.setOnVisibleChangeCallback(new C111347e(this));
        }
        this.f333336v = j;
        this.f333324g.setShow(true);
        mo163021y().setTrack(kVar);
        mo163019A();
    }
}
