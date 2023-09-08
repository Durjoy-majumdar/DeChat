package il1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import je1.C9332l2;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import qj1.C63068w1;
import qk1.C63262u1;
import qk1.C63270w1;
import rx3.C13598b0;
import te3.C48868bk1;
import te3.C49572gk1;
import te3.C49712hj1;
import te3.C49765hx0;
import tf0.C64916p1;

/* renamed from: il1.x4 */
public final class C60541x4 implements View.OnClickListener, C11385n {

    /* renamed from: A */
    public String f172559A = "";

    /* renamed from: B */
    public int f172560B;

    /* renamed from: C */
    public int f172561C;

    /* renamed from: D */
    public C89349b f172562D;

    /* renamed from: E */
    public String f172563E = "";

    /* renamed from: F */
    public C54130j f172564F;

    /* renamed from: d */
    public final ViewGroup f172565d;

    /* renamed from: e */
    public final C58124b f172566e;

    /* renamed from: f */
    public final C63068w1 f172567f;

    /* renamed from: g */
    public final View f172568g;

    /* renamed from: h */
    public final View f172569h;

    /* renamed from: i */
    public final TextView f172570i;

    /* renamed from: j */
    public final WeImageView f172571j;

    /* renamed from: n */
    public final EditText f172572n;

    /* renamed from: o */
    public final TextView f172573o;

    /* renamed from: p */
    public final TextView f172574p;

    /* renamed from: q */
    public final View f172575q;

    /* renamed from: r */
    public final RecyclerView f172576r;

    /* renamed from: s */
    public final View f172577s;

    /* renamed from: t */
    public final RefreshLoadMoreLayout f172578t;

    /* renamed from: u */
    public final C63262u1 f172579u;

    /* renamed from: v */
    public final C63270w1 f172580v;

    /* renamed from: w */
    public final HashMap<String, C54130j> f172581w = new HashMap<>();

    /* renamed from: x */
    public int f172582x = 0;

    /* renamed from: y */
    public final ArrayList<C49765hx0> f172583y = new ArrayList<>();

    /* renamed from: z */
    public ArrayList<C48868bk1> f172584z = new ArrayList<>();

    /* renamed from: il1.x4$a */
    public static final class C60542a extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C60541x4 f172585a;

        public C60542a(C60541x4 x4Var) {
            this.f172585a = x4Var;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            TextView textView;
            TextView textView2;
            Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "loadMoreSearchData query:" + this.f172585a.f172559A);
            C60541x4 x4Var = this.f172585a;
            String str = x4Var.f172559A;
            View view = null;
            if (x4Var.f172561C == 1) {
                x4Var.f172563E = C58739j4.f168176a.mo83718n();
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1.C64917a.m76434a((C64916p1) c, str, x4Var.f172560B, x4Var.f172563E, x4Var.f172562D, 11, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, 480, (Object) null);
                C86709a0.m107524d().mo123455a(3820, x4Var);
                View loadMoreFooter = x4Var.f172578t.getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eas);
                }
                View loadMoreFooter2 = x4Var.f172578t.getLoadMoreFooter();
                TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                View loadMoreFooter3 = x4Var.f172578t.getLoadMoreFooter();
                if (loadMoreFooter3 != null) {
                    view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                }
                View view2 = view;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            View loadMoreFooter4 = x4Var.f172578t.getLoadMoreFooter();
            if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eat);
            }
            View loadMoreFooter5 = x4Var.f172578t.getLoadMoreFooter();
            TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            View loadMoreFooter6 = x4Var.f172578t.getLoadMoreFooter();
            if (loadMoreFooter6 != null) {
                view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
            }
            View view3 = view;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: il1.x4$b */
    public static final class C60543b extends C87413o implements C32226l<C49765hx0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60543b(C60541x4 x4Var) {
            super(1);
            this.f172586d = x4Var;
        }

        public Object invoke(Object obj) {
            C49765hx0 hx02 = (C49765hx0) obj;
            C87412m.m108594g(hx02, LocaleUtil.ITALIAN);
            C54130j jVar = this.f172586d.f172564F;
            String str = null;
            String str2 = jVar != null ? jVar.f151999c : null;
            FinderContact finderContact = hx02.f134919d;
            if (Util.isEqual(str2, finderContact != null ? finderContact.username : null)) {
                C58124b.C7172a.m7372a(this.f172586d.f172566e, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
            } else if (this.f172586d.f172567f.mo88003Z0()) {
                Bundle bundle = new Bundle();
                C60541x4 x4Var = this.f172586d;
                x4Var.mo85506a();
                x4Var.f172567f.mo88004a1();
                HashMap<String, C54130j> hashMap = x4Var.f172581w;
                FinderContact finderContact2 = hx02.f134919d;
                C54130j jVar2 = hashMap.get(finderContact2 != null ? finderContact2.username : null);
                if (jVar2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("invite panel item click, apply pk. nickname:");
                    FinderContact finderContact3 = hx02.f134919d;
                    sb.append(finderContact3 != null ? finderContact3.nickname : null);
                    Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", sb.toString());
                    bundle.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", hx02.toByteArray());
                    x4Var.f172566e.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_APPLY_PK, bundle);
                } else {
                    ((C54963d0) x4Var.f172567f.mo87696x0(C54963d0.class)).f154073p = jVar2;
                    C58124b.C7172a.m7372a(x4Var.f172566e, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ACCEPT_PK, (Bundle) null, 2, (Object) null);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("invite panel item click, accept pk. nickname:");
                    FinderContact finderContact4 = hx02.f134919d;
                    sb4.append(finderContact4 != null ? finderContact4.nickname : null);
                    Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", sb4.toString());
                }
                C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
                C54067f0.C54087y yVar = C54067f0.C54087y.INVITE_ANCHOR_LINKMIC;
                FinderContact finderContact5 = hx02.f134919d;
                if (finderContact5 != null) {
                    str = finderContact5.username;
                }
                oVar.Xx0(yVar, str, -1, -1);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.x4$c */
    public static final class C60544c extends C87413o implements C32226l<C48868bk1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60544c(C60541x4 x4Var) {
            super(1);
            this.f172587d = x4Var;
        }

        public Object invoke(Object obj) {
            C48868bk1 bk12 = (C48868bk1) obj;
            C87412m.m108594g(bk12, "searchInfo");
            StringBuilder sb = new StringBuilder();
            sb.append("invite search panel item click, nickname:");
            FinderContact finderContact = bk12.f131162d;
            sb.append(finderContact != null ? finderContact.nickname : null);
            Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", sb.toString());
            FinderContact finderContact2 = bk12.f131162d;
            if (finderContact2 != null) {
                C60541x4 x4Var = this.f172587d;
                C54130j jVar = x4Var.f172564F;
                if (Util.isEqual(jVar != null ? jVar.f151999c : null, finderContact2.username)) {
                    C58124b.C7172a.m7372a(x4Var.f172566e, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
                } else if (x4Var.f172567f.mo88003Z0()) {
                    Bundle bundle = new Bundle();
                    x4Var.mo85506a();
                    x4Var.f172567f.mo88004a1();
                    C54130j jVar2 = x4Var.f172581w.get(finderContact2.username);
                    if (jVar2 == null) {
                        C49765hx0 hx02 = new C49765hx0();
                        hx02.f134919d = finderContact2;
                        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, apply pk.");
                        bundle.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", hx02.toByteArray());
                        x4Var.f172566e.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_APPLY_PK, bundle);
                    } else {
                        ((C54963d0) x4Var.f172567f.mo87696x0(C54963d0.class)).f154073p = jVar2;
                        C58124b.C7172a.m7372a(x4Var.f172566e, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ACCEPT_PK, (Bundle) null, 2, (Object) null);
                        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "invite search panel item click, accept pk.");
                    }
                    ((C54108o) C86312j.m106911c(C54108o.class)).Xx0(C54067f0.C54087y.INVITE_ANCHOR_LINKMIC, finderContact2.username, -1, -1);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.x4$d */
    public static final class C60545d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172588d;

        public C60545d(C60541x4 x4Var) {
            this.f172588d = x4Var;
        }

        public void afterTextChanged(Editable editable) {
            Editable text = this.f172588d.f172572n.getText();
            String obj = text != null ? text.toString() : null;
            if (obj == null || obj.length() == 0) {
                this.f172588d.f172571j.setVisibility(8);
            } else {
                this.f172588d.f172571j.setVisibility(0);
            }
            C60541x4 x4Var = this.f172588d;
            if (obj == null) {
                obj = "";
            }
            x4Var.f172559A = obj;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: il1.x4$e */
    public static final class C60546e implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172589d;

        public C60546e(C60541x4 x4Var) {
            this.f172589d = x4Var;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str = this.f172589d.f172559A;
            boolean z = false;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                C60541x4 x4Var = this.f172589d;
                if (3 == i || keyEvent.getAction() == 66) {
                    x4Var.getClass();
                    Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "loadSearchData query:" + x4Var.f172559A);
                    x4Var.f172574p.setVisibility(8);
                    View view = x4Var.f172575q;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    x4Var.f172584z.clear();
                    x4Var.f172560B = 0;
                    x4Var.f172561C = 0;
                    x4Var.f172562D = null;
                    x4Var.f172563E = C58739j4.f168176a.mo83718n();
                    String str2 = x4Var.f172559A;
                    if (str2 == null || str2.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        C7335d c = C86312j.m106911c(C64916p1.class);
                        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                        C64916p1.C64917a.m76434a((C64916p1) c, x4Var.f172559A, x4Var.f172560B, x4Var.f172563E, x4Var.f172562D, 11, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, 480, (Object) null);
                        C86709a0.m107524d().mo123455a(3820, x4Var);
                    }
                    Util.hideVKB(x4Var.f172572n);
                }
            }
            return true;
        }
    }

    /* renamed from: il1.x4$f */
    public static final class C60547f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172590d;

        /* renamed from: e */
        public final /* synthetic */ float f172591e;

        public C60547f(C60541x4 x4Var, float f) {
            this.f172590d = x4Var;
            this.f172591e = f;
        }

        public void onAnimationCancel(Animator animator) {
            this.f172590d.f172565d.setTranslationX(this.f172591e);
            this.f172590d.f172565d.setVisibility(8);
        }

        public void onAnimationEnd(Animator animator) {
            this.f172590d.f172565d.setTranslationX(this.f172591e);
            this.f172590d.f172565d.setVisibility(8);
        }
    }

    /* renamed from: il1.x4$g */
    public static final class C60548g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172592d;

        public C60548g(C60541x4 x4Var) {
            this.f172592d = x4Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f172592d.f172569h.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(intValue);
            this.f172592d.f172569h.requestLayout();
        }
    }

    /* renamed from: il1.x4$h */
    public static final class C60549h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172593d;

        public C60549h(C60541x4 x4Var) {
            this.f172593d = x4Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f172593d.f172569h.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(intValue);
            this.f172593d.f172569h.requestLayout();
        }
    }

    /* renamed from: il1.x4$i */
    public static final class C60550i extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172594d;

        public C60550i(C60541x4 x4Var) {
            this.f172594d = x4Var;
        }

        public void onAnimationEnd(Animator animator) {
            C60541x4 x4Var = this.f172594d;
            if (x4Var.f172582x == 1) {
                x4Var.f172570i.setVisibility(0);
            }
        }
    }

    /* renamed from: il1.x4$j */
    public static final class C60551j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60541x4 f172595d;

        public C60551j(C60541x4 x4Var) {
            this.f172595d = x4Var;
        }

        public final void run() {
            this.f172595d.f172572n.requestFocus();
            C60541x4 x4Var = this.f172595d;
            InputMethodManager inputMethodManager = (InputMethodManager) x4Var.f172565d.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(x4Var.f172572n, 0);
            }
        }
    }

    public C60541x4(ViewGroup viewGroup, C58124b bVar, C63068w1 w1Var) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(w1Var, "basePlugin");
        this.f172565d = viewGroup;
        this.f172566e = bVar;
        this.f172567f = w1Var;
        C63262u1 u1Var = new C63262u1();
        this.f172579u = u1Var;
        C63270w1 w1Var2 = new C63270w1();
        this.f172580v = w1Var2;
        viewGroup.setTranslationX((float) C75044y4.m89990b(viewGroup.getContext()).x);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dnv);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…te_anchor_link_close_btn)");
        WeImageView weImageView = (WeImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.do4);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…r_link_search_group_root)");
        this.f172568g = findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f358165do3);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…anchor_link_search_group)");
        this.f172569h = findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.f358163do1);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…or_link_search_cancel_tv)");
        TextView textView = (TextView) findViewById4;
        this.f172570i = textView;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.dnu);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…e_anchor_link_clear_icon)");
        WeImageView weImageView2 = (WeImageView) findViewById5;
        this.f172571j = weImageView2;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.do5);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…_anchor_link_search_icon)");
        WeImageView weImageView3 = (WeImageView) findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.f358164do2);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…_anchor_link_search_edit)");
        EditText editText = (EditText) findViewById7;
        this.f172572n = editText;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.dny);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.f…chor_link_content_tip_tv)");
        this.f172573o = (TextView) findViewById8;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.dnw);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.f…or_link_content_empty_tv)");
        this.f172574p = (TextView) findViewById9;
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.f358162do0);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.f…vite_anchor_link_loading)");
        this.f172575q = findViewById10;
        View findViewById11 = viewGroup.findViewById(C0966R.C0970id.dnz);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.f…te_anchor_link_list_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById11;
        this.f172576r = recyclerView;
        View findViewById12 = viewGroup.findViewById(C0966R.C0970id.dnx);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.f…nchor_link_content_group)");
        this.f172577s = findViewById12;
        View findViewById13 = viewGroup.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.rl_layout)");
        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById13;
        this.f172578t = refreshLoadMoreLayout;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.do7);
        refreshLoadMoreLayout.setEnablePullDownHeader(false);
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.g2t);
        if (textView3 != null) {
            textView3.setTextColor(viewGroup.getContext().getResources().getColor(C0966R.color.f3553xj));
        }
        refreshLoadMoreLayout.setLoadMoreFooter(inflate);
        refreshLoadMoreLayout.setActionCallback(new C60542a(this));
        viewGroup.getLayoutParams().height = (C75044y4.m89990b(viewGroup.getContext()).y * 2) / 3;
        ViewGroup.LayoutParams layoutParams = refreshLoadMoreLayout.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C75044y4.m89991c(viewGroup.getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        recyclerView.setAdapter(u1Var);
        u1Var.f179535g = new C60543b(this);
        w1Var2.f179571g = new C60544c(this);
        editText.addTextChangedListener(new C60545d(this));
        editText.setOnEditorActionListener(new C60546e(this));
        textView.setOnClickListener(this);
        weImageView2.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        viewGroup.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo85506a() {
        mo85507b();
        float f = (float) C75044y4.m89990b(this.f172565d.getContext()).x;
        this.f172565d.animate().translationX(f).setListener(new C60547f(this, f)).start();
    }

    /* renamed from: b */
    public final void mo85507b() {
        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToNormalMode");
        this.f172582x = 0;
        View view = this.f172575q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172570i.setVisibility(4);
        this.f172571j.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.f172569h.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        boolean z = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0});
        ofInt.setDuration(200);
        ofInt.addUpdateListener(new C60548g(this));
        ofInt.start();
        this.f172572n.setText((CharSequence) null);
        this.f172576r.setAdapter(this.f172579u);
        ArrayList<C49765hx0> arrayList = this.f172583y;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f172573o.setVisibility(8);
            this.f172576r.setVisibility(8);
            this.f172574p.setVisibility(8);
            View view2 = this.f172575q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f172573o.setVisibility(0);
            this.f172576r.setVisibility(0);
            this.f172574p.setVisibility(8);
            View view4 = this.f172575q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C63262u1 u1Var = this.f172579u;
            ArrayList<C49765hx0> arrayList2 = this.f172583y;
            u1Var.getClass();
            C87412m.m108594g(arrayList2, "data");
            u1Var.f179532d.clear();
            u1Var.f179532d.addAll(arrayList2);
            this.f172579u.notifyDataSetChanged();
        }
        Util.hideVKB(this.f172572n);
    }

    /* renamed from: c */
    public final void mo85508c() {
        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToSearchMode");
        this.f172582x = 1;
        this.f172573o.setVisibility(8);
        this.f172576r.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.f172569h.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int measuredWidth = this.f172570i.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams2 = this.f172570i.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart()});
        ofInt.setDuration(200);
        ofInt.addUpdateListener(new C60549h(this));
        ofInt.addListener(new C60550i(this));
        ofInt.start();
        this.f172572n.post(new C60551j(this));
        this.f172576r.setAdapter(this.f172580v);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dnv) {
            mo85506a();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dnu) {
            this.f172572n.setText("");
            C63270w1 w1Var = this.f172580v;
            ArrayList arrayList2 = new ArrayList();
            w1Var.getClass();
            w1Var.f179568d.clear();
            w1Var.f179568d.addAll(arrayList2);
            this.f172580v.notifyDataSetChanged();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358163do1) {
            Util.hideVKB(this.f172572n);
            mo85507b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C9332l2) {
            C86709a0.m107524d().mo123470p(3820, this);
            Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "onSceneEnd NetSceneFinderSearch errType:" + i + " errCode:" + i2 + " query:" + this.f172559A);
            if (i == 0 && i2 == 0) {
                C49572gk1 response = ((C9332l2) yVar).getResponse();
                Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "updateSearchData showMode:" + this.f172582x);
                if (this.f172582x == 1) {
                    C8478d0 d0Var = new C8478d0();
                    d0Var.f27483d = this.f172584z.size();
                    C8478d0 d0Var2 = new C8478d0();
                    d0Var2.f27483d = this.f172584z.size();
                    this.f172584z.addAll(response.f134088d);
                    this.f172560B = response.f134089e;
                    this.f172561C = response.f134090f;
                    this.f172562D = response.f134092h;
                    d0Var2.f27483d = this.f172584z.size();
                    Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "searchContactList size:" + this.f172584z.size() + " offset:" + response.f134089e + " continueFlag:" + response.f134090f);
                    C61926c.m72668M(new C60348b5(this, d0Var2, d0Var));
                }
            }
        }
    }
}
