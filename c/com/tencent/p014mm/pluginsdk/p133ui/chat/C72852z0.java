package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.app.Activity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import bp3.C104160f;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj3.C20713c;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.Arrays;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p206nj.C47264o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yd3.C66622a;
import yd3.C79080b;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0 */
public final class C72852z0 {

    /* renamed from: u */
    public static int f212316u = ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_chatting_full_screen_edt_and, C104160f.RepairerConfig_Global_FullScreenEdt_Int, 1);

    /* renamed from: a */
    public final ChatFooter f212317a;

    /* renamed from: b */
    public final C74974a f212318b;

    /* renamed from: c */
    public boolean f212319c;

    /* renamed from: d */
    public final ChatFooter$$t1 f212320d;

    /* renamed from: e */
    public final View.OnLayoutChangeListener f212321e;

    /* renamed from: f */
    public final C13601g f212322f;

    /* renamed from: g */
    public final C72871s f212323g;

    /* renamed from: h */
    public final C13601g f212324h;

    /* renamed from: i */
    public final C13601g f212325i;

    /* renamed from: j */
    public final C13601g f212326j;

    /* renamed from: k */
    public final C13601g f212327k;

    /* renamed from: l */
    public final C13601g f212328l;

    /* renamed from: m */
    public final C13601g f212329m;

    /* renamed from: n */
    public final C13601g f212330n;

    /* renamed from: o */
    public final C13601g f212331o;

    /* renamed from: p */
    public final C13601g f212332p;

    /* renamed from: q */
    public final C13601g f212333q;

    /* renamed from: r */
    public final C13601g f212334r;

    /* renamed from: s */
    public final C13601g f212335s;

    /* renamed from: t */
    public final C13601g f212336t;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$a */
    public static final class C72853a {

        /* renamed from: a */
        public final int f212337a;

        /* renamed from: b */
        public final int f212338b;

        /* renamed from: c */
        public final int[] f212339c;

        public C72853a(int i, int i2, int[] iArr) {
            C87412m.m108594g(iArr, "loc");
            this.f212337a = i;
            this.f212338b = i2;
            this.f212339c = iArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C72853a)) {
                return false;
            }
            C72853a aVar = (C72853a) obj;
            return this.f212337a == aVar.f212337a && this.f212338b == aVar.f212338b && C87412m.m108589b(this.f212339c, aVar.f212339c);
        }

        public int hashCode() {
            return (((this.f212337a * 31) + this.f212338b) * 31) + Arrays.hashCode(this.f212339c);
        }

        public String toString() {
            return "AnimViewParam(width=" + this.f212337a + ", height=" + this.f212338b + ", loc=" + Arrays.toString(this.f212339c) + ')';
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$b */
    public static final class C72854b {
        public C72854b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$c */
    public static final class C72855c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72855c(C72852z0 z0Var) {
            super(0);
            this.f212340d = z0Var;
        }

        public Object invoke() {
            return this.f212340d.mo100690c().mo91562c(C0966R.C0970id.f5383do);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$d */
    public static final class C72856d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72856d(C72852z0 z0Var) {
            super(0);
            this.f212341d = z0Var;
        }

        public Object invoke() {
            View findViewById = this.f212341d.mo100694g().findViewById(C0966R.C0970id.dkk);
            findViewById.setOnClickListener(new C72782e1(this.f212341d));
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$e */
    public static final class C72857e extends C87413o implements C32224a<WeImageButton> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72857e(C72852z0 z0Var) {
            super(0);
            this.f212342d = z0Var;
        }

        public Object invoke() {
            WeImageButton weImageButton = (WeImageButton) this.f212342d.mo100694g().findViewById(C0966R.C0970id.dsg);
            weImageButton.setOnClickListener(new C72785f1(this.f212342d));
            return weImageButton;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$f */
    public static final class C72858f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72858f(C72852z0 z0Var) {
            super(0);
            this.f212343d = z0Var;
        }

        public Object invoke() {
            View c = this.f212343d.mo100690c().mo91562c(C0966R.C0970id.dkm);
            c.setOnClickListener(new C72789g1(this.f212343d));
            return c;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$g */
    public static final class C72859g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72859g(C72852z0 z0Var) {
            super(0);
            this.f212344d = z0Var;
        }

        public Object invoke() {
            return this.f212344d.mo100690c().mo91562c(C0966R.C0970id.b44);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$h */
    public static final class C72860h extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72860h(C72852z0 z0Var) {
            super(0);
            this.f212345d = z0Var;
        }

        public Object invoke() {
            return (LinearLayout) this.f212345d.f212317a.findViewById(C0966R.C0970id.cd_);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$i */
    public static final class C72861i extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72861i(C72852z0 z0Var) {
            super(0);
            this.f212346d = z0Var;
        }

        public Object invoke() {
            return (LinearLayout) this.f212346d.mo100694g().findViewById(C0966R.C0970id.ndq);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$j */
    public static final class C72862j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72862j(C72852z0 z0Var) {
            super(0);
            this.f212347d = z0Var;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(this.f212347d.mo100691d(), C0966R.dimen.f3680b_));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$k */
    public static final class C72863k implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212348d;

        public C72863k(C72852z0 z0Var) {
            this.f212348d = z0Var;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C72852z0 z0Var = this.f212348d;
            z0Var.mo100695h(z0Var.f212318b.getLineCount());
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$l */
    public static final class C72864l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72864l(C72852z0 z0Var) {
            super(0);
            this.f212349d = z0Var;
        }

        public Object invoke() {
            View findViewById = this.f212349d.mo100694g().findViewById(C0966R.C0970id.ixe);
            C72852z0 z0Var = this.f212349d;
            findViewById.setOnTouchListener(new C72798i1(findViewById, z0Var));
            findViewById.setOnClickListener(new C72800j1(z0Var));
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C47264o.m52556a(findViewById.getContext(), -1);
                findViewById.setLayoutParams(marginLayoutParams);
            }
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$m */
    public static final class C72865m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72865m(C72852z0 z0Var) {
            super(0);
            this.f212350d = z0Var;
        }

        /* JADX WARNING: type inference failed for: r1v5, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                com.tencent.mm.pluginsdk.ui.chat.z0 r0 = r4.f212350d
                android.app.Activity r0 = r0.mo100691d()
                android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
                r1 = 2131493566(0x7f0c02be, float:1.8610616E38)
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.tencent.mm.pluginsdk.ui.chat.z0 r1 = r4.f212350d
                ck3.b r1 = r1.mo100690c()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                boolean r3 = r1 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x0029
                r2 = r1
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            L_0x0029:
                if (r2 == 0) goto L_0x002e
                r2.addView(r0)
            L_0x002e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72852z0.C72865m.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$n */
    public static final class C72866n extends C87413o implements C32224a<InputMethodManager> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72866n(C72852z0 z0Var) {
            super(0);
            this.f212351d = z0Var;
        }

        public Object invoke() {
            Object systemService = this.f212351d.f212317a.getContext().getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                return (InputMethodManager) systemService;
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$o */
    public static final class C72867o implements ChatFooter$$t1 {

        /* renamed from: a */
        public final /* synthetic */ C72852z0 f212352a;

        public C72867o(C72852z0 z0Var) {
            this.f212352a = z0Var;
        }

        /* renamed from: r */
        public final void mo96023r(int i) {
            Log.m105918d("ChatFooterKt", "onKeyboardHeightChange() called with: height = " + i);
            C72852z0 z0Var = this.f212352a;
            if (z0Var.mo100696i()) {
                z0Var.mo100693f().post(new C72803k1(z0Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$p */
    public static final class C72868p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212353d;

        /* renamed from: e */
        public final /* synthetic */ C72853a f212354e;

        public C72868p(C72852z0 z0Var, C72853a aVar) {
            this.f212353d = z0Var;
            this.f212354e = aVar;
        }

        public final void run() {
            C72852z0 z0Var = this.f212353d;
            C72853a aVar = this.f212354e;
            int[] iArr = new int[2];
            z0Var.f212318b.mo104257n().getLocationOnScreen(iArr);
            int left = z0Var.mo100692e().getLeft();
            int top = z0Var.mo100692e().getTop();
            int[] iArr2 = aVar.f212339c;
            int i = iArr2[0] - iArr[0];
            int i2 = iArr2[1] - iArr[1];
            int intValue = ((Number) ((C36570n) z0Var.f212336t).getValue()).intValue();
            int h = C76577a.m92157h(z0Var.mo100691d(), C0966R.dimen.f3723cd);
            z0Var.mo100693f().setTranslationX((float) i);
            z0Var.mo100693f().setTranslationY((float) i2);
            ViewPropertyAnimator translationY = z0Var.mo100693f().animate().translationX(0.0f).translationY(0.0f);
            translationY.setInterpolator(C20713c.f58572a.mo32435a());
            translationY.setDuration(300);
            translationY.start();
            View g = z0Var.mo100694g();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = g;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animOpen", "(Lcom/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animOpen", "(Lcom/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z0Var.mo100701n();
            translationY.setUpdateListener(new C72773c1(z0Var, left, top, aVar.f212337a + left, aVar.f212338b + top, intValue, h, 0.0f, 0.5f));
            translationY.setListener(new C72778d1(translationY, z0Var));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$q */
    public static final class C72869q extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72869q(C72852z0 z0Var) {
            super(0);
            this.f212355d = z0Var;
        }

        public Object invoke() {
            return this.f212355d.mo100690c().mo91562c(C0966R.C0970id.cgd);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$r */
    public static final class C72870r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72870r(C72852z0 z0Var) {
            super(0);
            this.f212356d = z0Var;
        }

        public Object invoke() {
            return this.f212356d.mo100690c().mo91562c(C0966R.C0970id.jnk);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$s */
    public static final class C72871s implements ChatFooterPanel.C72718b {

        /* renamed from: a */
        public final /* synthetic */ C72852z0 f212357a;

        public C72871s(C72852z0 z0Var) {
            this.f212357a = z0Var;
        }

        /* renamed from: a */
        public void mo100227a(int i, int i2) {
            C72852z0 z0Var = this.f212357a;
            if (z0Var.mo100696i()) {
                z0Var.mo100702o();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$t */
    public static final class C72872t extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72872t(C72852z0 z0Var) {
            super(0);
            this.f212358d = z0Var;
        }

        public Object invoke() {
            return Integer.valueOf(ViewConfiguration.get(this.f212358d.f212317a.getContext()).getScaledTouchSlop());
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.z0$u */
    public static final class C72873u extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72873u(C72852z0 z0Var) {
            super(0);
            this.f212359d = z0Var;
        }

        public Object invoke() {
            return this.f212359d.mo100694g().findViewById(C0966R.C0970id.l35);
        }
    }

    static {
        new C72854b((C8480h) null);
    }

    public C72852z0(ChatFooter chatFooter, C74974a aVar) {
        C87412m.m108594g(chatFooter, "chatFooter");
        C87412m.m108594g(aVar, "oriEdt");
        this.f212317a = chatFooter;
        this.f212318b = aVar;
        C72867o oVar = new C72867o(this);
        this.f212320d = oVar;
        C72863k kVar = new C72863k(this);
        this.f212321e = kVar;
        aVar.addOnLayoutChangeListener(kVar);
        if (!((LinkedList) chatFooter.f211916p0).contains(oVar)) {
            ((LinkedList) chatFooter.f211916p0).add(oVar);
        }
        this.f212322f = C36568h.m40985a(new C72865m(this));
        this.f212323g = new C72871s(this);
        this.f212324h = C36568h.m40985a(new C72873u(this));
        this.f212325i = C36568h.m40985a(new C72872t(this));
        this.f212326j = C36568h.m40985a(new C72866n(this));
        this.f212327k = C36568h.m40985a(new C72864l(this));
        this.f212328l = C36568h.m40985a(new C72858f(this));
        this.f212329m = C36568h.m40985a(new C72855c(this));
        this.f212330n = C36568h.m40985a(new C72859g(this));
        C36568h.m40985a(new C72869q(this));
        this.f212331o = C36568h.m40985a(new C72870r(this));
        this.f212332p = C36568h.m40985a(new C72860h(this));
        this.f212333q = C36568h.m40985a(new C72861i(this));
        this.f212334r = C36568h.m40985a(new C72856d(this));
        this.f212335s = C36568h.m40985a(new C72857e(this));
        this.f212336t = C36568h.m40985a(new C72862j(this));
    }

    /* renamed from: a */
    public final void mo100688a() {
        this.f212318b.getSelectHelper().mo148755a();
        Object value = ((C36570n) this.f212331o).getValue();
        C87412m.m108593f(value, "<get-smileyToplv>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "animClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Object value2 = ((C36570n) this.f212332p).getValue();
        C87412m.m108593f(value2, "<get-edtContainer>(...)");
        Object tag = ((LinearLayout) value2).getTag(C0966R.C0970id.f357670i53);
        C87412m.m108592e(tag, "null cannot be cast to non-null type android.view.View");
        View view3 = (View) tag;
        int[] iArr = new int[2];
        view3.getLocationOnScreen(iArr);
        int measuredWidth = view3.getMeasuredWidth();
        int measuredHeight = view3.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = mo100692e().getLayoutParams();
        layoutParams.width = measuredWidth;
        mo100692e().setLayoutParams(layoutParams);
        int[] iArr2 = new int[2];
        this.f212318b.mo104257n().getLocationOnScreen(iArr2);
        float translationY = ((float) iArr2[1]) - mo100693f().getTranslationY();
        this.f212317a.mo100397e1();
        int left = mo100692e().getLeft();
        int top = mo100692e().getTop();
        int i = measuredHeight + top;
        int i2 = iArr[0] - iArr2[0];
        int intValue = ((Number) ((C36570n) this.f212336t).getValue()).intValue();
        int h = C76577a.m92157h(mo100691d(), C0966R.dimen.f3723cd);
        ViewPropertyAnimator translationY2 = mo100693f().animate().translationX((float) i2).translationY(((float) iArr[1]) - translationY);
        translationY2.setInterpolator(C20713c.f58572a.mo32435a());
        translationY2.setDuration(300);
        translationY2.start();
        translationY2.setUpdateListener(new C72764a1(this, left, top, measuredWidth + left, i, h, intValue, 0.5f, 0.0f));
        translationY2.setListener(new C72769b1(this, translationY2));
        C66622a.f191567a.mo90685a(3, mo100690c());
    }

    /* renamed from: b */
    public final WeImageButton mo100689b() {
        Object value = ((C36570n) this.f212335s).getValue();
        C87412m.m108593f(value, "<get-btnSmileyOrKeyboard>(...)");
        return (WeImageButton) value;
    }

    /* renamed from: c */
    public final C67391b mo100690c() {
        C67391b a = this.f212317a.getChattingContext().mo100531a();
        C87412m.m108593f(a, "chatFooter.chattingContext.chattingContext");
        return a;
    }

    /* renamed from: d */
    public final Activity mo100691d() {
        return mo100690c().mo91565f();
    }

    /* renamed from: e */
    public final LinearLayout mo100692e() {
        Object value = ((C36570n) this.f212333q).getValue();
        C87412m.m108593f(value, "<get-edtContainerFullScreen>(...)");
        return (LinearLayout) value;
    }

    /* renamed from: f */
    public final View mo100693f() {
        Object value = ((C36570n) this.f212327k).getValue();
        C87412m.m108593f(value, "<get-fullScreenEdtLayout>(...)");
        return (View) value;
    }

    /* renamed from: g */
    public final View mo100694g() {
        Object value = ((C36570n) this.f212322f).getValue();
        C87412m.m108593f(value, "<get-fullScreenEdtRoot>(...)");
        return (View) value;
    }

    /* renamed from: h */
    public final void mo100695h(int i) {
        int i2;
        if ((this.f212317a.getChattingContext() == null || this.f212317a.getChattingContext().mo100531a() == null) ? false : true) {
            if (!mo100697j() || !mo100696i()) {
                Object value = ((C36570n) this.f212328l).getValue();
                C87412m.m108593f(value, "<get-chatFooterEnterFullScreenBtn>(...)");
                View view = (View) value;
                if (!mo100697j() || i <= 2 || !this.f212317a.f211874g1) {
                    i2 = 8;
                } else {
                    Object value2 = ((C36570n) this.f212328l).getValue();
                    C87412m.m108593f(value2, "<get-chatFooterEnterFullScreenBtn>(...)");
                    if (((View) value2).getVisibility() != 0) {
                        C66622a.f191567a.mo90685a(1, mo100690c());
                    }
                    i2 = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "handleLineCountChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "handleLineCountChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: i */
    public final boolean mo100696i() {
        return mo100697j() && this.f212319c && mo100694g().getParent() != null;
    }

    /* renamed from: j */
    public final boolean mo100697j() {
        if (f212316u < 1) {
            return false;
        }
        return this.f212317a.getChattingContext() != null && this.f212317a.getChattingContext().mo100531a() != null;
    }

    /* renamed from: k */
    public final void mo100698k() {
        this.f212317a.mo100400g0();
        ChatFooterPanel chatFooterPanel = this.f212317a.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibleChangeListener(this.f212323g);
        }
        Object value = ((C36570n) this.f212331o).getValue();
        C87412m.m108593f(value, "<get-smileyToplv>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewParent parent = mo100694g().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (viewGroup.indexOfChild(mo100694g()) != viewGroup.getChildCount() - 1) {
                viewGroup.removeView(mo100694g());
                viewGroup.addView(mo100694g());
            }
        }
        View n = this.f212318b.mo104257n();
        C87412m.m108593f(n, "oriEdt.wrapView()");
        int[] iArr = new int[2];
        n.getLocationOnScreen(iArr);
        C72853a aVar2 = new C72853a(n.getMeasuredWidth(), n.getMeasuredHeight(), iArr);
        this.f212319c = true;
        View g = mo100694g();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(4);
        C117292a.m165358d(g, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(g, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo100689b().setVisibility(4);
        Log.m105918d("ChatFooterKt", "openFullScreenEdt() called");
        ViewGroup.LayoutParams layoutParams = mo100692e().getLayoutParams();
        layoutParams.width = -1;
        mo100692e().setLayoutParams(layoutParams);
        mo100700m(mo100692e());
        this.f212318b.setMaxHeight(Integer.MAX_VALUE);
        mo100702o();
        Object value2 = ((C36570n) this.f212334r).getValue();
        C87412m.m108593f(value2, "<get-btnCloseFullScreenEdt>(...)");
        View view2 = (View) value2;
        mo100703p();
        mo100704q();
        this.f212318b.getSizeAnimController().mo91525a(false);
        this.f212318b.mo104257n().post(new C72868p(this, aVar2));
        SwipeBackLayout swipeBackLayout = mo100690c().f193286j.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        this.f212317a.getSeqAutoCompleteHelper().f212242b = false;
        C79080b.f232221a.mo109023a(1, "", false);
    }

    /* renamed from: l */
    public final String mo100699l(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        return "0:" + iArr[0] + " 1:" + iArr[1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100700m(android.view.ViewGroup r10) {
        /*
            r9 = this;
            com.tencent.mm.ui.widget.cedit.api.a r0 = r9.f212318b
            int r0 = r0.getSelectionStart()
            com.tencent.mm.ui.widget.cedit.api.a r1 = r9.f212318b
            android.view.ViewParent r1 = r1.mo104253j()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L_0x0014
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            r2 = 2131299199(0x7f090b7f, float:1.8216393E38)
            r4 = 2131299198(0x7f090b7e, float:1.821639E38)
            if (r1 == 0) goto L_0x0086
            com.tencent.mm.ui.widget.cedit.api.a r5 = r9.f212318b
            ro3.j r5 = r5.getSelectHelper()
            r6 = 1
            r5.f330812M = r6
            com.tencent.mm.ui.widget.cedit.api.a r5 = r9.f212318b
            android.view.View r5 = r5.mo104257n()
            int r5 = r1.indexOfChild(r5)
            com.tencent.mm.ui.widget.cedit.api.a r6 = r9.f212318b
            android.view.View r6 = r6.mo104257n()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            gy3.C87412m.m108592e(r6, r7)
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r6)
            com.tencent.mm.ui.widget.cedit.api.a r6 = r9.f212318b
            android.view.View r6 = r6.mo104257n()
            int r6 = r6.getMeasuredWidth()
            r7.width = r6
            com.tencent.mm.ui.widget.cedit.api.a r6 = r9.f212318b
            android.view.View r6 = r6.mo104257n()
            int r6 = r6.getMeasuredHeight()
            r7.height = r6
            android.view.View r6 = new android.view.View
            android.app.Activity r8 = r9.mo100691d()
            r6.<init>(r8)
            r1.addView(r6, r5, r7)
            r1.setTag(r4, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.setTag(r2, r5)
            com.tencent.mm.ui.widget.cedit.api.a r5 = r9.f212318b
            android.view.View r5 = r5.mo104257n()
            r1.removeView(r5)
            com.tencent.mm.ui.widget.cedit.api.a r1 = r9.f212318b
            ro3.j r1 = r1.getSelectHelper()
            r5 = 0
            r1.f330812M = r5
        L_0x0086:
            java.lang.Object r1 = r10.getTag(r2)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0091
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0092
        L_0x0091:
            r1 = r3
        L_0x0092:
            if (r1 == 0) goto L_0x0099
            int r1 = r1.intValue()
            goto L_0x009a
        L_0x0099:
            r1 = -1
        L_0x009a:
            com.tencent.mm.ui.widget.cedit.api.a r2 = r9.f212318b
            android.view.View r2 = r2.mo104257n()
            r10.addView(r2, r1)
            java.lang.Object r1 = r10.getTag(r4)
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x00ae
            r3 = r1
            android.view.View r3 = (android.view.View) r3
        L_0x00ae:
            if (r3 == 0) goto L_0x00b3
            r10.removeView(r3)
        L_0x00b3:
            com.tencent.mm.ui.widget.cedit.api.a r10 = r9.f212318b
            r10.mo104256m()
            com.tencent.mm.ui.widget.cedit.api.a r10 = r9.f212318b
            r10.setSelection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72852z0.mo100700m(android.view.ViewGroup):void");
    }

    /* renamed from: n */
    public final void mo100701n() {
        if (this.f212317a.getConfigEnableEnterButtonSend()) {
            ChatFooter chatFooter = this.f212317a;
            chatFooter.mo100390a1();
            boolean z = chatFooter.f211806R1;
            if (!z && chatFooter.f211854c1) {
                Log.m105924i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
                chatFooter.f211854c1 = false;
                chatFooter.f211888j.setImeOptions(0);
                C74974a aVar = chatFooter.f211888j;
                aVar.setInputType(aVar.getInputType() | 64);
            } else if (z && !chatFooter.f211854c1) {
                chatFooter.mo100387Z();
            }
            chatFooter.getChatFooterPanel().setShowSend(chatFooter.f211806R1);
            chatFooter.getChatFooterPanel().mo100197i();
        }
    }

    /* renamed from: o */
    public final void mo100702o() {
        int[] iArr = new int[2];
        Object value = ((C36570n) this.f212329m).getValue();
        C87412m.m108593f(value, "<get-actionBarContainer>(...)");
        ((View) value).getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        Object value2 = ((C36570n) this.f212330n).getValue();
        C87412m.m108593f(value2, "<get-chattingBottomPanel>(...)");
        ((View) value2).getLocationOnScreen(iArr2);
        int i = iArr2[1] - iArr[1];
        Log.m105918d("ChatFooterKt", "getFullEdtContainerHeight() called height:" + i + " actionBarPos:" + mo100699l(iArr) + " chattingBottomPanelPos:" + mo100699l(iArr2));
        ViewGroup.LayoutParams layoutParams = mo100693f().getLayoutParams();
        layoutParams.height = i;
        mo100693f().setLayoutParams(layoutParams);
    }

    /* renamed from: p */
    public final void mo100703p() {
        if (this.f212317a.getPanelType() == 2) {
            mo100689b().setImageResource(C0966R.C0969drawable.f4803nc);
            mo100689b().setContentDescription(mo100691d().getResources().getString(C0966R.string.b5e));
        } else {
            mo100689b().setImageResource(C0966R.raw.icons_outlined_emoji);
            mo100689b().setContentDescription(mo100691d().getResources().getString(C0966R.string.b5c));
        }
        mo100689b().setIconColor(mo100691d().getResources().getColor(C0966R.color.FG_0));
    }

    /* renamed from: q */
    public final void mo100704q() {
        int panelType = this.f212317a.getPanelType();
        Log.m105918d("ChatFooterKt", "updateSmileyPanel() called " + panelType);
        if (panelType == 2) {
            ChatFooterPanel chatFooterPanel = this.f212317a.getChatFooterPanel();
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100202n();
            }
            ChatFooterPanel chatFooterPanel2 = this.f212317a.getChatFooterPanel();
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.mo100194g(true);
            }
            this.f212317a.mo100395d1();
        }
    }
}
