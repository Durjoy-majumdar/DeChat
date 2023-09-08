package l23;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.MultiTrackCropView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d23.C106976a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k20.C60958c;
import k20.C9556a;
import l23.C109182f;
import l23.C109190g0;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110801c;

/* renamed from: l23.a */
public final class C109154a extends C99417a implements C109190g0.C109192b, C109202j.C109204c, C109202j.C109205d {

    /* renamed from: f */
    public final ViewGroup f326831f;

    /* renamed from: g */
    public final EditorPanelHolder f326832g;

    /* renamed from: h */
    public final C13601g f326833h = C36568h.m40985a(new C109160f(this));

    /* renamed from: i */
    public final C13601g f326834i = C36568h.m40985a(new C109163i(this));

    /* renamed from: j */
    public final C13601g f326835j = C36568h.m40985a(new C109157c(this));

    /* renamed from: n */
    public final C13601g f326836n = C36568h.m40985a(new C109155a(this));

    /* renamed from: o */
    public final C13601g f326837o = C36568h.m40985a(new C109158d(this));

    /* renamed from: p */
    public final C13601g f326838p = C36568h.m40985a(new C109162h(this));

    /* renamed from: q */
    public final C13601g f326839q = C36568h.m40985a(new C109156b(this));

    /* renamed from: r */
    public final C13601g f326840r = C36568h.m40985a(new C109161g(this));

    /* renamed from: s */
    public boolean f326841s;

    /* renamed from: t */
    public long f326842t;

    /* renamed from: u */
    public boolean f326843u;

    /* renamed from: v */
    public C109202j.C99301e f326844v;

    /* renamed from: w */
    public final C109182f f326845w = new C109182f();

    /* renamed from: x */
    public final C109159e f326846x;

    /* renamed from: l23.a$a */
    public static final class C109155a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109155a(C109154a aVar) {
            super(0);
            this.f326847d = aVar;
        }

        public Object invoke() {
            return (ImageView) C109154a.m148198x(this.f326847d).findViewById(C0966R.C0970id.l_f);
        }
    }

    /* renamed from: l23.a$b */
    public static final class C109156b extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109156b(C109154a aVar) {
            super(0);
            this.f326848d = aVar;
        }

        public Object invoke() {
            return (WeImageView) this.f326848d.f326831f.findViewById(C0966R.C0970id.l_9);
        }
    }

    /* renamed from: l23.a$c */
    public static final class C109157c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109157c(C109154a aVar) {
            super(0);
            this.f326849d = aVar;
        }

        public Object invoke() {
            return (TextView) C109154a.m148198x(this.f326849d).findViewById(C0966R.C0970id.l_j);
        }
    }

    /* renamed from: l23.a$d */
    public static final class C109158d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109158d(C109154a aVar) {
            super(0);
            this.f326850d = aVar;
        }

        public Object invoke() {
            return (ImageView) C109154a.m148198x(this.f326850d).findViewById(C0966R.C0970id.l_g);
        }
    }

    /* renamed from: l23.a$e */
    public static final class C109159e implements MultiTrackCropView.C106270a {

        /* renamed from: a */
        public final /* synthetic */ C109154a f326851a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f326852b;

        public C109159e(C109154a aVar, C101198e eVar) {
            this.f326851a = aVar;
            this.f326852b = eVar;
        }

        /* renamed from: a */
        public void mo152338a(int i, boolean z, long j, long j2) {
            View view = (View) ((C36570n) this.f326851a.f326838p).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C109202j.C99301e eVar = this.f326851a.f326844v;
            if (eVar != null) {
                eVar.pause();
            }
            C101198e eVar2 = this.f326852b;
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
            this.f326851a.mo160397C();
        }

        /* renamed from: c */
        public void mo152340c(int i, boolean z, long j, long j2) {
            View view = (View) ((C36570n) this.f326851a.f326838p).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101198e eVar = this.f326852b;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_COMPOSITION_TAP_UP;
            Bundle bundle = new Bundle();
            int i2 = i;
            bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i);
            boolean z2 = z;
            bundle.putBoolean("EDIT_COMPOSITION_LEFT", z);
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j2);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
            this.f326851a.mo160397C();
        }

        public void pause() {
            C109202j.C99301e eVar = this.f326851a.f326844v;
            if (eVar != null) {
                eVar.pause();
            }
        }

        public void seekTo(long j) {
            C109202j.C99301e eVar = this.f326851a.f326844v;
            if (eVar != null) {
                C109202j.C99301e.C99302a.m129467a(eVar, j, (Object) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: l23.a$f */
    public static final class C109160f extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109160f(C109154a aVar) {
            super(0);
            this.f326853d = aVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f326853d.f326832g.getContext()).inflate(C0966R.C0971layout.b46, this.f326853d.f326832g, false);
            EditorPanelHolder editorPanelHolder = this.f326853d.f326832g;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: l23.a$g */
    public static final class C109161g extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109161g(C109154a aVar) {
            super(0);
            this.f326854d = aVar;
        }

        public Object invoke() {
            return (WeImageView) C109154a.m148198x(this.f326854d).findViewById(C0966R.C0970id.l_9);
        }
    }

    /* renamed from: l23.a$h */
    public static final class C109162h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109162h(C109154a aVar) {
            super(0);
            this.f326855d = aVar;
        }

        public Object invoke() {
            return C109154a.m148198x(this.f326855d).findViewById(C0966R.C0970id.l_h);
        }
    }

    /* renamed from: l23.a$i */
    public static final class C109163i extends C87413o implements C32224a<MultiTrackCropView> {

        /* renamed from: d */
        public final /* synthetic */ C109154a f326856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109163i(C109154a aVar) {
            super(0);
            this.f326856d = aVar;
        }

        public Object invoke() {
            return (MultiTrackCropView) C109154a.m148198x(this.f326856d).findViewById(C0966R.C0970id.kt_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109154a(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        this.f326831f = viewGroup;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "layout.context");
        EditorPanelHolder editorPanelHolder = new EditorPanelHolder(context);
        viewGroup.addView(editorPanelHolder);
        editorPanelHolder.setVisibility(8);
        this.f326832g = editorPanelHolder;
        this.f326846x = new C109159e(this, eVar);
    }

    /* renamed from: x */
    public static final ViewGroup m148198x(C109154a aVar) {
        return (ViewGroup) ((C36570n) aVar.f326833h).getValue();
    }

    /* renamed from: A */
    public final C96552p0 mo160395A(C96552p0 p0Var, boolean z) {
        C87412m.m108594g(p0Var, "composition");
        C109182f fVar = this.f326845w;
        fVar.getClass();
        Iterator<C106205q0> it = p0Var.f282570c.iterator();
        while (it.hasNext()) {
            C106205q0 next = it.next();
            C109182f.C109183a aVar = (C109182f.C109183a) ((LinkedHashMap) fVar.f326902a).get(Integer.valueOf(next.f316493d));
            if (aVar != null) {
                if (z) {
                    next.mo81190d(aVar.f326904b);
                    next.mo81188b(aVar.f326905c);
                }
                C106976a.f320208a.mo157405i(next, aVar.f326903a);
            }
        }
        return p0Var;
    }

    /* renamed from: B */
    public final void mo160396B(C96552p0 p0Var, long j) {
        C87412m.m108594g(p0Var, "composition");
        this.f326843u = false;
        if (!this.f326841s) {
            this.f326841s = true;
            this.f326832g.setCloseTouchOutside(false);
            mo160401z().setCallback(this.f326846x);
            ((ImageView) ((C36570n) this.f326836n).getValue()).setOnClickListener(new C109164b(this));
            ((ImageView) ((C36570n) this.f326837o).getValue()).setOnClickListener(new C109167c(this));
            ((WeImageView) ((C36570n) this.f326840r).getValue()).setOnClickListener(new C76661d(this));
            this.f326832g.setOnVisibleChangeCallback(new C109181e(this));
        }
        this.f326842t = j;
        this.f326832g.setShow(true);
        mo160401z().setTrack(p0Var);
        mo160397C();
    }

    /* renamed from: C */
    public final void mo160397C() {
        C60641c.m70922c((double) (((float) mo160401z().getCutDuration()) / 1000.0f));
        long c = C60641c.m70922c((double) (((float) Math.min(this.f326842t, mo160401z().getCutDuration())) / 1000.0f));
        int i = 0;
        ((TextView) ((C36570n) this.f326835j).getValue()).setText(this.f326832g.getContext().getString(C0966R.string.kbp, new Object[]{Long.valueOf(c)}));
        TextView textView = (TextView) ((C36570n) this.f326835j).getValue();
        if (mo160401z().getSourceDuration() <= this.f326842t) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        if (this.f326832g.mo151464b()) {
            mo160401z().setProgress(j);
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
        this.f326844v = eVar;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f326832g.mo151464b()) {
            return false;
        }
        this.f326843u = false;
        this.f326832g.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void onVideoPause() {
        ((WeImageView) ((C36570n) this.f326840r).getValue()).setImageDrawable(C74933u4.m89768e(this.f326831f.getContext(), C0966R.raw.icons_filled_play, -1));
    }

    public void onVideoPlay() {
        ((WeImageView) ((C36570n) this.f326840r).getValue()).setImageDrawable(C74933u4.m89768e(this.f326831f.getContext(), C0966R.raw.icons_filled_pause, -1));
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
        if (p0Var != null && j >= 0) {
            mo160401z().mo152326b(p0Var, j);
        }
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f326843u = false;
            this.f326832g.setShow(false);
        }
    }

    /* renamed from: y */
    public final C96552p0 mo160400y(C96552p0 p0Var) {
        C87412m.m108594g(p0Var, "composition");
        C109182f fVar = this.f326845w;
        fVar.getClass();
        ((LinkedHashMap) fVar.f326902a).clear();
        Iterator<C106205q0> it = p0Var.f282570c.iterator();
        while (it.hasNext()) {
            C106205q0 next = it.next();
            int i = next.f316499j;
            C110801c cVar = next.f316501l;
            fVar.f326902a.put(Integer.valueOf(next.f316493d), new C109182f.C109183a(i, cVar.f331466d, cVar.f331467e));
            C106976a.f320208a.mo157405i(next, 0);
        }
        return p0Var;
    }

    /* renamed from: z */
    public final MultiTrackCropView mo160401z() {
        return (MultiTrackCropView) ((C36570n) this.f326834i).getValue();
    }
}
