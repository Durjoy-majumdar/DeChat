package il1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p629ny.C76979h;
import qj1.C62660c;
import qj1.C62707db;
import qj1.C62712dd;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: il1.p4 */
public final class C60491p4 extends FrameLayout {

    /* renamed from: A */
    public ObjectAnimator f172418A;

    /* renamed from: d */
    public final ViewGroup f172419d;

    /* renamed from: e */
    public final ViewGroup f172420e;

    /* renamed from: f */
    public final C58124b f172421f;

    /* renamed from: g */
    public final C62660c f172422g;

    /* renamed from: h */
    public final String f172423h = "Finder.FinderLiveGameJoinGuideBubbleWidget";

    /* renamed from: i */
    public final int f172424i;

    /* renamed from: j */
    public final int f172425j;

    /* renamed from: n */
    public View f172426n;

    /* renamed from: o */
    public ViewGroup f172427o;

    /* renamed from: p */
    public View f172428p;

    /* renamed from: q */
    public View.OnClickListener f172429q;

    /* renamed from: r */
    public View.OnClickListener f172430r;

    /* renamed from: s */
    public TextView f172431s;

    /* renamed from: t */
    public TextView f172432t;

    /* renamed from: u */
    public TextView f172433u;

    /* renamed from: v */
    public TextView f172434v;

    /* renamed from: w */
    public ImageView f172435w;

    /* renamed from: x */
    public int f172436x;

    /* renamed from: y */
    public int f172437y;

    /* renamed from: z */
    public ObjectAnimator f172438z;

    /* renamed from: il1.p4$a */
    public static final class C60492a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60491p4 f172439d;

        public C60492a(C60491p4 p4Var) {
            this.f172439d = p4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener mListener = this.f172439d.getMListener();
            if (mListener != null) {
                mListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.p4$b */
    public static final class C60493b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60491p4 f172440d;

        public C60493b(C60491p4 p4Var) {
            this.f172440d = p4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172440d.mo85445a();
            View.OnClickListener mCloseListener = this.f172440d.getMCloseListener();
            if (mCloseListener != null) {
                mCloseListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60491p4(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, C58124b bVar, C62660c cVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(viewGroup2, "parent");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172419d = viewGroup;
        this.f172420e = viewGroup2;
        this.f172421f = bVar;
        this.f172422g = cVar;
        this.f172424i = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        this.f172425j = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.agi, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…idget_layout, this, true)");
        this.f172426n = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.ber);
        C87412m.m108593f(findViewById, "bubbleRoot.findViewById(R.id.close_iv)");
        this.f172435w = (ImageView) findViewById;
        this.f172431s = (TextView) this.f172426n.findViewById(C0966R.C0970id.knx);
        this.f172432t = (TextView) this.f172426n.findViewById(C0966R.C0970id.k_c);
        this.f172433u = (TextView) this.f172426n.findViewById(C0966R.C0970id.hs9);
        this.f172434v = (TextView) this.f172426n.findViewById(C0966R.C0970id.epj);
        this.f172426n.setOnClickListener(new C60492a(this));
        ImageView imageView = this.f172435w;
        if (imageView != null) {
            imageView.setOnClickListener(new C60493b(this));
        }
    }

    /* renamed from: a */
    public final void mo85445a() {
        String str = this.f172423h;
        Log.m105924i(str, "v，parent visibility:" + this.f172420e.getVisibility());
        if (getVisibility() == 0) {
            if (this.f172418A == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f172420e, "alpha", new float[]{1.0f, 0.0f});
                this.f172418A = ofFloat;
                if (ofFloat != null) {
                    ofFloat.addListener(new C60501r4(this));
                }
            }
            ObjectAnimator objectAnimator = this.f172418A;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = this.f172418A;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo85446b() {
        ViewGroup viewGroup = this.f172427o;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            View view = this.f172428p;
            if (view != null && view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Boolean mo85447c() {
        return Boolean.valueOf(getVisibility() == 0);
    }

    /* renamed from: d */
    public final void mo85448d(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f172432t;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f172433u;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f172432t;
        if (textView3 != null) {
            textView3.setText(str);
        }
        boolean z = true;
        if (i <= 0) {
            TextView textView4 = this.f172433u;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f172433u;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            String string = getContext().getString(C0966R.string.day, new Object[]{Integer.valueOf(i)});
            C87412m.m108593f(string, "context.getString(R.stri…team_bubble_pay, payment)");
            int E = C112550d0.m153769E(string, String.valueOf(i), 0, false, 6, (Object) null);
            Context context = getContext();
            String substring = string.substring(0, E);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = string.substring(E, string.length());
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.coin_icon, getContext().getResources().getColor(C0966R.color.Brand_100));
            e.setBounds(0, 0, C76577a.m92155f(getContext(), C0966R.dimen.f3723cd), C76577a.m92155f(getContext(), C0966R.dimen.f3723cd));
            C13598b0 b0Var = C13598b0.f38549a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C76979h) C86312j.m106911c(C76979h.class)).mo107069iE(context, substring, substring2, e, true, false));
            TextView textView6 = this.f172433u;
            if (textView6 != null) {
                textView6.setText(spannableStringBuilder);
            }
        }
        TextView textView7 = this.f172432t;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        if (str2 != null) {
            if (str2.length() <= 0) {
                z = false;
            }
            if (z) {
                TextView textView8 = this.f172432t;
                if (textView8 != null) {
                    textView8.setContentDescription(str2);
                }
                TextView textView9 = this.f172433u;
                if (textView9 != null) {
                    textView9.setContentDescription(" ");
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo85449e(String str, boolean z) {
        TextView textView = this.f172431s;
        if (textView != null) {
            textView.setMaxLines(z ? 2 : 1);
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = this.f172431s;
            if (textView2 != null) {
                textView2.setText(str);
                return;
            }
            return;
        }
        TextView textView3 = this.f172431s;
        if (textView3 != null) {
            textView3.setText("");
        }
    }

    /* renamed from: f */
    public final void mo85450f() {
        C62712dd ddVar = (C62712dd) this.f172422g.mo87687E0(C62712dd.class);
        boolean z = true;
        if (ddVar != null && ddVar.mo14483f0() == 0) {
            Log.m105924i(this.f172423h, "FinderLivePromoteBubblePlugin is showing, return ");
        } else if (!((C54991o) this.f172422g.mo87684A0().mo71262a(C54991o.class)).f154190D) {
            this.f172419d.post(new C60497q4(this));
            String str = this.f172423h;
            Log.m105924i(str, "showBubbleAnim，parent visibility:" + this.f172420e.getVisibility());
            C62707db dbVar = (C62707db) this.f172422g.mo87687E0(C62707db.class);
            if (dbVar == null || dbVar.mo14483f0() != 0) {
                z = false;
            }
            if (z) {
                setVisibility(8);
            } else if (getVisibility() != 0) {
                setVisibility(0);
                if (this.f172438z == null) {
                    this.f172438z = ObjectAnimator.ofFloat(this.f172420e, "alpha", new float[]{0.0f, 1.0f});
                }
                ObjectAnimator objectAnimator = this.f172438z;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = this.f172438z;
                if (objectAnimator2 != null) {
                    objectAnimator2.start();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo85451g() {
        C58739j4 j4Var = C58739j4.f168176a;
        View view = this.f172428p;
        ViewGroup viewGroup = this.f172427o;
        if (view != null && viewGroup != null) {
            int[] iArr = new int[2];
            this.f172419d.getLocationOnScreen(iArr);
            boolean z = true;
            if ((this.f172436x != iArr[0] || this.f172437y != iArr[1]) && this.f172419d.getVisibility() != 8) {
                ViewParent parent = this.f172419d.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                if (((ViewGroup) parent).getVisibility() != 8) {
                    this.f172436x = iArr[0];
                    this.f172437y = iArr[1];
                    int i = C75044y4.m89990b(getRootView().getContext()).x;
                    C75044y4.m89994f(getContext());
                    if (getContext().getResources().getConfiguration().orientation != 2) {
                        z = false;
                    }
                    if (!z) {
                        int width = viewGroup.getWidth();
                        if (width == 0) {
                            width = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a6n);
                        }
                        int width2 = (i - iArr[0]) - (this.f172419d.getWidth() / 2);
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        int i2 = width2 - (width / 2);
                        int i3 = this.f172425j;
                        if (i2 - i3 > 0) {
                            layoutParams2.rightMargin = i2 - i3;
                        } else {
                            layoutParams2.rightMargin = 0;
                        }
                        viewGroup.setLayoutParams(layoutParams2);
                        int width3 = view.getWidth();
                        if (width3 == 0) {
                            width3 = this.f172424i;
                        }
                        int i4 = (width2 - (width3 / 2)) - this.f172425j;
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.rightMargin = i4;
                        view.setLayoutParams(layoutParams4);
                        return;
                    }
                    int width4 = viewGroup.getWidth();
                    if (width4 == 0) {
                        width4 = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3733cm);
                    }
                    int width5 = (i - iArr[0]) - (this.f172419d.getWidth() / 2);
                    ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    int i5 = width5 - (width4 / 2);
                    int i6 = this.f172425j;
                    if (i5 - i6 > 0) {
                        layoutParams6.rightMargin = i5 - i6;
                    } else {
                        layoutParams6.rightMargin = 0;
                    }
                    viewGroup.setLayoutParams(layoutParams6);
                    int width6 = view.getWidth();
                    if (width6 == 0) {
                        width6 = this.f172424i;
                    }
                    int i7 = (width5 - (width6 / 2)) - this.f172425j;
                    ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.rightMargin = i7;
                    view.setLayoutParams(layoutParams8);
                }
            }
        }
    }

    public final C62660c getBasePlugin() {
        return this.f172422g;
    }

    public final TextView getGiftTitleTV() {
        return this.f172434v;
    }

    public final View.OnClickListener getMCloseListener() {
        return this.f172430r;
    }

    public final View.OnClickListener getMListener() {
        return this.f172429q;
    }

    public final TextView getPaySubtitleTV() {
        return this.f172433u;
    }

    public final TextView getSubtitleTV() {
        return this.f172432t;
    }

    public final TextView getTitleTV() {
        return this.f172431s;
    }

    public final void setGiftTitle(String str) {
        TextView textView = this.f172434v;
        if (textView != null) {
            textView.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView2 = this.f172434v;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f172434v;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
    }

    public final void setGiftTitleTV(TextView textView) {
        this.f172434v = textView;
    }

    public final void setMCloseListener(View.OnClickListener onClickListener) {
        this.f172430r = onClickListener;
    }

    public final void setMListener(View.OnClickListener onClickListener) {
        this.f172429q = onClickListener;
    }

    public final void setPaySubtitleTV(TextView textView) {
        this.f172433u = textView;
    }

    public final void setSubtitleTV(TextView textView) {
        this.f172432t = textView;
    }

    public final void setTitleTV(TextView textView) {
        this.f172431s = textView;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewGroup viewGroup = this.f172427o;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
        View view = this.f172428p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
