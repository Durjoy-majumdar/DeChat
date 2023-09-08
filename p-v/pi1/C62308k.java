package pi1;

import al1.C54130j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8703w0;
import ht1.C60200t1;
import ii1.C60291e;
import ii1.C8922a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nh1.C61737f;
import nh1.C61745o;
import nh1.C61746p;
import ni1.C61753b;
import ok1.C62042e;
import p192l4.C10462b;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qj1.C62660c;
import rx3.C13598b0;
import up1.C27696y;

/* renamed from: pi1.k */
public final class C62308k extends C62307j {

    /* renamed from: w */
    public static final /* synthetic */ int f177124w = 0;

    /* renamed from: v */
    public final C61746p f177125v;

    /* renamed from: pi1.k$a */
    public static final class C62309a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62308k f177126d;

        public C62309a(C62308k kVar) {
            this.f177126d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$showContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C62042e.f176370a.mo87027N0()) {
                C62308k kVar = this.f177126d;
                int i = C62308k.f177124w;
                kVar.mo88682p();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$showContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pi1.k$b */
    public static final class C62310b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62308k f177127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62310b(C62308k kVar) {
            super(0);
            this.f177127d = kVar;
        }

        public Object invoke() {
            this.f177127d.mo87390x();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62308k(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar, 2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cyn, this, false);
        int i = C0966R.C0970id.f358179dr3;
        View a = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
        if (a != null) {
            C61737f a2 = C61737f.m72430a(a);
            i = C0966R.C0970id.f358189ol1;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1);
            if (textView != null) {
                i = C0966R.C0970id.o79;
                FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o79);
                if (frameLayout != null) {
                    i = C0966R.C0970id.n9b;
                    View a3 = C10462b.m10395a(inflate, C0966R.C0970id.n9b);
                    if (a3 != null) {
                        C61745o a4 = C61745o.m72431a(a3);
                        RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
                        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb6);
                        if (imageView != null) {
                            TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.nb7);
                            if (textView2 != null) {
                                View a5 = C10462b.m10395a(inflate, C0966R.C0970id.afz);
                                if (a5 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.ncb);
                                    if (constraintLayout != null) {
                                        this.f177125v = new C61746p(roundCornerConstraintLayout, a2, textView, frameLayout, a4, roundCornerConstraintLayout, imageView, textView2, a5, constraintLayout);
                                        addView(roundCornerConstraintLayout);
                                        roundCornerConstraintLayout.setOnClickListener(this);
                                        frameLayout.setOnClickListener(this);
                                        return;
                                    }
                                    i = C0966R.C0970id.ncb;
                                } else {
                                    i = C0966R.C0970id.afz;
                                }
                            } else {
                                i = C0966R.C0970id.nb7;
                            }
                        } else {
                            i = C0966R.C0970id.nb6;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public void mo86901a() {
    }

    /* renamed from: b */
    public void mo86902b() {
    }

    public ViewGroup getGiftRootView() {
        RelativeLayout relativeLayout = this.f177125v.f175516e.f175511a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveMicNewMicGiftItemLayout.root");
        return relativeLayout;
    }

    public ViewGroup getLuckyMoneyRootView() {
        RelativeLayout relativeLayout = this.f177125v.f175513b.f175451a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
        return relativeLayout;
    }

    public RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.f177125v.f175512a;
        C87412m.m108593f(roundCornerConstraintLayout, "viewBinding.root");
        return roundCornerConstraintLayout;
    }

    public String getTagString() {
        return "FocusVideoCoverWidget";
    }

    /* renamed from: l */
    public void mo86941l(boolean z, int i, boolean z2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.mo86941l(z, i, z2);
        View view = null;
        if (!mo88678i() && (!mo88679k() || !((C54991o) getBasePlugin().mo87696x0(C54991o.class)).f154274W2)) {
            C62660c basePlugin = getBasePlugin();
            C60291e eVar = basePlugin instanceof C60291e ? (C60291e) basePlugin : null;
            if (!(eVar == null || (viewGroup2 = eVar.f171915q) == null)) {
                view = viewGroup2.findViewById(C0966R.C0970id.o79);
            }
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f177125v.f175515d.setVisibility(8);
        } else if (this.f177123u) {
            C62660c basePlugin2 = getBasePlugin();
            C60291e eVar2 = basePlugin2 instanceof C60291e ? (C60291e) basePlugin2 : null;
            if (!(eVar2 == null || (viewGroup = eVar2.f171915q) == null)) {
                view = viewGroup.findViewById(C0966R.C0970id.o79);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            this.f177125v.f175515d.setVisibility(0);
        }
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = this.f177125v.f175512a.getId();
        if (valueOf == null || valueOf.intValue() != id) {
            int id4 = this.f177125v.f175515d.getId();
            if (valueOf != null && valueOf.intValue() == id4) {
                mo88681o();
            }
        } else if (this.f177123u) {
            mo87388v();
        } else {
            mo87390x();
        }
    }

    /* renamed from: w */
    public void mo87376w(boolean z) {
        float b = (float) C76577a.m92151b(getContext(), 4);
        if (mo87387t()) {
            b = 0.0f;
        }
        Drawable background = this.f177125v.f175519h.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b);
        }
        if (z) {
            this.f177125v.f175512a.setRadius(0.0f);
        } else {
            this.f177125v.f175512a.setRadius(b);
        }
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            if (z) {
                this.f177125v.f175520i.setVisibility(8);
                C62660c basePlugin = getBasePlugin();
                C60291e eVar = basePlugin instanceof C60291e ? (C60291e) basePlugin : null;
                if (eVar != null) {
                    ViewGroup viewGroup = eVar.f171915q;
                    View findViewById = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.o79) : null;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new C62309a(this));
                    }
                }
                C62660c basePlugin2 = getBasePlugin();
                C60291e eVar2 = basePlugin2 instanceof C60291e ? (C60291e) basePlugin2 : null;
                if (eVar2 != null) {
                    C62310b bVar = new C62310b(this);
                    Class cls = C11990s0.class;
                    Class<C60200t1> cls2 = C60200t1.class;
                    ViewGroup viewGroup2 = eVar2.f171915q;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        eVar2.f171915q.setOnClickListener(new C8922a(bVar));
                        ImageView imageView = (ImageView) viewGroup2.findViewById(C0966R.C0970id.nb6);
                        if (imageView != null) {
                            if (C72996z1.m85817T4(bindLinkMicUser.f151999c)) {
                                C39818r rVar = C39818r.f106831a;
                                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(bindLinkMicUser.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                            } else {
                                C39818r rVar2 = C39818r.f106831a;
                                ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(bindLinkMicUser.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                            }
                        }
                        TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.nb7);
                        if (textView != null) {
                            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).Te0(MMApplicationContext.getContext(), C8703w0.f27927a.mo9552c(C62042e.m72808l0(C62042e.f176370a, bindLinkMicUser.f151999c, bindLinkMicUser.f152000d, false, 4, (Object) null), ""), textView.getTextSize()));
                        }
                    }
                }
            } else {
                this.f177125v.f175520i.setVisibility(0);
                ImageView imageView2 = this.f177125v.f175517f;
                C87412m.m108593f(imageView2, "viewBinding.micHead");
                mo86639e(imageView2);
                TextView textView2 = this.f177125v.f175518g;
                C87412m.m108593f(textView2, "viewBinding.micNickName");
                mo86641g(textView2);
            }
        }
        C87412m.m108593f(this.f177125v.f175514c, "viewBinding.finderLiveMicHeartText");
    }

    /* renamed from: x */
    public final void mo87390x() {
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (C87412m.m108589b(bindLinkMicUser != null ? bindLinkMicUser.f151997a : null, ((C54991o) getBasePlugin().mo87696x0(C54991o.class)).mo76015n4())) {
            mo88683r(1);
        } else {
            mo88684s();
        }
    }
}
