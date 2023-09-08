package hp1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4167r7;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import er1.C7878t0;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C48868bk1;
import up1.C27696y;
import z04.C112551y;

/* renamed from: hp1.f0 */
public final class C8661f0 extends RecyclerView.C16631z {

    /* renamed from: W */
    public static final /* synthetic */ int f27826W = 0;

    /* renamed from: A */
    public final boolean f27827A;

    /* renamed from: B */
    public final String f27828B;

    /* renamed from: C */
    public View f27829C;

    /* renamed from: D */
    public ImageView f27830D;

    /* renamed from: E */
    public TextView f27831E;

    /* renamed from: F */
    public TextView f27832F;

    /* renamed from: G */
    public LinearLayout f27833G;

    /* renamed from: H */
    public TextView f27834H;

    /* renamed from: I */
    public TextView f27835I;

    /* renamed from: J */
    public TextView f27836J;

    /* renamed from: K */
    public View f27837K;

    /* renamed from: L */
    public View f27838L;

    /* renamed from: M */
    public ImageView f27839M;

    /* renamed from: N */
    public FinderLiveOnliveWidget f27840N;

    /* renamed from: P */
    public int f27841P;

    /* renamed from: Q */
    public int f27842Q;

    /* renamed from: R */
    public Drawable f27843R;

    /* renamed from: S */
    public Drawable f27844S;

    /* renamed from: T */
    public Drawable f27845T;

    /* renamed from: U */
    public Drawable f27846U;

    /* renamed from: V */
    public int f27847V;

    /* renamed from: z */
    public final boolean f27848z;

    /* renamed from: hp1.f0$a */
    public static final class C8662a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8661f0 f27849d;

        public C8662a(C8661f0 f0Var) {
            this.f27849d = f0Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f27849d.f27840N.getHitRect(rect);
            int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
            rect.inset(i, i);
            ViewParent parent = this.f27849d.f27840N.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f27849d.f27840N));
        }
    }

    /* renamed from: hp1.f0$b */
    public static final class C8663b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8661f0 f27850d;

        /* renamed from: e */
        public final /* synthetic */ C58969q f27851e;

        public C8663b(C8661f0 f0Var, C58969q qVar) {
            this.f27850d = f0Var;
            this.f27851e = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f27850d.f27840N.getContext();
            C87412m.m108593f(context, "userOnLive.context");
            C58969q qVar = this.f27851e;
            new C4167r7(context, qVar != null ? qVar.getUsername() : null, this.f27850d.mo17363j(), false, 0, 16, (C8480h) null).mo5050a(false, true, (FinderObject) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8661f0(View view, boolean z, boolean z2) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f27848z = z;
        this.f27827A = z2;
        this.f27828B = "Finder.MixSearchContactItemHolder";
        View findViewById = view.findViewById(C0966R.C0970id.c8m);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.divider_view)");
        this.f27829C = findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.a27);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.avatar_iv)");
        this.f27830D = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.kpm);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.title_tv)");
        this.f27831E = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.ect);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.follow_tv)");
        this.f27832F = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.f6y);
        C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.info_layout)");
        this.f27833G = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.i47);
        C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.profession_tv)");
        this.f27834H = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.c25);
        C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.desc_1_tv)");
        this.f27835I = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.c26);
        C87412m.m108593f(findViewById8, "itemView.findViewById(R.id.desc_2_tv)");
        this.f27836J = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C0966R.C0970id.kpe);
        C87412m.m108593f(findViewById9, "itemView.findViewById(R.id.title_sub_container)");
        this.f27837K = findViewById9;
        View findViewById10 = view.findViewById(C0966R.C0970id.ec9);
        C87412m.m108593f(findViewById10, "itemView.findViewById(R.id.follow_layout)");
        this.f27838L = findViewById10;
        View findViewById11 = view.findViewById(C0966R.C0970id.a0h);
        C87412m.m108593f(findViewById11, "itemView.findViewById(R.id.auth_icon_iv)");
        this.f27839M = (ImageView) findViewById11;
        View findViewById12 = view.findViewById(C0966R.C0970id.dv9);
        C87412m.m108593f(findViewById12, "itemView.findViewById(R.…inder_live_onlive_widget)");
        this.f27840N = (FinderLiveOnliveWidget) findViewById12;
        this.f27841P = view.getResources().getColor(C0966R.color.Blue_100);
        this.f27842Q = view.getResources().getColor(C0966R.color.Brand_100);
        this.f27843R = view.getResources().getDrawable(C0966R.C0969drawable.a4t);
        this.f27844S = view.getResources().getDrawable(C0966R.C0969drawable.a4s);
        this.f27845T = view.getResources().getDrawable(C0966R.C0969drawable.a4v);
        this.f27846U = view.getResources().getDrawable(C0966R.C0969drawable.a4u);
        this.f27847V = 1;
        this.f27840N.post(new C8662a(this));
    }

    /* renamed from: y */
    public final void mo9518y(C48868bk1 bk12, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, boolean z) {
        FinderAuthInfo finderAuthInfo;
        Drawable drawable;
        Drawable drawable2;
        C48868bk1 bk13 = bk12;
        View.OnClickListener onClickListener2 = onClickListener;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76979h.class;
        C87412m.m108594g(bk13, "finderSearchInfo");
        C87412m.m108594g(onClickListener2, "itemClickListener");
        if (z) {
            View view = this.f27829C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder", "onBindView", "(Lcom/tencent/mm/protocal/protobuf/FinderSearchInfo;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = view;
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder", "onBindView", "(Lcom/tencent/mm/protocal/protobuf/FinderSearchInfo;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f27829C;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder", "onBindView", "(Lcom/tencent/mm/protocal/protobuf/FinderSearchInfo;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder", "onBindView", "(Lcom/tencent/mm/protocal/protobuf/FinderSearchInfo;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f27831E;
        C76979h hVar = (C76979h) C86312j.m106911c(cls3);
        Context context = MMApplicationContext.getContext();
        C8703w0 w0Var = C8703w0.f27927a;
        String str = bk13.f131163e;
        if (str == null) {
            str = "";
        }
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f27831E.getCurrentTextColor() & 16777215)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        if (this.f27848z) {
            format = "";
        }
        textView.setText(hVar.Te0(context, w0Var.mo9552c(str, format), this.f27831E.getTextSize()));
        this.f27831E.requestLayout();
        FinderContact finderContact = bk13.f131162d;
        C58969q f = finderContact != null ? C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null) : null;
        C39818r rVar = C39818r.f106831a;
        String str2 = "";
        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(f != null ? f.getAvatarUrl() : null, (C27696y) null, 2, (C8480h) null), this.f27830D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        this.f27847V = 1;
        boolean h = C58961d.C58963b.m68836h(C58961d.f168673a, f != null ? f.getUsername() : null, (String) null, false, false, 14, (Object) null);
        C58784w3 w3Var = C58784w3.f168295a;
        boolean z2 = h && !w3Var.mo83899R0(f != null ? f.getUsername() : null);
        int i = bk13.f131166h;
        TextView textView2 = this.f27832F;
        textView2.setVisibility((z2 || i > 0) ? 0 : 8);
        if (z2) {
            textView2.setText(this.f44854d.getResources().getString(C0966R.string.fje));
            if (this.f27827A) {
                textView2.setTextColor(this.f27841P);
                drawable2 = this.f27844S;
            } else {
                textView2.setTextColor(this.f27841P);
                drawable2 = this.f27843R;
            }
            textView2.setBackground(drawable2);
        } else if (i > 0) {
            textView2.setText(this.f44854d.getResources().getString(C0966R.string.en6, new Object[]{C7878t0.m8039h(i)}));
            if (this.f27827A) {
                textView2.setTextColor(this.f27842Q);
                drawable = this.f27846U;
            } else {
                textView2.setTextColor(this.f27842Q);
                drawable = this.f27845T;
            }
            textView2.setBackground(drawable);
        }
        String str3 = bk13.f131164f;
        if (str3 == null) {
            str3 = str2;
        }
        String signature = f != null ? f.getSignature() : str2;
        this.f27835I.setVisibility(0);
        this.f27836J.setVisibility(8);
        if (!Util.isNullOrNil(str3)) {
            TextView textView3 = this.f27835I;
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls3);
            Context context2 = MMApplicationContext.getContext();
            String n = C112551y.m153814n(str3, "\n", " ", false);
            String format2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f27835I.getCurrentTextColor() & 16777215)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            if (this.f27848z) {
                format2 = str2;
            }
            textView3.setText(hVar2.Te0(context2, w0Var.mo9552c(n, format2), this.f27835I.getTextSize()));
            this.f27847V++;
        } else if (!Util.isNullOrNil(signature)) {
            this.f27835I.setText(C112551y.m153814n(signature, "\n", " ", false));
            this.f27847V++;
        } else {
            this.f27835I.setVisibility(8);
        }
        if (f == null || (finderAuthInfo = f.field_authInfo) == null) {
            this.f27839M.setVisibility(8);
            this.f27834H.setVisibility(8);
        } else {
            C58784w3.m68429F1(w3Var, this.f27839M, finderAuthInfo, 0, C58960c.m68830b(f, false), 4, (Object) null);
            int i2 = finderAuthInfo.authIconType;
            if (i2 == 1) {
                this.f27839M.setVisibility(0);
                this.f27834H.setVisibility(0);
                if (Util.isNullOrNil(bk13.f131167i)) {
                    this.f27834H.setText(finderAuthInfo.authProfession);
                } else {
                    TextView textView4 = this.f27834H;
                    C76979h hVar3 = (C76979h) C86312j.m106911c(cls3);
                    Context context3 = MMApplicationContext.getContext();
                    String str4 = bk13.f131167i;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    String format3 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f27834H.getCurrentTextColor() & 16777215)}, 1));
                    C87412m.m108593f(format3, "format(format, *args)");
                    textView4.setText(hVar3.Te0(context3, w0Var.mo9552c(str4, !this.f27848z ? format3 : str2), this.f27834H.getTextSize()));
                }
                this.f27847V++;
            } else if (i2 == 2) {
                this.f27839M.setVisibility(0);
                this.f27834H.setVisibility(8);
            } else if (i2 != 100) {
                this.f27839M.setVisibility(8);
                this.f27834H.setVisibility(8);
            } else {
                this.f27839M.setVisibility(8);
                this.f27834H.setVisibility(8);
            }
        }
        this.f44854d.setTag(bk13);
        this.f44854d.setOnClickListener(onClickListener2);
        this.f44854d.setOnLongClickListener(onLongClickListener);
        if (f != null && f.field_liveStatus == 1) {
            this.f27840N.setVisibility(0);
            FinderLiveOnliveWidget finderLiveOnliveWidget = this.f27840N;
            if (finderLiveOnliveWidget != null) {
                finderLiveOnliveWidget.setOnClickListener(new C8663b(this, f));
            }
        } else {
            this.f27840N.setVisibility(8);
        }
        if (this.f27847V <= 2) {
            this.f27833G.setGravity(16);
        } else {
            this.f27833G.setGravity(0);
        }
        if (this.f27839M.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = this.f27839M.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = (int) this.f44854d.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            this.f27839M.setLayoutParams(layoutParams2);
        }
        this.f27831E.getViewTreeObserver().addOnPreDrawListener(new C8665g0(this, bk13));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8661f0(View view, boolean z, boolean z2, int i, C8480h hVar) {
        this(view, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
