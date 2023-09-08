package ej1;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0581o5;
import cj1.C0584p5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87515a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import p156gj.C8325f0;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48770aw0;
import vg1.C52891f;
import wk1.C15424c;
import wk1.C15432i;
import wk1.C15440n;
import wk1.C15465r;

/* renamed from: ej1.n */
public final class C7704n {

    /* renamed from: a */
    public static final C7704n f26123a = new C7704n();

    /* renamed from: b */
    public static final String f26124b = " ";

    /* renamed from: c */
    public static final int f26125c = (C62042e.f176370a.mo87027N0() ? 17 : 14);

    /* renamed from: ej1.n$a */
    public static final class C7705a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C7705a f26126d = new C7705a();

        public C7705a() {
            super(0);
        }

        public Object invoke() {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dg_);
            C87412m.m108593f(string, "getContext().resources.g…nder_live_anchor_tag_txt)");
            return string;
        }
    }

    /* renamed from: ej1.n$b */
    public static final class C7706b extends C87413o implements C32224a<ForegroundColorSpan> {

        /* renamed from: d */
        public static final C7706b f26127d = new C7706b();

        public C7706b() {
            super(0);
        }

        public Object invoke() {
            return new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3553xj));
        }
    }

    static {
        C36568h.m40985a(C7706b.f26127d);
        C36568h.m40985a(C7705a.f26126d);
    }

    /* renamed from: a */
    public final Drawable mo8824a(int i) {
        boolean z = true;
        boolean z2 = 40 <= i && i < 50;
        int i2 = C0966R.C0969drawable.f5171c9;
        if (!z2) {
            if (50 <= i && i < 60) {
                i2 = C0966R.C0969drawable.f5173dh;
            } else {
                if (60 <= i && i < 70) {
                    i2 = C0966R.C0969drawable.f5175dj;
                } else {
                    if (70 > i || i > Integer.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        i2 = C0966R.C0969drawable.f5177ee;
                    }
                }
            }
        }
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(i2, (Resources.Theme) null);
        C87412m.m108593f(drawable, "getContext().resources.getDrawable(id, null)");
        return drawable;
    }

    /* renamed from: b */
    public final ImageSpan mo8825b(C48770aw0 aw02) {
        int i;
        Integer valueOf = aw02 != null ? Integer.valueOf(aw02.f130789d) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            Drawable a = C15432i.f41854e.mo14246a(C15465r.f41958c.mo14283a(aw02.f130791f), 2.0f);
            C15440n nVar = C15440n.f41895a;
            C15424c cVar = new C15424c(C15440n.m14439b(nVar, nVar.mo14263l() + nVar.mo14261j(), 0, 2, (Object) null));
            C8325f0 f0Var = new C8325f0(nVar.mo14263l(), nVar.mo14263l());
            int parseColor = aw02.f130791f < 70 ? Color.parseColor("#D8D8D8") : Color.parseColor("#FFE58F");
            cVar.f41826d = a;
            cVar.f41827e = f0Var;
            cVar.f41828f = parseColor;
            nVar.mo14261j();
            cVar.f41829g = 0;
            return cVar;
        } else if (valueOf == null || valueOf.intValue() != 4) {
            return null;
        } else {
            int i2 = aw02.f130791f;
            boolean z = true;
            if (1 <= i2 && i2 < 7) {
                i = C0966R.raw.finder_live_fans_level_1;
            } else {
                if (7 <= i2 && i2 < 13) {
                    i = C0966R.raw.finder_live_fans_level_2;
                } else {
                    if (!(13 <= i2 && i2 < 18)) {
                        if (18 > i2 || i2 > Integer.MAX_VALUE) {
                            z = false;
                        }
                        if (!z) {
                            i = 0;
                        }
                    }
                    i = C0966R.raw.finder_live_fans_level_3;
                }
            }
            Drawable e = C87515a.m108835e(MMApplicationContext.getResources(), i, 0.0f);
            C15440n nVar2 = C15440n.f41895a;
            C15424c cVar2 = new C15424c(C15440n.m14439b(nVar2, nVar2.mo14263l() + nVar2.mo14261j(), 0, 2, (Object) null));
            C87412m.m108593f(e, "drawable");
            C8325f0 f0Var2 = new C8325f0(nVar2.mo14263l(), nVar2.mo14263l());
            cVar2.f41826d = e;
            cVar2.f41827e = f0Var2;
            cVar2.f41828f = 0;
            nVar2.mo14261j();
            cVar2.f41829g = 0;
            return cVar2;
        }
    }

    /* renamed from: c */
    public final void mo8826c(C0581o5 o5Var, View view) {
        C87412m.m108594g(o5Var, "finderLiveMsg");
        C87412m.m108594g(view, "likeRoot");
        if (o5Var instanceof C0584p5) {
            C0584p5 p5Var = (C0584p5) o5Var;
            C52891f.f147704a.mo73658h(view, p5Var.mo583m(), p5Var.getLikeCount(), (Integer) null);
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemDanmakuBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemDanmakuBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public final void mo8827d(C48770aw0 aw02, View view, View view2) {
        C87412m.m108594g(view, "bgView");
        C87412m.m108594g(view2, "likeRoot");
        Integer valueOf = aw02 != null ? Integer.valueOf(aw02.f130789d) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            view.setBackground(f26123a.mo8824a(aw02.f130791f));
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = C15440n.f41895a.mo14260i();
        } else if (valueOf != null && valueOf.intValue() == 4) {
            view.setBackground((Drawable) null);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            C15440n nVar = C15440n.f41895a;
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = ((Number) ((C36570n) C15440n.f41899e).getValue()).intValue() * -1;
        } else {
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            C15440n nVar2 = C15440n.f41895a;
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = ((Number) ((C36570n) C15440n.f41899e).getValue()).intValue() * -1;
            view.setBackground((Drawable) null);
        }
    }
}
