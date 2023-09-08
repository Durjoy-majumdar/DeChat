package aq3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p157gk.C59492k;
import p248ug.C102029k0;
import qo3.C77407n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tk2.C101903a;
import tk2.C22543c;

/* renamed from: aq3.j */
public final class C92075j extends UIComponent {

    /* renamed from: d */
    public long f263612d = -1;

    /* renamed from: e */
    public C77407n f263613e;

    /* renamed from: f */
    public C11184p0 f263614f;

    /* renamed from: g */
    public final C13601g f263615g;

    /* renamed from: h */
    public final C13601g f263616h;

    /* renamed from: i */
    public final C13601g f263617i;

    /* renamed from: j */
    public ValueAnimator f263618j;

    /* renamed from: n */
    public C54295a0 f263619n;

    /* renamed from: o */
    public C101903a f263620o;

    /* renamed from: p */
    public long f263621p;

    /* renamed from: q */
    public C54295a0 f263622q;

    /* renamed from: r */
    public final C22543c f263623r;

    /* renamed from: aq3.j$a */
    public static final class C92076a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92076a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263624d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f263624d.findViewById(C0966R.C0970id.f358445me2);
        }
    }

    /* renamed from: aq3.j$b */
    public static final class C92077b implements C22543c {

        /* renamed from: a */
        public final /* synthetic */ AppCompatActivity f263625a;

        /* renamed from: b */
        public final /* synthetic */ C92075j f263626b;

        public C92077b(AppCompatActivity appCompatActivity, C92075j jVar) {
            this.f263625a = appCompatActivity;
            this.f263626b = jVar;
        }

        /* renamed from: a */
        public void mo35638a(DialogInterface dialogInterface) {
        }

        /* renamed from: b */
        public void mo35639b(long j) {
            C92068g gVar = (C92068g) C39818r.f106831a.mo62444c(this.f263625a).mo75002a(C92068g.class);
            gVar.f263598j = false;
            MMViewPager mMViewPager = gVar.f263593e;
            if (mMViewPager != null) {
                mMViewPager.setEnableGalleryScale(false);
                mMViewPager.setSingleMode(true);
            }
        }

        /* renamed from: c */
        public void mo35640c(DialogInterface dialogInterface) {
            this.f263626b.mo126067j3();
            this.f263626b.f263622q = C54295a0.CUR_STATE_PREVIEW;
        }

        /* renamed from: d */
        public void mo35641d(DialogInterface dialogInterface) {
            C92068g gVar = (C92068g) C39818r.f106831a.mo62444c(this.f263625a).mo75002a(C92068g.class);
            gVar.f263598j = true;
            MMViewPager mMViewPager = gVar.f263593e;
            if (mMViewPager != null) {
                mMViewPager.setEnableGalleryScale(true);
                mMViewPager.setSingleMode(false);
            }
        }

        public void onError(int i, int i2) {
            this.f263626b.mo126067j3();
            this.f263626b.f263622q = C54295a0.CUR_STATE_PREVIEW;
            C92068g gVar = (C92068g) C39818r.f106831a.mo62444c(this.f263625a).mo75002a(C92068g.class);
            gVar.f263598j = true;
            MMViewPager mMViewPager = gVar.f263593e;
            if (mMViewPager != null) {
                mMViewPager.setEnableGalleryScale(true);
                mMViewPager.setSingleMode(false);
            }
        }
    }

    /* renamed from: aq3.j$c */
    public static final class C92078c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92078c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263627d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f263627d.findViewById(C0966R.C0970id.me4);
        }
    }

    /* renamed from: aq3.j$d */
    public static final class C92079d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92079d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263628d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f263628d.findViewById(C0966R.C0970id.f358446me3);
        }
    }

    /* renamed from: aq3.j$e */
    public static final class C92080e implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f263629d;

        /* renamed from: e */
        public final /* synthetic */ C92075j f263630e;

        public C92080e(boolean z, C92075j jVar) {
            this.f263629d = z;
            this.f263630e = jVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            boolean z = false;
            if (this.f263629d) {
                e0Var.mo107146h(0, this.f263630e.getString(C0966R.string.i4e), C0966R.raw.icons_filled_share, this.f263630e.getColor(C0966R.color.f2939n));
            }
            e0Var.mo107146h(2, this.f263630e.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
            C102029k0 k0Var = C59492k.f169999a;
            if (k0Var != null) {
                z = k0Var.mo137221h();
            }
            if (z) {
                e0Var.mo107146h(9, this.f263630e.getString(C0966R.string.m4p), C0966R.raw.icons_filled_search_logo, this.f263630e.getColor(C0966R.color.f2966ao));
            }
        }
    }

    /* renamed from: aq3.j$f */
    public static final class C92081f implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f263631d;

        /* renamed from: e */
        public final /* synthetic */ C92075j f263632e;

        /* renamed from: f */
        public final /* synthetic */ long f263633f;

        public C92081f(boolean z, C92075j jVar, long j) {
            this.f263631d = z;
            this.f263632e = jVar;
            this.f263633f = j;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            if (this.f263631d) {
                e0Var.mo107146h(1, this.f263632e.getString(C0966R.string.iam), C0966R.raw.icons_outlined_download, this.f263632e.getColor(C0966R.color.FG_0));
            }
            e0Var.mo107146h(6, this.f263632e.getString(C0966R.string.m4n), C0966R.raw.icons_outlined_pencil, this.f263632e.getColor(C0966R.color.FG_0));
            long j = this.f263633f;
            C102029k0 k0Var = C59492k.f169999a;
            if (k0Var != null ? k0Var.mo137228o(j) : false) {
                e0Var.mo107146h(5, this.f263632e.getString(C0966R.string.m4l), C0966R.raw.icons_outlined_chats, this.f263632e.getColor(C0966R.color.FG_0));
            }
            e0Var.mo107146h(7, this.f263632e.getString(C0966R.string.m4o), C0966R.raw.icons_outlined_translate, this.f263632e.getColor(C0966R.color.FG_0));
            e0Var.mo107146h(10, this.f263632e.getString(C0966R.string.m4m), C0966R.raw.icons_outlined_ocr, this.f263632e.getColor(C0966R.color.FG_0));
        }
    }

    /* renamed from: aq3.j$g */
    public static final class C92082g implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C92075j f263634a;

        public C92082g(C92075j jVar) {
            this.f263634a = jVar;
        }

        public final void onDismiss() {
            this.f263634a.f263613e = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92075j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f263615g = C36568h.m40985a(new C92078c(appCompatActivity));
        this.f263616h = C36568h.m40985a(new C92079d(appCompatActivity));
        this.f263617i = C36568h.m40985a(new C92076a(appCompatActivity));
        C54295a0 a0Var = C54295a0.CUR_STATE_PREVIEW;
        this.f263619n = a0Var;
        this.f263622q = a0Var;
        this.f263623r = new C92077b(appCompatActivity, this);
    }

    /* renamed from: c3 */
    public final void mo126061c3() {
        C54295a0 a0Var = C54295a0.CUR_STATE_PREVIEW;
        C54295a0 a0Var2 = this.f263619n;
        C54295a0 a0Var3 = C54295a0.CUR_STATE_RUNNING;
        if (a0Var2 == a0Var3) {
            C102029k0 k0Var = C59492k.f169999a;
            if (k0Var != null) {
                k0Var.mo137231r();
            }
            this.f263619n = a0Var;
            mo126067j3();
        }
        C101903a aVar = this.f263620o;
        if (aVar != null && this.f263622q == a0Var3) {
            aVar.mo33387d(this.f263621p);
            mo126067j3();
            this.f263621p = 0;
            this.f263622q = a0Var;
            C92068g gVar = (C92068g) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C92068g.class);
            gVar.f263598j = true;
            MMViewPager mMViewPager = gVar.f263593e;
            if (mMViewPager != null) {
                mMViewPager.setEnableGalleryScale(true);
                mMViewPager.setSingleMode(false);
            }
        }
    }

    /* renamed from: d3 */
    public final ImageView mo126062d3() {
        Object value = ((C36570n) this.f263617i).getValue();
        C87412m.m108593f(value, "<get-cancelTranslationBtn>(...)");
        return (ImageView) value;
    }

    /* renamed from: e3 */
    public final ImageView mo126063e3() {
        Object value = ((C36570n) this.f263615g).getValue();
        C87412m.m108593f(value, "<get-scanLine>(...)");
        return (ImageView) value;
    }

    /* renamed from: f3 */
    public final void mo126064f3(int i) {
        Object value = ((C36570n) this.f263616h).getValue();
        C87412m.m108593f(value, "<get-scanTransLayer>(...)");
        ((ImageView) value).setVisibility(i);
        mo126063e3().setVisibility(i);
        mo126062d3().setVisibility(i);
    }

    /* renamed from: g3 */
    public final void mo126065g3(long j) {
        this.f263612d = j;
        boolean z = false;
        if (this.f263613e == null) {
            this.f263613e = new C77407n((Context) getActivity(), 0, true);
        }
        C102029k0 k0Var = C59492k.f169999a;
        if (k0Var != null) {
            z = k0Var.mo137233t(j);
        }
        C77407n nVar = this.f263613e;
        if (nVar != null) {
            nVar.f225771i = new C92080e(z, this);
        }
        if (nVar != null) {
            nVar.f225773j = new C92081f(z, this, j);
        }
        C11184p0 p0Var = this.f263614f;
        if (p0Var != null) {
            if (nVar != null) {
                nVar.f225782p = p0Var;
            }
            if (nVar != null) {
                nVar.f225787r = p0Var;
            }
        }
        if (nVar != null) {
            nVar.f225761d = new C92082g(this);
        }
        if (nVar != null) {
            nVar.mo107573q();
        }
    }

    /* renamed from: i3 */
    public final void mo126066i3() {
        mo126064f3(0);
        ValueAnimator valueAnimator = this.f263618j;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        ValueAnimator valueAnimator2 = this.f263618j;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator3 = this.f263618j;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* renamed from: j3 */
    public final void mo126067j3() {
        mo126064f3(8);
        ValueAnimator valueAnimator = this.f263618j;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        ValueAnimator valueAnimator2 = this.f263618j;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(0);
        }
        ValueAnimator valueAnimator3 = this.f263618j;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f263618j = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        ValueAnimator valueAnimator = this.f263618j;
        if (valueAnimator != null) {
            valueAnimator.addListener(new C54298k(this));
        }
        int height = getActivity().getWindowManager().getDefaultDisplay().getHeight();
        ValueAnimator valueAnimator2 = this.f263618j;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new C54299l(this, height));
        }
        ViewGroup.LayoutParams layoutParams = mo126062d3().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = layoutParams2.bottomMargin;
        AppCompatActivity activity = getActivity();
        C102029k0 k0Var = C59492k.f169999a;
        layoutParams2.bottomMargin = i + C76577a.m92151b(activity, k0Var != null ? k0Var.getNavigationBarHeight() : 0);
        mo126062d3().setLayoutParams(layoutParams2);
        mo126062d3().setOnClickListener(new C54300m(this));
        this.f263614f = new C92083n(this);
        C102029k0 k0Var2 = C59492k.f169999a;
        if (k0Var2 != null) {
            k0Var2.mo137219g();
        }
    }

    public void onDestroy() {
        mo126061c3();
        C102029k0 k0Var = C59492k.f169999a;
        if (k0Var != null) {
            k0Var.mo137234u();
        }
        super.onDestroy();
    }
}
